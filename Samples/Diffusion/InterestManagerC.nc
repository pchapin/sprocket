//-----------------------------------------------------------------------
// FILE    : InterestManagerC.nc
// SUBJECT : Component to manage interests (and the interest cache).
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
// This is a wrapper configuration that applies a particular security policy to a library unit.
// -----------------------------------------------------------------------

#include <Timer.h>

configuration InterestManagerC {
    provides        interface ComponentManager;
    provides remote interface InterestManagement requires "A.t";
    provides        interface ICache;
    uses            interface InterestManagement as NeighborSensor;
    uses            interface NeighborManagement;
    uses            interface DCache;
    uses            interface Timer<TMilli> as Timer0;
}
implementation {
    components InterestManagerP;
    
    ComponentManager   = InterestManagerP;
    InterestManagement = InterestManagerP;
    ICache             = InterestManagerP;
    NeighborSensor     = InterestManagerP;
    NeighborManagement = InterestManagerP;
    DCache             = InterestManagerP;
    Timer0             = InterestManagerP;
}
