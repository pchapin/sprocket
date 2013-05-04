/****************************************************************************
FILE    : BlinkToRadioC.nc
SUBJECT : Module that performs "client" functionality within the application.
AUTHOR  : Peter C. Chapin

****************************************************************************/

#include <Timer.h>

module BlinkToRadioC {
    uses interface SpartanBoot;
    uses interface Timer<TMilli> as Timer0;
    uses interface LEDControl;
    uses interface RPCControl;
}
implementation {

    uint16_t  counter;
    
    event void SpartanBoot.booted()
    {
        call Timer0.startPeriodic(TIMER_PERIOD_MILLI);
    }


    // The timer event tells us to make a remote call.
    event void Timer0.fired() {
        counter++;
        call LEDControl.setLeds(counter);
   }


   event void RPCControl.duty_posted( )
   {
   }

}
