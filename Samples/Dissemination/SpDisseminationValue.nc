//-----------------------------------------------------------------------
// FILE    : SpDisseminationValue.nc
// SUBJECT : SpartanRPC version of the DisseminationValue interface.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// This is a non-generic version of the DisseminationValue interface with reduced features. It
// is (approximately) what is needed by the SnowCloud project.
//
// -----------------------------------------------------------------------

#include "command.h"

interface SpDisseminationValue {

    command const command_t *get( );
    event void changed( );
}

