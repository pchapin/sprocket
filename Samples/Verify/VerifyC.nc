
#include "ECC.h"

module VerifyC {
    uses interface Leds;
    uses interface Boot;
    uses interface ECDSA;
}
implementation {
    
    typedef uint8_t octet_t;

    // A.r <- E
    const octet_t certificate_1[] = {
        /* Form */ 0x01,
    
        // Values are exactly 160 bits, stored in big endian form.
        /* A.x  */ 0x7A, 0x39, 0x70, 0xE9, 0x20, 0x72, 0x6B, 0xFC,
                   0xD3, 0x2C, 0xD1, 0x63, 0x73, 0xCC, 0xCD, 0xAC,
                   0x12, 0x56, 0xEB, 0xD9,
        /* A.y  */ 0x8E, 0x87, 0xC2, 0xC9, 0x67, 0xE9, 0xFB, 0xD8,
                   0xF9, 0x11, 0x8F, 0xB0, 0xF1, 0x01, 0x2D, 0xC6,
                   0xE6, 0x33, 0xFE, 0x79,
    
        /* role */ 0x01, 
    
        /* E.x  */ 0x6F, 0xED, 0x62, 0x34, 0xA2, 0x4F, 0x88, 0x5F,
                   0x9B, 0x35, 0x3A, 0xE8, 0xBD, 0x31, 0x98, 0x87,
                   0x37, 0xE8, 0x33, 0x30,
        /* E.y  */ 0xFB, 0xD2, 0xAE, 0x32, 0x30, 0xAD, 0x80, 0x49,
                   0xFF, 0x44, 0xD8, 0xC4, 0x14, 0x69, 0xB5, 0x96,
                   0xD3, 0x66, 0x63, 0x37,
    
        // Values are 161 bits (stored in 21 bytes) in big endian form.
        /* sig.r */ 0x00, 0x1E, 0x4E, 0x81, 0xE6, 0x8B, 0x08, 0x57,
                    0xFC, 0x6A, 0x77, 0xF4, 0xC1, 0x95, 0x7D, 0x63,
                    0xB4, 0x2B, 0x1D, 0xB8, 0xCE,
        /* sig.s */ 0x00, 0x3F, 0x84, 0x29, 0xF9, 0x63, 0xD3, 0x16,
                    0x52, 0x96, 0x0F, 0x5B, 0xFF, 0xCD, 0xA8, 0xBE,
                    0x62, 0x14, 0x02, 0x51, 0x57
    };

    
    // On MSP430, NN_DIGIT is 16 bits and NUMWORDS is 11 (so that it can hold 21 bytes).
    Point public_key;
    NN_DIGIT r[NUMWORDS];
    NN_DIGIT s[NUMWORDS];
    
    bool verify_certificate( )
    {
        const octet_t *key_material;
        const octet_t *signature_material;
              int      i;
              bool     return_code = FALSE;
        
        // Initialize the key material. Note that TinyECC assumes values are in little endian
        // order. However, Sprocket outputs the key information in big endian order. The code
        // below deals with that.
        //
        memset(public_key.x, 0, NUMWORDS);
        memset(public_key.y, 0, NUMWORDS);
        memset(r, 0, NUMWORDS);
        memset(s, 0, NUMWORDS);
        
        // Read A.x from the certificate backwards.
        key_material = certificate_1 + 1 + 20;
        for( i = 0; i < KEYDIGITS; ++i ) {
            key_material -= 2;
            // Be careful! The MSP430 can only access words at even addresses. Must access the
            // data in the certificate one byte at a time since the pointers into the
            // certificate are not necessarily word aligned.
            //
            public_key.x[i] = (key_material[0] << 8) | key_material[1];
        }
        
        // Read A.y from the certificate backwards.
        key_material = certificate_1 + 1 + 20 + 20;
        for( i = 0; i < KEYDIGITS; ++i ) {
            key_material -= 2;
            public_key.y[i] = (key_material[0] << 8) | key_material[1];
        }
        
        // Read sig.r from the certificate backwards.
        signature_material = certificate_1 + 1 + 40 + 1 + 40 + 21;
        for( i = 0; i < NUMWORDS-1; ++i ) {
            signature_material -= 2;
            r[i] = (signature_material[0] << 8) | signature_material[1];
        }
        // The most significant byte of r has to be handled as a special case.
        r[i] = *--signature_material;
        
        // Read sig.s from the certificate backwards.
        signature_material = certificate_1 + 1 + 40 + 1 + 40 + 21 + 21;
        for( i = 0; i < NUMWORDS-1; ++i ) {
            signature_material -= 2;
            s[i] = (signature_material[0] << 8) | signature_material[1];
        }
        // The most significant byte of s has to be handled as a special case.
        s[i] = *--signature_material;

        if( call ECDSA.init( &public_key ) == SUCCESS ) {
            // Note that TinyECC is not const-correct; hence it is necessary to cast away const.
            if( call ECDSA.verify( (uint8_t *)certificate_1, 82, r, s, &public_key) == 1 ) return_code = TRUE;
        }

        return return_code;
    }
    
    
    event void Boot.booted( )
    {
    	int i;
        call Leds.led1On( );  // Turn on the green LED at boot.
        
        for(i = 0; i < 1; i++){
            if( !verify_certificate( ) ) {
                call Leds.led0On( );
            }
        }
        call Leds.led1Off( );
        call Leds.led2On( );
    }
    
}

