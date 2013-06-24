
Multihop Benchmark
==================

This directory contains a simple "remote blink" application used for benchmark testing of
multihop Spartan RPC duties. This program provides the same functionality as the baseline
benchmark but is tuned for multihop purposes.

except that it includes full SprocketRT security processing.

To build the client run 'sprocket -n=A' to select the client node's default entity.
To build the server run 'sprocket -n=A' to select the server node's default entity.

Notice that both client and server are owned by entity A for this test. This is to simplify some
of the setup (the policy for access is uniformly A.r <- A so intermediate servers need to make
their requests as entity A for this to work).
