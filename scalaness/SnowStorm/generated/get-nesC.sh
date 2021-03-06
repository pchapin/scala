#!/bin/bash

# This script copies over the nesC portions of the Harvester and SensorBox applications.

HARVESTER_DIR=../src/Harvester
SENSORBOX_DIR=../src/SensorBox

if [ \( ! -d $HARVESTER_DIR \) -o \( ! -d $SENSORBOX_DIR \) ]; then
  echo "Missing source directories!"
  echo "Are you running this script while inside the 'generated' directory?"
fi

HARVESTER='AesC.nc
  AesP.nc
  AesRamP.nc
  BoundsCheckC.nc
  CryptoShimC.nc
  Encrypt.nc
  HarvesterAppC.nc
  HarvesterC.nc
  HarvesterConfig.h
  KappaMsg.h
  Makefile
  queue.c
  SendShimC.nc
  volumes-stm25p.xml'

SENSORBOX='AesC.nc
  AesP.nc
  AesRamP.nc
  BoundsCheckC.nc
  AdcChannel0C.nc
  AdcChannel1C.nc
  BrainboxAppC.nc
  CryptoShimC.nc
  Encrypt.nc
  GroundboxAppC.nc
  KappaMsg.h
  Makefile
  ReceiveShimC.nc
  SendShimC.nc
  SensorBoxC.nc
  SensorConfig.h
  UVMS1087ParC.nc
  UVMS1087ParP.nc
  volumes-stm25p.xml'

for FILE in $(echo $HARVESTER); do
  cp $HARVESTER_DIR/$FILE Harvester/$FILE
done

for FILE in $(echo $SENSORBOX); do
  cp $SENSORBOX_DIR/$FILE SensorBox/$FILE
done
