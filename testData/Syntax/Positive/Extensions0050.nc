module X {
    provides remote interface I;
}
implementation {
    duty void I.some_service(uint8_t x, uint16_t y)
    {
        // Do stuff
        x = y;
    }
}
