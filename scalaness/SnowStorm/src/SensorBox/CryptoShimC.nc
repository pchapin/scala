
module CryptoShimC {

    // Sets the key in the encryption hardware. Only proceed when set_key_done( ) is called.
    provides command int set_key( const uint8_t aes_key[], uint16_t size );
    uses command void set_key_done( );

    // Encrypts a block of data (16 bytes). Only proceed when get_cipher( ) is called.
    provides command int put_plain( const uint8_t plain_text[], uint16_t size );
    uses command void get_cipher( const uint8_t cipher_text[], uint16_t size );

    // For Hardware AES.
    uses interface Encrypt;
    uses interface SplitControl as AESControl;
    uses interface Boot;
}
implementation {
    const uint8_t *given_key;
    const uint8_t *given_plain;
    uint8_t encrypted_text[16];

    command int set_key( const uint8_t aes_key[], uint16_t size )
    {
        // Return a failure indication if the key size is wrong.
        if( size != 16 ) return 0;
        given_key = aes_key;

        // Call the hardware operation. We succeed if it does.
        if( call Encrypt.setKey( (uint8_t *)aes_key ) == SUCCESS )
            return 1;
        else
            return 0;
    }

    event void Encrypt.setKeyDone( uint8_t *key )
    {
        // If something strange happened, we fail.
        // TODO: Tell the caller about this problem so it can cancel any in-progress flags.
        if( key != given_key ) return;
        call set_key_done( );
    }

    command int put_plain( const uint8_t plain_text[], uint16_t size )
    {
        // Return a failure indication if the key size is wrong.
        if( size != 16 ) return 0;
        given_plain = plain_text;

        if( call Encrypt.putPlain( (uint8_t *)plain_text, encrypted_text ) == FAIL ) {
            return 0;
        }
        return 1;
    }

    event void Encrypt.getCipher( uint8_t *plain, uint8_t *cipher )
    {
        if( plain != given_plain ) return;
        
        // If want to change key, we need to call clrKey first.
        call Encrypt.clrKey( (uint8_t *)given_key );
        
        // Is the pointer 'cipher' pointing at my encrypted_text array? I think so.
        call get_cipher( encrypted_text, 16 );
    }


    event void Boot.booted( )
    {
        call AESControl.start( );
    }


    event void AESControl.startDone( error_t err )
    {
        if( err != SUCCESS ) {
            call AESControl.start( );
        }
    }


    // Ignore this event.
    event void AESControl.stopDone( error_t err )
    {
    }
}
