
configuration AppC {
}
implementation {
  components LedsC;
  components ServerC;
  components RPCControlC;

  ServerC.Leds        -> LedsC;
  ServerC.SpartanBoot -> RPCControlC;
  ServerC.RPCControl  -> RPCControlC;
}
