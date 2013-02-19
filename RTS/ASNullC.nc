
module ASNullC {
    provides interface AuthorizationServer;
}
implementation {

    // This version does not do any authorization computations. All messages are authorized.
    command error_t AuthorizationServer.check_message(
        const uint8_t *message_buffer,
              int      size,
              uint16_t client_address )
    {
        signal AuthorizationServer.check_done( TRUE );
        return SUCCESS;
    }

}
