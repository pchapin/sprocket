// FILE   : CertificateReceiverC.nc
// SUMMARY: Component that runs in the background and receives certificates from over the air.
//

// #include "printf.h"
// #define CR_DEBUG
#include "Credentials.h"

module CertificateReceiverC {
    uses interface Receive;
    uses interface Timer<TMilli> as ReceivingTimer;
    uses interface TransferFormat;
    uses interface CredentialStorage;
    uses interface Leds;     // For debugging purposes only.
    uses interface AMPacket; // For debugging purposes only.
}
implementation {
    
    uint8_t  buffer[166];         // Large enough for biggest certificate.
    uint16_t checksum;
    int      fragment_index = 0;  // 0 .. 3
    int      offset = 0;          // Position in buffer where next fragment is stored.
    int      received_size;       // Size of candidate certificate in the buffer. 
    bool     verifying = FALSE;

    uint16_t Fletcher16( const uint8_t* data, int count )
    {
        uint16_t sum1 = 0;
        uint16_t sum2 = 0;
        int indexr;
 
        for( indexr = 0; indexr < count; ++indexr ) {
            sum1 = ( sum1 + data[indexr] ) % 255;
            sum2 = ( sum2 + sum1 ) % 255;
        }
        return ( sum2 << 8 ) | sum1;
    }
    
    
    task void process_certificate( )
    {
        struct CredentialType credential;
        bool valid;
        bool overflow;
        
        // If this certificate has already been processed, ignore it.
        if( call CredentialStorage.has_seen_certificate( checksum ) ) {
            #ifdef CR_DEBUG
            printf( "CR: Certificate already seen\n" );
            printfflush( );
            #endif
            
            verifying = FALSE;
            return;
        }
        
        // Convert the certificate to a credential (checking validity).
        call TransferFormat.raw_to_credential( buffer, received_size, &credential, &valid );
        credential.checksum = checksum;
        verifying = FALSE;
        if( !valid ) {
            #ifdef CR_DEBUG
            printf( "CR: Certificate invalid\n" );
            printfflush( );
            #endif
            return;
    	}
    	        
        // Update the model. Ignore overflow.
	call CredentialStorage.add_credential( &credential );
	call CredentialStorage.compute_minimum_model( &overflow );
	
	// For debugging purposes.
        if( valid && !overflow ) {
            #ifdef CR_DEBUG
            printf( "CR: Certificate processed successfully!\n" );
            printfflush( );
            #endif
        }
    }
    
    
    event message_t *Receive.receive( message_t *msg, void *payload, uint8_t len )
    {
        const uint8_t *p = (const uint8_t *)payload;  

        // If we are working on a previous certificate, ignore this one.
       	if( verifying ) return msg;
       	
       	#ifdef CR_DEBUG
       	printf( "CR: RX Certificate message, from node %d, fragment = %d\n",
       	    call AMPacket.source( msg ), fragment_index );
       	printfflush( );
       	#endif
       	
    	if( fragment_index != 3 ) { 
    	    // We expect the next part to arrive inside this time limit. 
    	    call ReceivingTimer.startOneShot( 750 );  // 3/4 second.
    	    memcpy( buffer + offset, p, len );
    	    offset += len;
    	    fragment_index++;
    	}
    	else {
    	    // Cancel the timer.
    	    call ReceivingTimer.stop( );

    	    // Note: with checksum the payload length is 2 bytes bigger.
    	    memcpy( buffer + offset, p, len - 2 );
    	    
    	    // Record received size for later use; reset index values for next certificate.
    	    received_size  = offset + len - 2;
    	    fragment_index = 0;
    	    offset         = 0;

            // Verify the Fletcher checksum to rule out packets corrupted by noise, etc.    	    
    	    checksum = Fletcher16( buffer, received_size );

    	    // If the checksum is correct, do the signature verification, etc.
    	    if( ( p[ len - 2 ] == (checksum & 0x00FF) ) &&
    	        ( p[ len - 1 ] == (checksum >>     8) ) ) {

    	        #ifdef CR_DEBUG
    	        printf( "CR: Checksum verified; posting certificate processing...\n" );
    	        printfflush( );
    	        #endif
    	        
    	        verifying = TRUE;
    	        post process_certificate( );
    	    }	
    	}     
    	return msg;
    }


    // If the timer fires while waiting for the next part, just throw the partial certificate
    // away. This is used to resynchronize the receiver in the case when a fragment of a
    // certificate is lost entirely.
    //
    event void ReceivingTimer.fired( )
    {
        fragment_index = 0;
        offset = 0;
    }
	
}
