// FILE   : AuthorizedRole.h
// SUMMARY: Declarations needed by GoverningRoles component.
//

#ifndef AUTHORIZEDROLE_H
#define AUTHORIZEDROLE_H

struct AuthorizedRole {
          uint16_t component_identifier;
          uint8_t  interface_identifier;
          int      role_id;
};

#endif

