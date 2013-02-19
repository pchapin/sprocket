// FILE   : RadioInitializeC.nc
// SUMMARY: Start up the radio system and the CC2420 encryption hardware.
//

module RadioInitializeC {
    uses interface Boot;
    uses interface SplitControl as AMControl;
    uses interface SplitControl as AESControl;
    provides interface SpartanBoot;
}
implementation {
    int AM_started = 0;
    int AES_started = 0;

    event void Boot.booted( )
    {
        call AMControl.start( );
        call AESControl.start( );
    }

    event void AMControl.startDone( error_t err )
    {
        if( err != SUCCESS ) {
            call AMControl.start( );
        }
        else {
            AM_started = 1;
            if( AES_started ) signal SpartanBoot.booted( );
        }
    }
    
    event void AESControl.startDone( error_t err )
    {
        if( err != SUCCESS ) {
            call AESControl.start( );
        }
        else {
            AES_started = 1;
            if( AM_started ) signal SpartanBoot.booted( );
        }
    }

    // Ignore this event.
    event void AMControl.stopDone( error_t err )
    {
    }

    // Ignore this event.
    event void AESControl.stopDone( error_t err )
    {
    }

}
