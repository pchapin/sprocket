//-----------------------------------------------------------------------
// FILE    : DisseminationUpdate.nc
// SUBJECT : SpartanRPC version of the DisseminationUpdate interface.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// This is a non-generic version of the DisseminationUpdate interface that uses SpartanRPC. It
// is (approximately) what is needed by the SnowCloud project.
//
// -----------------------------------------------------------------------

interface DisseminationUpdate {

    duty void change(int new_value);

}

