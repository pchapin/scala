#include "KappaMsg.h"
module SkeletonC  {
    provides {
        command void receive  ( const uint8_t buffer  [] , uint16_t _sc_buffer_SIZE   ) ;
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
    uses {
        command void change  ( struct commandTAG  * new_value   ) ;
    }
    uses {
        command void boundsCheckFailed  (  ) ;
    }
}
implementation {
    uint8_t key  [16 ]  = { 95 , 103 , 195 , 78 , 10 , 28 , 130 , 181 , 250 , 97 , 242 , 252 , 255 , 210 , 73 , 83  };
    uint8_t plain_buffer  [16 ] ;
    uint8_t receive_buffer  [10 ] ;
    int in_progress  ;
    command void receive  ( const uint8_t buffer  [] , uint16_t _sc_buffer_SIZE   ) 
    {
        int i  ;
        for( i  = 0 ; i  < 10 ; ++i  )
        {
        {
            int _sc_1   = i ;
            if( _sc_1  >= 10  )
                call boundsCheckFailed (  );
        {
            int _sc_2   = i ;
            if( _sc_2  >= _sc_buffer_SIZE  )
                call boundsCheckFailed (  );
            receive_buffer [_sc_1 ] = buffer [_sc_2 ];
        }
        }
        }
        if( call set_key ( key , 16  ) )
            in_progress  = 1 ;
        return ;
    }

    command void set_key_done  (  ) 
    {
        int i  ;
        for( i  = 0 ; i  < 16 ; ++i  )
        {
        {
            int _sc_3   = i ;
            if( _sc_3  >= 16  )
                call boundsCheckFailed (  );
            plain_buffer [_sc_3 ] = 0 ;
        }
        }
        for( i  = 0 ; i  < 6 ; ++i  )
        {
        {
            int _sc_4   = i ;
            if( _sc_4  >= 16  )
                call boundsCheckFailed (  );
        {
            int _sc_5   = i ;
            if( _sc_5  >= 10  )
                call boundsCheckFailed (  );
            plain_buffer [_sc_4 ] = receive_buffer [_sc_5 ];
        }
        }
        }
        if( !call put_plain ( plain_buffer , 16  ) )
            in_progress  = 0 ;
    }

    command void get_cipher  ( const uint8_t cipher_text  [] , uint16_t _sc_cipher_text_SIZE   ) 
    {
        int i  ;
        int byte_counter   = 0 ;
        struct commandTAG  new_value  ;
        for( i  = 0 ; i  < 4 ; ++i  )
        {
        {
            int _sc_6   = ( 6  + i  );
            if( _sc_6  >= 10  )
                call boundsCheckFailed (  );
        {
            int _sc_7   = i ;
            if( _sc_7  >= _sc_cipher_text_SIZE  )
                call boundsCheckFailed (  );
            if( receive_buffer [_sc_6 ] == cipher_text [_sc_7 ] )
                byte_counter ++;
        }
        }
        }
        if( byte_counter  == 4  )
        {
        {
            int _sc_8   = 0 ;
            if( _sc_8  >= 10  )
                call boundsCheckFailed (  );
            new_value .mote_id  = receive_buffer [_sc_8 ];
        }
        {
            int _sc_9   = 1 ;
            if( _sc_9  >= 10  )
                call boundsCheckFailed (  );
            new_value .command_name  = receive_buffer [_sc_9 ];
        }
        {
            int _sc_10   = 2 ;
            if( _sc_10  >= 10  )
                call boundsCheckFailed (  );
        {
            int _sc_11   = 3 ;
            if( _sc_11  >= 10  )
                call boundsCheckFailed (  );
            new_value .val  = ( ( (uint16_t )( receive_buffer [_sc_10 ] ) << 8  ) | receive_buffer [_sc_11 ] );
        }
        }
        {
            int _sc_12   = 4 ;
            if( _sc_12  >= 10  )
                call boundsCheckFailed (  );
            new_value .nonce  = receive_buffer [_sc_12 ];
        }
            call change ( ( &new_value  ) );
        }
        in_progress  = 0 ;
    }

}

