//-----------------------------------------------------------------------
// FILE    : InterfaceProcessor.scala
// SUBJECT : Tree processing class for Spartan RPC interfaces.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import edu.uvm.nesc.nesCLexer


class InterfaceProcessor(root: ASTNode) extends Processor(root) {

  private var information: InterfaceInformation = null
  private var currentDutyID = 1
  private var currentDuty: Duty = null
  private var currentParameterReturnType: String = null

  /**
   * Process the branches of the abstract syntax tree of a duty declarator looking for information about the duties
   * parameters. This method is only used over the duty's parameter list. The declarators it finds are parameter
   * declarators.
   *
   * @param node A particular node in the AST
   * @return A node that will replace the given node (could be an identity replacement).
   */
  private def findDutyParameterInformation(node: ASTNode): ASTNode = {
    node match {
      // Assume that the first identifier is the name of the parameter.
      case ASTNode(nesCLexer.IDENTIFIER_PATH, text, children) => {
        currentDuty.addParameter( (children(0).text, new TypeRepresentation(currentParameterReturnType)) )
        ASTNode(nesCLexer.IDENTIFIER_PATH, text, children)
      }

      // Default case just passes control into the child subtrees.
      case ASTNode(tokenType, text, children) =>
        ASTNode(tokenType, text, children map findDutyParameterInformation)
    }
  }

  /**
   * Process the branches of the abstract syntax tree of a duty declarator looking for the name of the duty. This method
   * is only used in the declarator of the duty itself. It is not used while processing duty parameters.
   *
   * @param node A particular node in the AST.
   * @return A node that will replace the given node (could be an identity replacement).
   */
  private def findDutyInformation(node: ASTNode): ASTNode = {
    node match {
      // Assume that the duty's name is the first identifier in the identifier path.
      case ASTNode(nesCLexer.IDENTIFIER_PATH, text, children) => {
        currentDuty = new Duty(children(0).text, currentDutyID)
        // TODO: It should be an error if the duty ID goes above 15 (must fit into four bits).
        currentDutyID = currentDutyID + 1
        information.addDuty(currentDuty)
        ASTNode(nesCLexer.IDENTIFIER_PATH, text, children)
      }

      // Match each duty parameter as we encounter it. Assume first child is the return type.
      case ASTNode(nesCLexer.PARAMETER, text, children) => {
        currentParameterReturnType = children(0).text
        ASTNode(nesCLexer.PARAMETER, text, children map findDutyParameterInformation)
      }

      // Default case just passes control into the child subtrees.
      case ASTNode(tokenType, text, children) =>
        ASTNode(tokenType, text, children map findDutyInformation)
    }
  }

  /**
   * Process the branches of the abstract syntax tree of an interface definition. This method is used to search for the
   * duty declarations once the name of the interface has been seen and checked.
   *
   * @param node A particular node in the AST.
   * @return A node that will replace the given node (could be an identity replacement).
   * Instances of 'duty' are replaced by 'command.'
   */
  private def collectDuties(node: ASTNode): ASTNode = {
    node match {

      // TODO: Check that only duties are declared and that only void return types are used.
      case ASTNode(nesCLexer.DECLARATION, text, children) =>
        ASTNode(nesCLexer.DECLARATION, text, children map collectDuties)

      // Convert the 'duty' reserved word to 'command.'
      case ASTNode(nesCLexer.DUTY, _, _) =>
        ASTNode(nesCLexer.COMMAND, "command", Nil)

      // When a declarator is found while collecting duties, search for its name.
      case ASTNode(nesCLexer.DECLARATOR, text, children) =>
        ASTNode(nesCLexer.DECLARATOR, text, children map findDutyInformation)

      // Default case just passes control into the child subtrees.
      case ASTNode(tokenType, text, children) =>
        ASTNode(tokenType, text, children map collectDuties)
    }
  }


  override def process(): ASTNode = {

    def processSubtree(node: ASTNode): ASTNode = {
      node match {

        case ASTNode(nesCLexer.INTERFACE, text, children) => {
          // If this interface is not known, just return the AST verbatim.
          if (!Global.iMap.isKnown(children(0).text))
            ASTNode(nesCLexer.INTERFACE, text, children)

          // Otherwise we need to study this interface and learn about it.
          else {
            information = Global.iMap.getInformation(children(0).text)
            ASTNode(nesCLexer.INTERFACE, text, children map collectDuties)
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
