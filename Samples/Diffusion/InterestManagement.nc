//-----------------------------------------------------------------------
// FILE    : InterestManagement.nc
// SUBJECT : Definition of the InterestManagement interface.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// This interface allows callers to express an interest in temperature information. It might be
// nice to generalize this to handle arbitrary (attribute, value) pairs but that can wait until
// the basic structure of this application is in place.
//
//-----------------------------------------------------------------------

interface InterestManagement {
    
    // Express an interest in temperatures above the specified threshold.
    duty void set_interest(
        uint16_t sender_node,
        int      temp_threshold,
        int      interval,
        int      duration);
}
