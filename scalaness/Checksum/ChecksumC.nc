
module ChecksumC {
    provides command checksumType compute_checksum(uint8_t data[]);
}
implementation {
    
    command checksumType compute_checksum(uint8_t data[])
    {
        checksumType sum = 0;
        int16_t i;
        for( i = 0; i < (int16_t)size; ++i ) {
            sum += data[i];
        }
        return sum;
    }
    
}