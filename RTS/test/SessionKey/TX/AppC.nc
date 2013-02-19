
configuration AppC {
}
implementation {
    components MainC,
               TXC,
               new TimerMilliC( ) as SendTimer,
               MyKeyC,
               SessionKeySenderC,
               ActiveMessageC,
               new AMSenderC(6),
               // new AMReceiverC(6),
               // ECDHC,
               LedsC;
    
    // The main component doesn't do much. Most session key handling is in the background.
    TXC.Boot              -> MainC;
    TXC.AMControl         -> ActiveMessageC.SplitControl;
    TXC.SessionKeySender  -> SessionKeySenderC;
    TXC.SendingTimer      -> SendTimer;
    TXC.Leds              -> LedsC;
    
    // Make sure the cache is initialized.
    // MainC.SoftwareInit    -> SessionKeyStorage.Init;

    // Wire the session key component to the various supporting components.
    // SessionKeySenderC.ECDH     -> ECDHC;
    SessionKeySenderC.MyKey    -> MyKeyC;
    SessionKeySenderC.AMSend   -> AMSenderC;
    SessionKeySenderC.Packet   -> AMSenderC;
    // SessionKeySenderC.Receive  -> AMReceiverC;
    SessionKeySenderC.Leds     -> LedsC;  // For debugging purposes only.
}
