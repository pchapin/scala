module NodeC  {
    provides {
        command error_t main  (  ) ;
    }
    uses {
        command error_t send  ( uint16_t  s  , uint16_t  d  , uint8_t data  [] , uint16_t _sc__data_SIZE   ) ;
    }
    uses {
        command void boundsCheckFailed  (  ) ;
    }
}
implementation {
    command error_t main  (  ) 
    {
        uint8_t my_data  [64 ] ;
        return call send ( (uint16_t )( 1  ), (uint16_t )( 2  ), my_data , 64  );
    }

}

