// FILE   : RemoteSelectorC.nc
// SUMMARY: Component that selects dynamic wire endpoints.
//

#include "ComponentManager.h"

module RemoteSelectorC {
    provides interface ComponentManager;
}
implementation {

    // Ideally we would send to the broadcast address, but that is tricky in this system.
    // Send to node #0, component #1.
    component_id broadcast = { 0x00, 0x01 };

    command component_set ComponentManager.elements( )
    {
        component_set result = { &broadcast, 1 };
        return result;
    }
}
