//-----------------------------------------------------------------------
// FILE    : NeighborManagement.nc
// SUBJECT : Definition of the NeighborManagement interface.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// Components that provide this interface will manage neighbor information. They are reponsible
// for mapping local "neighbor numbers" to global node ID numbers. The neighbor numbers are
// small integers regardless of the size and range of the id numbers. This allows a node to
// manage a small number of neighbors without being concerned about the full range of possible
// node IDs.
//
// -----------------------------------------------------------------------

interface NeighborManagement {
    
    // Assign a neighbor number to a (possibly) new node ID value.
    command error_t allocate_neighbor_number( int node_id );
    
    // Look up the neighbor number associated with the given node ID value.
    command int get_neighbor_number( int node_id );
    
    // Look up the node ID value associated with the given neighbor number.
    command int get_node_id( int neighbor_number );
    
    // Returns the number of (known) neighbors. The count does not include 'self'
    command int neighbor_count( );
}

