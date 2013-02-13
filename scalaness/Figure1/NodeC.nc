
module NodeC {
    uses command error_t send( addrT s, addrT d, uint8_t data[] );
    provides command error_t main( );
}
implementation {

    command error_t main(  )
    {
        uint8_t my_data[64];
        return call send( (addrT)self, (addrT)neighbor, my_data );
    }

}
