
Minimum Model
=============

This program exercises the minimum model building code. The program runs on a single node. It
turns on the green LED (LED #1) at boot time. It then repeatedly (see source code for details)
rebuilds the model using the standard five credentials (see CredentialStorageC.nc). If a build
overflows it turns on the red LED (LED #0) and leaves it on. In any case it turns on the blue
LED when the program has completed and 30000 builds have been done.

Before running this program be sure to activate the code in CredentialStorageC.nc that preloads
the storage with the standard five credentials.

On the test devices I'm using (Tmote Sky based on an 8 MHz MSP430F1611) this program can rebuild
the model in 370 microseconds.
