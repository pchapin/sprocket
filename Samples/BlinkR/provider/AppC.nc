/****************************************************************************
FILE    : AppC.nc
SUBJECT : Top level configuration for the Blink server
AUTHOR  : Peter C. Chapin

****************************************************************************/

configuration AppC { }
implementation {
    components MainC, ProviderC as App, LedsC, TransferFormatC;

    App.Leds -> LedsC;
    
    App.TransferFormat -> TransferFormatC;
    App.Boot -> MainC;
}

