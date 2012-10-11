// FILE   : ClientC.nc
// SUMMARY: Main program of the baseline benchmark client.
//

#include <Timer.h>
#include "SendReceive.h"

module ClientC {
    uses interface Boot;
    uses interface Timer<TMilli> as Timer0;
    uses interface Packet;
    uses interface AMSend;
    uses interface SplitControl as AMControl;
}
implementation {

    uint16_t counter;
    message_t pkt;
    bool busy = FALSE;

    event void Boot.booted( )
    {
        dbg( "Boot", "Node %d booted!\n", TOS_NODE_ID );
        call AMControl.start( );
    }


    event void AMControl.startDone( error_t err )
    {
        if ( err == SUCCESS ) {
            call Timer0.startPeriodic( TIMER_PERIOD_MILLI );
        }
        else {
            call AMControl.start( );
        }
    }


    event void Timer0.fired( )
    {
        BenchmarkMsg *btrpkt;

        dbg( "Timer", "Timer fired at t = %s\n", sim_time_string() );
        if ( !busy ) {
            counter++;
            btrpkt = ( BenchmarkMsg * )( call Packet.getPayload( &pkt, sizeof(BenchmarkMsg) ) );
            if( btrpkt == NULL ) {
                return;
            }
            btrpkt->nodeid  = TOS_NODE_ID;
            btrpkt->counter = counter;
            if(call AMSend.send( AM_BROADCAST_ADDR, &pkt, sizeof(BenchmarkMsg) ) == SUCCESS ) {
                busy = TRUE;
            }
        }
    }


    event void AMSend.sendDone( message_t *msg, error_t err )
    {
        if( &pkt == msg ) {
            busy = FALSE;
        }
    }


    // Ignore this event.
    event void AMControl.stopDone( error_t err ) {
    }

}
