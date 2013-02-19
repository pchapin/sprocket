#include "Timer.h"

module BlinkC {
    uses interface Leds;
    uses interface Boot;
    uses interface Test;
}
implementation {
    
    event void Boot.booted( )
    {
        // Never sleep. This is a test program; exercise the test repeatedly.
        while( 1 ) {
            
            // Toggling the LED facilitates timing measurements. Here I assume that doTest() is
            // deterministic and will return the same value every time it is called. For test
            // code this is a reasonable assumption.
            //
            if( call Test.doTest( ) == SUCCESS ) {
                call Leds.led1Toggle( );
            }
            else {
                call Leds.led0Toggle( );
            }
        }
    }

}
