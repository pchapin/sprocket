/****************************************************************************
FILE    : AppC.nc
SUBJECT : Top level configuration for the hardware AES demonstration program.
AUTHOR  : Peter C. Chapin

****************************************************************************/

configuration AppC { }
implementation {
    components MainC, DemoC, AesC;
    
    // Used for debugging.
    components LedsC;

    DemoC.Boot       -> MainC;
    DemoC.Leds       -> LedsC;
    DemoC.Encrypt    -> AesC;
    DemoC.AESControl -> AesC.SplitControl;
}

