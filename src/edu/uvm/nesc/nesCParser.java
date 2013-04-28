// $ANTLR 3.4 nesC.g 2013-04-28 13:43:35

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ACTIVATE", "ADDRESS_OF", "AMP", "AND", "ARGUMENT_LIST", "ARRAY_ELEMENT_SELECTION", "ARROW", "AS", "ASSIGN", "ASSUMING", "ASYNC", "ATOMIC", "ATTRIBUTE", "AUTO", "BITANDASSIGN", "BITCOMPLEMENT", "BITOR", "BITORASSIGN", "BITXOR", "BITXORASSIGN", "BREAK", "BUILTIN_VA_ARG", "BUILTIN_VA_LIST", "CALL", "CASE", "CAST", "CHAR", "CHARACTER_LITERAL", "COMMA", "COMMAND", "COMMENT1", "COMMENT2", "COMMENT3", "COMPONENT", "COMPONENTS", "COMPONENT_ARGUMENTS", "COMPONENT_DECLARATION", "COMPONENT_DEFINITION", "COMPONENT_INSTANTIATION", "COMPONENT_KIND", "COMPONENT_PARAMETER_LIST", "COMPOUND_STATEMENT", "CONFIGURATION", "CONNECTION", "CONST", "CONSTANT", "CONTINUE", "DECLARATION", "DECLARATOR", "DECLARATOR_ARRAY_MODIFIER", "DECLARATOR_LIST", "DECLARATOR_PARAMETER_LIST_MODIFIER", "DEC_NUMBER", "DEFAULT", "DEREFERENCE", "DIGIT", "DIVASSIGN", "DIVIDE", "DO", "DOT", "DOUBLE", "DUTY", "DYNAMIC_IDENTIFIER_PATH", "ELLIPSIS", "ELSE", "ENUM", "ENUMERATOR", "EQUAL", "EVENT", "EXTERN", "FILE", "FLOAT", "FOR", "FOR_CONDITION", "FOR_INITIALIZE", "FOR_ITERATION", "FUNCTION_DEFINITION", "GCCATTRIBUTE", "GENERIC", "GOTO", "GREATER", "GREATEREQUAL", "HASH", "HEX_DIGIT", "HEX_NUMBER", "IDENTIFIER_PATH", "IF", "IMPLEMENTATION", "INITIALIZER_LIST", "INIT_DECLARATOR", "INLINE", "INT", "INT16_T", "INT32_T", "INT64_T", "INT8_T", "INTERFACE", "INTERFACE_TYPE", "LABELED_STATEMENT", "LBRACE", "LBRACKET", "LESS", "LESSEQUAL", "LINE_DIRECTIVE", "LONG", "LPARENS", "LSHIFT", "LSHIFTASSIGN", "MINUS", "MINUSASSIGN", "MINUSMINUS", "MODASSIGN", "MODULE", "MODULUS", "MULASSIGN", "NEW", "NORACE", "NOT", "NOTEQUAL", "NULL", "NUMBER", "NUMBER_PREFIX", "NUMBER_SUFFIX", "NXLE_INT16_T", "NXLE_INT32_T", "NXLE_INT64_T", "NXLE_INT8_T", "NXLE_UINT16_T", "NXLE_UINT32_T", "NXLE_UINT64_T", "NXLE_UINT8_T", "NX_INT16_T", "NX_INT32_T", "NX_INT64_T", "NX_INT8_T", "NX_STRUCT", "NX_UINT16_T", "NX_UINT32_T", "NX_UINT64_T", "NX_UINT8_T", "NX_UNION", "OR", "PARAMETER", "PARAMETER_LIST", "PLUS", "PLUSASSIGN", "PLUSPLUS", "POINTER_QUALIFIER", "POST", "POSTFIX_EXPRESSION", "POST_DECREMENT", "POST_INCREMENT", "PRE_DECREMENT", "PRE_INCREMENT", "PROVIDES", "RAW_IDENTIFIER", "RBRACE", "RBRACKET", "REGISTER", "REMOTE", "REQUIRES", "RESTRICT", "RETURN", "RPARENS", "RSHIFT", "RSHIFTASSIGN", "SHORT", "SIGNAL", "SIGNED", "SIZEOF", "SIZEOF_EXPRESSION", "SIZEOF_TYPE", "SPECIFICATION", "STAR", "STATEMENT", "STATIC", "STRING_LITERAL", "STRUCT", "SWITCH", "TASK", "TYPEDEF", "UINT16_T", "UINT32_T", "UINT64_T", "UINT8_T", "UNARY_MINUS", "UNARY_PLUS", "UNION", "UNSIGNED", "USES", "VOID", "VOLATILE", "WHILE", "WHITESPACE", "':'", "';'", "'<-'", "'?'"
    };

    public static final int EOF=-1;
    public static final int T__199=199;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int T__202=202;
    public static final int ABSTRACT=4;
    public static final int ACTIVATE=5;
    public static final int ADDRESS_OF=6;
    public static final int AMP=7;
    public static final int AND=8;
    public static final int ARGUMENT_LIST=9;
    public static final int ARRAY_ELEMENT_SELECTION=10;
    public static final int ARROW=11;
    public static final int AS=12;
    public static final int ASSIGN=13;
    public static final int ASSUMING=14;
    public static final int ASYNC=15;
    public static final int ATOMIC=16;
    public static final int ATTRIBUTE=17;
    public static final int AUTO=18;
    public static final int BITANDASSIGN=19;
    public static final int BITCOMPLEMENT=20;
    public static final int BITOR=21;
    public static final int BITORASSIGN=22;
    public static final int BITXOR=23;
    public static final int BITXORASSIGN=24;
    public static final int BREAK=25;
    public static final int BUILTIN_VA_ARG=26;
    public static final int BUILTIN_VA_LIST=27;
    public static final int CALL=28;
    public static final int CASE=29;
    public static final int CAST=30;
    public static final int CHAR=31;
    public static final int CHARACTER_LITERAL=32;
    public static final int COMMA=33;
    public static final int COMMAND=34;
    public static final int COMMENT1=35;
    public static final int COMMENT2=36;
    public static final int COMMENT3=37;
    public static final int COMPONENT=38;
    public static final int COMPONENTS=39;
    public static final int COMPONENT_ARGUMENTS=40;
    public static final int COMPONENT_DECLARATION=41;
    public static final int COMPONENT_DEFINITION=42;
    public static final int COMPONENT_INSTANTIATION=43;
    public static final int COMPONENT_KIND=44;
    public static final int COMPONENT_PARAMETER_LIST=45;
    public static final int COMPOUND_STATEMENT=46;
    public static final int CONFIGURATION=47;
    public static final int CONNECTION=48;
    public static final int CONST=49;
    public static final int CONSTANT=50;
    public static final int CONTINUE=51;
    public static final int DECLARATION=52;
    public static final int DECLARATOR=53;
    public static final int DECLARATOR_ARRAY_MODIFIER=54;
    public static final int DECLARATOR_LIST=55;
    public static final int DECLARATOR_PARAMETER_LIST_MODIFIER=56;
    public static final int DEC_NUMBER=57;
    public static final int DEFAULT=58;
    public static final int DEREFERENCE=59;
    public static final int DIGIT=60;
    public static final int DIVASSIGN=61;
    public static final int DIVIDE=62;
    public static final int DO=63;
    public static final int DOT=64;
    public static final int DOUBLE=65;
    public static final int DUTY=66;
    public static final int DYNAMIC_IDENTIFIER_PATH=67;
    public static final int ELLIPSIS=68;
    public static final int ELSE=69;
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


                    pushFollow(FOLLOW_identifier_in_primary_expression2949);
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


                    CONSTANT2=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_primary_expression2960); if (state.failed) return retval;
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


                    STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primary_expression2971); if (state.failed) return retval;
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


                    CHARACTER_LITERAL4=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_primary_expression2982); if (state.failed) return retval;
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
                    char_literal5=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_primary_expression2993); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_primary_expression2995);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

                    char_literal7=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_primary_expression2997); if (state.failed) return retval; 
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
                            pushFollow(FOLLOW_call_kind_in_postfix_expression3022);
                            call_kind8=call_kind();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_call_kind.add(call_kind8.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_primary_expression_in_postfix_expression3025);
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
                    	    pushFollow(FOLLOW_postfix_expression_modifier_in_postfix_expression3027);
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
                    BUILTIN_VA_ARG11=(Token)match(input,BUILTIN_VA_ARG,FOLLOW_BUILTIN_VA_ARG_in_postfix_expression3065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BUILTIN_VA_ARG.add(BUILTIN_VA_ARG11);


                    char_literal12=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression3067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal12);


                    pushFollow(FOLLOW_expression_in_postfix_expression3069);
                    expression13=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression13.getTree());

                    char_literal14=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix_expression3071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(char_literal14);


                    pushFollow(FOLLOW_type_name_in_postfix_expression3073);
                    type_name15=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name15.getTree());

                    char_literal16=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression3075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal16);


                    // AST REWRITE
                    // elements: expression, BUILTIN_VA_ARG, type_name
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
                    char_literal17=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_postfix_expression_modifier3113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal17);


                    pushFollow(FOLLOW_expression_in_postfix_expression_modifier3115);
                    expression18=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression18.getTree());

                    char_literal19=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_postfix_expression_modifier3117); if (state.failed) return retval; 
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
                    char_literal20=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression_modifier3135); if (state.failed) return retval; 
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
                            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression_modifier3137);
                            argument_expression_list21=argument_expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list21.getTree());

                            }
                            break;

                    }


                    char_literal22=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression_modifier3140); if (state.failed) return retval; 
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
                    char_literal23=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression_modifier3159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal23);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier3161);
                    identifier24=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier24.getTree());

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
                    string_literal25=(Token)match(input,ARROW,FOLLOW_ARROW_in_postfix_expression_modifier3179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal25);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier3181);
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


                    string_literal27=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfix_expression_modifier3199); if (state.failed) return retval;
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


                    string_literal28=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfix_expression_modifier3209); if (state.failed) return retval;
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


            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3269);
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
            	    char_literal31=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list3272); if (state.failed) return retval;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3275);
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
    // nesC.g:342:1: unary_expression : ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | ( SIZEOF '(' type_name ')' )=> SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression );
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
        Token SIZEOF52=null;
        nesCParser.unary_expression_return unary_expression34 =null;

        nesCParser.unary_expression_return unary_expression36 =null;

        nesCParser.cast_expression_return cast_expression38 =null;

        nesCParser.cast_expression_return cast_expression40 =null;

        nesCParser.cast_expression_return cast_expression42 =null;

        nesCParser.cast_expression_return cast_expression44 =null;

        nesCParser.cast_expression_return cast_expression47 =null;

        nesCParser.type_name_return type_name50 =null;

        nesCParser.unary_expression_return unary_expression53 =null;

        nesCParser.postfix_expression_return postfix_expression54 =null;


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
        Object SIZEOF52_tree=null;
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
            // nesC.g:343:5: ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | ( SIZEOF '(' type_name ')' )=> SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression )
            int alt9=10;
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
                int LA9_9 = input.LA(2);

                if ( (synpred1_nesC()) ) {
                    alt9=8;
                }
                else if ( (true) ) {
                    alt9=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 9, input);

                    throw nvae;

                }
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
                alt9=10;
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
                    // nesC.g:343:10: '++' unary_expression
                    {
                    string_literal33=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unary_expression3296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(string_literal33);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3298);
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
                    // 343:32: -> ^( PRE_INCREMENT unary_expression )
                    {
                        // nesC.g:343:35: ^( PRE_INCREMENT unary_expression )
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
                    // nesC.g:344:10: '--' unary_expression
                    {
                    string_literal35=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unary_expression3317); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUSMINUS.add(string_literal35);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3319);
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
                    // 344:32: -> ^( PRE_DECREMENT unary_expression )
                    {
                        // nesC.g:344:35: ^( PRE_DECREMENT unary_expression )
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
                    // nesC.g:345:10: '&' cast_expression
                    {
                    char_literal37=(Token)match(input,AMP,FOLLOW_AMP_in_unary_expression3338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMP.add(char_literal37);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3341);
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
                    // 345:32: -> ^( ADDRESS_OF cast_expression )
                    {
                        // nesC.g:345:35: ^( ADDRESS_OF cast_expression )
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
                    // nesC.g:346:10: '*' cast_expression
                    {
                    char_literal39=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression3365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal39);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3368);
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
                    // 346:32: -> ^( DEREFERENCE cast_expression )
                    {
                        // nesC.g:346:35: ^( DEREFERENCE cast_expression )
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
                    // nesC.g:347:10: '+' cast_expression
                    {
                    char_literal41=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression3391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal41);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3394);
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
                    // 347:32: -> ^( UNARY_PLUS cast_expression )
                    {
                        // nesC.g:347:35: ^( UNARY_PLUS cast_expression )
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
                    // nesC.g:348:10: '-' cast_expression
                    {
                    char_literal43=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression3418); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal43);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3421);
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
                    // 348:32: -> ^( UNARY_MINUS cast_expression )
                    {
                        // nesC.g:348:35: ^( UNARY_MINUS cast_expression )
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
                    // nesC.g:349:10: ( '~' ^| '!' ^) cast_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:349:10: ( '~' ^| '!' ^)
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
                            // nesC.g:349:11: '~' ^
                            {
                            char_literal45=(Token)match(input,BITCOMPLEMENT,FOLLOW_BITCOMPLEMENT_in_unary_expression3445); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal45_tree = 
                            (Object)adaptor.create(char_literal45)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal45_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:349:18: '!' ^
                            {
                            char_literal46=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression3450); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal46_tree = 
                            (Object)adaptor.create(char_literal46)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal46_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3454);
                    cast_expression47=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression47.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:350:10: ( SIZEOF '(' type_name ')' )=> SIZEOF '(' type_name ')'
                    {
                    SIZEOF48=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF48);


                    char_literal49=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_unary_expression3479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal49);


                    pushFollow(FOLLOW_type_name_in_unary_expression3481);
                    type_name50=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name50.getTree());

                    char_literal51=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_unary_expression3483); if (state.failed) return retval; 
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
                    // 350:65: -> ^( SIZEOF_TYPE type_name )
                    {
                        // nesC.g:350:68: ^( SIZEOF_TYPE type_name )
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
                    // nesC.g:351:10: SIZEOF unary_expression
                    {
                    SIZEOF52=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF52);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3504);
                    unary_expression53=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression53.getTree());

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
                    // 351:34: -> ^( SIZEOF_EXPRESSION unary_expression )
                    {
                        // nesC.g:351:37: ^( SIZEOF_EXPRESSION unary_expression )
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
                    // nesC.g:352:10: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression3523);
                    postfix_expression54=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression54.getTree());

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
    // nesC.g:358:1: cast_expression : ( ( '(' type_name ')' )=> '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression );
    public final nesCParser.cast_expression_return cast_expression() throws RecognitionException {
        nesCParser.cast_expression_return retval = new nesCParser.cast_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal55=null;
        Token char_literal57=null;
        nesCParser.type_name_return type_name56 =null;

        nesCParser.cast_expression_return cast_expression58 =null;

        nesCParser.unary_expression_return unary_expression59 =null;


        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // nesC.g:359:5: ( ( '(' type_name ')' )=> '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LPARENS) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred2_nesC()) ) {
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
                    // nesC.g:359:10: ( '(' type_name ')' )=> '(' type_name ')' cast_expression
                    {
                    char_literal55=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_cast_expression3562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal55);


                    pushFollow(FOLLOW_type_name_in_cast_expression3564);
                    type_name56=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name56.getTree());

                    char_literal57=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_cast_expression3566); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal57);


                    pushFollow(FOLLOW_cast_expression_in_cast_expression3568);
                    cast_expression58=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression58.getTree());

                    // AST REWRITE
                    // elements: type_name, cast_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 360:45: -> ^( CAST cast_expression type_name )
                    {
                        // nesC.g:360:48: ^( CAST cast_expression type_name )
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
                    // nesC.g:361:10: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression3589);
                    unary_expression59=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression59.getTree());

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
    // nesC.g:363:1: multiplicative_expression : cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* ;
    public final nesCParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        nesCParser.multiplicative_expression_return retval = new nesCParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal61=null;
        Token char_literal62=null;
        Token char_literal63=null;
        nesCParser.cast_expression_return cast_expression60 =null;

        nesCParser.cast_expression_return cast_expression64 =null;


        Object char_literal61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal63_tree=null;

        try {
            // nesC.g:364:5: ( cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* )
            // nesC.g:364:10: cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3608);
            cast_expression60=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression60.getTree());

            // nesC.g:364:26: ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==DIVIDE||LA12_0==MODULUS||LA12_0==STAR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // nesC.g:364:28: ( '*' ^| '/' ^| '%' ^) cast_expression
            	    {
            	    // nesC.g:364:28: ( '*' ^| '/' ^| '%' ^)
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
            	            // nesC.g:364:29: '*' ^
            	            {
            	            char_literal61=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression3613); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal61_tree = 
            	            (Object)adaptor.create(char_literal61)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal61_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:364:36: '/' ^
            	            {
            	            char_literal62=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expression3618); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal62_tree = 
            	            (Object)adaptor.create(char_literal62)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal62_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:364:43: '%' ^
            	            {
            	            char_literal63=(Token)match(input,MODULUS,FOLLOW_MODULUS_in_multiplicative_expression3623); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal63_tree = 
            	            (Object)adaptor.create(char_literal63)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal63_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3627);
            	    cast_expression64=cast_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression64.getTree());

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
    // nesC.g:366:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
    public final nesCParser.additive_expression_return additive_expression() throws RecognitionException {
        nesCParser.additive_expression_return retval = new nesCParser.additive_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal66=null;
        Token char_literal67=null;
        nesCParser.multiplicative_expression_return multiplicative_expression65 =null;

        nesCParser.multiplicative_expression_return multiplicative_expression68 =null;


        Object char_literal66_tree=null;
        Object char_literal67_tree=null;

        try {
            // nesC.g:367:5: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
            // nesC.g:367:10: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3648);
            multiplicative_expression65=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression65.getTree());

            // nesC.g:367:36: ( ( '+' ^| '-' ^) multiplicative_expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // nesC.g:367:38: ( '+' ^| '-' ^) multiplicative_expression
            	    {
            	    // nesC.g:367:38: ( '+' ^| '-' ^)
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
            	            // nesC.g:367:39: '+' ^
            	            {
            	            char_literal66=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression3653); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal66_tree = 
            	            (Object)adaptor.create(char_literal66)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal66_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:367:46: '-' ^
            	            {
            	            char_literal67=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression3658); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal67_tree = 
            	            (Object)adaptor.create(char_literal67)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal67_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3662);
            	    multiplicative_expression68=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression68.getTree());

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
    // nesC.g:369:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
    public final nesCParser.shift_expression_return shift_expression() throws RecognitionException {
        nesCParser.shift_expression_return retval = new nesCParser.shift_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal70=null;
        Token string_literal71=null;
        nesCParser.additive_expression_return additive_expression69 =null;

        nesCParser.additive_expression_return additive_expression72 =null;


        Object string_literal70_tree=null;
        Object string_literal71_tree=null;

        try {
            // nesC.g:370:5: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // nesC.g:370:10: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression3683);
            additive_expression69=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression69.getTree());

            // nesC.g:370:30: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LSHIFT||LA16_0==RSHIFT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // nesC.g:370:32: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // nesC.g:370:32: ( '<<' ^| '>>' ^)
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
            	            // nesC.g:370:33: '<<' ^
            	            {
            	            string_literal70=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression3688); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal70_tree = 
            	            (Object)adaptor.create(string_literal70)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal70_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:370:41: '>>' ^
            	            {
            	            string_literal71=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression3693); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal71_tree = 
            	            (Object)adaptor.create(string_literal71)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal71_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression3697);
            	    additive_expression72=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression72.getTree());

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
    // nesC.g:372:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
    public final nesCParser.relational_expression_return relational_expression() throws RecognitionException {
        nesCParser.relational_expression_return retval = new nesCParser.relational_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal74=null;
        Token char_literal75=null;
        Token string_literal76=null;
        Token string_literal77=null;
        nesCParser.shift_expression_return shift_expression73 =null;

        nesCParser.shift_expression_return shift_expression78 =null;


        Object char_literal74_tree=null;
        Object char_literal75_tree=null;
        Object string_literal76_tree=null;
        Object string_literal77_tree=null;

        try {
            // nesC.g:373:5: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // nesC.g:373:10: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression3718);
            shift_expression73=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression73.getTree());

            // nesC.g:373:27: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= GREATER && LA18_0 <= GREATEREQUAL)||(LA18_0 >= LESS && LA18_0 <= LESSEQUAL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // nesC.g:373:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // nesC.g:373:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
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
            	            // nesC.g:373:30: '<' ^
            	            {
            	            char_literal74=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression3723); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal74_tree = 
            	            (Object)adaptor.create(char_literal74)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:373:37: '>' ^
            	            {
            	            char_literal75=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression3728); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal75_tree = 
            	            (Object)adaptor.create(char_literal75)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal75_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:373:44: '<=' ^
            	            {
            	            string_literal76=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relational_expression3733); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal76_tree = 
            	            (Object)adaptor.create(string_literal76)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal76_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // nesC.g:373:52: '>=' ^
            	            {
            	            string_literal77=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relational_expression3738); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal77_tree = 
            	            (Object)adaptor.create(string_literal77)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal77_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression3742);
            	    shift_expression78=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression78.getTree());

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
    // nesC.g:375:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
    public final nesCParser.equality_expression_return equality_expression() throws RecognitionException {
        nesCParser.equality_expression_return retval = new nesCParser.equality_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal80=null;
        Token string_literal81=null;
        nesCParser.relational_expression_return relational_expression79 =null;

        nesCParser.relational_expression_return relational_expression82 =null;


        Object string_literal80_tree=null;
        Object string_literal81_tree=null;

        try {
            // nesC.g:376:5: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // nesC.g:376:10: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression3763);
            relational_expression79=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression79.getTree());

            // nesC.g:376:32: ( ( '==' ^| '!=' ^) relational_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EQUAL||LA20_0==NOTEQUAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // nesC.g:376:34: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // nesC.g:376:34: ( '==' ^| '!=' ^)
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
            	            // nesC.g:376:35: '==' ^
            	            {
            	            string_literal80=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equality_expression3768); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal80_tree = 
            	            (Object)adaptor.create(string_literal80)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal80_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:376:43: '!=' ^
            	            {
            	            string_literal81=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equality_expression3773); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal81_tree = 
            	            (Object)adaptor.create(string_literal81)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal81_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression3777);
            	    relational_expression82=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression82.getTree());

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
    // nesC.g:378:1: and_expression : equality_expression ( '&' ^ equality_expression )* ;
    public final nesCParser.and_expression_return and_expression() throws RecognitionException {
        nesCParser.and_expression_return retval = new nesCParser.and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal84=null;
        nesCParser.equality_expression_return equality_expression83 =null;

        nesCParser.equality_expression_return equality_expression85 =null;


        Object char_literal84_tree=null;

        try {
            // nesC.g:379:5: ( equality_expression ( '&' ^ equality_expression )* )
            // nesC.g:379:10: equality_expression ( '&' ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_and_expression3798);
            equality_expression83=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression83.getTree());

            // nesC.g:379:30: ( '&' ^ equality_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AMP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // nesC.g:379:32: '&' ^ equality_expression
            	    {
            	    char_literal84=(Token)match(input,AMP,FOLLOW_AMP_in_and_expression3802); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal84_tree = 
            	    (Object)adaptor.create(char_literal84)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal84_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_and_expression3805);
            	    equality_expression85=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression85.getTree());

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
    // nesC.g:381:1: xor_expression : and_expression ( '^' ^ and_expression )* ;
    public final nesCParser.xor_expression_return xor_expression() throws RecognitionException {
        nesCParser.xor_expression_return retval = new nesCParser.xor_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal87=null;
        nesCParser.and_expression_return and_expression86 =null;

        nesCParser.and_expression_return and_expression88 =null;


        Object char_literal87_tree=null;

        try {
            // nesC.g:382:5: ( and_expression ( '^' ^ and_expression )* )
            // nesC.g:382:10: and_expression ( '^' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_xor_expression3826);
            and_expression86=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression86.getTree());

            // nesC.g:382:25: ( '^' ^ and_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BITXOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // nesC.g:382:27: '^' ^ and_expression
            	    {
            	    char_literal87=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_xor_expression3830); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal87_tree = 
            	    (Object)adaptor.create(char_literal87)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal87_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_xor_expression3833);
            	    and_expression88=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression88.getTree());

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
    // nesC.g:384:1: or_expression : xor_expression ( '|' ^ xor_expression )* ;
    public final nesCParser.or_expression_return or_expression() throws RecognitionException {
        nesCParser.or_expression_return retval = new nesCParser.or_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal90=null;
        nesCParser.xor_expression_return xor_expression89 =null;

        nesCParser.xor_expression_return xor_expression91 =null;


        Object char_literal90_tree=null;

        try {
            // nesC.g:385:5: ( xor_expression ( '|' ^ xor_expression )* )
            // nesC.g:385:10: xor_expression ( '|' ^ xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expression_in_or_expression3854);
            xor_expression89=xor_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression89.getTree());

            // nesC.g:385:25: ( '|' ^ xor_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==BITOR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // nesC.g:385:27: '|' ^ xor_expression
            	    {
            	    char_literal90=(Token)match(input,BITOR,FOLLOW_BITOR_in_or_expression3858); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal90_tree = 
            	    (Object)adaptor.create(char_literal90)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal90_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_xor_expression_in_or_expression3861);
            	    xor_expression91=xor_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression91.getTree());

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
    // nesC.g:387:1: logical_and_expression : or_expression ( '&&' ^ or_expression )* ;
    public final nesCParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        nesCParser.logical_and_expression_return retval = new nesCParser.logical_and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal93=null;
        nesCParser.or_expression_return or_expression92 =null;

        nesCParser.or_expression_return or_expression94 =null;


        Object string_literal93_tree=null;

        try {
            // nesC.g:388:5: ( or_expression ( '&&' ^ or_expression )* )
            // nesC.g:388:10: or_expression ( '&&' ^ or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_expression_in_logical_and_expression3882);
            or_expression92=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression92.getTree());

            // nesC.g:388:24: ( '&&' ^ or_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // nesC.g:388:26: '&&' ^ or_expression
            	    {
            	    string_literal93=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression3886); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal93_tree = 
            	    (Object)adaptor.create(string_literal93)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal93_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression3889);
            	    or_expression94=or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression94.getTree());

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
    // nesC.g:390:1: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
    public final nesCParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        nesCParser.logical_or_expression_return retval = new nesCParser.logical_or_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal96=null;
        nesCParser.logical_and_expression_return logical_and_expression95 =null;

        nesCParser.logical_and_expression_return logical_and_expression97 =null;


        Object string_literal96_tree=null;

        try {
            // nesC.g:391:5: ( logical_and_expression ( '||' ^ logical_and_expression )* )
            // nesC.g:391:10: logical_and_expression ( '||' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3910);
            logical_and_expression95=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression95.getTree());

            // nesC.g:391:33: ( '||' ^ logical_and_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // nesC.g:391:35: '||' ^ logical_and_expression
            	    {
            	    string_literal96=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression3914); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal96_tree = 
            	    (Object)adaptor.create(string_literal96)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal96_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3917);
            	    logical_and_expression97=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression97.getTree());

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
    // nesC.g:393:1: conditional_expression : logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? ;
    public final nesCParser.conditional_expression_return conditional_expression() throws RecognitionException {
        nesCParser.conditional_expression_return retval = new nesCParser.conditional_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal99=null;
        Token char_literal101=null;
        nesCParser.logical_or_expression_return logical_or_expression98 =null;

        nesCParser.expression_return expression100 =null;

        nesCParser.conditional_expression_return conditional_expression102 =null;


        Object char_literal99_tree=null;
        Object char_literal101_tree=null;

        try {
            // nesC.g:394:5: ( logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? )
            // nesC.g:394:10: logical_or_expression ( '?' ^ expression ':' ! conditional_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression3938);
            logical_or_expression98=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression98.getTree());

            // nesC.g:394:32: ( '?' ^ expression ':' ! conditional_expression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==202) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // nesC.g:394:33: '?' ^ expression ':' ! conditional_expression
                    {
                    char_literal99=(Token)match(input,202,FOLLOW_202_in_conditional_expression3941); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal99_tree = 
                    (Object)adaptor.create(char_literal99)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal99_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_conditional_expression3944);
                    expression100=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression100.getTree());

                    char_literal101=(Token)match(input,199,FOLLOW_199_in_conditional_expression3946); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression3949);
                    conditional_expression102=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression102.getTree());

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
    // nesC.g:396:1: assignment_expression : ( ( unary_expression assignment_operator )=> unary_expression assignment_operator assignment_expression -> ^( assignment_operator unary_expression assignment_expression ) | conditional_expression );
    public final nesCParser.assignment_expression_return assignment_expression() throws RecognitionException {
        nesCParser.assignment_expression_return retval = new nesCParser.assignment_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.unary_expression_return unary_expression103 =null;

        nesCParser.assignment_operator_return assignment_operator104 =null;

        nesCParser.assignment_expression_return assignment_expression105 =null;

        nesCParser.conditional_expression_return conditional_expression106 =null;


        RewriteRuleSubtreeStream stream_assignment_operator=new RewriteRuleSubtreeStream(adaptor,"rule assignment_operator");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");
        try {
            // nesC.g:397:5: ( ( unary_expression assignment_operator )=> unary_expression assignment_operator assignment_expression -> ^( assignment_operator unary_expression assignment_expression ) | conditional_expression )
            int alt27=2;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA27_1 = input.LA(2);

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (((( !symbols.isType(input.LT(1).getText()) )&&( !symbols.isType(input.LT(1).getText()) ))&&synpred3_nesC())) ) {
                    alt27=1;
                }
                else if ( (( !symbols.isType(input.LT(1).getText()) )) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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

                if ( (synpred3_nesC()) ) {
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
            case BUILTIN_VA_ARG:
                {
                int LA27_16 = input.LA(2);

                if ( (synpred3_nesC()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 16, input);

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
                    // nesC.g:397:10: ( unary_expression assignment_operator )=> unary_expression assignment_operator assignment_expression
                    {
                    pushFollow(FOLLOW_unary_expression_in_assignment_expression3988);
                    unary_expression103=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression103.getTree());

                    pushFollow(FOLLOW_assignment_operator_in_assignment_expression3990);
                    assignment_operator104=assignment_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_operator.add(assignment_operator104.getTree());

                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression3992);
                    assignment_expression105=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression105.getTree());

                    // AST REWRITE
                    // elements: assignment_operator, assignment_expression, unary_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 399:14: -> ^( assignment_operator unary_expression assignment_expression )
                    {
                        // nesC.g:399:17: ^( assignment_operator unary_expression assignment_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_assignment_operator.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unary_expression.nextTree());

                        adaptor.addChild(root_1, stream_assignment_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:400:10: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression4026);
                    conditional_expression106=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression106.getTree());

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
    // $ANTLR end "assignment_expression"


    public static class assignment_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_operator"
    // nesC.g:402:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final nesCParser.assignment_operator_return assignment_operator() throws RecognitionException {
        nesCParser.assignment_operator_return retval = new nesCParser.assignment_operator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set107=null;

        Object set107_tree=null;

        try {
            // nesC.g:403:5: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set107=(Token)input.LT(1);

            if ( input.LA(1)==ASSIGN||input.LA(1)==BITANDASSIGN||input.LA(1)==BITORASSIGN||input.LA(1)==BITXORASSIGN||input.LA(1)==DIVASSIGN||input.LA(1)==LSHIFTASSIGN||input.LA(1)==MINUSASSIGN||input.LA(1)==MODASSIGN||input.LA(1)==MULASSIGN||input.LA(1)==PLUSASSIGN||input.LA(1)==RSHIFTASSIGN ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set107)
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
    // $ANTLR end "assignment_operator"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // nesC.g:405:1: expression : assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )* ;
    public final nesCParser.expression_return expression() throws RecognitionException {
        nesCParser.expression_return retval = new nesCParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal109=null;
        nesCParser.assignment_expression_return assignment_expression108 =null;

        nesCParser.assignment_expression_return assignment_expression110 =null;


        Object char_literal109_tree=null;

        try {
            // nesC.g:406:5: ( assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )* )
            // nesC.g:406:10: assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression4096);
            assignment_expression108=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression108.getTree());

            // nesC.g:406:32: ( ( ',' assignment_expression )=> ',' ^ assignment_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==COMMA) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred4_nesC()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // nesC.g:406:33: ( ',' assignment_expression )=> ',' ^ assignment_expression
            	    {
            	    char_literal109=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression4107); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal109_tree = 
            	    (Object)adaptor.create(char_literal109)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal109_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression4110);
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
    // nesC.g:408:1: constant_expression : conditional_expression ;
    public final nesCParser.constant_expression_return constant_expression() throws RecognitionException {
        nesCParser.constant_expression_return retval = new nesCParser.constant_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.conditional_expression_return conditional_expression111 =null;



        try {
            // nesC.g:409:5: ( conditional_expression )
            // nesC.g:409:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression4131);
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
    // nesC.g:429:1: declaration : ( ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';' -> ^( DECLARATION TYPEDEF declaration_specifiers ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) );
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
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        RewriteRuleSubtreeStream stream_gcc_attributes=new RewriteRuleSubtreeStream(adaptor,"rule gcc_attributes");
        try {
            // nesC.g:432:5: ( ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';' -> ^( DECLARATION TYPEDEF declaration_specifiers ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) )
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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
            case NX_INT8_T:
                {
                int LA33_19 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NX_INT16_T:
                {
                int LA33_20 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NX_INT32_T:
                {
                int LA33_21 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NX_INT64_T:
                {
                int LA33_22 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NX_UINT8_T:
                {
                int LA33_23 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NX_UINT16_T:
                {
                int LA33_24 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NX_UINT32_T:
                {
                int LA33_25 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NX_UINT64_T:
                {
                int LA33_26 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NXLE_INT8_T:
                {
                int LA33_27 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NXLE_INT16_T:
                {
                int LA33_28 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NXLE_INT32_T:
                {
                int LA33_29 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NXLE_INT64_T:
                {
                int LA33_30 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NXLE_UINT8_T:
                {
                int LA33_31 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NXLE_UINT16_T:
                {
                int LA33_32 = input.LA(2);

                if ( (synpred5_nesC()) ) {
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
            case NXLE_UINT32_T:
                {
                int LA33_33 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 33, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA33_34 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 34, input);

                    throw nvae;

                }
                }
                break;
            case BUILTIN_VA_LIST:
                {
                int LA33_35 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 35, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA33_36 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 36, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA33_37 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 37, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA33_38 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 38, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA33_39 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 39, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA33_40 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 40, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA33_41 = input.LA(2);

                if ( (synpred5_nesC()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 41, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                int LA33_42 = input.LA(2);

                if ( (synpred6_nesC()) ) {
                    alt33=3;
                }
                else if ( (true) ) {
                    alt33=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 42, input);

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
                    // nesC.g:432:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4219);
                    declaration_specifiers112=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers112.getTree());

                    // nesC.g:437:33: ( gcc_attributes )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==GCCATTRIBUTE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // nesC.g:437:33: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4221);
                            gcc_attributes113=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes113.getTree());

                            }
                            break;

                    }


                    // nesC.g:437:49: ( init_declarator_list )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPARENS||LA30_0==RAW_IDENTIFIER||LA30_0==STAR) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // nesC.g:437:49: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration4224);
                            init_declarator_list114=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list114.getTree());

                            }
                            break;

                    }


                    char_literal115=(Token)match(input,200,FOLLOW_200_in_declaration4227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal115);


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
                    // 444:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // nesC.g:444:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:444:54: ( init_declarator_list )?
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
                    // nesC.g:446:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration4289);
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
                    // 456:14: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // nesC.g:456:17: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // nesC.g:456:31: ^( FUNCTION_DEFINITION function_definition )
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
                    // nesC.g:461:10: ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';'
                    {
                    TYPEDEF117=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration4381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF117);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4383);
                    declaration_specifiers118=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers118.getTree());

                    char_literal119=(Token)match(input,200,FOLLOW_200_in_declaration4385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal119);


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
                    // 462:14: -> ^( DECLARATION TYPEDEF declaration_specifiers )
                    {
                        // nesC.g:462:17: ^( DECLARATION TYPEDEF declaration_specifiers )
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
                    // nesC.g:464:10: TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF120=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration4431); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF120);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4433);
                    declaration_specifiers121=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers121.getTree());

                    // nesC.g:467:41: ( gcc_attributes )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==GCCATTRIBUTE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // nesC.g:467:41: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4435);
                            gcc_attributes122=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes122.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_init_declarator_list_in_declaration4438);
                    init_declarator_list123=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list123.getTree());

                    // nesC.g:467:78: ( gcc_attributes )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==GCCATTRIBUTE) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // nesC.g:467:78: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4440);
                            gcc_attributes124=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes124.getTree());

                            }
                            break;

                    }


                    char_literal125=(Token)match(input,200,FOLLOW_200_in_declaration4443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal125);


                    if ( state.backtracking==0 ) {
                                   // Inefficient, but how many declarators will be in a declaration, honestly?
                                   for (int i = 0; i < ((declaration_scope)declaration_stack.peek()).declaredNames.size(); ++i) {
                                       symbols.addType(((declaration_scope)declaration_stack.peek()).declaredNames.get(i));
                                   }
                                 }

                    // AST REWRITE
                    // elements: declaration_specifiers, init_declarator_list, TYPEDEF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 474:14: -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                    {
                        // nesC.g:474:17: ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
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
    // nesC.g:482:1: declaration_specifiers : ( c_style_declaration_specifier )+ ;
    public final nesCParser.declaration_specifiers_return declaration_specifiers() throws RecognitionException {
        nesCParser.declaration_specifiers_return retval = new nesCParser.declaration_specifiers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.c_style_declaration_specifier_return c_style_declaration_specifier126 =null;



        try {
            // nesC.g:483:5: ( ( c_style_declaration_specifier )+ )
            // nesC.g:483:25: ( c_style_declaration_specifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:483:25: ( c_style_declaration_specifier )+
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
                else if ( (LA34_0==ASYNC||LA34_0==AUTO||LA34_0==BUILTIN_VA_LIST||LA34_0==CHAR||LA34_0==COMMAND||LA34_0==CONST||(LA34_0 >= DOUBLE && LA34_0 <= DUTY)||LA34_0==ENUM||(LA34_0 >= EVENT && LA34_0 <= EXTERN)||LA34_0==FLOAT||(LA34_0 >= INLINE && LA34_0 <= INT8_T)||LA34_0==LONG||LA34_0==NORACE||(LA34_0 >= NXLE_INT16_T && LA34_0 <= NX_UNION)||LA34_0==REGISTER||LA34_0==RESTRICT||LA34_0==SHORT||LA34_0==SIGNED||LA34_0==STATIC||LA34_0==STRUCT||LA34_0==TASK||(LA34_0 >= UINT16_T && LA34_0 <= UINT8_T)||(LA34_0 >= UNION && LA34_0 <= UNSIGNED)||(LA34_0 >= VOID && LA34_0 <= VOLATILE)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // nesC.g:483:25: c_style_declaration_specifier
            	    {
            	    pushFollow(FOLLOW_c_style_declaration_specifier_in_declaration_specifiers4510);
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
    // nesC.g:485:1: c_style_declaration_specifier : ( storage_class_specifier | type_specifier | type_qualifier | function_specifier );
    public final nesCParser.c_style_declaration_specifier_return c_style_declaration_specifier() throws RecognitionException {
        nesCParser.c_style_declaration_specifier_return retval = new nesCParser.c_style_declaration_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.storage_class_specifier_return storage_class_specifier127 =null;

        nesCParser.type_specifier_return type_specifier128 =null;

        nesCParser.type_qualifier_return type_qualifier129 =null;

        nesCParser.function_specifier_return function_specifier130 =null;



        try {
            // nesC.g:486:5: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier )
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
                    // nesC.g:486:10: storage_class_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_storage_class_specifier_in_c_style_declaration_specifier4526);
                    storage_class_specifier127=storage_class_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier127.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:487:10: type_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_specifier_in_c_style_declaration_specifier4537);
                    type_specifier128=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier128.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:488:10: type_qualifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_qualifier_in_c_style_declaration_specifier4548);
                    type_qualifier129=type_qualifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier129.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:489:10: function_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_function_specifier_in_c_style_declaration_specifier4559);
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
    // nesC.g:495:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
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
            // nesC.g:496:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // nesC.g:496:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list4580);
            init_declarator131=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator131.getTree());

            // nesC.g:496:26: ( ',' init_declarator )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COMMA) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // nesC.g:496:27: ',' init_declarator
            	    {
            	    char_literal132=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list4583); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal132);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list4585);
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
            // 496:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // nesC.g:496:52: ^( DECLARATOR_LIST ( init_declarator )+ )
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
    // nesC.g:502:1: init_declarator : declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
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
            // nesC.g:503:5: ( declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // nesC.g:503:10: declarator ( attributes )? ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator4619);
            declarator134=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator134.getTree());

            // nesC.g:503:21: ( attributes )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ATTRIBUTE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // nesC.g:503:21: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_init_declarator4621);
                    attributes135=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes135.getTree());

                    }
                    break;

            }


            // nesC.g:503:33: ( '=' initializer )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ASSIGN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // nesC.g:503:34: '=' initializer
                    {
                    char_literal136=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator4625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal136);


                    pushFollow(FOLLOW_initializer_in_init_declarator4627);
                    initializer137=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer137.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: declarator, initializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 503:52: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // nesC.g:503:55: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // nesC.g:503:84: ( initializer )?
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
    // nesC.g:505:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK );
    public final nesCParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        nesCParser.storage_class_specifier_return retval = new nesCParser.storage_class_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set138=null;

        Object set138_tree=null;

        try {
            // nesC.g:506:5: ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK )
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
    // nesC.g:517:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_INT8_T | NX_INT16_T | NX_INT32_T | NX_INT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_INT8_T | NXLE_INT16_T | NXLE_INT32_T | NXLE_INT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | BUILTIN_VA_LIST | struct_or_union_specifier | enum_specifier | typedef_name );
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
        Token NX_INT8_T156=null;
        Token NX_INT16_T157=null;
        Token NX_INT32_T158=null;
        Token NX_INT64_T159=null;
        Token NX_UINT8_T160=null;
        Token NX_UINT16_T161=null;
        Token NX_UINT32_T162=null;
        Token NX_UINT64_T163=null;
        Token NXLE_INT8_T164=null;
        Token NXLE_INT16_T165=null;
        Token NXLE_INT32_T166=null;
        Token NXLE_INT64_T167=null;
        Token NXLE_UINT8_T168=null;
        Token NXLE_UINT16_T169=null;
        Token NXLE_UINT32_T170=null;
        Token NXLE_UINT64_T171=null;
        Token BUILTIN_VA_LIST172=null;
        nesCParser.struct_or_union_specifier_return struct_or_union_specifier173 =null;

        nesCParser.enum_specifier_return enum_specifier174 =null;

        nesCParser.typedef_name_return typedef_name175 =null;


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
        Object NX_INT8_T156_tree=null;
        Object NX_INT16_T157_tree=null;
        Object NX_INT32_T158_tree=null;
        Object NX_INT64_T159_tree=null;
        Object NX_UINT8_T160_tree=null;
        Object NX_UINT16_T161_tree=null;
        Object NX_UINT32_T162_tree=null;
        Object NX_UINT64_T163_tree=null;
        Object NXLE_INT8_T164_tree=null;
        Object NXLE_INT16_T165_tree=null;
        Object NXLE_INT32_T166_tree=null;
        Object NXLE_INT64_T167_tree=null;
        Object NXLE_UINT8_T168_tree=null;
        Object NXLE_UINT16_T169_tree=null;
        Object NXLE_UINT32_T170_tree=null;
        Object NXLE_UINT64_T171_tree=null;
        Object BUILTIN_VA_LIST172_tree=null;

        try {
            // nesC.g:518:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_INT8_T | NX_INT16_T | NX_INT32_T | NX_INT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_INT8_T | NXLE_INT16_T | NXLE_INT32_T | NXLE_INT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | BUILTIN_VA_LIST | struct_or_union_specifier | enum_specifier | typedef_name )
            int alt39=37;
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
            case NX_INT8_T:
                {
                alt39=18;
                }
                break;
            case NX_INT16_T:
                {
                alt39=19;
                }
                break;
            case NX_INT32_T:
                {
                alt39=20;
                }
                break;
            case NX_INT64_T:
                {
                alt39=21;
                }
                break;
            case NX_UINT8_T:
                {
                alt39=22;
                }
                break;
            case NX_UINT16_T:
                {
                alt39=23;
                }
                break;
            case NX_UINT32_T:
                {
                alt39=24;
                }
                break;
            case NX_UINT64_T:
                {
                alt39=25;
                }
                break;
            case NXLE_INT8_T:
                {
                alt39=26;
                }
                break;
            case NXLE_INT16_T:
                {
                alt39=27;
                }
                break;
            case NXLE_INT32_T:
                {
                alt39=28;
                }
                break;
            case NXLE_INT64_T:
                {
                alt39=29;
                }
                break;
            case NXLE_UINT8_T:
                {
                alt39=30;
                }
                break;
            case NXLE_UINT16_T:
                {
                alt39=31;
                }
                break;
            case NXLE_UINT32_T:
                {
                alt39=32;
                }
                break;
            case NXLE_UINT64_T:
                {
                alt39=33;
                }
                break;
            case BUILTIN_VA_LIST:
                {
                alt39=34;
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case STRUCT:
            case UNION:
                {
                alt39=35;
                }
                break;
            case ENUM:
                {
                alt39=36;
                }
                break;
            case RAW_IDENTIFIER:
                {
                alt39=37;
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
                    // nesC.g:518:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID139=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier4776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID139_tree = 
                    (Object)adaptor.create(VOID139)
                    ;
                    adaptor.addChild(root_0, VOID139_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:519:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR140=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier4786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR140_tree = 
                    (Object)adaptor.create(CHAR140)
                    ;
                    adaptor.addChild(root_0, CHAR140_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:520:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT141=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier4796); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT141_tree = 
                    (Object)adaptor.create(SHORT141)
                    ;
                    adaptor.addChild(root_0, SHORT141_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:521:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT142=(Token)match(input,INT,FOLLOW_INT_in_type_specifier4806); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT142_tree = 
                    (Object)adaptor.create(INT142)
                    ;
                    adaptor.addChild(root_0, INT142_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:522:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG143=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier4816); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG143_tree = 
                    (Object)adaptor.create(LONG143)
                    ;
                    adaptor.addChild(root_0, LONG143_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:523:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED144=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier4826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED144_tree = 
                    (Object)adaptor.create(SIGNED144)
                    ;
                    adaptor.addChild(root_0, SIGNED144_tree);
                    }

                    }
                    break;
                case 7 :
                    // nesC.g:524:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED145=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier4836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED145_tree = 
                    (Object)adaptor.create(UNSIGNED145)
                    ;
                    adaptor.addChild(root_0, UNSIGNED145_tree);
                    }

                    }
                    break;
                case 8 :
                    // nesC.g:525:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT146=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier4846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT146_tree = 
                    (Object)adaptor.create(FLOAT146)
                    ;
                    adaptor.addChild(root_0, FLOAT146_tree);
                    }

                    }
                    break;
                case 9 :
                    // nesC.g:526:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLE147=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_type_specifier4856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE147_tree = 
                    (Object)adaptor.create(DOUBLE147)
                    ;
                    adaptor.addChild(root_0, DOUBLE147_tree);
                    }

                    }
                    break;
                case 10 :
                    // nesC.g:528:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T148=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier4867); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T148_tree = 
                    (Object)adaptor.create(INT8_T148)
                    ;
                    adaptor.addChild(root_0, INT8_T148_tree);
                    }

                    }
                    break;
                case 11 :
                    // nesC.g:529:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T149=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier4877); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T149_tree = 
                    (Object)adaptor.create(INT16_T149)
                    ;
                    adaptor.addChild(root_0, INT16_T149_tree);
                    }

                    }
                    break;
                case 12 :
                    // nesC.g:530:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T150=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier4887); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T150_tree = 
                    (Object)adaptor.create(INT32_T150)
                    ;
                    adaptor.addChild(root_0, INT32_T150_tree);
                    }

                    }
                    break;
                case 13 :
                    // nesC.g:531:9: INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT64_T151=(Token)match(input,INT64_T,FOLLOW_INT64_T_in_type_specifier4897); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT64_T151_tree = 
                    (Object)adaptor.create(INT64_T151)
                    ;
                    adaptor.addChild(root_0, INT64_T151_tree);
                    }

                    }
                    break;
                case 14 :
                    // nesC.g:533:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T152=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier4908); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T152_tree = 
                    (Object)adaptor.create(UINT8_T152)
                    ;
                    adaptor.addChild(root_0, UINT8_T152_tree);
                    }

                    }
                    break;
                case 15 :
                    // nesC.g:534:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T153=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier4918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T153_tree = 
                    (Object)adaptor.create(UINT16_T153)
                    ;
                    adaptor.addChild(root_0, UINT16_T153_tree);
                    }

                    }
                    break;
                case 16 :
                    // nesC.g:535:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T154=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier4928); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T154_tree = 
                    (Object)adaptor.create(UINT32_T154)
                    ;
                    adaptor.addChild(root_0, UINT32_T154_tree);
                    }

                    }
                    break;
                case 17 :
                    // nesC.g:536:9: UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT64_T155=(Token)match(input,UINT64_T,FOLLOW_UINT64_T_in_type_specifier4938); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT64_T155_tree = 
                    (Object)adaptor.create(UINT64_T155)
                    ;
                    adaptor.addChild(root_0, UINT64_T155_tree);
                    }

                    }
                    break;
                case 18 :
                    // nesC.g:538:9: NX_INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT8_T156=(Token)match(input,NX_INT8_T,FOLLOW_NX_INT8_T_in_type_specifier4949); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT8_T156_tree = 
                    (Object)adaptor.create(NX_INT8_T156)
                    ;
                    adaptor.addChild(root_0, NX_INT8_T156_tree);
                    }

                    }
                    break;
                case 19 :
                    // nesC.g:539:9: NX_INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT16_T157=(Token)match(input,NX_INT16_T,FOLLOW_NX_INT16_T_in_type_specifier4959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT16_T157_tree = 
                    (Object)adaptor.create(NX_INT16_T157)
                    ;
                    adaptor.addChild(root_0, NX_INT16_T157_tree);
                    }

                    }
                    break;
                case 20 :
                    // nesC.g:540:9: NX_INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT32_T158=(Token)match(input,NX_INT32_T,FOLLOW_NX_INT32_T_in_type_specifier4969); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT32_T158_tree = 
                    (Object)adaptor.create(NX_INT32_T158)
                    ;
                    adaptor.addChild(root_0, NX_INT32_T158_tree);
                    }

                    }
                    break;
                case 21 :
                    // nesC.g:541:9: NX_INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT64_T159=(Token)match(input,NX_INT64_T,FOLLOW_NX_INT64_T_in_type_specifier4979); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT64_T159_tree = 
                    (Object)adaptor.create(NX_INT64_T159)
                    ;
                    adaptor.addChild(root_0, NX_INT64_T159_tree);
                    }

                    }
                    break;
                case 22 :
                    // nesC.g:543:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T160=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier4990); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T160_tree = 
                    (Object)adaptor.create(NX_UINT8_T160)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T160_tree);
                    }

                    }
                    break;
                case 23 :
                    // nesC.g:544:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T161=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier5000); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T161_tree = 
                    (Object)adaptor.create(NX_UINT16_T161)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T161_tree);
                    }

                    }
                    break;
                case 24 :
                    // nesC.g:545:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T162=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier5010); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T162_tree = 
                    (Object)adaptor.create(NX_UINT32_T162)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T162_tree);
                    }

                    }
                    break;
                case 25 :
                    // nesC.g:546:9: NX_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT64_T163=(Token)match(input,NX_UINT64_T,FOLLOW_NX_UINT64_T_in_type_specifier5020); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT64_T163_tree = 
                    (Object)adaptor.create(NX_UINT64_T163)
                    ;
                    adaptor.addChild(root_0, NX_UINT64_T163_tree);
                    }

                    }
                    break;
                case 26 :
                    // nesC.g:548:9: NXLE_INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT8_T164=(Token)match(input,NXLE_INT8_T,FOLLOW_NXLE_INT8_T_in_type_specifier5031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT8_T164_tree = 
                    (Object)adaptor.create(NXLE_INT8_T164)
                    ;
                    adaptor.addChild(root_0, NXLE_INT8_T164_tree);
                    }

                    }
                    break;
                case 27 :
                    // nesC.g:549:9: NXLE_INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT16_T165=(Token)match(input,NXLE_INT16_T,FOLLOW_NXLE_INT16_T_in_type_specifier5041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT16_T165_tree = 
                    (Object)adaptor.create(NXLE_INT16_T165)
                    ;
                    adaptor.addChild(root_0, NXLE_INT16_T165_tree);
                    }

                    }
                    break;
                case 28 :
                    // nesC.g:550:9: NXLE_INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT32_T166=(Token)match(input,NXLE_INT32_T,FOLLOW_NXLE_INT32_T_in_type_specifier5051); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT32_T166_tree = 
                    (Object)adaptor.create(NXLE_INT32_T166)
                    ;
                    adaptor.addChild(root_0, NXLE_INT32_T166_tree);
                    }

                    }
                    break;
                case 29 :
                    // nesC.g:551:9: NXLE_INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT64_T167=(Token)match(input,NXLE_INT64_T,FOLLOW_NXLE_INT64_T_in_type_specifier5061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT64_T167_tree = 
                    (Object)adaptor.create(NXLE_INT64_T167)
                    ;
                    adaptor.addChild(root_0, NXLE_INT64_T167_tree);
                    }

                    }
                    break;
                case 30 :
                    // nesC.g:553:9: NXLE_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT8_T168=(Token)match(input,NXLE_UINT8_T,FOLLOW_NXLE_UINT8_T_in_type_specifier5072); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT8_T168_tree = 
                    (Object)adaptor.create(NXLE_UINT8_T168)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT8_T168_tree);
                    }

                    }
                    break;
                case 31 :
                    // nesC.g:554:9: NXLE_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT16_T169=(Token)match(input,NXLE_UINT16_T,FOLLOW_NXLE_UINT16_T_in_type_specifier5082); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT16_T169_tree = 
                    (Object)adaptor.create(NXLE_UINT16_T169)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT16_T169_tree);
                    }

                    }
                    break;
                case 32 :
                    // nesC.g:555:9: NXLE_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT32_T170=(Token)match(input,NXLE_UINT32_T,FOLLOW_NXLE_UINT32_T_in_type_specifier5092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT32_T170_tree = 
                    (Object)adaptor.create(NXLE_UINT32_T170)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT32_T170_tree);
                    }

                    }
                    break;
                case 33 :
                    // nesC.g:556:9: NXLE_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT64_T171=(Token)match(input,NXLE_UINT64_T,FOLLOW_NXLE_UINT64_T_in_type_specifier5102); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT64_T171_tree = 
                    (Object)adaptor.create(NXLE_UINT64_T171)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT64_T171_tree);
                    }

                    }
                    break;
                case 34 :
                    // nesC.g:558:9: BUILTIN_VA_LIST
                    {
                    root_0 = (Object)adaptor.nil();


                    BUILTIN_VA_LIST172=(Token)match(input,BUILTIN_VA_LIST,FOLLOW_BUILTIN_VA_LIST_in_type_specifier5113); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BUILTIN_VA_LIST172_tree = 
                    (Object)adaptor.create(BUILTIN_VA_LIST172)
                    ;
                    adaptor.addChild(root_0, BUILTIN_VA_LIST172_tree);
                    }

                    }
                    break;
                case 35 :
                    // nesC.g:560:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier5128);
                    struct_or_union_specifier173=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier173.getTree());

                    }
                    break;
                case 36 :
                    // nesC.g:561:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier5138);
                    enum_specifier174=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier174.getTree());

                    }
                    break;
                case 37 :
                    // nesC.g:562:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier5148);
                    typedef_name175=typedef_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedef_name175.getTree());

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
    // nesC.g:568:1: struct_or_union_specifier : ( struct_or_union '{' ( struct_declaration_list )? '}' -> ^( struct_or_union ( struct_declaration_list )? ) | struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )? -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? ) | STRUCT '@' RAW_IDENTIFIER '{' ( struct_declaration_list )? '}' -> ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? ) );
    public final nesCParser.struct_or_union_specifier_return struct_or_union_specifier() throws RecognitionException {
        nesCParser.struct_or_union_specifier_return retval = new nesCParser.struct_or_union_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal177=null;
        Token char_literal179=null;
        Token RAW_IDENTIFIER181=null;
        Token char_literal182=null;
        Token char_literal184=null;
        Token STRUCT185=null;
        Token char_literal186=null;
        Token RAW_IDENTIFIER187=null;
        Token char_literal188=null;
        Token char_literal190=null;
        nesCParser.struct_or_union_return struct_or_union176 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list178 =null;

        nesCParser.struct_or_union_return struct_or_union180 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list183 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list189 =null;


        Object char_literal177_tree=null;
        Object char_literal179_tree=null;
        Object RAW_IDENTIFIER181_tree=null;
        Object char_literal182_tree=null;
        Object char_literal184_tree=null;
        Object STRUCT185_tree=null;
        Object char_literal186_tree=null;
        Object RAW_IDENTIFIER187_tree=null;
        Object char_literal188_tree=null;
        Object char_literal190_tree=null;
        RewriteRuleTokenStream stream_STRUCT=new RewriteRuleTokenStream(adaptor,"token STRUCT");
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleTokenStream stream_ATTRIBUTE=new RewriteRuleTokenStream(adaptor,"token ATTRIBUTE");
        RewriteRuleSubtreeStream stream_struct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declaration_list");
        RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");
        try {
            // nesC.g:569:5: ( struct_or_union '{' ( struct_declaration_list )? '}' -> ^( struct_or_union ( struct_declaration_list )? ) | struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )? -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? ) | STRUCT '@' RAW_IDENTIFIER '{' ( struct_declaration_list )? '}' -> ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? ) )
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==STRUCT) ) {
                switch ( input.LA(2) ) {
                case ATTRIBUTE:
                    {
                    alt44=3;
                    }
                    break;
                case LBRACE:
                    {
                    alt44=1;
                    }
                    break;
                case RAW_IDENTIFIER:
                    {
                    alt44=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA44_0==NX_STRUCT||LA44_0==NX_UNION||LA44_0==UNION) ) {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==LBRACE) ) {
                    alt44=1;
                }
                else if ( (LA44_2==RAW_IDENTIFIER) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // nesC.g:569:10: struct_or_union '{' ( struct_declaration_list )? '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier5167);
                    struct_or_union176=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union176.getTree());

                    char_literal177=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier5169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal177);


                    // nesC.g:569:30: ( struct_declaration_list )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==BUILTIN_VA_LIST||LA40_0==CHAR||LA40_0==CONST||LA40_0==DOUBLE||LA40_0==ENUM||LA40_0==FLOAT||LA40_0==HASH||(LA40_0 >= INT && LA40_0 <= INT8_T)||LA40_0==LONG||(LA40_0 >= NXLE_INT16_T && LA40_0 <= NX_UNION)||LA40_0==RAW_IDENTIFIER||LA40_0==RESTRICT||LA40_0==SHORT||LA40_0==SIGNED||LA40_0==STRUCT||(LA40_0 >= UINT16_T && LA40_0 <= UINT8_T)||(LA40_0 >= UNION && LA40_0 <= UNSIGNED)||(LA40_0 >= VOID && LA40_0 <= VOLATILE)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // nesC.g:569:30: struct_declaration_list
                            {
                            pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier5171);
                            struct_declaration_list178=struct_declaration_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list178.getTree());

                            }
                            break;

                    }


                    char_literal179=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier5174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal179);


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
                    // 570:14: -> ^( struct_or_union ( struct_declaration_list )? )
                    {
                        // nesC.g:570:17: ^( struct_or_union ( struct_declaration_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        // nesC.g:570:35: ( struct_declaration_list )?
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
                    // nesC.g:571:10: struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )?
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier5207);
                    struct_or_union180=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union180.getTree());

                    RAW_IDENTIFIER181=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER181);


                    // nesC.g:571:41: ( '{' ( struct_declaration_list )? '}' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==LBRACE) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // nesC.g:571:60: '{' ( struct_declaration_list )? '}'
                            {
                            char_literal182=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier5214); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal182);


                            // nesC.g:571:64: ( struct_declaration_list )?
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==BUILTIN_VA_LIST||LA41_0==CHAR||LA41_0==CONST||LA41_0==DOUBLE||LA41_0==ENUM||LA41_0==FLOAT||LA41_0==HASH||(LA41_0 >= INT && LA41_0 <= INT8_T)||LA41_0==LONG||(LA41_0 >= NXLE_INT16_T && LA41_0 <= NX_UNION)||LA41_0==RAW_IDENTIFIER||LA41_0==RESTRICT||LA41_0==SHORT||LA41_0==SIGNED||LA41_0==STRUCT||(LA41_0 >= UINT16_T && LA41_0 <= UINT8_T)||(LA41_0 >= UNION && LA41_0 <= UNSIGNED)||(LA41_0 >= VOID && LA41_0 <= VOLATILE)) ) {
                                alt41=1;
                            }
                            switch (alt41) {
                                case 1 :
                                    // nesC.g:571:64: struct_declaration_list
                                    {
                                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier5216);
                                    struct_declaration_list183=struct_declaration_list();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list183.getTree());

                                    }
                                    break;

                            }


                            char_literal184=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier5219); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal184);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: struct_or_union, struct_declaration_list, RAW_IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 572:14: -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? )
                    {
                        // nesC.g:572:17: ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        stream_RAW_IDENTIFIER.nextNode()
                        );

                        // nesC.g:572:68: ( struct_declaration_list )?
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
                    // nesC.g:573:10: STRUCT '@' RAW_IDENTIFIER '{' ( struct_declaration_list )? '}'
                    {
                    STRUCT185=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_struct_or_union_specifier5258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRUCT.add(STRUCT185);


                    char_literal186=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_struct_or_union_specifier5260); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATTRIBUTE.add(char_literal186);


                    RAW_IDENTIFIER187=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER187);


                    char_literal188=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier5264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal188);


                    // nesC.g:573:40: ( struct_declaration_list )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==BUILTIN_VA_LIST||LA43_0==CHAR||LA43_0==CONST||LA43_0==DOUBLE||LA43_0==ENUM||LA43_0==FLOAT||LA43_0==HASH||(LA43_0 >= INT && LA43_0 <= INT8_T)||LA43_0==LONG||(LA43_0 >= NXLE_INT16_T && LA43_0 <= NX_UNION)||LA43_0==RAW_IDENTIFIER||LA43_0==RESTRICT||LA43_0==SHORT||LA43_0==SIGNED||LA43_0==STRUCT||(LA43_0 >= UINT16_T && LA43_0 <= UINT8_T)||(LA43_0 >= UNION && LA43_0 <= UNSIGNED)||(LA43_0 >= VOID && LA43_0 <= VOLATILE)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // nesC.g:573:40: struct_declaration_list
                            {
                            pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier5266);
                            struct_declaration_list189=struct_declaration_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list189.getTree());

                            }
                            break;

                    }


                    char_literal190=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier5269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal190);


                    // AST REWRITE
                    // elements: STRUCT, struct_declaration_list, ATTRIBUTE, RAW_IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 574:14: -> ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? )
                    {
                        // nesC.g:574:17: ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? )
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

                        // nesC.g:574:45: ( struct_declaration_list )?
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
    // nesC.g:576:1: struct_or_union : ( STRUCT | UNION | NX_STRUCT | NX_UNION );
    public final nesCParser.struct_or_union_return struct_or_union() throws RecognitionException {
        nesCParser.struct_or_union_return retval = new nesCParser.struct_or_union_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set191=null;

        Object set191_tree=null;

        try {
            // nesC.g:577:5: ( STRUCT | UNION | NX_STRUCT | NX_UNION )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set191=(Token)input.LT(1);

            if ( input.LA(1)==NX_STRUCT||input.LA(1)==NX_UNION||input.LA(1)==STRUCT||input.LA(1)==UNION ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set191)
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
    // nesC.g:582:1: struct_declaration_list : ( line_directive | struct_declaration )+ ;
    public final nesCParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        nesCParser.struct_declaration_list_return retval = new nesCParser.struct_declaration_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive192 =null;

        nesCParser.struct_declaration_return struct_declaration193 =null;



        try {
            // nesC.g:583:5: ( ( line_directive | struct_declaration )+ )
            // nesC.g:583:10: ( line_directive | struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // nesC.g:584:10: ( line_directive | struct_declaration )+
            int cnt45=0;
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==HASH) ) {
                    alt45=1;
                }
                else if ( (LA45_0==BUILTIN_VA_LIST||LA45_0==CHAR||LA45_0==CONST||LA45_0==DOUBLE||LA45_0==ENUM||LA45_0==FLOAT||(LA45_0 >= INT && LA45_0 <= INT8_T)||LA45_0==LONG||(LA45_0 >= NXLE_INT16_T && LA45_0 <= NX_UNION)||LA45_0==RAW_IDENTIFIER||LA45_0==RESTRICT||LA45_0==SHORT||LA45_0==SIGNED||LA45_0==STRUCT||(LA45_0 >= UINT16_T && LA45_0 <= UINT8_T)||(LA45_0 >= UNION && LA45_0 <= UNSIGNED)||(LA45_0 >= VOID && LA45_0 <= VOLATILE)) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // nesC.g:584:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_struct_declaration_list5356);
            	    line_directive192=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive192.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:584:28: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list5360);
            	    struct_declaration193=struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_declaration193.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
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
    // nesC.g:587:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final nesCParser.struct_declaration_return struct_declaration() throws RecognitionException {
        nesCParser.struct_declaration_return retval = new nesCParser.struct_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal196=null;
        nesCParser.specifier_qualifier_list_return specifier_qualifier_list194 =null;

        nesCParser.struct_declarator_list_return struct_declarator_list195 =null;


        Object char_literal196_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            // nesC.g:588:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // nesC.g:588:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration5392);
            specifier_qualifier_list194=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list194.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration5394);
            struct_declarator_list195=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list195.getTree());

            char_literal196=(Token)match(input,200,FOLLOW_200_in_struct_declaration5396); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal196);


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
            // 589:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // nesC.g:589:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
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
    // nesC.g:596:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final nesCParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        nesCParser.specifier_qualifier_list_return retval = new nesCParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.type_specifier_return type_specifier197 =null;

        nesCParser.type_qualifier_return type_qualifier198 =null;



        try {
            // nesC.g:597:5: ( ( type_specifier | type_qualifier )+ )
            // nesC.g:597:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:597:10: ( type_specifier | type_qualifier )+
            int cnt46=0;
            loop46:
            do {
                int alt46=3;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA46_2 = input.LA(2);

                    if ( (( symbols.isType(input.LT(1).getText()) )) ) {
                        alt46=1;
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
                    alt46=1;
                    }
                    break;
                case CONST:
                case RESTRICT:
                case VOLATILE:
                    {
                    alt46=2;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // nesC.g:597:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list5439);
            	    type_specifier197=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier197.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:597:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list5443);
            	    type_qualifier198=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier198.getTree());

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


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // nesC.g:604:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
    public final nesCParser.struct_declarator_list_return struct_declarator_list() throws RecognitionException {
        nesCParser.struct_declarator_list_return retval = new nesCParser.struct_declarator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal200=null;
        nesCParser.struct_declarator_return struct_declarator199 =null;

        nesCParser.struct_declarator_return struct_declarator201 =null;


        Object char_literal200_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_struct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator");
        try {
            // nesC.g:605:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // nesC.g:605:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5469);
            struct_declarator199=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator199.getTree());

            // nesC.g:605:28: ( ',' struct_declarator )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // nesC.g:605:29: ',' struct_declarator
            	    {
            	    char_literal200=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list5472); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal200);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5474);
            	    struct_declarator201=struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator201.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
            // 605:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // nesC.g:605:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
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
    // nesC.g:607:1: struct_declarator : ( declarator ( ':' constant_expression )? | ':' constant_expression );
    public final nesCParser.struct_declarator_return struct_declarator() throws RecognitionException {
        nesCParser.struct_declarator_return retval = new nesCParser.struct_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal203=null;
        Token char_literal205=null;
        nesCParser.declarator_return declarator202 =null;

        nesCParser.constant_expression_return constant_expression204 =null;

        nesCParser.constant_expression_return constant_expression206 =null;


        Object char_literal203_tree=null;
        Object char_literal205_tree=null;

        try {
            // nesC.g:608:5: ( declarator ( ':' constant_expression )? | ':' constant_expression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==LPARENS||LA49_0==RAW_IDENTIFIER||LA49_0==STAR) ) {
                alt49=1;
            }
            else if ( (LA49_0==199) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // nesC.g:608:10: declarator ( ':' constant_expression )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator5504);
                    declarator202=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator202.getTree());

                    // nesC.g:608:21: ( ':' constant_expression )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==199) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // nesC.g:608:22: ':' constant_expression
                            {
                            char_literal203=(Token)match(input,199,FOLLOW_199_in_struct_declarator5507); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal203_tree = 
                            (Object)adaptor.create(char_literal203)
                            ;
                            adaptor.addChild(root_0, char_literal203_tree);
                            }

                            pushFollow(FOLLOW_constant_expression_in_struct_declarator5509);
                            constant_expression204=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression204.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // nesC.g:609:10: ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal205=(Token)match(input,199,FOLLOW_199_in_struct_declarator5522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal205_tree = 
                    (Object)adaptor.create(char_literal205)
                    ;
                    adaptor.addChild(root_0, char_literal205_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator5524);
                    constant_expression206=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression206.getTree());

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
    // nesC.g:611:1: enum_specifier : ( ENUM '{' enumerator_list ( ',' )? '}' -> ^( ENUM enumerator_list ) | ENUM identifier ( '{' enumerator_list ( ',' )? '}' )? -> ^( ENUM identifier ( enumerator_list )? ) );
    public final nesCParser.enum_specifier_return enum_specifier() throws RecognitionException {
        nesCParser.enum_specifier_return retval = new nesCParser.enum_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENUM207=null;
        Token char_literal208=null;
        Token char_literal210=null;
        Token char_literal211=null;
        Token ENUM212=null;
        Token char_literal214=null;
        Token char_literal216=null;
        Token char_literal217=null;
        nesCParser.enumerator_list_return enumerator_list209 =null;

        nesCParser.identifier_return identifier213 =null;

        nesCParser.enumerator_list_return enumerator_list215 =null;


        Object ENUM207_tree=null;
        Object char_literal208_tree=null;
        Object char_literal210_tree=null;
        Object char_literal211_tree=null;
        Object ENUM212_tree=null;
        Object char_literal214_tree=null;
        Object char_literal216_tree=null;
        Object char_literal217_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_enumerator_list=new RewriteRuleSubtreeStream(adaptor,"rule enumerator_list");
        try {
            // nesC.g:612:5: ( ENUM '{' enumerator_list ( ',' )? '}' -> ^( ENUM enumerator_list ) | ENUM identifier ( '{' enumerator_list ( ',' )? '}' )? -> ^( ENUM identifier ( enumerator_list )? ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ENUM) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==LBRACE) ) {
                    alt53=1;
                }
                else if ( (LA53_1==RAW_IDENTIFIER) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // nesC.g:612:10: ENUM '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM207=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM207);


                    char_literal208=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal208);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5547);
                    enumerator_list209=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list209.getTree());

                    // nesC.g:612:35: ( ',' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==COMMA) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // nesC.g:612:35: ','
                            {
                            char_literal210=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5549); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal210);


                            }
                            break;

                    }


                    char_literal211=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal211);


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
                    // 613:14: -> ^( ENUM enumerator_list )
                    {
                        // nesC.g:613:17: ^( ENUM enumerator_list )
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
                    // nesC.g:614:10: ENUM identifier ( '{' enumerator_list ( ',' )? '}' )?
                    {
                    ENUM212=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM212);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5586);
                    identifier213=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier213.getTree());

                    // nesC.g:614:26: ( '{' enumerator_list ( ',' )? '}' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==LBRACE) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // nesC.g:614:45: '{' enumerator_list ( ',' )? '}'
                            {
                            char_literal214=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5591); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal214);


                            pushFollow(FOLLOW_enumerator_list_in_enum_specifier5593);
                            enumerator_list215=enumerator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list215.getTree());

                            // nesC.g:614:65: ( ',' )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==COMMA) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // nesC.g:614:65: ','
                                    {
                                    char_literal216=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5595); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(char_literal216);


                                    }
                                    break;

                            }


                            char_literal217=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5598); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal217);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: identifier, ENUM, enumerator_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 615:14: -> ^( ENUM identifier ( enumerator_list )? )
                    {
                        // nesC.g:615:17: ^( ENUM identifier ( enumerator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:615:53: ( enumerator_list )?
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
    // nesC.g:617:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
    public final nesCParser.enumerator_list_return enumerator_list() throws RecognitionException {
        nesCParser.enumerator_list_return retval = new nesCParser.enumerator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal219=null;
        nesCParser.enumerator_return enumerator218 =null;

        nesCParser.enumerator_return enumerator220 =null;


        Object char_literal219_tree=null;

        try {
            // nesC.g:618:5: ( enumerator ( ',' ! enumerator )* )
            // nesC.g:618:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list5645);
            enumerator218=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator218.getTree());

            // nesC.g:618:21: ( ',' ! enumerator )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==RAW_IDENTIFIER) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // nesC.g:618:22: ',' ! enumerator
            	    {
            	    char_literal219=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list5648); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list5651);
            	    enumerator220=enumerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator220.getTree());

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
    // $ANTLR end "enumerator_list"


    public static class enumerator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumerator"
    // nesC.g:624:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
    public final nesCParser.enumerator_return enumerator() throws RecognitionException {
        nesCParser.enumerator_return retval = new nesCParser.enumerator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal222=null;
        nesCParser.identifier_return identifier221 =null;

        nesCParser.constant_expression_return constant_expression223 =null;


        Object char_literal222_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:625:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // nesC.g:625:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator5676);
            identifier221=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier221.getTree());

            // nesC.g:625:21: ( '=' constant_expression )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ASSIGN) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // nesC.g:625:22: '=' constant_expression
                    {
                    char_literal222=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator5679); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal222);


                    pushFollow(FOLLOW_constant_expression_in_enumerator5681);
                    constant_expression223=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression223.getTree());

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
            // 625:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // nesC.g:625:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:625:75: ( constant_expression )?
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
    // nesC.g:626:1: type_qualifier : ( CONST | RESTRICT | VOLATILE );
    public final nesCParser.type_qualifier_return type_qualifier() throws RecognitionException {
        nesCParser.type_qualifier_return retval = new nesCParser.type_qualifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set224=null;

        Object set224_tree=null;

        try {
            // nesC.g:627:5: ( CONST | RESTRICT | VOLATILE )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set224=(Token)input.LT(1);

            if ( input.LA(1)==CONST||input.LA(1)==RESTRICT||input.LA(1)==VOLATILE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set224)
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
    // nesC.g:631:1: function_specifier : INLINE ;
    public final nesCParser.function_specifier_return function_specifier() throws RecognitionException {
        nesCParser.function_specifier_return retval = new nesCParser.function_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INLINE225=null;

        Object INLINE225_tree=null;

        try {
            // nesC.g:632:5: ( INLINE )
            // nesC.g:632:10: INLINE
            {
            root_0 = (Object)adaptor.nil();


            INLINE225=(Token)match(input,INLINE,FOLLOW_INLINE_in_function_specifier5753); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INLINE225_tree = 
            (Object)adaptor.create(INLINE225)
            ;
            adaptor.addChild(root_0, INLINE225_tree);
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
    // nesC.g:634:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
    public final nesCParser.declarator_return declarator() throws RecognitionException {
        nesCParser.declarator_return retval = new nesCParser.declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.pointer_return pointer226 =null;

        nesCParser.direct_declarator_return direct_declarator227 =null;


        RewriteRuleSubtreeStream stream_direct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule direct_declarator");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            // nesC.g:635:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // nesC.g:635:10: ( pointer )? direct_declarator
            {
            // nesC.g:635:10: ( pointer )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==STAR) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // nesC.g:635:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator5768);
                    pointer226=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer226.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator5771);
            direct_declarator227=direct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_direct_declarator.add(direct_declarator227.getTree());

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
            // 635:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // nesC.g:635:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // nesC.g:635:53: ( pointer )?
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
    // nesC.g:637:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final nesCParser.direct_declarator_return direct_declarator() throws RecognitionException {
        nesCParser.direct_declarator_return retval = new nesCParser.direct_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.direct_declarator_identifier_return direct_declarator_identifier228 =null;

        nesCParser.direct_declarator_modifier_return direct_declarator_modifier229 =null;



        try {
            // nesC.g:638:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // nesC.g:638:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator5796);
            direct_declarator_identifier228=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier228.getTree());

            // nesC.g:638:38: ( direct_declarator_modifier )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==LBRACKET||LA57_0==LPARENS) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // nesC.g:638:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator5798);
            	    direct_declarator_modifier229=direct_declarator_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_modifier229.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // nesC.g:649:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
    public final nesCParser.direct_declarator_identifier_return direct_declarator_identifier() throws RecognitionException {
        nesCParser.direct_declarator_identifier_return retval = new nesCParser.direct_declarator_identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal230=null;
        Token char_literal232=null;
        Token char_literal234=null;
        nesCParser.identifier_return myIdName =null;

        nesCParser.identifier_return identifier231 =null;

        nesCParser.declarator_return declarator233 =null;


        Object char_literal230_tree=null;
        Object char_literal232_tree=null;
        Object char_literal234_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:650:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RAW_IDENTIFIER) ) {
                alt59=1;
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
                    // nesC.g:650:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5824);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // nesC.g:650:29: ( '.' identifier )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==DOT) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // nesC.g:650:30: '.' identifier
                            {
                            char_literal230=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier5827); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal230);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5829);
                            identifier231=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier231.getTree());

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
                    // 654:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:654:18: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:655:9: '(' declarator ')'
                    {
                    char_literal232=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier5864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal232);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier5866);
                    declarator233=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator233.getTree());

                    char_literal234=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier5868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal234);


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
                    // 655:28: -> declarator
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
    // nesC.g:661:1: direct_declarator_modifier : ( ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
    public final nesCParser.direct_declarator_modifier_return direct_declarator_modifier() throws RecognitionException {
        nesCParser.direct_declarator_modifier_return retval = new nesCParser.direct_declarator_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal235=null;
        Token char_literal237=null;
        Token char_literal238=null;
        Token char_literal239=null;
        Token char_literal240=null;
        Token char_literal241=null;
        nesCParser.parameter_list_return generic =null;

        nesCParser.parameter_list_return normal =null;

        nesCParser.constant_expression_return constant_expression236 =null;


        Object char_literal235_tree=null;
        Object char_literal237_tree=null;
        Object char_literal238_tree=null;
        Object char_literal239_tree=null;
        Object char_literal240_tree=null;
        Object char_literal241_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // nesC.g:662:5: ( ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LBRACKET) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred7_nesC()) ) {
                    alt62=1;
                }
                else if ( (true) ) {
                    alt62=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA62_0==LPARENS) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }
            switch (alt62) {
                case 1 :
                    // nesC.g:662:9: ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']'
                    {
                    char_literal235=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal235);


                    // nesC.g:662:47: ( constant_expression )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==AMP||LA60_0==BITCOMPLEMENT||LA60_0==BUILTIN_VA_ARG||LA60_0==CALL||LA60_0==CHARACTER_LITERAL||LA60_0==CONSTANT||LA60_0==LPARENS||LA60_0==MINUS||LA60_0==MINUSMINUS||LA60_0==NOT||LA60_0==PLUS||LA60_0==PLUSPLUS||LA60_0==POST||LA60_0==RAW_IDENTIFIER||LA60_0==SIGNAL||LA60_0==SIZEOF||LA60_0==STAR||LA60_0==STRING_LITERAL) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // nesC.g:662:47: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier5903);
                            constant_expression236=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression236.getTree());

                            }
                            break;

                    }


                    char_literal237=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal237);


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
                    // 663:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // nesC.g:663:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // nesC.g:663:44: ( constant_expression )?
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
                    // nesC.g:664:9: ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')'
                    {
                    // nesC.g:664:9: ( '[' generic= parameter_list ']' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==LBRACKET) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // nesC.g:664:10: '[' generic= parameter_list ']'
                            {
                            char_literal238=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5938); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal238);


                            pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier5942);
                            generic=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_list.add(generic.getTree());

                            char_literal239=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5944); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal239);


                            }
                            break;

                    }


                    char_literal240=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier5948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal240);


                    pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier5952);
                    normal=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(normal.getTree());

                    char_literal241=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier5954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal241);


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
                    // 665:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // nesC.g:665:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
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
    // nesC.g:671:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
    public final nesCParser.pointer_return pointer() throws RecognitionException {
        nesCParser.pointer_return retval = new nesCParser.pointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal242=null;
        Token char_literal245=null;
        nesCParser.type_qualifier_list_return type_qualifier_list243 =null;

        nesCParser.pointer_return pointer244 =null;

        nesCParser.type_qualifier_list_return type_qualifier_list246 =null;


        Object char_literal242_tree=null;
        Object char_literal245_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_type_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule type_qualifier_list");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            // nesC.g:672:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // nesC.g:672:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal242=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5994); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal242);


                    // nesC.g:672:14: ( type_qualifier_list )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==CONST||LA63_0==RESTRICT||LA63_0==VOLATILE) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // nesC.g:672:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5996);
                            type_qualifier_list243=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list243.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer5999);
                    pointer244=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer244.getTree());

                    // AST REWRITE
                    // elements: pointer, type_qualifier_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 672:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // nesC.g:672:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:672:66: ( type_qualifier_list )?
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
                    // nesC.g:673:10: '*' ( type_qualifier_list )?
                    {
                    char_literal245=(Token)match(input,STAR,FOLLOW_STAR_in_pointer6021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal245);


                    // nesC.g:673:14: ( type_qualifier_list )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==CONST||LA64_0==RESTRICT||LA64_0==VOLATILE) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // nesC.g:673:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer6023);
                            type_qualifier_list246=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list246.getTree());

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
                    // 673:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // nesC.g:673:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:673:58: ( type_qualifier_list )?
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
    // nesC.g:675:1: type_qualifier_list : ( type_qualifier )+ ;
    public final nesCParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        nesCParser.type_qualifier_list_return retval = new nesCParser.type_qualifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.type_qualifier_return type_qualifier247 =null;



        try {
            // nesC.g:676:5: ( ( type_qualifier )+ )
            // nesC.g:676:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:676:10: ( type_qualifier )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==CONST||LA66_0==RESTRICT||LA66_0==VOLATILE) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // nesC.g:676:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list6052);
            	    type_qualifier247=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier247.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
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
    // nesC.g:683:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) );
    public final nesCParser.parameter_list_return parameter_list() throws RecognitionException {
        nesCParser.parameter_list_return retval = new nesCParser.parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal249=null;
        Token char_literal251=null;
        Token ELLIPSIS252=null;
        nesCParser.parameter_declaration_return parameter_declaration248 =null;

        nesCParser.parameter_declaration_return parameter_declaration250 =null;


        Object char_literal249_tree=null;
        Object char_literal251_tree=null;
        Object ELLIPSIS252_tree=null;
        RewriteRuleTokenStream stream_ELLIPSIS=new RewriteRuleTokenStream(adaptor,"token ELLIPSIS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            // nesC.g:684:5: ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==ASYNC||LA69_0==AUTO||LA69_0==BUILTIN_VA_LIST||LA69_0==CHAR||LA69_0==COMMAND||LA69_0==CONST||(LA69_0 >= DOUBLE && LA69_0 <= DUTY)||LA69_0==ENUM||(LA69_0 >= EVENT && LA69_0 <= EXTERN)||LA69_0==FLOAT||(LA69_0 >= INLINE && LA69_0 <= INT8_T)||LA69_0==LONG||LA69_0==NORACE||(LA69_0 >= NXLE_INT16_T && LA69_0 <= NX_UNION)||LA69_0==RAW_IDENTIFIER||LA69_0==REGISTER||LA69_0==RESTRICT||LA69_0==SHORT||LA69_0==SIGNED||LA69_0==STATIC||LA69_0==STRUCT||LA69_0==TASK||(LA69_0 >= UINT16_T && LA69_0 <= UINT8_T)||(LA69_0 >= UNION && LA69_0 <= UNSIGNED)||(LA69_0 >= VOID && LA69_0 <= VOLATILE)) ) {
                alt69=1;
            }
            else if ( (LA69_0==RBRACKET||LA69_0==RPARENS) ) {
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
                    // nesC.g:684:10: parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )?
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list6077);
                    parameter_declaration248=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration248.getTree());

                    // nesC.g:684:32: ( ',' parameter_declaration )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==COMMA) ) {
                            int LA67_1 = input.LA(2);

                            if ( (LA67_1==ASYNC||LA67_1==AUTO||LA67_1==BUILTIN_VA_LIST||LA67_1==CHAR||LA67_1==COMMAND||LA67_1==CONST||(LA67_1 >= DOUBLE && LA67_1 <= DUTY)||LA67_1==ENUM||(LA67_1 >= EVENT && LA67_1 <= EXTERN)||LA67_1==FLOAT||(LA67_1 >= INLINE && LA67_1 <= INT8_T)||LA67_1==LONG||LA67_1==NORACE||(LA67_1 >= NXLE_INT16_T && LA67_1 <= NX_UNION)||LA67_1==RAW_IDENTIFIER||LA67_1==REGISTER||LA67_1==RESTRICT||LA67_1==SHORT||LA67_1==SIGNED||LA67_1==STATIC||LA67_1==STRUCT||LA67_1==TASK||(LA67_1 >= UINT16_T && LA67_1 <= UINT8_T)||(LA67_1 >= UNION && LA67_1 <= UNSIGNED)||(LA67_1 >= VOID && LA67_1 <= VOLATILE)) ) {
                                alt67=1;
                            }


                        }


                        switch (alt67) {
                    	case 1 :
                    	    // nesC.g:684:33: ',' parameter_declaration
                    	    {
                    	    char_literal249=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list6080); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal249);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list6082);
                    	    parameter_declaration250=parameter_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration250.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    // nesC.g:684:61: ( ',' ELLIPSIS )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==COMMA) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // nesC.g:684:62: ',' ELLIPSIS
                            {
                            char_literal251=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list6087); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal251);


                            ELLIPSIS252=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_parameter_list6089); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELLIPSIS.add(ELLIPSIS252);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: parameter_declaration, ELLIPSIS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 685:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
                    {
                        // nesC.g:685:16: ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
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

                        // nesC.g:685:56: ( ELLIPSIS )?
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
                    // nesC.g:687:13: 
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
                    // 687:13: -> ^( PARAMETER_LIST )
                    {
                        // nesC.g:687:16: ^( PARAMETER_LIST )
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
    // nesC.g:693:1: parameter_declaration : declaration_specifiers ( parameter_declarator )? -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? ) ;
    public final nesCParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        nesCParser.parameter_declaration_return retval = new nesCParser.parameter_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers253 =null;

        nesCParser.parameter_declarator_return parameter_declarator254 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_parameter_declarator=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarator");
        try {
            // nesC.g:694:5: ( declaration_specifiers ( parameter_declarator )? -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? ) )
            // nesC.g:694:10: declaration_specifiers ( parameter_declarator )?
            {
            pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration6159);
            declaration_specifiers253=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers253.getTree());

            // nesC.g:694:33: ( parameter_declarator )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LBRACKET||LA70_0==LPARENS||LA70_0==RAW_IDENTIFIER||LA70_0==STAR) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // nesC.g:694:33: parameter_declarator
                    {
                    pushFollow(FOLLOW_parameter_declarator_in_parameter_declaration6161);
                    parameter_declarator254=parameter_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declarator.add(parameter_declarator254.getTree());

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
            // 695:13: -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? )
            {
                // nesC.g:695:16: ^( PARAMETER declaration_specifiers ( parameter_declarator )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETER, "PARAMETER")
                , root_1);

                adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                // nesC.g:695:51: ( parameter_declarator )?
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
    // nesC.g:698:1: parameter_declarator : ( ( declarator ( attributes )? )=> declarator ( attributes )? | abstract_declarator );
    public final nesCParser.parameter_declarator_return parameter_declarator() throws RecognitionException {
        nesCParser.parameter_declarator_return retval = new nesCParser.parameter_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declarator_return declarator255 =null;

        nesCParser.attributes_return attributes256 =null;

        nesCParser.abstract_declarator_return abstract_declarator257 =null;



        try {
            // nesC.g:699:5: ( ( declarator ( attributes )? )=> declarator ( attributes )? | abstract_declarator )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==STAR) ) {
                int LA72_1 = input.LA(2);

                if ( (synpred8_nesC()) ) {
                    alt72=1;
                }
                else if ( (true) ) {
                    alt72=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA72_0==RAW_IDENTIFIER) && (synpred8_nesC())) {
                alt72=1;
            }
            else if ( (LA72_0==LPARENS) ) {
                int LA72_3 = input.LA(2);

                if ( (synpred8_nesC()) ) {
                    alt72=1;
                }
                else if ( (true) ) {
                    alt72=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA72_0==LBRACKET) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }
            switch (alt72) {
                case 1 :
                    // nesC.g:699:10: ( declarator ( attributes )? )=> declarator ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_parameter_declarator6210);
                    declarator255=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator255.getTree());

                    // nesC.g:699:49: ( attributes )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==ATTRIBUTE) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // nesC.g:699:49: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_parameter_declarator6212);
                            attributes256=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes256.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // nesC.g:700:10: abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_abstract_declarator_in_parameter_declarator6224);
                    abstract_declarator257=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator257.getTree());

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
    // nesC.g:702:1: identifier_list : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final nesCParser.identifier_list_return identifier_list() throws RecognitionException {
        nesCParser.identifier_list_return retval = new nesCParser.identifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal259=null;
        nesCParser.identifier_return identifier258 =null;

        nesCParser.identifier_return identifier260 =null;


        Object char_literal259_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:703:5: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // nesC.g:703:10: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifier_list6243);
            identifier258=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier258.getTree());

            // nesC.g:703:21: ( ',' identifier )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // nesC.g:703:22: ',' identifier
            	    {
            	    char_literal259=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifier_list6246); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal259);


            	    pushFollow(FOLLOW_identifier_in_identifier_list6248);
            	    identifier260=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier260.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
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
            // 703:39: -> ( identifier )+
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
    // nesC.g:705:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final nesCParser.type_name_return type_name() throws RecognitionException {
        nesCParser.type_name_return retval = new nesCParser.type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.specifier_qualifier_list_return specifier_qualifier_list261 =null;

        nesCParser.abstract_declarator_return abstract_declarator262 =null;



        try {
            // nesC.g:706:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // nesC.g:706:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name6274);
            specifier_qualifier_list261=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list261.getTree());

            // nesC.g:706:35: ( abstract_declarator )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==LBRACKET||LA74_0==LPARENS||LA74_0==STAR) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // nesC.g:706:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name6276);
                    abstract_declarator262=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator262.getTree());

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
    // nesC.g:708:1: abstract_declarator : ( ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator | pointer );
    public final nesCParser.abstract_declarator_return abstract_declarator() throws RecognitionException {
        nesCParser.abstract_declarator_return retval = new nesCParser.abstract_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.pointer_return pointer263 =null;

        nesCParser.direct_abstract_declarator_return direct_abstract_declarator264 =null;

        nesCParser.pointer_return pointer265 =null;



        try {
            // nesC.g:709:5: ( ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator | pointer )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==STAR) ) {
                int LA76_1 = input.LA(2);

                if ( (synpred9_nesC()) ) {
                    alt76=1;
                }
                else if ( (true) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA76_0==LPARENS) && (synpred9_nesC())) {
                alt76=1;
            }
            else if ( (LA76_0==LBRACKET) && (synpred9_nesC())) {
                alt76=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // nesC.g:709:10: ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:709:51: ( pointer )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==STAR) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // nesC.g:709:51: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator6305);
                            pointer263=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer263.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator6308);
                    direct_abstract_declarator264=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator264.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:710:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator6319);
                    pointer265=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer265.getTree());

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
    // nesC.g:712:1: direct_abstract_declarator : ( ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )* | ( direct_abstract_declarator_modifier )+ );
    public final nesCParser.direct_abstract_declarator_return direct_abstract_declarator() throws RecognitionException {
        nesCParser.direct_abstract_declarator_return retval = new nesCParser.direct_abstract_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal266=null;
        Token char_literal268=null;
        nesCParser.abstract_declarator_return abstract_declarator267 =null;

        nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier269 =null;

        nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier270 =null;


        Object char_literal266_tree=null;
        Object char_literal268_tree=null;

        try {
            // nesC.g:713:5: ( ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )* | ( direct_abstract_declarator_modifier )+ )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==LPARENS) ) {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==STAR) && (synpred10_nesC())) {
                    alt79=1;
                }
                else if ( (LA79_1==LPARENS) && (synpred10_nesC())) {
                    alt79=1;
                }
                else if ( (LA79_1==LBRACKET) && (synpred10_nesC())) {
                    alt79=1;
                }
                else if ( (LA79_1==ASYNC||LA79_1==AUTO||LA79_1==BUILTIN_VA_LIST||LA79_1==CHAR||LA79_1==COMMAND||LA79_1==CONST||(LA79_1 >= DOUBLE && LA79_1 <= DUTY)||LA79_1==ENUM||(LA79_1 >= EVENT && LA79_1 <= EXTERN)||LA79_1==FLOAT||(LA79_1 >= INLINE && LA79_1 <= INT8_T)||LA79_1==LONG||LA79_1==NORACE||(LA79_1 >= NXLE_INT16_T && LA79_1 <= NX_UNION)||LA79_1==RAW_IDENTIFIER||LA79_1==REGISTER||LA79_1==RESTRICT||LA79_1==RPARENS||LA79_1==SHORT||LA79_1==SIGNED||LA79_1==STATIC||LA79_1==STRUCT||LA79_1==TASK||(LA79_1 >= UINT16_T && LA79_1 <= UINT8_T)||(LA79_1 >= UNION && LA79_1 <= UNSIGNED)||(LA79_1 >= VOID && LA79_1 <= VOLATILE)) ) {
                    alt79=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA79_0==LBRACKET) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // nesC.g:713:10: ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )*
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal266=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal266_tree = 
                    (Object)adaptor.create(char_literal266)
                    ;
                    adaptor.addChild(root_0, char_literal266_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator6361);
                    abstract_declarator267=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator267.getTree());

                    char_literal268=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal268_tree = 
                    (Object)adaptor.create(char_literal268)
                    ;
                    adaptor.addChild(root_0, char_literal268_tree);
                    }

                    // nesC.g:714:39: ( direct_abstract_declarator_modifier )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==LBRACKET||LA77_0==LPARENS) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // nesC.g:714:39: direct_abstract_declarator_modifier
                    	    {
                    	    pushFollow(FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6365);
                    	    direct_abstract_declarator_modifier269=direct_abstract_declarator_modifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator_modifier269.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // nesC.g:715:10: ( direct_abstract_declarator_modifier )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:715:10: ( direct_abstract_declarator_modifier )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==LBRACKET||LA78_0==LPARENS) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // nesC.g:715:10: direct_abstract_declarator_modifier
                    	    {
                    	    pushFollow(FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6377);
                    	    direct_abstract_declarator_modifier270=direct_abstract_declarator_modifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator_modifier270.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt78 >= 1 ) break loop78;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(78, input);
                                throw eee;
                        }
                        cnt78++;
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
    // nesC.g:717:1: direct_abstract_declarator_modifier : ( '[' ( assignment_expression )? ']' | '(' parameter_list ')' );
    public final nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier() throws RecognitionException {
        nesCParser.direct_abstract_declarator_modifier_return retval = new nesCParser.direct_abstract_declarator_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal271=null;
        Token char_literal273=null;
        Token char_literal274=null;
        Token char_literal276=null;
        nesCParser.assignment_expression_return assignment_expression272 =null;

        nesCParser.parameter_list_return parameter_list275 =null;


        Object char_literal271_tree=null;
        Object char_literal273_tree=null;
        Object char_literal274_tree=null;
        Object char_literal276_tree=null;

        try {
            // nesC.g:718:5: ( '[' ( assignment_expression )? ']' | '(' parameter_list ')' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==LBRACKET) ) {
                alt81=1;
            }
            else if ( (LA81_0==LPARENS) ) {
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
                    // nesC.g:718:10: '[' ( assignment_expression )? ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal271=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator_modifier6393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal271_tree = 
                    (Object)adaptor.create(char_literal271)
                    ;
                    adaptor.addChild(root_0, char_literal271_tree);
                    }

                    // nesC.g:718:14: ( assignment_expression )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==AMP||LA80_0==BITCOMPLEMENT||LA80_0==BUILTIN_VA_ARG||LA80_0==CALL||LA80_0==CHARACTER_LITERAL||LA80_0==CONSTANT||LA80_0==LPARENS||LA80_0==MINUS||LA80_0==MINUSMINUS||LA80_0==NOT||LA80_0==PLUS||LA80_0==PLUSPLUS||LA80_0==POST||LA80_0==RAW_IDENTIFIER||LA80_0==SIGNAL||LA80_0==SIZEOF||LA80_0==STAR||LA80_0==STRING_LITERAL) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // nesC.g:718:14: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator_modifier6395);
                            assignment_expression272=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression272.getTree());

                            }
                            break;

                    }


                    char_literal273=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator_modifier6398); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal273_tree = 
                    (Object)adaptor.create(char_literal273)
                    ;
                    adaptor.addChild(root_0, char_literal273_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:719:10: '(' parameter_list ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal274=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator_modifier6409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal274_tree = 
                    (Object)adaptor.create(char_literal274)
                    ;
                    adaptor.addChild(root_0, char_literal274_tree);
                    }

                    pushFollow(FOLLOW_parameter_list_in_direct_abstract_declarator_modifier6411);
                    parameter_list275=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list275.getTree());

                    char_literal276=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator_modifier6413); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal276_tree = 
                    (Object)adaptor.create(char_literal276)
                    ;
                    adaptor.addChild(root_0, char_literal276_tree);
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
    // nesC.g:722:1: typedef_name :{...}? RAW_IDENTIFIER ;
    public final nesCParser.typedef_name_return typedef_name() throws RecognitionException {
        nesCParser.typedef_name_return retval = new nesCParser.typedef_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER277=null;

        Object RAW_IDENTIFIER277_tree=null;

        try {
            // nesC.g:723:5: ({...}? RAW_IDENTIFIER )
            // nesC.g:723:10: {...}? RAW_IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            if ( !(( symbols.isType(input.LT(1).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typedef_name", " symbols.isType(input.LT(1).getText()) ");
            }

            RAW_IDENTIFIER277=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name6439); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAW_IDENTIFIER277_tree = 
            (Object)adaptor.create(RAW_IDENTIFIER277)
            ;
            adaptor.addChild(root_0, RAW_IDENTIFIER277_tree);
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
    // nesC.g:731:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
    public final nesCParser.initializer_return initializer() throws RecognitionException {
        nesCParser.initializer_return retval = new nesCParser.initializer_return();
        retval.start = input.LT(1);


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
            // nesC.g:732:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==AMP||LA83_0==BITCOMPLEMENT||LA83_0==BUILTIN_VA_ARG||LA83_0==CALL||LA83_0==CHARACTER_LITERAL||LA83_0==CONSTANT||LA83_0==LPARENS||LA83_0==MINUS||LA83_0==MINUSMINUS||LA83_0==NOT||LA83_0==PLUS||LA83_0==PLUSPLUS||LA83_0==POST||LA83_0==RAW_IDENTIFIER||LA83_0==SIGNAL||LA83_0==SIZEOF||LA83_0==STAR||LA83_0==STRING_LITERAL) ) {
                alt83=1;
            }
            else if ( (LA83_0==LBRACE) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }
            switch (alt83) {
                case 1 :
                    // nesC.g:732:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer6464);
                    assignment_expression278=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression278.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:733:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal279=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer6475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal279);


                    pushFollow(FOLLOW_initializer_list_in_initializer6477);
                    initializer_list280=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list280.getTree());

                    // nesC.g:733:31: ( ',' )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==COMMA) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // nesC.g:733:31: ','
                            {
                            char_literal281=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer6479); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal281);


                            }
                            break;

                    }


                    char_literal282=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer6482); if (state.failed) return retval; 
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
                    // 733:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // nesC.g:733:43: ^( INITIALIZER_LIST initializer_list )
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
    // nesC.g:737:1: initializer_list : ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ ;
    public final nesCParser.initializer_list_return initializer_list() throws RecognitionException {
        nesCParser.initializer_list_return retval = new nesCParser.initializer_list_return();
        retval.start = input.LT(1);


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
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // nesC.g:738:5: ( ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ )
            // nesC.g:738:10: ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            {
            // nesC.g:738:10: ( RAW_IDENTIFIER ':' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RAW_IDENTIFIER) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==199) ) {
                    alt84=1;
                }
            }
            switch (alt84) {
                case 1 :
                    // nesC.g:738:11: RAW_IDENTIFIER ':'
                    {
                    RAW_IDENTIFIER283=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER283);


                    char_literal284=(Token)match(input,199,FOLLOW_199_in_initializer_list6514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal284);


                    }
                    break;

            }


            pushFollow(FOLLOW_initializer_in_initializer_list6518);
            initializer285=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer285.getTree());

            // nesC.g:738:44: ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==COMMA) ) {
                    int LA86_1 = input.LA(2);

                    if ( (LA86_1==AMP||LA86_1==BITCOMPLEMENT||LA86_1==BUILTIN_VA_ARG||LA86_1==CALL||LA86_1==CHARACTER_LITERAL||LA86_1==CONSTANT||LA86_1==LBRACE||LA86_1==LPARENS||LA86_1==MINUS||LA86_1==MINUSMINUS||LA86_1==NOT||LA86_1==PLUS||LA86_1==PLUSPLUS||LA86_1==POST||LA86_1==RAW_IDENTIFIER||LA86_1==SIGNAL||LA86_1==SIZEOF||LA86_1==STAR||LA86_1==STRING_LITERAL) ) {
                        alt86=1;
                    }


                }


                switch (alt86) {
            	case 1 :
            	    // nesC.g:738:45: ',' ( RAW_IDENTIFIER ':' )? initializer
            	    {
            	    char_literal286=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list6521); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal286);


            	    // nesC.g:738:49: ( RAW_IDENTIFIER ':' )?
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
            	            // nesC.g:738:50: RAW_IDENTIFIER ':'
            	            {
            	            RAW_IDENTIFIER287=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6524); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER287);


            	            char_literal288=(Token)match(input,199,FOLLOW_199_in_initializer_list6526); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_199.add(char_literal288);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_initializer_in_initializer_list6530);
            	    initializer289=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer289.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
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
            // 739:13: -> ( initializer )+
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
    // nesC.g:749:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement );
    public final nesCParser.statement_return statement() throws RecognitionException {
        nesCParser.statement_return retval = new nesCParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.labeled_statement_return labeled_statement290 =null;

        nesCParser.compound_statement_return compound_statement291 =null;

        nesCParser.expression_statement_return expression_statement292 =null;

        nesCParser.selection_statement_return selection_statement293 =null;

        nesCParser.iteration_statement_return iteration_statement294 =null;

        nesCParser.jump_statement_return jump_statement295 =null;

        nesCParser.atomic_statement_return atomic_statement296 =null;



        try {
            // nesC.g:750:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement )
            int alt87=7;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==199) ) {
                    alt87=1;
                }
                else if ( ((LA87_1 >= AMP && LA87_1 <= AND)||LA87_1==ARROW||LA87_1==ASSIGN||LA87_1==BITANDASSIGN||(LA87_1 >= BITOR && LA87_1 <= BITXORASSIGN)||LA87_1==COMMA||(LA87_1 >= DIVASSIGN && LA87_1 <= DIVIDE)||LA87_1==DOT||LA87_1==EQUAL||(LA87_1 >= GREATER && LA87_1 <= GREATEREQUAL)||(LA87_1 >= LBRACKET && LA87_1 <= LESSEQUAL)||(LA87_1 >= LPARENS && LA87_1 <= MODASSIGN)||(LA87_1 >= MODULUS && LA87_1 <= MULASSIGN)||LA87_1==NOTEQUAL||LA87_1==OR||(LA87_1 >= PLUS && LA87_1 <= PLUSPLUS)||(LA87_1 >= RSHIFT && LA87_1 <= RSHIFTASSIGN)||LA87_1==STAR||LA87_1==200||LA87_1==202) ) {
                    alt87=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;

                }
                }
                break;
            case CASE:
            case DEFAULT:
                {
                alt87=1;
                }
                break;
            case LBRACE:
                {
                alt87=2;
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
                alt87=3;
                }
                break;
            case IF:
            case SWITCH:
                {
                alt87=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt87=5;
                }
                break;
            case BREAK:
            case CONTINUE:
            case GOTO:
            case RETURN:
                {
                alt87=6;
                }
                break;
            case ATOMIC:
                {
                alt87=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }

            switch (alt87) {
                case 1 :
                    // nesC.g:750:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement6579);
                    labeled_statement290=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement290.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:751:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement6590);
                    compound_statement291=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement291.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:752:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement6601);
                    expression_statement292=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement292.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:753:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement6612);
                    selection_statement293=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement293.getTree());

                    }
                    break;
                case 5 :
                    // nesC.g:754:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement6623);
                    iteration_statement294=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement294.getTree());

                    }
                    break;
                case 6 :
                    // nesC.g:755:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement6634);
                    jump_statement295=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement295.getTree());

                    }
                    break;
                case 7 :
                    // nesC.g:756:10: atomic_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atomic_statement_in_statement6645);
                    atomic_statement296=atomic_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomic_statement296.getTree());

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
    // nesC.g:760:1: atomic_statement : ATOMIC statement -> ^( ATOMIC statement ) ;
    public final nesCParser.atomic_statement_return atomic_statement() throws RecognitionException {
        nesCParser.atomic_statement_return retval = new nesCParser.atomic_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATOMIC297=null;
        nesCParser.statement_return statement298 =null;


        Object ATOMIC297_tree=null;
        RewriteRuleTokenStream stream_ATOMIC=new RewriteRuleTokenStream(adaptor,"token ATOMIC");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:761:5: ( ATOMIC statement -> ^( ATOMIC statement ) )
            // nesC.g:761:10: ATOMIC statement
            {
            ATOMIC297=(Token)match(input,ATOMIC,FOLLOW_ATOMIC_in_atomic_statement6666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATOMIC.add(ATOMIC297);


            pushFollow(FOLLOW_statement_in_atomic_statement6668);
            statement298=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement298.getTree());

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
            // 761:27: -> ^( ATOMIC statement )
            {
                // nesC.g:761:30: ^( ATOMIC statement )
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
    // nesC.g:763:1: labeled_statement : ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final nesCParser.labeled_statement_return labeled_statement() throws RecognitionException {
        nesCParser.labeled_statement_return retval = new nesCParser.labeled_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal300=null;
        Token CASE302=null;
        Token char_literal304=null;
        Token DEFAULT306=null;
        Token char_literal307=null;
        nesCParser.identifier_return identifier299 =null;

        nesCParser.statement_return statement301 =null;

        nesCParser.constant_expression_return constant_expression303 =null;

        nesCParser.statement_return statement305 =null;

        nesCParser.statement_return statement308 =null;


        Object char_literal300_tree=null;
        Object CASE302_tree=null;
        Object char_literal304_tree=null;
        Object DEFAULT306_tree=null;
        Object char_literal307_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:764:5: ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
            int alt88=3;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                alt88=1;
                }
                break;
            case CASE:
                {
                alt88=2;
                }
                break;
            case DEFAULT:
                {
                alt88=3;
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
                    // nesC.g:764:10: identifier ':' statement
                    {
                    pushFollow(FOLLOW_identifier_in_labeled_statement6695);
                    identifier299=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier299.getTree());

                    char_literal300=(Token)match(input,199,FOLLOW_199_in_labeled_statement6697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal300);


                    pushFollow(FOLLOW_statement_in_labeled_statement6699);
                    statement301=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement301.getTree());

                    // AST REWRITE
                    // elements: identifier, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 764:35: -> ^( LABELED_STATEMENT identifier statement )
                    {
                        // nesC.g:764:38: ^( LABELED_STATEMENT identifier statement )
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
                    // nesC.g:765:10: CASE constant_expression ':' statement
                    {
                    CASE302=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement6720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE302);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement6722);
                    constant_expression303=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression303.getTree());

                    char_literal304=(Token)match(input,199,FOLLOW_199_in_labeled_statement6724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal304);


                    pushFollow(FOLLOW_statement_in_labeled_statement6726);
                    statement305=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement305.getTree());

                    // AST REWRITE
                    // elements: CASE, constant_expression, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 765:49: -> ^( CASE constant_expression statement )
                    {
                        // nesC.g:765:52: ^( CASE constant_expression statement )
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
                    // nesC.g:766:10: DEFAULT ':' statement
                    {
                    DEFAULT306=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement6747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT306);


                    char_literal307=(Token)match(input,199,FOLLOW_199_in_labeled_statement6749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal307);


                    pushFollow(FOLLOW_statement_in_labeled_statement6751);
                    statement308=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement308.getTree());

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
                    // 766:32: -> ^( DEFAULT statement )
                    {
                        // nesC.g:766:35: ^( DEFAULT statement )
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
    // nesC.g:771:1: compound_statement : '{' ( declaration )* ( statement )* '}' -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* ) ;
    public final nesCParser.compound_statement_return compound_statement() throws RecognitionException {
        nesCParser.compound_statement_return retval = new nesCParser.compound_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal309=null;
        Token char_literal312=null;
        nesCParser.declaration_return declaration310 =null;

        nesCParser.statement_return statement311 =null;


        Object char_literal309_tree=null;
        Object char_literal312_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // nesC.g:772:5: ( '{' ( declaration )* ( statement )* '}' -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* ) )
            // nesC.g:772:10: '{' ( declaration )* ( statement )* '}'
            {
            char_literal309=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement6777); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal309);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:773:10: ( declaration )*
            loop89:
            do {
                int alt89=2;
                alt89 = dfa89.predict(input);
                switch (alt89) {
            	case 1 :
            	    // nesC.g:773:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_compound_statement6790);
            	    declaration310=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration310.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            // nesC.g:773:23: ( statement )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==AMP||LA90_0==ATOMIC||LA90_0==BITCOMPLEMENT||(LA90_0 >= BREAK && LA90_0 <= BUILTIN_VA_ARG)||(LA90_0 >= CALL && LA90_0 <= CASE)||LA90_0==CHARACTER_LITERAL||(LA90_0 >= CONSTANT && LA90_0 <= CONTINUE)||LA90_0==DEFAULT||LA90_0==DO||LA90_0==FOR||LA90_0==GOTO||LA90_0==IF||LA90_0==LBRACE||LA90_0==LPARENS||LA90_0==MINUS||LA90_0==MINUSMINUS||LA90_0==NOT||LA90_0==PLUS||LA90_0==PLUSPLUS||LA90_0==POST||LA90_0==RAW_IDENTIFIER||LA90_0==RETURN||LA90_0==SIGNAL||LA90_0==SIZEOF||LA90_0==STAR||LA90_0==STRING_LITERAL||LA90_0==SWITCH||LA90_0==WHILE||LA90_0==200) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // nesC.g:773:23: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compound_statement6793);
            	    statement311=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement311.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal312=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement6811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal312);


            // AST REWRITE
            // elements: statement, declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 774:44: -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* )
            {
                // nesC.g:774:47: ^( COMPOUND_STATEMENT ( declaration )* ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // nesC.g:774:68: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                // nesC.g:774:81: ( statement )*
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
    // nesC.g:780:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final nesCParser.expression_statement_return expression_statement() throws RecognitionException {
        nesCParser.expression_statement_return retval = new nesCParser.expression_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal314=null;
        nesCParser.expression_return expression313 =null;


        Object char_literal314_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // nesC.g:781:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // nesC.g:781:10: ( expression )? ';'
            {
            // nesC.g:781:10: ( expression )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==AMP||LA91_0==BITCOMPLEMENT||LA91_0==BUILTIN_VA_ARG||LA91_0==CALL||LA91_0==CHARACTER_LITERAL||LA91_0==CONSTANT||LA91_0==LPARENS||LA91_0==MINUS||LA91_0==MINUSMINUS||LA91_0==NOT||LA91_0==PLUS||LA91_0==PLUSPLUS||LA91_0==POST||LA91_0==RAW_IDENTIFIER||LA91_0==SIGNAL||LA91_0==SIZEOF||LA91_0==STAR||LA91_0==STRING_LITERAL) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // nesC.g:781:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement6842);
                    expression313=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression313.getTree());

                    }
                    break;

            }


            char_literal314=(Token)match(input,200,FOLLOW_200_in_expression_statement6845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal314);


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
            // 781:26: -> ^( STATEMENT ( expression )? )
            {
                // nesC.g:781:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // nesC.g:781:41: ( expression )?
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
    // nesC.g:789:1: selection_statement : ( ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement -> ^( IF expression $s1 $s2) | IF '(' expression ')' statement -> ^( IF expression statement ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final nesCParser.selection_statement_return selection_statement() throws RecognitionException {
        nesCParser.selection_statement_return retval = new nesCParser.selection_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF315=null;
        Token char_literal316=null;
        Token char_literal318=null;
        Token ELSE319=null;
        Token IF320=null;
        Token char_literal321=null;
        Token char_literal323=null;
        Token SWITCH325=null;
        Token char_literal326=null;
        Token char_literal328=null;
        nesCParser.statement_return s1 =null;

        nesCParser.statement_return s2 =null;

        nesCParser.expression_return expression317 =null;

        nesCParser.expression_return expression322 =null;

        nesCParser.statement_return statement324 =null;

        nesCParser.expression_return expression327 =null;

        nesCParser.statement_return statement329 =null;


        Object IF315_tree=null;
        Object char_literal316_tree=null;
        Object char_literal318_tree=null;
        Object ELSE319_tree=null;
        Object IF320_tree=null;
        Object char_literal321_tree=null;
        Object char_literal323_tree=null;
        Object SWITCH325_tree=null;
        Object char_literal326_tree=null;
        Object char_literal328_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:790:5: ( ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement -> ^( IF expression $s1 $s2) | IF '(' expression ')' statement -> ^( IF expression statement ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==IF) ) {
                int LA92_1 = input.LA(2);

                if ( (synpred11_nesC()) ) {
                    alt92=1;
                }
                else if ( (true) ) {
                    alt92=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA92_0==SWITCH) ) {
                alt92=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }
            switch (alt92) {
                case 1 :
                    // nesC.g:790:10: ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement
                    {
                    IF315=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF315);


                    char_literal316=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal316);


                    pushFollow(FOLLOW_expression_in_selection_statement6911);
                    expression317=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression317.getTree());

                    char_literal318=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal318);


                    pushFollow(FOLLOW_statement_in_selection_statement6917);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s1.getTree());

                    ELSE319=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement6919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE319);


                    pushFollow(FOLLOW_statement_in_selection_statement6923);
                    s2=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s2.getTree());

                    // AST REWRITE
                    // elements: IF, expression, s2, s1
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
                    // 792:14: -> ^( IF expression $s1 $s2)
                    {
                        // nesC.g:792:17: ^( IF expression $s1 $s2)
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
                    // nesC.g:793:10: IF '(' expression ')' statement
                    {
                    IF320=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF320);


                    char_literal321=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal321);


                    pushFollow(FOLLOW_expression_in_selection_statement6965);
                    expression322=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression322.getTree());

                    char_literal323=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal323);


                    pushFollow(FOLLOW_statement_in_selection_statement6969);
                    statement324=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement324.getTree());

                    // AST REWRITE
                    // elements: expression, IF, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 794:14: -> ^( IF expression statement )
                    {
                        // nesC.g:794:17: ^( IF expression statement )
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
                    // nesC.g:795:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH325=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement7003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH325);


                    char_literal326=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement7005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal326);


                    pushFollow(FOLLOW_expression_in_selection_statement7007);
                    expression327=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression327.getTree());

                    char_literal328=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement7009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal328);


                    pushFollow(FOLLOW_statement_in_selection_statement7011);
                    statement329=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement329.getTree());

                    // AST REWRITE
                    // elements: SWITCH, statement, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 796:14: -> ^( SWITCH expression statement )
                    {
                        // nesC.g:796:17: ^( SWITCH expression statement )
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
    // nesC.g:802:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final nesCParser.iteration_statement_return iteration_statement() throws RecognitionException {
        nesCParser.iteration_statement_return retval = new nesCParser.iteration_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE330=null;
        Token char_literal331=null;
        Token char_literal333=null;
        Token DO335=null;
        Token WHILE337=null;
        Token char_literal338=null;
        Token char_literal340=null;
        Token char_literal341=null;
        Token FOR342=null;
        Token char_literal343=null;
        Token char_literal344=null;
        Token char_literal345=null;
        Token char_literal346=null;
        nesCParser.expression_return init =null;

        nesCParser.expression_return cond =null;

        nesCParser.expression_return iter =null;

        nesCParser.expression_return expression332 =null;

        nesCParser.statement_return statement334 =null;

        nesCParser.statement_return statement336 =null;

        nesCParser.expression_return expression339 =null;

        nesCParser.statement_return statement347 =null;


        Object WHILE330_tree=null;
        Object char_literal331_tree=null;
        Object char_literal333_tree=null;
        Object DO335_tree=null;
        Object WHILE337_tree=null;
        Object char_literal338_tree=null;
        Object char_literal340_tree=null;
        Object char_literal341_tree=null;
        Object FOR342_tree=null;
        Object char_literal343_tree=null;
        Object char_literal344_tree=null;
        Object char_literal345_tree=null;
        Object char_literal346_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:803:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt96=1;
                }
                break;
            case DO:
                {
                alt96=2;
                }
                break;
            case FOR:
                {
                alt96=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;

            }

            switch (alt96) {
                case 1 :
                    // nesC.g:803:10: WHILE '(' expression ')' statement
                    {
                    WHILE330=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement7057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE330);


                    char_literal331=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement7059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal331);


                    pushFollow(FOLLOW_expression_in_iteration_statement7061);
                    expression332=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression332.getTree());

                    char_literal333=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement7063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal333);


                    pushFollow(FOLLOW_statement_in_iteration_statement7065);
                    statement334=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement334.getTree());

                    // AST REWRITE
                    // elements: expression, WHILE, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 803:45: -> ^( WHILE expression statement )
                    {
                        // nesC.g:803:48: ^( WHILE expression statement )
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
                    // nesC.g:804:10: DO statement WHILE '(' expression ')' ';'
                    {
                    DO335=(Token)match(input,DO,FOLLOW_DO_in_iteration_statement7086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO335);


                    pushFollow(FOLLOW_statement_in_iteration_statement7088);
                    statement336=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement336.getTree());

                    WHILE337=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement7090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE337);


                    char_literal338=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement7092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal338);


                    pushFollow(FOLLOW_expression_in_iteration_statement7094);
                    expression339=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression339.getTree());

                    char_literal340=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement7096); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal340);


                    char_literal341=(Token)match(input,200,FOLLOW_200_in_iteration_statement7098); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal341);


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
                    // 804:52: -> ^( DO statement expression )
                    {
                        // nesC.g:804:55: ^( DO statement expression )
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
                    // nesC.g:805:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR342=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement7119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR342);


                    char_literal343=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement7121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal343);


                    // nesC.g:805:22: (init= expression )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==AMP||LA93_0==BITCOMPLEMENT||LA93_0==BUILTIN_VA_ARG||LA93_0==CALL||LA93_0==CHARACTER_LITERAL||LA93_0==CONSTANT||LA93_0==LPARENS||LA93_0==MINUS||LA93_0==MINUSMINUS||LA93_0==NOT||LA93_0==PLUS||LA93_0==PLUSPLUS||LA93_0==POST||LA93_0==RAW_IDENTIFIER||LA93_0==SIGNAL||LA93_0==SIZEOF||LA93_0==STAR||LA93_0==STRING_LITERAL) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // nesC.g:805:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement7125);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal344=(Token)match(input,200,FOLLOW_200_in_iteration_statement7128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal344);


                    // nesC.g:805:43: (cond= expression )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==AMP||LA94_0==BITCOMPLEMENT||LA94_0==BUILTIN_VA_ARG||LA94_0==CALL||LA94_0==CHARACTER_LITERAL||LA94_0==CONSTANT||LA94_0==LPARENS||LA94_0==MINUS||LA94_0==MINUSMINUS||LA94_0==NOT||LA94_0==PLUS||LA94_0==PLUSPLUS||LA94_0==POST||LA94_0==RAW_IDENTIFIER||LA94_0==SIGNAL||LA94_0==SIZEOF||LA94_0==STAR||LA94_0==STRING_LITERAL) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // nesC.g:805:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement7132);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal345=(Token)match(input,200,FOLLOW_200_in_iteration_statement7135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal345);


                    // nesC.g:805:64: (iter= expression )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==AMP||LA95_0==BITCOMPLEMENT||LA95_0==BUILTIN_VA_ARG||LA95_0==CALL||LA95_0==CHARACTER_LITERAL||LA95_0==CONSTANT||LA95_0==LPARENS||LA95_0==MINUS||LA95_0==MINUSMINUS||LA95_0==NOT||LA95_0==PLUS||LA95_0==PLUSPLUS||LA95_0==POST||LA95_0==RAW_IDENTIFIER||LA95_0==SIGNAL||LA95_0==SIZEOF||LA95_0==STAR||LA95_0==STRING_LITERAL) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // nesC.g:805:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement7139);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal346=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement7142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal346);


                    pushFollow(FOLLOW_statement_in_iteration_statement7144);
                    statement347=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement347.getTree());

                    // AST REWRITE
                    // elements: init, statement, FOR, iter, cond
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
                    // 806:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // nesC.g:806:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // nesC.g:806:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // nesC.g:806:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:807:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // nesC.g:807:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:808:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // nesC.g:808:40: ( $iter)?
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
    // nesC.g:810:1: jump_statement : ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) );
    public final nesCParser.jump_statement_return jump_statement() throws RecognitionException {
        nesCParser.jump_statement_return retval = new nesCParser.jump_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GOTO348=null;
        Token char_literal350=null;
        Token CONTINUE351=null;
        Token char_literal352=null;
        Token BREAK353=null;
        Token char_literal354=null;
        Token RETURN355=null;
        Token char_literal357=null;
        nesCParser.identifier_return identifier349 =null;

        nesCParser.expression_return expression356 =null;


        Object GOTO348_tree=null;
        Object char_literal350_tree=null;
        Object CONTINUE351_tree=null;
        Object char_literal352_tree=null;
        Object BREAK353_tree=null;
        Object char_literal354_tree=null;
        Object RETURN355_tree=null;
        Object char_literal357_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_GOTO=new RewriteRuleTokenStream(adaptor,"token GOTO");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:811:5: ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
            int alt98=4;
            switch ( input.LA(1) ) {
            case GOTO:
                {
                alt98=1;
                }
                break;
            case CONTINUE:
                {
                alt98=2;
                }
                break;
            case BREAK:
                {
                alt98=3;
                }
                break;
            case RETURN:
                {
                alt98=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }

            switch (alt98) {
                case 1 :
                    // nesC.g:811:10: GOTO identifier ';'
                    {
                    GOTO348=(Token)match(input,GOTO,FOLLOW_GOTO_in_jump_statement7251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GOTO.add(GOTO348);


                    pushFollow(FOLLOW_identifier_in_jump_statement7253);
                    identifier349=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier349.getTree());

                    char_literal350=(Token)match(input,200,FOLLOW_200_in_jump_statement7255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal350);


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
                    // 811:30: -> ^( GOTO identifier )
                    {
                        // nesC.g:811:33: ^( GOTO identifier )
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
                    // nesC.g:812:10: CONTINUE ';'
                    {
                    CONTINUE351=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement7274); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE351);


                    char_literal352=(Token)match(input,200,FOLLOW_200_in_jump_statement7276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal352);


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
                    // 812:23: -> CONTINUE
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
                    // nesC.g:813:10: BREAK ';'
                    {
                    BREAK353=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement7291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK353);


                    char_literal354=(Token)match(input,200,FOLLOW_200_in_jump_statement7293); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal354);


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
                    // 813:20: -> BREAK
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
                    // nesC.g:814:10: RETURN ( expression )? ';'
                    {
                    RETURN355=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement7308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN355);


                    // nesC.g:814:17: ( expression )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==AMP||LA97_0==BITCOMPLEMENT||LA97_0==BUILTIN_VA_ARG||LA97_0==CALL||LA97_0==CHARACTER_LITERAL||LA97_0==CONSTANT||LA97_0==LPARENS||LA97_0==MINUS||LA97_0==MINUSMINUS||LA97_0==NOT||LA97_0==PLUS||LA97_0==PLUSPLUS||LA97_0==POST||LA97_0==RAW_IDENTIFIER||LA97_0==SIGNAL||LA97_0==SIZEOF||LA97_0==STAR||LA97_0==STRING_LITERAL) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // nesC.g:814:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_jump_statement7310);
                            expression356=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression356.getTree());

                            }
                            break;

                    }


                    char_literal357=(Token)match(input,200,FOLLOW_200_in_jump_statement7313); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal357);


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
                    // 814:33: -> ^( RETURN ( expression )? )
                    {
                        // nesC.g:814:36: ^( RETURN ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_RETURN.nextNode()
                        , root_1);

                        // nesC.g:814:45: ( expression )?
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
    // nesC.g:820:1: translation_unit : ( line_directive | external_declaration )+ ;
    public final nesCParser.translation_unit_return translation_unit() throws RecognitionException {
        nesCParser.translation_unit_return retval = new nesCParser.translation_unit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive358 =null;

        nesCParser.external_declaration_return external_declaration359 =null;



        try {
            // nesC.g:821:5: ( ( line_directive | external_declaration )+ )
            // nesC.g:821:10: ( line_directive | external_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:821:10: ( line_directive | external_declaration )+
            int cnt99=0;
            loop99:
            do {
                int alt99=3;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==HASH) ) {
                    alt99=1;
                }
                else if ( (LA99_0==ASYNC||LA99_0==AUTO||LA99_0==BUILTIN_VA_LIST||LA99_0==CHAR||LA99_0==COMMAND||LA99_0==CONST||(LA99_0 >= DOUBLE && LA99_0 <= DUTY)||LA99_0==ENUM||(LA99_0 >= EVENT && LA99_0 <= EXTERN)||LA99_0==FLOAT||(LA99_0 >= INLINE && LA99_0 <= INT8_T)||LA99_0==LONG||LA99_0==NORACE||(LA99_0 >= NXLE_INT16_T && LA99_0 <= NX_UNION)||LA99_0==RAW_IDENTIFIER||LA99_0==REGISTER||LA99_0==RESTRICT||LA99_0==SHORT||LA99_0==SIGNED||LA99_0==STATIC||LA99_0==STRUCT||(LA99_0 >= TASK && LA99_0 <= UINT8_T)||(LA99_0 >= UNION && LA99_0 <= UNSIGNED)||(LA99_0 >= VOID && LA99_0 <= VOLATILE)) ) {
                    alt99=2;
                }


                switch (alt99) {
            	case 1 :
            	    // nesC.g:821:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit7349);
            	    line_directive358=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive358.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:821:28: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit7353);
            	    external_declaration359=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration359.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt99 >= 1 ) break loop99;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(99, input);
                        throw eee;
                }
                cnt99++;
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
    // nesC.g:824:1: external_declaration : declaration ;
    public final nesCParser.external_declaration_return external_declaration() throws RecognitionException {
        nesCParser.external_declaration_return retval = new nesCParser.external_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_return declaration360 =null;



        try {
            // nesC.g:825:5: ( declaration )
            // nesC.g:825:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration7371);
            declaration360=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration360.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // nesC.g:839:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final nesCParser.line_directive_return line_directive() throws RecognitionException {
        nesCParser.line_directive_return retval = new nesCParser.line_directive_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal361=null;
        Token CONSTANT362=null;
        Token STRING_LITERAL363=null;
        Token CONSTANT364=null;

        Object char_literal361_tree=null;
        Object CONSTANT362_tree=null;
        Object STRING_LITERAL363_tree=null;
        Object CONSTANT364_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            // nesC.g:840:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // nesC.g:840:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )*
            {
            char_literal361=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive7398); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal361);


            CONSTANT362=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7400); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT362);


            STRING_LITERAL363=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive7402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL363);


            // nesC.g:840:38: ( CONSTANT )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==CONSTANT) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // nesC.g:840:38: CONSTANT
            	    {
            	    CONSTANT364=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7404); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT364);


            	    }
            	    break;

            	default :
            	    break loop100;
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
            // 840:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // nesC.g:840:51: ^( LINE_DIRECTIVE STRING_LITERAL )
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
    // nesC.g:845:1: function_definition : declaration_specifiers declarator ( attributes | gcc_attributes )? compound_statement -> declaration_specifiers declarator compound_statement ;
    public final nesCParser.function_definition_return function_definition() throws RecognitionException {
        nesCParser.function_definition_return retval = new nesCParser.function_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers365 =null;

        nesCParser.declarator_return declarator366 =null;

        nesCParser.attributes_return attributes367 =null;

        nesCParser.gcc_attributes_return gcc_attributes368 =null;

        nesCParser.compound_statement_return compound_statement369 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        RewriteRuleSubtreeStream stream_gcc_attributes=new RewriteRuleSubtreeStream(adaptor,"rule gcc_attributes");
        try {
            // nesC.g:846:5: ( declaration_specifiers declarator ( attributes | gcc_attributes )? compound_statement -> declaration_specifiers declarator compound_statement )
            // nesC.g:846:10: declaration_specifiers declarator ( attributes | gcc_attributes )? compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition7435);
            declaration_specifiers365=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers365.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition7437);
            declarator366=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator366.getTree());

            // nesC.g:846:44: ( attributes | gcc_attributes )?
            int alt101=3;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==ATTRIBUTE) ) {
                alt101=1;
            }
            else if ( (LA101_0==GCCATTRIBUTE) ) {
                alt101=2;
            }
            switch (alt101) {
                case 1 :
                    // nesC.g:846:45: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_function_definition7440);
                    attributes367=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes367.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:846:58: gcc_attributes
                    {
                    pushFollow(FOLLOW_gcc_attributes_in_function_definition7444);
                    gcc_attributes368=gcc_attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes368.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compound_statement_in_function_definition7448);
            compound_statement369=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement369.getTree());

            // AST REWRITE
            // elements: compound_statement, declarator, declaration_specifiers
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 847:13: -> declaration_specifiers declarator compound_statement
            {
                adaptor.addChild(root_0, stream_declaration_specifiers.nextTree());

                adaptor.addChild(root_0, stream_declarator.nextTree());

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
    // nesC.g:857:1: nesC_file : ( translation_unit )? large_scale_construct -> ^( FILE ( translation_unit )? large_scale_construct ) ;
    public final nesCParser.nesC_file_return nesC_file() throws RecognitionException {
        nesCParser.nesC_file_return retval = new nesCParser.nesC_file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit370 =null;

        nesCParser.large_scale_construct_return large_scale_construct371 =null;


        RewriteRuleSubtreeStream stream_large_scale_construct=new RewriteRuleSubtreeStream(adaptor,"rule large_scale_construct");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            // nesC.g:858:5: ( ( translation_unit )? large_scale_construct -> ^( FILE ( translation_unit )? large_scale_construct ) )
            // nesC.g:858:10: ( translation_unit )? large_scale_construct
            {
            // nesC.g:858:10: ( translation_unit )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==ASYNC||LA102_0==AUTO||LA102_0==BUILTIN_VA_LIST||LA102_0==CHAR||LA102_0==COMMAND||LA102_0==CONST||(LA102_0 >= DOUBLE && LA102_0 <= DUTY)||LA102_0==ENUM||(LA102_0 >= EVENT && LA102_0 <= EXTERN)||LA102_0==FLOAT||LA102_0==HASH||(LA102_0 >= INLINE && LA102_0 <= INT8_T)||LA102_0==LONG||LA102_0==NORACE||(LA102_0 >= NXLE_INT16_T && LA102_0 <= NX_UNION)||LA102_0==RAW_IDENTIFIER||LA102_0==REGISTER||LA102_0==RESTRICT||LA102_0==SHORT||LA102_0==SIGNED||LA102_0==STATIC||LA102_0==STRUCT||(LA102_0 >= TASK && LA102_0 <= UINT8_T)||(LA102_0 >= UNION && LA102_0 <= UNSIGNED)||(LA102_0 >= VOID && LA102_0 <= VOLATILE)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // nesC.g:858:10: translation_unit
                    {
                    pushFollow(FOLLOW_translation_unit_in_nesC_file7494);
                    translation_unit370=translation_unit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit370.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_large_scale_construct_in_nesC_file7497);
            large_scale_construct371=large_scale_construct();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_large_scale_construct.add(large_scale_construct371.getTree());

            // AST REWRITE
            // elements: large_scale_construct, translation_unit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 859:14: -> ^( FILE ( translation_unit )? large_scale_construct )
            {
                // nesC.g:859:17: ^( FILE ( translation_unit )? large_scale_construct )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FILE, "FILE")
                , root_1);

                // nesC.g:859:24: ( translation_unit )?
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
    // nesC.g:861:1: large_scale_construct : ( interface_definition | component );
    public final nesCParser.large_scale_construct_return large_scale_construct() throws RecognitionException {
        nesCParser.large_scale_construct_return retval = new nesCParser.large_scale_construct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.interface_definition_return interface_definition372 =null;

        nesCParser.component_return component373 =null;



        try {
            // nesC.g:862:5: ( interface_definition | component )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==INTERFACE) ) {
                alt103=1;
            }
            else if ( (LA103_0==COMPONENT||LA103_0==CONFIGURATION||LA103_0==GENERIC||LA103_0==MODULE) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }
            switch (alt103) {
                case 1 :
                    // nesC.g:862:10: interface_definition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interface_definition_in_large_scale_construct7536);
                    interface_definition372=interface_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interface_definition372.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:863:10: component
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_component_in_large_scale_construct7547);
                    component373=component();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, component373.getTree());

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
    // nesC.g:872:1: interface_definition : INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}' -> ^( INTERFACE identifier ( declaration )* ) ;
    public final nesCParser.interface_definition_return interface_definition() throws RecognitionException {
        nesCParser.interface_definition_return retval = new nesCParser.interface_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERFACE374=null;
        Token char_literal378=null;
        Token char_literal381=null;
        nesCParser.identifier_return identifier375 =null;

        nesCParser.type_parameters_return type_parameters376 =null;

        nesCParser.attributes_return attributes377 =null;

        nesCParser.line_directive_return line_directive379 =null;

        nesCParser.declaration_return declaration380 =null;


        Object INTERFACE374_tree=null;
        Object char_literal378_tree=null;
        Object char_literal381_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_type_parameters=new RewriteRuleSubtreeStream(adaptor,"rule type_parameters");
        try {
            // nesC.g:873:5: ( INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}' -> ^( INTERFACE identifier ( declaration )* ) )
            // nesC.g:873:10: INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}'
            {
            INTERFACE374=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_definition7573); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE374);


            pushFollow(FOLLOW_identifier_in_interface_definition7575);
            identifier375=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier375.getTree());

            // nesC.g:873:31: ( type_parameters )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==LESS) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // nesC.g:873:31: type_parameters
                    {
                    pushFollow(FOLLOW_type_parameters_in_interface_definition7577);
                    type_parameters376=type_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_parameters.add(type_parameters376.getTree());

                    }
                    break;

            }


            // nesC.g:873:48: ( attributes )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==ATTRIBUTE) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // nesC.g:873:48: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_interface_definition7580);
                    attributes377=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes377.getTree());

                    }
                    break;

            }


            char_literal378=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interface_definition7591); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal378);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:875:9: ( line_directive | declaration )*
            loop106:
            do {
                int alt106=3;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==HASH) ) {
                    alt106=1;
                }
                else if ( (LA106_0==ASYNC||LA106_0==AUTO||LA106_0==BUILTIN_VA_LIST||LA106_0==CHAR||LA106_0==COMMAND||LA106_0==CONST||(LA106_0 >= DOUBLE && LA106_0 <= DUTY)||LA106_0==ENUM||(LA106_0 >= EVENT && LA106_0 <= EXTERN)||LA106_0==FLOAT||(LA106_0 >= INLINE && LA106_0 <= INT8_T)||LA106_0==LONG||LA106_0==NORACE||(LA106_0 >= NXLE_INT16_T && LA106_0 <= NX_UNION)||LA106_0==RAW_IDENTIFIER||LA106_0==REGISTER||LA106_0==RESTRICT||LA106_0==SHORT||LA106_0==SIGNED||LA106_0==STATIC||LA106_0==STRUCT||(LA106_0 >= TASK && LA106_0 <= UINT8_T)||(LA106_0 >= UNION && LA106_0 <= UNSIGNED)||(LA106_0 >= VOID && LA106_0 <= VOLATILE)) ) {
                    alt106=2;
                }


                switch (alt106) {
            	case 1 :
            	    // nesC.g:875:10: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_interface_definition7604);
            	    line_directive379=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive379.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:875:27: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_interface_definition7608);
            	    declaration380=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration380.getTree());

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal381=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interface_definition7626); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal381);


            // AST REWRITE
            // elements: declaration, INTERFACE, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 877:13: -> ^( INTERFACE identifier ( declaration )* )
            {
                // nesC.g:877:16: ^( INTERFACE identifier ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:877:39: ( declaration )*
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
    // nesC.g:879:1: type_parameters : '<' type_parameter_list '>' ;
    public final nesCParser.type_parameters_return type_parameters() throws RecognitionException {
        nesCParser.type_parameters_return retval = new nesCParser.type_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal382=null;
        Token char_literal384=null;
        nesCParser.type_parameter_list_return type_parameter_list383 =null;


        Object char_literal382_tree=null;
        Object char_literal384_tree=null;

        try {
            // nesC.g:880:5: ( '<' type_parameter_list '>' )
            // nesC.g:880:10: '<' type_parameter_list '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal382=(Token)match(input,LESS,FOLLOW_LESS_in_type_parameters7668); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal382_tree = 
            (Object)adaptor.create(char_literal382)
            ;
            adaptor.addChild(root_0, char_literal382_tree);
            }

            pushFollow(FOLLOW_type_parameter_list_in_type_parameters7670);
            type_parameter_list383=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_parameter_list383.getTree());

            char_literal384=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_parameters7672); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal384_tree = 
            (Object)adaptor.create(char_literal384)
            ;
            adaptor.addChild(root_0, char_literal384_tree);
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
    // nesC.g:882:1: type_parameter_list : type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* ;
    public final nesCParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        nesCParser.type_parameter_list_return retval = new nesCParser.type_parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal387=null;
        nesCParser.type_specifier_return type_specifier385 =null;

        nesCParser.attributes_return attributes386 =null;

        nesCParser.type_specifier_return type_specifier388 =null;

        nesCParser.attributes_return attributes389 =null;


        Object char_literal387_tree=null;

        try {
            // nesC.g:883:5: ( type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* )
            // nesC.g:883:10: type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_specifier_in_type_parameter_list7691);
            type_specifier385=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier385.getTree());

            // nesC.g:883:25: ( attributes )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==ATTRIBUTE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // nesC.g:883:25: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_type_parameter_list7693);
                    attributes386=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes386.getTree());

                    }
                    break;

            }


            // nesC.g:883:37: ( ',' type_specifier ( attributes )? )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==COMMA) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // nesC.g:883:38: ',' type_specifier ( attributes )?
            	    {
            	    char_literal387=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_parameter_list7697); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal387_tree = 
            	    (Object)adaptor.create(char_literal387)
            	    ;
            	    adaptor.addChild(root_0, char_literal387_tree);
            	    }

            	    pushFollow(FOLLOW_type_specifier_in_type_parameter_list7699);
            	    type_specifier388=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier388.getTree());

            	    // nesC.g:883:57: ( attributes )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==ATTRIBUTE) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // nesC.g:883:57: attributes
            	            {
            	            pushFollow(FOLLOW_attributes_in_type_parameter_list7701);
            	            attributes389=attributes();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes389.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "type_parameter_list"


    public static class component_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component"
    // nesC.g:888:1: component : component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) ;
    public final nesCParser.component_return component() throws RecognitionException {
        nesCParser.component_return retval = new nesCParser.component_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.component_kind_return component_kind390 =null;

        nesCParser.identifier_return identifier391 =null;

        nesCParser.component_parameters_return component_parameters392 =null;

        nesCParser.attributes_return attributes393 =null;

        nesCParser.component_specification_return component_specification394 =null;

        nesCParser.implementation_return implementation395 =null;


        RewriteRuleSubtreeStream stream_component_parameters=new RewriteRuleSubtreeStream(adaptor,"rule component_parameters");
        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_component_kind=new RewriteRuleSubtreeStream(adaptor,"rule component_kind");
        try {
            // nesC.g:889:5: ( component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) )
            // nesC.g:889:9: component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )?
            {
            pushFollow(FOLLOW_component_kind_in_component7723);
            component_kind390=component_kind();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_kind.add(component_kind390.getTree());

            pushFollow(FOLLOW_identifier_in_component7725);
            identifier391=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier391.getTree());

            // nesC.g:889:35: ( component_parameters )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==LPARENS) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // nesC.g:889:35: component_parameters
                    {
                    pushFollow(FOLLOW_component_parameters_in_component7727);
                    component_parameters392=component_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameters.add(component_parameters392.getTree());

                    }
                    break;

            }


            // nesC.g:889:57: ( attributes )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ATTRIBUTE) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // nesC.g:889:57: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_component7730);
                    attributes393=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes393.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_component_specification_in_component7741);
            component_specification394=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification394.getTree());

            // nesC.g:891:9: ( implementation )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==IMPLEMENTATION) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // nesC.g:891:9: implementation
                    {
                    pushFollow(FOLLOW_implementation_in_component7751);
                    implementation395=implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementation.add(implementation395.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: component_parameters, implementation, component_specification, identifier, component_kind
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 891:25: -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
            {
                // nesC.g:891:28: ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DEFINITION, "COMPONENT_DEFINITION")
                , root_1);

                adaptor.addChild(root_1, stream_component_kind.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_component_specification.nextTree());

                // nesC.g:891:101: ( implementation )?
                if ( stream_implementation.hasNext() ) {
                    adaptor.addChild(root_1, stream_implementation.nextTree());

                }
                stream_implementation.reset();

                // nesC.g:891:117: ( component_parameters )?
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
    // nesC.g:896:1: component_kind : ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) );
    public final nesCParser.component_kind_return component_kind() throws RecognitionException {
        nesCParser.component_kind_return retval = new nesCParser.component_kind_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MODULE396=null;
        Token CONFIGURATION397=null;
        Token COMPONENT398=null;
        Token GENERIC399=null;
        Token MODULE400=null;
        Token GENERIC401=null;
        Token CONFIGURATION402=null;

        Object MODULE396_tree=null;
        Object CONFIGURATION397_tree=null;
        Object COMPONENT398_tree=null;
        Object GENERIC399_tree=null;
        Object MODULE400_tree=null;
        Object GENERIC401_tree=null;
        Object CONFIGURATION402_tree=null;
        RewriteRuleTokenStream stream_CONFIGURATION=new RewriteRuleTokenStream(adaptor,"token CONFIGURATION");
        RewriteRuleTokenStream stream_GENERIC=new RewriteRuleTokenStream(adaptor,"token GENERIC");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_COMPONENT=new RewriteRuleTokenStream(adaptor,"token COMPONENT");

        try {
            // nesC.g:897:5: ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) )
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
                    // nesC.g:897:10: MODULE
                    {
                    MODULE396=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7788); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE396);


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
                    // 897:32: -> ^( COMPONENT_KIND MODULE )
                    {
                        // nesC.g:897:35: ^( COMPONENT_KIND MODULE )
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
                    // nesC.g:898:10: CONFIGURATION
                    {
                    CONFIGURATION397=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION397);


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
                    // 898:32: -> ^( COMPONENT_KIND CONFIGURATION )
                    {
                        // nesC.g:898:35: ^( COMPONENT_KIND CONFIGURATION )
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
                    // nesC.g:899:10: COMPONENT
                    {
                    COMPONENT398=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_component_kind7849); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMPONENT.add(COMPONENT398);


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
                    // 899:32: -> ^( COMPONENT_KIND COMPONENT )
                    {
                        // nesC.g:899:35: ^( COMPONENT_KIND COMPONENT )
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
                    // nesC.g:900:10: GENERIC MODULE
                    {
                    GENERIC399=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7880); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC399);


                    MODULE400=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE400);


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
                    // 900:32: -> ^( COMPONENT_KIND GENERIC MODULE )
                    {
                        // nesC.g:900:35: ^( COMPONENT_KIND GENERIC MODULE )
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
                    // nesC.g:901:10: GENERIC CONFIGURATION
                    {
                    GENERIC401=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7910); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC401);


                    CONFIGURATION402=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION402);


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
                    // 901:32: -> ^( COMPONENT_KIND GENERIC CONFIGURATION )
                    {
                        // nesC.g:901:35: ^( COMPONENT_KIND GENERIC CONFIGURATION )
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
    // nesC.g:903:1: implementation : IMPLEMENTATION '{' body '}' -> ^( IMPLEMENTATION ( body )? ) ;
    public final nesCParser.implementation_return implementation() throws RecognitionException {
        nesCParser.implementation_return retval = new nesCParser.implementation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLEMENTATION403=null;
        Token char_literal404=null;
        Token char_literal406=null;
        nesCParser.body_return body405 =null;


        Object IMPLEMENTATION403_tree=null;
        Object char_literal404_tree=null;
        Object char_literal406_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // nesC.g:904:5: ( IMPLEMENTATION '{' body '}' -> ^( IMPLEMENTATION ( body )? ) )
            // nesC.g:904:10: IMPLEMENTATION '{' body '}'
            {
            IMPLEMENTATION403=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_implementation7941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION403);


            char_literal404=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_implementation7943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal404);


            pushFollow(FOLLOW_body_in_implementation7945);
            body405=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body405.getTree());

            char_literal406=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_implementation7947); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal406);


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
            // 905:14: -> ^( IMPLEMENTATION ( body )? )
            {
                // nesC.g:905:17: ^( IMPLEMENTATION ( body )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLEMENTATION.nextNode()
                , root_1);

                // nesC.g:905:34: ( body )?
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
    // nesC.g:911:1: component_parameters : '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) ;
    public final nesCParser.component_parameters_return component_parameters() throws RecognitionException {
        nesCParser.component_parameters_return retval = new nesCParser.component_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal407=null;
        Token char_literal409=null;
        nesCParser.component_parameter_list_return component_parameter_list408 =null;


        Object char_literal407_tree=null;
        Object char_literal409_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter_list");
        try {
            // nesC.g:912:5: ( '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) )
            // nesC.g:912:10: '(' ( component_parameter_list )? ')'
            {
            char_literal407=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_parameters7988); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPARENS.add(char_literal407);


            // nesC.g:912:14: ( component_parameter_list )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ASYNC||LA114_0==AUTO||LA114_0==BUILTIN_VA_LIST||LA114_0==CHAR||LA114_0==COMMAND||LA114_0==CONST||(LA114_0 >= DOUBLE && LA114_0 <= DUTY)||LA114_0==ENUM||(LA114_0 >= EVENT && LA114_0 <= EXTERN)||LA114_0==FLOAT||(LA114_0 >= INLINE && LA114_0 <= INT8_T)||LA114_0==LONG||LA114_0==NORACE||(LA114_0 >= NXLE_INT16_T && LA114_0 <= NX_UNION)||LA114_0==RAW_IDENTIFIER||LA114_0==REGISTER||LA114_0==RESTRICT||LA114_0==SHORT||LA114_0==SIGNED||LA114_0==STATIC||LA114_0==STRUCT||(LA114_0 >= TASK && LA114_0 <= UINT8_T)||(LA114_0 >= UNION && LA114_0 <= UNSIGNED)||(LA114_0 >= VOID && LA114_0 <= VOLATILE)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // nesC.g:912:14: component_parameter_list
                    {
                    pushFollow(FOLLOW_component_parameter_list_in_component_parameters7990);
                    component_parameter_list408=component_parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameter_list.add(component_parameter_list408.getTree());

                    }
                    break;

            }


            char_literal409=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_parameters7993); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPARENS.add(char_literal409);


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
            // 913:13: -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
            {
                // nesC.g:913:16: ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_PARAMETER_LIST, "COMPONENT_PARAMETER_LIST")
                , root_1);

                // nesC.g:913:43: ( component_parameter_list )?
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
    // nesC.g:915:1: component_parameter_list : component_parameter ( ',' component_parameter )* -> ( component_parameter )+ ;
    public final nesCParser.component_parameter_list_return component_parameter_list() throws RecognitionException {
        nesCParser.component_parameter_list_return retval = new nesCParser.component_parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal411=null;
        nesCParser.component_parameter_return component_parameter410 =null;

        nesCParser.component_parameter_return component_parameter412 =null;


        Object char_literal411_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_parameter=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter");
        try {
            // nesC.g:916:5: ( component_parameter ( ',' component_parameter )* -> ( component_parameter )+ )
            // nesC.g:916:10: component_parameter ( ',' component_parameter )*
            {
            pushFollow(FOLLOW_component_parameter_in_component_parameter_list8033);
            component_parameter410=component_parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter410.getTree());

            // nesC.g:916:30: ( ',' component_parameter )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==COMMA) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // nesC.g:916:31: ',' component_parameter
            	    {
            	    char_literal411=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_parameter_list8036); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal411);


            	    pushFollow(FOLLOW_component_parameter_in_component_parameter_list8038);
            	    component_parameter412=component_parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter412.getTree());

            	    }
            	    break;

            	default :
            	    break loop115;
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
            // 916:57: -> ( component_parameter )+
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
    // nesC.g:918:1: component_parameter : ( parameter_declaration | TYPEDEF identifier ( attributes )? );
    public final nesCParser.component_parameter_return component_parameter() throws RecognitionException {
        nesCParser.component_parameter_return retval = new nesCParser.component_parameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TYPEDEF414=null;
        nesCParser.parameter_declaration_return parameter_declaration413 =null;

        nesCParser.identifier_return identifier415 =null;

        nesCParser.attributes_return attributes416 =null;


        Object TYPEDEF414_tree=null;

        try {
            // nesC.g:919:5: ( parameter_declaration | TYPEDEF identifier ( attributes )? )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==ASYNC||LA117_0==AUTO||LA117_0==BUILTIN_VA_LIST||LA117_0==CHAR||LA117_0==COMMAND||LA117_0==CONST||(LA117_0 >= DOUBLE && LA117_0 <= DUTY)||LA117_0==ENUM||(LA117_0 >= EVENT && LA117_0 <= EXTERN)||LA117_0==FLOAT||(LA117_0 >= INLINE && LA117_0 <= INT8_T)||LA117_0==LONG||LA117_0==NORACE||(LA117_0 >= NXLE_INT16_T && LA117_0 <= NX_UNION)||LA117_0==RAW_IDENTIFIER||LA117_0==REGISTER||LA117_0==RESTRICT||LA117_0==SHORT||LA117_0==SIGNED||LA117_0==STATIC||LA117_0==STRUCT||LA117_0==TASK||(LA117_0 >= UINT16_T && LA117_0 <= UINT8_T)||(LA117_0 >= UNION && LA117_0 <= UNSIGNED)||(LA117_0 >= VOID && LA117_0 <= VOLATILE)) ) {
                alt117=1;
            }
            else if ( (LA117_0==TYPEDEF) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;

            }
            switch (alt117) {
                case 1 :
                    // nesC.g:919:10: parameter_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_parameter_declaration_in_component_parameter8064);
                    parameter_declaration413=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_declaration413.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:920:10: TYPEDEF identifier ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TYPEDEF414=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_component_parameter8075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPEDEF414_tree = 
                    (Object)adaptor.create(TYPEDEF414)
                    ;
                    adaptor.addChild(root_0, TYPEDEF414_tree);
                    }

                    pushFollow(FOLLOW_identifier_in_component_parameter8077);
                    identifier415=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier415.getTree());

                    // nesC.g:920:29: ( attributes )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==ATTRIBUTE) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // nesC.g:920:29: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_component_parameter8079);
                            attributes416=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes416.getTree());

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
    // nesC.g:922:1: body : ( ( configuration_body )=> configuration_body | module_body );
    public final nesCParser.body_return body() throws RecognitionException {
        nesCParser.body_return retval = new nesCParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.configuration_body_return configuration_body417 =null;

        nesCParser.module_body_return module_body418 =null;



        try {
            // nesC.g:923:5: ( ( configuration_body )=> configuration_body | module_body )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==HASH) ) {
                int LA118_1 = input.LA(2);

                if ( (LA118_1==CONSTANT) ) {
                    int LA118_8 = input.LA(3);

                    if ( (LA118_8==STRING_LITERAL) ) {
                        int LA118_14 = input.LA(4);

                        if ( (synpred12_nesC()) ) {
                            alt118=1;
                        }
                        else if ( (true) ) {
                            alt118=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 118, 14, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 8, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 118, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA118_0==COMPONENTS) && (synpred12_nesC())) {
                alt118=1;
            }
            else if ( (LA118_0==ACTIVATE) && (synpred12_nesC())) {
                alt118=1;
            }
            else if ( (LA118_0==RAW_IDENTIFIER) ) {
                int LA118_4 = input.LA(2);

                if ( (LA118_4==DOT) && (synpred12_nesC())) {
                    alt118=1;
                }
                else if ( (LA118_4==ASSIGN) && (synpred12_nesC())) {
                    alt118=1;
                }
                else if ( (LA118_4==ARROW) && (synpred12_nesC())) {
                    alt118=1;
                }
                else if ( (LA118_4==201) && (synpred12_nesC())) {
                    alt118=1;
                }
                else if ( (LA118_4==LBRACKET) && (synpred12_nesC())) {
                    alt118=1;
                }
                else if ( (LA118_4==ASYNC||LA118_4==AUTO||LA118_4==BUILTIN_VA_LIST||LA118_4==CHAR||LA118_4==COMMAND||LA118_4==CONST||(LA118_4 >= DOUBLE && LA118_4 <= DUTY)||LA118_4==ENUM||(LA118_4 >= EVENT && LA118_4 <= EXTERN)||LA118_4==FLOAT||LA118_4==GCCATTRIBUTE||(LA118_4 >= INLINE && LA118_4 <= INT8_T)||(LA118_4 >= LONG && LA118_4 <= LPARENS)||LA118_4==NORACE||(LA118_4 >= NXLE_INT16_T && LA118_4 <= NX_UNION)||LA118_4==RAW_IDENTIFIER||LA118_4==REGISTER||LA118_4==RESTRICT||LA118_4==SHORT||LA118_4==SIGNED||LA118_4==STAR||LA118_4==STATIC||LA118_4==STRUCT||LA118_4==TASK||(LA118_4 >= UINT16_T && LA118_4 <= UINT8_T)||(LA118_4 >= UNION && LA118_4 <= UNSIGNED)||(LA118_4 >= VOID && LA118_4 <= VOLATILE)||LA118_4==200) ) {
                    alt118=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 118, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA118_0==LBRACKET) && (synpred12_nesC())) {
                alt118=1;
            }
            else if ( (LA118_0==RBRACE) && (synpred12_nesC())) {
                alt118=1;
            }
            else if ( (LA118_0==ASYNC||LA118_0==AUTO||LA118_0==BUILTIN_VA_LIST||LA118_0==CHAR||LA118_0==COMMAND||LA118_0==CONST||(LA118_0 >= DOUBLE && LA118_0 <= DUTY)||LA118_0==ENUM||(LA118_0 >= EVENT && LA118_0 <= EXTERN)||LA118_0==FLOAT||(LA118_0 >= INLINE && LA118_0 <= INT8_T)||LA118_0==LONG||LA118_0==NORACE||(LA118_0 >= NXLE_INT16_T && LA118_0 <= NX_UNION)||LA118_0==REGISTER||LA118_0==RESTRICT||LA118_0==SHORT||LA118_0==SIGNED||LA118_0==STATIC||LA118_0==STRUCT||(LA118_0 >= TASK && LA118_0 <= UINT8_T)||(LA118_0 >= UNION && LA118_0 <= UNSIGNED)||(LA118_0 >= VOID && LA118_0 <= VOLATILE)) ) {
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
                    // nesC.g:923:10: ( configuration_body )=> configuration_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_configuration_body_in_body8105);
                    configuration_body417=configuration_body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_body417.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:924:10: module_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_module_body_in_body8116);
                    module_body418=module_body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, module_body418.getTree());

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
    // nesC.g:929:1: configuration_body : ( configuration_element_list )? ;
    public final nesCParser.configuration_body_return configuration_body() throws RecognitionException {
        nesCParser.configuration_body_return retval = new nesCParser.configuration_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.configuration_element_list_return configuration_element_list419 =null;



        try {
            // nesC.g:930:5: ( ( configuration_element_list )? )
            // nesC.g:930:10: ( configuration_element_list )?
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:931:10: ( configuration_element_list )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==ACTIVATE||LA119_0==COMPONENTS||LA119_0==HASH||LA119_0==LBRACKET||LA119_0==RAW_IDENTIFIER) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // nesC.g:931:10: configuration_element_list
                    {
                    pushFollow(FOLLOW_configuration_element_list_in_configuration_body8145);
                    configuration_element_list419=configuration_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element_list419.getTree());

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
    // nesC.g:935:1: module_body : translation_unit ;
    public final nesCParser.module_body_return module_body() throws RecognitionException {
        nesCParser.module_body_return retval = new nesCParser.module_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit420 =null;



        try {
            // nesC.g:936:5: ( translation_unit )
            // nesC.g:936:10: translation_unit
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_body8188);
            translation_unit420=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, translation_unit420.getTree());

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
    // nesC.g:940:1: configuration_element_list : ( line_directive | configuration_element )+ ;
    public final nesCParser.configuration_element_list_return configuration_element_list() throws RecognitionException {
        nesCParser.configuration_element_list_return retval = new nesCParser.configuration_element_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive421 =null;

        nesCParser.configuration_element_return configuration_element422 =null;



        try {
            // nesC.g:941:5: ( ( line_directive | configuration_element )+ )
            // nesC.g:941:10: ( line_directive | configuration_element )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:941:10: ( line_directive | configuration_element )+
            int cnt120=0;
            loop120:
            do {
                int alt120=3;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==HASH) ) {
                    alt120=1;
                }
                else if ( (LA120_0==ACTIVATE||LA120_0==COMPONENTS||LA120_0==LBRACKET||LA120_0==RAW_IDENTIFIER) ) {
                    alt120=2;
                }


                switch (alt120) {
            	case 1 :
            	    // nesC.g:941:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_configuration_element_list8215);
            	    line_directive421=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive421.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:941:28: configuration_element
            	    {
            	    pushFollow(FOLLOW_configuration_element_in_configuration_element_list8219);
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
        }
        return retval;
    }
    // $ANTLR end "configuration_element_list"


    public static class configuration_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configuration_element"
    // nesC.g:943:1: configuration_element : ( components | connection );
    public final nesCParser.configuration_element_return configuration_element() throws RecognitionException {
        nesCParser.configuration_element_return retval = new nesCParser.configuration_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.components_return components423 =null;

        nesCParser.connection_return connection424 =null;



        try {
            // nesC.g:944:5: ( components | connection )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==COMPONENTS) ) {
                alt121=1;
            }
            else if ( (LA121_0==ACTIVATE||LA121_0==LBRACKET||LA121_0==RAW_IDENTIFIER) ) {
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
                    // nesC.g:944:10: components
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_components_in_configuration_element8240);
                    components423=components();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, components423.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:945:10: connection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_connection_in_configuration_element8251);
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
        }
        return retval;
    }
    // $ANTLR end "configuration_element"


    public static class components_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "components"
    // nesC.g:953:1: components : COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) ;
    public final nesCParser.components_return components() throws RecognitionException {
        nesCParser.components_return retval = new nesCParser.components_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMPONENTS425=null;
        Token char_literal427=null;
        nesCParser.component_line_return component_line426 =null;


        Object COMPONENTS425_tree=null;
        Object char_literal427_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_COMPONENTS=new RewriteRuleTokenStream(adaptor,"token COMPONENTS");
        RewriteRuleSubtreeStream stream_component_line=new RewriteRuleSubtreeStream(adaptor,"rule component_line");
        try {
            // nesC.g:954:5: ( COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) )
            // nesC.g:954:10: COMPONENTS component_line ';'
            {
            COMPONENTS425=(Token)match(input,COMPONENTS,FOLLOW_COMPONENTS_in_components8296); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPONENTS.add(COMPONENTS425);


            pushFollow(FOLLOW_component_line_in_components8298);
            component_line426=component_line();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_line.add(component_line426.getTree());

            char_literal427=(Token)match(input,200,FOLLOW_200_in_components8300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal427);


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
            // 954:40: -> ^( COMPONENTS component_line )
            {
                // nesC.g:954:43: ^( COMPONENTS component_line )
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
    // nesC.g:956:1: component_line : component_declaration ( ',' component_declaration )* -> ( component_declaration )+ ;
    public final nesCParser.component_line_return component_line() throws RecognitionException {
        nesCParser.component_line_return retval = new nesCParser.component_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal429=null;
        nesCParser.component_declaration_return component_declaration428 =null;

        nesCParser.component_declaration_return component_declaration430 =null;


        Object char_literal429_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_declaration=new RewriteRuleSubtreeStream(adaptor,"rule component_declaration");
        try {
            // nesC.g:957:5: ( component_declaration ( ',' component_declaration )* -> ( component_declaration )+ )
            // nesC.g:957:10: component_declaration ( ',' component_declaration )*
            {
            pushFollow(FOLLOW_component_declaration_in_component_line8327);
            component_declaration428=component_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration428.getTree());

            // nesC.g:957:32: ( ',' component_declaration )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==COMMA) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // nesC.g:957:33: ',' component_declaration
            	    {
            	    char_literal429=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_line8330); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal429);


            	    pushFollow(FOLLOW_component_declaration_in_component_line8332);
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
            // 957:61: -> ( component_declaration )+
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
    // nesC.g:959:1: component_declaration : component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) ;
    public final nesCParser.component_declaration_return component_declaration() throws RecognitionException {
        nesCParser.component_declaration_return retval = new nesCParser.component_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS432=null;
        nesCParser.component_ref_return component_ref431 =null;

        nesCParser.identifier_return identifier433 =null;


        Object AS432_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_component_ref=new RewriteRuleSubtreeStream(adaptor,"rule component_ref");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:960:5: ( component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) )
            // nesC.g:960:10: component_ref ( AS identifier )?
            {
            pushFollow(FOLLOW_component_ref_in_component_declaration8358);
            component_ref431=component_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_ref.add(component_ref431.getTree());

            // nesC.g:960:24: ( AS identifier )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==AS) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // nesC.g:960:25: AS identifier
                    {
                    AS432=(Token)match(input,AS,FOLLOW_AS_in_component_declaration8361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS432);


                    pushFollow(FOLLOW_identifier_in_component_declaration8363);
                    identifier433=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier433.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: component_ref, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 960:41: -> ^( COMPONENT_DECLARATION component_ref ( identifier )? )
            {
                // nesC.g:960:44: ^( COMPONENT_DECLARATION component_ref ( identifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DECLARATION, "COMPONENT_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_component_ref.nextTree());

                // nesC.g:960:82: ( identifier )?
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
    // nesC.g:966:1: component_ref : ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) );
    public final nesCParser.component_ref_return component_ref() throws RecognitionException {
        nesCParser.component_ref_return retval = new nesCParser.component_ref_return();
        retval.start = input.LT(1);


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
            // nesC.g:967:5: ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) )
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
                    // nesC.g:967:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_component_ref8401);
                    identifier434=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier434.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:968:10: NEW identifier '(' ( component_argument_list )? ')'
                    {
                    NEW435=(Token)match(input,NEW,FOLLOW_NEW_in_component_ref8412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW435);


                    pushFollow(FOLLOW_identifier_in_component_ref8414);
                    identifier436=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier436.getTree());

                    char_literal437=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_ref8416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal437);


                    // nesC.g:968:29: ( component_argument_list )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==AMP||LA124_0==BITCOMPLEMENT||(LA124_0 >= BUILTIN_VA_ARG && LA124_0 <= CALL)||(LA124_0 >= CHAR && LA124_0 <= CHARACTER_LITERAL)||(LA124_0 >= CONST && LA124_0 <= CONSTANT)||LA124_0==DOUBLE||LA124_0==ENUM||LA124_0==FLOAT||(LA124_0 >= INT && LA124_0 <= INT8_T)||(LA124_0 >= LONG && LA124_0 <= LPARENS)||LA124_0==MINUS||LA124_0==MINUSMINUS||LA124_0==NOT||(LA124_0 >= NXLE_INT16_T && LA124_0 <= NX_UNION)||LA124_0==PLUS||LA124_0==PLUSPLUS||LA124_0==POST||LA124_0==RAW_IDENTIFIER||LA124_0==RESTRICT||(LA124_0 >= SHORT && LA124_0 <= SIZEOF)||LA124_0==STAR||(LA124_0 >= STRING_LITERAL && LA124_0 <= STRUCT)||(LA124_0 >= UINT16_T && LA124_0 <= UINT8_T)||(LA124_0 >= UNION && LA124_0 <= UNSIGNED)||(LA124_0 >= VOID && LA124_0 <= VOLATILE)) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // nesC.g:968:29: component_argument_list
                            {
                            pushFollow(FOLLOW_component_argument_list_in_component_ref8418);
                            component_argument_list438=component_argument_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_component_argument_list.add(component_argument_list438.getTree());

                            }
                            break;

                    }


                    char_literal439=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_ref8421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal439);


                    // AST REWRITE
                    // elements: identifier, component_argument_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 969:13: -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                    {
                        // nesC.g:969:16: ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_INSTANTIATION, "COMPONENT_INSTANTIATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:969:53: ( component_argument_list )?
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
    // nesC.g:976:1: component_argument_list : component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) ;
    public final nesCParser.component_argument_list_return component_argument_list() throws RecognitionException {
        nesCParser.component_argument_list_return retval = new nesCParser.component_argument_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal441=null;
        nesCParser.component_argument_return component_argument440 =null;

        nesCParser.component_argument_return component_argument442 =null;


        Object char_literal441_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_argument=new RewriteRuleSubtreeStream(adaptor,"rule component_argument");
        try {
            // nesC.g:977:5: ( component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) )
            // nesC.g:977:10: component_argument ( ',' component_argument )*
            {
            pushFollow(FOLLOW_component_argument_in_component_argument_list8468);
            component_argument440=component_argument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_argument.add(component_argument440.getTree());

            // nesC.g:977:29: ( ',' component_argument )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==COMMA) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // nesC.g:977:30: ',' component_argument
            	    {
            	    char_literal441=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_argument_list8471); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal441);


            	    pushFollow(FOLLOW_component_argument_in_component_argument_list8473);
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
            // 978:13: -> ^( COMPONENT_ARGUMENTS ( component_argument )+ )
            {
                // nesC.g:978:16: ^( COMPONENT_ARGUMENTS ( component_argument )+ )
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
    // nesC.g:980:1: component_argument : ( assignment_expression | type_name );
    public final nesCParser.component_argument_return component_argument() throws RecognitionException {
        nesCParser.component_argument_return retval = new nesCParser.component_argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.assignment_expression_return assignment_expression443 =null;

        nesCParser.type_name_return type_name444 =null;



        try {
            // nesC.g:981:5: ( assignment_expression | type_name )
            int alt127=2;
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
                alt127=1;
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA127_2 = input.LA(2);

                if ( (( !symbols.isType(input.LT(1).getText()) )) ) {
                    alt127=1;
                }
                else if ( (( symbols.isType(input.LT(1).getText()) )) ) {
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
                    // nesC.g:981:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_component_argument8515);
                    assignment_expression443=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression443.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:982:10: type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_name_in_component_argument8526);
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
        }
        return retval;
    }
    // $ANTLR end "component_argument"


    public static class connection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "connection"
    // nesC.g:988:1: connection : ( certificate_specification )? endpoint wire_rhs ';' -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? ) ;
    public final nesCParser.connection_return connection() throws RecognitionException {
        nesCParser.connection_return retval = new nesCParser.connection_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal448=null;
        nesCParser.certificate_specification_return certificate_specification445 =null;

        nesCParser.endpoint_return endpoint446 =null;

        nesCParser.wire_rhs_return wire_rhs447 =null;


        Object char_literal448_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_certificate_specification=new RewriteRuleSubtreeStream(adaptor,"rule certificate_specification");
        RewriteRuleSubtreeStream stream_wire_rhs=new RewriteRuleSubtreeStream(adaptor,"rule wire_rhs");
        RewriteRuleSubtreeStream stream_endpoint=new RewriteRuleSubtreeStream(adaptor,"rule endpoint");
        try {
            // nesC.g:989:5: ( ( certificate_specification )? endpoint wire_rhs ';' -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? ) )
            // nesC.g:989:10: ( certificate_specification )? endpoint wire_rhs ';'
            {
            // nesC.g:989:10: ( certificate_specification )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==ACTIVATE) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // nesC.g:989:10: certificate_specification
                    {
                    pushFollow(FOLLOW_certificate_specification_in_connection8545);
                    certificate_specification445=certificate_specification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification445.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_endpoint_in_connection8548);
            endpoint446=endpoint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_endpoint.add(endpoint446.getTree());

            pushFollow(FOLLOW_wire_rhs_in_connection8550);
            wire_rhs447=wire_rhs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_wire_rhs.add(wire_rhs447.getTree());

            char_literal448=(Token)match(input,200,FOLLOW_200_in_connection8552); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal448);


            // AST REWRITE
            // elements: endpoint, wire_rhs, certificate_specification
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 990:14: -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? )
            {
                // nesC.g:990:17: ^( CONNECTION wire_rhs endpoint ( certificate_specification )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONNECTION, "CONNECTION")
                , root_1);

                adaptor.addChild(root_1, stream_wire_rhs.nextTree());

                adaptor.addChild(root_1, stream_endpoint.nextTree());

                // nesC.g:990:48: ( certificate_specification )?
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
    // nesC.g:992:1: wire_rhs : ( '=' ^ endpoint | '->' ^ endpoint | '<-' ^ endpoint );
    public final nesCParser.wire_rhs_return wire_rhs() throws RecognitionException {
        nesCParser.wire_rhs_return retval = new nesCParser.wire_rhs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal449=null;
        Token string_literal451=null;
        Token string_literal453=null;
        nesCParser.endpoint_return endpoint450 =null;

        nesCParser.endpoint_return endpoint452 =null;

        nesCParser.endpoint_return endpoint454 =null;


        Object char_literal449_tree=null;
        Object string_literal451_tree=null;
        Object string_literal453_tree=null;

        try {
            // nesC.g:993:5: ( '=' ^ endpoint | '->' ^ endpoint | '<-' ^ endpoint )
            int alt129=3;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt129=1;
                }
                break;
            case ARROW:
                {
                alt129=2;
                }
                break;
            case 201:
                {
                alt129=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;

            }

            switch (alt129) {
                case 1 :
                    // nesC.g:993:10: '=' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal449=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_wire_rhs8593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal449_tree = 
                    (Object)adaptor.create(char_literal449)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal449_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8597);
                    endpoint450=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint450.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:994:10: '->' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal451=(Token)match(input,ARROW,FOLLOW_ARROW_in_wire_rhs8608); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal451_tree = 
                    (Object)adaptor.create(string_literal451)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(string_literal451_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8611);
                    endpoint452=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint452.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:995:10: '<-' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal453=(Token)match(input,201,FOLLOW_201_in_wire_rhs8622); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal453_tree = 
                    (Object)adaptor.create(string_literal453)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(string_literal453_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8625);
                    endpoint454=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint454.getTree());

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
    // nesC.g:997:1: certificate_specification : ACTIVATE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ACTIVATE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) ;
    public final nesCParser.certificate_specification_return certificate_specification() throws RecognitionException {
        nesCParser.certificate_specification_return retval = new nesCParser.certificate_specification_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token certs=null;
        Token entity=null;
        Token assumptions=null;
        Token ACTIVATE455=null;
        Token AS456=null;
        Token ASSUMING457=null;
        Token FOR458=null;

        Object certs_tree=null;
        Object entity_tree=null;
        Object assumptions_tree=null;
        Object ACTIVATE455_tree=null;
        Object AS456_tree=null;
        Object ASSUMING457_tree=null;
        Object FOR458_tree=null;
        RewriteRuleTokenStream stream_ASSUMING=new RewriteRuleTokenStream(adaptor,"token ASSUMING");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_ACTIVATE=new RewriteRuleTokenStream(adaptor,"token ACTIVATE");

        try {
            // nesC.g:998:5: ( ACTIVATE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ACTIVATE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) )
            // nesC.g:998:10: ACTIVATE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR
            {
            ACTIVATE455=(Token)match(input,ACTIVATE,FOLLOW_ACTIVATE_in_certificate_specification8640); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ACTIVATE.add(ACTIVATE455);


            certs=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8644); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(certs);


            // nesC.g:998:40: ( AS entity= STRING_LITERAL )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==AS) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // nesC.g:998:41: AS entity= STRING_LITERAL
                    {
                    AS456=(Token)match(input,AS,FOLLOW_AS_in_certificate_specification8647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS456);


                    entity=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(entity);


                    }
                    break;

            }


            // nesC.g:998:68: ( ASSUMING assumptions= STRING_LITERAL )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==ASSUMING) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // nesC.g:998:69: ASSUMING assumptions= STRING_LITERAL
                    {
                    ASSUMING457=(Token)match(input,ASSUMING,FOLLOW_ASSUMING_in_certificate_specification8656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUMING.add(ASSUMING457);


                    assumptions=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(assumptions);


                    }
                    break;

            }


            FOR458=(Token)match(input,FOR,FOLLOW_FOR_in_certificate_specification8664); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR458);


            // AST REWRITE
            // elements: ACTIVATE, entity, assumptions, ASSUMING, certs, AS
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
            // 999:14: -> ^( ACTIVATE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
            {
                // nesC.g:999:17: ^( ACTIVATE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ACTIVATE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_certs.nextNode());

                // nesC.g:999:35: ( ^( AS $entity) )?
                if ( stream_entity.hasNext()||stream_AS.hasNext() ) {
                    // nesC.g:999:35: ^( AS $entity)
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

                // nesC.g:999:50: ( ^( ASSUMING $assumptions) )?
                if ( stream_assumptions.hasNext()||stream_ASSUMING.hasNext() ) {
                    // nesC.g:999:50: ^( ASSUMING $assumptions)
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
    // nesC.g:1001:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );
    public final nesCParser.endpoint_return endpoint() throws RecognitionException {
        nesCParser.endpoint_return retval = new nesCParser.endpoint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal461=null;
        Token char_literal463=null;
        nesCParser.identifier_path_return identifier_path459 =null;

        nesCParser.identifier_path_return identifier_path460 =null;

        nesCParser.argument_expression_list_return argument_expression_list462 =null;


        Object char_literal461_tree=null;
        Object char_literal463_tree=null;

        try {
            // nesC.g:1002:5: ( identifier_path | identifier_path '[' argument_expression_list ']' )
            int alt132=2;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // nesC.g:1002:10: identifier_path
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8717);
                    identifier_path459=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path459.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:1003:10: identifier_path '[' argument_expression_list ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8728);
                    identifier_path460=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path460.getTree());

                    char_literal461=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_endpoint8730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal461_tree = 
                    (Object)adaptor.create(char_literal461)
                    ;
                    adaptor.addChild(root_0, char_literal461_tree);
                    }

                    pushFollow(FOLLOW_argument_expression_list_in_endpoint8732);
                    argument_expression_list462=argument_expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list462.getTree());

                    char_literal463=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_endpoint8734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal463_tree = 
                    (Object)adaptor.create(char_literal463)
                    ;
                    adaptor.addChild(root_0, char_literal463_tree);
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
    // nesC.g:1005:1: identifier_path : ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) );
    public final nesCParser.identifier_path_return identifier_path() throws RecognitionException {
        nesCParser.identifier_path_return retval = new nesCParser.identifier_path_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal465=null;
        Token char_literal467=null;
        Token char_literal468=null;
        Token char_literal469=null;
        List list_normal_path=null;
        nesCParser.identifier_return indirect =null;

        nesCParser.identifier_return identifier464 =null;

        nesCParser.identifier_return identifier466 =null;

        RuleReturnScope normal_path = null;
        Object char_literal465_tree=null;
        Object char_literal467_tree=null;
        Object char_literal468_tree=null;
        Object char_literal469_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1006:5: ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==RAW_IDENTIFIER) ) {
                alt135=1;
            }
            else if ( (LA135_0==LBRACKET) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;

            }
            switch (alt135) {
                case 1 :
                    // nesC.g:1006:10: identifier ( '.' identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_identifier_path8753);
                    identifier464=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier464.getTree());

                    // nesC.g:1006:21: ( '.' identifier )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==DOT) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // nesC.g:1006:22: '.' identifier
                    	    {
                    	    char_literal465=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8756); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal465);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8758);
                    	    identifier466=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier466.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop133;
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
                    // 1007:13: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:1007:16: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:1008:10: '[' indirect= identifier ']' ( '.' normal_path+= identifier )*
                    {
                    char_literal467=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_identifier_path8792); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal467);


                    pushFollow(FOLLOW_identifier_in_identifier_path8796);
                    indirect=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(indirect.getTree());

                    char_literal468=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_identifier_path8798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal468);


                    // nesC.g:1008:38: ( '.' normal_path+= identifier )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==DOT) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // nesC.g:1008:39: '.' normal_path+= identifier
                    	    {
                    	    char_literal469=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8801); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal469);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8805);
                    	    normal_path=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(normal_path.getTree());
                    	    if (list_normal_path==null) list_normal_path=new ArrayList();
                    	    list_normal_path.add(normal_path.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
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
                    // 1009:13: -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
                    {
                        // nesC.g:1009:16: ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
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
    // nesC.g:1015:1: component_specification : '{' ( line_directive | uses_provides )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final nesCParser.component_specification_return component_specification() throws RecognitionException {
        nesCParser.component_specification_return retval = new nesCParser.component_specification_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal470=null;
        Token char_literal473=null;
        nesCParser.line_directive_return line_directive471 =null;

        nesCParser.uses_provides_return uses_provides472 =null;


        Object char_literal470_tree=null;
        Object char_literal473_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        try {
            // nesC.g:1016:5: ( '{' ( line_directive | uses_provides )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // nesC.g:1016:10: '{' ( line_directive | uses_provides )* '}'
            {
            char_literal470=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification8854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal470);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:1017:11: ( line_directive | uses_provides )*
            loop136:
            do {
                int alt136=3;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==HASH) ) {
                    alt136=1;
                }
                else if ( (LA136_0==ASYNC||LA136_0==AUTO||LA136_0==BUILTIN_VA_LIST||LA136_0==CHAR||LA136_0==COMMAND||LA136_0==CONST||(LA136_0 >= DOUBLE && LA136_0 <= DUTY)||LA136_0==ENUM||(LA136_0 >= EVENT && LA136_0 <= EXTERN)||LA136_0==FLOAT||(LA136_0 >= INLINE && LA136_0 <= INT8_T)||LA136_0==LONG||LA136_0==NORACE||(LA136_0 >= NXLE_INT16_T && LA136_0 <= NX_UNION)||(LA136_0 >= PROVIDES && LA136_0 <= RAW_IDENTIFIER)||LA136_0==REGISTER||LA136_0==RESTRICT||LA136_0==SHORT||LA136_0==SIGNED||LA136_0==STATIC||LA136_0==STRUCT||(LA136_0 >= TASK && LA136_0 <= UINT8_T)||(LA136_0 >= UNION && LA136_0 <= VOLATILE)) ) {
                    alt136=2;
                }


                switch (alt136) {
            	case 1 :
            	    // nesC.g:1017:12: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification8869);
            	    line_directive471=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive471.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:1017:29: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification8873);
            	    uses_provides472=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides472.getTree());

            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);


            char_literal473=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification8877); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal473);


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
            // 1017:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // nesC.g:1017:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // nesC.g:1017:68: ( uses_provides )*
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
    // nesC.g:1019:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) );
    public final nesCParser.uses_provides_return uses_provides() throws RecognitionException {
        nesCParser.uses_provides_return retval = new nesCParser.uses_provides_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token USES474=null;
        Token PROVIDES476=null;
        nesCParser.specification_element_list_return specification_element_list475 =null;

        nesCParser.specification_element_list_return specification_element_list477 =null;

        nesCParser.declaration_return declaration478 =null;


        Object USES474_tree=null;
        Object PROVIDES476_tree=null;
        RewriteRuleTokenStream stream_PROVIDES=new RewriteRuleTokenStream(adaptor,"token PROVIDES");
        RewriteRuleTokenStream stream_USES=new RewriteRuleTokenStream(adaptor,"token USES");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_specification_element_list=new RewriteRuleSubtreeStream(adaptor,"rule specification_element_list");
        try {
            // nesC.g:1020:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) )
            int alt137=3;
            switch ( input.LA(1) ) {
            case USES:
                {
                alt137=1;
                }
                break;
            case PROVIDES:
                {
                alt137=2;
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
                alt137=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }

            switch (alt137) {
                case 1 :
                    // nesC.g:1020:10: USES specification_element_list
                    {
                    USES474=(Token)match(input,USES,FOLLOW_USES_in_uses_provides8905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES474);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8907);
                    specification_element_list475=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list475.getTree());

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
                    // 1020:42: -> ^( USES specification_element_list )
                    {
                        // nesC.g:1020:45: ^( USES specification_element_list )
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
                    // nesC.g:1021:10: PROVIDES specification_element_list
                    {
                    PROVIDES476=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides8926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES476);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8928);
                    specification_element_list477=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list477.getTree());

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
                    // 1021:46: -> ^( PROVIDES specification_element_list )
                    {
                        // nesC.g:1021:49: ^( PROVIDES specification_element_list )
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
                    // nesC.g:1022:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_uses_provides8947);
                    declaration478=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration478.getTree());

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
                    // 1022:22: -> ^( DECLARATION declaration )
                    {
                        // nesC.g:1022:25: ^( DECLARATION declaration )
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
    // nesC.g:1024:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final nesCParser.specification_element_list_return specification_element_list() throws RecognitionException {
        nesCParser.specification_element_list_return retval = new nesCParser.specification_element_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal480=null;
        Token char_literal482=null;
        nesCParser.specification_element_return specification_element479 =null;

        nesCParser.specification_element_return specification_element481 =null;


        Object char_literal480_tree=null;
        Object char_literal482_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_specification_element=new RewriteRuleSubtreeStream(adaptor,"rule specification_element");
        try {
            // nesC.g:1025:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==ASYNC||LA139_0==AUTO||LA139_0==BUILTIN_VA_LIST||LA139_0==CHAR||LA139_0==COMMAND||LA139_0==CONST||(LA139_0 >= DOUBLE && LA139_0 <= DUTY)||LA139_0==ENUM||(LA139_0 >= EVENT && LA139_0 <= EXTERN)||LA139_0==FLOAT||(LA139_0 >= INLINE && LA139_0 <= INTERFACE)||LA139_0==LONG||LA139_0==NORACE||(LA139_0 >= NXLE_INT16_T && LA139_0 <= NX_UNION)||LA139_0==RAW_IDENTIFIER||(LA139_0 >= REGISTER && LA139_0 <= REMOTE)||LA139_0==RESTRICT||LA139_0==SHORT||LA139_0==SIGNED||LA139_0==STATIC||LA139_0==STRUCT||(LA139_0 >= TASK && LA139_0 <= UINT8_T)||(LA139_0 >= UNION && LA139_0 <= UNSIGNED)||(LA139_0 >= VOID && LA139_0 <= VOLATILE)) ) {
                alt139=1;
            }
            else if ( (LA139_0==LBRACE) ) {
                alt139=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;

            }
            switch (alt139) {
                case 1 :
                    // nesC.g:1025:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list8974);
                    specification_element479=specification_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element.add(specification_element479.getTree());

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
                    // 1025:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:1026:10: '{' ( specification_element )+ '}'
                    {
                    char_literal480=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list8989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal480);


                    // nesC.g:1026:14: ( specification_element )+
                    int cnt138=0;
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==ASYNC||LA138_0==AUTO||LA138_0==BUILTIN_VA_LIST||LA138_0==CHAR||LA138_0==COMMAND||LA138_0==CONST||(LA138_0 >= DOUBLE && LA138_0 <= DUTY)||LA138_0==ENUM||(LA138_0 >= EVENT && LA138_0 <= EXTERN)||LA138_0==FLOAT||(LA138_0 >= INLINE && LA138_0 <= INTERFACE)||LA138_0==LONG||LA138_0==NORACE||(LA138_0 >= NXLE_INT16_T && LA138_0 <= NX_UNION)||LA138_0==RAW_IDENTIFIER||(LA138_0 >= REGISTER && LA138_0 <= REMOTE)||LA138_0==RESTRICT||LA138_0==SHORT||LA138_0==SIGNED||LA138_0==STATIC||LA138_0==STRUCT||(LA138_0 >= TASK && LA138_0 <= UINT8_T)||(LA138_0 >= UNION && LA138_0 <= UNSIGNED)||(LA138_0 >= VOID && LA138_0 <= VOLATILE)) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // nesC.g:1026:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list8991);
                    	    specification_element481=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element481.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt138 >= 1 ) break loop138;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(138, input);
                                throw eee;
                        }
                        cnt138++;
                    } while (true);


                    char_literal482=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list8994); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal482);


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
                    // 1026:41: -> ( specification_element )+
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
    // nesC.g:1028:1: specification_element : ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) );
    public final nesCParser.specification_element_return specification_element() throws RecognitionException {
        nesCParser.specification_element_return retval = new nesCParser.specification_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS485=null;
        Token char_literal489=null;
        nesCParser.declaration_return declaration483 =null;

        nesCParser.interface_type_return interface_type484 =null;

        nesCParser.identifier_return identifier486 =null;

        nesCParser.instance_parameters_return instance_parameters487 =null;

        nesCParser.attributes_return attributes488 =null;


        Object AS485_tree=null;
        Object char_literal489_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_instance_parameters=new RewriteRuleSubtreeStream(adaptor,"rule instance_parameters");
        RewriteRuleSubtreeStream stream_interface_type=new RewriteRuleSubtreeStream(adaptor,"rule interface_type");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1029:5: ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==ASYNC||LA143_0==AUTO||LA143_0==BUILTIN_VA_LIST||LA143_0==CHAR||LA143_0==COMMAND||LA143_0==CONST||(LA143_0 >= DOUBLE && LA143_0 <= DUTY)||LA143_0==ENUM||(LA143_0 >= EVENT && LA143_0 <= EXTERN)||LA143_0==FLOAT||(LA143_0 >= INLINE && LA143_0 <= INT8_T)||LA143_0==LONG||LA143_0==NORACE||(LA143_0 >= NXLE_INT16_T && LA143_0 <= NX_UNION)||LA143_0==RAW_IDENTIFIER||LA143_0==REGISTER||LA143_0==RESTRICT||LA143_0==SHORT||LA143_0==SIGNED||LA143_0==STATIC||LA143_0==STRUCT||(LA143_0 >= TASK && LA143_0 <= UINT8_T)||(LA143_0 >= UNION && LA143_0 <= UNSIGNED)||(LA143_0 >= VOID && LA143_0 <= VOLATILE)) ) {
                alt143=1;
            }
            else if ( (LA143_0==INTERFACE||LA143_0==REMOTE) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;

            }
            switch (alt143) {
                case 1 :
                    // nesC.g:1029:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_specification_element9018);
                    declaration483=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration483.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:1030:10: interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';'
                    {
                    pushFollow(FOLLOW_interface_type_in_specification_element9029);
                    interface_type484=interface_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_type.add(interface_type484.getTree());

                    // nesC.g:1030:25: ( AS identifier )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==AS) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // nesC.g:1030:26: AS identifier
                            {
                            AS485=(Token)match(input,AS,FOLLOW_AS_in_specification_element9032); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AS.add(AS485);


                            pushFollow(FOLLOW_identifier_in_specification_element9034);
                            identifier486=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier486.getTree());

                            }
                            break;

                    }


                    // nesC.g:1030:42: ( instance_parameters )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==LBRACKET) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // nesC.g:1030:42: instance_parameters
                            {
                            pushFollow(FOLLOW_instance_parameters_in_specification_element9038);
                            instance_parameters487=instance_parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_instance_parameters.add(instance_parameters487.getTree());

                            }
                            break;

                    }


                    // nesC.g:1030:63: ( attributes )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==ATTRIBUTE) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // nesC.g:1030:63: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_specification_element9041);
                            attributes488=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes488.getTree());

                            }
                            break;

                    }


                    char_literal489=(Token)match(input,200,FOLLOW_200_in_specification_element9044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal489);


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
                    // 1031:13: -> ^( INTERFACE interface_type ( identifier )? )
                    {
                        // nesC.g:1031:16: ^( INTERFACE interface_type ( identifier )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTERFACE, "INTERFACE")
                        , root_1);

                        adaptor.addChild(root_1, stream_interface_type.nextTree());

                        // nesC.g:1031:43: ( identifier )?
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
    // nesC.g:1038:1: interface_type : ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) ;
    public final nesCParser.interface_type_return interface_type() throws RecognitionException {
        nesCParser.interface_type_return retval = new nesCParser.interface_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REMOTE490=null;
        Token INTERFACE491=null;
        Token REQUIRES494=null;
        Token STRING_LITERAL495=null;
        nesCParser.identifier_return identifier492 =null;

        nesCParser.type_arguments_return type_arguments493 =null;


        Object REMOTE490_tree=null;
        Object INTERFACE491_tree=null;
        Object REQUIRES494_tree=null;
        Object STRING_LITERAL495_tree=null;
        RewriteRuleTokenStream stream_REMOTE=new RewriteRuleTokenStream(adaptor,"token REMOTE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_REQUIRES=new RewriteRuleTokenStream(adaptor,"token REQUIRES");
        RewriteRuleSubtreeStream stream_type_arguments=new RewriteRuleSubtreeStream(adaptor,"rule type_arguments");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1039:5: ( ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) )
            // nesC.g:1039:10: ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )?
            {
            // nesC.g:1039:10: ( REMOTE )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==REMOTE) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // nesC.g:1039:10: REMOTE
                    {
                    REMOTE490=(Token)match(input,REMOTE,FOLLOW_REMOTE_in_interface_type9091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REMOTE.add(REMOTE490);


                    }
                    break;

            }


            INTERFACE491=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_type9094); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE491);


            pushFollow(FOLLOW_identifier_in_interface_type9096);
            identifier492=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier492.getTree());

            // nesC.g:1039:39: ( type_arguments )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==LESS) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // nesC.g:1039:39: type_arguments
                    {
                    pushFollow(FOLLOW_type_arguments_in_interface_type9098);
                    type_arguments493=type_arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_arguments.add(type_arguments493.getTree());

                    }
                    break;

            }


            // nesC.g:1039:55: ( REQUIRES STRING_LITERAL )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==REQUIRES) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // nesC.g:1039:56: REQUIRES STRING_LITERAL
                    {
                    REQUIRES494=(Token)match(input,REQUIRES,FOLLOW_REQUIRES_in_interface_type9102); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRES.add(REQUIRES494);


                    STRING_LITERAL495=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_interface_type9104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL495);


                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, STRING_LITERAL, type_arguments, REMOTE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1040:13: -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
            {
                // nesC.g:1040:16: ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_TYPE, "INTERFACE_TYPE")
                , root_1);

                // nesC.g:1040:33: ( REMOTE )?
                if ( stream_REMOTE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_REMOTE.nextNode()
                    );

                }
                stream_REMOTE.reset();

                // nesC.g:1040:41: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING_LITERAL.nextNode()
                    );

                }
                stream_STRING_LITERAL.reset();

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:1040:68: ( type_arguments )?
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
    // nesC.g:1042:1: type_arguments : '<' type_name ( ',' type_name )* '>' -> ( type_name )+ ;
    public final nesCParser.type_arguments_return type_arguments() throws RecognitionException {
        nesCParser.type_arguments_return retval = new nesCParser.type_arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal496=null;
        Token char_literal498=null;
        Token char_literal500=null;
        nesCParser.type_name_return type_name497 =null;

        nesCParser.type_name_return type_name499 =null;


        Object char_literal496_tree=null;
        Object char_literal498_tree=null;
        Object char_literal500_tree=null;
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // nesC.g:1043:5: ( '<' type_name ( ',' type_name )* '>' -> ( type_name )+ )
            // nesC.g:1043:10: '<' type_name ( ',' type_name )* '>'
            {
            char_literal496=(Token)match(input,LESS,FOLLOW_LESS_in_type_arguments9154); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESS.add(char_literal496);


            pushFollow(FOLLOW_type_name_in_type_arguments9156);
            type_name497=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_name.add(type_name497.getTree());

            // nesC.g:1043:24: ( ',' type_name )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==COMMA) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // nesC.g:1043:25: ',' type_name
            	    {
            	    char_literal498=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_arguments9159); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal498);


            	    pushFollow(FOLLOW_type_name_in_type_arguments9161);
            	    type_name499=type_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type_name.add(type_name499.getTree());

            	    }
            	    break;

            	default :
            	    break loop147;
                }
            } while (true);


            char_literal500=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_arguments9165); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GREATER.add(char_literal500);


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
            // 1043:45: -> ( type_name )+
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
    // nesC.g:1045:1: instance_parameters : '[' parameter_list ']' ;
    public final nesCParser.instance_parameters_return instance_parameters() throws RecognitionException {
        nesCParser.instance_parameters_return retval = new nesCParser.instance_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal501=null;
        Token char_literal503=null;
        nesCParser.parameter_list_return parameter_list502 =null;


        Object char_literal501_tree=null;
        Object char_literal503_tree=null;

        try {
            // nesC.g:1046:5: ( '[' parameter_list ']' )
            // nesC.g:1046:10: '[' parameter_list ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal501=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_instance_parameters9189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal501_tree = 
            (Object)adaptor.create(char_literal501)
            ;
            adaptor.addChild(root_0, char_literal501_tree);
            }

            pushFollow(FOLLOW_parameter_list_in_instance_parameters9191);
            parameter_list502=parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list502.getTree());

            char_literal503=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_instance_parameters9193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal503_tree = 
            (Object)adaptor.create(char_literal503)
            ;
            adaptor.addChild(root_0, char_literal503_tree);
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
    // nesC.g:1048:1: attributes : ( attribute )+ ;
    public final nesCParser.attributes_return attributes() throws RecognitionException {
        nesCParser.attributes_return retval = new nesCParser.attributes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.attribute_return attribute504 =null;



        try {
            // nesC.g:1049:5: ( ( attribute )+ )
            // nesC.g:1049:10: ( attribute )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:1049:10: ( attribute )+
            int cnt148=0;
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==ATTRIBUTE) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // nesC.g:1049:10: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributes9212);
            	    attribute504=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute504.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt148 >= 1 ) break loop148;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(148, input);
                        throw eee;
                }
                cnt148++;
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
    // nesC.g:1051:1: attribute : '@' identifier '(' initializer_list ')' ;
    public final nesCParser.attribute_return attribute() throws RecognitionException {
        nesCParser.attribute_return retval = new nesCParser.attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal505=null;
        Token char_literal507=null;
        Token char_literal509=null;
        nesCParser.identifier_return identifier506 =null;

        nesCParser.initializer_list_return initializer_list508 =null;


        Object char_literal505_tree=null;
        Object char_literal507_tree=null;
        Object char_literal509_tree=null;

        try {
            // nesC.g:1052:5: ( '@' identifier '(' initializer_list ')' )
            // nesC.g:1052:10: '@' identifier '(' initializer_list ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal505=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute9232); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal505_tree = 
            (Object)adaptor.create(char_literal505)
            ;
            adaptor.addChild(root_0, char_literal505_tree);
            }

            pushFollow(FOLLOW_identifier_in_attribute9234);
            identifier506=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier506.getTree());

            char_literal507=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_attribute9236); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal507_tree = 
            (Object)adaptor.create(char_literal507)
            ;
            adaptor.addChild(root_0, char_literal507_tree);
            }

            pushFollow(FOLLOW_initializer_list_in_attribute9238);
            initializer_list508=initializer_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer_list508.getTree());

            char_literal509=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_attribute9240); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal509_tree = 
            (Object)adaptor.create(char_literal509)
            ;
            adaptor.addChild(root_0, char_literal509_tree);
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
    // nesC.g:1061:1: gcc_attributes : GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' ;
    public final nesCParser.gcc_attributes_return gcc_attributes() throws RecognitionException {
        nesCParser.gcc_attributes_return retval = new nesCParser.gcc_attributes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GCCATTRIBUTE510=null;
        Token char_literal511=null;
        Token char_literal512=null;
        Token char_literal514=null;
        Token char_literal515=null;
        nesCParser.gcc_attribute_list_return gcc_attribute_list513 =null;


        Object GCCATTRIBUTE510_tree=null;
        Object char_literal511_tree=null;
        Object char_literal512_tree=null;
        Object char_literal514_tree=null;
        Object char_literal515_tree=null;

        try {
            // nesC.g:1062:5: ( GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' )
            // nesC.g:1062:10: GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')'
            {
            root_0 = (Object)adaptor.nil();


            GCCATTRIBUTE510=(Token)match(input,GCCATTRIBUTE,FOLLOW_GCCATTRIBUTE_in_gcc_attributes9262); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GCCATTRIBUTE510_tree = 
            (Object)adaptor.create(GCCATTRIBUTE510)
            ;
            adaptor.addChild(root_0, GCCATTRIBUTE510_tree);
            }

            char_literal511=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes9264); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal511_tree = 
            (Object)adaptor.create(char_literal511)
            ;
            adaptor.addChild(root_0, char_literal511_tree);
            }

            char_literal512=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes9266); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal512_tree = 
            (Object)adaptor.create(char_literal512)
            ;
            adaptor.addChild(root_0, char_literal512_tree);
            }

            pushFollow(FOLLOW_gcc_attribute_list_in_gcc_attributes9268);
            gcc_attribute_list513=gcc_attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute_list513.getTree());

            char_literal514=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes9270); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal514_tree = 
            (Object)adaptor.create(char_literal514)
            ;
            adaptor.addChild(root_0, char_literal514_tree);
            }

            char_literal515=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes9272); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal515_tree = 
            (Object)adaptor.create(char_literal515)
            ;
            adaptor.addChild(root_0, char_literal515_tree);
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
    // nesC.g:1064:1: gcc_attribute_list : ( gcc_attribute )? ( ',' gcc_attribute )* ;
    public final nesCParser.gcc_attribute_list_return gcc_attribute_list() throws RecognitionException {
        nesCParser.gcc_attribute_list_return retval = new nesCParser.gcc_attribute_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal517=null;
        nesCParser.gcc_attribute_return gcc_attribute516 =null;

        nesCParser.gcc_attribute_return gcc_attribute518 =null;


        Object char_literal517_tree=null;

        try {
            // nesC.g:1065:5: ( ( gcc_attribute )? ( ',' gcc_attribute )* )
            // nesC.g:1065:10: ( gcc_attribute )? ( ',' gcc_attribute )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:1065:10: ( gcc_attribute )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==AMP||LA149_0==BITCOMPLEMENT||LA149_0==BUILTIN_VA_ARG||LA149_0==CALL||LA149_0==CHARACTER_LITERAL||LA149_0==CONSTANT||LA149_0==LPARENS||LA149_0==MINUS||LA149_0==MINUSMINUS||LA149_0==NOT||LA149_0==PLUS||LA149_0==PLUSPLUS||LA149_0==POST||LA149_0==RAW_IDENTIFIER||LA149_0==SIGNAL||LA149_0==SIZEOF||LA149_0==STAR||LA149_0==STRING_LITERAL) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // nesC.g:1065:10: gcc_attribute
                    {
                    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list9287);
                    gcc_attribute516=gcc_attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute516.getTree());

                    }
                    break;

            }


            // nesC.g:1065:25: ( ',' gcc_attribute )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==COMMA) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // nesC.g:1065:26: ',' gcc_attribute
            	    {
            	    char_literal517=(Token)match(input,COMMA,FOLLOW_COMMA_in_gcc_attribute_list9291); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal517_tree = 
            	    (Object)adaptor.create(char_literal517)
            	    ;
            	    adaptor.addChild(root_0, char_literal517_tree);
            	    }

            	    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list9293);
            	    gcc_attribute518=gcc_attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute518.getTree());

            	    }
            	    break;

            	default :
            	    break loop150;
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
    // nesC.g:1067:1: gcc_attribute : assignment_expression ;
    public final nesCParser.gcc_attribute_return gcc_attribute() throws RecognitionException {
        nesCParser.gcc_attribute_return retval = new nesCParser.gcc_attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.assignment_expression_return assignment_expression519 =null;



        try {
            // nesC.g:1068:5: ( assignment_expression )
            // nesC.g:1068:10: assignment_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_gcc_attribute9310);
            assignment_expression519=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression519.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // nesC.g:1071:1: identifier :{...}? RAW_IDENTIFIER ;
    public final nesCParser.identifier_return identifier() throws RecognitionException {
        nesCParser.identifier_return retval = new nesCParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER520=null;

        Object RAW_IDENTIFIER520_tree=null;

        try {
            // nesC.g:1072:5: ({...}? RAW_IDENTIFIER )
            // nesC.g:1072:10: {...}? RAW_IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            if ( !(( !symbols.isType(input.LT(1).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "identifier", " !symbols.isType(input.LT(1).getText()) ");
            }

            RAW_IDENTIFIER520=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier9328); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAW_IDENTIFIER520_tree = 
            (Object)adaptor.create(RAW_IDENTIFIER520)
            ;
            adaptor.addChild(root_0, RAW_IDENTIFIER520_tree);
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
        // nesC.g:350:10: ( SIZEOF '(' type_name ')' )
        // nesC.g:350:11: SIZEOF '(' type_name ')'
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred1_nesC3466); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred1_nesC3468); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred1_nesC3470);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred1_nesC3472); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_nesC

    // $ANTLR start synpred2_nesC
    public final void synpred2_nesC_fragment() throws RecognitionException {
        // nesC.g:359:10: ( '(' type_name ')' )
        // nesC.g:359:11: '(' type_name ')'
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred2_nesC3543); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred2_nesC3545);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred2_nesC3547); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_nesC

    // $ANTLR start synpred3_nesC
    public final void synpred3_nesC_fragment() throws RecognitionException {
        // nesC.g:397:10: ( unary_expression assignment_operator )
        // nesC.g:397:11: unary_expression assignment_operator
        {
        pushFollow(FOLLOW_unary_expression_in_synpred3_nesC3971);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_assignment_operator_in_synpred3_nesC3973);
        assignment_operator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_nesC

    // $ANTLR start synpred4_nesC
    public final void synpred4_nesC_fragment() throws RecognitionException {
        // nesC.g:406:33: ( ',' assignment_expression )
        // nesC.g:406:34: ',' assignment_expression
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred4_nesC4100); if (state.failed) return ;

        pushFollow(FOLLOW_assignment_expression_in_synpred4_nesC4102);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_nesC

    // $ANTLR start synpred5_nesC
    public final void synpred5_nesC_fragment() throws RecognitionException {
        // nesC.g:432:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )
        // nesC.g:432:11: declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred5_nesC4176);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:432:34: ( gcc_attributes )?
        int alt151=2;
        int LA151_0 = input.LA(1);

        if ( (LA151_0==GCCATTRIBUTE) ) {
            alt151=1;
        }
        switch (alt151) {
            case 1 :
                // nesC.g:432:34: gcc_attributes
                {
                pushFollow(FOLLOW_gcc_attributes_in_synpred5_nesC4178);
                gcc_attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // nesC.g:432:50: ( init_declarator_list )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( (LA152_0==LPARENS||LA152_0==RAW_IDENTIFIER||LA152_0==STAR) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // nesC.g:432:50: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred5_nesC4181);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,200,FOLLOW_200_in_synpred5_nesC4184); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_nesC

    // $ANTLR start synpred6_nesC
    public final void synpred6_nesC_fragment() throws RecognitionException {
        // nesC.g:461:10: ( TYPEDEF declaration_specifiers ';' )
        // nesC.g:461:11: TYPEDEF declaration_specifiers ';'
        {
        match(input,TYPEDEF,FOLLOW_TYPEDEF_in_synpred6_nesC4372); if (state.failed) return ;

        pushFollow(FOLLOW_declaration_specifiers_in_synpred6_nesC4374);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        match(input,200,FOLLOW_200_in_synpred6_nesC4376); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_nesC

    // $ANTLR start synpred7_nesC
    public final void synpred7_nesC_fragment() throws RecognitionException {
        // nesC.g:662:9: ( '[' ( constant_expression )? ']' )
        // nesC.g:662:10: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred7_nesC5891); if (state.failed) return ;

        // nesC.g:662:14: ( constant_expression )?
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==AMP||LA153_0==BITCOMPLEMENT||LA153_0==BUILTIN_VA_ARG||LA153_0==CALL||LA153_0==CHARACTER_LITERAL||LA153_0==CONSTANT||LA153_0==LPARENS||LA153_0==MINUS||LA153_0==MINUSMINUS||LA153_0==NOT||LA153_0==PLUS||LA153_0==PLUSPLUS||LA153_0==POST||LA153_0==RAW_IDENTIFIER||LA153_0==SIGNAL||LA153_0==SIZEOF||LA153_0==STAR||LA153_0==STRING_LITERAL) ) {
            alt153=1;
        }
        switch (alt153) {
            case 1 :
                // nesC.g:662:14: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred7_nesC5893);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred7_nesC5896); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_nesC

    // $ANTLR start synpred8_nesC
    public final void synpred8_nesC_fragment() throws RecognitionException {
        // nesC.g:699:10: ( declarator ( attributes )? )
        // nesC.g:699:11: declarator ( attributes )?
        {
        pushFollow(FOLLOW_declarator_in_synpred8_nesC6202);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:699:22: ( attributes )?
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==ATTRIBUTE) ) {
            alt154=1;
        }
        switch (alt154) {
            case 1 :
                // nesC.g:699:22: attributes
                {
                pushFollow(FOLLOW_attributes_in_synpred8_nesC6204);
                attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred8_nesC

    // $ANTLR start synpred9_nesC
    public final void synpred9_nesC_fragment() throws RecognitionException {
        // nesC.g:709:10: ( ( pointer )? direct_abstract_declarator )
        // nesC.g:709:11: ( pointer )? direct_abstract_declarator
        {
        // nesC.g:709:11: ( pointer )?
        int alt155=2;
        int LA155_0 = input.LA(1);

        if ( (LA155_0==STAR) ) {
            alt155=1;
        }
        switch (alt155) {
            case 1 :
                // nesC.g:709:11: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred9_nesC6297);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred9_nesC6300);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_nesC

    // $ANTLR start synpred10_nesC
    public final void synpred10_nesC_fragment() throws RecognitionException {
        // nesC.g:713:10: ( '(' abstract_declarator ')' )
        // nesC.g:713:11: '(' abstract_declarator ')'
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred10_nesC6339); if (state.failed) return ;

        pushFollow(FOLLOW_abstract_declarator_in_synpred10_nesC6341);
        abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred10_nesC6343); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_nesC

    // $ANTLR start synpred11_nesC
    public final void synpred11_nesC_fragment() throws RecognitionException {
        // nesC.g:790:10: ( IF '(' expression ')' statement ELSE statement )
        // nesC.g:790:11: IF '(' expression ')' statement ELSE statement
        {
        match(input,IF,FOLLOW_IF_in_synpred11_nesC6880); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred11_nesC6882); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred11_nesC6884);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred11_nesC6886); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred11_nesC6888);
        statement();

        state._fsp--;
        if (state.failed) return ;

        match(input,ELSE,FOLLOW_ELSE_in_synpred11_nesC6890); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred11_nesC6892);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_nesC

    // $ANTLR start synpred12_nesC
    public final void synpred12_nesC_fragment() throws RecognitionException {
        // nesC.g:923:10: ( configuration_body )
        // nesC.g:923:11: configuration_body
        {
        pushFollow(FOLLOW_configuration_body_in_synpred12_nesC8100);
        configuration_body();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_nesC

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
    public final boolean synpred12_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_nesC_fragment(); // can never throw exception
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
    public final boolean synpred11_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA65 dfa65 = new DFA65(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA132 dfa132 = new DFA132(this);
    static final String DFA65_eotS =
        "\5\uffff";
    static final String DFA65_eofS =
        "\5\uffff";
    static final String DFA65_minS =
        "\1\u00b2\2\41\2\uffff";
    static final String DFA65_maxS =
        "\1\u00b2\2\u00c4\2\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA65_specialS =
        "\5\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1",
            "\1\4\17\uffff\1\2\43\uffff\1\4\23\uffff\1\4\4\uffff\1\4\61"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "\1\4\17\uffff\1\2\43\uffff\1\4\23\uffff\1\4\4\uffff\1\4\61"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "671:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
    static final String DFA89_eotS =
        "\111\uffff";
    static final String DFA89_eofS =
        "\111\uffff";
    static final String DFA89_minS =
        "\1\7\1\0\107\uffff";
    static final String DFA89_maxS =
        "\1\u00c8\1\0\107\uffff";
    static final String DFA89_acceptS =
        "\2\uffff\1\2\35\uffff\1\1\50\uffff";
    static final String DFA89_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA89_transitionS = {
            "\1\2\7\uffff\1\40\1\2\1\uffff\1\40\1\uffff\1\2\4\uffff\2\2\1"+
            "\40\2\2\1\uffff\1\40\1\2\1\uffff\1\40\16\uffff\1\40\2\2\6\uffff"+
            "\1\2\4\uffff\1\2\1\uffff\2\40\3\uffff\1\40\2\uffff\2\40\1\uffff"+
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

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "()* loopback of 773:10: ( declaration )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_1 = input.LA(1);

                         
                        int index89_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!((( !symbols.isType(input.LT(1).getText()) )))) ) {s = 32;}

                        else if ( (( !symbols.isType(input.LT(1).getText()) )) ) {s = 2;}

                         
                        input.seek(index89_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA132_eotS =
        "\13\uffff";
    static final String DFA132_eofS =
        "\13\uffff";
    static final String DFA132_minS =
        "\1\151\1\13\2\u00a0\2\uffff\1\u00a2\2\13\1\u00a0\1\13";
    static final String DFA132_maxS =
        "\1\u00a0\1\u00c9\2\u00a0\2\uffff\1\u00a2\2\u00c9\1\u00a0\1\u00c9";
    static final String DFA132_acceptS =
        "\4\uffff\1\1\1\2\5\uffff";
    static final String DFA132_specialS =
        "\13\uffff}>";
    static final String[] DFA132_transitionS = {
            "\1\2\66\uffff\1\1",
            "\1\4\1\uffff\1\4\62\uffff\1\3\50\uffff\1\5\136\uffff\2\4",
            "\1\6",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\4\1\uffff\1\4\62\uffff\1\3\50\uffff\1\5\136\uffff\2\4",
            "\1\4\1\uffff\1\4\62\uffff\1\11\50\uffff\1\5\136\uffff\2\4",
            "\1\12",
            "\1\4\1\uffff\1\4\62\uffff\1\11\50\uffff\1\5\136\uffff\2\4"
    };

    static final short[] DFA132_eot = DFA.unpackEncodedString(DFA132_eotS);
    static final short[] DFA132_eof = DFA.unpackEncodedString(DFA132_eofS);
    static final char[] DFA132_min = DFA.unpackEncodedStringToUnsignedChars(DFA132_minS);
    static final char[] DFA132_max = DFA.unpackEncodedStringToUnsignedChars(DFA132_maxS);
    static final short[] DFA132_accept = DFA.unpackEncodedString(DFA132_acceptS);
    static final short[] DFA132_special = DFA.unpackEncodedString(DFA132_specialS);
    static final short[][] DFA132_transition;

    static {
        int numStates = DFA132_transitionS.length;
        DFA132_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA132_transition[i] = DFA.unpackEncodedString(DFA132_transitionS[i]);
        }
    }

    class DFA132 extends DFA {

        public DFA132(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 132;
            this.eot = DFA132_eot;
            this.eof = DFA132_eof;
            this.min = DFA132_min;
            this.max = DFA132_max;
            this.accept = DFA132_accept;
            this.special = DFA132_special;
            this.transition = DFA132_transition;
        }
        public String getDescription() {
            return "1001:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );";
        }
    }
 

    public static final BitSet FOLLOW_identifier_in_primary_expression2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_primary_expression2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_primary_expression2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_primary_expression2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_primary_expression2993 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_primary_expression2995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_primary_expression2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_kind_in_postfix_expression3022 = new BitSet(new long[]{0x0004000100000000L,0x0000400000000000L,0x0020000100000000L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression3025 = new BitSet(new long[]{0x0000000000000802L,0x0008420000000001L,0x0000000000800000L});
    public static final BitSet FOLLOW_postfix_expression_modifier_in_postfix_expression3027 = new BitSet(new long[]{0x0000000000000802L,0x0008420000000001L,0x0000000000800000L});
    public static final BitSet FOLLOW_BUILTIN_VA_ARG_in_postfix_expression3065 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression3067 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_postfix_expression3069 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_postfix_expression3071 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_postfix_expression3073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_postfix_expression_modifier3113 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_postfix_expression_modifier3115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_postfix_expression_modifier3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression_modifier3135 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024510102A00000L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression_modifier3137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression_modifier3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression_modifier3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_postfix_expression_modifier3179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_postfix_expression_modifier3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_postfix_expression_modifier3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3269 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list3272 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3275 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unary_expression3296 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_unary_expression3317 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_unary_expression3338 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression3365 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression3391 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression3418 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITCOMPLEMENT_in_unary_expression3445 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_NOT_in_unary_expression3450 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3477 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_unary_expression3479 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_unary_expression3481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_unary_expression3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3502 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_cast_expression3562 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_cast_expression3564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_cast_expression3566 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3608 = new BitSet(new long[]{0x4000000000000002L,0x0040000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression3613 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expression3618 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_MODULUS_in_multiplicative_expression3623 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3627 = new BitSet(new long[]{0x4000000000000002L,0x0040000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3648 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression3653 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression3658 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3662 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3683 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression3688 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression3693 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3697 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3718 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000600000L});
    public static final BitSet FOLLOW_LESS_in_relational_expression3723 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression3728 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_LESSEQUAL_in_relational_expression3733 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_relational_expression3738 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3742 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000600000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3763 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000100L});
    public static final BitSet FOLLOW_EQUAL_in_equality_expression3768 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equality_expression3773 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3777 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000100L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3798 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AMP_in_and_expression3802 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3805 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3826 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_BITXOR_in_xor_expression3830 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3833 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3854 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_BITOR_in_or_expression3858 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3861 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3882 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression3886 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3889 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3910 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression3914 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression3938 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_202_in_conditional_expression3941 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_conditional_expression3944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_conditional_expression3946 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_assignment_expression3988 = new BitSet(new long[]{0x2000000001482000L,0x0095000000000000L,0x0000040000400000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression3990 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression4096 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_expression4107 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_expression4110 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4219 = new BitSet(new long[]{0x0000000000000000L,0x0000400000040000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4221 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_declaration4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration4381 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_declaration4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration4431 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4433 = new BitSet(new long[]{0x0000000000000000L,0x0000400000040000L,0x0004000100000000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4435 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration4438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_declaration4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_c_style_declaration_specifier_in_declaration_specifiers4510 = new BitSet(new long[]{0x0002000488048002L,0x0200201F80001646L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_storage_class_specifier_in_c_style_declaration_specifier4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_c_style_declaration_specifier4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_c_style_declaration_specifier4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_specifier_in_c_style_declaration_specifier4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4580 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list4583 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4585 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator4619 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_attributes_in_init_declarator4621 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator4625 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_in_init_declarator4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_type_specifier4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT64_T_in_type_specifier4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT64_T_in_type_specifier4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT8_T_in_type_specifier4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT16_T_in_type_specifier4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT32_T_in_type_specifier4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT64_T_in_type_specifier4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT64_T_in_type_specifier5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT8_T_in_type_specifier5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT16_T_in_type_specifier5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT32_T_in_type_specifier5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT64_T_in_type_specifier5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT8_T_in_type_specifier5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT16_T_in_type_specifier5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT32_T_in_type_specifier5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT64_T_in_type_specifier5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUILTIN_VA_LIST_in_type_specifier5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier5167 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier5169 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00801042L,0x3C4028430003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier5171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier5207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5209 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier5214 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00801042L,0x3C4028430003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier5216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_struct_or_union_specifier5258 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_struct_or_union_specifier5260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5262 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier5264 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00801042L,0x3C4028430003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier5266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_struct_declaration_list5356 = new BitSet(new long[]{0x0002000088000002L,0x0000201F00801042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list5360 = new BitSet(new long[]{0x0002000088000002L,0x0000201F00801042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration5392 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration5394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_struct_declaration5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list5439 = new BitSet(new long[]{0x0002000088000002L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list5443 = new BitSet(new long[]{0x0002000088000002L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5469 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list5472 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5474 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_struct_declarator5507 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_struct_declarator5522 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5543 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5547 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5586 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5593 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5645 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list5648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5651 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_identifier_in_enumerator5676 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator5679 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_function_specifier5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator5768 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator5796 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator5798 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5824 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier5827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier5864 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier5866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5901 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500502A00000L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier5903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5938 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D50284D0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier5942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5944 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier5948 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5029490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier5952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5994 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000000L,0x0004004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_pointer_in_pointer5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer6021 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list6052 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list6077 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list6080 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list6082 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list6087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ELLIPSIS_in_parameter_list6089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration6159 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_parameter_declarator_in_parameter_declaration6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_parameter_declarator6210 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_attributes_in_parameter_declarator6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declarator6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list6243 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_identifier_list6246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list6248 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name6274 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator6305 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6359 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator6361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6363 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6365 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6377 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator_modifier6393 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500502A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator_modifier6395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator_modifier6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator_modifier6409 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5029490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_direct_abstract_declarator_modifier6411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator_modifier6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer6464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer6475 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_list_in_initializer6477 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_initializer6479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_initializer_list6514 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6518 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list6521 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_initializer_list6526 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6530 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_statement_in_statement6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOMIC_in_atomic_statement6666 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_atomic_statement6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_labeled_statement6695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_labeled_statement6697 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement6720 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement6722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_labeled_statement6724 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement6747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_labeled_statement6749 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement6777 = new BitSet(new long[]{0x840E0005BE158080L,0x060A611F88103646L,0x3FF478CB02A3FFFFL,0x000000000000013BL});
    public static final BitSet FOLLOW_declaration_in_compound_statement6790 = new BitSet(new long[]{0x840E0005BE158080L,0x060A611F88103646L,0x3FF478CB02A3FFFFL,0x000000000000013BL});
    public static final BitSet FOLLOW_statement_in_compound_statement6793 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508302A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement6842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_expression_statement6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6907 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6909 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_selection_statement6911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6913 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement6919 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6961 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6963 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_selection_statement6965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6967 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement7003 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement7005 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_selection_statement7007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement7009 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement7057 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement7059 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement7063 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_iteration_statement7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_iteration_statement7086 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_iteration_statement7088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement7090 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement7092 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement7096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_iteration_statement7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement7119 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement7121 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_iteration_statement7128 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_iteration_statement7135 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024510102A00000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement7142 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_iteration_statement7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_jump_statement7251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_jump_statement7253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement7274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement7291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement7308 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_jump_statement7310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_translation_unit7349 = new BitSet(new long[]{0x0002000488048002L,0x0200201F80801646L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit7353 = new BitSet(new long[]{0x0002000488048002L,0x0200201F80801646L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_in_external_declaration7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive7398 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive7402 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7404 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition7435 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_declarator_in_function_definition7437 = new BitSet(new long[]{0x0000000000020000L,0x0000010000040000L});
    public static final BitSet FOLLOW_attributes_in_function_definition7440 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_gcc_attributes_in_function_definition7444 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7494 = new BitSet(new long[]{0x0000804000000000L,0x0020002000080000L});
    public static final BitSet FOLLOW_large_scale_construct_in_nesC_file7497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_definition_in_large_scale_construct7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_in_large_scale_construct7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_definition7573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_interface_definition7575 = new BitSet(new long[]{0x0000000000020000L,0x0000050000000000L});
    public static final BitSet FOLLOW_type_parameters_in_interface_definition7577 = new BitSet(new long[]{0x0000000000020000L,0x0000010000000000L});
    public static final BitSet FOLLOW_attributes_in_interface_definition7580 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interface_definition7591 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_line_directive_in_interface_definition7604 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_in_interface_definition7608 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_RBRACE_in_interface_definition7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_parameters7668 = new BitSet(new long[]{0x0000000088000000L,0x0000201F00001042L,0x3C4028010003FFFFL,0x000000000000000BL});
    public static final BitSet FOLLOW_type_parameter_list_in_type_parameters7670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_GREATER_in_type_parameters7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7691 = new BitSet(new long[]{0x0000000200020002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7693 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_type_parameter_list7697 = new BitSet(new long[]{0x0000000088000000L,0x0000201F00001042L,0x3C4028010003FFFFL,0x000000000000000BL});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7699 = new BitSet(new long[]{0x0000000200020002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7701 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_component_kind_in_component7723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component7725 = new BitSet(new long[]{0x0000000000020000L,0x0000410000000000L});
    public static final BitSet FOLLOW_component_parameters_in_component7727 = new BitSet(new long[]{0x0000000000020000L,0x0000010000000000L});
    public static final BitSet FOLLOW_attributes_in_component7730 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_component_specification_in_component7741 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_implementation_in_component7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_component_kind7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7880 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7910 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_implementation7941 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_implementation7943 = new BitSet(new long[]{0x0002008488048020L,0x0200221F80801646L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_body_in_implementation7945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_implementation7947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_component_parameters7988 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3F5029490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_parameter_list_in_component_parameters7990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_parameters7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list8033 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_component_parameter_list8036 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list8038 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_component_parameter8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_component_parameter8075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component_parameter8077 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_attributes_in_component_parameter8079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_body_in_body8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_body_in_body8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_element_list_in_configuration_body8145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_module_body8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_configuration_element_list8215 = new BitSet(new long[]{0x0000008000000022L,0x0000020000800000L,0x0000000100000000L});
    public static final BitSet FOLLOW_configuration_element_in_configuration_element_list8219 = new BitSet(new long[]{0x0000008000000022L,0x0000020000800000L,0x0000000100000000L});
    public static final BitSet FOLLOW_components_in_configuration_element8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connection_in_configuration_element8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTS_in_components8296 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_component_line_in_components8298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_components8300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_declaration_in_component_line8327 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_component_line8330 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_component_declaration_in_component_line8332 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_component_ref_in_component_declaration8358 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_AS_in_component_declaration8361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component_declaration8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_component_ref8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_component_ref8412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component_ref8414 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_component_ref8416 = new BitSet(new long[]{0x000600019C100080L,0x040A601F00001042L,0x3C64794102A3FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_argument_list_in_component_ref8418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_ref8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8468 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_component_argument_list8471 = new BitSet(new long[]{0x000600019C100080L,0x040A601F00001042L,0x3C64784102A3FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8473 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_assignment_expression_in_component_argument8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_component_argument8526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8545 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_connection8548 = new BitSet(new long[]{0x0000000000002800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_wire_rhs_in_connection8550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_connection8552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_wire_rhs8593 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_wire_rhs8608 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_wire_rhs8622 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_in_certificate_specification8640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8644 = new BitSet(new long[]{0x0000000000005000L,0x0000000000002000L});
    public static final BitSet FOLLOW_AS_in_certificate_specification8647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8651 = new BitSet(new long[]{0x0000000000004000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ASSUMING_in_certificate_specification8656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_FOR_in_certificate_specification8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8728 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_endpoint8730 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_argument_expression_list_in_endpoint8732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_endpoint8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8753 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8758 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACKET_in_identifier_path8792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifier_path8798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification8854 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B8003FFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_line_directive_in_component_specification8869 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B8003FFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_uses_provides_in_component_specification8873 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B8003FFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_RBRACE_in_component_specification8877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides8905 = new BitSet(new long[]{0x0002000488048000L,0x0200213F80001646L,0x3F5028590003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides8926 = new BitSet(new long[]{0x0002000488048000L,0x0200213F80001646L,0x3F5028590003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_uses_provides8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list8989 = new BitSet(new long[]{0x0002000488048000L,0x0200203F80001646L,0x3F5028590003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8991 = new BitSet(new long[]{0x0002000488048000L,0x0200203F80001646L,0x3F50285B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_type_in_specification_element9029 = new BitSet(new long[]{0x0000000000021000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_AS_in_specification_element9032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_specification_element9034 = new BitSet(new long[]{0x0000000000020000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_instance_parameters_in_specification_element9038 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_attributes_in_specification_element9041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_specification_element9044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOTE_in_interface_type9091 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_type9094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_interface_type9096 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_type_arguments_in_interface_type9098 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_REQUIRES_in_interface_type9102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_interface_type9104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_arguments9154 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_type_arguments9156 = new BitSet(new long[]{0x0000000200000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_type_arguments9159 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_type_arguments9161 = new BitSet(new long[]{0x0000000200000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_GREATER_in_type_arguments9165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_instance_parameters9189 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D50284D0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_instance_parameters9191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_instance_parameters9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributes9212 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute9232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_attribute9234 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_attribute9236 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_list_in_attribute9238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_attribute9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GCCATTRIBUTE_in_gcc_attributes9262 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes9264 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes9266 = new BitSet(new long[]{0x0004000314100080L,0x040A400000000000L,0x0024510102A00000L});
    public static final BitSet FOLLOW_gcc_attribute_list_in_gcc_attributes9268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes9270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list9287 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_gcc_attribute_list9291 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list9293 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_assignment_expression_in_gcc_attribute9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred1_nesC3466 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred1_nesC3468 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_synpred1_nesC3470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred1_nesC3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred2_nesC3543 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_synpred2_nesC3545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred2_nesC3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_synpred3_nesC3971 = new BitSet(new long[]{0x2000000001482000L,0x0095000000000000L,0x0000040000400000L});
    public static final BitSet FOLLOW_assignment_operator_in_synpred3_nesC3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred4_nesC4100 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred4_nesC4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred5_nesC4176 = new BitSet(new long[]{0x0000000000000000L,0x0000400000040000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_gcc_attributes_in_synpred5_nesC4178 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred5_nesC4181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_synpred5_nesC4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_synpred6_nesC4372 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred6_nesC4374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_synpred6_nesC4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred7_nesC5891 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500502A00000L});
    public static final BitSet FOLLOW_constant_expression_in_synpred7_nesC5893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred7_nesC5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred8_nesC6202 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_attributes_in_synpred8_nesC6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred9_nesC6297 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred9_nesC6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred10_nesC6339 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_synpred10_nesC6341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred10_nesC6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred11_nesC6880 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred11_nesC6882 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_synpred11_nesC6884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred11_nesC6886 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_synpred11_nesC6888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ELSE_in_synpred11_nesC6890 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_synpred11_nesC6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_body_in_synpred12_nesC8100 = new BitSet(new long[]{0x0000000000000002L});

}