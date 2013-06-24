//-----------------------------------------------------------------------
// FILE    : SpDisseminationValue.nc
// SUBJECT : SpartanRPC version of the DisseminationValue interface.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// This is a non-generic version of the DisseminationValue interface with reduced features. It
// is (approximately) what is needed by the SnowCloud project.
//
// -----------------------------------------------------------------------

#include "KappaMsg.h"

interface SpDisseminationValue {

    command const command_t *get( );
    command void set(const command_t * );
    event void changed( );
}

