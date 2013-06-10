/**
 * SensorConfig.h
 * 
 * This file contains macro and struct definitions used only
 * by nodes, e.g. sampling rates, log configuration.
 * 
 * @author Christian Skalka 
 */

#ifndef SENSORCONFIG_H
#define SENSORCONFIG_H

#include "Storage.h"

#define NUM_BRAIN_SENSORS 4
#define NUM_GROUND_SENSORS 3

#define MAXNUM_SENSORS 5
#define MAXNUM_SAMPLES 50

#define BRAINBOX TRUE  
#define PULL_MODE TRUE // report only requested backlog
#define LOGGING TRUE  // turn logging on or off
#define INITIALIZING FALSE // initialize the flashmem and stop
#define INTERACTIVE_MODE TRUE // allow user button input, otherwise sample
#define HARVESTER_TRAINING_MODE FALSE // respond to all unicast commands
 
/* 
   The following values control sensor timing. An "epoch" is 
   a sensor sampling period, which occur between sleep times.
*/

/* How many samples for each modality */
#define SONAR_SAMPLES 15  
#define PAR_SAMPLES 10
#define TEMP_SAMPLES 3
#define VOLTAGE_SAMPLES 10
#define SOILM_SAMPLES 10

/* These intervals are in milsecs */
#define SAMPLING_RATE 1000 // sampling rate
#define PAUSE_INTERVAL 10000        // initial delay at startup
#define BPI 100    // backlog pause interval
/* These intervals are multiples of SAMPLING_RATE */
#define FIELD_EPOCH_INTERVAL 10800 // 21600 // 3600 // interval between epochs in field
#define CALIBRATION_EPOCH_INTERVAL 0 // epoch interval for calibrations 
#define BUFFER_INTERVAL 10  // minimal pause between write and report 

/* These have to do with the datalogging format */
#define LOGCHUNK_SIZE 36
#define NUM_CHECKPOINTS 5
#define MAX_EPOCHS 10000 

/* These are associated with button timer */
#define LONGHOLD 1000
#define ETERNITY 1000000

/* These define the sampling status led timing */
#define STATUSLED_ON_INTERVAL 500
#define STATUSLED_OFF_INTERVAL 6000
#define STATUSLED_BLINK FALSE

typedef struct checkpoint_val {
  storage_cookie_t offset;
  uint16_t epochid;
} checkpoint_t;

typedef struct logentry_val {
  int reading;
  int channel;
  int epochid;
} logentry_t;

typedef struct sensor_array_val {
  int channel;
  int num_samples;
} sensor_array_t;

 /*
  This array contains pairs (A,B) where A is the sensor 
  modality id (channel), and B is the number of samples per epoch
 */  
sensor_array_t BRAINBOX_ARRAY[] = 
  {
    { TEMP_CHAN, TEMP_SAMPLES },
    { PAR_B_CHAN, PAR_SAMPLES },
    { SONAR_CHAN, SONAR_SAMPLES },
    { VOLTAGE_CHAN, VOLTAGE_SAMPLES}
  };

sensor_array_t GROUNDBOX_ARRAY[] = 
  {
    { PAR_G_CHAN, PAR_SAMPLES },
    { SOILM1_CHAN, SOILM_SAMPLES },
    { SOILM2_CHAN, SOILM_SAMPLES }
  };
    
enum SBMODES 
  { START_MODE,
    POWERUP_MODE,
    RESET_MODE } sensorbox_mode;

#endif
