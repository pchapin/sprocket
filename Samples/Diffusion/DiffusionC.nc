//-----------------------------------------------------------------------
// FILE    : DiffusionC.nc
// SUBJECT : The main component of the directed diffusion test program.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------

#include "ComponentManager.h"

module DiffusionC {
    uses interface Boot;
    uses interface ICache;
    uses interface DCache;
    uses interface InterestManagement;
    provides interface ComponentManager;
    uses interface SpartanBoot;
    uses interface RPCControl;
}
implementation {
    
    // The main node expresses some interests...
    component_id  neighbor = { 2, 1 };  // Node #2, Component #1 
    component_set remote_set = { &neighbor, 1 };
    
    command component_set ComponentManager.elements( )
    {
        return remote_set;
    }

    event void Boot.booted( )
    {
        call ICache.initialize( );
        call DCache.initialize( );
    }
    
    event void SpartanBoot.booted( )
    {
        // The main node expresses the interest here.
        if( TOS_NODE_ID == 1 ) {
            post InterestManagement.set_interest( TOS_NODE_ID, 128, 10, 100 );
        }
    }
    
    event void RPCControl.duty_posted( )
    {
    }
}
