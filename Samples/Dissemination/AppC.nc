//-----------------------------------------------------------------------
// FILE    : AppC.nc
// SUBJECT : Top level configuration of the diseminator demonstration program.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------

configuration AppC {
}
implementation {
    components MainC, DemoC, DisseminatorC, LedsC;
    components RPCControlC;
    
    DemoC -> MainC.Boot;
    DemoC.SpartanBoot -> RPCControlC;
    DemoC.RPCControl -> RPCControlC;
    DemoC.DisseminationUpdate -> DisseminatorC;
    DemoC.DisseminationValue -> DisseminatorC;
    DemoC.Leds -> LedsC;
    /* enable "*" for */ DisseminatorC.NeighborUpdate -> [DisseminatorC].DisseminationUpdate;
    
}

