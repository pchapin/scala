
module SendShimC {
    provides command void send( const uint8_t buffer[], uint16_t size );
    uses interface SplitControl as AMControl;
    uses interface Packet;
    uses interface AMSend;
}
implementation {
    message_t pkt;
    bool busy = FALSE;

    
    command void send( const uint8_t buffer[], uint8_t size )
    {
        uint8_t *packet;
        
        if ( !busy ) {
            packet = call Packet.getPayload( &pkt, size );
            if( packet == NULL ) {
                return;
            }
            memcpy( packet, buffer, size );
            if(call AMSend.send( AM_BROADCAST_ADDR, &pkt, size ) == SUCCESS ) {
                busy = TRUE;
            }
        }
    }

    
    event void Boot.booted( )
    {
        call AMControl.start( );
    }


    event void AMControl.startDone( error_t err )
    {
        if ( err != SUCCESS ) {
            call AMControl.start( );
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
