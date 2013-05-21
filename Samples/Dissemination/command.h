
#ifndef COMMAND_H
#define COMMAND_H

// The structure of network commands
typedef struct commandTAG {
    uint8_t  mote_id;      // The command destination node.
    uint8_t  command_name; // Name of the command.
    uint16_t val;          // Command parameter.
    uint8_t  nonce;        // Nonce to ensure reissued commands are updates.
} command_t;

#endif
