// FILE   : SessionKeyStorageC.nc
// SUMMARY: A component that implements session key storage.
//
// This implementation does not concern itself with expiring session keys. Once entered a key
// will exist until it is overwritten by some other key.

module SessionKeyStorageC {
    provides interface Init;
    provides interface SessionKeyStorage;
    uses     interface SessionKeySender;
    uses     interface SessionKeyReceiver;
}
implementation {
    
    // Obviously the bigger we make this the more RAM we consume.
    #define CACHE_SIZE 10
    
    struct CacheEntry {
        struct IDs                endpoint;
        struct SessionKey         key;
        enum   RemoteEndpointRole role;
    };
    
    struct CacheEntry cache[CACHE_SIZE];
    int next_in;
    
    // Compare two endpoints to see if they are the same. This comparison is really only
    // meaningful if the endpoints have the same role. However the role is checked elsewhere.
    //
    bool endpoints_equal( const struct IDs *endpoint1, const struct IDs *endpoint2 )
    {
        return ( endpoint1->node_id      == endpoint2->node_id      &&
                 endpoint1->component_id == endpoint2->component_id &&
                 endpoint1->interface_id == endpoint2->interface_id );
    }
   
#ifdef NEVER 
    // +++++
    // For test purposes create a hard coded session key.
    // +++++
    struct SessionKey hard_coded_key = {
        { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
          0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F }
    };
    struct IDs server_endpoint = { 0x0000, 0x01, 0x01 };
    struct IDs client_endpoint = { 0x0001, 0x01, 0x01 };
#endif
    
    command error_t Init.init( )
    {
        int i;
        
        for( i = 0; i < CACHE_SIZE; ++i ) {
            cache[i].role = INVALID;
        }
        next_in = 0;
      
#ifdef NEVER  
        // +++++
        // For test purposes install hard coded session keys.
        // +++++
        cache[0].endpoint = server_endpoint;
        cache[0].key      = hard_coded_key;
        cache[0].role     = SERVER;
        cache[1].endpoint = client_endpoint;
        cache[1].key      = hard_coded_key;
        cache[1].role     = CLIENT;
        next_in += 2;
#endif
        
        return SUCCESS;
    }
    
    
    command error_t SessionKeyStorage.client_get_key(
        const struct IDs        *endpoint,
              struct SessionKey *key,
              int                entity_index )
    {
        int i;
        
        for( i = 0; i < CACHE_SIZE; ++i ) {
            if( cache[i].role == SERVER && endpoints_equal( &cache[i].endpoint, endpoint ) ) {
                *key = cache[i].key;
                return SUCCESS;
            }
        }
        call SessionKeySender.initiate_negotiation( endpoint, entity_index );
        return FAIL;
    }
    
    
    command error_t SessionKeyStorage.server_get_key(
        const struct IDs *endpoint, struct SessionKey *key )
    {
        int i;
        
        for( i = 0; i < CACHE_SIZE; ++i ) {
            if( cache[i].role == CLIENT && endpoints_equal( &cache[i].endpoint, endpoint ) ) {
                *key = cache[i].key;
                return SUCCESS;
            }
        }
        return FAIL;
    }
    
    
    void put_key(
        const struct IDs               *endpoint,
              enum   RemoteEndpointRole role,
        const struct SessionKey        *key )
    {
        int i;
        
        // See if there is a key for this endpoint already. If so, overwrite the old one.
        for( i = 0; i < CACHE_SIZE; ++i ) {
            if( cache[i].role == role && endpoints_equal( endpoint, &cache[i].endpoint ) ) {
                cache[i].key = *key;
                return;
            }   
        }
        
        // No key exists for this endpoing. Install a new one.
        cache[next_in].endpoint = *endpoint;
        cache[next_in].role     = role;
        cache[next_in].key      = *key;
        next_in++;
        if( next_in == CACHE_SIZE ) next_in = 0;
    }

    
    event void SessionKeySender.put_key(
        const struct IDs        *endpoint,
        const struct SessionKey *key )
    {
        put_key( endpoint, SERVER, key );
    }

    
    event void SessionKeyReceiver.put_key(
        const struct IDs        *endpoint,
        const struct SessionKey *key )
    {
        put_key( endpoint, CLIENT, key );
    }
    
}
