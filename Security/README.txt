
README.txt
==========

This folder contains nesC implementations of various security primitives that are used or could
potentially be used by Sprocket. The intention is to include both test and benchmark programs
for each primitive so that its correctness as well as its memory and execution performance can
be quantatitvely evaluated. Some of these primitives have been written by me (Peter Chapin) and
others were obtained from elsewhere as credited below.

Baseline
--------

This is a modification of the "Blink" program provided with TinyOS v2 as a sample. It provides a
skeleton from which test and benchmark programs can be created. The idea is that at the end of
(correct) execution an appropriate LED is flashed. The Baseline framework can be compiled and
run on its own, allowing the memory overhead of the algorithm under test to be more accurately
evaluated.

SHA1
----

This is my implementation of the SHA1 hashing algorithm. This version uses the first method
described in FIPS 180-1 (faster but uses more memory). Note that TinyECC also has an SHA1
implementation but the interface to that implementation does not allow an arbitrary number of
bits to be hashed (the message length must be a multiple of 8 bits). I'm concerned that this
restriction might be a problem in the future.
