// FILE   : AppC.nc
// SUMMARY: Main configuration of the Scalaness SendReceive sample.
//

#include <Timer.h>
#include "SendReceive.h"

configuration AppC {
}
implementation {
  components MainC;
  components LedsC;
  components ClientC, ServerC;
  components ActiveMessageC;
  components new TimerMilliC( ) as Timer0;
  components new AMSenderC( AM_CHANNEL ), new AMReceiverC( AM_CHANNEL );

  ClientC.Boot      -> MainC;
  ClientC.Timer0    -> Timer0;
  ClientC.Packet    -> AMSenderC;
  ClientC.AMControl -> ActiveMessageC;
  ClientC.AMSend    -> AMSenderC;
  ServerC.Leds      -> LedsC;
  ServerC.Receive   -> AMReceiverC;
}
