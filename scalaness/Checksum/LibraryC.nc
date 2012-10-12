
#include <Timer.h>

// Library configuration encapsulates arbitrary nesC components.
configuration LibraryC {
    // nesT version of the Boot interface.
    uses command void booted( );
    
    // nesT version of the Timer interface.
    provides command void startPeriodic( uint32_t period );
    uses command void fired( );
}
implementation {
    components MainC, BootShimC, TimerShimC, new TimerMilliC() as MyTimer;

    BootShimC.booted  = booted;  // The booted command called when the node starts.
    BootShimC.Boot   -> MainC;

    startPeriodic     = TimerShimC.startPeriodic;
    TimerShimC.fired  = fired;
    TimerShimC.Timer -> MyTimer;
}
