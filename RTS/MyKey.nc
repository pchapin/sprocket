// FILE   : MyKey.nc
// SUMMARY: Interface to the "blessed" node keys.
//
// The keys returned here are blessed in the sense that they represents the calling node. They
// are the only private keys on the node and so the component that provides this interface
// might need special security handling.

#include "CryptographicServices.h"
#include "ECC.h"

interface MyKey {
    
    //! Return the specified public key.
    /*!
     * \param key_index The locally specified index into the set of known node entities. A key
     * index of zero refers to the default entity.
     */
    command const struct PublicKey *get_public_key( int key_index );
    
    //! Return the specified private key.
    /*!
     * \param key_index The locally specified index into the set of known node entities. A key
     * index of zero refers to the default entity.
     */
    command const NN_DIGIT *get_private_key( int key_index );
    
    
    //! Returns the number of key pairs associated with this node.
    command int get_key_count( );
}