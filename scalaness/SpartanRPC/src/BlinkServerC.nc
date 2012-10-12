// FILE   : BlinkServerC.nc
// SUMMARY: The main module of the server side of the Blink demonstration program.
//

module BlinkServerC {
    provides interface Leds;
    // What I'm trying to do here is reasonable. How should it be handled? Possibilities:
    //   1. Support 'as' in Mininess.
    //   2. Use only bare commands and let the interfacing to external libraries deal with it.
    //
    // uses interface Leds as LocalLeds;
}
implementation {

    command void Leds.led0Toggle( )
    {
      // call LocalLeds.led0Toggle( );
    }

    command void Leds.led1Toggle( )
    {
      // call LocalLeds.led1Toggle( );
    }

    command void Leds.led2Toggle( )
    {
      // call LocalLeds.led2Toggle( );
    }

}
