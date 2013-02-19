//-----------------------------------------------------------------------
// FILE    : MessageServer.scala
// SUBJECT : An object to handle Sprocket's output messages.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

/**
 * All messages produced by Sprocket should go through this object. This allows messages to be
 * easily handled in a uniform manner (for example: time stamped, logged, etc, as desired).
 */
object MessageServer {

  /**
   * Display error messages. This method is currently very primitive. It simply prefixes
   * "Error:" at the beginning of each message printed. All messages go to the standard output
   * device.
   *
   * @param message The error message to be displayed.
   */
  def error(message: String) = {
    println("Error: " + message)
  }

}
