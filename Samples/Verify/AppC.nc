
configuration AppC {
}
implementation {
    components MainC, VerifyC, LedsC, ECDSAC;

    VerifyC -> MainC.Boot;
    VerifyC.Leds -> LedsC;
    VerifyC.ECDSA -> ECDSAC;
}

