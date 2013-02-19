// FILE   : AuthorizedRole.h
// SUMMARY: Declarations needed by GoverningRoles component.
//

#ifndef AUTHORIZEDROLE_H
#define AUTHORIZEDROLE_H

struct AuthorizedRole {
          uint16_t component_id;
          uint8_t  interface_id;
          int      role_id;
};

#endif

