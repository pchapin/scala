
module ReceiveShimC {
    uses interface Boot;
    uses interface SplitControl as AMControl;
    uses interface Receive;
    uses command void receive( const uint8_t buffer[], uint16_t size );
}
implementation {
    uint8_t buffer[6];
    
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


    event message_t *Receive.receive( message_t *msg, void *payload, uint8_t len )
    {
        if( len == 6 ) {
            uint8_t *message = ( uint8_t * )payload;
            memcpy( buffer, message, 6 );
            call receive( buffer, 6 );
        }
        return msg;
    }


    // Ignore this event.
    event void AMControl.stopDone( error_t err ) {
    }
}
