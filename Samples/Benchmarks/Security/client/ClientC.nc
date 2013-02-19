
#include <Timer.h>

module ClientC {
    uses interface Boot;
    uses interface Timer<TMilli> as Timer0;
    uses interface Blink;
    uses interface SpartanBoot;
    uses interface RPCControl;
}
implementation {
    enum {
        TIMER_PERIOD_MILLI = 1000
    };

    uint8_t counter;
    
    // In the original the timer was not started until AMControl had been successfully started.
    // We need another way to deal with this (perhaps the SpartanRPC runtime provides an
    // interface with an event that is signaled when the RPC facilities are ready to use).
    //
    event void Boot.booted( )
    {
        call Timer0.startPeriodic( TIMER_PERIOD_MILLI );
    }

    event void Timer0.fired( )
    {
        counter++;
        post Blink.setLeds( counter );
    }
    
    event void SpartanBoot.booted( )
    {
    }
    
    event void RPCControl.duty_posted( )
    {
    }

}
