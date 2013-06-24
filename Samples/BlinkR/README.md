
Remote Blink
============

This is the classic Blink example extended to use the features of SpartanRPC. There are two
separate programs: the client (or "user") program and the server (or "provider") program. The
programs share information about the service of common interest. In this case that service is
the ability to flash an LED on the server. The shared information is in the common parent folder
(except that the interface definition is copied in each subfolder due to a limitation in the way
Sprocket currently works). Otherwise each program is independent.

