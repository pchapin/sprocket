// FILE   : AppC.nc
// SUMMARY: Main configuration of the baseline benchmark server.
//

#include "Server.h"

configuration AppC {
}
implementation {
  components MainC;
  components LedsC;
  components ServerC;
  components ActiveMessageC;
  components new AMReceiverC( AM_BENCHMARK );

  ServerC.Boot      -> MainC;
  ServerC.Leds      -> LedsC;
  ServerC.AMControl -> ActiveMessageC;
  ServerC.Receive   -> AMReceiverC;
}
