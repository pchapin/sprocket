// FILE   : ServerC.nc
// SUMMARY: Main program of the baseline benchmark server.
//

#include "Server.h"

module ServerC {
    uses interface Boot;
    uses interface Leds;
    uses interface Receive;
    uses interface SplitControl as AMControl;
}
implementation {

    message_t pkt;
    bool busy = FALSE;

    void setLeds( uint16_t val )
    {
        if( (val & 0x00FF) == 0 ) call Leds.led0Toggle( );
        
        // if( val & 0x01 )
        //     call Leds.led0On( );
        // else 
        //     call Leds.led0Off( );
        if( val & 0x02 )
            call Leds.led1On( );
        else
            call Leds.led1Off( );
        if( val & 0x04 )
            call Leds.led2On( );
        else
            call Leds.led2Off( );
    }


    event void Boot.booted( )
    {
        call AMControl.start( );
    }


    event void AMControl.startDone( error_t err )
    {
        if ( err != SUCCESS ) {
            call AMControl.start( );
        }
    }


    event message_t *Receive.receive( message_t *msg, void *payload, uint8_t len )
    {
        if( len == sizeof( BenchmarkMsg ) ) {
            BenchmarkMsg *bnchpkt = ( BenchmarkMsg * )payload;
            setLeds( bnchpkt->counter );
        }
        return msg;
    }


    // Ignore this event.
    event void AMControl.stopDone( error_t err )
    {
    }
    
}

