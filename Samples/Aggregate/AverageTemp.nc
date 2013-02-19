/****************************************************************************
FILE    : AverageTemp.nc
SUBJECT : Top level configuration for the application.
AUTHOR  : Peter C. Chapin

This interface computes an aggregated average temperature of all nodes "below" the caller in the
network's current routing tree. It is a split phase interface because the time required to
gather the data in the child subnetwork might be large.

****************************************************************************/

interface AverageTemp {
    
    // Tells the subordinate subnetwork to gather (and aggregate) the temperature data.
    duty void request_average( uint16_t asking_node_id );
    
    // Post the average that we know about to our parent node.
    duty void send_average( int temperature );
}

