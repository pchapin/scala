# 1 "Receive.nc"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Receive.nc"
# 53 "Receive.nc"
# 1 "/opt/tinyos-2.1.2/tos/types/TinyError.h" 1
# 51 "/opt/tinyos-2.1.2/tos/types/TinyError.h"
enum {
  SUCCESS = 0,
  FAIL = 1,
  ESIZE = 2,
  ECANCEL = 3,
  EOFF = 4,
  EBUSY = 5,
  EINVAL = 6,
  ERETRY = 7,
  ERESERVE = 8,
  EALREADY = 9,
  ENOMEM = 10,
  ENOACK = 11,
  ELAST = 11
};

typedef uint8_t error_t ;

error_t ecombine(error_t r1, error_t r2) @safe()




{
  return r1 == r2 ? r1 : FAIL;
}
# 54 "Receive.nc" 2
# 1 "/opt/tinyos-2.1.2/tos/types/message.h" 1



# 1 "/opt/tinyos-2.1.2/tos/platforms/telosb/mac/tkn154/platform_message.h" 1




# 1 "/opt/tinyos-2.1.2/tos/lib/serial/Serial.h" 1
# 81 "/opt/tinyos-2.1.2/tos/lib/serial/Serial.h"
# 1 "/opt/tinyos-2.1.2/tos/types/AM.h" 1





typedef nx_uint8_t nx_am_id_t;
typedef nx_uint8_t nx_am_group_t;
typedef nx_uint16_t nx_am_addr_t;

typedef uint8_t am_id_t;
typedef uint8_t am_group_t;
typedef uint16_t am_addr_t;

enum {
  AM_BROADCAST_ADDR = 0xffff,
};
# 26 "/opt/tinyos-2.1.2/tos/types/AM.h"
enum {
  TOS_AM_GROUP = 0x22,
  TOS_AM_ADDRESS = 1
};
# 82 "/opt/tinyos-2.1.2/tos/lib/serial/Serial.h" 2

typedef uint8_t uart_id_t;



enum {
  HDLC_FLAG_BYTE = 0x7e,
  HDLC_CTLESC_BYTE = 0x7d,
};



enum {
  TOS_SERIAL_ACTIVE_MESSAGE_ID = 0,
  TOS_SERIAL_CC1000_ID = 1,
  TOS_SERIAL_802_15_4_ID = 2,
  TOS_SERIAL_UNKNOWN_ID = 255,
};


enum {
  SERIAL_PROTO_ACK = 67,
  SERIAL_PROTO_PACKET_ACK = 68,
  SERIAL_PROTO_PACKET_NOACK = 69,
  SERIAL_PROTO_PACKET_UNKNOWN = 255
};

typedef struct radio_stats {
  uint8_t version;
  uint8_t flags;
  uint8_t reserved;
  uint8_t platform;
  uint16_t MTU;
  uint16_t radio_crc_fail;
  uint16_t radio_queue_drops;
  uint16_t serial_crc_fail;
  uint16_t serial_tx_fail;
  uint16_t serial_short_packets;
  uint16_t serial_proto_drops;
} radio_stats_t;

typedef nx_struct serial_header {
  nx_am_addr_t dest;
  nx_am_addr_t src;
  nx_uint8_t length;
  nx_am_group_t group;
  nx_am_id_t type;
} serial_header_t;

typedef nx_struct serial_packet {
  serial_header_t header;
  nx_uint8_t data[];
} serial_packet_t;

typedef nx_struct serial_metadata {
  nx_uint8_t ack;
} serial_metadata_t;
# 6 "/opt/tinyos-2.1.2/tos/platforms/telosb/mac/tkn154/platform_message.h" 2


# 1 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154_MAC.h" 1
# 38 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154_MAC.h"
# 1 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154.h" 1
# 43 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154.h"
typedef enum ieee154_status
{
  IEEE154_SUCCESS = 0x00,
  IEEE154_BEACON_LOSS = 0xE0,
  IEEE154_CHANNEL_ACCESS_FAILURE = 0xE1,
  IEEE154_COUNTER_ERROR = 0xDB,
  IEEE154_DENIED = 0xE2,
  IEEE154_DISABLE_TRX_FAILURE = 0xE3,
  IEEE154_FRAME_TOO_LONG = 0xE5,
  IEEE154_IMPROPER_KEY_TYPE = 0xDC,
  IEEE154_IMPROPER_SECURITY_LEVEL = 0xDD,
  IEEE154_INVALID_ADDRESS = 0xF5,
  IEEE154_INVALID_GTS = 0xE6,
  IEEE154_INVALID_HANDLE = 0xE7,
  IEEE154_INVALID_INDEX = 0xF9,
  IEEE154_INVALID_PARAMETER = 0xE8,
  IEEE154_LIMIT_REACHED = 0xFA,
  IEEE154_NO_ACK = 0xE9,
  IEEE154_NO_BEACON = 0xEA,
  IEEE154_NO_DATA = 0xEB,
  IEEE154_NO_SHORT_ADDRESS = 0xEC,
  IEEE154_ON_TIME_TOO_LONG = 0xF6,
  IEEE154_OUT_OF_CAP = 0xED,
  IEEE154_PAN_ID_CONFLICT = 0xEE,
  IEEE154_PAST_TIME = 0xF7,
  IEEE154_READ_ONLY = 0xFB,
  IEEE154_REALIGNMENT = 0xEF,
  IEEE154_SCAN_IN_PROGRESS = 0xFC,
  IEEE154_SECURITY_ERROR = 0xE4,
  IEEE154_SUPERFRAME_OVERLAP = 0xFD,
  IEEE154_TRACKING_OFF = 0xF8,
  IEEE154_TRANSACTION_EXPIRED = 0xF0,
  IEEE154_TRANSACTION_OVERFLOW = 0xF1,
  IEEE154_TX_ACTIVE = 0xF2,
  IEEE154_UNAVAILABLE_KEY = 0xF3,
  IEEE154_UNSUPPORTED_ATTRIBUTE = 0xF4,
  IEEE154_UNSUPPORTED_LEGACY = 0xDE,
  IEEE154_UNSUPPORTED_SECURITY = 0xDF,
  IEEE154_PURGED = 0xDA,
} ieee154_status_t;

typedef enum ieee154_association_status
{
  IEEE154_ASSOCIATION_SUCCESSFUL = 0x00,
  IEEE154_PAN_AT_CAPACITY = 0x01,
  IEEE154_ACCESS_DENIED = 0x02
} ieee154_association_status_t;

typedef enum ieee154_disassociation_reason
{
  IEEE154_COORDINATOR_WISHES_DEVICE_TO_LEAVE = 0x01,
  IEEE154_DEVICE_WISHES_TO_LEAVE = 0x02
} ieee154_disassociation_reason_t;

typedef union ieee154_address {


  uint16_t shortAddress;
  uint64_t extendedAddress;
} ieee154_address_t;

typedef struct ieee154_security {


  uint8_t SecurityLevel;
  uint8_t KeyIdMode;
  uint8_t KeySource[8];
  uint8_t KeyIndex;
} ieee154_security_t;

typedef nx_struct
{
  nxle_uint8_t AlternatePANCoordinator :1;
  nxle_uint8_t DeviceType :1;
  nxle_uint8_t PowerSource :1;
  nxle_uint8_t ReceiverOnWhenIdle :1;
  nxle_uint8_t Reserved :2;
  nxle_uint8_t SecurityCapability :1;
  nxle_uint8_t AllocateAddress :1;
} ieee154_CapabilityInformation_t;

typedef nx_struct
{
  nxle_uint8_t BeaconOrder :4;
  nxle_uint8_t SuperframeOrder :4;
  nxle_uint8_t FinalCAPSlot :4;
  nxle_uint8_t BatteryLifeExtension :1;
  nxle_uint8_t Reserved :1;
  nxle_uint8_t PANCoordinator :1;
  nxle_uint8_t AssociationPermit :1;
} ieee154_SuperframeSpec_t;

typedef struct ieee154_PANDescriptor {
  uint8_t CoordAddrMode;
  uint16_t CoordPANId;
  ieee154_address_t CoordAddress;
  uint8_t LogicalChannel;
  uint8_t ChannelPage;
  ieee154_SuperframeSpec_t SuperframeSpec;
  bool GTSPermit;
  uint8_t LinkQuality;
  uint32_t TimeStamp;
  ieee154_status_t SecurityFailure;
  uint8_t SecurityLevel;
  uint8_t KeyIdMode;
  uint64_t KeySource;
  uint8_t KeyIndex;
} ieee154_PANDescriptor_t;

enum {

  BEACON_ENABLED_PAN,
  NONBEACON_ENABLED_PAN,


  TX_OPTIONS_ACK = 0x01,
  TX_OPTIONS_GTS = 0x02,
  TX_OPTIONS_INDIRECT = 0x04,


  ADDR_MODE_NOT_PRESENT = 0x00,
  ADDR_MODE_RESERVED = 0x01,
  ADDR_MODE_SHORT_ADDRESS = 0x02,
  ADDR_MODE_EXTENDED_ADDRESS = 0x03,


  ENERGY_DETECTION_SCAN = 0x00,
  ACTIVE_SCAN = 0x01,
  PASSIVE_SCAN = 0x02,
  ORPHAN_SCAN = 0x03,


  FRAMETYPE_BEACON = 0x00,
  FRAMETYPE_DATA = 0x01,
  FRAMETYPE_ACK = 0x02,
  FRAMETYPE_CMD = 0x03,
};





typedef uint8_t ieee154_phyCurrentChannel_t;
typedef uint32_t ieee154_phyChannelsSupported_t;
typedef uint8_t ieee154_phyTransmitPower_t;
typedef uint8_t ieee154_phyCCAMode_t;
typedef uint8_t ieee154_phyCurrentPage_t;
typedef uint16_t ieee154_phyMaxFrameDuration_t;
typedef uint8_t ieee154_phySHRDuration_t;
typedef uint8_t ieee154_phySymbolsPerOctet_t;

typedef uint8_t ieee154_macAckWaitDuration_t;
typedef bool ieee154_macAssociatedPANCoord_t;
typedef bool ieee154_macAssociationPermit_t;
typedef bool ieee154_macAutoRequest_t;
typedef bool ieee154_macBattLifeExt_t;
typedef uint8_t ieee154_macBattLifeExtPeriods_t;
typedef uint8_t* ieee154_macBeaconPayload_t;
typedef uint8_t ieee154_macBeaconPayloadLength_t;
typedef uint8_t ieee154_macBeaconOrder_t;
typedef uint32_t ieee154_macBeaconTxTime_t;
typedef uint8_t ieee154_macBSN_t;
typedef uint64_t ieee154_macCoordExtendedAddress_t;
typedef uint16_t ieee154_macCoordShortAddress_t;
typedef uint8_t ieee154_macDSN_t;
typedef bool ieee154_macGTSPermit_t;
typedef uint8_t ieee154_macMaxBE_t;
typedef uint8_t ieee154_macMaxCSMABackoffs_t;
typedef uint32_t ieee154_macMaxFrameTotalWaitTime_t;
typedef uint8_t ieee154_macMaxFrameRetries_t;
typedef uint8_t ieee154_macMinBE_t;
typedef uint8_t ieee154_macMinLIFSPeriod_t;
typedef uint8_t ieee154_macMinSIFSPeriod_t;
typedef uint16_t ieee154_macPANId_t;
typedef bool ieee154_macPromiscuousMode_t;
typedef uint8_t ieee154_macResponseWaitTime_t;
typedef bool ieee154_macRxOnWhenIdle_t;
typedef bool ieee154_macSecurityEnabled_t;
typedef uint16_t ieee154_macShortAddress_t;
typedef uint8_t ieee154_macSuperframeOrder_t;
typedef uint16_t ieee154_macSyncSymbolOffset_t;
typedef bool ieee154_macTimestampSupported_t;
typedef uint16_t ieee154_macTransactionPersistenceTime_t;


typedef bool ieee154_macPanCoordinator_t;
# 315 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154.h"
enum {

  IEEE154_aMaxPHYPacketSize = 127,
};
# 39 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154_MAC.h" 2
# 1 "/opt/tinyos-2.1.2/tos/chips/cc2420_tkn154/TKN154_PHY.h" 1
# 40 "/opt/tinyos-2.1.2/tos/chips/cc2420_tkn154/TKN154_PHY.h"
# 1 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154_MAC.h" 1
# 41 "/opt/tinyos-2.1.2/tos/chips/cc2420_tkn154/TKN154_PHY.h" 2

enum {

  IEEE154_SUPPORTED_CHANNELS = 0x07FFF800,
  IEEE154_SYMBOLS_PER_OCTET = 2,
  IEEE154_TXPOWER_TOLERANCE = 0x80,
  IEEE154_SHR_DURATION = (5 * IEEE154_SYMBOLS_PER_OCTET),
  IEEE154_MAX_FRAME_DURATION = (IEEE154_SHR_DURATION + ((IEEE154_aMaxPHYPacketSize + 1) * IEEE154_SYMBOLS_PER_OCTET)),
  IEEE154_PREAMBLE_LENGTH = (4*IEEE154_SYMBOLS_PER_OCTET),
  IEEE154_SYNC_SYMBOL_OFFSET = (1 * IEEE154_SYMBOLS_PER_OCTET),
  IEEE154_MIN_LIFS_PERIOD = 40,
  IEEE154_MIN_SIFS_PERIOD = 12,
  IEEE154_ACK_WAIT_DURATION = (20 + 12 + IEEE154_SHR_DURATION + 6 * IEEE154_SYMBOLS_PER_OCTET),
  IEEE154_TIMESTAMP_SUPPORTED = TRUE,
};

# 1 "/opt/tinyos-2.1.2/tos/platforms/telosb/mac/tkn154/timer/Timer62500hz.h" 1



typedef struct { } T62500hz;
# 58 "/opt/tinyos-2.1.2/tos/chips/cc2420_tkn154/TKN154_PHY.h" 2
# 40 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154_MAC.h" 2
# 1 "/opt/tinyos-2.1.2/tos/platforms/telosb/mac/tkn154/TKN154_platform.h" 1
# 45 "/opt/tinyos-2.1.2/tos/platforms/telosb/mac/tkn154/TKN154_platform.h"
enum {


  IEEE154_RADIO_TX_DELAY = 400,



  IEEE154_RADIO_RX_DELAY = 400,




  BEACON_PAYLOAD_UPDATE_INTERVAL = 2500,
};
# 41 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154_MAC.h" 2





enum {

  IEEE154_phyCurrentChannel = 0x00,
  IEEE154_phyChannelsSupported = 0x01,
  IEEE154_phyTransmitPower = 0x02,
  IEEE154_phyCCAMode = 0x03,
  IEEE154_phyCurrentPage = 0x04,
  IEEE154_phyMaxFrameDuration = 0x05,
  IEEE154_phySHRDuration = 0x06,
  IEEE154_phySymbolsPerOctet = 0x07,


  IEEE154_macAckWaitDuration = 0x40,
  IEEE154_macAssociatedPANCoord = 0x56,
  IEEE154_macAssociationPermit = 0x41,
  IEEE154_macAutoRequest = 0x42,
  IEEE154_macBattLifeExt = 0x43,
  IEEE154_macBattLifeExtPeriods = 0x44,
  IEEE154_macBeaconPayload = 0x45,
  IEEE154_macBeaconPayloadLength = 0x46,
  IEEE154_macBeaconOrder = 0x47,
  IEEE154_macBeaconTxTime = 0x48,
  IEEE154_macBSN = 0x49,
  IEEE154_macCoordExtendedAddress = 0x4A,
  IEEE154_macCoordShortAddress = 0x4B,
  IEEE154_macDSN = 0x4C,
  IEEE154_macGTSPermit = 0x4D,
  IEEE154_macMaxBE = 0x57,
  IEEE154_macMaxCSMABackoffs = 0x4E,
  IEEE154_macMaxFrameTotalWaitTime = 0x58,
  IEEE154_macMaxFrameRetries = 0x59,
  IEEE154_macMinBE = 0x4F,
  IEEE154_macMinLIFSPeriod = 0xA0,
  IEEE154_macMinSIFSPeriod = 0xA1,
  IEEE154_macPANId = 0x50,
  IEEE154_macPromiscuousMode = 0x51,
  IEEE154_macResponseWaitTime = 0x5A,
  IEEE154_macRxOnWhenIdle = 0x52,
  IEEE154_macSecurityEnabled = 0x5D,
  IEEE154_macShortAddress = 0x53,
  IEEE154_macSuperframeOrder = 0x54,
  IEEE154_macSyncSymbolOffset = 0x5B,
  IEEE154_macTimestampSupported = 0x5C,
  IEEE154_macTransactionPersistenceTime = 0x55,


  IEEE154_macPanCoordinator = 0xF0,
};

enum {

  MHR_INDEX_FC1 = 0,
  MHR_INDEX_FC2 = 1,
  MHR_INDEX_SEQNO = 2,
  MHR_INDEX_ADDRESS = 3,
  MHR_MAX_LEN = 23,


  FC1_FRAMETYPE_BEACON = 0x00,
  FC1_FRAMETYPE_DATA = 0x01,
  FC1_FRAMETYPE_ACK = 0x02,
  FC1_FRAMETYPE_CMD = 0x03,
  FC1_FRAMETYPE_MASK = 0x07,

  FC1_SECURITY_ENABLED = 0x08,
  FC1_FRAME_PENDING = 0x10,
  FC1_ACK_REQUEST = 0x20,
  FC1_PAN_ID_COMPRESSION = 0x40,

  FC2_DEST_MODE_SHORT = 0x08,
  FC2_DEST_MODE_EXTENDED = 0x0c,
  FC2_DEST_MODE_MASK = 0x0c,
  FC2_DEST_MODE_OFFSET = 2,

  FC2_SRC_MODE_SHORT = 0x80,
  FC2_SRC_MODE_EXTENDED = 0xc0,
  FC2_SRC_MODE_MASK = 0xc0,
  FC2_SRC_MODE_OFFSET = 6,

  FC2_FRAME_VERSION_1 = 0x10,
  FC2_FRAME_VERSION_2 = 0x20,
  FC2_FRAME_VERSION_MASK = 0x30,
};
# 137 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154_MAC.h"
enum {





  RADIO_CLIENT_SCAN = unique("RadioRxTxP.resource"),
  RADIO_CLIENT_PIB = unique("RadioRxTxP.resource"),
  RADIO_CLIENT_PROMISCUOUSMODE = unique("RadioRxTxP.resource"),

  RADIO_CLIENT_BEACONTRANSMIT = unique("RadioRxTxP.resource"),
  RADIO_CLIENT_COORDBROADCAST = unique("RadioRxTxP.resource"),
  RADIO_CLIENT_COORDCAP = unique("RadioRxTxP.resource"),
  RADIO_CLIENT_COORDCFP = unique("RadioRxTxP.resource"),
  RADIO_CLIENT_COORD_INACTIVE_PERIOD = unique("RadioRxTxP.resource"),

  RADIO_CLIENT_BEACONSYNCHRONIZE = unique("RadioRxTxP.resource"),
  RADIO_CLIENT_DEVICECAP = unique("RadioRxTxP.resource"),
  RADIO_CLIENT_DEVICECFP = unique("RadioRxTxP.resource"),
  RADIO_CLIENT_DEVICE_INACTIVE_PERIOD = unique("RadioRxTxP.resource"),
};

enum {

  OUTGOING_SUPERFRAME,
  INCOMING_SUPERFRAME,
};
# 183 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154_MAC.h"
typedef struct {

  uint8_t length;
  uint8_t mhr[MHR_MAX_LEN];
# 198 "/opt/tinyos-2.1.2/tos/lib/mac/tkn154/TKN154_MAC.h"
    uint8_t network;



  uint8_t type;


} ieee154_header_t;

typedef nx_struct {
  nx_uint32_t timestamp;
  nx_int8_t rssi;
  nx_uint8_t linkQuality;
} ieee154_metadata_t;

typedef struct
{
  ieee154_header_t *header;
  uint8_t *payload;
  ieee154_metadata_t *metadata;
  uint8_t headerLen;
  uint8_t payloadLen;
  uint8_t client;
  uint8_t handle;
} ieee154_txframe_t;

typedef struct
{
  ieee154_header_t header;
  ieee154_metadata_t metadata;
} ieee154_txcontrol_t;

typedef struct ieee154_csma {
  uint8_t BE;
  uint8_t macMaxBE;
  uint8_t macMaxCsmaBackoffs;
  uint8_t NB;
} ieee154_csma_t;

typedef struct {
  uint32_t transactionTime;
  ieee154_txframe_t *frame;
  ieee154_csma_t csma;
} ieee154_cap_frame_backup_t;




enum {
  CMD_FRAME_ASSOCIATION_REQUEST = 1,
  CMD_FRAME_ASSOCIATION_RESPONSE = 2,
  CMD_FRAME_DISASSOCIATION_NOTIFICATION = 3,
  CMD_FRAME_DATA_REQUEST = 4,
  CMD_FRAME_PAN_ID_CONFLICT_NOTIFICATION = 5,
  CMD_FRAME_ORPHAN_NOTIFICATION = 6,
  CMD_FRAME_BEACON_REQUEST = 7,
  CMD_FRAME_COORDINATOR_REALIGNMENT = 8,
  CMD_FRAME_GTS_REQUEST = 9
};

enum {

  BEACON_INDEX_SF_SPEC1 = 0,
  BEACON_INDEX_SF_SPEC2 = 1,
  BEACON_INDEX_GTS_SPEC = 2,

  SF_SPEC1_BO_MASK = 0x0F,
  SF_SPEC1_BO_OFFSET = 0,
  SF_SPEC1_SO_MASK = 0xF0,
  SF_SPEC1_SO_OFFSET = 4,

  SF_SPEC2_FINAL_CAPSLOT_MASK = 0x0F,
  SF_SPEC2_FINAL_CAPSLOT_OFFSET = 0,
  SF_SPEC2_BATT_LIFE_EXT = 0x10,
  SF_SPEC2_PAN_COORD = 0x40,
  SF_SPEC2_ASSOCIATION_PERMIT = 0x80,

  GTS_DESCRIPTOR_COUNT_MASK = 0x07,
  GTS_DESCRIPTOR_COUNT_OFFSET = 0,
  GTS_LENGTH_MASK = 0xF0,
  GTS_LENGTH_OFFSET = 4,
  GTS_SPEC_PERMIT = 0x80,

  PENDING_ADDRESS_SHORT_MASK = 0x07,
  PENDING_ADDRESS_EXT_MASK = 0x70,
};

enum {

  IEEE154_aTurnaroundTime = 12,

  FRAMECTL_LENGTH_MASK = 0x7F,
  FRAMECTL_PROMISCUOUS = 0x80,
};


enum {

  IEEE154_aNumSuperframeSlots = 16,
  IEEE154_aMaxMPDUUnsecuredOverhead = 25,
  IEEE154_aMinMPDUOverhead = 9,
  IEEE154_aBaseSlotDuration = 60,
  IEEE154_aBaseSuperframeDuration = (IEEE154_aBaseSlotDuration * IEEE154_aNumSuperframeSlots),
  IEEE154_aGTSDescPersistenceTime = 4,
  IEEE154_aMaxBeaconOverhead = 75,
  IEEE154_aMaxBeaconPayloadLength = (IEEE154_aMaxPHYPacketSize - IEEE154_aMaxBeaconOverhead),
  IEEE154_aMaxLostBeacons = 4,
  IEEE154_aMaxMACSafePayloadSize = (IEEE154_aMaxPHYPacketSize - IEEE154_aMaxMPDUUnsecuredOverhead),
  IEEE154_aMaxMACPayloadSize = (IEEE154_aMaxPHYPacketSize - IEEE154_aMinMPDUOverhead),
  IEEE154_aMaxSIFSFrameSize = 18,
  IEEE154_aMinCAPLength = 440,
  IEEE154_aUnitBackoffPeriod = 20,
};


typedef bool token_requested_t __attribute__((combine(rcombine)));
token_requested_t rcombine(token_requested_t r1, token_requested_t r2)
{
  return r1 || r2;
}
# 9 "/opt/tinyos-2.1.2/tos/platforms/telosb/mac/tkn154/platform_message.h" 2
# 17 "/opt/tinyos-2.1.2/tos/platforms/telosb/mac/tkn154/platform_message.h"
typedef union message_header {
  ieee154_header_t ieee154;
  serial_header_t serial;
} message_header_t;

typedef union TOSRadioFooter {
} message_footer_t;

typedef union TOSRadioMetadata {
  ieee154_metadata_t ieee154;
} message_metadata_t;
# 5 "/opt/tinyos-2.1.2/tos/types/message.h" 2
# 14 "/opt/tinyos-2.1.2/tos/types/message.h"
typedef nx_struct message_t {
  nx_uint8_t header[sizeof(message_header_t)];
  nx_uint8_t data[118];
  nx_uint8_t footer[sizeof(message_footer_t)];
  nx_uint8_t metadata[sizeof(message_metadata_t)];
} message_t;
# 55 "Receive.nc" 2

interface Receive {
# 78 "Receive.nc"
  event message_t* receive(message_t* msg, void* payload, uint8_t len);

}
