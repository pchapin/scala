// FILE   : SkeletonC.nc
// SUMMARY: The module that is specialized for each skeleton.
//

#include "KappaMsg.h"

module SkeletonC {
    uses command void change( struct commandTAG *new_value );

    // Sets the key in the encryption hardware. Only proceed when set_key_done( ) is called.
    uses command int set_key( const uint8_t aes_key[] );
    provides command void set_key_done( );

    // Encrypts a block of data (16 bytes). Only proceed when get_cipher( ) is called.
    uses command int put_plain( const uint8_t plain_text[] );
    provides command void get_cipher( const uint8_t cipher_text[] );

    provides command void receive( const uint8_t buffer[] );
}
implementation {
    uint8_t plain_buffer[16];
    uint8_t receive_buffer[10];
    int in_progress;

    command void receive( const uint8_t buffer[] )
    {
        int i;

        // Copy the message into the receive_buffer.
        for( i = 0; i < 10; ++i ) {
             receive_buffer[i] = buffer[i];
        }

        // If the key was set successfully we are off and running.        
        if( call set_key( key ) ) in_progress = 1;
        return;
    }


    command void set_key_done( )
    {
        int i;

        // Prepare the plain text.
        for( i = 0; i < 16; ++i ) {
             plain_buffer[i] = 0;
        }
        for( i = 0; i < 6; ++i ) {
             plain_buffer[i] = receive_buffer[i];
        }

        // If the plain text can't be installed, give up.
        if( !call put_plain( plain_buffer ) ) in_progress = 0;
    }
    

    command void get_cipher( const uint8_t cipher_text[] )
    {
        int i;
        int byte_counter = 0;
        struct commandTAG new_value;

        // Count the number of matching bytes.
        for( i = 0; i < 4; ++i ) {
            if( receive_buffer[6 + i] == cipher_text[i] ) byte_counter++;
        }

        // Check match.
        if( byte_counter == 4 ) {
            new_value.mote_id      = receive_buffer[0];
            new_value.command_name = receive_buffer[1];
            new_value.val          = ((uint16_t)receive_buffer[2] << 8) | receive_buffer[3];
            new_value.nonce        = receive_buffer[4];
        
            call change( &new_value );
        }
        in_progress = 0;
    }

}
