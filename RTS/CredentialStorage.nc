// FILE   : CredentialStorage.nc
// SUMMARY: Interface to the credential storage manager.
//
// This credential storage manager only understands RT_0 credentials.

#include "Credentials.h"

interface CredentialStorage {
    
    // For testing purposes it is nice to have a command that can force re-initialization.
    command void flush_caches( );
    
    // Return TRUE if a credential from a certificate with the given checksum already exists in
    // the credential storage. This is used to recognize certificates that have already been
    // processed so that they can be discarded without verification.
    //
    command bool has_seen_certificate( uint16_t checksum );

    // Adds a credential to the storage.
    command void add_credential( const struct CredentialType *credential );
    
    // Removes all credentials that reference the given key index value.
    command void invalidate_credentials_using( int key_index );
    
    // Builds the minimum model of the credentials currently in the storage area. *overflow is
    // TRUE if the minimum model is too large to fit in the amount of space indicated. In that
    // case the model is incomplete relative to the set of credentials known to this component.
    // The model must be recalculated after any call to add_credential or invalidate.
    //
    command void compute_minimum_model( bool *overflow );
    
    // Returns the number of credentials currently stored.
    command int  storage_size( );
    
    // Returns the number of tuples in the current minimum model.
    command int  current_model_size( );
    
    // Returns TRUE if the query key is in the role specified by Governing_key.governing_role.
    // Here key values are all indexes into the key storage area.
    //
    command bool authorize( int governing_key, int governing_role, int query_key );
    
}
