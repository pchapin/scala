// FILE   : SkeletonC.nc
// SUMMARY: The module that is specialized for each skeleton.
//

#include "KappaMsg.h"

module SkeletonC {
    uses command void change( struct commandTAG *new_value );
    provides command void receive( const uint8_t buffer[] );
}
implementation {

    command void receive( const uint8_t buffer[] )
    {
        struct commandTAG new_value;
        
        new_value.mote_id      = buffer[0];
        new_value.command_name = buffer[1];
        new_value.val          = ((uint16_t)buffer[2] << 8) | buffer[3];
        new_value.nonce        = buffer[4];
        
        call change( &new_value );
    }

}
