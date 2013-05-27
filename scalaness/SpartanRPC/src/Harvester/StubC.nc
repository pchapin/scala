// FILE   : StubC.nc
// SUMMARY: The module that is specialized for each stub.
//

#include "KappaMsg.h"

module StubC {
    provides command void change_neighbor( struct commandTAG new_value );
}
implementation {
    int value = 0;

    command void change_neighbor( struct commandTAG new_value )
    {
        return;
    }

}
