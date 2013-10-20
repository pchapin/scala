struct MessageType  {
    uint8_t  src  ;
    uint8_t  dest  ;
    uint8_t data  [64 ] ;
} ;
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

