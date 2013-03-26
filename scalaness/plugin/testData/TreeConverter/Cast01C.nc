
module Cast01C {
  uses command int function( int32_t dt);
}
implementation {

    struct X {
        int a;
    };
    
    struct Y {
        int b;
    };
    
    struct Y f( struct X value )
    {
        return (struct Y)value;
    }
    
    

}