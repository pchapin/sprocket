
configuration AppC {
}
implementation {
    components MainC,
               TXC,
               CertificateSenderC,
               new TimerMilliC( ) as SendTimerC,
               new TimerMilliC( ) as FragmentTimerC,
               RandomC,
               CertificatesC,
               ActiveMessageC,
               new AMSenderC(7),
               LedsC;
    
    // The main component doesn't do much. Certificate sending is in the background.
    TXC.Boot              -> MainC;
    TXC.CertificateEvents -> CertificateSenderC;
    TXC.AMControl         -> ActiveMessageC.SplitControl;
    TXC.Leds              -> LedsC;

    // Wire the certificate sender component to the radio and storage components.
    CertificateSenderC.Boot               -> MainC;
    CertificateSenderC.SendingTimer       -> SendTimerC;
    CertificateSenderC.FragmentTimer      -> FragmentTimerC;
    CertificateSenderC.Random             -> RandomC;
    CertificateSenderC.CertificateStorage -> CertificatesC;
    CertificateSenderC.Packet             -> AMSenderC;
    CertificateSenderC.AMSend             -> AMSenderC;
    CertificateSenderC.Leds               -> LedsC;  // For debugging purposes only.
}
