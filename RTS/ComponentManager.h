// FILE   : ComponentManager.h
// SUMMARY: Declarations needed by the component manager.
//

#ifndef COMPONENTMANAGER_H
#define COMPONENTMANAGER_H

typedef struct {
   uint16_t node_id;
   uint8_t  local_id;
} component_id;


typedef struct {
    component_id *ids;
    int count;
} component_set;

#endif
