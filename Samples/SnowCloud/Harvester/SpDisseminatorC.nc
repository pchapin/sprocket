//-----------------------------------------------------------------------
// FILE    : SpDisseminatorC.nc
// SUBJECT : SpartanRPC version of the Disseminator component.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// -----------------------------------------------------------------------

#include "ComponentManager.h"
#include "KappaMsg.h"

module SpDisseminatorC {
    provides /* remote */ interface SpDisseminationUpdate /* requires "N.control" */;
    provides              interface SpDisseminationValue;
    uses                  interface SpDisseminationUpdate as NeighborUpdate;
    
    provides              interface ComponentManager;
}
implementation {
    command_t current_value = { 0, 0, 0, 0 };

    bool commands_equal( const command_t *left, const command_t *right )
    {
        return ( left->mote_id      == right->mote_id      &&
                 left->command_name == right->command_name &&
                 left->val          == right->val          &&
                 left->nonce        == right->nonce );
    }
    
    command const command_t *SpDisseminationValue.get( )
    {
        return &current_value;
    }
    
    duty void SpDisseminationUpdate.change( command_t new_value )
    {
        if( !commands_equal( &current_value, &new_value ) ) {
            post NeighborUpdate.change( new_value );
            current_value = new_value;
            signal SpDisseminationValue.changed( );
        }
    }
    
    component_id neighbors[] = {
        // Each component_id is { node_id, component_number }.
        { 2, 1 }
    };
    
    command component_set ComponentManager.elements( )
    {
        component_set remote_set = { neighbors, 1 };
        return remote_set;
    }
}

