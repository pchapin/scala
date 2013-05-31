/** 
 * This version uses the collection tree protocol and can perform multihop.
 * Also, the radio is not being turned off to ensure Collection still works
 * with unscheduled data transmissions.
 * 
 * @author Chris Skalka
 */

#include "StorageVolumes.h"
#include "KappaMsg.h"

#define NEW_PRINTF_SEMANTICS

configuration BrainboxAppC {
} implementation {
  components AppC;                    // Merges Scalaness generated code.
  components PrintfC, SerialStartC;   // Required for new Printf semantics.

  components SensorBoxC as App, MainC;
  App.Boot -> MainC;

  components new ConfigStorageC(VOLUME_SNOWLOG_CONFIG);
  App.ConfigStorage -> ConfigStorageC.ConfigStorage;
  App.Mount -> ConfigStorageC.Mount;
  
  components new LogStorageC(VOLUME_SNOWLOG, TRUE);
  App.LogRead -> LogStorageC;
  App.LogWrite -> LogStorageC;

  components ActiveMessageC;
  App.RadioControl -> ActiveMessageC;

  components CollectionC;
  App.CollectionControl -> CollectionC;
  App.CtpInfo -> CollectionC;

  components new CollectionSenderC(KAPPA_MSG_ID);
  App.DataSend -> CollectionSenderC;
  App.DataPacket -> CollectionSenderC;

  components DisseminationC;
  App.DisseminationControl -> DisseminationC.StdControl;

  components new DisseminatorC(command_t, DIS_KEY) as SyncChan;
  App.Command -> SyncChan.DisseminationValue;

  // components new DisseminatorC(command_t, BCAST_DIS_KEY) as BcastChan;
  // App.Bcast -> BcastChan.DisseminationValue;

  components LedsC;
  App.Leds -> LedsC;

  components AdcChannel0C, new AdcReadClientC() as A0_Client;
  A0_Client.AdcConfigure -> AdcChannel0C;
  AdcChannel0C.Read -> A0_Client;

  components AdcChannel1C, new AdcReadClientC() as A1_Client;
  A1_Client.AdcConfigure -> AdcChannel1C;
  AdcChannel1C.Read -> A1_Client;

  /*
    Sensor wiring:
      battery voltage -> ADC0     refvolt 2.5
      sonar -> ADC1               refvolt 1.5  
      PAR -> UVMS1087 (ADC2, hacked Hamamatsu config)  refvolt 1.5
      temp -> SHT111
   */
  App.Sonar -> AdcChannel1C.ReadMe;
  App.Voltage -> AdcChannel0C.ReadMe;

  components new SensirionSht11C();
  App.Temp -> SensirionSht11C.Temperature;

  components new UVMS1087ParC() as LightClient;
  App.Par -> LightClient.Read;
  
  // Wire soil moisture channels to dummy ADC.
  components new HamamatsuS1087ParC();
  App.SoilM1 -> HamamatsuS1087ParC;
  App.SoilM2 -> HamamatsuS1087ParC;

  components HplMsp430GeneralIOC as Gio;
  App.Gio -> Gio.Port63; //adc3/pin10

  components new TimerMilliC();
  App.Timer -> TimerMilliC;

  components new TimerMilliC() as BPIC;
  App.BPITimer -> BPIC;

  components new TimerMilliC() as Stopwatch;
  App.Stopwatch -> Stopwatch;

  components UserButtonC;
  App.ButtonEvent -> UserButtonC.Notify;
}
