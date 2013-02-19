
nesC Parser README
Peter C. Chapin <PChapin@vtc.vsc.edu>
=====================================

The source code for the parser is in the src folder in the package edu.vtc.nesc. The bulk of the
code is an ANTLR v3 grammar in src/edu/vtc/nesC/nesC.g. This grammar produces the three files
nesC.tokens, nesCLexer.java, and nesCParser.java. These files must be generated before the main
program can be built.

The main program in that package is just a simple wrapper around the parser. It passes the file
named on the command line to the parser and then outputs the abstract syntax tree that was
created (using ANTLR's AST notation). This program does not preprocess the input (that must be
done separately if it is desired).

The ANTLR parser generator is included in this distribution. The two scripts 'build-parser.bat'
(for Windows) and 'build-parser.sh' (for Linux) in the main source folder execute the ANTLR tool
on this grammar to produce nesC.tokens, nesCLexer.java, and nesCParser.java.

Known Issues
------------

This is a work in progress and so is likely to be buggy and incomplete. Here are a few known
issues to consider.

+ The grammar contains some extensions to standard nesC related to SpartanRPC, a secure RPC
  system I am developing. These extensions are intended to be upwardly compatible with regular
  nesC; even with the extensions enabled, regular nesC programs should be parsed properly.

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

The parser believes 'counter' is a type name and thus considers the declaration marked above as
a syntax error since type names can not appear as declarators. While this is clearly not
accpetable in an industrial strength parser, it probably won't cause any real problems in simple
examples.
