//-----------------------------------------------------------------------
// FILE    : InterfaceInformation.scala
// SUBJECT : Holds information about an interface.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

/**
 * Instances of this class hold information about a specific interface. An interface is
 * characterized by the duties it contains. Sprocket is not interested (right now) in
 * interfaces other than those with duties so no provision to handle other kinds of interfaces
 * is needed. The name of the interface does not appear hear. It is instead a key in a
 * global map that associates interface names with an instance of this class.
 */
class InterfaceInformation {
  private var dutyList: List[Duty] = List()

  /**
   * Adds a new duty to the list of duties associated with this interface.
   *
   * @param newDuty the duty to be added.
   */
  def addDuty(newDuty: Duty) = {
    // This is inefficient but that doesn't matter because the number of duties will be small.
    dutyList = dutyList ::: List(newDuty)
  }

  def getDuties: Seq[Duty] = dutyList
}
