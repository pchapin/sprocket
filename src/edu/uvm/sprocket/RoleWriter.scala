//-----------------------------------------------------------------------
// FILE    : RoleWriter.scala
// SUBJECT : An object that writes governing role information into the node's runtime environment.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import java.io._

object RoleWriter {
  
  /**
   * Splits a full role name into key and role identifiers. For example splitRole("A.r") returns the pair ("A", "r").
   * 
   * @param roleName The full role name to split. The format must be "KeyID.roleID"
   * @return A pair consisting of the key identifier and role identifier as separate components.
   */
  private def splitRole(roleName: String) = {
    // TODO: The format of the role name should be verified.
    
    // A blank role name is a special case. It means no role is necessary. In that case return with blank IDs as well.
    if (roleName == "")
      ("", "")
    else {
      val components = roleName.trim.split("""\s*\.\s*""")
      (components(0), components(1))
    }
  }
  
  
  /**
   * Write a list of governing role information into the given output file. This list is taken from all skeletons (that
   * is, all components that provide a remote interface). Each provided interface is normally associated with a
   * governing role. In the case when there is no governing role, the special roleID of -1 is used instead.
   * 
   * @param outputFile An object representing the opened output file. The list of governing roles is to be written at
   * the file's current position.
   */
  private def writeRoles(outputFile: BufferedWriter) {
    var first = true
    outputFile.write("    struct AuthorizedRole authorized_roles[] = {\n")
    for ((skeletonName, interfaceName, componentName, extendedRoleName) <- Global.skeletonList) {
      if (!first) {
        outputFile.write(",\n")
      }
      first = false
      val componentID = Global.cMap.getId(componentName)
      val interfaceID = Global.iMap.getId(interfaceName)
      val (_, roleName) = splitRole(extendedRoleName)    // Governing key is always "my" key.
      val roleID = if (roleName == "") -1 else Global.rMap.getId(roleName)
      outputFile.write("        ")
      outputFile.write("{ " + componentID + ", " +
                              interfaceID + ", " +
                              roleID      + " }")
    }
    if (!first) {
      outputFile.write("\n")
    }
    outputFile.write("    };\n")
  }
  

  /**
   * Create the file Spkt_GoverningRolesC.nc in the specified output folder. This file is generated from a template with
   * a list of all known governing roles injected into the file.
   * 
   * @param settings The configuration settings used to define the location of the templates.
   * @param outputFolder An object representing the folder where the output file will be placed.
   */
  def writeAllGoverningRoles(settings: ConfigurationSettings, outputFolder: File) {
    // Copy and specialize the template.
    val Some(templateFolderName) = settings("TemplateFolder")
    val templateFolder   = new File(templateFolderName)
    val templateFileName = new File(templateFolder, "Spkt_GoverningRolesC.nc")
    val outputFileName = new File(outputFolder, "Spkt_GoverningRolesC.nc")

    // TODO: Make this more exception safe.
    val templateFile = new BufferedReader(new FileReader(templateFileName))
    val outputFile   = new BufferedWriter(new FileWriter(outputFileName))
    var line: String = null
    
    while ({ line = templateFile.readLine(); line != null }) {
      if (line.contains("%GOVERNINGROLES%"))
        writeRoles(outputFile)
      else {
        outputFile.write(line)
        outputFile.write("\n")
      }
    }

    outputFile.close()
    templateFile.close()
  }
}
