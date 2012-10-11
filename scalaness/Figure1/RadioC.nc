
struct messageT {
    addrT    src;
    addrT    dest;
    uint8_t  data;  // Should be an array.
};

module RendC {
    provides command error_t radio( struct messageT message );
}
implementation {
    command error_t radio( struct messageT message )
    {
        // Do stuff.
        return SUCCESS;
    }
}
