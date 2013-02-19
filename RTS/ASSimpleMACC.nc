
module ASSimpleMACC {
    provides interface AuthorizationServer;
    uses     interface Rijndael;
}
implementation {
    
    // This version requires a 128 bit key (as an array of uint8_t) as specific information.
    command bool AuthorizationServer.check_message(
        const uint8_t *message_buffer,
              int      size,
        const void    *specifics
    )
    {
        // 166 bytes of stack space required (on the MSP430).
        uint32_t encryption_workspace[44];
        uint8_t  temporary_buffer[16];
        uint8_t  crypto_buffer[16];
        int      nrounds;
        
        // Prepare the temporary buffer.
        if( size < 4 ) return FALSE;
        memset( temporary_buffer, 0, 16 );
        memcpy( temporary_buffer, message_buffer, size - 4 );
        
        // Encrypt the temporary buffer.
        nrounds = call Rijndael.SetupEncrypt( encryption_workspace, (uint8_t *)specifics, 128 );
        call Rijndael.Encrypt( encryption_workspace, nrounds, temporary_buffer, crypto_buffer );

        // If the MAC agrees, return TRUE. Otherwise there is authorization failure.
        if ( message_buffer[size - 4] != crypto_buffer[0] ||
             message_buffer[size - 3] != crypto_buffer[1] ||
             message_buffer[size - 2] != crypto_buffer[2] ||
             message_buffer[size - 1] != crypto_buffer[3] ) {
             return FALSE;
        }
        return TRUE;
    }
    
}
