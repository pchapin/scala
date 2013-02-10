// FILE   : ServerC.nc
// SUMMARY: Server component.
//

#include "SendReceive.h"

module ServerC {
    // uses interface Leds;
    uses command void led0On( );
    uses command void led1On( );
    uses command void led2On( );
    uses command void led0Off( );
    uses command void led1Off( );
    uses command void led2Off( );

    // uses interface Receive;
    provides command message_t *receive( message_t *msg, void *payload, uint8_t len );
}
implementation {

    void setLeds( uint16_t val )
    {
        if( val & 0x01U )
            call led0On( );
        else 
            call led0Off( );
        if( val & 0x02U )
            call led1On( );
        else
            call led1Off( );
        if( val & 0x04U )
            call led2On( );
        else
            call led2Off( );
    }


    command message_t *receive( message_t *msg, void *payload, uint8_t len )
    {
        if( len == sizeof( struct BenchmarkMsg ) ) {
            struct BenchmarkMsg *btrpkt = ( struct BenchmarkMsg * )payload;
            setLeds( btrpkt->counter );
        }
        return msg;
    }

}
