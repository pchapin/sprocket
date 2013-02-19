// FILE   : ClientC.nc
// SUMMARY: Main program of the baseline benchmark client.
//

#include "Client.h"

module ClientC {
    uses interface Boot;
    uses interface Packet;
    uses interface AMSend;
    uses interface SplitControl as AMControl;
    uses interface Leds;
}
implementation {

    uint16_t counter;
    message_t pkt;
    bool busy = FALSE;

    task void send_message( )
    {
        BenchmarkMsg *bnchpkt;

        if ( !busy ) {
            counter++;
            bnchpkt = ( BenchmarkMsg * )( call Packet.getPayload( &pkt, sizeof(BenchmarkMsg) ) );
            if( bnchpkt == NULL ) {
                return;
            }
            bnchpkt->counter = counter;
            if(call AMSend.send( AM_BROADCAST_ADDR, &pkt, sizeof(BenchmarkMsg) ) == SUCCESS ) {
                busy = TRUE;
            }
            
            if( (counter & 0x00FF) == 0 ) call Leds.led0Toggle( );
        }
    }


    event void Boot.booted( )
    {
        dbg( "Boot", "Node %d booted!\n", TOS_NODE_ID );
        call AMControl.start( );
    }


    event void AMControl.startDone( error_t err )
    {
        if ( err != SUCCESS ) {
            call AMControl.start( );
        }
        else {
            post send_message( );
        }
    }
    
    event void AMSend.sendDone( message_t *msg, error_t err )
    {
        if( &pkt == msg ) {
            busy = FALSE;
            post send_message( );
        }
    }


    // Ignore this event.
    event void AMControl.stopDone( error_t err ) {
    }

}
