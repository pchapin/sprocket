// FILE   : AppC.nc
// SUMMARY: Main configuration of the baseline benchmark client.
//

#include "Client.h"

configuration AppC {
}
implementation {
  components MainC;
  components ClientC;
  components LedsC;
  components ActiveMessageC;
  components new AMSenderC( AM_BENCHMARK );

  ClientC.Boot      -> MainC;
  ClientC.Leds      -> LedsC;
  ClientC.Packet    -> AMSenderC;
  ClientC.AMControl -> ActiveMessageC;
  ClientC.AMSend    -> AMSenderC;
}
