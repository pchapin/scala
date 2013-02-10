
// Library configuration encapsulates arbitrary nesC components that have exports.
configuration LibraryEC {
    // Only provides (exports) are allowed here.

    // nesT version of the Leds interface.
    provides command void led0Toggle( );
}
implementation {
    components LedsShimC, LedsC;

    led0Toggle = LedsShimC.led0Toggle;
    LedsShimC.Leds -> LedsC;
}
