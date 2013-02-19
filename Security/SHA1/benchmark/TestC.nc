
module TestC {
    provides interface Test;
    uses     interface SHA1;
}
implementation {
    
    message_block m;
    SHA1_State    state;
    hash_array    result;
    
    command error_t Test.doTest( )
    {
        int i;
        
        for( i = 0; i < 100; ++i ) {
            call SHA1.prepare( &state );
            call SHA1.update_hash( &state, m, 1 );
            call SHA1.partake( &state, result );
        }
            
        return SUCCESS;
    }
    
}
