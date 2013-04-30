module ChecksumC  {
    provides {
        command uint8_t  compute_checksum  ( uint8_t data  [] , uint16_t _sc_data_SIZE   ) ;
    }
    uses {
        command void boundsCheckFailed  (  ) ;
    }
}
implementation {
    command uint8_t compute_checksum  ( uint8_t data  [] , uint16_t _sc_data_SIZE   ) 
    {
        uint8_t  sum   = 0 ;
        int16_t i  ;
        for( i  = 0 ; i  < (int16_t )( 8  ); ++i  )
        {
            int _sc_2   = i ;
            if( _sc_2  >= _sc_data_SIZE  )
                call boundsCheckFailed (  );
            sum  += data [_sc_2 ];
        }
        return sum ;
    }

}

