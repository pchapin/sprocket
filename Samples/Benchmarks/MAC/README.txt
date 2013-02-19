
README.txt
==========

This version of the benchmark exercises the remote procedure call discipline with the addition
of MAC processing using a predefined key.

To set up for this test some special adjustments need to be made.

1. Modify SessionKeyStorageC.nc in the RTS folder to expose the code that installs a hard coded
   session key into the session key cache.

2. Run Sprocket

3. Replace ACNullC with ACRT0C in the generated AppC.nc configuration. This will cause the full
   Sprocket runtime to be invoked for each duty post. Since a session key has been preloaded
   only the MAC computations should be done (no certificates transferred and no session key
   negotiation will take place).

Timing the flashing of LED #0 over ~60 seconds shows that the test devices are capable of
posting duties at a maximum rate of 87 posts/s with this program.

Peter C. Chapin
