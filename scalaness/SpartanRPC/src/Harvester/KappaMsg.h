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

#ifndef __MININESS__

// These are the different network control commands, communicated via 
// dissemination and collection.
enum {
  RESET_LOG   = 1,  // Reset the node internal backup logs. 
  BACKLOG     = 2,  // Request data from node backup logs.
  CHANGE_RATE = 3,  // Change sampling rates.
  CLEAR       = 4,  // Clear previous commands. 
  IDENTIFY    = 5,  // Node identify self to base station.
  NODE_BUSY   = 6,  // Node busy, can't response to request. 
  COLLECTION  = 7   // Root has appeared, start collection protocol. 
};

/* 
   Sensor/control modality channel identifiers
*/
enum CHANNELS 
  { SONAR_CHAN,   // 0 Sonar
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
  BCAST_ID = 33    // Broadcast ID.
};

// Remnants of ancient code, no idea what is purpose.
enum {
  KAPPA_MSG_ID       = 0xAC,  // Kappa data message ID.
  NET_TIMESTAMP_ID   = 0xBA,  // Unixtime stamps disseminated by AM broadcasts.
  INCOMING_TIME_CODE = 0x99,  // Sent from server to denote new timecode.
  EPOCH_LENGTH       = 0x40,
  EPOCH_CURRENT      = 0x41,
  EPOCH_NEXT         = 0x42,
  TIME_NOW           = 0x44
};

// Network packet structure.
nx_struct kappa {
  nx_uint16_t reading;   // Channel reading.
  nx_uint8_t  channel;   // Channel identifier. make sure these are unique.
  nx_uint8_t  mote_id;   // Mote identifier. also a good to be unique.
  // nx_uint32_t unixtime;  // Unixtime when packet was generated.
  nx_uint16_t record;    // Per-epoch record number.
  // nx_int16_t  record;    // Per-epoch record number.
};

nx_struct nettime {
  nx_uint32_t timestamp;
  nx_uint16_t updateID;
};

#endif

// The structure of network commands
struct commandTAG {
  uint8_t  mote_id;      // The command destination node.
  uint8_t  command_name; // Name of the command.
  uint16_t val;          // Command parameter.
  uint8_t  nonce;        // Nonce to ensure reissued commands are updates.
};


#ifndef __MININESS__
typedef nx_struct kappa kappamsg_t;
typedef nx_struct nettime netstamp_t;
typedef struct commandTAG command_t;
#endif

#endif

