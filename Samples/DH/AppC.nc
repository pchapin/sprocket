
configuration AppC {
}
implementation {
    components MainC, DiffieHellmanC, LedsC, ECCC, ECDHC;

    DiffieHellmanC      -> MainC.Boot;
    DiffieHellmanC.Leds -> LedsC;
    DiffieHellmanC.ECDH -> ECDHC;
    DiffieHellmanC.ECC  -> ECCC.ECC;
}

