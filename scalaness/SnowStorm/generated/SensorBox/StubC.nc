#include "KappaMsg.h"
module StubC  {
    uses {
        command void send  ( const uint8_t buffer  [] , uint16_t _sc_buffer_SIZE   ) ;
    }
    provides {
        command void get_cipher  ( const uint8_t cipher_text  [] , uint16_t _sc_cipher_text_SIZE   ) ;
    }
    uses {
        command int put_plain  ( const uint8_t plain_text  [] , uint16_t _sc_plain_text_SIZE   ) ;
    }
    provides {
        command void set_key_done  (  ) ;
    }
    uses {
        command int set_key  ( const uint8_t aes_key  [] , uint16_t _sc_aes_key_SIZE   ) ;
    }
    provides {
        command void change_neighbor  ( struct commandTAG  * new_value   ) ;
    }
    uses {
        command void boundsCheckFailed  (  ) ;
    }
}
implementation {
    uint8_t key  [16 ]  = { 95 , 103 , 195 , 78 , 10 , 28 , 130 , 181 , 250 , 97 , 242 , 252 , 255 , 210 , 73 , 83  };
    uint8_t plain_buffer  [16 ] ;
    uint8_t send_buffer  [10 ] ;
    int in_progress   = 0 ;
    command void change_neighbor  ( struct commandTAG  * new_value   ) 
    {
        int i  ;
        if( in_progress  )
            return ;
        for( i  = 0 ; i  < 15 ; ++i  )
        {
        {
            int _sc_13   = i ;
            if( _sc_13  >= 16  )
                call boundsCheckFailed (  );
            plain_buffer [_sc_13 ] = 0 ;
        }
        }
    {
        int _sc_14   = 0 ;
        if( _sc_14  >= 16  )
            call boundsCheckFailed (  );
        plain_buffer [_sc_14 ] = new_value ->mote_id ;
    }
    {
        int _sc_15   = 1 ;
        if( _sc_15  >= 16  )
            call boundsCheckFailed (  );
        plain_buffer [_sc_15 ] = new_value ->command_name ;
    }
    {
        int _sc_16   = 2 ;
        if( _sc_16  >= 16  )
            call boundsCheckFailed (  );
        plain_buffer [_sc_16 ] = (uint8_t )( ( ( new_value ->val  & 0xFF00U  ) >> 8  ) );
    }
    {
        int _sc_17   = 3 ;
        if( _sc_17  >= 16  )
            call boundsCheckFailed (  );
        plain_buffer [_sc_17 ] = (uint8_t )( ( ( new_value ->val  & 0x00FFU  ) >> 0  ) );
    }
    {
        int _sc_18   = 4 ;
        if( _sc_18  >= 16  )
            call boundsCheckFailed (  );
        plain_buffer [_sc_18 ] = new_value ->nonce ;
    }
        if( call set_key ( key , 16  ) )
            in_progress  = 1 ;
        return ;
    }

    command void set_key_done  (  ) 
    {
        if( !call put_plain ( plain_buffer , 16  ) )
            in_progress  = 0 ;
    }

    command void get_cipher  ( const uint8_t cipher_text  [] , uint16_t _sc_cipher_text_SIZE   ) 
    {
        int i  ;
        for( i  = 0 ; i  < 6 ; ++i  )
        {
        {
            int _sc_19   = i ;
            if( _sc_19  >= 10  )
                call boundsCheckFailed (  );
        {
            int _sc_20   = i ;
            if( _sc_20  >= 16  )
                call boundsCheckFailed (  );
            send_buffer [_sc_19 ] = plain_buffer [_sc_20 ];
        }
        }
        }
        for( i  = 0 ; i  < 4 ; ++i  )
        {
        {
            int _sc_21   = ( 6  + i  );
            if( _sc_21  >= 10  )
                call boundsCheckFailed (  );
        {
            int _sc_22   = i ;
            if( _sc_22  >= _sc_cipher_text_SIZE  )
                call boundsCheckFailed (  );
            send_buffer [_sc_21 ] = cipher_text [_sc_22 ];
        }
        }
        }
        call send ( send_buffer , 10  );
        in_progress  = 0 ;
    }

}

