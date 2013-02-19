
configuration TestAppC {
}
implementation {
    components MainC,
               DriverC,
               CryptographicServicesC,
               KeyStorageC,
               CredentialStorageC,
               TransferFormatC,
               ECDSAC,
               LedsC;
    
    DriverC                               -> MainC.Boot;
    MainC.SoftwareInit                    -> KeyStorageC.Init;
    MainC.SoftwareInit                    -> CredentialStorageC.Init;
    DriverC.KeyStorage                    -> KeyStorageC;
    DriverC.CredentialStorage             -> CredentialStorageC;
    DriverC.TransferFormat                -> TransferFormatC;
    DriverC.Leds                          -> LedsC;
    KeyStorageC.CryptographicServices     -> CryptographicServicesC;
    TransferFormatC.CryptographicServices -> CryptographicServicesC;
    TransferFormatC.KeyStorage            -> KeyStorageC;
    TransferFormatC.CredentialStorage     -> CredentialStorageC;
    CryptographicServicesC.ECDSA          -> ECDSAC;
    TransferFormatC.Leds                  -> LedsC;     // Needed only for debugging support.
}
