
#include "CertificateStorage.h"

interface CertificateStorage {
    
    command int certificate_count( );
    command const struct StoredCertificate *get_storage( );

}

