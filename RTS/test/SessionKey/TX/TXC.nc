// FILE   : TXC.nc
// SUMMARY: Sample client program for session key negotiation.
//

#include <Timer.h>
#include "sha1.h"   // Major hack.
#include "IDs.h"
#include "trace.h"

module TXC {
    uses interface Boot;
    uses interface SplitControl as AMControl;
    uses interface SessionKeySender;
    uses interface Timer<TMilli> as SendingTimer;
    uses interface Leds;
}
implementation {
    
    // Node 1, component 2, interface 3.
    struct IDs service_address = { 1, 2, 3 };
    
    event void Boot.booted( )
    {
        call AMControl.start( );
        call SendingTimer.startPeriodic( 2000 );
        
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
    
    event void SendingTimer.fired( )
    {
        call SessionKeySender.initiate_negotiation( &service_address );
    }
    
    // Ignore this event (for now).
    event void SessionKeySender.put_key(
        const struct IDs        *endpoint,
        const struct SessionKey *key )
    {
    }
}
