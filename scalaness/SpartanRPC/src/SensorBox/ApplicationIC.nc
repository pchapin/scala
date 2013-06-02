
#include "KappaMsg.h"

// Configuration encapsulates application components that have imports.
// This includes both imports to the high level nesC code and to low level libraries.
configuration ApplicationIC {

  uses command void set( const struct commandTAG *new_value );
  uses command const struct commandTAG *get( );
  uses command void receive( const uint8_t buffer[], uint16_t size );

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
}
