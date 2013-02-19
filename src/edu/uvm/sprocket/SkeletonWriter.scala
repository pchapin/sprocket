//-----------------------------------------------------------------------
// FILE    : SkeletonWriter.scala
// SUBJECT : An object that writes skeletons.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import java.io.{BufferedReader, BufferedWriter, File, FileReader, FileWriter}

object SkeletonWriter {

  private def writeDutyTasks(outputFile: BufferedWriter, interfaceName: String) {
    val information = Global.iMap.getInformation(interfaceName)
    for (duty <- information.getDuties) {
      for ( (parameterName, parameterType) <- duty.getParameters) {
        outputFile.write("    " + parameterType.name + " " + parameterName + ";\n")
      }
      outputFile.write("    task void " + duty.name + "()\n")
      outputFile.write("    {\n")
      outputFile.write("        call " + interfaceName + "." + duty.name + "(")
      var parameterCounter = 0
      for ( (parameterName, _) <- duty.getParameters) {
        outputFile.write(parameterName)
        parameterCounter = parameterCounter + 1
        if (parameterCounter != duty.getParameters.length) outputFile.write(", ")
      }
      outputFile.write(");\n")
      outputFile.write("    }\n")
    }
  }


  private def writeInvokeDuty(outputFile    : BufferedWriter,
                              interfaceName : String,
                              roleIdentifier: String) {
    val information = Global.iMap.getInformation(interfaceName)

    // TODO: Right now we can only handle a single duty because we can't distinguish between them.
    val duty :: _ = information.getDuties
    for ( (parameterName, parameterType) <- duty.getParameters) {
      outputFile.write("                memcpy(&" + parameterName + ", argp, sizeof(" + parameterType.name + "));\n")
      outputFile.write("                argp += sizeof(" + parameterType.name + ");\n")
    }
    outputFile.write("                post " + duty.name +"();\n")
  }


  def writeAllSkeletons(settings: ConfigurationSettings, outputFolder: File) {
    
    def writeOneSkeleton(skeletonList: List[(String, String, String, String)]) {
      skeletonList match {
        case Nil => ()
        case (skeletonName, interfaceName, componentName, roleIdentifier) :: rest => {
          // Copy and specialize the skeleton component.
          val Some(templateFolderName) = settings("TemplateFolder")
          val templateFolder   = new File(templateFolderName)
          val templateFileName = new File(templateFolder, "Spkt_SkeletonTemplateC.nc")
          val outputFileName   = new File(outputFolder, skeletonName + ".nc")

          // Now specialize the skeleton...
          // TODO: Make this more exception safe.
          val templateFile = new BufferedReader(new FileReader(templateFileName))
          val outputFile   = new BufferedWriter(new FileWriter(outputFileName))
          var line: String = null

          while ({ line = templateFile.readLine(); line != null }) {
            if (line.contains("%DUTYTASKS%"))
              writeDutyTasks(outputFile, interfaceName)
            else if (line.contains("%INVOKEDUTY%"))
              writeInvokeDuty(outputFile, interfaceName, roleIdentifier)
            else {
              line = line.replace("%SKELETONNAME%", skeletonName)
              line = line.replace("%INTERFACENAME%", interfaceName)
              line = line.replace("%INTERFACEID%", Global.iMap.getId(interfaceName).toString)
              line = line.replace("%COMPONENTID%", Global.cMap.getId(componentName).toString)
              outputFile.write(line)
              outputFile.write("\n")
            }
          }

          outputFile.close
          templateFile.close
          writeOneSkeleton(rest)
        }
      }
    }
    
    writeOneSkeleton(Global.skeletonList)
  }

}
