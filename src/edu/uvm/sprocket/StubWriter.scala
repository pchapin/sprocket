//-----------------------------------------------------------------------
// FILE    : StubWriter.scala
// SUBJECT : An object that writes stubs.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import java.io.{BufferedReader, BufferedWriter, File, FileReader, FileWriter}

object StubWriter {

  private def writeDutyCommands(outputFile: BufferedWriter, interfaceName: String) {
    val information = Global.iMap.getInformation(interfaceName)
    for (duty <- information.getDuties) {
      outputFile.write(s"    command void $interfaceName.${duty.name}(")
      var parameterCounter = 0
      for ( (parameterName, parameterType) <- duty.getParameters) {
        outputFile.write(parameterType.name + " " + parameterName)
        parameterCounter = parameterCounter + 1
        if (parameterCounter != duty.getParameters.length) outputFile.write(", ")
      }
      outputFile.write(") {\n")

      // Declarations.
      outputFile.write("        uint8_t *p;\n\n")

      // Preliminaries.
      outputFile.write(s"        if( duty_pending ) return;\n")
      outputFile.write(s"        duty_pending = TRUE;\n")
      outputFile.write(s"        remote_components = call ComponentManager.elements( );\n")
      outputFile.write(s"        remote_index = 0;\n")
      outputFile.write(s"        p = prepare_header( ${duty.ID} );\n")

      // Command parameters.
      for ( (parameterName, parameterType) <- duty.getParameters) {
        outputFile.write(s"        memcpy(p, &$parameterName, sizeof(${parameterType.name}));\n")
        outputFile.write(s"        p += sizeof(${parameterType.name});\n")
      }

      // Begin the process of sending the packet.
      outputFile.write(s"        size = p - message_buffer;\n")
      outputFile.write(s"        post compute_authorization( );\n")
      outputFile.write(s"    }\n")
    }
  }

  def writeAllStubs(settings: ConfigurationSettings, outputFolder: File) {
    
    def writeOneStub(stubList: List[(String, String, Boolean)]) {
      stubList match {
        case Nil => ()
        case (stubName, interfaceName, authorizationRequired) :: rest => {
          // Copy and specialize the stub component.

          val Some(templateFolderName) = settings("TemplateFolder")
          val templateFolder   = new File(templateFolderName)
          val templateFileName = new File(templateFolder, "Spkt_StubTemplateC.nc")
          val outputFileName   = new File(outputFolder, stubName + ".nc")

          // Now specialize the stub...
          // TODO: Make this more exception safe.
          val templateFile = new BufferedReader(new FileReader(templateFileName))
          val outputFile   = new BufferedWriter(new FileWriter(outputFileName))
          var line: String = null

          while ({ line = templateFile.readLine(); line != null }) {
            if (line.contains("%DUTYCOMMANDS%"))
              writeDutyCommands(outputFile, interfaceName)
            else {
              line = line.replace("%STUBNAME%", stubName)
              line = line.replace("%INTERFACENAME%", interfaceName)
              line = line.replace("%INTERFACEID%", Global.iMap.getId(interfaceName).toString)
              line = line.replace("%ENTITYINDEX%", "0")  // TODO: Use an appropriate entity index. Zero is "default."
              outputFile.write(line)
              outputFile.write("\n")
            }
          }

          outputFile.close()
          templateFile.close()
          writeOneStub(rest)
        }
      }
    }
    
    writeOneStub(Global.stubList)
  }

}
