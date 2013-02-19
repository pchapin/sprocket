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
    if( (val & 0x00FF) == 0 ) call Leds.led0Toggle( );
    
    // if( val & 0x01 )
    //   call Leds.led0On( );
    // else 
    //   call Leds.led0Off( );
    if( val & 0x02 )
      call Leds.led1On( );
    else
      call Leds.led1Off( );
    if( val & 0x04 )
      call Leds.led2On( );
    else
      call Leds.led2Off( );
  }
  
  // Ignore this event.
  event void SpartanBoot.booted( )
  {
  }
}

