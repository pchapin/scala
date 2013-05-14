
#define NEW_PRINTF_SEMANTICS

#include "printf.h"
#include "Timer.h"
#include "UserButton.h"
#include "KappaMsg.h"
#include "HarvesterConfig.h"

module HarvesterC {
  uses {
    interface Boot;
    interface Receive as DataReceive;
    interface SplitControl as RadioControl;
    interface DisseminationUpdate<command_t> as Command;
    interface DisseminationUpdate<command_t> as Bcast;
    interface StdControl as DisseminationControl;
    interface Leds;
    interface Get<button_state_t> as ButtonPoll;
    interface Notify<button_state_t> as ButtonEvent;
    interface Timer<TMilli> as Stopwatch;
    interface Timer<TMilli> as Pulse;
    interface Timer<TMilli> as NonceTimer;
    interface RootControl;
    interface StdControl as CollectionControl;
    interface CtpInfo;
  }
} implementation {
  kappamsg_t data;
  command_t comm, bcast;
  message_t message;
  bool harvesting;
  bool silence;
  bool complete_harvest;
  int mode;
  int nonce = 1;
  int harvest_target;
  queue_t netids;

  task void request_backlog();
  task void harvest_invocation();
  task void harvest_next();
  task void clear_command();
  task void clear_bcast();
  task void print_data();
  task void print_termsig();

  // START QUEUE LIB FUNCTIONS
  void init(queue_t* q)
  {
    q->size = 0;
    q->front = 0;
    q->back = 0;
  }
  
  bool is_full(queue_t* q)
  {
    return (q->size >= MAX_Q_SIZE);
  }
  
  bool is_empty(queue_t* q)
  {
    return (q->size == 0);
  }
  
  void enqueue(int v, queue_t* q)
  {
    if (is_full(q)) return;
    
    q->elements[q->back] = v;
    
    q->size++;
    q->back = (q->back + 1) % MAX_Q_SIZE;
  }
  
  int dequeue(queue_t* q)
  {
    int v;

    if (is_empty(q)) return 0;
    
    v = q->elements[q->front];
    
    q->size--;
    q->front = (q->front + 1) % MAX_Q_SIZE;
    
    return v;
  }

  bool enqueued(int v, queue_t* q)
  {
    int i;

    for (i = 0; i < q->size; i++)
      {
	if (v == q->elements[(i + q->front) % MAX_Q_SIZE]) return TRUE;
      }
    return FALSE;
  }
  // END QUEUE LIB FUNCTIONS

  int elapsedtime()
  {
    return ((call Stopwatch.getNow()) - (call Stopwatch.gett0()));
  }
  
  int make_nonce()
  {
    return (call NonceTimer.getNow() % 256);
  }

  void send_bcast(int c, int v)
  {
    bcast.command_name = c;
    bcast.val = v;
    bcast.mote_id = BCAST_ID;
    bcast.nonce = make_nonce();
    call Bcast.change(&bcast);
  }

  void send_comm(int n, int c, int v)
  {
    comm.command_name = c;
    comm.val = v;
    comm.mote_id = n;
    comm.nonce = make_nonce();
    call Command.change(&comm);
  }

  bool backlog_data(kappamsg_t msg)
  {
    return (msg.record >= BLMASK || msg.channel == EOL_CHAN); 
  }
  
  event void Boot.booted() {
    
    mode = START_MODE;
    harvesting = FALSE;
  
    call RadioControl.start();    
    call ButtonEvent.enable();
    call Pulse.startPeriodic(PROMPT_INTERVAL);
    call NonceTimer.startPeriodic(NONCE_INTERVAL);
  }

  event void RadioControl.startDone(error_t error) 
  {
    call DisseminationControl.start();
    call CollectionControl.start();
    call RootControl.setRoot();
    call CtpInfo.triggerImmediateRouteUpdate();
  }

  event void RadioControl.stopDone(error_t error) { }

  event void NonceTimer.fired() { }

  event void Pulse.fired()
  {
    if (mode == START_MODE)
      {
	call Leds.led1Toggle();
	return;
      }
    if (mode == HARVEST_MODE)
      {
	if (harvesting && silence) 
	  {
	    harvesting = FALSE;
	    complete_harvest = FALSE;
	    post harvest_next();
	    return;
	  }
	if (!harvesting && !is_empty(&netids))
	  {
	    call Leds.led2On();
	    post harvest_next();
	    return;
	  }
	call Pulse.startOneShot(RESPONSE_WAIT);
      }
  }

  event void Stopwatch.fired() 
  { 
    call Stopwatch.startOneShot(ETERNITY); 
  }

  event void ButtonEvent.notify(button_state_t state)
  {
    int etime;
    int i;

    if (state == BUTTON_PRESSED)
      {
	if (call Stopwatch.isRunning()) call Stopwatch.stop();
	call Stopwatch.startOneShot(ETERNITY);
      }
    if (state == BUTTON_RELEASED)
      {
	etime = elapsedtime();
	call Stopwatch.stop();
	
	switch (mode) 
	  {
	  case START_MODE: 
	    call Pulse.stop();
	    call Leds.led1Off();
	    
	    if (etime < LONGHOLD)
	      {
		mode = HARVEST_MODE;
		init(&netids);
		for (i = 0; i < NUMNODES; i++)
		  {
		    enqueue(NODEIDS[i], &netids);
		  }
		post harvest_invocation();
		call Leds.led0On();
	      }
	    else
	      {
		mode = SHUTDOWN_MODE;
		call Leds.led1On();
		call Leds.led2On();
	      }
	    break;
	    
	  case HARVEST_MODE:		
	    if (etime < LONGHOLD)
	      {
		return;
	      }
	    else
	      {
		call Leds.led1On();
		call Pulse.startOneShot(RESPONSE_WAIT);
	      }
	    break;
	    
	  case SHUTDOWN_MODE:	
	    if (etime < LONGHOLD)
	      {
		post clear_command();
		post clear_bcast();
		call RootControl.unsetRoot();		
	      }
	    else 
	      {		
		post clear_command();
		post clear_bcast();
		call RootControl.unsetRoot();
		post print_termsig();
		call Leds.led1Off();
	      }
	    break;
	  }
      }
  }
  
  event message_t* DataReceive.receive(message_t *msg, 
				       void *payload, 
				       uint8_t len) 
  {  
    memcpy(&data, payload, sizeof(kappamsg_t));
     
    if (FORWARDER) post print_data();
    
    if (harvesting && silence && backlog_data(data)) silence = FALSE;

    if (data.channel == COMM_CHAN)
      {
	if (data.reading == IDENTIFY)
	  {
	    enqueue(data.mote_id, &netids);
	    if (!harvesting) 
	      {
		post harvest_next();
	      }
	  }
	if (data.reading == NODE_BUSY)
	  {
	    harvesting = FALSE;
	    if (!enqueued(data.mote_id, &netids)) 
	      {
		enqueue(data.mote_id, &netids);
	      }
	    post harvest_next();
	  }
      }
  
    if (data.channel == EOL_CHAN)
      {
	harvesting = FALSE;
	call Leds.led2Off();
	post harvest_next();
      }
    
    return msg;
  }
    
  task void harvest_next()
  {    
    if (call Pulse.isRunning()) call Pulse.stop();

    if (is_empty(&netids))
      {
	call Leds.led0Off();
	call Leds.led1Off();
	call Leds.led2Off();
	if (complete_harvest) call Leds.led1On();
	else call Leds.led0On();
	return;
      }

    call Pulse.startOneShot(RESPONSE_WAIT);
    call Leds.led2On();
    harvest_target = dequeue(&netids);
    harvesting = TRUE;
    silence = TRUE;
    post request_backlog();
  }

  task void request_backlog() 
  {
    send_comm(harvest_target, BACKLOG, BACKLOG_START);
  } 

  task void harvest_invocation()
  {
    complete_harvest = TRUE;
    send_bcast(COLLECTION, 0);
  }
  
  task void clear_command()
  {
    send_comm(BCAST_ID, CLEAR, 0);
  } 
  
  task void clear_bcast()
  {
    send_bcast(CLEAR, 0);
  } 
  
  task void print_data() 
  {   
    printf("%cm%01dc%01dd%04dr%05d%c\n",
	   (char)PAYLOAD_START,
	   data.mote_id, 
	   data.channel, 
	   data.reading,
	   data.record,
	   (char)PAYLOAD_END);
    
    printfflush();
  }
  
  task void print_termsig() 
  {   
    printf("%cXX%c\n", (char)PAYLOAD_START, (char)PAYLOAD_END);    
    printfflush();
  }
}
