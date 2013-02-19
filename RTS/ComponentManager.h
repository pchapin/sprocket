// FILE   : ComponentManager.h
// SUMMARY: Declarations needed by the component manager.
//

#ifndef COMPONENTMANAGER_H
#define COMPONENTMANAGER_H

/* typedef */ struct component_id {
   uint16_t node_id;
   uint8_t  local_id;
} /* component_id */;


/* typedef */ struct component_set {
    struct component_id *ids;         // Parser can't handle a typedef name here.
    int count;
} /* component_set */;

#endif
