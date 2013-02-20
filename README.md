Sprocket
========

This repository contains all things related to Sprocket. Sprocket is a precompiler that takes a
SpartanRPC source file and compiles it to pure nesC for processing by the normal nesC compiler.
SpartanRPC and Sprocket are research projects at the University of Vermont.

Prerequisites
-------------

* Java development kit (I used v1.7u07)
* Scala (I used v2.10)
* IntelliJ IDEA (I used v12.0.4)
* LaTeX (required for building the documentation)

Development is done on Linux but it is likely that most things will work on Windows (or any
other platform that supports Scala and IntelliJ) as well. Some tweaking may be required on
non-Linux platforms.


Building Sprocket
-----------------

Sprocket is written in Scala and built with IntelliJ IDEA. First install Java, Scala, and
IntelliJ (Community Edition is fine). Once you have IntelliJ installed you will need to use its
plugin manager to download and install the Scala plugin for IntelliJ. Note that Sprocket uses
several third party libraries but they are provided as part of this repository. Once all these
preliminaries have been handled, you should be able to build Sprocket simply by executing the
appropriate commands from within IntelliJ.


Other Resources
---------------

The RTS directory contains Sprocket's runtime support files. These files must be made available
to Sprocket in order for it to compile Spartan RPC programs. The easiest way to do this is to
point the TemplateFolder configuration parameter at this location using Sprocket's configuration
file. See the Reference Manual in the doc folder for more information.

The Samples directory contains various examples of Spartan RPC programs. See the README files
associated with each example for more information.


nesC Grammar
------------

The source code for the nesC parser is in the src folder in the package edu.uvm.nesc. The bulk
of the code is an ANTLR v3 grammar in src/edu/uvm/nesC/nesC.g. This grammar produces the three
files nesC.tokens, nesCLexer.java, and nesCParser.java. These files must be generated before the
main program can be built.

The main program in that package is just a simple wrapper around the parser. It passes the file
named on the command line to the parser and then outputs the abstract syntax tree that was
created (using ANTLR's AST notation). This program does not preprocess the input (that must be
done separately if it is desired).

The ANTLR parser generator is included in this repository. The two scripts 'build-parser.bat'
(for Windows) and 'build-parser.sh' (for Linux) in the main source folder execute the ANTLR tool
on this grammar to produce nesC.tokens, nesCLexer.java, and nesCParser.java.

### Known Issues

This is a work in progress and so is likely to be buggy and incomplete. Here are a few known
issues to consider.

+ The grammar contains some extensions to standard nesC related to SpartanRPC. These extensions
  are intended to be upwardly compatible with regular nesC; even with the extensions enabled,
  regular nesC programs should be parsed properly.

+ The AST generation may not cover the entire language. In some cases spurious tokens may appear
  in the ASTs. These will eventualy be removed. Also the structure of the ASTs may change (as I
  learn what I'm doing).

+ Currently the parser aborts with an exception at the first syntax error encountered (at least
  that is the intent). This facilitates testing but it is undesirable behavior in a production
  program. Better error handling may eventually be implemented.

+ I may eventually provide a tree grammar to convert the ASTs into real parse trees (I'm not
  clear if I absolutely need that for my own work right now, but in general it would be
  desirable to have this ability).

+ The parser currently uses ANTLR's backtracking mode. This makes for an easy to read grammar
  (obviously a good thing) but in theory it opens the possibility of parse times that are
  exponential in the number of input tokens. My experience with the parser so far is that in
  real life parse times are just fine. However, it might be desirable to eventually do without
  backtracking mode.

+ Symbol table handling is very simplistic and this causes some errors. For example, consider
  the following (plain C) code:

        typedef int counter;

        void f()
        {
          char *counter;  // Syntax error here!
  
          // ...
        }

  The parser believes 'counter' is a type name and thus considers the declaration marked above
  as a syntax error since type names can not appear as declarators. While this is clearly not
  accpetable in an industrial strength parser, it probably won't cause any real problems in
  small to medium sized examples.
