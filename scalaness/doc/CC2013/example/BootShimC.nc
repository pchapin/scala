
// Shim to convert Boot interface into bare commands.
// Currently it is necessary to write these shims manually. The Scalaness compiler should do it.

module BootShimC {
    uses command void booted( );
    uses interface Boot;
}
implementation {
    
    event void Boot.booted( )
    {
        call booted( );
    }
    
}
