
#include "ComponentManager.h"

module RemoteSelectorC {
    provides interface ComponentManager;
}
implementation {

    // Location of the service.
    struct component_id service[] = {
        { 0x0001, 0x01 }
    };

    command struct component_set ComponentManager.elements( )
    {
        struct component_set result = { service, 1 };
        return result;
    }
}
