module BlinkC  {
    uses {
        command int8_t  get_initial_count  (  ) ;
    }
    provides {
        command void fired  (  ) ;
    }
    uses {
        command void startPeriodic  ( int32_t dt   ) ;
    }
    uses {
        command void led2Toggle  (  ) ;
        command void led1Toggle  (  ) ;
        command void led0Toggle  (  ) ;
    }
    provides {
        command void booted  (  ) ;
    }
}
implementation {
    int8_t  flash_count  ;
    int8_t  global_period   = 100 ;
    command void booted  (  ) 
    {
        flash_count  = call get_initial_count (  );
        call startPeriodic ( global_period  );
    }

    command void fired  (  ) 
    {
        if( flash_count  > 0  )
        {
            call led0Toggle (  );
            --flash_count ;
        }
    }

}

