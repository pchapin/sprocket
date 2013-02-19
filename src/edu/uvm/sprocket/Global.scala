//-----------------------------------------------------------------------
// FILE    : Global.scala
// SUBJECT : An object that manages the program's global state.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import java.io.File

object Global {
  val activeMessageType = 8

  // Search for a file in the current folder; if not found assume it is the parent folder.
  def locateFile(name: String) = {
    // TODO: Add some sort of configurable list of folders to search.
    val result = new File(name)
    if (result.exists) result
      else new File(".." + File.separator + name)
  }

  // TODO: The location of the map files should be configurable.
  val iMap = new InterfaceMap(locateFile("i_map.txt"))
  val cMap = new ComponentMap(locateFile("c_map.txt"))
  val rMap = new RoleMap(locateFile("r_map.txt"))
  var stubList: List[(String, String, Boolean)] = List()
  var skeletonList: List[(String, String, String, String)] = List()

  private var nameID = 1;

  def uniqueName = {
    val newName = "Spkt_" + nameID.toString
    nameID = nameID + 1
    newName
  }
}
