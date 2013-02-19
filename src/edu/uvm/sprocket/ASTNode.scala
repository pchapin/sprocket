//-----------------------------------------------------------------------
// FILE    : ASTNode.scala
// SUBJECT : Class representing nodes the abstract syntax tree.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

case class ASTNode(tokenType: Int, text: String, children: List[ASTNode])
