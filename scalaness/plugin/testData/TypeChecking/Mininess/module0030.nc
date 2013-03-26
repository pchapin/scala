
module ExampleC {
}
implementation {
    struct X {
        int   m1;
        char  m2[1024];
    };
    
    int f( )
     {
         struct X myStructure;
        
        myStructure.m1    = 1;
        myStructure.m2[0] = 'x';
        return 0;
    }
}
