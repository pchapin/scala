#include "MessageType.h"
module RadioC  {
    provides {
        command error_t radio  ( struct MessageType  message   ) ;
    }
    uses {
        command void boundsCheckFailed  (  ) ;
    }
}
implementation {
    command error_t radio  ( struct MessageType  message   ) 
    {
        return SUCCESS ;
    }

}

