
#include "KappaMsg.h"

// Configuration encapsulates application components that have imports.
// This includes both imports to the high level nesC code and to low level libraries.
configuration ApplicationIC {

    // High level...
    uses command void set( const struct commandTAG *new_value );
    uses command const struct commandTAG *get( );

    // Low level...
    uses command void receive( const uint8_t buffer[], uint16_t size );
    uses command void set_key_done( );
    uses command void get_cipher( const uint8_t cipher_text[], uint16_t size );

}
implementation {
    components SensorBoxC;
    SensorBoxC.set = set;
    SensorBoxC.get = get;
    
    components MainC;
    components ReceiveShimC, ActiveMessageC, new AMReceiverC( 10 );
    ReceiveShimC.receive = receive;
    ReceiveShimC.Boot -> MainC;
    ReceiveShimC.AMControl -> ActiveMessageC;
    ReceiveShimC.Receive -> AMReceiverC;

    components CryptoShimC;
    CryptoShimC.set_key_done = set_key_done;
    CryptoShimC.get_cipher   = get_cipher;
}
