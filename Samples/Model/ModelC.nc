
module ModelC {
    uses interface Leds;
    uses interface Boot;
    uses interface CredentialStorage;
}
implementation {
        
    event void Boot.booted( )
    {
    	int  i;
    	bool overflow;
    	
        call Leds.led1On( );  // Turn on the green LED at boot.
        
        for(i = 0; i < 30000; i++){
            call CredentialStorage.flush_caches( );
            call CredentialStorage.compute_minimum_model( &overflow );
            if( overflow == TRUE )
                call Leds.led0On( );
        }
        call Leds.led1Off( );
        call Leds.led2On( );
    }
    
}

