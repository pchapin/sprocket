
module TestC {
    provides interface Test;
    uses     interface SHA1;
}
implementation {
    
    message_block m;
    SHA1_State    state;
    hash_array    result;
    hash_array    result1 = { 0xA9993E36, 0x4706816A, 0xBA3E2570, 0x7850C26C, 0x9CD0D89D };
    
    command error_t Test.doTest( )
    {
        error_t test_result = FAIL;
        
        // Example 1 from FIPS 180-1.
        call SHA1.prepare( &state );
        m[0] = 0x61626300;
        call SHA1.update_hash( &state, m, 24 );
        call SHA1.partake( &state, result );
        if( memcmp( result, result1, sizeof(hash_array) ) == 0 ) {
            test_result = SUCCESS;
        }
        
        // Example 2 from FIPS 180-1 should also be included.
        // Example 3 from FIPS 180-1 can't be executed because of message size limitations.
        return test_result;
    }

}
