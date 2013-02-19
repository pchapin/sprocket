// FILE   : SessionKeyStorage.nc
// SUMMARY: Interface to session key storage components.
//

#include "CryptographicServices.h"
#include "IDs.h"

interface SessionKeyStorage {

    //! Returns the session key for the given server remote endpoint.
    /*!
     * This command is used by clients to look up a session key.
     *
     * If a session key for the desired endpoint does not exist, an error is returned but the
     * node also attempts to negotiate a session key for that endpoint in the background. A
     * future attempt to find a session key for that endpoint might succeed.
     *
     * \param endpoint Specifies the remote endpoint for which a session key is defined.
     * \param key A pointer to a variable that receives the session key. If no key is defined
     * for this endpoint, there is no change to *key.
     * \param entity_index The index of the key under which session key negotiation (if neeeded)
     * will take place. This will be one of the public/private key pairs deployed with the node.
     *
     * \return SUCCESS if a session key exists; FAIL otherwise.
     */
    command error_t client_get_key(
        const struct IDs        *endpoint,
              struct SessionKey *key,
              int                entity_index );
    
    
    //! Returns the session key for the given client remote endpoint.
    /*!
     * This command is used by servers to look up a session key.
     *
     * If a session key for the desired endpoint does not exist, an error is returned. No
     * attempt is made to negotiate a session key with the client. It is the client's
     * responsibility to initiate such negotiations.
     *
     * \param endpoint Specifies the remote endpoint for which a session key is defined.
     * \param key A pointer to a variable that receives the session key. If no key is defined
     * for this endpoint, there is no change to *key.
     *
     * \return SUCCESS if a session key exists; FAIL otherwise.
     */
    command error_t server_get_key(
        const struct IDs        *endpoint,
              struct SessionKey *key );
    
}