/****************************************************************************
FILE    : ComponentManager.h
SUBJECT : Definition of data types used by the component manager interface.
AUTHOR  : Peter C. Chapin

****************************************************************************/

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
