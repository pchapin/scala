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
        command uint16_t  compute_checksum  ( uint8_t data  [] , uint16_t _sc_data_SIZE   ) ;
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
        uint16_t i  ;
        uint16_t  checksum  ;
        for( i  = 0U ; i  < 1024 ; ++i  )
        {
        {
        {
            int _sc_1   = i ;
            if( _sc_1  >= 1024  )
                call boundsCheckFailed (  );
            raw [_sc_1 ] = ( i  & 0x00FF  );
        }
        }
<<<<<<< HEAD
        checksum  = call compute_checksum ( raw , 8  );
=======
        checksum  = call compute_checksum ( raw , 1024  );
>>>>>>> 43eba096c99c18d37534e4cabd38f490dba1886d
    }

}

