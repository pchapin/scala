
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
