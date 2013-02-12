
#ifndef MESSAGETYPE_H
#define MESSAGETYPE_H

struct MessageType {
    addrT    src;
    addrT    dest;
    uint8_t  data;  // Should be an array.
};

#endif
