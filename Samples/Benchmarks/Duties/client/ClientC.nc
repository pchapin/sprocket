// FILE   : ClientC.nc
// SUMMARY: Main program of the duties benchmark client.
//

module ClientC {
    uses interface SpartanBoot;
    uses interface Blink;
    uses interface Leds;
    uses interface RPCControl;
}
implementation {
    uint8_t counter = 0;
    
    task void send_message( )
    {
        counter++;
        if( (counter & 0x00FF) == 0 ) {
            call Leds.led0Toggle( );
            post Blink.toggleProgress( );
        }
        else {
            post Blink.setLeds( counter );
        }
    }
    
    event void SpartanBoot.booted( )
    {
        post send_message( );
    }
    
    event void RPCControl.duty_posted( )
    {
        post send_message( );
    }

}
