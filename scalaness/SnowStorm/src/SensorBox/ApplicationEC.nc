
// Configuration encapsulates application components that have exports.
// This includes both exports from the high level nesC code and from low level libraries.
configuration ApplicationEC {
    // High level...
    provides command void changed( );
    
    // Low level...
    provides command void send( const uint8_t buffer[], uint16_t size );
    provides command int set_key( const uint8_t aes_key[], uint16_t size );
    provides command int put_plain( const uint8_t plain_text[], uint16_t size );
}
implementation {
    components SensorBoxC;
    changed = SensorBoxC.changed;
    
    components MainC;
    components SendShimC, ActiveMessageC, new AMSenderC( 10 );
    send = SendShimC.send;
    SendShimC.Boot -> MainC;
    SendShimC.AMControl -> ActiveMessageC;
    SendShimC.Packet -> AMSenderC;
    SendShimC.AMSend -> AMSenderC;

    components CryptoShimC, AesC;
    set_key   = CryptoShimC.set_key;
    put_plain = CryptoShimC.put_plain;
    CryptoShimC.Boot -> MainC;
    CryptoShimC.AESControl -> AesC;
    CryptoShimC.Encrypt -> AesC;
}
