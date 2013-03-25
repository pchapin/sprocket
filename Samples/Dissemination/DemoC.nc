//-----------------------------------------------------------------------
// FILE    : DemoC.nc
// SUBJECT : The main component of the disseminator demonstration program.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------

module DemoC {
    uses interface Boot;
    uses interface SpartanBoot;
    uses interface RPCControl;
    uses interface DisseminationUpdate;
    uses interface DisseminationValue;
    uses interface Leds;
}
implementation {
    
    event void Boot.booted( )
    {
    }
    
    event void SpartanBoot.booted( )
    {
        // The main node disseminates a value.
        if( TOS_NODE_ID == 1 ) {
            post DisseminationUpdate.change( 7 );
        }
    }
    
    event void RPCControl.duty_posted( )
    {
    }
    
    event void DisseminationValue.changed( )
    {
        const int *p = call DisseminationValue.get( );
        call Leds.set( *p );
    }
}
