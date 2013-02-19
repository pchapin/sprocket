// FILE   : CertificateEventsC.nc
// SUMMARY: Used for debugging.

interface CertificateEvents {
    
    // Signaled when a certificate sender actually sends something.
    event void certificate_send( int certificate_number );

}
