// FILE   : SBlinkC.nc
// SUMMARY: Configuration created by Scalaness
//
// Eventually this configuration, or something like it, should be created by Scalaness when it
// specializes the BlinkC and InitialConstantsC components.


configuration SBlinkC {
    uses interface Boot;
    uses interface Leds;
    
    // uses interface Timer<TMilli> as Timer0;
    uses command void startPeriodic( uint32_t dt );
    provides event void fired( );
}
implementation {
    components BlinkC, InitialConstantsC;
    
    BlinkC.Boot   = Boot;
    BlinkC.Leds   = Leds;
    BlinkC.startPeriodic = startPeriodic;
    BlinkC.fired  = fired;
    BlinkC.get_initial_count -> InitialConstantsC;
}
