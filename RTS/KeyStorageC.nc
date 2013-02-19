// FILE   : KeyStorageC.nc
// SUMMARY: Implementation of a public key storage component.
//

// #include "printf.h"
// #define KS_DEBUG_ADD
// #define KS_DEBUG_LOOKUP
#define KEY_STORAGE_CAPACITY 12

module KeyStorageC {
    provides interface Init;
    provides interface KeyStorage;
    uses     interface MyKey;
    uses     interface CryptographicServices;
    uses     interface Leds;  // For debugging purposes.
}
implementation {
    struct PublicKey key_storage_area[KEY_STORAGE_CAPACITY];
    int key_storage_size;
    int key_storage_next;
    int initialized = 0;
   
    void print_binary( uint8_t *raw, int size )
    {
        #if defined(KS_DEBUG_ADD) || defined(KS_DEBUG_LOOKUP)
        int i;
        
        for( i = 0; i < size; ++i ) {
            printf( "%02X", raw[i] );
        }        
        #endif
    }
    
    void print_key( const struct PublicKey *key )
    {
        #if defined(KS_DEBUG_ADD) || defined(KS_DEBUG_LOOKUP)
        printf( "\tx = " ); print_binary( (uint8_t *)key->value.x, 22 ); printf( "\n" );
        printf( "\ty = " ); print_binary( (uint8_t *)key->value.y, 22 ); printf( "\n" );        
        #endif
    }


    void raw_add_key( const struct PublicKey *key, int *key_index, bool *invalidate_old )
    {
        int  i;
        bool found;
        
        *invalidate_old = TRUE;
        *key_index = key_storage_next;
        
        // We have to be careful. This function is called during the intialization of this node.
        // At that time printf has not yet (necessarily) been initialized and calling it might
        // make the node crash.
      
        #ifdef KS_DEBUG_ADD
        if( initialized ) {
            printf( "KS: Adding key:\n");
            print_key( key );
            printfflush( );
        }
        #endif
        
        // Is the key already present in the key storage area?
        found = FALSE;
        for( i = 0; i < key_storage_size; ++i ) {
            if( call CryptographicServices.same_keys( &key_storage_area[i], key ) ) {
                *key_index = i;
                *invalidate_old = FALSE;  // Don't invalidate if the key is already present.
                found = TRUE;
      
                #ifdef KS_DEBUG_ADD
                if( initialized ) {
                    printf( "KS: Key found at ID %d\n", *key_index );
                    printfflush( );
                }
                #endif
                break;
            }
        }
        
        // If the key is not in the storage area, add it.
        if( !found ) {
            key_storage_area[key_storage_next] = *key;
            *key_index = key_storage_next;
      
            #ifdef KS_DEBUG_ADD
            if( initialized ) {
                printf( "KS: Key assigned ID %d\n", *key_index );
                printfflush( );
            }
            #endif
            
            // Adjust key_storage_size if necessary.
            if( key_storage_size < KEY_STORAGE_CAPACITY ) {
                key_storage_size++;
                *invalidate_old = FALSE;  // We've never used this index value before.
            }
            
            // Adjust key_storage_next.
            if( key_storage_next == KEY_STORAGE_CAPACITY - 1 ) {
                // The first few positions are reserved for our keys.
                key_storage_next = call MyKey.get_key_count( );
            }
            else {
                key_storage_next++;
            }
        }
    }
    

    command error_t Init.init( )
    {
        int  i;
        int  key_count;
        int  key_index;
        bool invalidate_old;
        
        // Strictly speaking this command should not call into any other components (since they
        // might not be initialized yet). However, we "know" that CryptographicServices has no
        // non-static initialization needs so public_key_initializer will return an appropriate
        // result regardless of initialization order. At some point this kludge should be fixed.
        //
        for( i = 0; i < KEY_STORAGE_CAPACITY; ++i ) {
            call CryptographicServices.public_key_initializer( &key_storage_area[i] );
        }
        key_storage_size = 0;
        key_storage_next = 0;
        
        // Calling into the MyKey component carries the same warnings as described above. As
        // with CryptographicServices there is no non-static initialization in that component
        // so all should be well.
        //
        // This code installs the public keys deployed with the node into the key storage area.
        // They are fixed at locations 0 .. MyKey.get_key_count() - 1. Those locations are never
        // used for public keys obtained from incoming credentials.
        //
        key_count = call MyKey.get_key_count( );
        for( i = 0; i < key_count; ++i ) {
            raw_add_key( call MyKey.get_public_key( i ), &key_index, &invalidate_old );
        }        
        
        // We assume nobody else will call add_key() between now and when the node is fully up.
        initialized = 1;
        return SUCCESS;
    }
    
    
    command void KeyStorage.add_key( const struct PublicKey *key, int *key_index, bool *invalidate_old )
    {
        raw_add_key( key, key_index, invalidate_old );
    }
    
    command int KeyStorage.get_key_id( const struct PublicKey *raw_key )
    {
        int i;
      
        #ifdef KS_DEBUG_LOOKUP
        printf( "KS: Looking up ID for key:\n" );
        print_key( raw_key );
        printfflush( );
        #endif
        
        for( i = 0; i < key_storage_size; ++i ) {
            if( call CryptographicServices.same_keys( &key_storage_area[i], raw_key ) ) {
                #ifdef KS_DEBUG_LOOKUP
                printf( "KS: Found ID %d\n", i );
                printfflush( );
                #endif
                return i;
            }
        }
        #ifdef KS_DEBUG_LOOKUP
        printf( "KS: ID not found, returning -1\n" );
        printfflush( );
        #endif
        return -1;
    }


    command int KeyStorage.size( )
    {
        return key_storage_size;
    }
}
