//-----------------------------------------------------------------------
// FILE    : AppC.nc
// SUBJECT : Top level configuration of the diseminator demonstration program.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------

#include <Timer.h>

configuration AppC {
}
implementation {
    components MainC, DemoC, SpDisseminatorC, new TimerMilliC( ) as Timer, LedsC;
    components RPCControlC;
    
    DemoC -> MainC.Boot;
    DemoC.SpartanBoot -> RPCControlC;
    DemoC.RPCControl -> RPCControlC;
    DemoC.SpDisseminationUpdate -> SpDisseminatorC;
    DemoC.SpDisseminationValue -> SpDisseminatorC;
    DemoC.Leds -> LedsC;
    DemoC.Timer -> Timer;
    /* activate "*" for */
        SpDisseminatorC.NeighborUpdate -> [SpDisseminatorC].SpDisseminationUpdate;
    
}

