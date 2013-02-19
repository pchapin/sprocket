/****************************************************************************
FILE    : LEDControlC.nc
SUBJECT : Module that performs "server" functionality within the application.
AUTHOR  : Peter C. Chapin

****************************************************************************/

module LEDControlC {
    provides remote interface LEDControl;
    uses            interface Leds;
}
implementation {
 
    // This function is called remotely by the other node(s).
    command void LEDControl.setLeds(uint16_t val)
    {
        if (val & 0x01)
            call Leds.led0On();
        else 
            call Leds.led0Off();
        if (val & 0x02)
            call Leds.led1On();
        else
            call Leds.led1Off();
        if (val & 0x04)
            call Leds.led2On();
        else
            call Leds.led2Off();
    }

 }
