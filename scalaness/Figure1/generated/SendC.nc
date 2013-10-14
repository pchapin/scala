#include "MessageType.h"
module SendC  {
    provides {
        command error_t send  ( uint16_t  s  , uint16_t  d  , uint8_t data  [] , uint16_t _sc_data_SIZE   ) ;
    }
    uses {
        command error_t radio  ( struct MessageType  message   ) ;
    }
    uses {
        command void boundsCheckFailed  (  ) ;
    }
}
implementation {
    command error_t send  ( uint16_t  s  , uint16_t  d  , uint8_t data  [] , uint16_t _sc_data_SIZE   ) 
    {
        int i  ;
        struct MessageType  message  ;
        message .src  = s ;
        message .dest  = d ;
        for( i  = 0 ; i  < 64 ; ++i  )
        {
        {
            int _sc_1   = i ;
            if( _sc_1  >= 64  )
                call boundsCheckFailed (  );
        {
            int _sc_2   = i ;
            if( _sc_2  >= _sc_data_SIZE  )
                call boundsCheckFailed (  );
            message .data [_sc_1 ] = data [_sc_2 ];
        }
        }
        }
        return call radio ( message  );
    }

}

