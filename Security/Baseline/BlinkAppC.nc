
configuration BlinkAppC {
}
implementation {
    components MainC, BlinkC, TestC, LedsC;

    BlinkC -> MainC.Boot;
    BlinkC.Test -> TestC;
    BlinkC.Leds -> LedsC;
}

