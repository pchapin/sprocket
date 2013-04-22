// $ANTLR 3.4 nesC.g 2013-04-22 18:56:31

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADDRESS_OF", "AMP", "AND", "ARGUMENT_LIST", "ARRAY_ELEMENT_SELECTION", "ARROW", "AS", "ASSIGN", "ASSUMING", "ASYNC", "ATOMIC", "ATTRIBUTE", "AUTO", "BITANDASSIGN", "BITCOMPLEMENT", "BITOR", "BITORASSIGN", "BITXOR", "BITXORASSIGN", "BREAK", "BUILTIN_VA_ARG", "BUILTIN_VA_LIST", "CALL", "CASE", "CAST", "CHAR", "CHARACTER_LITERAL", "COMMA", "COMMAND", "COMMENT1", "COMMENT2", "COMMENT3", "COMPONENT", "COMPONENTS", "COMPONENT_ARGUMENTS", "COMPONENT_DECLARATION", "COMPONENT_DEFINITION", "COMPONENT_INSTANTIATION", "COMPONENT_KIND", "COMPONENT_PARAMETER_LIST", "COMPOUND_STATEMENT", "CONFIGURATION", "CONNECTION", "CONST", "CONSTANT", "CONTINUE", "DECLARATION", "DECLARATOR", "DECLARATOR_ARRAY_MODIFIER", "DECLARATOR_LIST", "DECLARATOR_PARAMETER_LIST_MODIFIER", "DEC_NUMBER", "DEFAULT", "DEREFERENCE", "DIGIT", "DIVASSIGN", "DIVIDE", "DO", "DOT", "DOUBLE", "DUTY", "DYNAMIC_IDENTIFIER_PATH", "ELLIPSIS", "ELSE", "ENABLE", "ENUM", "ENUMERATOR", "EQUAL", "EVENT", "EXTERN", "FILE", "FLOAT", "FOR", "FOR_CONDITION", "FOR_INITIALIZE", "FOR_ITERATION", "FUNCTION_DEFINITION", "GCCATTRIBUTE", "GENERIC", "GOTO", "GREATER", "GREATEREQUAL", "HASH", "HEX_DIGIT", "HEX_NUMBER", "IDENTIFIER_PATH", "IF", "IMPLEMENTATION", "INITIALIZER_LIST", "INIT_DECLARATOR", "INLINE", "INT", "INT16_T", "INT32_T", "INT64_T", "INT8_T", "INTERFACE", "INTERFACE_TYPE", "LABELED_STATEMENT", "LBRACE", "LBRACKET", "LESS", "LESSEQUAL", "LINE_DIRECTIVE", "LONG", "LPARENS", "LSHIFT", "LSHIFTASSIGN", "MINUS", "MINUSASSIGN", "MINUSMINUS", "MODASSIGN", "MODULE", "MODULUS", "MULASSIGN", "NEW", "NORACE", "NOT", "NOTEQUAL", "NULL", "NUMBER", "NUMBER_PREFIX", "NUMBER_SUFFIX", "NXLE_INT16_T", "NXLE_INT32_T", "NXLE_INT64_T", "NXLE_INT8_T", "NXLE_UINT16_T", "NXLE_UINT32_T", "NXLE_UINT64_T", "NXLE_UINT8_T", "NX_INT16_T", "NX_INT32_T", "NX_INT64_T", "NX_INT8_T", "NX_STRUCT", "NX_UINT16_T", "NX_UINT32_T", "NX_UINT64_T", "NX_UINT8_T", "NX_UNION", "OR", "PARAMETER", "PARAMETER_LIST", "PLUS", "PLUSASSIGN", "PLUSPLUS", "POINTER_QUALIFIER", "POST", "POSTFIX_EXPRESSION", "POST_DECREMENT", "POST_INCREMENT", "PRE_DECREMENT", "PRE_INCREMENT", "PROVIDES", "RAW_IDENTIFIER", "RBRACE", "RBRACKET", "REGISTER", "REMOTE", "REQUIRES", "RESTRICT", "RETURN", "RPARENS", "RSHIFT", "RSHIFTASSIGN", "SHORT", "SIGNAL", "SIGNED", "SIZEOF", "SIZEOF_EXPRESSION", "SIZEOF_TYPE", "SPECIFICATION", "STAR", "STATEMENT", "STATIC", "STRING_LITERAL", "STRUCT", "SWITCH", "TASK", "TYPEDEF", "UINT16_T", "UINT32_T", "UINT64_T", "UINT8_T", "UNARY_MINUS", "UNARY_PLUS", "UNION", "UNSIGNED", "USES", "VOID", "VOLATILE", "WHILE", "WHITESPACE", "':'", "';'", "'<-'", "'?'"
    };

    public static final int EOF=-1;
    public static final int T__199=199;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int T__202=202;
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
    public static final int BUILTIN_VA_ARG=25;
    public static final int BUILTIN_VA_LIST=26;
    public static final int CALL=27;
    public static final int CASE=28;
    public static final int CAST=29;
    public static final int CHAR=30;
    public static final int CHARACTER_LITERAL=31;
    public static final int COMMA=32;
    public static final int COMMAND=33;
    public static final int COMMENT1=34;
    public static final int COMMENT2=35;
    public static final int COMMENT3=36;
    public static final int COMPONENT=37;
    public static final int COMPONENTS=38;
    public static final int COMPONENT_ARGUMENTS=39;
    public static final int COMPONENT_DECLARATION=40;
    public static final int COMPONENT_DEFINITION=41;
    public static final int COMPONENT_INSTANTIATION=42;
    public static final int COMPONENT_KIND=43;
    public static final int COMPONENT_PARAMETER_LIST=44;
    public static final int COMPOUND_STATEMENT=45;
    public static final int CONFIGURATION=46;
    public static final int CONNECTION=47;
    public static final int CONST=48;
    public static final int CONSTANT=49;
    public static final int CONTINUE=50;
    public static final int DECLARATION=51;
    public static final int DECLARATOR=52;
    public static final int DECLARATOR_ARRAY_MODIFIER=53;
    public static final int DECLARATOR_LIST=54;
    public static final int DECLARATOR_PARAMETER_LIST_MODIFIER=55;
    public static final int DEC_NUMBER=56;
    public static final int DEFAULT=57;
    public static final int DEREFERENCE=58;
    public static final int DIGIT=59;
    public static final int DIVASSIGN=60;
    public static final int DIVIDE=61;
    public static final int DO=62;
    public static final int DOT=63;
    public static final int DOUBLE=64;
    public static final int DUTY=65;
    public static final int DYNAMIC_IDENTIFIER_PATH=66;
    public static final int ELLIPSIS=67;
    public static final int ELSE=68;
    public static final int ENABLE=69;
    public static final int ENUM=70;
    public static final int ENUMERATOR=71;
    public static final int EQUAL=72;
    public static final int EVENT=73;
    public static final int EXTERN=74;
    public static final int FILE=75;
    public static final int FLOAT=76;
    public static final int FOR=77;
    public static final int FOR_CONDITION=78;
    public static final int FOR_INITIALIZE=79;
    public static final int FOR_ITERATION=80;
    public static final int FUNCTION_DEFINITION=81;
    public static final int GCCATTRIBUTE=82;
    public static final int GENERIC=83;
    public static final int GOTO=84;
    public static final int GREATER=85;
    public static final int GREATEREQUAL=86;
    public static final int HASH=87;
    public static final int HEX_DIGIT=88;
    public static final int HEX_NUMBER=89;
    public static final int IDENTIFIER_PATH=90;
    public static final int IF=91;
    public static final int IMPLEMENTATION=92;
    public static final int INITIALIZER_LIST=93;
    public static final int INIT_DECLARATOR=94;
    public static final int INLINE=95;
    public static final int INT=96;
    public static final int INT16_T=97;
    public static final int INT32_T=98;
    public static final int INT64_T=99;
    public static final int INT8_T=100;
    public static final int INTERFACE=101;
    public static final int INTERFACE_TYPE=102;
    public static final int LABELED_STATEMENT=103;
    public static final int LBRACE=104;
    public static final int LBRACKET=105;
    public static final int LESS=106;
    public static final int LESSEQUAL=107;
    public static final int LINE_DIRECTIVE=108;
    public static final int LONG=109;
    public static final int LPARENS=110;
    public static final int LSHIFT=111;
    public static final int LSHIFTASSIGN=112;
    public static final int MINUS=113;
    public static final int MINUSASSIGN=114;
    public static final int MINUSMINUS=115;
    public static final int MODASSIGN=116;
    public static final int MODULE=117;
    public static final int MODULUS=118;
    public static final int MULASSIGN=119;
    public static final int NEW=120;
    public static final int NORACE=121;
    public static final int NOT=122;
    public static final int NOTEQUAL=123;
    public static final int NULL=124;
    public static final int NUMBER=125;
    public static final int NUMBER_PREFIX=126;
    public static final int NUMBER_SUFFIX=127;
    public static final int NXLE_INT16_T=128;
    public static final int NXLE_INT32_T=129;
    public static final int NXLE_INT64_T=130;
    public static final int NXLE_INT8_T=131;
    public static final int NXLE_UINT16_T=132;
    public static final int NXLE_UINT32_T=133;
    public static final int NXLE_UINT64_T=134;
    public static final int NXLE_UINT8_T=135;
    public static final int NX_INT16_T=136;
    public static final int NX_INT32_T=137;
    public static final int NX_INT64_T=138;
    public static final int NX_INT8_T=139;
    public static final int NX_STRUCT=140;
    public static final int NX_UINT16_T=141;
    public static final int NX_UINT32_T=142;
    public static final int NX_UINT64_T=143;
    public static final int NX_UINT8_T=144;
    public static final int NX_UNION=145;
    public static final int OR=146;
    public static final int PARAMETER=147;
    public static final int PARAMETER_LIST=148;
    public static final int PLUS=149;
    public static final int PLUSASSIGN=150;
    public static final int PLUSPLUS=151;
    public static final int POINTER_QUALIFIER=152;
    public static final int POST=153;
    public static final int POSTFIX_EXPRESSION=154;
    public static final int POST_DECREMENT=155;
    public static final int POST_INCREMENT=156;
    public static final int PRE_DECREMENT=157;
    public static final int PRE_INCREMENT=158;
    public static final int PROVIDES=159;
    public static final int RAW_IDENTIFIER=160;
    public static final int RBRACE=161;
    public static final int RBRACKET=162;
    public static final int REGISTER=163;
    public static final int REMOTE=164;
    public static final int REQUIRES=165;
    public static final int RESTRICT=166;
    public static final int RETURN=167;
    public static final int RPARENS=168;
    public static final int RSHIFT=169;
    public static final int RSHIFTASSIGN=170;
    public static final int SHORT=171;
    public static final int SIGNAL=172;
    public static final int SIGNED=173;
    public static final int SIZEOF=174;
    public static final int SIZEOF_EXPRESSION=175;
    public static final int SIZEOF_TYPE=176;
    public static final int SPECIFICATION=177;
    public static final int STAR=178;
    public static final int STATEMENT=179;
    public static final int STATIC=180;
    public static final int STRING_LITERAL=181;
    public static final int STRUCT=182;
    public static final int SWITCH=183;
    public static final int TASK=184;
    public static final int TYPEDEF=185;
    public static final int UINT16_T=186;
    public static final int UINT32_T=187;
    public static final int UINT64_T=188;
    public static final int UINT8_T=189;
    public static final int UNARY_MINUS=190;
    public static final int UNARY_PLUS=191;
    public static final int UNION=192;
    public static final int UNSIGNED=193;
    public static final int USES=194;
    public static final int VOID=195;
    public static final int VOLATILE=196;
    public static final int WHILE=197;
    public static final int WHITESPACE=198;

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
    // nesC.g:307:1: primary_expression : ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression );
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
            // nesC.g:308:5: ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression )
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
                    // nesC.g:308:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression2951);
                    identifier1=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier1.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:309:10: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT2=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_primary_expression2962); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT2_tree = 
                    (Object)adaptor.create(CONSTANT2)
                    ;
                    adaptor.addChild(root_0, CONSTANT2_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:310:10: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primary_expression2973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL3_tree = 
                    (Object)adaptor.create(STRING_LITERAL3)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL3_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:311:10: CHARACTER_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARACTER_LITERAL4=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_primary_expression2984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARACTER_LITERAL4_tree = 
                    (Object)adaptor.create(CHARACTER_LITERAL4)
                    ;
                    adaptor.addChild(root_0, CHARACTER_LITERAL4_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:312:10: '(' expression ')'
                    {
                    char_literal5=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_primary_expression2995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_primary_expression2997);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

                    char_literal7=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_primary_expression2999); if (state.failed) return retval; 
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
                    // 312:29: -> expression
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
    // nesC.g:320:1: postfix_expression : ( ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) | BUILTIN_VA_ARG '(' expression ',' type_name ')' -> ^( BUILTIN_VA_ARG expression type_name ) );
    public final nesCParser.postfix_expression_return postfix_expression() throws RecognitionException {
        nesCParser.postfix_expression_return retval = new nesCParser.postfix_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BUILTIN_VA_ARG11=null;
        Token char_literal12=null;
        Token char_literal14=null;
        Token char_literal16=null;
        nesCParser.call_kind_return call_kind8 =null;

        nesCParser.primary_expression_return primary_expression9 =null;

        nesCParser.postfix_expression_modifier_return postfix_expression_modifier10 =null;

        nesCParser.expression_return expression13 =null;

        nesCParser.type_name_return type_name15 =null;


        Object BUILTIN_VA_ARG11_tree=null;
        Object char_literal12_tree=null;
        Object char_literal14_tree=null;
        Object char_literal16_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_BUILTIN_VA_ARG=new RewriteRuleTokenStream(adaptor,"token BUILTIN_VA_ARG");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_call_kind=new RewriteRuleSubtreeStream(adaptor,"rule call_kind");
        RewriteRuleSubtreeStream stream_postfix_expression_modifier=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression_modifier");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // nesC.g:321:5: ( ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) | BUILTIN_VA_ARG '(' expression ',' type_name ')' -> ^( BUILTIN_VA_ARG expression type_name ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CALL||LA4_0==CHARACTER_LITERAL||LA4_0==CONSTANT||LA4_0==LPARENS||LA4_0==POST||LA4_0==RAW_IDENTIFIER||LA4_0==SIGNAL||LA4_0==STRING_LITERAL) ) {
                alt4=1;
            }
            else if ( (LA4_0==BUILTIN_VA_ARG) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // nesC.g:321:10: ( call_kind )? primary_expression ( postfix_expression_modifier )*
                    {
                    // nesC.g:321:10: ( call_kind )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==CALL||LA2_0==POST||LA2_0==SIGNAL) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // nesC.g:321:10: call_kind
                            {
                            pushFollow(FOLLOW_call_kind_in_postfix_expression3024);
                            call_kind8=call_kind();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_call_kind.add(call_kind8.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_primary_expression_in_postfix_expression3027);
                    primary_expression9=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression9.getTree());

                    // nesC.g:321:40: ( postfix_expression_modifier )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==ARROW||LA3_0==DOT||LA3_0==LBRACKET||LA3_0==LPARENS||LA3_0==MINUSMINUS||LA3_0==PLUSPLUS) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // nesC.g:321:40: postfix_expression_modifier
                    	    {
                    	    pushFollow(FOLLOW_postfix_expression_modifier_in_postfix_expression3029);
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
                    // 322:13: -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
                    {
                        // nesC.g:322:16: ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION")
                        , root_1);

                        // nesC.g:322:37: ( call_kind )?
                        if ( stream_call_kind.hasNext() ) {
                            adaptor.addChild(root_1, stream_call_kind.nextTree());

                        }
                        stream_call_kind.reset();

                        adaptor.addChild(root_1, stream_primary_expression.nextTree());

                        // nesC.g:322:67: ( postfix_expression_modifier )*
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
                    break;
                case 2 :
                    // nesC.g:323:10: BUILTIN_VA_ARG '(' expression ',' type_name ')'
                    {
                    BUILTIN_VA_ARG11=(Token)match(input,BUILTIN_VA_ARG,FOLLOW_BUILTIN_VA_ARG_in_postfix_expression3067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BUILTIN_VA_ARG.add(BUILTIN_VA_ARG11);


                    char_literal12=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression3069); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal12);


                    pushFollow(FOLLOW_expression_in_postfix_expression3071);
                    expression13=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression13.getTree());

                    char_literal14=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix_expression3073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(char_literal14);


                    pushFollow(FOLLOW_type_name_in_postfix_expression3075);
                    type_name15=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name15.getTree());

                    char_literal16=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression3077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal16);


                    // AST REWRITE
                    // elements: expression, type_name, BUILTIN_VA_ARG
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 324:13: -> ^( BUILTIN_VA_ARG expression type_name )
                    {
                        // nesC.g:324:16: ^( BUILTIN_VA_ARG expression type_name )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_BUILTIN_VA_ARG.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_type_name.nextTree());

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
    // $ANTLR end "postfix_expression"


    public static class postfix_expression_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expression_modifier"
    // nesC.g:326:1: postfix_expression_modifier : ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' );
    public final nesCParser.postfix_expression_modifier_return postfix_expression_modifier() throws RecognitionException {
        nesCParser.postfix_expression_modifier_return retval = new nesCParser.postfix_expression_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal17=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token char_literal22=null;
        Token char_literal23=null;
        Token string_literal25=null;
        Token string_literal27=null;
        Token string_literal28=null;
        nesCParser.expression_return expression18 =null;

        nesCParser.argument_expression_list_return argument_expression_list21 =null;

        nesCParser.identifier_return identifier24 =null;

        nesCParser.identifier_return identifier26 =null;


        Object char_literal17_tree=null;
        Object char_literal19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        Object char_literal23_tree=null;
        Object string_literal25_tree=null;
        Object string_literal27_tree=null;
        Object string_literal28_tree=null;
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
            // nesC.g:327:5: ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' )
            int alt6=6;
            switch ( input.LA(1) ) {
            case LBRACKET:
                {
                alt6=1;
                }
                break;
            case LPARENS:
                {
                alt6=2;
                }
                break;
            case DOT:
                {
                alt6=3;
                }
                break;
            case ARROW:
                {
                alt6=4;
                }
                break;
            case PLUSPLUS:
                {
                alt6=5;
                }
                break;
            case MINUSMINUS:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // nesC.g:327:9: '[' expression ']'
                    {
                    char_literal17=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_postfix_expression_modifier3115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal17);


                    pushFollow(FOLLOW_expression_in_postfix_expression_modifier3117);
                    expression18=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression18.getTree());

                    char_literal19=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_postfix_expression_modifier3119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal19);


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
                    // 327:28: -> ^( ARRAY_ELEMENT_SELECTION expression )
                    {
                        // nesC.g:327:31: ^( ARRAY_ELEMENT_SELECTION expression )
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
                    // nesC.g:328:9: '(' ( argument_expression_list )? ')'
                    {
                    char_literal20=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression_modifier3137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal20);


                    // nesC.g:328:13: ( argument_expression_list )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==AMP||LA5_0==BITCOMPLEMENT||LA5_0==BUILTIN_VA_ARG||LA5_0==CALL||LA5_0==CHARACTER_LITERAL||LA5_0==CONSTANT||LA5_0==LPARENS||LA5_0==MINUS||LA5_0==MINUSMINUS||LA5_0==NOT||LA5_0==PLUS||LA5_0==PLUSPLUS||LA5_0==POST||LA5_0==RAW_IDENTIFIER||LA5_0==SIGNAL||LA5_0==SIZEOF||LA5_0==STAR||LA5_0==STRING_LITERAL) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // nesC.g:328:13: argument_expression_list
                            {
                            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression_modifier3139);
                            argument_expression_list21=argument_expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list21.getTree());

                            }
                            break;

                    }


                    char_literal22=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression_modifier3142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal22);


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
                    // 328:43: -> ^( ARGUMENT_LIST ( argument_expression_list )? )
                    {
                        // nesC.g:328:46: ^( ARGUMENT_LIST ( argument_expression_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST")
                        , root_1);

                        // nesC.g:328:62: ( argument_expression_list )?
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
                    // nesC.g:329:9: '.' identifier
                    {
                    char_literal23=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression_modifier3161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal23);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier3163);
                    identifier24=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier24.getTree());

                    // AST REWRITE
                    // elements: DOT, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 329:24: -> ^( '.' identifier )
                    {
                        // nesC.g:329:27: ^( '.' identifier )
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
                    // nesC.g:330:9: '->' identifier
                    {
                    string_literal25=(Token)match(input,ARROW,FOLLOW_ARROW_in_postfix_expression_modifier3181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal25);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier3183);
                    identifier26=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier26.getTree());

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
                    // 330:25: -> ^( '->' identifier )
                    {
                        // nesC.g:330:28: ^( '->' identifier )
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
                    // nesC.g:331:9: '++'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal27=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfix_expression_modifier3201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal27_tree = 
                    (Object)adaptor.create(string_literal27)
                    ;
                    adaptor.addChild(root_0, string_literal27_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:332:9: '--'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal28=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfix_expression_modifier3211); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal28_tree = 
                    (Object)adaptor.create(string_literal28)
                    ;
                    adaptor.addChild(root_0, string_literal28_tree);
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
    // nesC.g:334:1: call_kind : ( CALL | POST | SIGNAL );
    public final nesCParser.call_kind_return call_kind() throws RecognitionException {
        nesCParser.call_kind_return retval = new nesCParser.call_kind_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set29=null;

        Object set29_tree=null;

        try {
            // nesC.g:335:5: ( CALL | POST | SIGNAL )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set29=(Token)input.LT(1);

            if ( input.LA(1)==CALL||input.LA(1)==POST||input.LA(1)==SIGNAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set29)
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
    // nesC.g:339:1: argument_expression_list : assignment_expression ( ',' ! assignment_expression )* ;
    public final nesCParser.argument_expression_list_return argument_expression_list() throws RecognitionException {
        nesCParser.argument_expression_list_return retval = new nesCParser.argument_expression_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal31=null;
        nesCParser.assignment_expression_return assignment_expression30 =null;

        nesCParser.assignment_expression_return assignment_expression32 =null;


        Object char_literal31_tree=null;

        try {
            // nesC.g:340:5: ( assignment_expression ( ',' ! assignment_expression )* )
            // nesC.g:340:10: assignment_expression ( ',' ! assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3271);
            assignment_expression30=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression30.getTree());

            // nesC.g:340:32: ( ',' ! assignment_expression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // nesC.g:340:33: ',' ! assignment_expression
            	    {
            	    char_literal31=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list3274); if (state.failed) return retval;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3277);
            	    assignment_expression32=assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression32.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // nesC.g:347:1: unary_expression : ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | postfix_expression );
    public final nesCParser.unary_expression_return unary_expression() throws RecognitionException {
        nesCParser.unary_expression_return retval = new nesCParser.unary_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal33=null;
        Token string_literal35=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token char_literal45=null;
        Token char_literal46=null;
        Token SIZEOF48=null;
        Token char_literal49=null;
        Token char_literal51=null;
        nesCParser.unary_expression_return unary_expression34 =null;

        nesCParser.unary_expression_return unary_expression36 =null;

        nesCParser.cast_expression_return cast_expression38 =null;

        nesCParser.cast_expression_return cast_expression40 =null;

        nesCParser.cast_expression_return cast_expression42 =null;

        nesCParser.cast_expression_return cast_expression44 =null;

        nesCParser.cast_expression_return cast_expression47 =null;

        nesCParser.type_name_return type_name50 =null;

        nesCParser.postfix_expression_return postfix_expression52 =null;


        Object string_literal33_tree=null;
        Object string_literal35_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        Object char_literal45_tree=null;
        Object char_literal46_tree=null;
        Object SIZEOF48_tree=null;
        Object char_literal49_tree=null;
        Object char_literal51_tree=null;
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
            // nesC.g:348:5: ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | postfix_expression )
            int alt9=9;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                alt9=1;
                }
                break;
            case MINUSMINUS:
                {
                alt9=2;
                }
                break;
            case AMP:
                {
                alt9=3;
                }
                break;
            case STAR:
                {
                alt9=4;
                }
                break;
            case PLUS:
                {
                alt9=5;
                }
                break;
            case MINUS:
                {
                alt9=6;
                }
                break;
            case BITCOMPLEMENT:
            case NOT:
                {
                alt9=7;
                }
                break;
            case SIZEOF:
                {
                alt9=8;
                }
                break;
            case BUILTIN_VA_ARG:
            case CALL:
            case CHARACTER_LITERAL:
            case CONSTANT:
            case LPARENS:
            case POST:
            case RAW_IDENTIFIER:
            case SIGNAL:
            case STRING_LITERAL:
                {
                alt9=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // nesC.g:348:10: '++' unary_expression
                    {
                    string_literal33=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unary_expression3303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(string_literal33);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3305);
                    unary_expression34=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression34.getTree());

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
                    // 348:32: -> ^( PRE_INCREMENT unary_expression )
                    {
                        // nesC.g:348:35: ^( PRE_INCREMENT unary_expression )
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
                    // nesC.g:349:10: '--' unary_expression
                    {
                    string_literal35=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unary_expression3324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUSMINUS.add(string_literal35);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3326);
                    unary_expression36=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression36.getTree());

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
                    // 349:32: -> ^( PRE_DECREMENT unary_expression )
                    {
                        // nesC.g:349:35: ^( PRE_DECREMENT unary_expression )
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
                    // nesC.g:350:10: '&' cast_expression
                    {
                    char_literal37=(Token)match(input,AMP,FOLLOW_AMP_in_unary_expression3345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMP.add(char_literal37);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3348);
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
                    // 350:32: -> ^( ADDRESS_OF cast_expression )
                    {
                        // nesC.g:350:35: ^( ADDRESS_OF cast_expression )
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
                    // nesC.g:351:10: '*' cast_expression
                    {
                    char_literal39=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression3372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal39);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3375);
                    cast_expression40=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression40.getTree());

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
                    // 351:32: -> ^( DEREFERENCE cast_expression )
                    {
                        // nesC.g:351:35: ^( DEREFERENCE cast_expression )
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
                    // nesC.g:352:10: '+' cast_expression
                    {
                    char_literal41=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression3398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal41);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3401);
                    cast_expression42=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression42.getTree());

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
                    // 352:32: -> ^( UNARY_PLUS cast_expression )
                    {
                        // nesC.g:352:35: ^( UNARY_PLUS cast_expression )
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
                    // nesC.g:353:10: '-' cast_expression
                    {
                    char_literal43=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression3425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal43);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3428);
                    cast_expression44=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression44.getTree());

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
                    // 353:32: -> ^( UNARY_MINUS cast_expression )
                    {
                        // nesC.g:353:35: ^( UNARY_MINUS cast_expression )
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
                    // nesC.g:354:10: ( '~' ^| '!' ^) cast_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:354:10: ( '~' ^| '!' ^)
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==BITCOMPLEMENT) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==NOT) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }
                    switch (alt8) {
                        case 1 :
                            // nesC.g:354:11: '~' ^
                            {
                            char_literal45=(Token)match(input,BITCOMPLEMENT,FOLLOW_BITCOMPLEMENT_in_unary_expression3452); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal45_tree = 
                            (Object)adaptor.create(char_literal45)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal45_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:354:18: '!' ^
                            {
                            char_literal46=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression3457); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal46_tree = 
                            (Object)adaptor.create(char_literal46)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal46_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3461);
                    cast_expression47=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression47.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:355:10: SIZEOF '(' type_name ')'
                    {
                    SIZEOF48=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF48);


                    char_literal49=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_unary_expression3474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal49);


                    pushFollow(FOLLOW_type_name_in_unary_expression3476);
                    type_name50=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name50.getTree());

                    char_literal51=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_unary_expression3478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal51);


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
                    // 355:35: -> ^( SIZEOF_TYPE type_name )
                    {
                        // nesC.g:355:38: ^( SIZEOF_TYPE type_name )
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
                    // nesC.g:357:10: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression3498);
                    postfix_expression52=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression52.getTree());

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
    // nesC.g:363:1: cast_expression : ( ( '(' type_name ')' )=> '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression );
    public final nesCParser.cast_expression_return cast_expression() throws RecognitionException {
        nesCParser.cast_expression_return retval = new nesCParser.cast_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal53=null;
        Token char_literal55=null;
        nesCParser.type_name_return type_name54 =null;

        nesCParser.cast_expression_return cast_expression56 =null;

        nesCParser.unary_expression_return unary_expression57 =null;


        Object char_literal53_tree=null;
        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // nesC.g:364:5: ( ( '(' type_name ')' )=> '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LPARENS) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred1_nesC()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA10_0==AMP||LA10_0==BITCOMPLEMENT||LA10_0==BUILTIN_VA_ARG||LA10_0==CALL||LA10_0==CHARACTER_LITERAL||LA10_0==CONSTANT||LA10_0==MINUS||LA10_0==MINUSMINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==PLUSPLUS||LA10_0==POST||LA10_0==RAW_IDENTIFIER||LA10_0==SIGNAL||LA10_0==SIZEOF||LA10_0==STAR||LA10_0==STRING_LITERAL) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // nesC.g:364:10: ( '(' type_name ')' )=> '(' type_name ')' cast_expression
                    {
                    char_literal53=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_cast_expression3537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal53);


                    pushFollow(FOLLOW_type_name_in_cast_expression3539);
                    type_name54=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name54.getTree());

                    char_literal55=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_cast_expression3541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal55);


                    pushFollow(FOLLOW_cast_expression_in_cast_expression3543);
                    cast_expression56=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression56.getTree());

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
                    // 365:45: -> ^( CAST cast_expression type_name )
                    {
                        // nesC.g:365:48: ^( CAST cast_expression type_name )
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
                    // nesC.g:366:10: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression3564);
                    unary_expression57=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression57.getTree());

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
    // nesC.g:368:1: multiplicative_expression : cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* ;
    public final nesCParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        nesCParser.multiplicative_expression_return retval = new nesCParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        nesCParser.cast_expression_return cast_expression58 =null;

        nesCParser.cast_expression_return cast_expression62 =null;


        Object char_literal59_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;

        try {
            // nesC.g:369:5: ( cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* )
            // nesC.g:369:10: cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3583);
            cast_expression58=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression58.getTree());

            // nesC.g:369:26: ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==DIVIDE||LA12_0==MODULUS||LA12_0==STAR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // nesC.g:369:28: ( '*' ^| '/' ^| '%' ^) cast_expression
            	    {
            	    // nesC.g:369:28: ( '*' ^| '/' ^| '%' ^)
            	    int alt11=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case DIVIDE:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case MODULUS:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // nesC.g:369:29: '*' ^
            	            {
            	            char_literal59=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression3588); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal59_tree = 
            	            (Object)adaptor.create(char_literal59)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal59_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:369:36: '/' ^
            	            {
            	            char_literal60=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expression3593); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal60_tree = 
            	            (Object)adaptor.create(char_literal60)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:369:43: '%' ^
            	            {
            	            char_literal61=(Token)match(input,MODULUS,FOLLOW_MODULUS_in_multiplicative_expression3598); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal61_tree = 
            	            (Object)adaptor.create(char_literal61)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal61_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3602);
            	    cast_expression62=cast_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression62.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // nesC.g:371:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
    public final nesCParser.additive_expression_return additive_expression() throws RecognitionException {
        nesCParser.additive_expression_return retval = new nesCParser.additive_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal64=null;
        Token char_literal65=null;
        nesCParser.multiplicative_expression_return multiplicative_expression63 =null;

        nesCParser.multiplicative_expression_return multiplicative_expression66 =null;


        Object char_literal64_tree=null;
        Object char_literal65_tree=null;

        try {
            // nesC.g:372:5: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
            // nesC.g:372:10: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3623);
            multiplicative_expression63=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression63.getTree());

            // nesC.g:372:36: ( ( '+' ^| '-' ^) multiplicative_expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // nesC.g:372:38: ( '+' ^| '-' ^) multiplicative_expression
            	    {
            	    // nesC.g:372:38: ( '+' ^| '-' ^)
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==PLUS) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==MINUS) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // nesC.g:372:39: '+' ^
            	            {
            	            char_literal64=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression3628); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal64_tree = 
            	            (Object)adaptor.create(char_literal64)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:372:46: '-' ^
            	            {
            	            char_literal65=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression3633); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal65_tree = 
            	            (Object)adaptor.create(char_literal65)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal65_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3637);
            	    multiplicative_expression66=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression66.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // nesC.g:374:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
    public final nesCParser.shift_expression_return shift_expression() throws RecognitionException {
        nesCParser.shift_expression_return retval = new nesCParser.shift_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal68=null;
        Token string_literal69=null;
        nesCParser.additive_expression_return additive_expression67 =null;

        nesCParser.additive_expression_return additive_expression70 =null;


        Object string_literal68_tree=null;
        Object string_literal69_tree=null;

        try {
            // nesC.g:375:5: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // nesC.g:375:10: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression3658);
            additive_expression67=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression67.getTree());

            // nesC.g:375:30: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LSHIFT||LA16_0==RSHIFT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // nesC.g:375:32: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // nesC.g:375:32: ( '<<' ^| '>>' ^)
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==LSHIFT) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==RSHIFT) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // nesC.g:375:33: '<<' ^
            	            {
            	            string_literal68=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression3663); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal68_tree = 
            	            (Object)adaptor.create(string_literal68)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal68_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:375:41: '>>' ^
            	            {
            	            string_literal69=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression3668); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal69_tree = 
            	            (Object)adaptor.create(string_literal69)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal69_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression3672);
            	    additive_expression70=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression70.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // nesC.g:377:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
    public final nesCParser.relational_expression_return relational_expression() throws RecognitionException {
        nesCParser.relational_expression_return retval = new nesCParser.relational_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal72=null;
        Token char_literal73=null;
        Token string_literal74=null;
        Token string_literal75=null;
        nesCParser.shift_expression_return shift_expression71 =null;

        nesCParser.shift_expression_return shift_expression76 =null;


        Object char_literal72_tree=null;
        Object char_literal73_tree=null;
        Object string_literal74_tree=null;
        Object string_literal75_tree=null;

        try {
            // nesC.g:378:5: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // nesC.g:378:10: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression3693);
            shift_expression71=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression71.getTree());

            // nesC.g:378:27: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= GREATER && LA18_0 <= GREATEREQUAL)||(LA18_0 >= LESS && LA18_0 <= LESSEQUAL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // nesC.g:378:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // nesC.g:378:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
            	    int alt17=4;
            	    switch ( input.LA(1) ) {
            	    case LESS:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case GREATER:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case LESSEQUAL:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case GREATEREQUAL:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // nesC.g:378:30: '<' ^
            	            {
            	            char_literal72=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression3698); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal72_tree = 
            	            (Object)adaptor.create(char_literal72)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal72_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:378:37: '>' ^
            	            {
            	            char_literal73=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression3703); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal73_tree = 
            	            (Object)adaptor.create(char_literal73)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal73_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:378:44: '<=' ^
            	            {
            	            string_literal74=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relational_expression3708); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal74_tree = 
            	            (Object)adaptor.create(string_literal74)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // nesC.g:378:52: '>=' ^
            	            {
            	            string_literal75=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relational_expression3713); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal75_tree = 
            	            (Object)adaptor.create(string_literal75)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal75_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression3717);
            	    shift_expression76=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression76.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // nesC.g:380:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
    public final nesCParser.equality_expression_return equality_expression() throws RecognitionException {
        nesCParser.equality_expression_return retval = new nesCParser.equality_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal78=null;
        Token string_literal79=null;
        nesCParser.relational_expression_return relational_expression77 =null;

        nesCParser.relational_expression_return relational_expression80 =null;


        Object string_literal78_tree=null;
        Object string_literal79_tree=null;

        try {
            // nesC.g:381:5: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // nesC.g:381:10: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression3738);
            relational_expression77=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression77.getTree());

            // nesC.g:381:32: ( ( '==' ^| '!=' ^) relational_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EQUAL||LA20_0==NOTEQUAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // nesC.g:381:34: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // nesC.g:381:34: ( '==' ^| '!=' ^)
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==EQUAL) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==NOTEQUAL) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // nesC.g:381:35: '==' ^
            	            {
            	            string_literal78=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equality_expression3743); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal78_tree = 
            	            (Object)adaptor.create(string_literal78)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal78_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:381:43: '!=' ^
            	            {
            	            string_literal79=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equality_expression3748); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal79_tree = 
            	            (Object)adaptor.create(string_literal79)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal79_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression3752);
            	    relational_expression80=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression80.getTree());

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
    // $ANTLR end "equality_expression"


    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expression"
    // nesC.g:383:1: and_expression : equality_expression ( '&' ^ equality_expression )* ;
    public final nesCParser.and_expression_return and_expression() throws RecognitionException {
        nesCParser.and_expression_return retval = new nesCParser.and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal82=null;
        nesCParser.equality_expression_return equality_expression81 =null;

        nesCParser.equality_expression_return equality_expression83 =null;


        Object char_literal82_tree=null;

        try {
            // nesC.g:384:5: ( equality_expression ( '&' ^ equality_expression )* )
            // nesC.g:384:10: equality_expression ( '&' ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_and_expression3773);
            equality_expression81=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression81.getTree());

            // nesC.g:384:30: ( '&' ^ equality_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AMP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // nesC.g:384:32: '&' ^ equality_expression
            	    {
            	    char_literal82=(Token)match(input,AMP,FOLLOW_AMP_in_and_expression3777); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal82_tree = 
            	    (Object)adaptor.create(char_literal82)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal82_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_and_expression3780);
            	    equality_expression83=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression83.getTree());

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
    // $ANTLR end "and_expression"


    public static class xor_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xor_expression"
    // nesC.g:386:1: xor_expression : and_expression ( '^' ^ and_expression )* ;
    public final nesCParser.xor_expression_return xor_expression() throws RecognitionException {
        nesCParser.xor_expression_return retval = new nesCParser.xor_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal85=null;
        nesCParser.and_expression_return and_expression84 =null;

        nesCParser.and_expression_return and_expression86 =null;


        Object char_literal85_tree=null;

        try {
            // nesC.g:387:5: ( and_expression ( '^' ^ and_expression )* )
            // nesC.g:387:10: and_expression ( '^' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_xor_expression3801);
            and_expression84=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression84.getTree());

            // nesC.g:387:25: ( '^' ^ and_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BITXOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // nesC.g:387:27: '^' ^ and_expression
            	    {
            	    char_literal85=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_xor_expression3805); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal85_tree = 
            	    (Object)adaptor.create(char_literal85)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal85_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_xor_expression3808);
            	    and_expression86=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression86.getTree());

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
    // $ANTLR end "xor_expression"


    public static class or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_expression"
    // nesC.g:389:1: or_expression : xor_expression ( '|' ^ xor_expression )* ;
    public final nesCParser.or_expression_return or_expression() throws RecognitionException {
        nesCParser.or_expression_return retval = new nesCParser.or_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal88=null;
        nesCParser.xor_expression_return xor_expression87 =null;

        nesCParser.xor_expression_return xor_expression89 =null;


        Object char_literal88_tree=null;

        try {
            // nesC.g:390:5: ( xor_expression ( '|' ^ xor_expression )* )
            // nesC.g:390:10: xor_expression ( '|' ^ xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expression_in_or_expression3829);
            xor_expression87=xor_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression87.getTree());

            // nesC.g:390:25: ( '|' ^ xor_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==BITOR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // nesC.g:390:27: '|' ^ xor_expression
            	    {
            	    char_literal88=(Token)match(input,BITOR,FOLLOW_BITOR_in_or_expression3833); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal88_tree = 
            	    (Object)adaptor.create(char_literal88)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal88_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_xor_expression_in_or_expression3836);
            	    xor_expression89=xor_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression89.getTree());

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
    // $ANTLR end "or_expression"


    public static class logical_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_and_expression"
    // nesC.g:392:1: logical_and_expression : or_expression ( '&&' ^ or_expression )* ;
    public final nesCParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        nesCParser.logical_and_expression_return retval = new nesCParser.logical_and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal91=null;
        nesCParser.or_expression_return or_expression90 =null;

        nesCParser.or_expression_return or_expression92 =null;


        Object string_literal91_tree=null;

        try {
            // nesC.g:393:5: ( or_expression ( '&&' ^ or_expression )* )
            // nesC.g:393:10: or_expression ( '&&' ^ or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_expression_in_logical_and_expression3857);
            or_expression90=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression90.getTree());

            // nesC.g:393:24: ( '&&' ^ or_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // nesC.g:393:26: '&&' ^ or_expression
            	    {
            	    string_literal91=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression3861); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal91_tree = 
            	    (Object)adaptor.create(string_literal91)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal91_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression3864);
            	    or_expression92=or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression92.getTree());

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
    // $ANTLR end "logical_and_expression"


    public static class logical_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_or_expression"
    // nesC.g:395:1: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
    public final nesCParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        nesCParser.logical_or_expression_return retval = new nesCParser.logical_or_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal94=null;
        nesCParser.logical_and_expression_return logical_and_expression93 =null;

        nesCParser.logical_and_expression_return logical_and_expression95 =null;


        Object string_literal94_tree=null;

        try {
            // nesC.g:396:5: ( logical_and_expression ( '||' ^ logical_and_expression )* )
            // nesC.g:396:10: logical_and_expression ( '||' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3885);
            logical_and_expression93=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression93.getTree());

            // nesC.g:396:33: ( '||' ^ logical_and_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // nesC.g:396:35: '||' ^ logical_and_expression
            	    {
            	    string_literal94=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression3889); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal94_tree = 
            	    (Object)adaptor.create(string_literal94)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal94_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3892);
            	    logical_and_expression95=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression95.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // nesC.g:398:1: conditional_expression : logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? ;
    public final nesCParser.conditional_expression_return conditional_expression() throws RecognitionException {
        nesCParser.conditional_expression_return retval = new nesCParser.conditional_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal97=null;
        Token char_literal99=null;
        nesCParser.logical_or_expression_return logical_or_expression96 =null;

        nesCParser.expression_return expression98 =null;

        nesCParser.conditional_expression_return conditional_expression100 =null;


        Object char_literal97_tree=null;
        Object char_literal99_tree=null;

        try {
            // nesC.g:399:5: ( logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? )
            // nesC.g:399:10: logical_or_expression ( '?' ^ expression ':' ! conditional_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression3913);
            logical_or_expression96=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression96.getTree());

            // nesC.g:399:32: ( '?' ^ expression ':' ! conditional_expression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==202) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // nesC.g:399:33: '?' ^ expression ':' ! conditional_expression
                    {
                    char_literal97=(Token)match(input,202,FOLLOW_202_in_conditional_expression3916); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal97_tree = 
                    (Object)adaptor.create(char_literal97)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal97_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_conditional_expression3919);
                    expression98=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression98.getTree());

                    char_literal99=(Token)match(input,199,FOLLOW_199_in_conditional_expression3921); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression3924);
                    conditional_expression100=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression100.getTree());

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
    // nesC.g:410:1: assignment_expression : conditional_expression ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )? ;
    public final nesCParser.assignment_expression_return assignment_expression() throws RecognitionException {
        nesCParser.assignment_expression_return retval = new nesCParser.assignment_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token string_literal105=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token string_literal108=null;
        Token string_literal109=null;
        Token string_literal110=null;
        Token string_literal111=null;
        Token string_literal112=null;
        nesCParser.conditional_expression_return conditional_expression101 =null;

        nesCParser.assignment_expression_return assignment_expression113 =null;


        Object char_literal102_tree=null;
        Object string_literal103_tree=null;
        Object string_literal104_tree=null;
        Object string_literal105_tree=null;
        Object string_literal106_tree=null;
        Object string_literal107_tree=null;
        Object string_literal108_tree=null;
        Object string_literal109_tree=null;
        Object string_literal110_tree=null;
        Object string_literal111_tree=null;
        Object string_literal112_tree=null;

        try {
            // nesC.g:411:5: ( conditional_expression ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )? )
            // nesC.g:411:10: conditional_expression ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_assignment_expression3954);
            conditional_expression101=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression101.getTree());

            // nesC.g:411:33: ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ASSIGN||LA28_0==BITANDASSIGN||LA28_0==BITORASSIGN||LA28_0==BITXORASSIGN||LA28_0==DIVASSIGN||LA28_0==LSHIFTASSIGN||LA28_0==MINUSASSIGN||LA28_0==MODASSIGN||LA28_0==MULASSIGN||LA28_0==PLUSASSIGN||LA28_0==RSHIFTASSIGN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // nesC.g:411:34: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression
                    {
                    // nesC.g:411:34: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^)
                    int alt27=11;
                    switch ( input.LA(1) ) {
                    case ASSIGN:
                        {
                        alt27=1;
                        }
                        break;
                    case MULASSIGN:
                        {
                        alt27=2;
                        }
                        break;
                    case DIVASSIGN:
                        {
                        alt27=3;
                        }
                        break;
                    case MODASSIGN:
                        {
                        alt27=4;
                        }
                        break;
                    case PLUSASSIGN:
                        {
                        alt27=5;
                        }
                        break;
                    case MINUSASSIGN:
                        {
                        alt27=6;
                        }
                        break;
                    case LSHIFTASSIGN:
                        {
                        alt27=7;
                        }
                        break;
                    case RSHIFTASSIGN:
                        {
                        alt27=8;
                        }
                        break;
                    case BITANDASSIGN:
                        {
                        alt27=9;
                        }
                        break;
                    case BITXORASSIGN:
                        {
                        alt27=10;
                        }
                        break;
                    case BITORASSIGN:
                        {
                        alt27=11;
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
                            // nesC.g:411:35: '=' ^
                            {
                            char_literal102=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expression3958); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal102_tree = 
                            (Object)adaptor.create(char_literal102)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal102_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:411:42: '*=' ^
                            {
                            string_literal103=(Token)match(input,MULASSIGN,FOLLOW_MULASSIGN_in_assignment_expression3963); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal103_tree = 
                            (Object)adaptor.create(string_literal103)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // nesC.g:411:50: '/=' ^
                            {
                            string_literal104=(Token)match(input,DIVASSIGN,FOLLOW_DIVASSIGN_in_assignment_expression3968); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal104_tree = 
                            (Object)adaptor.create(string_literal104)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal104_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // nesC.g:411:58: '%=' ^
                            {
                            string_literal105=(Token)match(input,MODASSIGN,FOLLOW_MODASSIGN_in_assignment_expression3973); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal105_tree = 
                            (Object)adaptor.create(string_literal105)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal105_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // nesC.g:411:66: '+=' ^
                            {
                            string_literal106=(Token)match(input,PLUSASSIGN,FOLLOW_PLUSASSIGN_in_assignment_expression3978); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal106_tree = 
                            (Object)adaptor.create(string_literal106)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // nesC.g:411:74: '-=' ^
                            {
                            string_literal107=(Token)match(input,MINUSASSIGN,FOLLOW_MINUSASSIGN_in_assignment_expression3983); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal107_tree = 
                            (Object)adaptor.create(string_literal107)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal107_tree, root_0);
                            }

                            }
                            break;
                        case 7 :
                            // nesC.g:411:82: '<<=' ^
                            {
                            string_literal108=(Token)match(input,LSHIFTASSIGN,FOLLOW_LSHIFTASSIGN_in_assignment_expression3988); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal108_tree = 
                            (Object)adaptor.create(string_literal108)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal108_tree, root_0);
                            }

                            }
                            break;
                        case 8 :
                            // nesC.g:411:91: '>>=' ^
                            {
                            string_literal109=(Token)match(input,RSHIFTASSIGN,FOLLOW_RSHIFTASSIGN_in_assignment_expression3993); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal109_tree = 
                            (Object)adaptor.create(string_literal109)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal109_tree, root_0);
                            }

                            }
                            break;
                        case 9 :
                            // nesC.g:411:100: '&=' ^
                            {
                            string_literal110=(Token)match(input,BITANDASSIGN,FOLLOW_BITANDASSIGN_in_assignment_expression3998); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal110_tree = 
                            (Object)adaptor.create(string_literal110)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);
                            }

                            }
                            break;
                        case 10 :
                            // nesC.g:411:108: '^=' ^
                            {
                            string_literal111=(Token)match(input,BITXORASSIGN,FOLLOW_BITXORASSIGN_in_assignment_expression4003); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal111_tree = 
                            (Object)adaptor.create(string_literal111)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal111_tree, root_0);
                            }

                            }
                            break;
                        case 11 :
                            // nesC.g:411:116: '|=' ^
                            {
                            string_literal112=(Token)match(input,BITORASSIGN,FOLLOW_BITORASSIGN_in_assignment_expression4008); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal112_tree = 
                            (Object)adaptor.create(string_literal112)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal112_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression4012);
                    assignment_expression113=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression113.getTree());

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
    // nesC.g:413:1: expression : assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )* ;
    public final nesCParser.expression_return expression() throws RecognitionException {
        nesCParser.expression_return retval = new nesCParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal115=null;
        nesCParser.assignment_expression_return assignment_expression114 =null;

        nesCParser.assignment_expression_return assignment_expression116 =null;


        Object char_literal115_tree=null;

        try {
            // nesC.g:414:5: ( assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )* )
            // nesC.g:414:10: assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression4029);
            assignment_expression114=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression114.getTree());

            // nesC.g:414:32: ( ( ',' assignment_expression )=> ',' ^ assignment_expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred2_nesC()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // nesC.g:414:33: ( ',' assignment_expression )=> ',' ^ assignment_expression
            	    {
            	    char_literal115=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression4040); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal115_tree = 
            	    (Object)adaptor.create(char_literal115)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal115_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression4043);
            	    assignment_expression116=assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression116.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // nesC.g:416:1: constant_expression : conditional_expression ;
    public final nesCParser.constant_expression_return constant_expression() throws RecognitionException {
        nesCParser.constant_expression_return retval = new nesCParser.constant_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.conditional_expression_return conditional_expression117 =null;



        try {
            // nesC.g:417:5: ( conditional_expression )
            // nesC.g:417:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression4064);
            conditional_expression117=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression117.getTree());

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
    // nesC.g:437:1: declaration : ( ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';' -> ^( DECLARATION TYPEDEF declaration_specifiers ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) );
    public final nesCParser.declaration_return declaration() throws RecognitionException {
        declaration_stack.push(new declaration_scope());
        nesCParser.declaration_return retval = new nesCParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal121=null;
        Token TYPEDEF123=null;
        Token char_literal125=null;
        Token TYPEDEF126=null;
        Token char_literal131=null;
        nesCParser.declaration_specifiers_return declaration_specifiers118 =null;

        nesCParser.gcc_attributes_return gcc_attributes119 =null;

        nesCParser.init_declarator_list_return init_declarator_list120 =null;

        nesCParser.function_definition_return function_definition122 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers124 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers127 =null;

        nesCParser.gcc_attributes_return gcc_attributes128 =null;

        nesCParser.init_declarator_list_return init_declarator_list129 =null;

        nesCParser.gcc_attributes_return gcc_attributes130 =null;


        Object char_literal121_tree=null;
        Object TYPEDEF123_tree=null;
        Object char_literal125_tree=null;
        Object TYPEDEF126_tree=null;
        Object char_literal131_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        RewriteRuleSubtreeStream stream_gcc_attributes=new RewriteRuleSubtreeStream(adaptor,"rule gcc_attributes");
        try {
            // nesC.g:440:5: ( ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';' -> ^( DECLARATION TYPEDEF declaration_specifiers ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) )
            int alt34=4;
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NX_INT8_T:
                {
                int LA34_19 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NX_INT16_T:
                {
                int LA34_20 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NX_INT32_T:
                {
                int LA34_21 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NX_INT64_T:
                {
                int LA34_22 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NX_UINT8_T:
                {
                int LA34_23 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NX_UINT16_T:
                {
                int LA34_24 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NX_UINT32_T:
                {
                int LA34_25 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NX_UINT64_T:
                {
                int LA34_26 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NXLE_INT8_T:
                {
                int LA34_27 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NXLE_INT16_T:
                {
                int LA34_28 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NXLE_INT32_T:
                {
                int LA34_29 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NXLE_INT64_T:
                {
                int LA34_30 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NXLE_UINT8_T:
                {
                int LA34_31 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NXLE_UINT16_T:
                {
                int LA34_32 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NXLE_UINT32_T:
                {
                int LA34_33 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
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
            case NXLE_UINT64_T:
                {
                int LA34_34 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 34, input);

                    throw nvae;

                }
                }
                break;
            case BUILTIN_VA_LIST:
                {
                int LA34_35 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 35, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA34_36 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 36, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA34_37 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 37, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA34_38 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 38, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA34_39 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 39, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA34_40 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 40, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA34_41 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 41, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                int LA34_42 = input.LA(2);

                if ( (synpred4_nesC()) ) {
                    alt34=3;
                }
                else if ( (true) ) {
                    alt34=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 42, input);

                    throw nvae;

                }
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
                    // nesC.g:440:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4152);
                    declaration_specifiers118=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers118.getTree());

                    // nesC.g:445:33: ( gcc_attributes )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==GCCATTRIBUTE) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // nesC.g:445:33: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4154);
                            gcc_attributes119=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes119.getTree());

                            }
                            break;

                    }


                    // nesC.g:445:49: ( init_declarator_list )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==LPARENS||LA31_0==RAW_IDENTIFIER||LA31_0==STAR) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // nesC.g:445:49: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration4157);
                            init_declarator_list120=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list120.getTree());

                            }
                            break;

                    }


                    char_literal121=(Token)match(input,200,FOLLOW_200_in_declaration4160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal121);


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
                    // 452:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // nesC.g:452:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:452:54: ( init_declarator_list )?
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
                    // nesC.g:454:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration4222);
                    function_definition122=function_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_definition.add(function_definition122.getTree());

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
                    // 464:14: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // nesC.g:464:17: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // nesC.g:464:31: ^( FUNCTION_DEFINITION function_definition )
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
                    // nesC.g:469:10: ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';'
                    {
                    TYPEDEF123=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration4314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF123);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4316);
                    declaration_specifiers124=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers124.getTree());

                    char_literal125=(Token)match(input,200,FOLLOW_200_in_declaration4318); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal125);


                    // AST REWRITE
                    // elements: declaration_specifiers, TYPEDEF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 470:14: -> ^( DECLARATION TYPEDEF declaration_specifiers )
                    {
                        // nesC.g:470:17: ^( DECLARATION TYPEDEF declaration_specifiers )
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
                    // nesC.g:472:10: TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF126=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration4364); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF126);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4366);
                    declaration_specifiers127=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers127.getTree());

                    // nesC.g:475:41: ( gcc_attributes )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==GCCATTRIBUTE) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // nesC.g:475:41: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4368);
                            gcc_attributes128=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes128.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_init_declarator_list_in_declaration4371);
                    init_declarator_list129=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list129.getTree());

                    // nesC.g:475:78: ( gcc_attributes )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==GCCATTRIBUTE) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // nesC.g:475:78: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4373);
                            gcc_attributes130=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes130.getTree());

                            }
                            break;

                    }


                    char_literal131=(Token)match(input,200,FOLLOW_200_in_declaration4376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal131);


                    if ( state.backtracking==0 ) {
                                   // Inefficient, but how many declarators will be in a declaration, honestly?
                                   for (int i = 0; i < ((declaration_scope)declaration_stack.peek()).declaredNames.size(); ++i) {
                                       symbols.addType(((declaration_scope)declaration_stack.peek()).declaredNames.get(i));
                                   }
                                 }

                    // AST REWRITE
                    // elements: TYPEDEF, declaration_specifiers, init_declarator_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 482:14: -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                    {
                        // nesC.g:482:17: ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
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
    // nesC.g:490:1: declaration_specifiers : ( c_style_declaration_specifier )+ ;
    public final nesCParser.declaration_specifiers_return declaration_specifiers() throws RecognitionException {
        nesCParser.declaration_specifiers_return retval = new nesCParser.declaration_specifiers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.c_style_declaration_specifier_return c_style_declaration_specifier132 =null;



        try {
            // nesC.g:491:5: ( ( c_style_declaration_specifier )+ )
            // nesC.g:491:25: ( c_style_declaration_specifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:491:25: ( c_style_declaration_specifier )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RAW_IDENTIFIER) ) {
                    int LA35_2 = input.LA(2);

                    if ( (( symbols.isType(input.LT(1).getText()) )) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==ASYNC||LA35_0==AUTO||LA35_0==BUILTIN_VA_LIST||LA35_0==CHAR||LA35_0==COMMAND||LA35_0==CONST||(LA35_0 >= DOUBLE && LA35_0 <= DUTY)||LA35_0==ENUM||(LA35_0 >= EVENT && LA35_0 <= EXTERN)||LA35_0==FLOAT||(LA35_0 >= INLINE && LA35_0 <= INT8_T)||LA35_0==LONG||LA35_0==NORACE||(LA35_0 >= NXLE_INT16_T && LA35_0 <= NX_UNION)||LA35_0==REGISTER||LA35_0==RESTRICT||LA35_0==SHORT||LA35_0==SIGNED||LA35_0==STATIC||LA35_0==STRUCT||LA35_0==TASK||(LA35_0 >= UINT16_T && LA35_0 <= UINT8_T)||(LA35_0 >= UNION && LA35_0 <= UNSIGNED)||(LA35_0 >= VOID && LA35_0 <= VOLATILE)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // nesC.g:491:25: c_style_declaration_specifier
            	    {
            	    pushFollow(FOLLOW_c_style_declaration_specifier_in_declaration_specifiers4443);
            	    c_style_declaration_specifier132=c_style_declaration_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, c_style_declaration_specifier132.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "declaration_specifiers"


    public static class c_style_declaration_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "c_style_declaration_specifier"
    // nesC.g:493:1: c_style_declaration_specifier : ( storage_class_specifier | type_specifier | type_qualifier | function_specifier );
    public final nesCParser.c_style_declaration_specifier_return c_style_declaration_specifier() throws RecognitionException {
        nesCParser.c_style_declaration_specifier_return retval = new nesCParser.c_style_declaration_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.storage_class_specifier_return storage_class_specifier133 =null;

        nesCParser.type_specifier_return type_specifier134 =null;

        nesCParser.type_qualifier_return type_qualifier135 =null;

        nesCParser.function_specifier_return function_specifier136 =null;



        try {
            // nesC.g:494:5: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier )
            int alt36=4;
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
                alt36=1;
                }
                break;
            case BUILTIN_VA_LIST:
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
            case NXLE_INT16_T:
            case NXLE_INT32_T:
            case NXLE_INT64_T:
            case NXLE_INT8_T:
            case NXLE_UINT16_T:
            case NXLE_UINT32_T:
            case NXLE_UINT64_T:
            case NXLE_UINT8_T:
            case NX_INT16_T:
            case NX_INT32_T:
            case NX_INT64_T:
            case NX_INT8_T:
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
                alt36=2;
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                alt36=3;
                }
                break;
            case INLINE:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // nesC.g:494:10: storage_class_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_storage_class_specifier_in_c_style_declaration_specifier4459);
                    storage_class_specifier133=storage_class_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier133.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:495:10: type_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_specifier_in_c_style_declaration_specifier4470);
                    type_specifier134=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier134.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:496:10: type_qualifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_qualifier_in_c_style_declaration_specifier4481);
                    type_qualifier135=type_qualifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier135.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:497:10: function_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_function_specifier_in_c_style_declaration_specifier4492);
                    function_specifier136=function_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_specifier136.getTree());

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
    // nesC.g:503:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
    public final nesCParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
        nesCParser.init_declarator_list_return retval = new nesCParser.init_declarator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal138=null;
        nesCParser.init_declarator_return init_declarator137 =null;

        nesCParser.init_declarator_return init_declarator139 =null;


        Object char_literal138_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");
        try {
            // nesC.g:504:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // nesC.g:504:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list4513);
            init_declarator137=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator137.getTree());

            // nesC.g:504:26: ( ',' init_declarator )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==COMMA) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // nesC.g:504:27: ',' init_declarator
            	    {
            	    char_literal138=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list4516); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal138);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list4518);
            	    init_declarator139=init_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator139.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
            // 504:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // nesC.g:504:52: ^( DECLARATOR_LIST ( init_declarator )+ )
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
    // nesC.g:510:1: init_declarator : declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
    public final nesCParser.init_declarator_return init_declarator() throws RecognitionException {
        nesCParser.init_declarator_return retval = new nesCParser.init_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal142=null;
        nesCParser.declarator_return declarator140 =null;

        nesCParser.attributes_return attributes141 =null;

        nesCParser.initializer_return initializer143 =null;


        Object char_literal142_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // nesC.g:511:5: ( declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // nesC.g:511:10: declarator ( attributes )? ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator4552);
            declarator140=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator140.getTree());

            // nesC.g:511:21: ( attributes )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ATTRIBUTE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // nesC.g:511:21: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_init_declarator4554);
                    attributes141=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes141.getTree());

                    }
                    break;

            }


            // nesC.g:511:33: ( '=' initializer )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ASSIGN) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // nesC.g:511:34: '=' initializer
                    {
                    char_literal142=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator4558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal142);


                    pushFollow(FOLLOW_initializer_in_init_declarator4560);
                    initializer143=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer143.getTree());

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
            // 511:52: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // nesC.g:511:55: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // nesC.g:511:84: ( initializer )?
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
    // nesC.g:513:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK );
    public final nesCParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        nesCParser.storage_class_specifier_return retval = new nesCParser.storage_class_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set144=null;

        Object set144_tree=null;

        try {
            // nesC.g:514:5: ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set144=(Token)input.LT(1);

            if ( input.LA(1)==ASYNC||input.LA(1)==AUTO||input.LA(1)==COMMAND||input.LA(1)==DUTY||(input.LA(1) >= EVENT && input.LA(1) <= EXTERN)||input.LA(1)==NORACE||input.LA(1)==REGISTER||input.LA(1)==STATIC||input.LA(1)==TASK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set144)
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
    // nesC.g:525:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_INT8_T | NX_INT16_T | NX_INT32_T | NX_INT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_INT8_T | NXLE_INT16_T | NXLE_INT32_T | NXLE_INT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | BUILTIN_VA_LIST | struct_or_union_specifier | enum_specifier | typedef_name );
    public final nesCParser.type_specifier_return type_specifier() throws RecognitionException {
        nesCParser.type_specifier_return retval = new nesCParser.type_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID145=null;
        Token CHAR146=null;
        Token SHORT147=null;
        Token INT148=null;
        Token LONG149=null;
        Token SIGNED150=null;
        Token UNSIGNED151=null;
        Token FLOAT152=null;
        Token DOUBLE153=null;
        Token INT8_T154=null;
        Token INT16_T155=null;
        Token INT32_T156=null;
        Token INT64_T157=null;
        Token UINT8_T158=null;
        Token UINT16_T159=null;
        Token UINT32_T160=null;
        Token UINT64_T161=null;
        Token NX_INT8_T162=null;
        Token NX_INT16_T163=null;
        Token NX_INT32_T164=null;
        Token NX_INT64_T165=null;
        Token NX_UINT8_T166=null;
        Token NX_UINT16_T167=null;
        Token NX_UINT32_T168=null;
        Token NX_UINT64_T169=null;
        Token NXLE_INT8_T170=null;
        Token NXLE_INT16_T171=null;
        Token NXLE_INT32_T172=null;
        Token NXLE_INT64_T173=null;
        Token NXLE_UINT8_T174=null;
        Token NXLE_UINT16_T175=null;
        Token NXLE_UINT32_T176=null;
        Token NXLE_UINT64_T177=null;
        Token BUILTIN_VA_LIST178=null;
        nesCParser.struct_or_union_specifier_return struct_or_union_specifier179 =null;

        nesCParser.enum_specifier_return enum_specifier180 =null;

        nesCParser.typedef_name_return typedef_name181 =null;


        Object VOID145_tree=null;
        Object CHAR146_tree=null;
        Object SHORT147_tree=null;
        Object INT148_tree=null;
        Object LONG149_tree=null;
        Object SIGNED150_tree=null;
        Object UNSIGNED151_tree=null;
        Object FLOAT152_tree=null;
        Object DOUBLE153_tree=null;
        Object INT8_T154_tree=null;
        Object INT16_T155_tree=null;
        Object INT32_T156_tree=null;
        Object INT64_T157_tree=null;
        Object UINT8_T158_tree=null;
        Object UINT16_T159_tree=null;
        Object UINT32_T160_tree=null;
        Object UINT64_T161_tree=null;
        Object NX_INT8_T162_tree=null;
        Object NX_INT16_T163_tree=null;
        Object NX_INT32_T164_tree=null;
        Object NX_INT64_T165_tree=null;
        Object NX_UINT8_T166_tree=null;
        Object NX_UINT16_T167_tree=null;
        Object NX_UINT32_T168_tree=null;
        Object NX_UINT64_T169_tree=null;
        Object NXLE_INT8_T170_tree=null;
        Object NXLE_INT16_T171_tree=null;
        Object NXLE_INT32_T172_tree=null;
        Object NXLE_INT64_T173_tree=null;
        Object NXLE_UINT8_T174_tree=null;
        Object NXLE_UINT16_T175_tree=null;
        Object NXLE_UINT32_T176_tree=null;
        Object NXLE_UINT64_T177_tree=null;
        Object BUILTIN_VA_LIST178_tree=null;

        try {
            // nesC.g:526:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_INT8_T | NX_INT16_T | NX_INT32_T | NX_INT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_INT8_T | NXLE_INT16_T | NXLE_INT32_T | NXLE_INT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | BUILTIN_VA_LIST | struct_or_union_specifier | enum_specifier | typedef_name )
            int alt40=37;
            switch ( input.LA(1) ) {
            case VOID:
                {
                alt40=1;
                }
                break;
            case CHAR:
                {
                alt40=2;
                }
                break;
            case SHORT:
                {
                alt40=3;
                }
                break;
            case INT:
                {
                alt40=4;
                }
                break;
            case LONG:
                {
                alt40=5;
                }
                break;
            case SIGNED:
                {
                alt40=6;
                }
                break;
            case UNSIGNED:
                {
                alt40=7;
                }
                break;
            case FLOAT:
                {
                alt40=8;
                }
                break;
            case DOUBLE:
                {
                alt40=9;
                }
                break;
            case INT8_T:
                {
                alt40=10;
                }
                break;
            case INT16_T:
                {
                alt40=11;
                }
                break;
            case INT32_T:
                {
                alt40=12;
                }
                break;
            case INT64_T:
                {
                alt40=13;
                }
                break;
            case UINT8_T:
                {
                alt40=14;
                }
                break;
            case UINT16_T:
                {
                alt40=15;
                }
                break;
            case UINT32_T:
                {
                alt40=16;
                }
                break;
            case UINT64_T:
                {
                alt40=17;
                }
                break;
            case NX_INT8_T:
                {
                alt40=18;
                }
                break;
            case NX_INT16_T:
                {
                alt40=19;
                }
                break;
            case NX_INT32_T:
                {
                alt40=20;
                }
                break;
            case NX_INT64_T:
                {
                alt40=21;
                }
                break;
            case NX_UINT8_T:
                {
                alt40=22;
                }
                break;
            case NX_UINT16_T:
                {
                alt40=23;
                }
                break;
            case NX_UINT32_T:
                {
                alt40=24;
                }
                break;
            case NX_UINT64_T:
                {
                alt40=25;
                }
                break;
            case NXLE_INT8_T:
                {
                alt40=26;
                }
                break;
            case NXLE_INT16_T:
                {
                alt40=27;
                }
                break;
            case NXLE_INT32_T:
                {
                alt40=28;
                }
                break;
            case NXLE_INT64_T:
                {
                alt40=29;
                }
                break;
            case NXLE_UINT8_T:
                {
                alt40=30;
                }
                break;
            case NXLE_UINT16_T:
                {
                alt40=31;
                }
                break;
            case NXLE_UINT32_T:
                {
                alt40=32;
                }
                break;
            case NXLE_UINT64_T:
                {
                alt40=33;
                }
                break;
            case BUILTIN_VA_LIST:
                {
                alt40=34;
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case STRUCT:
            case UNION:
                {
                alt40=35;
                }
                break;
            case ENUM:
                {
                alt40=36;
                }
                break;
            case RAW_IDENTIFIER:
                {
                alt40=37;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // nesC.g:526:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID145=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier4709); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID145_tree = 
                    (Object)adaptor.create(VOID145)
                    ;
                    adaptor.addChild(root_0, VOID145_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:527:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR146=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier4719); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR146_tree = 
                    (Object)adaptor.create(CHAR146)
                    ;
                    adaptor.addChild(root_0, CHAR146_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:528:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT147=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier4729); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT147_tree = 
                    (Object)adaptor.create(SHORT147)
                    ;
                    adaptor.addChild(root_0, SHORT147_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:529:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT148=(Token)match(input,INT,FOLLOW_INT_in_type_specifier4739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT148_tree = 
                    (Object)adaptor.create(INT148)
                    ;
                    adaptor.addChild(root_0, INT148_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:530:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG149=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier4749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG149_tree = 
                    (Object)adaptor.create(LONG149)
                    ;
                    adaptor.addChild(root_0, LONG149_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:531:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED150=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier4759); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED150_tree = 
                    (Object)adaptor.create(SIGNED150)
                    ;
                    adaptor.addChild(root_0, SIGNED150_tree);
                    }

                    }
                    break;
                case 7 :
                    // nesC.g:532:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED151=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier4769); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED151_tree = 
                    (Object)adaptor.create(UNSIGNED151)
                    ;
                    adaptor.addChild(root_0, UNSIGNED151_tree);
                    }

                    }
                    break;
                case 8 :
                    // nesC.g:533:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT152=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier4779); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT152_tree = 
                    (Object)adaptor.create(FLOAT152)
                    ;
                    adaptor.addChild(root_0, FLOAT152_tree);
                    }

                    }
                    break;
                case 9 :
                    // nesC.g:534:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLE153=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_type_specifier4789); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE153_tree = 
                    (Object)adaptor.create(DOUBLE153)
                    ;
                    adaptor.addChild(root_0, DOUBLE153_tree);
                    }

                    }
                    break;
                case 10 :
                    // nesC.g:536:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T154=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier4800); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T154_tree = 
                    (Object)adaptor.create(INT8_T154)
                    ;
                    adaptor.addChild(root_0, INT8_T154_tree);
                    }

                    }
                    break;
                case 11 :
                    // nesC.g:537:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T155=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier4810); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T155_tree = 
                    (Object)adaptor.create(INT16_T155)
                    ;
                    adaptor.addChild(root_0, INT16_T155_tree);
                    }

                    }
                    break;
                case 12 :
                    // nesC.g:538:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T156=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier4820); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T156_tree = 
                    (Object)adaptor.create(INT32_T156)
                    ;
                    adaptor.addChild(root_0, INT32_T156_tree);
                    }

                    }
                    break;
                case 13 :
                    // nesC.g:539:9: INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT64_T157=(Token)match(input,INT64_T,FOLLOW_INT64_T_in_type_specifier4830); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT64_T157_tree = 
                    (Object)adaptor.create(INT64_T157)
                    ;
                    adaptor.addChild(root_0, INT64_T157_tree);
                    }

                    }
                    break;
                case 14 :
                    // nesC.g:541:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T158=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier4841); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T158_tree = 
                    (Object)adaptor.create(UINT8_T158)
                    ;
                    adaptor.addChild(root_0, UINT8_T158_tree);
                    }

                    }
                    break;
                case 15 :
                    // nesC.g:542:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T159=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier4851); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T159_tree = 
                    (Object)adaptor.create(UINT16_T159)
                    ;
                    adaptor.addChild(root_0, UINT16_T159_tree);
                    }

                    }
                    break;
                case 16 :
                    // nesC.g:543:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T160=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier4861); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T160_tree = 
                    (Object)adaptor.create(UINT32_T160)
                    ;
                    adaptor.addChild(root_0, UINT32_T160_tree);
                    }

                    }
                    break;
                case 17 :
                    // nesC.g:544:9: UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT64_T161=(Token)match(input,UINT64_T,FOLLOW_UINT64_T_in_type_specifier4871); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT64_T161_tree = 
                    (Object)adaptor.create(UINT64_T161)
                    ;
                    adaptor.addChild(root_0, UINT64_T161_tree);
                    }

                    }
                    break;
                case 18 :
                    // nesC.g:546:9: NX_INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT8_T162=(Token)match(input,NX_INT8_T,FOLLOW_NX_INT8_T_in_type_specifier4882); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT8_T162_tree = 
                    (Object)adaptor.create(NX_INT8_T162)
                    ;
                    adaptor.addChild(root_0, NX_INT8_T162_tree);
                    }

                    }
                    break;
                case 19 :
                    // nesC.g:547:9: NX_INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT16_T163=(Token)match(input,NX_INT16_T,FOLLOW_NX_INT16_T_in_type_specifier4892); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT16_T163_tree = 
                    (Object)adaptor.create(NX_INT16_T163)
                    ;
                    adaptor.addChild(root_0, NX_INT16_T163_tree);
                    }

                    }
                    break;
                case 20 :
                    // nesC.g:548:9: NX_INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT32_T164=(Token)match(input,NX_INT32_T,FOLLOW_NX_INT32_T_in_type_specifier4902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT32_T164_tree = 
                    (Object)adaptor.create(NX_INT32_T164)
                    ;
                    adaptor.addChild(root_0, NX_INT32_T164_tree);
                    }

                    }
                    break;
                case 21 :
                    // nesC.g:549:9: NX_INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT64_T165=(Token)match(input,NX_INT64_T,FOLLOW_NX_INT64_T_in_type_specifier4912); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT64_T165_tree = 
                    (Object)adaptor.create(NX_INT64_T165)
                    ;
                    adaptor.addChild(root_0, NX_INT64_T165_tree);
                    }

                    }
                    break;
                case 22 :
                    // nesC.g:551:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T166=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier4923); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T166_tree = 
                    (Object)adaptor.create(NX_UINT8_T166)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T166_tree);
                    }

                    }
                    break;
                case 23 :
                    // nesC.g:552:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T167=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier4933); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T167_tree = 
                    (Object)adaptor.create(NX_UINT16_T167)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T167_tree);
                    }

                    }
                    break;
                case 24 :
                    // nesC.g:553:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T168=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier4943); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T168_tree = 
                    (Object)adaptor.create(NX_UINT32_T168)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T168_tree);
                    }

                    }
                    break;
                case 25 :
                    // nesC.g:554:9: NX_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT64_T169=(Token)match(input,NX_UINT64_T,FOLLOW_NX_UINT64_T_in_type_specifier4953); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT64_T169_tree = 
                    (Object)adaptor.create(NX_UINT64_T169)
                    ;
                    adaptor.addChild(root_0, NX_UINT64_T169_tree);
                    }

                    }
                    break;
                case 26 :
                    // nesC.g:556:9: NXLE_INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT8_T170=(Token)match(input,NXLE_INT8_T,FOLLOW_NXLE_INT8_T_in_type_specifier4964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT8_T170_tree = 
                    (Object)adaptor.create(NXLE_INT8_T170)
                    ;
                    adaptor.addChild(root_0, NXLE_INT8_T170_tree);
                    }

                    }
                    break;
                case 27 :
                    // nesC.g:557:9: NXLE_INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT16_T171=(Token)match(input,NXLE_INT16_T,FOLLOW_NXLE_INT16_T_in_type_specifier4974); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT16_T171_tree = 
                    (Object)adaptor.create(NXLE_INT16_T171)
                    ;
                    adaptor.addChild(root_0, NXLE_INT16_T171_tree);
                    }

                    }
                    break;
                case 28 :
                    // nesC.g:558:9: NXLE_INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT32_T172=(Token)match(input,NXLE_INT32_T,FOLLOW_NXLE_INT32_T_in_type_specifier4984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT32_T172_tree = 
                    (Object)adaptor.create(NXLE_INT32_T172)
                    ;
                    adaptor.addChild(root_0, NXLE_INT32_T172_tree);
                    }

                    }
                    break;
                case 29 :
                    // nesC.g:559:9: NXLE_INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT64_T173=(Token)match(input,NXLE_INT64_T,FOLLOW_NXLE_INT64_T_in_type_specifier4994); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT64_T173_tree = 
                    (Object)adaptor.create(NXLE_INT64_T173)
                    ;
                    adaptor.addChild(root_0, NXLE_INT64_T173_tree);
                    }

                    }
                    break;
                case 30 :
                    // nesC.g:561:9: NXLE_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT8_T174=(Token)match(input,NXLE_UINT8_T,FOLLOW_NXLE_UINT8_T_in_type_specifier5005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT8_T174_tree = 
                    (Object)adaptor.create(NXLE_UINT8_T174)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT8_T174_tree);
                    }

                    }
                    break;
                case 31 :
                    // nesC.g:562:9: NXLE_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT16_T175=(Token)match(input,NXLE_UINT16_T,FOLLOW_NXLE_UINT16_T_in_type_specifier5015); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT16_T175_tree = 
                    (Object)adaptor.create(NXLE_UINT16_T175)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT16_T175_tree);
                    }

                    }
                    break;
                case 32 :
                    // nesC.g:563:9: NXLE_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT32_T176=(Token)match(input,NXLE_UINT32_T,FOLLOW_NXLE_UINT32_T_in_type_specifier5025); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT32_T176_tree = 
                    (Object)adaptor.create(NXLE_UINT32_T176)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT32_T176_tree);
                    }

                    }
                    break;
                case 33 :
                    // nesC.g:564:9: NXLE_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT64_T177=(Token)match(input,NXLE_UINT64_T,FOLLOW_NXLE_UINT64_T_in_type_specifier5035); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT64_T177_tree = 
                    (Object)adaptor.create(NXLE_UINT64_T177)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT64_T177_tree);
                    }

                    }
                    break;
                case 34 :
                    // nesC.g:566:9: BUILTIN_VA_LIST
                    {
                    root_0 = (Object)adaptor.nil();


                    BUILTIN_VA_LIST178=(Token)match(input,BUILTIN_VA_LIST,FOLLOW_BUILTIN_VA_LIST_in_type_specifier5046); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BUILTIN_VA_LIST178_tree = 
                    (Object)adaptor.create(BUILTIN_VA_LIST178)
                    ;
                    adaptor.addChild(root_0, BUILTIN_VA_LIST178_tree);
                    }

                    }
                    break;
                case 35 :
                    // nesC.g:568:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier5061);
                    struct_or_union_specifier179=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier179.getTree());

                    }
                    break;
                case 36 :
                    // nesC.g:569:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier5071);
                    enum_specifier180=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier180.getTree());

                    }
                    break;
                case 37 :
                    // nesC.g:570:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier5081);
                    typedef_name181=typedef_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedef_name181.getTree());

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
    // nesC.g:576:1: struct_or_union_specifier : ( struct_or_union '{' ( struct_declaration_list )? '}' -> ^( struct_or_union ( struct_declaration_list )? ) | struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )? -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? ) | STRUCT '@' RAW_IDENTIFIER '{' ( struct_declaration_list )? '}' -> ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? ) );
    public final nesCParser.struct_or_union_specifier_return struct_or_union_specifier() throws RecognitionException {
        nesCParser.struct_or_union_specifier_return retval = new nesCParser.struct_or_union_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal183=null;
        Token char_literal185=null;
        Token RAW_IDENTIFIER187=null;
        Token char_literal188=null;
        Token char_literal190=null;
        Token STRUCT191=null;
        Token char_literal192=null;
        Token RAW_IDENTIFIER193=null;
        Token char_literal194=null;
        Token char_literal196=null;
        nesCParser.struct_or_union_return struct_or_union182 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list184 =null;

        nesCParser.struct_or_union_return struct_or_union186 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list189 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list195 =null;


        Object char_literal183_tree=null;
        Object char_literal185_tree=null;
        Object RAW_IDENTIFIER187_tree=null;
        Object char_literal188_tree=null;
        Object char_literal190_tree=null;
        Object STRUCT191_tree=null;
        Object char_literal192_tree=null;
        Object RAW_IDENTIFIER193_tree=null;
        Object char_literal194_tree=null;
        Object char_literal196_tree=null;
        RewriteRuleTokenStream stream_STRUCT=new RewriteRuleTokenStream(adaptor,"token STRUCT");
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleTokenStream stream_ATTRIBUTE=new RewriteRuleTokenStream(adaptor,"token ATTRIBUTE");
        RewriteRuleSubtreeStream stream_struct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declaration_list");
        RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");
        try {
            // nesC.g:577:5: ( struct_or_union '{' ( struct_declaration_list )? '}' -> ^( struct_or_union ( struct_declaration_list )? ) | struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )? -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? ) | STRUCT '@' RAW_IDENTIFIER '{' ( struct_declaration_list )? '}' -> ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? ) )
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==STRUCT) ) {
                switch ( input.LA(2) ) {
                case ATTRIBUTE:
                    {
                    alt45=3;
                    }
                    break;
                case LBRACE:
                    {
                    alt45=1;
                    }
                    break;
                case RAW_IDENTIFIER:
                    {
                    alt45=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA45_0==NX_STRUCT||LA45_0==NX_UNION||LA45_0==UNION) ) {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==LBRACE) ) {
                    alt45=1;
                }
                else if ( (LA45_2==RAW_IDENTIFIER) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // nesC.g:577:10: struct_or_union '{' ( struct_declaration_list )? '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier5100);
                    struct_or_union182=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union182.getTree());

                    char_literal183=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier5102); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal183);


                    // nesC.g:577:30: ( struct_declaration_list )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==BUILTIN_VA_LIST||LA41_0==CHAR||LA41_0==CONST||LA41_0==DOUBLE||LA41_0==ENUM||LA41_0==FLOAT||LA41_0==HASH||(LA41_0 >= INT && LA41_0 <= INT8_T)||LA41_0==LONG||(LA41_0 >= NXLE_INT16_T && LA41_0 <= NX_UNION)||LA41_0==RAW_IDENTIFIER||LA41_0==RESTRICT||LA41_0==SHORT||LA41_0==SIGNED||LA41_0==STRUCT||(LA41_0 >= UINT16_T && LA41_0 <= UINT8_T)||(LA41_0 >= UNION && LA41_0 <= UNSIGNED)||(LA41_0 >= VOID && LA41_0 <= VOLATILE)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // nesC.g:577:30: struct_declaration_list
                            {
                            pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier5104);
                            struct_declaration_list184=struct_declaration_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list184.getTree());

                            }
                            break;

                    }


                    char_literal185=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier5107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal185);


                    // AST REWRITE
                    // elements: struct_declaration_list, struct_or_union
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 578:14: -> ^( struct_or_union ( struct_declaration_list )? )
                    {
                        // nesC.g:578:17: ^( struct_or_union ( struct_declaration_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        // nesC.g:578:35: ( struct_declaration_list )?
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
                case 2 :
                    // nesC.g:579:10: struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )?
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier5140);
                    struct_or_union186=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union186.getTree());

                    RAW_IDENTIFIER187=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER187);


                    // nesC.g:579:41: ( '{' ( struct_declaration_list )? '}' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==LBRACE) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // nesC.g:579:60: '{' ( struct_declaration_list )? '}'
                            {
                            char_literal188=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier5147); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal188);


                            // nesC.g:579:64: ( struct_declaration_list )?
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==BUILTIN_VA_LIST||LA42_0==CHAR||LA42_0==CONST||LA42_0==DOUBLE||LA42_0==ENUM||LA42_0==FLOAT||LA42_0==HASH||(LA42_0 >= INT && LA42_0 <= INT8_T)||LA42_0==LONG||(LA42_0 >= NXLE_INT16_T && LA42_0 <= NX_UNION)||LA42_0==RAW_IDENTIFIER||LA42_0==RESTRICT||LA42_0==SHORT||LA42_0==SIGNED||LA42_0==STRUCT||(LA42_0 >= UINT16_T && LA42_0 <= UINT8_T)||(LA42_0 >= UNION && LA42_0 <= UNSIGNED)||(LA42_0 >= VOID && LA42_0 <= VOLATILE)) ) {
                                alt42=1;
                            }
                            switch (alt42) {
                                case 1 :
                                    // nesC.g:579:64: struct_declaration_list
                                    {
                                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier5149);
                                    struct_declaration_list189=struct_declaration_list();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list189.getTree());

                                    }
                                    break;

                            }


                            char_literal190=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier5152); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal190);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: struct_declaration_list, struct_or_union, RAW_IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 580:14: -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? )
                    {
                        // nesC.g:580:17: ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        stream_RAW_IDENTIFIER.nextNode()
                        );

                        // nesC.g:580:68: ( struct_declaration_list )?
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
                    // nesC.g:581:10: STRUCT '@' RAW_IDENTIFIER '{' ( struct_declaration_list )? '}'
                    {
                    STRUCT191=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_struct_or_union_specifier5191); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRUCT.add(STRUCT191);


                    char_literal192=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_struct_or_union_specifier5193); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATTRIBUTE.add(char_literal192);


                    RAW_IDENTIFIER193=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5195); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER193);


                    char_literal194=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier5197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal194);


                    // nesC.g:581:40: ( struct_declaration_list )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==BUILTIN_VA_LIST||LA44_0==CHAR||LA44_0==CONST||LA44_0==DOUBLE||LA44_0==ENUM||LA44_0==FLOAT||LA44_0==HASH||(LA44_0 >= INT && LA44_0 <= INT8_T)||LA44_0==LONG||(LA44_0 >= NXLE_INT16_T && LA44_0 <= NX_UNION)||LA44_0==RAW_IDENTIFIER||LA44_0==RESTRICT||LA44_0==SHORT||LA44_0==SIGNED||LA44_0==STRUCT||(LA44_0 >= UINT16_T && LA44_0 <= UINT8_T)||(LA44_0 >= UNION && LA44_0 <= UNSIGNED)||(LA44_0 >= VOID && LA44_0 <= VOLATILE)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // nesC.g:581:40: struct_declaration_list
                            {
                            pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier5199);
                            struct_declaration_list195=struct_declaration_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list195.getTree());

                            }
                            break;

                    }


                    char_literal196=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier5202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal196);


                    // AST REWRITE
                    // elements: ATTRIBUTE, STRUCT, RAW_IDENTIFIER, struct_declaration_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 582:14: -> ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? )
                    {
                        // nesC.g:582:17: ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STRUCT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ATTRIBUTE.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_RAW_IDENTIFIER.nextNode()
                        );

                        // nesC.g:582:45: ( struct_declaration_list )?
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
    // nesC.g:584:1: struct_or_union : ( STRUCT | UNION | NX_STRUCT | NX_UNION );
    public final nesCParser.struct_or_union_return struct_or_union() throws RecognitionException {
        nesCParser.struct_or_union_return retval = new nesCParser.struct_or_union_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set197=null;

        Object set197_tree=null;

        try {
            // nesC.g:585:5: ( STRUCT | UNION | NX_STRUCT | NX_UNION )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set197=(Token)input.LT(1);

            if ( input.LA(1)==NX_STRUCT||input.LA(1)==NX_UNION||input.LA(1)==STRUCT||input.LA(1)==UNION ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set197)
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
    // nesC.g:590:1: struct_declaration_list : ( line_directive | struct_declaration )+ ;
    public final nesCParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        nesCParser.struct_declaration_list_return retval = new nesCParser.struct_declaration_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive198 =null;

        nesCParser.struct_declaration_return struct_declaration199 =null;



        try {
            // nesC.g:591:5: ( ( line_directive | struct_declaration )+ )
            // nesC.g:591:10: ( line_directive | struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // nesC.g:592:10: ( line_directive | struct_declaration )+
            int cnt46=0;
            loop46:
            do {
                int alt46=3;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==HASH) ) {
                    alt46=1;
                }
                else if ( (LA46_0==BUILTIN_VA_LIST||LA46_0==CHAR||LA46_0==CONST||LA46_0==DOUBLE||LA46_0==ENUM||LA46_0==FLOAT||(LA46_0 >= INT && LA46_0 <= INT8_T)||LA46_0==LONG||(LA46_0 >= NXLE_INT16_T && LA46_0 <= NX_UNION)||LA46_0==RAW_IDENTIFIER||LA46_0==RESTRICT||LA46_0==SHORT||LA46_0==SIGNED||LA46_0==STRUCT||(LA46_0 >= UINT16_T && LA46_0 <= UINT8_T)||(LA46_0 >= UNION && LA46_0 <= UNSIGNED)||(LA46_0 >= VOID && LA46_0 <= VOLATILE)) ) {
                    alt46=2;
                }


                switch (alt46) {
            	case 1 :
            	    // nesC.g:592:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_struct_declaration_list5289);
            	    line_directive198=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive198.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:592:28: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list5293);
            	    struct_declaration199=struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_declaration199.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
    // nesC.g:595:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final nesCParser.struct_declaration_return struct_declaration() throws RecognitionException {
        nesCParser.struct_declaration_return retval = new nesCParser.struct_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal202=null;
        nesCParser.specifier_qualifier_list_return specifier_qualifier_list200 =null;

        nesCParser.struct_declarator_list_return struct_declarator_list201 =null;


        Object char_literal202_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            // nesC.g:596:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // nesC.g:596:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration5325);
            specifier_qualifier_list200=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list200.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration5327);
            struct_declarator_list201=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list201.getTree());

            char_literal202=(Token)match(input,200,FOLLOW_200_in_struct_declaration5329); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal202);


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
            // 597:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // nesC.g:597:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
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
    // nesC.g:604:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final nesCParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        nesCParser.specifier_qualifier_list_return retval = new nesCParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.type_specifier_return type_specifier203 =null;

        nesCParser.type_qualifier_return type_qualifier204 =null;



        try {
            // nesC.g:605:5: ( ( type_specifier | type_qualifier )+ )
            // nesC.g:605:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:605:10: ( type_specifier | type_qualifier )+
            int cnt47=0;
            loop47:
            do {
                int alt47=3;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA47_2 = input.LA(2);

                    if ( (( symbols.isType(input.LT(1).getText()) )) ) {
                        alt47=1;
                    }


                    }
                    break;
                case BUILTIN_VA_LIST:
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
                case NXLE_INT16_T:
                case NXLE_INT32_T:
                case NXLE_INT64_T:
                case NXLE_INT8_T:
                case NXLE_UINT16_T:
                case NXLE_UINT32_T:
                case NXLE_UINT64_T:
                case NXLE_UINT8_T:
                case NX_INT16_T:
                case NX_INT32_T:
                case NX_INT64_T:
                case NX_INT8_T:
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
                    alt47=1;
                    }
                    break;
                case CONST:
                case RESTRICT:
                case VOLATILE:
                    {
                    alt47=2;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // nesC.g:605:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list5372);
            	    type_specifier203=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier203.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:605:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list5376);
            	    type_qualifier204=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier204.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
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
    // nesC.g:612:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
    public final nesCParser.struct_declarator_list_return struct_declarator_list() throws RecognitionException {
        nesCParser.struct_declarator_list_return retval = new nesCParser.struct_declarator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal206=null;
        nesCParser.struct_declarator_return struct_declarator205 =null;

        nesCParser.struct_declarator_return struct_declarator207 =null;


        Object char_literal206_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_struct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator");
        try {
            // nesC.g:613:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // nesC.g:613:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5402);
            struct_declarator205=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator205.getTree());

            // nesC.g:613:28: ( ',' struct_declarator )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // nesC.g:613:29: ',' struct_declarator
            	    {
            	    char_literal206=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list5405); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal206);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5407);
            	    struct_declarator207=struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator207.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
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
            // 613:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // nesC.g:613:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
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
    // nesC.g:615:1: struct_declarator : ( declarator ( ':' constant_expression )? | ':' constant_expression );
    public final nesCParser.struct_declarator_return struct_declarator() throws RecognitionException {
        nesCParser.struct_declarator_return retval = new nesCParser.struct_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal209=null;
        Token char_literal211=null;
        nesCParser.declarator_return declarator208 =null;

        nesCParser.constant_expression_return constant_expression210 =null;

        nesCParser.constant_expression_return constant_expression212 =null;


        Object char_literal209_tree=null;
        Object char_literal211_tree=null;

        try {
            // nesC.g:616:5: ( declarator ( ':' constant_expression )? | ':' constant_expression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==LPARENS||LA50_0==RAW_IDENTIFIER||LA50_0==STAR) ) {
                alt50=1;
            }
            else if ( (LA50_0==199) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // nesC.g:616:10: declarator ( ':' constant_expression )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator5437);
                    declarator208=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator208.getTree());

                    // nesC.g:616:21: ( ':' constant_expression )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==199) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // nesC.g:616:22: ':' constant_expression
                            {
                            char_literal209=(Token)match(input,199,FOLLOW_199_in_struct_declarator5440); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal209_tree = 
                            (Object)adaptor.create(char_literal209)
                            ;
                            adaptor.addChild(root_0, char_literal209_tree);
                            }

                            pushFollow(FOLLOW_constant_expression_in_struct_declarator5442);
                            constant_expression210=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression210.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // nesC.g:617:10: ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal211=(Token)match(input,199,FOLLOW_199_in_struct_declarator5455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal211_tree = 
                    (Object)adaptor.create(char_literal211)
                    ;
                    adaptor.addChild(root_0, char_literal211_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator5457);
                    constant_expression212=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression212.getTree());

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
    // nesC.g:619:1: enum_specifier : ( ENUM '{' enumerator_list ( ',' )? '}' -> ^( ENUM enumerator_list ) | ENUM identifier ( '{' enumerator_list ( ',' )? '}' )? -> ^( ENUM identifier ( enumerator_list )? ) );
    public final nesCParser.enum_specifier_return enum_specifier() throws RecognitionException {
        nesCParser.enum_specifier_return retval = new nesCParser.enum_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENUM213=null;
        Token char_literal214=null;
        Token char_literal216=null;
        Token char_literal217=null;
        Token ENUM218=null;
        Token char_literal220=null;
        Token char_literal222=null;
        Token char_literal223=null;
        nesCParser.enumerator_list_return enumerator_list215 =null;

        nesCParser.identifier_return identifier219 =null;

        nesCParser.enumerator_list_return enumerator_list221 =null;


        Object ENUM213_tree=null;
        Object char_literal214_tree=null;
        Object char_literal216_tree=null;
        Object char_literal217_tree=null;
        Object ENUM218_tree=null;
        Object char_literal220_tree=null;
        Object char_literal222_tree=null;
        Object char_literal223_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_enumerator_list=new RewriteRuleSubtreeStream(adaptor,"rule enumerator_list");
        try {
            // nesC.g:620:5: ( ENUM '{' enumerator_list ( ',' )? '}' -> ^( ENUM enumerator_list ) | ENUM identifier ( '{' enumerator_list ( ',' )? '}' )? -> ^( ENUM identifier ( enumerator_list )? ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ENUM) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==LBRACE) ) {
                    alt54=1;
                }
                else if ( (LA54_1==RAW_IDENTIFIER) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // nesC.g:620:10: ENUM '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM213=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM213);


                    char_literal214=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal214);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5480);
                    enumerator_list215=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list215.getTree());

                    // nesC.g:620:35: ( ',' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==COMMA) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // nesC.g:620:35: ','
                            {
                            char_literal216=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5482); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal216);


                            }
                            break;

                    }


                    char_literal217=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal217);


                    // AST REWRITE
                    // elements: ENUM, enumerator_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 621:14: -> ^( ENUM enumerator_list )
                    {
                        // nesC.g:621:17: ^( ENUM enumerator_list )
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
                    // nesC.g:622:10: ENUM identifier ( '{' enumerator_list ( ',' )? '}' )?
                    {
                    ENUM218=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM218);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5519);
                    identifier219=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier219.getTree());

                    // nesC.g:622:26: ( '{' enumerator_list ( ',' )? '}' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==LBRACE) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // nesC.g:622:45: '{' enumerator_list ( ',' )? '}'
                            {
                            char_literal220=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5524); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal220);


                            pushFollow(FOLLOW_enumerator_list_in_enum_specifier5526);
                            enumerator_list221=enumerator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list221.getTree());

                            // nesC.g:622:65: ( ',' )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==COMMA) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // nesC.g:622:65: ','
                                    {
                                    char_literal222=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5528); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(char_literal222);


                                    }
                                    break;

                            }


                            char_literal223=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5531); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal223);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: enumerator_list, identifier, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 623:14: -> ^( ENUM identifier ( enumerator_list )? )
                    {
                        // nesC.g:623:17: ^( ENUM identifier ( enumerator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:623:53: ( enumerator_list )?
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
    // nesC.g:625:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
    public final nesCParser.enumerator_list_return enumerator_list() throws RecognitionException {
        nesCParser.enumerator_list_return retval = new nesCParser.enumerator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal225=null;
        nesCParser.enumerator_return enumerator224 =null;

        nesCParser.enumerator_return enumerator226 =null;


        Object char_literal225_tree=null;

        try {
            // nesC.g:626:5: ( enumerator ( ',' ! enumerator )* )
            // nesC.g:626:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list5578);
            enumerator224=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator224.getTree());

            // nesC.g:626:21: ( ',' ! enumerator )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    int LA55_1 = input.LA(2);

                    if ( (LA55_1==RAW_IDENTIFIER) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // nesC.g:626:22: ',' ! enumerator
            	    {
            	    char_literal225=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list5581); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list5584);
            	    enumerator226=enumerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator226.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // nesC.g:632:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
    public final nesCParser.enumerator_return enumerator() throws RecognitionException {
        nesCParser.enumerator_return retval = new nesCParser.enumerator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal228=null;
        nesCParser.identifier_return identifier227 =null;

        nesCParser.constant_expression_return constant_expression229 =null;


        Object char_literal228_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:633:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // nesC.g:633:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator5609);
            identifier227=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier227.getTree());

            // nesC.g:633:21: ( '=' constant_expression )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ASSIGN) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // nesC.g:633:22: '=' constant_expression
                    {
                    char_literal228=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator5612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal228);


                    pushFollow(FOLLOW_constant_expression_in_enumerator5614);
                    constant_expression229=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression229.getTree());

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
            // 633:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // nesC.g:633:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:633:75: ( constant_expression )?
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
    // nesC.g:634:1: type_qualifier : ( CONST | RESTRICT | VOLATILE );
    public final nesCParser.type_qualifier_return type_qualifier() throws RecognitionException {
        nesCParser.type_qualifier_return retval = new nesCParser.type_qualifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set230=null;

        Object set230_tree=null;

        try {
            // nesC.g:635:5: ( CONST | RESTRICT | VOLATILE )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set230=(Token)input.LT(1);

            if ( input.LA(1)==CONST||input.LA(1)==RESTRICT||input.LA(1)==VOLATILE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set230)
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
    // nesC.g:639:1: function_specifier : INLINE ;
    public final nesCParser.function_specifier_return function_specifier() throws RecognitionException {
        nesCParser.function_specifier_return retval = new nesCParser.function_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INLINE231=null;

        Object INLINE231_tree=null;

        try {
            // nesC.g:640:5: ( INLINE )
            // nesC.g:640:10: INLINE
            {
            root_0 = (Object)adaptor.nil();


            INLINE231=(Token)match(input,INLINE,FOLLOW_INLINE_in_function_specifier5686); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INLINE231_tree = 
            (Object)adaptor.create(INLINE231)
            ;
            adaptor.addChild(root_0, INLINE231_tree);
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
    // nesC.g:642:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
    public final nesCParser.declarator_return declarator() throws RecognitionException {
        nesCParser.declarator_return retval = new nesCParser.declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.pointer_return pointer232 =null;

        nesCParser.direct_declarator_return direct_declarator233 =null;


        RewriteRuleSubtreeStream stream_direct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule direct_declarator");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            // nesC.g:643:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // nesC.g:643:10: ( pointer )? direct_declarator
            {
            // nesC.g:643:10: ( pointer )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==STAR) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // nesC.g:643:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator5701);
                    pointer232=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer232.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator5704);
            direct_declarator233=direct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_direct_declarator.add(direct_declarator233.getTree());

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
            // 643:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // nesC.g:643:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // nesC.g:643:53: ( pointer )?
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
    // nesC.g:645:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final nesCParser.direct_declarator_return direct_declarator() throws RecognitionException {
        nesCParser.direct_declarator_return retval = new nesCParser.direct_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.direct_declarator_identifier_return direct_declarator_identifier234 =null;

        nesCParser.direct_declarator_modifier_return direct_declarator_modifier235 =null;



        try {
            // nesC.g:646:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // nesC.g:646:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator5729);
            direct_declarator_identifier234=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier234.getTree());

            // nesC.g:646:38: ( direct_declarator_modifier )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==LBRACKET||LA58_0==LPARENS) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // nesC.g:646:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator5731);
            	    direct_declarator_modifier235=direct_declarator_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_modifier235.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // nesC.g:657:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
    public final nesCParser.direct_declarator_identifier_return direct_declarator_identifier() throws RecognitionException {
        nesCParser.direct_declarator_identifier_return retval = new nesCParser.direct_declarator_identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal236=null;
        Token char_literal238=null;
        Token char_literal240=null;
        nesCParser.identifier_return myIdName =null;

        nesCParser.identifier_return identifier237 =null;

        nesCParser.declarator_return declarator239 =null;


        Object char_literal236_tree=null;
        Object char_literal238_tree=null;
        Object char_literal240_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:658:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RAW_IDENTIFIER) ) {
                alt60=1;
            }
            else if ( (LA60_0==LPARENS) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // nesC.g:658:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5757);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // nesC.g:658:29: ( '.' identifier )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==DOT) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // nesC.g:658:30: '.' identifier
                            {
                            char_literal236=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier5760); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal236);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5762);
                            identifier237=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier237.getTree());

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
                    // 662:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:662:18: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:663:9: '(' declarator ')'
                    {
                    char_literal238=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier5797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal238);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier5799);
                    declarator239=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator239.getTree());

                    char_literal240=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier5801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal240);


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
                    // 663:28: -> declarator
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
    // nesC.g:669:1: direct_declarator_modifier : ( ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
    public final nesCParser.direct_declarator_modifier_return direct_declarator_modifier() throws RecognitionException {
        nesCParser.direct_declarator_modifier_return retval = new nesCParser.direct_declarator_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal241=null;
        Token char_literal243=null;
        Token char_literal244=null;
        Token char_literal245=null;
        Token char_literal246=null;
        Token char_literal247=null;
        nesCParser.parameter_list_return generic =null;

        nesCParser.parameter_list_return normal =null;

        nesCParser.constant_expression_return constant_expression242 =null;


        Object char_literal241_tree=null;
        Object char_literal243_tree=null;
        Object char_literal244_tree=null;
        Object char_literal245_tree=null;
        Object char_literal246_tree=null;
        Object char_literal247_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // nesC.g:670:5: ( ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LBRACKET) ) {
                int LA63_1 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt63=1;
                }
                else if ( (true) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA63_0==LPARENS) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // nesC.g:670:9: ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']'
                    {
                    char_literal241=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal241);


                    // nesC.g:670:47: ( constant_expression )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==AMP||LA61_0==BITCOMPLEMENT||LA61_0==BUILTIN_VA_ARG||LA61_0==CALL||LA61_0==CHARACTER_LITERAL||LA61_0==CONSTANT||LA61_0==LPARENS||LA61_0==MINUS||LA61_0==MINUSMINUS||LA61_0==NOT||LA61_0==PLUS||LA61_0==PLUSPLUS||LA61_0==POST||LA61_0==RAW_IDENTIFIER||LA61_0==SIGNAL||LA61_0==SIZEOF||LA61_0==STAR||LA61_0==STRING_LITERAL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // nesC.g:670:47: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier5836);
                            constant_expression242=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression242.getTree());

                            }
                            break;

                    }


                    char_literal243=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal243);


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
                    // 671:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // nesC.g:671:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // nesC.g:671:44: ( constant_expression )?
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
                    // nesC.g:672:9: ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')'
                    {
                    // nesC.g:672:9: ( '[' generic= parameter_list ']' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==LBRACKET) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // nesC.g:672:10: '[' generic= parameter_list ']'
                            {
                            char_literal244=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5871); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal244);


                            pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier5875);
                            generic=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_list.add(generic.getTree());

                            char_literal245=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5877); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal245);


                            }
                            break;

                    }


                    char_literal246=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier5881); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal246);


                    pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier5885);
                    normal=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(normal.getTree());

                    char_literal247=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier5887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal247);


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
                    // 673:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // nesC.g:673:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
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
    // nesC.g:679:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
    public final nesCParser.pointer_return pointer() throws RecognitionException {
        nesCParser.pointer_return retval = new nesCParser.pointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal248=null;
        Token char_literal251=null;
        nesCParser.type_qualifier_list_return type_qualifier_list249 =null;

        nesCParser.pointer_return pointer250 =null;

        nesCParser.type_qualifier_list_return type_qualifier_list252 =null;


        Object char_literal248_tree=null;
        Object char_literal251_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_type_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule type_qualifier_list");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            // nesC.g:680:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // nesC.g:680:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal248=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5927); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal248);


                    // nesC.g:680:14: ( type_qualifier_list )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==CONST||LA64_0==RESTRICT||LA64_0==VOLATILE) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // nesC.g:680:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5929);
                            type_qualifier_list249=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list249.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer5932);
                    pointer250=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer250.getTree());

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
                    // 680:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // nesC.g:680:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:680:66: ( type_qualifier_list )?
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
                    // nesC.g:681:10: '*' ( type_qualifier_list )?
                    {
                    char_literal251=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal251);


                    // nesC.g:681:14: ( type_qualifier_list )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==CONST||LA65_0==RESTRICT||LA65_0==VOLATILE) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // nesC.g:681:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5956);
                            type_qualifier_list252=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list252.getTree());

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
                    // 681:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // nesC.g:681:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:681:58: ( type_qualifier_list )?
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
    // nesC.g:683:1: type_qualifier_list : ( type_qualifier )+ ;
    public final nesCParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        nesCParser.type_qualifier_list_return retval = new nesCParser.type_qualifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.type_qualifier_return type_qualifier253 =null;



        try {
            // nesC.g:684:5: ( ( type_qualifier )+ )
            // nesC.g:684:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:684:10: ( type_qualifier )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==CONST||LA67_0==RESTRICT||LA67_0==VOLATILE) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // nesC.g:684:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list5985);
            	    type_qualifier253=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier253.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
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
    // nesC.g:691:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) );
    public final nesCParser.parameter_list_return parameter_list() throws RecognitionException {
        nesCParser.parameter_list_return retval = new nesCParser.parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal255=null;
        Token char_literal257=null;
        Token ELLIPSIS258=null;
        nesCParser.parameter_declaration_return parameter_declaration254 =null;

        nesCParser.parameter_declaration_return parameter_declaration256 =null;


        Object char_literal255_tree=null;
        Object char_literal257_tree=null;
        Object ELLIPSIS258_tree=null;
        RewriteRuleTokenStream stream_ELLIPSIS=new RewriteRuleTokenStream(adaptor,"token ELLIPSIS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            // nesC.g:692:5: ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ASYNC||LA70_0==AUTO||LA70_0==BUILTIN_VA_LIST||LA70_0==CHAR||LA70_0==COMMAND||LA70_0==CONST||(LA70_0 >= DOUBLE && LA70_0 <= DUTY)||LA70_0==ENUM||(LA70_0 >= EVENT && LA70_0 <= EXTERN)||LA70_0==FLOAT||(LA70_0 >= INLINE && LA70_0 <= INT8_T)||LA70_0==LONG||LA70_0==NORACE||(LA70_0 >= NXLE_INT16_T && LA70_0 <= NX_UNION)||LA70_0==RAW_IDENTIFIER||LA70_0==REGISTER||LA70_0==RESTRICT||LA70_0==SHORT||LA70_0==SIGNED||LA70_0==STATIC||LA70_0==STRUCT||LA70_0==TASK||(LA70_0 >= UINT16_T && LA70_0 <= UINT8_T)||(LA70_0 >= UNION && LA70_0 <= UNSIGNED)||(LA70_0 >= VOID && LA70_0 <= VOLATILE)) ) {
                alt70=1;
            }
            else if ( (LA70_0==RBRACKET||LA70_0==RPARENS) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // nesC.g:692:10: parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )?
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list6010);
                    parameter_declaration254=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration254.getTree());

                    // nesC.g:692:32: ( ',' parameter_declaration )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==COMMA) ) {
                            int LA68_1 = input.LA(2);

                            if ( (LA68_1==ASYNC||LA68_1==AUTO||LA68_1==BUILTIN_VA_LIST||LA68_1==CHAR||LA68_1==COMMAND||LA68_1==CONST||(LA68_1 >= DOUBLE && LA68_1 <= DUTY)||LA68_1==ENUM||(LA68_1 >= EVENT && LA68_1 <= EXTERN)||LA68_1==FLOAT||(LA68_1 >= INLINE && LA68_1 <= INT8_T)||LA68_1==LONG||LA68_1==NORACE||(LA68_1 >= NXLE_INT16_T && LA68_1 <= NX_UNION)||LA68_1==RAW_IDENTIFIER||LA68_1==REGISTER||LA68_1==RESTRICT||LA68_1==SHORT||LA68_1==SIGNED||LA68_1==STATIC||LA68_1==STRUCT||LA68_1==TASK||(LA68_1 >= UINT16_T && LA68_1 <= UINT8_T)||(LA68_1 >= UNION && LA68_1 <= UNSIGNED)||(LA68_1 >= VOID && LA68_1 <= VOLATILE)) ) {
                                alt68=1;
                            }


                        }


                        switch (alt68) {
                    	case 1 :
                    	    // nesC.g:692:33: ',' parameter_declaration
                    	    {
                    	    char_literal255=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list6013); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal255);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list6015);
                    	    parameter_declaration256=parameter_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration256.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    // nesC.g:692:61: ( ',' ELLIPSIS )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==COMMA) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // nesC.g:692:62: ',' ELLIPSIS
                            {
                            char_literal257=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list6020); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal257);


                            ELLIPSIS258=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_parameter_list6022); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELLIPSIS.add(ELLIPSIS258);


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
                    // 693:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
                    {
                        // nesC.g:693:16: ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
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

                        // nesC.g:693:56: ( ELLIPSIS )?
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
                    // nesC.g:695:13: 
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
                    // 695:13: -> ^( PARAMETER_LIST )
                    {
                        // nesC.g:695:16: ^( PARAMETER_LIST )
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
    // nesC.g:701:1: parameter_declaration : declaration_specifiers ( parameter_declarator )? -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? ) ;
    public final nesCParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        nesCParser.parameter_declaration_return retval = new nesCParser.parameter_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers259 =null;

        nesCParser.parameter_declarator_return parameter_declarator260 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_parameter_declarator=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarator");
        try {
            // nesC.g:702:5: ( declaration_specifiers ( parameter_declarator )? -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? ) )
            // nesC.g:702:10: declaration_specifiers ( parameter_declarator )?
            {
            pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration6092);
            declaration_specifiers259=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers259.getTree());

            // nesC.g:702:33: ( parameter_declarator )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==LBRACKET||LA71_0==LPARENS||LA71_0==RAW_IDENTIFIER||LA71_0==STAR) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // nesC.g:702:33: parameter_declarator
                    {
                    pushFollow(FOLLOW_parameter_declarator_in_parameter_declaration6094);
                    parameter_declarator260=parameter_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declarator.add(parameter_declarator260.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: parameter_declarator, declaration_specifiers
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 703:13: -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? )
            {
                // nesC.g:703:16: ^( PARAMETER declaration_specifiers ( parameter_declarator )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETER, "PARAMETER")
                , root_1);

                adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                // nesC.g:703:51: ( parameter_declarator )?
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
    // nesC.g:706:1: parameter_declarator : ( ( declarator ( attributes )? )=> declarator ( attributes )? | abstract_declarator );
    public final nesCParser.parameter_declarator_return parameter_declarator() throws RecognitionException {
        nesCParser.parameter_declarator_return retval = new nesCParser.parameter_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declarator_return declarator261 =null;

        nesCParser.attributes_return attributes262 =null;

        nesCParser.abstract_declarator_return abstract_declarator263 =null;



        try {
            // nesC.g:707:5: ( ( declarator ( attributes )? )=> declarator ( attributes )? | abstract_declarator )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==STAR) ) {
                int LA73_1 = input.LA(2);

                if ( (synpred6_nesC()) ) {
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
            else if ( (LA73_0==RAW_IDENTIFIER) && (synpred6_nesC())) {
                alt73=1;
            }
            else if ( (LA73_0==LPARENS) ) {
                int LA73_3 = input.LA(2);

                if ( (synpred6_nesC()) ) {
                    alt73=1;
                }
                else if ( (true) ) {
                    alt73=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA73_0==LBRACKET) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // nesC.g:707:10: ( declarator ( attributes )? )=> declarator ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_parameter_declarator6143);
                    declarator261=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator261.getTree());

                    // nesC.g:707:49: ( attributes )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==ATTRIBUTE) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // nesC.g:707:49: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_parameter_declarator6145);
                            attributes262=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes262.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // nesC.g:708:10: abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_abstract_declarator_in_parameter_declarator6157);
                    abstract_declarator263=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator263.getTree());

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
    // nesC.g:710:1: identifier_list : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final nesCParser.identifier_list_return identifier_list() throws RecognitionException {
        nesCParser.identifier_list_return retval = new nesCParser.identifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal265=null;
        nesCParser.identifier_return identifier264 =null;

        nesCParser.identifier_return identifier266 =null;


        Object char_literal265_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:711:5: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // nesC.g:711:10: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifier_list6176);
            identifier264=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier264.getTree());

            // nesC.g:711:21: ( ',' identifier )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==COMMA) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // nesC.g:711:22: ',' identifier
            	    {
            	    char_literal265=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifier_list6179); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal265);


            	    pushFollow(FOLLOW_identifier_in_identifier_list6181);
            	    identifier266=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier266.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
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
            // 711:39: -> ( identifier )+
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
    // nesC.g:713:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final nesCParser.type_name_return type_name() throws RecognitionException {
        nesCParser.type_name_return retval = new nesCParser.type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.specifier_qualifier_list_return specifier_qualifier_list267 =null;

        nesCParser.abstract_declarator_return abstract_declarator268 =null;



        try {
            // nesC.g:714:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // nesC.g:714:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name6207);
            specifier_qualifier_list267=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list267.getTree());

            // nesC.g:714:35: ( abstract_declarator )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==LBRACKET||LA75_0==LPARENS||LA75_0==STAR) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // nesC.g:714:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name6209);
                    abstract_declarator268=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator268.getTree());

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
    // nesC.g:716:1: abstract_declarator : ( ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator | pointer );
    public final nesCParser.abstract_declarator_return abstract_declarator() throws RecognitionException {
        nesCParser.abstract_declarator_return retval = new nesCParser.abstract_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.pointer_return pointer269 =null;

        nesCParser.direct_abstract_declarator_return direct_abstract_declarator270 =null;

        nesCParser.pointer_return pointer271 =null;



        try {
            // nesC.g:717:5: ( ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator | pointer )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==STAR) ) {
                int LA77_1 = input.LA(2);

                if ( (synpred7_nesC()) ) {
                    alt77=1;
                }
                else if ( (true) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA77_0==LPARENS) && (synpred7_nesC())) {
                alt77=1;
            }
            else if ( (LA77_0==LBRACKET) && (synpred7_nesC())) {
                alt77=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }
            switch (alt77) {
                case 1 :
                    // nesC.g:717:10: ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:717:51: ( pointer )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==STAR) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // nesC.g:717:51: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator6238);
                            pointer269=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer269.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator6241);
                    direct_abstract_declarator270=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator270.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:718:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator6252);
                    pointer271=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer271.getTree());

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
    // nesC.g:720:1: direct_abstract_declarator : ( ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )* | ( direct_abstract_declarator_modifier )+ );
    public final nesCParser.direct_abstract_declarator_return direct_abstract_declarator() throws RecognitionException {
        nesCParser.direct_abstract_declarator_return retval = new nesCParser.direct_abstract_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal272=null;
        Token char_literal274=null;
        nesCParser.abstract_declarator_return abstract_declarator273 =null;

        nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier275 =null;

        nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier276 =null;


        Object char_literal272_tree=null;
        Object char_literal274_tree=null;

        try {
            // nesC.g:721:5: ( ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )* | ( direct_abstract_declarator_modifier )+ )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==LPARENS) ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==STAR) && (synpred8_nesC())) {
                    alt80=1;
                }
                else if ( (LA80_1==LPARENS) && (synpred8_nesC())) {
                    alt80=1;
                }
                else if ( (LA80_1==LBRACKET) && (synpred8_nesC())) {
                    alt80=1;
                }
                else if ( (LA80_1==ASYNC||LA80_1==AUTO||LA80_1==BUILTIN_VA_LIST||LA80_1==CHAR||LA80_1==COMMAND||LA80_1==CONST||(LA80_1 >= DOUBLE && LA80_1 <= DUTY)||LA80_1==ENUM||(LA80_1 >= EVENT && LA80_1 <= EXTERN)||LA80_1==FLOAT||(LA80_1 >= INLINE && LA80_1 <= INT8_T)||LA80_1==LONG||LA80_1==NORACE||(LA80_1 >= NXLE_INT16_T && LA80_1 <= NX_UNION)||LA80_1==RAW_IDENTIFIER||LA80_1==REGISTER||LA80_1==RESTRICT||LA80_1==RPARENS||LA80_1==SHORT||LA80_1==SIGNED||LA80_1==STATIC||LA80_1==STRUCT||LA80_1==TASK||(LA80_1 >= UINT16_T && LA80_1 <= UINT8_T)||(LA80_1 >= UNION && LA80_1 <= UNSIGNED)||(LA80_1 >= VOID && LA80_1 <= VOLATILE)) ) {
                    alt80=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA80_0==LBRACKET) ) {
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
                    // nesC.g:721:10: ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )*
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal272=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6292); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal272_tree = 
                    (Object)adaptor.create(char_literal272)
                    ;
                    adaptor.addChild(root_0, char_literal272_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator6294);
                    abstract_declarator273=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator273.getTree());

                    char_literal274=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6296); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal274_tree = 
                    (Object)adaptor.create(char_literal274)
                    ;
                    adaptor.addChild(root_0, char_literal274_tree);
                    }

                    // nesC.g:722:39: ( direct_abstract_declarator_modifier )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==LBRACKET||LA78_0==LPARENS) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // nesC.g:722:39: direct_abstract_declarator_modifier
                    	    {
                    	    pushFollow(FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6298);
                    	    direct_abstract_declarator_modifier275=direct_abstract_declarator_modifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator_modifier275.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // nesC.g:723:10: ( direct_abstract_declarator_modifier )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:723:10: ( direct_abstract_declarator_modifier )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==LBRACKET||LA79_0==LPARENS) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // nesC.g:723:10: direct_abstract_declarator_modifier
                    	    {
                    	    pushFollow(FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6310);
                    	    direct_abstract_declarator_modifier276=direct_abstract_declarator_modifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator_modifier276.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt79 >= 1 ) break loop79;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(79, input);
                                throw eee;
                        }
                        cnt79++;
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
    // nesC.g:725:1: direct_abstract_declarator_modifier : ( '[' ( assignment_expression )? ']' | '(' parameter_list ')' );
    public final nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier() throws RecognitionException {
        nesCParser.direct_abstract_declarator_modifier_return retval = new nesCParser.direct_abstract_declarator_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal277=null;
        Token char_literal279=null;
        Token char_literal280=null;
        Token char_literal282=null;
        nesCParser.assignment_expression_return assignment_expression278 =null;

        nesCParser.parameter_list_return parameter_list281 =null;


        Object char_literal277_tree=null;
        Object char_literal279_tree=null;
        Object char_literal280_tree=null;
        Object char_literal282_tree=null;

        try {
            // nesC.g:726:5: ( '[' ( assignment_expression )? ']' | '(' parameter_list ')' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==LBRACKET) ) {
                alt82=1;
            }
            else if ( (LA82_0==LPARENS) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }
            switch (alt82) {
                case 1 :
                    // nesC.g:726:10: '[' ( assignment_expression )? ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal277=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator_modifier6326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal277_tree = 
                    (Object)adaptor.create(char_literal277)
                    ;
                    adaptor.addChild(root_0, char_literal277_tree);
                    }

                    // nesC.g:726:14: ( assignment_expression )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==AMP||LA81_0==BITCOMPLEMENT||LA81_0==BUILTIN_VA_ARG||LA81_0==CALL||LA81_0==CHARACTER_LITERAL||LA81_0==CONSTANT||LA81_0==LPARENS||LA81_0==MINUS||LA81_0==MINUSMINUS||LA81_0==NOT||LA81_0==PLUS||LA81_0==PLUSPLUS||LA81_0==POST||LA81_0==RAW_IDENTIFIER||LA81_0==SIGNAL||LA81_0==SIZEOF||LA81_0==STAR||LA81_0==STRING_LITERAL) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // nesC.g:726:14: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator_modifier6328);
                            assignment_expression278=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression278.getTree());

                            }
                            break;

                    }


                    char_literal279=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator_modifier6331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal279_tree = 
                    (Object)adaptor.create(char_literal279)
                    ;
                    adaptor.addChild(root_0, char_literal279_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:727:10: '(' parameter_list ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal280=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator_modifier6342); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal280_tree = 
                    (Object)adaptor.create(char_literal280)
                    ;
                    adaptor.addChild(root_0, char_literal280_tree);
                    }

                    pushFollow(FOLLOW_parameter_list_in_direct_abstract_declarator_modifier6344);
                    parameter_list281=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list281.getTree());

                    char_literal282=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator_modifier6346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal282_tree = 
                    (Object)adaptor.create(char_literal282)
                    ;
                    adaptor.addChild(root_0, char_literal282_tree);
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
    // nesC.g:730:1: typedef_name :{...}? RAW_IDENTIFIER ;
    public final nesCParser.typedef_name_return typedef_name() throws RecognitionException {
        nesCParser.typedef_name_return retval = new nesCParser.typedef_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER283=null;

        Object RAW_IDENTIFIER283_tree=null;

        try {
            // nesC.g:731:5: ({...}? RAW_IDENTIFIER )
            // nesC.g:731:10: {...}? RAW_IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            if ( !(( symbols.isType(input.LT(1).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typedef_name", " symbols.isType(input.LT(1).getText()) ");
            }

            RAW_IDENTIFIER283=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name6372); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAW_IDENTIFIER283_tree = 
            (Object)adaptor.create(RAW_IDENTIFIER283)
            ;
            adaptor.addChild(root_0, RAW_IDENTIFIER283_tree);
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
    // nesC.g:739:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
    public final nesCParser.initializer_return initializer() throws RecognitionException {
        nesCParser.initializer_return retval = new nesCParser.initializer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal285=null;
        Token char_literal287=null;
        Token char_literal288=null;
        nesCParser.assignment_expression_return assignment_expression284 =null;

        nesCParser.initializer_list_return initializer_list286 =null;


        Object char_literal285_tree=null;
        Object char_literal287_tree=null;
        Object char_literal288_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            // nesC.g:740:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==AMP||LA84_0==BITCOMPLEMENT||LA84_0==BUILTIN_VA_ARG||LA84_0==CALL||LA84_0==CHARACTER_LITERAL||LA84_0==CONSTANT||LA84_0==LPARENS||LA84_0==MINUS||LA84_0==MINUSMINUS||LA84_0==NOT||LA84_0==PLUS||LA84_0==PLUSPLUS||LA84_0==POST||LA84_0==RAW_IDENTIFIER||LA84_0==SIGNAL||LA84_0==SIZEOF||LA84_0==STAR||LA84_0==STRING_LITERAL) ) {
                alt84=1;
            }
            else if ( (LA84_0==LBRACE) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // nesC.g:740:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer6397);
                    assignment_expression284=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression284.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:741:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal285=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer6408); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal285);


                    pushFollow(FOLLOW_initializer_list_in_initializer6410);
                    initializer_list286=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list286.getTree());

                    // nesC.g:741:31: ( ',' )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==COMMA) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // nesC.g:741:31: ','
                            {
                            char_literal287=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer6412); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal287);


                            }
                            break;

                    }


                    char_literal288=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer6415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal288);


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
                    // 741:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // nesC.g:741:43: ^( INITIALIZER_LIST initializer_list )
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
    // nesC.g:745:1: initializer_list : ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ ;
    public final nesCParser.initializer_list_return initializer_list() throws RecognitionException {
        nesCParser.initializer_list_return retval = new nesCParser.initializer_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER289=null;
        Token char_literal290=null;
        Token char_literal292=null;
        Token RAW_IDENTIFIER293=null;
        Token char_literal294=null;
        nesCParser.initializer_return initializer291 =null;

        nesCParser.initializer_return initializer295 =null;


        Object RAW_IDENTIFIER289_tree=null;
        Object char_literal290_tree=null;
        Object char_literal292_tree=null;
        Object RAW_IDENTIFIER293_tree=null;
        Object char_literal294_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // nesC.g:746:5: ( ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ )
            // nesC.g:746:10: ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            {
            // nesC.g:746:10: ( RAW_IDENTIFIER ':' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RAW_IDENTIFIER) ) {
                int LA85_1 = input.LA(2);

                if ( (LA85_1==199) ) {
                    alt85=1;
                }
            }
            switch (alt85) {
                case 1 :
                    // nesC.g:746:11: RAW_IDENTIFIER ':'
                    {
                    RAW_IDENTIFIER289=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER289);


                    char_literal290=(Token)match(input,199,FOLLOW_199_in_initializer_list6447); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal290);


                    }
                    break;

            }


            pushFollow(FOLLOW_initializer_in_initializer_list6451);
            initializer291=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer291.getTree());

            // nesC.g:746:44: ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==COMMA) ) {
                    int LA87_1 = input.LA(2);

                    if ( (LA87_1==AMP||LA87_1==BITCOMPLEMENT||LA87_1==BUILTIN_VA_ARG||LA87_1==CALL||LA87_1==CHARACTER_LITERAL||LA87_1==CONSTANT||LA87_1==LBRACE||LA87_1==LPARENS||LA87_1==MINUS||LA87_1==MINUSMINUS||LA87_1==NOT||LA87_1==PLUS||LA87_1==PLUSPLUS||LA87_1==POST||LA87_1==RAW_IDENTIFIER||LA87_1==SIGNAL||LA87_1==SIZEOF||LA87_1==STAR||LA87_1==STRING_LITERAL) ) {
                        alt87=1;
                    }


                }


                switch (alt87) {
            	case 1 :
            	    // nesC.g:746:45: ',' ( RAW_IDENTIFIER ':' )? initializer
            	    {
            	    char_literal292=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list6454); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal292);


            	    // nesC.g:746:49: ( RAW_IDENTIFIER ':' )?
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( (LA86_0==RAW_IDENTIFIER) ) {
            	        int LA86_1 = input.LA(2);

            	        if ( (LA86_1==199) ) {
            	            alt86=1;
            	        }
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // nesC.g:746:50: RAW_IDENTIFIER ':'
            	            {
            	            RAW_IDENTIFIER293=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6457); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER293);


            	            char_literal294=(Token)match(input,199,FOLLOW_199_in_initializer_list6459); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_199.add(char_literal294);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_initializer_in_initializer_list6463);
            	    initializer295=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer295.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
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
            // 747:13: -> ( initializer )+
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
    // nesC.g:757:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement );
    public final nesCParser.statement_return statement() throws RecognitionException {
        nesCParser.statement_return retval = new nesCParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.labeled_statement_return labeled_statement296 =null;

        nesCParser.compound_statement_return compound_statement297 =null;

        nesCParser.expression_statement_return expression_statement298 =null;

        nesCParser.selection_statement_return selection_statement299 =null;

        nesCParser.iteration_statement_return iteration_statement300 =null;

        nesCParser.jump_statement_return jump_statement301 =null;

        nesCParser.atomic_statement_return atomic_statement302 =null;



        try {
            // nesC.g:758:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement )
            int alt88=7;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==199) ) {
                    alt88=1;
                }
                else if ( ((LA88_1 >= AMP && LA88_1 <= AND)||LA88_1==ARROW||LA88_1==ASSIGN||LA88_1==BITANDASSIGN||(LA88_1 >= BITOR && LA88_1 <= BITXORASSIGN)||LA88_1==COMMA||(LA88_1 >= DIVASSIGN && LA88_1 <= DIVIDE)||LA88_1==DOT||LA88_1==EQUAL||(LA88_1 >= GREATER && LA88_1 <= GREATEREQUAL)||(LA88_1 >= LBRACKET && LA88_1 <= LESSEQUAL)||(LA88_1 >= LPARENS && LA88_1 <= MODASSIGN)||(LA88_1 >= MODULUS && LA88_1 <= MULASSIGN)||LA88_1==NOTEQUAL||LA88_1==OR||(LA88_1 >= PLUS && LA88_1 <= PLUSPLUS)||(LA88_1 >= RSHIFT && LA88_1 <= RSHIFTASSIGN)||LA88_1==STAR||LA88_1==200||LA88_1==202) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;

                }
                }
                break;
            case CASE:
            case DEFAULT:
                {
                alt88=1;
                }
                break;
            case LBRACE:
                {
                alt88=2;
                }
                break;
            case AMP:
            case BITCOMPLEMENT:
            case BUILTIN_VA_ARG:
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
            case 200:
                {
                alt88=3;
                }
                break;
            case IF:
            case SWITCH:
                {
                alt88=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt88=5;
                }
                break;
            case BREAK:
            case CONTINUE:
            case GOTO:
            case RETURN:
                {
                alt88=6;
                }
                break;
            case ATOMIC:
                {
                alt88=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;

            }

            switch (alt88) {
                case 1 :
                    // nesC.g:758:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement6512);
                    labeled_statement296=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement296.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:759:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement6523);
                    compound_statement297=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement297.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:760:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement6534);
                    expression_statement298=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement298.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:761:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement6545);
                    selection_statement299=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement299.getTree());

                    }
                    break;
                case 5 :
                    // nesC.g:762:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement6556);
                    iteration_statement300=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement300.getTree());

                    }
                    break;
                case 6 :
                    // nesC.g:763:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement6567);
                    jump_statement301=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement301.getTree());

                    }
                    break;
                case 7 :
                    // nesC.g:764:10: atomic_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atomic_statement_in_statement6578);
                    atomic_statement302=atomic_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomic_statement302.getTree());

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
    // nesC.g:768:1: atomic_statement : ATOMIC statement -> ^( ATOMIC statement ) ;
    public final nesCParser.atomic_statement_return atomic_statement() throws RecognitionException {
        nesCParser.atomic_statement_return retval = new nesCParser.atomic_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATOMIC303=null;
        nesCParser.statement_return statement304 =null;


        Object ATOMIC303_tree=null;
        RewriteRuleTokenStream stream_ATOMIC=new RewriteRuleTokenStream(adaptor,"token ATOMIC");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:769:5: ( ATOMIC statement -> ^( ATOMIC statement ) )
            // nesC.g:769:10: ATOMIC statement
            {
            ATOMIC303=(Token)match(input,ATOMIC,FOLLOW_ATOMIC_in_atomic_statement6599); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATOMIC.add(ATOMIC303);


            pushFollow(FOLLOW_statement_in_atomic_statement6601);
            statement304=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement304.getTree());

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
            // 769:27: -> ^( ATOMIC statement )
            {
                // nesC.g:769:30: ^( ATOMIC statement )
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
    // nesC.g:771:1: labeled_statement : ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final nesCParser.labeled_statement_return labeled_statement() throws RecognitionException {
        nesCParser.labeled_statement_return retval = new nesCParser.labeled_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal306=null;
        Token CASE308=null;
        Token char_literal310=null;
        Token DEFAULT312=null;
        Token char_literal313=null;
        nesCParser.identifier_return identifier305 =null;

        nesCParser.statement_return statement307 =null;

        nesCParser.constant_expression_return constant_expression309 =null;

        nesCParser.statement_return statement311 =null;

        nesCParser.statement_return statement314 =null;


        Object char_literal306_tree=null;
        Object CASE308_tree=null;
        Object char_literal310_tree=null;
        Object DEFAULT312_tree=null;
        Object char_literal313_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:772:5: ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
            int alt89=3;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                alt89=1;
                }
                break;
            case CASE:
                {
                alt89=2;
                }
                break;
            case DEFAULT:
                {
                alt89=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }

            switch (alt89) {
                case 1 :
                    // nesC.g:772:10: identifier ':' statement
                    {
                    pushFollow(FOLLOW_identifier_in_labeled_statement6628);
                    identifier305=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier305.getTree());

                    char_literal306=(Token)match(input,199,FOLLOW_199_in_labeled_statement6630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal306);


                    pushFollow(FOLLOW_statement_in_labeled_statement6632);
                    statement307=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement307.getTree());

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
                    // 772:35: -> ^( LABELED_STATEMENT identifier statement )
                    {
                        // nesC.g:772:38: ^( LABELED_STATEMENT identifier statement )
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
                    // nesC.g:773:10: CASE constant_expression ':' statement
                    {
                    CASE308=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement6653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE308);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement6655);
                    constant_expression309=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression309.getTree());

                    char_literal310=(Token)match(input,199,FOLLOW_199_in_labeled_statement6657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal310);


                    pushFollow(FOLLOW_statement_in_labeled_statement6659);
                    statement311=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement311.getTree());

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
                    // 773:49: -> ^( CASE constant_expression statement )
                    {
                        // nesC.g:773:52: ^( CASE constant_expression statement )
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
                    // nesC.g:774:10: DEFAULT ':' statement
                    {
                    DEFAULT312=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement6680); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT312);


                    char_literal313=(Token)match(input,199,FOLLOW_199_in_labeled_statement6682); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal313);


                    pushFollow(FOLLOW_statement_in_labeled_statement6684);
                    statement314=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement314.getTree());

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
                    // 774:32: -> ^( DEFAULT statement )
                    {
                        // nesC.g:774:35: ^( DEFAULT statement )
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
    // nesC.g:779:1: compound_statement : '{' ( declaration )* ( statement )* '}' -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* ) ;
    public final nesCParser.compound_statement_return compound_statement() throws RecognitionException {
        nesCParser.compound_statement_return retval = new nesCParser.compound_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal315=null;
        Token char_literal318=null;
        nesCParser.declaration_return declaration316 =null;

        nesCParser.statement_return statement317 =null;


        Object char_literal315_tree=null;
        Object char_literal318_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // nesC.g:780:5: ( '{' ( declaration )* ( statement )* '}' -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* ) )
            // nesC.g:780:10: '{' ( declaration )* ( statement )* '}'
            {
            char_literal315=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement6710); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal315);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:781:10: ( declaration )*
            loop90:
            do {
                int alt90=2;
                alt90 = dfa90.predict(input);
                switch (alt90) {
            	case 1 :
            	    // nesC.g:781:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_compound_statement6723);
            	    declaration316=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration316.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            // nesC.g:781:23: ( statement )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==AMP||LA91_0==ATOMIC||LA91_0==BITCOMPLEMENT||(LA91_0 >= BREAK && LA91_0 <= BUILTIN_VA_ARG)||(LA91_0 >= CALL && LA91_0 <= CASE)||LA91_0==CHARACTER_LITERAL||(LA91_0 >= CONSTANT && LA91_0 <= CONTINUE)||LA91_0==DEFAULT||LA91_0==DO||LA91_0==FOR||LA91_0==GOTO||LA91_0==IF||LA91_0==LBRACE||LA91_0==LPARENS||LA91_0==MINUS||LA91_0==MINUSMINUS||LA91_0==NOT||LA91_0==PLUS||LA91_0==PLUSPLUS||LA91_0==POST||LA91_0==RAW_IDENTIFIER||LA91_0==RETURN||LA91_0==SIGNAL||LA91_0==SIZEOF||LA91_0==STAR||LA91_0==STRING_LITERAL||LA91_0==SWITCH||LA91_0==WHILE||LA91_0==200) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // nesC.g:781:23: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compound_statement6726);
            	    statement317=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement317.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal318=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement6744); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal318);


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
            // 782:44: -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* )
            {
                // nesC.g:782:47: ^( COMPOUND_STATEMENT ( declaration )* ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // nesC.g:782:68: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                // nesC.g:782:81: ( statement )*
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
    // nesC.g:788:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final nesCParser.expression_statement_return expression_statement() throws RecognitionException {
        nesCParser.expression_statement_return retval = new nesCParser.expression_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal320=null;
        nesCParser.expression_return expression319 =null;


        Object char_literal320_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // nesC.g:789:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // nesC.g:789:10: ( expression )? ';'
            {
            // nesC.g:789:10: ( expression )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==AMP||LA92_0==BITCOMPLEMENT||LA92_0==BUILTIN_VA_ARG||LA92_0==CALL||LA92_0==CHARACTER_LITERAL||LA92_0==CONSTANT||LA92_0==LPARENS||LA92_0==MINUS||LA92_0==MINUSMINUS||LA92_0==NOT||LA92_0==PLUS||LA92_0==PLUSPLUS||LA92_0==POST||LA92_0==RAW_IDENTIFIER||LA92_0==SIGNAL||LA92_0==SIZEOF||LA92_0==STAR||LA92_0==STRING_LITERAL) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // nesC.g:789:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement6775);
                    expression319=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression319.getTree());

                    }
                    break;

            }


            char_literal320=(Token)match(input,200,FOLLOW_200_in_expression_statement6778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal320);


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
            // 789:26: -> ^( STATEMENT ( expression )? )
            {
                // nesC.g:789:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // nesC.g:789:41: ( expression )?
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
    // nesC.g:797:1: selection_statement : ( ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement -> ^( IF expression $s1 $s2) | IF '(' expression ')' statement -> ^( IF expression statement ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final nesCParser.selection_statement_return selection_statement() throws RecognitionException {
        nesCParser.selection_statement_return retval = new nesCParser.selection_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF321=null;
        Token char_literal322=null;
        Token char_literal324=null;
        Token ELSE325=null;
        Token IF326=null;
        Token char_literal327=null;
        Token char_literal329=null;
        Token SWITCH331=null;
        Token char_literal332=null;
        Token char_literal334=null;
        nesCParser.statement_return s1 =null;

        nesCParser.statement_return s2 =null;

        nesCParser.expression_return expression323 =null;

        nesCParser.expression_return expression328 =null;

        nesCParser.statement_return statement330 =null;

        nesCParser.expression_return expression333 =null;

        nesCParser.statement_return statement335 =null;


        Object IF321_tree=null;
        Object char_literal322_tree=null;
        Object char_literal324_tree=null;
        Object ELSE325_tree=null;
        Object IF326_tree=null;
        Object char_literal327_tree=null;
        Object char_literal329_tree=null;
        Object SWITCH331_tree=null;
        Object char_literal332_tree=null;
        Object char_literal334_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:798:5: ( ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement -> ^( IF expression $s1 $s2) | IF '(' expression ')' statement -> ^( IF expression statement ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==IF) ) {
                int LA93_1 = input.LA(2);

                if ( (synpred9_nesC()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA93_0==SWITCH) ) {
                alt93=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }
            switch (alt93) {
                case 1 :
                    // nesC.g:798:10: ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement
                    {
                    IF321=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF321);


                    char_literal322=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal322);


                    pushFollow(FOLLOW_expression_in_selection_statement6844);
                    expression323=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression323.getTree());

                    char_literal324=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal324);


                    pushFollow(FOLLOW_statement_in_selection_statement6850);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s1.getTree());

                    ELSE325=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement6852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE325);


                    pushFollow(FOLLOW_statement_in_selection_statement6856);
                    s2=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s2.getTree());

                    // AST REWRITE
                    // elements: s2, s1, IF, expression
                    // token labels: 
                    // rule labels: retval, s2, s1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);
                    RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 800:14: -> ^( IF expression $s1 $s2)
                    {
                        // nesC.g:800:17: ^( IF expression $s1 $s2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_s1.nextTree());

                        adaptor.addChild(root_1, stream_s2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:801:10: IF '(' expression ')' statement
                    {
                    IF326=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF326);


                    char_literal327=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal327);


                    pushFollow(FOLLOW_expression_in_selection_statement6898);
                    expression328=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression328.getTree());

                    char_literal329=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal329);


                    pushFollow(FOLLOW_statement_in_selection_statement6902);
                    statement330=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement330.getTree());

                    // AST REWRITE
                    // elements: IF, statement, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 802:14: -> ^( IF expression statement )
                    {
                        // nesC.g:802:17: ^( IF expression statement )
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
                    // nesC.g:803:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH331=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement6936); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH331);


                    char_literal332=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal332);


                    pushFollow(FOLLOW_expression_in_selection_statement6940);
                    expression333=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression333.getTree());

                    char_literal334=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal334);


                    pushFollow(FOLLOW_statement_in_selection_statement6944);
                    statement335=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement335.getTree());

                    // AST REWRITE
                    // elements: statement, expression, SWITCH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 804:14: -> ^( SWITCH expression statement )
                    {
                        // nesC.g:804:17: ^( SWITCH expression statement )
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
    // nesC.g:810:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final nesCParser.iteration_statement_return iteration_statement() throws RecognitionException {
        nesCParser.iteration_statement_return retval = new nesCParser.iteration_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE336=null;
        Token char_literal337=null;
        Token char_literal339=null;
        Token DO341=null;
        Token WHILE343=null;
        Token char_literal344=null;
        Token char_literal346=null;
        Token char_literal347=null;
        Token FOR348=null;
        Token char_literal349=null;
        Token char_literal350=null;
        Token char_literal351=null;
        Token char_literal352=null;
        nesCParser.expression_return init =null;

        nesCParser.expression_return cond =null;

        nesCParser.expression_return iter =null;

        nesCParser.expression_return expression338 =null;

        nesCParser.statement_return statement340 =null;

        nesCParser.statement_return statement342 =null;

        nesCParser.expression_return expression345 =null;

        nesCParser.statement_return statement353 =null;


        Object WHILE336_tree=null;
        Object char_literal337_tree=null;
        Object char_literal339_tree=null;
        Object DO341_tree=null;
        Object WHILE343_tree=null;
        Object char_literal344_tree=null;
        Object char_literal346_tree=null;
        Object char_literal347_tree=null;
        Object FOR348_tree=null;
        Object char_literal349_tree=null;
        Object char_literal350_tree=null;
        Object char_literal351_tree=null;
        Object char_literal352_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:811:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
            int alt97=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt97=1;
                }
                break;
            case DO:
                {
                alt97=2;
                }
                break;
            case FOR:
                {
                alt97=3;
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
                    // nesC.g:811:10: WHILE '(' expression ')' statement
                    {
                    WHILE336=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6990); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE336);


                    char_literal337=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal337);


                    pushFollow(FOLLOW_expression_in_iteration_statement6994);
                    expression338=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression338.getTree());

                    char_literal339=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6996); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal339);


                    pushFollow(FOLLOW_statement_in_iteration_statement6998);
                    statement340=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement340.getTree());

                    // AST REWRITE
                    // elements: expression, statement, WHILE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 811:45: -> ^( WHILE expression statement )
                    {
                        // nesC.g:811:48: ^( WHILE expression statement )
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
                    // nesC.g:812:10: DO statement WHILE '(' expression ')' ';'
                    {
                    DO341=(Token)match(input,DO,FOLLOW_DO_in_iteration_statement7019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO341);


                    pushFollow(FOLLOW_statement_in_iteration_statement7021);
                    statement342=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement342.getTree());

                    WHILE343=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement7023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE343);


                    char_literal344=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement7025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal344);


                    pushFollow(FOLLOW_expression_in_iteration_statement7027);
                    expression345=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression345.getTree());

                    char_literal346=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement7029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal346);


                    char_literal347=(Token)match(input,200,FOLLOW_200_in_iteration_statement7031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal347);


                    // AST REWRITE
                    // elements: DO, expression, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 812:52: -> ^( DO statement expression )
                    {
                        // nesC.g:812:55: ^( DO statement expression )
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
                    // nesC.g:813:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR348=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement7052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR348);


                    char_literal349=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement7054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal349);


                    // nesC.g:813:22: (init= expression )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==AMP||LA94_0==BITCOMPLEMENT||LA94_0==BUILTIN_VA_ARG||LA94_0==CALL||LA94_0==CHARACTER_LITERAL||LA94_0==CONSTANT||LA94_0==LPARENS||LA94_0==MINUS||LA94_0==MINUSMINUS||LA94_0==NOT||LA94_0==PLUS||LA94_0==PLUSPLUS||LA94_0==POST||LA94_0==RAW_IDENTIFIER||LA94_0==SIGNAL||LA94_0==SIZEOF||LA94_0==STAR||LA94_0==STRING_LITERAL) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // nesC.g:813:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement7058);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal350=(Token)match(input,200,FOLLOW_200_in_iteration_statement7061); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal350);


                    // nesC.g:813:43: (cond= expression )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==AMP||LA95_0==BITCOMPLEMENT||LA95_0==BUILTIN_VA_ARG||LA95_0==CALL||LA95_0==CHARACTER_LITERAL||LA95_0==CONSTANT||LA95_0==LPARENS||LA95_0==MINUS||LA95_0==MINUSMINUS||LA95_0==NOT||LA95_0==PLUS||LA95_0==PLUSPLUS||LA95_0==POST||LA95_0==RAW_IDENTIFIER||LA95_0==SIGNAL||LA95_0==SIZEOF||LA95_0==STAR||LA95_0==STRING_LITERAL) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // nesC.g:813:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement7065);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal351=(Token)match(input,200,FOLLOW_200_in_iteration_statement7068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal351);


                    // nesC.g:813:64: (iter= expression )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==AMP||LA96_0==BITCOMPLEMENT||LA96_0==BUILTIN_VA_ARG||LA96_0==CALL||LA96_0==CHARACTER_LITERAL||LA96_0==CONSTANT||LA96_0==LPARENS||LA96_0==MINUS||LA96_0==MINUSMINUS||LA96_0==NOT||LA96_0==PLUS||LA96_0==PLUSPLUS||LA96_0==POST||LA96_0==RAW_IDENTIFIER||LA96_0==SIGNAL||LA96_0==SIZEOF||LA96_0==STAR||LA96_0==STRING_LITERAL) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // nesC.g:813:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement7072);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal352=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement7075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal352);


                    pushFollow(FOLLOW_statement_in_iteration_statement7077);
                    statement353=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement353.getTree());

                    // AST REWRITE
                    // elements: init, statement, cond, FOR, iter
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
                    // 814:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // nesC.g:814:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // nesC.g:814:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // nesC.g:814:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:815:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // nesC.g:815:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:816:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // nesC.g:816:40: ( $iter)?
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
    // nesC.g:818:1: jump_statement : ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) );
    public final nesCParser.jump_statement_return jump_statement() throws RecognitionException {
        nesCParser.jump_statement_return retval = new nesCParser.jump_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GOTO354=null;
        Token char_literal356=null;
        Token CONTINUE357=null;
        Token char_literal358=null;
        Token BREAK359=null;
        Token char_literal360=null;
        Token RETURN361=null;
        Token char_literal363=null;
        nesCParser.identifier_return identifier355 =null;

        nesCParser.expression_return expression362 =null;


        Object GOTO354_tree=null;
        Object char_literal356_tree=null;
        Object CONTINUE357_tree=null;
        Object char_literal358_tree=null;
        Object BREAK359_tree=null;
        Object char_literal360_tree=null;
        Object RETURN361_tree=null;
        Object char_literal363_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_GOTO=new RewriteRuleTokenStream(adaptor,"token GOTO");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:819:5: ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
            int alt99=4;
            switch ( input.LA(1) ) {
            case GOTO:
                {
                alt99=1;
                }
                break;
            case CONTINUE:
                {
                alt99=2;
                }
                break;
            case BREAK:
                {
                alt99=3;
                }
                break;
            case RETURN:
                {
                alt99=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }

            switch (alt99) {
                case 1 :
                    // nesC.g:819:10: GOTO identifier ';'
                    {
                    GOTO354=(Token)match(input,GOTO,FOLLOW_GOTO_in_jump_statement7184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GOTO.add(GOTO354);


                    pushFollow(FOLLOW_identifier_in_jump_statement7186);
                    identifier355=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier355.getTree());

                    char_literal356=(Token)match(input,200,FOLLOW_200_in_jump_statement7188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal356);


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
                    // 819:30: -> ^( GOTO identifier )
                    {
                        // nesC.g:819:33: ^( GOTO identifier )
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
                    // nesC.g:820:10: CONTINUE ';'
                    {
                    CONTINUE357=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement7207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE357);


                    char_literal358=(Token)match(input,200,FOLLOW_200_in_jump_statement7209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal358);


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
                    // 820:23: -> CONTINUE
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
                    // nesC.g:821:10: BREAK ';'
                    {
                    BREAK359=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement7224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK359);


                    char_literal360=(Token)match(input,200,FOLLOW_200_in_jump_statement7226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal360);


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
                    // 821:20: -> BREAK
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
                    // nesC.g:822:10: RETURN ( expression )? ';'
                    {
                    RETURN361=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement7241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN361);


                    // nesC.g:822:17: ( expression )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==AMP||LA98_0==BITCOMPLEMENT||LA98_0==BUILTIN_VA_ARG||LA98_0==CALL||LA98_0==CHARACTER_LITERAL||LA98_0==CONSTANT||LA98_0==LPARENS||LA98_0==MINUS||LA98_0==MINUSMINUS||LA98_0==NOT||LA98_0==PLUS||LA98_0==PLUSPLUS||LA98_0==POST||LA98_0==RAW_IDENTIFIER||LA98_0==SIGNAL||LA98_0==SIZEOF||LA98_0==STAR||LA98_0==STRING_LITERAL) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // nesC.g:822:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_jump_statement7243);
                            expression362=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression362.getTree());

                            }
                            break;

                    }


                    char_literal363=(Token)match(input,200,FOLLOW_200_in_jump_statement7246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal363);


                    // AST REWRITE
                    // elements: expression, RETURN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 822:33: -> ^( RETURN ( expression )? )
                    {
                        // nesC.g:822:36: ^( RETURN ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_RETURN.nextNode()
                        , root_1);

                        // nesC.g:822:45: ( expression )?
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
    // nesC.g:828:1: translation_unit : ( line_directive | external_declaration )+ ;
    public final nesCParser.translation_unit_return translation_unit() throws RecognitionException {
        nesCParser.translation_unit_return retval = new nesCParser.translation_unit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive364 =null;

        nesCParser.external_declaration_return external_declaration365 =null;



        try {
            // nesC.g:829:5: ( ( line_directive | external_declaration )+ )
            // nesC.g:829:10: ( line_directive | external_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:829:10: ( line_directive | external_declaration )+
            int cnt100=0;
            loop100:
            do {
                int alt100=3;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==HASH) ) {
                    alt100=1;
                }
                else if ( (LA100_0==ASYNC||LA100_0==AUTO||LA100_0==BUILTIN_VA_LIST||LA100_0==CHAR||LA100_0==COMMAND||LA100_0==CONST||(LA100_0 >= DOUBLE && LA100_0 <= DUTY)||LA100_0==ENUM||(LA100_0 >= EVENT && LA100_0 <= EXTERN)||LA100_0==FLOAT||(LA100_0 >= INLINE && LA100_0 <= INT8_T)||LA100_0==LONG||LA100_0==NORACE||(LA100_0 >= NXLE_INT16_T && LA100_0 <= NX_UNION)||LA100_0==RAW_IDENTIFIER||LA100_0==REGISTER||LA100_0==RESTRICT||LA100_0==SHORT||LA100_0==SIGNED||LA100_0==STATIC||LA100_0==STRUCT||(LA100_0 >= TASK && LA100_0 <= UINT8_T)||(LA100_0 >= UNION && LA100_0 <= UNSIGNED)||(LA100_0 >= VOID && LA100_0 <= VOLATILE)) ) {
                    alt100=2;
                }


                switch (alt100) {
            	case 1 :
            	    // nesC.g:829:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit7282);
            	    line_directive364=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive364.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:829:28: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit7286);
            	    external_declaration365=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration365.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
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
    // nesC.g:832:1: external_declaration : declaration ;
    public final nesCParser.external_declaration_return external_declaration() throws RecognitionException {
        nesCParser.external_declaration_return retval = new nesCParser.external_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_return declaration366 =null;



        try {
            // nesC.g:833:5: ( declaration )
            // nesC.g:833:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration7304);
            declaration366=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration366.getTree());

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
    // nesC.g:847:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final nesCParser.line_directive_return line_directive() throws RecognitionException {
        nesCParser.line_directive_return retval = new nesCParser.line_directive_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal367=null;
        Token CONSTANT368=null;
        Token STRING_LITERAL369=null;
        Token CONSTANT370=null;

        Object char_literal367_tree=null;
        Object CONSTANT368_tree=null;
        Object STRING_LITERAL369_tree=null;
        Object CONSTANT370_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            // nesC.g:848:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // nesC.g:848:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )*
            {
            char_literal367=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive7331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal367);


            CONSTANT368=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7333); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT368);


            STRING_LITERAL369=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive7335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL369);


            // nesC.g:848:38: ( CONSTANT )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==CONSTANT) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // nesC.g:848:38: CONSTANT
            	    {
            	    CONSTANT370=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7337); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT370);


            	    }
            	    break;

            	default :
            	    break loop101;
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
            // 848:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // nesC.g:848:51: ^( LINE_DIRECTIVE STRING_LITERAL )
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
    // nesC.g:853:1: function_definition : declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement ;
    public final nesCParser.function_definition_return function_definition() throws RecognitionException {
        nesCParser.function_definition_return retval = new nesCParser.function_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers371 =null;

        nesCParser.declarator_return declarator372 =null;

        nesCParser.attributes_return attributes373 =null;

        nesCParser.compound_statement_return compound_statement374 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        try {
            // nesC.g:854:5: ( declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement )
            // nesC.g:854:10: declaration_specifiers declarator ( attributes )? compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition7368);
            declaration_specifiers371=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers371.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition7370);
            declarator372=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator372.getTree());

            // nesC.g:854:44: ( attributes )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==ATTRIBUTE) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // nesC.g:854:44: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_function_definition7372);
                    attributes373=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes373.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compound_statement_in_function_definition7375);
            compound_statement374=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement374.getTree());

            // AST REWRITE
            // elements: attributes, declaration_specifiers, compound_statement, declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 855:13: -> declaration_specifiers declarator ( attributes )? compound_statement
            {
                adaptor.addChild(root_0, stream_declaration_specifiers.nextTree());

                adaptor.addChild(root_0, stream_declarator.nextTree());

                // nesC.g:855:50: ( attributes )?
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
    // nesC.g:865:1: nesC_file : ( translation_unit )? large_scale_construct -> ^( FILE ( translation_unit )? large_scale_construct ) ;
    public final nesCParser.nesC_file_return nesC_file() throws RecognitionException {
        nesCParser.nesC_file_return retval = new nesCParser.nesC_file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit375 =null;

        nesCParser.large_scale_construct_return large_scale_construct376 =null;


        RewriteRuleSubtreeStream stream_large_scale_construct=new RewriteRuleSubtreeStream(adaptor,"rule large_scale_construct");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            // nesC.g:866:5: ( ( translation_unit )? large_scale_construct -> ^( FILE ( translation_unit )? large_scale_construct ) )
            // nesC.g:866:10: ( translation_unit )? large_scale_construct
            {
            // nesC.g:866:10: ( translation_unit )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==ASYNC||LA103_0==AUTO||LA103_0==BUILTIN_VA_LIST||LA103_0==CHAR||LA103_0==COMMAND||LA103_0==CONST||(LA103_0 >= DOUBLE && LA103_0 <= DUTY)||LA103_0==ENUM||(LA103_0 >= EVENT && LA103_0 <= EXTERN)||LA103_0==FLOAT||LA103_0==HASH||(LA103_0 >= INLINE && LA103_0 <= INT8_T)||LA103_0==LONG||LA103_0==NORACE||(LA103_0 >= NXLE_INT16_T && LA103_0 <= NX_UNION)||LA103_0==RAW_IDENTIFIER||LA103_0==REGISTER||LA103_0==RESTRICT||LA103_0==SHORT||LA103_0==SIGNED||LA103_0==STATIC||LA103_0==STRUCT||(LA103_0 >= TASK && LA103_0 <= UINT8_T)||(LA103_0 >= UNION && LA103_0 <= UNSIGNED)||(LA103_0 >= VOID && LA103_0 <= VOLATILE)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // nesC.g:866:10: translation_unit
                    {
                    pushFollow(FOLLOW_translation_unit_in_nesC_file7424);
                    translation_unit375=translation_unit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit375.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_large_scale_construct_in_nesC_file7427);
            large_scale_construct376=large_scale_construct();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_large_scale_construct.add(large_scale_construct376.getTree());

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
            // 867:14: -> ^( FILE ( translation_unit )? large_scale_construct )
            {
                // nesC.g:867:17: ^( FILE ( translation_unit )? large_scale_construct )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FILE, "FILE")
                , root_1);

                // nesC.g:867:24: ( translation_unit )?
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
    // nesC.g:869:1: large_scale_construct : ( interface_definition | component );
    public final nesCParser.large_scale_construct_return large_scale_construct() throws RecognitionException {
        nesCParser.large_scale_construct_return retval = new nesCParser.large_scale_construct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.interface_definition_return interface_definition377 =null;

        nesCParser.component_return component378 =null;



        try {
            // nesC.g:870:5: ( interface_definition | component )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==INTERFACE) ) {
                alt104=1;
            }
            else if ( (LA104_0==COMPONENT||LA104_0==CONFIGURATION||LA104_0==GENERIC||LA104_0==MODULE) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }
            switch (alt104) {
                case 1 :
                    // nesC.g:870:10: interface_definition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interface_definition_in_large_scale_construct7466);
                    interface_definition377=interface_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interface_definition377.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:871:10: component
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_component_in_large_scale_construct7477);
                    component378=component();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, component378.getTree());

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
    // nesC.g:880:1: interface_definition : INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}' -> ^( INTERFACE identifier ( declaration )* ) ;
    public final nesCParser.interface_definition_return interface_definition() throws RecognitionException {
        nesCParser.interface_definition_return retval = new nesCParser.interface_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERFACE379=null;
        Token char_literal383=null;
        Token char_literal386=null;
        nesCParser.identifier_return identifier380 =null;

        nesCParser.type_parameters_return type_parameters381 =null;

        nesCParser.attributes_return attributes382 =null;

        nesCParser.line_directive_return line_directive384 =null;

        nesCParser.declaration_return declaration385 =null;


        Object INTERFACE379_tree=null;
        Object char_literal383_tree=null;
        Object char_literal386_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_type_parameters=new RewriteRuleSubtreeStream(adaptor,"rule type_parameters");
        try {
            // nesC.g:881:5: ( INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}' -> ^( INTERFACE identifier ( declaration )* ) )
            // nesC.g:881:10: INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}'
            {
            INTERFACE379=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_definition7503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE379);


            pushFollow(FOLLOW_identifier_in_interface_definition7505);
            identifier380=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier380.getTree());

            // nesC.g:881:31: ( type_parameters )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==LESS) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // nesC.g:881:31: type_parameters
                    {
                    pushFollow(FOLLOW_type_parameters_in_interface_definition7507);
                    type_parameters381=type_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_parameters.add(type_parameters381.getTree());

                    }
                    break;

            }


            // nesC.g:881:48: ( attributes )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==ATTRIBUTE) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // nesC.g:881:48: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_interface_definition7510);
                    attributes382=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes382.getTree());

                    }
                    break;

            }


            char_literal383=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interface_definition7521); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal383);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:883:9: ( line_directive | declaration )*
            loop107:
            do {
                int alt107=3;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==HASH) ) {
                    alt107=1;
                }
                else if ( (LA107_0==ASYNC||LA107_0==AUTO||LA107_0==BUILTIN_VA_LIST||LA107_0==CHAR||LA107_0==COMMAND||LA107_0==CONST||(LA107_0 >= DOUBLE && LA107_0 <= DUTY)||LA107_0==ENUM||(LA107_0 >= EVENT && LA107_0 <= EXTERN)||LA107_0==FLOAT||(LA107_0 >= INLINE && LA107_0 <= INT8_T)||LA107_0==LONG||LA107_0==NORACE||(LA107_0 >= NXLE_INT16_T && LA107_0 <= NX_UNION)||LA107_0==RAW_IDENTIFIER||LA107_0==REGISTER||LA107_0==RESTRICT||LA107_0==SHORT||LA107_0==SIGNED||LA107_0==STATIC||LA107_0==STRUCT||(LA107_0 >= TASK && LA107_0 <= UINT8_T)||(LA107_0 >= UNION && LA107_0 <= UNSIGNED)||(LA107_0 >= VOID && LA107_0 <= VOLATILE)) ) {
                    alt107=2;
                }


                switch (alt107) {
            	case 1 :
            	    // nesC.g:883:10: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_interface_definition7534);
            	    line_directive384=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive384.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:883:27: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_interface_definition7538);
            	    declaration385=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration385.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal386=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interface_definition7556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal386);


            // AST REWRITE
            // elements: identifier, declaration, INTERFACE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 885:13: -> ^( INTERFACE identifier ( declaration )* )
            {
                // nesC.g:885:16: ^( INTERFACE identifier ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:885:39: ( declaration )*
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
    // nesC.g:887:1: type_parameters : '<' type_parameter_list '>' ;
    public final nesCParser.type_parameters_return type_parameters() throws RecognitionException {
        nesCParser.type_parameters_return retval = new nesCParser.type_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal387=null;
        Token char_literal389=null;
        nesCParser.type_parameter_list_return type_parameter_list388 =null;


        Object char_literal387_tree=null;
        Object char_literal389_tree=null;

        try {
            // nesC.g:888:5: ( '<' type_parameter_list '>' )
            // nesC.g:888:10: '<' type_parameter_list '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal387=(Token)match(input,LESS,FOLLOW_LESS_in_type_parameters7598); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal387_tree = 
            (Object)adaptor.create(char_literal387)
            ;
            adaptor.addChild(root_0, char_literal387_tree);
            }

            pushFollow(FOLLOW_type_parameter_list_in_type_parameters7600);
            type_parameter_list388=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_parameter_list388.getTree());

            char_literal389=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_parameters7602); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal389_tree = 
            (Object)adaptor.create(char_literal389)
            ;
            adaptor.addChild(root_0, char_literal389_tree);
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
    // nesC.g:890:1: type_parameter_list : type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* ;
    public final nesCParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        nesCParser.type_parameter_list_return retval = new nesCParser.type_parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal392=null;
        nesCParser.type_specifier_return type_specifier390 =null;

        nesCParser.attributes_return attributes391 =null;

        nesCParser.type_specifier_return type_specifier393 =null;

        nesCParser.attributes_return attributes394 =null;


        Object char_literal392_tree=null;

        try {
            // nesC.g:891:5: ( type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* )
            // nesC.g:891:10: type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_specifier_in_type_parameter_list7621);
            type_specifier390=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier390.getTree());

            // nesC.g:891:25: ( attributes )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==ATTRIBUTE) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // nesC.g:891:25: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_type_parameter_list7623);
                    attributes391=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes391.getTree());

                    }
                    break;

            }


            // nesC.g:891:37: ( ',' type_specifier ( attributes )? )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==COMMA) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // nesC.g:891:38: ',' type_specifier ( attributes )?
            	    {
            	    char_literal392=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_parameter_list7627); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal392_tree = 
            	    (Object)adaptor.create(char_literal392)
            	    ;
            	    adaptor.addChild(root_0, char_literal392_tree);
            	    }

            	    pushFollow(FOLLOW_type_specifier_in_type_parameter_list7629);
            	    type_specifier393=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier393.getTree());

            	    // nesC.g:891:57: ( attributes )?
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==ATTRIBUTE) ) {
            	        alt109=1;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // nesC.g:891:57: attributes
            	            {
            	            pushFollow(FOLLOW_attributes_in_type_parameter_list7631);
            	            attributes394=attributes();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes394.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
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
    // nesC.g:896:1: component : component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) ;
    public final nesCParser.component_return component() throws RecognitionException {
        nesCParser.component_return retval = new nesCParser.component_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.component_kind_return component_kind395 =null;

        nesCParser.identifier_return identifier396 =null;

        nesCParser.component_parameters_return component_parameters397 =null;

        nesCParser.attributes_return attributes398 =null;

        nesCParser.component_specification_return component_specification399 =null;

        nesCParser.implementation_return implementation400 =null;


        RewriteRuleSubtreeStream stream_component_parameters=new RewriteRuleSubtreeStream(adaptor,"rule component_parameters");
        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_component_kind=new RewriteRuleSubtreeStream(adaptor,"rule component_kind");
        try {
            // nesC.g:897:5: ( component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) )
            // nesC.g:897:9: component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )?
            {
            pushFollow(FOLLOW_component_kind_in_component7653);
            component_kind395=component_kind();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_kind.add(component_kind395.getTree());

            pushFollow(FOLLOW_identifier_in_component7655);
            identifier396=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier396.getTree());

            // nesC.g:897:35: ( component_parameters )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==LPARENS) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // nesC.g:897:35: component_parameters
                    {
                    pushFollow(FOLLOW_component_parameters_in_component7657);
                    component_parameters397=component_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameters.add(component_parameters397.getTree());

                    }
                    break;

            }


            // nesC.g:897:57: ( attributes )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==ATTRIBUTE) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // nesC.g:897:57: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_component7660);
                    attributes398=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes398.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_component_specification_in_component7671);
            component_specification399=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification399.getTree());

            // nesC.g:899:9: ( implementation )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==IMPLEMENTATION) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // nesC.g:899:9: implementation
                    {
                    pushFollow(FOLLOW_implementation_in_component7681);
                    implementation400=implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementation.add(implementation400.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: implementation, component_specification, identifier, component_parameters, component_kind
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 899:25: -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
            {
                // nesC.g:899:28: ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DEFINITION, "COMPONENT_DEFINITION")
                , root_1);

                adaptor.addChild(root_1, stream_component_kind.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_component_specification.nextTree());

                // nesC.g:899:101: ( implementation )?
                if ( stream_implementation.hasNext() ) {
                    adaptor.addChild(root_1, stream_implementation.nextTree());

                }
                stream_implementation.reset();

                // nesC.g:899:117: ( component_parameters )?
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
    // nesC.g:904:1: component_kind : ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) );
    public final nesCParser.component_kind_return component_kind() throws RecognitionException {
        nesCParser.component_kind_return retval = new nesCParser.component_kind_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MODULE401=null;
        Token CONFIGURATION402=null;
        Token COMPONENT403=null;
        Token GENERIC404=null;
        Token MODULE405=null;
        Token GENERIC406=null;
        Token CONFIGURATION407=null;

        Object MODULE401_tree=null;
        Object CONFIGURATION402_tree=null;
        Object COMPONENT403_tree=null;
        Object GENERIC404_tree=null;
        Object MODULE405_tree=null;
        Object GENERIC406_tree=null;
        Object CONFIGURATION407_tree=null;
        RewriteRuleTokenStream stream_CONFIGURATION=new RewriteRuleTokenStream(adaptor,"token CONFIGURATION");
        RewriteRuleTokenStream stream_GENERIC=new RewriteRuleTokenStream(adaptor,"token GENERIC");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_COMPONENT=new RewriteRuleTokenStream(adaptor,"token COMPONENT");

        try {
            // nesC.g:905:5: ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) )
            int alt114=5;
            switch ( input.LA(1) ) {
            case MODULE:
                {
                alt114=1;
                }
                break;
            case CONFIGURATION:
                {
                alt114=2;
                }
                break;
            case COMPONENT:
                {
                alt114=3;
                }
                break;
            case GENERIC:
                {
                int LA114_4 = input.LA(2);

                if ( (LA114_4==MODULE) ) {
                    alt114=4;
                }
                else if ( (LA114_4==CONFIGURATION) ) {
                    alt114=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 114, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }

            switch (alt114) {
                case 1 :
                    // nesC.g:905:10: MODULE
                    {
                    MODULE401=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE401);


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
                    // 905:32: -> ^( COMPONENT_KIND MODULE )
                    {
                        // nesC.g:905:35: ^( COMPONENT_KIND MODULE )
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
                    // nesC.g:906:10: CONFIGURATION
                    {
                    CONFIGURATION402=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION402);


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
                    // 906:32: -> ^( COMPONENT_KIND CONFIGURATION )
                    {
                        // nesC.g:906:35: ^( COMPONENT_KIND CONFIGURATION )
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
                    // nesC.g:907:10: COMPONENT
                    {
                    COMPONENT403=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_component_kind7779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMPONENT.add(COMPONENT403);


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
                    // 907:32: -> ^( COMPONENT_KIND COMPONENT )
                    {
                        // nesC.g:907:35: ^( COMPONENT_KIND COMPONENT )
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
                    // nesC.g:908:10: GENERIC MODULE
                    {
                    GENERIC404=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC404);


                    MODULE405=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE405);


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
                    // 908:32: -> ^( COMPONENT_KIND GENERIC MODULE )
                    {
                        // nesC.g:908:35: ^( COMPONENT_KIND GENERIC MODULE )
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
                    // nesC.g:909:10: GENERIC CONFIGURATION
                    {
                    GENERIC406=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC406);


                    CONFIGURATION407=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION407);


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
                    // 909:32: -> ^( COMPONENT_KIND GENERIC CONFIGURATION )
                    {
                        // nesC.g:909:35: ^( COMPONENT_KIND GENERIC CONFIGURATION )
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
    // nesC.g:911:1: implementation : IMPLEMENTATION '{' body '}' -> ^( IMPLEMENTATION ( body )? ) ;
    public final nesCParser.implementation_return implementation() throws RecognitionException {
        nesCParser.implementation_return retval = new nesCParser.implementation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLEMENTATION408=null;
        Token char_literal409=null;
        Token char_literal411=null;
        nesCParser.body_return body410 =null;


        Object IMPLEMENTATION408_tree=null;
        Object char_literal409_tree=null;
        Object char_literal411_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // nesC.g:912:5: ( IMPLEMENTATION '{' body '}' -> ^( IMPLEMENTATION ( body )? ) )
            // nesC.g:912:10: IMPLEMENTATION '{' body '}'
            {
            IMPLEMENTATION408=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_implementation7871); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION408);


            char_literal409=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_implementation7873); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal409);


            pushFollow(FOLLOW_body_in_implementation7875);
            body410=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body410.getTree());

            char_literal411=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_implementation7877); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal411);


            // AST REWRITE
            // elements: body, IMPLEMENTATION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 913:14: -> ^( IMPLEMENTATION ( body )? )
            {
                // nesC.g:913:17: ^( IMPLEMENTATION ( body )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLEMENTATION.nextNode()
                , root_1);

                // nesC.g:913:34: ( body )?
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
    // nesC.g:919:1: component_parameters : '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) ;
    public final nesCParser.component_parameters_return component_parameters() throws RecognitionException {
        nesCParser.component_parameters_return retval = new nesCParser.component_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal412=null;
        Token char_literal414=null;
        nesCParser.component_parameter_list_return component_parameter_list413 =null;


        Object char_literal412_tree=null;
        Object char_literal414_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter_list");
        try {
            // nesC.g:920:5: ( '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) )
            // nesC.g:920:10: '(' ( component_parameter_list )? ')'
            {
            char_literal412=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_parameters7918); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPARENS.add(char_literal412);


            // nesC.g:920:14: ( component_parameter_list )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==ASYNC||LA115_0==AUTO||LA115_0==BUILTIN_VA_LIST||LA115_0==CHAR||LA115_0==COMMAND||LA115_0==CONST||(LA115_0 >= DOUBLE && LA115_0 <= DUTY)||LA115_0==ENUM||(LA115_0 >= EVENT && LA115_0 <= EXTERN)||LA115_0==FLOAT||(LA115_0 >= INLINE && LA115_0 <= INT8_T)||LA115_0==LONG||LA115_0==NORACE||(LA115_0 >= NXLE_INT16_T && LA115_0 <= NX_UNION)||LA115_0==RAW_IDENTIFIER||LA115_0==REGISTER||LA115_0==RESTRICT||LA115_0==SHORT||LA115_0==SIGNED||LA115_0==STATIC||LA115_0==STRUCT||(LA115_0 >= TASK && LA115_0 <= UINT8_T)||(LA115_0 >= UNION && LA115_0 <= UNSIGNED)||(LA115_0 >= VOID && LA115_0 <= VOLATILE)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // nesC.g:920:14: component_parameter_list
                    {
                    pushFollow(FOLLOW_component_parameter_list_in_component_parameters7920);
                    component_parameter_list413=component_parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameter_list.add(component_parameter_list413.getTree());

                    }
                    break;

            }


            char_literal414=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_parameters7923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPARENS.add(char_literal414);


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
            // 921:13: -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
            {
                // nesC.g:921:16: ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_PARAMETER_LIST, "COMPONENT_PARAMETER_LIST")
                , root_1);

                // nesC.g:921:43: ( component_parameter_list )?
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
    // nesC.g:923:1: component_parameter_list : component_parameter ( ',' component_parameter )* -> ( component_parameter )+ ;
    public final nesCParser.component_parameter_list_return component_parameter_list() throws RecognitionException {
        nesCParser.component_parameter_list_return retval = new nesCParser.component_parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal416=null;
        nesCParser.component_parameter_return component_parameter415 =null;

        nesCParser.component_parameter_return component_parameter417 =null;


        Object char_literal416_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_parameter=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter");
        try {
            // nesC.g:924:5: ( component_parameter ( ',' component_parameter )* -> ( component_parameter )+ )
            // nesC.g:924:10: component_parameter ( ',' component_parameter )*
            {
            pushFollow(FOLLOW_component_parameter_in_component_parameter_list7963);
            component_parameter415=component_parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter415.getTree());

            // nesC.g:924:30: ( ',' component_parameter )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==COMMA) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // nesC.g:924:31: ',' component_parameter
            	    {
            	    char_literal416=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_parameter_list7966); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal416);


            	    pushFollow(FOLLOW_component_parameter_in_component_parameter_list7968);
            	    component_parameter417=component_parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter417.getTree());

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
            // 924:57: -> ( component_parameter )+
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
    // nesC.g:926:1: component_parameter : ( parameter_declaration | TYPEDEF identifier ( attributes )? );
    public final nesCParser.component_parameter_return component_parameter() throws RecognitionException {
        nesCParser.component_parameter_return retval = new nesCParser.component_parameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TYPEDEF419=null;
        nesCParser.parameter_declaration_return parameter_declaration418 =null;

        nesCParser.identifier_return identifier420 =null;

        nesCParser.attributes_return attributes421 =null;


        Object TYPEDEF419_tree=null;

        try {
            // nesC.g:927:5: ( parameter_declaration | TYPEDEF identifier ( attributes )? )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==ASYNC||LA118_0==AUTO||LA118_0==BUILTIN_VA_LIST||LA118_0==CHAR||LA118_0==COMMAND||LA118_0==CONST||(LA118_0 >= DOUBLE && LA118_0 <= DUTY)||LA118_0==ENUM||(LA118_0 >= EVENT && LA118_0 <= EXTERN)||LA118_0==FLOAT||(LA118_0 >= INLINE && LA118_0 <= INT8_T)||LA118_0==LONG||LA118_0==NORACE||(LA118_0 >= NXLE_INT16_T && LA118_0 <= NX_UNION)||LA118_0==RAW_IDENTIFIER||LA118_0==REGISTER||LA118_0==RESTRICT||LA118_0==SHORT||LA118_0==SIGNED||LA118_0==STATIC||LA118_0==STRUCT||LA118_0==TASK||(LA118_0 >= UINT16_T && LA118_0 <= UINT8_T)||(LA118_0 >= UNION && LA118_0 <= UNSIGNED)||(LA118_0 >= VOID && LA118_0 <= VOLATILE)) ) {
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
                    // nesC.g:927:10: parameter_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_parameter_declaration_in_component_parameter7994);
                    parameter_declaration418=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_declaration418.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:928:10: TYPEDEF identifier ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TYPEDEF419=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_component_parameter8005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPEDEF419_tree = 
                    (Object)adaptor.create(TYPEDEF419)
                    ;
                    adaptor.addChild(root_0, TYPEDEF419_tree);
                    }

                    pushFollow(FOLLOW_identifier_in_component_parameter8007);
                    identifier420=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier420.getTree());

                    // nesC.g:928:29: ( attributes )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==ATTRIBUTE) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // nesC.g:928:29: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_component_parameter8009);
                            attributes421=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes421.getTree());

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
    // nesC.g:930:1: body : ( ( configuration_body )=> configuration_body | module_body );
    public final nesCParser.body_return body() throws RecognitionException {
        nesCParser.body_return retval = new nesCParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.configuration_body_return configuration_body422 =null;

        nesCParser.module_body_return module_body423 =null;



        try {
            // nesC.g:931:5: ( ( configuration_body )=> configuration_body | module_body )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==HASH) ) {
                int LA119_1 = input.LA(2);

                if ( (LA119_1==CONSTANT) ) {
                    int LA119_8 = input.LA(3);

                    if ( (LA119_8==STRING_LITERAL) ) {
                        int LA119_14 = input.LA(4);

                        if ( (synpred10_nesC()) ) {
                            alt119=1;
                        }
                        else if ( (true) ) {
                            alt119=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 119, 14, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 119, 8, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 119, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA119_0==COMPONENTS) && (synpred10_nesC())) {
                alt119=1;
            }
            else if ( (LA119_0==ENABLE) && (synpred10_nesC())) {
                alt119=1;
            }
            else if ( (LA119_0==RAW_IDENTIFIER) ) {
                int LA119_4 = input.LA(2);

                if ( (LA119_4==DOT) && (synpred10_nesC())) {
                    alt119=1;
                }
                else if ( (LA119_4==ASSIGN) && (synpred10_nesC())) {
                    alt119=1;
                }
                else if ( (LA119_4==ARROW) && (synpred10_nesC())) {
                    alt119=1;
                }
                else if ( (LA119_4==201) && (synpred10_nesC())) {
                    alt119=1;
                }
                else if ( (LA119_4==LBRACKET) && (synpred10_nesC())) {
                    alt119=1;
                }
                else if ( (LA119_4==ASYNC||LA119_4==AUTO||LA119_4==BUILTIN_VA_LIST||LA119_4==CHAR||LA119_4==COMMAND||LA119_4==CONST||(LA119_4 >= DOUBLE && LA119_4 <= DUTY)||LA119_4==ENUM||(LA119_4 >= EVENT && LA119_4 <= EXTERN)||LA119_4==FLOAT||LA119_4==GCCATTRIBUTE||(LA119_4 >= INLINE && LA119_4 <= INT8_T)||(LA119_4 >= LONG && LA119_4 <= LPARENS)||LA119_4==NORACE||(LA119_4 >= NXLE_INT16_T && LA119_4 <= NX_UNION)||LA119_4==RAW_IDENTIFIER||LA119_4==REGISTER||LA119_4==RESTRICT||LA119_4==SHORT||LA119_4==SIGNED||LA119_4==STAR||LA119_4==STATIC||LA119_4==STRUCT||LA119_4==TASK||(LA119_4 >= UINT16_T && LA119_4 <= UINT8_T)||(LA119_4 >= UNION && LA119_4 <= UNSIGNED)||(LA119_4 >= VOID && LA119_4 <= VOLATILE)||LA119_4==200) ) {
                    alt119=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 119, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA119_0==LBRACKET) && (synpred10_nesC())) {
                alt119=1;
            }
            else if ( (LA119_0==RBRACE) && (synpred10_nesC())) {
                alt119=1;
            }
            else if ( (LA119_0==ASYNC||LA119_0==AUTO||LA119_0==BUILTIN_VA_LIST||LA119_0==CHAR||LA119_0==COMMAND||LA119_0==CONST||(LA119_0 >= DOUBLE && LA119_0 <= DUTY)||LA119_0==ENUM||(LA119_0 >= EVENT && LA119_0 <= EXTERN)||LA119_0==FLOAT||(LA119_0 >= INLINE && LA119_0 <= INT8_T)||LA119_0==LONG||LA119_0==NORACE||(LA119_0 >= NXLE_INT16_T && LA119_0 <= NX_UNION)||LA119_0==REGISTER||LA119_0==RESTRICT||LA119_0==SHORT||LA119_0==SIGNED||LA119_0==STATIC||LA119_0==STRUCT||(LA119_0 >= TASK && LA119_0 <= UINT8_T)||(LA119_0 >= UNION && LA119_0 <= UNSIGNED)||(LA119_0 >= VOID && LA119_0 <= VOLATILE)) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;

            }
            switch (alt119) {
                case 1 :
                    // nesC.g:931:10: ( configuration_body )=> configuration_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_configuration_body_in_body8035);
                    configuration_body422=configuration_body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_body422.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:932:10: module_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_module_body_in_body8046);
                    module_body423=module_body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, module_body423.getTree());

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
    // nesC.g:937:1: configuration_body : ( configuration_element_list )? ;
    public final nesCParser.configuration_body_return configuration_body() throws RecognitionException {
        nesCParser.configuration_body_return retval = new nesCParser.configuration_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.configuration_element_list_return configuration_element_list424 =null;



        try {
            // nesC.g:938:5: ( ( configuration_element_list )? )
            // nesC.g:938:10: ( configuration_element_list )?
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:939:10: ( configuration_element_list )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==COMPONENTS||LA120_0==ENABLE||LA120_0==HASH||LA120_0==LBRACKET||LA120_0==RAW_IDENTIFIER) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // nesC.g:939:10: configuration_element_list
                    {
                    pushFollow(FOLLOW_configuration_element_list_in_configuration_body8075);
                    configuration_element_list424=configuration_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element_list424.getTree());

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
    // nesC.g:943:1: module_body : translation_unit ;
    public final nesCParser.module_body_return module_body() throws RecognitionException {
        nesCParser.module_body_return retval = new nesCParser.module_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit425 =null;



        try {
            // nesC.g:944:5: ( translation_unit )
            // nesC.g:944:10: translation_unit
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_body8118);
            translation_unit425=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, translation_unit425.getTree());

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
    // nesC.g:948:1: configuration_element_list : ( line_directive | configuration_element )+ ;
    public final nesCParser.configuration_element_list_return configuration_element_list() throws RecognitionException {
        nesCParser.configuration_element_list_return retval = new nesCParser.configuration_element_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive426 =null;

        nesCParser.configuration_element_return configuration_element427 =null;



        try {
            // nesC.g:949:5: ( ( line_directive | configuration_element )+ )
            // nesC.g:949:10: ( line_directive | configuration_element )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:949:10: ( line_directive | configuration_element )+
            int cnt121=0;
            loop121:
            do {
                int alt121=3;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==HASH) ) {
                    alt121=1;
                }
                else if ( (LA121_0==COMPONENTS||LA121_0==ENABLE||LA121_0==LBRACKET||LA121_0==RAW_IDENTIFIER) ) {
                    alt121=2;
                }


                switch (alt121) {
            	case 1 :
            	    // nesC.g:949:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_configuration_element_list8145);
            	    line_directive426=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive426.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:949:28: configuration_element
            	    {
            	    pushFollow(FOLLOW_configuration_element_in_configuration_element_list8149);
            	    configuration_element427=configuration_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element427.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt121 >= 1 ) break loop121;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(121, input);
                        throw eee;
                }
                cnt121++;
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
    // nesC.g:951:1: configuration_element : ( components | connection );
    public final nesCParser.configuration_element_return configuration_element() throws RecognitionException {
        nesCParser.configuration_element_return retval = new nesCParser.configuration_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.components_return components428 =null;

        nesCParser.connection_return connection429 =null;



        try {
            // nesC.g:952:5: ( components | connection )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==COMPONENTS) ) {
                alt122=1;
            }
            else if ( (LA122_0==ENABLE||LA122_0==LBRACKET||LA122_0==RAW_IDENTIFIER) ) {
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
                    // nesC.g:952:10: components
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_components_in_configuration_element8170);
                    components428=components();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, components428.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:953:10: connection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_connection_in_configuration_element8181);
                    connection429=connection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connection429.getTree());

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
    // nesC.g:961:1: components : COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) ;
    public final nesCParser.components_return components() throws RecognitionException {
        nesCParser.components_return retval = new nesCParser.components_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMPONENTS430=null;
        Token char_literal432=null;
        nesCParser.component_line_return component_line431 =null;


        Object COMPONENTS430_tree=null;
        Object char_literal432_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_COMPONENTS=new RewriteRuleTokenStream(adaptor,"token COMPONENTS");
        RewriteRuleSubtreeStream stream_component_line=new RewriteRuleSubtreeStream(adaptor,"rule component_line");
        try {
            // nesC.g:962:5: ( COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) )
            // nesC.g:962:10: COMPONENTS component_line ';'
            {
            COMPONENTS430=(Token)match(input,COMPONENTS,FOLLOW_COMPONENTS_in_components8226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPONENTS.add(COMPONENTS430);


            pushFollow(FOLLOW_component_line_in_components8228);
            component_line431=component_line();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_line.add(component_line431.getTree());

            char_literal432=(Token)match(input,200,FOLLOW_200_in_components8230); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal432);


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
            // 962:40: -> ^( COMPONENTS component_line )
            {
                // nesC.g:962:43: ^( COMPONENTS component_line )
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
    // nesC.g:964:1: component_line : component_declaration ( ',' component_declaration )* -> ( component_declaration )+ ;
    public final nesCParser.component_line_return component_line() throws RecognitionException {
        nesCParser.component_line_return retval = new nesCParser.component_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal434=null;
        nesCParser.component_declaration_return component_declaration433 =null;

        nesCParser.component_declaration_return component_declaration435 =null;


        Object char_literal434_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_declaration=new RewriteRuleSubtreeStream(adaptor,"rule component_declaration");
        try {
            // nesC.g:965:5: ( component_declaration ( ',' component_declaration )* -> ( component_declaration )+ )
            // nesC.g:965:10: component_declaration ( ',' component_declaration )*
            {
            pushFollow(FOLLOW_component_declaration_in_component_line8257);
            component_declaration433=component_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration433.getTree());

            // nesC.g:965:32: ( ',' component_declaration )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==COMMA) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // nesC.g:965:33: ',' component_declaration
            	    {
            	    char_literal434=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_line8260); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal434);


            	    pushFollow(FOLLOW_component_declaration_in_component_line8262);
            	    component_declaration435=component_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration435.getTree());

            	    }
            	    break;

            	default :
            	    break loop123;
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
            // 965:61: -> ( component_declaration )+
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
    // nesC.g:967:1: component_declaration : component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) ;
    public final nesCParser.component_declaration_return component_declaration() throws RecognitionException {
        nesCParser.component_declaration_return retval = new nesCParser.component_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS437=null;
        nesCParser.component_ref_return component_ref436 =null;

        nesCParser.identifier_return identifier438 =null;


        Object AS437_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_component_ref=new RewriteRuleSubtreeStream(adaptor,"rule component_ref");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:968:5: ( component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) )
            // nesC.g:968:10: component_ref ( AS identifier )?
            {
            pushFollow(FOLLOW_component_ref_in_component_declaration8288);
            component_ref436=component_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_ref.add(component_ref436.getTree());

            // nesC.g:968:24: ( AS identifier )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==AS) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // nesC.g:968:25: AS identifier
                    {
                    AS437=(Token)match(input,AS,FOLLOW_AS_in_component_declaration8291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS437);


                    pushFollow(FOLLOW_identifier_in_component_declaration8293);
                    identifier438=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier438.getTree());

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
            // 968:41: -> ^( COMPONENT_DECLARATION component_ref ( identifier )? )
            {
                // nesC.g:968:44: ^( COMPONENT_DECLARATION component_ref ( identifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DECLARATION, "COMPONENT_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_component_ref.nextTree());

                // nesC.g:968:82: ( identifier )?
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
    // nesC.g:974:1: component_ref : ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) );
    public final nesCParser.component_ref_return component_ref() throws RecognitionException {
        nesCParser.component_ref_return retval = new nesCParser.component_ref_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEW440=null;
        Token char_literal442=null;
        Token char_literal444=null;
        nesCParser.identifier_return identifier439 =null;

        nesCParser.identifier_return identifier441 =null;

        nesCParser.component_argument_list_return component_argument_list443 =null;


        Object NEW440_tree=null;
        Object char_literal442_tree=null;
        Object char_literal444_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule component_argument_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:975:5: ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RAW_IDENTIFIER) ) {
                alt126=1;
            }
            else if ( (LA126_0==NEW) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;

            }
            switch (alt126) {
                case 1 :
                    // nesC.g:975:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_component_ref8331);
                    identifier439=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier439.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:976:10: NEW identifier '(' ( component_argument_list )? ')'
                    {
                    NEW440=(Token)match(input,NEW,FOLLOW_NEW_in_component_ref8342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW440);


                    pushFollow(FOLLOW_identifier_in_component_ref8344);
                    identifier441=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier441.getTree());

                    char_literal442=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_ref8346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal442);


                    // nesC.g:976:29: ( component_argument_list )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==AMP||LA125_0==BITCOMPLEMENT||(LA125_0 >= BUILTIN_VA_ARG && LA125_0 <= CALL)||(LA125_0 >= CHAR && LA125_0 <= CHARACTER_LITERAL)||(LA125_0 >= CONST && LA125_0 <= CONSTANT)||LA125_0==DOUBLE||LA125_0==ENUM||LA125_0==FLOAT||(LA125_0 >= INT && LA125_0 <= INT8_T)||(LA125_0 >= LONG && LA125_0 <= LPARENS)||LA125_0==MINUS||LA125_0==MINUSMINUS||LA125_0==NOT||(LA125_0 >= NXLE_INT16_T && LA125_0 <= NX_UNION)||LA125_0==PLUS||LA125_0==PLUSPLUS||LA125_0==POST||LA125_0==RAW_IDENTIFIER||LA125_0==RESTRICT||(LA125_0 >= SHORT && LA125_0 <= SIZEOF)||LA125_0==STAR||(LA125_0 >= STRING_LITERAL && LA125_0 <= STRUCT)||(LA125_0 >= UINT16_T && LA125_0 <= UINT8_T)||(LA125_0 >= UNION && LA125_0 <= UNSIGNED)||(LA125_0 >= VOID && LA125_0 <= VOLATILE)) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // nesC.g:976:29: component_argument_list
                            {
                            pushFollow(FOLLOW_component_argument_list_in_component_ref8348);
                            component_argument_list443=component_argument_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_component_argument_list.add(component_argument_list443.getTree());

                            }
                            break;

                    }


                    char_literal444=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_ref8351); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal444);


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
                    // 977:13: -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                    {
                        // nesC.g:977:16: ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_INSTANTIATION, "COMPONENT_INSTANTIATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:977:53: ( component_argument_list )?
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
    // nesC.g:984:1: component_argument_list : component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) ;
    public final nesCParser.component_argument_list_return component_argument_list() throws RecognitionException {
        nesCParser.component_argument_list_return retval = new nesCParser.component_argument_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal446=null;
        nesCParser.component_argument_return component_argument445 =null;

        nesCParser.component_argument_return component_argument447 =null;


        Object char_literal446_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_argument=new RewriteRuleSubtreeStream(adaptor,"rule component_argument");
        try {
            // nesC.g:985:5: ( component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) )
            // nesC.g:985:10: component_argument ( ',' component_argument )*
            {
            pushFollow(FOLLOW_component_argument_in_component_argument_list8398);
            component_argument445=component_argument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_argument.add(component_argument445.getTree());

            // nesC.g:985:29: ( ',' component_argument )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==COMMA) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // nesC.g:985:30: ',' component_argument
            	    {
            	    char_literal446=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_argument_list8401); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal446);


            	    pushFollow(FOLLOW_component_argument_in_component_argument_list8403);
            	    component_argument447=component_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_argument.add(component_argument447.getTree());

            	    }
            	    break;

            	default :
            	    break loop127;
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
            // 986:13: -> ^( COMPONENT_ARGUMENTS ( component_argument )+ )
            {
                // nesC.g:986:16: ^( COMPONENT_ARGUMENTS ( component_argument )+ )
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
    // nesC.g:988:1: component_argument : ( expression | type_name );
    public final nesCParser.component_argument_return component_argument() throws RecognitionException {
        nesCParser.component_argument_return retval = new nesCParser.component_argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.expression_return expression448 =null;

        nesCParser.type_name_return type_name449 =null;



        try {
            // nesC.g:989:5: ( expression | type_name )
            int alt128=2;
            switch ( input.LA(1) ) {
            case AMP:
            case BITCOMPLEMENT:
            case BUILTIN_VA_ARG:
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
                alt128=1;
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA128_2 = input.LA(2);

                if ( (( !symbols.isType(input.LT(1).getText()) )) ) {
                    alt128=1;
                }
                else if ( (( symbols.isType(input.LT(1).getText()) )) ) {
                    alt128=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 128, 2, input);

                    throw nvae;

                }
                }
                break;
            case BUILTIN_VA_LIST:
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
            case NXLE_INT16_T:
            case NXLE_INT32_T:
            case NXLE_INT64_T:
            case NXLE_INT8_T:
            case NXLE_UINT16_T:
            case NXLE_UINT32_T:
            case NXLE_UINT64_T:
            case NXLE_UINT8_T:
            case NX_INT16_T:
            case NX_INT32_T:
            case NX_INT64_T:
            case NX_INT8_T:
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
                alt128=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;

            }

            switch (alt128) {
                case 1 :
                    // nesC.g:989:10: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_component_argument8445);
                    expression448=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression448.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:990:10: type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_name_in_component_argument8456);
                    type_name449=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name449.getTree());

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
    // nesC.g:996:1: connection : ( certificate_specification )? endpoint wire_rhs ';' -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? ) ;
    public final nesCParser.connection_return connection() throws RecognitionException {
        nesCParser.connection_return retval = new nesCParser.connection_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal453=null;
        nesCParser.certificate_specification_return certificate_specification450 =null;

        nesCParser.endpoint_return endpoint451 =null;

        nesCParser.wire_rhs_return wire_rhs452 =null;


        Object char_literal453_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_certificate_specification=new RewriteRuleSubtreeStream(adaptor,"rule certificate_specification");
        RewriteRuleSubtreeStream stream_wire_rhs=new RewriteRuleSubtreeStream(adaptor,"rule wire_rhs");
        RewriteRuleSubtreeStream stream_endpoint=new RewriteRuleSubtreeStream(adaptor,"rule endpoint");
        try {
            // nesC.g:997:5: ( ( certificate_specification )? endpoint wire_rhs ';' -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? ) )
            // nesC.g:997:10: ( certificate_specification )? endpoint wire_rhs ';'
            {
            // nesC.g:997:10: ( certificate_specification )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==ENABLE) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // nesC.g:997:10: certificate_specification
                    {
                    pushFollow(FOLLOW_certificate_specification_in_connection8475);
                    certificate_specification450=certificate_specification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification450.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_endpoint_in_connection8478);
            endpoint451=endpoint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_endpoint.add(endpoint451.getTree());

            pushFollow(FOLLOW_wire_rhs_in_connection8480);
            wire_rhs452=wire_rhs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_wire_rhs.add(wire_rhs452.getTree());

            char_literal453=(Token)match(input,200,FOLLOW_200_in_connection8482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal453);


            // AST REWRITE
            // elements: wire_rhs, endpoint, certificate_specification
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 998:14: -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? )
            {
                // nesC.g:998:17: ^( CONNECTION wire_rhs endpoint ( certificate_specification )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONNECTION, "CONNECTION")
                , root_1);

                adaptor.addChild(root_1, stream_wire_rhs.nextTree());

                adaptor.addChild(root_1, stream_endpoint.nextTree());

                // nesC.g:998:48: ( certificate_specification )?
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
    // nesC.g:1000:1: wire_rhs : ( '=' ^ endpoint | '->' ^ endpoint | '<-' ^ endpoint );
    public final nesCParser.wire_rhs_return wire_rhs() throws RecognitionException {
        nesCParser.wire_rhs_return retval = new nesCParser.wire_rhs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal454=null;
        Token string_literal456=null;
        Token string_literal458=null;
        nesCParser.endpoint_return endpoint455 =null;

        nesCParser.endpoint_return endpoint457 =null;

        nesCParser.endpoint_return endpoint459 =null;


        Object char_literal454_tree=null;
        Object string_literal456_tree=null;
        Object string_literal458_tree=null;

        try {
            // nesC.g:1001:5: ( '=' ^ endpoint | '->' ^ endpoint | '<-' ^ endpoint )
            int alt130=3;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt130=1;
                }
                break;
            case ARROW:
                {
                alt130=2;
                }
                break;
            case 201:
                {
                alt130=3;
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
                    // nesC.g:1001:10: '=' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal454=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_wire_rhs8523); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal454_tree = 
                    (Object)adaptor.create(char_literal454)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal454_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8527);
                    endpoint455=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint455.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:1002:10: '->' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal456=(Token)match(input,ARROW,FOLLOW_ARROW_in_wire_rhs8538); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal456_tree = 
                    (Object)adaptor.create(string_literal456)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(string_literal456_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8541);
                    endpoint457=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint457.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:1003:10: '<-' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal458=(Token)match(input,201,FOLLOW_201_in_wire_rhs8552); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal458_tree = 
                    (Object)adaptor.create(string_literal458)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(string_literal458_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8555);
                    endpoint459=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint459.getTree());

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
    // nesC.g:1005:1: certificate_specification : ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) ;
    public final nesCParser.certificate_specification_return certificate_specification() throws RecognitionException {
        nesCParser.certificate_specification_return retval = new nesCParser.certificate_specification_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token certs=null;
        Token entity=null;
        Token assumptions=null;
        Token ENABLE460=null;
        Token AS461=null;
        Token ASSUMING462=null;
        Token FOR463=null;

        Object certs_tree=null;
        Object entity_tree=null;
        Object assumptions_tree=null;
        Object ENABLE460_tree=null;
        Object AS461_tree=null;
        Object ASSUMING462_tree=null;
        Object FOR463_tree=null;
        RewriteRuleTokenStream stream_ASSUMING=new RewriteRuleTokenStream(adaptor,"token ASSUMING");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_ENABLE=new RewriteRuleTokenStream(adaptor,"token ENABLE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            // nesC.g:1006:5: ( ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) )
            // nesC.g:1006:10: ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR
            {
            ENABLE460=(Token)match(input,ENABLE,FOLLOW_ENABLE_in_certificate_specification8570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENABLE.add(ENABLE460);


            certs=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8574); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(certs);


            // nesC.g:1006:38: ( AS entity= STRING_LITERAL )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==AS) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // nesC.g:1006:39: AS entity= STRING_LITERAL
                    {
                    AS461=(Token)match(input,AS,FOLLOW_AS_in_certificate_specification8577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS461);


                    entity=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8581); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(entity);


                    }
                    break;

            }


            // nesC.g:1006:66: ( ASSUMING assumptions= STRING_LITERAL )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ASSUMING) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // nesC.g:1006:67: ASSUMING assumptions= STRING_LITERAL
                    {
                    ASSUMING462=(Token)match(input,ASSUMING,FOLLOW_ASSUMING_in_certificate_specification8586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUMING.add(ASSUMING462);


                    assumptions=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(assumptions);


                    }
                    break;

            }


            FOR463=(Token)match(input,FOR,FOLLOW_FOR_in_certificate_specification8594); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR463);


            // AST REWRITE
            // elements: assumptions, ASSUMING, entity, AS, ENABLE, certs
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
            // 1007:14: -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
            {
                // nesC.g:1007:17: ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ENABLE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_certs.nextNode());

                // nesC.g:1007:33: ( ^( AS $entity) )?
                if ( stream_entity.hasNext()||stream_AS.hasNext() ) {
                    // nesC.g:1007:33: ^( AS $entity)
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

                // nesC.g:1007:48: ( ^( ASSUMING $assumptions) )?
                if ( stream_assumptions.hasNext()||stream_ASSUMING.hasNext() ) {
                    // nesC.g:1007:48: ^( ASSUMING $assumptions)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_ASSUMING.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_assumptions.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_assumptions.reset();
                stream_ASSUMING.reset();

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
    // nesC.g:1009:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );
    public final nesCParser.endpoint_return endpoint() throws RecognitionException {
        nesCParser.endpoint_return retval = new nesCParser.endpoint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal466=null;
        Token char_literal468=null;
        nesCParser.identifier_path_return identifier_path464 =null;

        nesCParser.identifier_path_return identifier_path465 =null;

        nesCParser.argument_expression_list_return argument_expression_list467 =null;


        Object char_literal466_tree=null;
        Object char_literal468_tree=null;

        try {
            // nesC.g:1010:5: ( identifier_path | identifier_path '[' argument_expression_list ']' )
            int alt133=2;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // nesC.g:1010:10: identifier_path
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8647);
                    identifier_path464=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path464.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:1011:10: identifier_path '[' argument_expression_list ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8658);
                    identifier_path465=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path465.getTree());

                    char_literal466=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_endpoint8660); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal466_tree = 
                    (Object)adaptor.create(char_literal466)
                    ;
                    adaptor.addChild(root_0, char_literal466_tree);
                    }

                    pushFollow(FOLLOW_argument_expression_list_in_endpoint8662);
                    argument_expression_list467=argument_expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list467.getTree());

                    char_literal468=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_endpoint8664); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal468_tree = 
                    (Object)adaptor.create(char_literal468)
                    ;
                    adaptor.addChild(root_0, char_literal468_tree);
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
    // nesC.g:1013:1: identifier_path : ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) );
    public final nesCParser.identifier_path_return identifier_path() throws RecognitionException {
        nesCParser.identifier_path_return retval = new nesCParser.identifier_path_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal470=null;
        Token char_literal472=null;
        Token char_literal473=null;
        Token char_literal474=null;
        List list_normal_path=null;
        nesCParser.identifier_return indirect =null;

        nesCParser.identifier_return identifier469 =null;

        nesCParser.identifier_return identifier471 =null;

        RuleReturnScope normal_path = null;
        Object char_literal470_tree=null;
        Object char_literal472_tree=null;
        Object char_literal473_tree=null;
        Object char_literal474_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1014:5: ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) )
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
                    // nesC.g:1014:10: identifier ( '.' identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_identifier_path8683);
                    identifier469=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier469.getTree());

                    // nesC.g:1014:21: ( '.' identifier )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==DOT) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // nesC.g:1014:22: '.' identifier
                    	    {
                    	    char_literal470=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8686); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal470);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8688);
                    	    identifier471=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier471.getTree());

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
                    // 1015:13: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:1015:16: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:1016:10: '[' indirect= identifier ']' ( '.' normal_path+= identifier )*
                    {
                    char_literal472=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_identifier_path8722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal472);


                    pushFollow(FOLLOW_identifier_in_identifier_path8726);
                    indirect=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(indirect.getTree());

                    char_literal473=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_identifier_path8728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal473);


                    // nesC.g:1016:38: ( '.' normal_path+= identifier )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==DOT) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // nesC.g:1016:39: '.' normal_path+= identifier
                    	    {
                    	    char_literal474=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8731); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal474);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8735);
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
                    // 1017:13: -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
                    {
                        // nesC.g:1017:16: ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
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
    // nesC.g:1023:1: component_specification : '{' ( line_directive | uses_provides )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final nesCParser.component_specification_return component_specification() throws RecognitionException {
        nesCParser.component_specification_return retval = new nesCParser.component_specification_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal475=null;
        Token char_literal478=null;
        nesCParser.line_directive_return line_directive476 =null;

        nesCParser.uses_provides_return uses_provides477 =null;


        Object char_literal475_tree=null;
        Object char_literal478_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        try {
            // nesC.g:1024:5: ( '{' ( line_directive | uses_provides )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // nesC.g:1024:10: '{' ( line_directive | uses_provides )* '}'
            {
            char_literal475=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification8784); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal475);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:1025:11: ( line_directive | uses_provides )*
            loop137:
            do {
                int alt137=3;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==HASH) ) {
                    alt137=1;
                }
                else if ( (LA137_0==ASYNC||LA137_0==AUTO||LA137_0==BUILTIN_VA_LIST||LA137_0==CHAR||LA137_0==COMMAND||LA137_0==CONST||(LA137_0 >= DOUBLE && LA137_0 <= DUTY)||LA137_0==ENUM||(LA137_0 >= EVENT && LA137_0 <= EXTERN)||LA137_0==FLOAT||(LA137_0 >= INLINE && LA137_0 <= INT8_T)||LA137_0==LONG||LA137_0==NORACE||(LA137_0 >= NXLE_INT16_T && LA137_0 <= NX_UNION)||(LA137_0 >= PROVIDES && LA137_0 <= RAW_IDENTIFIER)||LA137_0==REGISTER||LA137_0==RESTRICT||LA137_0==SHORT||LA137_0==SIGNED||LA137_0==STATIC||LA137_0==STRUCT||(LA137_0 >= TASK && LA137_0 <= UINT8_T)||(LA137_0 >= UNION && LA137_0 <= VOLATILE)) ) {
                    alt137=2;
                }


                switch (alt137) {
            	case 1 :
            	    // nesC.g:1025:12: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification8799);
            	    line_directive476=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive476.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:1025:29: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification8803);
            	    uses_provides477=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides477.getTree());

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);


            char_literal478=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification8807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal478);


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
            // 1025:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // nesC.g:1025:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // nesC.g:1025:68: ( uses_provides )*
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
    // nesC.g:1027:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) );
    public final nesCParser.uses_provides_return uses_provides() throws RecognitionException {
        nesCParser.uses_provides_return retval = new nesCParser.uses_provides_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token USES479=null;
        Token PROVIDES481=null;
        nesCParser.specification_element_list_return specification_element_list480 =null;

        nesCParser.specification_element_list_return specification_element_list482 =null;

        nesCParser.declaration_return declaration483 =null;


        Object USES479_tree=null;
        Object PROVIDES481_tree=null;
        RewriteRuleTokenStream stream_PROVIDES=new RewriteRuleTokenStream(adaptor,"token PROVIDES");
        RewriteRuleTokenStream stream_USES=new RewriteRuleTokenStream(adaptor,"token USES");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_specification_element_list=new RewriteRuleSubtreeStream(adaptor,"rule specification_element_list");
        try {
            // nesC.g:1028:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) )
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
            case BUILTIN_VA_LIST:
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
            case NXLE_INT16_T:
            case NXLE_INT32_T:
            case NXLE_INT64_T:
            case NXLE_INT8_T:
            case NXLE_UINT16_T:
            case NXLE_UINT32_T:
            case NXLE_UINT64_T:
            case NXLE_UINT8_T:
            case NX_INT16_T:
            case NX_INT32_T:
            case NX_INT64_T:
            case NX_INT8_T:
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
                    // nesC.g:1028:10: USES specification_element_list
                    {
                    USES479=(Token)match(input,USES,FOLLOW_USES_in_uses_provides8835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES479);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8837);
                    specification_element_list480=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list480.getTree());

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
                    // 1028:42: -> ^( USES specification_element_list )
                    {
                        // nesC.g:1028:45: ^( USES specification_element_list )
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
                    // nesC.g:1029:10: PROVIDES specification_element_list
                    {
                    PROVIDES481=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides8856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES481);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8858);
                    specification_element_list482=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list482.getTree());

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
                    // 1029:46: -> ^( PROVIDES specification_element_list )
                    {
                        // nesC.g:1029:49: ^( PROVIDES specification_element_list )
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
                    // nesC.g:1030:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_uses_provides8877);
                    declaration483=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration483.getTree());

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
                    // 1030:22: -> ^( DECLARATION declaration )
                    {
                        // nesC.g:1030:25: ^( DECLARATION declaration )
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
    // nesC.g:1032:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final nesCParser.specification_element_list_return specification_element_list() throws RecognitionException {
        nesCParser.specification_element_list_return retval = new nesCParser.specification_element_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal485=null;
        Token char_literal487=null;
        nesCParser.specification_element_return specification_element484 =null;

        nesCParser.specification_element_return specification_element486 =null;


        Object char_literal485_tree=null;
        Object char_literal487_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_specification_element=new RewriteRuleSubtreeStream(adaptor,"rule specification_element");
        try {
            // nesC.g:1033:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==ASYNC||LA140_0==AUTO||LA140_0==BUILTIN_VA_LIST||LA140_0==CHAR||LA140_0==COMMAND||LA140_0==CONST||(LA140_0 >= DOUBLE && LA140_0 <= DUTY)||LA140_0==ENUM||(LA140_0 >= EVENT && LA140_0 <= EXTERN)||LA140_0==FLOAT||(LA140_0 >= INLINE && LA140_0 <= INTERFACE)||LA140_0==LONG||LA140_0==NORACE||(LA140_0 >= NXLE_INT16_T && LA140_0 <= NX_UNION)||LA140_0==RAW_IDENTIFIER||(LA140_0 >= REGISTER && LA140_0 <= REMOTE)||LA140_0==RESTRICT||LA140_0==SHORT||LA140_0==SIGNED||LA140_0==STATIC||LA140_0==STRUCT||(LA140_0 >= TASK && LA140_0 <= UINT8_T)||(LA140_0 >= UNION && LA140_0 <= UNSIGNED)||(LA140_0 >= VOID && LA140_0 <= VOLATILE)) ) {
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
                    // nesC.g:1033:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list8904);
                    specification_element484=specification_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element.add(specification_element484.getTree());

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
                    // 1033:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:1034:10: '{' ( specification_element )+ '}'
                    {
                    char_literal485=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list8919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal485);


                    // nesC.g:1034:14: ( specification_element )+
                    int cnt139=0;
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==ASYNC||LA139_0==AUTO||LA139_0==BUILTIN_VA_LIST||LA139_0==CHAR||LA139_0==COMMAND||LA139_0==CONST||(LA139_0 >= DOUBLE && LA139_0 <= DUTY)||LA139_0==ENUM||(LA139_0 >= EVENT && LA139_0 <= EXTERN)||LA139_0==FLOAT||(LA139_0 >= INLINE && LA139_0 <= INTERFACE)||LA139_0==LONG||LA139_0==NORACE||(LA139_0 >= NXLE_INT16_T && LA139_0 <= NX_UNION)||LA139_0==RAW_IDENTIFIER||(LA139_0 >= REGISTER && LA139_0 <= REMOTE)||LA139_0==RESTRICT||LA139_0==SHORT||LA139_0==SIGNED||LA139_0==STATIC||LA139_0==STRUCT||(LA139_0 >= TASK && LA139_0 <= UINT8_T)||(LA139_0 >= UNION && LA139_0 <= UNSIGNED)||(LA139_0 >= VOID && LA139_0 <= VOLATILE)) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // nesC.g:1034:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list8921);
                    	    specification_element486=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element486.getTree());

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


                    char_literal487=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list8924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal487);


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
                    // 1034:41: -> ( specification_element )+
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
    // nesC.g:1036:1: specification_element : ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) );
    public final nesCParser.specification_element_return specification_element() throws RecognitionException {
        nesCParser.specification_element_return retval = new nesCParser.specification_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS490=null;
        Token char_literal494=null;
        nesCParser.declaration_return declaration488 =null;

        nesCParser.interface_type_return interface_type489 =null;

        nesCParser.identifier_return identifier491 =null;

        nesCParser.instance_parameters_return instance_parameters492 =null;

        nesCParser.attributes_return attributes493 =null;


        Object AS490_tree=null;
        Object char_literal494_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_instance_parameters=new RewriteRuleSubtreeStream(adaptor,"rule instance_parameters");
        RewriteRuleSubtreeStream stream_interface_type=new RewriteRuleSubtreeStream(adaptor,"rule interface_type");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1037:5: ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==ASYNC||LA144_0==AUTO||LA144_0==BUILTIN_VA_LIST||LA144_0==CHAR||LA144_0==COMMAND||LA144_0==CONST||(LA144_0 >= DOUBLE && LA144_0 <= DUTY)||LA144_0==ENUM||(LA144_0 >= EVENT && LA144_0 <= EXTERN)||LA144_0==FLOAT||(LA144_0 >= INLINE && LA144_0 <= INT8_T)||LA144_0==LONG||LA144_0==NORACE||(LA144_0 >= NXLE_INT16_T && LA144_0 <= NX_UNION)||LA144_0==RAW_IDENTIFIER||LA144_0==REGISTER||LA144_0==RESTRICT||LA144_0==SHORT||LA144_0==SIGNED||LA144_0==STATIC||LA144_0==STRUCT||(LA144_0 >= TASK && LA144_0 <= UINT8_T)||(LA144_0 >= UNION && LA144_0 <= UNSIGNED)||(LA144_0 >= VOID && LA144_0 <= VOLATILE)) ) {
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
                    // nesC.g:1037:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_specification_element8948);
                    declaration488=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration488.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:1038:10: interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';'
                    {
                    pushFollow(FOLLOW_interface_type_in_specification_element8959);
                    interface_type489=interface_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_type.add(interface_type489.getTree());

                    // nesC.g:1038:25: ( AS identifier )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==AS) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // nesC.g:1038:26: AS identifier
                            {
                            AS490=(Token)match(input,AS,FOLLOW_AS_in_specification_element8962); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AS.add(AS490);


                            pushFollow(FOLLOW_identifier_in_specification_element8964);
                            identifier491=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier491.getTree());

                            }
                            break;

                    }


                    // nesC.g:1038:42: ( instance_parameters )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==LBRACKET) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // nesC.g:1038:42: instance_parameters
                            {
                            pushFollow(FOLLOW_instance_parameters_in_specification_element8968);
                            instance_parameters492=instance_parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_instance_parameters.add(instance_parameters492.getTree());

                            }
                            break;

                    }


                    // nesC.g:1038:63: ( attributes )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==ATTRIBUTE) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // nesC.g:1038:63: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_specification_element8971);
                            attributes493=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes493.getTree());

                            }
                            break;

                    }


                    char_literal494=(Token)match(input,200,FOLLOW_200_in_specification_element8974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal494);


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
                    // 1039:13: -> ^( INTERFACE interface_type ( identifier )? )
                    {
                        // nesC.g:1039:16: ^( INTERFACE interface_type ( identifier )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTERFACE, "INTERFACE")
                        , root_1);

                        adaptor.addChild(root_1, stream_interface_type.nextTree());

                        // nesC.g:1039:43: ( identifier )?
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
    // nesC.g:1046:1: interface_type : ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) ;
    public final nesCParser.interface_type_return interface_type() throws RecognitionException {
        nesCParser.interface_type_return retval = new nesCParser.interface_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REMOTE495=null;
        Token INTERFACE496=null;
        Token REQUIRES499=null;
        Token STRING_LITERAL500=null;
        nesCParser.identifier_return identifier497 =null;

        nesCParser.type_arguments_return type_arguments498 =null;


        Object REMOTE495_tree=null;
        Object INTERFACE496_tree=null;
        Object REQUIRES499_tree=null;
        Object STRING_LITERAL500_tree=null;
        RewriteRuleTokenStream stream_REMOTE=new RewriteRuleTokenStream(adaptor,"token REMOTE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_REQUIRES=new RewriteRuleTokenStream(adaptor,"token REQUIRES");
        RewriteRuleSubtreeStream stream_type_arguments=new RewriteRuleSubtreeStream(adaptor,"rule type_arguments");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1047:5: ( ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) )
            // nesC.g:1047:10: ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )?
            {
            // nesC.g:1047:10: ( REMOTE )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==REMOTE) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // nesC.g:1047:10: REMOTE
                    {
                    REMOTE495=(Token)match(input,REMOTE,FOLLOW_REMOTE_in_interface_type9021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REMOTE.add(REMOTE495);


                    }
                    break;

            }


            INTERFACE496=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_type9024); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE496);


            pushFollow(FOLLOW_identifier_in_interface_type9026);
            identifier497=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier497.getTree());

            // nesC.g:1047:39: ( type_arguments )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==LESS) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // nesC.g:1047:39: type_arguments
                    {
                    pushFollow(FOLLOW_type_arguments_in_interface_type9028);
                    type_arguments498=type_arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_arguments.add(type_arguments498.getTree());

                    }
                    break;

            }


            // nesC.g:1047:55: ( REQUIRES STRING_LITERAL )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==REQUIRES) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // nesC.g:1047:56: REQUIRES STRING_LITERAL
                    {
                    REQUIRES499=(Token)match(input,REQUIRES,FOLLOW_REQUIRES_in_interface_type9032); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRES.add(REQUIRES499);


                    STRING_LITERAL500=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_interface_type9034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL500);


                    }
                    break;

            }


            // AST REWRITE
            // elements: type_arguments, identifier, REMOTE, STRING_LITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1048:13: -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
            {
                // nesC.g:1048:16: ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_TYPE, "INTERFACE_TYPE")
                , root_1);

                // nesC.g:1048:33: ( REMOTE )?
                if ( stream_REMOTE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_REMOTE.nextNode()
                    );

                }
                stream_REMOTE.reset();

                // nesC.g:1048:41: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING_LITERAL.nextNode()
                    );

                }
                stream_STRING_LITERAL.reset();

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:1048:68: ( type_arguments )?
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
    // nesC.g:1050:1: type_arguments : '<' type_name ( ',' type_name )* '>' -> ( type_name )+ ;
    public final nesCParser.type_arguments_return type_arguments() throws RecognitionException {
        nesCParser.type_arguments_return retval = new nesCParser.type_arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal501=null;
        Token char_literal503=null;
        Token char_literal505=null;
        nesCParser.type_name_return type_name502 =null;

        nesCParser.type_name_return type_name504 =null;


        Object char_literal501_tree=null;
        Object char_literal503_tree=null;
        Object char_literal505_tree=null;
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // nesC.g:1051:5: ( '<' type_name ( ',' type_name )* '>' -> ( type_name )+ )
            // nesC.g:1051:10: '<' type_name ( ',' type_name )* '>'
            {
            char_literal501=(Token)match(input,LESS,FOLLOW_LESS_in_type_arguments9084); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESS.add(char_literal501);


            pushFollow(FOLLOW_type_name_in_type_arguments9086);
            type_name502=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_name.add(type_name502.getTree());

            // nesC.g:1051:24: ( ',' type_name )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==COMMA) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // nesC.g:1051:25: ',' type_name
            	    {
            	    char_literal503=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_arguments9089); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal503);


            	    pushFollow(FOLLOW_type_name_in_type_arguments9091);
            	    type_name504=type_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type_name.add(type_name504.getTree());

            	    }
            	    break;

            	default :
            	    break loop148;
                }
            } while (true);


            char_literal505=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_arguments9095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GREATER.add(char_literal505);


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
            // 1051:45: -> ( type_name )+
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
    // nesC.g:1053:1: instance_parameters : '[' parameter_list ']' ;
    public final nesCParser.instance_parameters_return instance_parameters() throws RecognitionException {
        nesCParser.instance_parameters_return retval = new nesCParser.instance_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal506=null;
        Token char_literal508=null;
        nesCParser.parameter_list_return parameter_list507 =null;


        Object char_literal506_tree=null;
        Object char_literal508_tree=null;

        try {
            // nesC.g:1054:5: ( '[' parameter_list ']' )
            // nesC.g:1054:10: '[' parameter_list ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal506=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_instance_parameters9119); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal506_tree = 
            (Object)adaptor.create(char_literal506)
            ;
            adaptor.addChild(root_0, char_literal506_tree);
            }

            pushFollow(FOLLOW_parameter_list_in_instance_parameters9121);
            parameter_list507=parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list507.getTree());

            char_literal508=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_instance_parameters9123); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal508_tree = 
            (Object)adaptor.create(char_literal508)
            ;
            adaptor.addChild(root_0, char_literal508_tree);
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
    // nesC.g:1056:1: attributes : ( attribute )+ ;
    public final nesCParser.attributes_return attributes() throws RecognitionException {
        nesCParser.attributes_return retval = new nesCParser.attributes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.attribute_return attribute509 =null;



        try {
            // nesC.g:1057:5: ( ( attribute )+ )
            // nesC.g:1057:10: ( attribute )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:1057:10: ( attribute )+
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
            	    // nesC.g:1057:10: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributes9142);
            	    attribute509=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute509.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "attributes"


    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // nesC.g:1059:1: attribute : '@' identifier '(' initializer_list ')' ;
    public final nesCParser.attribute_return attribute() throws RecognitionException {
        nesCParser.attribute_return retval = new nesCParser.attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal510=null;
        Token char_literal512=null;
        Token char_literal514=null;
        nesCParser.identifier_return identifier511 =null;

        nesCParser.initializer_list_return initializer_list513 =null;


        Object char_literal510_tree=null;
        Object char_literal512_tree=null;
        Object char_literal514_tree=null;

        try {
            // nesC.g:1060:5: ( '@' identifier '(' initializer_list ')' )
            // nesC.g:1060:10: '@' identifier '(' initializer_list ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal510=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute9162); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal510_tree = 
            (Object)adaptor.create(char_literal510)
            ;
            adaptor.addChild(root_0, char_literal510_tree);
            }

            pushFollow(FOLLOW_identifier_in_attribute9164);
            identifier511=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier511.getTree());

            char_literal512=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_attribute9166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal512_tree = 
            (Object)adaptor.create(char_literal512)
            ;
            adaptor.addChild(root_0, char_literal512_tree);
            }

            pushFollow(FOLLOW_initializer_list_in_attribute9168);
            initializer_list513=initializer_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer_list513.getTree());

            char_literal514=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_attribute9170); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal514_tree = 
            (Object)adaptor.create(char_literal514)
            ;
            adaptor.addChild(root_0, char_literal514_tree);
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
    // nesC.g:1065:1: gcc_attributes : GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' ;
    public final nesCParser.gcc_attributes_return gcc_attributes() throws RecognitionException {
        nesCParser.gcc_attributes_return retval = new nesCParser.gcc_attributes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GCCATTRIBUTE515=null;
        Token char_literal516=null;
        Token char_literal517=null;
        Token char_literal519=null;
        Token char_literal520=null;
        nesCParser.gcc_attribute_list_return gcc_attribute_list518 =null;


        Object GCCATTRIBUTE515_tree=null;
        Object char_literal516_tree=null;
        Object char_literal517_tree=null;
        Object char_literal519_tree=null;
        Object char_literal520_tree=null;

        try {
            // nesC.g:1066:5: ( GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' )
            // nesC.g:1066:10: GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')'
            {
            root_0 = (Object)adaptor.nil();


            GCCATTRIBUTE515=(Token)match(input,GCCATTRIBUTE,FOLLOW_GCCATTRIBUTE_in_gcc_attributes9188); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GCCATTRIBUTE515_tree = 
            (Object)adaptor.create(GCCATTRIBUTE515)
            ;
            adaptor.addChild(root_0, GCCATTRIBUTE515_tree);
            }

            char_literal516=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes9190); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal516_tree = 
            (Object)adaptor.create(char_literal516)
            ;
            adaptor.addChild(root_0, char_literal516_tree);
            }

            char_literal517=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes9192); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal517_tree = 
            (Object)adaptor.create(char_literal517)
            ;
            adaptor.addChild(root_0, char_literal517_tree);
            }

            pushFollow(FOLLOW_gcc_attribute_list_in_gcc_attributes9194);
            gcc_attribute_list518=gcc_attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute_list518.getTree());

            char_literal519=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes9196); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal519_tree = 
            (Object)adaptor.create(char_literal519)
            ;
            adaptor.addChild(root_0, char_literal519_tree);
            }

            char_literal520=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes9198); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal520_tree = 
            (Object)adaptor.create(char_literal520)
            ;
            adaptor.addChild(root_0, char_literal520_tree);
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
    // nesC.g:1068:1: gcc_attribute_list : ( gcc_attribute )? ( ',' gcc_attribute )* ;
    public final nesCParser.gcc_attribute_list_return gcc_attribute_list() throws RecognitionException {
        nesCParser.gcc_attribute_list_return retval = new nesCParser.gcc_attribute_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal522=null;
        nesCParser.gcc_attribute_return gcc_attribute521 =null;

        nesCParser.gcc_attribute_return gcc_attribute523 =null;


        Object char_literal522_tree=null;

        try {
            // nesC.g:1069:5: ( ( gcc_attribute )? ( ',' gcc_attribute )* )
            // nesC.g:1069:10: ( gcc_attribute )? ( ',' gcc_attribute )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:1069:10: ( gcc_attribute )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==AMP||LA150_0==BITCOMPLEMENT||LA150_0==BUILTIN_VA_ARG||LA150_0==CALL||LA150_0==CHARACTER_LITERAL||LA150_0==CONSTANT||LA150_0==LPARENS||LA150_0==MINUS||LA150_0==MINUSMINUS||LA150_0==NOT||LA150_0==PLUS||LA150_0==PLUSPLUS||LA150_0==POST||LA150_0==RAW_IDENTIFIER||LA150_0==SIGNAL||LA150_0==SIZEOF||LA150_0==STAR||LA150_0==STRING_LITERAL) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // nesC.g:1069:10: gcc_attribute
                    {
                    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list9213);
                    gcc_attribute521=gcc_attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute521.getTree());

                    }
                    break;

            }


            // nesC.g:1069:25: ( ',' gcc_attribute )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==COMMA) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // nesC.g:1069:26: ',' gcc_attribute
            	    {
            	    char_literal522=(Token)match(input,COMMA,FOLLOW_COMMA_in_gcc_attribute_list9217); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal522_tree = 
            	    (Object)adaptor.create(char_literal522)
            	    ;
            	    adaptor.addChild(root_0, char_literal522_tree);
            	    }

            	    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list9219);
            	    gcc_attribute523=gcc_attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute523.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "gcc_attribute_list"


    public static class gcc_attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gcc_attribute"
    // nesC.g:1071:1: gcc_attribute : assignment_expression ;
    public final nesCParser.gcc_attribute_return gcc_attribute() throws RecognitionException {
        nesCParser.gcc_attribute_return retval = new nesCParser.gcc_attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.assignment_expression_return assignment_expression524 =null;



        try {
            // nesC.g:1072:5: ( assignment_expression )
            // nesC.g:1072:10: assignment_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_gcc_attribute9236);
            assignment_expression524=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression524.getTree());

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
    // nesC.g:1075:1: identifier :{...}? RAW_IDENTIFIER ;
    public final nesCParser.identifier_return identifier() throws RecognitionException {
        nesCParser.identifier_return retval = new nesCParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER525=null;

        Object RAW_IDENTIFIER525_tree=null;

        try {
            // nesC.g:1076:5: ({...}? RAW_IDENTIFIER )
            // nesC.g:1076:10: {...}? RAW_IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            if ( !(( !symbols.isType(input.LT(1).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "identifier", " !symbols.isType(input.LT(1).getText()) ");
            }

            RAW_IDENTIFIER525=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier9254); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAW_IDENTIFIER525_tree = 
            (Object)adaptor.create(RAW_IDENTIFIER525)
            ;
            adaptor.addChild(root_0, RAW_IDENTIFIER525_tree);
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
        // nesC.g:364:10: ( '(' type_name ')' )
        // nesC.g:364:11: '(' type_name ')'
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred1_nesC3518); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred1_nesC3520);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred1_nesC3522); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_nesC

    // $ANTLR start synpred2_nesC
    public final void synpred2_nesC_fragment() throws RecognitionException {
        // nesC.g:414:33: ( ',' assignment_expression )
        // nesC.g:414:34: ',' assignment_expression
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred2_nesC4033); if (state.failed) return ;

        pushFollow(FOLLOW_assignment_expression_in_synpred2_nesC4035);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_nesC

    // $ANTLR start synpred3_nesC
    public final void synpred3_nesC_fragment() throws RecognitionException {
        // nesC.g:440:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )
        // nesC.g:440:11: declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred3_nesC4109);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:440:34: ( gcc_attributes )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( (LA152_0==GCCATTRIBUTE) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // nesC.g:440:34: gcc_attributes
                {
                pushFollow(FOLLOW_gcc_attributes_in_synpred3_nesC4111);
                gcc_attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // nesC.g:440:50: ( init_declarator_list )?
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==LPARENS||LA153_0==RAW_IDENTIFIER||LA153_0==STAR) ) {
            alt153=1;
        }
        switch (alt153) {
            case 1 :
                // nesC.g:440:50: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred3_nesC4114);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,200,FOLLOW_200_in_synpred3_nesC4117); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_nesC

    // $ANTLR start synpred4_nesC
    public final void synpred4_nesC_fragment() throws RecognitionException {
        // nesC.g:469:10: ( TYPEDEF declaration_specifiers ';' )
        // nesC.g:469:11: TYPEDEF declaration_specifiers ';'
        {
        match(input,TYPEDEF,FOLLOW_TYPEDEF_in_synpred4_nesC4305); if (state.failed) return ;

        pushFollow(FOLLOW_declaration_specifiers_in_synpred4_nesC4307);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        match(input,200,FOLLOW_200_in_synpred4_nesC4309); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_nesC

    // $ANTLR start synpred5_nesC
    public final void synpred5_nesC_fragment() throws RecognitionException {
        // nesC.g:670:9: ( '[' ( constant_expression )? ']' )
        // nesC.g:670:10: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred5_nesC5824); if (state.failed) return ;

        // nesC.g:670:14: ( constant_expression )?
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==AMP||LA154_0==BITCOMPLEMENT||LA154_0==BUILTIN_VA_ARG||LA154_0==CALL||LA154_0==CHARACTER_LITERAL||LA154_0==CONSTANT||LA154_0==LPARENS||LA154_0==MINUS||LA154_0==MINUSMINUS||LA154_0==NOT||LA154_0==PLUS||LA154_0==PLUSPLUS||LA154_0==POST||LA154_0==RAW_IDENTIFIER||LA154_0==SIGNAL||LA154_0==SIZEOF||LA154_0==STAR||LA154_0==STRING_LITERAL) ) {
            alt154=1;
        }
        switch (alt154) {
            case 1 :
                // nesC.g:670:14: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred5_nesC5826);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred5_nesC5829); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_nesC

    // $ANTLR start synpred6_nesC
    public final void synpred6_nesC_fragment() throws RecognitionException {
        // nesC.g:707:10: ( declarator ( attributes )? )
        // nesC.g:707:11: declarator ( attributes )?
        {
        pushFollow(FOLLOW_declarator_in_synpred6_nesC6135);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:707:22: ( attributes )?
        int alt155=2;
        int LA155_0 = input.LA(1);

        if ( (LA155_0==ATTRIBUTE) ) {
            alt155=1;
        }
        switch (alt155) {
            case 1 :
                // nesC.g:707:22: attributes
                {
                pushFollow(FOLLOW_attributes_in_synpred6_nesC6137);
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
        // nesC.g:717:10: ( ( pointer )? direct_abstract_declarator )
        // nesC.g:717:11: ( pointer )? direct_abstract_declarator
        {
        // nesC.g:717:11: ( pointer )?
        int alt156=2;
        int LA156_0 = input.LA(1);

        if ( (LA156_0==STAR) ) {
            alt156=1;
        }
        switch (alt156) {
            case 1 :
                // nesC.g:717:11: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred7_nesC6230);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred7_nesC6233);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_nesC

    // $ANTLR start synpred8_nesC
    public final void synpred8_nesC_fragment() throws RecognitionException {
        // nesC.g:721:10: ( '(' abstract_declarator ')' )
        // nesC.g:721:11: '(' abstract_declarator ')'
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred8_nesC6272); if (state.failed) return ;

        pushFollow(FOLLOW_abstract_declarator_in_synpred8_nesC6274);
        abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred8_nesC6276); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_nesC

    // $ANTLR start synpred9_nesC
    public final void synpred9_nesC_fragment() throws RecognitionException {
        // nesC.g:798:10: ( IF '(' expression ')' statement ELSE statement )
        // nesC.g:798:11: IF '(' expression ')' statement ELSE statement
        {
        match(input,IF,FOLLOW_IF_in_synpred9_nesC6813); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred9_nesC6815); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred9_nesC6817);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred9_nesC6819); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred9_nesC6821);
        statement();

        state._fsp--;
        if (state.failed) return ;

        match(input,ELSE,FOLLOW_ELSE_in_synpred9_nesC6823); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred9_nesC6825);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_nesC

    // $ANTLR start synpred10_nesC
    public final void synpred10_nesC_fragment() throws RecognitionException {
        // nesC.g:931:10: ( configuration_body )
        // nesC.g:931:11: configuration_body
        {
        pushFollow(FOLLOW_configuration_body_in_synpred10_nesC8030);
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


    protected DFA66 dfa66 = new DFA66(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA133 dfa133 = new DFA133(this);
    static final String DFA66_eotS =
        "\5\uffff";
    static final String DFA66_eofS =
        "\5\uffff";
    static final String DFA66_minS =
        "\1\u00b2\2\40\2\uffff";
    static final String DFA66_maxS =
        "\1\u00b2\2\u00c4\2\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA66_specialS =
        "\5\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1",
            "\1\4\17\uffff\1\2\44\uffff\1\4\23\uffff\1\4\4\uffff\1\4\61"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "\1\4\17\uffff\1\2\44\uffff\1\4\23\uffff\1\4\4\uffff\1\4\61"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "679:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
    static final String DFA90_eotS =
        "\111\uffff";
    static final String DFA90_eofS =
        "\111\uffff";
    static final String DFA90_minS =
        "\1\6\1\0\107\uffff";
    static final String DFA90_maxS =
        "\1\u00c8\1\0\107\uffff";
    static final String DFA90_acceptS =
        "\2\uffff\1\2\35\uffff\1\1\50\uffff";
    static final String DFA90_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\2\7\uffff\1\40\1\2\1\uffff\1\40\1\uffff\1\2\4\uffff\2\2\1"+
            "\40\2\2\1\uffff\1\40\1\2\1\uffff\1\40\16\uffff\1\40\2\2\6\uffff"+
            "\1\2\4\uffff\1\2\1\uffff\2\40\4\uffff\1\40\2\uffff\2\40\1\uffff"+
            "\1\40\1\2\6\uffff\1\2\6\uffff\1\2\3\uffff\6\40\3\uffff\1\2\4"+
            "\uffff\1\40\1\2\2\uffff\1\2\1\uffff\1\2\5\uffff\1\40\1\2\5\uffff"+
            "\22\40\3\uffff\1\2\1\uffff\1\2\1\uffff\1\2\6\uffff\1\1\1\2\1"+
            "\uffff\1\40\2\uffff\1\40\1\2\3\uffff\1\40\1\2\1\40\1\2\3\uffff"+
            "\1\2\1\uffff\1\40\1\2\1\40\1\2\6\40\2\uffff\2\40\1\uffff\2\40"+
            "\1\2\2\uffff\1\2",
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

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "()* loopback of 781:10: ( declaration )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_1 = input.LA(1);

                         
                        int index90_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!((( !symbols.isType(input.LT(1).getText()) )))) ) {s = 32;}

                        else if ( (( !symbols.isType(input.LT(1).getText()) )) ) {s = 2;}

                         
                        input.seek(index90_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA133_eotS =
        "\13\uffff";
    static final String DFA133_eofS =
        "\13\uffff";
    static final String DFA133_minS =
        "\1\151\1\12\2\u00a0\2\uffff\1\u00a2\2\12\1\u00a0\1\12";
    static final String DFA133_maxS =
        "\1\u00a0\1\u00c9\2\u00a0\2\uffff\1\u00a2\2\u00c9\1\u00a0\1\u00c9";
    static final String DFA133_acceptS =
        "\4\uffff\1\1\1\2\5\uffff";
    static final String DFA133_specialS =
        "\13\uffff}>";
    static final String[] DFA133_transitionS = {
            "\1\2\66\uffff\1\1",
            "\1\4\1\uffff\1\4\62\uffff\1\3\51\uffff\1\5\136\uffff\2\4",
            "\1\6",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\4\1\uffff\1\4\62\uffff\1\3\51\uffff\1\5\136\uffff\2\4",
            "\1\4\1\uffff\1\4\62\uffff\1\11\51\uffff\1\5\136\uffff\2\4",
            "\1\12",
            "\1\4\1\uffff\1\4\62\uffff\1\11\51\uffff\1\5\136\uffff\2\4"
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
            return "1009:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );";
        }
    }
 

    public static final BitSet FOLLOW_identifier_in_primary_expression2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_primary_expression2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_primary_expression2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_primary_expression2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_primary_expression2995 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_primary_expression2997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_primary_expression2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_kind_in_postfix_expression3024 = new BitSet(new long[]{0x0002000080000000L,0x0000400000000000L,0x0020000100000000L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression3027 = new BitSet(new long[]{0x8000000000000402L,0x0008420000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_postfix_expression_modifier_in_postfix_expression3029 = new BitSet(new long[]{0x8000000000000402L,0x0008420000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BUILTIN_VA_ARG_in_postfix_expression3067 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression3069 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_postfix_expression3071 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_postfix_expression3073 = new BitSet(new long[]{0x0001000044000000L,0x0000201F00001041L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_postfix_expression3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_postfix_expression_modifier3115 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_postfix_expression_modifier3117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_postfix_expression_modifier3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression_modifier3137 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024510102A00000L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression_modifier3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression_modifier3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression_modifier3161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_postfix_expression_modifier3181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_postfix_expression_modifier3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_postfix_expression_modifier3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3271 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list3274 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3277 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unary_expression3303 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_unary_expression3324 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_unary_expression3345 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression3372 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression3398 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression3425 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITCOMPLEMENT_in_unary_expression3452 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_NOT_in_unary_expression3457 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3472 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_unary_expression3474 = new BitSet(new long[]{0x0001000044000000L,0x0000201F00001041L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_unary_expression3476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_unary_expression3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_cast_expression3537 = new BitSet(new long[]{0x0001000044000000L,0x0000201F00001041L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_cast_expression3539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_cast_expression3541 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3583 = new BitSet(new long[]{0x2000000000000002L,0x0040000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression3588 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expression3593 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_MODULUS_in_multiplicative_expression3598 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3602 = new BitSet(new long[]{0x2000000000000002L,0x0040000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3623 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression3628 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression3633 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3637 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3658 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression3663 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression3668 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3672 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3693 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000600000L});
    public static final BitSet FOLLOW_LESS_in_relational_expression3698 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression3703 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_LESSEQUAL_in_relational_expression3708 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_relational_expression3713 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3717 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000600000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3738 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000100L});
    public static final BitSet FOLLOW_EQUAL_in_equality_expression3743 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equality_expression3748 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3752 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000100L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3773 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMP_in_and_expression3777 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3780 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3801 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_BITXOR_in_xor_expression3805 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3808 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3829 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BITOR_in_or_expression3833 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3836 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3857 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression3861 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3864 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3885 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression3889 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression3913 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_202_in_conditional_expression3916 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_conditional_expression3919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_conditional_expression3921 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression3954 = new BitSet(new long[]{0x1000000000A41002L,0x0095000000000000L,0x0000040000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_expression3958 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_MULASSIGN_in_assignment_expression3963 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_DIVASSIGN_in_assignment_expression3968 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_MODASSIGN_in_assignment_expression3973 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_PLUSASSIGN_in_assignment_expression3978 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_MINUSASSIGN_in_assignment_expression3983 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_LSHIFTASSIGN_in_assignment_expression3988 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_RSHIFTASSIGN_in_assignment_expression3993 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_BITANDASSIGN_in_assignment_expression3998 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_BITXORASSIGN_in_assignment_expression4003 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_BITORASSIGN_in_assignment_expression4008 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression4029 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_expression4040 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_expression4043 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4152 = new BitSet(new long[]{0x0000000000000000L,0x0000400000040000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4154 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration4157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_declaration4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration4314 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80001643L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_declaration4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration4364 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80001643L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4366 = new BitSet(new long[]{0x0000000000000000L,0x0000400000040000L,0x0004000100000000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4368 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration4371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_declaration4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_c_style_declaration_specifier_in_declaration_specifiers4443 = new BitSet(new long[]{0x0001000244024002L,0x0200201F80001643L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_storage_class_specifier_in_c_style_declaration_specifier4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_c_style_declaration_specifier4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_c_style_declaration_specifier4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_specifier_in_c_style_declaration_specifier4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4513 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list4516 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4518 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator4552 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_attributes_in_init_declarator4554 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator4558 = new BitSet(new long[]{0x000200008A080040L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_in_init_declarator4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_type_specifier4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT64_T_in_type_specifier4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT64_T_in_type_specifier4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT8_T_in_type_specifier4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT16_T_in_type_specifier4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT32_T_in_type_specifier4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT64_T_in_type_specifier4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT64_T_in_type_specifier4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT8_T_in_type_specifier4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT16_T_in_type_specifier4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT32_T_in_type_specifier4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT64_T_in_type_specifier4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT8_T_in_type_specifier5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT16_T_in_type_specifier5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT32_T_in_type_specifier5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT64_T_in_type_specifier5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUILTIN_VA_LIST_in_type_specifier5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier5100 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier5102 = new BitSet(new long[]{0x0001000044000000L,0x0000201F00801041L,0x3C4028430003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier5104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier5140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5142 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier5147 = new BitSet(new long[]{0x0001000044000000L,0x0000201F00801041L,0x3C4028430003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier5149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_struct_or_union_specifier5191 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_struct_or_union_specifier5193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5195 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier5197 = new BitSet(new long[]{0x0001000044000000L,0x0000201F00801041L,0x3C4028430003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier5199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_struct_declaration_list5289 = new BitSet(new long[]{0x0001000044000002L,0x0000201F00801041L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list5293 = new BitSet(new long[]{0x0001000044000002L,0x0000201F00801041L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration5325 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration5327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_struct_declaration5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list5372 = new BitSet(new long[]{0x0001000044000002L,0x0000201F00001041L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list5376 = new BitSet(new long[]{0x0001000044000002L,0x0000201F00001041L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5402 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list5405 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5407 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_struct_declarator5440 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_struct_declarator5455 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5476 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5480 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5519 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5526 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5578 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list5581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5584 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_identifier_in_enumerator5609 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator5612 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_function_specifier5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator5701 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator5729 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator5731 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5757 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier5760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier5797 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier5799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5834 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500502A00000L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier5836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5871 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80001643L,0x3D50284D0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier5875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5877 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier5881 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80001643L,0x3D5029490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier5885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5927 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000000L,0x0004004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_pointer_in_pointer5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5954 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list5985 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list6010 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list6013 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80001643L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list6015 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list6020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ELLIPSIS_in_parameter_list6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration6092 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_parameter_declarator_in_parameter_declaration6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_parameter_declarator6143 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_parameter_declarator6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declarator6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list6176 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_identifier_list6179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list6181 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name6207 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator6238 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6292 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator6294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6296 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6298 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6310 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator_modifier6326 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500502A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator_modifier6328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator_modifier6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator_modifier6342 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80001643L,0x3D5029490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_direct_abstract_declarator_modifier6344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator_modifier6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer6408 = new BitSet(new long[]{0x000200008A080040L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_list_in_initializer6410 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_initializer6412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_initializer_list6447 = new BitSet(new long[]{0x000200008A080040L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6451 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list6454 = new BitSet(new long[]{0x000200008A080040L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_initializer_list6459 = new BitSet(new long[]{0x000200008A080040L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6463 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_statement_in_statement6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOMIC_in_atomic_statement6599 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_atomic_statement6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_labeled_statement6628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_labeled_statement6630 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement6653 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement6655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_labeled_statement6657 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement6680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_labeled_statement6682 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement6710 = new BitSet(new long[]{0x42070002DF0AC040L,0x060A611F88103643L,0x3FF478CB02A3FFFFL,0x000000000000013BL});
    public static final BitSet FOLLOW_declaration_in_compound_statement6723 = new BitSet(new long[]{0x42070002DF0AC040L,0x060A611F88103643L,0x3FF478CB02A3FFFFL,0x000000000000013BL});
    public static final BitSet FOLLOW_statement_in_compound_statement6726 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508302A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement6775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_expression_statement6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6840 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6842 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_selection_statement6844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6846 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement6852 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6894 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6896 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_selection_statement6898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6900 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement6936 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6938 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_selection_statement6940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6942 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6990 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6992 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6996 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_iteration_statement7019 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_iteration_statement7021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement7023 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement7025 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement7029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_iteration_statement7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement7052 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement7054 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_iteration_statement7061 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_iteration_statement7068 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024510102A00000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement7075 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_iteration_statement7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_jump_statement7184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_jump_statement7186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement7207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement7224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement7241 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_jump_statement7243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_translation_unit7282 = new BitSet(new long[]{0x0001000244024002L,0x0200201F80801643L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit7286 = new BitSet(new long[]{0x0001000244024002L,0x0200201F80801643L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_in_external_declaration7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive7331 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive7335 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7337 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition7368 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_declarator_in_function_definition7370 = new BitSet(new long[]{0x0000000000010000L,0x0000010000000000L});
    public static final BitSet FOLLOW_attributes_in_function_definition7372 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7424 = new BitSet(new long[]{0x0000402000000000L,0x0020002000080000L});
    public static final BitSet FOLLOW_large_scale_construct_in_nesC_file7427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_definition_in_large_scale_construct7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_in_large_scale_construct7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_definition7503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_interface_definition7505 = new BitSet(new long[]{0x0000000000010000L,0x0000050000000000L});
    public static final BitSet FOLLOW_type_parameters_in_interface_definition7507 = new BitSet(new long[]{0x0000000000010000L,0x0000010000000000L});
    public static final BitSet FOLLOW_attributes_in_interface_definition7510 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interface_definition7521 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80801643L,0x3F50284B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_line_directive_in_interface_definition7534 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80801643L,0x3F50284B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_in_interface_definition7538 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80801643L,0x3F50284B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_RBRACE_in_interface_definition7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_parameters7598 = new BitSet(new long[]{0x0000000044000000L,0x0000201F00001041L,0x3C4028010003FFFFL,0x000000000000000BL});
    public static final BitSet FOLLOW_type_parameter_list_in_type_parameters7600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_GREATER_in_type_parameters7602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7621 = new BitSet(new long[]{0x0000000100010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7623 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_type_parameter_list7627 = new BitSet(new long[]{0x0000000044000000L,0x0000201F00001041L,0x3C4028010003FFFFL,0x000000000000000BL});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7629 = new BitSet(new long[]{0x0000000100010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7631 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_component_kind_in_component7653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component7655 = new BitSet(new long[]{0x0000000000010000L,0x0000410000000000L});
    public static final BitSet FOLLOW_component_parameters_in_component7657 = new BitSet(new long[]{0x0000000000010000L,0x0000010000000000L});
    public static final BitSet FOLLOW_attributes_in_component7660 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_component_specification_in_component7671 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_implementation_in_component7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_component_kind7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7810 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7840 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_implementation7871 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_implementation7873 = new BitSet(new long[]{0x0001004244024000L,0x0200221F80801663L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_body_in_implementation7875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_implementation7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_component_parameters7918 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80001643L,0x3F5029490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_parameter_list_in_component_parameters7920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_parameters7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7963 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_component_parameter_list7966 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80001643L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7968 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_component_parameter7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_component_parameter8005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component_parameter8007 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_component_parameter8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_body_in_body8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_body_in_body8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_element_list_in_configuration_body8075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_module_body8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_configuration_element_list8145 = new BitSet(new long[]{0x0000004000000002L,0x0000020000800020L,0x0000000100000000L});
    public static final BitSet FOLLOW_configuration_element_in_configuration_element_list8149 = new BitSet(new long[]{0x0000004000000002L,0x0000020000800020L,0x0000000100000000L});
    public static final BitSet FOLLOW_components_in_configuration_element8170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connection_in_configuration_element8181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTS_in_components8226 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_component_line_in_components8228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_components8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_declaration_in_component_line8257 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_component_line8260 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_component_declaration_in_component_line8262 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_component_ref_in_component_declaration8288 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AS_in_component_declaration8291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component_declaration8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_component_ref8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_component_ref8342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component_ref8344 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_component_ref8346 = new BitSet(new long[]{0x00030000CE080040L,0x040A601F00001041L,0x3C64794102A3FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_argument_list_in_component_ref8348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_ref8351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8398 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_component_argument_list8401 = new BitSet(new long[]{0x00030000CE080040L,0x040A601F00001041L,0x3C64784102A3FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8403 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_expression_in_component_argument8445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_component_argument8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8475 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_connection8478 = new BitSet(new long[]{0x0000000000001400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_wire_rhs_in_connection8480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_connection8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_wire_rhs8523 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_wire_rhs8538 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_wire_rhs8552 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENABLE_in_certificate_specification8570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8574 = new BitSet(new long[]{0x0000000000002800L,0x0000000000002000L});
    public static final BitSet FOLLOW_AS_in_certificate_specification8577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8581 = new BitSet(new long[]{0x0000000000002000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ASSUMING_in_certificate_specification8586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_FOR_in_certificate_specification8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8658 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_endpoint8660 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_argument_expression_list_in_endpoint8662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_endpoint8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8683 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8688 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifier_path8722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifier_path8728 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8735 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification8784 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80801643L,0x3F50284B8003FFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_line_directive_in_component_specification8799 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80801643L,0x3F50284B8003FFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_uses_provides_in_component_specification8803 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80801643L,0x3F50284B8003FFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_RBRACE_in_component_specification8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides8835 = new BitSet(new long[]{0x0001000244024000L,0x0200213F80001643L,0x3F5028590003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides8856 = new BitSet(new long[]{0x0001000244024000L,0x0200213F80001643L,0x3F5028590003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_uses_provides8877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list8919 = new BitSet(new long[]{0x0001000244024000L,0x0200203F80001643L,0x3F5028590003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8921 = new BitSet(new long[]{0x0001000244024000L,0x0200203F80001643L,0x3F50285B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list8924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_type_in_specification_element8959 = new BitSet(new long[]{0x0000000000010800L,0x0000020000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_AS_in_specification_element8962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_specification_element8964 = new BitSet(new long[]{0x0000000000010000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_instance_parameters_in_specification_element8968 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_attributes_in_specification_element8971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_specification_element8974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOTE_in_interface_type9021 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_type9024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_interface_type9026 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_type_arguments_in_interface_type9028 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_REQUIRES_in_interface_type9032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_interface_type9034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_arguments9084 = new BitSet(new long[]{0x0001000044000000L,0x0000201F00001041L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_type_arguments9086 = new BitSet(new long[]{0x0000000100000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_type_arguments9089 = new BitSet(new long[]{0x0001000044000000L,0x0000201F00001041L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_type_arguments9091 = new BitSet(new long[]{0x0000000100000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_GREATER_in_type_arguments9095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_instance_parameters9119 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80001643L,0x3D50284D0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_instance_parameters9121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_instance_parameters9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributes9142 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute9162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_attribute9164 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_attribute9166 = new BitSet(new long[]{0x000200008A080040L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_list_in_attribute9168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_attribute9170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GCCATTRIBUTE_in_gcc_attributes9188 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes9190 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes9192 = new BitSet(new long[]{0x000200018A080040L,0x040A400000000000L,0x0024510102A00000L});
    public static final BitSet FOLLOW_gcc_attribute_list_in_gcc_attributes9194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes9196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes9198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list9213 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_gcc_attribute_list9217 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list9219 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_assignment_expression_in_gcc_attribute9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier9254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred1_nesC3518 = new BitSet(new long[]{0x0001000044000000L,0x0000201F00001041L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_synpred1_nesC3520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred1_nesC3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred2_nesC4033 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred2_nesC4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred3_nesC4109 = new BitSet(new long[]{0x0000000000000000L,0x0000400000040000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_gcc_attributes_in_synpred3_nesC4111 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred3_nesC4114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_synpred3_nesC4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_synpred4_nesC4305 = new BitSet(new long[]{0x0001000244024000L,0x0200201F80001643L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred4_nesC4307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_synpred4_nesC4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred5_nesC5824 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500502A00000L});
    public static final BitSet FOLLOW_constant_expression_in_synpred5_nesC5826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred5_nesC5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred6_nesC6135 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_synpred6_nesC6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred7_nesC6230 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred7_nesC6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred8_nesC6272 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_synpred8_nesC6274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred8_nesC6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred9_nesC6813 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred9_nesC6815 = new BitSet(new long[]{0x000200008A080040L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_synpred9_nesC6817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred9_nesC6819 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_synpred9_nesC6821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ELSE_in_synpred9_nesC6823 = new BitSet(new long[]{0x420600009B088040L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_synpred9_nesC6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_body_in_synpred10_nesC8030 = new BitSet(new long[]{0x0000000000000002L});

}