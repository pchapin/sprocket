//-----------------------------------------------------------------------
// FILE    : DataManagerC.nc
// SUBJECT : Component to manage data messages.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
// This is a wrapper configuration that applies a particular security policy to a library unit.
// -----------------------------------------------------------------------

#include <Timer.h>

configuration DataManagerC {
    provides        interface ComponentManager;
    provides remote interface DataManagement requires "A.t";
    provides        interface DCache;
    uses            interface DataManagement as NeighborSensor;
    uses            interface NeighborManagement;
    uses            interface ICache;
    uses            interface Timer<TMilli> as Timer0;
}
implementation {
    components DataManagerP;
    
    ComponentManager   = DataManagerP;
    DataManagement     = DataManagerP;
    DCache             = DataManagerP;
    NeighborSensor     = DataManagerP;
    NeighborManagement = DataManagerP;
    ICache             = DataManagerP;
    Timer0             = DataManagerP;
}
