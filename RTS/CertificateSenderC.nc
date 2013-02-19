// FILE   : CertificateSenderC.nc
// SUMMARY: Component that runs in the background and broadcasts certificates periodically.
//

#include <Timer.h>
#include "Credentials.h"

// Set the certificate broadcast time to (about) 1m30s.
// There is little point in sending them faster since they take ~80 sec to verify.
//
// For test purposes, use a 90 second delay.
#define BASE_SEND_DELAY 90000L

module CertificateSenderC {
    uses interface Boot;
    uses interface Timer<TMilli> as SendingTimer;
    uses interface Timer<TMilli> as FragmentTimer;
    uses interface Random;
    uses interface CertificateStorage;
    uses interface Packet;
    uses interface AMSend;
    uses interface Leds;    // For debugging purposes only.

    provides interface CertificateEvents;
}
implementation {
    
    message_t pkt;
    bool sending_busy   = FALSE;
    int  fragment_index = 0;
    
    const struct StoredCertificate *certificates;
    int current_certificate = 0;
    
    // This function computes a randomized delay between certificate broadcasts.
    uint32_t adjusted_delay( )
    {
        uint32_t delta = BASE_SEND_DELAY / 100;
        uint32_t random_value = call Random.rand32( );
        random_value %= 21;  //   0 ..  20
        random_value -= 10;  // -10 .. +10
        
        // BASE_SEND_DELAY - 10*delta .. BASE_SEND_DELAY + 10*delta
        return BASE_SEND_DELAY + random_value*delta;
    }
    
    
    uint16_t Fletcher16( const uint8_t *data, int count )
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

    
    task void send_certificate( )
    {
    	uint16_t checksum;
    	int fragment_size   = certificates[current_certificate].size / 4;
    	int fragment_extra  = certificates[current_certificate].size & 0x03;
    	int fragment_stride = fragment_size;
    	int payload_size;
    	
    	// If the certificate length is not a multiple of four, send the extra with last part.
    	if( fragment_index == 3 && fragment_extra != 0 ) {
    	    fragment_size += fragment_extra;
    	}
    	
    	// If this is the last fragment, add two extra bytes to the payload for the checksum.
    	payload_size = fragment_size;
    	if( fragment_index == 3 ) {
    	    payload_size += 2;
    	}
    
        // Attempt to send a fragment.
        if( !sending_busy ) {
            uint8_t *send_packet = (uint8_t *)( call Packet.getPayload( &pkt, payload_size ) );
            if( send_packet == NULL ) return;

            // Load up send_packet.
            memcpy(
                send_packet,
                certificates[current_certificate].data + ( fragment_index * fragment_stride ),
                fragment_size
            );

            // If this is the last fragment, compute and install the checksum.
            if( fragment_index == 3 ) {
                checksum = Fletcher16(
                    certificates[current_certificate].data,
                    certificates[current_certificate].size );
                send_packet[payload_size - 2] = (uint8_t)( checksum & 0x00FF );
                send_packet[payload_size - 1] = (uint8_t)( checksum >>     8 );
            }
                    
            if ( call AMSend.send( AM_BROADCAST_ADDR, &pkt, payload_size ) == SUCCESS ) {
                sending_busy = TRUE;
                
                // Advance to the next fragment or certificate.
                if( fragment_index != 3 ) {
                    fragment_index++;
                    call FragmentTimer.startOneShot( 200 );
                }
                else {
                    fragment_index = 0;
                    current_certificate++;
                    
                    // If I've sent the last certificate in my storage, go back to the beginning.
                    if( current_certificate == call CertificateStorage.certificate_count( ) ) {
                        current_certificate = 0;
                        
                        // For debugging purposes (CertificateReceiver toggles LED1).
                        // call Leds.led0Toggle( );
                    }
                }
            }
        }
    }
    
    event void AMSend.sendDone( message_t *msg, error_t error )
    {
        if( &pkt == msg ) {
            sending_busy = FALSE;
        }
    }
    
    
    // Fragments are not sent too quickly to avoid overwhelming the receiver.
    event void FragmentTimer.fired( )
    {
        post send_certificate( );
    }
    

    event void SendingTimer.fired( )
    {
        signal CertificateEvents.certificate_send( current_certificate );
        
        fragment_index = 0;
        post send_certificate( );
        call SendingTimer.startOneShot( adjusted_delay( ) );
    }
    
    
    event void Boot.booted( )
    {
        int count = call CertificateStorage.certificate_count( );
    	
    	if( count > 0 ) {
    	    certificates = call CertificateStorage.get_storage( );
            call SendingTimer.startOneShot( adjusted_delay( ) );
        }
    }

}
