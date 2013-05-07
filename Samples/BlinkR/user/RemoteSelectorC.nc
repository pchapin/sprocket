/****************************************************************************
FILE    : RemoteSelectorC.nc
SUBJECT : Module that defines which neighbor nodes will receive duty postings.
AUTHOR  : Peter C. Chapin

****************************************************************************/

#include "ComponentManager.h"

module RemoteSelectorC {
    provides interface ComponentManager;
}
implementation {

    // Ideally broadcast (0xFFFF) would be used here. Alas, broadcast is tricky in this system.
    // Send to node #0, component #1.
    component_id servers = { 0x00, 0x01 };

    command component_set ComponentManager.elements()
    {
        component_set result = { &servers, 1 };
        return result;
    }
}
