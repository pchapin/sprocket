/****************************************************************************
FILE    : AppC.nc
SUBJECT : Top level configuration for the Blink user.
AUTHOR  : Peter C. Chapin

****************************************************************************/

configuration AppC { }
implementation {
    components MainC, UserC as App, RemoteSelectorC, new TimerMilliC( ) as Timer0;
    
    // Used for debugging.
    components LedsC;

    App.Boot   -> MainC;
    App.Leds   -> LedsC;
    enable "*" for App.BlinkR -> [RemoteSelectorC].BlinkR;
    App.Timer0 -> Timer0;
}

