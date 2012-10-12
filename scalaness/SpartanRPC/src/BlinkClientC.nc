// FILE   : BlinkClientC.nc
// SUMMARY: The main module of the client side of the Blink demonstration program.
//

module BlinkClientC {
    uses interface Leds;
}
implementation {
    int value = 0;

    void f( int increment )
    {
      call Leds.led0Toggle( );
    }

}
