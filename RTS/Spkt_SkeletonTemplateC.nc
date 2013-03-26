// Generated by Sprocket. This file is overwritten each time Sprocket is run. Do not edit!

module %SKELETONNAME% {
    uses interface %INTERFACENAME%;
    uses interface AuthorizationServer;
    uses interface Receive;
    uses interface AMPacket;
}
implementation {
    
    uint8_t  arguments[20];         // Holds a copy of the "current" arguments + authorization.
    uint8_t *argp;                  // Points at the duty arguments in the message.
    bool     check_in_progress = FALSE;   // =TRUE if MAC check is in progress.
    
    %DUTYTASKS%

    event message_t *Receive.receive(message_t *msg, void *payload, uint8_t len)
    {
        const uint8_t *message_start = (const uint8_t *)payload;
        const uint8_t *p = message_start;
        const uint16_t client_address = call AMPacket.source( msg );
        int  i;
        bool found = FALSE;
        int  component_count = 0;
        
        if( check_in_progress == TRUE ) return msg;

        // Verify that this message is intended for this (N, C, I) address.
        if( ( *p++ & 0x7F ) != %INTERFACEID% ) {
            return msg;
        }
        component_count = *p++;
        for( i = 0; i < component_count; ++i ) {
            if((*p == 0xFF || *p == TOS_NODE_ID) && *(p + 1) == %COMPONENTID% ) found = TRUE;
            p += 2;
        }
        if( !found ) return msg;
        
        // Copy the duty arguments so we can return msg from this event handler.
        memset( arguments, 0, 20 );
        memcpy( arguments, p, len - (p - message_start) );
        argp = arguments;
        check_in_progress = TRUE;
        
        // Verify that this message is properly authorized.
        call AuthorizationServer.check_message( message_start, len, client_address );
        return msg;
    }
    
    
    event void AuthorizationServer.check_done( bool check_result )
    {
        if( check_in_progress ) {
            if( check_result == TRUE ) {
                %INVOKEDUTY%
            }
            check_in_progress = FALSE;
        }
    }
}