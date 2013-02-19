
configuration BlinkAppC {
}
implementation {
    components MainC, BlinkC, TestC, LedsC;
    components SHA1C;

    BlinkC      -> MainC.Boot;
    BlinkC.Test -> TestC;
    BlinkC.Leds -> LedsC;
    TestC.SHA1  -> SHA1C;
}

