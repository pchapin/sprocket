// FILE   : SessionKeySenderC.nc
// SUMMARY: A component for client side session key negotiation.
//

module SessionKeySenderC {
    provides interface SessionKeySender;
    uses     interface MyKey;
    uses     interface CryptographicServices;
    uses     interface AMSend;
    uses     interface Receive;
    uses     interface Packet;
    uses     interface Leds;    // For debugging purposes only.
}
implementation {
    
    message_t outgoing_message;
    bool sending_busy = FALSE;

    command void SessionKeySender.initiate_negotiation(
        const struct IDs *endpoint,
              int         entity_index )
    {
        error_t result;
        const struct PublicKey *my_public_key = call MyKey.get_public_key( entity_index );
        int size = 40 + sizeof( struct IDs );

        if( !sending_busy ) {
            uint8_t *send_packet = 
                (uint8_t *)( call Packet.getPayload( &outgoing_message, size ) );
            if( send_packet == NULL ) return;
        
            memcpy( send_packet +  0, my_public_key->value.x, 20 );
            memcpy( send_packet + 20, my_public_key->value.y, 20 );
            memcpy( send_packet + 40, endpoint, sizeof( struct IDs ) );

            // Send our public key to the server along with the service address. If sending
            // fails, just ignore the attempt. The next time a duty is posted another try will
            // be made.
            //
            result = call AMSend.send(
                endpoint->node_id,
                &outgoing_message,
                40 + sizeof( struct IDs ) );
        
            if( result == SUCCESS ) {
                sending_busy = TRUE;
                // call Leds.led1Toggle( );
            }
        }
    }
    
    event void AMSend.sendDone( message_t *message, error_t error )
    {
        if( message == &outgoing_message ) {
            sending_busy = FALSE;
        }
    }


    event message_t *Receive.receive( message_t *message, void *payload, uint8_t length )
    {
        struct PublicKey  server_public_key;
        struct SessionKey session_key;
        error_t session_key_result;
        struct IDs endpoint;
        const uint8_t *receive_packet;
        
        if( length < 40 + sizeof( struct IDs ) ) {
            return message;
        }
        
        call CryptographicServices.public_key_initializer( &server_public_key );
        
        // Extract servers's public key and desired service address from the incoming packet.
        receive_packet = (const uint8_t *)payload;
        memcpy( &server_public_key.value.x, receive_packet +  0, 20 );
        memcpy( &server_public_key.value.y, receive_packet + 20, 20 );
        memcpy( &endpoint, receive_packet + 40, sizeof( struct IDs ) );
        
        // If the MSB of the node_id is 0 this message is really for the SessionKeyReceiver.
        if( (endpoint.node_id & 0x8000) == 0 ) {
            return message;
        }
        endpoint.node_id &= 0x7FFF;
        
        // call Leds.led0Toggle( );
        
        // Compute session key and install it.
        session_key_result = call CryptographicServices.compute_session_key(
            &server_public_key, call MyKey.get_private_key( 0 ), session_key.value );
        if( session_key_result == SUCCESS ) {
            signal SessionKeySender.put_key( &endpoint, &session_key );
        }
        
        return message;
    }
    
 }