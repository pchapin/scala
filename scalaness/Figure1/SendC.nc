
#include "MessageType.h"

module SendC {
    uses command error_t radio( struct MessageType message );
    provides command error_t send( addrT s, addrT d, uint8_t data[] );
}
implementation {
    command error_t send( addrT s, addrT d, uint8_t data[64] )
    {
        int i;
        struct MessageType message;
        message.src  = s;
        message.dest = d;
        for( i = 0; i < 64; ++i ) {
            message.dest[i] = data[i];
        }
        return call radio( message );
    }
}
