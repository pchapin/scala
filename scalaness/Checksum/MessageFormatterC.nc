
// Type  parameter: checksumType: The type used to hold a checksum.
// Value parameter: size: The size of the data array to process.

// Main program of the node.
module MessageFormatterC {
    
    uses command checksumType compute_checksum( uint8_t data[] );
    uses command void startPeriodic( uint32_t period );
    provides command void booted( );
    provides command void fired( );
}
implementation {
    
    command void booted( )
    {
        // Casting from int16_t to uint32_t explicitly enabled in configuration.
        call startPeriodic( (uint32_t)1000 );
    }
    
    // Called once per second.
    command void fired( )
    {
        uint8_t raw[size];
        uint16_t i;
        checksumType checksum;
        
        // Construct message.
        for( i = 0U; i < size; ++i ) {
            raw[i] = (i & 0x00FF);
        }
        checksum = call compute_checksum( raw );
        
        // Other program components used to send message with checksum.
    }
    
}
