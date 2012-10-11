// FILE   : ServerC.nc
// SUMMARY: Server component.
//

#include "SendReceive.h"

module ServerC {
    uses interface Leds;
    uses interface Receive;
}
implementation {

    void setLeds( uint16_t val )
    {
        if( val & 0x01 )
            call Leds.led0On( );
        else 
            call Leds.led0Off( );
        if( val & 0x02 )
            call Leds.led1On( );
        else
            call Leds.led1Off( );
        if( val & 0x04 )
            call Leds.led2On( );
        else
            call Leds.led2Off( );
    }


    event message_t *Receive.receive( message_t *msg, void *payload, uint8_t len )
    {
        if( len == sizeof( BenchmarkMsg ) ) {
            BenchmarkMsg *btrpkt = ( BenchmarkMsg * )payload;
            setLeds( btrpkt->counter );
        }
        return msg;
    }

}

