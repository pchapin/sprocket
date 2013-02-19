// FILE   : KeyStorage.nc
// SUMMARY: Interface to a public key storage component.
//
// Components that provide this interface are able to store public keys.

#include "CryptographicServices.h"

interface KeyStorage {
    
    //! Add a public key to the storage area.
    /*!
     * \param key A pointer to the public key to add.
     *
     * \param key_index A pointer to a variable that will receive the key's index value in the
     * storage area.
     *
     * \param invalidate_old. A pointer to a variable that will receive the invalidation flag.
     * If this flag is true, all uses of the previous key at the returned index value must be
     * invalidated. It is the caller's responsibility to do this; the key storage area can not
     * know about all such uses.
     */
    command void add_key( const struct PublicKey *key, int *key_index, bool *invalidate_old );
    
    
    //! Returns the key identifier (index in the key storage) for a specific key.
    /*!
     * \param raw_key A pointer to the full 40 byte representation of a public key.
     *
     * \return The key index for the given key in the key storage area or -1 if no such key is
     * found.
     */
    command int get_key_id( const struct PublicKey *raw_key );
    
    
    //! Return the number of public keys currently in the storage area.
    command int size( );
    
}
