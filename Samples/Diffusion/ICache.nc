//-----------------------------------------------------------------------
// FILE    : ICache.nc
// SUBJECT : Definition of the ICache interface.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
// This interface provides access to the interest cache. The data manager component needs this
// access to properly manage interests. It is also used for local control of the interest cache
// (such as initialization).
//
// -----------------------------------------------------------------------

interface ICache {

    // This command initializes the interest cache.
    command void initialize( );
    
}
