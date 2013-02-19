// FILE   : RXC.nc
// SUMMARY: The "main" component of the session key negotiation demonstration program.
//

#include "trace.h"

module RXC {
    uses interface Boot;
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
    
}
