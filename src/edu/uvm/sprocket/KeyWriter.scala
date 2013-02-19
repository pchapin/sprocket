//-----------------------------------------------------------------------
// FILE    : KeyWriter.scala
// SUBJECT : An object that writes node keys into the node's runtime environment.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import edu.uvm.rtadmin.BinaryHelpers.{normalizeKeyValue, printAsCInitializerLEW}
import edu.uvm.rtadmin.Database.{lookupPrivateKey, lookupPublicKey}
import java.io._

object KeyWriter {

  private def writePublicKeys(entityNames: String, outputFile: BufferedWriter) {
    val splitEntityNames = entityNames.split(""",s*""")
    outputFile.write("    const struct PublicKey myPublicKeys[] = {\n")
    for (i <- 0 until splitEntityNames.length) {
      val key = lookupPublicKey(splitEntityNames(i))
      val keyPoint = key.getW()
      val keyDataX = normalizeKeyValue(keyPoint.getAffineX().toByteArray)
      val keyDataY = normalizeKeyValue(keyPoint.getAffineY().toByteArray)

      outputFile.write("    { { { \n")
      printAsCInitializerLEW(outputFile, keyDataX)
      outputFile.write("    },\n")
      outputFile.write("    { \n")
      printAsCInitializerLEW(outputFile, keyDataY)
      outputFile.write("    } } }" + (if (i != splitEntityNames.length - 1) "," else "") + "\n")
    }
    outputFile.write("    };\n")
  }


  private def writePrivateKeys(entityNames: String, outputFile: BufferedWriter) {
    val splitEntityNames = entityNames.split(""",s*""")
    outputFile.write("    const struct PrivateMaterial myPrivateKeys[] = {\n")
    for (i <- 0 until splitEntityNames.length) {
      val key = lookupPrivateKey(splitEntityNames(i))
      // TODO: I believe private ECC keys can be one bit longer than the (X, Y) components of the public key.
      val keyData = normalizeKeyValue(key.getS().toByteArray)

      outputFile.write("    { {\n")
      printAsCInitializerLEW(outputFile, keyData)
      outputFile.write("    } }" + (if (i != splitEntityNames.length - 1) "," else "") + "\n")
    }
    outputFile.write("    };\n")
  }


  /**
   * Create the file Spkt_MyKeyC.nc in the specified output folder. This file is generated from a template with the
   * node's public and private key(s).
   *
   * @param settings The configuration settings used to define the location of the templates.
   * @param outputFolder An object representing the folder where the output file will be placed.
   */
  def writeAllKeys(settings: ConfigurationSettings, outputFolder: File) {
    // Copy and specialize the template.
    val Some(templateFolderName) = settings("TemplateFolder")
    val templateFolder   = new File(templateFolderName)
    val templateFileName = new File(templateFolder, "Spkt_MyKeyC.nc")
    val outputFileName = new File(outputFolder, "Spkt_MyKeyC.nc")

    // TODO: Make this more exception safe.
    val templateFile = new BufferedReader(new FileReader(templateFileName))
    val outputFile   = new BufferedWriter(new FileWriter(outputFileName))
    var line: String = null

    val entityOption = settings("NodeEntities")
    val splitEntityNames = entityOption match {
      case None => Array[String]()
      case Some(entityNames) => entityNames.split(""",s*""")
    }

    while ({ line = templateFile.readLine(); line != null }) {
      if (line.contains("%PUBLICKEYS%")) {
        if (entityOption == None)
          outputFile.write("    const struct PublicKey myPublicKeys[] = { };\n")
        else
          entityOption map { writePublicKeys(_, outputFile) }
      }
      else if (line.contains("%PRIVATEKEYS%")) {
        if (entityOption == None)
          outputFile.write("    const struct PrivateMaterial myPrivateKeys[] = { };\n")
        else
          entityOption map { writePrivateKeys(_, outputFile) }
      }
      else {
        line = line.replace("%KEYCOUNT%", splitEntityNames.length.toString)
        outputFile.write(line)
        outputFile.write("\n")
      }
    }

    outputFile.close()
    templateFile.close()
  }
}
