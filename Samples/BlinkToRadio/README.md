
BlinkToRadio Sample
===================

This program demonstrates Sprocket's ability to do bidirectional communication. It differs in
this respect from the BlinkR sample (where communication is only one-way).

The client code increments a counter whenever a timer fires and then broadcasts a remote call to
every neighbor node to light up the LEDs on that neighbor with the count value. The server code
receives the remote calls and invokes the component that actually updates the LEDs. This
application contains both client and server (thus two nodes programmed with this application
will light up each other's LEDs). This code is based on the BlinkToRadio sample in the TinyOS
tutorial.
