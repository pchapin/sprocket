//-----------------------------------------------------------------------
// FILE    : DCache.nc
// SUBJECT : Definition of the DCache interface.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
// This interface provides access to the data cache. The interest manager component needs this
// access to properly manage interests.
//
// -----------------------------------------------------------------------

#include "ComponentManager.h"

interface DCache {
    
    // Initialize the data cache.
    command void initialize( );

    // Call to see if data that satisfies the threshold is arriving quickly enough to satisfy
    // the steepest required gradient. Return true if data is arriving fast enough and false
    // otherwise.
    //
    command int reinforcement_needed( int temp_threshold, int steepest_gradient );

    // Call to compute the target nodes to which reinforcement messages should be sent. This
    // computation depends on the past behavior of the various neighbors (which neighbors have
    // recently sent "good" data, etc). The command fills in the given component set with
    // appropriate addressing information. It assumes the ids member is already initialized to
    // point at an appropriate array. Returns an updated gradient value to use in the
    // reinforcement message (might be slower than the given gradient if multiple target nodes
    // are specified).
    //
    command int compute_reinforcement(
        int temp_threshold,
        int steepest_gradient,
        struct component_set *target_set );
}
