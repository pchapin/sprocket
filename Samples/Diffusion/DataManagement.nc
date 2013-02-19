//-----------------------------------------------------------------------
// FILE    : DataManagement.nc
// SUBJECT : Definition of the DataManagement interface.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// This interface allows callers to send data that has been gathered to nodes that have an
// interest in that data. It might be nice to generalize this to handle arbitrary (attribute,
// value) pairs but that can wait until the basic structure of this application is in place.
//
//-----------------------------------------------------------------------

interface DataManagement {
    
    // Convey a temperature reading.
    duty void set_data(
        uint16_t sender_node,
        uint16_t originator_node,
        int      temp_value);
}
