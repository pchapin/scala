
module CryptoShimC {

    // Sets the key in the encryption hardware. Only proceed when set_key_done( ) is called.
    provides command int set_key( const uint8_t aes_key[], uint16_t size );
    uses command void set_key_done( );

    // Encrypts a block of data (16 bytes). Only proceed when get_cipher( ) is called.
    provides command int put_plain( const uint8_t plain_text[], uint16_t size );
    uses command void get_cipher( const uint8_t cipher_text[], uint16_t size );

    // For Hardware AES.
    uses interface Encrypt;
}
implementation {

    // TODO: Finish me!

}
