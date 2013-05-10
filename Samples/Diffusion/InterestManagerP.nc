//-----------------------------------------------------------------------
// FILE    : InterestManagerP.nc
// SUBJECT : Module to manage interests (and the interest cache).
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// -----------------------------------------------------------------------

#include <Timer.h>
#include "ComponentManager.h"
#include "constants.h"

module InterestManagerP {
    provides interface ComponentManager;
    provides interface InterestManagement;
    provides interface ICache;
    uses     interface InterestManagement as NeighborSensor;
    uses     interface NeighborManagement;
    uses     interface DCache;
    uses     interface Timer<TMilli> as Timer0;
}
implementation {

    // Interest cache entry.
    struct icache_entry {
        int temp_threshold;   // Send data if T >= temp_threshold.
        int lifetime;         // The number of timer ticks left in this interest's life.
        int gradients[MAX_NEIGHBORS]; // Uses local neighbor numbering.
    };

    // The interest cache.
    struct icache_entry interest_cache[MAX_INTERESTS];
    int interest_count = 0;


    // Workspace array used to hold component IDs of remote InterestManagerC components.
    component_id  remote_components[MAX_NEIGHBORS];
    component_set remote_set;


    command void ICache.initialize( )
    {
        call Timer0.startPeriodic( INTEREST_CACHE_TIMER );
    }


    // The timer event performs interest cache management by aging and expiring interests.
    event void Timer0.fired( )
    {
        int index;

        // Age interests.
        for( index = 0; index < interest_count; ++index ) {
            interest_cache[index].lifetime--;
        }

        // Eliminate expired interests.
        index = 0;
        while( index < interest_count ) {
            if( interest_cache[index].lifetime > 0 ) index++;
            else {
                int downstream;
                for( downstream = index; downstream < interest_count - 1; ++downstream) {
                    interest_cache[downstream] = interest_cache[downstream + 1];
                }
                interest_count--;
            }
        }
    }


    // Function to search the interest cache for a matching interest. Returns the index of the
    // matching interest if one exists, -1 otherwise.
    //
    int interest_index( int temp_threshold )
    {
        int index;
        for( index = 0; index < interest_count; ++index ) {
            if( interest_cache[index].temp_threshold == temp_threshold ) return index;
        }
        return -1;
    }
    
    
    duty void InterestManagement.set_interest(
        uint16_t sender_node_id,
        int      temp_threshold,
        int      interval,
        int      duration)
    {
        int neighbor_number = call NeighborManagement.get_neighbor_number( sender_node_id );
        int index;

        // If the interest is not in the cache...
        if( ( index = interest_index( temp_threshold ) ) == -1 ) {

            // Add new interest to the interest cache.
            if( interest_count == MAX_INTERESTS ) return;
            interest_cache[interest_count].temp_threshold = temp_threshold;
            interest_cache[interest_count].lifetime = duration;
            memset( interest_cache[interest_count].gradients, 0, MAX_NEIGHBORS * sizeof(int) );
            interest_cache[interest_count].gradients[neighbor_number] = interval;
            interest_count++;

            // Propagate interest to all neighbors (broadcast).
            remote_set.ids   = remote_components;
            remote_set.count = 1;
            remote_components[0].node_id  = 0xFFFF;
            remote_components[0].local_id = INTERESTMANAGER_LOCALID;
            post NeighborSensor.set_interest(TOS_NODE_ID, temp_threshold, interval, duration);
        }

        // The interest is in the cache...
        else {
            int steepest_gradient = 10000; /* Should initially be "infinite" (INT_MAX?) */
            int gradient_index;

            interest_cache[index].lifetime = duration;
            interest_cache[index].gradients[neighbor_number] = interval;
            for( gradient_index = 0; gradient_index < MAX_NEIGHBORS; ++gradient_index ) {
                if( interest_cache[index].gradients[gradient_index] < steepest_gradient )
                    steepest_gradient = interest_cache[index].gradients[gradient_index];
            }
            if( call DCache.reinforcement_needed( temp_threshold, steepest_gradient ) ) {
                remote_set.ids = remote_components;
                interval = call DCache.compute_reinforcement
                    ( temp_threshold, steepest_gradient, &remote_set );
                post NeighborSensor.set_interest(TOS_NODE_ID, temp_threshold, interval, duration);
            }
        }
    }


    // Return the remote_components list based on our current concept of our neighbors.
    command component_set ComponentManager.elements( )
    {
        return remote_set;
    }
}
