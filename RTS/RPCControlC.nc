// This component is used for testing and debugging.

module RPCControlC {
  uses interface RPCControl as StubControl;
  provides interface RPCControl;
  
  uses interface SpartanBoot as Initialize;
  provides interface SpartanBoot;
}
implementation {
    
    // All stubs this component is wired to will announce their duty post operations here.
    event void StubControl.duty_posted( )
    {
        signal RPCControl.duty_posted( );
    }
    
    // This event is signaled when SpartanRPC is ready to work.
    event void Initialize.booted( )
    {
        signal SpartanBoot.booted( );
    }
}
