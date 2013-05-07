/****************************************************************************
FILE    : ProviderC.nc
SUBJECT : Implementation of the BlinkR interface.
AUTHOR  : Peter C. Chapin

****************************************************************************/
#include "Credentials.h"

module ProviderC {
    uses            interface SpartanBoot;
    uses            interface Leds;
    provides remote interface BlinkR requires "A.r";
    
    uses            interface TransferFormat;
    uses            interface RPCControl;
}
implementation  {
    
    struct CredentialType credential;
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

    
    event void SpartanBoot.booted( )
    {
        bool valid;
        
        call Leds.led2On( );  // Blue.       
 
        // call TransferFormat.raw_to_credential(
        //         certificate_1, sizeof( certificate_1 ), &credential,  &valid );
        //
        // if( valid ) {
        //     call Leds.led1On( );  // Green.
        // }
        // else {
        //     call Leds.led0On( );  // Red.
        // }           
    }


    duty void BlinkR.flash( )
    {
        // For debugging purposes, comment this out so that it doesn't confuse things.
        call Leds.led0Toggle( );
    }


    event void RPCControl.duty_posted( )
    {
    }

}

