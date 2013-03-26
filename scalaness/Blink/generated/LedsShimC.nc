
// Shim to convert Leds interface into bare commands.
// Currently it is necessary to write these shims manually. The Scalaness compiler should do it.

module LedsShimC {
    provides command void led0Toggle( );
    uses interface Leds;
}
implementation {
    command void led0Toggle( )
    {
        call Leds.led0Toggle( );
    }
}
