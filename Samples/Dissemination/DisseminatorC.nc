//-----------------------------------------------------------------------
// FILE    : DisseminatorC.nc
// SUBJECT : SpartanRPC version of the Disseminator component.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// -----------------------------------------------------------------------

#include "ComponentManager.h"

module DisseminatorC {
    provides remote interface DisseminationUpdate requires "N.control";
    provides        interface DisseminationValue;
    uses            interface DisseminationUpdate as NeighborUpdate;
    
    provides        interface ComponentManager;
}
implementation {
    int current_value = 0;
    
    command const int *DisseminationValue.get( )
    {
        return &current_value;
    }
    
    duty void DisseminationUpdate.change( int new_value )
    {
        if( current_value != new_value ) {
            post NeighborUpdate.change( new_value );
            current_value = new_value;
            signal DisseminationValue.changed( );
        }
    }
    
    component_id neighbors[] = {
        { 2, 1 }
    };
    
    command component_set ComponentManager.elements( )
    {
        component_set remote_set = { neighbors, 1 };
        return remote_set;
    }
}

