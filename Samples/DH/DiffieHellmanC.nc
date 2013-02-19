#include "ECC.h"

// For reasons that are unclear this file isn't loaded in time for SHA1M.nc without this
// #include directive. I notice that TinyECC is still using includes (deprecated) perhaps that
// has something to do with it.
//
#include "sha1.h"

/**
    This program demonstrates that we can create a session key with a node's private key and
    another node's public key.
	
    If you uncomment the two code blocks below that are enclosed in conditional compilation
    directives, you can randomly generate these keys. Otherwise you can provide your own keys.
*/

module DiffieHellmanC {
    uses interface Leds;
    uses interface Boot;
    uses interface ECDH;
    uses interface ECC;
}
implementation {
    
    #define SECRET_SIZE 16
    // #define SECRET_SIZE (KEYDIGITS * NN_DIGIT_LEN)

    // Key #1 (Alice)
    // Public.x = 15113bce1ea269c02e30842169a9217c9acd24f5
    // Public.y = c0c22799951ccc68a677ad1ad5cb48c93942b008
    // Private  = b6e567fcd8717f45263275eb06c1bc7f73e6c117
    //
    // Key #2 (Bob)
    // Public.x = 79e7c485d9dd5ce2beaf8d2b6389adca6c81ae7e
    // Public.y = 438b0f659e6fee02d1c59c0d489275552062cfbb
    // Private  = cff055becdf72b184855b11cc15a3f715a2ea9bf

    // Key information stored in little endian form in 16 bit units.
    
    Point PublicKey1 = {
        { 0x24F5, 0x9ACD, 0x217C, 0x69A9, 0x8421, 0x2E30, 0x69C0, 0x1EA2, 0x3BCE, 0x1511, 0 },
        { 0xB008, 0x3942, 0x48C9, 0xD5CB, 0xAD1A, 0xA677, 0xCC68, 0x951C, 0x2799, 0xC0C2, 0 }
    };

    Point PublicKey2 = {
        { 0xAE7E, 0x6C81, 0xADCA, 0x6389, 0x8D2B, 0xBEAF, 0x5CE2, 0xD9DD, 0xC485, 0x79E7, 0 },
        { 0xCFBB, 0x2062, 0x7555, 0x4892, 0x9C0D, 0xD1C5, 0xEE02, 0x9E6F, 0x0F65, 0x438B, 0 }
    };
	
    NN_DIGIT PrivateKey1[] =
        { 0xC117, 0x73E6, 0xBC7F, 0x06C1, 0x75EB, 0x2632, 0x7F45, 0xD871, 0x67FC, 0xB6E5, 0 };
   
    NN_DIGIT PrivateKey2[] =
        { 0xA9BF, 0x5A2E, 0x3F71, 0xC15A, 0xB11C, 0x4855, 0x2B18, 0xCDF7, 0x55BE, 0xCFF0, 0 };

        
    void init_data( )
    {
        #ifdef NEVER
        // Use this if you want to generate random keys: takes a couple minutes to run.
        
        // Initialize private keys.
        memset( PrivateKey1, 0, NUMWORDS * NN_DIGIT_LEN );
        memset( PrivateKey2, 0, NUMWORDS * NN_DIGIT_LEN );
        
        // Initialize public keys.
        memset( &PublicKey1.x, 0, NUMWORDS * NN_DIGIT_LEN );
        memset( &PublicKey1.y, 0, NUMWORDS * NN_DIGIT_LEN );
        memset( &PublicKey2.x, 0, NUMWORDS * NN_DIGIT_LEN );
        memset( &PublicKey2.y, 0, NUMWORDS * NN_DIGIT_LEN );
        #endif

        call ECDH.init( );
    }
    
    bool doExchange( )
    {
    	int agree_result;
    	uint8_t Secret1[SECRET_SIZE];
    	uint8_t Secret2[SECRET_SIZE];

    	#ifdef NEVER
    	// Use this if you want to generate random keys: takes a couple minutes to run.
    	
        // Generate random private keys.
        call ECC.gen_private_key( PrivateKey1 );
        call ECC.gen_private_key( PrivateKey2 );
        
        // Generate corresponding public keys.
        call ECC.gen_public_key( &PublicKey1, PrivateKey1 );
        call ECC.gen_public_key( &PublicKey2, PrivateKey2 );
        #endif

        // Initialize the secrets to ensure consistency.
        memset( Secret1, 0, SECRET_SIZE );
        memset( Secret2, 0, SECRET_SIZE );

        // Key agreement; secret is the established key.
        // Notice the lack of const correctness in TinyECC.
        agree_result = call ECDH.key_agree(
            Secret1, SECRET_SIZE, (Point *)&PublicKey2, (NN_DIGIT *)PrivateKey1 );
        if( agree_result == 0 ) return FALSE;
        
        agree_result = call ECDH.key_agree(
            Secret2, SECRET_SIZE, (Point *)&PublicKey1, (NN_DIGIT *)PrivateKey2 );
        if( agree_result == 0 ) return FALSE;
        
        // Make sure both sides come up with the same secret.
        if( memcmp( Secret1, Secret2, SECRET_SIZE ) != 0 ) return FALSE;

        return TRUE;
    }

    
    event void Boot.booted( )
    {
        init_data( ); 
        
        // Turn on the blue LED at boot (after initialization).
        call Leds.led2On( );
        if( doExchange( ) ) {
            // Turn on the green LED if the key exchange is successful.
            call Leds.led2Off( );
            call Leds.led1On( );
        }
        else {
            // Otherwise turn on the red LED if there is failure.
            call Leds.led2Off( );
            call Leds.led0On( );
        }
    }

}

