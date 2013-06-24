/**
 * @author Christian Skalka
 */

#ifndef HARVESTER_H
#define HARVESTER_H

#define INITIALIZING FALSE
#define FORWARDER TRUE
#define LOGGER TRUE

#define MAX_NUM_NODES 30

#define RESPONSE_WAIT 8000
#define PULSE_INTERVAL 250
#define PROMPT_INTERVAL 500
#define NONCE_INTERVAL 10
#define DUMP_INTERVAL 50
#define LONGHOLD 1000
#define ETERNITY 1000000

#define DBUF_SIZE 10
#define MAX_Q_SIZE MAX_NUM_NODES

// REMEMBER TO UPDATE THIS WHEN EDITING NODEIDS!!
#define NUMNODES 1
int NODEIDS[] = { 1 };
// int NODEIDS[] = { 4, 6 }; // Votey
// int NODEIDS[] = { 0, 2, 3 }; // HBEF
// int NODEIDS[] = { 0, 2, 3, 4 }; // Norway, Fauske

#define BACKLOG_START 0

#define PAYLOAD_START 2
#define PAYLOAD_END 3

enum HMODES 
  {HARVEST_MODE,
   SHUTDOWN_MODE,
   START_MODE } harvest_mode;

typedef struct aqueue 
{
  int elements[MAX_Q_SIZE];
  int size;
  int front;
  int back;
} queue_t;

#endif

