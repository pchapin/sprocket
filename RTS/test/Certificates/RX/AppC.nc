
configuration AppC {
}
implementation {
    components MainC,
               RXC,
               new TimerMilliC( ) as ReceiveTimerC,
               CertificateReceiverC,
               ActiveMessageC,
               new AMReceiverC(7),
               KeyStorageC,
               CredentialStorageC,
               TransferFormatC,
               CryptographicServicesC,
               ECDSAC,
               LedsC;
    
    // The main component doesn't do much. Certificate receiving is in the background.
    RXC.Boot      -> MainC;
    RXC.AMControl -> ActiveMessageC.SplitControl;
    RXC.Leds      -> LedsC;

    // Make sure the storage caches are initialized.
    MainC.SoftwareInit -> KeyStorageC.Init;
    MainC.SoftwareInit -> CredentialStorageC.Init;
    
    // Wire together the credential processing and storage components.
    KeyStorageC.CryptographicServices     -> CryptographicServicesC;
    TransferFormatC.CryptographicServices -> CryptographicServicesC;
    TransferFormatC.KeyStorage            -> KeyStorageC;
    TransferFormatC.CredentialStorage     -> CredentialStorageC;
    TransferFormatC.Leds                  -> LedsC;  // For debugging purposes only.
    
    // Wire the CryptographicServices component to the underlying crypto algorithsm.
    CryptographicServicesC.ECDSA -> ECDSAC;
    
    // Wire the certificate receiver component to the radio and storage components.
    CertificateReceiverC.Receive           -> AMReceiverC;
    CertificateReceiverC.ReceivingTimer    -> ReceiveTimerC;
    CertificateReceiverC.TransferFormat    -> TransferFormatC;
    CertificateReceiverC.CredentialStorage -> CredentialStorageC;
    CertificateReceiverC.Leds              -> LedsC;  // For debugging purposes only.
}
