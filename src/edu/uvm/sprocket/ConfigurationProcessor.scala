//-----------------------------------------------------------------------
// FILE    : ConfigurationProcessor.scala
// SUBJECT : Tree processing class for Spartan RPC configurations.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import edu.uvm.nesc.nesCLexer

/**
 * Class to process Sprocket-RPC style configurations and convert them to pure nesC configurations.
 */
class ConfigurationProcessor(root: ASTNode) extends Processor(root) {

  private var myName: String = ""

  /**
   * Rewrite the dynamic wire connecting the given source and destination endpoints. This method returns a NULL token
   * containing children for a new components line declaring the stub component and the necessary radio support
   * components as well as children specifying the way in which those new components are to be wired.
   *
   * @param sourceEndpoint An ASTNode that describes the (static) source of the original wire.
   * @param destinationEndpoint An ASTNode that describes the (dynamic) destination of the original wire.
   * @param authorizationRequired true if this dynamic wire needs to use RT_0 authorization.
   * @return A new ASTNode containing the necessary rewriting. This node is intended to replace the original dynamic
   * wire connection node in the AST.
   */
  private def rewriteDynamicWire(sourceEndpoint       : ASTNode,
                                 destinationEndpoint  : ASTNode,
                                 authorizationRequired: Boolean) = {
    val componentManager = destinationEndpoint.children(0).text
    val sourceComponent  = sourceEndpoint.children(0).text
    val sourceInterface  = sourceEndpoint.children(1).text
    val remoteInterface  = destinationEndpoint.children(1).text
    val stubName         = Global.uniqueName

    // Remember stub information for later processing.
    Global.stubList = (stubName, remoteInterface, authorizationRequired) :: Global.stubList

    val connectionDirection  = ASTNode(nesCLexer.STRING_LITERAL, "->", List())

    val amMessageNumericArgument =
      ASTNode( nesCLexer.NUMBER, Global.activeMessageType.toString, List() )
    val amMessageSenderArgument =
      ASTNode( nesCLexer.POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(amMessageNumericArgument) )
    val amMessageSenderArguments =
      ASTNode( nesCLexer.COMPONENT_ARGUMENTS, "COMPONENT_ARGUMENTS", List(amMessageSenderArgument) )

    // Declare all the additional components needed.
    val basicComponentsLine =
      ASTNode(nesCLexer.COMPONENTS, "components",
              List(/* ASTNode(nesCLexer.COMPONENT_DECLARATION, "COMPONENT_DECLARATION",
                           List(ASTNode(nesCLexer.RAW_IDENTIFIER, "MainC", List()))), */
                   ASTNode(nesCLexer.COMPONENT_DECLARATION, "COMPONENT_DECLARATION",
                           List(ASTNode(nesCLexer.RAW_IDENTIFIER, stubName, List()))),
                   ASTNode(nesCLexer.COMPONENT_DECLARATION, "COMPONENT_DECLARATION",
                           List(ASTNode(nesCLexer.RAW_IDENTIFIER, "Spkt_InitializeC", List()))),
                   ASTNode(nesCLexer.COMPONENT_DECLARATION, "COMPONENT_DECLARATION",
                           List(ASTNode(nesCLexer.COMPONENT_INSTANTIATION, "COMPONENT_INSTANTIATION",
                                        List(ASTNode(nesCLexer.RAW_IDENTIFIER, "AMSenderC", List()),
                                             amMessageSenderArguments))))))

    val componentsLine =
      if (authorizationRequired) {
        val ASTNode(token, text, children) = basicComponentsLine
        ASTNode(token, text,
                ASTNode(nesCLexer.COMPONENT_DECLARATION, "COMPONENT_DECLARATION",
                        List(ASTNode(nesCLexer.RAW_IDENTIFIER, "ACRT0C", List()))) :: children)
      }
      else {
        val ASTNode(token, text, children) = basicComponentsLine
        ASTNode(token, text,
                ASTNode(nesCLexer.COMPONENT_DECLARATION, "COMPONENT_DECLARATION",
                        List(ASTNode(nesCLexer.RAW_IDENTIFIER, "ACNullC", List()))) :: children)
      }

    // Helper function for creating connection AST nodes.
    def makeConnection( endpoints: (String, String, String, String) ): ASTNode = {
      val (sourceComponent, sourceInterface, destinationComponent, destinationInterface) = endpoints
      ASTNode(nesCLexer.CONNECTION, "CONNECTION",
              List(ASTNode(nesCLexer.STRING_LITERAL, "->", List()),
                   ASTNode(nesCLexer.IDENTIFIER_PATH, "IDENTIFIER_PATH",
                           List(ASTNode(nesCLexer.RAW_IDENTIFIER, sourceComponent, List()),
                                ASTNode(nesCLexer.RAW_IDENTIFIER, sourceInterface, List()))),
                   ASTNode(nesCLexer.IDENTIFIER_PATH, "IDENTIFIER_PATH",
                           List(ASTNode(nesCLexer.RAW_IDENTIFIER, destinationComponent, List()),
                                ASTNode(nesCLexer.RAW_IDENTIFIER, destinationInterface, List())))))
    }

    // The various connections that we need.
    val basicConnectionInformation = List(
      (sourceComponent,     sourceInterface,      stubName,             remoteInterface    ),
      (stubName,           "ComponentManager",    componentManager,     "ComponentManager" ),
      (stubName,           "Packet",              "AMSenderC",          "Packet"           ),
      (stubName,           "AMSend",              "AMSenderC",          "AMSend"           ),
      ("RPCControlC",      "StubControl",         stubName,             "RPCControl"       ))

    val connectionInformation =
      if (authorizationRequired)
        (stubName, "AuthorizationClient", "ACRT0C",  "AuthorizationClient") :: basicConnectionInformation
      else
        (stubName, "AuthorizationClient", "ACNullC", "AuthorizationClient") :: basicConnectionInformation


    // The node representing the new material collected together.
    ASTNode(nesCLexer.NULL, "NULL", componentsLine::(connectionInformation map makeConnection))
  }


  override def process(): ASTNode = {

    def dequote(s: String): String = s.substring(1, s.length - 1)

    def processSubtree(node: ASTNode): ASTNode = {
      node match {

        // Record my name when I see it.
        case ASTNode(nesCLexer.COMPONENT_DEFINITION, text, children) => {
          myName = children(1).text
          ASTNode(nesCLexer.COMPONENT_DEFINITION, text, children map processSubtree)
        }

        case ASTNode(nesCLexer.CONNECTION, text, children) => {
          val connectorType = children(0).text

          // TODO: Isn't this a bug? It's fine to use '=' for normal wires.
          // if (connectorType == "=")
          //   throw new CompilationException("Dynamic wires not supported in external connections")

          val sourceEndpoint = if (connectorType == "->") children(1) else children(2)
          val destinationEndpoint = if (connectorType == "->") children(2) else children(1)

          if (sourceEndpoint.tokenType == nesCLexer.DYNAMIC_IDENTIFIER_PATH) {
            throw new CompilationException("Dynamic wire source must be statically specified")
          }
          if (destinationEndpoint.tokenType == nesCLexer.DYNAMIC_IDENTIFIER_PATH) {
            // TODO: Get "as" entity from dynamic wire and store in the stubList for the StubWriter.
            val authorizationRequired = if (children.length == 4) true else false
            rewriteDynamicWire(sourceEndpoint, destinationEndpoint, authorizationRequired)
          }
          else {
            // Nothing interesting here.
            ASTNode(nesCLexer.CONNECTION, text, children map processSubtree)
          }
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
