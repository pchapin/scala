
// Shim to convert Boot interface into bare commands.
// Currently it is necessary to write these shims manually. The Scalaness compiler should do it.

#include <Timer.h>

module TimerShimC {
    uses interface Timer<TMilli> as Timer;
    provides command void startPeriodic( uint32_t period );
    uses command void fired( );
}
implementation {
    
    command void startPeriodic( uint32_t period )
    {
        call Timer.startPeriodic( period );
    }
    
    event void Timer.fired( )
    {
        call fired( );
    }
    
}
