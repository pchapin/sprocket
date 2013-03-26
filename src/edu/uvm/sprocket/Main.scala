//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : Main program of the Sprocket tool.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import java.io.{File, IOException, PrintStream}
import java.util.{ArrayList, HashMap}
import org.antlr.runtime._
import org.antlr.runtime.tree.CommonTree
import edu.uvm.nesc._
import edu.uvm.sprocket.Main.CommandLineException

/**
 * Object Main coordinates the high level activity of Sprocket. It is responsible for reading the configuration,
 * processing the command line, and running the various other processing phases defined by the program (preprocessing,
 * analysis, rewriting). All the members of class Main are static, reflecting the fact that there is just a single
 * instance of the program.
 *
 * @author Peter C. Chapin
 */
object Main {

  private val globalSymbols = new SymbolTableManager()

  private def initializeGlobalSymbols(): SymbolTableManager = {
    val globalSymbols = new SymbolTableManager()

    // These are type names imported from the TinyOS library.
    val globalTypes = Array("bool", "error_t", "message_t")

    // Configure a global SymbolTableManager. This is necessary because nesC's global scope spans all files in the
    // program. That is, global entities declared in one file are visible in all other files compiled afterward. Right
    // now, however, Sprocket isn't smart enough to deal with this properly. This is a hacked work around: we "prime"
    // the global symbol table with common type names from the TinyOS library. This should work fine for simple cases.
    //
    for (typeName <- globalTypes) {
      globalSymbols.addType(typeName)
    }

    globalSymbols
  }

  /** Exception throw in response to problems with the command line. */
  class CommandLineException(message: String) extends Exception(message)

  /** Exception thrown in response to problems with the temporary folder. */
  class InvalidTemporaryFolderException(message: String) extends Exception(message)

  /** Exception thrown in response to problems with the output folder. */
  class InvalidOutputFolderException(message: String) extends Exception(message)

  // Lists all configurable parameters along with their validation functions.
  private val configurableItems = Map(
    "DebugMode"       -> ConfigurationSettings.basicBooleanValidator _,
    "IncludePaths"    -> ConfigurationSettings.basicStringValidator  _,
    "InputFolder"     -> ConfigurationSettings.basicStringValidator  _,
    "NodeEntities"    -> ConfigurationSettings.basicStringValidator  _,
    "OutputFolder"    -> ConfigurationSettings.basicStringValidator  _,
    "Preprocessor"    -> ConfigurationSettings.basicStringValidator  _,
    "ShowSettings"    -> ConfigurationSettings.basicBooleanValidator _,
    "SourceFile"      -> ConfigurationSettings.basicStringValidator  _,
    "TemplateFolder"  -> ConfigurationSettings.basicStringValidator  _,
    "TemporaryFolder" -> ConfigurationSettings.basicStringValidator  _)

  // The current collection of configurable settings.
  private val settings = new ConfigurationSettings(configurableItems)
  settings.setDefaults(Map(
      "InputFolder"     -> ".",
      "OutputFolder"    -> "Sprocket-Out",
      "Preprocessor"    -> "cpp",
      "TemporaryFolder" -> "Sprocket-Tmp"))


  /**
   * Display the abstract syntax tree both in ANTLR's tree notation and as rewritten source. This method is intended to
   * be used as a debugging aid (and should probably be moved elsewhere at some point).
   *
   * @param abstractSyntax The abstract syntax tree to be dumped.
   */
  private def dumpSyntax(abstractSyntax: CommonTree) {
    val viewer = new SyntaxViewer(System.out, abstractSyntax)
    println("*** AST ==> ")
    viewer.writeAST()
    println()
    println("*** REWRITE ==> ")
    viewer.rewrite()
    println()
  }


  /**
   * Displays a usage message.
   *
   * This method is called when a command line error is encountered to alert the user to the supported command line
   * options.
   */
  private def displayUsage() {
    val message = Array(
      "\nUsage",
      "java -jar Sprocket.jar [options]",
      "",
      "options:",
      "  -config={path} Name of configuration file; ~/.sprocket used by default",
      "",
      "  -d         Activate debug mode. In this mode -f must be used",
      "  -f={path}  Name of file to process (debug mode only!)",
      "  -i={path}  Folder containing input. Default ='.'",
      "  -I={paths} Colon delimited list of folders for #include processing",
      "  -m={path}  Folder containing run time component templates",
      "  -n={name}  A comma separated list of RT entities used for the node",
      "  -o={path}  Folder were final nesC program is placed. Default='Sprocket-Out'",
      "  -p={path}  Program to use for preprocessing. Default='cpp'",
      "  -s         Display configuration settings and perform no additional processing",
      "  -t={path}  Folder where preprocessed output is placed. Default='Sprocket-Tmp'"
    )

    for (line <- message) {
      println(line)
    }
  }


  /**
   * Look up the value associated with a configuration setting. This method is used by displayConfiguration to
   * encapsulate the handling of null values. Since some configuration values are not defined, it is necessary to check
   * for that before trying to display them.
   *
   * @param configurationName The name of the configuration setting to look up.
   * @return The associated value or the string "null" if no such value exists.
   */
  private def configurationValue(configurationName: String): String = {
    val configurationValue = settings(configurationName)
    if (configurationValue == None) {
      "None"
    }
    else {
      val Some(value) = configurationValue
      value
    }
  }


  /**
   * Displays the configuration settings that Sprocket is using.
   *
   * This method dumps all the configuration information that Sprocket currently knows about. It is useful for debugging
   * purposes by allowing the user to compare the settings Sprocket is actually using with the settings the user
   * <em>thinks</em> Sprocket is using.
   */
  private def displayConfiguration() {
    // TODO: This list is getting a little long for this hacked approach. Use a loop.
    println("Sprocket Settings:\n")
    println("DebugMode       = " + configurationValue("DebugMode"))
    println("IncludePaths    = " + configurationValue("IncludePaths"))
    println("InputFolder     = " + configurationValue("InputFolder"))
    println("NodeEntities    = " + configurationValue("NodeEntities"))
    println("OutputFolder    = " + configurationValue("OutputFolder"))
    println("Preprocessor    = " + configurationValue("Preprocessor"))
    println("ShowSettings    = " + configurationValue("ShowSettings"))
    println("SourceFile      = " + configurationValue("SourceFile"))
    println("TemplateFolder  = " + configurationValue("TemplateFolder"))
    println("TemporaryFolder = " + configurationValue("TemporaryFolder"))
  }
    
    
  /**
   * Scan the command line looking for options. This method extracts all name=value pairs from the command line and
   * loads them into the commandLineOptions map. Options with default values are preloaded so they will exist in the map
   * when the method returns regardless of if they are provided on the command line or not.
   * 
   * @param args The command line as given to the main method.
   * @param commandLineOptions A map where information about the various command line options are placed.
   * @throws edu.uvm.Sprocket.Main.CommandLineException if there is a command line syntax error or some other similar
   * command line problem.
   */
  private def analyzeCommandLine(args              : Array[String],
                                 commandLineOptions: HashMap[String, String]) {
    // Install some default (key, value) pairs for command line only options. Note that options corresponding to
    // configuration settings are initialized in the configuration map in initializeConfiguration().
    //
    commandLineOptions.put("d", "false")
    commandLineOptions.put("s", "false")
 
    // Compute the default name of the configuration file.
    var homeFolder = System.getenv("HOME")
    if (homeFolder == null) {
      homeFolder = "."
    }
    val configFileName = homeFolder + System.getProperty("file.separator") + ".sprocket"
    commandLineOptions.put("config", configFileName)

    // Step down the command line looking for interesting things.
    for (argument <- args) {
      if (argument.length() < 2 || argument.charAt(0) != '-') 
        throw new CommandLineException("Non-option argument found")

      val optionComponents = argument.substring(1).split("=")
      if (optionComponents.length == 0) {
        throw new CommandLineException("Illegal option format")
      }

      // This approach makes it easy to customize option handling on a per-option basis.
      optionComponents(0) match {
        case "config" =>
          if (optionComponents.length == 1) {
            throw new CommandLineException("-config option requires a parameter")
          }
          commandLineOptions.put("config", optionComponents(1))
          
        case "d" =>
          if (optionComponents.length != 1) {
            throw new CommandLineException("-d option does not require a parameter")
          }
          commandLineOptions.put("d", "true")
          
        case "f" =>
          if (optionComponents.length == 1) {
            throw new CommandLineException("-f option requires a parameter")
          }
          commandLineOptions.put("f", optionComponents(1))

        case "i" =>
          if (optionComponents.length == 1) {
            throw new CommandLineException("-i option requires a parameter")
          }
          commandLineOptions.put("i", optionComponents(1))

        case "I" =>
          if (optionComponents.length == 1) {
            throw new CommandLineException("-I option requires a parameter")
          }
          var includePath = optionComponents(1)
          if (commandLineOptions.containsKey("I")) {
            includePath = commandLineOptions.get("I") + ":" + includePath
          }
          commandLineOptions.put("I", includePath)

        case "m" =>
          if (optionComponents.length == 1) {
            throw new CommandLineException("-m option requires a parameter")
          }
          commandLineOptions.put("m", optionComponents(1))

        case "n" =>
          if (optionComponents.length == 1) {
            throw new CommandLineException("-n option requires a parameter")
          }
          commandLineOptions.put("n", optionComponents(1))

        case "o" =>
          if (optionComponents.length == 1) {
            throw new CommandLineException("-o option requires a parameter")
          }
          commandLineOptions.put("o", optionComponents(1))

        case "p" =>
          if (optionComponents.length == 1) {
            throw new CommandLineException("-p option requires a parameter")
          }
          commandLineOptions.put("p", optionComponents(1))

        case "s" =>
          if (optionComponents.length != 1) {
            throw new CommandLineException("-s option does not require a parameter")
          }
          commandLineOptions.put("s", "true")

        case "t" =>
          if (optionComponents.length == 1) {
            throw new CommandLineException("-t option requires a parameter")
          }
          commandLineOptions.put("t", optionComponents(1))

        case _ =>
          throw new CommandLineException( "Unrecognized option found: '" + optionComponents(0) + "'")
      }
    }
  }
    
    
  /**
   * Merges command line options into the configuration settings. This method blends the options selected by the user on
   * the command line into the overall configuration information as obtained from the default settings and the config
   * file. In effect this method translates the short (easy) option names into the longer and more verbose configuration
   * setting names.
   * 
   * @param commandLineOptions Map of command line options as entered by the user.
   */
  private def copyOptionsToConfiguration(commandLineOptions: HashMap[String, String]) {
    val it = commandLineOptions.keySet().iterator()
    while (it.hasNext) {
      val key = it.next()
      key match {
        case "d" => settings.put("DebugMode",   commandLineOptions.get(key))
        case "f" => settings.put("SourceFile",  commandLineOptions.get(key))
        case "i" => settings.put("InputFolder", commandLineOptions.get(key))
        case "I" => {
          var includePaths = commandLineOptions.get(key)
          settings("IncludePaths") match {
            case Some(currentPaths) =>
              includePaths = currentPaths + ":" + includePaths
            case None =>  // Do nothing.
          }
          settings.put("IncludePaths", includePaths)
        }
        case "m" => settings.put("TemplateFolder",  commandLineOptions.get(key))
        case "n" => settings.put("NodeEntities",    commandLineOptions.get(key))
        case "o" => settings.put("OutputFolder",    commandLineOptions.get(key))
        case "p" => settings.put("Preprocessor",    commandLineOptions.get(key))
        case "s" => settings.put("ShowSettings",    commandLineOptions.get(key))
        case "t" => settings.put("TemporaryFolder", commandLineOptions.get(key))
        case  _  => // Do nothing.
      }
    }
  }
    
    
  /**
   * Creates an empty temporary folder. This method creates a folder to hold the results of preprocessing. It uses the
   * name as specified by the command line options. If the folder exists, it is first erased. In this way the method
   * ensures that the temporary folder is empty when it returns.
   * 
   * @throws edu.uvm.Sprocket.Main.InvalidTemporaryFolderException if there is a problem creating the temporary folder
   * (for example if there are permission problems).
   */
  private def prepareTemporaryFolder() {
    val temporaryFolderSetting = settings("TemporaryFolder")
    if (temporaryFolderSetting == None)
      throw new InvalidTemporaryFolderException("No temporary folder specified")
    else {
      val Some(temporaryFolderName) = temporaryFolderSetting
      val temporaryFolder = new File(temporaryFolderName)
    
      if (temporaryFolder.exists()) {
        if (!FileManager.deleteFolder(temporaryFolder)) {
          throw new InvalidTemporaryFolderException("Unable to completely delete existing temporary folder")
        }
      }
      if (!temporaryFolder.mkdir())
        throw new InvalidTemporaryFolderException("Unable to create temporary folder")
    }
  }
    
    
  /**
   * Creates an empty output folder. This method creates a folder to hold the results of Sprocket's rewriting. It uses
   * the name as specified by the command line options. If the folder exists, it is first erased. In this way the method
   * ensures that the output folder is empty when it returns.
   * 
   * @throws edu.uvm.Sprocket.Main.InvalidOutputFolderException if there is a problem creating the temporary folder (for
   * example if there are permission problems).
   */
  private def prepareOutputFolder() {
    val outputFolderSetting = settings("OutputFolder")
    if (outputFolderSetting == None)
      throw new InvalidOutputFolderException("No output folder specified")
    else {
      val Some(outputFolderName) = outputFolderSetting
      val outputFolder = new File(outputFolderName)
        
      if (outputFolder.exists()) {
        if (!FileManager.deleteFolder(outputFolder)) {
          throw new InvalidOutputFolderException("Unable to completely delete existing output folder")
        }
      }
      if (!outputFolder.mkdir())
        throw new InvalidOutputFolderException("Unable to create output folder")
    }
  }
    
    
  /**
   * Preprocess the input program. This method runs the standard C preprocessor over all files in the input program,
   * placing the result into a previously specified temporary folder. If the external process returns a bad status
   * value, this method displays a message to the standard output but it otherwise continues working. Under such
   * circumstances it is likely, however, that the resulting preprocessed program is invalid.
   * 
   * @param inputFolder The name of the folder containing the program to preprocess.
   * @param nesCFiles A list of files to preprocess.
   * @param temporaryFolder The name of the folder where the preprocessed result is to go.
   * @throws java.io.IOException if there is a problem with file I/O.
   * @throws java.lang.InterruptedException if the external C preprocessor is interrupted.
   */
  private def preprocess(inputFolder    : File,
                         nesCFiles      : Array[String],
                         temporaryFolder: File) {

    for (fileName <- nesCFiles) {
      val inputName = new File(inputFolder, fileName)
      val outputName = new File(temporaryFolder, fileName)
      println("PREPROCESSING " + inputName.getPath + " TO " + outputName.getPath)

      // Prepare the preprocessor command line.
      val commandLine = new ArrayList[String]()
      val Some(preprocessorName) = settings("Preprocessor")
      commandLine.add(preprocessorName)

      // This is hackish. I need to build up the same environment as the nesC compiler sees. Unfortunately the build
      // scripts (Makefiles, etc) used with TinyOS are very complicated and hard to understand. Thus it's next to
      // impossible (for me) to be sure I have this 100% correct. In any case it should be configurable so that users
      // can specify different platforms with different "extras," to borrow a term from the TinyOS build scripts.
      //
      // Really the notion of separate preprocessing of nesC files is flawed anyway. The nesC compiler actually (in
      // effect) alternates between preprocessing and compiling as it processes the top level configuration and all the
      // components and interfaces it uses. In general you can't accurately preprocess nesC one file at a time like I'm
      // trying to do here.
      //

      commandLine.add("-D__GNUC__=4")             // TODO: Does cpp have a command line option for setting __GNUC__?
      commandLine.add("-D__MSP430_TI_HEADERS__")  // The nesC compiler appears to behave as if this is set.
      commandLine.add("-D__MSP430_HAS_ADC12__")

      val tosDir = "/opt/tinyos-2.1.2/tos"
      commandLine.add(s"-I/usr/msp430/include")
      commandLine.add(s"-I$tosDir/types")
      commandLine.add(s"-I$tosDir/lib/serial")
      commandLine.add(s"-I$tosDir/lib/mac/tkn154")
      commandLine.add(s"-I$tosDir/chips/msp430/adc12")
      commandLine.add(s"-I$tosDir/chips/stm25p")
      commandLine.add(s"-I$tosDir/chips/cc2420_tkn154")
      commandLine.add(s"-I$tosDir/platforms/telosb")
      commandLine.add(s"-I$tosDir/platforms/telosb/mac/tkn154")
      commandLine.add(s"-I$tosDir/platforms/telosb/mac/tkn154/timer")
      commandLine.add(s"-Ibuild/telosb")

      // Now add additional include paths specified in the configuration.
      settings("IncludePaths") match {
        case Some(includePathsString) =>
          val includePaths = includePathsString.split(":")
          for (path <- includePaths) {
            commandLine.add("-I" + path)
          }
        case None =>  // Do nothing.
      }
      commandLine.add(inputName.getPath)
      commandLine.add(outputName.getPath)
      val cppCommand = new ProcessBuilder(commandLine)

      // Run the preprocessor and display its standard error to the console.
      val cpp = cppCommand.start()
      val errorStream = cpp.getErrorStream
      var rawByte = 0
      while ({ rawByte = errorStream.read(); rawByte != -1}) System.out.print(rawByte.toChar)
      val exitStatus = cpp.waitFor()
      if (exitStatus != 0) {
        println("  *** previous operation failed! ***")
      }
    }
  }
    
    
  /**
   * Execute Sprocket's parsing phase. This method parses all the (preprocessed) input files into a collection of
   * abstract syntax trees that are used by the rest of Sprocket. In addition various bits of information about the
   * input files are noticed and recorded.
   * 
   * @param temporaryFolder The folder where the files to parse are stored.
   * @param nesCFiles A list of files to parse.
   * @return A mapping of file names to abstract syntax trees for those files.
   * @throws java.io.IOException if there is a problem with file I/O.
   * @throws org.antlr.runtime.RecognitionException if there is an unhandled parsing problem.
   */
  private def parsingPhase(temporaryFolder: File,
                           nesCFiles      : Array[String]): Map[String, CommonTree] = {

    var ASTCollection = Map[String, CommonTree]()

    for (fileName <- nesCFiles) {
      val inputName = new File(temporaryFolder, fileName)
      println("PARSING " + inputName.getPath)

      val lex = new nesCLexer(new ANTLRFileStream(inputName.getPath))
      val tokens = new CommonTokenStream(lex)
      val parser = new nesCParser(tokens)
      parser.setSymbols(initializeGlobalSymbols())
      val result = parser.nesC_file()

      // For now unconditionally output the abstract syntax tree.
      val antlrAbstractSyntax = result.getTree.asInstanceOf[CommonTree]
      ASTCollection += (fileName -> antlrAbstractSyntax)
    }
    ASTCollection
  }


  /**
   * Process the abstract syntax trees created during parsing. This method transforms the trees by removing all Spartan
   * RPC related constructs and replacing them with appropriate constructs using pure nesC.
   *
   * @param parsedResults A collection of (filename, AST) pairs for all files in the program.
   * @return A collection of (filename, AST) pairs for the transformed program.
   */
  private def processingPhase(outputFolder : File,
                              parsedResults: Map[String, CommonTree]): Map[String, CommonTree] = {

    var processedResults = Map[String, CommonTree]()
    for ((fileName, antlrAbstractSyntax) <- parsedResults) {
      println("PROCESSING " + fileName)
      val abstractSyntax = TreeConverter.ANTLRToScala(antlrAbstractSyntax)
      val treeProcessor = TreeConverter.createProcessor(abstractSyntax)
      val processedAbstractSyntax = treeProcessor.process()
      val processedAntlrAbstractSyntax = TreeConverter.scalaToANTLR(processedAbstractSyntax)
      processedResults += (fileName -> processedAntlrAbstractSyntax)
    }
    processedResults
  }


  /**
   * Outputs the (potentially modified) abstract syntax trees to ordinary nesC files in the output folder. Also copies
   * any additional files required by Sprocket's transformations.
   *
   * @param outputFolder The folder where the rewritten output files are stored.
   * @param processedResults A collection of abstract syntax trees representing the source
   * @throws IOException if there is a problem with file I/O.
   */
  private def rewritingPhase(outputFolder    : File,
                             processedResults: Map[String, CommonTree]) {
    
    // Make path adjustments so that the output paths work as Cygwin paths.
    def windowsToCygwinPath(path: String) = {
      val withUnixDelimiters = path.replace("\\\\", "/").replace("\\", "/")
      if (withUnixDelimiters.startsWith("/cygwin"))
        withUnixDelimiters.substring(7)
      else if (withUnixDelimiters.startsWith("/"))
        "/cygdrive/c" + withUnixDelimiters
      else
        withUnixDelimiters
    }

    for ((fileName, antlrAbstractSyntax) <- processedResults) {
      val outputName = new File(outputFolder, fileName)
      println("REWRITING " + outputName.getPath)
      val outputStream = new PrintStream(outputName)
      val viewer = new SyntaxViewer(outputStream, antlrAbstractSyntax)
      viewer.rewrite()
    }

    // Generate and specialize various components and required supporting materials.
    // TODO: The writeAll* methods have a similar structure. Can that similarity be factored out?
    StubWriter.writeAllStubs(settings, outputFolder)
    SkeletonWriter.writeAllSkeletons(settings, outputFolder)
    CertificateWriter.writeAllCertificates(settings, outputFolder)
    RoleWriter.writeAllGoverningRoles(settings, outputFolder)
    KeyWriter.writeAllKeys(settings, outputFolder)

    // Write the Makefile for the nesC compiler.
    // TODO: Need to have Sprocket automatically fill in the top level configuration.
    // TODO: Need to specify a -I option that names the input folder properly in all cases.
    // TODO: There should probably be some sort of Makefile template.
    // TODO: The location of TinyECC should be configurable.
    val Some(templateFolderName) = settings("TemplateFolder")
    val makefile = new File(outputFolder, "Makefile")
    val makefileStream = new PrintStream(makefile)
    makefileStream.println("COMPONENT=AppC")
    makefileStream.println("NESC_FLAGS += -I..")  // Needed for accessing header files.
    makefileStream.println("NESC_FLAGS += -I" + templateFolderName) // + windowsToCygwinPath(templateFolderName))
    makefileStream.println("NESC_FLAGS += -I$(TOSROOT)/apps/TinyECC-2.0")
    makefileStream.println("CFLAGS     += -DSECP160K1")

    // TinyECC optimizations
    makefileStream.println("## NN")
    makefileStream.println("#CFLAGS += -DBARRETT_REDUCTION  # Barrett reduction")
    makefileStream.println("#CFLAGS += -DHYBRID_MULT        # Hybrid multipliation")
    makefileStream.println("#CFLAGS += -DHYBRID_SQR         # Hybrid squre")
    makefileStream.println("#CFLAGS += -DCURVE_OPT          # Optimization for secg curve")
    makefileStream.println("## ECC")
    makefileStream.println("#CFLAGS += -DPROJECTIVE         # Projective coordinate")
    makefileStream.println("#CFLAGS += -DSLIDING_WIN        # Sliding window method, window size is defined in ECC.h")
    makefileStream.println("## ECDSA")
    makefileStream.println("#CFLAGS += -DSHAMIR_TRICK       # Shamir trick, windows size is defined in ECDSAM.nc")

    // The largest possible certificate form (intersection certificate) is 166 bytes long. However, the certificates are
    // sent in four fragments with a 16 bit checksum at the end of the last fragment. Extra space is also needed to
    // account for certificates that are note a multiple of four in length (all the "leftovers" are sent in the last
    // fragment). This means the largest packet payload needed is 166/4 + 3 + 2 = 46. It should also be noted that
    // session key negotiation messages are 44 bytes in length (or maybe 46 bytes depending on padding).
    // 
    makefileStream.println("CFLAGS += -I$(TOSDIR)/lib/printf")
    makefileStream.println("CFLAGS += -DPRINTF_BUFFER_SIZE=512")  // Default is 256 which is not enough.
    makefileStream.println("MSG_SIZE=46")
    makefileStream.println("include $(MAKERULES)")
    makefileStream.close()
  }
    

  def main(args: Array[String]) {
    var returnCode = 0
    try {
      // Deal with the command line.
      val commandLineOptions = new HashMap[String, String]()
      analyzeCommandLine(args, commandLineOptions)
            
      // Deal with the configuration file and set up the final configuration.
      val configurationFileName = commandLineOptions.get("config")
      if (configurationFileName != null) settings.readConfigurationFile(configurationFileName)
      copyOptionsToConfiguration(commandLineOptions)

      // Check for debug mode iff -f selected.
      val debugMode = settings("DebugMode") match {
        case Some(modeString) => modeString == "true"
        case None             => false
      }
      val fileSelected = (settings("SourceFile") != None)
      if ((debugMode && !fileSelected) || (!debugMode && fileSelected)) {
        println("\nERROR: Debug mode if and only if -f selected")
        System.exit(1)
      }
            
      // If requested, just display the resulting configuration settings and terminate.
      settings("ShowSettings") match {
        case None => // Do nothing.

        case Some(showSettingsString) =>
          if (showSettingsString == "true") {
            displayConfiguration()
            if (debugMode) {
              System.out.print("\nDEBUG mode active! Processing file: ")
              val Some(fileName) = settings("SourceFile")
              println(fileName)
            }
            println("\nNo further processing done: -s selected")
            System.exit(1)
          }
      }

      // Make sure we know where the templates folder is located.
      if (settings("TemplateFolder") == None) {
        println("\nERROR: 'TemplateFolder' not set. Unable to proceed!\n")
        System.exit(1)
      }

      // Proceed with the main job.
      prepareTemporaryFolder()
      prepareOutputFolder()

      val Some(inputFolderName    ) = settings("InputFolder"    )
      val Some(temporaryFolderName) = settings("TemporaryFolder")
      val Some(outputFolderName   ) = settings("OutputFolder"   )

      val inputFolder     = new File(inputFolderName    )
      val temporaryFolder = new File(temporaryFolderName)
      val outputFolder    = new File(outputFolderName   )
      val nesCFiles =
        if (!debugMode)
          inputFolder.list(new nesCFilter())
        else {
          val Some(sourceFileName) = settings("SourceFile")
          Array(sourceFileName)
        }
            
      println("\nPREPROCESSING")
      println("=============")
      preprocess(inputFolder, nesCFiles, temporaryFolder)
           
      println("\nPARSING")
      println("=======")
      val parsedResults = parsingPhase(temporaryFolder, nesCFiles)

      println("\nPROCESSING")
      println("==========")
      val processedResults = processingPhase(outputFolder, parsedResults)

      println("\nREWRITING")
      println("=========")
      rewritingPhase(outputFolder, processedResults)
    }
    catch {
      case e: CommandLineException => {
        println("Bad Command Line: " + e.getMessage)
        displayUsage()
        returnCode = 1
      }
      case e: InvalidOutputFolderException => {
        println("Bad Output Folder: " + e.getMessage)
        returnCode = 1
      }
      case e: IOException => {
        println("I/O Error: " + e.getMessage)
        returnCode = 1
      }
      case e: RecognitionException => {
        e.printStackTrace()
        returnCode = 1
      }
    }

    System.exit(returnCode)
  }

}
