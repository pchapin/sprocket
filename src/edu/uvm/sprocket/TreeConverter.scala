//-----------------------------------------------------------------------
// FILE    : TreeConverter.scala
// SUBJECT : Object to convert CommonTrees into SyntaxTrees.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import edu.uvm.nesc.nesCLexer
import org.antlr.runtime.CommonToken
import org.antlr.runtime.tree._

/**
 * This object has methods for handling abstract syntax tree conversions and other high level AST preparations. Since
 * Scala can only do pattern matching on "case classes" one service provided by this object is conversion to/from the
 * trees produced by ANTLR to instances of a suitably defined case class (ASTNode). Some additional high level methods
 * are also provided.
 */
object TreeConverter {

  /**
   * Convert an ANTLR-style abstract syntax tree into an ASTNode case class instance. Note that some of the information
   * contained inside the ANTLR produced tree is not preserved in the case class instance. Currently this is information
   * not needed by Sprocket.
   * 
   * @param t The ANTLR-style abstract syntax tree to be converted.
   * @return An ASTNode instance that represents the tree.
   */
  def ANTLRToScala(t: Tree): ASTNode = {
    var childList = List[ASTNode]()
    for (i <- 0 until t.getChildCount) {
      // I'm thinking there is probably a better way to do this.
      childList = childList ::: List(ANTLRToScala(t.getChild(i)))
    }
    ASTNode(t.getType, t.getText, childList)
  }


  /**
   * Examines an abstract syntax tree and returns an instance of an appropriate Processor object. A different kind of
   * processor is returned depending on if the AST represents an interface, a configuration, or a module.
   *
   * @param root The abstract syntax tree to examine.
   * @return An appropriate processor instance for this tree or null if no appropriate Processor could be determined.
   */ 
  def createProcessor(root: ASTNode): Processor = {

    def scanSubtree(node: ASTNode): Processor = {
      val nullProcessor: Processor = null
      node match {
        case ASTNode(nesCLexer.INTERFACE, _, children)
          if children(0).tokenType != nesCLexer.INTERFACE_TYPE => new InterfaceProcessor(root)
        case ASTNode(nesCLexer.COMPONENT_DEFINITION, _, children) =>
          children(0).tokenType match {
            case nesCLexer.CONFIGURATION => new ConfigurationProcessor(root)
            case nesCLexer.MODULE => new ModuleProcessor(root)

            // Generic configurations are handled with the same processor as non-generic ones (for now).
            case nesCLexer.GENERIC =>
              children(1).tokenType match {
                case nesCLexer.CONFIGURATION => new ConfigurationProcessor(root)
                case nesCLexer.MODULE => new ModuleProcessor(root)
                case _ => nullProcessor  // This should never arise for syntactically correct input.
              }
            case _ => nullProcessor      // This will be used for binary components (causing problems later).
          }
        case ASTNode(_, _, children) =>
          (nullProcessor /: (children map scanSubtree)) ( (x, y) => if (x != null) x else y )
      }
    }

    scanSubtree(root)
  }


  /**
   * Convert an ASTNode case class instance into an ANTLR-style abstract syntax tree. This is done so the modified trees
   * created by Sprocket can be passed back to Java for final output (the nesC project contains a rewriting method that
   * serializes ANTLR-style abstract syntax trees). The ANTLR-style abstract syntax tree returned does not contain all
   * the information about tokens that would normally be present. Sprocket does not use this information so this is not
   * an immediate problem
   * 
   * @param root The ASTNode instance to convert.
   * @return An ANTLR-style abstract syntax tree.
   */ 
  def scalaToANTLR(root: ASTNode): CommonTree = {

    def processChildren(tree: CommonTree, children: List[ASTNode]): CommonTree = {
      children foreach ( child => tree addChild processSubtree(child) )
      tree
    }


    def processSubtree(node: ASTNode): CommonTree = {
      node match {
        case ASTNode(myType, myText, myChildren) => {
          val freshToken = new CommonToken(myType, myText)
          val freshTree = new CommonTree(freshToken)
          processChildren(freshTree, myChildren)
        }
      }
    }

    processSubtree(root)
  }


  /**
   * Writes the abstract syntax tree to standard output. Each level of the tree is indented relative to the level above
   * it. This method is useful for debugging purposes.
   *
   * @param root The root of the tree to dump.
   */
  def dumpAST(root: ASTNode) {
    var indentationLevel = 0;

    def processSubtree(node: ASTNode) {
      for (i <- 0 until indentationLevel) print("  ")

      // Is there a better way to extract the components of a single ASTNode?
      node match {
        case ASTNode(tokenType, text, children) => {
          println(text)
          indentationLevel = indentationLevel + 1
          children map processSubtree
          indentationLevel = indentationLevel - 1
        }
      }
    }

    processSubtree(root)
  }
}
