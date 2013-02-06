
#include <Timer.h>

// Configuration to encapsulate a single timer instance.
configuration SpecificTimerC {
    
    // nesT version of the Timer interface.
    provides command void startPeriodic( uint32_t period );
    uses command void fired( );
}
implementation {
    components TimerShimC, new TimerMilliC() as MyTimer;

    startPeriodic     = TimerShimC.startPeriodic;
    TimerShimC.fired  = fired;
    TimerShimC.Timer -> MyTimer;
}
