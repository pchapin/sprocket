
#include "trace.h"

module TXC {
    uses interface Boot;
    uses interface CertificateEvents;
    uses interface SplitControl as AMControl;
    uses interface Leds;
}
implementation {
    
    event void Boot.booted( )
    {
        call AMControl.start( );
        
        // Indicate when the node is booted. All the real work is done in the background.
        call Leds.led2On( );
    }
    
    
    event void AMControl.startDone( error_t err )
    {
        if( err == SUCCESS ) {
            // Anything useful to do here?
        }
        else {
            // Try again.
            call AMControl.start( );
        }
    }
    
    
    // Ignore this event.
    event void AMControl.stopDone( error_t err )
    {
    }
    
    
    event void CertificateEvents.certificate_send( int certificate_number )
    {
        // Display the certificate number on the LEDs.
        if( certificate_number & 0x0001 )
            call Leds.led2On( );
        else
            call Leds.led2Off( );
        
        if( certificate_number & 0x0002 )
            call Leds.led1On( );
        else
            call Leds.led1Off( );
        
        if( certificate_number & 0x0004 )
            call Leds.led0On( );
        else
            call Leds.led0Off( );
    }
    
}
