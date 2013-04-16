// $ANTLR 3.4 nesC.g 2013-04-16 11:33:28

    package edu.uvm.nesc;
    import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class nesCParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADDRESS_OF", "AMP", "AND", "ARGUMENT_LIST", "ARRAY_ELEMENT_SELECTION", "ARROW", "AS", "ASSIGN", "ASSUMING", "ASYNC", "ATOMIC", "ATTRIBUTE", "AUTO", "BITANDASSIGN", "BITCOMPLEMENT", "BITOR", "BITORASSIGN", "BITXOR", "BITXORASSIGN", "BREAK", "CALL", "CASE", "CAST", "CHAR", "CHARACTER_LITERAL", "COMMA", "COMMAND", "COMMENT1", "COMMENT2", "COMMENT3", "COMPONENT", "COMPONENTS", "COMPONENT_ARGUMENTS", "COMPONENT_DECLARATION", "COMPONENT_DEFINITION", "COMPONENT_INSTANTIATION", "COMPONENT_KIND", "COMPONENT_PARAMETER_LIST", "COMPOUND_STATEMENT", "CONFIGURATION", "CONNECTION", "CONST", "CONSTANT", "CONTINUE", "DECLARATION", "DECLARATOR", "DECLARATOR_ARRAY_MODIFIER", "DECLARATOR_LIST", "DECLARATOR_PARAMETER_LIST_MODIFIER", "DEC_NUMBER", "DEFAULT", "DEREFERENCE", "DIGIT", "DIVASSIGN", "DIVIDE", "DO", "DOT", "DOUBLE", "DUTY", "DYNAMIC_IDENTIFIER_PATH", "ELLIPSIS", "ELSE", "ENABLE", "ENUM", "ENUMERATOR", "EQUAL", "EVENT", "EXTERN", "FILE", "FLOAT", "FOR", "FOR_CONDITION", "FOR_INITIALIZE", "FOR_ITERATION", "FUNCTION_DEFINITION", "GCCATTRIBUTE", "GENERIC", "GOTO", "GREATER", "GREATEREQUAL", "HASH", "HEX_DIGIT", "HEX_NUMBER", "IDENTIFIER_PATH", "IF", "IMPLEMENTATION", "INITIALIZER_LIST", "INIT_DECLARATOR", "INLINE", "INT", "INT16_T", "INT32_T", "INT64_T", "INT8_T", "INTERFACE", "INTERFACE_TYPE", "LABELED_STATEMENT", "LBRACE", "LBRACKET", "LESS", "LESSEQUAL", "LINE_DIRECTIVE", "LONG", "LPARENS", "LSHIFT", "LSHIFTASSIGN", "MINUS", "MINUSASSIGN", "MINUSMINUS", "MODASSIGN", "MODULE", "MODULUS", "MULASSIGN", "NEW", "NORACE", "NOT", "NOTEQUAL", "NULL", "NUMBER", "NUMBER_PREFIX", "NUMBER_SUFFIX", "NXLE_UINT16_T", "NXLE_UINT32_T", "NXLE_UINT64_T", "NXLE_UINT8_T", "NX_STRUCT", "NX_UINT16_T", "NX_UINT32_T", "NX_UINT64_T", "NX_UINT8_T", "NX_UNION", "OR", "PARAMETER", "PARAMETER_LIST", "PLUS", "PLUSASSIGN", "PLUSPLUS", "POINTER_QUALIFIER", "POST", "POSTFIX_EXPRESSION", "POST_DECREMENT", "POST_INCREMENT", "PRE_DECREMENT", "PRE_INCREMENT", "PROVIDES", "RAW_IDENTIFIER", "RBRACE", "RBRACKET", "REGISTER", "REMOTE", "REQUIRES", "RESTRICT", "RETURN", "RPARENS", "RSHIFT", "RSHIFTASSIGN", "SHORT", "SIGNAL", "SIGNED", "SIZEOF", "SIZEOF_EXPRESSION", "SIZEOF_TYPE", "SPECIFICATION", "STAR", "STATEMENT", "STATIC", "STRING_LITERAL", "STRUCT", "SWITCH", "TASK", "TYPEDEF", "UINT16_T", "UINT32_T", "UINT64_T", "UINT8_T", "UNARY_MINUS", "UNARY_PLUS", "UNION", "UNSIGNED", "USES", "VOID", "VOLATILE", "WHILE", "WHITESPACE", "':'", "';'", "'<-'", "'?'"
    };

    public static final int EOF=-1;
    public static final int T__189=189;
    public static final int T__190=190;
    public static final int T__191=191;
    public static final int T__192=192;
    public static final int ABSTRACT=4;
    public static final int ADDRESS_OF=5;
    public static final int AMP=6;
    public static final int AND=7;
    public static final int ARGUMENT_LIST=8;
    public static final int ARRAY_ELEMENT_SELECTION=9;
    public static final int ARROW=10;
    public static final int AS=11;
    public static final int ASSIGN=12;
    public static final int ASSUMING=13;
    public static final int ASYNC=14;
    public static final int ATOMIC=15;
    public static final int ATTRIBUTE=16;
    public static final int AUTO=17;
    public static final int BITANDASSIGN=18;
    public static final int BITCOMPLEMENT=19;
    public static final int BITOR=20;
    public static final int BITORASSIGN=21;
    public static final int BITXOR=22;
    public static final int BITXORASSIGN=23;
    public static final int BREAK=24;
    public static final int CALL=25;
    public static final int CASE=26;
    public static final int CAST=27;
    public static final int CHAR=28;
    public static final int CHARACTER_LITERAL=29;
    public static final int COMMA=30;
    public static final int COMMAND=31;
    public static final int COMMENT1=32;
    public static final int COMMENT2=33;
    public static final int COMMENT3=34;
    public static final int COMPONENT=35;
    public static final int COMPONENTS=36;
    public static final int COMPONENT_ARGUMENTS=37;
    public static final int COMPONENT_DECLARATION=38;
    public static final int COMPONENT_DEFINITION=39;
    public static final int COMPONENT_INSTANTIATION=40;
    public static final int COMPONENT_KIND=41;
    public static final int COMPONENT_PARAMETER_LIST=42;
    public static final int COMPOUND_STATEMENT=43;
    public static final int CONFIGURATION=44;
    public static final int CONNECTION=45;
    public static final int CONST=46;
    public static final int CONSTANT=47;
    public static final int CONTINUE=48;
    public static final int DECLARATION=49;
    public static final int DECLARATOR=50;
    public static final int DECLARATOR_ARRAY_MODIFIER=51;
    public static final int DECLARATOR_LIST=52;
    public static final int DECLARATOR_PARAMETER_LIST_MODIFIER=53;
    public static final int DEC_NUMBER=54;
    public static final int DEFAULT=55;
    public static final int DEREFERENCE=56;
    public static final int DIGIT=57;
    public static final int DIVASSIGN=58;
    public static final int DIVIDE=59;
    public static final int DO=60;
    public static final int DOT=61;
    public static final int DOUBLE=62;
    public static final int DUTY=63;
    public static final int DYNAMIC_IDENTIFIER_PATH=64;
    public static final int ELLIPSIS=65;
    public static final int ELSE=66;
    public static final int ENABLE=67;
    public static final int ENUM=68;
    public static final int ENUMERATOR=69;
    public static final int EQUAL=70;
    public static final int EVENT=71;
    public static final int EXTERN=72;
    public static final int FILE=73;
    public static final int FLOAT=74;
    public static final int FOR=75;
    public static final int FOR_CONDITION=76;
    public static final int FOR_INITIALIZE=77;
    public static final int FOR_ITERATION=78;
    public static final int FUNCTION_DEFINITION=79;
    public static final int GCCATTRIBUTE=80;
    public static final int GENERIC=81;
    public static final int GOTO=82;
    public static final int GREATER=83;
    public static final int GREATEREQUAL=84;
    public static final int HASH=85;
    public static final int HEX_DIGIT=86;
    public static final int HEX_NUMBER=87;
    public static final int IDENTIFIER_PATH=88;
    public static final int IF=89;
    public static final int IMPLEMENTATION=90;
    public static final int INITIALIZER_LIST=91;
    public static final int INIT_DECLARATOR=92;
    public static final int INLINE=93;
    public static final int INT=94;
    public static final int INT16_T=95;
    public static final int INT32_T=96;
    public static final int INT64_T=97;
    public static final int INT8_T=98;
    public static final int INTERFACE=99;
    public static final int INTERFACE_TYPE=100;
    public static final int LABELED_STATEMENT=101;
    public static final int LBRACE=102;
    public static final int LBRACKET=103;
    public static final int LESS=104;
    public static final int LESSEQUAL=105;
    public static final int LINE_DIRECTIVE=106;
    public static final int LONG=107;
    public static final int LPARENS=108;
    public static final int LSHIFT=109;
    public static final int LSHIFTASSIGN=110;
    public static final int MINUS=111;
    public static final int MINUSASSIGN=112;
    public static final int MINUSMINUS=113;
    public static final int MODASSIGN=114;
    public static final int MODULE=115;
    public static final int MODULUS=116;
    public static final int MULASSIGN=117;
    public static final int NEW=118;
    public static final int NORACE=119;
    public static final int NOT=120;
    public static final int NOTEQUAL=121;
    public static final int NULL=122;
    public static final int NUMBER=123;
    public static final int NUMBER_PREFIX=124;
    public static final int NUMBER_SUFFIX=125;
    public static final int NXLE_UINT16_T=126;
    public static final int NXLE_UINT32_T=127;
    public static final int NXLE_UINT64_T=128;
    public static final int NXLE_UINT8_T=129;
    public static final int NX_STRUCT=130;
    public static final int NX_UINT16_T=131;
    public static final int NX_UINT32_T=132;
    public static final int NX_UINT64_T=133;
    public static final int NX_UINT8_T=134;
    public static final int NX_UNION=135;
    public static final int OR=136;
    public static final int PARAMETER=137;
    public static final int PARAMETER_LIST=138;
    public static final int PLUS=139;
    public static final int PLUSASSIGN=140;
    public static final int PLUSPLUS=141;
    public static final int POINTER_QUALIFIER=142;
    public static final int POST=143;
    public static final int POSTFIX_EXPRESSION=144;
    public static final int POST_DECREMENT=145;
    public static final int POST_INCREMENT=146;
    public static final int PRE_DECREMENT=147;
    public static final int PRE_INCREMENT=148;
    public static final int PROVIDES=149;
    public static final int RAW_IDENTIFIER=150;
    public static final int RBRACE=151;
    public static final int RBRACKET=152;
    public static final int REGISTER=153;
    public static final int REMOTE=154;
    public static final int REQUIRES=155;
    public static final int RESTRICT=156;
    public static final int RETURN=157;
    public static final int RPARENS=158;
    public static final int RSHIFT=159;
    public static final int RSHIFTASSIGN=160;
    public static final int SHORT=161;
    public static final int SIGNAL=162;
    public static final int SIGNED=163;
    public static final int SIZEOF=164;
    public static final int SIZEOF_EXPRESSION=165;
    public static final int SIZEOF_TYPE=166;
    public static final int SPECIFICATION=167;
    public static final int STAR=168;
    public static final int STATEMENT=169;
    public static final int STATIC=170;
    public static final int STRING_LITERAL=171;
    public static final int STRUCT=172;
    public static final int SWITCH=173;
    public static final int TASK=174;
    public static final int TYPEDEF=175;
    public static final int UINT16_T=176;
    public static final int UINT32_T=177;
    public static final int UINT64_T=178;
    public static final int UINT8_T=179;
    public static final int UNARY_MINUS=180;
    public static final int UNARY_PLUS=181;
    public static final int UNION=182;
    public static final int UNSIGNED=183;
    public static final int USES=184;
    public static final int VOID=185;
    public static final int VOLATILE=186;
    public static final int WHILE=187;
    public static final int WHITESPACE=188;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public nesCParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public nesCParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return nesCParser.tokenNames; }
    public String getGrammarFileName() { return "nesC.g"; }


        // This is mostly just a placeholder.
        private final int VERSION = 1;

        private SymbolTableManager symbols;
        
        // The global symbol table contains information about global symbols defined in other files.
        public void setSymbols(SymbolTableManager globalSymbols)
        {
            symbols = globalSymbols;
        }

    //    // The following two magic methods, together with the @rulecatch section below cause the
    //    // parser to exit immediately with an exception when an error is encountered. This is useful
    //    // for testing but is probably not desired in a production system. I'm not sure right now
    //    // how to provide both behaviors in the same executable. I'll figure that out later!
    //    //
    //    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
    //        throws RecognitionException
    //    {
    //        throw new MismatchedTokenException(ttype, input);
    //    }
    //    
    //    public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
    //        throws RecognitionException
    //    {
    //        throw e;
    //    }

        // The following two overrides provide enhanced error messages that are useful for debugging
        // grammar problems. The messages produced are not very suitable for end users so these
        // methods should probably be removed before a "production" version of Sprocket is released.
        //
        // If you run ANTLR with the -dfa option, it will generate DOT files showing decision state
        // diagrams. You can use these files to look up a particular decision number to get more
        // information about what the parser was attempting to do when it encountered the error.
        // See Section 10.2 on page 245 of the Definitive ANTLR book (for ANTLR v3).
        //
        @Override
        public String getErrorMessage(RecognitionException e, String[] tokenNames)
        {
            List stack = getRuleInvocationStack(e, this.getClass().getName());
            String msg = null;
            if (e instanceof NoViableAltException) {
                NoViableAltException nvae = (NoViableAltException)e;
                msg = " no viable alt; token=" + e.token +
                      " (decision=" + nvae.decisionNumber +
                      " state " + nvae.stateNumber + ")" +
                      " decision=<<" + nvae.grammarDecisionDescription + ">>";
            }
            else {
                msg = super.getErrorMessage(e, tokenNames);
            }
            return stack + " " + msg;
        }

        @Override
        public String getTokenErrorDisplay(Token t)
        {
            return t.toString();
        }


    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expression"
    // nesC.g:293:1: primary_expression : ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression );
    public final nesCParser.primary_expression_return primary_expression() throws RecognitionException {
        nesCParser.primary_expression_return retval = new nesCParser.primary_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTANT2=null;
        Token STRING_LITERAL3=null;
        Token CHARACTER_LITERAL4=null;
        Token char_literal5=null;
        Token char_literal7=null;
        nesCParser.identifier_return identifier1 =null;

        nesCParser.expression_return expression6 =null;


        Object CONSTANT2_tree=null;
        Object STRING_LITERAL3_tree=null;
        Object CHARACTER_LITERAL4_tree=null;
        Object char_literal5_tree=null;
        Object char_literal7_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // nesC.g:294:5: ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression )
            int alt1=5;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                alt1=1;
                }
                break;
            case CONSTANT:
                {
                alt1=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt1=3;
                }
                break;
            case CHARACTER_LITERAL:
                {
                alt1=4;
                }
                break;
            case LPARENS:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // nesC.g:294:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression2809);
                    identifier1=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier1.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:295:10: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT2=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_primary_expression2820); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT2_tree = 
                    (Object)adaptor.create(CONSTANT2)
                    ;
                    adaptor.addChild(root_0, CONSTANT2_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:296:10: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primary_expression2831); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL3_tree = 
                    (Object)adaptor.create(STRING_LITERAL3)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL3_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:297:10: CHARACTER_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARACTER_LITERAL4=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_primary_expression2842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARACTER_LITERAL4_tree = 
                    (Object)adaptor.create(CHARACTER_LITERAL4)
                    ;
                    adaptor.addChild(root_0, CHARACTER_LITERAL4_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:298:10: '(' expression ')'
                    {
                    char_literal5=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_primary_expression2853); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_primary_expression2855);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

                    char_literal7=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_primary_expression2857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal7);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 298:29: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary_expression"


    public static class postfix_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expression"
    // nesC.g:306:1: postfix_expression : ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) ;
    public final nesCParser.postfix_expression_return postfix_expression() throws RecognitionException {
        nesCParser.postfix_expression_return retval = new nesCParser.postfix_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.call_kind_return call_kind8 =null;

        nesCParser.primary_expression_return primary_expression9 =null;

        nesCParser.postfix_expression_modifier_return postfix_expression_modifier10 =null;


        RewriteRuleSubtreeStream stream_call_kind=new RewriteRuleSubtreeStream(adaptor,"rule call_kind");
        RewriteRuleSubtreeStream stream_postfix_expression_modifier=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression_modifier");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            // nesC.g:307:5: ( ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) )
            // nesC.g:307:10: ( call_kind )? primary_expression ( postfix_expression_modifier )*
            {
            // nesC.g:307:10: ( call_kind )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CALL||LA2_0==POST||LA2_0==SIGNAL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // nesC.g:307:10: call_kind
                    {
                    pushFollow(FOLLOW_call_kind_in_postfix_expression2882);
                    call_kind8=call_kind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_call_kind.add(call_kind8.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_primary_expression_in_postfix_expression2885);
            primary_expression9=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression9.getTree());

            // nesC.g:307:40: ( postfix_expression_modifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARROW||LA3_0==DOT||LA3_0==LBRACKET||LA3_0==LPARENS||LA3_0==MINUSMINUS||LA3_0==PLUSPLUS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // nesC.g:307:40: postfix_expression_modifier
            	    {
            	    pushFollow(FOLLOW_postfix_expression_modifier_in_postfix_expression2887);
            	    postfix_expression_modifier10=postfix_expression_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_postfix_expression_modifier.add(postfix_expression_modifier10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: primary_expression, postfix_expression_modifier, call_kind
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 308:13: -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
            {
                // nesC.g:308:16: ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION")
                , root_1);

                // nesC.g:308:37: ( call_kind )?
                if ( stream_call_kind.hasNext() ) {
                    adaptor.addChild(root_1, stream_call_kind.nextTree());

                }
                stream_call_kind.reset();

                adaptor.addChild(root_1, stream_primary_expression.nextTree());

                // nesC.g:308:67: ( postfix_expression_modifier )*
                while ( stream_postfix_expression_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_postfix_expression_modifier.nextTree());

                }
                stream_postfix_expression_modifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"


    public static class postfix_expression_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expression_modifier"
    // nesC.g:310:1: postfix_expression_modifier : ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' );
    public final nesCParser.postfix_expression_modifier_return postfix_expression_modifier() throws RecognitionException {
        nesCParser.postfix_expression_modifier_return retval = new nesCParser.postfix_expression_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal11=null;
        Token char_literal13=null;
        Token char_literal14=null;
        Token char_literal16=null;
        Token char_literal17=null;
        Token string_literal19=null;
        Token string_literal21=null;
        Token string_literal22=null;
        nesCParser.expression_return expression12 =null;

        nesCParser.argument_expression_list_return argument_expression_list15 =null;

        nesCParser.identifier_return identifier18 =null;

        nesCParser.identifier_return identifier20 =null;


        Object char_literal11_tree=null;
        Object char_literal13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal16_tree=null;
        Object char_literal17_tree=null;
        Object string_literal19_tree=null;
        Object string_literal21_tree=null;
        Object string_literal22_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argument_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expression_list");
        try {
            // nesC.g:311:5: ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case LBRACKET:
                {
                alt5=1;
                }
                break;
            case LPARENS:
                {
                alt5=2;
                }
                break;
            case DOT:
                {
                alt5=3;
                }
                break;
            case ARROW:
                {
                alt5=4;
                }
                break;
            case PLUSPLUS:
                {
                alt5=5;
                }
                break;
            case MINUSMINUS:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // nesC.g:311:9: '[' expression ']'
                    {
                    char_literal11=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_postfix_expression_modifier2928); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal11);


                    pushFollow(FOLLOW_expression_in_postfix_expression_modifier2930);
                    expression12=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression12.getTree());

                    char_literal13=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_postfix_expression_modifier2932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal13);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 311:28: -> ^( ARRAY_ELEMENT_SELECTION expression )
                    {
                        // nesC.g:311:31: ^( ARRAY_ELEMENT_SELECTION expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARRAY_ELEMENT_SELECTION, "ARRAY_ELEMENT_SELECTION")
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:312:9: '(' ( argument_expression_list )? ')'
                    {
                    char_literal14=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression_modifier2950); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal14);


                    // nesC.g:312:13: ( argument_expression_list )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AMP||LA4_0==BITCOMPLEMENT||LA4_0==CALL||LA4_0==CHARACTER_LITERAL||LA4_0==CONSTANT||LA4_0==LPARENS||LA4_0==MINUS||LA4_0==MINUSMINUS||LA4_0==NOT||LA4_0==PLUS||LA4_0==PLUSPLUS||LA4_0==POST||LA4_0==RAW_IDENTIFIER||LA4_0==SIGNAL||LA4_0==SIZEOF||LA4_0==STAR||LA4_0==STRING_LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // nesC.g:312:13: argument_expression_list
                            {
                            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression_modifier2952);
                            argument_expression_list15=argument_expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list15.getTree());

                            }
                            break;

                    }


                    char_literal16=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression_modifier2955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal16);


                    // AST REWRITE
                    // elements: argument_expression_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 312:43: -> ^( ARGUMENT_LIST ( argument_expression_list )? )
                    {
                        // nesC.g:312:46: ^( ARGUMENT_LIST ( argument_expression_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST")
                        , root_1);

                        // nesC.g:312:62: ( argument_expression_list )?
                        if ( stream_argument_expression_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_argument_expression_list.nextTree());

                        }
                        stream_argument_expression_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:313:9: '.' identifier
                    {
                    char_literal17=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression_modifier2974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal17);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2976);
                    identifier18=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier18.getTree());

                    // AST REWRITE
                    // elements: identifier, DOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 313:24: -> ^( '.' identifier )
                    {
                        // nesC.g:313:27: ^( '.' identifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_DOT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:314:9: '->' identifier
                    {
                    string_literal19=(Token)match(input,ARROW,FOLLOW_ARROW_in_postfix_expression_modifier2994); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal19);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2996);
                    identifier20=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier20.getTree());

                    // AST REWRITE
                    // elements: identifier, ARROW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 314:25: -> ^( '->' identifier )
                    {
                        // nesC.g:314:28: ^( '->' identifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ARROW.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:315:9: '++'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal21=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfix_expression_modifier3014); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = 
                    (Object)adaptor.create(string_literal21)
                    ;
                    adaptor.addChild(root_0, string_literal21_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:316:9: '--'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal22=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfix_expression_modifier3024); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal22_tree = 
                    (Object)adaptor.create(string_literal22)
                    ;
                    adaptor.addChild(root_0, string_literal22_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "postfix_expression_modifier"


    public static class call_kind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call_kind"
    // nesC.g:318:1: call_kind : ( CALL | POST | SIGNAL );
    public final nesCParser.call_kind_return call_kind() throws RecognitionException {
        nesCParser.call_kind_return retval = new nesCParser.call_kind_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            // nesC.g:319:5: ( CALL | POST | SIGNAL )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set23=(Token)input.LT(1);

            if ( input.LA(1)==CALL||input.LA(1)==POST||input.LA(1)==SIGNAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set23)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "call_kind"


    public static class argument_expression_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument_expression_list"
    // nesC.g:323:1: argument_expression_list : assignment_expression ( ',' ! assignment_expression )* ;
    public final nesCParser.argument_expression_list_return argument_expression_list() throws RecognitionException {
        nesCParser.argument_expression_list_return retval = new nesCParser.argument_expression_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal25=null;
        nesCParser.assignment_expression_return assignment_expression24 =null;

        nesCParser.assignment_expression_return assignment_expression26 =null;


        Object char_literal25_tree=null;

        try {
            // nesC.g:324:5: ( assignment_expression ( ',' ! assignment_expression )* )
            // nesC.g:324:10: assignment_expression ( ',' ! assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3084);
            assignment_expression24=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression24.getTree());

            // nesC.g:324:32: ( ',' ! assignment_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // nesC.g:324:33: ',' ! assignment_expression
            	    {
            	    char_literal25=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list3087); if (state.failed) return retval;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3090);
            	    assignment_expression26=assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression26.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument_expression_list"


    public static class unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expression"
    // nesC.g:331:1: unary_expression : ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | postfix_expression );
    public final nesCParser.unary_expression_return unary_expression() throws RecognitionException {
        nesCParser.unary_expression_return retval = new nesCParser.unary_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal27=null;
        Token string_literal29=null;
        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token char_literal40=null;
        Token SIZEOF42=null;
        Token char_literal43=null;
        Token char_literal45=null;
        nesCParser.unary_expression_return unary_expression28 =null;

        nesCParser.unary_expression_return unary_expression30 =null;

        nesCParser.cast_expression_return cast_expression32 =null;

        nesCParser.cast_expression_return cast_expression34 =null;

        nesCParser.cast_expression_return cast_expression36 =null;

        nesCParser.cast_expression_return cast_expression38 =null;

        nesCParser.cast_expression_return cast_expression41 =null;

        nesCParser.type_name_return type_name44 =null;

        nesCParser.postfix_expression_return postfix_expression46 =null;


        Object string_literal27_tree=null;
        Object string_literal29_tree=null;
        Object char_literal31_tree=null;
        Object char_literal33_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object char_literal40_tree=null;
        Object SIZEOF42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal45_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_SIZEOF=new RewriteRuleTokenStream(adaptor,"token SIZEOF");
        RewriteRuleTokenStream stream_MINUSMINUS=new RewriteRuleTokenStream(adaptor,"token MINUSMINUS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_AMP=new RewriteRuleTokenStream(adaptor,"token AMP");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // nesC.g:332:5: ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | postfix_expression )
            int alt8=9;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                alt8=1;
                }
                break;
            case MINUSMINUS:
                {
                alt8=2;
                }
                break;
            case AMP:
                {
                alt8=3;
                }
                break;
            case STAR:
                {
                alt8=4;
                }
                break;
            case PLUS:
                {
                alt8=5;
                }
                break;
            case MINUS:
                {
                alt8=6;
                }
                break;
            case BITCOMPLEMENT:
            case NOT:
                {
                alt8=7;
                }
                break;
            case SIZEOF:
                {
                alt8=8;
                }
                break;
            case CALL:
            case CHARACTER_LITERAL:
            case CONSTANT:
            case LPARENS:
            case POST:
            case RAW_IDENTIFIER:
            case SIGNAL:
            case STRING_LITERAL:
                {
                alt8=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // nesC.g:332:10: '++' unary_expression
                    {
                    string_literal27=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unary_expression3116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(string_literal27);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3118);
                    unary_expression28=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression28.getTree());

                    // AST REWRITE
                    // elements: unary_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 332:32: -> ^( PRE_INCREMENT unary_expression )
                    {
                        // nesC.g:332:35: ^( PRE_INCREMENT unary_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRE_INCREMENT, "PRE_INCREMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_unary_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:333:10: '--' unary_expression
                    {
                    string_literal29=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unary_expression3137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUSMINUS.add(string_literal29);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3139);
                    unary_expression30=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression30.getTree());

                    // AST REWRITE
                    // elements: unary_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 333:32: -> ^( PRE_DECREMENT unary_expression )
                    {
                        // nesC.g:333:35: ^( PRE_DECREMENT unary_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRE_DECREMENT, "PRE_DECREMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_unary_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:334:10: '&' cast_expression
                    {
                    char_literal31=(Token)match(input,AMP,FOLLOW_AMP_in_unary_expression3158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMP.add(char_literal31);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3161);
                    cast_expression32=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression32.getTree());

                    // AST REWRITE
                    // elements: cast_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 334:32: -> ^( ADDRESS_OF cast_expression )
                    {
                        // nesC.g:334:35: ^( ADDRESS_OF cast_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ADDRESS_OF, "ADDRESS_OF")
                        , root_1);

                        adaptor.addChild(root_1, stream_cast_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:335:10: '*' cast_expression
                    {
                    char_literal33=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression3185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal33);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3188);
                    cast_expression34=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression34.getTree());

                    // AST REWRITE
                    // elements: cast_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:32: -> ^( DEREFERENCE cast_expression )
                    {
                        // nesC.g:335:35: ^( DEREFERENCE cast_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DEREFERENCE, "DEREFERENCE")
                        , root_1);

                        adaptor.addChild(root_1, stream_cast_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:336:10: '+' cast_expression
                    {
                    char_literal35=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression3211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal35);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3214);
                    cast_expression36=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression36.getTree());

                    // AST REWRITE
                    // elements: cast_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 336:32: -> ^( UNARY_PLUS cast_expression )
                    {
                        // nesC.g:336:35: ^( UNARY_PLUS cast_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY_PLUS, "UNARY_PLUS")
                        , root_1);

                        adaptor.addChild(root_1, stream_cast_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:337:10: '-' cast_expression
                    {
                    char_literal37=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression3238); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal37);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3241);
                    cast_expression38=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression38.getTree());

                    // AST REWRITE
                    // elements: cast_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 337:32: -> ^( UNARY_MINUS cast_expression )
                    {
                        // nesC.g:337:35: ^( UNARY_MINUS cast_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS")
                        , root_1);

                        adaptor.addChild(root_1, stream_cast_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // nesC.g:338:10: ( '~' ^| '!' ^) cast_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:338:10: ( '~' ^| '!' ^)
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==BITCOMPLEMENT) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==NOT) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;

                    }
                    switch (alt7) {
                        case 1 :
                            // nesC.g:338:11: '~' ^
                            {
                            char_literal39=(Token)match(input,BITCOMPLEMENT,FOLLOW_BITCOMPLEMENT_in_unary_expression3265); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal39_tree = 
                            (Object)adaptor.create(char_literal39)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal39_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:338:18: '!' ^
                            {
                            char_literal40=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression3270); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal40_tree = 
                            (Object)adaptor.create(char_literal40)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal40_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3274);
                    cast_expression41=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression41.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:339:10: SIZEOF '(' type_name ')'
                    {
                    SIZEOF42=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF42);


                    char_literal43=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_unary_expression3287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal43);


                    pushFollow(FOLLOW_type_name_in_unary_expression3289);
                    type_name44=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name44.getTree());

                    char_literal45=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_unary_expression3291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal45);


                    // AST REWRITE
                    // elements: type_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 339:35: -> ^( SIZEOF_TYPE type_name )
                    {
                        // nesC.g:339:38: ^( SIZEOF_TYPE type_name )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SIZEOF_TYPE, "SIZEOF_TYPE")
                        , root_1);

                        adaptor.addChild(root_1, stream_type_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // nesC.g:341:10: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression3311);
                    postfix_expression46=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression46.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_expression"


    public static class cast_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cast_expression"
    // nesC.g:347:1: cast_expression : ( ( '(' type_name ')' )=> '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression );
    public final nesCParser.cast_expression_return cast_expression() throws RecognitionException {
        nesCParser.cast_expression_return retval = new nesCParser.cast_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal47=null;
        Token char_literal49=null;
        nesCParser.type_name_return type_name48 =null;

        nesCParser.cast_expression_return cast_expression50 =null;

        nesCParser.unary_expression_return unary_expression51 =null;


        Object char_literal47_tree=null;
        Object char_literal49_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // nesC.g:348:5: ( ( '(' type_name ')' )=> '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LPARENS) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred1_nesC()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==AMP||LA9_0==BITCOMPLEMENT||LA9_0==CALL||LA9_0==CHARACTER_LITERAL||LA9_0==CONSTANT||LA9_0==MINUS||LA9_0==MINUSMINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==PLUSPLUS||LA9_0==POST||LA9_0==RAW_IDENTIFIER||LA9_0==SIGNAL||LA9_0==SIZEOF||LA9_0==STAR||LA9_0==STRING_LITERAL) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // nesC.g:348:10: ( '(' type_name ')' )=> '(' type_name ')' cast_expression
                    {
                    char_literal47=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_cast_expression3350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal47);


                    pushFollow(FOLLOW_type_name_in_cast_expression3352);
                    type_name48=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name48.getTree());

                    char_literal49=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_cast_expression3354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal49);


                    pushFollow(FOLLOW_cast_expression_in_cast_expression3356);
                    cast_expression50=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression50.getTree());

                    // AST REWRITE
                    // elements: cast_expression, type_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 349:45: -> ^( CAST cast_expression type_name )
                    {
                        // nesC.g:349:48: ^( CAST cast_expression type_name )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CAST, "CAST")
                        , root_1);

                        adaptor.addChild(root_1, stream_cast_expression.nextTree());

                        adaptor.addChild(root_1, stream_type_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:350:10: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression3377);
                    unary_expression51=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression51.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cast_expression"


    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicative_expression"
    // nesC.g:352:1: multiplicative_expression : cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* ;
    public final nesCParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        nesCParser.multiplicative_expression_return retval = new nesCParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal53=null;
        Token char_literal54=null;
        Token char_literal55=null;
        nesCParser.cast_expression_return cast_expression52 =null;

        nesCParser.cast_expression_return cast_expression56 =null;


        Object char_literal53_tree=null;
        Object char_literal54_tree=null;
        Object char_literal55_tree=null;

        try {
            // nesC.g:353:5: ( cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* )
            // nesC.g:353:10: cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3396);
            cast_expression52=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression52.getTree());

            // nesC.g:353:26: ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DIVIDE||LA11_0==MODULUS||LA11_0==STAR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // nesC.g:353:28: ( '*' ^| '/' ^| '%' ^) cast_expression
            	    {
            	    // nesC.g:353:28: ( '*' ^| '/' ^| '%' ^)
            	    int alt10=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case DIVIDE:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case MODULUS:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // nesC.g:353:29: '*' ^
            	            {
            	            char_literal53=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression3401); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal53_tree = 
            	            (Object)adaptor.create(char_literal53)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal53_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:353:36: '/' ^
            	            {
            	            char_literal54=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expression3406); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal54_tree = 
            	            (Object)adaptor.create(char_literal54)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal54_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:353:43: '%' ^
            	            {
            	            char_literal55=(Token)match(input,MODULUS,FOLLOW_MODULUS_in_multiplicative_expression3411); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal55_tree = 
            	            (Object)adaptor.create(char_literal55)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal55_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3415);
            	    cast_expression56=cast_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression56.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"


    public static class additive_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additive_expression"
    // nesC.g:355:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
    public final nesCParser.additive_expression_return additive_expression() throws RecognitionException {
        nesCParser.additive_expression_return retval = new nesCParser.additive_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal58=null;
        Token char_literal59=null;
        nesCParser.multiplicative_expression_return multiplicative_expression57 =null;

        nesCParser.multiplicative_expression_return multiplicative_expression60 =null;


        Object char_literal58_tree=null;
        Object char_literal59_tree=null;

        try {
            // nesC.g:356:5: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
            // nesC.g:356:10: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3436);
            multiplicative_expression57=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression57.getTree());

            // nesC.g:356:36: ( ( '+' ^| '-' ^) multiplicative_expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // nesC.g:356:38: ( '+' ^| '-' ^) multiplicative_expression
            	    {
            	    // nesC.g:356:38: ( '+' ^| '-' ^)
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==PLUS) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==MINUS) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // nesC.g:356:39: '+' ^
            	            {
            	            char_literal58=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression3441); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal58_tree = 
            	            (Object)adaptor.create(char_literal58)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal58_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:356:46: '-' ^
            	            {
            	            char_literal59=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression3446); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal59_tree = 
            	            (Object)adaptor.create(char_literal59)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal59_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3450);
            	    multiplicative_expression60=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression60.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additive_expression"


    public static class shift_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shift_expression"
    // nesC.g:358:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
    public final nesCParser.shift_expression_return shift_expression() throws RecognitionException {
        nesCParser.shift_expression_return retval = new nesCParser.shift_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal62=null;
        Token string_literal63=null;
        nesCParser.additive_expression_return additive_expression61 =null;

        nesCParser.additive_expression_return additive_expression64 =null;


        Object string_literal62_tree=null;
        Object string_literal63_tree=null;

        try {
            // nesC.g:359:5: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // nesC.g:359:10: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression3471);
            additive_expression61=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression61.getTree());

            // nesC.g:359:30: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LSHIFT||LA15_0==RSHIFT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // nesC.g:359:32: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // nesC.g:359:32: ( '<<' ^| '>>' ^)
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==LSHIFT) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==RSHIFT) ) {
            	        alt14=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // nesC.g:359:33: '<<' ^
            	            {
            	            string_literal62=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression3476); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal62_tree = 
            	            (Object)adaptor.create(string_literal62)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal62_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:359:41: '>>' ^
            	            {
            	            string_literal63=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression3481); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal63_tree = 
            	            (Object)adaptor.create(string_literal63)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal63_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression3485);
            	    additive_expression64=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression64.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "shift_expression"


    public static class relational_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // nesC.g:361:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
    public final nesCParser.relational_expression_return relational_expression() throws RecognitionException {
        nesCParser.relational_expression_return retval = new nesCParser.relational_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal66=null;
        Token char_literal67=null;
        Token string_literal68=null;
        Token string_literal69=null;
        nesCParser.shift_expression_return shift_expression65 =null;

        nesCParser.shift_expression_return shift_expression70 =null;


        Object char_literal66_tree=null;
        Object char_literal67_tree=null;
        Object string_literal68_tree=null;
        Object string_literal69_tree=null;

        try {
            // nesC.g:362:5: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // nesC.g:362:10: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression3506);
            shift_expression65=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression65.getTree());

            // nesC.g:362:27: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= GREATER && LA17_0 <= GREATEREQUAL)||(LA17_0 >= LESS && LA17_0 <= LESSEQUAL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // nesC.g:362:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // nesC.g:362:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
            	    int alt16=4;
            	    switch ( input.LA(1) ) {
            	    case LESS:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case GREATER:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case LESSEQUAL:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case GREATEREQUAL:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // nesC.g:362:30: '<' ^
            	            {
            	            char_literal66=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression3511); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal66_tree = 
            	            (Object)adaptor.create(char_literal66)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal66_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:362:37: '>' ^
            	            {
            	            char_literal67=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression3516); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal67_tree = 
            	            (Object)adaptor.create(char_literal67)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal67_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:362:44: '<=' ^
            	            {
            	            string_literal68=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relational_expression3521); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal68_tree = 
            	            (Object)adaptor.create(string_literal68)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal68_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // nesC.g:362:52: '>=' ^
            	            {
            	            string_literal69=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relational_expression3526); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal69_tree = 
            	            (Object)adaptor.create(string_literal69)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal69_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression3530);
            	    shift_expression70=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression70.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_expression"


    public static class equality_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_expression"
    // nesC.g:364:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
    public final nesCParser.equality_expression_return equality_expression() throws RecognitionException {
        nesCParser.equality_expression_return retval = new nesCParser.equality_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal72=null;
        Token string_literal73=null;
        nesCParser.relational_expression_return relational_expression71 =null;

        nesCParser.relational_expression_return relational_expression74 =null;


        Object string_literal72_tree=null;
        Object string_literal73_tree=null;

        try {
            // nesC.g:365:5: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // nesC.g:365:10: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression3551);
            relational_expression71=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression71.getTree());

            // nesC.g:365:32: ( ( '==' ^| '!=' ^) relational_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EQUAL||LA19_0==NOTEQUAL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // nesC.g:365:34: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // nesC.g:365:34: ( '==' ^| '!=' ^)
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==EQUAL) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==NOTEQUAL) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // nesC.g:365:35: '==' ^
            	            {
            	            string_literal72=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equality_expression3556); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal72_tree = 
            	            (Object)adaptor.create(string_literal72)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal72_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:365:43: '!=' ^
            	            {
            	            string_literal73=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equality_expression3561); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal73_tree = 
            	            (Object)adaptor.create(string_literal73)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal73_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression3565);
            	    relational_expression74=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression74.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equality_expression"


    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expression"
    // nesC.g:367:1: and_expression : equality_expression ( '&' ^ equality_expression )* ;
    public final nesCParser.and_expression_return and_expression() throws RecognitionException {
        nesCParser.and_expression_return retval = new nesCParser.and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal76=null;
        nesCParser.equality_expression_return equality_expression75 =null;

        nesCParser.equality_expression_return equality_expression77 =null;


        Object char_literal76_tree=null;

        try {
            // nesC.g:368:5: ( equality_expression ( '&' ^ equality_expression )* )
            // nesC.g:368:10: equality_expression ( '&' ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_and_expression3586);
            equality_expression75=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression75.getTree());

            // nesC.g:368:30: ( '&' ^ equality_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AMP) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // nesC.g:368:32: '&' ^ equality_expression
            	    {
            	    char_literal76=(Token)match(input,AMP,FOLLOW_AMP_in_and_expression3590); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal76_tree = 
            	    (Object)adaptor.create(char_literal76)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal76_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_and_expression3593);
            	    equality_expression77=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression77.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and_expression"


    public static class xor_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xor_expression"
    // nesC.g:370:1: xor_expression : and_expression ( '^' ^ and_expression )* ;
    public final nesCParser.xor_expression_return xor_expression() throws RecognitionException {
        nesCParser.xor_expression_return retval = new nesCParser.xor_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal79=null;
        nesCParser.and_expression_return and_expression78 =null;

        nesCParser.and_expression_return and_expression80 =null;


        Object char_literal79_tree=null;

        try {
            // nesC.g:371:5: ( and_expression ( '^' ^ and_expression )* )
            // nesC.g:371:10: and_expression ( '^' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_xor_expression3614);
            and_expression78=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression78.getTree());

            // nesC.g:371:25: ( '^' ^ and_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==BITXOR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // nesC.g:371:27: '^' ^ and_expression
            	    {
            	    char_literal79=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_xor_expression3618); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal79_tree = 
            	    (Object)adaptor.create(char_literal79)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal79_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_xor_expression3621);
            	    and_expression80=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression80.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "xor_expression"


    public static class or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_expression"
    // nesC.g:373:1: or_expression : xor_expression ( '|' ^ xor_expression )* ;
    public final nesCParser.or_expression_return or_expression() throws RecognitionException {
        nesCParser.or_expression_return retval = new nesCParser.or_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal82=null;
        nesCParser.xor_expression_return xor_expression81 =null;

        nesCParser.xor_expression_return xor_expression83 =null;


        Object char_literal82_tree=null;

        try {
            // nesC.g:374:5: ( xor_expression ( '|' ^ xor_expression )* )
            // nesC.g:374:10: xor_expression ( '|' ^ xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expression_in_or_expression3642);
            xor_expression81=xor_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression81.getTree());

            // nesC.g:374:25: ( '|' ^ xor_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BITOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // nesC.g:374:27: '|' ^ xor_expression
            	    {
            	    char_literal82=(Token)match(input,BITOR,FOLLOW_BITOR_in_or_expression3646); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal82_tree = 
            	    (Object)adaptor.create(char_literal82)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal82_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_xor_expression_in_or_expression3649);
            	    xor_expression83=xor_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression83.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "or_expression"


    public static class logical_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_and_expression"
    // nesC.g:376:1: logical_and_expression : or_expression ( '&&' ^ or_expression )* ;
    public final nesCParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        nesCParser.logical_and_expression_return retval = new nesCParser.logical_and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal85=null;
        nesCParser.or_expression_return or_expression84 =null;

        nesCParser.or_expression_return or_expression86 =null;


        Object string_literal85_tree=null;

        try {
            // nesC.g:377:5: ( or_expression ( '&&' ^ or_expression )* )
            // nesC.g:377:10: or_expression ( '&&' ^ or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_expression_in_logical_and_expression3670);
            or_expression84=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression84.getTree());

            // nesC.g:377:24: ( '&&' ^ or_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // nesC.g:377:26: '&&' ^ or_expression
            	    {
            	    string_literal85=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression3674); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal85_tree = 
            	    (Object)adaptor.create(string_literal85)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal85_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression3677);
            	    or_expression86=or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression86.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"


    public static class logical_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_or_expression"
    // nesC.g:379:1: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
    public final nesCParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        nesCParser.logical_or_expression_return retval = new nesCParser.logical_or_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal88=null;
        nesCParser.logical_and_expression_return logical_and_expression87 =null;

        nesCParser.logical_and_expression_return logical_and_expression89 =null;


        Object string_literal88_tree=null;

        try {
            // nesC.g:380:5: ( logical_and_expression ( '||' ^ logical_and_expression )* )
            // nesC.g:380:10: logical_and_expression ( '||' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3698);
            logical_and_expression87=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression87.getTree());

            // nesC.g:380:33: ( '||' ^ logical_and_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // nesC.g:380:35: '||' ^ logical_and_expression
            	    {
            	    string_literal88=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression3702); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal88_tree = 
            	    (Object)adaptor.create(string_literal88)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal88_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3705);
            	    logical_and_expression89=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression89.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_or_expression"


    public static class conditional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional_expression"
    // nesC.g:382:1: conditional_expression : logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? ;
    public final nesCParser.conditional_expression_return conditional_expression() throws RecognitionException {
        nesCParser.conditional_expression_return retval = new nesCParser.conditional_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal91=null;
        Token char_literal93=null;
        nesCParser.logical_or_expression_return logical_or_expression90 =null;

        nesCParser.expression_return expression92 =null;

        nesCParser.conditional_expression_return conditional_expression94 =null;


        Object char_literal91_tree=null;
        Object char_literal93_tree=null;

        try {
            // nesC.g:383:5: ( logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? )
            // nesC.g:383:10: logical_or_expression ( '?' ^ expression ':' ! conditional_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression3726);
            logical_or_expression90=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression90.getTree());

            // nesC.g:383:32: ( '?' ^ expression ':' ! conditional_expression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==192) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // nesC.g:383:33: '?' ^ expression ':' ! conditional_expression
                    {
                    char_literal91=(Token)match(input,192,FOLLOW_192_in_conditional_expression3729); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal91_tree = 
                    (Object)adaptor.create(char_literal91)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal91_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_conditional_expression3732);
                    expression92=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression92.getTree());

                    char_literal93=(Token)match(input,189,FOLLOW_189_in_conditional_expression3734); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression3737);
                    conditional_expression94=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression94.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditional_expression"


    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_expression"
    // nesC.g:394:1: assignment_expression : conditional_expression ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )? ;
    public final nesCParser.assignment_expression_return assignment_expression() throws RecognitionException {
        nesCParser.assignment_expression_return retval = new nesCParser.assignment_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal96=null;
        Token string_literal97=null;
        Token string_literal98=null;
        Token string_literal99=null;
        Token string_literal100=null;
        Token string_literal101=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token string_literal105=null;
        Token string_literal106=null;
        nesCParser.conditional_expression_return conditional_expression95 =null;

        nesCParser.assignment_expression_return assignment_expression107 =null;


        Object char_literal96_tree=null;
        Object string_literal97_tree=null;
        Object string_literal98_tree=null;
        Object string_literal99_tree=null;
        Object string_literal100_tree=null;
        Object string_literal101_tree=null;
        Object string_literal102_tree=null;
        Object string_literal103_tree=null;
        Object string_literal104_tree=null;
        Object string_literal105_tree=null;
        Object string_literal106_tree=null;

        try {
            // nesC.g:395:5: ( conditional_expression ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )? )
            // nesC.g:395:10: conditional_expression ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_assignment_expression3767);
            conditional_expression95=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression95.getTree());

            // nesC.g:395:33: ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ASSIGN||LA27_0==BITANDASSIGN||LA27_0==BITORASSIGN||LA27_0==BITXORASSIGN||LA27_0==DIVASSIGN||LA27_0==LSHIFTASSIGN||LA27_0==MINUSASSIGN||LA27_0==MODASSIGN||LA27_0==MULASSIGN||LA27_0==PLUSASSIGN||LA27_0==RSHIFTASSIGN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // nesC.g:395:34: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression
                    {
                    // nesC.g:395:34: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^)
                    int alt26=11;
                    switch ( input.LA(1) ) {
                    case ASSIGN:
                        {
                        alt26=1;
                        }
                        break;
                    case MULASSIGN:
                        {
                        alt26=2;
                        }
                        break;
                    case DIVASSIGN:
                        {
                        alt26=3;
                        }
                        break;
                    case MODASSIGN:
                        {
                        alt26=4;
                        }
                        break;
                    case PLUSASSIGN:
                        {
                        alt26=5;
                        }
                        break;
                    case MINUSASSIGN:
                        {
                        alt26=6;
                        }
                        break;
                    case LSHIFTASSIGN:
                        {
                        alt26=7;
                        }
                        break;
                    case RSHIFTASSIGN:
                        {
                        alt26=8;
                        }
                        break;
                    case BITANDASSIGN:
                        {
                        alt26=9;
                        }
                        break;
                    case BITXORASSIGN:
                        {
                        alt26=10;
                        }
                        break;
                    case BITORASSIGN:
                        {
                        alt26=11;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }

                    switch (alt26) {
                        case 1 :
                            // nesC.g:395:35: '=' ^
                            {
                            char_literal96=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expression3771); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal96_tree = 
                            (Object)adaptor.create(char_literal96)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal96_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:395:42: '*=' ^
                            {
                            string_literal97=(Token)match(input,MULASSIGN,FOLLOW_MULASSIGN_in_assignment_expression3776); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal97_tree = 
                            (Object)adaptor.create(string_literal97)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal97_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // nesC.g:395:50: '/=' ^
                            {
                            string_literal98=(Token)match(input,DIVASSIGN,FOLLOW_DIVASSIGN_in_assignment_expression3781); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal98_tree = 
                            (Object)adaptor.create(string_literal98)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal98_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // nesC.g:395:58: '%=' ^
                            {
                            string_literal99=(Token)match(input,MODASSIGN,FOLLOW_MODASSIGN_in_assignment_expression3786); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal99_tree = 
                            (Object)adaptor.create(string_literal99)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal99_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // nesC.g:395:66: '+=' ^
                            {
                            string_literal100=(Token)match(input,PLUSASSIGN,FOLLOW_PLUSASSIGN_in_assignment_expression3791); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal100_tree = 
                            (Object)adaptor.create(string_literal100)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal100_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // nesC.g:395:74: '-=' ^
                            {
                            string_literal101=(Token)match(input,MINUSASSIGN,FOLLOW_MINUSASSIGN_in_assignment_expression3796); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal101_tree = 
                            (Object)adaptor.create(string_literal101)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);
                            }

                            }
                            break;
                        case 7 :
                            // nesC.g:395:82: '<<=' ^
                            {
                            string_literal102=(Token)match(input,LSHIFTASSIGN,FOLLOW_LSHIFTASSIGN_in_assignment_expression3801); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal102_tree = 
                            (Object)adaptor.create(string_literal102)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal102_tree, root_0);
                            }

                            }
                            break;
                        case 8 :
                            // nesC.g:395:91: '>>=' ^
                            {
                            string_literal103=(Token)match(input,RSHIFTASSIGN,FOLLOW_RSHIFTASSIGN_in_assignment_expression3806); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal103_tree = 
                            (Object)adaptor.create(string_literal103)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
                            }

                            }
                            break;
                        case 9 :
                            // nesC.g:395:100: '&=' ^
                            {
                            string_literal104=(Token)match(input,BITANDASSIGN,FOLLOW_BITANDASSIGN_in_assignment_expression3811); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal104_tree = 
                            (Object)adaptor.create(string_literal104)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal104_tree, root_0);
                            }

                            }
                            break;
                        case 10 :
                            // nesC.g:395:108: '^=' ^
                            {
                            string_literal105=(Token)match(input,BITXORASSIGN,FOLLOW_BITXORASSIGN_in_assignment_expression3816); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal105_tree = 
                            (Object)adaptor.create(string_literal105)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal105_tree, root_0);
                            }

                            }
                            break;
                        case 11 :
                            // nesC.g:395:116: '|=' ^
                            {
                            string_literal106=(Token)match(input,BITORASSIGN,FOLLOW_BITORASSIGN_in_assignment_expression3821); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal106_tree = 
                            (Object)adaptor.create(string_literal106)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression3825);
                    assignment_expression107=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression107.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_expression"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // nesC.g:397:1: expression : assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )* ;
    public final nesCParser.expression_return expression() throws RecognitionException {
        nesCParser.expression_return retval = new nesCParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal109=null;
        nesCParser.assignment_expression_return assignment_expression108 =null;

        nesCParser.assignment_expression_return assignment_expression110 =null;


        Object char_literal109_tree=null;

        try {
            // nesC.g:398:5: ( assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )* )
            // nesC.g:398:10: assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression3842);
            assignment_expression108=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression108.getTree());

            // nesC.g:398:32: ( ( ',' assignment_expression )=> ',' ^ assignment_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==COMMA) ) {
                    int LA28_5 = input.LA(2);

                    if ( (synpred2_nesC()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // nesC.g:398:33: ( ',' assignment_expression )=> ',' ^ assignment_expression
            	    {
            	    char_literal109=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression3853); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal109_tree = 
            	    (Object)adaptor.create(char_literal109)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal109_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression3856);
            	    assignment_expression110=assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression110.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class constant_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_expression"
    // nesC.g:400:1: constant_expression : conditional_expression ;
    public final nesCParser.constant_expression_return constant_expression() throws RecognitionException {
        nesCParser.constant_expression_return retval = new nesCParser.constant_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.conditional_expression_return conditional_expression111 =null;



        try {
            // nesC.g:401:5: ( conditional_expression )
            // nesC.g:401:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression3877);
            conditional_expression111=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression111.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant_expression"


    protected static class declaration_scope {
        LinkedList<String> declaredNames;
        boolean inStructDeclaration;
    }
    protected Stack declaration_stack = new Stack();


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // nesC.g:421:1: declaration : ( ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';' -> ^( DECLARATION TYPEDEF declaration_specifiers ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) );
    public final nesCParser.declaration_return declaration() throws RecognitionException {
        declaration_stack.push(new declaration_scope());
        nesCParser.declaration_return retval = new nesCParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal115=null;
        Token TYPEDEF117=null;
        Token char_literal119=null;
        Token TYPEDEF120=null;
        Token char_literal125=null;
        nesCParser.declaration_specifiers_return declaration_specifiers112 =null;

        nesCParser.gcc_attributes_return gcc_attributes113 =null;

        nesCParser.init_declarator_list_return init_declarator_list114 =null;

        nesCParser.function_definition_return function_definition116 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers118 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers121 =null;

        nesCParser.gcc_attributes_return gcc_attributes122 =null;

        nesCParser.init_declarator_list_return init_declarator_list123 =null;

        nesCParser.gcc_attributes_return gcc_attributes124 =null;


        Object char_literal115_tree=null;
        Object TYPEDEF117_tree=null;
        Object char_literal119_tree=null;
        Object TYPEDEF120_tree=null;
        Object char_literal125_tree=null;
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        RewriteRuleSubtreeStream stream_gcc_attributes=new RewriteRuleSubtreeStream(adaptor,"rule gcc_attributes");
        try {
            // nesC.g:424:5: ( ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';' -> ^( DECLARATION TYPEDEF declaration_specifiers ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case ASYNC:
            case AUTO:
            case COMMAND:
            case DUTY:
            case EVENT:
            case EXTERN:
            case NORACE:
            case REGISTER:
            case STATIC:
            case TASK:
                {
                int LA33_1 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA33_2 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA33_3 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA33_4 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA33_5 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA33_6 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA33_7 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA33_8 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA33_9 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 9, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA33_10 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA33_11 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 11, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA33_12 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 12, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA33_13 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 13, input);

                    throw nvae;

                }
                }
                break;
            case INT64_T:
                {
                int LA33_14 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 14, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA33_15 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 15, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA33_16 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 16, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA33_17 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 17, input);

                    throw nvae;

                }
                }
                break;
            case UINT64_T:
                {
                int LA33_18 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 18, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA33_19 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 19, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA33_20 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 20, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA33_21 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 21, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT64_T:
                {
                int LA33_22 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 22, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT8_T:
                {
                int LA33_23 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 23, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT16_T:
                {
                int LA33_24 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 24, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT32_T:
                {
                int LA33_25 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 25, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA33_26 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 26, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA33_27 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 27, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA33_28 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 28, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA33_29 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 29, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA33_30 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 30, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA33_31 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 31, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA33_32 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 32, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                int LA33_33 = input.LA(2);

                if ( (synpred4_nesC()) ) {
                    alt33=3;
                }
                else if ( (true) ) {
                    alt33=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 33, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // nesC.g:424:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3965);
                    declaration_specifiers112=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers112.getTree());

                    // nesC.g:429:33: ( gcc_attributes )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==GCCATTRIBUTE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // nesC.g:429:33: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration3967);
                            gcc_attributes113=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes113.getTree());

                            }
                            break;

                    }


                    // nesC.g:429:49: ( init_declarator_list )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPARENS||LA30_0==RAW_IDENTIFIER||LA30_0==STAR) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // nesC.g:429:49: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration3970);
                            init_declarator_list114=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list114.getTree());

                            }
                            break;

                    }


                    char_literal115=(Token)match(input,190,FOLLOW_190_in_declaration3973); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal115);


                    if ( state.backtracking==0 ) {
                                   // Inefficient, but how many declarators will be in a declaration, honestly?
                                   for (int i = 0; i < ((declaration_scope)declaration_stack.peek()).declaredNames.size(); ++i) {
                                       symbols.addIdentifier(((declaration_scope)declaration_stack.peek()).declaredNames.get(i));
                                   }
                                 }

                    // AST REWRITE
                    // elements: init_declarator_list, declaration_specifiers
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 436:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // nesC.g:436:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:436:54: ( init_declarator_list )?
                        if ( stream_init_declarator_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_init_declarator_list.nextTree());

                        }
                        stream_init_declarator_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:438:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration4035);
                    function_definition116=function_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_definition.add(function_definition116.getTree());

                    if ( state.backtracking==0 ) {
                                   // Inefficient, but how many declarators will be in a declaration, honestly?
                                   for (int i = 0; i < ((declaration_scope)declaration_stack.peek()).declaredNames.size(); ++i) {
                                       symbols.addIdentifier(((declaration_scope)declaration_stack.peek()).declaredNames.get(i));
                                   }
                                 }

                    // AST REWRITE
                    // elements: function_definition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 448:14: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // nesC.g:448:17: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // nesC.g:448:31: ^( FUNCTION_DEFINITION function_definition )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_DEFINITION, "FUNCTION_DEFINITION")
                        , root_2);

                        adaptor.addChild(root_2, stream_function_definition.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:453:10: ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';'
                    {
                    TYPEDEF117=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration4127); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF117);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4129);
                    declaration_specifiers118=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers118.getTree());

                    char_literal119=(Token)match(input,190,FOLLOW_190_in_declaration4131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal119);


                    // AST REWRITE
                    // elements: TYPEDEF, declaration_specifiers
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 454:14: -> ^( DECLARATION TYPEDEF declaration_specifiers )
                    {
                        // nesC.g:454:17: ^( DECLARATION TYPEDEF declaration_specifiers )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_TYPEDEF.nextNode()
                        );

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:456:10: TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF120=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration4177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF120);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4179);
                    declaration_specifiers121=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers121.getTree());

                    // nesC.g:459:41: ( gcc_attributes )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==GCCATTRIBUTE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // nesC.g:459:41: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4181);
                            gcc_attributes122=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes122.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_init_declarator_list_in_declaration4184);
                    init_declarator_list123=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list123.getTree());

                    // nesC.g:459:78: ( gcc_attributes )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==GCCATTRIBUTE) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // nesC.g:459:78: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4186);
                            gcc_attributes124=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes124.getTree());

                            }
                            break;

                    }


                    char_literal125=(Token)match(input,190,FOLLOW_190_in_declaration4189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal125);


                    if ( state.backtracking==0 ) {
                                   // Inefficient, but how many declarators will be in a declaration, honestly?
                                   for (int i = 0; i < ((declaration_scope)declaration_stack.peek()).declaredNames.size(); ++i) {
                                       symbols.addType(((declaration_scope)declaration_stack.peek()).declaredNames.get(i));
                                   }
                                 }

                    // AST REWRITE
                    // elements: TYPEDEF, init_declarator_list, declaration_specifiers
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 466:14: -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                    {
                        // nesC.g:466:17: ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_TYPEDEF.nextNode()
                        );

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        adaptor.addChild(root_1, stream_init_declarator_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            declaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class declaration_specifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration_specifiers"
    // nesC.g:474:1: declaration_specifiers : ( c_style_declaration_specifier )+ ;
    public final nesCParser.declaration_specifiers_return declaration_specifiers() throws RecognitionException {
        nesCParser.declaration_specifiers_return retval = new nesCParser.declaration_specifiers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.c_style_declaration_specifier_return c_style_declaration_specifier126 =null;



        try {
            // nesC.g:475:5: ( ( c_style_declaration_specifier )+ )
            // nesC.g:475:25: ( c_style_declaration_specifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:475:25: ( c_style_declaration_specifier )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RAW_IDENTIFIER) ) {
                    int LA34_2 = input.LA(2);

                    if ( (( symbols.isType(input.LT(1).getText()) )) ) {
                        alt34=1;
                    }


                }
                else if ( (LA34_0==ASYNC||LA34_0==AUTO||LA34_0==CHAR||LA34_0==COMMAND||LA34_0==CONST||(LA34_0 >= DOUBLE && LA34_0 <= DUTY)||LA34_0==ENUM||(LA34_0 >= EVENT && LA34_0 <= EXTERN)||LA34_0==FLOAT||(LA34_0 >= INLINE && LA34_0 <= INT8_T)||LA34_0==LONG||LA34_0==NORACE||(LA34_0 >= NXLE_UINT16_T && LA34_0 <= NX_UNION)||LA34_0==REGISTER||LA34_0==RESTRICT||LA34_0==SHORT||LA34_0==SIGNED||LA34_0==STATIC||LA34_0==STRUCT||LA34_0==TASK||(LA34_0 >= UINT16_T && LA34_0 <= UINT8_T)||(LA34_0 >= UNION && LA34_0 <= UNSIGNED)||(LA34_0 >= VOID && LA34_0 <= VOLATILE)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // nesC.g:475:25: c_style_declaration_specifier
            	    {
            	    pushFollow(FOLLOW_c_style_declaration_specifier_in_declaration_specifiers4256);
            	    c_style_declaration_specifier126=c_style_declaration_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, c_style_declaration_specifier126.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration_specifiers"


    public static class c_style_declaration_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "c_style_declaration_specifier"
    // nesC.g:477:1: c_style_declaration_specifier : ( storage_class_specifier | type_specifier | type_qualifier | function_specifier );
    public final nesCParser.c_style_declaration_specifier_return c_style_declaration_specifier() throws RecognitionException {
        nesCParser.c_style_declaration_specifier_return retval = new nesCParser.c_style_declaration_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.storage_class_specifier_return storage_class_specifier127 =null;

        nesCParser.type_specifier_return type_specifier128 =null;

        nesCParser.type_qualifier_return type_qualifier129 =null;

        nesCParser.function_specifier_return function_specifier130 =null;



        try {
            // nesC.g:478:5: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier )
            int alt35=4;
            switch ( input.LA(1) ) {
            case ASYNC:
            case AUTO:
            case COMMAND:
            case DUTY:
            case EVENT:
            case EXTERN:
            case NORACE:
            case REGISTER:
            case STATIC:
            case TASK:
                {
                alt35=1;
                }
                break;
            case CHAR:
            case DOUBLE:
            case ENUM:
            case FLOAT:
            case INT:
            case INT16_T:
            case INT32_T:
            case INT64_T:
            case INT8_T:
            case LONG:
            case NXLE_UINT16_T:
            case NXLE_UINT32_T:
            case NXLE_UINT64_T:
            case NXLE_UINT8_T:
            case NX_STRUCT:
            case NX_UINT16_T:
            case NX_UINT32_T:
            case NX_UINT64_T:
            case NX_UINT8_T:
            case NX_UNION:
            case RAW_IDENTIFIER:
            case SHORT:
            case SIGNED:
            case STRUCT:
            case UINT16_T:
            case UINT32_T:
            case UINT64_T:
            case UINT8_T:
            case UNION:
            case UNSIGNED:
            case VOID:
                {
                alt35=2;
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                alt35=3;
                }
                break;
            case INLINE:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // nesC.g:478:10: storage_class_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_storage_class_specifier_in_c_style_declaration_specifier4272);
                    storage_class_specifier127=storage_class_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier127.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:479:10: type_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_specifier_in_c_style_declaration_specifier4283);
                    type_specifier128=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier128.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:480:10: type_qualifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_qualifier_in_c_style_declaration_specifier4294);
                    type_qualifier129=type_qualifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier129.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:481:10: function_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_function_specifier_in_c_style_declaration_specifier4305);
                    function_specifier130=function_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_specifier130.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "c_style_declaration_specifier"


    public static class init_declarator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator_list"
    // nesC.g:487:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
    public final nesCParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
        nesCParser.init_declarator_list_return retval = new nesCParser.init_declarator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal132=null;
        nesCParser.init_declarator_return init_declarator131 =null;

        nesCParser.init_declarator_return init_declarator133 =null;


        Object char_literal132_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");
        try {
            // nesC.g:488:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // nesC.g:488:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list4326);
            init_declarator131=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator131.getTree());

            // nesC.g:488:26: ( ',' init_declarator )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COMMA) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // nesC.g:488:27: ',' init_declarator
            	    {
            	    char_literal132=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list4329); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal132);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list4331);
            	    init_declarator133=init_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator133.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // AST REWRITE
            // elements: init_declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 488:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // nesC.g:488:52: ^( DECLARATOR_LIST ( init_declarator )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR_LIST, "DECLARATOR_LIST")
                , root_1);

                if ( !(stream_init_declarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_init_declarator.hasNext() ) {
                    adaptor.addChild(root_1, stream_init_declarator.nextTree());

                }
                stream_init_declarator.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_declarator_list"


    public static class init_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator"
    // nesC.g:494:1: init_declarator : declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
    public final nesCParser.init_declarator_return init_declarator() throws RecognitionException {
        nesCParser.init_declarator_return retval = new nesCParser.init_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal136=null;
        nesCParser.declarator_return declarator134 =null;

        nesCParser.attributes_return attributes135 =null;

        nesCParser.initializer_return initializer137 =null;


        Object char_literal136_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // nesC.g:495:5: ( declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // nesC.g:495:10: declarator ( attributes )? ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator4365);
            declarator134=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator134.getTree());

            // nesC.g:495:21: ( attributes )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ATTRIBUTE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // nesC.g:495:21: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_init_declarator4367);
                    attributes135=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes135.getTree());

                    }
                    break;

            }


            // nesC.g:495:33: ( '=' initializer )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ASSIGN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // nesC.g:495:34: '=' initializer
                    {
                    char_literal136=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator4371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal136);


                    pushFollow(FOLLOW_initializer_in_init_declarator4373);
                    initializer137=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer137.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: initializer, declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 495:52: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // nesC.g:495:55: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // nesC.g:495:84: ( initializer )?
                if ( stream_initializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_initializer.nextTree());

                }
                stream_initializer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_declarator"


    public static class storage_class_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "storage_class_specifier"
    // nesC.g:497:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK );
    public final nesCParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        nesCParser.storage_class_specifier_return retval = new nesCParser.storage_class_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set138=null;

        Object set138_tree=null;

        try {
            // nesC.g:498:5: ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set138=(Token)input.LT(1);

            if ( input.LA(1)==ASYNC||input.LA(1)==AUTO||input.LA(1)==COMMAND||input.LA(1)==DUTY||(input.LA(1) >= EVENT && input.LA(1) <= EXTERN)||input.LA(1)==NORACE||input.LA(1)==REGISTER||input.LA(1)==STATIC||input.LA(1)==TASK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set138)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "storage_class_specifier"


    public static class type_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // nesC.g:509:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | struct_or_union_specifier | enum_specifier | typedef_name );
    public final nesCParser.type_specifier_return type_specifier() throws RecognitionException {
        nesCParser.type_specifier_return retval = new nesCParser.type_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID139=null;
        Token CHAR140=null;
        Token SHORT141=null;
        Token INT142=null;
        Token LONG143=null;
        Token SIGNED144=null;
        Token UNSIGNED145=null;
        Token FLOAT146=null;
        Token DOUBLE147=null;
        Token INT8_T148=null;
        Token INT16_T149=null;
        Token INT32_T150=null;
        Token INT64_T151=null;
        Token UINT8_T152=null;
        Token UINT16_T153=null;
        Token UINT32_T154=null;
        Token UINT64_T155=null;
        Token NX_UINT8_T156=null;
        Token NX_UINT16_T157=null;
        Token NX_UINT32_T158=null;
        Token NX_UINT64_T159=null;
        Token NXLE_UINT8_T160=null;
        Token NXLE_UINT16_T161=null;
        Token NXLE_UINT32_T162=null;
        Token NXLE_UINT64_T163=null;
        nesCParser.struct_or_union_specifier_return struct_or_union_specifier164 =null;

        nesCParser.enum_specifier_return enum_specifier165 =null;

        nesCParser.typedef_name_return typedef_name166 =null;


        Object VOID139_tree=null;
        Object CHAR140_tree=null;
        Object SHORT141_tree=null;
        Object INT142_tree=null;
        Object LONG143_tree=null;
        Object SIGNED144_tree=null;
        Object UNSIGNED145_tree=null;
        Object FLOAT146_tree=null;
        Object DOUBLE147_tree=null;
        Object INT8_T148_tree=null;
        Object INT16_T149_tree=null;
        Object INT32_T150_tree=null;
        Object INT64_T151_tree=null;
        Object UINT8_T152_tree=null;
        Object UINT16_T153_tree=null;
        Object UINT32_T154_tree=null;
        Object UINT64_T155_tree=null;
        Object NX_UINT8_T156_tree=null;
        Object NX_UINT16_T157_tree=null;
        Object NX_UINT32_T158_tree=null;
        Object NX_UINT64_T159_tree=null;
        Object NXLE_UINT8_T160_tree=null;
        Object NXLE_UINT16_T161_tree=null;
        Object NXLE_UINT32_T162_tree=null;
        Object NXLE_UINT64_T163_tree=null;

        try {
            // nesC.g:510:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | struct_or_union_specifier | enum_specifier | typedef_name )
            int alt39=28;
            switch ( input.LA(1) ) {
            case VOID:
                {
                alt39=1;
                }
                break;
            case CHAR:
                {
                alt39=2;
                }
                break;
            case SHORT:
                {
                alt39=3;
                }
                break;
            case INT:
                {
                alt39=4;
                }
                break;
            case LONG:
                {
                alt39=5;
                }
                break;
            case SIGNED:
                {
                alt39=6;
                }
                break;
            case UNSIGNED:
                {
                alt39=7;
                }
                break;
            case FLOAT:
                {
                alt39=8;
                }
                break;
            case DOUBLE:
                {
                alt39=9;
                }
                break;
            case INT8_T:
                {
                alt39=10;
                }
                break;
            case INT16_T:
                {
                alt39=11;
                }
                break;
            case INT32_T:
                {
                alt39=12;
                }
                break;
            case INT64_T:
                {
                alt39=13;
                }
                break;
            case UINT8_T:
                {
                alt39=14;
                }
                break;
            case UINT16_T:
                {
                alt39=15;
                }
                break;
            case UINT32_T:
                {
                alt39=16;
                }
                break;
            case UINT64_T:
                {
                alt39=17;
                }
                break;
            case NX_UINT8_T:
                {
                alt39=18;
                }
                break;
            case NX_UINT16_T:
                {
                alt39=19;
                }
                break;
            case NX_UINT32_T:
                {
                alt39=20;
                }
                break;
            case NX_UINT64_T:
                {
                alt39=21;
                }
                break;
            case NXLE_UINT8_T:
                {
                alt39=22;
                }
                break;
            case NXLE_UINT16_T:
                {
                alt39=23;
                }
                break;
            case NXLE_UINT32_T:
                {
                alt39=24;
                }
                break;
            case NXLE_UINT64_T:
                {
                alt39=25;
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case STRUCT:
            case UNION:
                {
                alt39=26;
                }
                break;
            case ENUM:
                {
                alt39=27;
                }
                break;
            case RAW_IDENTIFIER:
                {
                alt39=28;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // nesC.g:510:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID139=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier4522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID139_tree = 
                    (Object)adaptor.create(VOID139)
                    ;
                    adaptor.addChild(root_0, VOID139_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:511:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR140=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier4532); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR140_tree = 
                    (Object)adaptor.create(CHAR140)
                    ;
                    adaptor.addChild(root_0, CHAR140_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:512:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT141=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier4542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT141_tree = 
                    (Object)adaptor.create(SHORT141)
                    ;
                    adaptor.addChild(root_0, SHORT141_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:513:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT142=(Token)match(input,INT,FOLLOW_INT_in_type_specifier4552); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT142_tree = 
                    (Object)adaptor.create(INT142)
                    ;
                    adaptor.addChild(root_0, INT142_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:514:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG143=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier4562); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG143_tree = 
                    (Object)adaptor.create(LONG143)
                    ;
                    adaptor.addChild(root_0, LONG143_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:515:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED144=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier4572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED144_tree = 
                    (Object)adaptor.create(SIGNED144)
                    ;
                    adaptor.addChild(root_0, SIGNED144_tree);
                    }

                    }
                    break;
                case 7 :
                    // nesC.g:516:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED145=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier4582); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED145_tree = 
                    (Object)adaptor.create(UNSIGNED145)
                    ;
                    adaptor.addChild(root_0, UNSIGNED145_tree);
                    }

                    }
                    break;
                case 8 :
                    // nesC.g:517:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT146=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier4592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT146_tree = 
                    (Object)adaptor.create(FLOAT146)
                    ;
                    adaptor.addChild(root_0, FLOAT146_tree);
                    }

                    }
                    break;
                case 9 :
                    // nesC.g:518:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLE147=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_type_specifier4602); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE147_tree = 
                    (Object)adaptor.create(DOUBLE147)
                    ;
                    adaptor.addChild(root_0, DOUBLE147_tree);
                    }

                    }
                    break;
                case 10 :
                    // nesC.g:520:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T148=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier4613); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T148_tree = 
                    (Object)adaptor.create(INT8_T148)
                    ;
                    adaptor.addChild(root_0, INT8_T148_tree);
                    }

                    }
                    break;
                case 11 :
                    // nesC.g:521:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T149=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier4623); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T149_tree = 
                    (Object)adaptor.create(INT16_T149)
                    ;
                    adaptor.addChild(root_0, INT16_T149_tree);
                    }

                    }
                    break;
                case 12 :
                    // nesC.g:522:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T150=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier4633); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T150_tree = 
                    (Object)adaptor.create(INT32_T150)
                    ;
                    adaptor.addChild(root_0, INT32_T150_tree);
                    }

                    }
                    break;
                case 13 :
                    // nesC.g:523:9: INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT64_T151=(Token)match(input,INT64_T,FOLLOW_INT64_T_in_type_specifier4643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT64_T151_tree = 
                    (Object)adaptor.create(INT64_T151)
                    ;
                    adaptor.addChild(root_0, INT64_T151_tree);
                    }

                    }
                    break;
                case 14 :
                    // nesC.g:524:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T152=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier4653); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T152_tree = 
                    (Object)adaptor.create(UINT8_T152)
                    ;
                    adaptor.addChild(root_0, UINT8_T152_tree);
                    }

                    }
                    break;
                case 15 :
                    // nesC.g:525:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T153=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier4663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T153_tree = 
                    (Object)adaptor.create(UINT16_T153)
                    ;
                    adaptor.addChild(root_0, UINT16_T153_tree);
                    }

                    }
                    break;
                case 16 :
                    // nesC.g:526:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T154=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier4673); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T154_tree = 
                    (Object)adaptor.create(UINT32_T154)
                    ;
                    adaptor.addChild(root_0, UINT32_T154_tree);
                    }

                    }
                    break;
                case 17 :
                    // nesC.g:527:9: UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT64_T155=(Token)match(input,UINT64_T,FOLLOW_UINT64_T_in_type_specifier4683); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT64_T155_tree = 
                    (Object)adaptor.create(UINT64_T155)
                    ;
                    adaptor.addChild(root_0, UINT64_T155_tree);
                    }

                    }
                    break;
                case 18 :
                    // nesC.g:529:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T156=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier4694); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T156_tree = 
                    (Object)adaptor.create(NX_UINT8_T156)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T156_tree);
                    }

                    }
                    break;
                case 19 :
                    // nesC.g:530:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T157=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier4704); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T157_tree = 
                    (Object)adaptor.create(NX_UINT16_T157)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T157_tree);
                    }

                    }
                    break;
                case 20 :
                    // nesC.g:531:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T158=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier4714); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T158_tree = 
                    (Object)adaptor.create(NX_UINT32_T158)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T158_tree);
                    }

                    }
                    break;
                case 21 :
                    // nesC.g:532:9: NX_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT64_T159=(Token)match(input,NX_UINT64_T,FOLLOW_NX_UINT64_T_in_type_specifier4724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT64_T159_tree = 
                    (Object)adaptor.create(NX_UINT64_T159)
                    ;
                    adaptor.addChild(root_0, NX_UINT64_T159_tree);
                    }

                    }
                    break;
                case 22 :
                    // nesC.g:533:9: NXLE_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT8_T160=(Token)match(input,NXLE_UINT8_T,FOLLOW_NXLE_UINT8_T_in_type_specifier4734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT8_T160_tree = 
                    (Object)adaptor.create(NXLE_UINT8_T160)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT8_T160_tree);
                    }

                    }
                    break;
                case 23 :
                    // nesC.g:534:9: NXLE_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT16_T161=(Token)match(input,NXLE_UINT16_T,FOLLOW_NXLE_UINT16_T_in_type_specifier4744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT16_T161_tree = 
                    (Object)adaptor.create(NXLE_UINT16_T161)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT16_T161_tree);
                    }

                    }
                    break;
                case 24 :
                    // nesC.g:535:9: NXLE_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT32_T162=(Token)match(input,NXLE_UINT32_T,FOLLOW_NXLE_UINT32_T_in_type_specifier4754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT32_T162_tree = 
                    (Object)adaptor.create(NXLE_UINT32_T162)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT32_T162_tree);
                    }

                    }
                    break;
                case 25 :
                    // nesC.g:536:9: NXLE_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT64_T163=(Token)match(input,NXLE_UINT64_T,FOLLOW_NXLE_UINT64_T_in_type_specifier4764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT64_T163_tree = 
                    (Object)adaptor.create(NXLE_UINT64_T163)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT64_T163_tree);
                    }

                    }
                    break;
                case 26 :
                    // nesC.g:538:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier4775);
                    struct_or_union_specifier164=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier164.getTree());

                    }
                    break;
                case 27 :
                    // nesC.g:539:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier4785);
                    enum_specifier165=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier165.getTree());

                    }
                    break;
                case 28 :
                    // nesC.g:540:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier4795);
                    typedef_name166=typedef_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedef_name166.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_specifier"


    public static class struct_or_union_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_or_union_specifier"
    // nesC.g:542:1: struct_or_union_specifier : ( struct_or_union '{' struct_declaration_list '}' -> ^( struct_or_union struct_declaration_list ) | struct_or_union identifier ( '{' struct_declaration_list '}' )? -> ^( struct_or_union identifier ( struct_declaration_list )? ) | STRUCT '@' identifier '{' struct_declaration_list '}' -> ^( STRUCT '@' identifier struct_declaration_list ) );
    public final nesCParser.struct_or_union_specifier_return struct_or_union_specifier() throws RecognitionException {
        nesCParser.struct_or_union_specifier_return retval = new nesCParser.struct_or_union_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal168=null;
        Token char_literal170=null;
        Token char_literal173=null;
        Token char_literal175=null;
        Token STRUCT176=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal181=null;
        nesCParser.struct_or_union_return struct_or_union167 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list169 =null;

        nesCParser.struct_or_union_return struct_or_union171 =null;

        nesCParser.identifier_return identifier172 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list174 =null;

        nesCParser.identifier_return identifier178 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list180 =null;


        Object char_literal168_tree=null;
        Object char_literal170_tree=null;
        Object char_literal173_tree=null;
        Object char_literal175_tree=null;
        Object STRUCT176_tree=null;
        Object char_literal177_tree=null;
        Object char_literal179_tree=null;
        Object char_literal181_tree=null;
        RewriteRuleTokenStream stream_STRUCT=new RewriteRuleTokenStream(adaptor,"token STRUCT");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleTokenStream stream_ATTRIBUTE=new RewriteRuleTokenStream(adaptor,"token ATTRIBUTE");
        RewriteRuleSubtreeStream stream_struct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declaration_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");
        try {
            // nesC.g:543:5: ( struct_or_union '{' struct_declaration_list '}' -> ^( struct_or_union struct_declaration_list ) | struct_or_union identifier ( '{' struct_declaration_list '}' )? -> ^( struct_or_union identifier ( struct_declaration_list )? ) | STRUCT '@' identifier '{' struct_declaration_list '}' -> ^( STRUCT '@' identifier struct_declaration_list ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==STRUCT) ) {
                switch ( input.LA(2) ) {
                case ATTRIBUTE:
                    {
                    alt41=3;
                    }
                    break;
                case LBRACE:
                    {
                    alt41=1;
                    }
                    break;
                case RAW_IDENTIFIER:
                    {
                    alt41=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA41_0==NX_STRUCT||LA41_0==NX_UNION||LA41_0==UNION) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==LBRACE) ) {
                    alt41=1;
                }
                else if ( (LA41_2==RAW_IDENTIFIER) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // nesC.g:543:10: struct_or_union '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4810);
                    struct_or_union167=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union167.getTree());

                    char_literal168=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal168);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4814);
                    struct_declaration_list169=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list169.getTree());

                    char_literal170=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal170);


                    // AST REWRITE
                    // elements: struct_or_union, struct_declaration_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 544:14: -> ^( struct_or_union struct_declaration_list )
                    {
                        // nesC.g:544:17: ^( struct_or_union struct_declaration_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_struct_declaration_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:545:10: struct_or_union identifier ( '{' struct_declaration_list '}' )?
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4848);
                    struct_or_union171=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union171.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4850);
                    identifier172=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier172.getTree());

                    // nesC.g:545:37: ( '{' struct_declaration_list '}' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==LBRACE) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // nesC.g:545:56: '{' struct_declaration_list '}'
                            {
                            char_literal173=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4855); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal173);


                            pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4857);
                            struct_declaration_list174=struct_declaration_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list174.getTree());

                            char_literal175=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4859); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal175);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: struct_declaration_list, struct_or_union, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 546:14: -> ^( struct_or_union identifier ( struct_declaration_list )? )
                    {
                        // nesC.g:546:17: ^( struct_or_union identifier ( struct_declaration_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:546:64: ( struct_declaration_list )?
                        if ( stream_struct_declaration_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_struct_declaration_list.nextTree());

                        }
                        stream_struct_declaration_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:547:10: STRUCT '@' identifier '{' struct_declaration_list '}'
                    {
                    STRUCT176=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_struct_or_union_specifier4898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRUCT.add(STRUCT176);


                    char_literal177=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_struct_or_union_specifier4900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATTRIBUTE.add(char_literal177);


                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4902);
                    identifier178=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier178.getTree());

                    char_literal179=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal179);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4906);
                    struct_declaration_list180=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list180.getTree());

                    char_literal181=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal181);


                    // AST REWRITE
                    // elements: STRUCT, struct_declaration_list, ATTRIBUTE, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 548:14: -> ^( STRUCT '@' identifier struct_declaration_list )
                    {
                        // nesC.g:548:17: ^( STRUCT '@' identifier struct_declaration_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STRUCT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ATTRIBUTE.nextNode()
                        );

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_1, stream_struct_declaration_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_or_union_specifier"


    public static class struct_or_union_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_or_union"
    // nesC.g:550:1: struct_or_union : ( STRUCT | UNION | NX_STRUCT | NX_UNION );
    public final nesCParser.struct_or_union_return struct_or_union() throws RecognitionException {
        nesCParser.struct_or_union_return retval = new nesCParser.struct_or_union_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set182=null;

        Object set182_tree=null;

        try {
            // nesC.g:551:5: ( STRUCT | UNION | NX_STRUCT | NX_UNION )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set182=(Token)input.LT(1);

            if ( input.LA(1)==NX_STRUCT||input.LA(1)==NX_UNION||input.LA(1)==STRUCT||input.LA(1)==UNION ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set182)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_or_union"


    public static class struct_declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declaration_list"
    // nesC.g:556:1: struct_declaration_list : ( struct_declaration )+ ;
    public final nesCParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        nesCParser.struct_declaration_list_return retval = new nesCParser.struct_declaration_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.struct_declaration_return struct_declaration183 =null;



        try {
            // nesC.g:557:5: ( ( struct_declaration )+ )
            // nesC.g:557:10: ( struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // nesC.g:558:10: ( struct_declaration )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==CHAR||LA42_0==CONST||LA42_0==DOUBLE||LA42_0==ENUM||LA42_0==FLOAT||(LA42_0 >= INT && LA42_0 <= INT8_T)||LA42_0==LONG||(LA42_0 >= NXLE_UINT16_T && LA42_0 <= NX_UNION)||LA42_0==RAW_IDENTIFIER||LA42_0==RESTRICT||LA42_0==SHORT||LA42_0==SIGNED||LA42_0==STRUCT||(LA42_0 >= UINT16_T && LA42_0 <= UINT8_T)||(LA42_0 >= UNION && LA42_0 <= UNSIGNED)||(LA42_0 >= VOID && LA42_0 <= VOLATILE)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // nesC.g:558:10: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list4993);
            	    struct_declaration183=struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_declaration183.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false; }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_declaration_list"


    public static class struct_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declaration"
    // nesC.g:561:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final nesCParser.struct_declaration_return struct_declaration() throws RecognitionException {
        nesCParser.struct_declaration_return retval = new nesCParser.struct_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal186=null;
        nesCParser.specifier_qualifier_list_return specifier_qualifier_list184 =null;

        nesCParser.struct_declarator_list_return struct_declarator_list185 =null;


        Object char_literal186_tree=null;
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            // nesC.g:562:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // nesC.g:562:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration5024);
            specifier_qualifier_list184=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list184.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration5026);
            struct_declarator_list185=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list185.getTree());

            char_literal186=(Token)match(input,190,FOLLOW_190_in_struct_declaration5028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_190.add(char_literal186);


            // AST REWRITE
            // elements: specifier_qualifier_list, struct_declarator_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 563:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // nesC.g:563:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATION, "DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_specifier_qualifier_list.nextTree());

                adaptor.addChild(root_1, stream_struct_declarator_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_declaration"


    public static class specifier_qualifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specifier_qualifier_list"
    // nesC.g:570:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final nesCParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        nesCParser.specifier_qualifier_list_return retval = new nesCParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.type_specifier_return type_specifier187 =null;

        nesCParser.type_qualifier_return type_qualifier188 =null;



        try {
            // nesC.g:571:5: ( ( type_specifier | type_qualifier )+ )
            // nesC.g:571:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:571:10: ( type_specifier | type_qualifier )+
            int cnt43=0;
            loop43:
            do {
                int alt43=3;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA43_2 = input.LA(2);

                    if ( (( symbols.isType(input.LT(1).getText()) )) ) {
                        alt43=1;
                    }


                    }
                    break;
                case CHAR:
                case DOUBLE:
                case ENUM:
                case FLOAT:
                case INT:
                case INT16_T:
                case INT32_T:
                case INT64_T:
                case INT8_T:
                case LONG:
                case NXLE_UINT16_T:
                case NXLE_UINT32_T:
                case NXLE_UINT64_T:
                case NXLE_UINT8_T:
                case NX_STRUCT:
                case NX_UINT16_T:
                case NX_UINT32_T:
                case NX_UINT64_T:
                case NX_UINT8_T:
                case NX_UNION:
                case SHORT:
                case SIGNED:
                case STRUCT:
                case UINT16_T:
                case UINT32_T:
                case UINT64_T:
                case UINT8_T:
                case UNION:
                case UNSIGNED:
                case VOID:
                    {
                    alt43=1;
                    }
                    break;
                case CONST:
                case RESTRICT:
                case VOLATILE:
                    {
                    alt43=2;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // nesC.g:571:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list5071);
            	    type_specifier187=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier187.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:571:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list5075);
            	    type_qualifier188=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier188.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "specifier_qualifier_list"


    public static class struct_declarator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declarator_list"
    // nesC.g:578:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
    public final nesCParser.struct_declarator_list_return struct_declarator_list() throws RecognitionException {
        nesCParser.struct_declarator_list_return retval = new nesCParser.struct_declarator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal190=null;
        nesCParser.struct_declarator_return struct_declarator189 =null;

        nesCParser.struct_declarator_return struct_declarator191 =null;


        Object char_literal190_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_struct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator");
        try {
            // nesC.g:579:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // nesC.g:579:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5101);
            struct_declarator189=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator189.getTree());

            // nesC.g:579:28: ( ',' struct_declarator )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // nesC.g:579:29: ',' struct_declarator
            	    {
            	    char_literal190=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list5104); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal190);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5106);
            	    struct_declarator191=struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator191.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            // AST REWRITE
            // elements: struct_declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 579:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // nesC.g:579:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR_LIST, "DECLARATOR_LIST")
                , root_1);

                if ( !(stream_struct_declarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_struct_declarator.hasNext() ) {
                    adaptor.addChild(root_1, stream_struct_declarator.nextTree());

                }
                stream_struct_declarator.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_declarator_list"


    public static class struct_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declarator"
    // nesC.g:581:1: struct_declarator : ( declarator ( ':' constant_expression )? | ':' constant_expression );
    public final nesCParser.struct_declarator_return struct_declarator() throws RecognitionException {
        nesCParser.struct_declarator_return retval = new nesCParser.struct_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal193=null;
        Token char_literal195=null;
        nesCParser.declarator_return declarator192 =null;

        nesCParser.constant_expression_return constant_expression194 =null;

        nesCParser.constant_expression_return constant_expression196 =null;


        Object char_literal193_tree=null;
        Object char_literal195_tree=null;

        try {
            // nesC.g:582:5: ( declarator ( ':' constant_expression )? | ':' constant_expression )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LPARENS||LA46_0==RAW_IDENTIFIER||LA46_0==STAR) ) {
                alt46=1;
            }
            else if ( (LA46_0==189) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // nesC.g:582:10: declarator ( ':' constant_expression )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator5136);
                    declarator192=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator192.getTree());

                    // nesC.g:582:21: ( ':' constant_expression )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==189) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // nesC.g:582:22: ':' constant_expression
                            {
                            char_literal193=(Token)match(input,189,FOLLOW_189_in_struct_declarator5139); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal193_tree = 
                            (Object)adaptor.create(char_literal193)
                            ;
                            adaptor.addChild(root_0, char_literal193_tree);
                            }

                            pushFollow(FOLLOW_constant_expression_in_struct_declarator5141);
                            constant_expression194=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression194.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // nesC.g:583:10: ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal195=(Token)match(input,189,FOLLOW_189_in_struct_declarator5154); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal195_tree = 
                    (Object)adaptor.create(char_literal195)
                    ;
                    adaptor.addChild(root_0, char_literal195_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator5156);
                    constant_expression196=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression196.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_declarator"


    public static class enum_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enum_specifier"
    // nesC.g:585:1: enum_specifier : ( ENUM '{' enumerator_list ( ',' )? '}' -> ^( ENUM enumerator_list ) | ENUM identifier ( '{' enumerator_list ( ',' )? '}' )? -> ^( ENUM identifier ( enumerator_list )? ) );
    public final nesCParser.enum_specifier_return enum_specifier() throws RecognitionException {
        nesCParser.enum_specifier_return retval = new nesCParser.enum_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENUM197=null;
        Token char_literal198=null;
        Token char_literal200=null;
        Token char_literal201=null;
        Token ENUM202=null;
        Token char_literal204=null;
        Token char_literal206=null;
        Token char_literal207=null;
        nesCParser.enumerator_list_return enumerator_list199 =null;

        nesCParser.identifier_return identifier203 =null;

        nesCParser.enumerator_list_return enumerator_list205 =null;


        Object ENUM197_tree=null;
        Object char_literal198_tree=null;
        Object char_literal200_tree=null;
        Object char_literal201_tree=null;
        Object ENUM202_tree=null;
        Object char_literal204_tree=null;
        Object char_literal206_tree=null;
        Object char_literal207_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_enumerator_list=new RewriteRuleSubtreeStream(adaptor,"rule enumerator_list");
        try {
            // nesC.g:586:5: ( ENUM '{' enumerator_list ( ',' )? '}' -> ^( ENUM enumerator_list ) | ENUM identifier ( '{' enumerator_list ( ',' )? '}' )? -> ^( ENUM identifier ( enumerator_list )? ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ENUM) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==LBRACE) ) {
                    alt50=1;
                }
                else if ( (LA50_1==RAW_IDENTIFIER) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // nesC.g:586:10: ENUM '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM197=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM197);


                    char_literal198=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal198);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5179);
                    enumerator_list199=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list199.getTree());

                    // nesC.g:586:35: ( ',' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==COMMA) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // nesC.g:586:35: ','
                            {
                            char_literal200=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5181); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal200);


                            }
                            break;

                    }


                    char_literal201=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal201);


                    // AST REWRITE
                    // elements: enumerator_list, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 587:14: -> ^( ENUM enumerator_list )
                    {
                        // nesC.g:587:17: ^( ENUM enumerator_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_enumerator_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:588:10: ENUM identifier ( '{' enumerator_list ( ',' )? '}' )?
                    {
                    ENUM202=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM202);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5218);
                    identifier203=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier203.getTree());

                    // nesC.g:588:26: ( '{' enumerator_list ( ',' )? '}' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==LBRACE) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // nesC.g:588:45: '{' enumerator_list ( ',' )? '}'
                            {
                            char_literal204=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5223); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal204);


                            pushFollow(FOLLOW_enumerator_list_in_enum_specifier5225);
                            enumerator_list205=enumerator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list205.getTree());

                            // nesC.g:588:65: ( ',' )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==COMMA) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // nesC.g:588:65: ','
                                    {
                                    char_literal206=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5227); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(char_literal206);


                                    }
                                    break;

                            }


                            char_literal207=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5230); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal207);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ENUM, enumerator_list, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 589:14: -> ^( ENUM identifier ( enumerator_list )? )
                    {
                        // nesC.g:589:17: ^( ENUM identifier ( enumerator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:589:53: ( enumerator_list )?
                        if ( stream_enumerator_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_enumerator_list.nextTree());

                        }
                        stream_enumerator_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enum_specifier"


    public static class enumerator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumerator_list"
    // nesC.g:591:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
    public final nesCParser.enumerator_list_return enumerator_list() throws RecognitionException {
        nesCParser.enumerator_list_return retval = new nesCParser.enumerator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal209=null;
        nesCParser.enumerator_return enumerator208 =null;

        nesCParser.enumerator_return enumerator210 =null;


        Object char_literal209_tree=null;

        try {
            // nesC.g:592:5: ( enumerator ( ',' ! enumerator )* )
            // nesC.g:592:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list5277);
            enumerator208=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator208.getTree());

            // nesC.g:592:21: ( ',' ! enumerator )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMMA) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==RAW_IDENTIFIER) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // nesC.g:592:22: ',' ! enumerator
            	    {
            	    char_literal209=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list5280); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list5283);
            	    enumerator210=enumerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator210.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enumerator_list"


    public static class enumerator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumerator"
    // nesC.g:598:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
    public final nesCParser.enumerator_return enumerator() throws RecognitionException {
        nesCParser.enumerator_return retval = new nesCParser.enumerator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal212=null;
        nesCParser.identifier_return identifier211 =null;

        nesCParser.constant_expression_return constant_expression213 =null;


        Object char_literal212_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:599:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // nesC.g:599:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator5308);
            identifier211=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier211.getTree());

            // nesC.g:599:21: ( '=' constant_expression )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ASSIGN) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // nesC.g:599:22: '=' constant_expression
                    {
                    char_literal212=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator5311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal212);


                    pushFollow(FOLLOW_constant_expression_in_enumerator5313);
                    constant_expression213=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression213.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, constant_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 599:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // nesC.g:599:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:599:75: ( constant_expression )?
                if ( stream_constant_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_constant_expression.nextTree());

                }
                stream_constant_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enumerator"


    public static class type_qualifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_qualifier"
    // nesC.g:600:1: type_qualifier : ( CONST | RESTRICT | VOLATILE );
    public final nesCParser.type_qualifier_return type_qualifier() throws RecognitionException {
        nesCParser.type_qualifier_return retval = new nesCParser.type_qualifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set214=null;

        Object set214_tree=null;

        try {
            // nesC.g:601:5: ( CONST | RESTRICT | VOLATILE )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set214=(Token)input.LT(1);

            if ( input.LA(1)==CONST||input.LA(1)==RESTRICT||input.LA(1)==VOLATILE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set214)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_qualifier"


    public static class function_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_specifier"
    // nesC.g:605:1: function_specifier : INLINE ;
    public final nesCParser.function_specifier_return function_specifier() throws RecognitionException {
        nesCParser.function_specifier_return retval = new nesCParser.function_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INLINE215=null;

        Object INLINE215_tree=null;

        try {
            // nesC.g:606:5: ( INLINE )
            // nesC.g:606:10: INLINE
            {
            root_0 = (Object)adaptor.nil();


            INLINE215=(Token)match(input,INLINE,FOLLOW_INLINE_in_function_specifier5385); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INLINE215_tree = 
            (Object)adaptor.create(INLINE215)
            ;
            adaptor.addChild(root_0, INLINE215_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_specifier"


    public static class declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarator"
    // nesC.g:608:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
    public final nesCParser.declarator_return declarator() throws RecognitionException {
        nesCParser.declarator_return retval = new nesCParser.declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.pointer_return pointer216 =null;

        nesCParser.direct_declarator_return direct_declarator217 =null;


        RewriteRuleSubtreeStream stream_direct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule direct_declarator");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            // nesC.g:609:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // nesC.g:609:10: ( pointer )? direct_declarator
            {
            // nesC.g:609:10: ( pointer )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==STAR) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // nesC.g:609:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator5400);
                    pointer216=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer216.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator5403);
            direct_declarator217=direct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_direct_declarator.add(direct_declarator217.getTree());

            // AST REWRITE
            // elements: pointer, direct_declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 609:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // nesC.g:609:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // nesC.g:609:53: ( pointer )?
                if ( stream_pointer.hasNext() ) {
                    adaptor.addChild(root_1, stream_pointer.nextTree());

                }
                stream_pointer.reset();

                adaptor.addChild(root_1, stream_direct_declarator.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declarator"


    public static class direct_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_declarator"
    // nesC.g:611:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final nesCParser.direct_declarator_return direct_declarator() throws RecognitionException {
        nesCParser.direct_declarator_return retval = new nesCParser.direct_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.direct_declarator_identifier_return direct_declarator_identifier218 =null;

        nesCParser.direct_declarator_modifier_return direct_declarator_modifier219 =null;



        try {
            // nesC.g:612:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // nesC.g:612:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator5428);
            direct_declarator_identifier218=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier218.getTree());

            // nesC.g:612:38: ( direct_declarator_modifier )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==LBRACKET||LA54_0==LPARENS) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // nesC.g:612:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator5430);
            	    direct_declarator_modifier219=direct_declarator_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_modifier219.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "direct_declarator"


    public static class direct_declarator_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_declarator_identifier"
    // nesC.g:623:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
    public final nesCParser.direct_declarator_identifier_return direct_declarator_identifier() throws RecognitionException {
        nesCParser.direct_declarator_identifier_return retval = new nesCParser.direct_declarator_identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal220=null;
        Token char_literal222=null;
        Token char_literal224=null;
        nesCParser.identifier_return myIdName =null;

        nesCParser.identifier_return identifier221 =null;

        nesCParser.declarator_return declarator223 =null;


        Object char_literal220_tree=null;
        Object char_literal222_tree=null;
        Object char_literal224_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:624:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RAW_IDENTIFIER) ) {
                alt56=1;
            }
            else if ( (LA56_0==LPARENS) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // nesC.g:624:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5456);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // nesC.g:624:29: ( '.' identifier )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==DOT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // nesC.g:624:30: '.' identifier
                            {
                            char_literal220=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier5459); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal220);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5461);
                            identifier221=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier221.getTree());

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { if (!((declaration_scope)declaration_stack.peek()).inStructDeclaration) {
                                      ((declaration_scope)declaration_stack.peek()).declaredNames.add((myIdName!=null?input.toString(myIdName.start,myIdName.stop):null));
                                  }
                                }

                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 628:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:628:18: ^( IDENTIFIER_PATH ( identifier )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IDENTIFIER_PATH, "IDENTIFIER_PATH")
                        , root_1);

                        if ( !(stream_identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:629:9: '(' declarator ')'
                    {
                    char_literal222=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier5496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal222);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier5498);
                    declarator223=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator223.getTree());

                    char_literal224=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier5500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal224);


                    // AST REWRITE
                    // elements: declarator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 629:28: -> declarator
                    {
                        adaptor.addChild(root_0, stream_declarator.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "direct_declarator_identifier"


    public static class direct_declarator_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_declarator_modifier"
    // nesC.g:635:1: direct_declarator_modifier : ( ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
    public final nesCParser.direct_declarator_modifier_return direct_declarator_modifier() throws RecognitionException {
        nesCParser.direct_declarator_modifier_return retval = new nesCParser.direct_declarator_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal225=null;
        Token char_literal227=null;
        Token char_literal228=null;
        Token char_literal229=null;
        Token char_literal230=null;
        Token char_literal231=null;
        nesCParser.parameter_list_return generic =null;

        nesCParser.parameter_list_return normal =null;

        nesCParser.constant_expression_return constant_expression226 =null;


        Object char_literal225_tree=null;
        Object char_literal227_tree=null;
        Object char_literal228_tree=null;
        Object char_literal229_tree=null;
        Object char_literal230_tree=null;
        Object char_literal231_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // nesC.g:636:5: ( ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LBRACKET) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt59=1;
                }
                else if ( (true) ) {
                    alt59=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA59_0==LPARENS) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // nesC.g:636:9: ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']'
                    {
                    char_literal225=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal225);


                    // nesC.g:636:47: ( constant_expression )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==AMP||LA57_0==BITCOMPLEMENT||LA57_0==CALL||LA57_0==CHARACTER_LITERAL||LA57_0==CONSTANT||LA57_0==LPARENS||LA57_0==MINUS||LA57_0==MINUSMINUS||LA57_0==NOT||LA57_0==PLUS||LA57_0==PLUSPLUS||LA57_0==POST||LA57_0==RAW_IDENTIFIER||LA57_0==SIGNAL||LA57_0==SIZEOF||LA57_0==STAR||LA57_0==STRING_LITERAL) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // nesC.g:636:47: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier5535);
                            constant_expression226=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression226.getTree());

                            }
                            break;

                    }


                    char_literal227=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5538); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal227);


                    // AST REWRITE
                    // elements: constant_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 637:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // nesC.g:637:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // nesC.g:637:44: ( constant_expression )?
                        if ( stream_constant_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_constant_expression.nextTree());

                        }
                        stream_constant_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:638:9: ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')'
                    {
                    // nesC.g:638:9: ( '[' generic= parameter_list ']' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==LBRACKET) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // nesC.g:638:10: '[' generic= parameter_list ']'
                            {
                            char_literal228=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5570); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal228);


                            pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier5574);
                            generic=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_list.add(generic.getTree());

                            char_literal229=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5576); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal229);


                            }
                            break;

                    }


                    char_literal230=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier5580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal230);


                    pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier5584);
                    normal=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(normal.getTree());

                    char_literal231=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier5586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal231);


                    // AST REWRITE
                    // elements: normal
                    // token labels: 
                    // rule labels: retval, normal
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_normal=new RewriteRuleSubtreeStream(adaptor,"rule normal",normal!=null?normal.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 639:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // nesC.g:639:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_PARAMETER_LIST_MODIFIER, "DECLARATOR_PARAMETER_LIST_MODIFIER")
                        , root_1);

                        adaptor.addChild(root_1, stream_normal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "direct_declarator_modifier"


    public static class pointer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointer"
    // nesC.g:645:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
    public final nesCParser.pointer_return pointer() throws RecognitionException {
        nesCParser.pointer_return retval = new nesCParser.pointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal232=null;
        Token char_literal235=null;
        nesCParser.type_qualifier_list_return type_qualifier_list233 =null;

        nesCParser.pointer_return pointer234 =null;

        nesCParser.type_qualifier_list_return type_qualifier_list236 =null;


        Object char_literal232_tree=null;
        Object char_literal235_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_type_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule type_qualifier_list");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            // nesC.g:646:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // nesC.g:646:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal232=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal232);


                    // nesC.g:646:14: ( type_qualifier_list )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==CONST||LA60_0==RESTRICT||LA60_0==VOLATILE) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // nesC.g:646:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5628);
                            type_qualifier_list233=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list233.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer5631);
                    pointer234=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer234.getTree());

                    // AST REWRITE
                    // elements: type_qualifier_list, pointer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 646:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // nesC.g:646:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:646:66: ( type_qualifier_list )?
                        if ( stream_type_qualifier_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_type_qualifier_list.nextTree());

                        }
                        stream_type_qualifier_list.reset();

                        adaptor.addChild(root_1, stream_pointer.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:647:10: '*' ( type_qualifier_list )?
                    {
                    char_literal235=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal235);


                    // nesC.g:647:14: ( type_qualifier_list )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==CONST||LA61_0==RESTRICT||LA61_0==VOLATILE) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // nesC.g:647:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5655);
                            type_qualifier_list236=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list236.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: type_qualifier_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 647:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // nesC.g:647:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:647:58: ( type_qualifier_list )?
                        if ( stream_type_qualifier_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_type_qualifier_list.nextTree());

                        }
                        stream_type_qualifier_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pointer"


    public static class type_qualifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_qualifier_list"
    // nesC.g:649:1: type_qualifier_list : ( type_qualifier )+ ;
    public final nesCParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        nesCParser.type_qualifier_list_return retval = new nesCParser.type_qualifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.type_qualifier_return type_qualifier237 =null;



        try {
            // nesC.g:650:5: ( ( type_qualifier )+ )
            // nesC.g:650:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:650:10: ( type_qualifier )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==CONST||LA63_0==RESTRICT||LA63_0==VOLATILE) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // nesC.g:650:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list5684);
            	    type_qualifier237=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier237.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_qualifier_list"


    public static class parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_list"
    // nesC.g:657:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) );
    public final nesCParser.parameter_list_return parameter_list() throws RecognitionException {
        nesCParser.parameter_list_return retval = new nesCParser.parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal239=null;
        Token char_literal241=null;
        Token ELLIPSIS242=null;
        nesCParser.parameter_declaration_return parameter_declaration238 =null;

        nesCParser.parameter_declaration_return parameter_declaration240 =null;


        Object char_literal239_tree=null;
        Object char_literal241_tree=null;
        Object ELLIPSIS242_tree=null;
        RewriteRuleTokenStream stream_ELLIPSIS=new RewriteRuleTokenStream(adaptor,"token ELLIPSIS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            // nesC.g:658:5: ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ASYNC||LA66_0==AUTO||LA66_0==CHAR||LA66_0==COMMAND||LA66_0==CONST||(LA66_0 >= DOUBLE && LA66_0 <= DUTY)||LA66_0==ENUM||(LA66_0 >= EVENT && LA66_0 <= EXTERN)||LA66_0==FLOAT||(LA66_0 >= INLINE && LA66_0 <= INT8_T)||LA66_0==LONG||LA66_0==NORACE||(LA66_0 >= NXLE_UINT16_T && LA66_0 <= NX_UNION)||LA66_0==RAW_IDENTIFIER||LA66_0==REGISTER||LA66_0==RESTRICT||LA66_0==SHORT||LA66_0==SIGNED||LA66_0==STATIC||LA66_0==STRUCT||LA66_0==TASK||(LA66_0 >= UINT16_T && LA66_0 <= UINT8_T)||(LA66_0 >= UNION && LA66_0 <= UNSIGNED)||(LA66_0 >= VOID && LA66_0 <= VOLATILE)) ) {
                alt66=1;
            }
            else if ( (LA66_0==RBRACKET||LA66_0==RPARENS) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // nesC.g:658:10: parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )?
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list5709);
                    parameter_declaration238=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration238.getTree());

                    // nesC.g:658:32: ( ',' parameter_declaration )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==COMMA) ) {
                            int LA64_1 = input.LA(2);

                            if ( (LA64_1==ASYNC||LA64_1==AUTO||LA64_1==CHAR||LA64_1==COMMAND||LA64_1==CONST||(LA64_1 >= DOUBLE && LA64_1 <= DUTY)||LA64_1==ENUM||(LA64_1 >= EVENT && LA64_1 <= EXTERN)||LA64_1==FLOAT||(LA64_1 >= INLINE && LA64_1 <= INT8_T)||LA64_1==LONG||LA64_1==NORACE||(LA64_1 >= NXLE_UINT16_T && LA64_1 <= NX_UNION)||LA64_1==RAW_IDENTIFIER||LA64_1==REGISTER||LA64_1==RESTRICT||LA64_1==SHORT||LA64_1==SIGNED||LA64_1==STATIC||LA64_1==STRUCT||LA64_1==TASK||(LA64_1 >= UINT16_T && LA64_1 <= UINT8_T)||(LA64_1 >= UNION && LA64_1 <= UNSIGNED)||(LA64_1 >= VOID && LA64_1 <= VOLATILE)) ) {
                                alt64=1;
                            }


                        }


                        switch (alt64) {
                    	case 1 :
                    	    // nesC.g:658:33: ',' parameter_declaration
                    	    {
                    	    char_literal239=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list5712); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal239);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list5714);
                    	    parameter_declaration240=parameter_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration240.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    // nesC.g:658:61: ( ',' ELLIPSIS )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==COMMA) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // nesC.g:658:62: ',' ELLIPSIS
                            {
                            char_literal241=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list5719); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal241);


                            ELLIPSIS242=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_parameter_list5721); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELLIPSIS.add(ELLIPSIS242);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ELLIPSIS, parameter_declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 659:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
                    {
                        // nesC.g:659:16: ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER_LIST, "PARAMETER_LIST")
                        , root_1);

                        if ( !(stream_parameter_declaration.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_parameter_declaration.hasNext() ) {
                            adaptor.addChild(root_1, stream_parameter_declaration.nextTree());

                        }
                        stream_parameter_declaration.reset();

                        // nesC.g:659:56: ( ELLIPSIS )?
                        if ( stream_ELLIPSIS.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_ELLIPSIS.nextNode()
                            );

                        }
                        stream_ELLIPSIS.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:661:13: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 661:13: -> ^( PARAMETER_LIST )
                    {
                        // nesC.g:661:16: ^( PARAMETER_LIST )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER_LIST, "PARAMETER_LIST")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_list"


    public static class parameter_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_declaration"
    // nesC.g:667:1: parameter_declaration : declaration_specifiers ( parameter_declarator )? -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? ) ;
    public final nesCParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        nesCParser.parameter_declaration_return retval = new nesCParser.parameter_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers243 =null;

        nesCParser.parameter_declarator_return parameter_declarator244 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_parameter_declarator=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarator");
        try {
            // nesC.g:668:5: ( declaration_specifiers ( parameter_declarator )? -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? ) )
            // nesC.g:668:10: declaration_specifiers ( parameter_declarator )?
            {
            pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration5791);
            declaration_specifiers243=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers243.getTree());

            // nesC.g:668:33: ( parameter_declarator )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LBRACKET||LA67_0==LPARENS||LA67_0==RAW_IDENTIFIER||LA67_0==STAR) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // nesC.g:668:33: parameter_declarator
                    {
                    pushFollow(FOLLOW_parameter_declarator_in_parameter_declaration5793);
                    parameter_declarator244=parameter_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declarator.add(parameter_declarator244.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: declaration_specifiers, parameter_declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 669:13: -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? )
            {
                // nesC.g:669:16: ^( PARAMETER declaration_specifiers ( parameter_declarator )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETER, "PARAMETER")
                , root_1);

                adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                // nesC.g:669:51: ( parameter_declarator )?
                if ( stream_parameter_declarator.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_declarator.nextTree());

                }
                stream_parameter_declarator.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_declaration"


    public static class parameter_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_declarator"
    // nesC.g:672:1: parameter_declarator : ( ( declarator ( attributes )? )=> declarator ( attributes )? | abstract_declarator );
    public final nesCParser.parameter_declarator_return parameter_declarator() throws RecognitionException {
        nesCParser.parameter_declarator_return retval = new nesCParser.parameter_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declarator_return declarator245 =null;

        nesCParser.attributes_return attributes246 =null;

        nesCParser.abstract_declarator_return abstract_declarator247 =null;



        try {
            // nesC.g:673:5: ( ( declarator ( attributes )? )=> declarator ( attributes )? | abstract_declarator )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==STAR) ) {
                int LA69_1 = input.LA(2);

                if ( (synpred6_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA69_0==RAW_IDENTIFIER) && (synpred6_nesC())) {
                alt69=1;
            }
            else if ( (LA69_0==LPARENS) ) {
                int LA69_3 = input.LA(2);

                if ( (synpred6_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA69_0==LBRACKET) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // nesC.g:673:10: ( declarator ( attributes )? )=> declarator ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_parameter_declarator5842);
                    declarator245=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator245.getTree());

                    // nesC.g:673:49: ( attributes )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==ATTRIBUTE) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // nesC.g:673:49: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_parameter_declarator5844);
                            attributes246=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes246.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // nesC.g:674:10: abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_abstract_declarator_in_parameter_declarator5856);
                    abstract_declarator247=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator247.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_declarator"


    public static class identifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_list"
    // nesC.g:676:1: identifier_list : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final nesCParser.identifier_list_return identifier_list() throws RecognitionException {
        nesCParser.identifier_list_return retval = new nesCParser.identifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal249=null;
        nesCParser.identifier_return identifier248 =null;

        nesCParser.identifier_return identifier250 =null;


        Object char_literal249_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:677:5: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // nesC.g:677:10: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifier_list5875);
            identifier248=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier248.getTree());

            // nesC.g:677:21: ( ',' identifier )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // nesC.g:677:22: ',' identifier
            	    {
            	    char_literal249=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifier_list5878); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal249);


            	    pushFollow(FOLLOW_identifier_in_identifier_list5880);
            	    identifier250=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier250.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 677:39: -> ( identifier )+
            {
                if ( !(stream_identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_0, stream_identifier.nextTree());

                }
                stream_identifier.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier_list"


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // nesC.g:679:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final nesCParser.type_name_return type_name() throws RecognitionException {
        nesCParser.type_name_return retval = new nesCParser.type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.specifier_qualifier_list_return specifier_qualifier_list251 =null;

        nesCParser.abstract_declarator_return abstract_declarator252 =null;



        try {
            // nesC.g:680:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // nesC.g:680:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name5906);
            specifier_qualifier_list251=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list251.getTree());

            // nesC.g:680:35: ( abstract_declarator )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==LBRACKET||LA71_0==LPARENS||LA71_0==STAR) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // nesC.g:680:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name5908);
                    abstract_declarator252=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator252.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_name"


    public static class abstract_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "abstract_declarator"
    // nesC.g:682:1: abstract_declarator : ( ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator | pointer );
    public final nesCParser.abstract_declarator_return abstract_declarator() throws RecognitionException {
        nesCParser.abstract_declarator_return retval = new nesCParser.abstract_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.pointer_return pointer253 =null;

        nesCParser.direct_abstract_declarator_return direct_abstract_declarator254 =null;

        nesCParser.pointer_return pointer255 =null;



        try {
            // nesC.g:683:5: ( ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator | pointer )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==STAR) ) {
                int LA73_1 = input.LA(2);

                if ( (synpred7_nesC()) ) {
                    alt73=1;
                }
                else if ( (true) ) {
                    alt73=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA73_0==LPARENS) && (synpred7_nesC())) {
                alt73=1;
            }
            else if ( (LA73_0==LBRACKET) && (synpred7_nesC())) {
                alt73=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // nesC.g:683:10: ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:683:51: ( pointer )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==STAR) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // nesC.g:683:51: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator5937);
                            pointer253=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer253.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator5940);
                    direct_abstract_declarator254=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator254.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:684:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator5951);
                    pointer255=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer255.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "abstract_declarator"


    public static class direct_abstract_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_abstract_declarator"
    // nesC.g:686:1: direct_abstract_declarator : ( ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )* | ( direct_abstract_declarator_modifier )+ );
    public final nesCParser.direct_abstract_declarator_return direct_abstract_declarator() throws RecognitionException {
        nesCParser.direct_abstract_declarator_return retval = new nesCParser.direct_abstract_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal256=null;
        Token char_literal258=null;
        nesCParser.abstract_declarator_return abstract_declarator257 =null;

        nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier259 =null;

        nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier260 =null;


        Object char_literal256_tree=null;
        Object char_literal258_tree=null;

        try {
            // nesC.g:687:5: ( ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )* | ( direct_abstract_declarator_modifier )+ )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==LPARENS) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==STAR) && (synpred8_nesC())) {
                    alt76=1;
                }
                else if ( (LA76_1==LPARENS) && (synpred8_nesC())) {
                    alt76=1;
                }
                else if ( (LA76_1==LBRACKET) && (synpred8_nesC())) {
                    alt76=1;
                }
                else if ( (LA76_1==ASYNC||LA76_1==AUTO||LA76_1==CHAR||LA76_1==COMMAND||LA76_1==CONST||(LA76_1 >= DOUBLE && LA76_1 <= DUTY)||LA76_1==ENUM||(LA76_1 >= EVENT && LA76_1 <= EXTERN)||LA76_1==FLOAT||(LA76_1 >= INLINE && LA76_1 <= INT8_T)||LA76_1==LONG||LA76_1==NORACE||(LA76_1 >= NXLE_UINT16_T && LA76_1 <= NX_UNION)||LA76_1==RAW_IDENTIFIER||LA76_1==REGISTER||LA76_1==RESTRICT||LA76_1==RPARENS||LA76_1==SHORT||LA76_1==SIGNED||LA76_1==STATIC||LA76_1==STRUCT||LA76_1==TASK||(LA76_1 >= UINT16_T && LA76_1 <= UINT8_T)||(LA76_1 >= UNION && LA76_1 <= UNSIGNED)||(LA76_1 >= VOID && LA76_1 <= VOLATILE)) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA76_0==LBRACKET) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // nesC.g:687:10: ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )*
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal256=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator5991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal256_tree = 
                    (Object)adaptor.create(char_literal256)
                    ;
                    adaptor.addChild(root_0, char_literal256_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator5993);
                    abstract_declarator257=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator257.getTree());

                    char_literal258=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator5995); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal258_tree = 
                    (Object)adaptor.create(char_literal258)
                    ;
                    adaptor.addChild(root_0, char_literal258_tree);
                    }

                    // nesC.g:688:39: ( direct_abstract_declarator_modifier )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==LBRACKET||LA74_0==LPARENS) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // nesC.g:688:39: direct_abstract_declarator_modifier
                    	    {
                    	    pushFollow(FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator5997);
                    	    direct_abstract_declarator_modifier259=direct_abstract_declarator_modifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator_modifier259.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // nesC.g:689:10: ( direct_abstract_declarator_modifier )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:689:10: ( direct_abstract_declarator_modifier )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==LBRACKET||LA75_0==LPARENS) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // nesC.g:689:10: direct_abstract_declarator_modifier
                    	    {
                    	    pushFollow(FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6009);
                    	    direct_abstract_declarator_modifier260=direct_abstract_declarator_modifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator_modifier260.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "direct_abstract_declarator"


    public static class direct_abstract_declarator_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_abstract_declarator_modifier"
    // nesC.g:691:1: direct_abstract_declarator_modifier : ( '[' ( assignment_expression )? ']' | '(' parameter_list ')' );
    public final nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier() throws RecognitionException {
        nesCParser.direct_abstract_declarator_modifier_return retval = new nesCParser.direct_abstract_declarator_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal261=null;
        Token char_literal263=null;
        Token char_literal264=null;
        Token char_literal266=null;
        nesCParser.assignment_expression_return assignment_expression262 =null;

        nesCParser.parameter_list_return parameter_list265 =null;


        Object char_literal261_tree=null;
        Object char_literal263_tree=null;
        Object char_literal264_tree=null;
        Object char_literal266_tree=null;

        try {
            // nesC.g:692:5: ( '[' ( assignment_expression )? ']' | '(' parameter_list ')' )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==LBRACKET) ) {
                alt78=1;
            }
            else if ( (LA78_0==LPARENS) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // nesC.g:692:10: '[' ( assignment_expression )? ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal261=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator_modifier6025); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal261_tree = 
                    (Object)adaptor.create(char_literal261)
                    ;
                    adaptor.addChild(root_0, char_literal261_tree);
                    }

                    // nesC.g:692:14: ( assignment_expression )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==AMP||LA77_0==BITCOMPLEMENT||LA77_0==CALL||LA77_0==CHARACTER_LITERAL||LA77_0==CONSTANT||LA77_0==LPARENS||LA77_0==MINUS||LA77_0==MINUSMINUS||LA77_0==NOT||LA77_0==PLUS||LA77_0==PLUSPLUS||LA77_0==POST||LA77_0==RAW_IDENTIFIER||LA77_0==SIGNAL||LA77_0==SIZEOF||LA77_0==STAR||LA77_0==STRING_LITERAL) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // nesC.g:692:14: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator_modifier6027);
                            assignment_expression262=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression262.getTree());

                            }
                            break;

                    }


                    char_literal263=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator_modifier6030); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal263_tree = 
                    (Object)adaptor.create(char_literal263)
                    ;
                    adaptor.addChild(root_0, char_literal263_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:693:10: '(' parameter_list ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal264=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator_modifier6041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal264_tree = 
                    (Object)adaptor.create(char_literal264)
                    ;
                    adaptor.addChild(root_0, char_literal264_tree);
                    }

                    pushFollow(FOLLOW_parameter_list_in_direct_abstract_declarator_modifier6043);
                    parameter_list265=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list265.getTree());

                    char_literal266=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator_modifier6045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal266_tree = 
                    (Object)adaptor.create(char_literal266)
                    ;
                    adaptor.addChild(root_0, char_literal266_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "direct_abstract_declarator_modifier"


    public static class typedef_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_name"
    // nesC.g:696:1: typedef_name :{...}? RAW_IDENTIFIER ;
    public final nesCParser.typedef_name_return typedef_name() throws RecognitionException {
        nesCParser.typedef_name_return retval = new nesCParser.typedef_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER267=null;

        Object RAW_IDENTIFIER267_tree=null;

        try {
            // nesC.g:697:5: ({...}? RAW_IDENTIFIER )
            // nesC.g:697:10: {...}? RAW_IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            if ( !(( symbols.isType(input.LT(1).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typedef_name", " symbols.isType(input.LT(1).getText()) ");
            }

            RAW_IDENTIFIER267=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name6071); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAW_IDENTIFIER267_tree = 
            (Object)adaptor.create(RAW_IDENTIFIER267)
            ;
            adaptor.addChild(root_0, RAW_IDENTIFIER267_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_name"


    public static class initializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer"
    // nesC.g:705:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
    public final nesCParser.initializer_return initializer() throws RecognitionException {
        nesCParser.initializer_return retval = new nesCParser.initializer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal269=null;
        Token char_literal271=null;
        Token char_literal272=null;
        nesCParser.assignment_expression_return assignment_expression268 =null;

        nesCParser.initializer_list_return initializer_list270 =null;


        Object char_literal269_tree=null;
        Object char_literal271_tree=null;
        Object char_literal272_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            // nesC.g:706:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==AMP||LA80_0==BITCOMPLEMENT||LA80_0==CALL||LA80_0==CHARACTER_LITERAL||LA80_0==CONSTANT||LA80_0==LPARENS||LA80_0==MINUS||LA80_0==MINUSMINUS||LA80_0==NOT||LA80_0==PLUS||LA80_0==PLUSPLUS||LA80_0==POST||LA80_0==RAW_IDENTIFIER||LA80_0==SIGNAL||LA80_0==SIZEOF||LA80_0==STAR||LA80_0==STRING_LITERAL) ) {
                alt80=1;
            }
            else if ( (LA80_0==LBRACE) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // nesC.g:706:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer6096);
                    assignment_expression268=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression268.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:707:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal269=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer6107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal269);


                    pushFollow(FOLLOW_initializer_list_in_initializer6109);
                    initializer_list270=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list270.getTree());

                    // nesC.g:707:31: ( ',' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==COMMA) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // nesC.g:707:31: ','
                            {
                            char_literal271=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer6111); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal271);


                            }
                            break;

                    }


                    char_literal272=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer6114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal272);


                    // AST REWRITE
                    // elements: initializer_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 707:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // nesC.g:707:43: ^( INITIALIZER_LIST initializer_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INITIALIZER_LIST, "INITIALIZER_LIST")
                        , root_1);

                        adaptor.addChild(root_1, stream_initializer_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initializer"


    public static class initializer_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer_list"
    // nesC.g:711:1: initializer_list : ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ ;
    public final nesCParser.initializer_list_return initializer_list() throws RecognitionException {
        nesCParser.initializer_list_return retval = new nesCParser.initializer_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER273=null;
        Token char_literal274=null;
        Token char_literal276=null;
        Token RAW_IDENTIFIER277=null;
        Token char_literal278=null;
        nesCParser.initializer_return initializer275 =null;

        nesCParser.initializer_return initializer279 =null;


        Object RAW_IDENTIFIER273_tree=null;
        Object char_literal274_tree=null;
        Object char_literal276_tree=null;
        Object RAW_IDENTIFIER277_tree=null;
        Object char_literal278_tree=null;
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // nesC.g:712:5: ( ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ )
            // nesC.g:712:10: ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            {
            // nesC.g:712:10: ( RAW_IDENTIFIER ':' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RAW_IDENTIFIER) ) {
                int LA81_1 = input.LA(2);

                if ( (LA81_1==189) ) {
                    alt81=1;
                }
            }
            switch (alt81) {
                case 1 :
                    // nesC.g:712:11: RAW_IDENTIFIER ':'
                    {
                    RAW_IDENTIFIER273=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6144); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER273);


                    char_literal274=(Token)match(input,189,FOLLOW_189_in_initializer_list6146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal274);


                    }
                    break;

            }


            pushFollow(FOLLOW_initializer_in_initializer_list6150);
            initializer275=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer275.getTree());

            // nesC.g:712:44: ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==COMMA) ) {
                    int LA83_1 = input.LA(2);

                    if ( (LA83_1==AMP||LA83_1==BITCOMPLEMENT||LA83_1==CALL||LA83_1==CHARACTER_LITERAL||LA83_1==CONSTANT||LA83_1==LBRACE||LA83_1==LPARENS||LA83_1==MINUS||LA83_1==MINUSMINUS||LA83_1==NOT||LA83_1==PLUS||LA83_1==PLUSPLUS||LA83_1==POST||LA83_1==RAW_IDENTIFIER||LA83_1==SIGNAL||LA83_1==SIZEOF||LA83_1==STAR||LA83_1==STRING_LITERAL) ) {
                        alt83=1;
                    }


                }


                switch (alt83) {
            	case 1 :
            	    // nesC.g:712:45: ',' ( RAW_IDENTIFIER ':' )? initializer
            	    {
            	    char_literal276=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list6153); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal276);


            	    // nesC.g:712:49: ( RAW_IDENTIFIER ':' )?
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==RAW_IDENTIFIER) ) {
            	        int LA82_1 = input.LA(2);

            	        if ( (LA82_1==189) ) {
            	            alt82=1;
            	        }
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // nesC.g:712:50: RAW_IDENTIFIER ':'
            	            {
            	            RAW_IDENTIFIER277=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6156); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER277);


            	            char_literal278=(Token)match(input,189,FOLLOW_189_in_initializer_list6158); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_189.add(char_literal278);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_initializer_in_initializer_list6162);
            	    initializer279=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer279.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            // AST REWRITE
            // elements: initializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 713:13: -> ( initializer )+
            {
                if ( !(stream_initializer.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_initializer.hasNext() ) {
                    adaptor.addChild(root_0, stream_initializer.nextTree());

                }
                stream_initializer.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initializer_list"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // nesC.g:723:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement );
    public final nesCParser.statement_return statement() throws RecognitionException {
        nesCParser.statement_return retval = new nesCParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.labeled_statement_return labeled_statement280 =null;

        nesCParser.compound_statement_return compound_statement281 =null;

        nesCParser.expression_statement_return expression_statement282 =null;

        nesCParser.selection_statement_return selection_statement283 =null;

        nesCParser.iteration_statement_return iteration_statement284 =null;

        nesCParser.jump_statement_return jump_statement285 =null;

        nesCParser.atomic_statement_return atomic_statement286 =null;



        try {
            // nesC.g:724:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement )
            int alt84=7;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==189) ) {
                    alt84=1;
                }
                else if ( ((LA84_1 >= AMP && LA84_1 <= AND)||LA84_1==ARROW||LA84_1==ASSIGN||LA84_1==BITANDASSIGN||(LA84_1 >= BITOR && LA84_1 <= BITXORASSIGN)||LA84_1==COMMA||(LA84_1 >= DIVASSIGN && LA84_1 <= DIVIDE)||LA84_1==DOT||LA84_1==EQUAL||(LA84_1 >= GREATER && LA84_1 <= GREATEREQUAL)||(LA84_1 >= LBRACKET && LA84_1 <= LESSEQUAL)||(LA84_1 >= LPARENS && LA84_1 <= MODASSIGN)||(LA84_1 >= MODULUS && LA84_1 <= MULASSIGN)||LA84_1==NOTEQUAL||LA84_1==OR||(LA84_1 >= PLUS && LA84_1 <= PLUSPLUS)||(LA84_1 >= RSHIFT && LA84_1 <= RSHIFTASSIGN)||LA84_1==STAR||LA84_1==190||LA84_1==192) ) {
                    alt84=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;

                }
                }
                break;
            case CASE:
            case DEFAULT:
                {
                alt84=1;
                }
                break;
            case LBRACE:
                {
                alt84=2;
                }
                break;
            case AMP:
            case BITCOMPLEMENT:
            case CALL:
            case CHARACTER_LITERAL:
            case CONSTANT:
            case LPARENS:
            case MINUS:
            case MINUSMINUS:
            case NOT:
            case PLUS:
            case PLUSPLUS:
            case POST:
            case SIGNAL:
            case SIZEOF:
            case STAR:
            case STRING_LITERAL:
            case 190:
                {
                alt84=3;
                }
                break;
            case IF:
            case SWITCH:
                {
                alt84=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt84=5;
                }
                break;
            case BREAK:
            case CONTINUE:
            case GOTO:
            case RETURN:
                {
                alt84=6;
                }
                break;
            case ATOMIC:
                {
                alt84=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }

            switch (alt84) {
                case 1 :
                    // nesC.g:724:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement6211);
                    labeled_statement280=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement280.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:725:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement6222);
                    compound_statement281=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement281.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:726:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement6233);
                    expression_statement282=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement282.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:727:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement6244);
                    selection_statement283=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement283.getTree());

                    }
                    break;
                case 5 :
                    // nesC.g:728:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement6255);
                    iteration_statement284=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement284.getTree());

                    }
                    break;
                case 6 :
                    // nesC.g:729:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement6266);
                    jump_statement285=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement285.getTree());

                    }
                    break;
                case 7 :
                    // nesC.g:730:10: atomic_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atomic_statement_in_statement6277);
                    atomic_statement286=atomic_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomic_statement286.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class atomic_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomic_statement"
    // nesC.g:734:1: atomic_statement : ATOMIC statement -> ^( ATOMIC statement ) ;
    public final nesCParser.atomic_statement_return atomic_statement() throws RecognitionException {
        nesCParser.atomic_statement_return retval = new nesCParser.atomic_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATOMIC287=null;
        nesCParser.statement_return statement288 =null;


        Object ATOMIC287_tree=null;
        RewriteRuleTokenStream stream_ATOMIC=new RewriteRuleTokenStream(adaptor,"token ATOMIC");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:735:5: ( ATOMIC statement -> ^( ATOMIC statement ) )
            // nesC.g:735:10: ATOMIC statement
            {
            ATOMIC287=(Token)match(input,ATOMIC,FOLLOW_ATOMIC_in_atomic_statement6298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATOMIC.add(ATOMIC287);


            pushFollow(FOLLOW_statement_in_atomic_statement6300);
            statement288=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement288.getTree());

            // AST REWRITE
            // elements: statement, ATOMIC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 735:27: -> ^( ATOMIC statement )
            {
                // nesC.g:735:30: ^( ATOMIC statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ATOMIC.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atomic_statement"


    public static class labeled_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "labeled_statement"
    // nesC.g:737:1: labeled_statement : ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final nesCParser.labeled_statement_return labeled_statement() throws RecognitionException {
        nesCParser.labeled_statement_return retval = new nesCParser.labeled_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal290=null;
        Token CASE292=null;
        Token char_literal294=null;
        Token DEFAULT296=null;
        Token char_literal297=null;
        nesCParser.identifier_return identifier289 =null;

        nesCParser.statement_return statement291 =null;

        nesCParser.constant_expression_return constant_expression293 =null;

        nesCParser.statement_return statement295 =null;

        nesCParser.statement_return statement298 =null;


        Object char_literal290_tree=null;
        Object CASE292_tree=null;
        Object char_literal294_tree=null;
        Object DEFAULT296_tree=null;
        Object char_literal297_tree=null;
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:738:5: ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
            int alt85=3;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                alt85=1;
                }
                break;
            case CASE:
                {
                alt85=2;
                }
                break;
            case DEFAULT:
                {
                alt85=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }

            switch (alt85) {
                case 1 :
                    // nesC.g:738:10: identifier ':' statement
                    {
                    pushFollow(FOLLOW_identifier_in_labeled_statement6327);
                    identifier289=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier289.getTree());

                    char_literal290=(Token)match(input,189,FOLLOW_189_in_labeled_statement6329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal290);


                    pushFollow(FOLLOW_statement_in_labeled_statement6331);
                    statement291=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement291.getTree());

                    // AST REWRITE
                    // elements: statement, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 738:35: -> ^( LABELED_STATEMENT identifier statement )
                    {
                        // nesC.g:738:38: ^( LABELED_STATEMENT identifier statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LABELED_STATEMENT, "LABELED_STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:739:10: CASE constant_expression ':' statement
                    {
                    CASE292=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement6352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE292);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement6354);
                    constant_expression293=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression293.getTree());

                    char_literal294=(Token)match(input,189,FOLLOW_189_in_labeled_statement6356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal294);


                    pushFollow(FOLLOW_statement_in_labeled_statement6358);
                    statement295=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement295.getTree());

                    // AST REWRITE
                    // elements: statement, constant_expression, CASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 739:49: -> ^( CASE constant_expression statement )
                    {
                        // nesC.g:739:52: ^( CASE constant_expression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CASE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_constant_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:740:10: DEFAULT ':' statement
                    {
                    DEFAULT296=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement6379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT296);


                    char_literal297=(Token)match(input,189,FOLLOW_189_in_labeled_statement6381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal297);


                    pushFollow(FOLLOW_statement_in_labeled_statement6383);
                    statement298=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement298.getTree());

                    // AST REWRITE
                    // elements: DEFAULT, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 740:32: -> ^( DEFAULT statement )
                    {
                        // nesC.g:740:35: ^( DEFAULT statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_DEFAULT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "labeled_statement"


    public static class compound_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compound_statement"
    // nesC.g:745:1: compound_statement : '{' ( declaration )* ( statement )* '}' -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* ) ;
    public final nesCParser.compound_statement_return compound_statement() throws RecognitionException {
        nesCParser.compound_statement_return retval = new nesCParser.compound_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal299=null;
        Token char_literal302=null;
        nesCParser.declaration_return declaration300 =null;

        nesCParser.statement_return statement301 =null;


        Object char_literal299_tree=null;
        Object char_literal302_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // nesC.g:746:5: ( '{' ( declaration )* ( statement )* '}' -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* ) )
            // nesC.g:746:10: '{' ( declaration )* ( statement )* '}'
            {
            char_literal299=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement6409); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal299);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:747:10: ( declaration )*
            loop86:
            do {
                int alt86=2;
                alt86 = dfa86.predict(input);
                switch (alt86) {
            	case 1 :
            	    // nesC.g:747:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_compound_statement6422);
            	    declaration300=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration300.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            // nesC.g:747:23: ( statement )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==AMP||LA87_0==ATOMIC||LA87_0==BITCOMPLEMENT||(LA87_0 >= BREAK && LA87_0 <= CASE)||LA87_0==CHARACTER_LITERAL||(LA87_0 >= CONSTANT && LA87_0 <= CONTINUE)||LA87_0==DEFAULT||LA87_0==DO||LA87_0==FOR||LA87_0==GOTO||LA87_0==IF||LA87_0==LBRACE||LA87_0==LPARENS||LA87_0==MINUS||LA87_0==MINUSMINUS||LA87_0==NOT||LA87_0==PLUS||LA87_0==PLUSPLUS||LA87_0==POST||LA87_0==RAW_IDENTIFIER||LA87_0==RETURN||LA87_0==SIGNAL||LA87_0==SIZEOF||LA87_0==STAR||LA87_0==STRING_LITERAL||LA87_0==SWITCH||LA87_0==WHILE||LA87_0==190) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // nesC.g:747:23: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compound_statement6425);
            	    statement301=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement301.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal302=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement6443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal302);


            // AST REWRITE
            // elements: declaration, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 748:44: -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* )
            {
                // nesC.g:748:47: ^( COMPOUND_STATEMENT ( declaration )* ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // nesC.g:748:68: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                // nesC.g:748:81: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compound_statement"


    public static class expression_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_statement"
    // nesC.g:754:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final nesCParser.expression_statement_return expression_statement() throws RecognitionException {
        nesCParser.expression_statement_return retval = new nesCParser.expression_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal304=null;
        nesCParser.expression_return expression303 =null;


        Object char_literal304_tree=null;
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // nesC.g:755:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // nesC.g:755:10: ( expression )? ';'
            {
            // nesC.g:755:10: ( expression )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==AMP||LA88_0==BITCOMPLEMENT||LA88_0==CALL||LA88_0==CHARACTER_LITERAL||LA88_0==CONSTANT||LA88_0==LPARENS||LA88_0==MINUS||LA88_0==MINUSMINUS||LA88_0==NOT||LA88_0==PLUS||LA88_0==PLUSPLUS||LA88_0==POST||LA88_0==RAW_IDENTIFIER||LA88_0==SIGNAL||LA88_0==SIZEOF||LA88_0==STAR||LA88_0==STRING_LITERAL) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // nesC.g:755:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement6474);
                    expression303=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression303.getTree());

                    }
                    break;

            }


            char_literal304=(Token)match(input,190,FOLLOW_190_in_expression_statement6477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_190.add(char_literal304);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 755:26: -> ^( STATEMENT ( expression )? )
            {
                // nesC.g:755:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // nesC.g:755:41: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression_statement"


    public static class selection_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_statement"
    // nesC.g:763:1: selection_statement : ( ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' statement ELSE statement -> ^( IF expression statement ) | IF '(' expression ')' statement -> ^( IF expression statement ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final nesCParser.selection_statement_return selection_statement() throws RecognitionException {
        nesCParser.selection_statement_return retval = new nesCParser.selection_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF305=null;
        Token char_literal306=null;
        Token char_literal308=null;
        Token ELSE310=null;
        Token IF312=null;
        Token char_literal313=null;
        Token char_literal315=null;
        Token SWITCH317=null;
        Token char_literal318=null;
        Token char_literal320=null;
        nesCParser.expression_return expression307 =null;

        nesCParser.statement_return statement309 =null;

        nesCParser.statement_return statement311 =null;

        nesCParser.expression_return expression314 =null;

        nesCParser.statement_return statement316 =null;

        nesCParser.expression_return expression319 =null;

        nesCParser.statement_return statement321 =null;


        Object IF305_tree=null;
        Object char_literal306_tree=null;
        Object char_literal308_tree=null;
        Object ELSE310_tree=null;
        Object IF312_tree=null;
        Object char_literal313_tree=null;
        Object char_literal315_tree=null;
        Object SWITCH317_tree=null;
        Object char_literal318_tree=null;
        Object char_literal320_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:764:5: ( ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' statement ELSE statement -> ^( IF expression statement ) | IF '(' expression ')' statement -> ^( IF expression statement ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
            int alt89=3;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==IF) ) {
                int LA89_1 = input.LA(2);

                if ( (synpred9_nesC()) ) {
                    alt89=1;
                }
                else if ( (true) ) {
                    alt89=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA89_0==SWITCH) ) {
                alt89=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }
            switch (alt89) {
                case 1 :
                    // nesC.g:764:10: ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' statement ELSE statement
                    {
                    IF305=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF305);


                    char_literal306=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal306);


                    pushFollow(FOLLOW_expression_in_selection_statement6543);
                    expression307=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression307.getTree());

                    char_literal308=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal308);


                    pushFollow(FOLLOW_statement_in_selection_statement6547);
                    statement309=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement309.getTree());

                    ELSE310=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement6549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE310);


                    pushFollow(FOLLOW_statement_in_selection_statement6551);
                    statement311=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement311.getTree());

                    // AST REWRITE
                    // elements: IF, expression, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 766:14: -> ^( IF expression statement )
                    {
                        // nesC.g:766:17: ^( IF expression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:767:10: IF '(' expression ')' statement
                    {
                    IF312=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF312);


                    char_literal313=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal313);


                    pushFollow(FOLLOW_expression_in_selection_statement6589);
                    expression314=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression314.getTree());

                    char_literal315=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal315);


                    pushFollow(FOLLOW_statement_in_selection_statement6593);
                    statement316=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement316.getTree());

                    // AST REWRITE
                    // elements: expression, statement, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 768:14: -> ^( IF expression statement )
                    {
                        // nesC.g:768:17: ^( IF expression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:769:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH317=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement6627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH317);


                    char_literal318=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal318);


                    pushFollow(FOLLOW_expression_in_selection_statement6631);
                    expression319=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression319.getTree());

                    char_literal320=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal320);


                    pushFollow(FOLLOW_statement_in_selection_statement6635);
                    statement321=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement321.getTree());

                    // AST REWRITE
                    // elements: expression, SWITCH, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 770:14: -> ^( SWITCH expression statement )
                    {
                        // nesC.g:770:17: ^( SWITCH expression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SWITCH.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selection_statement"


    public static class iteration_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_statement"
    // nesC.g:776:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final nesCParser.iteration_statement_return iteration_statement() throws RecognitionException {
        nesCParser.iteration_statement_return retval = new nesCParser.iteration_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE322=null;
        Token char_literal323=null;
        Token char_literal325=null;
        Token DO327=null;
        Token WHILE329=null;
        Token char_literal330=null;
        Token char_literal332=null;
        Token char_literal333=null;
        Token FOR334=null;
        Token char_literal335=null;
        Token char_literal336=null;
        Token char_literal337=null;
        Token char_literal338=null;
        nesCParser.expression_return init =null;

        nesCParser.expression_return cond =null;

        nesCParser.expression_return iter =null;

        nesCParser.expression_return expression324 =null;

        nesCParser.statement_return statement326 =null;

        nesCParser.statement_return statement328 =null;

        nesCParser.expression_return expression331 =null;

        nesCParser.statement_return statement339 =null;


        Object WHILE322_tree=null;
        Object char_literal323_tree=null;
        Object char_literal325_tree=null;
        Object DO327_tree=null;
        Object WHILE329_tree=null;
        Object char_literal330_tree=null;
        Object char_literal332_tree=null;
        Object char_literal333_tree=null;
        Object FOR334_tree=null;
        Object char_literal335_tree=null;
        Object char_literal336_tree=null;
        Object char_literal337_tree=null;
        Object char_literal338_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:777:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt93=1;
                }
                break;
            case DO:
                {
                alt93=2;
                }
                break;
            case FOR:
                {
                alt93=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }

            switch (alt93) {
                case 1 :
                    // nesC.g:777:10: WHILE '(' expression ')' statement
                    {
                    WHILE322=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE322);


                    char_literal323=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal323);


                    pushFollow(FOLLOW_expression_in_iteration_statement6685);
                    expression324=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression324.getTree());

                    char_literal325=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal325);


                    pushFollow(FOLLOW_statement_in_iteration_statement6689);
                    statement326=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement326.getTree());

                    // AST REWRITE
                    // elements: statement, expression, WHILE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 777:45: -> ^( WHILE expression statement )
                    {
                        // nesC.g:777:48: ^( WHILE expression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_WHILE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:778:10: DO statement WHILE '(' expression ')' ';'
                    {
                    DO327=(Token)match(input,DO,FOLLOW_DO_in_iteration_statement6710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO327);


                    pushFollow(FOLLOW_statement_in_iteration_statement6712);
                    statement328=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement328.getTree());

                    WHILE329=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE329);


                    char_literal330=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal330);


                    pushFollow(FOLLOW_expression_in_iteration_statement6718);
                    expression331=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression331.getTree());

                    char_literal332=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal332);


                    char_literal333=(Token)match(input,190,FOLLOW_190_in_iteration_statement6722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal333);


                    // AST REWRITE
                    // elements: statement, expression, DO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 778:52: -> ^( DO statement expression )
                    {
                        // nesC.g:778:55: ^( DO statement expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_DO.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:779:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR334=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement6743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR334);


                    char_literal335=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal335);


                    // nesC.g:779:22: (init= expression )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==AMP||LA90_0==BITCOMPLEMENT||LA90_0==CALL||LA90_0==CHARACTER_LITERAL||LA90_0==CONSTANT||LA90_0==LPARENS||LA90_0==MINUS||LA90_0==MINUSMINUS||LA90_0==NOT||LA90_0==PLUS||LA90_0==PLUSPLUS||LA90_0==POST||LA90_0==RAW_IDENTIFIER||LA90_0==SIGNAL||LA90_0==SIZEOF||LA90_0==STAR||LA90_0==STRING_LITERAL) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // nesC.g:779:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6749);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal336=(Token)match(input,190,FOLLOW_190_in_iteration_statement6752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal336);


                    // nesC.g:779:43: (cond= expression )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==AMP||LA91_0==BITCOMPLEMENT||LA91_0==CALL||LA91_0==CHARACTER_LITERAL||LA91_0==CONSTANT||LA91_0==LPARENS||LA91_0==MINUS||LA91_0==MINUSMINUS||LA91_0==NOT||LA91_0==PLUS||LA91_0==PLUSPLUS||LA91_0==POST||LA91_0==RAW_IDENTIFIER||LA91_0==SIGNAL||LA91_0==SIZEOF||LA91_0==STAR||LA91_0==STRING_LITERAL) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // nesC.g:779:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6756);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal337=(Token)match(input,190,FOLLOW_190_in_iteration_statement6759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal337);


                    // nesC.g:779:64: (iter= expression )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==AMP||LA92_0==BITCOMPLEMENT||LA92_0==CALL||LA92_0==CHARACTER_LITERAL||LA92_0==CONSTANT||LA92_0==LPARENS||LA92_0==MINUS||LA92_0==MINUSMINUS||LA92_0==NOT||LA92_0==PLUS||LA92_0==PLUSPLUS||LA92_0==POST||LA92_0==RAW_IDENTIFIER||LA92_0==SIGNAL||LA92_0==SIZEOF||LA92_0==STAR||LA92_0==STRING_LITERAL) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // nesC.g:779:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6763);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal338=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal338);


                    pushFollow(FOLLOW_statement_in_iteration_statement6768);
                    statement339=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement339.getTree());

                    // AST REWRITE
                    // elements: init, iter, statement, FOR, cond
                    // token labels: 
                    // rule labels: retval, init, iter, cond
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"rule init",init!=null?init.tree:null);
                    RewriteRuleSubtreeStream stream_iter=new RewriteRuleSubtreeStream(adaptor,"rule iter",iter!=null?iter.tree:null);
                    RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 780:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // nesC.g:780:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // nesC.g:780:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // nesC.g:780:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:781:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // nesC.g:781:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:782:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // nesC.g:782:40: ( $iter)?
                        if ( stream_iter.hasNext() ) {
                            adaptor.addChild(root_2, stream_iter.nextTree());

                        }
                        stream_iter.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iteration_statement"


    public static class jump_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_statement"
    // nesC.g:784:1: jump_statement : ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) );
    public final nesCParser.jump_statement_return jump_statement() throws RecognitionException {
        nesCParser.jump_statement_return retval = new nesCParser.jump_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GOTO340=null;
        Token char_literal342=null;
        Token CONTINUE343=null;
        Token char_literal344=null;
        Token BREAK345=null;
        Token char_literal346=null;
        Token RETURN347=null;
        Token char_literal349=null;
        nesCParser.identifier_return identifier341 =null;

        nesCParser.expression_return expression348 =null;


        Object GOTO340_tree=null;
        Object char_literal342_tree=null;
        Object CONTINUE343_tree=null;
        Object char_literal344_tree=null;
        Object BREAK345_tree=null;
        Object char_literal346_tree=null;
        Object RETURN347_tree=null;
        Object char_literal349_tree=null;
        RewriteRuleTokenStream stream_GOTO=new RewriteRuleTokenStream(adaptor,"token GOTO");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:785:5: ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
            int alt95=4;
            switch ( input.LA(1) ) {
            case GOTO:
                {
                alt95=1;
                }
                break;
            case CONTINUE:
                {
                alt95=2;
                }
                break;
            case BREAK:
                {
                alt95=3;
                }
                break;
            case RETURN:
                {
                alt95=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }

            switch (alt95) {
                case 1 :
                    // nesC.g:785:10: GOTO identifier ';'
                    {
                    GOTO340=(Token)match(input,GOTO,FOLLOW_GOTO_in_jump_statement6875); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GOTO.add(GOTO340);


                    pushFollow(FOLLOW_identifier_in_jump_statement6877);
                    identifier341=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier341.getTree());

                    char_literal342=(Token)match(input,190,FOLLOW_190_in_jump_statement6879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal342);


                    // AST REWRITE
                    // elements: identifier, GOTO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 785:30: -> ^( GOTO identifier )
                    {
                        // nesC.g:785:33: ^( GOTO identifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_GOTO.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:786:10: CONTINUE ';'
                    {
                    CONTINUE343=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement6898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE343);


                    char_literal344=(Token)match(input,190,FOLLOW_190_in_jump_statement6900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal344);


                    // AST REWRITE
                    // elements: CONTINUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 786:23: -> CONTINUE
                    {
                        adaptor.addChild(root_0, 
                        stream_CONTINUE.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:787:10: BREAK ';'
                    {
                    BREAK345=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement6915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK345);


                    char_literal346=(Token)match(input,190,FOLLOW_190_in_jump_statement6917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal346);


                    // AST REWRITE
                    // elements: BREAK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 787:20: -> BREAK
                    {
                        adaptor.addChild(root_0, 
                        stream_BREAK.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:788:10: RETURN ( expression )? ';'
                    {
                    RETURN347=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement6932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN347);


                    // nesC.g:788:17: ( expression )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==AMP||LA94_0==BITCOMPLEMENT||LA94_0==CALL||LA94_0==CHARACTER_LITERAL||LA94_0==CONSTANT||LA94_0==LPARENS||LA94_0==MINUS||LA94_0==MINUSMINUS||LA94_0==NOT||LA94_0==PLUS||LA94_0==PLUSPLUS||LA94_0==POST||LA94_0==RAW_IDENTIFIER||LA94_0==SIGNAL||LA94_0==SIZEOF||LA94_0==STAR||LA94_0==STRING_LITERAL) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // nesC.g:788:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_jump_statement6934);
                            expression348=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression348.getTree());

                            }
                            break;

                    }


                    char_literal349=(Token)match(input,190,FOLLOW_190_in_jump_statement6937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal349);


                    // AST REWRITE
                    // elements: RETURN, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 788:33: -> ^( RETURN ( expression )? )
                    {
                        // nesC.g:788:36: ^( RETURN ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_RETURN.nextNode()
                        , root_1);

                        // nesC.g:788:45: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "jump_statement"


    public static class translation_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "translation_unit"
    // nesC.g:794:1: translation_unit : ( line_directive | external_declaration )+ ;
    public final nesCParser.translation_unit_return translation_unit() throws RecognitionException {
        nesCParser.translation_unit_return retval = new nesCParser.translation_unit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive350 =null;

        nesCParser.external_declaration_return external_declaration351 =null;



        try {
            // nesC.g:795:5: ( ( line_directive | external_declaration )+ )
            // nesC.g:795:10: ( line_directive | external_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:795:10: ( line_directive | external_declaration )+
            int cnt96=0;
            loop96:
            do {
                int alt96=3;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==HASH) ) {
                    alt96=1;
                }
                else if ( (LA96_0==ASYNC||LA96_0==AUTO||LA96_0==CHAR||LA96_0==COMMAND||LA96_0==CONST||(LA96_0 >= DOUBLE && LA96_0 <= DUTY)||LA96_0==ENUM||(LA96_0 >= EVENT && LA96_0 <= EXTERN)||LA96_0==FLOAT||(LA96_0 >= INLINE && LA96_0 <= INT8_T)||LA96_0==LONG||LA96_0==NORACE||(LA96_0 >= NXLE_UINT16_T && LA96_0 <= NX_UNION)||LA96_0==RAW_IDENTIFIER||LA96_0==REGISTER||LA96_0==RESTRICT||LA96_0==SHORT||LA96_0==SIGNED||LA96_0==STATIC||LA96_0==STRUCT||(LA96_0 >= TASK && LA96_0 <= UINT8_T)||(LA96_0 >= UNION && LA96_0 <= UNSIGNED)||(LA96_0 >= VOID && LA96_0 <= VOLATILE)) ) {
                    alt96=2;
                }


                switch (alt96) {
            	case 1 :
            	    // nesC.g:795:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit6973);
            	    line_directive350=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive350.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:795:28: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit6977);
            	    external_declaration351=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration351.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "translation_unit"


    public static class external_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "external_declaration"
    // nesC.g:798:1: external_declaration : declaration ;
    public final nesCParser.external_declaration_return external_declaration() throws RecognitionException {
        nesCParser.external_declaration_return retval = new nesCParser.external_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_return declaration352 =null;



        try {
            // nesC.g:799:5: ( declaration )
            // nesC.g:799:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration6995);
            declaration352=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration352.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "external_declaration"


    public static class line_directive_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line_directive"
    // nesC.g:813:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final nesCParser.line_directive_return line_directive() throws RecognitionException {
        nesCParser.line_directive_return retval = new nesCParser.line_directive_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal353=null;
        Token CONSTANT354=null;
        Token STRING_LITERAL355=null;
        Token CONSTANT356=null;

        Object char_literal353_tree=null;
        Object CONSTANT354_tree=null;
        Object STRING_LITERAL355_tree=null;
        Object CONSTANT356_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            // nesC.g:814:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // nesC.g:814:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )*
            {
            char_literal353=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive7022); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal353);


            CONSTANT354=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7024); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT354);


            STRING_LITERAL355=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive7026); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL355);


            // nesC.g:814:38: ( CONSTANT )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==CONSTANT) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // nesC.g:814:38: CONSTANT
            	    {
            	    CONSTANT356=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7028); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT356);


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            // AST REWRITE
            // elements: STRING_LITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 814:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // nesC.g:814:51: ^( LINE_DIRECTIVE STRING_LITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LINE_DIRECTIVE, "LINE_DIRECTIVE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_STRING_LITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "line_directive"


    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_definition"
    // nesC.g:819:1: function_definition : declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement ;
    public final nesCParser.function_definition_return function_definition() throws RecognitionException {
        nesCParser.function_definition_return retval = new nesCParser.function_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers357 =null;

        nesCParser.declarator_return declarator358 =null;

        nesCParser.attributes_return attributes359 =null;

        nesCParser.compound_statement_return compound_statement360 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        try {
            // nesC.g:820:5: ( declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement )
            // nesC.g:820:10: declaration_specifiers declarator ( attributes )? compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition7059);
            declaration_specifiers357=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers357.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition7061);
            declarator358=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator358.getTree());

            // nesC.g:820:44: ( attributes )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==ATTRIBUTE) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // nesC.g:820:44: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_function_definition7063);
                    attributes359=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes359.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compound_statement_in_function_definition7066);
            compound_statement360=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement360.getTree());

            // AST REWRITE
            // elements: declaration_specifiers, compound_statement, attributes, declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 821:13: -> declaration_specifiers declarator ( attributes )? compound_statement
            {
                adaptor.addChild(root_0, stream_declaration_specifiers.nextTree());

                adaptor.addChild(root_0, stream_declarator.nextTree());

                // nesC.g:821:50: ( attributes )?
                if ( stream_attributes.hasNext() ) {
                    adaptor.addChild(root_0, stream_attributes.nextTree());

                }
                stream_attributes.reset();

                adaptor.addChild(root_0, stream_compound_statement.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_definition"


    public static class nesC_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nesC_file"
    // nesC.g:831:1: nesC_file : ( translation_unit )? large_scale_construct -> ^( FILE ( translation_unit )? large_scale_construct ) ;
    public final nesCParser.nesC_file_return nesC_file() throws RecognitionException {
        nesCParser.nesC_file_return retval = new nesCParser.nesC_file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit361 =null;

        nesCParser.large_scale_construct_return large_scale_construct362 =null;


        RewriteRuleSubtreeStream stream_large_scale_construct=new RewriteRuleSubtreeStream(adaptor,"rule large_scale_construct");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            // nesC.g:832:5: ( ( translation_unit )? large_scale_construct -> ^( FILE ( translation_unit )? large_scale_construct ) )
            // nesC.g:832:10: ( translation_unit )? large_scale_construct
            {
            // nesC.g:832:10: ( translation_unit )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==ASYNC||LA99_0==AUTO||LA99_0==CHAR||LA99_0==COMMAND||LA99_0==CONST||(LA99_0 >= DOUBLE && LA99_0 <= DUTY)||LA99_0==ENUM||(LA99_0 >= EVENT && LA99_0 <= EXTERN)||LA99_0==FLOAT||LA99_0==HASH||(LA99_0 >= INLINE && LA99_0 <= INT8_T)||LA99_0==LONG||LA99_0==NORACE||(LA99_0 >= NXLE_UINT16_T && LA99_0 <= NX_UNION)||LA99_0==RAW_IDENTIFIER||LA99_0==REGISTER||LA99_0==RESTRICT||LA99_0==SHORT||LA99_0==SIGNED||LA99_0==STATIC||LA99_0==STRUCT||(LA99_0 >= TASK && LA99_0 <= UINT8_T)||(LA99_0 >= UNION && LA99_0 <= UNSIGNED)||(LA99_0 >= VOID && LA99_0 <= VOLATILE)) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // nesC.g:832:10: translation_unit
                    {
                    pushFollow(FOLLOW_translation_unit_in_nesC_file7115);
                    translation_unit361=translation_unit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit361.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_large_scale_construct_in_nesC_file7118);
            large_scale_construct362=large_scale_construct();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_large_scale_construct.add(large_scale_construct362.getTree());

            // AST REWRITE
            // elements: translation_unit, large_scale_construct
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 833:14: -> ^( FILE ( translation_unit )? large_scale_construct )
            {
                // nesC.g:833:17: ^( FILE ( translation_unit )? large_scale_construct )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FILE, "FILE")
                , root_1);

                // nesC.g:833:24: ( translation_unit )?
                if ( stream_translation_unit.hasNext() ) {
                    adaptor.addChild(root_1, stream_translation_unit.nextTree());

                }
                stream_translation_unit.reset();

                adaptor.addChild(root_1, stream_large_scale_construct.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nesC_file"


    public static class large_scale_construct_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "large_scale_construct"
    // nesC.g:835:1: large_scale_construct : ( interface_definition | component );
    public final nesCParser.large_scale_construct_return large_scale_construct() throws RecognitionException {
        nesCParser.large_scale_construct_return retval = new nesCParser.large_scale_construct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.interface_definition_return interface_definition363 =null;

        nesCParser.component_return component364 =null;



        try {
            // nesC.g:836:5: ( interface_definition | component )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==INTERFACE) ) {
                alt100=1;
            }
            else if ( (LA100_0==COMPONENT||LA100_0==CONFIGURATION||LA100_0==GENERIC||LA100_0==MODULE) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }
            switch (alt100) {
                case 1 :
                    // nesC.g:836:10: interface_definition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interface_definition_in_large_scale_construct7157);
                    interface_definition363=interface_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interface_definition363.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:837:10: component
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_component_in_large_scale_construct7168);
                    component364=component();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, component364.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "large_scale_construct"


    public static class interface_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_definition"
    // nesC.g:846:1: interface_definition : INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}' -> ^( INTERFACE identifier ( declaration )* ) ;
    public final nesCParser.interface_definition_return interface_definition() throws RecognitionException {
        nesCParser.interface_definition_return retval = new nesCParser.interface_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERFACE365=null;
        Token char_literal369=null;
        Token char_literal372=null;
        nesCParser.identifier_return identifier366 =null;

        nesCParser.type_parameters_return type_parameters367 =null;

        nesCParser.attributes_return attributes368 =null;

        nesCParser.line_directive_return line_directive370 =null;

        nesCParser.declaration_return declaration371 =null;


        Object INTERFACE365_tree=null;
        Object char_literal369_tree=null;
        Object char_literal372_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_type_parameters=new RewriteRuleSubtreeStream(adaptor,"rule type_parameters");
        try {
            // nesC.g:847:5: ( INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}' -> ^( INTERFACE identifier ( declaration )* ) )
            // nesC.g:847:10: INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}'
            {
            INTERFACE365=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_definition7194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE365);


            pushFollow(FOLLOW_identifier_in_interface_definition7196);
            identifier366=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier366.getTree());

            // nesC.g:847:31: ( type_parameters )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LESS) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // nesC.g:847:31: type_parameters
                    {
                    pushFollow(FOLLOW_type_parameters_in_interface_definition7198);
                    type_parameters367=type_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_parameters.add(type_parameters367.getTree());

                    }
                    break;

            }


            // nesC.g:847:48: ( attributes )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==ATTRIBUTE) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // nesC.g:847:48: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_interface_definition7201);
                    attributes368=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes368.getTree());

                    }
                    break;

            }


            char_literal369=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interface_definition7212); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal369);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:849:9: ( line_directive | declaration )*
            loop103:
            do {
                int alt103=3;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==HASH) ) {
                    alt103=1;
                }
                else if ( (LA103_0==ASYNC||LA103_0==AUTO||LA103_0==CHAR||LA103_0==COMMAND||LA103_0==CONST||(LA103_0 >= DOUBLE && LA103_0 <= DUTY)||LA103_0==ENUM||(LA103_0 >= EVENT && LA103_0 <= EXTERN)||LA103_0==FLOAT||(LA103_0 >= INLINE && LA103_0 <= INT8_T)||LA103_0==LONG||LA103_0==NORACE||(LA103_0 >= NXLE_UINT16_T && LA103_0 <= NX_UNION)||LA103_0==RAW_IDENTIFIER||LA103_0==REGISTER||LA103_0==RESTRICT||LA103_0==SHORT||LA103_0==SIGNED||LA103_0==STATIC||LA103_0==STRUCT||(LA103_0 >= TASK && LA103_0 <= UINT8_T)||(LA103_0 >= UNION && LA103_0 <= UNSIGNED)||(LA103_0 >= VOID && LA103_0 <= VOLATILE)) ) {
                    alt103=2;
                }


                switch (alt103) {
            	case 1 :
            	    // nesC.g:849:10: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_interface_definition7225);
            	    line_directive370=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive370.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:849:27: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_interface_definition7229);
            	    declaration371=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration371.getTree());

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal372=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interface_definition7247); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal372);


            // AST REWRITE
            // elements: identifier, INTERFACE, declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 851:13: -> ^( INTERFACE identifier ( declaration )* )
            {
                // nesC.g:851:16: ^( INTERFACE identifier ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:851:39: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interface_definition"


    public static class type_parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_parameters"
    // nesC.g:853:1: type_parameters : '<' type_parameter_list '>' ;
    public final nesCParser.type_parameters_return type_parameters() throws RecognitionException {
        nesCParser.type_parameters_return retval = new nesCParser.type_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal373=null;
        Token char_literal375=null;
        nesCParser.type_parameter_list_return type_parameter_list374 =null;


        Object char_literal373_tree=null;
        Object char_literal375_tree=null;

        try {
            // nesC.g:854:5: ( '<' type_parameter_list '>' )
            // nesC.g:854:10: '<' type_parameter_list '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal373=(Token)match(input,LESS,FOLLOW_LESS_in_type_parameters7289); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal373_tree = 
            (Object)adaptor.create(char_literal373)
            ;
            adaptor.addChild(root_0, char_literal373_tree);
            }

            pushFollow(FOLLOW_type_parameter_list_in_type_parameters7291);
            type_parameter_list374=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_parameter_list374.getTree());

            char_literal375=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_parameters7293); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal375_tree = 
            (Object)adaptor.create(char_literal375)
            ;
            adaptor.addChild(root_0, char_literal375_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_parameters"


    public static class type_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_parameter_list"
    // nesC.g:856:1: type_parameter_list : type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* ;
    public final nesCParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        nesCParser.type_parameter_list_return retval = new nesCParser.type_parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal378=null;
        nesCParser.type_specifier_return type_specifier376 =null;

        nesCParser.attributes_return attributes377 =null;

        nesCParser.type_specifier_return type_specifier379 =null;

        nesCParser.attributes_return attributes380 =null;


        Object char_literal378_tree=null;

        try {
            // nesC.g:857:5: ( type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* )
            // nesC.g:857:10: type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_specifier_in_type_parameter_list7312);
            type_specifier376=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier376.getTree());

            // nesC.g:857:25: ( attributes )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==ATTRIBUTE) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // nesC.g:857:25: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_type_parameter_list7314);
                    attributes377=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes377.getTree());

                    }
                    break;

            }


            // nesC.g:857:37: ( ',' type_specifier ( attributes )? )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==COMMA) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // nesC.g:857:38: ',' type_specifier ( attributes )?
            	    {
            	    char_literal378=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_parameter_list7318); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal378_tree = 
            	    (Object)adaptor.create(char_literal378)
            	    ;
            	    adaptor.addChild(root_0, char_literal378_tree);
            	    }

            	    pushFollow(FOLLOW_type_specifier_in_type_parameter_list7320);
            	    type_specifier379=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier379.getTree());

            	    // nesC.g:857:57: ( attributes )?
            	    int alt105=2;
            	    int LA105_0 = input.LA(1);

            	    if ( (LA105_0==ATTRIBUTE) ) {
            	        alt105=1;
            	    }
            	    switch (alt105) {
            	        case 1 :
            	            // nesC.g:857:57: attributes
            	            {
            	            pushFollow(FOLLOW_attributes_in_type_parameter_list7322);
            	            attributes380=attributes();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes380.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_parameter_list"


    public static class component_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component"
    // nesC.g:862:1: component : component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) ;
    public final nesCParser.component_return component() throws RecognitionException {
        nesCParser.component_return retval = new nesCParser.component_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.component_kind_return component_kind381 =null;

        nesCParser.identifier_return identifier382 =null;

        nesCParser.component_parameters_return component_parameters383 =null;

        nesCParser.attributes_return attributes384 =null;

        nesCParser.component_specification_return component_specification385 =null;

        nesCParser.implementation_return implementation386 =null;


        RewriteRuleSubtreeStream stream_component_parameters=new RewriteRuleSubtreeStream(adaptor,"rule component_parameters");
        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_component_kind=new RewriteRuleSubtreeStream(adaptor,"rule component_kind");
        try {
            // nesC.g:863:5: ( component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) )
            // nesC.g:863:9: component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )?
            {
            pushFollow(FOLLOW_component_kind_in_component7344);
            component_kind381=component_kind();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_kind.add(component_kind381.getTree());

            pushFollow(FOLLOW_identifier_in_component7346);
            identifier382=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier382.getTree());

            // nesC.g:863:35: ( component_parameters )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==LPARENS) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // nesC.g:863:35: component_parameters
                    {
                    pushFollow(FOLLOW_component_parameters_in_component7348);
                    component_parameters383=component_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameters.add(component_parameters383.getTree());

                    }
                    break;

            }


            // nesC.g:863:57: ( attributes )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==ATTRIBUTE) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // nesC.g:863:57: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_component7351);
                    attributes384=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes384.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_component_specification_in_component7362);
            component_specification385=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification385.getTree());

            // nesC.g:865:9: ( implementation )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==IMPLEMENTATION) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // nesC.g:865:9: implementation
                    {
                    pushFollow(FOLLOW_implementation_in_component7372);
                    implementation386=implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementation.add(implementation386.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: component_parameters, identifier, implementation, component_kind, component_specification
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 865:25: -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
            {
                // nesC.g:865:28: ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DEFINITION, "COMPONENT_DEFINITION")
                , root_1);

                adaptor.addChild(root_1, stream_component_kind.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_component_specification.nextTree());

                // nesC.g:865:101: ( implementation )?
                if ( stream_implementation.hasNext() ) {
                    adaptor.addChild(root_1, stream_implementation.nextTree());

                }
                stream_implementation.reset();

                // nesC.g:865:117: ( component_parameters )?
                if ( stream_component_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_component_parameters.nextTree());

                }
                stream_component_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component"


    public static class component_kind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_kind"
    // nesC.g:870:1: component_kind : ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) );
    public final nesCParser.component_kind_return component_kind() throws RecognitionException {
        nesCParser.component_kind_return retval = new nesCParser.component_kind_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MODULE387=null;
        Token CONFIGURATION388=null;
        Token COMPONENT389=null;
        Token GENERIC390=null;
        Token MODULE391=null;
        Token GENERIC392=null;
        Token CONFIGURATION393=null;

        Object MODULE387_tree=null;
        Object CONFIGURATION388_tree=null;
        Object COMPONENT389_tree=null;
        Object GENERIC390_tree=null;
        Object MODULE391_tree=null;
        Object GENERIC392_tree=null;
        Object CONFIGURATION393_tree=null;
        RewriteRuleTokenStream stream_CONFIGURATION=new RewriteRuleTokenStream(adaptor,"token CONFIGURATION");
        RewriteRuleTokenStream stream_GENERIC=new RewriteRuleTokenStream(adaptor,"token GENERIC");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_COMPONENT=new RewriteRuleTokenStream(adaptor,"token COMPONENT");

        try {
            // nesC.g:871:5: ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) )
            int alt110=5;
            switch ( input.LA(1) ) {
            case MODULE:
                {
                alt110=1;
                }
                break;
            case CONFIGURATION:
                {
                alt110=2;
                }
                break;
            case COMPONENT:
                {
                alt110=3;
                }
                break;
            case GENERIC:
                {
                int LA110_4 = input.LA(2);

                if ( (LA110_4==MODULE) ) {
                    alt110=4;
                }
                else if ( (LA110_4==CONFIGURATION) ) {
                    alt110=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }

            switch (alt110) {
                case 1 :
                    // nesC.g:871:10: MODULE
                    {
                    MODULE387=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE387);


                    // AST REWRITE
                    // elements: MODULE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 871:32: -> ^( COMPONENT_KIND MODULE )
                    {
                        // nesC.g:871:35: ^( COMPONENT_KIND MODULE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_KIND, "COMPONENT_KIND")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_MODULE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:872:10: CONFIGURATION
                    {
                    CONFIGURATION388=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION388);


                    // AST REWRITE
                    // elements: CONFIGURATION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 872:32: -> ^( COMPONENT_KIND CONFIGURATION )
                    {
                        // nesC.g:872:35: ^( COMPONENT_KIND CONFIGURATION )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_KIND, "COMPONENT_KIND")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CONFIGURATION.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:873:10: COMPONENT
                    {
                    COMPONENT389=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_component_kind7470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMPONENT.add(COMPONENT389);


                    // AST REWRITE
                    // elements: COMPONENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 873:32: -> ^( COMPONENT_KIND COMPONENT )
                    {
                        // nesC.g:873:35: ^( COMPONENT_KIND COMPONENT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_KIND, "COMPONENT_KIND")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_COMPONENT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:874:10: GENERIC MODULE
                    {
                    GENERIC390=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC390);


                    MODULE391=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7503); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE391);


                    // AST REWRITE
                    // elements: GENERIC, MODULE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 874:32: -> ^( COMPONENT_KIND GENERIC MODULE )
                    {
                        // nesC.g:874:35: ^( COMPONENT_KIND GENERIC MODULE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_KIND, "COMPONENT_KIND")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_GENERIC.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_MODULE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:875:10: GENERIC CONFIGURATION
                    {
                    GENERIC392=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7531); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC392);


                    CONFIGURATION393=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION393);


                    // AST REWRITE
                    // elements: CONFIGURATION, GENERIC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 875:32: -> ^( COMPONENT_KIND GENERIC CONFIGURATION )
                    {
                        // nesC.g:875:35: ^( COMPONENT_KIND GENERIC CONFIGURATION )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_KIND, "COMPONENT_KIND")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_GENERIC.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_CONFIGURATION.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component_kind"


    public static class implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementation"
    // nesC.g:877:1: implementation : IMPLEMENTATION '{' body '}' -> ^( IMPLEMENTATION ( body )? ) ;
    public final nesCParser.implementation_return implementation() throws RecognitionException {
        nesCParser.implementation_return retval = new nesCParser.implementation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLEMENTATION394=null;
        Token char_literal395=null;
        Token char_literal397=null;
        nesCParser.body_return body396 =null;


        Object IMPLEMENTATION394_tree=null;
        Object char_literal395_tree=null;
        Object char_literal397_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // nesC.g:878:5: ( IMPLEMENTATION '{' body '}' -> ^( IMPLEMENTATION ( body )? ) )
            // nesC.g:878:10: IMPLEMENTATION '{' body '}'
            {
            IMPLEMENTATION394=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_implementation7562); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION394);


            char_literal395=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_implementation7564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal395);


            pushFollow(FOLLOW_body_in_implementation7566);
            body396=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body396.getTree());

            char_literal397=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_implementation7568); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal397);


            // AST REWRITE
            // elements: IMPLEMENTATION, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 879:14: -> ^( IMPLEMENTATION ( body )? )
            {
                // nesC.g:879:17: ^( IMPLEMENTATION ( body )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLEMENTATION.nextNode()
                , root_1);

                // nesC.g:879:34: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_1, stream_body.nextTree());

                }
                stream_body.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "implementation"


    public static class component_parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_parameters"
    // nesC.g:885:1: component_parameters : '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) ;
    public final nesCParser.component_parameters_return component_parameters() throws RecognitionException {
        nesCParser.component_parameters_return retval = new nesCParser.component_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal398=null;
        Token char_literal400=null;
        nesCParser.component_parameter_list_return component_parameter_list399 =null;


        Object char_literal398_tree=null;
        Object char_literal400_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter_list");
        try {
            // nesC.g:886:5: ( '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) )
            // nesC.g:886:10: '(' ( component_parameter_list )? ')'
            {
            char_literal398=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_parameters7609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPARENS.add(char_literal398);


            // nesC.g:886:14: ( component_parameter_list )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ASYNC||LA111_0==AUTO||LA111_0==CHAR||LA111_0==COMMAND||LA111_0==CONST||(LA111_0 >= DOUBLE && LA111_0 <= DUTY)||LA111_0==ENUM||(LA111_0 >= EVENT && LA111_0 <= EXTERN)||LA111_0==FLOAT||(LA111_0 >= INLINE && LA111_0 <= INT8_T)||LA111_0==LONG||LA111_0==NORACE||(LA111_0 >= NXLE_UINT16_T && LA111_0 <= NX_UNION)||LA111_0==RAW_IDENTIFIER||LA111_0==REGISTER||LA111_0==RESTRICT||LA111_0==SHORT||LA111_0==SIGNED||LA111_0==STATIC||LA111_0==STRUCT||(LA111_0 >= TASK && LA111_0 <= UINT8_T)||(LA111_0 >= UNION && LA111_0 <= UNSIGNED)||(LA111_0 >= VOID && LA111_0 <= VOLATILE)) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // nesC.g:886:14: component_parameter_list
                    {
                    pushFollow(FOLLOW_component_parameter_list_in_component_parameters7611);
                    component_parameter_list399=component_parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameter_list.add(component_parameter_list399.getTree());

                    }
                    break;

            }


            char_literal400=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_parameters7614); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPARENS.add(char_literal400);


            // AST REWRITE
            // elements: component_parameter_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 887:13: -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
            {
                // nesC.g:887:16: ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_PARAMETER_LIST, "COMPONENT_PARAMETER_LIST")
                , root_1);

                // nesC.g:887:43: ( component_parameter_list )?
                if ( stream_component_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_component_parameter_list.nextTree());

                }
                stream_component_parameter_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component_parameters"


    public static class component_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_parameter_list"
    // nesC.g:889:1: component_parameter_list : component_parameter ( ',' component_parameter )* -> ( component_parameter )+ ;
    public final nesCParser.component_parameter_list_return component_parameter_list() throws RecognitionException {
        nesCParser.component_parameter_list_return retval = new nesCParser.component_parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal402=null;
        nesCParser.component_parameter_return component_parameter401 =null;

        nesCParser.component_parameter_return component_parameter403 =null;


        Object char_literal402_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_parameter=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter");
        try {
            // nesC.g:890:5: ( component_parameter ( ',' component_parameter )* -> ( component_parameter )+ )
            // nesC.g:890:10: component_parameter ( ',' component_parameter )*
            {
            pushFollow(FOLLOW_component_parameter_in_component_parameter_list7654);
            component_parameter401=component_parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter401.getTree());

            // nesC.g:890:30: ( ',' component_parameter )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==COMMA) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // nesC.g:890:31: ',' component_parameter
            	    {
            	    char_literal402=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_parameter_list7657); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal402);


            	    pushFollow(FOLLOW_component_parameter_in_component_parameter_list7659);
            	    component_parameter403=component_parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter403.getTree());

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            // AST REWRITE
            // elements: component_parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 890:57: -> ( component_parameter )+
            {
                if ( !(stream_component_parameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_component_parameter.hasNext() ) {
                    adaptor.addChild(root_0, stream_component_parameter.nextTree());

                }
                stream_component_parameter.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component_parameter_list"


    public static class component_parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_parameter"
    // nesC.g:892:1: component_parameter : ( parameter_declaration | TYPEDEF identifier ( attributes )? );
    public final nesCParser.component_parameter_return component_parameter() throws RecognitionException {
        nesCParser.component_parameter_return retval = new nesCParser.component_parameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TYPEDEF405=null;
        nesCParser.parameter_declaration_return parameter_declaration404 =null;

        nesCParser.identifier_return identifier406 =null;

        nesCParser.attributes_return attributes407 =null;


        Object TYPEDEF405_tree=null;

        try {
            // nesC.g:893:5: ( parameter_declaration | TYPEDEF identifier ( attributes )? )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ASYNC||LA114_0==AUTO||LA114_0==CHAR||LA114_0==COMMAND||LA114_0==CONST||(LA114_0 >= DOUBLE && LA114_0 <= DUTY)||LA114_0==ENUM||(LA114_0 >= EVENT && LA114_0 <= EXTERN)||LA114_0==FLOAT||(LA114_0 >= INLINE && LA114_0 <= INT8_T)||LA114_0==LONG||LA114_0==NORACE||(LA114_0 >= NXLE_UINT16_T && LA114_0 <= NX_UNION)||LA114_0==RAW_IDENTIFIER||LA114_0==REGISTER||LA114_0==RESTRICT||LA114_0==SHORT||LA114_0==SIGNED||LA114_0==STATIC||LA114_0==STRUCT||LA114_0==TASK||(LA114_0 >= UINT16_T && LA114_0 <= UINT8_T)||(LA114_0 >= UNION && LA114_0 <= UNSIGNED)||(LA114_0 >= VOID && LA114_0 <= VOLATILE)) ) {
                alt114=1;
            }
            else if ( (LA114_0==TYPEDEF) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }
            switch (alt114) {
                case 1 :
                    // nesC.g:893:10: parameter_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_parameter_declaration_in_component_parameter7685);
                    parameter_declaration404=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_declaration404.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:894:10: TYPEDEF identifier ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TYPEDEF405=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_component_parameter7696); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPEDEF405_tree = 
                    (Object)adaptor.create(TYPEDEF405)
                    ;
                    adaptor.addChild(root_0, TYPEDEF405_tree);
                    }

                    pushFollow(FOLLOW_identifier_in_component_parameter7698);
                    identifier406=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier406.getTree());

                    // nesC.g:894:29: ( attributes )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==ATTRIBUTE) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // nesC.g:894:29: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_component_parameter7700);
                            attributes407=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes407.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component_parameter"


    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // nesC.g:896:1: body : ( ( configuration_body )=> configuration_body | module_body );
    public final nesCParser.body_return body() throws RecognitionException {
        nesCParser.body_return retval = new nesCParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.configuration_body_return configuration_body408 =null;

        nesCParser.module_body_return module_body409 =null;



        try {
            // nesC.g:897:5: ( ( configuration_body )=> configuration_body | module_body )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==HASH) ) {
                int LA115_1 = input.LA(2);

                if ( (LA115_1==CONSTANT) ) {
                    int LA115_8 = input.LA(3);

                    if ( (LA115_8==STRING_LITERAL) ) {
                        int LA115_14 = input.LA(4);

                        if ( (synpred10_nesC()) ) {
                            alt115=1;
                        }
                        else if ( (true) ) {
                            alt115=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 115, 14, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 8, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA115_0==COMPONENTS) && (synpred10_nesC())) {
                alt115=1;
            }
            else if ( (LA115_0==ENABLE) && (synpred10_nesC())) {
                alt115=1;
            }
            else if ( (LA115_0==RAW_IDENTIFIER) ) {
                int LA115_4 = input.LA(2);

                if ( (LA115_4==DOT) && (synpred10_nesC())) {
                    alt115=1;
                }
                else if ( (LA115_4==ASSIGN) && (synpred10_nesC())) {
                    alt115=1;
                }
                else if ( (LA115_4==ARROW) && (synpred10_nesC())) {
                    alt115=1;
                }
                else if ( (LA115_4==191) && (synpred10_nesC())) {
                    alt115=1;
                }
                else if ( (LA115_4==LBRACKET) && (synpred10_nesC())) {
                    alt115=1;
                }
                else if ( (LA115_4==ASYNC||LA115_4==AUTO||LA115_4==CHAR||LA115_4==COMMAND||LA115_4==CONST||(LA115_4 >= DOUBLE && LA115_4 <= DUTY)||LA115_4==ENUM||(LA115_4 >= EVENT && LA115_4 <= EXTERN)||LA115_4==FLOAT||LA115_4==GCCATTRIBUTE||(LA115_4 >= INLINE && LA115_4 <= INT8_T)||(LA115_4 >= LONG && LA115_4 <= LPARENS)||LA115_4==NORACE||(LA115_4 >= NXLE_UINT16_T && LA115_4 <= NX_UNION)||LA115_4==RAW_IDENTIFIER||LA115_4==REGISTER||LA115_4==RESTRICT||LA115_4==SHORT||LA115_4==SIGNED||LA115_4==STAR||LA115_4==STATIC||LA115_4==STRUCT||LA115_4==TASK||(LA115_4 >= UINT16_T && LA115_4 <= UINT8_T)||(LA115_4 >= UNION && LA115_4 <= UNSIGNED)||(LA115_4 >= VOID && LA115_4 <= VOLATILE)||LA115_4==190) ) {
                    alt115=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA115_0==LBRACKET) && (synpred10_nesC())) {
                alt115=1;
            }
            else if ( (LA115_0==RBRACE) && (synpred10_nesC())) {
                alt115=1;
            }
            else if ( (LA115_0==ASYNC||LA115_0==AUTO||LA115_0==CHAR||LA115_0==COMMAND||LA115_0==CONST||(LA115_0 >= DOUBLE && LA115_0 <= DUTY)||LA115_0==ENUM||(LA115_0 >= EVENT && LA115_0 <= EXTERN)||LA115_0==FLOAT||(LA115_0 >= INLINE && LA115_0 <= INT8_T)||LA115_0==LONG||LA115_0==NORACE||(LA115_0 >= NXLE_UINT16_T && LA115_0 <= NX_UNION)||LA115_0==REGISTER||LA115_0==RESTRICT||LA115_0==SHORT||LA115_0==SIGNED||LA115_0==STATIC||LA115_0==STRUCT||(LA115_0 >= TASK && LA115_0 <= UINT8_T)||(LA115_0 >= UNION && LA115_0 <= UNSIGNED)||(LA115_0 >= VOID && LA115_0 <= VOLATILE)) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }
            switch (alt115) {
                case 1 :
                    // nesC.g:897:10: ( configuration_body )=> configuration_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_configuration_body_in_body7726);
                    configuration_body408=configuration_body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_body408.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:898:10: module_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_module_body_in_body7737);
                    module_body409=module_body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, module_body409.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "body"


    public static class configuration_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configuration_body"
    // nesC.g:903:1: configuration_body : ( configuration_element_list )? ;
    public final nesCParser.configuration_body_return configuration_body() throws RecognitionException {
        nesCParser.configuration_body_return retval = new nesCParser.configuration_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.configuration_element_list_return configuration_element_list410 =null;



        try {
            // nesC.g:904:5: ( ( configuration_element_list )? )
            // nesC.g:904:10: ( configuration_element_list )?
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:905:10: ( configuration_element_list )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==COMPONENTS||LA116_0==ENABLE||LA116_0==HASH||LA116_0==LBRACKET||LA116_0==RAW_IDENTIFIER) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // nesC.g:905:10: configuration_element_list
                    {
                    pushFollow(FOLLOW_configuration_element_list_in_configuration_body7766);
                    configuration_element_list410=configuration_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element_list410.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "configuration_body"


    public static class module_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_body"
    // nesC.g:909:1: module_body : translation_unit ;
    public final nesCParser.module_body_return module_body() throws RecognitionException {
        nesCParser.module_body_return retval = new nesCParser.module_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit411 =null;



        try {
            // nesC.g:910:5: ( translation_unit )
            // nesC.g:910:10: translation_unit
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_body7809);
            translation_unit411=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, translation_unit411.getTree());

            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "module_body"


    public static class configuration_element_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configuration_element_list"
    // nesC.g:914:1: configuration_element_list : ( line_directive | configuration_element )+ ;
    public final nesCParser.configuration_element_list_return configuration_element_list() throws RecognitionException {
        nesCParser.configuration_element_list_return retval = new nesCParser.configuration_element_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive412 =null;

        nesCParser.configuration_element_return configuration_element413 =null;



        try {
            // nesC.g:915:5: ( ( line_directive | configuration_element )+ )
            // nesC.g:915:10: ( line_directive | configuration_element )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:915:10: ( line_directive | configuration_element )+
            int cnt117=0;
            loop117:
            do {
                int alt117=3;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==HASH) ) {
                    alt117=1;
                }
                else if ( (LA117_0==COMPONENTS||LA117_0==ENABLE||LA117_0==LBRACKET||LA117_0==RAW_IDENTIFIER) ) {
                    alt117=2;
                }


                switch (alt117) {
            	case 1 :
            	    // nesC.g:915:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_configuration_element_list7836);
            	    line_directive412=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive412.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:915:28: configuration_element
            	    {
            	    pushFollow(FOLLOW_configuration_element_in_configuration_element_list7840);
            	    configuration_element413=configuration_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element413.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt117 >= 1 ) break loop117;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(117, input);
                        throw eee;
                }
                cnt117++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "configuration_element_list"


    public static class configuration_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configuration_element"
    // nesC.g:917:1: configuration_element : ( components | connection );
    public final nesCParser.configuration_element_return configuration_element() throws RecognitionException {
        nesCParser.configuration_element_return retval = new nesCParser.configuration_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.components_return components414 =null;

        nesCParser.connection_return connection415 =null;



        try {
            // nesC.g:918:5: ( components | connection )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==COMPONENTS) ) {
                alt118=1;
            }
            else if ( (LA118_0==ENABLE||LA118_0==LBRACKET||LA118_0==RAW_IDENTIFIER) ) {
                alt118=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;

            }
            switch (alt118) {
                case 1 :
                    // nesC.g:918:10: components
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_components_in_configuration_element7861);
                    components414=components();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, components414.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:919:10: connection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_connection_in_configuration_element7872);
                    connection415=connection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connection415.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "configuration_element"


    public static class components_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "components"
    // nesC.g:927:1: components : COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) ;
    public final nesCParser.components_return components() throws RecognitionException {
        nesCParser.components_return retval = new nesCParser.components_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMPONENTS416=null;
        Token char_literal418=null;
        nesCParser.component_line_return component_line417 =null;


        Object COMPONENTS416_tree=null;
        Object char_literal418_tree=null;
        RewriteRuleTokenStream stream_COMPONENTS=new RewriteRuleTokenStream(adaptor,"token COMPONENTS");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_component_line=new RewriteRuleSubtreeStream(adaptor,"rule component_line");
        try {
            // nesC.g:928:5: ( COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) )
            // nesC.g:928:10: COMPONENTS component_line ';'
            {
            COMPONENTS416=(Token)match(input,COMPONENTS,FOLLOW_COMPONENTS_in_components7917); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPONENTS.add(COMPONENTS416);


            pushFollow(FOLLOW_component_line_in_components7919);
            component_line417=component_line();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_line.add(component_line417.getTree());

            char_literal418=(Token)match(input,190,FOLLOW_190_in_components7921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_190.add(char_literal418);


            // AST REWRITE
            // elements: component_line, COMPONENTS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 928:40: -> ^( COMPONENTS component_line )
            {
                // nesC.g:928:43: ^( COMPONENTS component_line )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_COMPONENTS.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_component_line.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "components"


    public static class component_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_line"
    // nesC.g:930:1: component_line : component_declaration ( ',' component_declaration )* -> ( component_declaration )+ ;
    public final nesCParser.component_line_return component_line() throws RecognitionException {
        nesCParser.component_line_return retval = new nesCParser.component_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal420=null;
        nesCParser.component_declaration_return component_declaration419 =null;

        nesCParser.component_declaration_return component_declaration421 =null;


        Object char_literal420_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_declaration=new RewriteRuleSubtreeStream(adaptor,"rule component_declaration");
        try {
            // nesC.g:931:5: ( component_declaration ( ',' component_declaration )* -> ( component_declaration )+ )
            // nesC.g:931:10: component_declaration ( ',' component_declaration )*
            {
            pushFollow(FOLLOW_component_declaration_in_component_line7948);
            component_declaration419=component_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration419.getTree());

            // nesC.g:931:32: ( ',' component_declaration )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMMA) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // nesC.g:931:33: ',' component_declaration
            	    {
            	    char_literal420=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_line7951); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal420);


            	    pushFollow(FOLLOW_component_declaration_in_component_line7953);
            	    component_declaration421=component_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration421.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);


            // AST REWRITE
            // elements: component_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 931:61: -> ( component_declaration )+
            {
                if ( !(stream_component_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_component_declaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_component_declaration.nextTree());

                }
                stream_component_declaration.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component_line"


    public static class component_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_declaration"
    // nesC.g:933:1: component_declaration : component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) ;
    public final nesCParser.component_declaration_return component_declaration() throws RecognitionException {
        nesCParser.component_declaration_return retval = new nesCParser.component_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS423=null;
        nesCParser.component_ref_return component_ref422 =null;

        nesCParser.identifier_return identifier424 =null;


        Object AS423_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_component_ref=new RewriteRuleSubtreeStream(adaptor,"rule component_ref");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:934:5: ( component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) )
            // nesC.g:934:10: component_ref ( AS identifier )?
            {
            pushFollow(FOLLOW_component_ref_in_component_declaration7979);
            component_ref422=component_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_ref.add(component_ref422.getTree());

            // nesC.g:934:24: ( AS identifier )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==AS) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // nesC.g:934:25: AS identifier
                    {
                    AS423=(Token)match(input,AS,FOLLOW_AS_in_component_declaration7982); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS423);


                    pushFollow(FOLLOW_identifier_in_component_declaration7984);
                    identifier424=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier424.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, component_ref
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 934:41: -> ^( COMPONENT_DECLARATION component_ref ( identifier )? )
            {
                // nesC.g:934:44: ^( COMPONENT_DECLARATION component_ref ( identifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DECLARATION, "COMPONENT_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_component_ref.nextTree());

                // nesC.g:934:82: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component_declaration"


    public static class component_ref_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_ref"
    // nesC.g:940:1: component_ref : ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) );
    public final nesCParser.component_ref_return component_ref() throws RecognitionException {
        nesCParser.component_ref_return retval = new nesCParser.component_ref_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEW426=null;
        Token char_literal428=null;
        Token char_literal430=null;
        nesCParser.identifier_return identifier425 =null;

        nesCParser.identifier_return identifier427 =null;

        nesCParser.component_argument_list_return component_argument_list429 =null;


        Object NEW426_tree=null;
        Object char_literal428_tree=null;
        Object char_literal430_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule component_argument_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:941:5: ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RAW_IDENTIFIER) ) {
                alt122=1;
            }
            else if ( (LA122_0==NEW) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;

            }
            switch (alt122) {
                case 1 :
                    // nesC.g:941:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_component_ref8022);
                    identifier425=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier425.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:942:10: NEW identifier '(' ( component_argument_list )? ')'
                    {
                    NEW426=(Token)match(input,NEW,FOLLOW_NEW_in_component_ref8033); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW426);


                    pushFollow(FOLLOW_identifier_in_component_ref8035);
                    identifier427=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier427.getTree());

                    char_literal428=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_ref8037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal428);


                    // nesC.g:942:29: ( component_argument_list )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==AMP||LA121_0==BITCOMPLEMENT||LA121_0==CALL||(LA121_0 >= CHAR && LA121_0 <= CHARACTER_LITERAL)||(LA121_0 >= CONST && LA121_0 <= CONSTANT)||LA121_0==DOUBLE||LA121_0==ENUM||LA121_0==FLOAT||(LA121_0 >= INT && LA121_0 <= INT8_T)||(LA121_0 >= LONG && LA121_0 <= LPARENS)||LA121_0==MINUS||LA121_0==MINUSMINUS||LA121_0==NOT||(LA121_0 >= NXLE_UINT16_T && LA121_0 <= NX_UNION)||LA121_0==PLUS||LA121_0==PLUSPLUS||LA121_0==POST||LA121_0==RAW_IDENTIFIER||LA121_0==RESTRICT||(LA121_0 >= SHORT && LA121_0 <= SIZEOF)||LA121_0==STAR||(LA121_0 >= STRING_LITERAL && LA121_0 <= STRUCT)||(LA121_0 >= UINT16_T && LA121_0 <= UINT8_T)||(LA121_0 >= UNION && LA121_0 <= UNSIGNED)||(LA121_0 >= VOID && LA121_0 <= VOLATILE)) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // nesC.g:942:29: component_argument_list
                            {
                            pushFollow(FOLLOW_component_argument_list_in_component_ref8039);
                            component_argument_list429=component_argument_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_component_argument_list.add(component_argument_list429.getTree());

                            }
                            break;

                    }


                    char_literal430=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_ref8042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal430);


                    // AST REWRITE
                    // elements: component_argument_list, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 943:13: -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                    {
                        // nesC.g:943:16: ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_INSTANTIATION, "COMPONENT_INSTANTIATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:943:53: ( component_argument_list )?
                        if ( stream_component_argument_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_component_argument_list.nextTree());

                        }
                        stream_component_argument_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component_ref"


    public static class component_argument_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_argument_list"
    // nesC.g:950:1: component_argument_list : component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) ;
    public final nesCParser.component_argument_list_return component_argument_list() throws RecognitionException {
        nesCParser.component_argument_list_return retval = new nesCParser.component_argument_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal432=null;
        nesCParser.component_argument_return component_argument431 =null;

        nesCParser.component_argument_return component_argument433 =null;


        Object char_literal432_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_argument=new RewriteRuleSubtreeStream(adaptor,"rule component_argument");
        try {
            // nesC.g:951:5: ( component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) )
            // nesC.g:951:10: component_argument ( ',' component_argument )*
            {
            pushFollow(FOLLOW_component_argument_in_component_argument_list8089);
            component_argument431=component_argument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_argument.add(component_argument431.getTree());

            // nesC.g:951:29: ( ',' component_argument )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==COMMA) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // nesC.g:951:30: ',' component_argument
            	    {
            	    char_literal432=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_argument_list8092); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal432);


            	    pushFollow(FOLLOW_component_argument_in_component_argument_list8094);
            	    component_argument433=component_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_argument.add(component_argument433.getTree());

            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);


            // AST REWRITE
            // elements: component_argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 952:13: -> ^( COMPONENT_ARGUMENTS ( component_argument )+ )
            {
                // nesC.g:952:16: ^( COMPONENT_ARGUMENTS ( component_argument )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_ARGUMENTS, "COMPONENT_ARGUMENTS")
                , root_1);

                if ( !(stream_component_argument.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_component_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_component_argument.nextTree());

                }
                stream_component_argument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component_argument_list"


    public static class component_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_argument"
    // nesC.g:954:1: component_argument : ( expression | type_name );
    public final nesCParser.component_argument_return component_argument() throws RecognitionException {
        nesCParser.component_argument_return retval = new nesCParser.component_argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.expression_return expression434 =null;

        nesCParser.type_name_return type_name435 =null;



        try {
            // nesC.g:955:5: ( expression | type_name )
            int alt124=2;
            switch ( input.LA(1) ) {
            case AMP:
            case BITCOMPLEMENT:
            case CALL:
            case CHARACTER_LITERAL:
            case CONSTANT:
            case LPARENS:
            case MINUS:
            case MINUSMINUS:
            case NOT:
            case PLUS:
            case PLUSPLUS:
            case POST:
            case SIGNAL:
            case SIZEOF:
            case STAR:
            case STRING_LITERAL:
                {
                alt124=1;
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA124_2 = input.LA(2);

                if ( (( !symbols.isType(input.LT(1).getText()) )) ) {
                    alt124=1;
                }
                else if ( (( symbols.isType(input.LT(1).getText()) )) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
            case CONST:
            case DOUBLE:
            case ENUM:
            case FLOAT:
            case INT:
            case INT16_T:
            case INT32_T:
            case INT64_T:
            case INT8_T:
            case LONG:
            case NXLE_UINT16_T:
            case NXLE_UINT32_T:
            case NXLE_UINT64_T:
            case NXLE_UINT8_T:
            case NX_STRUCT:
            case NX_UINT16_T:
            case NX_UINT32_T:
            case NX_UINT64_T:
            case NX_UINT8_T:
            case NX_UNION:
            case RESTRICT:
            case SHORT:
            case SIGNED:
            case STRUCT:
            case UINT16_T:
            case UINT32_T:
            case UINT64_T:
            case UINT8_T:
            case UNION:
            case UNSIGNED:
            case VOID:
            case VOLATILE:
                {
                alt124=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;

            }

            switch (alt124) {
                case 1 :
                    // nesC.g:955:10: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_component_argument8136);
                    expression434=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression434.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:956:10: type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_name_in_component_argument8147);
                    type_name435=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name435.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component_argument"


    public static class connection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "connection"
    // nesC.g:962:1: connection : ( certificate_specification )? endpoint wire_rhs ';' -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? ) ;
    public final nesCParser.connection_return connection() throws RecognitionException {
        nesCParser.connection_return retval = new nesCParser.connection_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal439=null;
        nesCParser.certificate_specification_return certificate_specification436 =null;

        nesCParser.endpoint_return endpoint437 =null;

        nesCParser.wire_rhs_return wire_rhs438 =null;


        Object char_literal439_tree=null;
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_certificate_specification=new RewriteRuleSubtreeStream(adaptor,"rule certificate_specification");
        RewriteRuleSubtreeStream stream_wire_rhs=new RewriteRuleSubtreeStream(adaptor,"rule wire_rhs");
        RewriteRuleSubtreeStream stream_endpoint=new RewriteRuleSubtreeStream(adaptor,"rule endpoint");
        try {
            // nesC.g:963:5: ( ( certificate_specification )? endpoint wire_rhs ';' -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? ) )
            // nesC.g:963:10: ( certificate_specification )? endpoint wire_rhs ';'
            {
            // nesC.g:963:10: ( certificate_specification )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ENABLE) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // nesC.g:963:10: certificate_specification
                    {
                    pushFollow(FOLLOW_certificate_specification_in_connection8166);
                    certificate_specification436=certificate_specification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification436.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_endpoint_in_connection8169);
            endpoint437=endpoint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_endpoint.add(endpoint437.getTree());

            pushFollow(FOLLOW_wire_rhs_in_connection8171);
            wire_rhs438=wire_rhs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_wire_rhs.add(wire_rhs438.getTree());

            char_literal439=(Token)match(input,190,FOLLOW_190_in_connection8173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_190.add(char_literal439);


            // AST REWRITE
            // elements: certificate_specification, endpoint, wire_rhs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 964:14: -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? )
            {
                // nesC.g:964:17: ^( CONNECTION wire_rhs endpoint ( certificate_specification )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONNECTION, "CONNECTION")
                , root_1);

                adaptor.addChild(root_1, stream_wire_rhs.nextTree());

                adaptor.addChild(root_1, stream_endpoint.nextTree());

                // nesC.g:964:48: ( certificate_specification )?
                if ( stream_certificate_specification.hasNext() ) {
                    adaptor.addChild(root_1, stream_certificate_specification.nextTree());

                }
                stream_certificate_specification.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "connection"


    public static class wire_rhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wire_rhs"
    // nesC.g:966:1: wire_rhs : ( '=' ^ endpoint | '->' ^ endpoint | '<-' ^ endpoint );
    public final nesCParser.wire_rhs_return wire_rhs() throws RecognitionException {
        nesCParser.wire_rhs_return retval = new nesCParser.wire_rhs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal440=null;
        Token string_literal442=null;
        Token string_literal444=null;
        nesCParser.endpoint_return endpoint441 =null;

        nesCParser.endpoint_return endpoint443 =null;

        nesCParser.endpoint_return endpoint445 =null;


        Object char_literal440_tree=null;
        Object string_literal442_tree=null;
        Object string_literal444_tree=null;

        try {
            // nesC.g:967:5: ( '=' ^ endpoint | '->' ^ endpoint | '<-' ^ endpoint )
            int alt126=3;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt126=1;
                }
                break;
            case ARROW:
                {
                alt126=2;
                }
                break;
            case 191:
                {
                alt126=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;

            }

            switch (alt126) {
                case 1 :
                    // nesC.g:967:10: '=' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal440=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_wire_rhs8214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal440_tree = 
                    (Object)adaptor.create(char_literal440)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal440_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8218);
                    endpoint441=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint441.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:968:10: '->' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal442=(Token)match(input,ARROW,FOLLOW_ARROW_in_wire_rhs8229); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal442_tree = 
                    (Object)adaptor.create(string_literal442)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(string_literal442_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8232);
                    endpoint443=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint443.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:969:10: '<-' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal444=(Token)match(input,191,FOLLOW_191_in_wire_rhs8243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal444_tree = 
                    (Object)adaptor.create(string_literal444)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(string_literal444_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8246);
                    endpoint445=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint445.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "wire_rhs"


    public static class certificate_specification_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "certificate_specification"
    // nesC.g:971:1: certificate_specification : ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) ;
    public final nesCParser.certificate_specification_return certificate_specification() throws RecognitionException {
        nesCParser.certificate_specification_return retval = new nesCParser.certificate_specification_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token certs=null;
        Token entity=null;
        Token assumptions=null;
        Token ENABLE446=null;
        Token AS447=null;
        Token ASSUMING448=null;
        Token FOR449=null;

        Object certs_tree=null;
        Object entity_tree=null;
        Object assumptions_tree=null;
        Object ENABLE446_tree=null;
        Object AS447_tree=null;
        Object ASSUMING448_tree=null;
        Object FOR449_tree=null;
        RewriteRuleTokenStream stream_ASSUMING=new RewriteRuleTokenStream(adaptor,"token ASSUMING");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_ENABLE=new RewriteRuleTokenStream(adaptor,"token ENABLE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            // nesC.g:972:5: ( ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) )
            // nesC.g:972:10: ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR
            {
            ENABLE446=(Token)match(input,ENABLE,FOLLOW_ENABLE_in_certificate_specification8261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENABLE.add(ENABLE446);


            certs=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8265); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(certs);


            // nesC.g:972:38: ( AS entity= STRING_LITERAL )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==AS) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // nesC.g:972:39: AS entity= STRING_LITERAL
                    {
                    AS447=(Token)match(input,AS,FOLLOW_AS_in_certificate_specification8268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS447);


                    entity=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(entity);


                    }
                    break;

            }


            // nesC.g:972:66: ( ASSUMING assumptions= STRING_LITERAL )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==ASSUMING) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // nesC.g:972:67: ASSUMING assumptions= STRING_LITERAL
                    {
                    ASSUMING448=(Token)match(input,ASSUMING,FOLLOW_ASSUMING_in_certificate_specification8277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUMING.add(ASSUMING448);


                    assumptions=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(assumptions);


                    }
                    break;

            }


            FOR449=(Token)match(input,FOR,FOLLOW_FOR_in_certificate_specification8285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR449);


            // AST REWRITE
            // elements: ASSUMING, assumptions, entity, ENABLE, AS, certs
            // token labels: certs, entity, assumptions
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_certs=new RewriteRuleTokenStream(adaptor,"token certs",certs);
            RewriteRuleTokenStream stream_entity=new RewriteRuleTokenStream(adaptor,"token entity",entity);
            RewriteRuleTokenStream stream_assumptions=new RewriteRuleTokenStream(adaptor,"token assumptions",assumptions);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 973:14: -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
            {
                // nesC.g:973:17: ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ENABLE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_certs.nextNode());

                // nesC.g:973:33: ( ^( AS $entity) )?
                if ( stream_entity.hasNext()||stream_AS.hasNext() ) {
                    // nesC.g:973:33: ^( AS $entity)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_AS.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_entity.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_entity.reset();
                stream_AS.reset();

                // nesC.g:973:48: ( ^( ASSUMING $assumptions) )?
                if ( stream_ASSUMING.hasNext()||stream_assumptions.hasNext() ) {
                    // nesC.g:973:48: ^( ASSUMING $assumptions)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_ASSUMING.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_assumptions.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ASSUMING.reset();
                stream_assumptions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "certificate_specification"


    public static class endpoint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "endpoint"
    // nesC.g:975:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );
    public final nesCParser.endpoint_return endpoint() throws RecognitionException {
        nesCParser.endpoint_return retval = new nesCParser.endpoint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal452=null;
        Token char_literal454=null;
        nesCParser.identifier_path_return identifier_path450 =null;

        nesCParser.identifier_path_return identifier_path451 =null;

        nesCParser.argument_expression_list_return argument_expression_list453 =null;


        Object char_literal452_tree=null;
        Object char_literal454_tree=null;

        try {
            // nesC.g:976:5: ( identifier_path | identifier_path '[' argument_expression_list ']' )
            int alt129=2;
            alt129 = dfa129.predict(input);
            switch (alt129) {
                case 1 :
                    // nesC.g:976:10: identifier_path
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8338);
                    identifier_path450=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path450.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:977:10: identifier_path '[' argument_expression_list ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8349);
                    identifier_path451=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path451.getTree());

                    char_literal452=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_endpoint8351); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal452_tree = 
                    (Object)adaptor.create(char_literal452)
                    ;
                    adaptor.addChild(root_0, char_literal452_tree);
                    }

                    pushFollow(FOLLOW_argument_expression_list_in_endpoint8353);
                    argument_expression_list453=argument_expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list453.getTree());

                    char_literal454=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_endpoint8355); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal454_tree = 
                    (Object)adaptor.create(char_literal454)
                    ;
                    adaptor.addChild(root_0, char_literal454_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "endpoint"


    public static class identifier_path_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_path"
    // nesC.g:979:1: identifier_path : ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) );
    public final nesCParser.identifier_path_return identifier_path() throws RecognitionException {
        nesCParser.identifier_path_return retval = new nesCParser.identifier_path_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal456=null;
        Token char_literal458=null;
        Token char_literal459=null;
        Token char_literal460=null;
        List list_normal_path=null;
        nesCParser.identifier_return indirect =null;

        nesCParser.identifier_return identifier455 =null;

        nesCParser.identifier_return identifier457 =null;

        RuleReturnScope normal_path = null;
        Object char_literal456_tree=null;
        Object char_literal458_tree=null;
        Object char_literal459_tree=null;
        Object char_literal460_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:980:5: ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==RAW_IDENTIFIER) ) {
                alt132=1;
            }
            else if ( (LA132_0==LBRACKET) ) {
                alt132=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;

            }
            switch (alt132) {
                case 1 :
                    // nesC.g:980:10: identifier ( '.' identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_identifier_path8374);
                    identifier455=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier455.getTree());

                    // nesC.g:980:21: ( '.' identifier )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==DOT) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // nesC.g:980:22: '.' identifier
                    	    {
                    	    char_literal456=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8377); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal456);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8379);
                    	    identifier457=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier457.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop130;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 981:13: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:981:16: ^( IDENTIFIER_PATH ( identifier )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IDENTIFIER_PATH, "IDENTIFIER_PATH")
                        , root_1);

                        if ( !(stream_identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:982:10: '[' indirect= identifier ']' ( '.' normal_path+= identifier )*
                    {
                    char_literal458=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_identifier_path8413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal458);


                    pushFollow(FOLLOW_identifier_in_identifier_path8417);
                    indirect=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(indirect.getTree());

                    char_literal459=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_identifier_path8419); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal459);


                    // nesC.g:982:38: ( '.' normal_path+= identifier )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==DOT) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // nesC.g:982:39: '.' normal_path+= identifier
                    	    {
                    	    char_literal460=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8422); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal460);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8426);
                    	    normal_path=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(normal_path.getTree());
                    	    if (list_normal_path==null) list_normal_path=new ArrayList();
                    	    list_normal_path.add(normal_path.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: normal_path, indirect
                    // token labels: 
                    // rule labels: indirect, retval
                    // token list labels: 
                    // rule list labels: normal_path
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_indirect=new RewriteRuleSubtreeStream(adaptor,"rule indirect",indirect!=null?indirect.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_normal_path=new RewriteRuleSubtreeStream(adaptor,"token normal_path",list_normal_path);
                    root_0 = (Object)adaptor.nil();
                    // 983:13: -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
                    {
                        // nesC.g:983:16: ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DYNAMIC_IDENTIFIER_PATH, "DYNAMIC_IDENTIFIER_PATH")
                        , root_1);

                        adaptor.addChild(root_1, stream_indirect.nextTree());

                        adaptor.addChild(root_1, stream_normal_path.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier_path"


    public static class component_specification_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_specification"
    // nesC.g:989:1: component_specification : '{' ( line_directive | uses_provides )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final nesCParser.component_specification_return component_specification() throws RecognitionException {
        nesCParser.component_specification_return retval = new nesCParser.component_specification_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal461=null;
        Token char_literal464=null;
        nesCParser.line_directive_return line_directive462 =null;

        nesCParser.uses_provides_return uses_provides463 =null;


        Object char_literal461_tree=null;
        Object char_literal464_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        try {
            // nesC.g:990:5: ( '{' ( line_directive | uses_provides )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // nesC.g:990:10: '{' ( line_directive | uses_provides )* '}'
            {
            char_literal461=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification8475); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal461);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:991:11: ( line_directive | uses_provides )*
            loop133:
            do {
                int alt133=3;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==HASH) ) {
                    alt133=1;
                }
                else if ( (LA133_0==ASYNC||LA133_0==AUTO||LA133_0==CHAR||LA133_0==COMMAND||LA133_0==CONST||(LA133_0 >= DOUBLE && LA133_0 <= DUTY)||LA133_0==ENUM||(LA133_0 >= EVENT && LA133_0 <= EXTERN)||LA133_0==FLOAT||(LA133_0 >= INLINE && LA133_0 <= INT8_T)||LA133_0==LONG||LA133_0==NORACE||(LA133_0 >= NXLE_UINT16_T && LA133_0 <= NX_UNION)||(LA133_0 >= PROVIDES && LA133_0 <= RAW_IDENTIFIER)||LA133_0==REGISTER||LA133_0==RESTRICT||LA133_0==SHORT||LA133_0==SIGNED||LA133_0==STATIC||LA133_0==STRUCT||(LA133_0 >= TASK && LA133_0 <= UINT8_T)||(LA133_0 >= UNION && LA133_0 <= VOLATILE)) ) {
                    alt133=2;
                }


                switch (alt133) {
            	case 1 :
            	    // nesC.g:991:12: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification8490);
            	    line_directive462=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive462.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:991:29: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification8494);
            	    uses_provides463=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides463.getTree());

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);


            char_literal464=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification8498); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal464);


            // AST REWRITE
            // elements: uses_provides
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 991:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // nesC.g:991:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // nesC.g:991:68: ( uses_provides )*
                while ( stream_uses_provides.hasNext() ) {
                    adaptor.addChild(root_1, stream_uses_provides.nextTree());

                }
                stream_uses_provides.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "component_specification"


    public static class uses_provides_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uses_provides"
    // nesC.g:993:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) );
    public final nesCParser.uses_provides_return uses_provides() throws RecognitionException {
        nesCParser.uses_provides_return retval = new nesCParser.uses_provides_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token USES465=null;
        Token PROVIDES467=null;
        nesCParser.specification_element_list_return specification_element_list466 =null;

        nesCParser.specification_element_list_return specification_element_list468 =null;

        nesCParser.declaration_return declaration469 =null;


        Object USES465_tree=null;
        Object PROVIDES467_tree=null;
        RewriteRuleTokenStream stream_PROVIDES=new RewriteRuleTokenStream(adaptor,"token PROVIDES");
        RewriteRuleTokenStream stream_USES=new RewriteRuleTokenStream(adaptor,"token USES");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_specification_element_list=new RewriteRuleSubtreeStream(adaptor,"rule specification_element_list");
        try {
            // nesC.g:994:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) )
            int alt134=3;
            switch ( input.LA(1) ) {
            case USES:
                {
                alt134=1;
                }
                break;
            case PROVIDES:
                {
                alt134=2;
                }
                break;
            case ASYNC:
            case AUTO:
            case CHAR:
            case COMMAND:
            case CONST:
            case DOUBLE:
            case DUTY:
            case ENUM:
            case EVENT:
            case EXTERN:
            case FLOAT:
            case INLINE:
            case INT:
            case INT16_T:
            case INT32_T:
            case INT64_T:
            case INT8_T:
            case LONG:
            case NORACE:
            case NXLE_UINT16_T:
            case NXLE_UINT32_T:
            case NXLE_UINT64_T:
            case NXLE_UINT8_T:
            case NX_STRUCT:
            case NX_UINT16_T:
            case NX_UINT32_T:
            case NX_UINT64_T:
            case NX_UINT8_T:
            case NX_UNION:
            case RAW_IDENTIFIER:
            case REGISTER:
            case RESTRICT:
            case SHORT:
            case SIGNED:
            case STATIC:
            case STRUCT:
            case TASK:
            case TYPEDEF:
            case UINT16_T:
            case UINT32_T:
            case UINT64_T:
            case UINT8_T:
            case UNION:
            case UNSIGNED:
            case VOID:
            case VOLATILE:
                {
                alt134=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;

            }

            switch (alt134) {
                case 1 :
                    // nesC.g:994:10: USES specification_element_list
                    {
                    USES465=(Token)match(input,USES,FOLLOW_USES_in_uses_provides8526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES465);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8528);
                    specification_element_list466=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list466.getTree());

                    // AST REWRITE
                    // elements: specification_element_list, USES
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 994:42: -> ^( USES specification_element_list )
                    {
                        // nesC.g:994:45: ^( USES specification_element_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_USES.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_specification_element_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:995:10: PROVIDES specification_element_list
                    {
                    PROVIDES467=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides8547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES467);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8549);
                    specification_element_list468=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list468.getTree());

                    // AST REWRITE
                    // elements: specification_element_list, PROVIDES
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 995:46: -> ^( PROVIDES specification_element_list )
                    {
                        // nesC.g:995:49: ^( PROVIDES specification_element_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_PROVIDES.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_specification_element_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:996:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_uses_provides8568);
                    declaration469=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration469.getTree());

                    // AST REWRITE
                    // elements: declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 996:22: -> ^( DECLARATION declaration )
                    {
                        // nesC.g:996:25: ^( DECLARATION declaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uses_provides"


    public static class specification_element_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specification_element_list"
    // nesC.g:998:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final nesCParser.specification_element_list_return specification_element_list() throws RecognitionException {
        nesCParser.specification_element_list_return retval = new nesCParser.specification_element_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal471=null;
        Token char_literal473=null;
        nesCParser.specification_element_return specification_element470 =null;

        nesCParser.specification_element_return specification_element472 =null;


        Object char_literal471_tree=null;
        Object char_literal473_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_specification_element=new RewriteRuleSubtreeStream(adaptor,"rule specification_element");
        try {
            // nesC.g:999:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==ASYNC||LA136_0==AUTO||LA136_0==CHAR||LA136_0==COMMAND||LA136_0==CONST||(LA136_0 >= DOUBLE && LA136_0 <= DUTY)||LA136_0==ENUM||(LA136_0 >= EVENT && LA136_0 <= EXTERN)||LA136_0==FLOAT||(LA136_0 >= INLINE && LA136_0 <= INTERFACE)||LA136_0==LONG||LA136_0==NORACE||(LA136_0 >= NXLE_UINT16_T && LA136_0 <= NX_UNION)||LA136_0==RAW_IDENTIFIER||(LA136_0 >= REGISTER && LA136_0 <= REMOTE)||LA136_0==RESTRICT||LA136_0==SHORT||LA136_0==SIGNED||LA136_0==STATIC||LA136_0==STRUCT||(LA136_0 >= TASK && LA136_0 <= UINT8_T)||(LA136_0 >= UNION && LA136_0 <= UNSIGNED)||(LA136_0 >= VOID && LA136_0 <= VOLATILE)) ) {
                alt136=1;
            }
            else if ( (LA136_0==LBRACE) ) {
                alt136=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;

            }
            switch (alt136) {
                case 1 :
                    // nesC.g:999:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list8595);
                    specification_element470=specification_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element.add(specification_element470.getTree());

                    // AST REWRITE
                    // elements: specification_element
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 999:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:1000:10: '{' ( specification_element )+ '}'
                    {
                    char_literal471=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list8610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal471);


                    // nesC.g:1000:14: ( specification_element )+
                    int cnt135=0;
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==ASYNC||LA135_0==AUTO||LA135_0==CHAR||LA135_0==COMMAND||LA135_0==CONST||(LA135_0 >= DOUBLE && LA135_0 <= DUTY)||LA135_0==ENUM||(LA135_0 >= EVENT && LA135_0 <= EXTERN)||LA135_0==FLOAT||(LA135_0 >= INLINE && LA135_0 <= INTERFACE)||LA135_0==LONG||LA135_0==NORACE||(LA135_0 >= NXLE_UINT16_T && LA135_0 <= NX_UNION)||LA135_0==RAW_IDENTIFIER||(LA135_0 >= REGISTER && LA135_0 <= REMOTE)||LA135_0==RESTRICT||LA135_0==SHORT||LA135_0==SIGNED||LA135_0==STATIC||LA135_0==STRUCT||(LA135_0 >= TASK && LA135_0 <= UINT8_T)||(LA135_0 >= UNION && LA135_0 <= UNSIGNED)||(LA135_0 >= VOID && LA135_0 <= VOLATILE)) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // nesC.g:1000:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list8612);
                    	    specification_element472=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element472.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt135 >= 1 ) break loop135;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(135, input);
                                throw eee;
                        }
                        cnt135++;
                    } while (true);


                    char_literal473=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list8615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal473);


                    // AST REWRITE
                    // elements: specification_element
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1000:41: -> ( specification_element )+
                    {
                        if ( !(stream_specification_element.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_specification_element.hasNext() ) {
                            adaptor.addChild(root_0, stream_specification_element.nextTree());

                        }
                        stream_specification_element.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "specification_element_list"


    public static class specification_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specification_element"
    // nesC.g:1002:1: specification_element : ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) );
    public final nesCParser.specification_element_return specification_element() throws RecognitionException {
        nesCParser.specification_element_return retval = new nesCParser.specification_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS476=null;
        Token char_literal480=null;
        nesCParser.declaration_return declaration474 =null;

        nesCParser.interface_type_return interface_type475 =null;

        nesCParser.identifier_return identifier477 =null;

        nesCParser.instance_parameters_return instance_parameters478 =null;

        nesCParser.attributes_return attributes479 =null;


        Object AS476_tree=null;
        Object char_literal480_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_instance_parameters=new RewriteRuleSubtreeStream(adaptor,"rule instance_parameters");
        RewriteRuleSubtreeStream stream_interface_type=new RewriteRuleSubtreeStream(adaptor,"rule interface_type");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1003:5: ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==ASYNC||LA140_0==AUTO||LA140_0==CHAR||LA140_0==COMMAND||LA140_0==CONST||(LA140_0 >= DOUBLE && LA140_0 <= DUTY)||LA140_0==ENUM||(LA140_0 >= EVENT && LA140_0 <= EXTERN)||LA140_0==FLOAT||(LA140_0 >= INLINE && LA140_0 <= INT8_T)||LA140_0==LONG||LA140_0==NORACE||(LA140_0 >= NXLE_UINT16_T && LA140_0 <= NX_UNION)||LA140_0==RAW_IDENTIFIER||LA140_0==REGISTER||LA140_0==RESTRICT||LA140_0==SHORT||LA140_0==SIGNED||LA140_0==STATIC||LA140_0==STRUCT||(LA140_0 >= TASK && LA140_0 <= UINT8_T)||(LA140_0 >= UNION && LA140_0 <= UNSIGNED)||(LA140_0 >= VOID && LA140_0 <= VOLATILE)) ) {
                alt140=1;
            }
            else if ( (LA140_0==INTERFACE||LA140_0==REMOTE) ) {
                alt140=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;

            }
            switch (alt140) {
                case 1 :
                    // nesC.g:1003:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_specification_element8639);
                    declaration474=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration474.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:1004:10: interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';'
                    {
                    pushFollow(FOLLOW_interface_type_in_specification_element8650);
                    interface_type475=interface_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_type.add(interface_type475.getTree());

                    // nesC.g:1004:25: ( AS identifier )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==AS) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // nesC.g:1004:26: AS identifier
                            {
                            AS476=(Token)match(input,AS,FOLLOW_AS_in_specification_element8653); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AS.add(AS476);


                            pushFollow(FOLLOW_identifier_in_specification_element8655);
                            identifier477=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier477.getTree());

                            }
                            break;

                    }


                    // nesC.g:1004:42: ( instance_parameters )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==LBRACKET) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // nesC.g:1004:42: instance_parameters
                            {
                            pushFollow(FOLLOW_instance_parameters_in_specification_element8659);
                            instance_parameters478=instance_parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_instance_parameters.add(instance_parameters478.getTree());

                            }
                            break;

                    }


                    // nesC.g:1004:63: ( attributes )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==ATTRIBUTE) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // nesC.g:1004:63: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_specification_element8662);
                            attributes479=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes479.getTree());

                            }
                            break;

                    }


                    char_literal480=(Token)match(input,190,FOLLOW_190_in_specification_element8665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal480);


                    // AST REWRITE
                    // elements: identifier, interface_type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1005:13: -> ^( INTERFACE interface_type ( identifier )? )
                    {
                        // nesC.g:1005:16: ^( INTERFACE interface_type ( identifier )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTERFACE, "INTERFACE")
                        , root_1);

                        adaptor.addChild(root_1, stream_interface_type.nextTree());

                        // nesC.g:1005:43: ( identifier )?
                        if ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "specification_element"


    public static class interface_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_type"
    // nesC.g:1012:1: interface_type : ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) ;
    public final nesCParser.interface_type_return interface_type() throws RecognitionException {
        nesCParser.interface_type_return retval = new nesCParser.interface_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REMOTE481=null;
        Token INTERFACE482=null;
        Token REQUIRES485=null;
        Token STRING_LITERAL486=null;
        nesCParser.identifier_return identifier483 =null;

        nesCParser.type_arguments_return type_arguments484 =null;


        Object REMOTE481_tree=null;
        Object INTERFACE482_tree=null;
        Object REQUIRES485_tree=null;
        Object STRING_LITERAL486_tree=null;
        RewriteRuleTokenStream stream_REMOTE=new RewriteRuleTokenStream(adaptor,"token REMOTE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_REQUIRES=new RewriteRuleTokenStream(adaptor,"token REQUIRES");
        RewriteRuleSubtreeStream stream_type_arguments=new RewriteRuleSubtreeStream(adaptor,"rule type_arguments");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1013:5: ( ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) )
            // nesC.g:1013:10: ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )?
            {
            // nesC.g:1013:10: ( REMOTE )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==REMOTE) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // nesC.g:1013:10: REMOTE
                    {
                    REMOTE481=(Token)match(input,REMOTE,FOLLOW_REMOTE_in_interface_type8712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REMOTE.add(REMOTE481);


                    }
                    break;

            }


            INTERFACE482=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_type8715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE482);


            pushFollow(FOLLOW_identifier_in_interface_type8717);
            identifier483=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier483.getTree());

            // nesC.g:1013:39: ( type_arguments )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==LESS) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // nesC.g:1013:39: type_arguments
                    {
                    pushFollow(FOLLOW_type_arguments_in_interface_type8719);
                    type_arguments484=type_arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_arguments.add(type_arguments484.getTree());

                    }
                    break;

            }


            // nesC.g:1013:55: ( REQUIRES STRING_LITERAL )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==REQUIRES) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // nesC.g:1013:56: REQUIRES STRING_LITERAL
                    {
                    REQUIRES485=(Token)match(input,REQUIRES,FOLLOW_REQUIRES_in_interface_type8723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRES.add(REQUIRES485);


                    STRING_LITERAL486=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_interface_type8725); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL486);


                    }
                    break;

            }


            // AST REWRITE
            // elements: REMOTE, type_arguments, identifier, STRING_LITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1014:13: -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
            {
                // nesC.g:1014:16: ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_TYPE, "INTERFACE_TYPE")
                , root_1);

                // nesC.g:1014:33: ( REMOTE )?
                if ( stream_REMOTE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_REMOTE.nextNode()
                    );

                }
                stream_REMOTE.reset();

                // nesC.g:1014:41: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING_LITERAL.nextNode()
                    );

                }
                stream_STRING_LITERAL.reset();

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:1014:68: ( type_arguments )?
                if ( stream_type_arguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_type_arguments.nextTree());

                }
                stream_type_arguments.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interface_type"


    public static class type_arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_arguments"
    // nesC.g:1016:1: type_arguments : '<' type_name ( ',' type_name )* '>' -> ( type_name )+ ;
    public final nesCParser.type_arguments_return type_arguments() throws RecognitionException {
        nesCParser.type_arguments_return retval = new nesCParser.type_arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal487=null;
        Token char_literal489=null;
        Token char_literal491=null;
        nesCParser.type_name_return type_name488 =null;

        nesCParser.type_name_return type_name490 =null;


        Object char_literal487_tree=null;
        Object char_literal489_tree=null;
        Object char_literal491_tree=null;
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // nesC.g:1017:5: ( '<' type_name ( ',' type_name )* '>' -> ( type_name )+ )
            // nesC.g:1017:10: '<' type_name ( ',' type_name )* '>'
            {
            char_literal487=(Token)match(input,LESS,FOLLOW_LESS_in_type_arguments8775); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESS.add(char_literal487);


            pushFollow(FOLLOW_type_name_in_type_arguments8777);
            type_name488=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_name.add(type_name488.getTree());

            // nesC.g:1017:24: ( ',' type_name )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==COMMA) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // nesC.g:1017:25: ',' type_name
            	    {
            	    char_literal489=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_arguments8780); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal489);


            	    pushFollow(FOLLOW_type_name_in_type_arguments8782);
            	    type_name490=type_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type_name.add(type_name490.getTree());

            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);


            char_literal491=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_arguments8786); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GREATER.add(char_literal491);


            // AST REWRITE
            // elements: type_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1017:45: -> ( type_name )+
            {
                if ( !(stream_type_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_type_name.hasNext() ) {
                    adaptor.addChild(root_0, stream_type_name.nextTree());

                }
                stream_type_name.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_arguments"


    public static class instance_parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instance_parameters"
    // nesC.g:1019:1: instance_parameters : '[' parameter_list ']' ;
    public final nesCParser.instance_parameters_return instance_parameters() throws RecognitionException {
        nesCParser.instance_parameters_return retval = new nesCParser.instance_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal492=null;
        Token char_literal494=null;
        nesCParser.parameter_list_return parameter_list493 =null;


        Object char_literal492_tree=null;
        Object char_literal494_tree=null;

        try {
            // nesC.g:1020:5: ( '[' parameter_list ']' )
            // nesC.g:1020:10: '[' parameter_list ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal492=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_instance_parameters8810); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal492_tree = 
            (Object)adaptor.create(char_literal492)
            ;
            adaptor.addChild(root_0, char_literal492_tree);
            }

            pushFollow(FOLLOW_parameter_list_in_instance_parameters8812);
            parameter_list493=parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list493.getTree());

            char_literal494=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_instance_parameters8814); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal494_tree = 
            (Object)adaptor.create(char_literal494)
            ;
            adaptor.addChild(root_0, char_literal494_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instance_parameters"


    public static class attributes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributes"
    // nesC.g:1022:1: attributes : ( attribute )+ ;
    public final nesCParser.attributes_return attributes() throws RecognitionException {
        nesCParser.attributes_return retval = new nesCParser.attributes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.attribute_return attribute495 =null;



        try {
            // nesC.g:1023:5: ( ( attribute )+ )
            // nesC.g:1023:10: ( attribute )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:1023:10: ( attribute )+
            int cnt145=0;
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==ATTRIBUTE) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // nesC.g:1023:10: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributes8833);
            	    attribute495=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute495.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt145 >= 1 ) break loop145;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(145, input);
                        throw eee;
                }
                cnt145++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attributes"


    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // nesC.g:1025:1: attribute : '@' identifier '(' initializer_list ')' ;
    public final nesCParser.attribute_return attribute() throws RecognitionException {
        nesCParser.attribute_return retval = new nesCParser.attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal496=null;
        Token char_literal498=null;
        Token char_literal500=null;
        nesCParser.identifier_return identifier497 =null;

        nesCParser.initializer_list_return initializer_list499 =null;


        Object char_literal496_tree=null;
        Object char_literal498_tree=null;
        Object char_literal500_tree=null;

        try {
            // nesC.g:1026:5: ( '@' identifier '(' initializer_list ')' )
            // nesC.g:1026:10: '@' identifier '(' initializer_list ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal496=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute8853); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal496_tree = 
            (Object)adaptor.create(char_literal496)
            ;
            adaptor.addChild(root_0, char_literal496_tree);
            }

            pushFollow(FOLLOW_identifier_in_attribute8855);
            identifier497=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier497.getTree());

            char_literal498=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_attribute8857); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal498_tree = 
            (Object)adaptor.create(char_literal498)
            ;
            adaptor.addChild(root_0, char_literal498_tree);
            }

            pushFollow(FOLLOW_initializer_list_in_attribute8859);
            initializer_list499=initializer_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer_list499.getTree());

            char_literal500=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_attribute8861); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal500_tree = 
            (Object)adaptor.create(char_literal500)
            ;
            adaptor.addChild(root_0, char_literal500_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class gcc_attributes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gcc_attributes"
    // nesC.g:1031:1: gcc_attributes : GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' ;
    public final nesCParser.gcc_attributes_return gcc_attributes() throws RecognitionException {
        nesCParser.gcc_attributes_return retval = new nesCParser.gcc_attributes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GCCATTRIBUTE501=null;
        Token char_literal502=null;
        Token char_literal503=null;
        Token char_literal505=null;
        Token char_literal506=null;
        nesCParser.gcc_attribute_list_return gcc_attribute_list504 =null;


        Object GCCATTRIBUTE501_tree=null;
        Object char_literal502_tree=null;
        Object char_literal503_tree=null;
        Object char_literal505_tree=null;
        Object char_literal506_tree=null;

        try {
            // nesC.g:1032:5: ( GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' )
            // nesC.g:1032:10: GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')'
            {
            root_0 = (Object)adaptor.nil();


            GCCATTRIBUTE501=(Token)match(input,GCCATTRIBUTE,FOLLOW_GCCATTRIBUTE_in_gcc_attributes8879); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GCCATTRIBUTE501_tree = 
            (Object)adaptor.create(GCCATTRIBUTE501)
            ;
            adaptor.addChild(root_0, GCCATTRIBUTE501_tree);
            }

            char_literal502=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes8881); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal502_tree = 
            (Object)adaptor.create(char_literal502)
            ;
            adaptor.addChild(root_0, char_literal502_tree);
            }

            char_literal503=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes8883); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal503_tree = 
            (Object)adaptor.create(char_literal503)
            ;
            adaptor.addChild(root_0, char_literal503_tree);
            }

            pushFollow(FOLLOW_gcc_attribute_list_in_gcc_attributes8885);
            gcc_attribute_list504=gcc_attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute_list504.getTree());

            char_literal505=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes8887); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal505_tree = 
            (Object)adaptor.create(char_literal505)
            ;
            adaptor.addChild(root_0, char_literal505_tree);
            }

            char_literal506=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes8889); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal506_tree = 
            (Object)adaptor.create(char_literal506)
            ;
            adaptor.addChild(root_0, char_literal506_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "gcc_attributes"


    public static class gcc_attribute_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gcc_attribute_list"
    // nesC.g:1034:1: gcc_attribute_list : ( gcc_attribute )? ( ',' gcc_attribute )* ;
    public final nesCParser.gcc_attribute_list_return gcc_attribute_list() throws RecognitionException {
        nesCParser.gcc_attribute_list_return retval = new nesCParser.gcc_attribute_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal508=null;
        nesCParser.gcc_attribute_return gcc_attribute507 =null;

        nesCParser.gcc_attribute_return gcc_attribute509 =null;


        Object char_literal508_tree=null;

        try {
            // nesC.g:1035:5: ( ( gcc_attribute )? ( ',' gcc_attribute )* )
            // nesC.g:1035:10: ( gcc_attribute )? ( ',' gcc_attribute )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:1035:10: ( gcc_attribute )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==AMP||LA146_0==BITCOMPLEMENT||LA146_0==CALL||LA146_0==CHARACTER_LITERAL||LA146_0==CONSTANT||LA146_0==LPARENS||LA146_0==MINUS||LA146_0==MINUSMINUS||LA146_0==NOT||LA146_0==PLUS||LA146_0==PLUSPLUS||LA146_0==POST||LA146_0==RAW_IDENTIFIER||LA146_0==SIGNAL||LA146_0==SIZEOF||LA146_0==STAR||LA146_0==STRING_LITERAL) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // nesC.g:1035:10: gcc_attribute
                    {
                    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list8904);
                    gcc_attribute507=gcc_attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute507.getTree());

                    }
                    break;

            }


            // nesC.g:1035:25: ( ',' gcc_attribute )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==COMMA) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // nesC.g:1035:26: ',' gcc_attribute
            	    {
            	    char_literal508=(Token)match(input,COMMA,FOLLOW_COMMA_in_gcc_attribute_list8908); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal508_tree = 
            	    (Object)adaptor.create(char_literal508)
            	    ;
            	    adaptor.addChild(root_0, char_literal508_tree);
            	    }

            	    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list8910);
            	    gcc_attribute509=gcc_attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute509.getTree());

            	    }
            	    break;

            	default :
            	    break loop147;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "gcc_attribute_list"


    public static class gcc_attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gcc_attribute"
    // nesC.g:1037:1: gcc_attribute : assignment_expression ;
    public final nesCParser.gcc_attribute_return gcc_attribute() throws RecognitionException {
        nesCParser.gcc_attribute_return retval = new nesCParser.gcc_attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.assignment_expression_return assignment_expression510 =null;



        try {
            // nesC.g:1038:5: ( assignment_expression )
            // nesC.g:1038:10: assignment_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_gcc_attribute8927);
            assignment_expression510=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression510.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "gcc_attribute"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // nesC.g:1041:1: identifier :{...}? RAW_IDENTIFIER ;
    public final nesCParser.identifier_return identifier() throws RecognitionException {
        nesCParser.identifier_return retval = new nesCParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER511=null;

        Object RAW_IDENTIFIER511_tree=null;

        try {
            // nesC.g:1042:5: ({...}? RAW_IDENTIFIER )
            // nesC.g:1042:10: {...}? RAW_IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            if ( !(( !symbols.isType(input.LT(1).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "identifier", " !symbols.isType(input.LT(1).getText()) ");
            }

            RAW_IDENTIFIER511=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier8945); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAW_IDENTIFIER511_tree = 
            (Object)adaptor.create(RAW_IDENTIFIER511)
            ;
            adaptor.addChild(root_0, RAW_IDENTIFIER511_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"

    // $ANTLR start synpred1_nesC
    public final void synpred1_nesC_fragment() throws RecognitionException {
        // nesC.g:348:10: ( '(' type_name ')' )
        // nesC.g:348:11: '(' type_name ')'
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred1_nesC3331); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred1_nesC3333);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred1_nesC3335); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_nesC

    // $ANTLR start synpred2_nesC
    public final void synpred2_nesC_fragment() throws RecognitionException {
        // nesC.g:398:33: ( ',' assignment_expression )
        // nesC.g:398:34: ',' assignment_expression
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred2_nesC3846); if (state.failed) return ;

        pushFollow(FOLLOW_assignment_expression_in_synpred2_nesC3848);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_nesC

    // $ANTLR start synpred3_nesC
    public final void synpred3_nesC_fragment() throws RecognitionException {
        // nesC.g:424:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )
        // nesC.g:424:11: declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred3_nesC3922);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:424:34: ( gcc_attributes )?
        int alt148=2;
        int LA148_0 = input.LA(1);

        if ( (LA148_0==GCCATTRIBUTE) ) {
            alt148=1;
        }
        switch (alt148) {
            case 1 :
                // nesC.g:424:34: gcc_attributes
                {
                pushFollow(FOLLOW_gcc_attributes_in_synpred3_nesC3924);
                gcc_attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // nesC.g:424:50: ( init_declarator_list )?
        int alt149=2;
        int LA149_0 = input.LA(1);

        if ( (LA149_0==LPARENS||LA149_0==RAW_IDENTIFIER||LA149_0==STAR) ) {
            alt149=1;
        }
        switch (alt149) {
            case 1 :
                // nesC.g:424:50: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred3_nesC3927);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,190,FOLLOW_190_in_synpred3_nesC3930); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_nesC

    // $ANTLR start synpred4_nesC
    public final void synpred4_nesC_fragment() throws RecognitionException {
        // nesC.g:453:10: ( TYPEDEF declaration_specifiers ';' )
        // nesC.g:453:11: TYPEDEF declaration_specifiers ';'
        {
        match(input,TYPEDEF,FOLLOW_TYPEDEF_in_synpred4_nesC4118); if (state.failed) return ;

        pushFollow(FOLLOW_declaration_specifiers_in_synpred4_nesC4120);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        match(input,190,FOLLOW_190_in_synpred4_nesC4122); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_nesC

    // $ANTLR start synpred5_nesC
    public final void synpred5_nesC_fragment() throws RecognitionException {
        // nesC.g:636:9: ( '[' ( constant_expression )? ']' )
        // nesC.g:636:10: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred5_nesC5523); if (state.failed) return ;

        // nesC.g:636:14: ( constant_expression )?
        int alt150=2;
        int LA150_0 = input.LA(1);

        if ( (LA150_0==AMP||LA150_0==BITCOMPLEMENT||LA150_0==CALL||LA150_0==CHARACTER_LITERAL||LA150_0==CONSTANT||LA150_0==LPARENS||LA150_0==MINUS||LA150_0==MINUSMINUS||LA150_0==NOT||LA150_0==PLUS||LA150_0==PLUSPLUS||LA150_0==POST||LA150_0==RAW_IDENTIFIER||LA150_0==SIGNAL||LA150_0==SIZEOF||LA150_0==STAR||LA150_0==STRING_LITERAL) ) {
            alt150=1;
        }
        switch (alt150) {
            case 1 :
                // nesC.g:636:14: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred5_nesC5525);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred5_nesC5528); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_nesC

    // $ANTLR start synpred6_nesC
    public final void synpred6_nesC_fragment() throws RecognitionException {
        // nesC.g:673:10: ( declarator ( attributes )? )
        // nesC.g:673:11: declarator ( attributes )?
        {
        pushFollow(FOLLOW_declarator_in_synpred6_nesC5834);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:673:22: ( attributes )?
        int alt151=2;
        int LA151_0 = input.LA(1);

        if ( (LA151_0==ATTRIBUTE) ) {
            alt151=1;
        }
        switch (alt151) {
            case 1 :
                // nesC.g:673:22: attributes
                {
                pushFollow(FOLLOW_attributes_in_synpred6_nesC5836);
                attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred6_nesC

    // $ANTLR start synpred7_nesC
    public final void synpred7_nesC_fragment() throws RecognitionException {
        // nesC.g:683:10: ( ( pointer )? direct_abstract_declarator )
        // nesC.g:683:11: ( pointer )? direct_abstract_declarator
        {
        // nesC.g:683:11: ( pointer )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( (LA152_0==STAR) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // nesC.g:683:11: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred7_nesC5929);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred7_nesC5932);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_nesC

    // $ANTLR start synpred8_nesC
    public final void synpred8_nesC_fragment() throws RecognitionException {
        // nesC.g:687:10: ( '(' abstract_declarator ')' )
        // nesC.g:687:11: '(' abstract_declarator ')'
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred8_nesC5971); if (state.failed) return ;

        pushFollow(FOLLOW_abstract_declarator_in_synpred8_nesC5973);
        abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred8_nesC5975); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_nesC

    // $ANTLR start synpred9_nesC
    public final void synpred9_nesC_fragment() throws RecognitionException {
        // nesC.g:764:10: ( IF '(' expression ')' statement ELSE statement )
        // nesC.g:764:11: IF '(' expression ')' statement ELSE statement
        {
        match(input,IF,FOLLOW_IF_in_synpred9_nesC6512); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred9_nesC6514); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred9_nesC6516);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred9_nesC6518); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred9_nesC6520);
        statement();

        state._fsp--;
        if (state.failed) return ;

        match(input,ELSE,FOLLOW_ELSE_in_synpred9_nesC6522); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred9_nesC6524);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_nesC

    // $ANTLR start synpred10_nesC
    public final void synpred10_nesC_fragment() throws RecognitionException {
        // nesC.g:897:10: ( configuration_body )
        // nesC.g:897:11: configuration_body
        {
        pushFollow(FOLLOW_configuration_body_in_synpred10_nesC7721);
        configuration_body();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_nesC

    // Delegated rules

    public final boolean synpred9_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA62 dfa62 = new DFA62(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA129 dfa129 = new DFA129(this);
    static final String DFA62_eotS =
        "\5\uffff";
    static final String DFA62_eofS =
        "\5\uffff";
    static final String DFA62_minS =
        "\1\u00a8\2\36\2\uffff";
    static final String DFA62_maxS =
        "\1\u00a8\2\u00ba\2\uffff";
    static final String DFA62_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA62_specialS =
        "\5\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1",
            "\1\4\17\uffff\1\2\44\uffff\1\4\23\uffff\1\4\4\uffff\1\4\51"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "\1\4\17\uffff\1\2\44\uffff\1\4\23\uffff\1\4\4\uffff\1\4\51"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "645:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
    static final String DFA86_eotS =
        "\77\uffff";
    static final String DFA86_eofS =
        "\77\uffff";
    static final String DFA86_minS =
        "\1\6\1\0\75\uffff";
    static final String DFA86_maxS =
        "\1\u00be\1\0\75\uffff";
    static final String DFA86_acceptS =
        "\2\uffff\1\2\34\uffff\1\1\37\uffff";
    static final String DFA86_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA86_transitionS = {
            "\1\2\7\uffff\1\37\1\2\1\uffff\1\37\1\uffff\1\2\4\uffff\3\2\1"+
            "\uffff\1\37\1\2\1\uffff\1\37\16\uffff\1\37\2\2\6\uffff\1\2\4"+
            "\uffff\1\2\1\uffff\2\37\4\uffff\1\37\2\uffff\2\37\1\uffff\1"+
            "\37\1\2\6\uffff\1\2\6\uffff\1\2\3\uffff\6\37\3\uffff\1\2\4\uffff"+
            "\1\37\1\2\2\uffff\1\2\1\uffff\1\2\5\uffff\1\37\1\2\5\uffff\12"+
            "\37\3\uffff\1\2\1\uffff\1\2\1\uffff\1\2\6\uffff\1\1\1\2\1\uffff"+
            "\1\37\2\uffff\1\37\1\2\3\uffff\1\37\1\2\1\37\1\2\3\uffff\1\2"+
            "\1\uffff\1\37\1\2\1\37\1\2\6\37\2\uffff\2\37\1\uffff\2\37\1"+
            "\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "()* loopback of 747:10: ( declaration )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!((( !symbols.isType(input.LT(1).getText()) )))) ) {s = 31;}

                        else if ( (( !symbols.isType(input.LT(1).getText()) )) ) {s = 2;}

                         
                        input.seek(index86_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA129_eotS =
        "\13\uffff";
    static final String DFA129_eofS =
        "\13\uffff";
    static final String DFA129_minS =
        "\1\147\1\12\2\u0096\2\uffff\1\u0098\2\12\1\u0096\1\12";
    static final String DFA129_maxS =
        "\1\u0096\1\u00bf\2\u0096\2\uffff\1\u0098\2\u00bf\1\u0096\1\u00bf";
    static final String DFA129_acceptS =
        "\4\uffff\1\1\1\2\5\uffff";
    static final String DFA129_specialS =
        "\13\uffff}>";
    static final String[] DFA129_transitionS = {
            "\1\2\56\uffff\1\1",
            "\1\4\1\uffff\1\4\60\uffff\1\3\51\uffff\1\5\126\uffff\2\4",
            "\1\6",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\4\1\uffff\1\4\60\uffff\1\3\51\uffff\1\5\126\uffff\2\4",
            "\1\4\1\uffff\1\4\60\uffff\1\11\51\uffff\1\5\126\uffff\2\4",
            "\1\12",
            "\1\4\1\uffff\1\4\60\uffff\1\11\51\uffff\1\5\126\uffff\2\4"
    };

    static final short[] DFA129_eot = DFA.unpackEncodedString(DFA129_eotS);
    static final short[] DFA129_eof = DFA.unpackEncodedString(DFA129_eofS);
    static final char[] DFA129_min = DFA.unpackEncodedStringToUnsignedChars(DFA129_minS);
    static final char[] DFA129_max = DFA.unpackEncodedStringToUnsignedChars(DFA129_maxS);
    static final short[] DFA129_accept = DFA.unpackEncodedString(DFA129_acceptS);
    static final short[] DFA129_special = DFA.unpackEncodedString(DFA129_specialS);
    static final short[][] DFA129_transition;

    static {
        int numStates = DFA129_transitionS.length;
        DFA129_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA129_transition[i] = DFA.unpackEncodedString(DFA129_transitionS[i]);
        }
    }

    class DFA129 extends DFA {

        public DFA129(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 129;
            this.eot = DFA129_eot;
            this.eof = DFA129_eof;
            this.min = DFA129_min;
            this.max = DFA129_max;
            this.accept = DFA129_accept;
            this.special = DFA129_special;
            this.transition = DFA129_transition;
        }
        public String getDescription() {
            return "975:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );";
        }
    }
 

    public static final BitSet FOLLOW_identifier_in_primary_expression2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_primary_expression2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_primary_expression2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_primary_expression2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_primary_expression2853 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_primary_expression2855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_primary_expression2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_kind_in_postfix_expression2882 = new BitSet(new long[]{0x0000800020000000L,0x0000100000000000L,0x0000080000400000L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression2885 = new BitSet(new long[]{0x2000000000000402L,0x0002108000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_postfix_expression_modifier_in_postfix_expression2887 = new BitSet(new long[]{0x2000000000000402L,0x0002108000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LBRACKET_in_postfix_expression_modifier2928 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_postfix_expression_modifier2930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_postfix_expression_modifier2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression_modifier2950 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009144040A800L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression_modifier2952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression_modifier2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression_modifier2974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_postfix_expression_modifier2994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_postfix_expression_modifier3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_postfix_expression_modifier3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3084 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list3087 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3090 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unary_expression3116 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_unary_expression3137 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_unary_expression3158 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression3185 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression3211 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression3238 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITCOMPLEMENT_in_unary_expression3265 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_NOT_in_unary_expression3270 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3285 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_unary_expression3287 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_unary_expression3289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_unary_expression3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_cast_expression3350 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_cast_expression3352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_cast_expression3354 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3396 = new BitSet(new long[]{0x0800000000000002L,0x0010000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression3401 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expression3406 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_MODULUS_in_multiplicative_expression3411 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3415 = new BitSet(new long[]{0x0800000000000002L,0x0010000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3436 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression3441 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression3446 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3450 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3471 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression3476 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression3481 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3485 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3506 = new BitSet(new long[]{0x0000000000000002L,0x0000030000180000L});
    public static final BitSet FOLLOW_LESS_in_relational_expression3511 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression3516 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_LESSEQUAL_in_relational_expression3521 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_relational_expression3526 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3530 = new BitSet(new long[]{0x0000000000000002L,0x0000030000180000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3551 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_equality_expression3556 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equality_expression3561 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3565 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000040L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3586 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMP_in_and_expression3590 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3593 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3614 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_BITXOR_in_xor_expression3618 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3621 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3642 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BITOR_in_or_expression3646 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3649 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3670 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression3674 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3677 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3698 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression3702 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3705 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression3726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_conditional_expression3729 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_conditional_expression3732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_conditional_expression3734 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression3767 = new BitSet(new long[]{0x0400000000A41002L,0x0025400000000000L,0x0000000100001000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_expression3771 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_MULASSIGN_in_assignment_expression3776 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_DIVASSIGN_in_assignment_expression3781 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_MODASSIGN_in_assignment_expression3786 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_PLUSASSIGN_in_assignment_expression3791 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_MINUSASSIGN_in_assignment_expression3796 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_LSHIFTASSIGN_in_assignment_expression3801 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_RSHIFTASSIGN_in_assignment_expression3806 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_BITANDASSIGN_in_assignment_expression3811 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_BITXORASSIGN_in_assignment_expression3816 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_BITORASSIGN_in_assignment_expression3821 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3842 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_expression3853 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3856 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3965 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L,0x4000010000400000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration3967 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x4000010000400000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_declaration3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration4127 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_declaration4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration4177 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4179 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L,0x0000010000400000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4181 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration4184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x4000000000000000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_declaration4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_c_style_declaration_specifier_in_declaration_specifiers4256 = new BitSet(new long[]{0xC000400090024002L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_storage_class_specifier_in_c_style_declaration_specifier4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_c_style_declaration_specifier4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_c_style_declaration_specifier4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_specifier_in_c_style_declaration_specifier4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4326 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list4329 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4331 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator4365 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_attributes_in_init_declarator4367 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator4371 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_initializer_in_init_declarator4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_type_specifier4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT64_T_in_type_specifier4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT64_T_in_type_specifier4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT64_T_in_type_specifier4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT8_T_in_type_specifier4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT16_T_in_type_specifier4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT32_T_in_type_specifier4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT64_T_in_type_specifier4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4810 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4812 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4850 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4855 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_struct_or_union_specifier4898 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_struct_or_union_specifier4900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4902 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4904 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list4993 = new BitSet(new long[]{0x4000400010000002L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration5024 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x2000010000400000L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration5026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_struct_declaration5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list5071 = new BitSet(new long[]{0x4000400010000002L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list5075 = new BitSet(new long[]{0x4000400010000002L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5101 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list5104 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x2000010000400000L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5106 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_struct_declarator5139 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_struct_declarator5154 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5175 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5179 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5218 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5225 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5277 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list5280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5283 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_identifier_in_enumerator5308 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator5311 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_function_specifier5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator5400 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator5428 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator5430 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5456 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier5459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier5496 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier5498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5533 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140140A800L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier5535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5570 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0000590L,0x06CF540A134000FFL});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier5574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5576 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier5580 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0000590L,0x06CF540A524000FFL});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier5584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5626 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0400010010000000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_pointer_in_pointer5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5653 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0400000010000000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list5684 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0400000010000000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list5709 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list5712 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list5714 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list5719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_parameter_list5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration5791 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_parameter_declarator_in_parameter_declaration5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_parameter_declarator5842 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_parameter_declarator5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declarator5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5875 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_identifier_list5878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5880 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name5906 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5937 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator5991 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator5993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator5995 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator5997 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6009 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator_modifier6025 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140140A800L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator_modifier6027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator_modifier6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator_modifier6041 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0000590L,0x06CF540A524000FFL});
    public static final BitSet FOLLOW_parameter_list_in_direct_abstract_declarator_modifier6043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator_modifier6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer6107 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_initializer_list_in_initializer6109 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_initializer6111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_initializer_list6146 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6150 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list6153 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_initializer_list6158 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6162 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_statement_in_statement6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOMIC_in_atomic_statement6298 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_atomic_statement6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_labeled_statement6327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_labeled_statement6329 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement6352 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement6354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_labeled_statement6356 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement6379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_labeled_statement6381 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement6409 = new BitSet(new long[]{0xD081C000B70AC040L,0xC1829847E2040D90L,0x4ECFFD1E32C0A8FFL});
    public static final BitSet FOLLOW_declaration_in_compound_statement6422 = new BitSet(new long[]{0xD081C000B70AC040L,0xC1829847E2040D90L,0x4ECFFD1E32C0A8FFL});
    public static final BitSet FOLLOW_statement_in_compound_statement6425 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x4800291420C0A800L});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement6474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_expression_statement6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6539 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6541 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_selection_statement6543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6545 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_selection_statement6547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement6549 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_selection_statement6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6585 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6587 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_selection_statement6589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6591 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_selection_statement6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement6627 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6629 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_selection_statement6631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6633 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_selection_statement6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6681 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6683 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6687 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_iteration_statement6710 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6714 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6716 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_iteration_statement6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement6743 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6745 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x400009140040A800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_iteration_statement6752 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x400009140040A800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_iteration_statement6759 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009144040A800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6766 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_jump_statement6875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_jump_statement6877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_jump_statement6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement6898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_jump_statement6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement6915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_jump_statement6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement6932 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x400009140040A800L});
    public static final BitSet FOLLOW_expression_in_jump_statement6934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_jump_statement6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_translation_unit6973 = new BitSet(new long[]{0xC000400090024002L,0xC0800807E0200590L,0x06CFD40A124000FFL});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit6977 = new BitSet(new long[]{0xC000400090024002L,0xC0800807E0200590L,0x06CFD40A124000FFL});
    public static final BitSet FOLLOW_declaration_in_external_declaration6995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive7022 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive7026 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7028 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition7059 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_declarator_in_function_definition7061 = new BitSet(new long[]{0x0000000000010000L,0x0000004000000000L});
    public static final BitSet FOLLOW_attributes_in_function_definition7063 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7115 = new BitSet(new long[]{0x0000100800000000L,0x0008000800020000L});
    public static final BitSet FOLLOW_large_scale_construct_in_nesC_file7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_definition_in_large_scale_construct7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_in_large_scale_construct7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_definition7194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_interface_definition7196 = new BitSet(new long[]{0x0000000000010000L,0x0000014000000000L});
    public static final BitSet FOLLOW_type_parameters_in_interface_definition7198 = new BitSet(new long[]{0x0000000000010000L,0x0000004000000000L});
    public static final BitSet FOLLOW_attributes_in_interface_definition7201 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interface_definition7212 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0200590L,0x06CFD40A12C000FFL});
    public static final BitSet FOLLOW_line_directive_in_interface_definition7225 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0200590L,0x06CFD40A12C000FFL});
    public static final BitSet FOLLOW_declaration_in_interface_definition7229 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0200590L,0x06CFD40A12C000FFL});
    public static final BitSet FOLLOW_RBRACE_in_interface_definition7247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_parameters7289 = new BitSet(new long[]{0x4000000010000000L,0xC0000807C0000410L,0x02CF100A004000FFL});
    public static final BitSet FOLLOW_type_parameter_list_in_type_parameters7291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_GREATER_in_type_parameters7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7312 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7314 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_type_parameter_list7318 = new BitSet(new long[]{0x4000000010000000L,0xC0000807C0000410L,0x02CF100A004000FFL});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7320 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7322 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_component_kind_in_component7344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_component7346 = new BitSet(new long[]{0x0000000000010000L,0x0000104000000000L});
    public static final BitSet FOLLOW_component_parameters_in_component7348 = new BitSet(new long[]{0x0000000000010000L,0x0000004000000000L});
    public static final BitSet FOLLOW_attributes_in_component7351 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_component_specification_in_component7362 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_implementation_in_component7372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_component_kind7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7501 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7531 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_implementation7562 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_implementation7564 = new BitSet(new long[]{0xC000401090024000L,0xC0800887E0200598L,0x06CFD40A124000FFL});
    public static final BitSet FOLLOW_body_in_implementation7566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_implementation7568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_component_parameters7609 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0000590L,0x06CFD40A524000FFL});
    public static final BitSet FOLLOW_component_parameter_list_in_component_parameters7611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_parameters7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7654 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_parameter_list7657 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0000590L,0x06CFD40A124000FFL});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7659 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_component_parameter7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_component_parameter7696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_component_parameter7698 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_component_parameter7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_body_in_body7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_body_in_body7737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_element_list_in_configuration_body7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_module_body7809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_configuration_element_list7836 = new BitSet(new long[]{0x0000001000000002L,0x0000008000200008L,0x0000000000400000L});
    public static final BitSet FOLLOW_configuration_element_in_configuration_element_list7840 = new BitSet(new long[]{0x0000001000000002L,0x0000008000200008L,0x0000000000400000L});
    public static final BitSet FOLLOW_components_in_configuration_element7861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connection_in_configuration_element7872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTS_in_components7917 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_component_line_in_components7919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_components7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_declaration_in_component_line7948 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_line7951 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_component_declaration_in_component_line7953 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_component_ref_in_component_declaration7979 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AS_in_component_declaration7982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_component_declaration7984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_component_ref8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_component_ref8033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_component_ref8035 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_component_ref8037 = new BitSet(new long[]{0x4000C00032080040L,0xC1029807C0000410L,0x06CF191E5040A8FFL});
    public static final BitSet FOLLOW_component_argument_list_in_component_ref8039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_ref8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8089 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_argument_list8092 = new BitSet(new long[]{0x4000C00032080040L,0xC1029807C0000410L,0x06CF191E1040A8FFL});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8094 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_expression_in_component_argument8136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_component_argument8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8166 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_connection8169 = new BitSet(new long[]{0x0000000000001400L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_wire_rhs_in_connection8171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_connection8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_wire_rhs8214 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_wire_rhs8229 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_wire_rhs8243 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENABLE_in_certificate_specification8261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8265 = new BitSet(new long[]{0x0000000000002800L,0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_certificate_specification8268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8272 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ASSUMING_in_certificate_specification8277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_FOR_in_certificate_specification8285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8349 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_endpoint8351 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_argument_expression_list_in_endpoint8353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_endpoint8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8374 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8379 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifier_path8413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifier_path8419 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8426 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification8475 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0200590L,0x07CFD40A12E000FFL});
    public static final BitSet FOLLOW_line_directive_in_component_specification8490 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0200590L,0x07CFD40A12E000FFL});
    public static final BitSet FOLLOW_uses_provides_in_component_specification8494 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0200590L,0x07CFD40A12E000FFL});
    public static final BitSet FOLLOW_RBRACE_in_component_specification8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides8526 = new BitSet(new long[]{0xC000400090024000L,0xC080084FE0000590L,0x06CFD40A164000FFL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides8547 = new BitSet(new long[]{0xC000400090024000L,0xC080084FE0000590L,0x06CFD40A164000FFL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_uses_provides8568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list8610 = new BitSet(new long[]{0xC000400090024000L,0xC080080FE0000590L,0x06CFD40A164000FFL});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8612 = new BitSet(new long[]{0xC000400090024000L,0xC080080FE0000590L,0x06CFD40A16C000FFL});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_type_in_specification_element8650 = new BitSet(new long[]{0x0000000000010800L,0x0000008000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_AS_in_specification_element8653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_specification_element8655 = new BitSet(new long[]{0x0000000000010000L,0x0000008000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_instance_parameters_in_specification_element8659 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_attributes_in_specification_element8662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_specification_element8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOTE_in_interface_type8712 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_type8715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_interface_type8717 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_type_arguments_in_interface_type8719 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_REQUIRES_in_interface_type8723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_interface_type8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_arguments8775 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_type_arguments8777 = new BitSet(new long[]{0x0000000040000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_type_arguments8780 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_type_arguments8782 = new BitSet(new long[]{0x0000000040000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_GREATER_in_type_arguments8786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_instance_parameters8810 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0000590L,0x06CF540A134000FFL});
    public static final BitSet FOLLOW_parameter_list_in_instance_parameters8812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_instance_parameters8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributes8833 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute8853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_attribute8855 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_attribute8857 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_initializer_list_in_attribute8859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_attribute8861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GCCATTRIBUTE_in_gcc_attributes8879 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes8881 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes8883 = new BitSet(new long[]{0x0000800062080040L,0x0102900000000000L,0x000009144040A800L});
    public static final BitSet FOLLOW_gcc_attribute_list_in_gcc_attributes8885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes8887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list8904 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_gcc_attribute_list8908 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list8910 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_assignment_expression_in_gcc_attribute8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred1_nesC3331 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_synpred1_nesC3333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred1_nesC3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred2_nesC3846 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred2_nesC3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred3_nesC3922 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L,0x4000010000400000L});
    public static final BitSet FOLLOW_gcc_attributes_in_synpred3_nesC3924 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x4000010000400000L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred3_nesC3927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_synpred3_nesC3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_synpred4_nesC4118 = new BitSet(new long[]{0xC000400090024000L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred4_nesC4120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_synpred4_nesC4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred5_nesC5523 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140140A800L});
    public static final BitSet FOLLOW_constant_expression_in_synpred5_nesC5525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred5_nesC5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred6_nesC5834 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_synpred6_nesC5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred7_nesC5929 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred7_nesC5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred8_nesC5971 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_synpred8_nesC5973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred8_nesC5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred9_nesC6512 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred9_nesC6514 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_synpred9_nesC6516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred9_nesC6518 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_synpred9_nesC6520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ELSE_in_synpred9_nesC6522 = new BitSet(new long[]{0x1081800027088040L,0x0102904002040800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_synpred9_nesC6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_body_in_synpred10_nesC7721 = new BitSet(new long[]{0x0000000000000002L});

}