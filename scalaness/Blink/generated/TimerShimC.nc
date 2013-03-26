// FILE   : TimerShimC.nc
// SUMMARY: Shim component that connects BlinkC to the underlying Timer.
//
// This shim is necessary because the timer uses a generic interface which is currently not
// supported in Mininess. Is this an acceptable workaround or does Mininess need to support
// generic interfaces, at least in module specifications?

#include <Timer.h>

module TimerShimC {
    uses interface Timer<TMilli> as Timer0;
    provides command void startPeriodic( uint32_t dt );
    uses     command void fired( );
}
implementation {
    
    command void startPeriodic( uint32_t dt )
    {
        call Timer0.startPeriodic( dt );
    }
    
    event void Timer0.fired( )
    {
        call fired( );
    }
    
}
