// FILE   : BlinkServerC.nc
// SUMMARY: The main module of the server side of the Blink demonstration program.
//

module BlinkServerC {
    provides command void setLeds( uint8_t value );
    uses command void led0On();
    uses command void led1On();
    uses command void led2On();
    uses command void led0Off();
    uses command void led1Off();
    uses command void led2Off();
}
implementation {

    command void setLeds( uint8_t value ) {

        if( value & 0x01U )
            call led0On( );
        else 
            call led0Off( );

        if( value & 0x02U )
            call led1On( );
        else
            call led1Off( );

        if( value & 0x04U )
            call led2On( );
        else
            call led2Off( );
    }
  
}
