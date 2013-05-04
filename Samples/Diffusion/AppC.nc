//-----------------------------------------------------------------------
// FILE    : AppC.nc
// SUBJECT : Top level configuration of the temperature sensor program.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------

#include <Timer.h>

configuration AppC {
}
implementation {
    components new TimerMilliC() as Timer0;
    components MainC, DiffusionC, InterestManagerC, DataManagerC, NeighborManagerC;
    components RPCControlC;
    
    DiffusionC -> MainC.Boot;
    DiffusionC.SpartanBoot -> RPCControlC;
    DiffusionC.RPCControl -> RPCControlC;
    DiffusionC.ICache -> InterestManagerC;
    DiffusionC.DCache -> DataManagerC;
    /* activate "*" for */ DiffusionC.InterestManagement -> [DiffusionC].InterestManagement;
    
    InterestManagerC.NeighborManagement -> NeighborManagerC;
    InterestManagerC.DCache -> DataManagerC;
    InterestManagerC.Timer0 -> Timer0;
    /* activate "*" for */ InterestManagerC.NeighborSensor -> [InterestManagerC].InterestManagement;

    DataManagerC.NeighborManagement -> NeighborManagerC;
    DataManagerC.ICache -> InterestManagerC;
    DataManagerC.Timer0 -> Timer0;
    /* activate "*" for */ DataManagerC.NeighborSensor -> [DataManagerC].DataManagement;
}

