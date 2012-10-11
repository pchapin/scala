
struct messageT {
    addrT    src;
    addrT    dest;
    uint8_t  data;  // Should be an array.
};

module SendC {
    uses command error_t radio( struct messageT message );
    provides command error_t send( addrT s, addrT d, uint8_t data );
}
implementation {
    command error_t send( addrT s, addrT d, uint8_t data )
    {
        // Initializer lists are not yet handled properly by the type checker.
        struct messageT message /* = { s, d, data } */;
        message.src  = s;
        message.dest = d;
        message.data = data;
        return call radio( message );
    }
}
