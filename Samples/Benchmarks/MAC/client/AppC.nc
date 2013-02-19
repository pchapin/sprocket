// FILE   : AppC.nc
// SUMMARY: Main configuration of the duties benchmark client.
//

configuration AppC {
}
implementation {
  components ClientC;
  components LedsC;
  components RemoteSelectorC;
  components RPCControlC;

  ClientC.SpartanBoot -> RPCControlC;
  ClientC.Leds -> LedsC;
  ClientC.Blink -> [RemoteSelectorC].Blink;
  ClientC.RPCControl -> RPCControlC;
}
