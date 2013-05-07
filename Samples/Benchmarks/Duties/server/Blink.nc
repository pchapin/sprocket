// FILE   : Blink.nc
// SUMMARY: Interface to the remote LED control module.
//

interface Blink {
    duty void setLeds( uint8_t value );
    duty void toggleProgress( );
}
