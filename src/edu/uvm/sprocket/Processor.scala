//-----------------------------------------------------------------------
// FILE    : Processor.scala
// SUBJECT : Abstract superclass representing tree processors.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

abstract class Processor(root: ASTNode) {
  def process() = root
}
