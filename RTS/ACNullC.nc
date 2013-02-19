// FILE   : ACNullC.nc
// SUMMARY: An AuthorizationClient that does no authorization.
//

module ACNullC {
    provides interface AuthorizationClient;
}
implementation {
    
    // The Null AuthorizationClient does not add any authorization tokens. It always succeeds.
    command error_t AuthorizationClient.prepare_message(
        uint8_t *message_buffer,
        int      size,
        int      max_size,
        int      entity_index,
        int      remote_index )
    {
        signal AuthorizationClient.preparation_done( size );
        return SUCCESS;
    }

}
