// Generated by Sprocket. This file is overwritten each time Sprocket is run. Do not edit!

#include <AuthorizedRole.h>

module Spkt_GoverningRolesC {
    provides interface GoverningRoles;
}
implementation {

%GOVERNINGROLES%

    command int GoverningRoles.get_role_id( uint16_t component_id, uint8_t interface_id )
    {
        int i;
        
        for( i = 0; i < sizeof( authorized_roles ) / sizeof( struct AuthorizedRole ); ++i ) {
            if( authorized_roles[i].component_id == component_id &&
                authorized_roles[i].interface_id == interface_id ) {
                return authorized_roles[i].role_id;
            }
        }
        return -1;
    }

}
