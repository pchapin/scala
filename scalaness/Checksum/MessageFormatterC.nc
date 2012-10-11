
module MessageFormatterC {
    uses command checksumType compute_checksum(int32_t data);
}
implementation {
    
    void f()
    {
        uint8_t raw[size];
        checksumType checksum = call compute_checksum( 0 );
    }
    
}