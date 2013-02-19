// FILE   : SessionKeyReceiver.nc
// SUMMARY: Interface to a session negotiation component
//

#include "CryptographicServices.h"
#include "IDs.h"

interface SessionKeyReceiver {

    //! Installs a session key for the given endpoint.
    /*!
     * This might force the removal of some other session key. This event is intended to be
     * used by a SessionKeyReceiver to install session keys that are generated.
     *
     * \param endpoint Specifies the remote endpoint for which the session key applies.
     * \param key A pointer to the key to be installed.
     */
    event void put_key(
        const struct IDs        *endpoint,
        const struct SessionKey *key );

}