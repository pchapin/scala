// FILE   : SkeletonC.nc
// SUMMARY: The module that is specialized for each skeleton.
//

#include "KappaMsg.h"

module SkeletonC {
    uses command void change( struct commandTAG *new_value );
}
implementation {
    int value = 0;

    void f( int increment )
    {
        value += increment;
    }

}
