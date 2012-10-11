// FILE   : BlinkAppC.nc
// SUMMARY: Staged "Blink" main configuration
//
// This configuration wires the components that are needed for staged "Blink" application.

configuration BlinkAppC {
}
implementation {
    components MainC, SBlinkC, LedsC;
    components new TimerMilliC() as Timer0, TimerShimC;

    SBlinkC               -> MainC.Boot;
    SBlinkC.Leds          -> LedsC;
    SBlinkC.startPeriodic -> TimerShimC;
    SBlinkC.fired         <- TimerShimC;
    TimerShimC.Timer0     -> Timer0;
}

