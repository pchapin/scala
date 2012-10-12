// FILE   : StubC.nc
// SUMMARY: The module that is specialized for each stub.
//

module StubC {
}
implementation {
    int value = 0;

    void f( int increment )
    {
        value += increment;
    }

}
