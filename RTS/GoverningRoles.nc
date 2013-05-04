// FILE   : GoverningRoles.nc
// SUMMARY: Interface to components that manage a database of governing role information.
//

interface GoverningRoles {
    
    //! Return the governing role identifier (an integer) for a particular interface.
    /*!
     * \param component_identifier The component that provides the remote interface.
     * \param interface_identifier The remote interface identifier.
     *
     * \return The role identifier of the interface's governing role or -1 if no governing role
     * is found.
     */
    command int get_role_id( uint16_t component_identifier, uint8_t interface_identifier );
}
