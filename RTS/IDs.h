// FILE   : IDs.h
// SUMMARY: Definition of a structure used to hold SpartanRPC endpoint addresses.

#ifndef IDS_H
#define IDS_H

// The INVALID value is used by SessionKeyStorage implementations internally.
enum RemoteEndpointRole { INVALID, CLIENT, SERVER };

struct IDs {
    uint16_t node_id;
    uint8_t  component_id;
    uint8_t  interface_id;
};

#endif

