
module ServerC {
  provides remote interface Blink requires "A.r";
  uses            interface Blink as NextBlink;
  uses            interface Leds;
  uses            interface SpartanBoot;
  uses            interface RPCControl;
}
implementation {

  duty void Blink.setLeds( uint8_t val )
  {
      post NextBlink.setLeds( val );

      if( val & 0x01 )
          call Leds.led0On( );
      else 
          call Leds.led0Off( );
      if( val & 0x02 )
          call Leds.led1On( );
      else
          call Leds.led1Off( );
      if( val & 0x04 )
          call Leds.led2On( );
      else
          call Leds.led2Off( );
  }
  
  event void SpartanBoot.booted( )
  {
  }
  
  event void RPCControl.duty_posted( )
  {
  }
}

