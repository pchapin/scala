module InitialConstantsC  {
    provides {
        command int8_t  get_initial_count  (  ) ;
    }
}
implementation {
    command int8_t get_initial_count  (  ) 
    {
        return 10 ;
    }

}

