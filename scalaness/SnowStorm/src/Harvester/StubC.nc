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

        // This is the actual code that needs to be used.
        // buffer[4] = new_value->nonce;

        // Just for experimentation. Can we use the module value parameter as we should?
        buffer[4] = key[0];

        // This does not type check (which is correct. Cool!)
        // key[0] = 1000;
        
        // memcpy( buffer, new_value, 6 );
        
        call send( buffer );
        return;
    }

}
