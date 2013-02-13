
// Type  parameter: checksumType: The type used to hold a checksum.
// Value parameter: size: The size of the data array to process.

module ChecksumC {
    provides command checksumType compute_checksum(uint8_t data[]);
}
implementation {
   
    // Computes a simple checksum over the data array.
    command checksumType compute_checksum(uint8_t data[size])  // Try taking 'size' out here :)
    {
        checksumType sum = 0;
        int16_t i;
        
        // Casting from uint16_t to int16_t is explicitly enabled in type compatibility map.
        for( i = 0; i < (int16_t)size; ++i ) {
            sum += data[i];
        }
        return sum;
    }
    
}
