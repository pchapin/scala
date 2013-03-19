
module LEDMasterC {
    uses command void toggleLED( );
    provides command int setTogglePeriod( B period );
}
implementation {
    B current_period = 0;
    command int setTogglePeriod( B period )
    {
        current_period = period;
        call toggleLED( );
    }
}
