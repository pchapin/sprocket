// FILE   : ACSimpleMACC.nc
// SUMMARY: An AuthorizationClient that does a simple MAC computation.
//

module ACSimpleMACC {
    provides interface AuthorizationClient;
    uses     interface Rijndael;
}
implementation {   
    
    // This version requires a 128 bit key (as an array of uint8_t) as specific information.
    command int AuthorizationClient.prepare_message(
        uint8_t *message_buffer,
        int      size,
        int      max_size,
        void    *specifics,
        bool    *success )
    {
        // 150 bytes of stack space required (on the MSP430).
        uint32_t encryption_workspace[44];
        uint8_t  crypto_buffer[16];
        int      nrounds;
        
        *success = TRUE;
        
        // Verify that buffer space exists.
        if( size + 4 > max_size) {
            *success = FALSE;
            return size;
        }
        
        // Precomputing encryption workspaces for the various keys required might be a nice
        // optimization. It would, however, increase ROM requirements. (Probably not an issue)
        //
        nrounds = call Rijndael.SetupEncrypt(encryption_workspace, (uint8_t *)specifics, 128);
        call Rijndael.Encrypt(encryption_workspace, nrounds, message_buffer, crypto_buffer);
        message_buffer[size + 0] = crypto_buffer[0];
        message_buffer[size + 1] = crypto_buffer[1];
        message_buffer[size + 2] = crypto_buffer[2];
        message_buffer[size + 3] = crypto_buffer[3];
        return size + 4;
    }
    
}
