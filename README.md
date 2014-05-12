Sprocket
========

This repository contains all things related to Sprocket. Sprocket is a precompiler that takes a
SpartanRPC source file and compiles it to pure nesC for processing by the normal nesC compiler.
SpartanRPC and Sprocket are research projects at the University of Vermont.

Prerequisites
-------------

* Java development kit (I used v1.8u0)
* Scala (I used v2.11.0)
* IntelliJ IDEA (I used v13.1.2)
* LaTeX (required for building the documentation)

Development is done on Linux but it is likely that most things will work on Windows or any other
platform that supports Scala and IntelliJ. Some tweaking may be required on non-Linux platforms.


Building Sprocket
-----------------

Sprocket is written in Scala and built with IntelliJ IDEA. First install Java, Scala, and
IntelliJ (Community Edition is fine). Once you have IntelliJ installed you will need to use its
plugin manager to download and install the Scala plugin for IntelliJ. Note that Sprocket uses
several third party libraries but they are provided as part of this repository. Once all these
preliminaries have been handled, you should be able to build Sprocket simply by simply opening
the project file (Sprocket.iml) and executing the appropriate commands from within IntelliJ.


Other Resources
---------------

The RTS directory contains Sprocket's runtime support files. These files must be made available
to Sprocket in order for it to compile Spartan RPC programs. The easiest way to do this is to
point the TemplateFolder configuration parameter at this location using Sprocket's configuration
file. See the Reference Manual in the doc folder for more information about setting up the
configuration file and about how to use Sprocket in general.

The Samples directory contains various examples of Spartan RPC programs. See the README files
associated with each example for more information.


nesC Grammar
------------

The source code for the nesC parser is in the src folder in the package edu.uvm.nesc. The bulk
of the code is an ANTLR v3 grammar in src/edu/uvm/nesc/nesC.g. This grammar produces the three
files nesC.tokens, nesCLexer.java, and nesCParser.java. These files must be generated before the
main program can be built. The current versions of these files are committed to the repository
so they only need to be regenerated if the grammar is changed. Use the shell script build-parser
(or the corresponding batch file) to generate the parser.

The main program in the nesc package is just a simple wrapper around the parser. It passes the
file named on the command line to the parser and then outputs the abstract syntax tree that was
created (using ANTLR's AST notation). This program does not preprocess the input (that must be
done separately if it is desired).

### Additional Thoughts

This is a work in progress and so is likely to be buggy and incomplete. Issues related to this
grammar are on the GitHub issue tracker along with issues related to Sprocket in general. Here
are a few additional thoughts.

+ The grammar contains some extensions to standard nesC related to SpartanRPC. These extensions
  are intended to be upwardly compatible with nesC; even with the extensions enabled, regular
  nesC programs should be parsed properly.

+ The AST generation may not cover the entire language. Also in some cases spurious tokens that
  should really be suppressed may appear in the AST. These quirks will eventualy be removed.
  Also the structure of the ASTs may change.

+ I may eventually provide a tree grammar to convert the ASTs into real parse trees. I'm not
  clear if I absolutely need that for my own work right now, but in general it would be
  desirable to have this ability.
