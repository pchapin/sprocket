
Benchmarks
==========

These directories contain different versions of a simple "remote blink" application used for
benchmark testing. This application is based on the BlinkToRadio sample in the TinyOS tutorial.
However, unlike that sample, the client and server components of the application have been
separated. This allows measurements to be made on each side of the communication independently.
The server controls the LEDs and provides access to them. The client invokes server code by
passing messages to the server.

In this application the client increments and sends a 16 bit count value to the server
repeatedly and as quickly as possible. The server is intended to display the lower three bits of
the count on its leds. However, to facilitate testing, the client toggles LED #0 after every 256
messages are sent and the server does the same. These programs provide no handshake so it is
possible that the server will miss some of the messages. If that occurs (to a significant
degree), the flashing of LED #0 on the two nodes will fall out of synchronization. The server
actually only displays bits 1 and 2 of the count on LED #1 and LED #2 respectively.

The test devices consist of: Tmote Sky nodes using an 8 MHz MSP430F1611 microcontroller with 10
KiB of RAM and 48 KiB of ROM. The radio chip is a Chipcon CC2420 with hardware AES support. The
system software is TinyOS v2.1.2.
