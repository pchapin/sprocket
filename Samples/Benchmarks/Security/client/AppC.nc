
#include <Timer.h>

configuration AppC {
}
implementation {
  components MainC;
  components ClientC;
  components new TimerMilliC() as Timer0;
  components RemoteSelectorC;
  components RPCControlC;

  ClientC.Boot        -> MainC;
  ClientC.SpartanBoot -> RPCControlC;
  ClientC.RPCControl  -> RPCControlC;
  ClientC.Timer0      -> Timer0;
  activate "*" for ClientC.Blink -> [RemoteSelectorC].Blink;
}
