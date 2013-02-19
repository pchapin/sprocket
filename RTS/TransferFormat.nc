// FILE   : TransferFormat.nc
// SUMMARY: Interface to components that manipulate raw certificates.
//

#include "Credentials.h"

interface TransferFormat {
  
    // Convert a raw certificate to an abstract representation. This command also installs keys.
    // raw_data      : Pointer to the bytes forming the certificate.
    // raw_data_size : The number of bytes in the certificate.
    // credential    : Pointer to where the credential will be stored.
    // valid         : Pointer to a place to receive validity information. If *valid == TRUE the
    //                 certificate is not expired and has a valid signature.
    //
    command void raw_to_credential( const uint8_t               *raw_data,
                                          int                    raw_data_size,
                                          struct CredentialType *credential,
                                          bool                  *valid );
}

