/****************************************************************************
FILE    : AppC.nc
SUBJECT : Top level configuration for the Blink server
AUTHOR  : Peter C. Chapin

****************************************************************************/

configuration AppC { }
implementation {
    components RPCControlC, ProviderC as App, LedsC, TransferFormatC;

    App.SpartanBoot    -> RPCControlC;
    App.Leds           -> LedsC;
    App.TransferFormat -> TransferFormatC;
    App.RPCControl     -> RPCControlC;
}

