// $ANTLR 3.4 nesC.g 2013-04-02 11:31:29

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
        this.state.ruleMemo = new HashMap[354+1];
         

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
    // nesC.g:295:1: primary_expression : ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression );
    public final nesCParser.primary_expression_return primary_expression() throws RecognitionException {
        nesCParser.primary_expression_return retval = new nesCParser.primary_expression_return();
        retval.start = input.LT(1);

        int primary_expression_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // nesC.g:296:5: ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression )
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
                    // nesC.g:296:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression2848);
                    identifier1=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier1.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:297:10: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT2=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_primary_expression2859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT2_tree = 
                    (Object)adaptor.create(CONSTANT2)
                    ;
                    adaptor.addChild(root_0, CONSTANT2_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:298:10: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primary_expression2870); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL3_tree = 
                    (Object)adaptor.create(STRING_LITERAL3)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL3_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:299:10: CHARACTER_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARACTER_LITERAL4=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_primary_expression2881); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARACTER_LITERAL4_tree = 
                    (Object)adaptor.create(CHARACTER_LITERAL4)
                    ;
                    adaptor.addChild(root_0, CHARACTER_LITERAL4_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:300:10: '(' expression ')'
                    {
                    char_literal5=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_primary_expression2892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_primary_expression2894);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

                    char_literal7=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_primary_expression2896); if (state.failed) return retval; 
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
                    // 300:29: -> expression
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
            if ( state.backtracking>0 ) { memoize(input, 1, primary_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primary_expression"


    public static class postfix_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expression"
    // nesC.g:308:1: postfix_expression : ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) ;
    public final nesCParser.postfix_expression_return postfix_expression() throws RecognitionException {
        nesCParser.postfix_expression_return retval = new nesCParser.postfix_expression_return();
        retval.start = input.LT(1);

        int postfix_expression_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.call_kind_return call_kind8 =null;

        nesCParser.primary_expression_return primary_expression9 =null;

        nesCParser.postfix_expression_modifier_return postfix_expression_modifier10 =null;


        RewriteRuleSubtreeStream stream_call_kind=new RewriteRuleSubtreeStream(adaptor,"rule call_kind");
        RewriteRuleSubtreeStream stream_postfix_expression_modifier=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression_modifier");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // nesC.g:309:5: ( ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) )
            // nesC.g:309:10: ( call_kind )? primary_expression ( postfix_expression_modifier )*
            {
            // nesC.g:309:10: ( call_kind )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CALL||LA2_0==POST||LA2_0==SIGNAL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // nesC.g:309:10: call_kind
                    {
                    pushFollow(FOLLOW_call_kind_in_postfix_expression2921);
                    call_kind8=call_kind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_call_kind.add(call_kind8.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_primary_expression_in_postfix_expression2924);
            primary_expression9=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression9.getTree());

            // nesC.g:309:40: ( postfix_expression_modifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARROW||LA3_0==DOT||LA3_0==LBRACKET||LA3_0==LPARENS||LA3_0==MINUSMINUS||LA3_0==PLUSPLUS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // nesC.g:309:40: postfix_expression_modifier
            	    {
            	    pushFollow(FOLLOW_postfix_expression_modifier_in_postfix_expression2926);
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
            // elements: postfix_expression_modifier, primary_expression, call_kind
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 310:13: -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
            {
                // nesC.g:310:16: ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION")
                , root_1);

                // nesC.g:310:37: ( call_kind )?
                if ( stream_call_kind.hasNext() ) {
                    adaptor.addChild(root_1, stream_call_kind.nextTree());

                }
                stream_call_kind.reset();

                adaptor.addChild(root_1, stream_primary_expression.nextTree());

                // nesC.g:310:67: ( postfix_expression_modifier )*
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
            if ( state.backtracking>0 ) { memoize(input, 2, postfix_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "postfix_expression"


    public static class postfix_expression_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expression_modifier"
    // nesC.g:312:1: postfix_expression_modifier : ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' );
    public final nesCParser.postfix_expression_modifier_return postfix_expression_modifier() throws RecognitionException {
        nesCParser.postfix_expression_modifier_return retval = new nesCParser.postfix_expression_modifier_return();
        retval.start = input.LT(1);

        int postfix_expression_modifier_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // nesC.g:313:5: ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' )
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
                    // nesC.g:313:9: '[' expression ']'
                    {
                    char_literal11=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_postfix_expression_modifier2967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal11);


                    pushFollow(FOLLOW_expression_in_postfix_expression_modifier2969);
                    expression12=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression12.getTree());

                    char_literal13=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_postfix_expression_modifier2971); if (state.failed) return retval; 
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
                    // 313:28: -> ^( ARRAY_ELEMENT_SELECTION expression )
                    {
                        // nesC.g:313:31: ^( ARRAY_ELEMENT_SELECTION expression )
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
                    // nesC.g:314:9: '(' ( argument_expression_list )? ')'
                    {
                    char_literal14=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression_modifier2989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal14);


                    // nesC.g:314:13: ( argument_expression_list )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AMP||LA4_0==BITCOMPLEMENT||LA4_0==CALL||LA4_0==CHARACTER_LITERAL||LA4_0==CONSTANT||LA4_0==LPARENS||LA4_0==MINUS||LA4_0==MINUSMINUS||LA4_0==NOT||LA4_0==PLUS||LA4_0==PLUSPLUS||LA4_0==POST||LA4_0==RAW_IDENTIFIER||LA4_0==SIGNAL||LA4_0==SIZEOF||LA4_0==STAR||LA4_0==STRING_LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // nesC.g:314:13: argument_expression_list
                            {
                            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression_modifier2991);
                            argument_expression_list15=argument_expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list15.getTree());

                            }
                            break;

                    }


                    char_literal16=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression_modifier2994); if (state.failed) return retval; 
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
                    // 314:43: -> ^( ARGUMENT_LIST ( argument_expression_list )? )
                    {
                        // nesC.g:314:46: ^( ARGUMENT_LIST ( argument_expression_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST")
                        , root_1);

                        // nesC.g:314:62: ( argument_expression_list )?
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
                    // nesC.g:315:9: '.' identifier
                    {
                    char_literal17=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression_modifier3013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal17);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier3015);
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
                    // 315:24: -> ^( '.' identifier )
                    {
                        // nesC.g:315:27: ^( '.' identifier )
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
                    // nesC.g:316:9: '->' identifier
                    {
                    string_literal19=(Token)match(input,ARROW,FOLLOW_ARROW_in_postfix_expression_modifier3033); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal19);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier3035);
                    identifier20=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier20.getTree());

                    // AST REWRITE
                    // elements: ARROW, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 316:25: -> ^( '->' identifier )
                    {
                        // nesC.g:316:28: ^( '->' identifier )
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
                    // nesC.g:317:9: '++'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal21=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfix_expression_modifier3053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = 
                    (Object)adaptor.create(string_literal21)
                    ;
                    adaptor.addChild(root_0, string_literal21_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:318:9: '--'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal22=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfix_expression_modifier3063); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 3, postfix_expression_modifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "postfix_expression_modifier"


    public static class call_kind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call_kind"
    // nesC.g:320:1: call_kind : ( CALL | POST | SIGNAL );
    public final nesCParser.call_kind_return call_kind() throws RecognitionException {
        nesCParser.call_kind_return retval = new nesCParser.call_kind_return();
        retval.start = input.LT(1);

        int call_kind_StartIndex = input.index();

        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // nesC.g:321:5: ( CALL | POST | SIGNAL )
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
            if ( state.backtracking>0 ) { memoize(input, 4, call_kind_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "call_kind"


    public static class argument_expression_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument_expression_list"
    // nesC.g:325:1: argument_expression_list : assignment_expression ( ',' ! assignment_expression )* ;
    public final nesCParser.argument_expression_list_return argument_expression_list() throws RecognitionException {
        nesCParser.argument_expression_list_return retval = new nesCParser.argument_expression_list_return();
        retval.start = input.LT(1);

        int argument_expression_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal25=null;
        nesCParser.assignment_expression_return assignment_expression24 =null;

        nesCParser.assignment_expression_return assignment_expression26 =null;


        Object char_literal25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // nesC.g:326:5: ( assignment_expression ( ',' ! assignment_expression )* )
            // nesC.g:326:10: assignment_expression ( ',' ! assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3123);
            assignment_expression24=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression24.getTree());

            // nesC.g:326:32: ( ',' ! assignment_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // nesC.g:326:33: ',' ! assignment_expression
            	    {
            	    char_literal25=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list3126); if (state.failed) return retval;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3129);
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
            if ( state.backtracking>0 ) { memoize(input, 5, argument_expression_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "argument_expression_list"


    public static class unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expression"
    // nesC.g:328:1: unary_expression : ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression );
    public final nesCParser.unary_expression_return unary_expression() throws RecognitionException {
        nesCParser.unary_expression_return retval = new nesCParser.unary_expression_return();
        retval.start = input.LT(1);

        int unary_expression_StartIndex = input.index();

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
        Token SIZEOF46=null;
        nesCParser.unary_expression_return unary_expression28 =null;

        nesCParser.unary_expression_return unary_expression30 =null;

        nesCParser.cast_expression_return cast_expression32 =null;

        nesCParser.cast_expression_return cast_expression34 =null;

        nesCParser.cast_expression_return cast_expression36 =null;

        nesCParser.cast_expression_return cast_expression38 =null;

        nesCParser.cast_expression_return cast_expression41 =null;

        nesCParser.type_name_return type_name44 =null;

        nesCParser.unary_expression_return unary_expression47 =null;

        nesCParser.postfix_expression_return postfix_expression48 =null;


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
        Object SIZEOF46_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // nesC.g:329:5: ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression )
            int alt8=10;
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
                int LA8_9 = input.LA(2);

                if ( (synpred24_nesC()) ) {
                    alt8=8;
                }
                else if ( (synpred25_nesC()) ) {
                    alt8=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 9, input);

                    throw nvae;

                }
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
                alt8=10;
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
                    // nesC.g:329:10: '++' unary_expression
                    {
                    string_literal27=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unary_expression3150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(string_literal27);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3152);
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
                    // 329:32: -> ^( PRE_INCREMENT unary_expression )
                    {
                        // nesC.g:329:35: ^( PRE_INCREMENT unary_expression )
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
                    // nesC.g:330:10: '--' unary_expression
                    {
                    string_literal29=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unary_expression3171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUSMINUS.add(string_literal29);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3173);
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
                    // 330:32: -> ^( PRE_DECREMENT unary_expression )
                    {
                        // nesC.g:330:35: ^( PRE_DECREMENT unary_expression )
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
                    // nesC.g:331:10: '&' cast_expression
                    {
                    char_literal31=(Token)match(input,AMP,FOLLOW_AMP_in_unary_expression3192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMP.add(char_literal31);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3195);
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
                    // 331:32: -> ^( ADDRESS_OF cast_expression )
                    {
                        // nesC.g:331:35: ^( ADDRESS_OF cast_expression )
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
                    // nesC.g:332:10: '*' cast_expression
                    {
                    char_literal33=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression3219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal33);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3222);
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
                    // 332:32: -> ^( DEREFERENCE cast_expression )
                    {
                        // nesC.g:332:35: ^( DEREFERENCE cast_expression )
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
                    // nesC.g:333:10: '+' cast_expression
                    {
                    char_literal35=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression3245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal35);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3248);
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
                    // 333:32: -> ^( UNARY_PLUS cast_expression )
                    {
                        // nesC.g:333:35: ^( UNARY_PLUS cast_expression )
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
                    // nesC.g:334:10: '-' cast_expression
                    {
                    char_literal37=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression3272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal37);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3275);
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
                    // 334:32: -> ^( UNARY_MINUS cast_expression )
                    {
                        // nesC.g:334:35: ^( UNARY_MINUS cast_expression )
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
                    // nesC.g:335:10: ( '~' ^| '!' ^) cast_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:335:10: ( '~' ^| '!' ^)
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
                            // nesC.g:335:11: '~' ^
                            {
                            char_literal39=(Token)match(input,BITCOMPLEMENT,FOLLOW_BITCOMPLEMENT_in_unary_expression3299); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal39_tree = 
                            (Object)adaptor.create(char_literal39)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal39_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:335:18: '!' ^
                            {
                            char_literal40=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression3304); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal40_tree = 
                            (Object)adaptor.create(char_literal40)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal40_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3308);
                    cast_expression41=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression41.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:336:10: SIZEOF '(' type_name ')'
                    {
                    SIZEOF42=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF42);


                    char_literal43=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_unary_expression3321); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal43);


                    pushFollow(FOLLOW_type_name_in_unary_expression3323);
                    type_name44=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name44.getTree());

                    char_literal45=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_unary_expression3325); if (state.failed) return retval; 
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
                    // 336:35: -> ^( SIZEOF_TYPE type_name )
                    {
                        // nesC.g:336:38: ^( SIZEOF_TYPE type_name )
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
                    // nesC.g:337:10: SIZEOF unary_expression
                    {
                    SIZEOF46=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF46);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3346);
                    unary_expression47=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression47.getTree());

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
                    // 337:35: -> ^( SIZEOF_EXPRESSION unary_expression )
                    {
                        // nesC.g:337:38: ^( SIZEOF_EXPRESSION unary_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SIZEOF_EXPRESSION, "SIZEOF_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_unary_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    // nesC.g:338:10: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression3366);
                    postfix_expression48=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression48.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 6, unary_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unary_expression"


    public static class cast_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cast_expression"
    // nesC.g:344:1: cast_expression : ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression );
    public final nesCParser.cast_expression_return cast_expression() throws RecognitionException {
        nesCParser.cast_expression_return retval = new nesCParser.cast_expression_return();
        retval.start = input.LT(1);

        int cast_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal49=null;
        Token char_literal51=null;
        nesCParser.type_name_return type_name50 =null;

        nesCParser.cast_expression_return cast_expression52 =null;

        nesCParser.unary_expression_return unary_expression53 =null;


        Object char_literal49_tree=null;
        Object char_literal51_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // nesC.g:345:5: ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LPARENS) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred26_nesC()) ) {
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
                    // nesC.g:345:10: '(' type_name ')' cast_expression
                    {
                    char_literal49=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_cast_expression3389); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal49);


                    pushFollow(FOLLOW_type_name_in_cast_expression3391);
                    type_name50=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name50.getTree());

                    char_literal51=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_cast_expression3393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal51);


                    pushFollow(FOLLOW_cast_expression_in_cast_expression3395);
                    cast_expression52=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression52.getTree());

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
                    // 345:44: -> ^( CAST cast_expression type_name )
                    {
                        // nesC.g:345:47: ^( CAST cast_expression type_name )
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
                    // nesC.g:346:10: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression3416);
                    unary_expression53=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression53.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 7, cast_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cast_expression"


    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicative_expression"
    // nesC.g:348:1: multiplicative_expression : cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* ;
    public final nesCParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        nesCParser.multiplicative_expression_return retval = new nesCParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        int multiplicative_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        nesCParser.cast_expression_return cast_expression54 =null;

        nesCParser.cast_expression_return cast_expression58 =null;


        Object char_literal55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // nesC.g:349:5: ( cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* )
            // nesC.g:349:10: cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3435);
            cast_expression54=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression54.getTree());

            // nesC.g:349:26: ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DIVIDE||LA11_0==MODULUS||LA11_0==STAR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // nesC.g:349:28: ( '*' ^| '/' ^| '%' ^) cast_expression
            	    {
            	    // nesC.g:349:28: ( '*' ^| '/' ^| '%' ^)
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
            	            // nesC.g:349:29: '*' ^
            	            {
            	            char_literal55=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression3440); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal55_tree = 
            	            (Object)adaptor.create(char_literal55)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal55_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:349:36: '/' ^
            	            {
            	            char_literal56=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expression3445); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal56_tree = 
            	            (Object)adaptor.create(char_literal56)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal56_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:349:43: '%' ^
            	            {
            	            char_literal57=(Token)match(input,MODULUS,FOLLOW_MODULUS_in_multiplicative_expression3450); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal57_tree = 
            	            (Object)adaptor.create(char_literal57)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal57_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3454);
            	    cast_expression58=cast_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression58.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, multiplicative_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"


    public static class additive_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additive_expression"
    // nesC.g:351:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
    public final nesCParser.additive_expression_return additive_expression() throws RecognitionException {
        nesCParser.additive_expression_return retval = new nesCParser.additive_expression_return();
        retval.start = input.LT(1);

        int additive_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal60=null;
        Token char_literal61=null;
        nesCParser.multiplicative_expression_return multiplicative_expression59 =null;

        nesCParser.multiplicative_expression_return multiplicative_expression62 =null;


        Object char_literal60_tree=null;
        Object char_literal61_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // nesC.g:352:5: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
            // nesC.g:352:10: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3475);
            multiplicative_expression59=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression59.getTree());

            // nesC.g:352:36: ( ( '+' ^| '-' ^) multiplicative_expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // nesC.g:352:38: ( '+' ^| '-' ^) multiplicative_expression
            	    {
            	    // nesC.g:352:38: ( '+' ^| '-' ^)
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
            	            // nesC.g:352:39: '+' ^
            	            {
            	            char_literal60=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression3480); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal60_tree = 
            	            (Object)adaptor.create(char_literal60)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:352:46: '-' ^
            	            {
            	            char_literal61=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression3485); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal61_tree = 
            	            (Object)adaptor.create(char_literal61)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal61_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3489);
            	    multiplicative_expression62=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression62.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, additive_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "additive_expression"


    public static class shift_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shift_expression"
    // nesC.g:354:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
    public final nesCParser.shift_expression_return shift_expression() throws RecognitionException {
        nesCParser.shift_expression_return retval = new nesCParser.shift_expression_return();
        retval.start = input.LT(1);

        int shift_expression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal64=null;
        Token string_literal65=null;
        nesCParser.additive_expression_return additive_expression63 =null;

        nesCParser.additive_expression_return additive_expression66 =null;


        Object string_literal64_tree=null;
        Object string_literal65_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // nesC.g:355:5: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // nesC.g:355:10: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression3510);
            additive_expression63=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression63.getTree());

            // nesC.g:355:30: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LSHIFT||LA15_0==RSHIFT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // nesC.g:355:32: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // nesC.g:355:32: ( '<<' ^| '>>' ^)
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
            	            // nesC.g:355:33: '<<' ^
            	            {
            	            string_literal64=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression3515); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal64_tree = 
            	            (Object)adaptor.create(string_literal64)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:355:41: '>>' ^
            	            {
            	            string_literal65=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression3520); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal65_tree = 
            	            (Object)adaptor.create(string_literal65)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal65_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression3524);
            	    additive_expression66=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression66.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, shift_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "shift_expression"


    public static class relational_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // nesC.g:357:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
    public final nesCParser.relational_expression_return relational_expression() throws RecognitionException {
        nesCParser.relational_expression_return retval = new nesCParser.relational_expression_return();
        retval.start = input.LT(1);

        int relational_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal68=null;
        Token char_literal69=null;
        Token string_literal70=null;
        Token string_literal71=null;
        nesCParser.shift_expression_return shift_expression67 =null;

        nesCParser.shift_expression_return shift_expression72 =null;


        Object char_literal68_tree=null;
        Object char_literal69_tree=null;
        Object string_literal70_tree=null;
        Object string_literal71_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // nesC.g:358:5: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // nesC.g:358:10: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression3545);
            shift_expression67=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression67.getTree());

            // nesC.g:358:27: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= GREATER && LA17_0 <= GREATEREQUAL)||(LA17_0 >= LESS && LA17_0 <= LESSEQUAL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // nesC.g:358:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // nesC.g:358:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
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
            	            // nesC.g:358:30: '<' ^
            	            {
            	            char_literal68=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression3550); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal68_tree = 
            	            (Object)adaptor.create(char_literal68)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal68_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:358:37: '>' ^
            	            {
            	            char_literal69=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression3555); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal69_tree = 
            	            (Object)adaptor.create(char_literal69)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal69_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:358:44: '<=' ^
            	            {
            	            string_literal70=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relational_expression3560); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal70_tree = 
            	            (Object)adaptor.create(string_literal70)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal70_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // nesC.g:358:52: '>=' ^
            	            {
            	            string_literal71=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relational_expression3565); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal71_tree = 
            	            (Object)adaptor.create(string_literal71)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal71_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression3569);
            	    shift_expression72=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression72.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, relational_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relational_expression"


    public static class equality_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_expression"
    // nesC.g:360:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
    public final nesCParser.equality_expression_return equality_expression() throws RecognitionException {
        nesCParser.equality_expression_return retval = new nesCParser.equality_expression_return();
        retval.start = input.LT(1);

        int equality_expression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal74=null;
        Token string_literal75=null;
        nesCParser.relational_expression_return relational_expression73 =null;

        nesCParser.relational_expression_return relational_expression76 =null;


        Object string_literal74_tree=null;
        Object string_literal75_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // nesC.g:361:5: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // nesC.g:361:10: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression3590);
            relational_expression73=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression73.getTree());

            // nesC.g:361:32: ( ( '==' ^| '!=' ^) relational_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EQUAL||LA19_0==NOTEQUAL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // nesC.g:361:34: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // nesC.g:361:34: ( '==' ^| '!=' ^)
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
            	            // nesC.g:361:35: '==' ^
            	            {
            	            string_literal74=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equality_expression3595); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal74_tree = 
            	            (Object)adaptor.create(string_literal74)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:361:43: '!=' ^
            	            {
            	            string_literal75=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equality_expression3600); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal75_tree = 
            	            (Object)adaptor.create(string_literal75)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal75_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression3604);
            	    relational_expression76=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression76.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 12, equality_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equality_expression"


    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expression"
    // nesC.g:363:1: and_expression : equality_expression ( '&' ^ equality_expression )* ;
    public final nesCParser.and_expression_return and_expression() throws RecognitionException {
        nesCParser.and_expression_return retval = new nesCParser.and_expression_return();
        retval.start = input.LT(1);

        int and_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal78=null;
        nesCParser.equality_expression_return equality_expression77 =null;

        nesCParser.equality_expression_return equality_expression79 =null;


        Object char_literal78_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // nesC.g:364:5: ( equality_expression ( '&' ^ equality_expression )* )
            // nesC.g:364:10: equality_expression ( '&' ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_and_expression3625);
            equality_expression77=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression77.getTree());

            // nesC.g:364:30: ( '&' ^ equality_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AMP) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // nesC.g:364:32: '&' ^ equality_expression
            	    {
            	    char_literal78=(Token)match(input,AMP,FOLLOW_AMP_in_and_expression3629); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal78_tree = 
            	    (Object)adaptor.create(char_literal78)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal78_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_and_expression3632);
            	    equality_expression79=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression79.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 13, and_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "and_expression"


    public static class xor_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xor_expression"
    // nesC.g:366:1: xor_expression : and_expression ( '^' ^ and_expression )* ;
    public final nesCParser.xor_expression_return xor_expression() throws RecognitionException {
        nesCParser.xor_expression_return retval = new nesCParser.xor_expression_return();
        retval.start = input.LT(1);

        int xor_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal81=null;
        nesCParser.and_expression_return and_expression80 =null;

        nesCParser.and_expression_return and_expression82 =null;


        Object char_literal81_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // nesC.g:367:5: ( and_expression ( '^' ^ and_expression )* )
            // nesC.g:367:10: and_expression ( '^' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_xor_expression3653);
            and_expression80=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression80.getTree());

            // nesC.g:367:25: ( '^' ^ and_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==BITXOR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // nesC.g:367:27: '^' ^ and_expression
            	    {
            	    char_literal81=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_xor_expression3657); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal81_tree = 
            	    (Object)adaptor.create(char_literal81)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal81_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_xor_expression3660);
            	    and_expression82=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression82.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 14, xor_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "xor_expression"


    public static class or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_expression"
    // nesC.g:369:1: or_expression : xor_expression ( '|' ^ xor_expression )* ;
    public final nesCParser.or_expression_return or_expression() throws RecognitionException {
        nesCParser.or_expression_return retval = new nesCParser.or_expression_return();
        retval.start = input.LT(1);

        int or_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal84=null;
        nesCParser.xor_expression_return xor_expression83 =null;

        nesCParser.xor_expression_return xor_expression85 =null;


        Object char_literal84_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // nesC.g:370:5: ( xor_expression ( '|' ^ xor_expression )* )
            // nesC.g:370:10: xor_expression ( '|' ^ xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expression_in_or_expression3681);
            xor_expression83=xor_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression83.getTree());

            // nesC.g:370:25: ( '|' ^ xor_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BITOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // nesC.g:370:27: '|' ^ xor_expression
            	    {
            	    char_literal84=(Token)match(input,BITOR,FOLLOW_BITOR_in_or_expression3685); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal84_tree = 
            	    (Object)adaptor.create(char_literal84)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal84_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_xor_expression_in_or_expression3688);
            	    xor_expression85=xor_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression85.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 15, or_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "or_expression"


    public static class logical_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_and_expression"
    // nesC.g:372:1: logical_and_expression : or_expression ( '&&' ^ or_expression )* ;
    public final nesCParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        nesCParser.logical_and_expression_return retval = new nesCParser.logical_and_expression_return();
        retval.start = input.LT(1);

        int logical_and_expression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal87=null;
        nesCParser.or_expression_return or_expression86 =null;

        nesCParser.or_expression_return or_expression88 =null;


        Object string_literal87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // nesC.g:373:5: ( or_expression ( '&&' ^ or_expression )* )
            // nesC.g:373:10: or_expression ( '&&' ^ or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_expression_in_logical_and_expression3709);
            or_expression86=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression86.getTree());

            // nesC.g:373:24: ( '&&' ^ or_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // nesC.g:373:26: '&&' ^ or_expression
            	    {
            	    string_literal87=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression3713); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal87_tree = 
            	    (Object)adaptor.create(string_literal87)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal87_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression3716);
            	    or_expression88=or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression88.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 16, logical_and_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"


    public static class logical_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_or_expression"
    // nesC.g:375:1: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
    public final nesCParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        nesCParser.logical_or_expression_return retval = new nesCParser.logical_or_expression_return();
        retval.start = input.LT(1);

        int logical_or_expression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal90=null;
        nesCParser.logical_and_expression_return logical_and_expression89 =null;

        nesCParser.logical_and_expression_return logical_and_expression91 =null;


        Object string_literal90_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // nesC.g:376:5: ( logical_and_expression ( '||' ^ logical_and_expression )* )
            // nesC.g:376:10: logical_and_expression ( '||' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3737);
            logical_and_expression89=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression89.getTree());

            // nesC.g:376:33: ( '||' ^ logical_and_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // nesC.g:376:35: '||' ^ logical_and_expression
            	    {
            	    string_literal90=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression3741); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal90_tree = 
            	    (Object)adaptor.create(string_literal90)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal90_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3744);
            	    logical_and_expression91=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression91.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 17, logical_or_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logical_or_expression"


    public static class conditional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional_expression"
    // nesC.g:378:1: conditional_expression : logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? ;
    public final nesCParser.conditional_expression_return conditional_expression() throws RecognitionException {
        nesCParser.conditional_expression_return retval = new nesCParser.conditional_expression_return();
        retval.start = input.LT(1);

        int conditional_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal93=null;
        Token char_literal95=null;
        nesCParser.logical_or_expression_return logical_or_expression92 =null;

        nesCParser.expression_return expression94 =null;

        nesCParser.conditional_expression_return conditional_expression96 =null;


        Object char_literal93_tree=null;
        Object char_literal95_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // nesC.g:379:5: ( logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? )
            // nesC.g:379:10: logical_or_expression ( '?' ^ expression ':' ! conditional_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression3765);
            logical_or_expression92=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression92.getTree());

            // nesC.g:379:32: ( '?' ^ expression ':' ! conditional_expression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==192) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // nesC.g:379:33: '?' ^ expression ':' ! conditional_expression
                    {
                    char_literal93=(Token)match(input,192,FOLLOW_192_in_conditional_expression3768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal93_tree = 
                    (Object)adaptor.create(char_literal93)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal93_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_conditional_expression3771);
                    expression94=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression94.getTree());

                    char_literal95=(Token)match(input,189,FOLLOW_189_in_conditional_expression3773); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression3776);
                    conditional_expression96=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression96.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 18, conditional_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditional_expression"


    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_expression"
    // nesC.g:381:1: assignment_expression : ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression );
    public final nesCParser.assignment_expression_return assignment_expression() throws RecognitionException {
        nesCParser.assignment_expression_return retval = new nesCParser.assignment_expression_return();
        retval.start = input.LT(1);

        int assignment_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal98=null;
        Token string_literal99=null;
        Token string_literal100=null;
        Token string_literal101=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token string_literal105=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token string_literal108=null;
        nesCParser.unary_expression_return unary_expression97 =null;

        nesCParser.assignment_expression_return assignment_expression109 =null;

        nesCParser.conditional_expression_return conditional_expression110 =null;


        Object char_literal98_tree=null;
        Object string_literal99_tree=null;
        Object string_literal100_tree=null;
        Object string_literal101_tree=null;
        Object string_literal102_tree=null;
        Object string_literal103_tree=null;
        Object string_literal104_tree=null;
        Object string_literal105_tree=null;
        Object string_literal106_tree=null;
        Object string_literal107_tree=null;
        Object string_literal108_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // nesC.g:382:5: ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression )
            int alt27=2;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA27_1 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }
                }
                break;
            case MINUSMINUS:
                {
                int LA27_2 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;

                }
                }
                break;
            case AMP:
                {
                int LA27_3 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;

                }
                }
                break;
            case STAR:
                {
                int LA27_4 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    throw nvae;

                }
                }
                break;
            case PLUS:
                {
                int LA27_5 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 5, input);

                    throw nvae;

                }
                }
                break;
            case MINUS:
                {
                int LA27_6 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 6, input);

                    throw nvae;

                }
                }
                break;
            case BITCOMPLEMENT:
                {
                int LA27_7 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 7, input);

                    throw nvae;

                }
                }
                break;
            case NOT:
                {
                int LA27_8 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 8, input);

                    throw nvae;

                }
                }
                break;
            case SIZEOF:
                {
                int LA27_9 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 9, input);

                    throw nvae;

                }
                }
                break;
            case CALL:
            case POST:
            case SIGNAL:
                {
                int LA27_10 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 10, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA27_11 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 11, input);

                    throw nvae;

                }
                }
                break;
            case CONSTANT:
                {
                int LA27_12 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 12, input);

                    throw nvae;

                }
                }
                break;
            case STRING_LITERAL:
                {
                int LA27_13 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 13, input);

                    throw nvae;

                }
                }
                break;
            case CHARACTER_LITERAL:
                {
                int LA27_14 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 14, input);

                    throw nvae;

                }
                }
                break;
            case LPARENS:
                {
                int LA27_15 = input.LA(2);

                if ( (synpred56_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 15, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // nesC.g:382:10: unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_assignment_expression3797);
                    unary_expression97=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression97.getTree());

                    // nesC.g:382:27: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^)
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
                            // nesC.g:382:28: '=' ^
                            {
                            char_literal98=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expression3800); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal98_tree = 
                            (Object)adaptor.create(char_literal98)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal98_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:382:35: '*=' ^
                            {
                            string_literal99=(Token)match(input,MULASSIGN,FOLLOW_MULASSIGN_in_assignment_expression3805); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal99_tree = 
                            (Object)adaptor.create(string_literal99)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal99_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // nesC.g:382:43: '/=' ^
                            {
                            string_literal100=(Token)match(input,DIVASSIGN,FOLLOW_DIVASSIGN_in_assignment_expression3810); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal100_tree = 
                            (Object)adaptor.create(string_literal100)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal100_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // nesC.g:382:51: '%=' ^
                            {
                            string_literal101=(Token)match(input,MODASSIGN,FOLLOW_MODASSIGN_in_assignment_expression3815); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal101_tree = 
                            (Object)adaptor.create(string_literal101)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // nesC.g:382:59: '+=' ^
                            {
                            string_literal102=(Token)match(input,PLUSASSIGN,FOLLOW_PLUSASSIGN_in_assignment_expression3820); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal102_tree = 
                            (Object)adaptor.create(string_literal102)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal102_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // nesC.g:382:67: '-=' ^
                            {
                            string_literal103=(Token)match(input,MINUSASSIGN,FOLLOW_MINUSASSIGN_in_assignment_expression3825); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal103_tree = 
                            (Object)adaptor.create(string_literal103)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
                            }

                            }
                            break;
                        case 7 :
                            // nesC.g:382:75: '<<=' ^
                            {
                            string_literal104=(Token)match(input,LSHIFTASSIGN,FOLLOW_LSHIFTASSIGN_in_assignment_expression3830); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal104_tree = 
                            (Object)adaptor.create(string_literal104)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal104_tree, root_0);
                            }

                            }
                            break;
                        case 8 :
                            // nesC.g:382:84: '>>=' ^
                            {
                            string_literal105=(Token)match(input,RSHIFTASSIGN,FOLLOW_RSHIFTASSIGN_in_assignment_expression3835); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal105_tree = 
                            (Object)adaptor.create(string_literal105)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal105_tree, root_0);
                            }

                            }
                            break;
                        case 9 :
                            // nesC.g:382:93: '&=' ^
                            {
                            string_literal106=(Token)match(input,BITANDASSIGN,FOLLOW_BITANDASSIGN_in_assignment_expression3840); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal106_tree = 
                            (Object)adaptor.create(string_literal106)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                            }

                            }
                            break;
                        case 10 :
                            // nesC.g:382:101: '^=' ^
                            {
                            string_literal107=(Token)match(input,BITXORASSIGN,FOLLOW_BITXORASSIGN_in_assignment_expression3845); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal107_tree = 
                            (Object)adaptor.create(string_literal107)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal107_tree, root_0);
                            }

                            }
                            break;
                        case 11 :
                            // nesC.g:382:109: '|=' ^
                            {
                            string_literal108=(Token)match(input,BITORASSIGN,FOLLOW_BITORASSIGN_in_assignment_expression3850); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal108_tree = 
                            (Object)adaptor.create(string_literal108)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal108_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression3854);
                    assignment_expression109=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression109.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:383:10: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression3865);
                    conditional_expression110=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression110.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 19, assignment_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignment_expression"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // nesC.g:385:1: expression : assignment_expression ( ',' ^ assignment_expression )* ;
    public final nesCParser.expression_return expression() throws RecognitionException {
        nesCParser.expression_return retval = new nesCParser.expression_return();
        retval.start = input.LT(1);

        int expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal112=null;
        nesCParser.assignment_expression_return assignment_expression111 =null;

        nesCParser.assignment_expression_return assignment_expression113 =null;


        Object char_literal112_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // nesC.g:386:5: ( assignment_expression ( ',' ^ assignment_expression )* )
            // nesC.g:386:10: assignment_expression ( ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression3884);
            assignment_expression111=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression111.getTree());

            // nesC.g:386:32: ( ',' ^ assignment_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==COMMA) ) {
                    int LA28_5 = input.LA(2);

                    if ( (synpred57_nesC()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // nesC.g:386:33: ',' ^ assignment_expression
            	    {
            	    char_literal112=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression3887); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal112_tree = 
            	    (Object)adaptor.create(char_literal112)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal112_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression3890);
            	    assignment_expression113=assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression113.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 20, expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class constant_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_expression"
    // nesC.g:388:1: constant_expression : conditional_expression ;
    public final nesCParser.constant_expression_return constant_expression() throws RecognitionException {
        nesCParser.constant_expression_return retval = new nesCParser.constant_expression_return();
        retval.start = input.LT(1);

        int constant_expression_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.conditional_expression_return conditional_expression114 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // nesC.g:389:5: ( conditional_expression )
            // nesC.g:389:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression3911);
            conditional_expression114=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression114.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 21, constant_expression_StartIndex); }

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
    // nesC.g:408:1: declaration : ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers ( init_declarator_list )? ) );
    public final nesCParser.declaration_return declaration() throws RecognitionException {
        declaration_stack.push(new declaration_scope());
        nesCParser.declaration_return retval = new nesCParser.declaration_return();
        retval.start = input.LT(1);

        int declaration_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal118=null;
        Token TYPEDEF120=null;
        Token char_literal125=null;
        nesCParser.declaration_specifiers_return declaration_specifiers115 =null;

        nesCParser.gcc_attributes_return gcc_attributes116 =null;

        nesCParser.init_declarator_list_return init_declarator_list117 =null;

        nesCParser.function_definition_return function_definition119 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers121 =null;

        nesCParser.gcc_attributes_return gcc_attributes122 =null;

        nesCParser.init_declarator_list_return init_declarator_list123 =null;

        nesCParser.gcc_attributes_return gcc_attributes124 =null;


        Object char_literal118_tree=null;
        Object TYPEDEF120_tree=null;
        Object char_literal125_tree=null;
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        RewriteRuleSubtreeStream stream_gcc_attributes=new RewriteRuleSubtreeStream(adaptor,"rule gcc_attributes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // nesC.g:411:5: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers ( init_declarator_list )? ) )
            int alt34=3;
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
                int LA34_1 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA34_2 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA34_3 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA34_4 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA34_5 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA34_6 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA34_7 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA34_8 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA34_9 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 9, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA34_10 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA34_11 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 11, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA34_12 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 12, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA34_13 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 13, input);

                    throw nvae;

                }
                }
                break;
            case INT64_T:
                {
                int LA34_14 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 14, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA34_15 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 15, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA34_16 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 16, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA34_17 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 17, input);

                    throw nvae;

                }
                }
                break;
            case UINT64_T:
                {
                int LA34_18 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 18, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA34_19 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 19, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA34_20 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 20, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA34_21 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 21, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT64_T:
                {
                int LA34_22 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 22, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT8_T:
                {
                int LA34_23 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 23, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT16_T:
                {
                int LA34_24 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 24, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT32_T:
                {
                int LA34_25 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 25, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA34_26 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 26, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA34_27 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 27, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA34_28 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 28, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA34_29 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 29, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA34_30 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 30, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA34_31 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 31, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA34_32 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 32, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA34_33 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt34=1;
                }
                else if ( (synpred61_nesC()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 33, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // nesC.g:411:10: declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3975);
                    declaration_specifiers115=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers115.getTree());

                    // nesC.g:415:33: ( gcc_attributes )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==GCCATTRIBUTE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // nesC.g:415:33: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration3977);
                            gcc_attributes116=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes116.getTree());

                            }
                            break;

                    }


                    // nesC.g:415:49: ( init_declarator_list )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPARENS||LA30_0==RAW_IDENTIFIER||LA30_0==STAR) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // nesC.g:415:49: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration3980);
                            init_declarator_list117=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list117.getTree());

                            }
                            break;

                    }


                    char_literal118=(Token)match(input,190,FOLLOW_190_in_declaration3983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal118);


                    if ( state.backtracking==0 ) {
                                   // Inefficient, but how many declarators will be in a declaration, honestly?
                                   for (int i = 0; i < ((declaration_scope)declaration_stack.peek()).declaredNames.size(); ++i) {
                                       symbols.addIdentifier(((declaration_scope)declaration_stack.peek()).declaredNames.get(i));
                                   }
                                 }

                    // AST REWRITE
                    // elements: declaration_specifiers, init_declarator_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 422:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // nesC.g:422:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:422:54: ( init_declarator_list )?
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
                    // nesC.g:424:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration4045);
                    function_definition119=function_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_definition.add(function_definition119.getTree());

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
                    // 427:30: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // nesC.g:427:33: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // nesC.g:427:47: ^( FUNCTION_DEFINITION function_definition )
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
                    // nesC.g:430:10: TYPEDEF declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ( gcc_attributes )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF120=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration4110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF120);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4112);
                    declaration_specifiers121=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers121.getTree());

                    // nesC.g:435:41: ( gcc_attributes )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==GCCATTRIBUTE) ) {
                        int LA31_1 = input.LA(2);

                        if ( (synpred62_nesC()) ) {
                            alt31=1;
                        }
                    }
                    switch (alt31) {
                        case 1 :
                            // nesC.g:435:41: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4114);
                            gcc_attributes122=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes122.getTree());

                            }
                            break;

                    }


                    // nesC.g:435:57: ( init_declarator_list )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==LPARENS||LA32_0==RAW_IDENTIFIER||LA32_0==STAR) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // nesC.g:435:57: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration4117);
                            init_declarator_list123=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list123.getTree());

                            }
                            break;

                    }


                    // nesC.g:435:79: ( gcc_attributes )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==GCCATTRIBUTE) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // nesC.g:435:79: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4120);
                            gcc_attributes124=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes124.getTree());

                            }
                            break;

                    }


                    char_literal125=(Token)match(input,190,FOLLOW_190_in_declaration4123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal125);


                    if ( state.backtracking==0 ) {
                                   // Inefficient, but how many declarators will be in a declaration, honestly?
                                   for (int i = 0; i < ((declaration_scope)declaration_stack.peek()).declaredNames.size(); ++i) {
                                       symbols.addType(((declaration_scope)declaration_stack.peek()).declaredNames.get(i));
                                   }
                                 }

                    // AST REWRITE
                    // elements: init_declarator_list, declaration_specifiers, TYPEDEF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 442:14: -> ^( DECLARATION TYPEDEF declaration_specifiers ( init_declarator_list )? )
                    {
                        // nesC.g:442:17: ^( DECLARATION TYPEDEF declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_TYPEDEF.nextNode()
                        );

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:442:62: ( init_declarator_list )?
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
            if ( state.backtracking>0 ) { memoize(input, 22, declaration_StartIndex); }

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
    // nesC.g:444:1: declaration_specifiers : ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+ ;
    public final nesCParser.declaration_specifiers_return declaration_specifiers() throws RecognitionException {
        nesCParser.declaration_specifiers_return retval = new nesCParser.declaration_specifiers_return();
        retval.start = input.LT(1);

        int declaration_specifiers_StartIndex = input.index();

        Object root_0 = null;

        Token DEFAULT130=null;
        nesCParser.storage_class_specifier_return storage_class_specifier126 =null;

        nesCParser.type_specifier_return type_specifier127 =null;

        nesCParser.type_qualifier_return type_qualifier128 =null;

        nesCParser.function_specifier_return function_specifier129 =null;


        Object DEFAULT130_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // nesC.g:445:5: ( ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+ )
            // nesC.g:445:10: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:445:10: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+
            int cnt35=0;
            loop35:
            do {
                int alt35=6;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred66_nesC()) ) {
                        alt35=2;
                    }


                    }
                    break;
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
                case DEFAULT:
                    {
                    alt35=5;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // nesC.g:445:11: storage_class_specifier
            	    {
            	    pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers4184);
            	    storage_class_specifier126=storage_class_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier126.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:446:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_declaration_specifiers4198);
            	    type_specifier127=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier127.getTree());

            	    }
            	    break;
            	case 3 :
            	    // nesC.g:447:11: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers4221);
            	    type_qualifier128=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier128.getTree());

            	    }
            	    break;
            	case 4 :
            	    // nesC.g:448:11: function_specifier
            	    {
            	    pushFollow(FOLLOW_function_specifier_in_declaration_specifiers4244);
            	    function_specifier129=function_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_specifier129.getTree());

            	    }
            	    break;
            	case 5 :
            	    // nesC.g:449:11: DEFAULT
            	    {
            	    DEFAULT130=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_declaration_specifiers4263); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DEFAULT130_tree = 
            	    (Object)adaptor.create(DEFAULT130)
            	    ;
            	    adaptor.addChild(root_0, DEFAULT130_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
            if ( state.backtracking>0 ) { memoize(input, 23, declaration_specifiers_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "declaration_specifiers"


    public static class init_declarator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator_list"
    // nesC.g:455:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
    public final nesCParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
        nesCParser.init_declarator_list_return retval = new nesCParser.init_declarator_list_return();
        retval.start = input.LT(1);

        int init_declarator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal132=null;
        nesCParser.init_declarator_return init_declarator131 =null;

        nesCParser.init_declarator_return init_declarator133 =null;


        Object char_literal132_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // nesC.g:456:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // nesC.g:456:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list4286);
            init_declarator131=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator131.getTree());

            // nesC.g:456:26: ( ',' init_declarator )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COMMA) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // nesC.g:456:27: ',' init_declarator
            	    {
            	    char_literal132=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list4289); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal132);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list4291);
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
            // 456:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // nesC.g:456:52: ^( DECLARATOR_LIST ( init_declarator )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 24, init_declarator_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "init_declarator_list"


    public static class init_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator"
    // nesC.g:462:1: init_declarator : declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
    public final nesCParser.init_declarator_return init_declarator() throws RecognitionException {
        nesCParser.init_declarator_return retval = new nesCParser.init_declarator_return();
        retval.start = input.LT(1);

        int init_declarator_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // nesC.g:463:5: ( declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // nesC.g:463:10: declarator ( attributes )? ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator4325);
            declarator134=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator134.getTree());

            // nesC.g:463:21: ( attributes )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ATTRIBUTE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // nesC.g:463:21: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_init_declarator4327);
                    attributes135=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes135.getTree());

                    }
                    break;

            }


            // nesC.g:463:33: ( '=' initializer )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ASSIGN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // nesC.g:463:34: '=' initializer
                    {
                    char_literal136=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator4331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal136);


                    pushFollow(FOLLOW_initializer_in_init_declarator4333);
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
            // 463:52: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // nesC.g:463:55: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // nesC.g:463:84: ( initializer )?
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
            if ( state.backtracking>0 ) { memoize(input, 25, init_declarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "init_declarator"


    public static class storage_class_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "storage_class_specifier"
    // nesC.g:465:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK );
    public final nesCParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        nesCParser.storage_class_specifier_return retval = new nesCParser.storage_class_specifier_return();
        retval.start = input.LT(1);

        int storage_class_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token set138=null;

        Object set138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // nesC.g:466:5: ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK )
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
            if ( state.backtracking>0 ) { memoize(input, 26, storage_class_specifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "storage_class_specifier"


    public static class type_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // nesC.g:477:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | struct_or_union_specifier | enum_specifier | typedef_name );
    public final nesCParser.type_specifier_return type_specifier() throws RecognitionException {
        nesCParser.type_specifier_return retval = new nesCParser.type_specifier_return();
        retval.start = input.LT(1);

        int type_specifier_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // nesC.g:478:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | struct_or_union_specifier | enum_specifier | typedef_name )
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
                    // nesC.g:478:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID139=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier4482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID139_tree = 
                    (Object)adaptor.create(VOID139)
                    ;
                    adaptor.addChild(root_0, VOID139_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:479:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR140=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier4492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR140_tree = 
                    (Object)adaptor.create(CHAR140)
                    ;
                    adaptor.addChild(root_0, CHAR140_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:480:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT141=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier4502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT141_tree = 
                    (Object)adaptor.create(SHORT141)
                    ;
                    adaptor.addChild(root_0, SHORT141_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:481:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT142=(Token)match(input,INT,FOLLOW_INT_in_type_specifier4512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT142_tree = 
                    (Object)adaptor.create(INT142)
                    ;
                    adaptor.addChild(root_0, INT142_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:482:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG143=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier4522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG143_tree = 
                    (Object)adaptor.create(LONG143)
                    ;
                    adaptor.addChild(root_0, LONG143_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:483:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED144=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier4532); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED144_tree = 
                    (Object)adaptor.create(SIGNED144)
                    ;
                    adaptor.addChild(root_0, SIGNED144_tree);
                    }

                    }
                    break;
                case 7 :
                    // nesC.g:484:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED145=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier4542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED145_tree = 
                    (Object)adaptor.create(UNSIGNED145)
                    ;
                    adaptor.addChild(root_0, UNSIGNED145_tree);
                    }

                    }
                    break;
                case 8 :
                    // nesC.g:485:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT146=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier4552); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT146_tree = 
                    (Object)adaptor.create(FLOAT146)
                    ;
                    adaptor.addChild(root_0, FLOAT146_tree);
                    }

                    }
                    break;
                case 9 :
                    // nesC.g:486:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLE147=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_type_specifier4562); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE147_tree = 
                    (Object)adaptor.create(DOUBLE147)
                    ;
                    adaptor.addChild(root_0, DOUBLE147_tree);
                    }

                    }
                    break;
                case 10 :
                    // nesC.g:488:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T148=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier4573); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T148_tree = 
                    (Object)adaptor.create(INT8_T148)
                    ;
                    adaptor.addChild(root_0, INT8_T148_tree);
                    }

                    }
                    break;
                case 11 :
                    // nesC.g:489:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T149=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier4583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T149_tree = 
                    (Object)adaptor.create(INT16_T149)
                    ;
                    adaptor.addChild(root_0, INT16_T149_tree);
                    }

                    }
                    break;
                case 12 :
                    // nesC.g:490:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T150=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier4593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T150_tree = 
                    (Object)adaptor.create(INT32_T150)
                    ;
                    adaptor.addChild(root_0, INT32_T150_tree);
                    }

                    }
                    break;
                case 13 :
                    // nesC.g:491:9: INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT64_T151=(Token)match(input,INT64_T,FOLLOW_INT64_T_in_type_specifier4603); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT64_T151_tree = 
                    (Object)adaptor.create(INT64_T151)
                    ;
                    adaptor.addChild(root_0, INT64_T151_tree);
                    }

                    }
                    break;
                case 14 :
                    // nesC.g:492:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T152=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier4613); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T152_tree = 
                    (Object)adaptor.create(UINT8_T152)
                    ;
                    adaptor.addChild(root_0, UINT8_T152_tree);
                    }

                    }
                    break;
                case 15 :
                    // nesC.g:493:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T153=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier4623); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T153_tree = 
                    (Object)adaptor.create(UINT16_T153)
                    ;
                    adaptor.addChild(root_0, UINT16_T153_tree);
                    }

                    }
                    break;
                case 16 :
                    // nesC.g:494:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T154=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier4633); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T154_tree = 
                    (Object)adaptor.create(UINT32_T154)
                    ;
                    adaptor.addChild(root_0, UINT32_T154_tree);
                    }

                    }
                    break;
                case 17 :
                    // nesC.g:495:9: UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT64_T155=(Token)match(input,UINT64_T,FOLLOW_UINT64_T_in_type_specifier4643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT64_T155_tree = 
                    (Object)adaptor.create(UINT64_T155)
                    ;
                    adaptor.addChild(root_0, UINT64_T155_tree);
                    }

                    }
                    break;
                case 18 :
                    // nesC.g:497:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T156=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier4654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T156_tree = 
                    (Object)adaptor.create(NX_UINT8_T156)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T156_tree);
                    }

                    }
                    break;
                case 19 :
                    // nesC.g:498:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T157=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier4664); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T157_tree = 
                    (Object)adaptor.create(NX_UINT16_T157)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T157_tree);
                    }

                    }
                    break;
                case 20 :
                    // nesC.g:499:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T158=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier4674); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T158_tree = 
                    (Object)adaptor.create(NX_UINT32_T158)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T158_tree);
                    }

                    }
                    break;
                case 21 :
                    // nesC.g:500:9: NX_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT64_T159=(Token)match(input,NX_UINT64_T,FOLLOW_NX_UINT64_T_in_type_specifier4684); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT64_T159_tree = 
                    (Object)adaptor.create(NX_UINT64_T159)
                    ;
                    adaptor.addChild(root_0, NX_UINT64_T159_tree);
                    }

                    }
                    break;
                case 22 :
                    // nesC.g:501:9: NXLE_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT8_T160=(Token)match(input,NXLE_UINT8_T,FOLLOW_NXLE_UINT8_T_in_type_specifier4694); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT8_T160_tree = 
                    (Object)adaptor.create(NXLE_UINT8_T160)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT8_T160_tree);
                    }

                    }
                    break;
                case 23 :
                    // nesC.g:502:9: NXLE_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT16_T161=(Token)match(input,NXLE_UINT16_T,FOLLOW_NXLE_UINT16_T_in_type_specifier4704); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT16_T161_tree = 
                    (Object)adaptor.create(NXLE_UINT16_T161)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT16_T161_tree);
                    }

                    }
                    break;
                case 24 :
                    // nesC.g:503:9: NXLE_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT32_T162=(Token)match(input,NXLE_UINT32_T,FOLLOW_NXLE_UINT32_T_in_type_specifier4714); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT32_T162_tree = 
                    (Object)adaptor.create(NXLE_UINT32_T162)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT32_T162_tree);
                    }

                    }
                    break;
                case 25 :
                    // nesC.g:504:9: NXLE_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT64_T163=(Token)match(input,NXLE_UINT64_T,FOLLOW_NXLE_UINT64_T_in_type_specifier4724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT64_T163_tree = 
                    (Object)adaptor.create(NXLE_UINT64_T163)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT64_T163_tree);
                    }

                    }
                    break;
                case 26 :
                    // nesC.g:506:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier4735);
                    struct_or_union_specifier164=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier164.getTree());

                    }
                    break;
                case 27 :
                    // nesC.g:507:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier4745);
                    enum_specifier165=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier165.getTree());

                    }
                    break;
                case 28 :
                    // nesC.g:508:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier4755);
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
            if ( state.backtracking>0 ) { memoize(input, 27, type_specifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_specifier"


    public static class struct_or_union_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_or_union_specifier"
    // nesC.g:510:1: struct_or_union_specifier : ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) | STRUCT '@' identifier '{' struct_declaration_list '}' -> ^( STRUCT identifier struct_declaration_list ) | struct_or_union identifier attributes '{' struct_declaration_list '}' -> ^( struct_or_union identifier struct_declaration_list ) );
    public final nesCParser.struct_or_union_specifier_return struct_or_union_specifier() throws RecognitionException {
        nesCParser.struct_or_union_specifier_return retval = new nesCParser.struct_or_union_specifier_return();
        retval.start = input.LT(1);

        int struct_or_union_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal169=null;
        Token char_literal171=null;
        Token STRUCT174=null;
        Token char_literal175=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal183=null;
        Token char_literal185=null;
        nesCParser.struct_or_union_return struct_or_union167 =null;

        nesCParser.identifier_return identifier168 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list170 =null;

        nesCParser.struct_or_union_return struct_or_union172 =null;

        nesCParser.identifier_return identifier173 =null;

        nesCParser.identifier_return identifier176 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list178 =null;

        nesCParser.struct_or_union_return struct_or_union180 =null;

        nesCParser.identifier_return identifier181 =null;

        nesCParser.attributes_return attributes182 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list184 =null;


        Object char_literal169_tree=null;
        Object char_literal171_tree=null;
        Object STRUCT174_tree=null;
        Object char_literal175_tree=null;
        Object char_literal177_tree=null;
        Object char_literal179_tree=null;
        Object char_literal183_tree=null;
        Object char_literal185_tree=null;
        RewriteRuleTokenStream stream_STRUCT=new RewriteRuleTokenStream(adaptor,"token STRUCT");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleTokenStream stream_ATTRIBUTE=new RewriteRuleTokenStream(adaptor,"token ATTRIBUTE");
        RewriteRuleSubtreeStream stream_struct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declaration_list");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // nesC.g:511:5: ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) | STRUCT '@' identifier '{' struct_declaration_list '}' -> ^( STRUCT identifier struct_declaration_list ) | struct_or_union identifier attributes '{' struct_declaration_list '}' -> ^( struct_or_union identifier struct_declaration_list ) )
            int alt41=4;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==STRUCT) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred110_nesC()) ) {
                    alt41=1;
                }
                else if ( (synpred111_nesC()) ) {
                    alt41=2;
                }
                else if ( (synpred112_nesC()) ) {
                    alt41=3;
                }
                else if ( (true) ) {
                    alt41=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA41_0==NX_STRUCT||LA41_0==NX_UNION||LA41_0==UNION) ) {
                int LA41_2 = input.LA(2);

                if ( (synpred110_nesC()) ) {
                    alt41=1;
                }
                else if ( (synpred111_nesC()) ) {
                    alt41=2;
                }
                else if ( (true) ) {
                    alt41=4;
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
                    // nesC.g:511:10: struct_or_union ( identifier )? '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4770);
                    struct_or_union167=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union167.getTree());

                    // nesC.g:511:26: ( identifier )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RAW_IDENTIFIER) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // nesC.g:511:26: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4772);
                            identifier168=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier168.getTree());

                            }
                            break;

                    }


                    char_literal169=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal169);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4777);
                    struct_declaration_list170=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list170.getTree());

                    char_literal171=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal171);


                    // AST REWRITE
                    // elements: struct_or_union, struct_declaration_list, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 512:13: -> ^( struct_or_union ( identifier )? struct_declaration_list )
                    {
                        // nesC.g:512:16: ^( struct_or_union ( identifier )? struct_declaration_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        // nesC.g:512:34: ( identifier )?
                        if ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_1, stream_struct_declaration_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:513:10: struct_or_union identifier
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4813);
                    struct_or_union172=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union172.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4815);
                    identifier173=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier173.getTree());

                    // AST REWRITE
                    // elements: identifier, struct_or_union
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 514:13: -> ^( struct_or_union identifier )
                    {
                        // nesC.g:514:16: ^( struct_or_union identifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:515:10: STRUCT '@' identifier '{' struct_declaration_list '}'
                    {
                    STRUCT174=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_struct_or_union_specifier4846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRUCT.add(STRUCT174);


                    char_literal175=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_struct_or_union_specifier4848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATTRIBUTE.add(char_literal175);


                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4850);
                    identifier176=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier176.getTree());

                    char_literal177=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal177);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4854);
                    struct_declaration_list178=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list178.getTree());

                    char_literal179=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal179);


                    // AST REWRITE
                    // elements: STRUCT, struct_declaration_list, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 516:13: -> ^( STRUCT identifier struct_declaration_list )
                    {
                        // nesC.g:516:16: ^( STRUCT identifier struct_declaration_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STRUCT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_1, stream_struct_declaration_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:517:10: struct_or_union identifier attributes '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4889);
                    struct_or_union180=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union180.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4891);
                    identifier181=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier181.getTree());

                    pushFollow(FOLLOW_attributes_in_struct_or_union_specifier4893);
                    attributes182=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes182.getTree());

                    char_literal183=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal183);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4897);
                    struct_declaration_list184=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list184.getTree());

                    char_literal185=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4899); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal185);


                    // AST REWRITE
                    // elements: struct_declaration_list, identifier, struct_or_union
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 518:13: -> ^( struct_or_union identifier struct_declaration_list )
                    {
                        // nesC.g:518:16: ^( struct_or_union identifier struct_declaration_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 28, struct_or_union_specifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_or_union_specifier"


    public static class struct_or_union_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_or_union"
    // nesC.g:520:1: struct_or_union : ( STRUCT | UNION | NX_STRUCT | NX_UNION );
    public final nesCParser.struct_or_union_return struct_or_union() throws RecognitionException {
        nesCParser.struct_or_union_return retval = new nesCParser.struct_or_union_return();
        retval.start = input.LT(1);

        int struct_or_union_StartIndex = input.index();

        Object root_0 = null;

        Token set186=null;

        Object set186_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // nesC.g:521:5: ( STRUCT | UNION | NX_STRUCT | NX_UNION )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set186=(Token)input.LT(1);

            if ( input.LA(1)==NX_STRUCT||input.LA(1)==NX_UNION||input.LA(1)==STRUCT||input.LA(1)==UNION ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set186)
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
            if ( state.backtracking>0 ) { memoize(input, 29, struct_or_union_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_or_union"


    public static class struct_declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declaration_list"
    // nesC.g:526:1: struct_declaration_list : ( struct_declaration )+ ;
    public final nesCParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        nesCParser.struct_declaration_list_return retval = new nesCParser.struct_declaration_list_return();
        retval.start = input.LT(1);

        int struct_declaration_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.struct_declaration_return struct_declaration187 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // nesC.g:527:5: ( ( struct_declaration )+ )
            // nesC.g:527:10: ( struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // nesC.g:528:10: ( struct_declaration )+
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
            	    // nesC.g:528:10: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list4981);
            	    struct_declaration187=struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_declaration187.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 30, struct_declaration_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_declaration_list"


    public static class struct_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declaration"
    // nesC.g:531:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final nesCParser.struct_declaration_return struct_declaration() throws RecognitionException {
        nesCParser.struct_declaration_return retval = new nesCParser.struct_declaration_return();
        retval.start = input.LT(1);

        int struct_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal190=null;
        nesCParser.specifier_qualifier_list_return specifier_qualifier_list188 =null;

        nesCParser.struct_declarator_list_return struct_declarator_list189 =null;


        Object char_literal190_tree=null;
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // nesC.g:532:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // nesC.g:532:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration5012);
            specifier_qualifier_list188=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list188.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration5014);
            struct_declarator_list189=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list189.getTree());

            char_literal190=(Token)match(input,190,FOLLOW_190_in_struct_declaration5016); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_190.add(char_literal190);


            // AST REWRITE
            // elements: struct_declarator_list, specifier_qualifier_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 533:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // nesC.g:533:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
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
            if ( state.backtracking>0 ) { memoize(input, 31, struct_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_declaration"


    public static class specifier_qualifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specifier_qualifier_list"
    // nesC.g:540:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final nesCParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        nesCParser.specifier_qualifier_list_return retval = new nesCParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);

        int specifier_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.type_specifier_return type_specifier191 =null;

        nesCParser.type_qualifier_return type_qualifier192 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // nesC.g:541:5: ( ( type_specifier | type_qualifier )+ )
            // nesC.g:541:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:541:10: ( type_specifier | type_qualifier )+
            int cnt43=0;
            loop43:
            do {
                int alt43=3;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA43_2 = input.LA(2);

                    if ( (synpred117_nesC()) ) {
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
            	    // nesC.g:541:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list5059);
            	    type_specifier191=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier191.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:541:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list5063);
            	    type_qualifier192=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier192.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 32, specifier_qualifier_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "specifier_qualifier_list"


    public static class struct_declarator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declarator_list"
    // nesC.g:548:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
    public final nesCParser.struct_declarator_list_return struct_declarator_list() throws RecognitionException {
        nesCParser.struct_declarator_list_return retval = new nesCParser.struct_declarator_list_return();
        retval.start = input.LT(1);

        int struct_declarator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal194=null;
        nesCParser.struct_declarator_return struct_declarator193 =null;

        nesCParser.struct_declarator_return struct_declarator195 =null;


        Object char_literal194_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_struct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // nesC.g:549:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // nesC.g:549:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5089);
            struct_declarator193=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator193.getTree());

            // nesC.g:549:28: ( ',' struct_declarator )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // nesC.g:549:29: ',' struct_declarator
            	    {
            	    char_literal194=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list5092); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal194);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5094);
            	    struct_declarator195=struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator195.getTree());

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
            // 549:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // nesC.g:549:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 33, struct_declarator_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_declarator_list"


    public static class struct_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declarator"
    // nesC.g:551:1: struct_declarator : ( ( declarator )? ':' constant_expression | declarator );
    public final nesCParser.struct_declarator_return struct_declarator() throws RecognitionException {
        nesCParser.struct_declarator_return retval = new nesCParser.struct_declarator_return();
        retval.start = input.LT(1);

        int struct_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal197=null;
        nesCParser.declarator_return declarator196 =null;

        nesCParser.constant_expression_return constant_expression198 =null;

        nesCParser.declarator_return declarator199 =null;


        Object char_literal197_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // nesC.g:552:5: ( ( declarator )? ':' constant_expression | declarator )
            int alt46=2;
            switch ( input.LA(1) ) {
            case STAR:
                {
                int LA46_1 = input.LA(2);

                if ( (synpred121_nesC()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA46_2 = input.LA(2);

                if ( (synpred121_nesC()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    throw nvae;

                }
                }
                break;
            case LPARENS:
                {
                int LA46_3 = input.LA(2);

                if ( (synpred121_nesC()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 3, input);

                    throw nvae;

                }
                }
                break;
            case 189:
                {
                alt46=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // nesC.g:552:10: ( declarator )? ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:552:10: ( declarator )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==LPARENS||LA45_0==RAW_IDENTIFIER||LA45_0==STAR) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // nesC.g:552:10: declarator
                            {
                            pushFollow(FOLLOW_declarator_in_struct_declarator5124);
                            declarator196=declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator196.getTree());

                            }
                            break;

                    }


                    char_literal197=(Token)match(input,189,FOLLOW_189_in_struct_declarator5127); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal197_tree = 
                    (Object)adaptor.create(char_literal197)
                    ;
                    adaptor.addChild(root_0, char_literal197_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator5129);
                    constant_expression198=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression198.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:553:10: declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator5140);
                    declarator199=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator199.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 34, struct_declarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_declarator"


    public static class enum_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enum_specifier"
    // nesC.g:555:1: enum_specifier : ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier attributes '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier attributes enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) );
    public final nesCParser.enum_specifier_return enum_specifier() throws RecognitionException {
        nesCParser.enum_specifier_return retval = new nesCParser.enum_specifier_return();
        retval.start = input.LT(1);

        int enum_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM200=null;
        Token char_literal202=null;
        Token char_literal204=null;
        Token char_literal205=null;
        Token ENUM206=null;
        Token char_literal209=null;
        Token char_literal211=null;
        Token char_literal212=null;
        Token ENUM213=null;
        nesCParser.identifier_return identifier201 =null;

        nesCParser.enumerator_list_return enumerator_list203 =null;

        nesCParser.identifier_return identifier207 =null;

        nesCParser.attributes_return attributes208 =null;

        nesCParser.enumerator_list_return enumerator_list210 =null;

        nesCParser.identifier_return identifier214 =null;


        Object ENUM200_tree=null;
        Object char_literal202_tree=null;
        Object char_literal204_tree=null;
        Object char_literal205_tree=null;
        Object ENUM206_tree=null;
        Object char_literal209_tree=null;
        Object char_literal211_tree=null;
        Object char_literal212_tree=null;
        Object ENUM213_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_enumerator_list=new RewriteRuleSubtreeStream(adaptor,"rule enumerator_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // nesC.g:556:5: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier attributes '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier attributes enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ENUM) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred124_nesC()) ) {
                    alt50=1;
                }
                else if ( (synpred126_nesC()) ) {
                    alt50=2;
                }
                else if ( (true) ) {
                    alt50=3;
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
                    // nesC.g:556:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM200=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM200);


                    // nesC.g:556:15: ( identifier )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RAW_IDENTIFIER) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // nesC.g:556:15: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_enum_specifier5161);
                            identifier201=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier201.getTree());

                            }
                            break;

                    }


                    char_literal202=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal202);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5166);
                    enumerator_list203=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list203.getTree());

                    // nesC.g:556:47: ( ',' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==COMMA) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // nesC.g:556:47: ','
                            {
                            char_literal204=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5168); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal204);


                            }
                            break;

                    }


                    char_literal205=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal205);


                    // AST REWRITE
                    // elements: ENUM, identifier, enumerator_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 557:14: -> ^( ENUM ( identifier )? enumerator_list )
                    {
                        // nesC.g:557:17: ^( ENUM ( identifier )? enumerator_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        // nesC.g:557:24: ( identifier )?
                        if ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_1, stream_enumerator_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:558:10: ENUM identifier attributes '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM206=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM206);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5208);
                    identifier207=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier207.getTree());

                    pushFollow(FOLLOW_attributes_in_enum_specifier5210);
                    attributes208=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes208.getTree());

                    char_literal209=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal209);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5214);
                    enumerator_list210=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list210.getTree());

                    // nesC.g:558:57: ( ',' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==COMMA) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // nesC.g:558:57: ','
                            {
                            char_literal211=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5216); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal211);


                            }
                            break;

                    }


                    char_literal212=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal212);


                    // AST REWRITE
                    // elements: enumerator_list, ENUM, attributes, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 559:14: -> ^( ENUM identifier attributes enumerator_list )
                    {
                        // nesC.g:559:17: ^( ENUM identifier attributes enumerator_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_1, stream_attributes.nextTree());

                        adaptor.addChild(root_1, stream_enumerator_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:560:10: ENUM identifier
                    {
                    ENUM213=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM213);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5257);
                    identifier214=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier214.getTree());

                    // AST REWRITE
                    // elements: identifier, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 561:14: -> ^( ENUM identifier )
                    {
                        // nesC.g:561:17: ^( ENUM identifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 35, enum_specifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enum_specifier"


    public static class enumerator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumerator_list"
    // nesC.g:563:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
    public final nesCParser.enumerator_list_return enumerator_list() throws RecognitionException {
        nesCParser.enumerator_list_return retval = new nesCParser.enumerator_list_return();
        retval.start = input.LT(1);

        int enumerator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal216=null;
        nesCParser.enumerator_return enumerator215 =null;

        nesCParser.enumerator_return enumerator217 =null;


        Object char_literal216_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // nesC.g:564:5: ( enumerator ( ',' ! enumerator )* )
            // nesC.g:564:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list5297);
            enumerator215=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator215.getTree());

            // nesC.g:564:21: ( ',' ! enumerator )*
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
            	    // nesC.g:564:22: ',' ! enumerator
            	    {
            	    char_literal216=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list5300); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list5303);
            	    enumerator217=enumerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator217.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 36, enumerator_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumerator_list"


    public static class enumerator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumerator"
    // nesC.g:570:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
    public final nesCParser.enumerator_return enumerator() throws RecognitionException {
        nesCParser.enumerator_return retval = new nesCParser.enumerator_return();
        retval.start = input.LT(1);

        int enumerator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal219=null;
        nesCParser.identifier_return identifier218 =null;

        nesCParser.constant_expression_return constant_expression220 =null;


        Object char_literal219_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // nesC.g:571:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // nesC.g:571:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator5328);
            identifier218=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier218.getTree());

            // nesC.g:571:21: ( '=' constant_expression )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ASSIGN) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // nesC.g:571:22: '=' constant_expression
                    {
                    char_literal219=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator5331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal219);


                    pushFollow(FOLLOW_constant_expression_in_enumerator5333);
                    constant_expression220=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression220.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: constant_expression, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 571:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // nesC.g:571:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:571:75: ( constant_expression )?
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
            if ( state.backtracking>0 ) { memoize(input, 37, enumerator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumerator"


    public static class type_qualifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_qualifier"
    // nesC.g:572:1: type_qualifier : ( CONST | RESTRICT | VOLATILE );
    public final nesCParser.type_qualifier_return type_qualifier() throws RecognitionException {
        nesCParser.type_qualifier_return retval = new nesCParser.type_qualifier_return();
        retval.start = input.LT(1);

        int type_qualifier_StartIndex = input.index();

        Object root_0 = null;

        Token set221=null;

        Object set221_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // nesC.g:573:5: ( CONST | RESTRICT | VOLATILE )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set221=(Token)input.LT(1);

            if ( input.LA(1)==CONST||input.LA(1)==RESTRICT||input.LA(1)==VOLATILE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set221)
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
            if ( state.backtracking>0 ) { memoize(input, 38, type_qualifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_qualifier"


    public static class function_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_specifier"
    // nesC.g:577:1: function_specifier : INLINE ;
    public final nesCParser.function_specifier_return function_specifier() throws RecognitionException {
        nesCParser.function_specifier_return retval = new nesCParser.function_specifier_return();
        retval.start = input.LT(1);

        int function_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token INLINE222=null;

        Object INLINE222_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // nesC.g:578:5: ( INLINE )
            // nesC.g:578:10: INLINE
            {
            root_0 = (Object)adaptor.nil();


            INLINE222=(Token)match(input,INLINE,FOLLOW_INLINE_in_function_specifier5405); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INLINE222_tree = 
            (Object)adaptor.create(INLINE222)
            ;
            adaptor.addChild(root_0, INLINE222_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 39, function_specifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "function_specifier"


    public static class declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarator"
    // nesC.g:580:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
    public final nesCParser.declarator_return declarator() throws RecognitionException {
        nesCParser.declarator_return retval = new nesCParser.declarator_return();
        retval.start = input.LT(1);

        int declarator_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.pointer_return pointer223 =null;

        nesCParser.direct_declarator_return direct_declarator224 =null;


        RewriteRuleSubtreeStream stream_direct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule direct_declarator");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // nesC.g:581:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // nesC.g:581:10: ( pointer )? direct_declarator
            {
            // nesC.g:581:10: ( pointer )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==STAR) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // nesC.g:581:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator5420);
                    pointer223=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer223.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator5423);
            direct_declarator224=direct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_direct_declarator.add(direct_declarator224.getTree());

            // AST REWRITE
            // elements: direct_declarator, pointer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 581:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // nesC.g:581:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // nesC.g:581:53: ( pointer )?
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
            if ( state.backtracking>0 ) { memoize(input, 40, declarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "declarator"


    public static class direct_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_declarator"
    // nesC.g:583:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final nesCParser.direct_declarator_return direct_declarator() throws RecognitionException {
        nesCParser.direct_declarator_return retval = new nesCParser.direct_declarator_return();
        retval.start = input.LT(1);

        int direct_declarator_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.direct_declarator_identifier_return direct_declarator_identifier225 =null;

        nesCParser.direct_declarator_modifier_return direct_declarator_modifier226 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // nesC.g:584:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // nesC.g:584:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator5448);
            direct_declarator_identifier225=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier225.getTree());

            // nesC.g:584:38: ( direct_declarator_modifier )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==LBRACKET||LA54_0==LPARENS) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // nesC.g:584:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator5450);
            	    direct_declarator_modifier226=direct_declarator_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_modifier226.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, direct_declarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "direct_declarator"


    public static class direct_declarator_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_declarator_identifier"
    // nesC.g:595:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
    public final nesCParser.direct_declarator_identifier_return direct_declarator_identifier() throws RecognitionException {
        nesCParser.direct_declarator_identifier_return retval = new nesCParser.direct_declarator_identifier_return();
        retval.start = input.LT(1);

        int direct_declarator_identifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal227=null;
        Token char_literal229=null;
        Token char_literal231=null;
        nesCParser.identifier_return myIdName =null;

        nesCParser.identifier_return identifier228 =null;

        nesCParser.declarator_return declarator230 =null;


        Object char_literal227_tree=null;
        Object char_literal229_tree=null;
        Object char_literal231_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // nesC.g:596:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
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
                    // nesC.g:596:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5476);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // nesC.g:596:29: ( '.' identifier )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==DOT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // nesC.g:596:30: '.' identifier
                            {
                            char_literal227=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier5479); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal227);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5481);
                            identifier228=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier228.getTree());

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
                    // 600:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:600:18: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:601:9: '(' declarator ')'
                    {
                    char_literal229=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier5516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal229);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier5518);
                    declarator230=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator230.getTree());

                    char_literal231=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier5520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal231);


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
                    // 601:28: -> declarator
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
            if ( state.backtracking>0 ) { memoize(input, 42, direct_declarator_identifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "direct_declarator_identifier"


    public static class direct_declarator_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_declarator_modifier"
    // nesC.g:607:1: direct_declarator_modifier : ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
    public final nesCParser.direct_declarator_modifier_return direct_declarator_modifier() throws RecognitionException {
        nesCParser.direct_declarator_modifier_return retval = new nesCParser.direct_declarator_modifier_return();
        retval.start = input.LT(1);

        int direct_declarator_modifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal232=null;
        Token char_literal234=null;
        Token char_literal235=null;
        Token char_literal236=null;
        Token char_literal237=null;
        Token char_literal238=null;
        nesCParser.parameter_list_return gen =null;

        nesCParser.parameter_list_return normal =null;

        nesCParser.constant_expression_return constant_expression233 =null;


        Object char_literal232_tree=null;
        Object char_literal234_tree=null;
        Object char_literal235_tree=null;
        Object char_literal236_tree=null;
        Object char_literal237_tree=null;
        Object char_literal238_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // nesC.g:608:5: ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LBRACKET) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred136_nesC()) ) {
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
                    // nesC.g:608:9: '[' ( constant_expression )? ']'
                    {
                    char_literal232=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal232);


                    // nesC.g:608:13: ( constant_expression )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==AMP||LA57_0==BITCOMPLEMENT||LA57_0==CALL||LA57_0==CHARACTER_LITERAL||LA57_0==CONSTANT||LA57_0==LPARENS||LA57_0==MINUS||LA57_0==MINUSMINUS||LA57_0==NOT||LA57_0==PLUS||LA57_0==PLUSPLUS||LA57_0==POST||LA57_0==RAW_IDENTIFIER||LA57_0==SIGNAL||LA57_0==SIZEOF||LA57_0==STAR||LA57_0==STRING_LITERAL) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // nesC.g:608:13: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier5544);
                            constant_expression233=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression233.getTree());

                            }
                            break;

                    }


                    char_literal234=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal234);


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
                    // 609:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // nesC.g:609:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // nesC.g:609:44: ( constant_expression )?
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
                    // nesC.g:610:9: ( '[' gen= parameter_list ']' )? '(' normal= parameter_list ')'
                    {
                    // nesC.g:610:9: ( '[' gen= parameter_list ']' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==LBRACKET) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // nesC.g:610:10: '[' gen= parameter_list ']'
                            {
                            char_literal235=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5579); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal235);


                            pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier5583);
                            gen=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_list.add(gen.getTree());

                            char_literal236=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5585); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal236);


                            }
                            break;

                    }


                    char_literal237=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier5589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal237);


                    pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier5593);
                    normal=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(normal.getTree());

                    char_literal238=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier5595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal238);


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
                    // 611:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // nesC.g:611:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
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
            if ( state.backtracking>0 ) { memoize(input, 43, direct_declarator_modifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "direct_declarator_modifier"


    public static class pointer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointer"
    // nesC.g:617:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
    public final nesCParser.pointer_return pointer() throws RecognitionException {
        nesCParser.pointer_return retval = new nesCParser.pointer_return();
        retval.start = input.LT(1);

        int pointer_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal239=null;
        Token char_literal242=null;
        nesCParser.type_qualifier_list_return type_qualifier_list240 =null;

        nesCParser.pointer_return pointer241 =null;

        nesCParser.type_qualifier_list_return type_qualifier_list243 =null;


        Object char_literal239_tree=null;
        Object char_literal242_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_type_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule type_qualifier_list");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // nesC.g:618:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // nesC.g:618:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal239=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal239);


                    // nesC.g:618:14: ( type_qualifier_list )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==CONST||LA60_0==RESTRICT||LA60_0==VOLATILE) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // nesC.g:618:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5637);
                            type_qualifier_list240=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list240.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer5640);
                    pointer241=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer241.getTree());

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
                    // 618:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // nesC.g:618:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:618:66: ( type_qualifier_list )?
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
                    // nesC.g:619:10: '*' ( type_qualifier_list )?
                    {
                    char_literal242=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal242);


                    // nesC.g:619:14: ( type_qualifier_list )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==CONST||LA61_0==RESTRICT||LA61_0==VOLATILE) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // nesC.g:619:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5664);
                            type_qualifier_list243=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list243.getTree());

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
                    // 619:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // nesC.g:619:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:619:58: ( type_qualifier_list )?
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
            if ( state.backtracking>0 ) { memoize(input, 44, pointer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "pointer"


    public static class type_qualifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_qualifier_list"
    // nesC.g:621:1: type_qualifier_list : ( type_qualifier )+ ;
    public final nesCParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        nesCParser.type_qualifier_list_return retval = new nesCParser.type_qualifier_list_return();
        retval.start = input.LT(1);

        int type_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.type_qualifier_return type_qualifier244 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // nesC.g:622:5: ( ( type_qualifier )+ )
            // nesC.g:622:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:622:10: ( type_qualifier )+
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
            	    // nesC.g:622:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list5693);
            	    type_qualifier244=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier244.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 45, type_qualifier_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_qualifier_list"


    public static class parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_list"
    // nesC.g:629:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) );
    public final nesCParser.parameter_list_return parameter_list() throws RecognitionException {
        nesCParser.parameter_list_return retval = new nesCParser.parameter_list_return();
        retval.start = input.LT(1);

        int parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal246=null;
        Token char_literal248=null;
        Token ELLIPSIS249=null;
        nesCParser.parameter_declaration_return parameter_declaration245 =null;

        nesCParser.parameter_declaration_return parameter_declaration247 =null;


        Object char_literal246_tree=null;
        Object char_literal248_tree=null;
        Object ELLIPSIS249_tree=null;
        RewriteRuleTokenStream stream_ELLIPSIS=new RewriteRuleTokenStream(adaptor,"token ELLIPSIS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // nesC.g:630:5: ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ASYNC||LA66_0==AUTO||LA66_0==CHAR||LA66_0==COMMAND||LA66_0==CONST||LA66_0==DEFAULT||(LA66_0 >= DOUBLE && LA66_0 <= DUTY)||LA66_0==ENUM||(LA66_0 >= EVENT && LA66_0 <= EXTERN)||LA66_0==FLOAT||(LA66_0 >= INLINE && LA66_0 <= INT8_T)||LA66_0==LONG||LA66_0==NORACE||(LA66_0 >= NXLE_UINT16_T && LA66_0 <= NX_UNION)||LA66_0==RAW_IDENTIFIER||LA66_0==REGISTER||LA66_0==RESTRICT||LA66_0==SHORT||LA66_0==SIGNED||LA66_0==STATIC||LA66_0==STRUCT||LA66_0==TASK||(LA66_0 >= UINT16_T && LA66_0 <= UINT8_T)||(LA66_0 >= UNION && LA66_0 <= UNSIGNED)||(LA66_0 >= VOID && LA66_0 <= VOLATILE)) ) {
                alt66=1;
            }
            else if ( (LA66_0==EOF||LA66_0==RBRACKET||LA66_0==RPARENS) ) {
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
                    // nesC.g:630:10: parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )?
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list5718);
                    parameter_declaration245=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration245.getTree());

                    // nesC.g:630:32: ( ',' parameter_declaration )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==COMMA) ) {
                            int LA64_1 = input.LA(2);

                            if ( (LA64_1==ASYNC||LA64_1==AUTO||LA64_1==CHAR||LA64_1==COMMAND||LA64_1==CONST||LA64_1==DEFAULT||(LA64_1 >= DOUBLE && LA64_1 <= DUTY)||LA64_1==ENUM||(LA64_1 >= EVENT && LA64_1 <= EXTERN)||LA64_1==FLOAT||(LA64_1 >= INLINE && LA64_1 <= INT8_T)||LA64_1==LONG||LA64_1==NORACE||(LA64_1 >= NXLE_UINT16_T && LA64_1 <= NX_UNION)||LA64_1==RAW_IDENTIFIER||LA64_1==REGISTER||LA64_1==RESTRICT||LA64_1==SHORT||LA64_1==SIGNED||LA64_1==STATIC||LA64_1==STRUCT||LA64_1==TASK||(LA64_1 >= UINT16_T && LA64_1 <= UINT8_T)||(LA64_1 >= UNION && LA64_1 <= UNSIGNED)||(LA64_1 >= VOID && LA64_1 <= VOLATILE)) ) {
                                alt64=1;
                            }


                        }


                        switch (alt64) {
                    	case 1 :
                    	    // nesC.g:630:33: ',' parameter_declaration
                    	    {
                    	    char_literal246=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list5721); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal246);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list5723);
                    	    parameter_declaration247=parameter_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration247.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    // nesC.g:630:61: ( ',' ELLIPSIS )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==COMMA) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // nesC.g:630:62: ',' ELLIPSIS
                            {
                            char_literal248=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list5728); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal248);


                            ELLIPSIS249=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_parameter_list5730); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELLIPSIS.add(ELLIPSIS249);


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
                    // 631:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
                    {
                        // nesC.g:631:16: ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
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

                        // nesC.g:631:56: ( ELLIPSIS )?
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
                    // nesC.g:633:13: 
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
                    // 633:13: -> ^( PARAMETER_LIST )
                    {
                        // nesC.g:633:16: ^( PARAMETER_LIST )
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
            if ( state.backtracking>0 ) { memoize(input, 46, parameter_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parameter_list"


    public static class parameter_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_declaration"
    // nesC.g:639:1: parameter_declaration : ( declaration_specifiers declarator ( attributes )? -> ^( PARAMETER declaration_specifiers declarator ( attributes )? ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) );
    public final nesCParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        nesCParser.parameter_declaration_return retval = new nesCParser.parameter_declaration_return();
        retval.start = input.LT(1);

        int parameter_declaration_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers250 =null;

        nesCParser.declarator_return declarator251 =null;

        nesCParser.attributes_return attributes252 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers253 =null;

        nesCParser.abstract_declarator_return abstract_declarator254 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_abstract_declarator=new RewriteRuleSubtreeStream(adaptor,"rule abstract_declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // nesC.g:640:5: ( declaration_specifiers declarator ( attributes )? -> ^( PARAMETER declaration_specifiers declarator ( attributes )? ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) )
            int alt69=2;
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
                int LA69_1 = input.LA(2);

                if ( (synpred146_nesC()) ) {
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
                break;
            case VOID:
                {
                int LA69_2 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA69_3 = input.LA(2);

                if ( (synpred146_nesC()) ) {
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
                break;
            case SHORT:
                {
                int LA69_4 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA69_5 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA69_6 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA69_7 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA69_8 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA69_9 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 9, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA69_10 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA69_11 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 11, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA69_12 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 12, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA69_13 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 13, input);

                    throw nvae;

                }
                }
                break;
            case INT64_T:
                {
                int LA69_14 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 14, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA69_15 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 15, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA69_16 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 16, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA69_17 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 17, input);

                    throw nvae;

                }
                }
                break;
            case UINT64_T:
                {
                int LA69_18 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 18, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA69_19 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 19, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA69_20 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 20, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA69_21 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 21, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT64_T:
                {
                int LA69_22 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 22, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT8_T:
                {
                int LA69_23 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 23, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT16_T:
                {
                int LA69_24 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 24, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT32_T:
                {
                int LA69_25 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 25, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA69_26 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 26, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA69_27 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 27, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA69_28 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 28, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA69_29 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 29, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA69_30 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 30, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA69_31 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 31, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA69_32 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 32, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA69_33 = input.LA(2);

                if ( (synpred146_nesC()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 33, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // nesC.g:640:10: declaration_specifiers declarator ( attributes )?
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration5800);
                    declaration_specifiers250=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers250.getTree());

                    pushFollow(FOLLOW_declarator_in_parameter_declaration5802);
                    declarator251=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator251.getTree());

                    // nesC.g:640:44: ( attributes )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==ATTRIBUTE) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // nesC.g:640:44: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_parameter_declaration5804);
                            attributes252=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes252.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: declarator, declaration_specifiers, attributes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 641:13: -> ^( PARAMETER declaration_specifiers declarator ( attributes )? )
                    {
                        // nesC.g:641:16: ^( PARAMETER declaration_specifiers declarator ( attributes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        adaptor.addChild(root_1, stream_declarator.nextTree());

                        // nesC.g:641:62: ( attributes )?
                        if ( stream_attributes.hasNext() ) {
                            adaptor.addChild(root_1, stream_attributes.nextTree());

                        }
                        stream_attributes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:642:10: declaration_specifiers ( abstract_declarator )?
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration5841);
                    declaration_specifiers253=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers253.getTree());

                    // nesC.g:642:33: ( abstract_declarator )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==LBRACKET||LA68_0==LPARENS||LA68_0==STAR) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // nesC.g:642:33: abstract_declarator
                            {
                            pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration5843);
                            abstract_declarator254=abstract_declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_abstract_declarator.add(abstract_declarator254.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: declaration_specifiers, abstract_declarator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 643:13: -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                    {
                        // nesC.g:643:16: ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:643:51: ( abstract_declarator )?
                        if ( stream_abstract_declarator.hasNext() ) {
                            adaptor.addChild(root_1, stream_abstract_declarator.nextTree());

                        }
                        stream_abstract_declarator.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 47, parameter_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parameter_declaration"


    public static class identifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_list"
    // nesC.g:645:1: identifier_list : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final nesCParser.identifier_list_return identifier_list() throws RecognitionException {
        nesCParser.identifier_list_return retval = new nesCParser.identifier_list_return();
        retval.start = input.LT(1);

        int identifier_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal256=null;
        nesCParser.identifier_return identifier255 =null;

        nesCParser.identifier_return identifier257 =null;


        Object char_literal256_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // nesC.g:646:5: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // nesC.g:646:10: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifier_list5886);
            identifier255=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier255.getTree());

            // nesC.g:646:21: ( ',' identifier )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // nesC.g:646:22: ',' identifier
            	    {
            	    char_literal256=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifier_list5889); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal256);


            	    pushFollow(FOLLOW_identifier_in_identifier_list5891);
            	    identifier257=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier257.getTree());

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
            // 646:39: -> ( identifier )+
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
            if ( state.backtracking>0 ) { memoize(input, 48, identifier_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifier_list"


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // nesC.g:648:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final nesCParser.type_name_return type_name() throws RecognitionException {
        nesCParser.type_name_return retval = new nesCParser.type_name_return();
        retval.start = input.LT(1);

        int type_name_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.specifier_qualifier_list_return specifier_qualifier_list258 =null;

        nesCParser.abstract_declarator_return abstract_declarator259 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // nesC.g:649:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // nesC.g:649:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name5917);
            specifier_qualifier_list258=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list258.getTree());

            // nesC.g:649:35: ( abstract_declarator )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==LBRACKET||LA71_0==LPARENS||LA71_0==STAR) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // nesC.g:649:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name5919);
                    abstract_declarator259=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator259.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, type_name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_name"


    public static class abstract_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "abstract_declarator"
    // nesC.g:651:1: abstract_declarator : ( ( pointer )? direct_abstract_declarator | pointer );
    public final nesCParser.abstract_declarator_return abstract_declarator() throws RecognitionException {
        nesCParser.abstract_declarator_return retval = new nesCParser.abstract_declarator_return();
        retval.start = input.LT(1);

        int abstract_declarator_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.pointer_return pointer260 =null;

        nesCParser.direct_abstract_declarator_return direct_abstract_declarator261 =null;

        nesCParser.pointer_return pointer262 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // nesC.g:652:5: ( ( pointer )? direct_abstract_declarator | pointer )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==STAR) ) {
                int LA73_1 = input.LA(2);

                if ( (synpred151_nesC()) ) {
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
            else if ( (LA73_0==LBRACKET||LA73_0==LPARENS) ) {
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
                    // nesC.g:652:10: ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:652:10: ( pointer )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==STAR) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // nesC.g:652:10: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator5939);
                            pointer260=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer260.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator5942);
                    direct_abstract_declarator261=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator261.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:653:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator5953);
                    pointer262=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer262.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, abstract_declarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "abstract_declarator"


    public static class direct_abstract_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_abstract_declarator"
    // nesC.g:655:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_list )? ')' )* ;
    public final nesCParser.direct_abstract_declarator_return direct_abstract_declarator() throws RecognitionException {
        nesCParser.direct_abstract_declarator_return retval = new nesCParser.direct_abstract_declarator_return();
        retval.start = input.LT(1);

        int direct_abstract_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal263=null;
        Token char_literal265=null;
        Token char_literal266=null;
        Token char_literal268=null;
        Token char_literal269=null;
        Token char_literal271=null;
        Token char_literal272=null;
        Token char_literal274=null;
        Token char_literal275=null;
        Token char_literal277=null;
        nesCParser.abstract_declarator_return abstract_declarator264 =null;

        nesCParser.assignment_expression_return assignment_expression267 =null;

        nesCParser.parameter_list_return parameter_list270 =null;

        nesCParser.assignment_expression_return assignment_expression273 =null;

        nesCParser.parameter_list_return parameter_list276 =null;


        Object char_literal263_tree=null;
        Object char_literal265_tree=null;
        Object char_literal266_tree=null;
        Object char_literal268_tree=null;
        Object char_literal269_tree=null;
        Object char_literal271_tree=null;
        Object char_literal272_tree=null;
        Object char_literal274_tree=null;
        Object char_literal275_tree=null;
        Object char_literal277_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // nesC.g:656:5: ( ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_list )? ')' )* )
            // nesC.g:656:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_list )? ')' )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:656:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_list )? ')' )
            int alt76=3;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==LPARENS) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==LBRACKET||LA76_1==LPARENS||LA76_1==STAR) ) {
                    alt76=1;
                }
                else if ( (LA76_1==ASYNC||LA76_1==AUTO||LA76_1==CHAR||LA76_1==COMMAND||LA76_1==CONST||LA76_1==DEFAULT||(LA76_1 >= DOUBLE && LA76_1 <= DUTY)||LA76_1==ENUM||(LA76_1 >= EVENT && LA76_1 <= EXTERN)||LA76_1==FLOAT||(LA76_1 >= INLINE && LA76_1 <= INT8_T)||LA76_1==LONG||LA76_1==NORACE||(LA76_1 >= NXLE_UINT16_T && LA76_1 <= NX_UNION)||LA76_1==RAW_IDENTIFIER||LA76_1==REGISTER||LA76_1==RESTRICT||LA76_1==RPARENS||LA76_1==SHORT||LA76_1==SIGNED||LA76_1==STATIC||LA76_1==STRUCT||LA76_1==TASK||(LA76_1 >= UINT16_T && LA76_1 <= UINT8_T)||(LA76_1 >= UNION && LA76_1 <= UNSIGNED)||(LA76_1 >= VOID && LA76_1 <= VOLATILE)) ) {
                    alt76=3;
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
                    // nesC.g:656:11: '(' abstract_declarator ')'
                    {
                    char_literal263=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator5973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal263_tree = 
                    (Object)adaptor.create(char_literal263)
                    ;
                    adaptor.addChild(root_0, char_literal263_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator5975);
                    abstract_declarator264=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator264.getTree());

                    char_literal265=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator5980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal265_tree = 
                    (Object)adaptor.create(char_literal265)
                    ;
                    adaptor.addChild(root_0, char_literal265_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:657:11: '[' ( assignment_expression )? ']'
                    {
                    char_literal266=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator5994); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal266_tree = 
                    (Object)adaptor.create(char_literal266)
                    ;
                    adaptor.addChild(root_0, char_literal266_tree);
                    }

                    // nesC.g:657:15: ( assignment_expression )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==AMP||LA74_0==BITCOMPLEMENT||LA74_0==CALL||LA74_0==CHARACTER_LITERAL||LA74_0==CONSTANT||LA74_0==LPARENS||LA74_0==MINUS||LA74_0==MINUSMINUS||LA74_0==NOT||LA74_0==PLUS||LA74_0==PLUSPLUS||LA74_0==POST||LA74_0==RAW_IDENTIFIER||LA74_0==SIGNAL||LA74_0==SIZEOF||LA74_0==STAR||LA74_0==STRING_LITERAL) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // nesC.g:657:15: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator5996);
                            assignment_expression267=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression267.getTree());

                            }
                            break;

                    }


                    char_literal268=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator5999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal268_tree = 
                    (Object)adaptor.create(char_literal268)
                    ;
                    adaptor.addChild(root_0, char_literal268_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:658:11: '(' ( parameter_list )? ')'
                    {
                    char_literal269=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal269_tree = 
                    (Object)adaptor.create(char_literal269)
                    ;
                    adaptor.addChild(root_0, char_literal269_tree);
                    }

                    // nesC.g:658:15: ( parameter_list )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==ASYNC||LA75_0==AUTO||LA75_0==CHAR||LA75_0==COMMAND||LA75_0==CONST||LA75_0==DEFAULT||(LA75_0 >= DOUBLE && LA75_0 <= DUTY)||LA75_0==ENUM||(LA75_0 >= EVENT && LA75_0 <= EXTERN)||LA75_0==FLOAT||(LA75_0 >= INLINE && LA75_0 <= INT8_T)||LA75_0==LONG||LA75_0==NORACE||(LA75_0 >= NXLE_UINT16_T && LA75_0 <= NX_UNION)||LA75_0==RAW_IDENTIFIER||LA75_0==REGISTER||LA75_0==RESTRICT||LA75_0==SHORT||LA75_0==SIGNED||LA75_0==STATIC||LA75_0==STRUCT||LA75_0==TASK||(LA75_0 >= UINT16_T && LA75_0 <= UINT8_T)||(LA75_0 >= UNION && LA75_0 <= UNSIGNED)||(LA75_0 >= VOID && LA75_0 <= VOLATILE)) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==RPARENS) ) {
                        int LA75_2 = input.LA(2);

                        if ( (synpred155_nesC()) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // nesC.g:658:15: parameter_list
                            {
                            pushFollow(FOLLOW_parameter_list_in_direct_abstract_declarator6015);
                            parameter_list270=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list270.getTree());

                            }
                            break;

                    }


                    char_literal271=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6020); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal271_tree = 
                    (Object)adaptor.create(char_literal271)
                    ;
                    adaptor.addChild(root_0, char_literal271_tree);
                    }

                    }
                    break;

            }


            // nesC.g:659:14: ( '[' ( assignment_expression )? ']' | '(' ( parameter_list )? ')' )*
            loop79:
            do {
                int alt79=3;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==LBRACKET) ) {
                    alt79=1;
                }
                else if ( (LA79_0==LPARENS) ) {
                    alt79=2;
                }


                switch (alt79) {
            	case 1 :
            	    // nesC.g:659:15: '[' ( assignment_expression )? ']'
            	    {
            	    char_literal272=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator6037); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal272_tree = 
            	    (Object)adaptor.create(char_literal272)
            	    ;
            	    adaptor.addChild(root_0, char_literal272_tree);
            	    }

            	    // nesC.g:659:19: ( assignment_expression )?
            	    int alt77=2;
            	    int LA77_0 = input.LA(1);

            	    if ( (LA77_0==AMP||LA77_0==BITCOMPLEMENT||LA77_0==CALL||LA77_0==CHARACTER_LITERAL||LA77_0==CONSTANT||LA77_0==LPARENS||LA77_0==MINUS||LA77_0==MINUSMINUS||LA77_0==NOT||LA77_0==PLUS||LA77_0==PLUSPLUS||LA77_0==POST||LA77_0==RAW_IDENTIFIER||LA77_0==SIGNAL||LA77_0==SIZEOF||LA77_0==STAR||LA77_0==STRING_LITERAL) ) {
            	        alt77=1;
            	    }
            	    switch (alt77) {
            	        case 1 :
            	            // nesC.g:659:19: assignment_expression
            	            {
            	            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator6039);
            	            assignment_expression273=assignment_expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression273.getTree());

            	            }
            	            break;

            	    }


            	    char_literal274=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator6042); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal274_tree = 
            	    (Object)adaptor.create(char_literal274)
            	    ;
            	    adaptor.addChild(root_0, char_literal274_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:659:48: '(' ( parameter_list )? ')'
            	    {
            	    char_literal275=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6046); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal275_tree = 
            	    (Object)adaptor.create(char_literal275)
            	    ;
            	    adaptor.addChild(root_0, char_literal275_tree);
            	    }

            	    // nesC.g:659:52: ( parameter_list )?
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==ASYNC||LA78_0==AUTO||LA78_0==CHAR||LA78_0==COMMAND||LA78_0==CONST||LA78_0==DEFAULT||(LA78_0 >= DOUBLE && LA78_0 <= DUTY)||LA78_0==ENUM||(LA78_0 >= EVENT && LA78_0 <= EXTERN)||LA78_0==FLOAT||(LA78_0 >= INLINE && LA78_0 <= INT8_T)||LA78_0==LONG||LA78_0==NORACE||(LA78_0 >= NXLE_UINT16_T && LA78_0 <= NX_UNION)||LA78_0==RAW_IDENTIFIER||LA78_0==REGISTER||LA78_0==RESTRICT||LA78_0==SHORT||LA78_0==SIGNED||LA78_0==STATIC||LA78_0==STRUCT||LA78_0==TASK||(LA78_0 >= UINT16_T && LA78_0 <= UINT8_T)||(LA78_0 >= UNION && LA78_0 <= UNSIGNED)||(LA78_0 >= VOID && LA78_0 <= VOLATILE)) ) {
            	        alt78=1;
            	    }
            	    else if ( (LA78_0==RPARENS) ) {
            	        int LA78_2 = input.LA(2);

            	        if ( (synpred158_nesC()) ) {
            	            alt78=1;
            	        }
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // nesC.g:659:52: parameter_list
            	            {
            	            pushFollow(FOLLOW_parameter_list_in_direct_abstract_declarator6048);
            	            parameter_list276=parameter_list();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list276.getTree());

            	            }
            	            break;

            	    }


            	    char_literal277=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6051); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal277_tree = 
            	    (Object)adaptor.create(char_literal277)
            	    ;
            	    adaptor.addChild(root_0, char_literal277_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
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
            if ( state.backtracking>0 ) { memoize(input, 51, direct_abstract_declarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "direct_abstract_declarator"


    public static class typedef_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_name"
    // nesC.g:662:1: typedef_name : id= RAW_IDENTIFIER {...}?;
    public final nesCParser.typedef_name_return typedef_name() throws RecognitionException {
        nesCParser.typedef_name_return retval = new nesCParser.typedef_name_return();
        retval.start = input.LT(1);

        int typedef_name_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // nesC.g:663:5: (id= RAW_IDENTIFIER {...}?)
            // nesC.g:663:10: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name6080); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            id_tree = 
            (Object)adaptor.create(id)
            ;
            adaptor.addChild(root_0, id_tree);
            }

            if ( !(( symbols.isType((id!=null?id.getText():null)) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typedef_name", " symbols.isType($id.text) ");
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
            if ( state.backtracking>0 ) { memoize(input, 52, typedef_name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typedef_name"


    public static class initializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer"
    // nesC.g:672:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
    public final nesCParser.initializer_return initializer() throws RecognitionException {
        nesCParser.initializer_return retval = new nesCParser.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal279=null;
        Token char_literal281=null;
        Token char_literal282=null;
        nesCParser.assignment_expression_return assignment_expression278 =null;

        nesCParser.initializer_list_return initializer_list280 =null;


        Object char_literal279_tree=null;
        Object char_literal281_tree=null;
        Object char_literal282_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // nesC.g:673:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==AMP||LA81_0==BITCOMPLEMENT||LA81_0==CALL||LA81_0==CHARACTER_LITERAL||LA81_0==CONSTANT||LA81_0==LPARENS||LA81_0==MINUS||LA81_0==MINUSMINUS||LA81_0==NOT||LA81_0==PLUS||LA81_0==PLUSPLUS||LA81_0==POST||LA81_0==RAW_IDENTIFIER||LA81_0==SIGNAL||LA81_0==SIZEOF||LA81_0==STAR||LA81_0==STRING_LITERAL) ) {
                alt81=1;
            }
            else if ( (LA81_0==LBRACE) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }
            switch (alt81) {
                case 1 :
                    // nesC.g:673:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer6120);
                    assignment_expression278=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression278.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:674:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal279=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer6131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal279);


                    pushFollow(FOLLOW_initializer_list_in_initializer6133);
                    initializer_list280=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list280.getTree());

                    // nesC.g:674:31: ( ',' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==COMMA) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // nesC.g:674:31: ','
                            {
                            char_literal281=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer6135); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal281);


                            }
                            break;

                    }


                    char_literal282=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer6138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal282);


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
                    // 674:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // nesC.g:674:43: ^( INITIALIZER_LIST initializer_list )
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
            if ( state.backtracking>0 ) { memoize(input, 53, initializer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initializer"


    public static class initializer_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer_list"
    // nesC.g:678:1: initializer_list : ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ ;
    public final nesCParser.initializer_list_return initializer_list() throws RecognitionException {
        nesCParser.initializer_list_return retval = new nesCParser.initializer_list_return();
        retval.start = input.LT(1);

        int initializer_list_StartIndex = input.index();

        Object root_0 = null;

        Token RAW_IDENTIFIER283=null;
        Token char_literal284=null;
        Token char_literal286=null;
        Token RAW_IDENTIFIER287=null;
        Token char_literal288=null;
        nesCParser.initializer_return initializer285 =null;

        nesCParser.initializer_return initializer289 =null;


        Object RAW_IDENTIFIER283_tree=null;
        Object char_literal284_tree=null;
        Object char_literal286_tree=null;
        Object RAW_IDENTIFIER287_tree=null;
        Object char_literal288_tree=null;
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // nesC.g:679:5: ( ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ )
            // nesC.g:679:10: ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            {
            // nesC.g:679:10: ( RAW_IDENTIFIER ':' )?
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
                    // nesC.g:679:11: RAW_IDENTIFIER ':'
                    {
                    RAW_IDENTIFIER283=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER283);


                    char_literal284=(Token)match(input,189,FOLLOW_189_in_initializer_list6170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal284);


                    }
                    break;

            }


            pushFollow(FOLLOW_initializer_in_initializer_list6174);
            initializer285=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer285.getTree());

            // nesC.g:679:44: ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    int LA84_1 = input.LA(2);

                    if ( (LA84_1==AMP||LA84_1==BITCOMPLEMENT||LA84_1==CALL||LA84_1==CHARACTER_LITERAL||LA84_1==CONSTANT||LA84_1==LBRACE||LA84_1==LPARENS||LA84_1==MINUS||LA84_1==MINUSMINUS||LA84_1==NOT||LA84_1==PLUS||LA84_1==PLUSPLUS||LA84_1==POST||LA84_1==RAW_IDENTIFIER||LA84_1==SIGNAL||LA84_1==SIZEOF||LA84_1==STAR||LA84_1==STRING_LITERAL) ) {
                        alt84=1;
                    }


                }


                switch (alt84) {
            	case 1 :
            	    // nesC.g:679:45: ',' ( RAW_IDENTIFIER ':' )? initializer
            	    {
            	    char_literal286=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list6177); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal286);


            	    // nesC.g:679:49: ( RAW_IDENTIFIER ':' )?
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( (LA83_0==RAW_IDENTIFIER) ) {
            	        int LA83_1 = input.LA(2);

            	        if ( (LA83_1==189) ) {
            	            alt83=1;
            	        }
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // nesC.g:679:50: RAW_IDENTIFIER ':'
            	            {
            	            RAW_IDENTIFIER287=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6180); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER287);


            	            char_literal288=(Token)match(input,189,FOLLOW_189_in_initializer_list6182); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_189.add(char_literal288);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_initializer_in_initializer_list6186);
            	    initializer289=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer289.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
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
            // 680:13: -> ( initializer )+
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
            if ( state.backtracking>0 ) { memoize(input, 54, initializer_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initializer_list"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // nesC.g:686:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement | line_directive );
    public final nesCParser.statement_return statement() throws RecognitionException {
        nesCParser.statement_return retval = new nesCParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.labeled_statement_return labeled_statement290 =null;

        nesCParser.compound_statement_return compound_statement291 =null;

        nesCParser.expression_statement_return expression_statement292 =null;

        nesCParser.selection_statement_return selection_statement293 =null;

        nesCParser.iteration_statement_return iteration_statement294 =null;

        nesCParser.jump_statement_return jump_statement295 =null;

        nesCParser.atomic_statement_return atomic_statement296 =null;

        nesCParser.line_directive_return line_directive297 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // nesC.g:687:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement | line_directive )
            int alt85=8;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA85_1 = input.LA(2);

                if ( (LA85_1==189) ) {
                    alt85=1;
                }
                else if ( ((LA85_1 >= AMP && LA85_1 <= AND)||LA85_1==ARROW||LA85_1==ASSIGN||LA85_1==BITANDASSIGN||(LA85_1 >= BITOR && LA85_1 <= BITXORASSIGN)||LA85_1==COMMA||(LA85_1 >= DIVASSIGN && LA85_1 <= DIVIDE)||LA85_1==DOT||LA85_1==EQUAL||(LA85_1 >= GREATER && LA85_1 <= GREATEREQUAL)||(LA85_1 >= LBRACKET && LA85_1 <= LESSEQUAL)||(LA85_1 >= LPARENS && LA85_1 <= MODASSIGN)||(LA85_1 >= MODULUS && LA85_1 <= MULASSIGN)||LA85_1==NOTEQUAL||LA85_1==OR||(LA85_1 >= PLUS && LA85_1 <= PLUSPLUS)||(LA85_1 >= RSHIFT && LA85_1 <= RSHIFTASSIGN)||LA85_1==STAR||LA85_1==190||LA85_1==192) ) {
                    alt85=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 1, input);

                    throw nvae;

                }
                }
                break;
            case CASE:
            case DEFAULT:
                {
                alt85=1;
                }
                break;
            case LBRACE:
                {
                alt85=2;
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
                alt85=3;
                }
                break;
            case IF:
            case SWITCH:
                {
                alt85=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt85=5;
                }
                break;
            case BREAK:
            case CONTINUE:
            case GOTO:
            case RETURN:
                {
                alt85=6;
                }
                break;
            case ATOMIC:
                {
                alt85=7;
                }
                break;
            case HASH:
                {
                alt85=8;
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
                    // nesC.g:687:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement6231);
                    labeled_statement290=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement290.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:688:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement6242);
                    compound_statement291=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement291.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:689:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement6253);
                    expression_statement292=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement292.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:690:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement6264);
                    selection_statement293=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement293.getTree());

                    }
                    break;
                case 5 :
                    // nesC.g:691:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement6275);
                    iteration_statement294=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement294.getTree());

                    }
                    break;
                case 6 :
                    // nesC.g:692:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement6286);
                    jump_statement295=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement295.getTree());

                    }
                    break;
                case 7 :
                    // nesC.g:693:10: atomic_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atomic_statement_in_statement6297);
                    atomic_statement296=atomic_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomic_statement296.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:694:10: line_directive
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_line_directive_in_statement6308);
                    line_directive297=line_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive297.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class atomic_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomic_statement"
    // nesC.g:697:1: atomic_statement : ATOMIC statement -> ^( ATOMIC statement ) ;
    public final nesCParser.atomic_statement_return atomic_statement() throws RecognitionException {
        nesCParser.atomic_statement_return retval = new nesCParser.atomic_statement_return();
        retval.start = input.LT(1);

        int atomic_statement_StartIndex = input.index();

        Object root_0 = null;

        Token ATOMIC298=null;
        nesCParser.statement_return statement299 =null;


        Object ATOMIC298_tree=null;
        RewriteRuleTokenStream stream_ATOMIC=new RewriteRuleTokenStream(adaptor,"token ATOMIC");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // nesC.g:698:5: ( ATOMIC statement -> ^( ATOMIC statement ) )
            // nesC.g:698:10: ATOMIC statement
            {
            ATOMIC298=(Token)match(input,ATOMIC,FOLLOW_ATOMIC_in_atomic_statement6332); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATOMIC.add(ATOMIC298);


            pushFollow(FOLLOW_statement_in_atomic_statement6334);
            statement299=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement299.getTree());

            // AST REWRITE
            // elements: ATOMIC, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 698:27: -> ^( ATOMIC statement )
            {
                // nesC.g:698:30: ^( ATOMIC statement )
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
            if ( state.backtracking>0 ) { memoize(input, 56, atomic_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "atomic_statement"


    public static class labeled_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "labeled_statement"
    // nesC.g:700:1: labeled_statement : ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final nesCParser.labeled_statement_return labeled_statement() throws RecognitionException {
        nesCParser.labeled_statement_return retval = new nesCParser.labeled_statement_return();
        retval.start = input.LT(1);

        int labeled_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal301=null;
        Token CASE303=null;
        Token char_literal305=null;
        Token DEFAULT307=null;
        Token char_literal308=null;
        nesCParser.identifier_return identifier300 =null;

        nesCParser.statement_return statement302 =null;

        nesCParser.constant_expression_return constant_expression304 =null;

        nesCParser.statement_return statement306 =null;

        nesCParser.statement_return statement309 =null;


        Object char_literal301_tree=null;
        Object CASE303_tree=null;
        Object char_literal305_tree=null;
        Object DEFAULT307_tree=null;
        Object char_literal308_tree=null;
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // nesC.g:701:5: ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
            int alt86=3;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                alt86=1;
                }
                break;
            case CASE:
                {
                alt86=2;
                }
                break;
            case DEFAULT:
                {
                alt86=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }

            switch (alt86) {
                case 1 :
                    // nesC.g:701:10: identifier ':' statement
                    {
                    pushFollow(FOLLOW_identifier_in_labeled_statement6361);
                    identifier300=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier300.getTree());

                    char_literal301=(Token)match(input,189,FOLLOW_189_in_labeled_statement6363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal301);


                    pushFollow(FOLLOW_statement_in_labeled_statement6365);
                    statement302=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement302.getTree());

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
                    // 701:35: -> ^( LABELED_STATEMENT identifier statement )
                    {
                        // nesC.g:701:38: ^( LABELED_STATEMENT identifier statement )
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
                    // nesC.g:702:10: CASE constant_expression ':' statement
                    {
                    CASE303=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement6386); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE303);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement6388);
                    constant_expression304=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression304.getTree());

                    char_literal305=(Token)match(input,189,FOLLOW_189_in_labeled_statement6390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal305);


                    pushFollow(FOLLOW_statement_in_labeled_statement6392);
                    statement306=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement306.getTree());

                    // AST REWRITE
                    // elements: statement, CASE, constant_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 702:49: -> ^( CASE constant_expression statement )
                    {
                        // nesC.g:702:52: ^( CASE constant_expression statement )
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
                    // nesC.g:703:10: DEFAULT ':' statement
                    {
                    DEFAULT307=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement6413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT307);


                    char_literal308=(Token)match(input,189,FOLLOW_189_in_labeled_statement6415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal308);


                    pushFollow(FOLLOW_statement_in_labeled_statement6417);
                    statement309=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement309.getTree());

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
                    // 703:32: -> ^( DEFAULT statement )
                    {
                        // nesC.g:703:35: ^( DEFAULT statement )
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
            if ( state.backtracking>0 ) { memoize(input, 57, labeled_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "labeled_statement"


    public static class compound_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compound_statement"
    // nesC.g:708:1: compound_statement : '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) ;
    public final nesCParser.compound_statement_return compound_statement() throws RecognitionException {
        nesCParser.compound_statement_return retval = new nesCParser.compound_statement_return();
        retval.start = input.LT(1);

        int compound_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal310=null;
        Token char_literal312=null;
        nesCParser.block_item_return block_item311 =null;


        Object char_literal310_tree=null;
        Object char_literal312_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_block_item=new RewriteRuleSubtreeStream(adaptor,"rule block_item");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // nesC.g:709:5: ( '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) )
            // nesC.g:709:10: '{' ( block_item )* '}'
            {
            char_literal310=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement6443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal310);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:710:10: ( block_item )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==AMP||(LA87_0 >= ASYNC && LA87_0 <= ATOMIC)||LA87_0==AUTO||LA87_0==BITCOMPLEMENT||(LA87_0 >= BREAK && LA87_0 <= CASE)||(LA87_0 >= CHAR && LA87_0 <= CHARACTER_LITERAL)||LA87_0==COMMAND||(LA87_0 >= CONST && LA87_0 <= CONTINUE)||LA87_0==DEFAULT||LA87_0==DO||(LA87_0 >= DOUBLE && LA87_0 <= DUTY)||LA87_0==ENUM||(LA87_0 >= EVENT && LA87_0 <= EXTERN)||(LA87_0 >= FLOAT && LA87_0 <= FOR)||LA87_0==GOTO||LA87_0==HASH||LA87_0==IF||(LA87_0 >= INLINE && LA87_0 <= INT8_T)||LA87_0==LBRACE||(LA87_0 >= LONG && LA87_0 <= LPARENS)||LA87_0==MINUS||LA87_0==MINUSMINUS||(LA87_0 >= NORACE && LA87_0 <= NOT)||(LA87_0 >= NXLE_UINT16_T && LA87_0 <= NX_UNION)||LA87_0==PLUS||LA87_0==PLUSPLUS||LA87_0==POST||LA87_0==RAW_IDENTIFIER||LA87_0==REGISTER||(LA87_0 >= RESTRICT && LA87_0 <= RETURN)||(LA87_0 >= SHORT && LA87_0 <= SIZEOF)||LA87_0==STAR||(LA87_0 >= STATIC && LA87_0 <= UINT8_T)||(LA87_0 >= UNION && LA87_0 <= UNSIGNED)||(LA87_0 >= VOID && LA87_0 <= WHILE)||LA87_0==190) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // nesC.g:710:10: block_item
            	    {
            	    pushFollow(FOLLOW_block_item_in_compound_statement6456);
            	    block_item311=block_item();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block_item.add(block_item311.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal312=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement6474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal312);


            // AST REWRITE
            // elements: block_item
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 711:44: -> ^( COMPOUND_STATEMENT ( block_item )* )
            {
                // nesC.g:711:47: ^( COMPOUND_STATEMENT ( block_item )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // nesC.g:711:68: ( block_item )*
                while ( stream_block_item.hasNext() ) {
                    adaptor.addChild(root_1, stream_block_item.nextTree());

                }
                stream_block_item.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 58, compound_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "compound_statement"


    public static class block_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_item"
    // nesC.g:713:1: block_item : ( declaration | statement );
    public final nesCParser.block_item_return block_item() throws RecognitionException {
        nesCParser.block_item_return retval = new nesCParser.block_item_return();
        retval.start = input.LT(1);

        int block_item_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_return declaration313 =null;

        nesCParser.statement_return statement314 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // nesC.g:714:5: ( declaration | statement )
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // nesC.g:714:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_block_item6498);
                    declaration313=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration313.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:715:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_block_item6509);
                    statement314=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement314.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 59, block_item_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "block_item"


    public static class expression_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_statement"
    // nesC.g:721:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final nesCParser.expression_statement_return expression_statement() throws RecognitionException {
        nesCParser.expression_statement_return retval = new nesCParser.expression_statement_return();
        retval.start = input.LT(1);

        int expression_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal316=null;
        nesCParser.expression_return expression315 =null;


        Object char_literal316_tree=null;
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // nesC.g:722:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // nesC.g:722:10: ( expression )? ';'
            {
            // nesC.g:722:10: ( expression )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==AMP||LA89_0==BITCOMPLEMENT||LA89_0==CALL||LA89_0==CHARACTER_LITERAL||LA89_0==CONSTANT||LA89_0==LPARENS||LA89_0==MINUS||LA89_0==MINUSMINUS||LA89_0==NOT||LA89_0==PLUS||LA89_0==PLUSPLUS||LA89_0==POST||LA89_0==RAW_IDENTIFIER||LA89_0==SIGNAL||LA89_0==SIZEOF||LA89_0==STAR||LA89_0==STRING_LITERAL) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // nesC.g:722:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement6532);
                    expression315=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression315.getTree());

                    }
                    break;

            }


            char_literal316=(Token)match(input,190,FOLLOW_190_in_expression_statement6535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_190.add(char_literal316);


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
            // 722:26: -> ^( STATEMENT ( expression )? )
            {
                // nesC.g:722:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // nesC.g:722:41: ( expression )?
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
            if ( state.backtracking>0 ) { memoize(input, 60, expression_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression_statement"


    public static class selection_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_statement"
    // nesC.g:724:1: selection_statement : ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final nesCParser.selection_statement_return selection_statement() throws RecognitionException {
        nesCParser.selection_statement_return retval = new nesCParser.selection_statement_return();
        retval.start = input.LT(1);

        int selection_statement_StartIndex = input.index();

        Object root_0 = null;

        Token IF317=null;
        Token char_literal318=null;
        Token char_literal320=null;
        Token ELSE322=null;
        Token SWITCH324=null;
        Token char_literal325=null;
        Token char_literal327=null;
        nesCParser.expression_return expression319 =null;

        nesCParser.statement_return statement321 =null;

        nesCParser.statement_return statement323 =null;

        nesCParser.expression_return expression326 =null;

        nesCParser.statement_return statement328 =null;


        Object IF317_tree=null;
        Object char_literal318_tree=null;
        Object char_literal320_tree=null;
        Object ELSE322_tree=null;
        Object SWITCH324_tree=null;
        Object char_literal325_tree=null;
        Object char_literal327_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // nesC.g:725:5: ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==IF) ) {
                alt91=1;
            }
            else if ( (LA91_0==SWITCH) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;

            }
            switch (alt91) {
                case 1 :
                    // nesC.g:725:10: IF '(' expression ')' statement ( ELSE statement )?
                    {
                    IF317=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF317);


                    char_literal318=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6565); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal318);


                    pushFollow(FOLLOW_expression_in_selection_statement6567);
                    expression319=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression319.getTree());

                    char_literal320=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal320);


                    pushFollow(FOLLOW_statement_in_selection_statement6571);
                    statement321=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement321.getTree());

                    // nesC.g:725:42: ( ELSE statement )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==ELSE) ) {
                        int LA90_1 = input.LA(2);

                        if ( (synpred177_nesC()) ) {
                            alt90=1;
                        }
                    }
                    switch (alt90) {
                        case 1 :
                            // nesC.g:725:43: ELSE statement
                            {
                            ELSE322=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement6574); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE322);


                            pushFollow(FOLLOW_statement_in_selection_statement6576);
                            statement323=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(statement323.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expression, statement, statement, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 726:14: -> ^( IF expression statement ( statement )? )
                    {
                        // nesC.g:726:17: ^( IF expression statement ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        // nesC.g:726:43: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:727:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH324=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement6615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH324);


                    char_literal325=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6617); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal325);


                    pushFollow(FOLLOW_expression_in_selection_statement6619);
                    expression326=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression326.getTree());

                    char_literal327=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal327);


                    pushFollow(FOLLOW_statement_in_selection_statement6623);
                    statement328=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement328.getTree());

                    // AST REWRITE
                    // elements: SWITCH, expression, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 728:14: -> ^( SWITCH expression statement )
                    {
                        // nesC.g:728:17: ^( SWITCH expression statement )
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
            if ( state.backtracking>0 ) { memoize(input, 61, selection_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "selection_statement"


    public static class iteration_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_statement"
    // nesC.g:734:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final nesCParser.iteration_statement_return iteration_statement() throws RecognitionException {
        nesCParser.iteration_statement_return retval = new nesCParser.iteration_statement_return();
        retval.start = input.LT(1);

        int iteration_statement_StartIndex = input.index();

        Object root_0 = null;

        Token WHILE329=null;
        Token char_literal330=null;
        Token char_literal332=null;
        Token DO334=null;
        Token WHILE336=null;
        Token char_literal337=null;
        Token char_literal339=null;
        Token char_literal340=null;
        Token FOR341=null;
        Token char_literal342=null;
        Token char_literal343=null;
        Token char_literal344=null;
        Token char_literal345=null;
        nesCParser.expression_return init =null;

        nesCParser.expression_return cond =null;

        nesCParser.expression_return iter =null;

        nesCParser.expression_return expression331 =null;

        nesCParser.statement_return statement333 =null;

        nesCParser.statement_return statement335 =null;

        nesCParser.expression_return expression338 =null;

        nesCParser.statement_return statement346 =null;


        Object WHILE329_tree=null;
        Object char_literal330_tree=null;
        Object char_literal332_tree=null;
        Object DO334_tree=null;
        Object WHILE336_tree=null;
        Object char_literal337_tree=null;
        Object char_literal339_tree=null;
        Object char_literal340_tree=null;
        Object FOR341_tree=null;
        Object char_literal342_tree=null;
        Object char_literal343_tree=null;
        Object char_literal344_tree=null;
        Object char_literal345_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // nesC.g:735:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
            int alt95=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt95=1;
                }
                break;
            case DO:
                {
                alt95=2;
                }
                break;
            case FOR:
                {
                alt95=3;
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
                    // nesC.g:735:10: WHILE '(' expression ')' statement
                    {
                    WHILE329=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE329);


                    char_literal330=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal330);


                    pushFollow(FOLLOW_expression_in_iteration_statement6673);
                    expression331=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression331.getTree());

                    char_literal332=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal332);


                    pushFollow(FOLLOW_statement_in_iteration_statement6677);
                    statement333=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement333.getTree());

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
                    // 735:45: -> ^( WHILE expression statement )
                    {
                        // nesC.g:735:48: ^( WHILE expression statement )
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
                    // nesC.g:736:10: DO statement WHILE '(' expression ')' ';'
                    {
                    DO334=(Token)match(input,DO,FOLLOW_DO_in_iteration_statement6698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO334);


                    pushFollow(FOLLOW_statement_in_iteration_statement6700);
                    statement335=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement335.getTree());

                    WHILE336=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE336);


                    char_literal337=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal337);


                    pushFollow(FOLLOW_expression_in_iteration_statement6706);
                    expression338=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression338.getTree());

                    char_literal339=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6708); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal339);


                    char_literal340=(Token)match(input,190,FOLLOW_190_in_iteration_statement6710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal340);


                    // AST REWRITE
                    // elements: expression, DO, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 736:52: -> ^( DO statement expression )
                    {
                        // nesC.g:736:55: ^( DO statement expression )
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
                    // nesC.g:737:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR341=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement6731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR341);


                    char_literal342=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal342);


                    // nesC.g:737:22: (init= expression )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==AMP||LA92_0==BITCOMPLEMENT||LA92_0==CALL||LA92_0==CHARACTER_LITERAL||LA92_0==CONSTANT||LA92_0==LPARENS||LA92_0==MINUS||LA92_0==MINUSMINUS||LA92_0==NOT||LA92_0==PLUS||LA92_0==PLUSPLUS||LA92_0==POST||LA92_0==RAW_IDENTIFIER||LA92_0==SIGNAL||LA92_0==SIZEOF||LA92_0==STAR||LA92_0==STRING_LITERAL) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // nesC.g:737:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6737);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal343=(Token)match(input,190,FOLLOW_190_in_iteration_statement6740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal343);


                    // nesC.g:737:43: (cond= expression )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==AMP||LA93_0==BITCOMPLEMENT||LA93_0==CALL||LA93_0==CHARACTER_LITERAL||LA93_0==CONSTANT||LA93_0==LPARENS||LA93_0==MINUS||LA93_0==MINUSMINUS||LA93_0==NOT||LA93_0==PLUS||LA93_0==PLUSPLUS||LA93_0==POST||LA93_0==RAW_IDENTIFIER||LA93_0==SIGNAL||LA93_0==SIZEOF||LA93_0==STAR||LA93_0==STRING_LITERAL) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // nesC.g:737:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6744);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal344=(Token)match(input,190,FOLLOW_190_in_iteration_statement6747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal344);


                    // nesC.g:737:64: (iter= expression )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==AMP||LA94_0==BITCOMPLEMENT||LA94_0==CALL||LA94_0==CHARACTER_LITERAL||LA94_0==CONSTANT||LA94_0==LPARENS||LA94_0==MINUS||LA94_0==MINUSMINUS||LA94_0==NOT||LA94_0==PLUS||LA94_0==PLUSPLUS||LA94_0==POST||LA94_0==RAW_IDENTIFIER||LA94_0==SIGNAL||LA94_0==SIZEOF||LA94_0==STAR||LA94_0==STRING_LITERAL) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // nesC.g:737:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6751);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal345=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal345);


                    pushFollow(FOLLOW_statement_in_iteration_statement6756);
                    statement346=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement346.getTree());

                    // AST REWRITE
                    // elements: cond, init, iter, statement, FOR
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
                    // 738:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // nesC.g:738:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // nesC.g:738:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // nesC.g:738:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:739:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // nesC.g:739:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:740:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // nesC.g:740:40: ( $iter)?
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
            if ( state.backtracking>0 ) { memoize(input, 62, iteration_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "iteration_statement"


    public static class jump_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_statement"
    // nesC.g:742:1: jump_statement : ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) );
    public final nesCParser.jump_statement_return jump_statement() throws RecognitionException {
        nesCParser.jump_statement_return retval = new nesCParser.jump_statement_return();
        retval.start = input.LT(1);

        int jump_statement_StartIndex = input.index();

        Object root_0 = null;

        Token GOTO347=null;
        Token char_literal349=null;
        Token CONTINUE350=null;
        Token char_literal351=null;
        Token BREAK352=null;
        Token char_literal353=null;
        Token RETURN354=null;
        Token char_literal356=null;
        nesCParser.identifier_return identifier348 =null;

        nesCParser.expression_return expression355 =null;


        Object GOTO347_tree=null;
        Object char_literal349_tree=null;
        Object CONTINUE350_tree=null;
        Object char_literal351_tree=null;
        Object BREAK352_tree=null;
        Object char_literal353_tree=null;
        Object RETURN354_tree=null;
        Object char_literal356_tree=null;
        RewriteRuleTokenStream stream_GOTO=new RewriteRuleTokenStream(adaptor,"token GOTO");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // nesC.g:743:5: ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
            int alt97=4;
            switch ( input.LA(1) ) {
            case GOTO:
                {
                alt97=1;
                }
                break;
            case CONTINUE:
                {
                alt97=2;
                }
                break;
            case BREAK:
                {
                alt97=3;
                }
                break;
            case RETURN:
                {
                alt97=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;

            }

            switch (alt97) {
                case 1 :
                    // nesC.g:743:10: GOTO identifier ';'
                    {
                    GOTO347=(Token)match(input,GOTO,FOLLOW_GOTO_in_jump_statement6863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GOTO.add(GOTO347);


                    pushFollow(FOLLOW_identifier_in_jump_statement6865);
                    identifier348=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier348.getTree());

                    char_literal349=(Token)match(input,190,FOLLOW_190_in_jump_statement6867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal349);


                    // AST REWRITE
                    // elements: GOTO, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 743:30: -> ^( GOTO identifier )
                    {
                        // nesC.g:743:33: ^( GOTO identifier )
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
                    // nesC.g:744:10: CONTINUE ';'
                    {
                    CONTINUE350=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement6886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE350);


                    char_literal351=(Token)match(input,190,FOLLOW_190_in_jump_statement6888); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal351);


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
                    // 744:23: -> CONTINUE
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
                    // nesC.g:745:10: BREAK ';'
                    {
                    BREAK352=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement6903); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK352);


                    char_literal353=(Token)match(input,190,FOLLOW_190_in_jump_statement6905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal353);


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
                    // 745:20: -> BREAK
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
                    // nesC.g:746:10: RETURN ( expression )? ';'
                    {
                    RETURN354=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement6920); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN354);


                    // nesC.g:746:17: ( expression )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==AMP||LA96_0==BITCOMPLEMENT||LA96_0==CALL||LA96_0==CHARACTER_LITERAL||LA96_0==CONSTANT||LA96_0==LPARENS||LA96_0==MINUS||LA96_0==MINUSMINUS||LA96_0==NOT||LA96_0==PLUS||LA96_0==PLUSPLUS||LA96_0==POST||LA96_0==RAW_IDENTIFIER||LA96_0==SIGNAL||LA96_0==SIZEOF||LA96_0==STAR||LA96_0==STRING_LITERAL) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // nesC.g:746:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_jump_statement6922);
                            expression355=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression355.getTree());

                            }
                            break;

                    }


                    char_literal356=(Token)match(input,190,FOLLOW_190_in_jump_statement6925); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal356);


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
                    // 746:33: -> ^( RETURN ( expression )? )
                    {
                        // nesC.g:746:36: ^( RETURN ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_RETURN.nextNode()
                        , root_1);

                        // nesC.g:746:45: ( expression )?
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
            if ( state.backtracking>0 ) { memoize(input, 63, jump_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "jump_statement"


    public static class translation_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "translation_unit"
    // nesC.g:752:1: translation_unit : ( line_directive | external_declaration )+ ;
    public final nesCParser.translation_unit_return translation_unit() throws RecognitionException {
        nesCParser.translation_unit_return retval = new nesCParser.translation_unit_return();
        retval.start = input.LT(1);

        int translation_unit_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.line_directive_return line_directive357 =null;

        nesCParser.external_declaration_return external_declaration358 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // nesC.g:753:5: ( ( line_directive | external_declaration )+ )
            // nesC.g:753:10: ( line_directive | external_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:753:10: ( line_directive | external_declaration )+
            int cnt98=0;
            loop98:
            do {
                int alt98=3;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==HASH) ) {
                    alt98=1;
                }
                else if ( (LA98_0==ASYNC||LA98_0==AUTO||LA98_0==CHAR||LA98_0==COMMAND||LA98_0==CONST||LA98_0==DEFAULT||(LA98_0 >= DOUBLE && LA98_0 <= DUTY)||LA98_0==ENUM||(LA98_0 >= EVENT && LA98_0 <= EXTERN)||LA98_0==FLOAT||(LA98_0 >= INLINE && LA98_0 <= INT8_T)||LA98_0==LONG||LA98_0==NORACE||(LA98_0 >= NXLE_UINT16_T && LA98_0 <= NX_UNION)||LA98_0==RAW_IDENTIFIER||LA98_0==REGISTER||LA98_0==RESTRICT||LA98_0==SHORT||LA98_0==SIGNED||LA98_0==STATIC||LA98_0==STRUCT||(LA98_0 >= TASK && LA98_0 <= UINT8_T)||(LA98_0 >= UNION && LA98_0 <= UNSIGNED)||(LA98_0 >= VOID && LA98_0 <= VOLATILE)) ) {
                    alt98=2;
                }


                switch (alt98) {
            	case 1 :
            	    // nesC.g:753:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit6961);
            	    line_directive357=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive357.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:753:28: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit6965);
            	    external_declaration358=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration358.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt98 >= 1 ) break loop98;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(98, input);
                        throw eee;
                }
                cnt98++;
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
            if ( state.backtracking>0 ) { memoize(input, 64, translation_unit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "translation_unit"


    public static class external_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "external_declaration"
    // nesC.g:756:1: external_declaration : declaration ;
    public final nesCParser.external_declaration_return external_declaration() throws RecognitionException {
        nesCParser.external_declaration_return retval = new nesCParser.external_declaration_return();
        retval.start = input.LT(1);

        int external_declaration_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_return declaration359 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // nesC.g:757:5: ( declaration )
            // nesC.g:757:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration6983);
            declaration359=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration359.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 65, external_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "external_declaration"


    public static class line_directive_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line_directive"
    // nesC.g:771:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final nesCParser.line_directive_return line_directive() throws RecognitionException {
        nesCParser.line_directive_return retval = new nesCParser.line_directive_return();
        retval.start = input.LT(1);

        int line_directive_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal360=null;
        Token CONSTANT361=null;
        Token STRING_LITERAL362=null;
        Token CONSTANT363=null;

        Object char_literal360_tree=null;
        Object CONSTANT361_tree=null;
        Object STRING_LITERAL362_tree=null;
        Object CONSTANT363_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // nesC.g:772:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // nesC.g:772:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )*
            {
            char_literal360=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive7010); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal360);


            CONSTANT361=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7012); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT361);


            STRING_LITERAL362=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive7014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL362);


            // nesC.g:772:38: ( CONSTANT )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==CONSTANT) ) {
                    int LA99_2 = input.LA(2);

                    if ( (synpred190_nesC()) ) {
                        alt99=1;
                    }


                }


                switch (alt99) {
            	case 1 :
            	    // nesC.g:772:38: CONSTANT
            	    {
            	    CONSTANT363=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7016); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT363);


            	    }
            	    break;

            	default :
            	    break loop99;
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
            // 772:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // nesC.g:772:51: ^( LINE_DIRECTIVE STRING_LITERAL )
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
            if ( state.backtracking>0 ) { memoize(input, 66, line_directive_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "line_directive"


    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_definition"
    // nesC.g:774:1: function_definition : declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement ;
    public final nesCParser.function_definition_return function_definition() throws RecognitionException {
        nesCParser.function_definition_return retval = new nesCParser.function_definition_return();
        retval.start = input.LT(1);

        int function_definition_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers364 =null;

        nesCParser.declarator_return declarator365 =null;

        nesCParser.attributes_return attributes366 =null;

        nesCParser.compound_statement_return compound_statement367 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // nesC.g:775:5: ( declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement )
            // nesC.g:775:10: declaration_specifiers declarator ( attributes )? compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition7044);
            declaration_specifiers364=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers364.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition7046);
            declarator365=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator365.getTree());

            // nesC.g:775:44: ( attributes )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==ATTRIBUTE) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // nesC.g:775:44: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_function_definition7048);
                    attributes366=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes366.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compound_statement_in_function_definition7051);
            compound_statement367=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement367.getTree());

            // AST REWRITE
            // elements: attributes, declarator, declaration_specifiers, compound_statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 776:13: -> declaration_specifiers declarator ( attributes )? compound_statement
            {
                adaptor.addChild(root_0, stream_declaration_specifiers.nextTree());

                adaptor.addChild(root_0, stream_declarator.nextTree());

                // nesC.g:776:50: ( attributes )?
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
            if ( state.backtracking>0 ) { memoize(input, 67, function_definition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "function_definition"


    public static class nesC_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nesC_file"
    // nesC.g:786:1: nesC_file : ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) );
    public final nesCParser.nesC_file_return nesC_file() throws RecognitionException {
        nesCParser.nesC_file_return retval = new nesCParser.nesC_file_return();
        retval.start = input.LT(1);

        int nesC_file_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit368 =null;

        nesCParser.interface_definition_return interface_definition369 =null;

        nesCParser.translation_unit_return translation_unit370 =null;

        nesCParser.component_return component371 =null;


        RewriteRuleSubtreeStream stream_component=new RewriteRuleSubtreeStream(adaptor,"rule component");
        RewriteRuleSubtreeStream stream_interface_definition=new RewriteRuleSubtreeStream(adaptor,"rule interface_definition");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // nesC.g:787:5: ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) )
            int alt103=2;
            switch ( input.LA(1) ) {
            case HASH:
                {
                int LA103_1 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 1, input);

                    throw nvae;

                }
                }
                break;
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
                int LA103_2 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 2, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA103_3 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 3, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA103_4 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 4, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA103_5 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 5, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA103_6 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 6, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA103_7 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 7, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA103_8 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 8, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA103_9 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 9, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA103_10 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 10, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA103_11 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 11, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA103_12 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 12, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA103_13 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 13, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA103_14 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 14, input);

                    throw nvae;

                }
                }
                break;
            case INT64_T:
                {
                int LA103_15 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 15, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA103_16 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 16, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA103_17 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 17, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA103_18 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 18, input);

                    throw nvae;

                }
                }
                break;
            case UINT64_T:
                {
                int LA103_19 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 19, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA103_20 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 20, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA103_21 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 21, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA103_22 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 22, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT64_T:
                {
                int LA103_23 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 23, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT8_T:
                {
                int LA103_24 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 24, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT16_T:
                {
                int LA103_25 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 25, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT32_T:
                {
                int LA103_26 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 26, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA103_27 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 27, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA103_28 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 28, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA103_29 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 29, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA103_30 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 30, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA103_31 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 31, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA103_32 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 32, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA103_33 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 33, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA103_34 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 34, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                int LA103_35 = input.LA(2);

                if ( (synpred193_nesC()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 35, input);

                    throw nvae;

                }
                }
                break;
            case INTERFACE:
                {
                alt103=1;
                }
                break;
            case COMPONENT:
            case CONFIGURATION:
            case GENERIC:
            case MODULE:
                {
                alt103=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }

            switch (alt103) {
                case 1 :
                    // nesC.g:787:10: ( translation_unit )? interface_definition
                    {
                    // nesC.g:787:10: ( translation_unit )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==ASYNC||LA101_0==AUTO||LA101_0==CHAR||LA101_0==COMMAND||LA101_0==CONST||LA101_0==DEFAULT||(LA101_0 >= DOUBLE && LA101_0 <= DUTY)||LA101_0==ENUM||(LA101_0 >= EVENT && LA101_0 <= EXTERN)||LA101_0==FLOAT||LA101_0==HASH||(LA101_0 >= INLINE && LA101_0 <= INT8_T)||LA101_0==LONG||LA101_0==NORACE||(LA101_0 >= NXLE_UINT16_T && LA101_0 <= NX_UNION)||LA101_0==RAW_IDENTIFIER||LA101_0==REGISTER||LA101_0==RESTRICT||LA101_0==SHORT||LA101_0==SIGNED||LA101_0==STATIC||LA101_0==STRUCT||(LA101_0 >= TASK && LA101_0 <= UINT8_T)||(LA101_0 >= UNION && LA101_0 <= UNSIGNED)||(LA101_0 >= VOID && LA101_0 <= VOLATILE)) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // nesC.g:787:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_nesC_file7100);
                            translation_unit368=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit368.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_interface_definition_in_nesC_file7103);
                    interface_definition369=interface_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_definition.add(interface_definition369.getTree());

                    // AST REWRITE
                    // elements: translation_unit, interface_definition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 787:49: -> ^( FILE ( translation_unit )? interface_definition )
                    {
                        // nesC.g:787:52: ^( FILE ( translation_unit )? interface_definition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // nesC.g:787:59: ( translation_unit )?
                        if ( stream_translation_unit.hasNext() ) {
                            adaptor.addChild(root_1, stream_translation_unit.nextTree());

                        }
                        stream_translation_unit.reset();

                        adaptor.addChild(root_1, stream_interface_definition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:788:10: ( translation_unit )? component
                    {
                    // nesC.g:788:10: ( translation_unit )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==ASYNC||LA102_0==AUTO||LA102_0==CHAR||LA102_0==COMMAND||LA102_0==CONST||LA102_0==DEFAULT||(LA102_0 >= DOUBLE && LA102_0 <= DUTY)||LA102_0==ENUM||(LA102_0 >= EVENT && LA102_0 <= EXTERN)||LA102_0==FLOAT||LA102_0==HASH||(LA102_0 >= INLINE && LA102_0 <= INT8_T)||LA102_0==LONG||LA102_0==NORACE||(LA102_0 >= NXLE_UINT16_T && LA102_0 <= NX_UNION)||LA102_0==RAW_IDENTIFIER||LA102_0==REGISTER||LA102_0==RESTRICT||LA102_0==SHORT||LA102_0==SIGNED||LA102_0==STATIC||LA102_0==STRUCT||(LA102_0 >= TASK && LA102_0 <= UINT8_T)||(LA102_0 >= UNION && LA102_0 <= UNSIGNED)||(LA102_0 >= VOID && LA102_0 <= VOLATILE)) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // nesC.g:788:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_nesC_file7125);
                            translation_unit370=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit370.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_component_in_nesC_file7128);
                    component371=component();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component.add(component371.getTree());

                    // AST REWRITE
                    // elements: translation_unit, component
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 788:49: -> ^( FILE ( translation_unit )? component )
                    {
                        // nesC.g:788:52: ^( FILE ( translation_unit )? component )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // nesC.g:788:59: ( translation_unit )?
                        if ( stream_translation_unit.hasNext() ) {
                            adaptor.addChild(root_1, stream_translation_unit.nextTree());

                        }
                        stream_translation_unit.reset();

                        adaptor.addChild(root_1, stream_component.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 68, nesC_file_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "nesC_file"


    public static class interface_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_definition"
    // nesC.g:797:1: interface_definition : INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}' -> ^( INTERFACE identifier ( declaration )* ) ;
    public final nesCParser.interface_definition_return interface_definition() throws RecognitionException {
        nesCParser.interface_definition_return retval = new nesCParser.interface_definition_return();
        retval.start = input.LT(1);

        int interface_definition_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE372=null;
        Token char_literal376=null;
        Token char_literal379=null;
        nesCParser.identifier_return identifier373 =null;

        nesCParser.type_parameters_return type_parameters374 =null;

        nesCParser.attributes_return attributes375 =null;

        nesCParser.line_directive_return line_directive377 =null;

        nesCParser.declaration_return declaration378 =null;


        Object INTERFACE372_tree=null;
        Object char_literal376_tree=null;
        Object char_literal379_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_type_parameters=new RewriteRuleSubtreeStream(adaptor,"rule type_parameters");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // nesC.g:798:5: ( INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}' -> ^( INTERFACE identifier ( declaration )* ) )
            // nesC.g:798:10: INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}'
            {
            INTERFACE372=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_definition7176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE372);


            pushFollow(FOLLOW_identifier_in_interface_definition7178);
            identifier373=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier373.getTree());

            // nesC.g:798:31: ( type_parameters )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==LESS) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // nesC.g:798:31: type_parameters
                    {
                    pushFollow(FOLLOW_type_parameters_in_interface_definition7180);
                    type_parameters374=type_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_parameters.add(type_parameters374.getTree());

                    }
                    break;

            }


            // nesC.g:798:48: ( attributes )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==ATTRIBUTE) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // nesC.g:798:48: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_interface_definition7183);
                    attributes375=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes375.getTree());

                    }
                    break;

            }


            char_literal376=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interface_definition7194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal376);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:800:9: ( line_directive | declaration )*
            loop106:
            do {
                int alt106=3;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==HASH) ) {
                    alt106=1;
                }
                else if ( (LA106_0==ASYNC||LA106_0==AUTO||LA106_0==CHAR||LA106_0==COMMAND||LA106_0==CONST||LA106_0==DEFAULT||(LA106_0 >= DOUBLE && LA106_0 <= DUTY)||LA106_0==ENUM||(LA106_0 >= EVENT && LA106_0 <= EXTERN)||LA106_0==FLOAT||(LA106_0 >= INLINE && LA106_0 <= INT8_T)||LA106_0==LONG||LA106_0==NORACE||(LA106_0 >= NXLE_UINT16_T && LA106_0 <= NX_UNION)||LA106_0==RAW_IDENTIFIER||LA106_0==REGISTER||LA106_0==RESTRICT||LA106_0==SHORT||LA106_0==SIGNED||LA106_0==STATIC||LA106_0==STRUCT||(LA106_0 >= TASK && LA106_0 <= UINT8_T)||(LA106_0 >= UNION && LA106_0 <= UNSIGNED)||(LA106_0 >= VOID && LA106_0 <= VOLATILE)) ) {
                    alt106=2;
                }


                switch (alt106) {
            	case 1 :
            	    // nesC.g:800:10: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_interface_definition7207);
            	    line_directive377=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive377.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:800:27: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_interface_definition7211);
            	    declaration378=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration378.getTree());

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal379=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interface_definition7229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal379);


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
            // 802:13: -> ^( INTERFACE identifier ( declaration )* )
            {
                // nesC.g:802:16: ^( INTERFACE identifier ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:802:39: ( declaration )*
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
            if ( state.backtracking>0 ) { memoize(input, 69, interface_definition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interface_definition"


    public static class type_parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_parameters"
    // nesC.g:804:1: type_parameters : '<' type_parameter_list '>' ;
    public final nesCParser.type_parameters_return type_parameters() throws RecognitionException {
        nesCParser.type_parameters_return retval = new nesCParser.type_parameters_return();
        retval.start = input.LT(1);

        int type_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal380=null;
        Token char_literal382=null;
        nesCParser.type_parameter_list_return type_parameter_list381 =null;


        Object char_literal380_tree=null;
        Object char_literal382_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // nesC.g:805:5: ( '<' type_parameter_list '>' )
            // nesC.g:805:10: '<' type_parameter_list '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal380=(Token)match(input,LESS,FOLLOW_LESS_in_type_parameters7271); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal380_tree = 
            (Object)adaptor.create(char_literal380)
            ;
            adaptor.addChild(root_0, char_literal380_tree);
            }

            pushFollow(FOLLOW_type_parameter_list_in_type_parameters7273);
            type_parameter_list381=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_parameter_list381.getTree());

            char_literal382=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_parameters7275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal382_tree = 
            (Object)adaptor.create(char_literal382)
            ;
            adaptor.addChild(root_0, char_literal382_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 70, type_parameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_parameters"


    public static class type_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_parameter_list"
    // nesC.g:807:1: type_parameter_list : type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* ;
    public final nesCParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        nesCParser.type_parameter_list_return retval = new nesCParser.type_parameter_list_return();
        retval.start = input.LT(1);

        int type_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal385=null;
        nesCParser.type_specifier_return type_specifier383 =null;

        nesCParser.attributes_return attributes384 =null;

        nesCParser.type_specifier_return type_specifier386 =null;

        nesCParser.attributes_return attributes387 =null;


        Object char_literal385_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // nesC.g:808:5: ( type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* )
            // nesC.g:808:10: type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_specifier_in_type_parameter_list7294);
            type_specifier383=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier383.getTree());

            // nesC.g:808:25: ( attributes )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==ATTRIBUTE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // nesC.g:808:25: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_type_parameter_list7296);
                    attributes384=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes384.getTree());

                    }
                    break;

            }


            // nesC.g:808:37: ( ',' type_specifier ( attributes )? )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==COMMA) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // nesC.g:808:38: ',' type_specifier ( attributes )?
            	    {
            	    char_literal385=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_parameter_list7300); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal385_tree = 
            	    (Object)adaptor.create(char_literal385)
            	    ;
            	    adaptor.addChild(root_0, char_literal385_tree);
            	    }

            	    pushFollow(FOLLOW_type_specifier_in_type_parameter_list7302);
            	    type_specifier386=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier386.getTree());

            	    // nesC.g:808:57: ( attributes )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==ATTRIBUTE) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // nesC.g:808:57: attributes
            	            {
            	            pushFollow(FOLLOW_attributes_in_type_parameter_list7304);
            	            attributes387=attributes();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes387.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
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
            if ( state.backtracking>0 ) { memoize(input, 71, type_parameter_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_parameter_list"


    public static class component_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component"
    // nesC.g:813:1: component : component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) ;
    public final nesCParser.component_return component() throws RecognitionException {
        nesCParser.component_return retval = new nesCParser.component_return();
        retval.start = input.LT(1);

        int component_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.component_kind_return component_kind388 =null;

        nesCParser.identifier_return identifier389 =null;

        nesCParser.component_parameters_return component_parameters390 =null;

        nesCParser.attributes_return attributes391 =null;

        nesCParser.component_specification_return component_specification392 =null;

        nesCParser.implementation_return implementation393 =null;


        RewriteRuleSubtreeStream stream_component_parameters=new RewriteRuleSubtreeStream(adaptor,"rule component_parameters");
        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_component_kind=new RewriteRuleSubtreeStream(adaptor,"rule component_kind");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // nesC.g:814:5: ( component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) )
            // nesC.g:814:9: component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )?
            {
            pushFollow(FOLLOW_component_kind_in_component7326);
            component_kind388=component_kind();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_kind.add(component_kind388.getTree());

            pushFollow(FOLLOW_identifier_in_component7328);
            identifier389=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier389.getTree());

            // nesC.g:814:35: ( component_parameters )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==LPARENS) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // nesC.g:814:35: component_parameters
                    {
                    pushFollow(FOLLOW_component_parameters_in_component7330);
                    component_parameters390=component_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameters.add(component_parameters390.getTree());

                    }
                    break;

            }


            // nesC.g:814:57: ( attributes )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ATTRIBUTE) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // nesC.g:814:57: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_component7333);
                    attributes391=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes391.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_component_specification_in_component7344);
            component_specification392=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification392.getTree());

            // nesC.g:816:9: ( implementation )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==IMPLEMENTATION) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // nesC.g:816:9: implementation
                    {
                    pushFollow(FOLLOW_implementation_in_component7354);
                    implementation393=implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementation.add(implementation393.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: component_specification, component_kind, implementation, identifier, component_parameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 816:25: -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
            {
                // nesC.g:816:28: ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DEFINITION, "COMPONENT_DEFINITION")
                , root_1);

                adaptor.addChild(root_1, stream_component_kind.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_component_specification.nextTree());

                // nesC.g:816:101: ( implementation )?
                if ( stream_implementation.hasNext() ) {
                    adaptor.addChild(root_1, stream_implementation.nextTree());

                }
                stream_implementation.reset();

                // nesC.g:816:117: ( component_parameters )?
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
            if ( state.backtracking>0 ) { memoize(input, 72, component_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component"


    public static class component_kind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_kind"
    // nesC.g:821:1: component_kind : ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) );
    public final nesCParser.component_kind_return component_kind() throws RecognitionException {
        nesCParser.component_kind_return retval = new nesCParser.component_kind_return();
        retval.start = input.LT(1);

        int component_kind_StartIndex = input.index();

        Object root_0 = null;

        Token MODULE394=null;
        Token CONFIGURATION395=null;
        Token COMPONENT396=null;
        Token GENERIC397=null;
        Token MODULE398=null;
        Token GENERIC399=null;
        Token CONFIGURATION400=null;

        Object MODULE394_tree=null;
        Object CONFIGURATION395_tree=null;
        Object COMPONENT396_tree=null;
        Object GENERIC397_tree=null;
        Object MODULE398_tree=null;
        Object GENERIC399_tree=null;
        Object CONFIGURATION400_tree=null;
        RewriteRuleTokenStream stream_CONFIGURATION=new RewriteRuleTokenStream(adaptor,"token CONFIGURATION");
        RewriteRuleTokenStream stream_GENERIC=new RewriteRuleTokenStream(adaptor,"token GENERIC");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_COMPONENT=new RewriteRuleTokenStream(adaptor,"token COMPONENT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // nesC.g:822:5: ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) )
            int alt113=5;
            switch ( input.LA(1) ) {
            case MODULE:
                {
                alt113=1;
                }
                break;
            case CONFIGURATION:
                {
                alt113=2;
                }
                break;
            case COMPONENT:
                {
                alt113=3;
                }
                break;
            case GENERIC:
                {
                int LA113_4 = input.LA(2);

                if ( (LA113_4==MODULE) ) {
                    alt113=4;
                }
                else if ( (LA113_4==CONFIGURATION) ) {
                    alt113=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }

            switch (alt113) {
                case 1 :
                    // nesC.g:822:10: MODULE
                    {
                    MODULE394=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE394);


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
                    // 822:32: -> ^( COMPONENT_KIND MODULE )
                    {
                        // nesC.g:822:35: ^( COMPONENT_KIND MODULE )
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
                    // nesC.g:823:10: CONFIGURATION
                    {
                    CONFIGURATION395=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION395);


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
                    // 823:32: -> ^( COMPONENT_KIND CONFIGURATION )
                    {
                        // nesC.g:823:35: ^( COMPONENT_KIND CONFIGURATION )
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
                    // nesC.g:824:10: COMPONENT
                    {
                    COMPONENT396=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_component_kind7452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMPONENT.add(COMPONENT396);


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
                    // 824:32: -> ^( COMPONENT_KIND COMPONENT )
                    {
                        // nesC.g:824:35: ^( COMPONENT_KIND COMPONENT )
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
                    // nesC.g:825:10: GENERIC MODULE
                    {
                    GENERIC397=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC397);


                    MODULE398=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE398);


                    // AST REWRITE
                    // elements: MODULE, GENERIC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 825:32: -> ^( COMPONENT_KIND GENERIC MODULE )
                    {
                        // nesC.g:825:35: ^( COMPONENT_KIND GENERIC MODULE )
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
                    // nesC.g:826:10: GENERIC CONFIGURATION
                    {
                    GENERIC399=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC399);


                    CONFIGURATION400=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION400);


                    // AST REWRITE
                    // elements: GENERIC, CONFIGURATION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 826:32: -> ^( COMPONENT_KIND GENERIC CONFIGURATION )
                    {
                        // nesC.g:826:35: ^( COMPONENT_KIND GENERIC CONFIGURATION )
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
            if ( state.backtracking>0 ) { memoize(input, 73, component_kind_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_kind"


    public static class implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementation"
    // nesC.g:828:1: implementation : ( module_implementation | configuration_implementation );
    public final nesCParser.implementation_return implementation() throws RecognitionException {
        nesCParser.implementation_return retval = new nesCParser.implementation_return();
        retval.start = input.LT(1);

        int implementation_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.module_implementation_return module_implementation401 =null;

        nesCParser.configuration_implementation_return configuration_implementation402 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // nesC.g:829:5: ( module_implementation | configuration_implementation )
            int alt114=2;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // nesC.g:829:10: module_implementation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_module_implementation_in_implementation7544);
                    module_implementation401=module_implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, module_implementation401.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:830:10: configuration_implementation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_configuration_implementation_in_implementation7555);
                    configuration_implementation402=configuration_implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_implementation402.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 74, implementation_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "implementation"


    public static class component_parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_parameters"
    // nesC.g:836:1: component_parameters : '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) ;
    public final nesCParser.component_parameters_return component_parameters() throws RecognitionException {
        nesCParser.component_parameters_return retval = new nesCParser.component_parameters_return();
        retval.start = input.LT(1);

        int component_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal403=null;
        Token char_literal405=null;
        nesCParser.component_parameter_list_return component_parameter_list404 =null;


        Object char_literal403_tree=null;
        Object char_literal405_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // nesC.g:837:5: ( '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) )
            // nesC.g:837:10: '(' ( component_parameter_list )? ')'
            {
            char_literal403=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_parameters7574); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPARENS.add(char_literal403);


            // nesC.g:837:14: ( component_parameter_list )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==ASYNC||LA115_0==AUTO||LA115_0==CHAR||LA115_0==COMMAND||LA115_0==CONST||LA115_0==DEFAULT||(LA115_0 >= DOUBLE && LA115_0 <= DUTY)||LA115_0==ENUM||(LA115_0 >= EVENT && LA115_0 <= EXTERN)||LA115_0==FLOAT||(LA115_0 >= INLINE && LA115_0 <= INT8_T)||LA115_0==LONG||LA115_0==NORACE||(LA115_0 >= NXLE_UINT16_T && LA115_0 <= NX_UNION)||LA115_0==RAW_IDENTIFIER||LA115_0==REGISTER||LA115_0==RESTRICT||LA115_0==SHORT||LA115_0==SIGNED||LA115_0==STATIC||LA115_0==STRUCT||(LA115_0 >= TASK && LA115_0 <= UINT8_T)||(LA115_0 >= UNION && LA115_0 <= UNSIGNED)||(LA115_0 >= VOID && LA115_0 <= VOLATILE)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // nesC.g:837:14: component_parameter_list
                    {
                    pushFollow(FOLLOW_component_parameter_list_in_component_parameters7576);
                    component_parameter_list404=component_parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameter_list.add(component_parameter_list404.getTree());

                    }
                    break;

            }


            char_literal405=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_parameters7579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPARENS.add(char_literal405);


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
            // 838:13: -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
            {
                // nesC.g:838:16: ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_PARAMETER_LIST, "COMPONENT_PARAMETER_LIST")
                , root_1);

                // nesC.g:838:43: ( component_parameter_list )?
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
            if ( state.backtracking>0 ) { memoize(input, 75, component_parameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_parameters"


    public static class component_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_parameter_list"
    // nesC.g:840:1: component_parameter_list : component_parameter ( ',' component_parameter )* -> ( component_parameter )+ ;
    public final nesCParser.component_parameter_list_return component_parameter_list() throws RecognitionException {
        nesCParser.component_parameter_list_return retval = new nesCParser.component_parameter_list_return();
        retval.start = input.LT(1);

        int component_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal407=null;
        nesCParser.component_parameter_return component_parameter406 =null;

        nesCParser.component_parameter_return component_parameter408 =null;


        Object char_literal407_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_parameter=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // nesC.g:841:5: ( component_parameter ( ',' component_parameter )* -> ( component_parameter )+ )
            // nesC.g:841:10: component_parameter ( ',' component_parameter )*
            {
            pushFollow(FOLLOW_component_parameter_in_component_parameter_list7619);
            component_parameter406=component_parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter406.getTree());

            // nesC.g:841:30: ( ',' component_parameter )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==COMMA) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // nesC.g:841:31: ',' component_parameter
            	    {
            	    char_literal407=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_parameter_list7622); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal407);


            	    pushFollow(FOLLOW_component_parameter_in_component_parameter_list7624);
            	    component_parameter408=component_parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter408.getTree());

            	    }
            	    break;

            	default :
            	    break loop116;
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
            // 841:57: -> ( component_parameter )+
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
            if ( state.backtracking>0 ) { memoize(input, 76, component_parameter_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_parameter_list"


    public static class component_parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_parameter"
    // nesC.g:843:1: component_parameter : ( parameter_declaration | TYPEDEF identifier ( attributes )? );
    public final nesCParser.component_parameter_return component_parameter() throws RecognitionException {
        nesCParser.component_parameter_return retval = new nesCParser.component_parameter_return();
        retval.start = input.LT(1);

        int component_parameter_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF410=null;
        nesCParser.parameter_declaration_return parameter_declaration409 =null;

        nesCParser.identifier_return identifier411 =null;

        nesCParser.attributes_return attributes412 =null;


        Object TYPEDEF410_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // nesC.g:844:5: ( parameter_declaration | TYPEDEF identifier ( attributes )? )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==ASYNC||LA118_0==AUTO||LA118_0==CHAR||LA118_0==COMMAND||LA118_0==CONST||LA118_0==DEFAULT||(LA118_0 >= DOUBLE && LA118_0 <= DUTY)||LA118_0==ENUM||(LA118_0 >= EVENT && LA118_0 <= EXTERN)||LA118_0==FLOAT||(LA118_0 >= INLINE && LA118_0 <= INT8_T)||LA118_0==LONG||LA118_0==NORACE||(LA118_0 >= NXLE_UINT16_T && LA118_0 <= NX_UNION)||LA118_0==RAW_IDENTIFIER||LA118_0==REGISTER||LA118_0==RESTRICT||LA118_0==SHORT||LA118_0==SIGNED||LA118_0==STATIC||LA118_0==STRUCT||LA118_0==TASK||(LA118_0 >= UINT16_T && LA118_0 <= UINT8_T)||(LA118_0 >= UNION && LA118_0 <= UNSIGNED)||(LA118_0 >= VOID && LA118_0 <= VOLATILE)) ) {
                alt118=1;
            }
            else if ( (LA118_0==TYPEDEF) ) {
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
                    // nesC.g:844:10: parameter_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_parameter_declaration_in_component_parameter7650);
                    parameter_declaration409=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_declaration409.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:845:10: TYPEDEF identifier ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TYPEDEF410=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_component_parameter7661); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPEDEF410_tree = 
                    (Object)adaptor.create(TYPEDEF410)
                    ;
                    adaptor.addChild(root_0, TYPEDEF410_tree);
                    }

                    pushFollow(FOLLOW_identifier_in_component_parameter7663);
                    identifier411=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier411.getTree());

                    // nesC.g:845:29: ( attributes )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==ATTRIBUTE) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // nesC.g:845:29: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_component_parameter7665);
                            attributes412=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes412.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 77, component_parameter_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_parameter"


    public static class module_implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_implementation"
    // nesC.g:850:1: module_implementation : IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) ;
    public final nesCParser.module_implementation_return module_implementation() throws RecognitionException {
        nesCParser.module_implementation_return retval = new nesCParser.module_implementation_return();
        retval.start = input.LT(1);

        int module_implementation_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTATION413=null;
        Token char_literal414=null;
        Token char_literal416=null;
        nesCParser.translation_unit_return translation_unit415 =null;


        Object IMPLEMENTATION413_tree=null;
        Object char_literal414_tree=null;
        Object char_literal416_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // nesC.g:851:5: ( IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) )
            // nesC.g:851:10: IMPLEMENTATION '{' translation_unit '}'
            {
            IMPLEMENTATION413=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_module_implementation7688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION413);


            char_literal414=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_implementation7690); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal414);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_implementation7722);
            translation_unit415=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit415.getTree());

            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal416=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_implementation7778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal416);


            // AST REWRITE
            // elements: translation_unit, IMPLEMENTATION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 855:13: -> ^( IMPLEMENTATION translation_unit )
            {
                // nesC.g:855:16: ^( IMPLEMENTATION translation_unit )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLEMENTATION.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_translation_unit.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 78, module_implementation_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "module_implementation"


    public static class configuration_implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configuration_implementation"
    // nesC.g:858:1: configuration_implementation : IMPLEMENTATION '{' ( configuration_element_list )? '}' -> ^( IMPLEMENTATION ( configuration_element_list )? ) ;
    public final nesCParser.configuration_implementation_return configuration_implementation() throws RecognitionException {
        nesCParser.configuration_implementation_return retval = new nesCParser.configuration_implementation_return();
        retval.start = input.LT(1);

        int configuration_implementation_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTATION417=null;
        Token char_literal418=null;
        Token char_literal420=null;
        nesCParser.configuration_element_list_return configuration_element_list419 =null;


        Object IMPLEMENTATION417_tree=null;
        Object char_literal418_tree=null;
        Object char_literal420_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_configuration_element_list=new RewriteRuleSubtreeStream(adaptor,"rule configuration_element_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // nesC.g:859:5: ( IMPLEMENTATION '{' ( configuration_element_list )? '}' -> ^( IMPLEMENTATION ( configuration_element_list )? ) )
            // nesC.g:859:10: IMPLEMENTATION '{' ( configuration_element_list )? '}'
            {
            IMPLEMENTATION417=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_configuration_implementation7814); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION417);


            char_literal418=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_configuration_implementation7816); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal418);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:860:29: ( configuration_element_list )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==COMPONENTS||LA119_0==ENABLE||LA119_0==HASH||LA119_0==LBRACKET||LA119_0==RAW_IDENTIFIER) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // nesC.g:860:29: configuration_element_list
                    {
                    pushFollow(FOLLOW_configuration_element_list_in_configuration_implementation7848);
                    configuration_element_list419=configuration_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_configuration_element_list.add(configuration_element_list419.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal420=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_configuration_implementation7905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal420);


            // AST REWRITE
            // elements: IMPLEMENTATION, configuration_element_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 863:13: -> ^( IMPLEMENTATION ( configuration_element_list )? )
            {
                // nesC.g:863:16: ^( IMPLEMENTATION ( configuration_element_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLEMENTATION.nextNode()
                , root_1);

                // nesC.g:863:33: ( configuration_element_list )?
                if ( stream_configuration_element_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_configuration_element_list.nextTree());

                }
                stream_configuration_element_list.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 79, configuration_implementation_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "configuration_implementation"


    public static class configuration_element_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configuration_element_list"
    // nesC.g:865:1: configuration_element_list : ( line_directive | configuration_element )+ ;
    public final nesCParser.configuration_element_list_return configuration_element_list() throws RecognitionException {
        nesCParser.configuration_element_list_return retval = new nesCParser.configuration_element_list_return();
        retval.start = input.LT(1);

        int configuration_element_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.line_directive_return line_directive421 =null;

        nesCParser.configuration_element_return configuration_element422 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // nesC.g:866:5: ( ( line_directive | configuration_element )+ )
            // nesC.g:866:10: ( line_directive | configuration_element )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:866:10: ( line_directive | configuration_element )+
            int cnt120=0;
            loop120:
            do {
                int alt120=3;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==HASH) ) {
                    alt120=1;
                }
                else if ( (LA120_0==COMPONENTS||LA120_0==ENABLE||LA120_0==LBRACKET||LA120_0==RAW_IDENTIFIER) ) {
                    alt120=2;
                }


                switch (alt120) {
            	case 1 :
            	    // nesC.g:866:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_configuration_element_list7946);
            	    line_directive421=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive421.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:866:28: configuration_element
            	    {
            	    pushFollow(FOLLOW_configuration_element_in_configuration_element_list7950);
            	    configuration_element422=configuration_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element422.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt120 >= 1 ) break loop120;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(120, input);
                        throw eee;
                }
                cnt120++;
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
            if ( state.backtracking>0 ) { memoize(input, 80, configuration_element_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "configuration_element_list"


    public static class configuration_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configuration_element"
    // nesC.g:868:1: configuration_element : ( components | connection );
    public final nesCParser.configuration_element_return configuration_element() throws RecognitionException {
        nesCParser.configuration_element_return retval = new nesCParser.configuration_element_return();
        retval.start = input.LT(1);

        int configuration_element_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.components_return components423 =null;

        nesCParser.connection_return connection424 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // nesC.g:869:5: ( components | connection )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==COMPONENTS) ) {
                alt121=1;
            }
            else if ( (LA121_0==ENABLE||LA121_0==LBRACKET||LA121_0==RAW_IDENTIFIER) ) {
                alt121=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;

            }
            switch (alt121) {
                case 1 :
                    // nesC.g:869:10: components
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_components_in_configuration_element7971);
                    components423=components();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, components423.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:870:10: connection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_connection_in_configuration_element7982);
                    connection424=connection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connection424.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 81, configuration_element_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "configuration_element"


    public static class components_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "components"
    // nesC.g:878:1: components : COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) ;
    public final nesCParser.components_return components() throws RecognitionException {
        nesCParser.components_return retval = new nesCParser.components_return();
        retval.start = input.LT(1);

        int components_StartIndex = input.index();

        Object root_0 = null;

        Token COMPONENTS425=null;
        Token char_literal427=null;
        nesCParser.component_line_return component_line426 =null;


        Object COMPONENTS425_tree=null;
        Object char_literal427_tree=null;
        RewriteRuleTokenStream stream_COMPONENTS=new RewriteRuleTokenStream(adaptor,"token COMPONENTS");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_component_line=new RewriteRuleSubtreeStream(adaptor,"rule component_line");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // nesC.g:879:5: ( COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) )
            // nesC.g:879:10: COMPONENTS component_line ';'
            {
            COMPONENTS425=(Token)match(input,COMPONENTS,FOLLOW_COMPONENTS_in_components8027); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPONENTS.add(COMPONENTS425);


            pushFollow(FOLLOW_component_line_in_components8029);
            component_line426=component_line();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_line.add(component_line426.getTree());

            char_literal427=(Token)match(input,190,FOLLOW_190_in_components8031); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_190.add(char_literal427);


            // AST REWRITE
            // elements: COMPONENTS, component_line
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 879:40: -> ^( COMPONENTS component_line )
            {
                // nesC.g:879:43: ^( COMPONENTS component_line )
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
            if ( state.backtracking>0 ) { memoize(input, 82, components_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "components"


    public static class component_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_line"
    // nesC.g:881:1: component_line : component_declaration ( ',' component_declaration )* -> ( component_declaration )+ ;
    public final nesCParser.component_line_return component_line() throws RecognitionException {
        nesCParser.component_line_return retval = new nesCParser.component_line_return();
        retval.start = input.LT(1);

        int component_line_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal429=null;
        nesCParser.component_declaration_return component_declaration428 =null;

        nesCParser.component_declaration_return component_declaration430 =null;


        Object char_literal429_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_declaration=new RewriteRuleSubtreeStream(adaptor,"rule component_declaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // nesC.g:882:5: ( component_declaration ( ',' component_declaration )* -> ( component_declaration )+ )
            // nesC.g:882:10: component_declaration ( ',' component_declaration )*
            {
            pushFollow(FOLLOW_component_declaration_in_component_line8058);
            component_declaration428=component_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration428.getTree());

            // nesC.g:882:32: ( ',' component_declaration )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==COMMA) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // nesC.g:882:33: ',' component_declaration
            	    {
            	    char_literal429=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_line8061); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal429);


            	    pushFollow(FOLLOW_component_declaration_in_component_line8063);
            	    component_declaration430=component_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration430.getTree());

            	    }
            	    break;

            	default :
            	    break loop122;
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
            // 882:61: -> ( component_declaration )+
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
            if ( state.backtracking>0 ) { memoize(input, 83, component_line_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_line"


    public static class component_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_declaration"
    // nesC.g:884:1: component_declaration : component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) ;
    public final nesCParser.component_declaration_return component_declaration() throws RecognitionException {
        nesCParser.component_declaration_return retval = new nesCParser.component_declaration_return();
        retval.start = input.LT(1);

        int component_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token AS432=null;
        nesCParser.component_ref_return component_ref431 =null;

        nesCParser.identifier_return identifier433 =null;


        Object AS432_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_component_ref=new RewriteRuleSubtreeStream(adaptor,"rule component_ref");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // nesC.g:885:5: ( component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) )
            // nesC.g:885:10: component_ref ( AS identifier )?
            {
            pushFollow(FOLLOW_component_ref_in_component_declaration8089);
            component_ref431=component_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_ref.add(component_ref431.getTree());

            // nesC.g:885:24: ( AS identifier )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==AS) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // nesC.g:885:25: AS identifier
                    {
                    AS432=(Token)match(input,AS,FOLLOW_AS_in_component_declaration8092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS432);


                    pushFollow(FOLLOW_identifier_in_component_declaration8094);
                    identifier433=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier433.getTree());

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
            // 885:41: -> ^( COMPONENT_DECLARATION component_ref ( identifier )? )
            {
                // nesC.g:885:44: ^( COMPONENT_DECLARATION component_ref ( identifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DECLARATION, "COMPONENT_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_component_ref.nextTree());

                // nesC.g:885:82: ( identifier )?
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
            if ( state.backtracking>0 ) { memoize(input, 84, component_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_declaration"


    public static class component_ref_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_ref"
    // nesC.g:891:1: component_ref : ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) );
    public final nesCParser.component_ref_return component_ref() throws RecognitionException {
        nesCParser.component_ref_return retval = new nesCParser.component_ref_return();
        retval.start = input.LT(1);

        int component_ref_StartIndex = input.index();

        Object root_0 = null;

        Token NEW435=null;
        Token char_literal437=null;
        Token char_literal439=null;
        nesCParser.identifier_return identifier434 =null;

        nesCParser.identifier_return identifier436 =null;

        nesCParser.component_argument_list_return component_argument_list438 =null;


        Object NEW435_tree=null;
        Object char_literal437_tree=null;
        Object char_literal439_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule component_argument_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // nesC.g:892:5: ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==RAW_IDENTIFIER) ) {
                alt125=1;
            }
            else if ( (LA125_0==NEW) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;

            }
            switch (alt125) {
                case 1 :
                    // nesC.g:892:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_component_ref8132);
                    identifier434=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier434.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:893:10: NEW identifier '(' ( component_argument_list )? ')'
                    {
                    NEW435=(Token)match(input,NEW,FOLLOW_NEW_in_component_ref8143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW435);


                    pushFollow(FOLLOW_identifier_in_component_ref8145);
                    identifier436=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier436.getTree());

                    char_literal437=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_ref8147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal437);


                    // nesC.g:893:29: ( component_argument_list )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==AMP||LA124_0==BITCOMPLEMENT||LA124_0==CALL||(LA124_0 >= CHAR && LA124_0 <= CHARACTER_LITERAL)||(LA124_0 >= CONST && LA124_0 <= CONSTANT)||LA124_0==DOUBLE||LA124_0==ENUM||LA124_0==FLOAT||(LA124_0 >= INT && LA124_0 <= INT8_T)||(LA124_0 >= LONG && LA124_0 <= LPARENS)||LA124_0==MINUS||LA124_0==MINUSMINUS||LA124_0==NOT||(LA124_0 >= NXLE_UINT16_T && LA124_0 <= NX_UNION)||LA124_0==PLUS||LA124_0==PLUSPLUS||LA124_0==POST||LA124_0==RAW_IDENTIFIER||LA124_0==RESTRICT||(LA124_0 >= SHORT && LA124_0 <= SIZEOF)||LA124_0==STAR||(LA124_0 >= STRING_LITERAL && LA124_0 <= STRUCT)||(LA124_0 >= UINT16_T && LA124_0 <= UINT8_T)||(LA124_0 >= UNION && LA124_0 <= UNSIGNED)||(LA124_0 >= VOID && LA124_0 <= VOLATILE)) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // nesC.g:893:29: component_argument_list
                            {
                            pushFollow(FOLLOW_component_argument_list_in_component_ref8149);
                            component_argument_list438=component_argument_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_component_argument_list.add(component_argument_list438.getTree());

                            }
                            break;

                    }


                    char_literal439=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_ref8152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal439);


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
                    // 894:13: -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                    {
                        // nesC.g:894:16: ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_INSTANTIATION, "COMPONENT_INSTANTIATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:894:53: ( component_argument_list )?
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
            if ( state.backtracking>0 ) { memoize(input, 85, component_ref_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_ref"


    public static class component_argument_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_argument_list"
    // nesC.g:901:1: component_argument_list : component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) ;
    public final nesCParser.component_argument_list_return component_argument_list() throws RecognitionException {
        nesCParser.component_argument_list_return retval = new nesCParser.component_argument_list_return();
        retval.start = input.LT(1);

        int component_argument_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal441=null;
        nesCParser.component_argument_return component_argument440 =null;

        nesCParser.component_argument_return component_argument442 =null;


        Object char_literal441_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_argument=new RewriteRuleSubtreeStream(adaptor,"rule component_argument");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // nesC.g:902:5: ( component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) )
            // nesC.g:902:10: component_argument ( ',' component_argument )*
            {
            pushFollow(FOLLOW_component_argument_in_component_argument_list8199);
            component_argument440=component_argument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_argument.add(component_argument440.getTree());

            // nesC.g:902:29: ( ',' component_argument )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==COMMA) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // nesC.g:902:30: ',' component_argument
            	    {
            	    char_literal441=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_argument_list8202); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal441);


            	    pushFollow(FOLLOW_component_argument_in_component_argument_list8204);
            	    component_argument442=component_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_argument.add(component_argument442.getTree());

            	    }
            	    break;

            	default :
            	    break loop126;
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
            // 903:13: -> ^( COMPONENT_ARGUMENTS ( component_argument )+ )
            {
                // nesC.g:903:16: ^( COMPONENT_ARGUMENTS ( component_argument )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 86, component_argument_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_argument_list"


    public static class component_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_argument"
    // nesC.g:905:1: component_argument : ( expression | type_name );
    public final nesCParser.component_argument_return component_argument() throws RecognitionException {
        nesCParser.component_argument_return retval = new nesCParser.component_argument_return();
        retval.start = input.LT(1);

        int component_argument_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.expression_return expression443 =null;

        nesCParser.type_name_return type_name444 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // nesC.g:906:5: ( expression | type_name )
            int alt127=2;
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
                alt127=1;
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA127_2 = input.LA(2);

                if ( (synpred223_nesC()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 2, input);

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
                alt127=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;

            }

            switch (alt127) {
                case 1 :
                    // nesC.g:906:10: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_component_argument8246);
                    expression443=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression443.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:907:10: type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_name_in_component_argument8257);
                    type_name444=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name444.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 87, component_argument_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_argument"


    public static class connection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "connection"
    // nesC.g:913:1: connection : ( endpoint '=' endpoint ';' -> ^( CONNECTION '=' endpoint endpoint ) | ( certificate_specification )? endpoint '->' endpoint ';' -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? ) | ( certificate_specification )? endpoint '<-' endpoint ';' -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? ) );
    public final nesCParser.connection_return connection() throws RecognitionException {
        nesCParser.connection_return retval = new nesCParser.connection_return();
        retval.start = input.LT(1);

        int connection_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal446=null;
        Token char_literal448=null;
        Token string_literal451=null;
        Token char_literal453=null;
        Token string_literal456=null;
        Token char_literal458=null;
        nesCParser.endpoint_return endpoint445 =null;

        nesCParser.endpoint_return endpoint447 =null;

        nesCParser.certificate_specification_return certificate_specification449 =null;

        nesCParser.endpoint_return endpoint450 =null;

        nesCParser.endpoint_return endpoint452 =null;

        nesCParser.certificate_specification_return certificate_specification454 =null;

        nesCParser.endpoint_return endpoint455 =null;

        nesCParser.endpoint_return endpoint457 =null;


        Object char_literal446_tree=null;
        Object char_literal448_tree=null;
        Object string_literal451_tree=null;
        Object char_literal453_tree=null;
        Object string_literal456_tree=null;
        Object char_literal458_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_certificate_specification=new RewriteRuleSubtreeStream(adaptor,"rule certificate_specification");
        RewriteRuleSubtreeStream stream_endpoint=new RewriteRuleSubtreeStream(adaptor,"rule endpoint");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

            // nesC.g:914:5: ( endpoint '=' endpoint ';' -> ^( CONNECTION '=' endpoint endpoint ) | ( certificate_specification )? endpoint '->' endpoint ';' -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? ) | ( certificate_specification )? endpoint '<-' endpoint ';' -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? ) )
            int alt130=3;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA130_1 = input.LA(2);

                if ( (synpred224_nesC()) ) {
                    alt130=1;
                }
                else if ( (synpred226_nesC()) ) {
                    alt130=2;
                }
                else if ( (true) ) {
                    alt130=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 1, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA130_2 = input.LA(2);

                if ( (synpred224_nesC()) ) {
                    alt130=1;
                }
                else if ( (synpred226_nesC()) ) {
                    alt130=2;
                }
                else if ( (true) ) {
                    alt130=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 2, input);

                    throw nvae;

                }
                }
                break;
            case ENABLE:
                {
                int LA130_3 = input.LA(2);

                if ( (synpred226_nesC()) ) {
                    alt130=2;
                }
                else if ( (true) ) {
                    alt130=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;

            }

            switch (alt130) {
                case 1 :
                    // nesC.g:914:10: endpoint '=' endpoint ';'
                    {
                    pushFollow(FOLLOW_endpoint_in_connection8276);
                    endpoint445=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint445.getTree());

                    char_literal446=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_connection8278); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal446);


                    pushFollow(FOLLOW_endpoint_in_connection8280);
                    endpoint447=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint447.getTree());

                    char_literal448=(Token)match(input,190,FOLLOW_190_in_connection8282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal448);


                    // AST REWRITE
                    // elements: endpoint, endpoint, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 915:14: -> ^( CONNECTION '=' endpoint endpoint )
                    {
                        // nesC.g:915:17: ^( CONNECTION '=' endpoint endpoint )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONNECTION, "CONNECTION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ASSIGN.nextNode()
                        );

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:916:10: ( certificate_specification )? endpoint '->' endpoint ';'
                    {
                    // nesC.g:916:10: ( certificate_specification )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==ENABLE) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // nesC.g:916:10: certificate_specification
                            {
                            pushFollow(FOLLOW_certificate_specification_in_connection8318);
                            certificate_specification449=certificate_specification();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification449.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_endpoint_in_connection8321);
                    endpoint450=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint450.getTree());

                    string_literal451=(Token)match(input,ARROW,FOLLOW_ARROW_in_connection8323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal451);


                    pushFollow(FOLLOW_endpoint_in_connection8325);
                    endpoint452=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint452.getTree());

                    char_literal453=(Token)match(input,190,FOLLOW_190_in_connection8327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal453);


                    // AST REWRITE
                    // elements: certificate_specification, ARROW, endpoint, endpoint
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 917:14: -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? )
                    {
                        // nesC.g:917:17: ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONNECTION, "CONNECTION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ARROW.nextNode()
                        );

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        // nesC.g:917:53: ( certificate_specification )?
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
                    break;
                case 3 :
                    // nesC.g:918:10: ( certificate_specification )? endpoint '<-' endpoint ';'
                    {
                    // nesC.g:918:10: ( certificate_specification )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==ENABLE) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // nesC.g:918:10: certificate_specification
                            {
                            pushFollow(FOLLOW_certificate_specification_in_connection8366);
                            certificate_specification454=certificate_specification();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification454.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_endpoint_in_connection8369);
                    endpoint455=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint455.getTree());

                    string_literal456=(Token)match(input,191,FOLLOW_191_in_connection8371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_191.add(string_literal456);


                    pushFollow(FOLLOW_endpoint_in_connection8373);
                    endpoint457=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint457.getTree());

                    char_literal458=(Token)match(input,190,FOLLOW_190_in_connection8375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal458);


                    // AST REWRITE
                    // elements: 191, endpoint, endpoint, certificate_specification
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 919:14: -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? )
                    {
                        // nesC.g:919:17: ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONNECTION, "CONNECTION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_191.nextNode()
                        );

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        // nesC.g:919:53: ( certificate_specification )?
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
            if ( state.backtracking>0 ) { memoize(input, 88, connection_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "connection"


    public static class certificate_specification_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "certificate_specification"
    // nesC.g:921:1: certificate_specification : ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) ;
    public final nesCParser.certificate_specification_return certificate_specification() throws RecognitionException {
        nesCParser.certificate_specification_return retval = new nesCParser.certificate_specification_return();
        retval.start = input.LT(1);

        int certificate_specification_StartIndex = input.index();

        Object root_0 = null;

        Token certs=null;
        Token entity=null;
        Token assumptions=null;
        Token ENABLE459=null;
        Token AS460=null;
        Token ASSUMING461=null;
        Token FOR462=null;

        Object certs_tree=null;
        Object entity_tree=null;
        Object assumptions_tree=null;
        Object ENABLE459_tree=null;
        Object AS460_tree=null;
        Object ASSUMING461_tree=null;
        Object FOR462_tree=null;
        RewriteRuleTokenStream stream_ASSUMING=new RewriteRuleTokenStream(adaptor,"token ASSUMING");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_ENABLE=new RewriteRuleTokenStream(adaptor,"token ENABLE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

            // nesC.g:922:5: ( ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) )
            // nesC.g:922:10: ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR
            {
            ENABLE459=(Token)match(input,ENABLE,FOLLOW_ENABLE_in_certificate_specification8418); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENABLE.add(ENABLE459);


            certs=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8422); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(certs);


            // nesC.g:922:38: ( AS entity= STRING_LITERAL )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==AS) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // nesC.g:922:39: AS entity= STRING_LITERAL
                    {
                    AS460=(Token)match(input,AS,FOLLOW_AS_in_certificate_specification8425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS460);


                    entity=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(entity);


                    }
                    break;

            }


            // nesC.g:922:66: ( ASSUMING assumptions= STRING_LITERAL )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ASSUMING) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // nesC.g:922:67: ASSUMING assumptions= STRING_LITERAL
                    {
                    ASSUMING461=(Token)match(input,ASSUMING,FOLLOW_ASSUMING_in_certificate_specification8434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUMING.add(ASSUMING461);


                    assumptions=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(assumptions);


                    }
                    break;

            }


            FOR462=(Token)match(input,FOR,FOLLOW_FOR_in_certificate_specification8442); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR462);


            // AST REWRITE
            // elements: ASSUMING, entity, certs, AS, assumptions, ENABLE
            // token labels: certs, assumptions, entity
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_certs=new RewriteRuleTokenStream(adaptor,"token certs",certs);
            RewriteRuleTokenStream stream_assumptions=new RewriteRuleTokenStream(adaptor,"token assumptions",assumptions);
            RewriteRuleTokenStream stream_entity=new RewriteRuleTokenStream(adaptor,"token entity",entity);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 923:14: -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
            {
                // nesC.g:923:17: ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ENABLE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_certs.nextNode());

                // nesC.g:923:33: ( ^( AS $entity) )?
                if ( stream_entity.hasNext()||stream_AS.hasNext() ) {
                    // nesC.g:923:33: ^( AS $entity)
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

                // nesC.g:923:48: ( ^( ASSUMING $assumptions) )?
                if ( stream_ASSUMING.hasNext()||stream_assumptions.hasNext() ) {
                    // nesC.g:923:48: ^( ASSUMING $assumptions)
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
            if ( state.backtracking>0 ) { memoize(input, 89, certificate_specification_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "certificate_specification"


    public static class endpoint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "endpoint"
    // nesC.g:925:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );
    public final nesCParser.endpoint_return endpoint() throws RecognitionException {
        nesCParser.endpoint_return retval = new nesCParser.endpoint_return();
        retval.start = input.LT(1);

        int endpoint_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal465=null;
        Token char_literal467=null;
        nesCParser.identifier_path_return identifier_path463 =null;

        nesCParser.identifier_path_return identifier_path464 =null;

        nesCParser.argument_expression_list_return argument_expression_list466 =null;


        Object char_literal465_tree=null;
        Object char_literal467_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

            // nesC.g:926:5: ( identifier_path | identifier_path '[' argument_expression_list ']' )
            int alt133=2;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // nesC.g:926:10: identifier_path
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8495);
                    identifier_path463=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path463.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:927:10: identifier_path '[' argument_expression_list ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8506);
                    identifier_path464=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path464.getTree());

                    char_literal465=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_endpoint8508); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal465_tree = 
                    (Object)adaptor.create(char_literal465)
                    ;
                    adaptor.addChild(root_0, char_literal465_tree);
                    }

                    pushFollow(FOLLOW_argument_expression_list_in_endpoint8510);
                    argument_expression_list466=argument_expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list466.getTree());

                    char_literal467=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_endpoint8512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal467_tree = 
                    (Object)adaptor.create(char_literal467)
                    ;
                    adaptor.addChild(root_0, char_literal467_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 90, endpoint_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "endpoint"


    public static class identifier_path_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_path"
    // nesC.g:929:1: identifier_path : ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) );
    public final nesCParser.identifier_path_return identifier_path() throws RecognitionException {
        nesCParser.identifier_path_return retval = new nesCParser.identifier_path_return();
        retval.start = input.LT(1);

        int identifier_path_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal469=null;
        Token char_literal471=null;
        Token char_literal472=null;
        Token char_literal473=null;
        List list_normal_path=null;
        nesCParser.identifier_return indirect =null;

        nesCParser.identifier_return identifier468 =null;

        nesCParser.identifier_return identifier470 =null;

        RuleReturnScope normal_path = null;
        Object char_literal469_tree=null;
        Object char_literal471_tree=null;
        Object char_literal472_tree=null;
        Object char_literal473_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

            // nesC.g:930:5: ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==RAW_IDENTIFIER) ) {
                alt136=1;
            }
            else if ( (LA136_0==LBRACKET) ) {
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
                    // nesC.g:930:10: identifier ( '.' identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_identifier_path8531);
                    identifier468=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier468.getTree());

                    // nesC.g:930:21: ( '.' identifier )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==DOT) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // nesC.g:930:22: '.' identifier
                    	    {
                    	    char_literal469=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8534); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal469);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8536);
                    	    identifier470=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier470.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop134;
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
                    // 931:13: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:931:16: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:932:10: '[' indirect= identifier ']' ( '.' normal_path+= identifier )*
                    {
                    char_literal471=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_identifier_path8570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal471);


                    pushFollow(FOLLOW_identifier_in_identifier_path8574);
                    indirect=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(indirect.getTree());

                    char_literal472=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_identifier_path8576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal472);


                    // nesC.g:932:38: ( '.' normal_path+= identifier )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==DOT) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // nesC.g:932:39: '.' normal_path+= identifier
                    	    {
                    	    char_literal473=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8579); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal473);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8583);
                    	    normal_path=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(normal_path.getTree());
                    	    if (list_normal_path==null) list_normal_path=new ArrayList();
                    	    list_normal_path.add(normal_path.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: indirect, normal_path
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
                    // 933:13: -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
                    {
                        // nesC.g:933:16: ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
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
            if ( state.backtracking>0 ) { memoize(input, 91, identifier_path_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifier_path"


    public static class component_specification_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_specification"
    // nesC.g:939:1: component_specification : '{' ( line_directive | uses_provides )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final nesCParser.component_specification_return component_specification() throws RecognitionException {
        nesCParser.component_specification_return retval = new nesCParser.component_specification_return();
        retval.start = input.LT(1);

        int component_specification_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal474=null;
        Token char_literal477=null;
        nesCParser.line_directive_return line_directive475 =null;

        nesCParser.uses_provides_return uses_provides476 =null;


        Object char_literal474_tree=null;
        Object char_literal477_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

            // nesC.g:940:5: ( '{' ( line_directive | uses_provides )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // nesC.g:940:10: '{' ( line_directive | uses_provides )* '}'
            {
            char_literal474=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification8632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal474);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:941:11: ( line_directive | uses_provides )*
            loop137:
            do {
                int alt137=3;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==HASH) ) {
                    alt137=1;
                }
                else if ( (LA137_0==ASYNC||LA137_0==AUTO||LA137_0==CHAR||LA137_0==COMMAND||LA137_0==CONST||LA137_0==DEFAULT||(LA137_0 >= DOUBLE && LA137_0 <= DUTY)||LA137_0==ENUM||(LA137_0 >= EVENT && LA137_0 <= EXTERN)||LA137_0==FLOAT||(LA137_0 >= INLINE && LA137_0 <= INT8_T)||LA137_0==LONG||LA137_0==NORACE||(LA137_0 >= NXLE_UINT16_T && LA137_0 <= NX_UNION)||(LA137_0 >= PROVIDES && LA137_0 <= RAW_IDENTIFIER)||LA137_0==REGISTER||LA137_0==RESTRICT||LA137_0==SHORT||LA137_0==SIGNED||LA137_0==STATIC||LA137_0==STRUCT||(LA137_0 >= TASK && LA137_0 <= UINT8_T)||(LA137_0 >= UNION && LA137_0 <= VOLATILE)) ) {
                    alt137=2;
                }


                switch (alt137) {
            	case 1 :
            	    // nesC.g:941:12: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification8647);
            	    line_directive475=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive475.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:941:29: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification8651);
            	    uses_provides476=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides476.getTree());

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);


            char_literal477=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification8655); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal477);


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
            // 941:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // nesC.g:941:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // nesC.g:941:68: ( uses_provides )*
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
            if ( state.backtracking>0 ) { memoize(input, 92, component_specification_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_specification"


    public static class uses_provides_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uses_provides"
    // nesC.g:943:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) );
    public final nesCParser.uses_provides_return uses_provides() throws RecognitionException {
        nesCParser.uses_provides_return retval = new nesCParser.uses_provides_return();
        retval.start = input.LT(1);

        int uses_provides_StartIndex = input.index();

        Object root_0 = null;

        Token USES478=null;
        Token PROVIDES480=null;
        nesCParser.specification_element_list_return specification_element_list479 =null;

        nesCParser.specification_element_list_return specification_element_list481 =null;

        nesCParser.declaration_return declaration482 =null;


        Object USES478_tree=null;
        Object PROVIDES480_tree=null;
        RewriteRuleTokenStream stream_PROVIDES=new RewriteRuleTokenStream(adaptor,"token PROVIDES");
        RewriteRuleTokenStream stream_USES=new RewriteRuleTokenStream(adaptor,"token USES");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_specification_element_list=new RewriteRuleSubtreeStream(adaptor,"rule specification_element_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

            // nesC.g:944:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) )
            int alt138=3;
            switch ( input.LA(1) ) {
            case USES:
                {
                alt138=1;
                }
                break;
            case PROVIDES:
                {
                alt138=2;
                }
                break;
            case ASYNC:
            case AUTO:
            case CHAR:
            case COMMAND:
            case CONST:
            case DEFAULT:
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
                alt138=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;

            }

            switch (alt138) {
                case 1 :
                    // nesC.g:944:10: USES specification_element_list
                    {
                    USES478=(Token)match(input,USES,FOLLOW_USES_in_uses_provides8683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES478);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8685);
                    specification_element_list479=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list479.getTree());

                    // AST REWRITE
                    // elements: USES, specification_element_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 944:42: -> ^( USES specification_element_list )
                    {
                        // nesC.g:944:45: ^( USES specification_element_list )
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
                    // nesC.g:945:10: PROVIDES specification_element_list
                    {
                    PROVIDES480=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides8704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES480);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8706);
                    specification_element_list481=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list481.getTree());

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
                    // 945:46: -> ^( PROVIDES specification_element_list )
                    {
                        // nesC.g:945:49: ^( PROVIDES specification_element_list )
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
                    // nesC.g:946:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_uses_provides8725);
                    declaration482=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration482.getTree());

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
                    // 946:22: -> ^( DECLARATION declaration )
                    {
                        // nesC.g:946:25: ^( DECLARATION declaration )
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
            if ( state.backtracking>0 ) { memoize(input, 93, uses_provides_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "uses_provides"


    public static class specification_element_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specification_element_list"
    // nesC.g:948:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final nesCParser.specification_element_list_return specification_element_list() throws RecognitionException {
        nesCParser.specification_element_list_return retval = new nesCParser.specification_element_list_return();
        retval.start = input.LT(1);

        int specification_element_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal484=null;
        Token char_literal486=null;
        nesCParser.specification_element_return specification_element483 =null;

        nesCParser.specification_element_return specification_element485 =null;


        Object char_literal484_tree=null;
        Object char_literal486_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_specification_element=new RewriteRuleSubtreeStream(adaptor,"rule specification_element");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

            // nesC.g:949:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==ASYNC||LA140_0==AUTO||LA140_0==CHAR||LA140_0==COMMAND||LA140_0==CONST||LA140_0==DEFAULT||(LA140_0 >= DOUBLE && LA140_0 <= DUTY)||LA140_0==ENUM||(LA140_0 >= EVENT && LA140_0 <= EXTERN)||LA140_0==FLOAT||(LA140_0 >= INLINE && LA140_0 <= INTERFACE)||LA140_0==LONG||LA140_0==NORACE||(LA140_0 >= NXLE_UINT16_T && LA140_0 <= NX_UNION)||LA140_0==RAW_IDENTIFIER||(LA140_0 >= REGISTER && LA140_0 <= REMOTE)||LA140_0==RESTRICT||LA140_0==SHORT||LA140_0==SIGNED||LA140_0==STATIC||LA140_0==STRUCT||(LA140_0 >= TASK && LA140_0 <= UINT8_T)||(LA140_0 >= UNION && LA140_0 <= UNSIGNED)||(LA140_0 >= VOID && LA140_0 <= VOLATILE)) ) {
                alt140=1;
            }
            else if ( (LA140_0==LBRACE) ) {
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
                    // nesC.g:949:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list8752);
                    specification_element483=specification_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element.add(specification_element483.getTree());

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
                    // 949:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:950:10: '{' ( specification_element )+ '}'
                    {
                    char_literal484=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list8767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal484);


                    // nesC.g:950:14: ( specification_element )+
                    int cnt139=0;
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==ASYNC||LA139_0==AUTO||LA139_0==CHAR||LA139_0==COMMAND||LA139_0==CONST||LA139_0==DEFAULT||(LA139_0 >= DOUBLE && LA139_0 <= DUTY)||LA139_0==ENUM||(LA139_0 >= EVENT && LA139_0 <= EXTERN)||LA139_0==FLOAT||(LA139_0 >= INLINE && LA139_0 <= INTERFACE)||LA139_0==LONG||LA139_0==NORACE||(LA139_0 >= NXLE_UINT16_T && LA139_0 <= NX_UNION)||LA139_0==RAW_IDENTIFIER||(LA139_0 >= REGISTER && LA139_0 <= REMOTE)||LA139_0==RESTRICT||LA139_0==SHORT||LA139_0==SIGNED||LA139_0==STATIC||LA139_0==STRUCT||(LA139_0 >= TASK && LA139_0 <= UINT8_T)||(LA139_0 >= UNION && LA139_0 <= UNSIGNED)||(LA139_0 >= VOID && LA139_0 <= VOLATILE)) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // nesC.g:950:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list8769);
                    	    specification_element485=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element485.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt139 >= 1 ) break loop139;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(139, input);
                                throw eee;
                        }
                        cnt139++;
                    } while (true);


                    char_literal486=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list8772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal486);


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
                    // 950:41: -> ( specification_element )+
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
            if ( state.backtracking>0 ) { memoize(input, 94, specification_element_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "specification_element_list"


    public static class specification_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specification_element"
    // nesC.g:952:1: specification_element : ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) );
    public final nesCParser.specification_element_return specification_element() throws RecognitionException {
        nesCParser.specification_element_return retval = new nesCParser.specification_element_return();
        retval.start = input.LT(1);

        int specification_element_StartIndex = input.index();

        Object root_0 = null;

        Token AS489=null;
        Token char_literal493=null;
        nesCParser.declaration_return declaration487 =null;

        nesCParser.interface_type_return interface_type488 =null;

        nesCParser.identifier_return identifier490 =null;

        nesCParser.instance_parameters_return instance_parameters491 =null;

        nesCParser.attributes_return attributes492 =null;


        Object AS489_tree=null;
        Object char_literal493_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_instance_parameters=new RewriteRuleSubtreeStream(adaptor,"rule instance_parameters");
        RewriteRuleSubtreeStream stream_interface_type=new RewriteRuleSubtreeStream(adaptor,"rule interface_type");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

            // nesC.g:953:5: ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==ASYNC||LA144_0==AUTO||LA144_0==CHAR||LA144_0==COMMAND||LA144_0==CONST||LA144_0==DEFAULT||(LA144_0 >= DOUBLE && LA144_0 <= DUTY)||LA144_0==ENUM||(LA144_0 >= EVENT && LA144_0 <= EXTERN)||LA144_0==FLOAT||(LA144_0 >= INLINE && LA144_0 <= INT8_T)||LA144_0==LONG||LA144_0==NORACE||(LA144_0 >= NXLE_UINT16_T && LA144_0 <= NX_UNION)||LA144_0==RAW_IDENTIFIER||LA144_0==REGISTER||LA144_0==RESTRICT||LA144_0==SHORT||LA144_0==SIGNED||LA144_0==STATIC||LA144_0==STRUCT||(LA144_0 >= TASK && LA144_0 <= UINT8_T)||(LA144_0 >= UNION && LA144_0 <= UNSIGNED)||(LA144_0 >= VOID && LA144_0 <= VOLATILE)) ) {
                alt144=1;
            }
            else if ( (LA144_0==INTERFACE||LA144_0==REMOTE) ) {
                alt144=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;

            }
            switch (alt144) {
                case 1 :
                    // nesC.g:953:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_specification_element8796);
                    declaration487=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration487.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:954:10: interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';'
                    {
                    pushFollow(FOLLOW_interface_type_in_specification_element8807);
                    interface_type488=interface_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_type.add(interface_type488.getTree());

                    // nesC.g:954:25: ( AS identifier )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==AS) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // nesC.g:954:26: AS identifier
                            {
                            AS489=(Token)match(input,AS,FOLLOW_AS_in_specification_element8810); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AS.add(AS489);


                            pushFollow(FOLLOW_identifier_in_specification_element8812);
                            identifier490=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier490.getTree());

                            }
                            break;

                    }


                    // nesC.g:954:42: ( instance_parameters )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==LBRACKET) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // nesC.g:954:42: instance_parameters
                            {
                            pushFollow(FOLLOW_instance_parameters_in_specification_element8816);
                            instance_parameters491=instance_parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_instance_parameters.add(instance_parameters491.getTree());

                            }
                            break;

                    }


                    // nesC.g:954:63: ( attributes )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==ATTRIBUTE) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // nesC.g:954:63: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_specification_element8819);
                            attributes492=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes492.getTree());

                            }
                            break;

                    }


                    char_literal493=(Token)match(input,190,FOLLOW_190_in_specification_element8822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal493);


                    // AST REWRITE
                    // elements: interface_type, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 955:13: -> ^( INTERFACE interface_type ( identifier )? )
                    {
                        // nesC.g:955:16: ^( INTERFACE interface_type ( identifier )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTERFACE, "INTERFACE")
                        , root_1);

                        adaptor.addChild(root_1, stream_interface_type.nextTree());

                        // nesC.g:955:43: ( identifier )?
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
            if ( state.backtracking>0 ) { memoize(input, 95, specification_element_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "specification_element"


    public static class interface_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_type"
    // nesC.g:962:1: interface_type : ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) ;
    public final nesCParser.interface_type_return interface_type() throws RecognitionException {
        nesCParser.interface_type_return retval = new nesCParser.interface_type_return();
        retval.start = input.LT(1);

        int interface_type_StartIndex = input.index();

        Object root_0 = null;

        Token REMOTE494=null;
        Token INTERFACE495=null;
        Token REQUIRES498=null;
        Token STRING_LITERAL499=null;
        nesCParser.identifier_return identifier496 =null;

        nesCParser.type_arguments_return type_arguments497 =null;


        Object REMOTE494_tree=null;
        Object INTERFACE495_tree=null;
        Object REQUIRES498_tree=null;
        Object STRING_LITERAL499_tree=null;
        RewriteRuleTokenStream stream_REMOTE=new RewriteRuleTokenStream(adaptor,"token REMOTE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_REQUIRES=new RewriteRuleTokenStream(adaptor,"token REQUIRES");
        RewriteRuleSubtreeStream stream_type_arguments=new RewriteRuleSubtreeStream(adaptor,"rule type_arguments");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

            // nesC.g:963:5: ( ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) )
            // nesC.g:963:10: ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )?
            {
            // nesC.g:963:10: ( REMOTE )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==REMOTE) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // nesC.g:963:10: REMOTE
                    {
                    REMOTE494=(Token)match(input,REMOTE,FOLLOW_REMOTE_in_interface_type8869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REMOTE.add(REMOTE494);


                    }
                    break;

            }


            INTERFACE495=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_type8872); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE495);


            pushFollow(FOLLOW_identifier_in_interface_type8874);
            identifier496=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier496.getTree());

            // nesC.g:963:39: ( type_arguments )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==LESS) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // nesC.g:963:39: type_arguments
                    {
                    pushFollow(FOLLOW_type_arguments_in_interface_type8876);
                    type_arguments497=type_arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_arguments.add(type_arguments497.getTree());

                    }
                    break;

            }


            // nesC.g:963:55: ( REQUIRES STRING_LITERAL )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==REQUIRES) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // nesC.g:963:56: REQUIRES STRING_LITERAL
                    {
                    REQUIRES498=(Token)match(input,REQUIRES,FOLLOW_REQUIRES_in_interface_type8880); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRES.add(REQUIRES498);


                    STRING_LITERAL499=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_interface_type8882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL499);


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
            // 964:13: -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
            {
                // nesC.g:964:16: ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_TYPE, "INTERFACE_TYPE")
                , root_1);

                // nesC.g:964:33: ( REMOTE )?
                if ( stream_REMOTE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_REMOTE.nextNode()
                    );

                }
                stream_REMOTE.reset();

                // nesC.g:964:41: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING_LITERAL.nextNode()
                    );

                }
                stream_STRING_LITERAL.reset();

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:964:68: ( type_arguments )?
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
            if ( state.backtracking>0 ) { memoize(input, 96, interface_type_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interface_type"


    public static class type_arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_arguments"
    // nesC.g:966:1: type_arguments : '<' type_name ( ',' type_name )* '>' -> ( type_name )+ ;
    public final nesCParser.type_arguments_return type_arguments() throws RecognitionException {
        nesCParser.type_arguments_return retval = new nesCParser.type_arguments_return();
        retval.start = input.LT(1);

        int type_arguments_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal500=null;
        Token char_literal502=null;
        Token char_literal504=null;
        nesCParser.type_name_return type_name501 =null;

        nesCParser.type_name_return type_name503 =null;


        Object char_literal500_tree=null;
        Object char_literal502_tree=null;
        Object char_literal504_tree=null;
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

            // nesC.g:967:5: ( '<' type_name ( ',' type_name )* '>' -> ( type_name )+ )
            // nesC.g:967:10: '<' type_name ( ',' type_name )* '>'
            {
            char_literal500=(Token)match(input,LESS,FOLLOW_LESS_in_type_arguments8932); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESS.add(char_literal500);


            pushFollow(FOLLOW_type_name_in_type_arguments8934);
            type_name501=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_name.add(type_name501.getTree());

            // nesC.g:967:24: ( ',' type_name )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==COMMA) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // nesC.g:967:25: ',' type_name
            	    {
            	    char_literal502=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_arguments8937); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal502);


            	    pushFollow(FOLLOW_type_name_in_type_arguments8939);
            	    type_name503=type_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type_name.add(type_name503.getTree());

            	    }
            	    break;

            	default :
            	    break loop148;
                }
            } while (true);


            char_literal504=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_arguments8943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GREATER.add(char_literal504);


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
            // 967:45: -> ( type_name )+
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
            if ( state.backtracking>0 ) { memoize(input, 97, type_arguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_arguments"


    public static class instance_parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instance_parameters"
    // nesC.g:969:1: instance_parameters : '[' parameter_list ']' ;
    public final nesCParser.instance_parameters_return instance_parameters() throws RecognitionException {
        nesCParser.instance_parameters_return retval = new nesCParser.instance_parameters_return();
        retval.start = input.LT(1);

        int instance_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal505=null;
        Token char_literal507=null;
        nesCParser.parameter_list_return parameter_list506 =null;


        Object char_literal505_tree=null;
        Object char_literal507_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

            // nesC.g:970:5: ( '[' parameter_list ']' )
            // nesC.g:970:10: '[' parameter_list ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal505=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_instance_parameters8967); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal505_tree = 
            (Object)adaptor.create(char_literal505)
            ;
            adaptor.addChild(root_0, char_literal505_tree);
            }

            pushFollow(FOLLOW_parameter_list_in_instance_parameters8969);
            parameter_list506=parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list506.getTree());

            char_literal507=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_instance_parameters8971); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal507_tree = 
            (Object)adaptor.create(char_literal507)
            ;
            adaptor.addChild(root_0, char_literal507_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 98, instance_parameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "instance_parameters"


    public static class attributes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributes"
    // nesC.g:972:1: attributes : ( attribute )+ ;
    public final nesCParser.attributes_return attributes() throws RecognitionException {
        nesCParser.attributes_return retval = new nesCParser.attributes_return();
        retval.start = input.LT(1);

        int attributes_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.attribute_return attribute508 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

            // nesC.g:973:5: ( ( attribute )+ )
            // nesC.g:973:10: ( attribute )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:973:10: ( attribute )+
            int cnt149=0;
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( (LA149_0==ATTRIBUTE) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // nesC.g:973:10: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributes8990);
            	    attribute508=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute508.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt149 >= 1 ) break loop149;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(149, input);
                        throw eee;
                }
                cnt149++;
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
            if ( state.backtracking>0 ) { memoize(input, 99, attributes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "attributes"


    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // nesC.g:975:1: attribute : '@' identifier '(' initializer_list ')' ;
    public final nesCParser.attribute_return attribute() throws RecognitionException {
        nesCParser.attribute_return retval = new nesCParser.attribute_return();
        retval.start = input.LT(1);

        int attribute_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal509=null;
        Token char_literal511=null;
        Token char_literal513=null;
        nesCParser.identifier_return identifier510 =null;

        nesCParser.initializer_list_return initializer_list512 =null;


        Object char_literal509_tree=null;
        Object char_literal511_tree=null;
        Object char_literal513_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

            // nesC.g:976:5: ( '@' identifier '(' initializer_list ')' )
            // nesC.g:976:10: '@' identifier '(' initializer_list ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal509=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute9010); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal509_tree = 
            (Object)adaptor.create(char_literal509)
            ;
            adaptor.addChild(root_0, char_literal509_tree);
            }

            pushFollow(FOLLOW_identifier_in_attribute9012);
            identifier510=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier510.getTree());

            char_literal511=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_attribute9014); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal511_tree = 
            (Object)adaptor.create(char_literal511)
            ;
            adaptor.addChild(root_0, char_literal511_tree);
            }

            pushFollow(FOLLOW_initializer_list_in_attribute9016);
            initializer_list512=initializer_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer_list512.getTree());

            char_literal513=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_attribute9018); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal513_tree = 
            (Object)adaptor.create(char_literal513)
            ;
            adaptor.addChild(root_0, char_literal513_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 100, attribute_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class gcc_attributes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gcc_attributes"
    // nesC.g:981:1: gcc_attributes : GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' ;
    public final nesCParser.gcc_attributes_return gcc_attributes() throws RecognitionException {
        nesCParser.gcc_attributes_return retval = new nesCParser.gcc_attributes_return();
        retval.start = input.LT(1);

        int gcc_attributes_StartIndex = input.index();

        Object root_0 = null;

        Token GCCATTRIBUTE514=null;
        Token char_literal515=null;
        Token char_literal516=null;
        Token char_literal518=null;
        Token char_literal519=null;
        nesCParser.gcc_attribute_list_return gcc_attribute_list517 =null;


        Object GCCATTRIBUTE514_tree=null;
        Object char_literal515_tree=null;
        Object char_literal516_tree=null;
        Object char_literal518_tree=null;
        Object char_literal519_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

            // nesC.g:982:5: ( GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' )
            // nesC.g:982:10: GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')'
            {
            root_0 = (Object)adaptor.nil();


            GCCATTRIBUTE514=(Token)match(input,GCCATTRIBUTE,FOLLOW_GCCATTRIBUTE_in_gcc_attributes9036); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GCCATTRIBUTE514_tree = 
            (Object)adaptor.create(GCCATTRIBUTE514)
            ;
            adaptor.addChild(root_0, GCCATTRIBUTE514_tree);
            }

            char_literal515=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes9038); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal515_tree = 
            (Object)adaptor.create(char_literal515)
            ;
            adaptor.addChild(root_0, char_literal515_tree);
            }

            char_literal516=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes9040); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal516_tree = 
            (Object)adaptor.create(char_literal516)
            ;
            adaptor.addChild(root_0, char_literal516_tree);
            }

            pushFollow(FOLLOW_gcc_attribute_list_in_gcc_attributes9042);
            gcc_attribute_list517=gcc_attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute_list517.getTree());

            char_literal518=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes9044); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal518_tree = 
            (Object)adaptor.create(char_literal518)
            ;
            adaptor.addChild(root_0, char_literal518_tree);
            }

            char_literal519=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes9046); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal519_tree = 
            (Object)adaptor.create(char_literal519)
            ;
            adaptor.addChild(root_0, char_literal519_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 101, gcc_attributes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "gcc_attributes"


    public static class gcc_attribute_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gcc_attribute_list"
    // nesC.g:984:1: gcc_attribute_list : ( gcc_attribute )? ( ',' gcc_attribute )* ;
    public final nesCParser.gcc_attribute_list_return gcc_attribute_list() throws RecognitionException {
        nesCParser.gcc_attribute_list_return retval = new nesCParser.gcc_attribute_list_return();
        retval.start = input.LT(1);

        int gcc_attribute_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal521=null;
        nesCParser.gcc_attribute_return gcc_attribute520 =null;

        nesCParser.gcc_attribute_return gcc_attribute522 =null;


        Object char_literal521_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

            // nesC.g:985:5: ( ( gcc_attribute )? ( ',' gcc_attribute )* )
            // nesC.g:985:10: ( gcc_attribute )? ( ',' gcc_attribute )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:985:10: ( gcc_attribute )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==AMP||LA150_0==BITCOMPLEMENT||LA150_0==CALL||LA150_0==CHARACTER_LITERAL||LA150_0==CONSTANT||LA150_0==LPARENS||LA150_0==MINUS||LA150_0==MINUSMINUS||LA150_0==NOT||LA150_0==PLUS||LA150_0==PLUSPLUS||LA150_0==POST||LA150_0==RAW_IDENTIFIER||LA150_0==SIGNAL||LA150_0==SIZEOF||LA150_0==STAR||LA150_0==STRING_LITERAL) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // nesC.g:985:10: gcc_attribute
                    {
                    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list9061);
                    gcc_attribute520=gcc_attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute520.getTree());

                    }
                    break;

            }


            // nesC.g:985:25: ( ',' gcc_attribute )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==COMMA) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // nesC.g:985:26: ',' gcc_attribute
            	    {
            	    char_literal521=(Token)match(input,COMMA,FOLLOW_COMMA_in_gcc_attribute_list9065); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal521_tree = 
            	    (Object)adaptor.create(char_literal521)
            	    ;
            	    adaptor.addChild(root_0, char_literal521_tree);
            	    }

            	    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list9067);
            	    gcc_attribute522=gcc_attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute522.getTree());

            	    }
            	    break;

            	default :
            	    break loop151;
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
            if ( state.backtracking>0 ) { memoize(input, 102, gcc_attribute_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "gcc_attribute_list"


    public static class gcc_attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gcc_attribute"
    // nesC.g:987:1: gcc_attribute : assignment_expression ;
    public final nesCParser.gcc_attribute_return gcc_attribute() throws RecognitionException {
        nesCParser.gcc_attribute_return retval = new nesCParser.gcc_attribute_return();
        retval.start = input.LT(1);

        int gcc_attribute_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.assignment_expression_return assignment_expression523 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

            // nesC.g:988:5: ( assignment_expression )
            // nesC.g:988:10: assignment_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_gcc_attribute9084);
            assignment_expression523=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression523.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 103, gcc_attribute_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "gcc_attribute"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // nesC.g:990:1: identifier : id= RAW_IDENTIFIER {...}?;
    public final nesCParser.identifier_return identifier() throws RecognitionException {
        nesCParser.identifier_return retval = new nesCParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

            // nesC.g:991:5: (id= RAW_IDENTIFIER {...}?)
            // nesC.g:991:9: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier9100); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            id_tree = 
            (Object)adaptor.create(id)
            ;
            adaptor.addChild(root_0, id_tree);
            }

            if ( !(( !symbols.isType((id!=null?id.getText():null)) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "identifier", " !symbols.isType($id.text) ");
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
            if ( state.backtracking>0 ) { memoize(input, 104, identifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifier"

    // $ANTLR start synpred24_nesC
    public final void synpred24_nesC_fragment() throws RecognitionException {
        // nesC.g:336:10: ( SIZEOF '(' type_name ')' )
        // nesC.g:336:10: SIZEOF '(' type_name ')'
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred24_nesC3319); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred24_nesC3321); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred24_nesC3323);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred24_nesC3325); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_nesC

    // $ANTLR start synpred25_nesC
    public final void synpred25_nesC_fragment() throws RecognitionException {
        // nesC.g:337:10: ( SIZEOF unary_expression )
        // nesC.g:337:10: SIZEOF unary_expression
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred25_nesC3344); if (state.failed) return ;

        pushFollow(FOLLOW_unary_expression_in_synpred25_nesC3346);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_nesC

    // $ANTLR start synpred26_nesC
    public final void synpred26_nesC_fragment() throws RecognitionException {
        // nesC.g:345:10: ( '(' type_name ')' cast_expression )
        // nesC.g:345:10: '(' type_name ')' cast_expression
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred26_nesC3389); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred26_nesC3391);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred26_nesC3393); if (state.failed) return ;

        pushFollow(FOLLOW_cast_expression_in_synpred26_nesC3395);
        cast_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred26_nesC

    // $ANTLR start synpred56_nesC
    public final void synpred56_nesC_fragment() throws RecognitionException {
        // nesC.g:382:10: ( unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression )
        // nesC.g:382:10: unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression
        {
        pushFollow(FOLLOW_unary_expression_in_synpred56_nesC3797);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==ASSIGN||input.LA(1)==BITANDASSIGN||input.LA(1)==BITORASSIGN||input.LA(1)==BITXORASSIGN||input.LA(1)==DIVASSIGN||input.LA(1)==LSHIFTASSIGN||input.LA(1)==MINUSASSIGN||input.LA(1)==MODASSIGN||input.LA(1)==MULASSIGN||input.LA(1)==PLUSASSIGN||input.LA(1)==RSHIFTASSIGN ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_assignment_expression_in_synpred56_nesC3854);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_nesC

    // $ANTLR start synpred57_nesC
    public final void synpred57_nesC_fragment() throws RecognitionException {
        // nesC.g:386:33: ( ',' assignment_expression )
        // nesC.g:386:33: ',' assignment_expression
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred57_nesC3887); if (state.failed) return ;

        pushFollow(FOLLOW_assignment_expression_in_synpred57_nesC3890);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_nesC

    // $ANTLR start synpred60_nesC
    public final void synpred60_nesC_fragment() throws RecognitionException {
        // nesC.g:411:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )
        // nesC.g:411:10: declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred60_nesC3975);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:415:33: ( gcc_attributes )?
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==GCCATTRIBUTE) ) {
            alt153=1;
        }
        switch (alt153) {
            case 1 :
                // nesC.g:415:33: gcc_attributes
                {
                pushFollow(FOLLOW_gcc_attributes_in_synpred60_nesC3977);
                gcc_attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // nesC.g:415:49: ( init_declarator_list )?
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==LPARENS||LA154_0==RAW_IDENTIFIER||LA154_0==STAR) ) {
            alt154=1;
        }
        switch (alt154) {
            case 1 :
                // nesC.g:415:49: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred60_nesC3980);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,190,FOLLOW_190_in_synpred60_nesC3983); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_nesC

    // $ANTLR start synpred61_nesC
    public final void synpred61_nesC_fragment() throws RecognitionException {
        // nesC.g:424:10: ( function_definition )
        // nesC.g:424:10: function_definition
        {
        pushFollow(FOLLOW_function_definition_in_synpred61_nesC4045);
        function_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred61_nesC

    // $ANTLR start synpred62_nesC
    public final void synpred62_nesC_fragment() throws RecognitionException {
        // nesC.g:435:41: ( gcc_attributes )
        // nesC.g:435:41: gcc_attributes
        {
        pushFollow(FOLLOW_gcc_attributes_in_synpred62_nesC4114);
        gcc_attributes();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred62_nesC

    // $ANTLR start synpred66_nesC
    public final void synpred66_nesC_fragment() throws RecognitionException {
        // nesC.g:446:11: ( type_specifier )
        // nesC.g:446:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred66_nesC4198);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred66_nesC

    // $ANTLR start synpred110_nesC
    public final void synpred110_nesC_fragment() throws RecognitionException {
        // nesC.g:511:10: ( struct_or_union ( identifier )? '{' struct_declaration_list '}' )
        // nesC.g:511:10: struct_or_union ( identifier )? '{' struct_declaration_list '}'
        {
        pushFollow(FOLLOW_struct_or_union_in_synpred110_nesC4770);
        struct_or_union();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:511:26: ( identifier )?
        int alt155=2;
        int LA155_0 = input.LA(1);

        if ( (LA155_0==RAW_IDENTIFIER) ) {
            alt155=1;
        }
        switch (alt155) {
            case 1 :
                // nesC.g:511:26: identifier
                {
                pushFollow(FOLLOW_identifier_in_synpred110_nesC4772);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred110_nesC4775); if (state.failed) return ;

        pushFollow(FOLLOW_struct_declaration_list_in_synpred110_nesC4777);
        struct_declaration_list();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACE,FOLLOW_RBRACE_in_synpred110_nesC4779); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred110_nesC

    // $ANTLR start synpred111_nesC
    public final void synpred111_nesC_fragment() throws RecognitionException {
        // nesC.g:513:10: ( struct_or_union identifier )
        // nesC.g:513:10: struct_or_union identifier
        {
        pushFollow(FOLLOW_struct_or_union_in_synpred111_nesC4813);
        struct_or_union();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred111_nesC4815);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_nesC

    // $ANTLR start synpred112_nesC
    public final void synpred112_nesC_fragment() throws RecognitionException {
        // nesC.g:515:10: ( STRUCT '@' identifier '{' struct_declaration_list '}' )
        // nesC.g:515:10: STRUCT '@' identifier '{' struct_declaration_list '}'
        {
        match(input,STRUCT,FOLLOW_STRUCT_in_synpred112_nesC4846); if (state.failed) return ;

        match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_synpred112_nesC4848); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred112_nesC4850);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred112_nesC4852); if (state.failed) return ;

        pushFollow(FOLLOW_struct_declaration_list_in_synpred112_nesC4854);
        struct_declaration_list();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACE,FOLLOW_RBRACE_in_synpred112_nesC4856); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred112_nesC

    // $ANTLR start synpred117_nesC
    public final void synpred117_nesC_fragment() throws RecognitionException {
        // nesC.g:541:11: ( type_specifier )
        // nesC.g:541:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred117_nesC5059);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred117_nesC

    // $ANTLR start synpred121_nesC
    public final void synpred121_nesC_fragment() throws RecognitionException {
        // nesC.g:552:10: ( ( declarator )? ':' constant_expression )
        // nesC.g:552:10: ( declarator )? ':' constant_expression
        {
        // nesC.g:552:10: ( declarator )?
        int alt156=2;
        int LA156_0 = input.LA(1);

        if ( (LA156_0==LPARENS||LA156_0==RAW_IDENTIFIER||LA156_0==STAR) ) {
            alt156=1;
        }
        switch (alt156) {
            case 1 :
                // nesC.g:552:10: declarator
                {
                pushFollow(FOLLOW_declarator_in_synpred121_nesC5124);
                declarator();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,189,FOLLOW_189_in_synpred121_nesC5127); if (state.failed) return ;

        pushFollow(FOLLOW_constant_expression_in_synpred121_nesC5129);
        constant_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred121_nesC

    // $ANTLR start synpred124_nesC
    public final void synpred124_nesC_fragment() throws RecognitionException {
        // nesC.g:556:10: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' )
        // nesC.g:556:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred124_nesC5159); if (state.failed) return ;

        // nesC.g:556:15: ( identifier )?
        int alt157=2;
        int LA157_0 = input.LA(1);

        if ( (LA157_0==RAW_IDENTIFIER) ) {
            alt157=1;
        }
        switch (alt157) {
            case 1 :
                // nesC.g:556:15: identifier
                {
                pushFollow(FOLLOW_identifier_in_synpred124_nesC5161);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred124_nesC5164); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred124_nesC5166);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:556:47: ( ',' )?
        int alt158=2;
        int LA158_0 = input.LA(1);

        if ( (LA158_0==COMMA) ) {
            alt158=1;
        }
        switch (alt158) {
            case 1 :
                // nesC.g:556:47: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred124_nesC5168); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred124_nesC5171); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred124_nesC

    // $ANTLR start synpred126_nesC
    public final void synpred126_nesC_fragment() throws RecognitionException {
        // nesC.g:558:10: ( ENUM identifier attributes '{' enumerator_list ( ',' )? '}' )
        // nesC.g:558:10: ENUM identifier attributes '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred126_nesC5206); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred126_nesC5208);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_attributes_in_synpred126_nesC5210);
        attributes();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred126_nesC5212); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred126_nesC5214);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:558:57: ( ',' )?
        int alt159=2;
        int LA159_0 = input.LA(1);

        if ( (LA159_0==COMMA) ) {
            alt159=1;
        }
        switch (alt159) {
            case 1 :
                // nesC.g:558:57: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred126_nesC5216); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred126_nesC5219); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred126_nesC

    // $ANTLR start synpred136_nesC
    public final void synpred136_nesC_fragment() throws RecognitionException {
        // nesC.g:608:9: ( '[' ( constant_expression )? ']' )
        // nesC.g:608:9: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred136_nesC5542); if (state.failed) return ;

        // nesC.g:608:13: ( constant_expression )?
        int alt161=2;
        int LA161_0 = input.LA(1);

        if ( (LA161_0==AMP||LA161_0==BITCOMPLEMENT||LA161_0==CALL||LA161_0==CHARACTER_LITERAL||LA161_0==CONSTANT||LA161_0==LPARENS||LA161_0==MINUS||LA161_0==MINUSMINUS||LA161_0==NOT||LA161_0==PLUS||LA161_0==PLUSPLUS||LA161_0==POST||LA161_0==RAW_IDENTIFIER||LA161_0==SIGNAL||LA161_0==SIZEOF||LA161_0==STAR||LA161_0==STRING_LITERAL) ) {
            alt161=1;
        }
        switch (alt161) {
            case 1 :
                // nesC.g:608:13: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred136_nesC5544);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred136_nesC5547); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred136_nesC

    // $ANTLR start synpred146_nesC
    public final void synpred146_nesC_fragment() throws RecognitionException {
        // nesC.g:640:10: ( declaration_specifiers declarator ( attributes )? )
        // nesC.g:640:10: declaration_specifiers declarator ( attributes )?
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred146_nesC5800);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_declarator_in_synpred146_nesC5802);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:640:44: ( attributes )?
        int alt165=2;
        int LA165_0 = input.LA(1);

        if ( (LA165_0==ATTRIBUTE) ) {
            alt165=1;
        }
        switch (alt165) {
            case 1 :
                // nesC.g:640:44: attributes
                {
                pushFollow(FOLLOW_attributes_in_synpred146_nesC5804);
                attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred146_nesC

    // $ANTLR start synpred151_nesC
    public final void synpred151_nesC_fragment() throws RecognitionException {
        // nesC.g:652:10: ( ( pointer )? direct_abstract_declarator )
        // nesC.g:652:10: ( pointer )? direct_abstract_declarator
        {
        // nesC.g:652:10: ( pointer )?
        int alt166=2;
        int LA166_0 = input.LA(1);

        if ( (LA166_0==STAR) ) {
            alt166=1;
        }
        switch (alt166) {
            case 1 :
                // nesC.g:652:10: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred151_nesC5939);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred151_nesC5942);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred151_nesC

    // $ANTLR start synpred155_nesC
    public final void synpred155_nesC_fragment() throws RecognitionException {
        // nesC.g:658:15: ( parameter_list )
        // nesC.g:658:15: parameter_list
        {
        pushFollow(FOLLOW_parameter_list_in_synpred155_nesC6015);
        parameter_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred155_nesC

    // $ANTLR start synpred158_nesC
    public final void synpred158_nesC_fragment() throws RecognitionException {
        // nesC.g:659:52: ( parameter_list )
        // nesC.g:659:52: parameter_list
        {
        pushFollow(FOLLOW_parameter_list_in_synpred158_nesC6048);
        parameter_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred158_nesC

    // $ANTLR start synpred175_nesC
    public final void synpred175_nesC_fragment() throws RecognitionException {
        // nesC.g:714:10: ( declaration )
        // nesC.g:714:10: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred175_nesC6498);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred175_nesC

    // $ANTLR start synpred177_nesC
    public final void synpred177_nesC_fragment() throws RecognitionException {
        // nesC.g:725:43: ( ELSE statement )
        // nesC.g:725:43: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred177_nesC6574); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred177_nesC6576);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred177_nesC

    // $ANTLR start synpred190_nesC
    public final void synpred190_nesC_fragment() throws RecognitionException {
        // nesC.g:772:38: ( CONSTANT )
        // nesC.g:772:38: CONSTANT
        {
        match(input,CONSTANT,FOLLOW_CONSTANT_in_synpred190_nesC7016); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred190_nesC

    // $ANTLR start synpred193_nesC
    public final void synpred193_nesC_fragment() throws RecognitionException {
        // nesC.g:787:10: ( ( translation_unit )? interface_definition )
        // nesC.g:787:10: ( translation_unit )? interface_definition
        {
        // nesC.g:787:10: ( translation_unit )?
        int alt172=2;
        int LA172_0 = input.LA(1);

        if ( (LA172_0==ASYNC||LA172_0==AUTO||LA172_0==CHAR||LA172_0==COMMAND||LA172_0==CONST||LA172_0==DEFAULT||(LA172_0 >= DOUBLE && LA172_0 <= DUTY)||LA172_0==ENUM||(LA172_0 >= EVENT && LA172_0 <= EXTERN)||LA172_0==FLOAT||LA172_0==HASH||(LA172_0 >= INLINE && LA172_0 <= INT8_T)||LA172_0==LONG||LA172_0==NORACE||(LA172_0 >= NXLE_UINT16_T && LA172_0 <= NX_UNION)||LA172_0==RAW_IDENTIFIER||LA172_0==REGISTER||LA172_0==RESTRICT||LA172_0==SHORT||LA172_0==SIGNED||LA172_0==STATIC||LA172_0==STRUCT||(LA172_0 >= TASK && LA172_0 <= UINT8_T)||(LA172_0 >= UNION && LA172_0 <= UNSIGNED)||(LA172_0 >= VOID && LA172_0 <= VOLATILE)) ) {
            alt172=1;
        }
        switch (alt172) {
            case 1 :
                // nesC.g:787:10: translation_unit
                {
                pushFollow(FOLLOW_translation_unit_in_synpred193_nesC7100);
                translation_unit();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_interface_definition_in_synpred193_nesC7103);
        interface_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred193_nesC

    // $ANTLR start synpred209_nesC
    public final void synpred209_nesC_fragment() throws RecognitionException {
        // nesC.g:829:10: ( module_implementation )
        // nesC.g:829:10: module_implementation
        {
        pushFollow(FOLLOW_module_implementation_in_synpred209_nesC7544);
        module_implementation();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred209_nesC

    // $ANTLR start synpred223_nesC
    public final void synpred223_nesC_fragment() throws RecognitionException {
        // nesC.g:906:10: ( expression )
        // nesC.g:906:10: expression
        {
        pushFollow(FOLLOW_expression_in_synpred223_nesC8246);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred223_nesC

    // $ANTLR start synpred224_nesC
    public final void synpred224_nesC_fragment() throws RecognitionException {
        // nesC.g:914:10: ( endpoint '=' endpoint ';' )
        // nesC.g:914:10: endpoint '=' endpoint ';'
        {
        pushFollow(FOLLOW_endpoint_in_synpred224_nesC8276);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred224_nesC8278); if (state.failed) return ;

        pushFollow(FOLLOW_endpoint_in_synpred224_nesC8280);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,190,FOLLOW_190_in_synpred224_nesC8282); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred224_nesC

    // $ANTLR start synpred226_nesC
    public final void synpred226_nesC_fragment() throws RecognitionException {
        // nesC.g:916:10: ( ( certificate_specification )? endpoint '->' endpoint ';' )
        // nesC.g:916:10: ( certificate_specification )? endpoint '->' endpoint ';'
        {
        // nesC.g:916:10: ( certificate_specification )?
        int alt174=2;
        int LA174_0 = input.LA(1);

        if ( (LA174_0==ENABLE) ) {
            alt174=1;
        }
        switch (alt174) {
            case 1 :
                // nesC.g:916:10: certificate_specification
                {
                pushFollow(FOLLOW_certificate_specification_in_synpred226_nesC8318);
                certificate_specification();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_endpoint_in_synpred226_nesC8321);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,ARROW,FOLLOW_ARROW_in_synpred226_nesC8323); if (state.failed) return ;

        pushFollow(FOLLOW_endpoint_in_synpred226_nesC8325);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,190,FOLLOW_190_in_synpred226_nesC8327); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred226_nesC

    // Delegated rules

    public final boolean synpred121_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred209_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred209_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred193_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred193_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred223_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred223_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred175_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred175_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred151_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred151_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred155_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred155_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred224_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred224_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred190_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred190_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred177_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred177_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred146_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred226_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred226_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_nesC_fragment(); // can never throw exception
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
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA114 dfa114 = new DFA114(this);
    protected DFA133 dfa133 = new DFA133(this);
    static final String DFA62_eotS =
        "\5\uffff";
    static final String DFA62_eofS =
        "\1\uffff\2\4\2\uffff";
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
            return "617:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
    static final String DFA88_eotS =
        "\77\uffff";
    static final String DFA88_eofS =
        "\77\uffff";
    static final String DFA88_minS =
        "\1\6\35\uffff\1\0\2\uffff\1\0\35\uffff";
    static final String DFA88_maxS =
        "\1\u00be\35\uffff\1\0\2\uffff\1\0\35\uffff";
    static final String DFA88_acceptS =
        "\1\uffff\1\1\41\uffff\1\2\33\uffff";
    static final String DFA88_specialS =
        "\36\uffff\1\0\2\uffff\1\1\35\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\43\7\uffff\1\1\1\43\1\uffff\1\1\1\uffff\1\43\4\uffff\3\43"+
            "\1\uffff\1\1\1\43\1\uffff\1\1\16\uffff\1\1\2\43\6\uffff\1\41"+
            "\4\uffff\1\43\1\uffff\2\1\4\uffff\1\1\2\uffff\2\1\1\uffff\1"+
            "\1\1\43\6\uffff\1\43\2\uffff\1\43\3\uffff\1\43\3\uffff\6\1\3"+
            "\uffff\1\43\4\uffff\1\1\1\43\2\uffff\1\43\1\uffff\1\43\5\uffff"+
            "\1\1\1\43\5\uffff\12\1\3\uffff\1\43\1\uffff\1\43\1\uffff\1\43"+
            "\6\uffff\1\36\2\uffff\1\1\2\uffff\1\1\1\43\3\uffff\1\1\1\43"+
            "\1\1\1\43\3\uffff\1\43\1\uffff\1\1\1\43\1\1\1\43\6\1\2\uffff"+
            "\2\1\1\uffff\2\1\1\43\2\uffff\1\43",
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
            "\1\uffff",
            "",
            "",
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
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "713:1: block_item : ( declaration | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_30 = input.LA(1);

                         
                        int index88_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred175_nesC()) ) {s = 1;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index88_30);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA88_33 = input.LA(1);

                         
                        int index88_33 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred175_nesC()) ) {s = 1;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index88_33);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA114_eotS =
        "\14\uffff";
    static final String DFA114_eofS =
        "\14\uffff";
    static final String DFA114_minS =
        "\1\132\1\146\1\16\1\57\1\uffff\1\12\1\uffff\1\u00ab\2\16\2\0";
    static final String DFA114_maxS =
        "\1\132\1\146\1\u00ba\1\57\1\uffff\1\u00bf\1\uffff\1\u00ab\2\u00ba"+
        "\2\0";
    static final String DFA114_acceptS =
        "\4\uffff\1\1\1\uffff\1\2\5\uffff";
    static final String DFA114_specialS =
        "\12\uffff\1\0\1\1}>";
    static final String[] DFA114_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\2\uffff\1\4\12\uffff\1\4\2\uffff\1\4\4\uffff\1\6\11\uffff"+
            "\1\4\10\uffff\1\4\6\uffff\2\4\3\uffff\1\6\1\4\2\uffff\2\4\1"+
            "\uffff\1\4\12\uffff\1\3\7\uffff\6\4\4\uffff\1\6\3\uffff\1\4"+
            "\13\uffff\1\4\6\uffff\12\4\16\uffff\1\5\1\6\1\uffff\1\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\6\4\2\uffff\2\4\1\uffff\2\4",
            "\1\7",
            "",
            "\1\6\1\uffff\1\6\1\uffff\1\4\2\uffff\1\4\12\uffff\1\4\2\uffff"+
            "\1\4\16\uffff\1\4\10\uffff\1\4\5\uffff\1\6\2\4\4\uffff\1\4\2"+
            "\uffff\2\4\1\uffff\1\4\5\uffff\1\4\14\uffff\6\4\4\uffff\1\6"+
            "\3\uffff\2\4\12\uffff\1\4\6\uffff\12\4\16\uffff\1\4\2\uffff"+
            "\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\4\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\4\4\2\uffff\2\4\1\uffff"+
            "\2\4\3\uffff\1\4\1\6",
            "",
            "\1\10",
            "\1\4\2\uffff\1\4\12\uffff\1\4\2\uffff\1\4\4\uffff\1\6\11\uffff"+
            "\1\4\1\11\7\uffff\1\4\6\uffff\2\4\3\uffff\1\6\1\4\2\uffff\2"+
            "\4\1\uffff\1\4\12\uffff\1\3\7\uffff\6\4\4\uffff\1\6\3\uffff"+
            "\1\4\13\uffff\1\4\6\uffff\12\4\16\uffff\1\5\1\12\1\uffff\1\4"+
            "\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4"+
            "\1\uffff\6\4\2\uffff\2\4\1\uffff\2\4",
            "\1\4\2\uffff\1\4\12\uffff\1\4\2\uffff\1\4\4\uffff\1\6\11\uffff"+
            "\1\4\1\11\7\uffff\1\4\6\uffff\2\4\3\uffff\1\6\1\4\2\uffff\2"+
            "\4\1\uffff\1\4\12\uffff\1\3\7\uffff\6\4\4\uffff\1\6\3\uffff"+
            "\1\4\13\uffff\1\4\6\uffff\12\4\16\uffff\1\5\1\13\1\uffff\1\4"+
            "\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4"+
            "\1\uffff\6\4\2\uffff\2\4\1\uffff\2\4",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA114_eot = DFA.unpackEncodedString(DFA114_eotS);
    static final short[] DFA114_eof = DFA.unpackEncodedString(DFA114_eofS);
    static final char[] DFA114_min = DFA.unpackEncodedStringToUnsignedChars(DFA114_minS);
    static final char[] DFA114_max = DFA.unpackEncodedStringToUnsignedChars(DFA114_maxS);
    static final short[] DFA114_accept = DFA.unpackEncodedString(DFA114_acceptS);
    static final short[] DFA114_special = DFA.unpackEncodedString(DFA114_specialS);
    static final short[][] DFA114_transition;

    static {
        int numStates = DFA114_transitionS.length;
        DFA114_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA114_transition[i] = DFA.unpackEncodedString(DFA114_transitionS[i]);
        }
    }

    class DFA114 extends DFA {

        public DFA114(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 114;
            this.eot = DFA114_eot;
            this.eof = DFA114_eof;
            this.min = DFA114_min;
            this.max = DFA114_max;
            this.accept = DFA114_accept;
            this.special = DFA114_special;
            this.transition = DFA114_transition;
        }
        public String getDescription() {
            return "828:1: implementation : ( module_implementation | configuration_implementation );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA114_10 = input.LA(1);

                         
                        int index114_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred209_nesC()) ) {s = 4;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index114_10);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA114_11 = input.LA(1);

                         
                        int index114_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred209_nesC()) ) {s = 4;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index114_11);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 114, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA133_eotS =
        "\13\uffff";
    static final String DFA133_eofS =
        "\13\uffff";
    static final String DFA133_minS =
        "\1\147\1\12\2\u0096\2\uffff\1\u0098\2\12\1\u0096\1\12";
    static final String DFA133_maxS =
        "\1\u0096\1\u00bf\2\u0096\2\uffff\1\u0098\2\u00bf\1\u0096\1\u00bf";
    static final String DFA133_acceptS =
        "\4\uffff\1\1\1\2\5\uffff";
    static final String DFA133_specialS =
        "\13\uffff}>";
    static final String[] DFA133_transitionS = {
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

    static final short[] DFA133_eot = DFA.unpackEncodedString(DFA133_eotS);
    static final short[] DFA133_eof = DFA.unpackEncodedString(DFA133_eofS);
    static final char[] DFA133_min = DFA.unpackEncodedStringToUnsignedChars(DFA133_minS);
    static final char[] DFA133_max = DFA.unpackEncodedStringToUnsignedChars(DFA133_maxS);
    static final short[] DFA133_accept = DFA.unpackEncodedString(DFA133_acceptS);
    static final short[] DFA133_special = DFA.unpackEncodedString(DFA133_specialS);
    static final short[][] DFA133_transition;

    static {
        int numStates = DFA133_transitionS.length;
        DFA133_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA133_transition[i] = DFA.unpackEncodedString(DFA133_transitionS[i]);
        }
    }

    class DFA133 extends DFA {

        public DFA133(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 133;
            this.eot = DFA133_eot;
            this.eof = DFA133_eof;
            this.min = DFA133_min;
            this.max = DFA133_max;
            this.accept = DFA133_accept;
            this.special = DFA133_special;
            this.transition = DFA133_transition;
        }
        public String getDescription() {
            return "925:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );";
        }
    }
 

    public static final BitSet FOLLOW_identifier_in_primary_expression2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_primary_expression2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_primary_expression2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_primary_expression2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_primary_expression2892 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_primary_expression2894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_primary_expression2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_kind_in_postfix_expression2921 = new BitSet(new long[]{0x0000800020000000L,0x0000100000000000L,0x0000080000400000L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression2924 = new BitSet(new long[]{0x2000000000000402L,0x0002108000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_postfix_expression_modifier_in_postfix_expression2926 = new BitSet(new long[]{0x2000000000000402L,0x0002108000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LBRACKET_in_postfix_expression_modifier2967 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_postfix_expression_modifier2969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_postfix_expression_modifier2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression_modifier2989 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009144040A800L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression_modifier2991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression_modifier2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression_modifier3013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_postfix_expression_modifier3033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_postfix_expression_modifier3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_postfix_expression_modifier3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3123 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list3126 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3129 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unary_expression3150 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_unary_expression3171 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_unary_expression3192 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression3219 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression3245 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression3272 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITCOMPLEMENT_in_unary_expression3299 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_NOT_in_unary_expression3304 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3319 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_unary_expression3321 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_unary_expression3323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_unary_expression3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3344 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_cast_expression3389 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_cast_expression3391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_cast_expression3393 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3435 = new BitSet(new long[]{0x0800000000000002L,0x0010000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression3440 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expression3445 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_MODULUS_in_multiplicative_expression3450 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3454 = new BitSet(new long[]{0x0800000000000002L,0x0010000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3475 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression3480 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression3485 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3489 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3510 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression3515 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression3520 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3524 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3545 = new BitSet(new long[]{0x0000000000000002L,0x0000030000180000L});
    public static final BitSet FOLLOW_LESS_in_relational_expression3550 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression3555 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_LESSEQUAL_in_relational_expression3560 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_relational_expression3565 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3569 = new BitSet(new long[]{0x0000000000000002L,0x0000030000180000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3590 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_equality_expression3595 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equality_expression3600 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3604 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000040L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3625 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMP_in_and_expression3629 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3632 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3653 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_BITXOR_in_xor_expression3657 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3660 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3681 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BITOR_in_or_expression3685 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3688 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3709 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression3713 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3716 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3737 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression3741 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3744 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression3765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_conditional_expression3768 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_conditional_expression3771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_conditional_expression3773 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_assignment_expression3797 = new BitSet(new long[]{0x0400000000A41000L,0x0025400000000000L,0x0000000100001000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_expression3800 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_MULASSIGN_in_assignment_expression3805 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_DIVASSIGN_in_assignment_expression3810 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_MODASSIGN_in_assignment_expression3815 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_PLUSASSIGN_in_assignment_expression3820 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_MINUSASSIGN_in_assignment_expression3825 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_LSHIFTASSIGN_in_assignment_expression3830 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_RSHIFTASSIGN_in_assignment_expression3835 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_BITANDASSIGN_in_assignment_expression3840 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_BITXORASSIGN_in_assignment_expression3845 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_BITORASSIGN_in_assignment_expression3850 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3884 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_expression3887 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3890 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3975 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L,0x4000010000400000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration3977 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x4000010000400000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_declaration3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration4110 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4112 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L,0x4000010000400000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4114 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L,0x4000010000400000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration4117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x4000000000000000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_declaration4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers4184 = new BitSet(new long[]{0xC080400090024002L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers4198 = new BitSet(new long[]{0xC080400090024002L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers4221 = new BitSet(new long[]{0xC080400090024002L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_function_specifier_in_declaration_specifiers4244 = new BitSet(new long[]{0xC080400090024002L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_DEFAULT_in_declaration_specifiers4263 = new BitSet(new long[]{0xC080400090024002L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4286 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list4289 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4291 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator4325 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_attributes_in_init_declarator4327 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator4331 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_initializer_in_init_declarator4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_type_specifier4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT64_T_in_type_specifier4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT64_T_in_type_specifier4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT64_T_in_type_specifier4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT8_T_in_type_specifier4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT16_T_in_type_specifier4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT32_T_in_type_specifier4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT64_T_in_type_specifier4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4770 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4772 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4775 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_struct_or_union_specifier4846 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_struct_or_union_specifier4848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4850 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4852 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4891 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_struct_or_union_specifier4893 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4895 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list4981 = new BitSet(new long[]{0x4000400010000002L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration5012 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x2000010000400000L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration5014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_struct_declaration5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list5059 = new BitSet(new long[]{0x4000400010000002L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list5063 = new BitSet(new long[]{0x4000400010000002L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5089 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list5092 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x2000010000400000L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5094 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_struct_declarator5127 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5159 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5161 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5166 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5208 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_enum_specifier5210 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5214 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5297 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list5300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5303 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_identifier_in_enumerator5328 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator5331 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_function_specifier5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator5420 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator5448 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator5450 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5476 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier5479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier5516 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier5518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5542 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140140A800L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier5544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5579 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0000590L,0x06CF540A134000FFL});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier5583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5585 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier5589 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0000590L,0x06CF540A524000FFL});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier5593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5635 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0400010010000000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_pointer_in_pointer5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5662 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0400000010000000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list5693 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0400000010000000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list5718 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list5721 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0000590L,0x06CF540A124000FFL});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list5723 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list5728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_parameter_list5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration5800 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_declarator_in_parameter_declaration5802 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_parameter_declaration5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration5841 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5886 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_identifier_list5889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5891 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name5917 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5939 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator5973 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator5975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator5980 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator5994 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140140A800L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator5996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator5999 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6013 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0000590L,0x06CF540A524000FFL});
    public static final BitSet FOLLOW_parameter_list_in_direct_abstract_declarator6015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6020 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator6037 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140140A800L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator6039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator6042 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6046 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0000590L,0x06CF540A524000FFL});
    public static final BitSet FOLLOW_parameter_list_in_direct_abstract_declarator6048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6051 = new BitSet(new long[]{0x0000000000000002L,0x0000108000000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer6131 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_initializer_list_in_initializer6133 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_initializer6135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_initializer_list6170 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6174 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list6177 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_initializer_list6182 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6186 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_statement_in_statement6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_statement6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOMIC_in_atomic_statement6332 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_atomic_statement6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_labeled_statement6361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_labeled_statement6363 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement6386 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement6388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_labeled_statement6390 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement6413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_labeled_statement6415 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement6443 = new BitSet(new long[]{0xD081C000B70AC040L,0xC1829847E2240D90L,0x4ECFFD1E32C0A8FFL});
    public static final BitSet FOLLOW_block_item_in_compound_statement6456 = new BitSet(new long[]{0xD081C000B70AC040L,0xC1829847E2240D90L,0x4ECFFD1E32C0A8FFL});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_block_item6498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block_item6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement6532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_expression_statement6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6563 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6565 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_selection_statement6567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6569 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_selection_statement6571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement6574 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_selection_statement6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement6615 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6617 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_selection_statement6619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6621 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_selection_statement6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6669 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6671 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6675 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_iteration_statement6698 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6702 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6704 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_iteration_statement6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement6731 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6733 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x400009140040A800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_iteration_statement6740 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x400009140040A800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_iteration_statement6747 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009144040A800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6754 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_jump_statement6863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_jump_statement6865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_jump_statement6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement6886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_jump_statement6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement6903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_jump_statement6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement6920 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x400009140040A800L});
    public static final BitSet FOLLOW_expression_in_jump_statement6922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_jump_statement6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_translation_unit6961 = new BitSet(new long[]{0xC080400090024002L,0xC0800807E0200590L,0x06CFD40A124000FFL});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit6965 = new BitSet(new long[]{0xC080400090024002L,0xC0800807E0200590L,0x06CFD40A124000FFL});
    public static final BitSet FOLLOW_declaration_in_external_declaration6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive7010 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive7014 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7016 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition7044 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_declarator_in_function_definition7046 = new BitSet(new long[]{0x0000000000010000L,0x0000004000000000L});
    public static final BitSet FOLLOW_attributes_in_function_definition7048 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7100 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_interface_definition_in_nesC_file7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7125 = new BitSet(new long[]{0x0000100800000000L,0x0008000000020000L});
    public static final BitSet FOLLOW_component_in_nesC_file7128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_definition7176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_interface_definition7178 = new BitSet(new long[]{0x0000000000010000L,0x0000014000000000L});
    public static final BitSet FOLLOW_type_parameters_in_interface_definition7180 = new BitSet(new long[]{0x0000000000010000L,0x0000004000000000L});
    public static final BitSet FOLLOW_attributes_in_interface_definition7183 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interface_definition7194 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0200590L,0x06CFD40A12C000FFL});
    public static final BitSet FOLLOW_line_directive_in_interface_definition7207 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0200590L,0x06CFD40A12C000FFL});
    public static final BitSet FOLLOW_declaration_in_interface_definition7211 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0200590L,0x06CFD40A12C000FFL});
    public static final BitSet FOLLOW_RBRACE_in_interface_definition7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_parameters7271 = new BitSet(new long[]{0x4000000010000000L,0xC0000807C0000410L,0x02CF100A004000FFL});
    public static final BitSet FOLLOW_type_parameter_list_in_type_parameters7273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_GREATER_in_type_parameters7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7294 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7296 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_type_parameter_list7300 = new BitSet(new long[]{0x4000000010000000L,0xC0000807C0000410L,0x02CF100A004000FFL});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7302 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7304 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_component_kind_in_component7326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_component7328 = new BitSet(new long[]{0x0000000000010000L,0x0000104000000000L});
    public static final BitSet FOLLOW_component_parameters_in_component7330 = new BitSet(new long[]{0x0000000000010000L,0x0000004000000000L});
    public static final BitSet FOLLOW_attributes_in_component7333 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_component_specification_in_component7344 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_implementation_in_component7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_component_kind7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7483 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7513 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_implementation7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_implementation_in_implementation7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_component_parameters7574 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0000590L,0x06CFD40A524000FFL});
    public static final BitSet FOLLOW_component_parameter_list_in_component_parameters7576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_parameters7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7619 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_parameter_list7622 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0000590L,0x06CFD40A124000FFL});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7624 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_component_parameter7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_component_parameter7661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_component_parameter7663 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_component_parameter7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_module_implementation7688 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_module_implementation7690 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0200590L,0x06CFD40A124000FFL});
    public static final BitSet FOLLOW_translation_unit_in_module_implementation7722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_module_implementation7778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_configuration_implementation7814 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_configuration_implementation7816 = new BitSet(new long[]{0x0000001000000000L,0x0000008000200008L,0x0000000000C00000L});
    public static final BitSet FOLLOW_configuration_element_list_in_configuration_implementation7848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_configuration_implementation7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_configuration_element_list7946 = new BitSet(new long[]{0x0000001000000002L,0x0000008000200008L,0x0000000000400000L});
    public static final BitSet FOLLOW_configuration_element_in_configuration_element_list7950 = new BitSet(new long[]{0x0000001000000002L,0x0000008000200008L,0x0000000000400000L});
    public static final BitSet FOLLOW_components_in_configuration_element7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connection_in_configuration_element7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTS_in_components8027 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_component_line_in_components8029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_components8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_declaration_in_component_line8058 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_line8061 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_component_declaration_in_component_line8063 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_component_ref_in_component_declaration8089 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AS_in_component_declaration8092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_component_declaration8094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_component_ref8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_component_ref8143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_component_ref8145 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_component_ref8147 = new BitSet(new long[]{0x4000C00032080040L,0xC1029807C0000410L,0x06CF191E5040A8FFL});
    public static final BitSet FOLLOW_component_argument_list_in_component_ref8149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_ref8152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8199 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_argument_list8202 = new BitSet(new long[]{0x4000C00032080040L,0xC1029807C0000410L,0x06CF191E1040A8FFL});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8204 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_expression_in_component_argument8246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_component_argument8257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endpoint_in_connection8276 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGN_in_connection8278 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_connection8280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_connection8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8318 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_connection8321 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARROW_in_connection8323 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_connection8325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_connection8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8366 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_connection8369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_191_in_connection8371 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_connection8373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_connection8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENABLE_in_certificate_specification8418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8422 = new BitSet(new long[]{0x0000000000002800L,0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_certificate_specification8425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8429 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ASSUMING_in_certificate_specification8434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_FOR_in_certificate_specification8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8506 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_endpoint8508 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_argument_expression_list_in_endpoint8510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_endpoint8512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8531 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8536 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifier_path8570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifier_path8576 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8583 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification8632 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0200590L,0x07CFD40A12E000FFL});
    public static final BitSet FOLLOW_line_directive_in_component_specification8647 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0200590L,0x07CFD40A12E000FFL});
    public static final BitSet FOLLOW_uses_provides_in_component_specification8651 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0200590L,0x07CFD40A12E000FFL});
    public static final BitSet FOLLOW_RBRACE_in_component_specification8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides8683 = new BitSet(new long[]{0xC080400090024000L,0xC080084FE0000590L,0x06CFD40A164000FFL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides8704 = new BitSet(new long[]{0xC080400090024000L,0xC080084FE0000590L,0x06CFD40A164000FFL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_uses_provides8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list8767 = new BitSet(new long[]{0xC080400090024000L,0xC080080FE0000590L,0x06CFD40A164000FFL});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8769 = new BitSet(new long[]{0xC080400090024000L,0xC080080FE0000590L,0x06CFD40A16C000FFL});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list8772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_type_in_specification_element8807 = new BitSet(new long[]{0x0000000000010800L,0x0000008000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_AS_in_specification_element8810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_specification_element8812 = new BitSet(new long[]{0x0000000000010000L,0x0000008000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_instance_parameters_in_specification_element8816 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_attributes_in_specification_element8819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_specification_element8822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOTE_in_interface_type8869 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_type8872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_interface_type8874 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_type_arguments_in_interface_type8876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_REQUIRES_in_interface_type8880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_interface_type8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_arguments8932 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_type_arguments8934 = new BitSet(new long[]{0x0000000040000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_type_arguments8937 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_type_arguments8939 = new BitSet(new long[]{0x0000000040000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_GREATER_in_type_arguments8943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_instance_parameters8967 = new BitSet(new long[]{0xC080400090024000L,0xC0800807E0000590L,0x06CF540A134000FFL});
    public static final BitSet FOLLOW_parameter_list_in_instance_parameters8969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_instance_parameters8971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributes8990 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute9010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_attribute9012 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_attribute9014 = new BitSet(new long[]{0x0000800022080040L,0x0102904000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_initializer_list_in_attribute9016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_attribute9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GCCATTRIBUTE_in_gcc_attributes9036 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes9038 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes9040 = new BitSet(new long[]{0x0000800062080040L,0x0102900000000000L,0x000009144040A800L});
    public static final BitSet FOLLOW_gcc_attribute_list_in_gcc_attributes9042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes9044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes9046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list9061 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_gcc_attribute_list9065 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list9067 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_assignment_expression_in_gcc_attribute9084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier9100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred24_nesC3319 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred24_nesC3321 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_synpred24_nesC3323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred24_nesC3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred25_nesC3344 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_unary_expression_in_synpred25_nesC3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred26_nesC3389 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_type_name_in_synpred26_nesC3391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred26_nesC3393 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_cast_expression_in_synpred26_nesC3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_synpred56_nesC3797 = new BitSet(new long[]{0x0400000000A41000L,0x0025400000000000L,0x0000000100001000L});
    public static final BitSet FOLLOW_set_in_synpred56_nesC3799 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred56_nesC3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred57_nesC3887 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred57_nesC3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred60_nesC3975 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L,0x4000010000400000L});
    public static final BitSet FOLLOW_gcc_attributes_in_synpred60_nesC3977 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x4000010000400000L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred60_nesC3980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_synpred60_nesC3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_synpred61_nesC4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gcc_attributes_in_synpred62_nesC4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred66_nesC4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_synpred110_nesC4770 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_synpred110_nesC4772 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred110_nesC4775 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_struct_declaration_list_in_synpred110_nesC4777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred110_nesC4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_synpred111_nesC4813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_synpred111_nesC4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_synpred112_nesC4846 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_synpred112_nesC4848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_synpred112_nesC4850 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred112_nesC4852 = new BitSet(new long[]{0x4000400010000000L,0xC0000807C0000410L,0x06CF100A104000FFL});
    public static final BitSet FOLLOW_struct_declaration_list_in_synpred112_nesC4854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred112_nesC4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred117_nesC5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred121_nesC5124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_synpred121_nesC5127 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140040A800L});
    public static final BitSet FOLLOW_constant_expression_in_synpred121_nesC5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred124_nesC5159 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_synpred124_nesC5161 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred124_nesC5164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred124_nesC5166 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_synpred124_nesC5168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred124_nesC5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred126_nesC5206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_synpred126_nesC5208 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_synpred126_nesC5210 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred126_nesC5212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred126_nesC5214 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_synpred126_nesC5216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred126_nesC5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred136_nesC5542 = new BitSet(new long[]{0x0000800022080040L,0x0102900000000000L,0x000009140140A800L});
    public static final BitSet FOLLOW_constant_expression_in_synpred136_nesC5544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred136_nesC5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred146_nesC5800 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_declarator_in_synpred146_nesC5802 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_synpred146_nesC5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred151_nesC5939 = new BitSet(new long[]{0x0000000000000000L,0x0000108000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred151_nesC5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_list_in_synpred155_nesC6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_list_in_synpred158_nesC6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred175_nesC6498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred177_nesC6574 = new BitSet(new long[]{0x1081800027088040L,0x0102904002240800L,0x480029142040A800L});
    public static final BitSet FOLLOW_statement_in_synpred177_nesC6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_synpred190_nesC7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_synpred193_nesC7100 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_interface_definition_in_synpred193_nesC7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_synpred209_nesC7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred223_nesC8246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endpoint_in_synpred224_nesC8276 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred224_nesC8278 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_synpred224_nesC8280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_synpred224_nesC8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_synpred226_nesC8318 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_synpred226_nesC8321 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARROW_in_synpred226_nesC8323 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_endpoint_in_synpred226_nesC8325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_synpred226_nesC8327 = new BitSet(new long[]{0x0000000000000002L});

}