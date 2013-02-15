module ChecksumC  {
    provides {
        command uint16_t  compute_checksum  ( uint8_t data  [] , uint16_t _sc__data_SIZE   ) ;
    }
    uses {
        command void boundsCheckFailed  (  ) ;
    }
}
implementation {
    command uint16_t compute_checksum  ( uint8_t data  [] , uint16_t _sc__data_SIZE   ) 
    {
        uint16_t  sum   = 0 ;
        int16_t i  ;
        for( i  = 0 ; i  < (int16_t )( 1024  ); ++i  )
        {
            int _sc__2   = i ;
            if( _sc__2  >= _sc__data_SIZE  )
                call boundsCheckFailed (  );
            sum  += data [_sc__2 ];
        }
        return sum ;
    }

}

