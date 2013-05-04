/****************************************************************************
FILE    : UserC.nc
SUBJECT : Implementation of the BlinkR user main program.
AUTHOR  : Peter C. Chapin

****************************************************************************/

#include <Timer.h>

// Number of milliseconds between remote calls.
#define DELAY 1024

module UserC {
    uses {
        interface SpartanBoot;
        interface Leds;
        interface Timer<TMilli> as Timer0;
        interface BlinkR;
        interface RPCControl;
    }
}


implementation {

    event void SpartanBoot.booted( )
    {
        call Timer0.startPeriodic( DELAY );
    }
 
    event void Timer0.fired( )
    {
        call Leds.led1Toggle( );
        post BlinkR.flash( );
    }

    event void RPCControl.duty_posted( )
    {
    }

}

