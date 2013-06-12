//-----------------------------------------------------------------------
// FILE    : DemoC.nc
// SUBJECT : The main component of the disseminator demonstration program.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------

#include <Timer.h>
#include "command.h"

module DemoC {
    uses interface Boot;
    uses interface SpartanBoot;
    uses interface RPCControl;
    uses interface SpDisseminationUpdate;
    uses interface SpDisseminationValue;
    uses interface Timer<TMilli> as Timer;
    uses interface Leds;
}
implementation {
    
    command_t value = { 0, 0, 0, 0 };
    
    event void Boot.booted( )
    {
    }
    
    event void SpartanBoot.booted( )
    {
        // It's necessary to disseminate the value repeatedly because many posts are lost while
        // certificates are exchanged and session keys are negotiated.
        //
        call Timer.startPeriodic( 1000 );
    }
    
    event void Timer.fired( )
    {
        // The main node disseminates a value.
        if( TOS_NODE_ID == 1 ) {
            
            // We have to disseminate a different value each time. Unless the value changes
            // DisseminatorC will not attempt to propogate the value to its neighbors. Since
            // the first posts are lost periodic attempts are needed. Even without SpartanRPC
            // this is an issue for any dissemination protocol.
            //
            value.nonce++;
            post SpDisseminationUpdate.change( value );
        }
    }
    
    event void RPCControl.duty_posted( )
    {
    }
    
    event void SpDisseminationValue.changed( )
    {
        const command_t *p = call SpDisseminationValue.get( );
        call Leds.set( p->nonce );
    }
}
