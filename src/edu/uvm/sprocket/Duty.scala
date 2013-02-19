//-----------------------------------------------------------------------
// FILE    : Duty.scala
// SUBJECT : Holds information about a particular duty.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

/**
 * Instances of this class hold the information about a duty needed by Sprocket. Right now this
 * information simply consists of the name of the duty together with a list of the duty's
 * parameters. Each parameter is represented by its name and type. Note that the order of a
 * duty's parameters in the list is significant and reflects the order in which they were
 * declared in the original source.
 */
class Duty(val name: String) {
  private var parameterList: List[(String, TypeRepresentation)] = List()

  // This isn't too efficient, but that's okay because parameter lists are short.
  def addParameter(parameter: (String, TypeRepresentation)) = {
    parameterList = parameterList ::: List(parameter)
  }


  def getParameters: Seq[(String, TypeRepresentation)] = parameterList
}
