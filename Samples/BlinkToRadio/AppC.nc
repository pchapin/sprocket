/****************************************************************************
FILE    : AppC.nc
SUBJECT : Top level configuration for the application.
AUTHOR  : Peter C. Chapin

****************************************************************************/

#include <Timer.h>
#include "BlinkToRadio.h"

configuration AppC {
}
implementation {
    components MainC;
    
    // Components required for the client portion of the application.
    components BlinkToRadioC as ClientApp;
    components new TimerMilliC() as Timer0;
    
    // Components required for the server portion of the application.
    components LEDControlC as ServerApp;
    components LedsC;
    
    // Components required for SpartanRPC
    components RemoteSelectorC;
    
    // Client functionality.
    ClientApp.Boot       -> MainC;
    ClientApp.Timer0     -> Timer0;
    ClientApp.LEDControl -> [RemoteSelectorC].LEDControl;
    
    // Server functionality.
    ServerApp.Leds -> LedsC;
}
