
Sprocket README
Peter C. Chapin <PChapin@vtc.vsc.edu>
=====================================

This folder contains all things related to Sprocket. Sprocket is a precompiler that takes a
SpartanRPC source file and compiles it to pure nesC for processing by the normal nesC compiler.

SpartanRPC and Sprocket are research projects at the University of Vermont.

This folder contains the source code for Sprocket.

Prerequisites
=============

Java development kit   (... I used v1.7u03)
Scala                  (... I used v2.10)
IntelliJ IDEA          (... I used v11.1.2)
LaTeX                  (... required for building the documentation)

Both Linux and Windows platform are supported. It is likely that Sprocket can be built, tested,
and used on other platforms that support Scala 2.10 and IntelliJ IDEA.


Building Sprocket
=================

Sprocket is written in Scala and built with IntelliJ IDEA. First install Java, Scala, and
IntelliJ (Community Edition is fine). Once you have IntelliJ installed you will need to use its
plugin manager to download and install the Scala plugin for IntelliJ. Note that Sprocket uses
several third party libraries but they are provided as part of this repository. Once all these
preliminaries have been handled, you should be able to build Sprocket simply by executing the
appropriate commands from within IntelliJ.


Other Resources
===============

The RTS directory contains Sprocket's runtime support files. These files must be made available
to Sprocket in order for it to compile Spartan RPC programs. The easiest way to do this is to
point the TemplateFolder configuration parameter at this location using Sprocket's configuration
file. See the reference manual for more information.

The Samples directory contains various examples of Spartan RPC programs. See the README files
associated with each example for more information.
