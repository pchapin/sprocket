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
    components RPCControlC;
    
    // Components required for the client portion of the application.
    components BlinkToRadioC as ClientApp;
    components new TimerMilliC() as Timer0;
    
    // Components required for the server portion of the application.
    components LEDControlC as ServerApp;
    components LedsC;
    
    // Components required for SpartanRPC
    components RemoteSelectorC;
    
    // Client functionality.
    ClientApp.SpartanBoot -> RPCControlC;
    ClientApp.Timer0      -> Timer0;
    ClientApp.LEDControl  -> [RemoteSelectorC].LEDControl;
    ClientApp.RPCControl  -> RPCControlC;
    
    // Server functionality.
    ServerApp.Leds -> LedsC;
}
