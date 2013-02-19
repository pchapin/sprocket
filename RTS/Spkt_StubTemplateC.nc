// Generated by Sprocket. This file is overwritten each time Sprocket is run. Do not edit!

#include "ComponentManager.h"
#include "IDs.h"

module %STUBNAME% {
    provides interface %INTERFACENAME%;
    uses interface ComponentManager;
    uses interface AuthorizationClient;
    uses interface Packet;
    uses interface AMSend;
    provides interface RPCControl;  // Used for testing debugging purposes.
}
implementation {

    message_t pkt;
    
    // The following two flags are distinct so that authorization of a new post operation can
    // overlap with the sending of a previous post operation. The sending_busy flag is TRUE when
    // the radio is actually busy. The duty_pending flag is TRUE when the message buffer has
    // unsent duty arguments installed. A new duty post operation must be ignored in that case.
    //
    bool sending_busy = FALSE;
    bool duty_pending = FALSE;

    // Hard coded maximum size (for now). The actual size required depends on the authorization
    // logic being used. Eventually the size should be specialized for each stub as appropriate
    // in order to minimize memory consumption.
    //
    #define MESSAGE_BUFFER_SIZE 20
    uint8_t message_buffer[MESSAGE_BUFFER_SIZE];  // Buffer for complete outgoing message.
    int     size;                                 // Number of bytes used in buffer above.
    int     augmented_size;                       // Number of bytes after authorization tokens.
    
    struct component_set remote_components;
    int remote_index = 0;
    
    // Preapre the SpartanRPC header. Return pointer to first byte past header.
    uint8_t *prepare_header( )
    {
        int i;
        uint8_t *p = message_buffer;
        
        // Erase the message buffer.
        memset( message_buffer, 0, MESSAGE_BUFFER_SIZE );

        // Header.
        *p++ = %INTERFACEID%;
        *p++ = remote_components.count;
        for( i = 0; i < remote_components.count; ++i ) {
            *p++ = remote_components.ids[i].node_id;
            *p++ = remote_components.ids[i].local_id;
        }
        return p;
    }

    
    task void send_buffer( )
    {        
        // Attempt to send message. If a previous send is still happening this post will be lost.
        if( !sending_busy ) {
            uint8_t *send_packet = (uint8_t *)( call Packet.getPayload( &pkt, augmented_size ) );
            if( send_packet == NULL ) return;

            // Load up send_packet. This frees the message_buffer for another use.
            memcpy( send_packet, message_buffer, augmented_size );

            if ( call AMSend.send( message_buffer[2 + 2*remote_index], &pkt, augmented_size ) == SUCCESS ) {
                sending_busy = TRUE;
            }
            else {
                // TODO: Maybe move on to the next remote_index instead of failing entire duty?
                duty_pending = FALSE;
            }
        }
    }


    // Do the authorization computation in its own task. If a previous send completes while we
    // are doing this, the sendDone event can run after this task but before send_buffer runs.
    //
    task void compute_authorization( )
    {
        bool result;
        
        // Prepare authorization tokens as appropriate.
        result = call AuthorizationClient.prepare_message(
            message_buffer,
            size,
            MESSAGE_BUFFER_SIZE,
            %ENTITYINDEX%,
            remote_index );
        
        if( result != SUCCESS ) {
            if( remote_index != remote_components.count - 1 ) {
                ++remote_index;
                post compute_authorization( );
            }
            else {
                duty_pending = FALSE;
            }
        }
    }
    
    
    event void AuthorizationClient.preparation_done( int new_size )
    {
        if( duty_pending) {
            augmented_size = new_size;
            post send_buffer( );
        }
    }
    
    
    event void AMSend.sendDone( message_t *msg, error_t error )
    {
        if( &pkt == msg ) {
            sending_busy = FALSE;
            if( remote_index != remote_components.count - 1 ) {
                ++remote_index;
                post compute_authorization( );
            }
            else {
                duty_pending = FALSE;
                signal RPCControl.duty_posted( );
            }
        }
    }

    
    %DUTYCOMMANDS%
}
