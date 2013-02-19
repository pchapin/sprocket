// FILE   : CredentialStorageC.nc
// SUMMARY: An implementation of the credential storage interface.

#define STORAGE_CAPACITY 12   // The number of credentials that can be stored.
#define MODEL_CAPACITY   16   // The number of role memberships that can be tracked at once.

module CredentialStorageC {
    provides interface Init;
    provides interface CredentialStorage;
}
implementation {
    struct CredentialType storage_area[STORAGE_CAPACITY];
    int  storage_count;
    bool credential_added;
    bool credential_deleted;
    
    struct ModelTuple {
        int target_key;
        int target_role;
        int member_key;
    };
    struct ModelTuple model_area[MODEL_CAPACITY];
    int model_count;
    
    
    error_t initialize( )
    {
        int i;
        
        // Storage
        memset( storage_area, 0, sizeof( storage_area ) );
        for( i = 0; i < STORAGE_CAPACITY; ++i ) {
            storage_area[i].form = Invalid;
        }
        storage_count      = 0;
        credential_added   = FALSE;
        credential_deleted = FALSE;
        
        // Model
        memset( model_area, 0, sizeof( model_area ) );
        model_count = 0;
        
#ifdef NEVER
        // Preload the storage_area with special credentials for test purposes.
        //   A.r <- E
        //   B.s <- A.r
        //   C.t <- B.s.r
        //   D.u <- C.t ^ A.r
        //   E.r <- E
        // Where: r = 1, s = 2, t = 3, u = 4
        //        A = 1, B = 2, C = 3, D = 4, E = 5

        // A.r <- E        
        storage_area[0].form         = Role_Membership;
        storage_area[0].defining_key = 1;
        storage_area[0].target_role  = 1;
        storage_area[0].source_key1  = 5;
        storage_area[0].source_key2  = 0;
        storage_area[0].source_role1 = 0;
        storage_area[0].source_role2 = 0;
        storage_area[0].checksum     = 0;

        // B.s <- A.r
        storage_area[1].form         = Role_Inclusion;
        storage_area[1].defining_key = 2;
        storage_area[1].target_role  = 2;
        storage_area[1].source_key1  = 1;
        storage_area[1].source_key2  = 0;
        storage_area[1].source_role1 = 1;
        storage_area[1].source_role2 = 0;
        storage_area[1].checksum     = 0;

        // C.t <- B.s.r
        storage_area[2].form         = Role_Linked;
        storage_area[2].defining_key = 3;
        storage_area[2].target_role  = 3;
        storage_area[2].source_key1  = 2;
        storage_area[2].source_key2  = 0;
        storage_area[2].source_role1 = 2;
        storage_area[2].source_role2 = 1;
        storage_area[2].checksum     = 0;

        // D.u <- C.t ^ A.r
        storage_area[3].form         = Role_Intersection;
        storage_area[3].defining_key = 4;
        storage_area[3].target_role  = 4;
        storage_area[3].source_key1  = 3;
        storage_area[3].source_key2  = 1;
        storage_area[3].source_role1 = 3;
        storage_area[3].source_role2 = 1;
        storage_area[3].checksum     = 0;

        // E.r <- E
        storage_area[4].form         = Role_Membership;
        storage_area[4].defining_key = 5;
        storage_area[4].target_role  = 1;
        storage_area[4].source_key1  = 5;
        storage_area[4].source_key2  = 0;
        storage_area[4].source_role1 = 0;
        storage_area[4].source_role2 = 0;
        storage_area[4].checksum     = 0;
        
        storage_count = 5;
#endif
        
        return SUCCESS;
    }
    
    
    command error_t Init.init( )
    {
        return initialize( );
    }
    
    
    command void CredentialStorage.flush_caches( )
    {
        initialize( );
    }
    
    
    command bool CredentialStorage.has_seen_certificate( uint16_t checksum )
    {
        int i;
        
        for( i = 0; i < storage_count; ++i ) {
            if( storage_area[i].checksum == checksum ) return TRUE;
        }
        return FALSE;
    }
    
    
    command void CredentialStorage.add_credential( const struct CredentialType *credential )
    {
        int i;
        
        if( credential->form != Invalid ) {
            // If the storage is full, throw out the "oldest" credential
            if( storage_count == STORAGE_CAPACITY ) {
                for( i = 1; i < STORAGE_CAPACITY; ++i ) {
                    storage_area[i - 1] = storage_area[i];
                }
                storage_count--;
                credential_deleted = TRUE;
            }
            
            // Now add the new credential.
            storage_area[storage_count] = *credential;
            storage_count++;
            credential_added = TRUE;
        }
    }
    
    
    bool using_invalid_key( int key_index, int i )
    {
        bool result = FALSE;
        
        if( storage_area[i].form != Invalid ) {
            if( storage_area[i].defining_key == key_index ||
                storage_area[i].source_key1  == key_index ) {
                result = TRUE;
            }
            else if( storage_area[i].form == Role_Intersection ) {
                if( storage_area[i].source_key2 == key_index ) {
                    result = TRUE;
                }
            }
        }
        return result;
    }
    
    
    command void CredentialStorage.invalidate_credentials_using( int key_index )
    {
        int i = 0;
        int j;
        
        while( i < storage_count ) {
            if( !using_invalid_key( key_index, i ) ) {
                i++;
            }
            else {
                for( j = i + 1; j < storage_count; ++j ) {
                    storage_area[j - 1] = storage_area[j];
                }
                storage_count--;
                credential_deleted = TRUE;
            }
        }
    }
    
    
    bool tuple_added;
    
    void add_tuple( int target_key, int target_role, int member_key, bool *overflow )
    {
        int model_index;
        struct ModelTuple new_tuple = { target_key, target_role, member_key };
        bool found = FALSE;
        
        *overflow = FALSE;
        for( model_index = 0; model_index < model_count; ++model_index ) {
            if( model_area[model_index].target_key  == new_tuple.target_key  &&
                model_area[model_index].target_role == new_tuple.target_role &&
                model_area[model_index].member_key  == new_tuple.member_key ) {
            
                found = TRUE;
                break;
            }
        }
        
        if( !found ) {
            if( model_count == MODEL_CAPACITY ) {
                *overflow = TRUE;
            }
            else {
                model_area[model_count] = new_tuple;
                model_count++;
                tuple_added = TRUE;
            }
        }
    }
    
    
    void process_role_membership( int credential_index, bool *overflow )
    {
        add_tuple( storage_area[credential_index].defining_key,
                   storage_area[credential_index].target_role,
                   storage_area[credential_index].source_key1,
                   overflow );
    }
    
    
    void process_role_inclusion( int credential_index, bool *overflow )
    {
        int model_index;
        int new_member;
        
        *overflow = FALSE;
        for( model_index = 0; model_index < model_count; ++model_index ) {
            if( model_area[model_index].target_key  == storage_area[credential_index].source_key1 &&
                model_area[model_index].target_role == storage_area[credential_index].source_role1 ) {
            
                new_member = model_area[model_index].member_key;
                add_tuple( storage_area[credential_index].defining_key,
                           storage_area[credential_index].target_role,
                           new_member,
                           overflow );
            }
            if( *overflow) break;
        }
    }
    
    
    void process_role_linked( int credential_index, bool *overflow )
    {
        int outer_model_index;
        int inner_model_index;
        int delegated_member;
        int new_member;
        
        *overflow = FALSE;
        for( outer_model_index = 0; outer_model_index < model_count; ++outer_model_index ) {
            if( model_area[outer_model_index].target_key  == storage_area[credential_index].source_key1 &&
                model_area[outer_model_index].target_role == storage_area[credential_index].source_role1 ) {
            
                delegated_member = model_area[outer_model_index].member_key;
                for( inner_model_index = 0; inner_model_index < model_count; ++inner_model_index ) {
                    if( model_area[inner_model_index].target_key  == delegated_member &&
                        model_area[inner_model_index].target_role == storage_area[credential_index].source_role2 ) {
                    
                        new_member = model_area[inner_model_index].member_key;
                        add_tuple( storage_area[credential_index].defining_key,
                                   storage_area[credential_index].target_role,
                                   new_member,
                                   overflow );
                    }
                    if( *overflow ) break;
                }
            }
            if( *overflow ) break;
        }
    }
    
    
    void process_role_intersection( int credential_index, bool *overflow )
    {
        int outer_model_index;
        int inner_model_index;
        int new_member;
        
        *overflow = FALSE;
        for( outer_model_index = 0; outer_model_index < model_count; ++outer_model_index ) {
            if( model_area[outer_model_index].target_key  == storage_area[credential_index].source_key1 &&
                model_area[outer_model_index].target_role == storage_area[credential_index].source_role1 ) {
            
                new_member = model_area[outer_model_index].member_key;
                for( inner_model_index = 0; inner_model_index < model_count; ++inner_model_index ) {
                    if( model_area[inner_model_index].target_key  == storage_area[credential_index].source_key2  &&
                        model_area[inner_model_index].target_role == storage_area[credential_index].source_role2 &&
                        model_area[inner_model_index].member_key  == new_member ) {
                    
                        add_tuple( storage_area[credential_index].defining_key,
                                   storage_area[credential_index].target_role,
                                   new_member,
                                   overflow );
                    }
                    if( *overflow ) break;
                }
            }
            if( *overflow ) break;
        }
    }
    
    
    command void CredentialStorage.compute_minimum_model( bool *overflow )
    {
        int credential_index;
        
        *overflow = FALSE;
        if( credential_added || credential_deleted ) {
            
            // Throw away the old model if a credential has been removed. We must rebuild.
            if( credential_deleted ) {
                model_count = 0;
            }
            
            // Keep looping until either a fixed point is reached or the model overflows.
            tuple_added = TRUE;
            while( tuple_added && !*overflow ) {
                tuple_added = FALSE;
                
                // Scan over all credentials...
                for( credential_index = 0; credential_index < storage_count; ++credential_index ) {
                    switch( storage_area[credential_index].form ) {
                    case Invalid:
                        ;
                        // Should never happen. We don't add invalid credentials.
                        break;
                    case Role_Membership:
                        process_role_membership( credential_index, overflow );
                        break;
                    case Role_Inclusion:
                        process_role_inclusion( credential_index, overflow );
                        break;
                    case Role_Linked:
                        process_role_linked( credential_index, overflow );
                        break;
                    case Role_Intersection:
                        process_role_intersection( credential_index, overflow );
                        break;
                    }
                    if( *overflow ) break;
                }
            }
        }
        credential_added   = FALSE;
        credential_deleted = FALSE;
    }
    
    
    command int CredentialStorage.storage_size( )
    {
        return storage_count;
    }
    
    
    command int CredentialStorage.current_model_size( )
    {
        return model_count;
    }
    
    
    command bool CredentialStorage.authorize( int governing_key, int governing_role, int query_key )
    {
        int model_index;
        bool result = FALSE;
        
        for( model_index = 0; model_index < model_count; ++model_index ) {
            if( model_area[model_index].target_key  == governing_key  &&
                model_area[model_index].target_role == governing_role &&
                model_area[model_index].member_key  == query_key ) {
            
                result = TRUE;
                break;
            }
        }
        return result;
    }
}
