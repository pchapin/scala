
module NodeC {
    uses command error_t send( addrT s, addrT d, int8_t data );
    provides command error_t main( );
}
implementation {

    command error_t main(  )
    {
        return call send( (addrT)self, (addrT)neighbor, 0 /* "Hello" */ );
    }

}
