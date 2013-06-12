
#include "KappaMsg.h"

// Configuration encapsulates application components that have imports.
configuration ApplicationIC {

    // High level...
    uses command void change( struct commandTAG *new_value );

    // Low level...
    uses command void set_key_done( );
    uses command void get_cipher( const uint8_t cipher_text[], uint16_t size );

}
implementation {
    components HarvesterC;

    HarvesterC.change = change;

    components CryptoShimC;
    CryptoShimC.set_key_done = set_key_done;
    CryptoShimC.get_cipher   = get_cipher;
}
