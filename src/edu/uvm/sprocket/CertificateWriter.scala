//-----------------------------------------------------------------------
// FILE    : CertificateWriter.scala
// SUBJECT : An object that writes certificates.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import java.io._
import edu.uvm.rtadmin

object CertificateWriter {

  def writeAllCertificates(settings: ConfigurationSettings, outputFolder: File) {
    // Copy and specialize the template.
    val Some(templateFolderName) = settings("TemplateFolder")
    val templateFolder   = new File(templateFolderName)
    val templateFileName = new File(templateFolder, "Spkt_CertificatesC.nc")
    val outputFileName   = new File(outputFolder, "Spkt_CertificatesC.nc")

    // TODO: Make this more exception safe.
    val templateFile = new BufferedReader(new FileReader(templateFileName))
    val outputFile   = new BufferedWriter(new FileWriter(outputFileName))
    var line: String = null

    while ({ line = templateFile.readLine(); line != null }) {
      if (line.contains("%CERTIFICATES%"))
        rtadmin.Main.printCertificates(outputFile)
      else {
        outputFile.write(line)
        outputFile.write("\n")
      }
    }

    outputFile.close
    templateFile.close
  }

}
