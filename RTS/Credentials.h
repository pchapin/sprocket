// FILE   : Credentials.h
// SUMMARY: Definition of a type that represents an RT_0 credential.

#ifndef CREDENTIALS_H
#define CREDENTIALS_H

enum CredentialForm { Invalid, Role_Membership, Role_Inclusion, Role_Linked, Role_Intersection };

struct CredentialType {
    enum CredentialForm form;  // What kind of credential this is.
    int  defining_key;         // Index into the key storage of the asserting entity.
    int  target_role;          // Role identifier of the role being defined.
    int  source_key1;          // Index into the key storage of the first RHS key.
    int  source_key2;          // Index into the key storage of the second RHS key (if exists)
    int  source_role1;         // Role identifier of the first RHS role.
    int  source_role2;         // Role identifier of the second RHS role.
    uint16_t checksum;         // Fletcher checksum of certificate containing this credential.
                               //   Used to distinguish certificates that have been seen before.
};

#endif

