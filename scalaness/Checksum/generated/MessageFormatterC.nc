module MessageFormatterC  {
    provides {
        command void fired  (  ) ;
    }
    provides {
        command void booted  (  ) ;
    }
    uses {
        command void startPeriodic  ( uint32_t period   ) ;
    }
    uses {
        command uint16_t  compute_checksum  ( uint8_t data  [] , uint16_t _sc__data_SIZE   ) ;
    }
    uses {
        command void boundsCheckFailed  (  ) ;
    }
}
implementation {
    command void booted  (  ) 
    {
        call startPeriodic ( (uint32_t )( 1000  ) );
    }

    command void fired  (  ) 
    {
        uint8_t raw  [1024 ] ;
        int16_t i  ;
        uint16_t  checksum  ;
        for( i  = 0 ; i  < (int16_t )( 1024  ); ++i  )
        {
            int _sc__1   = i ;
            if( _sc__1  >= 1024  )
                call boundsCheckFailed (  );
            raw [_sc__1 ] = ( i  & 0x00FF  );
        }
        checksum  = call compute_checksum ( raw , 1024  );
    }

}

