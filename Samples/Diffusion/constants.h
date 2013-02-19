//-----------------------------------------------------------------------
// FILE    : constants.h
// SUBJECT : Various global constants used by the directed diffusion example.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
// -----------------------------------------------------------------------

#define MAX_NEIGHBORS 8   // Maximum number of immediate neighbors a node can have.
#define MAX_INTERESTS 8   // Maximum number of simultaneous interests a node can handle.
#define MAX_EVENTS    16  // Maximum number of data events that can be stored.

// These timers are used to drive periodic maintence required by the caches.
#define INTEREST_CACHE_TIMER 1000
#define DATA_CACHE_TIMER     1000

// These must agree with what is in Sprocket's c_map configuration file.
#define INTERESTMANAGER_LOCALID 1
#define DATAMANAGER_LOCALID     2
