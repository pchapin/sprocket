//-----------------------------------------------------------------------
// FILE    : DataManagerP.nc
// SUBJECT : Component to manage data messages.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// This component deals with data messages coming from data sources and moving toward the sinks
// that are interested in that data.
//
// -----------------------------------------------------------------------

#include <Timer.h>
#include "constants.h"

module DataManagerP {
    provides interface ComponentManager;
    provides interface DataManagement;
    provides interface DCache;
    uses     interface DataManagement as NeighborSensor;
    uses     interface NeighborManagement;
    uses     interface ICache;
    uses     interface Timer<TMilli> as Timer0;
}
implementation {

    // Clock used to time stamp when data events arrive.
    int current_time = 0;

    // Data cache entry.
    struct dcache_entry {
        int time_stamp;      // Time when data event entered into the cache.
        int sender_node;     // Node ID of neighbor that sent this event.
        int originator_node; // Node ID of were the event was observed.
        int temp_value;      // The actual temperature value.
    };

    // The data cache is a circular buffer holding the last MAX_EVENTS events.
    struct dcache_entry dcache[MAX_EVENTS];
    int cache_start = 0;
    int next_in = 0;


    // Workspace array used to hold component IDs of remote DataManagerC components.
    struct component_id  remote_components[MAX_NEIGHBORS];
    struct component_set remote_set;


    // This event sends data events to interested nodes at the rates they have requested.
    event void Timer0.fired( )
    {
        // Advance the clock.
        current_time++;

        // foreach (interest) {
        //     foreach (gradient associated with that interest) {
        //         Decrement gradient waiting interval.
        //         if (gradient demands service (waiting interval == 0)) {
        //             Reset gradient waiting interval.
        //             Add gradient target to remote componet set.
        //         }
        //     }
        //     Find most recent data event that satisfies interest.
        //     if (there exists a matching data event) {
        //         post NeighborSensor.set_data(...);
        //     }
        // }
    }


    duty void DataManagement.set_data( uint16_t sender_node, uint16_t originator_node, int temp_value )
    {
        dcache[next_in].time_stamp      = current_time;
        dcache[next_in].sender_node     = sender_node;
        dcache[next_in].originator_node = originator_node;
        dcache[next_in].temp_value      = temp_value;
        next_in++;
        if( next_in == MAX_EVENTS ) next_in = 0;
        if( next_in == cache_start ) {
            cache_start++;
            if( cache_start == MAX_EVENTS ) cache_start = 0;
        }
    }
    
    
    command void DCache.initialize( )
    {
        call Timer0.startPeriodic( DATA_CACHE_TIMER );        
    }


    command int DCache.reinforcement_needed( int temp_threshold, int steepest_gradient )
    {
        //
        // Scan data cache and compute average time between data events that satisfy threshold.
        // If the average interval between such events is less than the desired gradient return
        // false (no reinforcement is needed), otherwise return true.
        //
        return FALSE;
    }


    command int DCache.compute_reinforcement(
        int temp_threshold,
        int steepest_gradient,
        struct component_set *target_set )
    {
        //
        // Scan the data cache and figure which nodes are sending us interesting data already.
        // Load their addresses into the given remote_set (don't forget to update the count
        // member of the set!). Return an updated gradient to use in the reinforcement message.
        // This might be slower than the given gradient if multiple nodes are being reinforced
        // at the same time.
        //
        return 0;
    }

    
    // Return the remote_components list based on our current concept of our neighbors.
    command struct component_set ComponentManager.elements( )
    {
        return remote_set;
    }
}
