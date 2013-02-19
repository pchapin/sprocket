
// #define NEW_PRINTF_SEMANTICS

configuration Spkt_InitializeC {
}
implementation {
    components LedsC;        // For debugging purposes only.
    // components PrintfC;      // For debugging purposes only.
    // components SerialStartC; // For debugging purposes only.

    // ==============
    // Initialization
    // ==============
    
    components Spkt_MyKeyC;
    components MainC, RadioInitializeC, ActiveMessageC, RPCControlC;
    components KeyStorageC, CredentialStorageC, SessionKeyStorageC;

    // Make sure active message support starts when the node boots.
    RadioInitializeC.Boot      -> MainC;
    RadioInitializeC.AMControl -> ActiveMessageC.SplitControl;
    RPCControlC.Initialize     -> RadioInitializeC.SpartanBoot;
    
    // Make sure the storage caches are initialized.
    MainC.SoftwareInit -> KeyStorageC.Init;
    MainC.SoftwareInit -> CredentialStorageC.Init;
    MainC.SoftwareInit -> SessionKeyStorageC.Init;
    KeyStorageC.MyKey  -> Spkt_MyKeyC;
    KeyStorageC.Leds   -> LedsC;   // For debugging purposes only.
    
    // ================================
    // Cryptograph Services and Related
    // ================================
    
    components CryptographicServicesC, TransferFormatC;
    components ECCC, ECDSAC, ECDHC;

    // Wire together the credential processing and storage components.
    KeyStorageC.CryptographicServices      -> CryptographicServicesC;
    TransferFormatC.CryptographicServices  -> CryptographicServicesC;
    TransferFormatC.KeyStorage             -> KeyStorageC;
    TransferFormatC.CredentialStorage      -> CredentialStorageC;
    TransferFormatC.Leds                   -> LedsC;  // For debugging purposes only.
    
    // Wire the CryptographicServices component to the underlying crypto algorithms.
    CryptographicServicesC.ECDSA -> ECDSAC;
    CryptographicServicesC.ECDH  -> ECDHC;
    
    // =============================
    // Certificate Sending/Receiving
    // =============================

    components Spkt_CertificatesC;
    components CertificateSenderC, CertificateReceiverC;
    components new AMSenderC(6) as CertSenderC, new AMReceiverC(6) as CertReceiverC;
    components RandomC;
    components new TimerMilliC( ) as SendTimerC;
    components new TimerMilliC( ) as ReceiveTimerC;
    components new TimerMilliC( ) as FragmentTimerC;
    
    // Wire the certificate sender component to the radio and storage components.
    CertificateSenderC.Boot                -> MainC;
    CertificateSenderC.SendingTimer        -> SendTimerC;
    CertificateSenderC.FragmentTimer       -> FragmentTimerC;
    CertificateSenderC.Random              -> RandomC;
    CertificateSenderC.CertificateStorage  -> Spkt_CertificatesC;
    CertificateSenderC.Packet              -> CertSenderC;
    CertificateSenderC.AMSend              -> CertSenderC;
    CertificateSenderC.Leds                -> LedsC;  // For debugging purposes only.

    // Wire the certificate receiver component to the radio and storage components.
    CertificateReceiverC.Receive           -> CertReceiverC;
    CertificateReceiverC.ReceivingTimer    -> ReceiveTimerC;
    CertificateReceiverC.TransferFormat    -> TransferFormatC;
    CertificateReceiverC.CredentialStorage -> CredentialStorageC;
    CertificateReceiverC.Leds              -> LedsC;       // For debugging purposes only.
    CertificateReceiverC.AMPacket          -> CertSenderC; // For debugging purposes only.
    
    // ===========================
    // Session Key Sender/Receiver
    // ===========================
    
    components Spkt_GoverningRolesC;
    components SessionKeySenderC, SessionKeyReceiverC;
    components new AMSenderC(7) as SKSenderClientC, new AMReceiverC(7) as SKReceiverClientC;
    components new AMSenderC(9) as SKSenderServerC, new AMReceiverC(9) as SKReceiverServerC;
     
    // Wire the session key sender component to radio components.
    SessionKeySenderC.MyKey                   -> Spkt_MyKeyC;
    SessionKeySenderC.CryptographicServices   -> CryptographicServicesC;
    SessionKeySenderC.Packet                  -> SKSenderServerC;
    SessionKeySenderC.AMSend                  -> SKSenderServerC;
    SessionKeySenderC.Receive                 -> SKReceiverClientC;
    SessionKeySenderC.Leds                    -> LedsC;  // For debugging purposes only.
     
    // Wire the session key receiver component to the crypto and radio components.
    SessionKeyReceiverC.MyKey                 -> Spkt_MyKeyC;
    SessionKeyReceiverC.KeyStorage            -> KeyStorageC;
    SessionKeyReceiverC.SessionKeyStorage     -> SessionKeyStorageC;
    SessionKeyReceiverC.CryptographicServices -> CryptographicServicesC;
    SessionKeyReceiverC.GoverningRoles        -> Spkt_GoverningRolesC;
    SessionKeyReceiverC.CredentialStorage     -> CredentialStorageC;
    SessionKeyReceiverC.Packet                -> SKSenderClientC;
    SessionKeyReceiverC.AMPacket              -> SKSenderClientC;
    SessionKeyReceiverC.AMSend                -> SKSenderClientC;
    SessionKeyReceiverC.Receive               -> SKReceiverServerC;
    SessionKeyReceiverC.Leds                  -> LedsC;  // For debugging purposes only.
    
    // Connect the session key storage area to the sender and receiver.
    SessionKeyStorageC.SessionKeySender    -> SessionKeySenderC;
    SessionKeyStorageC.SessionKeyReceiver  -> SessionKeyReceiverC;
    
    // =====================
    // Stub/Skeleton Support
    // =====================

    components ACNullC, ASNullC, ACRT0C, ASRT0C;
    components AesC;
    
    RadioInitializeC.AESControl -> AesC;    
    ACRT0C.SessionKeyStorage    -> SessionKeyStorageC;
    ACRT0C.Encrypt              -> AesC.Encrypt;
    ACRT0C.Leds                 -> LedsC;  // For debugging purposes only.
    ASRT0C.SessionKeyStorage    -> SessionKeyStorageC;
    ASRT0C.Encrypt              -> AesC.Encrypt;
    
    // ===================
    // Dummy Event Handler
    // ===================

    components DummyC;
    
    DummyC.AuthorizationClient -> ACNullC;
    DummyC.AuthorizationClient -> ACRT0C;
    DummyC.AuthorizationServer -> ASNullC;
    DummyC.AuthorizationServer -> ASRT0C;
    DummyC.CertificateEvents   -> CertificateSenderC; 
}
    