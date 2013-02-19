// FILE   : SessionKeyReceiverC.nc
// SUMMARY: A component for server side session key negotiation.
//

// #include "printf.h"
// #define SKR_DEBUG

module SessionKeyReceiverC {
    provides interface SessionKeyReceiver;
    uses     interface MyKey;                  // For looking up the governing key.
    uses     interface KeyStorage;             // For looking up key ids.
    uses     interface SessionKeyStorage;      // For checking existing session keys.
    uses     interface CryptographicServices;  // For ECDH.
    uses     interface GoverningRoles;         // For looking up governing role ids.
    uses     interface CredentialStorage;      // For authorizing access.
    uses     interface Receive;
    uses     interface Packet;
    uses     interface AMPacket;
    uses     interface AMSend;
    uses     interface Leds;                   // For debugging purposes only.
}
implementation {
    
    message_t outgoing_message;
    bool sending_busy = FALSE;
    
    
    void print_binary( uint8_t *raw, int size )
    {
        #ifdef SKR_DEBUG
        int i;
        
        for( i = 0; i < size; ++i ) {
            printf( "%02X", raw[i] );
        }        
        #endif
    }
    
    void print_key( const struct PublicKey *key )
    {
        #ifdef SKR_DEBUG
        printf( "\t\tx = " ); print_binary( (uint8_t *)key->value.x, 22 ); printf( "\n" );
        printf( "\t\ty = " ); print_binary( (uint8_t *)key->value.y, 22 ); printf( "\n" );        
        #endif
    }

    void send_public_key( int client_node_id, struct IDs *endpoint )
    {
        const struct PublicKey *my_public_key = call MyKey.get_public_key( 0 );
        error_t result;
        const int size = 40 + sizeof( struct IDs );
                
        if( !sending_busy ) {
            uint8_t *send_packet = 
                (uint8_t *)( call Packet.getPayload( &outgoing_message, size ) );
            if( send_packet == NULL ) return;
        
            endpoint->node_id |= 0x8000;
            memcpy( send_packet +  0, my_public_key->value.x, 20 );
            memcpy( send_packet + 20, my_public_key->value.y, 20 );
            memcpy( send_packet + 40, endpoint, sizeof( struct IDs ) );
            result = call AMSend.send( client_node_id, &outgoing_message, size );
        
            if( result == SUCCESS ) {
                #ifdef SKR_DEBUG
                printf( "SKR: Sent Session Key Reply message\n" );
                printfflush( );
                #endif
                sending_busy = TRUE;
                // call Leds.led1Toggle( );
            }
        }
    }

    
    event message_t *Receive.receive( message_t *message, void *payload, uint8_t length )
    {
        struct PublicKey client_public_key;
        struct IDs endpoint;
        struct IDs client_endpoint;
        const uint8_t *receive_packet;
        int governing_key;
        int governing_role;
        int query_key;
        
        if( length < 40 + sizeof( struct IDs ) ) {
            return message;
        }
        
        call CryptographicServices.public_key_initializer( &client_public_key );
        
        // Extract client's public key and desired service address from the incoming packet.
        receive_packet = (const uint8_t *)payload;
        memcpy( &client_public_key.value.x, receive_packet +  0, 20 );
        memcpy( &client_public_key.value.y, receive_packet + 20, 20 );
        memcpy( &endpoint, receive_packet + 40, sizeof( struct IDs ) );
        
        // If the MSB of the node_id is 1 this message is really for the SessionKeySender.
        if( endpoint.node_id & 0x8000 ) {
            return message;
        }
        
        // call Leds.led0Toggle( );
        
        // Get abstract representation of the service request being made by the client.
        // TODO: Allow the server to use different entities for governing roles.
        governing_key  = call KeyStorage.get_key_id( call MyKey.get_public_key( 0 ) );
        governing_role = call GoverningRoles.get_role_id( endpoint.component_id, endpoint.interface_id );
        query_key      = call KeyStorage.get_key_id( &client_public_key );

        #ifdef SKR_DEBUG
        printf( "SKR: RX: Session Key message: from node %d\n", call AMPacket.source( message ) );
        printf( "\tGoverning key ID = %d\n", governing_key );
        printf( "\tGoverning role   = %d\n", governing_role );
        printf( "\tQuery key        = \n" );
        print_key( &client_public_key );
        printf( "\tQuery key ID     = %d\n", query_key );
        printfflush( );
        #endif
        
        if( governing_key == -1 || governing_role == -1 || query_key == -1 ) {
            // We don't know at least one of the keys or the role identifier being used.
            return message;
        }
        
        // Does this client have access to the service?
        if( call CredentialStorage.authorize( governing_key, governing_role, query_key ) == FALSE ) {
            #ifdef SKR_DEBUG
            printf( "SKR: NO ACCESS\n" );
            printfflush( );
            #endif
            return message;
        }
        else {
            struct SessionKey session_key;
            error_t session_key_result;
            
            #ifdef SKR_DEBUG
            printf( "SKR: Access granted\n" );
            printfflush( );
            #endif
            
            // If there is no session key for this endpoint. compute one.
            client_endpoint = endpoint;
            client_endpoint.node_id = call AMPacket.source( message );
            session_key_result = SUCCESS;
            if( call SessionKeyStorage.server_get_key( &client_endpoint, &session_key ) != SUCCESS ) {
                session_key_result = call CryptographicServices.compute_session_key(
                    &client_public_key, call MyKey.get_private_key( 0 ), session_key.value );        
                signal SessionKeyReceiver.put_key( &client_endpoint, &session_key );
            }
            // Send our public key.
            if( session_key_result == SUCCESS ) {
                send_public_key( client_endpoint.node_id, &endpoint );
            }
        }
        return message;
    }
    
    event void AMSend.sendDone( message_t *message, error_t error )
    {
        if( message == &outgoing_message ) {
            sending_busy = FALSE;
        }
    }
}