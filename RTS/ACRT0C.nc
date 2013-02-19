// FILE   : ACRT0C.nc
// SUMMARY: An AuthorizationClient that uses hardware MAC authorization with a session key.
//

#include "ComponentManager.h"
#include "ECC.h"

module ACRT0C {
    provides interface AuthorizationClient;
    uses {
        interface Encrypt; // For Hardware AES.
        interface SessionKeyStorage;
        interface Leds;    // For debugging purposes only.
    }

}
implementation {
    struct SessionKey session_key;
    uint8_t  aes_plaintext[16];
    uint8_t  aes_ciphertext[16];
    uint8_t *message;
    int      message_size;
    bool     in_progress = FALSE;

    // The RT0 AuthorizationClient must authorize the outgoing message with the session key. 
    command error_t AuthorizationClient.prepare_message(
        uint8_t *message_buffer,
        int      size,
        int      max_size,
        int      entity_index,
        int      remote_index )
    {
        struct  IDs endpoint;
        
        if( in_progress ) return FAIL;
        if( max_size < size + 4 ) return FAIL;
        if( message_buffer[1] <= remote_index ) return FAIL;
        
        endpoint.interface_id = message_buffer[0];
        endpoint.node_id      = message_buffer[2 + 2*remote_index];
        endpoint.component_id = message_buffer[3 + 2*remote_index];
        
        if( call SessionKeyStorage.client_get_key( &endpoint, &session_key, entity_index ) == FAIL ) {
            // call Leds.led0Toggle( );
            return FAIL;
        }
        else {
            // call Leds.led0Off( );
            // call Leds.led1Toggle( );
            
    	    // Copy message into aes_plaintext to prepare it for encryption later.
    	    memset( aes_plaintext, 0, 16 );
    	    memcpy( aes_plaintext, message_buffer, size );
    	    message = message_buffer;
    	    message_size = size;
    	    if( call Encrypt.setKey( session_key.value ) == SUCCESS) {
    	        in_progress = TRUE;
    	        return SUCCESS;
    	    }
    	    else {
    	        return FAIL;
    	    }
    	}
    }  
    
    
    event void Encrypt.setKeyDone( uint8_t *key )
    {
        if( key != session_key.value ) {
            // Something strange happened while loading the key.
            in_progress = FALSE;
        }
        else {
            // Here I assume that if putPlain succeeds, the getCipher event will occur. However,
            // the implementation of the Encrypt interface that I'm using doesn't actually do
            // that in all cases. In that case in_progress will be stuck at TRUE forever.
            //
            if( call Encrypt.putPlain( aes_plaintext, aes_ciphertext ) == FAIL ) {
                in_progress = FALSE;
            }
        }
    }

    
    event void Encrypt.getCipher( uint8_t *plain, uint8_t *cipher )
    {
        if( aes_plaintext != plain ) return;
        
        // Use the first four bytes of the cipher text as the MAC.
        memcpy( message + message_size, cipher, 4 );

        // If want to change key, we need to call clrKey first.
        call Encrypt.clrKey( session_key.value );
        
        in_progress = FALSE;
        signal AuthorizationClient.preparation_done( message_size + 4 );
    }

}
