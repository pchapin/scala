// FILE   : BlinkClientC.nc
// SUMMARY: The main module of the client side of the Blink demonstration program.
//

module BlinkClientC {
    uses command void led0Toggle();
}
implementation {
    int value = 0;

    void f( int increment )
    {
      call led0Toggle( );
    }

}
