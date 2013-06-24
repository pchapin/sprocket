
Signature Verification
======================

This program exercises TinyECC's signature verification code. The program runs on a single node.
It turns on the green LED (LED #1) at boot time. It then repeatedly (see source code for
details) verifies the same certificate. If a verification fails it turns on the red LED (LED #0)
and leaves it on. In any case it turns on the blue LED when the program has completed and 10
verifications have been done.

The certificate being verified is also stored in RTAdmin's database in this folder.

