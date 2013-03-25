
Dissemination Sample
====================

This example illustrates a simple (very simple) dissemination system for "small values." It is
intended to take inspiration from TEP-118 but it does not provide the services and reliability
of the system described there. Currently the system only disseminates integers and it requires
that the network topology be hard coded into the nodes (thus each node program is slightly
different).

The security policy is as follows: to disseminate to the nodes the caller must be in the role
N.control where 'N' is the entity representing the network (the node entity of every node) and
'control' is a role for managing the network. The nodes have a credential

    N.control <- N

which allows the nodes to control each other (necessary for multi-hop dissemination).

Also a special "harvester" node H is allowed to disseminate commands to the network. Thus the
nodes also have the credential

    N.control <- H

