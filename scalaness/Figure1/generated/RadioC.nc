#include "./MessageType.h"
module RadioC  {
    provides {
        command error_t radio  ( struct MessageType  message   ) ;
    }
}
implementation {
    command error_t radio  ( struct MessageType  message   ) 
    {
        return SUCCESS ;
    }

}

