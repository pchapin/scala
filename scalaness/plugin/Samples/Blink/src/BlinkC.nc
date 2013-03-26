// FILE   : BlinkC.nc
// SUMMARY: Staged "Blink" main module.
//
// The first stage program computes the flash count, the blink period (in ms), and an optimal
// type to hold the flash count. The purpose of this program is to demonstrate the Scalaness
// system using a very basic (but still real) example.

module BlinkC {
    uses interface Boot;
    uses interface Leds;

    uses     command void startPeriodic( int32_t dt );
    provides command void fired( );
    uses     command flashCountType get_initial_count( );  // Silly, but shows module composition.
}
implementation {
    
    flashCountType flash_count;
    periodType     global_period = period;

    command void booted( )
    {
        flash_count = call get_initial_count( );
        call startPeriodic( global_period );
    }

    command void fired( )
    {
        if( flash_count > 0 ) {
            call Leds.led0Toggle( );
            --flash_count;
        }
    }
    
}

