/****************************************************************************
FILE    : DemoC.nc
SUBJECT : Implementation of the hardware AES demonstration program.
AUTHOR  : Peter C. Chapin

****************************************************************************/

module DemoC {
    uses {
        interface Boot;
        interface Leds;
        interface Encrypt;
        interface SplitControl as AESControl;
    }
}


implementation {
    
    uint8_t my_key [16] = "0123456789ABCDEF";
    uint8_t plain  [16] = "abcdefghijklmnop";
    uint8_t cipher1[16];
    uint8_t cipher2[16];

    event void Boot.booted( )
    {
        call AESControl.start( );
    }
 

    event void AESControl.startDone( error_t result )
    {
        if( result != SUCCESS ) {
            call AESControl.start( );
        }
        else {
            if( call Encrypt.setKey( my_key ) == EBUSY ) {
                call Leds.led0On( );
            }
        }
    }
    
    
    event void AESControl.stopDone( error_t result )
    {
        // Ignore this event. It should never arise.
    }
    
    
    event void Encrypt.setKeyDone( uint8_t *key )
    {
        if( key != my_key ) {
            // The setKey command didn't work as expected. Turn on the red LED.
            call Leds.led0On( );
        }
        else {
            // ... otherwise try to encrypt some plain text. The cipher text will go to cipher1.
            if( call Encrypt.putPlain( plain, cipher1 ) == FAIL ) {
                call Leds.led0On( );
            }
        }
    }
    
    
    event void Encrypt.getCipher( uint8_t *plaintext, uint8_t *ciphertext )
    {
        if( ciphertext == cipher1 ) {
            // If this is the first time I encrypted, try again to cipher2.
            // NOTE: To change keys one must first call clrKey and then setKey again.
            if( call Encrypt.putPlain( plain, cipher2 ) == FAIL ) {
                call Leds.led0On( );
            }
        }
        else {
            // If this is the second time I encrypted, check to see if both encryptions agree.
            if( memcmp( cipher1, cipher2, 16 ) != 0 ) {
                call Leds.led0On( );
            }
            else {
                call Leds.led1On( );
            }
        }
    }
    
}

