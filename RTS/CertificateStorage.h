// FILE   : CertificateStorage.h
// SUMMARY: Declarations needed by certificate storage component.
//

#ifndef CERTIFICATESTORAGE_H
#define CERTIFICATESTORAGE_H

// Needed for the definition of octet_t.
#include "CryptographicServices.h"

struct StoredCertificate {
    const octet_t *data;
          int      size;
};

#endif

