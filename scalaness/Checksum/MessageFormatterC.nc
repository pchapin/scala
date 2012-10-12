
module MessageFormatterC {
    uses command checksumType compute_checksum( uint8_t data[] );
    provides command void booted( );
}
implementation {
    
    command void booted( )
    {
        f( );
    }
    
    void f()
    {
        uint8_t raw[size];
        checksumType checksum = call compute_checksum( raw );
    }
    
}