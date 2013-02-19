// FILE   : RemoteSelectorC.nc
// SUMMARY: Component that selects dynamic wire endpoints.
//

#include "ComponentManager.h"

module RemoteSelectorC {
    provides interface ComponentManager;
}
implementation {

    // Send to node server address (0x0000), component #1.
    struct component_id broadcast = { 0x0000, 0x01 };

    command struct component_set ComponentManager.elements( )
    {
        struct component_set result = { &broadcast, 1 };
        return result;
    }
}
