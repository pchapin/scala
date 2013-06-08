/* 
 * Copyright (c) 2007, Technische Universitaet Berlin
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 * - Neither the name of the Technische Universitaet Berlin nor the names
 *   of its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * - Revision -------------------------------------------------------------
 * $Revision: 1.1.1.1 $
 * $Date: 2009-07-20 17:29:19 $
 * @author: Jan Hauer <hauer@tkn.tu-berlin.de>
 * ========================================================================
 */

#include "Msp430Adc12.h"

module AdcChannel0C {
  provides {
    interface AdcConfigure<const msp430adc12_channel_config_t*>;
    interface Read<uint16_t> as ReadMe;
  }
  uses {
    interface Read<uint16_t>;
  }
}
implementation {

  const msp430adc12_channel_config_t config = {
      inch: INPUT_CHANNEL_A0,
      sref: REFERENCE_VREFplus_AVss,
      ref2_5v: REFVOLT_LEVEL_2_5,
      adc12ssel: SHT_SOURCE_ACLK,
      adc12div: SHT_CLOCK_DIV_1,
      sht: SAMPLE_HOLD_4_CYCLES,
      sampcon_ssel: SAMPCON_SOURCE_SMCLK,
      sampcon_id: SAMPCON_CLOCK_DIV_1
  };

  event void Read.readDone( error_t result, uint16_t val )
  {
    signal ReadMe.readDone(result, val);
  }

  command error_t ReadMe.read() {
    return call Read.read();
  }

  async command const msp430adc12_channel_config_t* AdcConfigure.getConfiguration()
  {
    return &config; // must not be changed
  }
}
