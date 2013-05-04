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

    // Send to node broadcast address (0xFFFF), component #1.
    component_id broadcast = { 0xFFFF, 0x01 };

    command component_set ComponentManager.elements()
    {
        component_set result = { &broadcast, 1 };
        return result;
    }
}
