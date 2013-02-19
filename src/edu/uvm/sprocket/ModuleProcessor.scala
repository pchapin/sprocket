//-----------------------------------------------------------------------
// FILE    : ModuleProcessor.scala
// SUBJECT : Tree processing class for Spartan RPC modules.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import edu.uvm.nesc.nesCLexer

class ModuleProcessor(root: ASTNode) extends Processor(root) {

  private var myName: String = ""

  override def process(): ASTNode = {

    def dequote(s: String): String = s.substring(1, s.length - 1)

    def processSubtree(node: ASTNode): ASTNode = {
      node match {
        // Record my name when I see it.
        case ASTNode(nesCLexer.MODULE, text, children) => {
            myName = children(0).text
            ASTNode(nesCLexer.MODULE, text, children map processSubtree)
        }

        // Convert duty definitions into command definitions.
        case ASTNode(nesCLexer.DUTY, text, children) =>
          ASTNode(nesCLexer.COMMAND, "command", children map processSubtree)

        // Convert duty postings into command invocations.
        // Note that duty postings (and only duty postings) use qualified names.
        case ASTNode(nesCLexer.POSTFIX_EXPRESSION, text, children) =>
          if (children(0).tokenType == nesCLexer.POST &&
              children.length >= 3 &&
              children(2).tokenType == nesCLexer.DOT) {

            val postToken :: other = children
            val newChildren =
              ASTNode(nesCLexer.CALL, "call", postToken.children) :: (other map processSubtree)
            ASTNode(nesCLexer.POSTFIX_EXPRESSION, text, newChildren)
          }
          else {
            ASTNode(nesCLexer.POSTFIX_EXPRESSION, text, children map processSubtree)
          }

        // Whenever I see a remote interface (in a specification), add a skeleton.
        case ASTNode(nesCLexer.INTERFACE_TYPE, text, children) => {
          if (children(0).text != "remote")
            ASTNode(nesCLexer.INTERFACE_TYPE, text, children map processSubtree)
          else {
            if (children(1).tokenType != nesCLexer.STRING_LITERAL) {
              val _ :: tail = children
              val skeletonName = Global.uniqueName
              Global.skeletonList =
                (skeletonName, children(1).text, myName, "") :: Global.skeletonList
              ASTNode(nesCLexer.INTERFACE_TYPE, text, tail map processSubtree)
            }
            else {
              val _ :: keyToken :: tail = children
              val skeletonName = Global.uniqueName
              Global.skeletonList =
                (skeletonName, children(2).text, myName, dequote(keyToken.text)) :: Global.skeletonList
              ASTNode(nesCLexer.INTERFACE_TYPE, text, tail map processSubtree)
            }
          }
        }

        // Default case just passes control into the child subtrees.
        case ASTNode(tokenType, text, children) =>
          ASTNode(tokenType, text, children map processSubtree)
      }
    }

    processSubtree(root)
  }

}
