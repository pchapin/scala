// FILE   : StubC.nc
// SUMMARY: The module that is specialized for each stub.
//

#include "KappaMsg.h"

module StubC {
    provides command void change_neighbor( struct commandTAG *new_value );
    uses command void send( const uint8_t buffer[] );
}
implementation {
    uint8_t buffer[6];

    command void change_neighbor( struct commandTAG *new_value )
    {
        buffer[0] = new_value->mote_id;
        buffer[1] = new_value->command_name;
        buffer[2] = (uint8_t)( (new_value->val & 0xFF00U) >> 8 );
        buffer[3] = (uint8_t)( (new_value->val & 0x00FFU) >> 0 );
        buffer[4] = new_value->nonce;
        
        // memcpy( buffer, new_value, 6 );
        
        call send( buffer );
        return;
    }

}
