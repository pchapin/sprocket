// FILE   : SessionKeySender.nc
// SUMMARY: Interface to a session negotiation component
//

#include "CryptographicServices.h"
#include "IDs.h"

interface SessionKeySender {
    
    //! Start the session key negotiation process.
    /*!
     * This command should be called by clients to start the process of negotiating a session
     * key with a particular server. The endpoint is assumed to be in the SERVER role. The 
     * component providing this interface must obtain the local public key from some suitable
     * source. It is *not* a parameter of this command.
     *
     * This command does not return an error indication.
     *
     * \param endpoint The address of the service for which a session key is needed.
     * \param entity_index The key index of the key under which this negotiation takes place.
     * This will be one of the public/private key pairs deployed with the node.
     */
    command void initiate_negotiation( const struct IDs *endpoint, int entity_index );

    
    //! Installs a session key for the given endpoint.
    /*!
     * This might force the removal of some other session key. This event is intended to be
     * used by a SessionKeySender to install session keys that are generated. 
     *
     * \param endpoint Specifies the remote endpoint for which the session key applies.
     * \param key A pointer to the key to be installed.
     */
    event void put_key(
        const struct IDs        *endpoint,
        const struct SessionKey *key );
}