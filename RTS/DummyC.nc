// FILE   : DummyC.nc
// SUMMARY: A component used as a dumping ground for unwanted events.
//
// The purpose of this component is to serve as a dummy component that will receive events of no
// interest. For example, programs that don't make use of any RT0 authorization still have
// ACRT0C and ASRT0C loaded. Those components need to be connected to something that will handle
// their events in order to satisfy the nesC compiler.

module DummyC {
    uses interface AuthorizationClient;
    uses interface AuthorizationServer;
    uses interface CertificateEvents;
}
implementation {
    
    event void AuthorizationClient.preparation_done( int new_size )
    {
    }

    event void AuthorizationServer.check_done( bool check_result )
    {
    }

    event void CertificateEvents.certificate_send( int certificate_number )
    {
    }

}
