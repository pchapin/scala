#define NEW_PRINTF_SEMANTICS

#include "KappaMsg.h"
#include "SensorConfig.h"
#include "StorageVolumes.h"
#include "Timer.h"
#include "UserButton.h"
#include "printf.h"

module SensorBoxC {
  uses {
    interface Boot;
    interface Timer<TMilli>;
    interface Timer<TMilli> as BPITimer;
    interface Timer<TMilli> as Stopwatch;
    interface SplitControl as RadioControl;
    interface StdControl as CollectionControl;
    interface CtpInfo;
    interface StdControl as DisseminationControl;
    interface Packet as DataPacket;
    interface Send as DataSend;
    interface DisseminationValue<command_t> as Command;
    interface DisseminationValue<command_t> as Bcast;
    interface Leds;
    interface Notify<button_state_t> as ButtonEvent;
    interface Read<uint16_t> as Temp;
    interface Read<uint16_t> as Par;
    interface Read<uint16_t> as Sonar;
    interface Read<uint16_t> as SoilM1;
    interface Read<uint16_t> as SoilM2;
    interface Read<uint16_t> as Voltage;
    interface HplMsp430GeneralIO as Gio;
    interface Mount;
    interface ConfigStorage;
    interface LogWrite; 
    interface LogRead;
  }
} implementation {
  
  kappamsg_t data, ctb;
  message_t message;
  uint16_t time;
  uint16_t epoch_interval;
  uint16_t sleeptime;
  uint16_t samples;
  uint16_t log_entries, reporting_logid;
  logentry_t logentry[MAXNUM_SENSORS];
  int readings[MAXNUM_SAMPLES];
  bool asleep, sampling;
  bool delay;
  bool reporting_backlog;
  bool backlog_requested;
  bool logging;
  bool pull_mode;
  bool statusled_on;
  bool normal_mode;
  int flag;
  uint16_t reporting_epochid;
  checkpoint_t checkpoints[NUM_CHECKPOINTS];
  checkpoint_t checkpoint_requested;
  command_t comm, bcast;
  int mode;

  // DON'T FORGET TO TOGGLE BRAINBOX APPROPRIATELY
  int num_sensors = NUM_BRAIN_SENSORS;
  sensor_array_t* sensor_array = BRAINBOX_ARRAY;

  // int num_sensors = NUM_GROUND_SENSORS;
  // sensor_array_t* sensor_array = GROUNDBOX_ARRAY;

  task void sampletemp();
  task void sampleparb();
  task void sampleparg();
  task void samplesonar();
  task void samplesoilm1();
  task void samplesoilm2();   
  task void samplevoltage();
  task void report();
  task void report_backlog();
  task void report_epoch();
  task void report_comm();
  
  void fail(error_t e) {
    call Leds.led2On();
  }

  int median(int a[], int n)
  {
    int t,i,j;

    for (i = 0; i < n; i++)
      {
	for (j = i + 1; j < n; j++)
	  {
	    if (a[i] > a[j])
	      {
		t = a[j];
		a[j] = a[i];
		a[i] = t;
	      }
	  }
      }
    if (n % 2 == 0) return (a[n/2] + a[n/2-1])/2;
    else return a[n/2];
  }


  void comm_to_base(int chan, int rd, int rec)
  {
    ctb.mote_id = TOS_NODE_ID;
    ctb.channel = chan;
    ctb.reading = rd;
    ctb.record = rec;

    post report_comm();
  }

  void gen_logentry() 
  {  
    int offset = 0;
    int i;
    for (i = 0; i < num_sensors; i++)
      {
	logentry[i].epochid = log_entries;
	logentry[i].channel = sensor_array[i].channel;
	logentry[i].reading = 
	  median(readings + offset, sensor_array[i].num_samples);
	offset += sensor_array[i].num_samples;
      }
  }
  
  void sample_sensor(int channel)
  {
    switch (channel)
      {
      case TEMP_CHAN: { post sampletemp(); break; }
      case PAR_B_CHAN: { post sampleparb(); break; }
      case PAR_G_CHAN: { post sampleparg(); break; }
      case SONAR_CHAN: { post samplesonar(); break; }
      case SOILM1_CHAN: { post samplesoilm1(); break; }
      case SOILM2_CHAN: { post samplesoilm2(); break; }
      case VOLTAGE_CHAN: { post samplevoltage(); break; }
      }
  }
  
  void handle_reading(int val, int chan)
  {
    data.channel = chan;
    data.reading = val;
    data.record++;
    readings[data.record - 1] = val;
    if (!pull_mode) post report();
  }
  
  void end_of_sampling()
  {
    sampling = FALSE;
    time = 0;
    asleep = TRUE;

    call Gio.clr();
    call Leds.led0Off();
    
    data.channel = EOS_CHAN;
    data.reading = log_entries;
    data.record++;
    
    if (!pull_mode) post report();
	
    if (logging) 
      {
	gen_logentry();
	call LogWrite.append(logentry, sizeof(logentry));
      }
    else log_entries++;

  }

  int elapsedtime()
  {
    return ((call Stopwatch.getNow()) - (call Stopwatch.gett0()));
  }
  

  bool scheck(error_t r) __attribute__((noinline)) {
    if (r != SUCCESS)
      fail(r);
    return r == SUCCESS;
  }

  void clear_dissemination_vals()
  {
    comm.command_name = CLEAR;
    comm.val = 0;
    comm.mote_id = TOS_NODE_ID;
    comm.nonce = 0;
    bcast.command_name = CLEAR;
    bcast.val = 0;
    bcast.mote_id = TOS_NODE_ID;
    bcast.nonce = 0;
    call Bcast.set(&bcast);
    call Command.set(&comm);
  }

  void systems_powerup()
  {
    call RadioControl.start();

    call Gio.makeOutput();
    call Gio.clr();
    
    clear_dissemination_vals();
    
    if (logging) { call Mount.mount(); }
    else { log_entries = 0; }
  }

  void start_normal_mode()
  {
    if (!STATUSLED_BLINK) return;
    normal_mode = TRUE;
    statusled_on = FALSE;
    call Stopwatch.startOneShot(0);
  }
  
  void stop_normal_mode()
  {
    if (!STATUSLED_BLINK) return;
    normal_mode = FALSE;
    call Leds.led2Off();
    statusled_on = FALSE;
    call Stopwatch.stop();
  }

  event void Boot.booted() {

    normal_mode = FALSE;
    
    if (INITIALIZING) { 
      call Mount.mount(); 
      return;
    }

    if (INTERACTIVE_MODE)
      {
	call ButtonEvent.enable();
	call Leds.led0On();
	mode = START_MODE;
      }
    else
      {	
	pull_mode = PULL_MODE;
	logging = LOGGING;
	sleeptime = FIELD_EPOCH_INTERVAL;
	systems_powerup();
      }
  }

  event void RadioControl.startDone(error_t error) {
    if (!pull_mode) call CollectionControl.start();
    call DisseminationControl.start();
    delay = TRUE;
    if (HARVESTER_TRAINING_MODE) call Leds.led0On();
    call Timer.startOneShot(PAUSE_INTERVAL);
      
  }
  event void RadioControl.stopDone(error_t error) 
  {
    call Leds.led0On();
    call Leds.led1On();
    call Leds.led2On();
    // call RadioControl.start();
  }

  event void Timer.fired() 
  {
    int i, thresh; 

    if (delay) 
      {
	delay = FALSE;
	reporting_backlog = FALSE;
	backlog_requested = FALSE;
	data.mote_id = TOS_NODE_ID;
	asleep = TRUE;
	sampling = FALSE;
	time = sleeptime - 1;
	samples = 0;
	call Timer.startPeriodic(SAMPLING_RATE);
	if (HARVESTER_TRAINING_MODE) call Leds.led0Off();
	start_normal_mode();
	return;
      }
    
    if (asleep) 
      {
	time++;
	
	if (logging && backlog_requested && time > BUFFER_INTERVAL)
	  {	
	    reporting_backlog = TRUE;
	    reporting_epochid = checkpoint_requested.epochid;
	    call LogRead.seek(checkpoint_requested.offset);	    
	    backlog_requested = FALSE;
	    return;
	  }
	
	if (time > sleeptime && !reporting_backlog && !HARVESTER_TRAINING_MODE) 
	  {
	    call Gio.set();
	    call Leds.led0On();	    
	    asleep = FALSE;
	    sampling = TRUE;
	    samples = 0;
	    data.record = 0;
	    return;
	  } 
      }  
    else if (sampling)
      {
	samples++;
	thresh = 0;
	for (i = 0; i < num_sensors; i++)
	  {
	    thresh += sensor_array[i].num_samples;
	    if (samples <= thresh)
	      {
		sample_sensor(sensor_array[i].channel);
		break;
	      }
	  }
	if (i == num_sensors) end_of_sampling();
      } 
  }
  
  event void Temp.readDone(error_t result, uint16_t val) 
  {
    handle_reading(val, TEMP_CHAN);
  }
  
  event void Par.readDone(error_t result, uint16_t val) 
  {
    int pchan;
    if (BRAINBOX) pchan = PAR_B_CHAN;
    else pchan = PAR_G_CHAN;
    
    handle_reading(val, pchan);
  } 
  
  event void Sonar.readDone(error_t result, uint16_t val) 
  {
    handle_reading(val, SONAR_CHAN);
  } 
  
  event void SoilM1.readDone(error_t result, uint16_t val) 
  {
    handle_reading(val, SOILM1_CHAN);
  } 
  
  event void SoilM2.readDone(error_t result, uint16_t val) 
  {
    handle_reading(val, SOILM2_CHAN);
  } 
  
  event void Voltage.readDone(error_t result, uint16_t val) 
  {
    handle_reading(val, VOLTAGE_CHAN);
  } 
  
  event void DataSend.sendDone(message_t *msg, error_t error) {
    if (reporting_backlog) { post report_epoch(); }
   }

  task void sampletemp() {
    call Temp.read();
  }

  task void sampleparb() {
    call Par.read();
  }

  task void sampleparg() {
    call Par.read();
  }

  task void samplesonar() {
    call Sonar.read();
  }  

  task void samplesoilm1() {
    call SoilM1.read();
  }

  task void samplesoilm2() {
    call SoilM2.read();
  }

  task void samplevoltage() {
    call Voltage.read();
  }

  task void report() {
    memcpy(call DataPacket.getPayload(&message, sizeof(kappamsg_t)), 
	   &data, sizeof(kappamsg_t));
    call DataSend.send(&message, sizeof(kappamsg_t));
  } 

  task void report_comm()
  {
    memcpy(call DataPacket.getPayload(&message, sizeof(kappamsg_t)), 
	   &ctb, sizeof(kappamsg_t));
    call DataSend.send(&message, sizeof(kappamsg_t));
  } 

  task void report_backlog()
  {
    if (reporting_epochid >= log_entries)
      {
	data.channel = EOL_CHAN;
	data.reading = 0;
	data.record = 0;
	post report();

	reporting_backlog = FALSE;
	call Leds.led2Off();
	start_normal_mode();
	return; 	
      }

    call LogRead.read(logentry, sizeof(logentry));
  }
    
  task void report_epoch()
  {
    if (reporting_logid < num_sensors)
      {
	data.channel = logentry[reporting_logid].channel;
	data.reading = logentry[reporting_logid].reading;
	data.record = 
	  reporting_epochid + BLMASK; // add BLMASK value to denote backlog!
        reporting_logid++;
	call BPITimer.startOneShot(BPI); // don't overflow reaper
      }
    else 
      {
	reporting_epochid++;
	post report_backlog();
      }
  }

  event void BPITimer.fired()
  {
    post report();
  }
  
  task void update_config()
  {    
    call ConfigStorage.write(0, &log_entries, sizeof(log_entries));
    
    if (log_entries % LOGCHUNK_SIZE == 0)
      {
	checkpoint_t checkpoint;
	checkpoint_t tmp;
	int i;
	
	checkpoint.offset = call LogWrite.currentOffset();
	checkpoint.epochid = log_entries;

	for (i = 0; i < NUM_CHECKPOINTS; i++)
	  {
	    tmp = checkpoints[i];
	    checkpoints[i] = checkpoint;
	    checkpoint = tmp;
	  }
	
	call ConfigStorage.write(sizeof(log_entries), 
				 &checkpoints, 
				 sizeof(checkpoints));
      }
  }

  event void ConfigStorage.writeDone(storage_addr_t addr,
				     void* buf, 
				     storage_len_t len, 
				     error_t error) 
  {
    call ConfigStorage.commit();
  }

  event void LogWrite.appendDone(void* buf, 
				 storage_len_t len, 
				 bool recordsLost,
				 error_t error) 
  {
    call LogWrite.sync();
  }

  event void ConfigStorage.commitDone(error_t error) 
  {
    if (INITIALIZING || mode == RESET_MODE) { call Leds.led2On(); }
  }  

  event void LogWrite.syncDone(error_t error) 
  {
    log_entries++;
    post update_config();
  }  

  event void ConfigStorage.readDone(storage_addr_t addr,
				    void* buf, 
				    storage_len_t len, 
				    error_t error) 
  { } 

  event void LogRead.readDone(void* buf, 
			      storage_len_t len, 
			      error_t error) 
  {
    if (reporting_backlog)
      {
	reporting_logid = 0;
	post report_epoch();
      }
   
    if (error == SUCCESS) { flag = 1; }
    else { flag = 0; }
  }
  
  event void LogRead.seekDone(error_t error)
  {
    call Leds.led2On();
    post report_backlog();
  }
  
  event void Command.changed()
  {    
    memcpy(&comm, call Command.get(), sizeof(comm));
    
    if (comm.command_name == CLEAR)
      {
	if (bcast.command_name == CLEAR && pull_mode) 
	  {
	    call Leds.led1Off();
	    if (pull_mode) call CollectionControl.stop();
	  }
      }
    
    if (comm.mote_id == TOS_NODE_ID || HARVESTER_TRAINING_MODE)
      {
	if ((sampling || reporting_backlog) &&
	    (comm.command_name == BACKLOG || comm.command_name == RESET_LOG))
	  {
	    comm_to_base(COMM_CHAN, NODE_BUSY, log_entries);
	    return;
	  }
	
	if (comm.command_name == BACKLOG && comm.val <= log_entries)
	  {
	    int i;

	    checkpoint_requested.epochid = 0;
	    checkpoint_requested.offset = SEEK_BEGINNING;

	    for (i = 0; i < NUM_CHECKPOINTS; i++)
	      {
		if (comm.val >= checkpoints[i].epochid)
		  {
		    checkpoint_requested = checkpoints[i];
		    break;
		  }
	      }
	    
	    backlog_requested = TRUE;
	    // call Leds.led1Off();
	    return;
	  }
	if (comm.command_name == RESET_LOG)
	  {
	    call LogWrite.erase();
	    comm_to_base(COMM_CHAN, RESET_LOG, 0);
	    return;
	  }
	if (comm.command_name == CHANGE_RATE)
	  {
	    sleeptime = comm.val;
	    comm_to_base(COMM_CHAN, CHANGE_RATE, sleeptime);
	    return;
	  }
      }
  }
  
  event void Bcast.changed()
  {
    memcpy(&bcast, call Bcast.get(), sizeof(bcast));

    if (bcast.mote_id == BCAST_ID)
      {
	if (bcast.command_name == COLLECTION)
	  {
	    call CollectionControl.start();
	    call CtpInfo.recomputeRoutes();
	    call Leds.led1On();  
	    stop_normal_mode();
	    return;
	  }
	if (bcast.command_name == IDENTIFY)
	  {
	    call Leds.led1On();
	    comm_to_base(COMM_CHAN, IDENTIFY, log_entries);
	    return;
	  }
	if (bcast.command_name == CLEAR)
	  {
	    if (comm.command_name == CLEAR) 
	      { 
		call Leds.led1Off();
	        if (pull_mode) call CollectionControl.stop();
		if (!delay) start_normal_mode();
	      }
	    
	  }
      }
  }

  event void Mount.mountDone(error_t error) 
  {
    if (INITIALIZING) 
      { 
	call LogWrite.erase(); 
	return;
      }

    if (call ConfigStorage.valid() == TRUE)
      {
	call ConfigStorage.read(0, &log_entries, sizeof(log_entries));
	call ConfigStorage.read(sizeof(log_entries), 
	 			checkpoints, 
				sizeof(checkpoints));
      }
    else
      {
	log_entries = 0;
      }
  }
  
  event void LogWrite.eraseDone(error_t error) 
  {
    log_entries = 0;
    post update_config();
  }
  
  event void ButtonEvent.notify(button_state_t state)
  {
    int etime;
    
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

	    call Leds.led0Off();
	    
	    if (etime < LONGHOLD)
	      {
		mode = POWERUP_MODE;
		call Leds.led1On();
	      }
	    else
	      {
		mode = RESET_MODE;
		call Leds.led0On();
		call Leds.led1On();
	      }
	    break;
	    
	  case POWERUP_MODE:
	    
	    call Leds.led1Off();

	    if (etime < LONGHOLD)
	      {
		pull_mode = PULL_MODE;
		logging = LOGGING;
		sleeptime = FIELD_EPOCH_INTERVAL;
		systems_powerup();
		return;
	      }
	    else
	      {
		call Leds.led0On();
		call Leds.led1On();
		call Leds.led2On();
		pull_mode = FALSE;
		logging = FALSE;
		sleeptime = CALIBRATION_EPOCH_INTERVAL;
		systems_powerup();
		return;
	      }
	    break;
	    
	  case RESET_MODE:	
	    if (etime >= LONGHOLD) 
	      {
		call Leds.led0On();
		call Leds.led1Off();
		call Leds.led2Off();
		call LogWrite.erase();
	      }
	    break;
	  }
      }
  }
  
  event void Stopwatch.fired() 
  { 
    if (INTERACTIVE_MODE && !normal_mode) 
      {
	call Stopwatch.startOneShot(ETERNITY);
	return;
      }
    
    if (!normal_mode) return;

    if (statusled_on) 
      {
	call Leds.led2Off();
	statusled_on = FALSE;
	call Stopwatch.startOneShot(STATUSLED_OFF_INTERVAL);
      }
    else 
      {
	call Leds.led2On();
	statusled_on = TRUE;
	call Stopwatch.startOneShot(STATUSLED_ON_INTERVAL);
      }
  }
  }
