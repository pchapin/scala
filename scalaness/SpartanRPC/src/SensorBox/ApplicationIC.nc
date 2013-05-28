
#include "KappaMsg.h"

// Configuration encapsulates application components that have imports.
configuration ApplicationIC {

  uses command void set( const struct commandTAG *new_value );
  uses command const struct commandTAG *get( );

}
implementation {
    components SensorBoxC;

    SensorBoxC.set = set;
    SensorBoxC.get = get;
}
