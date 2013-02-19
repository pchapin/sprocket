
module TestC {
    provides interface Test;
}
implementation {
    
    command error_t Test.doTest( )
    {
        return SUCCESS;
    }
    
}
