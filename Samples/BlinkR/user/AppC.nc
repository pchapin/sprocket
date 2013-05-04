/****************************************************************************
FILE    : AppC.nc
SUBJECT : Top level configuration for the Blink user.
AUTHOR  : Peter C. Chapin

****************************************************************************/

configuration AppC { }
implementation {
    components RPCControlC, UserC as App, RemoteSelectorC, new TimerMilliC( ) as Timer0;
    
    // Used for debugging.
    components LedsC;

    App.SpartanBoot -> RPCControlC;
    App.RPCControl  -> RPCControlC;
    App.Leds        -> LedsC;
    activate "*" for App.BlinkR -> [RemoteSelectorC].BlinkR;
    App.Timer0      -> Timer0;
}

