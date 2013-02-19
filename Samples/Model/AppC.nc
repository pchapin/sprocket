
configuration AppC {
}
implementation {
    components MainC, ModelC, LedsC, CredentialStorageC;

    ModelC                   -> MainC.Boot;
    ModelC.Leds              -> LedsC;
    ModelC.CredentialStorage -> CredentialStorageC;
}

