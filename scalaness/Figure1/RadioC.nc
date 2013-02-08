
struct MessageType {
    addrT    src;
    addrT    dest;
    uint8_t  data;  // Should be an array.
};

module RadioC {
    provides command error_t radio( struct MessageType message );
}
implementation {
    command error_t radio( struct MessageType message )
    {
        // Do stuff.
        return SUCCESS;
    }
}
