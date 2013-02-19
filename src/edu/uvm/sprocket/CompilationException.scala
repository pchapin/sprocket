//-----------------------------------------------------------------------
// FILE    : CompilationException.scala
// SUBJECT : Class that represents Sprocket specific compile time errors.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

/**
 * Instances of this class are thrown when a compile-time error is detected in the Spartan RPC
 * source. This is distinct from other kinds of non-compiliation errors.
 */ 
class CompilationException(message: String) extends Exception(message)
