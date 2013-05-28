
#include "KappaMsg.h"

// Configuration encapsulates application components that have imports.
configuration ApplicationIC {

  uses command void change( struct commandTAG *new_value );

}
implementation {
    components HarvesterC;

    HarvesterC.set -> change;
}
