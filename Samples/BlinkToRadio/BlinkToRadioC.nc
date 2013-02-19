/****************************************************************************
FILE    : BlinkToRadioC.nc
SUBJECT : Module that performs "client" functionality within the application.
AUTHOR  : Peter C. Chapin

****************************************************************************/

#include <Timer.h>

module BlinkToRadioC {
    uses interface Boot;
    uses interface Timer<TMilli> as Timer0;
    uses interface LEDControl;
}
implementation {

    uint16_t  counter;
    
    event void Boot.booted()
    {
        // This may start the timer before the underlying RPC support is enabled.
        // How can this be handled better?
        //
        call Timer0.startPeriodic(TIMER_PERIOD_MILLI);
    }

    // The timer event tells us to make a remote call.
    event void Timer0.fired() {
        counter++;
        call LEDControl.setLeds(counter);
   }

}
