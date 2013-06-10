
// Configuration encapsulates application components that have exports.
// This includes both exports from the high level nesC code and from low level libraries.
configuration ApplicationEC {
    // High level...
    provides command void changed( );
    
    // Low level...
    provides command void send( const uint8_t buffer[], uint16_t size );
}
implementation {
    components HarvesterC;
    changed = HarvesterC.changed;
    
    components MainC;
    components SendShimC, ActiveMessageC, new AMSenderC( 10 );
    send = SendShimC.send;
    SendShimC.Boot -> MainC;
    SendShimC.AMControl -> ActiveMessageC;
    SendShimC.Packet -> AMSenderC;
    SendShimC.AMSend -> AMSenderC;
}
