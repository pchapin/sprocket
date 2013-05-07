// FILE   : ServerC.nc
// SUMMARY: Main program of the duties benchmark server.
//

module ServerC {
  provides remote interface Blink;
  uses            interface Leds;
  uses            interface SpartanBoot;
}
implementation {

    duty void Blink.setLeds( uint8_t val )
    {    
        if( val & 0x02 )
            call Leds.led1On( );
        else
            call Leds.led1Off( );
        
        if( val & 0x04 )
            call Leds.led2On( );
        else
            call Leds.led2Off( );
  }
  
  duty void Blink.toggleProgress( )
  {
      call Leds.led0Toggle( );
  }
  
  // Ignore this event.
  event void SpartanBoot.booted( )
  {
  }
}

