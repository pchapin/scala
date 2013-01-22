// FILE   : BlinkServerC.nc
// SUMMARY: The main module of the server side of the Blink demonstration program.
//

module BlinkServerC {
    provides command void setLeds( uint8_t value );
    uses interface Leds;
}
implementation {

    command void setLeds( uint8_t value ) {

        if( value & 0x01 )
            call Leds.led0On( );
        else 
            call Leds.led0Off( );
        if( value & 0x02 )
            call Leds.led1On( );
        else
            call Leds.led1Off( );
        if( value & 0x04 )
            call Leds.led2On( );
        else
            call Leds.led2Off( );
    }
  
}
