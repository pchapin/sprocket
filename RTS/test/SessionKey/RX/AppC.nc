
configuration AppC {
}
implementation {
    components MainC,
               RXC,
               MyKeyC,
               SessionKeyReceiverC,
               ActiveMessageC,
               // new AMSenderC(6),
               new AMReceiverC(6),
               // ECDHC,
               LedsC;
    
    // The main component doesn't do much. Most session key handling is in the background.
    RXC.Boot              -> MainC;
    RXC.AMControl         -> ActiveMessageC.SplitControl;
    RXC.Leds              -> LedsC;
    
    // Make sure the cache is initialized.
    // MainC.SoftwareInit    -> SessionKeyStorage.Init;

    // Wire the session key component to the various supporting components.
    // SessionKeyReceiverC.ECDH     -> ECDHC;
    SessionKeyReceiverC.MyKey    -> MyKeyC;
    // SessionKeyReceiverC.AMSend   -> AMSenderC;
    SessionKeyReceiverC.Receive  -> AMReceiverC;
    SessionKeyReceiverC.Leds     -> LedsC;  // For debugging purposes only.
}
