//-----------------------------------------------------------------------
// FILE    : EntityMap.scala
// SUBJECT : Classes that manage (name, ID) pairs for interfaces, components, and roles.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import java.io.{BufferedReader, File, FileNotFoundException, FileReader}
import scala.collection.mutable.Map

/**
 * This super type provides a dictionary of name to ID pairs. Each such dictionary is taken from
 * the specified file. The meaning of the names and ID values is not significant to this class.
 * Each instance of this class defines its own namespace; ID values stored in one instance are
 * not related to ID values stored in another. This class is a thin wrapper around Scala's built
 * in Map collection. However it does provide some added functionality (such as reading the
 * dictionary file) so creating a separate class for this concept is reasonable.
 *
 * There is no way to add (name, ID) pairs after the constructor of this class executes. Thus
 * all names "known" to this class must necessarily be in the provided dictionary file.
 *
 * Note that this class is abstract. Use one of the two subclasses defined below.
 */
abstract class EntityMap(fileName: File) {

  // This only needs to be visible to subclasses. TODO: Look up how to say that in Scala.
  val idMap = Map[String, Int]()

  // TODO: Consolidate the reading of map files into a single place.
  private def processLine(input: BufferedReader) {
    val line = input.readLine
    if (line == null) return
    else {
      val fields = line.split("\\s*=\\s*")
      if (fields.length == 2) {
        idMap += (fields(0) -> fields(1).toInt)
      }
      processLine(input)
    }
  }

  // Is there actually a good way to do this sort of thing?
  try {
    val inputFile = new BufferedReader(new FileReader(fileName))
    try {
      processLine(inputFile)
    }
    finally inputFile.close
  }
  catch {
    case ex: FileNotFoundException =>  // Ignore missing map files.
  }


  /**
   * Look up the ID value associated with a given name.
   *
   * @param name The name being checked.
   * @return The ID value associated with the name.
   * */
  def getId(name: String) = idMap(name)


  /**
   * Gives access to the names defined by this EntityMap.
   * 
   * @return An iterable collection of entity names (in no particular order).
   */
  def getEntityNames = {
    idMap.keysIterator
  }


  /**
   * Check to see if the given named entity is known to this map. "Known" names are those
   * explicitly specified in the configuration file used to initialize the EntityMap object.
   * such names have an associated ID and information object.
   *
   * @param name The name being checked.
   * @return true if the name is known; false otherwise.
   */
  def isKnown(name: String) = idMap contains name


  /**
   * Display all the (name, ID) paris in this EntityMap. The result is displayed on the standard
   * output device. The output is indented to allow for a header created elsewhere.
   */
  def dumpIds = {
    for (name <- idMap.keysIterator) {
      println("\t" + name + ": " + idMap(name))
    }
  }

}


/**
 * A specialized EntityMap for holding (interface name, interface ID) mappings. A separate class
 * is defined to avoid accidentally mixing up different map types.
 */
class InterfaceMap(fileName: File) extends EntityMap(fileName) {
  private val informationMap = Map[String, InterfaceInformation]()

  // Populate the information map with "blank" InterfaceInformations for each known interface.
  for (key <- idMap.keysIterator) {
    informationMap += (key -> new InterfaceInformation)
  }

  /**
   * Look up the InterfaceInformation associated with a given name.
   *
   * @param name The name being checked.
   * @return The InterfaceInformation object associated with the name.
   */
  def getInformation(name: String) = informationMap(name)


  /**
   * Display information about all the interfaces known to this map onto the standard output
   * device. The displayed information is indented so that a header can be provided elsewhere.
   */
  def dumpInterfaces = {
     for (name <- idMap.keysIterator) {
       println("\tDuties Contained in " + name + ": ")
       val currentInformation = informationMap(name)
       for (duty <- currentInformation.getDuties) {
         println("\t\t" + duty.name)
         for (parameterDeclaration <- duty.getParameters) {
           val (parameterName, parameterType) = parameterDeclaration
           println("\t\t\t" + parameterName + " : " + parameterType.name)
         }
       }
     }
  }
}


/**
 * A specialized EntityMap for holding (component name, component ID) mappings. A separate class
 * is defined to avoid accidentally mixing up different map types.
 */
class ComponentMap(fileName: File) extends EntityMap(fileName)


/**
 * A specialized EntityMap for holding (role name, role ID) mappings. A separate class is
 * defined to avoid accidentally mixing up different map types.
 */
class RoleMap(fileName: File) extends EntityMap(fileName)
