
#include "ComponentManager.h"

module RemoteSelectorC {
    provides interface ComponentManager;
}
implementation {

    // Assume the service is at nodes #0 and #1, component #1.
    component_id service[] = {
        { 0x0000, 0x01 },
        { 0x0001, 0x01 },
        { 0x0002, 0x01 },
        { 0x0003, 0x01 }
    };

    command component_set ComponentManager.elements( )
    {
        component_set result = { service, 4 };
        return result;
    }
}
