
// Library configuration encapsulates arbitrary nesC components that have exports.
configuration LibraryEC {
    // Only provides (exports) are allowed here.

    // nesT version of the Leds interface.
    provides command void led0Toggle( );

    // nesT version of the Timer interface.
    provides command void startPeriodic( uint32_t dt );
}
implementation {
    components LedsShimC, LedsC, SpecificTimerC;

    led0Toggle = LedsShimC.led0Toggle;
    LedsShimC.Leds -> LedsC;

    startPeriodic = SpecificTimerC.startPeriodic;
}
