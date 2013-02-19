// FILE   : AppC.nc
// SUMMARY: Main configuration of the duties benchmark server.
//

configuration AppC {
}
implementation {
  components LedsC;
  components ServerC;
  components RPCCOntrolC;

  ServerC.Leds -> LedsC;
  ServerC.SpartanBoot -> RPCControlC;
}
