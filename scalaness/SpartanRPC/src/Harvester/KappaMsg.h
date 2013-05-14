/**
 * KappaMsg.h
 * 
 * This file contains macro and struct definitions that 
 * are common to all network actors, e.g. dissemination 
 * key, packet and command structure.
 * 
 * @author Charley Robinson, Christian Skalka
 */

#ifndef KAPPAMSG_H
#define KAPPAMSG_H

// DO NOT CHANGE.  Dissemination key for network control.
#define DIS_KEY 777
#define BCAST_DIS_KEY 333

// These are the different network control commands, communicated via 
// dissemination and collection.
enum {
  RESET_LOG = 1,    //reset the node internal backup logs 
  BACKLOG = 2,    //request data from node backup logs
  CHANGE_RATE = 3,  //change sampling rates
  CLEAR = 4,         //clear previous commands 
  IDENTIFY = 5,     //node identify self to base station
  NODE_BUSY = 6,     //node busy, can't response to request 
  COLLECTION = 7  //root has appeared, start collection protocol 
};

/* 
   Sensor/control modality channel identifiers
*/
enum CHANNELS 
  {SONAR_CHAN,   // 0 Sonar
   PAR_B_CHAN,   // 1 Brainbox PAR
   PAR_G_CHAN,   // 2 Grounbox PAR
   SOILM1_CHAN,  // 3 Soil Moisture 1
   SOILM2_CHAN,  // 4 Soil Moisture 2
   TEMP_CHAN,    // 5 Air Temperature
   VOLTAGE_CHAN, // 6 Battery Voltage
   EOS_CHAN,     // 7 End of epoch
   EOL_CHAN,     // 8 End of backlog
   COMM_CHAN } report_channels;


/* This is what you add to a record number in order to denote 
   a backlog message */
#define BLMASK 10000

// Here are special addrs					
enum {
  BCAST_ID = 33    // broadcast ID
};

// Remnants of ancient code, no idea what is purpose.
enum {
  KAPPA_MSG_ID = 0xAC, //Kappa data message ID
  NET_TIMESTAMP_ID = 0xBA, //Unixtime stamps disseminated by AM broadcasts
  INCOMING_TIME_CODE = 0x99, //sent from server to denote new timecode
  EPOCH_LENGTH = 0x40,
  EPOCH_CURRENT = 0x41,
  EPOCH_NEXT = 0x42,
  TIME_NOW = 0x44
};

// Network packet structure.
typedef nx_struct kappa {
  nx_uint16_t reading; //channel reading
  nx_uint8_t channel;  //channel identifier. make sure these are unique
  nx_uint8_t mote_id;  //mote identifier. also a good to be unique
  // nx_uint32_t unixtime;//unixtime when packet was generated
  nx_uint16_t record;// per-epoch record number
  // nx_int16_t record;// per-epoch record number
} kappamsg_t;

typedef nx_struct nettime {
  nx_uint32_t timestamp;
  nx_uint16_t updateID;
} netstamp_t;

// The structure of network commands
typedef struct commandTAG {
  uint8_t mote_id;    //the command destination node
  uint8_t command_name; //name of the command
  uint16_t val; //command parameter
  uint8_t nonce; // nonce to ensure *re*issued commands are updates
} command_t;

#endif

