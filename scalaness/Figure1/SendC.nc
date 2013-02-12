
#include "MessageType.h"

module SendC {
    uses command error_t radio( struct MessageType message );
    provides command error_t send( addrT s, addrT d, uint8_t data );
}
implementation {
    command error_t send( addrT s, addrT d, uint8_t data )
    {
        // Initializer lists are not yet handled properly by the type checker.
        struct MessageType message /* = { s, d, data } */;
        message.src  = s;
        message.dest = d;
        message.data = data;
        return call radio( message );
    }
}
