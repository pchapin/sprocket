// $ANTLR 3.4 nesC.g 2013-04-28 10:30:07

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
    // nesC.g:405:1: assignment_expression : conditional_expression ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )? ;
    public final nesCParser.assignment_expression_return assignment_expression() throws RecognitionException {
        nesCParser.assignment_expression_return retval = new nesCParser.assignment_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal104=null;
        Token string_literal105=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token string_literal108=null;
        Token string_literal109=null;
        Token string_literal110=null;
        Token string_literal111=null;
        Token string_literal112=null;
        Token string_literal113=null;
        Token string_literal114=null;
        nesCParser.conditional_expression_return conditional_expression103 =null;

        nesCParser.assignment_expression_return assignment_expression115 =null;


        Object char_literal104_tree=null;
        Object string_literal105_tree=null;
        Object string_literal106_tree=null;
        Object string_literal107_tree=null;
        Object string_literal108_tree=null;
        Object string_literal109_tree=null;
        Object string_literal110_tree=null;
        Object string_literal111_tree=null;
        Object string_literal112_tree=null;
        Object string_literal113_tree=null;
        Object string_literal114_tree=null;

        try {
            // nesC.g:406:5: ( conditional_expression ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )? )
            // nesC.g:406:10: conditional_expression ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_assignment_expression3979);
            conditional_expression103=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression103.getTree());

            // nesC.g:406:33: ( ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ASSIGN||LA28_0==BITANDASSIGN||LA28_0==BITORASSIGN||LA28_0==BITXORASSIGN||LA28_0==DIVASSIGN||LA28_0==LSHIFTASSIGN||LA28_0==MINUSASSIGN||LA28_0==MODASSIGN||LA28_0==MULASSIGN||LA28_0==PLUSASSIGN||LA28_0==RSHIFTASSIGN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // nesC.g:406:34: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression
                    {
                    // nesC.g:406:34: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^)
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
                            // nesC.g:406:35: '=' ^
                            {
                            char_literal104=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expression3983); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal104_tree = 
                            (Object)adaptor.create(char_literal104)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal104_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:406:42: '*=' ^
                            {
                            string_literal105=(Token)match(input,MULASSIGN,FOLLOW_MULASSIGN_in_assignment_expression3988); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal105_tree = 
                            (Object)adaptor.create(string_literal105)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal105_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // nesC.g:406:50: '/=' ^
                            {
                            string_literal106=(Token)match(input,DIVASSIGN,FOLLOW_DIVASSIGN_in_assignment_expression3993); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal106_tree = 
                            (Object)adaptor.create(string_literal106)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // nesC.g:406:58: '%=' ^
                            {
                            string_literal107=(Token)match(input,MODASSIGN,FOLLOW_MODASSIGN_in_assignment_expression3998); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal107_tree = 
                            (Object)adaptor.create(string_literal107)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal107_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // nesC.g:406:66: '+=' ^
                            {
                            string_literal108=(Token)match(input,PLUSASSIGN,FOLLOW_PLUSASSIGN_in_assignment_expression4003); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal108_tree = 
                            (Object)adaptor.create(string_literal108)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal108_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // nesC.g:406:74: '-=' ^
                            {
                            string_literal109=(Token)match(input,MINUSASSIGN,FOLLOW_MINUSASSIGN_in_assignment_expression4008); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal109_tree = 
                            (Object)adaptor.create(string_literal109)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal109_tree, root_0);
                            }

                            }
                            break;
                        case 7 :
                            // nesC.g:406:82: '<<=' ^
                            {
                            string_literal110=(Token)match(input,LSHIFTASSIGN,FOLLOW_LSHIFTASSIGN_in_assignment_expression4013); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal110_tree = 
                            (Object)adaptor.create(string_literal110)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);
                            }

                            }
                            break;
                        case 8 :
                            // nesC.g:406:91: '>>=' ^
                            {
                            string_literal111=(Token)match(input,RSHIFTASSIGN,FOLLOW_RSHIFTASSIGN_in_assignment_expression4018); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal111_tree = 
                            (Object)adaptor.create(string_literal111)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal111_tree, root_0);
                            }

                            }
                            break;
                        case 9 :
                            // nesC.g:406:100: '&=' ^
                            {
                            string_literal112=(Token)match(input,BITANDASSIGN,FOLLOW_BITANDASSIGN_in_assignment_expression4023); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal112_tree = 
                            (Object)adaptor.create(string_literal112)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal112_tree, root_0);
                            }

                            }
                            break;
                        case 10 :
                            // nesC.g:406:108: '^=' ^
                            {
                            string_literal113=(Token)match(input,BITXORASSIGN,FOLLOW_BITXORASSIGN_in_assignment_expression4028); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal113_tree = 
                            (Object)adaptor.create(string_literal113)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal113_tree, root_0);
                            }

                            }
                            break;
                        case 11 :
                            // nesC.g:406:116: '|=' ^
                            {
                            string_literal114=(Token)match(input,BITORASSIGN,FOLLOW_BITORASSIGN_in_assignment_expression4033); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal114_tree = 
                            (Object)adaptor.create(string_literal114)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal114_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression4037);
                    assignment_expression115=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression115.getTree());

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
    // nesC.g:408:1: expression : assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )* ;
    public final nesCParser.expression_return expression() throws RecognitionException {
        nesCParser.expression_return retval = new nesCParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal117=null;
        nesCParser.assignment_expression_return assignment_expression116 =null;

        nesCParser.assignment_expression_return assignment_expression118 =null;


        Object char_literal117_tree=null;

        try {
            // nesC.g:409:5: ( assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )* )
            // nesC.g:409:10: assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression4054);
            assignment_expression116=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression116.getTree());

            // nesC.g:409:32: ( ( ',' assignment_expression )=> ',' ^ assignment_expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred3_nesC()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // nesC.g:409:33: ( ',' assignment_expression )=> ',' ^ assignment_expression
            	    {
            	    char_literal117=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression4065); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal117_tree = 
            	    (Object)adaptor.create(char_literal117)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal117_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression4068);
            	    assignment_expression118=assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression118.getTree());

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
    // nesC.g:411:1: constant_expression : conditional_expression ;
    public final nesCParser.constant_expression_return constant_expression() throws RecognitionException {
        nesCParser.constant_expression_return retval = new nesCParser.constant_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.conditional_expression_return conditional_expression119 =null;



        try {
            // nesC.g:412:5: ( conditional_expression )
            // nesC.g:412:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression4089);
            conditional_expression119=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression119.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // nesC.g:432:1: declaration : ( ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';' -> ^( DECLARATION TYPEDEF declaration_specifiers ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) );
    public final nesCParser.declaration_return declaration() throws RecognitionException {
        declaration_stack.push(new declaration_scope());
        nesCParser.declaration_return retval = new nesCParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal123=null;
        Token TYPEDEF125=null;
        Token char_literal127=null;
        Token TYPEDEF128=null;
        Token char_literal133=null;
        nesCParser.declaration_specifiers_return declaration_specifiers120 =null;

        nesCParser.gcc_attributes_return gcc_attributes121 =null;

        nesCParser.init_declarator_list_return init_declarator_list122 =null;

        nesCParser.function_definition_return function_definition124 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers126 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers129 =null;

        nesCParser.gcc_attributes_return gcc_attributes130 =null;

        nesCParser.init_declarator_list_return init_declarator_list131 =null;

        nesCParser.gcc_attributes_return gcc_attributes132 =null;


        Object char_literal123_tree=null;
        Object TYPEDEF125_tree=null;
        Object char_literal127_tree=null;
        Object TYPEDEF128_tree=null;
        Object char_literal133_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        RewriteRuleSubtreeStream stream_gcc_attributes=new RewriteRuleSubtreeStream(adaptor,"rule gcc_attributes");
        try {
            // nesC.g:435:5: ( ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';' -> ^( DECLARATION TYPEDEF declaration_specifiers ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) )
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred4_nesC()) ) {
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

                if ( (synpred5_nesC()) ) {
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
                    // nesC.g:435:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )=> declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4177);
                    declaration_specifiers120=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers120.getTree());

                    // nesC.g:440:33: ( gcc_attributes )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==GCCATTRIBUTE) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // nesC.g:440:33: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4179);
                            gcc_attributes121=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes121.getTree());

                            }
                            break;

                    }


                    // nesC.g:440:49: ( init_declarator_list )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==LPARENS||LA31_0==RAW_IDENTIFIER||LA31_0==STAR) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // nesC.g:440:49: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration4182);
                            init_declarator_list122=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list122.getTree());

                            }
                            break;

                    }


                    char_literal123=(Token)match(input,200,FOLLOW_200_in_declaration4185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal123);


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
                    // 447:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // nesC.g:447:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:447:54: ( init_declarator_list )?
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
                    // nesC.g:449:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration4247);
                    function_definition124=function_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_definition.add(function_definition124.getTree());

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
                    // 459:14: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // nesC.g:459:17: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // nesC.g:459:31: ^( FUNCTION_DEFINITION function_definition )
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
                    // nesC.g:464:10: ( TYPEDEF declaration_specifiers ';' )=> TYPEDEF declaration_specifiers ';'
                    {
                    TYPEDEF125=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration4339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF125);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4341);
                    declaration_specifiers126=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers126.getTree());

                    char_literal127=(Token)match(input,200,FOLLOW_200_in_declaration4343); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal127);


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
                    // 465:14: -> ^( DECLARATION TYPEDEF declaration_specifiers )
                    {
                        // nesC.g:465:17: ^( DECLARATION TYPEDEF declaration_specifiers )
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
                    // nesC.g:467:10: TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF128=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration4389); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF128);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4391);
                    declaration_specifiers129=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers129.getTree());

                    // nesC.g:470:41: ( gcc_attributes )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==GCCATTRIBUTE) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // nesC.g:470:41: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4393);
                            gcc_attributes130=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes130.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_init_declarator_list_in_declaration4396);
                    init_declarator_list131=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list131.getTree());

                    // nesC.g:470:78: ( gcc_attributes )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==GCCATTRIBUTE) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // nesC.g:470:78: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4398);
                            gcc_attributes132=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes132.getTree());

                            }
                            break;

                    }


                    char_literal133=(Token)match(input,200,FOLLOW_200_in_declaration4401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal133);


                    if ( state.backtracking==0 ) {
                                   // Inefficient, but how many declarators will be in a declaration, honestly?
                                   for (int i = 0; i < ((declaration_scope)declaration_stack.peek()).declaredNames.size(); ++i) {
                                       symbols.addType(((declaration_scope)declaration_stack.peek()).declaredNames.get(i));
                                   }
                                 }

                    // AST REWRITE
                    // elements: declaration_specifiers, TYPEDEF, init_declarator_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 477:14: -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                    {
                        // nesC.g:477:17: ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
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
    // nesC.g:485:1: declaration_specifiers : ( c_style_declaration_specifier )+ ;
    public final nesCParser.declaration_specifiers_return declaration_specifiers() throws RecognitionException {
        nesCParser.declaration_specifiers_return retval = new nesCParser.declaration_specifiers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.c_style_declaration_specifier_return c_style_declaration_specifier134 =null;



        try {
            // nesC.g:486:5: ( ( c_style_declaration_specifier )+ )
            // nesC.g:486:25: ( c_style_declaration_specifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:486:25: ( c_style_declaration_specifier )+
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
            	    // nesC.g:486:25: c_style_declaration_specifier
            	    {
            	    pushFollow(FOLLOW_c_style_declaration_specifier_in_declaration_specifiers4468);
            	    c_style_declaration_specifier134=c_style_declaration_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, c_style_declaration_specifier134.getTree());

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
    // nesC.g:488:1: c_style_declaration_specifier : ( storage_class_specifier | type_specifier | type_qualifier | function_specifier );
    public final nesCParser.c_style_declaration_specifier_return c_style_declaration_specifier() throws RecognitionException {
        nesCParser.c_style_declaration_specifier_return retval = new nesCParser.c_style_declaration_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.storage_class_specifier_return storage_class_specifier135 =null;

        nesCParser.type_specifier_return type_specifier136 =null;

        nesCParser.type_qualifier_return type_qualifier137 =null;

        nesCParser.function_specifier_return function_specifier138 =null;



        try {
            // nesC.g:489:5: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier )
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
                    // nesC.g:489:10: storage_class_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_storage_class_specifier_in_c_style_declaration_specifier4484);
                    storage_class_specifier135=storage_class_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier135.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:490:10: type_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_specifier_in_c_style_declaration_specifier4495);
                    type_specifier136=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier136.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:491:10: type_qualifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_qualifier_in_c_style_declaration_specifier4506);
                    type_qualifier137=type_qualifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier137.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:492:10: function_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_function_specifier_in_c_style_declaration_specifier4517);
                    function_specifier138=function_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_specifier138.getTree());

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
    // nesC.g:498:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
    public final nesCParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
        nesCParser.init_declarator_list_return retval = new nesCParser.init_declarator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal140=null;
        nesCParser.init_declarator_return init_declarator139 =null;

        nesCParser.init_declarator_return init_declarator141 =null;


        Object char_literal140_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");
        try {
            // nesC.g:499:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // nesC.g:499:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list4538);
            init_declarator139=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator139.getTree());

            // nesC.g:499:26: ( ',' init_declarator )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==COMMA) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // nesC.g:499:27: ',' init_declarator
            	    {
            	    char_literal140=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list4541); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal140);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list4543);
            	    init_declarator141=init_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator141.getTree());

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
            // 499:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // nesC.g:499:52: ^( DECLARATOR_LIST ( init_declarator )+ )
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
    // nesC.g:505:1: init_declarator : declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
    public final nesCParser.init_declarator_return init_declarator() throws RecognitionException {
        nesCParser.init_declarator_return retval = new nesCParser.init_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal144=null;
        nesCParser.declarator_return declarator142 =null;

        nesCParser.attributes_return attributes143 =null;

        nesCParser.initializer_return initializer145 =null;


        Object char_literal144_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // nesC.g:506:5: ( declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // nesC.g:506:10: declarator ( attributes )? ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator4577);
            declarator142=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator142.getTree());

            // nesC.g:506:21: ( attributes )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ATTRIBUTE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // nesC.g:506:21: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_init_declarator4579);
                    attributes143=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes143.getTree());

                    }
                    break;

            }


            // nesC.g:506:33: ( '=' initializer )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ASSIGN) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // nesC.g:506:34: '=' initializer
                    {
                    char_literal144=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator4583); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal144);


                    pushFollow(FOLLOW_initializer_in_init_declarator4585);
                    initializer145=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer145.getTree());

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
            // 506:52: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // nesC.g:506:55: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // nesC.g:506:84: ( initializer )?
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
    // nesC.g:508:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK );
    public final nesCParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        nesCParser.storage_class_specifier_return retval = new nesCParser.storage_class_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set146=null;

        Object set146_tree=null;

        try {
            // nesC.g:509:5: ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set146=(Token)input.LT(1);

            if ( input.LA(1)==ASYNC||input.LA(1)==AUTO||input.LA(1)==COMMAND||input.LA(1)==DUTY||(input.LA(1) >= EVENT && input.LA(1) <= EXTERN)||input.LA(1)==NORACE||input.LA(1)==REGISTER||input.LA(1)==STATIC||input.LA(1)==TASK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set146)
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
    // nesC.g:520:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_INT8_T | NX_INT16_T | NX_INT32_T | NX_INT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_INT8_T | NXLE_INT16_T | NXLE_INT32_T | NXLE_INT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | BUILTIN_VA_LIST | struct_or_union_specifier | enum_specifier | typedef_name );
    public final nesCParser.type_specifier_return type_specifier() throws RecognitionException {
        nesCParser.type_specifier_return retval = new nesCParser.type_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID147=null;
        Token CHAR148=null;
        Token SHORT149=null;
        Token INT150=null;
        Token LONG151=null;
        Token SIGNED152=null;
        Token UNSIGNED153=null;
        Token FLOAT154=null;
        Token DOUBLE155=null;
        Token INT8_T156=null;
        Token INT16_T157=null;
        Token INT32_T158=null;
        Token INT64_T159=null;
        Token UINT8_T160=null;
        Token UINT16_T161=null;
        Token UINT32_T162=null;
        Token UINT64_T163=null;
        Token NX_INT8_T164=null;
        Token NX_INT16_T165=null;
        Token NX_INT32_T166=null;
        Token NX_INT64_T167=null;
        Token NX_UINT8_T168=null;
        Token NX_UINT16_T169=null;
        Token NX_UINT32_T170=null;
        Token NX_UINT64_T171=null;
        Token NXLE_INT8_T172=null;
        Token NXLE_INT16_T173=null;
        Token NXLE_INT32_T174=null;
        Token NXLE_INT64_T175=null;
        Token NXLE_UINT8_T176=null;
        Token NXLE_UINT16_T177=null;
        Token NXLE_UINT32_T178=null;
        Token NXLE_UINT64_T179=null;
        Token BUILTIN_VA_LIST180=null;
        nesCParser.struct_or_union_specifier_return struct_or_union_specifier181 =null;

        nesCParser.enum_specifier_return enum_specifier182 =null;

        nesCParser.typedef_name_return typedef_name183 =null;


        Object VOID147_tree=null;
        Object CHAR148_tree=null;
        Object SHORT149_tree=null;
        Object INT150_tree=null;
        Object LONG151_tree=null;
        Object SIGNED152_tree=null;
        Object UNSIGNED153_tree=null;
        Object FLOAT154_tree=null;
        Object DOUBLE155_tree=null;
        Object INT8_T156_tree=null;
        Object INT16_T157_tree=null;
        Object INT32_T158_tree=null;
        Object INT64_T159_tree=null;
        Object UINT8_T160_tree=null;
        Object UINT16_T161_tree=null;
        Object UINT32_T162_tree=null;
        Object UINT64_T163_tree=null;
        Object NX_INT8_T164_tree=null;
        Object NX_INT16_T165_tree=null;
        Object NX_INT32_T166_tree=null;
        Object NX_INT64_T167_tree=null;
        Object NX_UINT8_T168_tree=null;
        Object NX_UINT16_T169_tree=null;
        Object NX_UINT32_T170_tree=null;
        Object NX_UINT64_T171_tree=null;
        Object NXLE_INT8_T172_tree=null;
        Object NXLE_INT16_T173_tree=null;
        Object NXLE_INT32_T174_tree=null;
        Object NXLE_INT64_T175_tree=null;
        Object NXLE_UINT8_T176_tree=null;
        Object NXLE_UINT16_T177_tree=null;
        Object NXLE_UINT32_T178_tree=null;
        Object NXLE_UINT64_T179_tree=null;
        Object BUILTIN_VA_LIST180_tree=null;

        try {
            // nesC.g:521:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_INT8_T | NX_INT16_T | NX_INT32_T | NX_INT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_INT8_T | NXLE_INT16_T | NXLE_INT32_T | NXLE_INT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | BUILTIN_VA_LIST | struct_or_union_specifier | enum_specifier | typedef_name )
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
                    // nesC.g:521:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID147=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier4734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID147_tree = 
                    (Object)adaptor.create(VOID147)
                    ;
                    adaptor.addChild(root_0, VOID147_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:522:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR148=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier4744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR148_tree = 
                    (Object)adaptor.create(CHAR148)
                    ;
                    adaptor.addChild(root_0, CHAR148_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:523:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT149=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier4754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT149_tree = 
                    (Object)adaptor.create(SHORT149)
                    ;
                    adaptor.addChild(root_0, SHORT149_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:524:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT150=(Token)match(input,INT,FOLLOW_INT_in_type_specifier4764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT150_tree = 
                    (Object)adaptor.create(INT150)
                    ;
                    adaptor.addChild(root_0, INT150_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:525:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG151=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier4774); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG151_tree = 
                    (Object)adaptor.create(LONG151)
                    ;
                    adaptor.addChild(root_0, LONG151_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:526:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED152=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier4784); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED152_tree = 
                    (Object)adaptor.create(SIGNED152)
                    ;
                    adaptor.addChild(root_0, SIGNED152_tree);
                    }

                    }
                    break;
                case 7 :
                    // nesC.g:527:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED153=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier4794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED153_tree = 
                    (Object)adaptor.create(UNSIGNED153)
                    ;
                    adaptor.addChild(root_0, UNSIGNED153_tree);
                    }

                    }
                    break;
                case 8 :
                    // nesC.g:528:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT154=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier4804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT154_tree = 
                    (Object)adaptor.create(FLOAT154)
                    ;
                    adaptor.addChild(root_0, FLOAT154_tree);
                    }

                    }
                    break;
                case 9 :
                    // nesC.g:529:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLE155=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_type_specifier4814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE155_tree = 
                    (Object)adaptor.create(DOUBLE155)
                    ;
                    adaptor.addChild(root_0, DOUBLE155_tree);
                    }

                    }
                    break;
                case 10 :
                    // nesC.g:531:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T156=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier4825); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T156_tree = 
                    (Object)adaptor.create(INT8_T156)
                    ;
                    adaptor.addChild(root_0, INT8_T156_tree);
                    }

                    }
                    break;
                case 11 :
                    // nesC.g:532:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T157=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier4835); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T157_tree = 
                    (Object)adaptor.create(INT16_T157)
                    ;
                    adaptor.addChild(root_0, INT16_T157_tree);
                    }

                    }
                    break;
                case 12 :
                    // nesC.g:533:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T158=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier4845); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T158_tree = 
                    (Object)adaptor.create(INT32_T158)
                    ;
                    adaptor.addChild(root_0, INT32_T158_tree);
                    }

                    }
                    break;
                case 13 :
                    // nesC.g:534:9: INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT64_T159=(Token)match(input,INT64_T,FOLLOW_INT64_T_in_type_specifier4855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT64_T159_tree = 
                    (Object)adaptor.create(INT64_T159)
                    ;
                    adaptor.addChild(root_0, INT64_T159_tree);
                    }

                    }
                    break;
                case 14 :
                    // nesC.g:536:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T160=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier4866); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T160_tree = 
                    (Object)adaptor.create(UINT8_T160)
                    ;
                    adaptor.addChild(root_0, UINT8_T160_tree);
                    }

                    }
                    break;
                case 15 :
                    // nesC.g:537:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T161=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier4876); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T161_tree = 
                    (Object)adaptor.create(UINT16_T161)
                    ;
                    adaptor.addChild(root_0, UINT16_T161_tree);
                    }

                    }
                    break;
                case 16 :
                    // nesC.g:538:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T162=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier4886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T162_tree = 
                    (Object)adaptor.create(UINT32_T162)
                    ;
                    adaptor.addChild(root_0, UINT32_T162_tree);
                    }

                    }
                    break;
                case 17 :
                    // nesC.g:539:9: UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT64_T163=(Token)match(input,UINT64_T,FOLLOW_UINT64_T_in_type_specifier4896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT64_T163_tree = 
                    (Object)adaptor.create(UINT64_T163)
                    ;
                    adaptor.addChild(root_0, UINT64_T163_tree);
                    }

                    }
                    break;
                case 18 :
                    // nesC.g:541:9: NX_INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT8_T164=(Token)match(input,NX_INT8_T,FOLLOW_NX_INT8_T_in_type_specifier4907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT8_T164_tree = 
                    (Object)adaptor.create(NX_INT8_T164)
                    ;
                    adaptor.addChild(root_0, NX_INT8_T164_tree);
                    }

                    }
                    break;
                case 19 :
                    // nesC.g:542:9: NX_INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT16_T165=(Token)match(input,NX_INT16_T,FOLLOW_NX_INT16_T_in_type_specifier4917); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT16_T165_tree = 
                    (Object)adaptor.create(NX_INT16_T165)
                    ;
                    adaptor.addChild(root_0, NX_INT16_T165_tree);
                    }

                    }
                    break;
                case 20 :
                    // nesC.g:543:9: NX_INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT32_T166=(Token)match(input,NX_INT32_T,FOLLOW_NX_INT32_T_in_type_specifier4927); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT32_T166_tree = 
                    (Object)adaptor.create(NX_INT32_T166)
                    ;
                    adaptor.addChild(root_0, NX_INT32_T166_tree);
                    }

                    }
                    break;
                case 21 :
                    // nesC.g:544:9: NX_INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT64_T167=(Token)match(input,NX_INT64_T,FOLLOW_NX_INT64_T_in_type_specifier4937); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT64_T167_tree = 
                    (Object)adaptor.create(NX_INT64_T167)
                    ;
                    adaptor.addChild(root_0, NX_INT64_T167_tree);
                    }

                    }
                    break;
                case 22 :
                    // nesC.g:546:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T168=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier4948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T168_tree = 
                    (Object)adaptor.create(NX_UINT8_T168)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T168_tree);
                    }

                    }
                    break;
                case 23 :
                    // nesC.g:547:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T169=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier4958); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T169_tree = 
                    (Object)adaptor.create(NX_UINT16_T169)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T169_tree);
                    }

                    }
                    break;
                case 24 :
                    // nesC.g:548:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T170=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier4968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T170_tree = 
                    (Object)adaptor.create(NX_UINT32_T170)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T170_tree);
                    }

                    }
                    break;
                case 25 :
                    // nesC.g:549:9: NX_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT64_T171=(Token)match(input,NX_UINT64_T,FOLLOW_NX_UINT64_T_in_type_specifier4978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT64_T171_tree = 
                    (Object)adaptor.create(NX_UINT64_T171)
                    ;
                    adaptor.addChild(root_0, NX_UINT64_T171_tree);
                    }

                    }
                    break;
                case 26 :
                    // nesC.g:551:9: NXLE_INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT8_T172=(Token)match(input,NXLE_INT8_T,FOLLOW_NXLE_INT8_T_in_type_specifier4989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT8_T172_tree = 
                    (Object)adaptor.create(NXLE_INT8_T172)
                    ;
                    adaptor.addChild(root_0, NXLE_INT8_T172_tree);
                    }

                    }
                    break;
                case 27 :
                    // nesC.g:552:9: NXLE_INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT16_T173=(Token)match(input,NXLE_INT16_T,FOLLOW_NXLE_INT16_T_in_type_specifier4999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT16_T173_tree = 
                    (Object)adaptor.create(NXLE_INT16_T173)
                    ;
                    adaptor.addChild(root_0, NXLE_INT16_T173_tree);
                    }

                    }
                    break;
                case 28 :
                    // nesC.g:553:9: NXLE_INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT32_T174=(Token)match(input,NXLE_INT32_T,FOLLOW_NXLE_INT32_T_in_type_specifier5009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT32_T174_tree = 
                    (Object)adaptor.create(NXLE_INT32_T174)
                    ;
                    adaptor.addChild(root_0, NXLE_INT32_T174_tree);
                    }

                    }
                    break;
                case 29 :
                    // nesC.g:554:9: NXLE_INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT64_T175=(Token)match(input,NXLE_INT64_T,FOLLOW_NXLE_INT64_T_in_type_specifier5019); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT64_T175_tree = 
                    (Object)adaptor.create(NXLE_INT64_T175)
                    ;
                    adaptor.addChild(root_0, NXLE_INT64_T175_tree);
                    }

                    }
                    break;
                case 30 :
                    // nesC.g:556:9: NXLE_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT8_T176=(Token)match(input,NXLE_UINT8_T,FOLLOW_NXLE_UINT8_T_in_type_specifier5030); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT8_T176_tree = 
                    (Object)adaptor.create(NXLE_UINT8_T176)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT8_T176_tree);
                    }

                    }
                    break;
                case 31 :
                    // nesC.g:557:9: NXLE_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT16_T177=(Token)match(input,NXLE_UINT16_T,FOLLOW_NXLE_UINT16_T_in_type_specifier5040); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT16_T177_tree = 
                    (Object)adaptor.create(NXLE_UINT16_T177)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT16_T177_tree);
                    }

                    }
                    break;
                case 32 :
                    // nesC.g:558:9: NXLE_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT32_T178=(Token)match(input,NXLE_UINT32_T,FOLLOW_NXLE_UINT32_T_in_type_specifier5050); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT32_T178_tree = 
                    (Object)adaptor.create(NXLE_UINT32_T178)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT32_T178_tree);
                    }

                    }
                    break;
                case 33 :
                    // nesC.g:559:9: NXLE_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT64_T179=(Token)match(input,NXLE_UINT64_T,FOLLOW_NXLE_UINT64_T_in_type_specifier5060); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT64_T179_tree = 
                    (Object)adaptor.create(NXLE_UINT64_T179)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT64_T179_tree);
                    }

                    }
                    break;
                case 34 :
                    // nesC.g:561:9: BUILTIN_VA_LIST
                    {
                    root_0 = (Object)adaptor.nil();


                    BUILTIN_VA_LIST180=(Token)match(input,BUILTIN_VA_LIST,FOLLOW_BUILTIN_VA_LIST_in_type_specifier5071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BUILTIN_VA_LIST180_tree = 
                    (Object)adaptor.create(BUILTIN_VA_LIST180)
                    ;
                    adaptor.addChild(root_0, BUILTIN_VA_LIST180_tree);
                    }

                    }
                    break;
                case 35 :
                    // nesC.g:563:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier5086);
                    struct_or_union_specifier181=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier181.getTree());

                    }
                    break;
                case 36 :
                    // nesC.g:564:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier5096);
                    enum_specifier182=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier182.getTree());

                    }
                    break;
                case 37 :
                    // nesC.g:565:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier5106);
                    typedef_name183=typedef_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedef_name183.getTree());

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
    // nesC.g:571:1: struct_or_union_specifier : ( struct_or_union '{' ( struct_declaration_list )? '}' -> ^( struct_or_union ( struct_declaration_list )? ) | struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )? -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? ) | STRUCT '@' RAW_IDENTIFIER '{' ( struct_declaration_list )? '}' -> ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? ) );
    public final nesCParser.struct_or_union_specifier_return struct_or_union_specifier() throws RecognitionException {
        nesCParser.struct_or_union_specifier_return retval = new nesCParser.struct_or_union_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal185=null;
        Token char_literal187=null;
        Token RAW_IDENTIFIER189=null;
        Token char_literal190=null;
        Token char_literal192=null;
        Token STRUCT193=null;
        Token char_literal194=null;
        Token RAW_IDENTIFIER195=null;
        Token char_literal196=null;
        Token char_literal198=null;
        nesCParser.struct_or_union_return struct_or_union184 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list186 =null;

        nesCParser.struct_or_union_return struct_or_union188 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list191 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list197 =null;


        Object char_literal185_tree=null;
        Object char_literal187_tree=null;
        Object RAW_IDENTIFIER189_tree=null;
        Object char_literal190_tree=null;
        Object char_literal192_tree=null;
        Object STRUCT193_tree=null;
        Object char_literal194_tree=null;
        Object RAW_IDENTIFIER195_tree=null;
        Object char_literal196_tree=null;
        Object char_literal198_tree=null;
        RewriteRuleTokenStream stream_STRUCT=new RewriteRuleTokenStream(adaptor,"token STRUCT");
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleTokenStream stream_ATTRIBUTE=new RewriteRuleTokenStream(adaptor,"token ATTRIBUTE");
        RewriteRuleSubtreeStream stream_struct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declaration_list");
        RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");
        try {
            // nesC.g:572:5: ( struct_or_union '{' ( struct_declaration_list )? '}' -> ^( struct_or_union ( struct_declaration_list )? ) | struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )? -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? ) | STRUCT '@' RAW_IDENTIFIER '{' ( struct_declaration_list )? '}' -> ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? ) )
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
                    // nesC.g:572:10: struct_or_union '{' ( struct_declaration_list )? '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier5125);
                    struct_or_union184=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union184.getTree());

                    char_literal185=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier5127); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal185);


                    // nesC.g:572:30: ( struct_declaration_list )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==BUILTIN_VA_LIST||LA41_0==CHAR||LA41_0==CONST||LA41_0==DOUBLE||LA41_0==ENUM||LA41_0==FLOAT||LA41_0==HASH||(LA41_0 >= INT && LA41_0 <= INT8_T)||LA41_0==LONG||(LA41_0 >= NXLE_INT16_T && LA41_0 <= NX_UNION)||LA41_0==RAW_IDENTIFIER||LA41_0==RESTRICT||LA41_0==SHORT||LA41_0==SIGNED||LA41_0==STRUCT||(LA41_0 >= UINT16_T && LA41_0 <= UINT8_T)||(LA41_0 >= UNION && LA41_0 <= UNSIGNED)||(LA41_0 >= VOID && LA41_0 <= VOLATILE)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // nesC.g:572:30: struct_declaration_list
                            {
                            pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier5129);
                            struct_declaration_list186=struct_declaration_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list186.getTree());

                            }
                            break;

                    }


                    char_literal187=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier5132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal187);


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
                    // 573:14: -> ^( struct_or_union ( struct_declaration_list )? )
                    {
                        // nesC.g:573:17: ^( struct_or_union ( struct_declaration_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        // nesC.g:573:35: ( struct_declaration_list )?
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
                    // nesC.g:574:10: struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )?
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier5165);
                    struct_or_union188=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union188.getTree());

                    RAW_IDENTIFIER189=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER189);


                    // nesC.g:574:41: ( '{' ( struct_declaration_list )? '}' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==LBRACE) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // nesC.g:574:60: '{' ( struct_declaration_list )? '}'
                            {
                            char_literal190=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier5172); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal190);


                            // nesC.g:574:64: ( struct_declaration_list )?
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==BUILTIN_VA_LIST||LA42_0==CHAR||LA42_0==CONST||LA42_0==DOUBLE||LA42_0==ENUM||LA42_0==FLOAT||LA42_0==HASH||(LA42_0 >= INT && LA42_0 <= INT8_T)||LA42_0==LONG||(LA42_0 >= NXLE_INT16_T && LA42_0 <= NX_UNION)||LA42_0==RAW_IDENTIFIER||LA42_0==RESTRICT||LA42_0==SHORT||LA42_0==SIGNED||LA42_0==STRUCT||(LA42_0 >= UINT16_T && LA42_0 <= UINT8_T)||(LA42_0 >= UNION && LA42_0 <= UNSIGNED)||(LA42_0 >= VOID && LA42_0 <= VOLATILE)) ) {
                                alt42=1;
                            }
                            switch (alt42) {
                                case 1 :
                                    // nesC.g:574:64: struct_declaration_list
                                    {
                                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier5174);
                                    struct_declaration_list191=struct_declaration_list();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list191.getTree());

                                    }
                                    break;

                            }


                            char_literal192=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier5177); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal192);


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
                    // 575:14: -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? )
                    {
                        // nesC.g:575:17: ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        stream_RAW_IDENTIFIER.nextNode()
                        );

                        // nesC.g:575:68: ( struct_declaration_list )?
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
                    // nesC.g:576:10: STRUCT '@' RAW_IDENTIFIER '{' ( struct_declaration_list )? '}'
                    {
                    STRUCT193=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_struct_or_union_specifier5216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRUCT.add(STRUCT193);


                    char_literal194=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_struct_or_union_specifier5218); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATTRIBUTE.add(char_literal194);


                    RAW_IDENTIFIER195=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER195);


                    char_literal196=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier5222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal196);


                    // nesC.g:576:40: ( struct_declaration_list )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==BUILTIN_VA_LIST||LA44_0==CHAR||LA44_0==CONST||LA44_0==DOUBLE||LA44_0==ENUM||LA44_0==FLOAT||LA44_0==HASH||(LA44_0 >= INT && LA44_0 <= INT8_T)||LA44_0==LONG||(LA44_0 >= NXLE_INT16_T && LA44_0 <= NX_UNION)||LA44_0==RAW_IDENTIFIER||LA44_0==RESTRICT||LA44_0==SHORT||LA44_0==SIGNED||LA44_0==STRUCT||(LA44_0 >= UINT16_T && LA44_0 <= UINT8_T)||(LA44_0 >= UNION && LA44_0 <= UNSIGNED)||(LA44_0 >= VOID && LA44_0 <= VOLATILE)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // nesC.g:576:40: struct_declaration_list
                            {
                            pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier5224);
                            struct_declaration_list197=struct_declaration_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list197.getTree());

                            }
                            break;

                    }


                    char_literal198=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier5227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal198);


                    // AST REWRITE
                    // elements: ATTRIBUTE, struct_declaration_list, RAW_IDENTIFIER, STRUCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 577:14: -> ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? )
                    {
                        // nesC.g:577:17: ^( STRUCT '@' RAW_IDENTIFIER ( struct_declaration_list )? )
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

                        // nesC.g:577:45: ( struct_declaration_list )?
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
    // nesC.g:579:1: struct_or_union : ( STRUCT | UNION | NX_STRUCT | NX_UNION );
    public final nesCParser.struct_or_union_return struct_or_union() throws RecognitionException {
        nesCParser.struct_or_union_return retval = new nesCParser.struct_or_union_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set199=null;

        Object set199_tree=null;

        try {
            // nesC.g:580:5: ( STRUCT | UNION | NX_STRUCT | NX_UNION )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set199=(Token)input.LT(1);

            if ( input.LA(1)==NX_STRUCT||input.LA(1)==NX_UNION||input.LA(1)==STRUCT||input.LA(1)==UNION ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set199)
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
    // nesC.g:585:1: struct_declaration_list : ( line_directive | struct_declaration )+ ;
    public final nesCParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        nesCParser.struct_declaration_list_return retval = new nesCParser.struct_declaration_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive200 =null;

        nesCParser.struct_declaration_return struct_declaration201 =null;



        try {
            // nesC.g:586:5: ( ( line_directive | struct_declaration )+ )
            // nesC.g:586:10: ( line_directive | struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // nesC.g:587:10: ( line_directive | struct_declaration )+
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
            	    // nesC.g:587:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_struct_declaration_list5314);
            	    line_directive200=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive200.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:587:28: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list5318);
            	    struct_declaration201=struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_declaration201.getTree());

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
    // nesC.g:590:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final nesCParser.struct_declaration_return struct_declaration() throws RecognitionException {
        nesCParser.struct_declaration_return retval = new nesCParser.struct_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal204=null;
        nesCParser.specifier_qualifier_list_return specifier_qualifier_list202 =null;

        nesCParser.struct_declarator_list_return struct_declarator_list203 =null;


        Object char_literal204_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            // nesC.g:591:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // nesC.g:591:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration5350);
            specifier_qualifier_list202=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list202.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration5352);
            struct_declarator_list203=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list203.getTree());

            char_literal204=(Token)match(input,200,FOLLOW_200_in_struct_declaration5354); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal204);


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
            // 592:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // nesC.g:592:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
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
    // nesC.g:599:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final nesCParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        nesCParser.specifier_qualifier_list_return retval = new nesCParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.type_specifier_return type_specifier205 =null;

        nesCParser.type_qualifier_return type_qualifier206 =null;



        try {
            // nesC.g:600:5: ( ( type_specifier | type_qualifier )+ )
            // nesC.g:600:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:600:10: ( type_specifier | type_qualifier )+
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
            	    // nesC.g:600:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list5397);
            	    type_specifier205=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier205.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:600:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list5401);
            	    type_qualifier206=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier206.getTree());

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
    // nesC.g:607:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
    public final nesCParser.struct_declarator_list_return struct_declarator_list() throws RecognitionException {
        nesCParser.struct_declarator_list_return retval = new nesCParser.struct_declarator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal208=null;
        nesCParser.struct_declarator_return struct_declarator207 =null;

        nesCParser.struct_declarator_return struct_declarator209 =null;


        Object char_literal208_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_struct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator");
        try {
            // nesC.g:608:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // nesC.g:608:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5427);
            struct_declarator207=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator207.getTree());

            // nesC.g:608:28: ( ',' struct_declarator )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // nesC.g:608:29: ',' struct_declarator
            	    {
            	    char_literal208=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list5430); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal208);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5432);
            	    struct_declarator209=struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator209.getTree());

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
            // 608:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // nesC.g:608:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
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
    // nesC.g:610:1: struct_declarator : ( declarator ( ':' constant_expression )? | ':' constant_expression );
    public final nesCParser.struct_declarator_return struct_declarator() throws RecognitionException {
        nesCParser.struct_declarator_return retval = new nesCParser.struct_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal211=null;
        Token char_literal213=null;
        nesCParser.declarator_return declarator210 =null;

        nesCParser.constant_expression_return constant_expression212 =null;

        nesCParser.constant_expression_return constant_expression214 =null;


        Object char_literal211_tree=null;
        Object char_literal213_tree=null;

        try {
            // nesC.g:611:5: ( declarator ( ':' constant_expression )? | ':' constant_expression )
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
                    // nesC.g:611:10: declarator ( ':' constant_expression )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator5462);
                    declarator210=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator210.getTree());

                    // nesC.g:611:21: ( ':' constant_expression )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==199) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // nesC.g:611:22: ':' constant_expression
                            {
                            char_literal211=(Token)match(input,199,FOLLOW_199_in_struct_declarator5465); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal211_tree = 
                            (Object)adaptor.create(char_literal211)
                            ;
                            adaptor.addChild(root_0, char_literal211_tree);
                            }

                            pushFollow(FOLLOW_constant_expression_in_struct_declarator5467);
                            constant_expression212=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression212.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // nesC.g:612:10: ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal213=(Token)match(input,199,FOLLOW_199_in_struct_declarator5480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal213_tree = 
                    (Object)adaptor.create(char_literal213)
                    ;
                    adaptor.addChild(root_0, char_literal213_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator5482);
                    constant_expression214=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression214.getTree());

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
    // nesC.g:614:1: enum_specifier : ( ENUM '{' enumerator_list ( ',' )? '}' -> ^( ENUM enumerator_list ) | ENUM identifier ( '{' enumerator_list ( ',' )? '}' )? -> ^( ENUM identifier ( enumerator_list )? ) );
    public final nesCParser.enum_specifier_return enum_specifier() throws RecognitionException {
        nesCParser.enum_specifier_return retval = new nesCParser.enum_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENUM215=null;
        Token char_literal216=null;
        Token char_literal218=null;
        Token char_literal219=null;
        Token ENUM220=null;
        Token char_literal222=null;
        Token char_literal224=null;
        Token char_literal225=null;
        nesCParser.enumerator_list_return enumerator_list217 =null;

        nesCParser.identifier_return identifier221 =null;

        nesCParser.enumerator_list_return enumerator_list223 =null;


        Object ENUM215_tree=null;
        Object char_literal216_tree=null;
        Object char_literal218_tree=null;
        Object char_literal219_tree=null;
        Object ENUM220_tree=null;
        Object char_literal222_tree=null;
        Object char_literal224_tree=null;
        Object char_literal225_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_enumerator_list=new RewriteRuleSubtreeStream(adaptor,"rule enumerator_list");
        try {
            // nesC.g:615:5: ( ENUM '{' enumerator_list ( ',' )? '}' -> ^( ENUM enumerator_list ) | ENUM identifier ( '{' enumerator_list ( ',' )? '}' )? -> ^( ENUM identifier ( enumerator_list )? ) )
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
                    // nesC.g:615:10: ENUM '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM215=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM215);


                    char_literal216=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5503); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal216);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5505);
                    enumerator_list217=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list217.getTree());

                    // nesC.g:615:35: ( ',' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==COMMA) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // nesC.g:615:35: ','
                            {
                            char_literal218=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5507); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal218);


                            }
                            break;

                    }


                    char_literal219=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal219);


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
                    // 616:14: -> ^( ENUM enumerator_list )
                    {
                        // nesC.g:616:17: ^( ENUM enumerator_list )
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
                    // nesC.g:617:10: ENUM identifier ( '{' enumerator_list ( ',' )? '}' )?
                    {
                    ENUM220=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM220);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5544);
                    identifier221=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier221.getTree());

                    // nesC.g:617:26: ( '{' enumerator_list ( ',' )? '}' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==LBRACE) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // nesC.g:617:45: '{' enumerator_list ( ',' )? '}'
                            {
                            char_literal222=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5549); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal222);


                            pushFollow(FOLLOW_enumerator_list_in_enum_specifier5551);
                            enumerator_list223=enumerator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list223.getTree());

                            // nesC.g:617:65: ( ',' )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==COMMA) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // nesC.g:617:65: ','
                                    {
                                    char_literal224=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5553); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(char_literal224);


                                    }
                                    break;

                            }


                            char_literal225=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5556); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal225);


                            }
                            break;

                    }


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
                    // 618:14: -> ^( ENUM identifier ( enumerator_list )? )
                    {
                        // nesC.g:618:17: ^( ENUM identifier ( enumerator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:618:53: ( enumerator_list )?
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
    // nesC.g:620:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
    public final nesCParser.enumerator_list_return enumerator_list() throws RecognitionException {
        nesCParser.enumerator_list_return retval = new nesCParser.enumerator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal227=null;
        nesCParser.enumerator_return enumerator226 =null;

        nesCParser.enumerator_return enumerator228 =null;


        Object char_literal227_tree=null;

        try {
            // nesC.g:621:5: ( enumerator ( ',' ! enumerator )* )
            // nesC.g:621:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list5603);
            enumerator226=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator226.getTree());

            // nesC.g:621:21: ( ',' ! enumerator )*
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
            	    // nesC.g:621:22: ',' ! enumerator
            	    {
            	    char_literal227=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list5606); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list5609);
            	    enumerator228=enumerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator228.getTree());

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
    // nesC.g:627:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
    public final nesCParser.enumerator_return enumerator() throws RecognitionException {
        nesCParser.enumerator_return retval = new nesCParser.enumerator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal230=null;
        nesCParser.identifier_return identifier229 =null;

        nesCParser.constant_expression_return constant_expression231 =null;


        Object char_literal230_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:628:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // nesC.g:628:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator5634);
            identifier229=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier229.getTree());

            // nesC.g:628:21: ( '=' constant_expression )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ASSIGN) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // nesC.g:628:22: '=' constant_expression
                    {
                    char_literal230=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator5637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal230);


                    pushFollow(FOLLOW_constant_expression_in_enumerator5639);
                    constant_expression231=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression231.getTree());

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
            // 628:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // nesC.g:628:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:628:75: ( constant_expression )?
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
    // nesC.g:629:1: type_qualifier : ( CONST | RESTRICT | VOLATILE );
    public final nesCParser.type_qualifier_return type_qualifier() throws RecognitionException {
        nesCParser.type_qualifier_return retval = new nesCParser.type_qualifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set232=null;

        Object set232_tree=null;

        try {
            // nesC.g:630:5: ( CONST | RESTRICT | VOLATILE )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set232=(Token)input.LT(1);

            if ( input.LA(1)==CONST||input.LA(1)==RESTRICT||input.LA(1)==VOLATILE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set232)
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
    // nesC.g:634:1: function_specifier : INLINE ;
    public final nesCParser.function_specifier_return function_specifier() throws RecognitionException {
        nesCParser.function_specifier_return retval = new nesCParser.function_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INLINE233=null;

        Object INLINE233_tree=null;

        try {
            // nesC.g:635:5: ( INLINE )
            // nesC.g:635:10: INLINE
            {
            root_0 = (Object)adaptor.nil();


            INLINE233=(Token)match(input,INLINE,FOLLOW_INLINE_in_function_specifier5711); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INLINE233_tree = 
            (Object)adaptor.create(INLINE233)
            ;
            adaptor.addChild(root_0, INLINE233_tree);
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
    // nesC.g:637:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
    public final nesCParser.declarator_return declarator() throws RecognitionException {
        nesCParser.declarator_return retval = new nesCParser.declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.pointer_return pointer234 =null;

        nesCParser.direct_declarator_return direct_declarator235 =null;


        RewriteRuleSubtreeStream stream_direct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule direct_declarator");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            // nesC.g:638:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // nesC.g:638:10: ( pointer )? direct_declarator
            {
            // nesC.g:638:10: ( pointer )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==STAR) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // nesC.g:638:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator5726);
                    pointer234=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer234.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator5729);
            direct_declarator235=direct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_direct_declarator.add(direct_declarator235.getTree());

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
            // 638:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // nesC.g:638:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // nesC.g:638:53: ( pointer )?
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
    // nesC.g:640:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final nesCParser.direct_declarator_return direct_declarator() throws RecognitionException {
        nesCParser.direct_declarator_return retval = new nesCParser.direct_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.direct_declarator_identifier_return direct_declarator_identifier236 =null;

        nesCParser.direct_declarator_modifier_return direct_declarator_modifier237 =null;



        try {
            // nesC.g:641:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // nesC.g:641:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator5754);
            direct_declarator_identifier236=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier236.getTree());

            // nesC.g:641:38: ( direct_declarator_modifier )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==LBRACKET||LA58_0==LPARENS) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // nesC.g:641:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator5756);
            	    direct_declarator_modifier237=direct_declarator_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_modifier237.getTree());

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
    // nesC.g:652:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
    public final nesCParser.direct_declarator_identifier_return direct_declarator_identifier() throws RecognitionException {
        nesCParser.direct_declarator_identifier_return retval = new nesCParser.direct_declarator_identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal238=null;
        Token char_literal240=null;
        Token char_literal242=null;
        nesCParser.identifier_return myIdName =null;

        nesCParser.identifier_return identifier239 =null;

        nesCParser.declarator_return declarator241 =null;


        Object char_literal238_tree=null;
        Object char_literal240_tree=null;
        Object char_literal242_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:653:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
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
                    // nesC.g:653:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5782);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // nesC.g:653:29: ( '.' identifier )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==DOT) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // nesC.g:653:30: '.' identifier
                            {
                            char_literal238=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier5785); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal238);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5787);
                            identifier239=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier239.getTree());

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
                    // 657:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:657:18: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:658:9: '(' declarator ')'
                    {
                    char_literal240=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier5822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal240);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier5824);
                    declarator241=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator241.getTree());

                    char_literal242=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier5826); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal242);


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
                    // 658:28: -> declarator
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
    // nesC.g:664:1: direct_declarator_modifier : ( ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
    public final nesCParser.direct_declarator_modifier_return direct_declarator_modifier() throws RecognitionException {
        nesCParser.direct_declarator_modifier_return retval = new nesCParser.direct_declarator_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal243=null;
        Token char_literal245=null;
        Token char_literal246=null;
        Token char_literal247=null;
        Token char_literal248=null;
        Token char_literal249=null;
        nesCParser.parameter_list_return generic =null;

        nesCParser.parameter_list_return normal =null;

        nesCParser.constant_expression_return constant_expression244 =null;


        Object char_literal243_tree=null;
        Object char_literal245_tree=null;
        Object char_literal246_tree=null;
        Object char_literal247_tree=null;
        Object char_literal248_tree=null;
        Object char_literal249_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // nesC.g:665:5: ( ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LBRACKET) ) {
                int LA63_1 = input.LA(2);

                if ( (synpred6_nesC()) ) {
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
                    // nesC.g:665:9: ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']'
                    {
                    char_literal243=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal243);


                    // nesC.g:665:47: ( constant_expression )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==AMP||LA61_0==BITCOMPLEMENT||LA61_0==BUILTIN_VA_ARG||LA61_0==CALL||LA61_0==CHARACTER_LITERAL||LA61_0==CONSTANT||LA61_0==LPARENS||LA61_0==MINUS||LA61_0==MINUSMINUS||LA61_0==NOT||LA61_0==PLUS||LA61_0==PLUSPLUS||LA61_0==POST||LA61_0==RAW_IDENTIFIER||LA61_0==SIGNAL||LA61_0==SIZEOF||LA61_0==STAR||LA61_0==STRING_LITERAL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // nesC.g:665:47: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier5861);
                            constant_expression244=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression244.getTree());

                            }
                            break;

                    }


                    char_literal245=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal245);


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
                    // 666:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // nesC.g:666:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // nesC.g:666:44: ( constant_expression )?
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
                    // nesC.g:667:9: ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')'
                    {
                    // nesC.g:667:9: ( '[' generic= parameter_list ']' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==LBRACKET) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // nesC.g:667:10: '[' generic= parameter_list ']'
                            {
                            char_literal246=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5896); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal246);


                            pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier5900);
                            generic=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_list.add(generic.getTree());

                            char_literal247=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5902); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal247);


                            }
                            break;

                    }


                    char_literal248=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier5906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal248);


                    pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier5910);
                    normal=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(normal.getTree());

                    char_literal249=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier5912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal249);


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
                    // 668:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // nesC.g:668:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
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
    // nesC.g:674:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
    public final nesCParser.pointer_return pointer() throws RecognitionException {
        nesCParser.pointer_return retval = new nesCParser.pointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal250=null;
        Token char_literal253=null;
        nesCParser.type_qualifier_list_return type_qualifier_list251 =null;

        nesCParser.pointer_return pointer252 =null;

        nesCParser.type_qualifier_list_return type_qualifier_list254 =null;


        Object char_literal250_tree=null;
        Object char_literal253_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_type_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule type_qualifier_list");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            // nesC.g:675:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // nesC.g:675:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal250=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5952); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal250);


                    // nesC.g:675:14: ( type_qualifier_list )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==CONST||LA64_0==RESTRICT||LA64_0==VOLATILE) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // nesC.g:675:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5954);
                            type_qualifier_list251=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list251.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer5957);
                    pointer252=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer252.getTree());

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
                    // 675:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // nesC.g:675:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:675:66: ( type_qualifier_list )?
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
                    // nesC.g:676:10: '*' ( type_qualifier_list )?
                    {
                    char_literal253=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5979); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal253);


                    // nesC.g:676:14: ( type_qualifier_list )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==CONST||LA65_0==RESTRICT||LA65_0==VOLATILE) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // nesC.g:676:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5981);
                            type_qualifier_list254=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list254.getTree());

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
                    // 676:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // nesC.g:676:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:676:58: ( type_qualifier_list )?
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
    // nesC.g:678:1: type_qualifier_list : ( type_qualifier )+ ;
    public final nesCParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        nesCParser.type_qualifier_list_return retval = new nesCParser.type_qualifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.type_qualifier_return type_qualifier255 =null;



        try {
            // nesC.g:679:5: ( ( type_qualifier )+ )
            // nesC.g:679:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:679:10: ( type_qualifier )+
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
            	    // nesC.g:679:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list6010);
            	    type_qualifier255=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier255.getTree());

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
    // nesC.g:686:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) );
    public final nesCParser.parameter_list_return parameter_list() throws RecognitionException {
        nesCParser.parameter_list_return retval = new nesCParser.parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal257=null;
        Token char_literal259=null;
        Token ELLIPSIS260=null;
        nesCParser.parameter_declaration_return parameter_declaration256 =null;

        nesCParser.parameter_declaration_return parameter_declaration258 =null;


        Object char_literal257_tree=null;
        Object char_literal259_tree=null;
        Object ELLIPSIS260_tree=null;
        RewriteRuleTokenStream stream_ELLIPSIS=new RewriteRuleTokenStream(adaptor,"token ELLIPSIS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            // nesC.g:687:5: ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) )
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
                    // nesC.g:687:10: parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )?
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list6035);
                    parameter_declaration256=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration256.getTree());

                    // nesC.g:687:32: ( ',' parameter_declaration )*
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
                    	    // nesC.g:687:33: ',' parameter_declaration
                    	    {
                    	    char_literal257=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list6038); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal257);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list6040);
                    	    parameter_declaration258=parameter_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration258.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    // nesC.g:687:61: ( ',' ELLIPSIS )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==COMMA) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // nesC.g:687:62: ',' ELLIPSIS
                            {
                            char_literal259=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list6045); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal259);


                            ELLIPSIS260=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_parameter_list6047); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELLIPSIS.add(ELLIPSIS260);


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
                    // 688:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
                    {
                        // nesC.g:688:16: ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
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

                        // nesC.g:688:56: ( ELLIPSIS )?
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
                    // nesC.g:690:13: 
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
                    // 690:13: -> ^( PARAMETER_LIST )
                    {
                        // nesC.g:690:16: ^( PARAMETER_LIST )
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
    // nesC.g:696:1: parameter_declaration : declaration_specifiers ( parameter_declarator )? -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? ) ;
    public final nesCParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        nesCParser.parameter_declaration_return retval = new nesCParser.parameter_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers261 =null;

        nesCParser.parameter_declarator_return parameter_declarator262 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_parameter_declarator=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarator");
        try {
            // nesC.g:697:5: ( declaration_specifiers ( parameter_declarator )? -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? ) )
            // nesC.g:697:10: declaration_specifiers ( parameter_declarator )?
            {
            pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration6117);
            declaration_specifiers261=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers261.getTree());

            // nesC.g:697:33: ( parameter_declarator )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==LBRACKET||LA71_0==LPARENS||LA71_0==RAW_IDENTIFIER||LA71_0==STAR) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // nesC.g:697:33: parameter_declarator
                    {
                    pushFollow(FOLLOW_parameter_declarator_in_parameter_declaration6119);
                    parameter_declarator262=parameter_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declarator.add(parameter_declarator262.getTree());

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
            // 698:13: -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? )
            {
                // nesC.g:698:16: ^( PARAMETER declaration_specifiers ( parameter_declarator )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETER, "PARAMETER")
                , root_1);

                adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                // nesC.g:698:51: ( parameter_declarator )?
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
    // nesC.g:701:1: parameter_declarator : ( ( declarator ( attributes )? )=> declarator ( attributes )? | abstract_declarator );
    public final nesCParser.parameter_declarator_return parameter_declarator() throws RecognitionException {
        nesCParser.parameter_declarator_return retval = new nesCParser.parameter_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declarator_return declarator263 =null;

        nesCParser.attributes_return attributes264 =null;

        nesCParser.abstract_declarator_return abstract_declarator265 =null;



        try {
            // nesC.g:702:5: ( ( declarator ( attributes )? )=> declarator ( attributes )? | abstract_declarator )
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
            else if ( (LA73_0==RAW_IDENTIFIER) && (synpred7_nesC())) {
                alt73=1;
            }
            else if ( (LA73_0==LPARENS) ) {
                int LA73_3 = input.LA(2);

                if ( (synpred7_nesC()) ) {
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
                    // nesC.g:702:10: ( declarator ( attributes )? )=> declarator ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_parameter_declarator6168);
                    declarator263=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator263.getTree());

                    // nesC.g:702:49: ( attributes )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==ATTRIBUTE) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // nesC.g:702:49: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_parameter_declarator6170);
                            attributes264=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes264.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // nesC.g:703:10: abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_abstract_declarator_in_parameter_declarator6182);
                    abstract_declarator265=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator265.getTree());

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
    // nesC.g:705:1: identifier_list : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final nesCParser.identifier_list_return identifier_list() throws RecognitionException {
        nesCParser.identifier_list_return retval = new nesCParser.identifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal267=null;
        nesCParser.identifier_return identifier266 =null;

        nesCParser.identifier_return identifier268 =null;


        Object char_literal267_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:706:5: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // nesC.g:706:10: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifier_list6201);
            identifier266=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier266.getTree());

            // nesC.g:706:21: ( ',' identifier )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==COMMA) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // nesC.g:706:22: ',' identifier
            	    {
            	    char_literal267=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifier_list6204); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal267);


            	    pushFollow(FOLLOW_identifier_in_identifier_list6206);
            	    identifier268=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier268.getTree());

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
            // 706:39: -> ( identifier )+
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
    // nesC.g:708:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final nesCParser.type_name_return type_name() throws RecognitionException {
        nesCParser.type_name_return retval = new nesCParser.type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.specifier_qualifier_list_return specifier_qualifier_list269 =null;

        nesCParser.abstract_declarator_return abstract_declarator270 =null;



        try {
            // nesC.g:709:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // nesC.g:709:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name6232);
            specifier_qualifier_list269=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list269.getTree());

            // nesC.g:709:35: ( abstract_declarator )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==LBRACKET||LA75_0==LPARENS||LA75_0==STAR) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // nesC.g:709:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name6234);
                    abstract_declarator270=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator270.getTree());

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
    // nesC.g:711:1: abstract_declarator : ( ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator | pointer );
    public final nesCParser.abstract_declarator_return abstract_declarator() throws RecognitionException {
        nesCParser.abstract_declarator_return retval = new nesCParser.abstract_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.pointer_return pointer271 =null;

        nesCParser.direct_abstract_declarator_return direct_abstract_declarator272 =null;

        nesCParser.pointer_return pointer273 =null;



        try {
            // nesC.g:712:5: ( ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator | pointer )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==STAR) ) {
                int LA77_1 = input.LA(2);

                if ( (synpred8_nesC()) ) {
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
            else if ( (LA77_0==LPARENS) && (synpred8_nesC())) {
                alt77=1;
            }
            else if ( (LA77_0==LBRACKET) && (synpred8_nesC())) {
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
                    // nesC.g:712:10: ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:712:51: ( pointer )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==STAR) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // nesC.g:712:51: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator6263);
                            pointer271=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer271.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator6266);
                    direct_abstract_declarator272=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator272.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:713:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator6277);
                    pointer273=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer273.getTree());

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
    // nesC.g:715:1: direct_abstract_declarator : ( ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )* | ( direct_abstract_declarator_modifier )+ );
    public final nesCParser.direct_abstract_declarator_return direct_abstract_declarator() throws RecognitionException {
        nesCParser.direct_abstract_declarator_return retval = new nesCParser.direct_abstract_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal274=null;
        Token char_literal276=null;
        nesCParser.abstract_declarator_return abstract_declarator275 =null;

        nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier277 =null;

        nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier278 =null;


        Object char_literal274_tree=null;
        Object char_literal276_tree=null;

        try {
            // nesC.g:716:5: ( ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )* | ( direct_abstract_declarator_modifier )+ )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==LPARENS) ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==STAR) && (synpred9_nesC())) {
                    alt80=1;
                }
                else if ( (LA80_1==LPARENS) && (synpred9_nesC())) {
                    alt80=1;
                }
                else if ( (LA80_1==LBRACKET) && (synpred9_nesC())) {
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
                    // nesC.g:716:10: ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )*
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal274=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6317); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal274_tree = 
                    (Object)adaptor.create(char_literal274)
                    ;
                    adaptor.addChild(root_0, char_literal274_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator6319);
                    abstract_declarator275=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator275.getTree());

                    char_literal276=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6321); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal276_tree = 
                    (Object)adaptor.create(char_literal276)
                    ;
                    adaptor.addChild(root_0, char_literal276_tree);
                    }

                    // nesC.g:717:39: ( direct_abstract_declarator_modifier )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==LBRACKET||LA78_0==LPARENS) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // nesC.g:717:39: direct_abstract_declarator_modifier
                    	    {
                    	    pushFollow(FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6323);
                    	    direct_abstract_declarator_modifier277=direct_abstract_declarator_modifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator_modifier277.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // nesC.g:718:10: ( direct_abstract_declarator_modifier )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:718:10: ( direct_abstract_declarator_modifier )+
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
                    	    // nesC.g:718:10: direct_abstract_declarator_modifier
                    	    {
                    	    pushFollow(FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6335);
                    	    direct_abstract_declarator_modifier278=direct_abstract_declarator_modifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator_modifier278.getTree());

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
    // nesC.g:720:1: direct_abstract_declarator_modifier : ( '[' ( assignment_expression )? ']' | '(' parameter_list ')' );
    public final nesCParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier() throws RecognitionException {
        nesCParser.direct_abstract_declarator_modifier_return retval = new nesCParser.direct_abstract_declarator_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal279=null;
        Token char_literal281=null;
        Token char_literal282=null;
        Token char_literal284=null;
        nesCParser.assignment_expression_return assignment_expression280 =null;

        nesCParser.parameter_list_return parameter_list283 =null;


        Object char_literal279_tree=null;
        Object char_literal281_tree=null;
        Object char_literal282_tree=null;
        Object char_literal284_tree=null;

        try {
            // nesC.g:721:5: ( '[' ( assignment_expression )? ']' | '(' parameter_list ')' )
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
                    // nesC.g:721:10: '[' ( assignment_expression )? ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal279=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator_modifier6351); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal279_tree = 
                    (Object)adaptor.create(char_literal279)
                    ;
                    adaptor.addChild(root_0, char_literal279_tree);
                    }

                    // nesC.g:721:14: ( assignment_expression )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==AMP||LA81_0==BITCOMPLEMENT||LA81_0==BUILTIN_VA_ARG||LA81_0==CALL||LA81_0==CHARACTER_LITERAL||LA81_0==CONSTANT||LA81_0==LPARENS||LA81_0==MINUS||LA81_0==MINUSMINUS||LA81_0==NOT||LA81_0==PLUS||LA81_0==PLUSPLUS||LA81_0==POST||LA81_0==RAW_IDENTIFIER||LA81_0==SIGNAL||LA81_0==SIZEOF||LA81_0==STAR||LA81_0==STRING_LITERAL) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // nesC.g:721:14: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator_modifier6353);
                            assignment_expression280=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression280.getTree());

                            }
                            break;

                    }


                    char_literal281=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator_modifier6356); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal281_tree = 
                    (Object)adaptor.create(char_literal281)
                    ;
                    adaptor.addChild(root_0, char_literal281_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:722:10: '(' parameter_list ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal282=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator_modifier6367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal282_tree = 
                    (Object)adaptor.create(char_literal282)
                    ;
                    adaptor.addChild(root_0, char_literal282_tree);
                    }

                    pushFollow(FOLLOW_parameter_list_in_direct_abstract_declarator_modifier6369);
                    parameter_list283=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list283.getTree());

                    char_literal284=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator_modifier6371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal284_tree = 
                    (Object)adaptor.create(char_literal284)
                    ;
                    adaptor.addChild(root_0, char_literal284_tree);
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
    // nesC.g:725:1: typedef_name :{...}? RAW_IDENTIFIER ;
    public final nesCParser.typedef_name_return typedef_name() throws RecognitionException {
        nesCParser.typedef_name_return retval = new nesCParser.typedef_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER285=null;

        Object RAW_IDENTIFIER285_tree=null;

        try {
            // nesC.g:726:5: ({...}? RAW_IDENTIFIER )
            // nesC.g:726:10: {...}? RAW_IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            if ( !(( symbols.isType(input.LT(1).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typedef_name", " symbols.isType(input.LT(1).getText()) ");
            }

            RAW_IDENTIFIER285=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name6397); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAW_IDENTIFIER285_tree = 
            (Object)adaptor.create(RAW_IDENTIFIER285)
            ;
            adaptor.addChild(root_0, RAW_IDENTIFIER285_tree);
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
    // nesC.g:734:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
    public final nesCParser.initializer_return initializer() throws RecognitionException {
        nesCParser.initializer_return retval = new nesCParser.initializer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal287=null;
        Token char_literal289=null;
        Token char_literal290=null;
        nesCParser.assignment_expression_return assignment_expression286 =null;

        nesCParser.initializer_list_return initializer_list288 =null;


        Object char_literal287_tree=null;
        Object char_literal289_tree=null;
        Object char_literal290_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            // nesC.g:735:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
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
                    // nesC.g:735:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer6422);
                    assignment_expression286=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression286.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:736:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal287=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer6433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal287);


                    pushFollow(FOLLOW_initializer_list_in_initializer6435);
                    initializer_list288=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list288.getTree());

                    // nesC.g:736:31: ( ',' )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==COMMA) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // nesC.g:736:31: ','
                            {
                            char_literal289=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer6437); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal289);


                            }
                            break;

                    }


                    char_literal290=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer6440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal290);


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
                    // 736:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // nesC.g:736:43: ^( INITIALIZER_LIST initializer_list )
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
    // nesC.g:740:1: initializer_list : ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ ;
    public final nesCParser.initializer_list_return initializer_list() throws RecognitionException {
        nesCParser.initializer_list_return retval = new nesCParser.initializer_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER291=null;
        Token char_literal292=null;
        Token char_literal294=null;
        Token RAW_IDENTIFIER295=null;
        Token char_literal296=null;
        nesCParser.initializer_return initializer293 =null;

        nesCParser.initializer_return initializer297 =null;


        Object RAW_IDENTIFIER291_tree=null;
        Object char_literal292_tree=null;
        Object char_literal294_tree=null;
        Object RAW_IDENTIFIER295_tree=null;
        Object char_literal296_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // nesC.g:741:5: ( ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ )
            // nesC.g:741:10: ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            {
            // nesC.g:741:10: ( RAW_IDENTIFIER ':' )?
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
                    // nesC.g:741:11: RAW_IDENTIFIER ':'
                    {
                    RAW_IDENTIFIER291=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER291);


                    char_literal292=(Token)match(input,199,FOLLOW_199_in_initializer_list6472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal292);


                    }
                    break;

            }


            pushFollow(FOLLOW_initializer_in_initializer_list6476);
            initializer293=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer293.getTree());

            // nesC.g:741:44: ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
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
            	    // nesC.g:741:45: ',' ( RAW_IDENTIFIER ':' )? initializer
            	    {
            	    char_literal294=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list6479); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal294);


            	    // nesC.g:741:49: ( RAW_IDENTIFIER ':' )?
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
            	            // nesC.g:741:50: RAW_IDENTIFIER ':'
            	            {
            	            RAW_IDENTIFIER295=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6482); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER295);


            	            char_literal296=(Token)match(input,199,FOLLOW_199_in_initializer_list6484); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_199.add(char_literal296);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_initializer_in_initializer_list6488);
            	    initializer297=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer297.getTree());

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
            // 742:13: -> ( initializer )+
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
    // nesC.g:752:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement );
    public final nesCParser.statement_return statement() throws RecognitionException {
        nesCParser.statement_return retval = new nesCParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.labeled_statement_return labeled_statement298 =null;

        nesCParser.compound_statement_return compound_statement299 =null;

        nesCParser.expression_statement_return expression_statement300 =null;

        nesCParser.selection_statement_return selection_statement301 =null;

        nesCParser.iteration_statement_return iteration_statement302 =null;

        nesCParser.jump_statement_return jump_statement303 =null;

        nesCParser.atomic_statement_return atomic_statement304 =null;



        try {
            // nesC.g:753:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement )
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
                    // nesC.g:753:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement6537);
                    labeled_statement298=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement298.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:754:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement6548);
                    compound_statement299=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement299.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:755:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement6559);
                    expression_statement300=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement300.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:756:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement6570);
                    selection_statement301=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement301.getTree());

                    }
                    break;
                case 5 :
                    // nesC.g:757:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement6581);
                    iteration_statement302=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement302.getTree());

                    }
                    break;
                case 6 :
                    // nesC.g:758:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement6592);
                    jump_statement303=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement303.getTree());

                    }
                    break;
                case 7 :
                    // nesC.g:759:10: atomic_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atomic_statement_in_statement6603);
                    atomic_statement304=atomic_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomic_statement304.getTree());

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
    // nesC.g:763:1: atomic_statement : ATOMIC statement -> ^( ATOMIC statement ) ;
    public final nesCParser.atomic_statement_return atomic_statement() throws RecognitionException {
        nesCParser.atomic_statement_return retval = new nesCParser.atomic_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATOMIC305=null;
        nesCParser.statement_return statement306 =null;


        Object ATOMIC305_tree=null;
        RewriteRuleTokenStream stream_ATOMIC=new RewriteRuleTokenStream(adaptor,"token ATOMIC");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:764:5: ( ATOMIC statement -> ^( ATOMIC statement ) )
            // nesC.g:764:10: ATOMIC statement
            {
            ATOMIC305=(Token)match(input,ATOMIC,FOLLOW_ATOMIC_in_atomic_statement6624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATOMIC.add(ATOMIC305);


            pushFollow(FOLLOW_statement_in_atomic_statement6626);
            statement306=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement306.getTree());

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
            // 764:27: -> ^( ATOMIC statement )
            {
                // nesC.g:764:30: ^( ATOMIC statement )
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
    // nesC.g:766:1: labeled_statement : ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final nesCParser.labeled_statement_return labeled_statement() throws RecognitionException {
        nesCParser.labeled_statement_return retval = new nesCParser.labeled_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal308=null;
        Token CASE310=null;
        Token char_literal312=null;
        Token DEFAULT314=null;
        Token char_literal315=null;
        nesCParser.identifier_return identifier307 =null;

        nesCParser.statement_return statement309 =null;

        nesCParser.constant_expression_return constant_expression311 =null;

        nesCParser.statement_return statement313 =null;

        nesCParser.statement_return statement316 =null;


        Object char_literal308_tree=null;
        Object CASE310_tree=null;
        Object char_literal312_tree=null;
        Object DEFAULT314_tree=null;
        Object char_literal315_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:767:5: ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
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
                    // nesC.g:767:10: identifier ':' statement
                    {
                    pushFollow(FOLLOW_identifier_in_labeled_statement6653);
                    identifier307=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier307.getTree());

                    char_literal308=(Token)match(input,199,FOLLOW_199_in_labeled_statement6655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal308);


                    pushFollow(FOLLOW_statement_in_labeled_statement6657);
                    statement309=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement309.getTree());

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
                    // 767:35: -> ^( LABELED_STATEMENT identifier statement )
                    {
                        // nesC.g:767:38: ^( LABELED_STATEMENT identifier statement )
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
                    // nesC.g:768:10: CASE constant_expression ':' statement
                    {
                    CASE310=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement6678); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE310);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement6680);
                    constant_expression311=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression311.getTree());

                    char_literal312=(Token)match(input,199,FOLLOW_199_in_labeled_statement6682); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal312);


                    pushFollow(FOLLOW_statement_in_labeled_statement6684);
                    statement313=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement313.getTree());

                    // AST REWRITE
                    // elements: CASE, statement, constant_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 768:49: -> ^( CASE constant_expression statement )
                    {
                        // nesC.g:768:52: ^( CASE constant_expression statement )
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
                    // nesC.g:769:10: DEFAULT ':' statement
                    {
                    DEFAULT314=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement6705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT314);


                    char_literal315=(Token)match(input,199,FOLLOW_199_in_labeled_statement6707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal315);


                    pushFollow(FOLLOW_statement_in_labeled_statement6709);
                    statement316=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement316.getTree());

                    // AST REWRITE
                    // elements: statement, DEFAULT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 769:32: -> ^( DEFAULT statement )
                    {
                        // nesC.g:769:35: ^( DEFAULT statement )
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
    // nesC.g:774:1: compound_statement : '{' ( declaration )* ( statement )* '}' -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* ) ;
    public final nesCParser.compound_statement_return compound_statement() throws RecognitionException {
        nesCParser.compound_statement_return retval = new nesCParser.compound_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal317=null;
        Token char_literal320=null;
        nesCParser.declaration_return declaration318 =null;

        nesCParser.statement_return statement319 =null;


        Object char_literal317_tree=null;
        Object char_literal320_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // nesC.g:775:5: ( '{' ( declaration )* ( statement )* '}' -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* ) )
            // nesC.g:775:10: '{' ( declaration )* ( statement )* '}'
            {
            char_literal317=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement6735); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal317);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:776:10: ( declaration )*
            loop90:
            do {
                int alt90=2;
                alt90 = dfa90.predict(input);
                switch (alt90) {
            	case 1 :
            	    // nesC.g:776:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_compound_statement6748);
            	    declaration318=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration318.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            // nesC.g:776:23: ( statement )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==AMP||LA91_0==ATOMIC||LA91_0==BITCOMPLEMENT||(LA91_0 >= BREAK && LA91_0 <= BUILTIN_VA_ARG)||(LA91_0 >= CALL && LA91_0 <= CASE)||LA91_0==CHARACTER_LITERAL||(LA91_0 >= CONSTANT && LA91_0 <= CONTINUE)||LA91_0==DEFAULT||LA91_0==DO||LA91_0==FOR||LA91_0==GOTO||LA91_0==IF||LA91_0==LBRACE||LA91_0==LPARENS||LA91_0==MINUS||LA91_0==MINUSMINUS||LA91_0==NOT||LA91_0==PLUS||LA91_0==PLUSPLUS||LA91_0==POST||LA91_0==RAW_IDENTIFIER||LA91_0==RETURN||LA91_0==SIGNAL||LA91_0==SIZEOF||LA91_0==STAR||LA91_0==STRING_LITERAL||LA91_0==SWITCH||LA91_0==WHILE||LA91_0==200) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // nesC.g:776:23: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compound_statement6751);
            	    statement319=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement319.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal320=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement6769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal320);


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
            // 777:44: -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* )
            {
                // nesC.g:777:47: ^( COMPOUND_STATEMENT ( declaration )* ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // nesC.g:777:68: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                // nesC.g:777:81: ( statement )*
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
    // nesC.g:783:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final nesCParser.expression_statement_return expression_statement() throws RecognitionException {
        nesCParser.expression_statement_return retval = new nesCParser.expression_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal322=null;
        nesCParser.expression_return expression321 =null;


        Object char_literal322_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // nesC.g:784:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // nesC.g:784:10: ( expression )? ';'
            {
            // nesC.g:784:10: ( expression )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==AMP||LA92_0==BITCOMPLEMENT||LA92_0==BUILTIN_VA_ARG||LA92_0==CALL||LA92_0==CHARACTER_LITERAL||LA92_0==CONSTANT||LA92_0==LPARENS||LA92_0==MINUS||LA92_0==MINUSMINUS||LA92_0==NOT||LA92_0==PLUS||LA92_0==PLUSPLUS||LA92_0==POST||LA92_0==RAW_IDENTIFIER||LA92_0==SIGNAL||LA92_0==SIZEOF||LA92_0==STAR||LA92_0==STRING_LITERAL) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // nesC.g:784:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement6800);
                    expression321=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression321.getTree());

                    }
                    break;

            }


            char_literal322=(Token)match(input,200,FOLLOW_200_in_expression_statement6803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal322);


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
            // 784:26: -> ^( STATEMENT ( expression )? )
            {
                // nesC.g:784:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // nesC.g:784:41: ( expression )?
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
    // nesC.g:792:1: selection_statement : ( ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement -> ^( IF expression $s1 $s2) | IF '(' expression ')' statement -> ^( IF expression statement ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final nesCParser.selection_statement_return selection_statement() throws RecognitionException {
        nesCParser.selection_statement_return retval = new nesCParser.selection_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF323=null;
        Token char_literal324=null;
        Token char_literal326=null;
        Token ELSE327=null;
        Token IF328=null;
        Token char_literal329=null;
        Token char_literal331=null;
        Token SWITCH333=null;
        Token char_literal334=null;
        Token char_literal336=null;
        nesCParser.statement_return s1 =null;

        nesCParser.statement_return s2 =null;

        nesCParser.expression_return expression325 =null;

        nesCParser.expression_return expression330 =null;

        nesCParser.statement_return statement332 =null;

        nesCParser.expression_return expression335 =null;

        nesCParser.statement_return statement337 =null;


        Object IF323_tree=null;
        Object char_literal324_tree=null;
        Object char_literal326_tree=null;
        Object ELSE327_tree=null;
        Object IF328_tree=null;
        Object char_literal329_tree=null;
        Object char_literal331_tree=null;
        Object SWITCH333_tree=null;
        Object char_literal334_tree=null;
        Object char_literal336_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:793:5: ( ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement -> ^( IF expression $s1 $s2) | IF '(' expression ')' statement -> ^( IF expression statement ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==IF) ) {
                int LA93_1 = input.LA(2);

                if ( (synpred10_nesC()) ) {
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
                    // nesC.g:793:10: ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement
                    {
                    IF323=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF323);


                    char_literal324=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal324);


                    pushFollow(FOLLOW_expression_in_selection_statement6869);
                    expression325=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression325.getTree());

                    char_literal326=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal326);


                    pushFollow(FOLLOW_statement_in_selection_statement6875);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s1.getTree());

                    ELSE327=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement6877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE327);


                    pushFollow(FOLLOW_statement_in_selection_statement6881);
                    s2=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s2.getTree());

                    // AST REWRITE
                    // elements: expression, IF, s2, s1
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
                    // 795:14: -> ^( IF expression $s1 $s2)
                    {
                        // nesC.g:795:17: ^( IF expression $s1 $s2)
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
                    // nesC.g:796:10: IF '(' expression ')' statement
                    {
                    IF328=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF328);


                    char_literal329=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6921); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal329);


                    pushFollow(FOLLOW_expression_in_selection_statement6923);
                    expression330=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression330.getTree());

                    char_literal331=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6925); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal331);


                    pushFollow(FOLLOW_statement_in_selection_statement6927);
                    statement332=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement332.getTree());

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
                    // 797:14: -> ^( IF expression statement )
                    {
                        // nesC.g:797:17: ^( IF expression statement )
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
                    // nesC.g:798:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH333=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement6961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH333);


                    char_literal334=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal334);


                    pushFollow(FOLLOW_expression_in_selection_statement6965);
                    expression335=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression335.getTree());

                    char_literal336=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal336);


                    pushFollow(FOLLOW_statement_in_selection_statement6969);
                    statement337=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement337.getTree());

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
                    // 799:14: -> ^( SWITCH expression statement )
                    {
                        // nesC.g:799:17: ^( SWITCH expression statement )
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
    // nesC.g:805:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final nesCParser.iteration_statement_return iteration_statement() throws RecognitionException {
        nesCParser.iteration_statement_return retval = new nesCParser.iteration_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE338=null;
        Token char_literal339=null;
        Token char_literal341=null;
        Token DO343=null;
        Token WHILE345=null;
        Token char_literal346=null;
        Token char_literal348=null;
        Token char_literal349=null;
        Token FOR350=null;
        Token char_literal351=null;
        Token char_literal352=null;
        Token char_literal353=null;
        Token char_literal354=null;
        nesCParser.expression_return init =null;

        nesCParser.expression_return cond =null;

        nesCParser.expression_return iter =null;

        nesCParser.expression_return expression340 =null;

        nesCParser.statement_return statement342 =null;

        nesCParser.statement_return statement344 =null;

        nesCParser.expression_return expression347 =null;

        nesCParser.statement_return statement355 =null;


        Object WHILE338_tree=null;
        Object char_literal339_tree=null;
        Object char_literal341_tree=null;
        Object DO343_tree=null;
        Object WHILE345_tree=null;
        Object char_literal346_tree=null;
        Object char_literal348_tree=null;
        Object char_literal349_tree=null;
        Object FOR350_tree=null;
        Object char_literal351_tree=null;
        Object char_literal352_tree=null;
        Object char_literal353_tree=null;
        Object char_literal354_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nesC.g:806:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
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
                    // nesC.g:806:10: WHILE '(' expression ')' statement
                    {
                    WHILE338=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement7015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE338);


                    char_literal339=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement7017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal339);


                    pushFollow(FOLLOW_expression_in_iteration_statement7019);
                    expression340=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression340.getTree());

                    char_literal341=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement7021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal341);


                    pushFollow(FOLLOW_statement_in_iteration_statement7023);
                    statement342=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement342.getTree());

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
                    // 806:45: -> ^( WHILE expression statement )
                    {
                        // nesC.g:806:48: ^( WHILE expression statement )
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
                    // nesC.g:807:10: DO statement WHILE '(' expression ')' ';'
                    {
                    DO343=(Token)match(input,DO,FOLLOW_DO_in_iteration_statement7044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO343);


                    pushFollow(FOLLOW_statement_in_iteration_statement7046);
                    statement344=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement344.getTree());

                    WHILE345=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement7048); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE345);


                    char_literal346=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement7050); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal346);


                    pushFollow(FOLLOW_expression_in_iteration_statement7052);
                    expression347=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression347.getTree());

                    char_literal348=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement7054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal348);


                    char_literal349=(Token)match(input,200,FOLLOW_200_in_iteration_statement7056); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal349);


                    // AST REWRITE
                    // elements: statement, DO, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 807:52: -> ^( DO statement expression )
                    {
                        // nesC.g:807:55: ^( DO statement expression )
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
                    // nesC.g:808:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR350=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement7077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR350);


                    char_literal351=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement7079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal351);


                    // nesC.g:808:22: (init= expression )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==AMP||LA94_0==BITCOMPLEMENT||LA94_0==BUILTIN_VA_ARG||LA94_0==CALL||LA94_0==CHARACTER_LITERAL||LA94_0==CONSTANT||LA94_0==LPARENS||LA94_0==MINUS||LA94_0==MINUSMINUS||LA94_0==NOT||LA94_0==PLUS||LA94_0==PLUSPLUS||LA94_0==POST||LA94_0==RAW_IDENTIFIER||LA94_0==SIGNAL||LA94_0==SIZEOF||LA94_0==STAR||LA94_0==STRING_LITERAL) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // nesC.g:808:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement7083);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal352=(Token)match(input,200,FOLLOW_200_in_iteration_statement7086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal352);


                    // nesC.g:808:43: (cond= expression )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==AMP||LA95_0==BITCOMPLEMENT||LA95_0==BUILTIN_VA_ARG||LA95_0==CALL||LA95_0==CHARACTER_LITERAL||LA95_0==CONSTANT||LA95_0==LPARENS||LA95_0==MINUS||LA95_0==MINUSMINUS||LA95_0==NOT||LA95_0==PLUS||LA95_0==PLUSPLUS||LA95_0==POST||LA95_0==RAW_IDENTIFIER||LA95_0==SIGNAL||LA95_0==SIZEOF||LA95_0==STAR||LA95_0==STRING_LITERAL) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // nesC.g:808:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement7090);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal353=(Token)match(input,200,FOLLOW_200_in_iteration_statement7093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal353);


                    // nesC.g:808:64: (iter= expression )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==AMP||LA96_0==BITCOMPLEMENT||LA96_0==BUILTIN_VA_ARG||LA96_0==CALL||LA96_0==CHARACTER_LITERAL||LA96_0==CONSTANT||LA96_0==LPARENS||LA96_0==MINUS||LA96_0==MINUSMINUS||LA96_0==NOT||LA96_0==PLUS||LA96_0==PLUSPLUS||LA96_0==POST||LA96_0==RAW_IDENTIFIER||LA96_0==SIGNAL||LA96_0==SIZEOF||LA96_0==STAR||LA96_0==STRING_LITERAL) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // nesC.g:808:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement7097);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal354=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement7100); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal354);


                    pushFollow(FOLLOW_statement_in_iteration_statement7102);
                    statement355=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement355.getTree());

                    // AST REWRITE
                    // elements: cond, statement, init, iter, FOR
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
                    // 809:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // nesC.g:809:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // nesC.g:809:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // nesC.g:809:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:810:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // nesC.g:810:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:811:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // nesC.g:811:40: ( $iter)?
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
    // nesC.g:813:1: jump_statement : ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) );
    public final nesCParser.jump_statement_return jump_statement() throws RecognitionException {
        nesCParser.jump_statement_return retval = new nesCParser.jump_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GOTO356=null;
        Token char_literal358=null;
        Token CONTINUE359=null;
        Token char_literal360=null;
        Token BREAK361=null;
        Token char_literal362=null;
        Token RETURN363=null;
        Token char_literal365=null;
        nesCParser.identifier_return identifier357 =null;

        nesCParser.expression_return expression364 =null;


        Object GOTO356_tree=null;
        Object char_literal358_tree=null;
        Object CONTINUE359_tree=null;
        Object char_literal360_tree=null;
        Object BREAK361_tree=null;
        Object char_literal362_tree=null;
        Object RETURN363_tree=null;
        Object char_literal365_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_GOTO=new RewriteRuleTokenStream(adaptor,"token GOTO");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:814:5: ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
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
                    // nesC.g:814:10: GOTO identifier ';'
                    {
                    GOTO356=(Token)match(input,GOTO,FOLLOW_GOTO_in_jump_statement7209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GOTO.add(GOTO356);


                    pushFollow(FOLLOW_identifier_in_jump_statement7211);
                    identifier357=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier357.getTree());

                    char_literal358=(Token)match(input,200,FOLLOW_200_in_jump_statement7213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal358);


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
                    // 814:30: -> ^( GOTO identifier )
                    {
                        // nesC.g:814:33: ^( GOTO identifier )
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
                    // nesC.g:815:10: CONTINUE ';'
                    {
                    CONTINUE359=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement7232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE359);


                    char_literal360=(Token)match(input,200,FOLLOW_200_in_jump_statement7234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal360);


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
                    // 815:23: -> CONTINUE
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
                    // nesC.g:816:10: BREAK ';'
                    {
                    BREAK361=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement7249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK361);


                    char_literal362=(Token)match(input,200,FOLLOW_200_in_jump_statement7251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal362);


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
                    // 816:20: -> BREAK
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
                    // nesC.g:817:10: RETURN ( expression )? ';'
                    {
                    RETURN363=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement7266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN363);


                    // nesC.g:817:17: ( expression )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==AMP||LA98_0==BITCOMPLEMENT||LA98_0==BUILTIN_VA_ARG||LA98_0==CALL||LA98_0==CHARACTER_LITERAL||LA98_0==CONSTANT||LA98_0==LPARENS||LA98_0==MINUS||LA98_0==MINUSMINUS||LA98_0==NOT||LA98_0==PLUS||LA98_0==PLUSPLUS||LA98_0==POST||LA98_0==RAW_IDENTIFIER||LA98_0==SIGNAL||LA98_0==SIZEOF||LA98_0==STAR||LA98_0==STRING_LITERAL) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // nesC.g:817:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_jump_statement7268);
                            expression364=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression364.getTree());

                            }
                            break;

                    }


                    char_literal365=(Token)match(input,200,FOLLOW_200_in_jump_statement7271); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal365);


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
                    // 817:33: -> ^( RETURN ( expression )? )
                    {
                        // nesC.g:817:36: ^( RETURN ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_RETURN.nextNode()
                        , root_1);

                        // nesC.g:817:45: ( expression )?
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
    // nesC.g:823:1: translation_unit : ( line_directive | external_declaration )+ ;
    public final nesCParser.translation_unit_return translation_unit() throws RecognitionException {
        nesCParser.translation_unit_return retval = new nesCParser.translation_unit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive366 =null;

        nesCParser.external_declaration_return external_declaration367 =null;



        try {
            // nesC.g:824:5: ( ( line_directive | external_declaration )+ )
            // nesC.g:824:10: ( line_directive | external_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:824:10: ( line_directive | external_declaration )+
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
            	    // nesC.g:824:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit7307);
            	    line_directive366=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive366.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:824:28: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit7311);
            	    external_declaration367=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration367.getTree());

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
    // nesC.g:827:1: external_declaration : declaration ;
    public final nesCParser.external_declaration_return external_declaration() throws RecognitionException {
        nesCParser.external_declaration_return retval = new nesCParser.external_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_return declaration368 =null;



        try {
            // nesC.g:828:5: ( declaration )
            // nesC.g:828:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration7329);
            declaration368=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration368.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // nesC.g:842:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final nesCParser.line_directive_return line_directive() throws RecognitionException {
        nesCParser.line_directive_return retval = new nesCParser.line_directive_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal369=null;
        Token CONSTANT370=null;
        Token STRING_LITERAL371=null;
        Token CONSTANT372=null;

        Object char_literal369_tree=null;
        Object CONSTANT370_tree=null;
        Object STRING_LITERAL371_tree=null;
        Object CONSTANT372_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            // nesC.g:843:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // nesC.g:843:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )*
            {
            char_literal369=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive7356); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal369);


            CONSTANT370=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7358); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT370);


            STRING_LITERAL371=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive7360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL371);


            // nesC.g:843:38: ( CONSTANT )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==CONSTANT) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // nesC.g:843:38: CONSTANT
            	    {
            	    CONSTANT372=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7362); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT372);


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
            // 843:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // nesC.g:843:51: ^( LINE_DIRECTIVE STRING_LITERAL )
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
    // nesC.g:848:1: function_definition : declaration_specifiers declarator ( attributes | gcc_attributes )? compound_statement -> declaration_specifiers declarator compound_statement ;
    public final nesCParser.function_definition_return function_definition() throws RecognitionException {
        nesCParser.function_definition_return retval = new nesCParser.function_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers373 =null;

        nesCParser.declarator_return declarator374 =null;

        nesCParser.attributes_return attributes375 =null;

        nesCParser.gcc_attributes_return gcc_attributes376 =null;

        nesCParser.compound_statement_return compound_statement377 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        RewriteRuleSubtreeStream stream_gcc_attributes=new RewriteRuleSubtreeStream(adaptor,"rule gcc_attributes");
        try {
            // nesC.g:849:5: ( declaration_specifiers declarator ( attributes | gcc_attributes )? compound_statement -> declaration_specifiers declarator compound_statement )
            // nesC.g:849:10: declaration_specifiers declarator ( attributes | gcc_attributes )? compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition7393);
            declaration_specifiers373=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers373.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition7395);
            declarator374=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator374.getTree());

            // nesC.g:849:44: ( attributes | gcc_attributes )?
            int alt102=3;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==ATTRIBUTE) ) {
                alt102=1;
            }
            else if ( (LA102_0==GCCATTRIBUTE) ) {
                alt102=2;
            }
            switch (alt102) {
                case 1 :
                    // nesC.g:849:45: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_function_definition7398);
                    attributes375=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes375.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:849:58: gcc_attributes
                    {
                    pushFollow(FOLLOW_gcc_attributes_in_function_definition7402);
                    gcc_attributes376=gcc_attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes376.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compound_statement_in_function_definition7406);
            compound_statement377=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement377.getTree());

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
            // 850:13: -> declaration_specifiers declarator compound_statement
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
    // nesC.g:860:1: nesC_file : ( translation_unit )? large_scale_construct -> ^( FILE ( translation_unit )? large_scale_construct ) ;
    public final nesCParser.nesC_file_return nesC_file() throws RecognitionException {
        nesCParser.nesC_file_return retval = new nesCParser.nesC_file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit378 =null;

        nesCParser.large_scale_construct_return large_scale_construct379 =null;


        RewriteRuleSubtreeStream stream_large_scale_construct=new RewriteRuleSubtreeStream(adaptor,"rule large_scale_construct");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            // nesC.g:861:5: ( ( translation_unit )? large_scale_construct -> ^( FILE ( translation_unit )? large_scale_construct ) )
            // nesC.g:861:10: ( translation_unit )? large_scale_construct
            {
            // nesC.g:861:10: ( translation_unit )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==ASYNC||LA103_0==AUTO||LA103_0==BUILTIN_VA_LIST||LA103_0==CHAR||LA103_0==COMMAND||LA103_0==CONST||(LA103_0 >= DOUBLE && LA103_0 <= DUTY)||LA103_0==ENUM||(LA103_0 >= EVENT && LA103_0 <= EXTERN)||LA103_0==FLOAT||LA103_0==HASH||(LA103_0 >= INLINE && LA103_0 <= INT8_T)||LA103_0==LONG||LA103_0==NORACE||(LA103_0 >= NXLE_INT16_T && LA103_0 <= NX_UNION)||LA103_0==RAW_IDENTIFIER||LA103_0==REGISTER||LA103_0==RESTRICT||LA103_0==SHORT||LA103_0==SIGNED||LA103_0==STATIC||LA103_0==STRUCT||(LA103_0 >= TASK && LA103_0 <= UINT8_T)||(LA103_0 >= UNION && LA103_0 <= UNSIGNED)||(LA103_0 >= VOID && LA103_0 <= VOLATILE)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // nesC.g:861:10: translation_unit
                    {
                    pushFollow(FOLLOW_translation_unit_in_nesC_file7452);
                    translation_unit378=translation_unit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit378.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_large_scale_construct_in_nesC_file7455);
            large_scale_construct379=large_scale_construct();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_large_scale_construct.add(large_scale_construct379.getTree());

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
            // 862:14: -> ^( FILE ( translation_unit )? large_scale_construct )
            {
                // nesC.g:862:17: ^( FILE ( translation_unit )? large_scale_construct )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FILE, "FILE")
                , root_1);

                // nesC.g:862:24: ( translation_unit )?
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
    // nesC.g:864:1: large_scale_construct : ( interface_definition | component );
    public final nesCParser.large_scale_construct_return large_scale_construct() throws RecognitionException {
        nesCParser.large_scale_construct_return retval = new nesCParser.large_scale_construct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.interface_definition_return interface_definition380 =null;

        nesCParser.component_return component381 =null;



        try {
            // nesC.g:865:5: ( interface_definition | component )
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
                    // nesC.g:865:10: interface_definition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interface_definition_in_large_scale_construct7494);
                    interface_definition380=interface_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interface_definition380.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:866:10: component
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_component_in_large_scale_construct7505);
                    component381=component();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, component381.getTree());

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
    // nesC.g:875:1: interface_definition : INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}' -> ^( INTERFACE identifier ( declaration )* ) ;
    public final nesCParser.interface_definition_return interface_definition() throws RecognitionException {
        nesCParser.interface_definition_return retval = new nesCParser.interface_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERFACE382=null;
        Token char_literal386=null;
        Token char_literal389=null;
        nesCParser.identifier_return identifier383 =null;

        nesCParser.type_parameters_return type_parameters384 =null;

        nesCParser.attributes_return attributes385 =null;

        nesCParser.line_directive_return line_directive387 =null;

        nesCParser.declaration_return declaration388 =null;


        Object INTERFACE382_tree=null;
        Object char_literal386_tree=null;
        Object char_literal389_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_type_parameters=new RewriteRuleSubtreeStream(adaptor,"rule type_parameters");
        try {
            // nesC.g:876:5: ( INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}' -> ^( INTERFACE identifier ( declaration )* ) )
            // nesC.g:876:10: INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( line_directive | declaration )* '}'
            {
            INTERFACE382=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_definition7531); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE382);


            pushFollow(FOLLOW_identifier_in_interface_definition7533);
            identifier383=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier383.getTree());

            // nesC.g:876:31: ( type_parameters )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==LESS) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // nesC.g:876:31: type_parameters
                    {
                    pushFollow(FOLLOW_type_parameters_in_interface_definition7535);
                    type_parameters384=type_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_parameters.add(type_parameters384.getTree());

                    }
                    break;

            }


            // nesC.g:876:48: ( attributes )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==ATTRIBUTE) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // nesC.g:876:48: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_interface_definition7538);
                    attributes385=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes385.getTree());

                    }
                    break;

            }


            char_literal386=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interface_definition7549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal386);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:878:9: ( line_directive | declaration )*
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
            	    // nesC.g:878:10: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_interface_definition7562);
            	    line_directive387=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive387.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:878:27: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_interface_definition7566);
            	    declaration388=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration388.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal389=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interface_definition7584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal389);


            // AST REWRITE
            // elements: declaration, identifier, INTERFACE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 880:13: -> ^( INTERFACE identifier ( declaration )* )
            {
                // nesC.g:880:16: ^( INTERFACE identifier ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:880:39: ( declaration )*
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
    // nesC.g:882:1: type_parameters : '<' type_parameter_list '>' ;
    public final nesCParser.type_parameters_return type_parameters() throws RecognitionException {
        nesCParser.type_parameters_return retval = new nesCParser.type_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal390=null;
        Token char_literal392=null;
        nesCParser.type_parameter_list_return type_parameter_list391 =null;


        Object char_literal390_tree=null;
        Object char_literal392_tree=null;

        try {
            // nesC.g:883:5: ( '<' type_parameter_list '>' )
            // nesC.g:883:10: '<' type_parameter_list '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal390=(Token)match(input,LESS,FOLLOW_LESS_in_type_parameters7626); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal390_tree = 
            (Object)adaptor.create(char_literal390)
            ;
            adaptor.addChild(root_0, char_literal390_tree);
            }

            pushFollow(FOLLOW_type_parameter_list_in_type_parameters7628);
            type_parameter_list391=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_parameter_list391.getTree());

            char_literal392=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_parameters7630); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal392_tree = 
            (Object)adaptor.create(char_literal392)
            ;
            adaptor.addChild(root_0, char_literal392_tree);
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
    // nesC.g:885:1: type_parameter_list : type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* ;
    public final nesCParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        nesCParser.type_parameter_list_return retval = new nesCParser.type_parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal395=null;
        nesCParser.type_specifier_return type_specifier393 =null;

        nesCParser.attributes_return attributes394 =null;

        nesCParser.type_specifier_return type_specifier396 =null;

        nesCParser.attributes_return attributes397 =null;


        Object char_literal395_tree=null;

        try {
            // nesC.g:886:5: ( type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* )
            // nesC.g:886:10: type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_specifier_in_type_parameter_list7649);
            type_specifier393=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier393.getTree());

            // nesC.g:886:25: ( attributes )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==ATTRIBUTE) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // nesC.g:886:25: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_type_parameter_list7651);
                    attributes394=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes394.getTree());

                    }
                    break;

            }


            // nesC.g:886:37: ( ',' type_specifier ( attributes )? )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==COMMA) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // nesC.g:886:38: ',' type_specifier ( attributes )?
            	    {
            	    char_literal395=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_parameter_list7655); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal395_tree = 
            	    (Object)adaptor.create(char_literal395)
            	    ;
            	    adaptor.addChild(root_0, char_literal395_tree);
            	    }

            	    pushFollow(FOLLOW_type_specifier_in_type_parameter_list7657);
            	    type_specifier396=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier396.getTree());

            	    // nesC.g:886:57: ( attributes )?
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==ATTRIBUTE) ) {
            	        alt109=1;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // nesC.g:886:57: attributes
            	            {
            	            pushFollow(FOLLOW_attributes_in_type_parameter_list7659);
            	            attributes397=attributes();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes397.getTree());

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
    // nesC.g:891:1: component : component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) ;
    public final nesCParser.component_return component() throws RecognitionException {
        nesCParser.component_return retval = new nesCParser.component_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.component_kind_return component_kind398 =null;

        nesCParser.identifier_return identifier399 =null;

        nesCParser.component_parameters_return component_parameters400 =null;

        nesCParser.attributes_return attributes401 =null;

        nesCParser.component_specification_return component_specification402 =null;

        nesCParser.implementation_return implementation403 =null;


        RewriteRuleSubtreeStream stream_component_parameters=new RewriteRuleSubtreeStream(adaptor,"rule component_parameters");
        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_component_kind=new RewriteRuleSubtreeStream(adaptor,"rule component_kind");
        try {
            // nesC.g:892:5: ( component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) )
            // nesC.g:892:9: component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )?
            {
            pushFollow(FOLLOW_component_kind_in_component7681);
            component_kind398=component_kind();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_kind.add(component_kind398.getTree());

            pushFollow(FOLLOW_identifier_in_component7683);
            identifier399=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier399.getTree());

            // nesC.g:892:35: ( component_parameters )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==LPARENS) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // nesC.g:892:35: component_parameters
                    {
                    pushFollow(FOLLOW_component_parameters_in_component7685);
                    component_parameters400=component_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameters.add(component_parameters400.getTree());

                    }
                    break;

            }


            // nesC.g:892:57: ( attributes )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==ATTRIBUTE) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // nesC.g:892:57: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_component7688);
                    attributes401=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes401.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_component_specification_in_component7699);
            component_specification402=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification402.getTree());

            // nesC.g:894:9: ( implementation )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==IMPLEMENTATION) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // nesC.g:894:9: implementation
                    {
                    pushFollow(FOLLOW_implementation_in_component7709);
                    implementation403=implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementation.add(implementation403.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: component_kind, identifier, component_parameters, implementation, component_specification
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 894:25: -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
            {
                // nesC.g:894:28: ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DEFINITION, "COMPONENT_DEFINITION")
                , root_1);

                adaptor.addChild(root_1, stream_component_kind.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_component_specification.nextTree());

                // nesC.g:894:101: ( implementation )?
                if ( stream_implementation.hasNext() ) {
                    adaptor.addChild(root_1, stream_implementation.nextTree());

                }
                stream_implementation.reset();

                // nesC.g:894:117: ( component_parameters )?
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
    // nesC.g:899:1: component_kind : ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) );
    public final nesCParser.component_kind_return component_kind() throws RecognitionException {
        nesCParser.component_kind_return retval = new nesCParser.component_kind_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MODULE404=null;
        Token CONFIGURATION405=null;
        Token COMPONENT406=null;
        Token GENERIC407=null;
        Token MODULE408=null;
        Token GENERIC409=null;
        Token CONFIGURATION410=null;

        Object MODULE404_tree=null;
        Object CONFIGURATION405_tree=null;
        Object COMPONENT406_tree=null;
        Object GENERIC407_tree=null;
        Object MODULE408_tree=null;
        Object GENERIC409_tree=null;
        Object CONFIGURATION410_tree=null;
        RewriteRuleTokenStream stream_CONFIGURATION=new RewriteRuleTokenStream(adaptor,"token CONFIGURATION");
        RewriteRuleTokenStream stream_GENERIC=new RewriteRuleTokenStream(adaptor,"token GENERIC");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_COMPONENT=new RewriteRuleTokenStream(adaptor,"token COMPONENT");

        try {
            // nesC.g:900:5: ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) )
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
                    // nesC.g:900:10: MODULE
                    {
                    MODULE404=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE404);


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
                    // 900:32: -> ^( COMPONENT_KIND MODULE )
                    {
                        // nesC.g:900:35: ^( COMPONENT_KIND MODULE )
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
                    // nesC.g:901:10: CONFIGURATION
                    {
                    CONFIGURATION405=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION405);


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
                    // 901:32: -> ^( COMPONENT_KIND CONFIGURATION )
                    {
                        // nesC.g:901:35: ^( COMPONENT_KIND CONFIGURATION )
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
                    // nesC.g:902:10: COMPONENT
                    {
                    COMPONENT406=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_component_kind7807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMPONENT.add(COMPONENT406);


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
                    // 902:32: -> ^( COMPONENT_KIND COMPONENT )
                    {
                        // nesC.g:902:35: ^( COMPONENT_KIND COMPONENT )
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
                    // nesC.g:903:10: GENERIC MODULE
                    {
                    GENERIC407=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC407);


                    MODULE408=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE408);


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
                    // 903:32: -> ^( COMPONENT_KIND GENERIC MODULE )
                    {
                        // nesC.g:903:35: ^( COMPONENT_KIND GENERIC MODULE )
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
                    // nesC.g:904:10: GENERIC CONFIGURATION
                    {
                    GENERIC409=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC409);


                    CONFIGURATION410=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION410);


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
                    // 904:32: -> ^( COMPONENT_KIND GENERIC CONFIGURATION )
                    {
                        // nesC.g:904:35: ^( COMPONENT_KIND GENERIC CONFIGURATION )
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
    // nesC.g:906:1: implementation : IMPLEMENTATION '{' body '}' -> ^( IMPLEMENTATION ( body )? ) ;
    public final nesCParser.implementation_return implementation() throws RecognitionException {
        nesCParser.implementation_return retval = new nesCParser.implementation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLEMENTATION411=null;
        Token char_literal412=null;
        Token char_literal414=null;
        nesCParser.body_return body413 =null;


        Object IMPLEMENTATION411_tree=null;
        Object char_literal412_tree=null;
        Object char_literal414_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // nesC.g:907:5: ( IMPLEMENTATION '{' body '}' -> ^( IMPLEMENTATION ( body )? ) )
            // nesC.g:907:10: IMPLEMENTATION '{' body '}'
            {
            IMPLEMENTATION411=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_implementation7899); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION411);


            char_literal412=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_implementation7901); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal412);


            pushFollow(FOLLOW_body_in_implementation7903);
            body413=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body413.getTree());

            char_literal414=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_implementation7905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal414);


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
            // 908:14: -> ^( IMPLEMENTATION ( body )? )
            {
                // nesC.g:908:17: ^( IMPLEMENTATION ( body )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLEMENTATION.nextNode()
                , root_1);

                // nesC.g:908:34: ( body )?
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
    // nesC.g:914:1: component_parameters : '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) ;
    public final nesCParser.component_parameters_return component_parameters() throws RecognitionException {
        nesCParser.component_parameters_return retval = new nesCParser.component_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal415=null;
        Token char_literal417=null;
        nesCParser.component_parameter_list_return component_parameter_list416 =null;


        Object char_literal415_tree=null;
        Object char_literal417_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter_list");
        try {
            // nesC.g:915:5: ( '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) )
            // nesC.g:915:10: '(' ( component_parameter_list )? ')'
            {
            char_literal415=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_parameters7946); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPARENS.add(char_literal415);


            // nesC.g:915:14: ( component_parameter_list )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==ASYNC||LA115_0==AUTO||LA115_0==BUILTIN_VA_LIST||LA115_0==CHAR||LA115_0==COMMAND||LA115_0==CONST||(LA115_0 >= DOUBLE && LA115_0 <= DUTY)||LA115_0==ENUM||(LA115_0 >= EVENT && LA115_0 <= EXTERN)||LA115_0==FLOAT||(LA115_0 >= INLINE && LA115_0 <= INT8_T)||LA115_0==LONG||LA115_0==NORACE||(LA115_0 >= NXLE_INT16_T && LA115_0 <= NX_UNION)||LA115_0==RAW_IDENTIFIER||LA115_0==REGISTER||LA115_0==RESTRICT||LA115_0==SHORT||LA115_0==SIGNED||LA115_0==STATIC||LA115_0==STRUCT||(LA115_0 >= TASK && LA115_0 <= UINT8_T)||(LA115_0 >= UNION && LA115_0 <= UNSIGNED)||(LA115_0 >= VOID && LA115_0 <= VOLATILE)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // nesC.g:915:14: component_parameter_list
                    {
                    pushFollow(FOLLOW_component_parameter_list_in_component_parameters7948);
                    component_parameter_list416=component_parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameter_list.add(component_parameter_list416.getTree());

                    }
                    break;

            }


            char_literal417=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_parameters7951); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPARENS.add(char_literal417);


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
            // 916:13: -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
            {
                // nesC.g:916:16: ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_PARAMETER_LIST, "COMPONENT_PARAMETER_LIST")
                , root_1);

                // nesC.g:916:43: ( component_parameter_list )?
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
    // nesC.g:918:1: component_parameter_list : component_parameter ( ',' component_parameter )* -> ( component_parameter )+ ;
    public final nesCParser.component_parameter_list_return component_parameter_list() throws RecognitionException {
        nesCParser.component_parameter_list_return retval = new nesCParser.component_parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal419=null;
        nesCParser.component_parameter_return component_parameter418 =null;

        nesCParser.component_parameter_return component_parameter420 =null;


        Object char_literal419_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_parameter=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter");
        try {
            // nesC.g:919:5: ( component_parameter ( ',' component_parameter )* -> ( component_parameter )+ )
            // nesC.g:919:10: component_parameter ( ',' component_parameter )*
            {
            pushFollow(FOLLOW_component_parameter_in_component_parameter_list7991);
            component_parameter418=component_parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter418.getTree());

            // nesC.g:919:30: ( ',' component_parameter )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==COMMA) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // nesC.g:919:31: ',' component_parameter
            	    {
            	    char_literal419=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_parameter_list7994); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal419);


            	    pushFollow(FOLLOW_component_parameter_in_component_parameter_list7996);
            	    component_parameter420=component_parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter420.getTree());

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
            // 919:57: -> ( component_parameter )+
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
    // nesC.g:921:1: component_parameter : ( parameter_declaration | TYPEDEF identifier ( attributes )? );
    public final nesCParser.component_parameter_return component_parameter() throws RecognitionException {
        nesCParser.component_parameter_return retval = new nesCParser.component_parameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TYPEDEF422=null;
        nesCParser.parameter_declaration_return parameter_declaration421 =null;

        nesCParser.identifier_return identifier423 =null;

        nesCParser.attributes_return attributes424 =null;


        Object TYPEDEF422_tree=null;

        try {
            // nesC.g:922:5: ( parameter_declaration | TYPEDEF identifier ( attributes )? )
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
                    // nesC.g:922:10: parameter_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_parameter_declaration_in_component_parameter8022);
                    parameter_declaration421=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_declaration421.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:923:10: TYPEDEF identifier ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TYPEDEF422=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_component_parameter8033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPEDEF422_tree = 
                    (Object)adaptor.create(TYPEDEF422)
                    ;
                    adaptor.addChild(root_0, TYPEDEF422_tree);
                    }

                    pushFollow(FOLLOW_identifier_in_component_parameter8035);
                    identifier423=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier423.getTree());

                    // nesC.g:923:29: ( attributes )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==ATTRIBUTE) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // nesC.g:923:29: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_component_parameter8037);
                            attributes424=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes424.getTree());

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
    // nesC.g:925:1: body : ( ( configuration_body )=> configuration_body | module_body );
    public final nesCParser.body_return body() throws RecognitionException {
        nesCParser.body_return retval = new nesCParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.configuration_body_return configuration_body425 =null;

        nesCParser.module_body_return module_body426 =null;



        try {
            // nesC.g:926:5: ( ( configuration_body )=> configuration_body | module_body )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==HASH) ) {
                int LA119_1 = input.LA(2);

                if ( (LA119_1==CONSTANT) ) {
                    int LA119_8 = input.LA(3);

                    if ( (LA119_8==STRING_LITERAL) ) {
                        int LA119_14 = input.LA(4);

                        if ( (synpred11_nesC()) ) {
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
            else if ( (LA119_0==COMPONENTS) && (synpred11_nesC())) {
                alt119=1;
            }
            else if ( (LA119_0==ACTIVATE) && (synpred11_nesC())) {
                alt119=1;
            }
            else if ( (LA119_0==RAW_IDENTIFIER) ) {
                int LA119_4 = input.LA(2);

                if ( (LA119_4==DOT) && (synpred11_nesC())) {
                    alt119=1;
                }
                else if ( (LA119_4==ASSIGN) && (synpred11_nesC())) {
                    alt119=1;
                }
                else if ( (LA119_4==ARROW) && (synpred11_nesC())) {
                    alt119=1;
                }
                else if ( (LA119_4==201) && (synpred11_nesC())) {
                    alt119=1;
                }
                else if ( (LA119_4==LBRACKET) && (synpred11_nesC())) {
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
            else if ( (LA119_0==LBRACKET) && (synpred11_nesC())) {
                alt119=1;
            }
            else if ( (LA119_0==RBRACE) && (synpred11_nesC())) {
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
                    // nesC.g:926:10: ( configuration_body )=> configuration_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_configuration_body_in_body8063);
                    configuration_body425=configuration_body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_body425.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:927:10: module_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_module_body_in_body8074);
                    module_body426=module_body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, module_body426.getTree());

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
    // nesC.g:932:1: configuration_body : ( configuration_element_list )? ;
    public final nesCParser.configuration_body_return configuration_body() throws RecognitionException {
        nesCParser.configuration_body_return retval = new nesCParser.configuration_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.configuration_element_list_return configuration_element_list427 =null;



        try {
            // nesC.g:933:5: ( ( configuration_element_list )? )
            // nesC.g:933:10: ( configuration_element_list )?
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:934:10: ( configuration_element_list )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==ACTIVATE||LA120_0==COMPONENTS||LA120_0==HASH||LA120_0==LBRACKET||LA120_0==RAW_IDENTIFIER) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // nesC.g:934:10: configuration_element_list
                    {
                    pushFollow(FOLLOW_configuration_element_list_in_configuration_body8103);
                    configuration_element_list427=configuration_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element_list427.getTree());

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
    // nesC.g:938:1: module_body : translation_unit ;
    public final nesCParser.module_body_return module_body() throws RecognitionException {
        nesCParser.module_body_return retval = new nesCParser.module_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit428 =null;



        try {
            // nesC.g:939:5: ( translation_unit )
            // nesC.g:939:10: translation_unit
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_body8146);
            translation_unit428=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, translation_unit428.getTree());

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
    // nesC.g:943:1: configuration_element_list : ( line_directive | configuration_element )+ ;
    public final nesCParser.configuration_element_list_return configuration_element_list() throws RecognitionException {
        nesCParser.configuration_element_list_return retval = new nesCParser.configuration_element_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.line_directive_return line_directive429 =null;

        nesCParser.configuration_element_return configuration_element430 =null;



        try {
            // nesC.g:944:5: ( ( line_directive | configuration_element )+ )
            // nesC.g:944:10: ( line_directive | configuration_element )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:944:10: ( line_directive | configuration_element )+
            int cnt121=0;
            loop121:
            do {
                int alt121=3;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==HASH) ) {
                    alt121=1;
                }
                else if ( (LA121_0==ACTIVATE||LA121_0==COMPONENTS||LA121_0==LBRACKET||LA121_0==RAW_IDENTIFIER) ) {
                    alt121=2;
                }


                switch (alt121) {
            	case 1 :
            	    // nesC.g:944:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_configuration_element_list8173);
            	    line_directive429=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive429.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:944:28: configuration_element
            	    {
            	    pushFollow(FOLLOW_configuration_element_in_configuration_element_list8177);
            	    configuration_element430=configuration_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element430.getTree());

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
    // nesC.g:946:1: configuration_element : ( components | connection );
    public final nesCParser.configuration_element_return configuration_element() throws RecognitionException {
        nesCParser.configuration_element_return retval = new nesCParser.configuration_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.components_return components431 =null;

        nesCParser.connection_return connection432 =null;



        try {
            // nesC.g:947:5: ( components | connection )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==COMPONENTS) ) {
                alt122=1;
            }
            else if ( (LA122_0==ACTIVATE||LA122_0==LBRACKET||LA122_0==RAW_IDENTIFIER) ) {
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
                    // nesC.g:947:10: components
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_components_in_configuration_element8198);
                    components431=components();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, components431.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:948:10: connection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_connection_in_configuration_element8209);
                    connection432=connection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connection432.getTree());

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
    // nesC.g:956:1: components : COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) ;
    public final nesCParser.components_return components() throws RecognitionException {
        nesCParser.components_return retval = new nesCParser.components_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMPONENTS433=null;
        Token char_literal435=null;
        nesCParser.component_line_return component_line434 =null;


        Object COMPONENTS433_tree=null;
        Object char_literal435_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_COMPONENTS=new RewriteRuleTokenStream(adaptor,"token COMPONENTS");
        RewriteRuleSubtreeStream stream_component_line=new RewriteRuleSubtreeStream(adaptor,"rule component_line");
        try {
            // nesC.g:957:5: ( COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) )
            // nesC.g:957:10: COMPONENTS component_line ';'
            {
            COMPONENTS433=(Token)match(input,COMPONENTS,FOLLOW_COMPONENTS_in_components8254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPONENTS.add(COMPONENTS433);


            pushFollow(FOLLOW_component_line_in_components8256);
            component_line434=component_line();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_line.add(component_line434.getTree());

            char_literal435=(Token)match(input,200,FOLLOW_200_in_components8258); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal435);


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
            // 957:40: -> ^( COMPONENTS component_line )
            {
                // nesC.g:957:43: ^( COMPONENTS component_line )
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
    // nesC.g:959:1: component_line : component_declaration ( ',' component_declaration )* -> ( component_declaration )+ ;
    public final nesCParser.component_line_return component_line() throws RecognitionException {
        nesCParser.component_line_return retval = new nesCParser.component_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal437=null;
        nesCParser.component_declaration_return component_declaration436 =null;

        nesCParser.component_declaration_return component_declaration438 =null;


        Object char_literal437_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_declaration=new RewriteRuleSubtreeStream(adaptor,"rule component_declaration");
        try {
            // nesC.g:960:5: ( component_declaration ( ',' component_declaration )* -> ( component_declaration )+ )
            // nesC.g:960:10: component_declaration ( ',' component_declaration )*
            {
            pushFollow(FOLLOW_component_declaration_in_component_line8285);
            component_declaration436=component_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration436.getTree());

            // nesC.g:960:32: ( ',' component_declaration )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==COMMA) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // nesC.g:960:33: ',' component_declaration
            	    {
            	    char_literal437=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_line8288); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal437);


            	    pushFollow(FOLLOW_component_declaration_in_component_line8290);
            	    component_declaration438=component_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration438.getTree());

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
            // 960:61: -> ( component_declaration )+
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
    // nesC.g:962:1: component_declaration : component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) ;
    public final nesCParser.component_declaration_return component_declaration() throws RecognitionException {
        nesCParser.component_declaration_return retval = new nesCParser.component_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS440=null;
        nesCParser.component_ref_return component_ref439 =null;

        nesCParser.identifier_return identifier441 =null;


        Object AS440_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_component_ref=new RewriteRuleSubtreeStream(adaptor,"rule component_ref");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:963:5: ( component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) )
            // nesC.g:963:10: component_ref ( AS identifier )?
            {
            pushFollow(FOLLOW_component_ref_in_component_declaration8316);
            component_ref439=component_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_ref.add(component_ref439.getTree());

            // nesC.g:963:24: ( AS identifier )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==AS) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // nesC.g:963:25: AS identifier
                    {
                    AS440=(Token)match(input,AS,FOLLOW_AS_in_component_declaration8319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS440);


                    pushFollow(FOLLOW_identifier_in_component_declaration8321);
                    identifier441=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier441.getTree());

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
            // 963:41: -> ^( COMPONENT_DECLARATION component_ref ( identifier )? )
            {
                // nesC.g:963:44: ^( COMPONENT_DECLARATION component_ref ( identifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DECLARATION, "COMPONENT_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_component_ref.nextTree());

                // nesC.g:963:82: ( identifier )?
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
    // nesC.g:969:1: component_ref : ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) );
    public final nesCParser.component_ref_return component_ref() throws RecognitionException {
        nesCParser.component_ref_return retval = new nesCParser.component_ref_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEW443=null;
        Token char_literal445=null;
        Token char_literal447=null;
        nesCParser.identifier_return identifier442 =null;

        nesCParser.identifier_return identifier444 =null;

        nesCParser.component_argument_list_return component_argument_list446 =null;


        Object NEW443_tree=null;
        Object char_literal445_tree=null;
        Object char_literal447_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule component_argument_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:970:5: ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) )
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
                    // nesC.g:970:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_component_ref8359);
                    identifier442=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier442.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:971:10: NEW identifier '(' ( component_argument_list )? ')'
                    {
                    NEW443=(Token)match(input,NEW,FOLLOW_NEW_in_component_ref8370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW443);


                    pushFollow(FOLLOW_identifier_in_component_ref8372);
                    identifier444=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier444.getTree());

                    char_literal445=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_ref8374); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal445);


                    // nesC.g:971:29: ( component_argument_list )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==AMP||LA125_0==BITCOMPLEMENT||(LA125_0 >= BUILTIN_VA_ARG && LA125_0 <= CALL)||(LA125_0 >= CHAR && LA125_0 <= CHARACTER_LITERAL)||(LA125_0 >= CONST && LA125_0 <= CONSTANT)||LA125_0==DOUBLE||LA125_0==ENUM||LA125_0==FLOAT||(LA125_0 >= INT && LA125_0 <= INT8_T)||(LA125_0 >= LONG && LA125_0 <= LPARENS)||LA125_0==MINUS||LA125_0==MINUSMINUS||LA125_0==NOT||(LA125_0 >= NXLE_INT16_T && LA125_0 <= NX_UNION)||LA125_0==PLUS||LA125_0==PLUSPLUS||LA125_0==POST||LA125_0==RAW_IDENTIFIER||LA125_0==RESTRICT||(LA125_0 >= SHORT && LA125_0 <= SIZEOF)||LA125_0==STAR||(LA125_0 >= STRING_LITERAL && LA125_0 <= STRUCT)||(LA125_0 >= UINT16_T && LA125_0 <= UINT8_T)||(LA125_0 >= UNION && LA125_0 <= UNSIGNED)||(LA125_0 >= VOID && LA125_0 <= VOLATILE)) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // nesC.g:971:29: component_argument_list
                            {
                            pushFollow(FOLLOW_component_argument_list_in_component_ref8376);
                            component_argument_list446=component_argument_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_component_argument_list.add(component_argument_list446.getTree());

                            }
                            break;

                    }


                    char_literal447=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_ref8379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal447);


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
                    // 972:13: -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                    {
                        // nesC.g:972:16: ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_INSTANTIATION, "COMPONENT_INSTANTIATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:972:53: ( component_argument_list )?
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
    // nesC.g:979:1: component_argument_list : component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) ;
    public final nesCParser.component_argument_list_return component_argument_list() throws RecognitionException {
        nesCParser.component_argument_list_return retval = new nesCParser.component_argument_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal449=null;
        nesCParser.component_argument_return component_argument448 =null;

        nesCParser.component_argument_return component_argument450 =null;


        Object char_literal449_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_argument=new RewriteRuleSubtreeStream(adaptor,"rule component_argument");
        try {
            // nesC.g:980:5: ( component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) )
            // nesC.g:980:10: component_argument ( ',' component_argument )*
            {
            pushFollow(FOLLOW_component_argument_in_component_argument_list8426);
            component_argument448=component_argument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_argument.add(component_argument448.getTree());

            // nesC.g:980:29: ( ',' component_argument )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==COMMA) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // nesC.g:980:30: ',' component_argument
            	    {
            	    char_literal449=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_argument_list8429); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal449);


            	    pushFollow(FOLLOW_component_argument_in_component_argument_list8431);
            	    component_argument450=component_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_argument.add(component_argument450.getTree());

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
            // 981:13: -> ^( COMPONENT_ARGUMENTS ( component_argument )+ )
            {
                // nesC.g:981:16: ^( COMPONENT_ARGUMENTS ( component_argument )+ )
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
    // nesC.g:983:1: component_argument : ( expression | type_name );
    public final nesCParser.component_argument_return component_argument() throws RecognitionException {
        nesCParser.component_argument_return retval = new nesCParser.component_argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.expression_return expression451 =null;

        nesCParser.type_name_return type_name452 =null;



        try {
            // nesC.g:984:5: ( expression | type_name )
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
                    // nesC.g:984:10: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_component_argument8473);
                    expression451=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression451.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:985:10: type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_name_in_component_argument8484);
                    type_name452=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name452.getTree());

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
    // nesC.g:991:1: connection : ( certificate_specification )? endpoint wire_rhs ';' -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? ) ;
    public final nesCParser.connection_return connection() throws RecognitionException {
        nesCParser.connection_return retval = new nesCParser.connection_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal456=null;
        nesCParser.certificate_specification_return certificate_specification453 =null;

        nesCParser.endpoint_return endpoint454 =null;

        nesCParser.wire_rhs_return wire_rhs455 =null;


        Object char_literal456_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_certificate_specification=new RewriteRuleSubtreeStream(adaptor,"rule certificate_specification");
        RewriteRuleSubtreeStream stream_wire_rhs=new RewriteRuleSubtreeStream(adaptor,"rule wire_rhs");
        RewriteRuleSubtreeStream stream_endpoint=new RewriteRuleSubtreeStream(adaptor,"rule endpoint");
        try {
            // nesC.g:992:5: ( ( certificate_specification )? endpoint wire_rhs ';' -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? ) )
            // nesC.g:992:10: ( certificate_specification )? endpoint wire_rhs ';'
            {
            // nesC.g:992:10: ( certificate_specification )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==ACTIVATE) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // nesC.g:992:10: certificate_specification
                    {
                    pushFollow(FOLLOW_certificate_specification_in_connection8503);
                    certificate_specification453=certificate_specification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification453.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_endpoint_in_connection8506);
            endpoint454=endpoint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_endpoint.add(endpoint454.getTree());

            pushFollow(FOLLOW_wire_rhs_in_connection8508);
            wire_rhs455=wire_rhs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_wire_rhs.add(wire_rhs455.getTree());

            char_literal456=(Token)match(input,200,FOLLOW_200_in_connection8510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_200.add(char_literal456);


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
            // 993:14: -> ^( CONNECTION wire_rhs endpoint ( certificate_specification )? )
            {
                // nesC.g:993:17: ^( CONNECTION wire_rhs endpoint ( certificate_specification )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONNECTION, "CONNECTION")
                , root_1);

                adaptor.addChild(root_1, stream_wire_rhs.nextTree());

                adaptor.addChild(root_1, stream_endpoint.nextTree());

                // nesC.g:993:48: ( certificate_specification )?
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
    // nesC.g:995:1: wire_rhs : ( '=' ^ endpoint | '->' ^ endpoint | '<-' ^ endpoint );
    public final nesCParser.wire_rhs_return wire_rhs() throws RecognitionException {
        nesCParser.wire_rhs_return retval = new nesCParser.wire_rhs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal457=null;
        Token string_literal459=null;
        Token string_literal461=null;
        nesCParser.endpoint_return endpoint458 =null;

        nesCParser.endpoint_return endpoint460 =null;

        nesCParser.endpoint_return endpoint462 =null;


        Object char_literal457_tree=null;
        Object string_literal459_tree=null;
        Object string_literal461_tree=null;

        try {
            // nesC.g:996:5: ( '=' ^ endpoint | '->' ^ endpoint | '<-' ^ endpoint )
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
                    // nesC.g:996:10: '=' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal457=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_wire_rhs8551); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal457_tree = 
                    (Object)adaptor.create(char_literal457)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal457_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8555);
                    endpoint458=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint458.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:997:10: '->' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal459=(Token)match(input,ARROW,FOLLOW_ARROW_in_wire_rhs8566); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal459_tree = 
                    (Object)adaptor.create(string_literal459)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(string_literal459_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8569);
                    endpoint460=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint460.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:998:10: '<-' ^ endpoint
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal461=(Token)match(input,201,FOLLOW_201_in_wire_rhs8580); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal461_tree = 
                    (Object)adaptor.create(string_literal461)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(string_literal461_tree, root_0);
                    }

                    pushFollow(FOLLOW_endpoint_in_wire_rhs8583);
                    endpoint462=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, endpoint462.getTree());

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
    // nesC.g:1000:1: certificate_specification : ACTIVATE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ACTIVATE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) ;
    public final nesCParser.certificate_specification_return certificate_specification() throws RecognitionException {
        nesCParser.certificate_specification_return retval = new nesCParser.certificate_specification_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token certs=null;
        Token entity=null;
        Token assumptions=null;
        Token ACTIVATE463=null;
        Token AS464=null;
        Token ASSUMING465=null;
        Token FOR466=null;

        Object certs_tree=null;
        Object entity_tree=null;
        Object assumptions_tree=null;
        Object ACTIVATE463_tree=null;
        Object AS464_tree=null;
        Object ASSUMING465_tree=null;
        Object FOR466_tree=null;
        RewriteRuleTokenStream stream_ASSUMING=new RewriteRuleTokenStream(adaptor,"token ASSUMING");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_ACTIVATE=new RewriteRuleTokenStream(adaptor,"token ACTIVATE");

        try {
            // nesC.g:1001:5: ( ACTIVATE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ACTIVATE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) )
            // nesC.g:1001:10: ACTIVATE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR
            {
            ACTIVATE463=(Token)match(input,ACTIVATE,FOLLOW_ACTIVATE_in_certificate_specification8598); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ACTIVATE.add(ACTIVATE463);


            certs=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8602); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(certs);


            // nesC.g:1001:40: ( AS entity= STRING_LITERAL )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==AS) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // nesC.g:1001:41: AS entity= STRING_LITERAL
                    {
                    AS464=(Token)match(input,AS,FOLLOW_AS_in_certificate_specification8605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS464);


                    entity=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(entity);


                    }
                    break;

            }


            // nesC.g:1001:68: ( ASSUMING assumptions= STRING_LITERAL )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ASSUMING) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // nesC.g:1001:69: ASSUMING assumptions= STRING_LITERAL
                    {
                    ASSUMING465=(Token)match(input,ASSUMING,FOLLOW_ASSUMING_in_certificate_specification8614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUMING.add(ASSUMING465);


                    assumptions=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(assumptions);


                    }
                    break;

            }


            FOR466=(Token)match(input,FOR,FOLLOW_FOR_in_certificate_specification8622); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR466);


            // AST REWRITE
            // elements: ASSUMING, AS, certs, ACTIVATE, entity, assumptions
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
            // 1002:14: -> ^( ACTIVATE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
            {
                // nesC.g:1002:17: ^( ACTIVATE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ACTIVATE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_certs.nextNode());

                // nesC.g:1002:35: ( ^( AS $entity) )?
                if ( stream_AS.hasNext()||stream_entity.hasNext() ) {
                    // nesC.g:1002:35: ^( AS $entity)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_AS.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_entity.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_AS.reset();
                stream_entity.reset();

                // nesC.g:1002:50: ( ^( ASSUMING $assumptions) )?
                if ( stream_ASSUMING.hasNext()||stream_assumptions.hasNext() ) {
                    // nesC.g:1002:50: ^( ASSUMING $assumptions)
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
    // nesC.g:1004:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );
    public final nesCParser.endpoint_return endpoint() throws RecognitionException {
        nesCParser.endpoint_return retval = new nesCParser.endpoint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal469=null;
        Token char_literal471=null;
        nesCParser.identifier_path_return identifier_path467 =null;

        nesCParser.identifier_path_return identifier_path468 =null;

        nesCParser.argument_expression_list_return argument_expression_list470 =null;


        Object char_literal469_tree=null;
        Object char_literal471_tree=null;

        try {
            // nesC.g:1005:5: ( identifier_path | identifier_path '[' argument_expression_list ']' )
            int alt133=2;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // nesC.g:1005:10: identifier_path
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8675);
                    identifier_path467=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path467.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:1006:10: identifier_path '[' argument_expression_list ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8686);
                    identifier_path468=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path468.getTree());

                    char_literal469=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_endpoint8688); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal469_tree = 
                    (Object)adaptor.create(char_literal469)
                    ;
                    adaptor.addChild(root_0, char_literal469_tree);
                    }

                    pushFollow(FOLLOW_argument_expression_list_in_endpoint8690);
                    argument_expression_list470=argument_expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list470.getTree());

                    char_literal471=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_endpoint8692); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal471_tree = 
                    (Object)adaptor.create(char_literal471)
                    ;
                    adaptor.addChild(root_0, char_literal471_tree);
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
    // nesC.g:1008:1: identifier_path : ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) );
    public final nesCParser.identifier_path_return identifier_path() throws RecognitionException {
        nesCParser.identifier_path_return retval = new nesCParser.identifier_path_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal473=null;
        Token char_literal475=null;
        Token char_literal476=null;
        Token char_literal477=null;
        List list_normal_path=null;
        nesCParser.identifier_return indirect =null;

        nesCParser.identifier_return identifier472 =null;

        nesCParser.identifier_return identifier474 =null;

        RuleReturnScope normal_path = null;
        Object char_literal473_tree=null;
        Object char_literal475_tree=null;
        Object char_literal476_tree=null;
        Object char_literal477_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1009:5: ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) )
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
                    // nesC.g:1009:10: identifier ( '.' identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_identifier_path8711);
                    identifier472=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier472.getTree());

                    // nesC.g:1009:21: ( '.' identifier )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==DOT) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // nesC.g:1009:22: '.' identifier
                    	    {
                    	    char_literal473=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8714); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal473);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8716);
                    	    identifier474=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier474.getTree());

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
                    // 1010:13: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:1010:16: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:1011:10: '[' indirect= identifier ']' ( '.' normal_path+= identifier )*
                    {
                    char_literal475=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_identifier_path8750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal475);


                    pushFollow(FOLLOW_identifier_in_identifier_path8754);
                    indirect=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(indirect.getTree());

                    char_literal476=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_identifier_path8756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal476);


                    // nesC.g:1011:38: ( '.' normal_path+= identifier )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==DOT) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // nesC.g:1011:39: '.' normal_path+= identifier
                    	    {
                    	    char_literal477=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8759); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal477);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8763);
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
                    // 1012:13: -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
                    {
                        // nesC.g:1012:16: ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
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
    // nesC.g:1018:1: component_specification : '{' ( line_directive | uses_provides )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final nesCParser.component_specification_return component_specification() throws RecognitionException {
        nesCParser.component_specification_return retval = new nesCParser.component_specification_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal478=null;
        Token char_literal481=null;
        nesCParser.line_directive_return line_directive479 =null;

        nesCParser.uses_provides_return uses_provides480 =null;


        Object char_literal478_tree=null;
        Object char_literal481_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        try {
            // nesC.g:1019:5: ( '{' ( line_directive | uses_provides )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // nesC.g:1019:10: '{' ( line_directive | uses_provides )* '}'
            {
            char_literal478=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification8812); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal478);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:1020:11: ( line_directive | uses_provides )*
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
            	    // nesC.g:1020:12: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification8827);
            	    line_directive479=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive479.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:1020:29: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification8831);
            	    uses_provides480=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides480.getTree());

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);


            char_literal481=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification8835); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal481);


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
            // 1020:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // nesC.g:1020:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // nesC.g:1020:68: ( uses_provides )*
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
    // nesC.g:1022:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) );
    public final nesCParser.uses_provides_return uses_provides() throws RecognitionException {
        nesCParser.uses_provides_return retval = new nesCParser.uses_provides_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token USES482=null;
        Token PROVIDES484=null;
        nesCParser.specification_element_list_return specification_element_list483 =null;

        nesCParser.specification_element_list_return specification_element_list485 =null;

        nesCParser.declaration_return declaration486 =null;


        Object USES482_tree=null;
        Object PROVIDES484_tree=null;
        RewriteRuleTokenStream stream_PROVIDES=new RewriteRuleTokenStream(adaptor,"token PROVIDES");
        RewriteRuleTokenStream stream_USES=new RewriteRuleTokenStream(adaptor,"token USES");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_specification_element_list=new RewriteRuleSubtreeStream(adaptor,"rule specification_element_list");
        try {
            // nesC.g:1023:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) )
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
                    // nesC.g:1023:10: USES specification_element_list
                    {
                    USES482=(Token)match(input,USES,FOLLOW_USES_in_uses_provides8863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES482);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8865);
                    specification_element_list483=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list483.getTree());

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
                    // 1023:42: -> ^( USES specification_element_list )
                    {
                        // nesC.g:1023:45: ^( USES specification_element_list )
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
                    // nesC.g:1024:10: PROVIDES specification_element_list
                    {
                    PROVIDES484=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides8884); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES484);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8886);
                    specification_element_list485=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list485.getTree());

                    // AST REWRITE
                    // elements: PROVIDES, specification_element_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1024:46: -> ^( PROVIDES specification_element_list )
                    {
                        // nesC.g:1024:49: ^( PROVIDES specification_element_list )
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
                    // nesC.g:1025:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_uses_provides8905);
                    declaration486=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration486.getTree());

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
                    // 1025:22: -> ^( DECLARATION declaration )
                    {
                        // nesC.g:1025:25: ^( DECLARATION declaration )
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
    // nesC.g:1027:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final nesCParser.specification_element_list_return specification_element_list() throws RecognitionException {
        nesCParser.specification_element_list_return retval = new nesCParser.specification_element_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal488=null;
        Token char_literal490=null;
        nesCParser.specification_element_return specification_element487 =null;

        nesCParser.specification_element_return specification_element489 =null;


        Object char_literal488_tree=null;
        Object char_literal490_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_specification_element=new RewriteRuleSubtreeStream(adaptor,"rule specification_element");
        try {
            // nesC.g:1028:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
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
                    // nesC.g:1028:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list8932);
                    specification_element487=specification_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element.add(specification_element487.getTree());

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
                    // 1028:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:1029:10: '{' ( specification_element )+ '}'
                    {
                    char_literal488=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list8947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal488);


                    // nesC.g:1029:14: ( specification_element )+
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
                    	    // nesC.g:1029:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list8949);
                    	    specification_element489=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element489.getTree());

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


                    char_literal490=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list8952); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal490);


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
                    // 1029:41: -> ( specification_element )+
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
    // nesC.g:1031:1: specification_element : ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) );
    public final nesCParser.specification_element_return specification_element() throws RecognitionException {
        nesCParser.specification_element_return retval = new nesCParser.specification_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS493=null;
        Token char_literal497=null;
        nesCParser.declaration_return declaration491 =null;

        nesCParser.interface_type_return interface_type492 =null;

        nesCParser.identifier_return identifier494 =null;

        nesCParser.instance_parameters_return instance_parameters495 =null;

        nesCParser.attributes_return attributes496 =null;


        Object AS493_tree=null;
        Object char_literal497_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_instance_parameters=new RewriteRuleSubtreeStream(adaptor,"rule instance_parameters");
        RewriteRuleSubtreeStream stream_interface_type=new RewriteRuleSubtreeStream(adaptor,"rule interface_type");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1032:5: ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) )
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
                    // nesC.g:1032:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_specification_element8976);
                    declaration491=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration491.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:1033:10: interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';'
                    {
                    pushFollow(FOLLOW_interface_type_in_specification_element8987);
                    interface_type492=interface_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_type.add(interface_type492.getTree());

                    // nesC.g:1033:25: ( AS identifier )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==AS) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // nesC.g:1033:26: AS identifier
                            {
                            AS493=(Token)match(input,AS,FOLLOW_AS_in_specification_element8990); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AS.add(AS493);


                            pushFollow(FOLLOW_identifier_in_specification_element8992);
                            identifier494=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier494.getTree());

                            }
                            break;

                    }


                    // nesC.g:1033:42: ( instance_parameters )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==LBRACKET) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // nesC.g:1033:42: instance_parameters
                            {
                            pushFollow(FOLLOW_instance_parameters_in_specification_element8996);
                            instance_parameters495=instance_parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_instance_parameters.add(instance_parameters495.getTree());

                            }
                            break;

                    }


                    // nesC.g:1033:63: ( attributes )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==ATTRIBUTE) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // nesC.g:1033:63: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_specification_element8999);
                            attributes496=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes496.getTree());

                            }
                            break;

                    }


                    char_literal497=(Token)match(input,200,FOLLOW_200_in_specification_element9002); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_200.add(char_literal497);


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
                    // 1034:13: -> ^( INTERFACE interface_type ( identifier )? )
                    {
                        // nesC.g:1034:16: ^( INTERFACE interface_type ( identifier )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTERFACE, "INTERFACE")
                        , root_1);

                        adaptor.addChild(root_1, stream_interface_type.nextTree());

                        // nesC.g:1034:43: ( identifier )?
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
    // nesC.g:1041:1: interface_type : ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) ;
    public final nesCParser.interface_type_return interface_type() throws RecognitionException {
        nesCParser.interface_type_return retval = new nesCParser.interface_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REMOTE498=null;
        Token INTERFACE499=null;
        Token REQUIRES502=null;
        Token STRING_LITERAL503=null;
        nesCParser.identifier_return identifier500 =null;

        nesCParser.type_arguments_return type_arguments501 =null;


        Object REMOTE498_tree=null;
        Object INTERFACE499_tree=null;
        Object REQUIRES502_tree=null;
        Object STRING_LITERAL503_tree=null;
        RewriteRuleTokenStream stream_REMOTE=new RewriteRuleTokenStream(adaptor,"token REMOTE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_REQUIRES=new RewriteRuleTokenStream(adaptor,"token REQUIRES");
        RewriteRuleSubtreeStream stream_type_arguments=new RewriteRuleSubtreeStream(adaptor,"rule type_arguments");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // nesC.g:1042:5: ( ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) )
            // nesC.g:1042:10: ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )?
            {
            // nesC.g:1042:10: ( REMOTE )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==REMOTE) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // nesC.g:1042:10: REMOTE
                    {
                    REMOTE498=(Token)match(input,REMOTE,FOLLOW_REMOTE_in_interface_type9049); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REMOTE.add(REMOTE498);


                    }
                    break;

            }


            INTERFACE499=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_type9052); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE499);


            pushFollow(FOLLOW_identifier_in_interface_type9054);
            identifier500=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier500.getTree());

            // nesC.g:1042:39: ( type_arguments )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==LESS) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // nesC.g:1042:39: type_arguments
                    {
                    pushFollow(FOLLOW_type_arguments_in_interface_type9056);
                    type_arguments501=type_arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_arguments.add(type_arguments501.getTree());

                    }
                    break;

            }


            // nesC.g:1042:55: ( REQUIRES STRING_LITERAL )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==REQUIRES) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // nesC.g:1042:56: REQUIRES STRING_LITERAL
                    {
                    REQUIRES502=(Token)match(input,REQUIRES,FOLLOW_REQUIRES_in_interface_type9060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRES.add(REQUIRES502);


                    STRING_LITERAL503=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_interface_type9062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL503);


                    }
                    break;

            }


            // AST REWRITE
            // elements: type_arguments, REMOTE, STRING_LITERAL, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1043:13: -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
            {
                // nesC.g:1043:16: ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_TYPE, "INTERFACE_TYPE")
                , root_1);

                // nesC.g:1043:33: ( REMOTE )?
                if ( stream_REMOTE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_REMOTE.nextNode()
                    );

                }
                stream_REMOTE.reset();

                // nesC.g:1043:41: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING_LITERAL.nextNode()
                    );

                }
                stream_STRING_LITERAL.reset();

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:1043:68: ( type_arguments )?
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
    // nesC.g:1045:1: type_arguments : '<' type_name ( ',' type_name )* '>' -> ( type_name )+ ;
    public final nesCParser.type_arguments_return type_arguments() throws RecognitionException {
        nesCParser.type_arguments_return retval = new nesCParser.type_arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal504=null;
        Token char_literal506=null;
        Token char_literal508=null;
        nesCParser.type_name_return type_name505 =null;

        nesCParser.type_name_return type_name507 =null;


        Object char_literal504_tree=null;
        Object char_literal506_tree=null;
        Object char_literal508_tree=null;
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // nesC.g:1046:5: ( '<' type_name ( ',' type_name )* '>' -> ( type_name )+ )
            // nesC.g:1046:10: '<' type_name ( ',' type_name )* '>'
            {
            char_literal504=(Token)match(input,LESS,FOLLOW_LESS_in_type_arguments9112); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESS.add(char_literal504);


            pushFollow(FOLLOW_type_name_in_type_arguments9114);
            type_name505=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_name.add(type_name505.getTree());

            // nesC.g:1046:24: ( ',' type_name )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==COMMA) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // nesC.g:1046:25: ',' type_name
            	    {
            	    char_literal506=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_arguments9117); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal506);


            	    pushFollow(FOLLOW_type_name_in_type_arguments9119);
            	    type_name507=type_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type_name.add(type_name507.getTree());

            	    }
            	    break;

            	default :
            	    break loop148;
                }
            } while (true);


            char_literal508=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_arguments9123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GREATER.add(char_literal508);


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
            // 1046:45: -> ( type_name )+
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
    // nesC.g:1048:1: instance_parameters : '[' parameter_list ']' ;
    public final nesCParser.instance_parameters_return instance_parameters() throws RecognitionException {
        nesCParser.instance_parameters_return retval = new nesCParser.instance_parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal509=null;
        Token char_literal511=null;
        nesCParser.parameter_list_return parameter_list510 =null;


        Object char_literal509_tree=null;
        Object char_literal511_tree=null;

        try {
            // nesC.g:1049:5: ( '[' parameter_list ']' )
            // nesC.g:1049:10: '[' parameter_list ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal509=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_instance_parameters9147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal509_tree = 
            (Object)adaptor.create(char_literal509)
            ;
            adaptor.addChild(root_0, char_literal509_tree);
            }

            pushFollow(FOLLOW_parameter_list_in_instance_parameters9149);
            parameter_list510=parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list510.getTree());

            char_literal511=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_instance_parameters9151); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal511_tree = 
            (Object)adaptor.create(char_literal511)
            ;
            adaptor.addChild(root_0, char_literal511_tree);
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
    // nesC.g:1051:1: attributes : ( attribute )+ ;
    public final nesCParser.attributes_return attributes() throws RecognitionException {
        nesCParser.attributes_return retval = new nesCParser.attributes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.attribute_return attribute512 =null;



        try {
            // nesC.g:1052:5: ( ( attribute )+ )
            // nesC.g:1052:10: ( attribute )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:1052:10: ( attribute )+
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
            	    // nesC.g:1052:10: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributes9170);
            	    attribute512=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute512.getTree());

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
    // nesC.g:1054:1: attribute : '@' identifier '(' initializer_list ')' ;
    public final nesCParser.attribute_return attribute() throws RecognitionException {
        nesCParser.attribute_return retval = new nesCParser.attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal513=null;
        Token char_literal515=null;
        Token char_literal517=null;
        nesCParser.identifier_return identifier514 =null;

        nesCParser.initializer_list_return initializer_list516 =null;


        Object char_literal513_tree=null;
        Object char_literal515_tree=null;
        Object char_literal517_tree=null;

        try {
            // nesC.g:1055:5: ( '@' identifier '(' initializer_list ')' )
            // nesC.g:1055:10: '@' identifier '(' initializer_list ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal513=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute9190); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal513_tree = 
            (Object)adaptor.create(char_literal513)
            ;
            adaptor.addChild(root_0, char_literal513_tree);
            }

            pushFollow(FOLLOW_identifier_in_attribute9192);
            identifier514=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier514.getTree());

            char_literal515=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_attribute9194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal515_tree = 
            (Object)adaptor.create(char_literal515)
            ;
            adaptor.addChild(root_0, char_literal515_tree);
            }

            pushFollow(FOLLOW_initializer_list_in_attribute9196);
            initializer_list516=initializer_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer_list516.getTree());

            char_literal517=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_attribute9198); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal517_tree = 
            (Object)adaptor.create(char_literal517)
            ;
            adaptor.addChild(root_0, char_literal517_tree);
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
    // nesC.g:1064:1: gcc_attributes : GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' ;
    public final nesCParser.gcc_attributes_return gcc_attributes() throws RecognitionException {
        nesCParser.gcc_attributes_return retval = new nesCParser.gcc_attributes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GCCATTRIBUTE518=null;
        Token char_literal519=null;
        Token char_literal520=null;
        Token char_literal522=null;
        Token char_literal523=null;
        nesCParser.gcc_attribute_list_return gcc_attribute_list521 =null;


        Object GCCATTRIBUTE518_tree=null;
        Object char_literal519_tree=null;
        Object char_literal520_tree=null;
        Object char_literal522_tree=null;
        Object char_literal523_tree=null;

        try {
            // nesC.g:1065:5: ( GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' )
            // nesC.g:1065:10: GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')'
            {
            root_0 = (Object)adaptor.nil();


            GCCATTRIBUTE518=(Token)match(input,GCCATTRIBUTE,FOLLOW_GCCATTRIBUTE_in_gcc_attributes9220); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GCCATTRIBUTE518_tree = 
            (Object)adaptor.create(GCCATTRIBUTE518)
            ;
            adaptor.addChild(root_0, GCCATTRIBUTE518_tree);
            }

            char_literal519=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes9222); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal519_tree = 
            (Object)adaptor.create(char_literal519)
            ;
            adaptor.addChild(root_0, char_literal519_tree);
            }

            char_literal520=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes9224); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal520_tree = 
            (Object)adaptor.create(char_literal520)
            ;
            adaptor.addChild(root_0, char_literal520_tree);
            }

            pushFollow(FOLLOW_gcc_attribute_list_in_gcc_attributes9226);
            gcc_attribute_list521=gcc_attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute_list521.getTree());

            char_literal522=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes9228); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal522_tree = 
            (Object)adaptor.create(char_literal522)
            ;
            adaptor.addChild(root_0, char_literal522_tree);
            }

            char_literal523=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes9230); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal523_tree = 
            (Object)adaptor.create(char_literal523)
            ;
            adaptor.addChild(root_0, char_literal523_tree);
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
    // nesC.g:1067:1: gcc_attribute_list : ( gcc_attribute )? ( ',' gcc_attribute )* ;
    public final nesCParser.gcc_attribute_list_return gcc_attribute_list() throws RecognitionException {
        nesCParser.gcc_attribute_list_return retval = new nesCParser.gcc_attribute_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal525=null;
        nesCParser.gcc_attribute_return gcc_attribute524 =null;

        nesCParser.gcc_attribute_return gcc_attribute526 =null;


        Object char_literal525_tree=null;

        try {
            // nesC.g:1068:5: ( ( gcc_attribute )? ( ',' gcc_attribute )* )
            // nesC.g:1068:10: ( gcc_attribute )? ( ',' gcc_attribute )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:1068:10: ( gcc_attribute )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==AMP||LA150_0==BITCOMPLEMENT||LA150_0==BUILTIN_VA_ARG||LA150_0==CALL||LA150_0==CHARACTER_LITERAL||LA150_0==CONSTANT||LA150_0==LPARENS||LA150_0==MINUS||LA150_0==MINUSMINUS||LA150_0==NOT||LA150_0==PLUS||LA150_0==PLUSPLUS||LA150_0==POST||LA150_0==RAW_IDENTIFIER||LA150_0==SIGNAL||LA150_0==SIZEOF||LA150_0==STAR||LA150_0==STRING_LITERAL) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // nesC.g:1068:10: gcc_attribute
                    {
                    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list9245);
                    gcc_attribute524=gcc_attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute524.getTree());

                    }
                    break;

            }


            // nesC.g:1068:25: ( ',' gcc_attribute )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==COMMA) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // nesC.g:1068:26: ',' gcc_attribute
            	    {
            	    char_literal525=(Token)match(input,COMMA,FOLLOW_COMMA_in_gcc_attribute_list9249); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal525_tree = 
            	    (Object)adaptor.create(char_literal525)
            	    ;
            	    adaptor.addChild(root_0, char_literal525_tree);
            	    }

            	    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list9251);
            	    gcc_attribute526=gcc_attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute526.getTree());

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
    // nesC.g:1070:1: gcc_attribute : assignment_expression ;
    public final nesCParser.gcc_attribute_return gcc_attribute() throws RecognitionException {
        nesCParser.gcc_attribute_return retval = new nesCParser.gcc_attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        nesCParser.assignment_expression_return assignment_expression527 =null;



        try {
            // nesC.g:1071:5: ( assignment_expression )
            // nesC.g:1071:10: assignment_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_gcc_attribute9268);
            assignment_expression527=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression527.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // nesC.g:1074:1: identifier :{...}? RAW_IDENTIFIER ;
    public final nesCParser.identifier_return identifier() throws RecognitionException {
        nesCParser.identifier_return retval = new nesCParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER528=null;

        Object RAW_IDENTIFIER528_tree=null;

        try {
            // nesC.g:1075:5: ({...}? RAW_IDENTIFIER )
            // nesC.g:1075:10: {...}? RAW_IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            if ( !(( !symbols.isType(input.LT(1).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "identifier", " !symbols.isType(input.LT(1).getText()) ");
            }

            RAW_IDENTIFIER528=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier9286); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAW_IDENTIFIER528_tree = 
            (Object)adaptor.create(RAW_IDENTIFIER528)
            ;
            adaptor.addChild(root_0, RAW_IDENTIFIER528_tree);
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
        // nesC.g:409:33: ( ',' assignment_expression )
        // nesC.g:409:34: ',' assignment_expression
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred3_nesC4058); if (state.failed) return ;

        pushFollow(FOLLOW_assignment_expression_in_synpred3_nesC4060);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_nesC

    // $ANTLR start synpred4_nesC
    public final void synpred4_nesC_fragment() throws RecognitionException {
        // nesC.g:435:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )
        // nesC.g:435:11: declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred4_nesC4134);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:435:34: ( gcc_attributes )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( (LA152_0==GCCATTRIBUTE) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // nesC.g:435:34: gcc_attributes
                {
                pushFollow(FOLLOW_gcc_attributes_in_synpred4_nesC4136);
                gcc_attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // nesC.g:435:50: ( init_declarator_list )?
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==LPARENS||LA153_0==RAW_IDENTIFIER||LA153_0==STAR) ) {
            alt153=1;
        }
        switch (alt153) {
            case 1 :
                // nesC.g:435:50: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred4_nesC4139);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,200,FOLLOW_200_in_synpred4_nesC4142); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_nesC

    // $ANTLR start synpred5_nesC
    public final void synpred5_nesC_fragment() throws RecognitionException {
        // nesC.g:464:10: ( TYPEDEF declaration_specifiers ';' )
        // nesC.g:464:11: TYPEDEF declaration_specifiers ';'
        {
        match(input,TYPEDEF,FOLLOW_TYPEDEF_in_synpred5_nesC4330); if (state.failed) return ;

        pushFollow(FOLLOW_declaration_specifiers_in_synpred5_nesC4332);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        match(input,200,FOLLOW_200_in_synpred5_nesC4334); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_nesC

    // $ANTLR start synpred6_nesC
    public final void synpred6_nesC_fragment() throws RecognitionException {
        // nesC.g:665:9: ( '[' ( constant_expression )? ']' )
        // nesC.g:665:10: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred6_nesC5849); if (state.failed) return ;

        // nesC.g:665:14: ( constant_expression )?
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==AMP||LA154_0==BITCOMPLEMENT||LA154_0==BUILTIN_VA_ARG||LA154_0==CALL||LA154_0==CHARACTER_LITERAL||LA154_0==CONSTANT||LA154_0==LPARENS||LA154_0==MINUS||LA154_0==MINUSMINUS||LA154_0==NOT||LA154_0==PLUS||LA154_0==PLUSPLUS||LA154_0==POST||LA154_0==RAW_IDENTIFIER||LA154_0==SIGNAL||LA154_0==SIZEOF||LA154_0==STAR||LA154_0==STRING_LITERAL) ) {
            alt154=1;
        }
        switch (alt154) {
            case 1 :
                // nesC.g:665:14: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred6_nesC5851);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred6_nesC5854); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_nesC

    // $ANTLR start synpred7_nesC
    public final void synpred7_nesC_fragment() throws RecognitionException {
        // nesC.g:702:10: ( declarator ( attributes )? )
        // nesC.g:702:11: declarator ( attributes )?
        {
        pushFollow(FOLLOW_declarator_in_synpred7_nesC6160);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:702:22: ( attributes )?
        int alt155=2;
        int LA155_0 = input.LA(1);

        if ( (LA155_0==ATTRIBUTE) ) {
            alt155=1;
        }
        switch (alt155) {
            case 1 :
                // nesC.g:702:22: attributes
                {
                pushFollow(FOLLOW_attributes_in_synpred7_nesC6162);
                attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred7_nesC

    // $ANTLR start synpred8_nesC
    public final void synpred8_nesC_fragment() throws RecognitionException {
        // nesC.g:712:10: ( ( pointer )? direct_abstract_declarator )
        // nesC.g:712:11: ( pointer )? direct_abstract_declarator
        {
        // nesC.g:712:11: ( pointer )?
        int alt156=2;
        int LA156_0 = input.LA(1);

        if ( (LA156_0==STAR) ) {
            alt156=1;
        }
        switch (alt156) {
            case 1 :
                // nesC.g:712:11: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred8_nesC6255);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred8_nesC6258);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_nesC

    // $ANTLR start synpred9_nesC
    public final void synpred9_nesC_fragment() throws RecognitionException {
        // nesC.g:716:10: ( '(' abstract_declarator ')' )
        // nesC.g:716:11: '(' abstract_declarator ')'
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred9_nesC6297); if (state.failed) return ;

        pushFollow(FOLLOW_abstract_declarator_in_synpred9_nesC6299);
        abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred9_nesC6301); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_nesC

    // $ANTLR start synpred10_nesC
    public final void synpred10_nesC_fragment() throws RecognitionException {
        // nesC.g:793:10: ( IF '(' expression ')' statement ELSE statement )
        // nesC.g:793:11: IF '(' expression ')' statement ELSE statement
        {
        match(input,IF,FOLLOW_IF_in_synpred10_nesC6838); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred10_nesC6840); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred10_nesC6842);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred10_nesC6844); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred10_nesC6846);
        statement();

        state._fsp--;
        if (state.failed) return ;

        match(input,ELSE,FOLLOW_ELSE_in_synpred10_nesC6848); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred10_nesC6850);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_nesC

    // $ANTLR start synpred11_nesC
    public final void synpred11_nesC_fragment() throws RecognitionException {
        // nesC.g:926:10: ( configuration_body )
        // nesC.g:926:11: configuration_body
        {
        pushFollow(FOLLOW_configuration_body_in_synpred11_nesC8058);
        configuration_body();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_nesC

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


    protected DFA66 dfa66 = new DFA66(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA133 dfa133 = new DFA133(this);
    static final String DFA66_eotS =
        "\5\uffff";
    static final String DFA66_eofS =
        "\5\uffff";
    static final String DFA66_minS =
        "\1\u00b2\2\41\2\uffff";
    static final String DFA66_maxS =
        "\1\u00b2\2\u00c4\2\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA66_specialS =
        "\5\uffff}>";
    static final String[] DFA66_transitionS = {
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
            return "674:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
    static final String DFA90_eotS =
        "\111\uffff";
    static final String DFA90_eofS =
        "\111\uffff";
    static final String DFA90_minS =
        "\1\7\1\0\107\uffff";
    static final String DFA90_maxS =
        "\1\u00c8\1\0\107\uffff";
    static final String DFA90_acceptS =
        "\2\uffff\1\2\35\uffff\1\1\50\uffff";
    static final String DFA90_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA90_transitionS = {
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
            return "()* loopback of 776:10: ( declaration )*";
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
        "\1\151\1\13\2\u00a0\2\uffff\1\u00a2\2\13\1\u00a0\1\13";
    static final String DFA133_maxS =
        "\1\u00a0\1\u00c9\2\u00a0\2\uffff\1\u00a2\2\u00c9\1\u00a0\1\u00c9";
    static final String DFA133_acceptS =
        "\4\uffff\1\1\1\2\5\uffff";
    static final String DFA133_specialS =
        "\13\uffff}>";
    static final String[] DFA133_transitionS = {
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
            return "1004:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );";
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
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression3979 = new BitSet(new long[]{0x2000000001482002L,0x0095000000000000L,0x0000040000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_expression3983 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_MULASSIGN_in_assignment_expression3988 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_DIVASSIGN_in_assignment_expression3993 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_MODASSIGN_in_assignment_expression3998 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_PLUSASSIGN_in_assignment_expression4003 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_MINUSASSIGN_in_assignment_expression4008 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_LSHIFTASSIGN_in_assignment_expression4013 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_RSHIFTASSIGN_in_assignment_expression4018 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_BITANDASSIGN_in_assignment_expression4023 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_BITXORASSIGN_in_assignment_expression4028 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_BITORASSIGN_in_assignment_expression4033 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression4054 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_expression4065 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_expression4068 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4177 = new BitSet(new long[]{0x0000000000000000L,0x0000400000040000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4179 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration4182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_declaration4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration4339 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_declaration4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration4389 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4391 = new BitSet(new long[]{0x0000000000000000L,0x0000400000040000L,0x0004000100000000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4393 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration4396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_declaration4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_c_style_declaration_specifier_in_declaration_specifiers4468 = new BitSet(new long[]{0x0002000488048002L,0x0200201F80001646L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_storage_class_specifier_in_c_style_declaration_specifier4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_c_style_declaration_specifier4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_c_style_declaration_specifier4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_specifier_in_c_style_declaration_specifier4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4538 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list4541 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4543 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator4577 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_attributes_in_init_declarator4579 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator4583 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_in_init_declarator4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_type_specifier4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT64_T_in_type_specifier4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT64_T_in_type_specifier4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT8_T_in_type_specifier4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT16_T_in_type_specifier4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT32_T_in_type_specifier4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT64_T_in_type_specifier4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT64_T_in_type_specifier4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT8_T_in_type_specifier4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT16_T_in_type_specifier4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT32_T_in_type_specifier5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT64_T_in_type_specifier5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT8_T_in_type_specifier5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT16_T_in_type_specifier5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT32_T_in_type_specifier5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT64_T_in_type_specifier5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUILTIN_VA_LIST_in_type_specifier5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier5125 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier5127 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00801042L,0x3C4028430003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier5129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier5165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5167 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier5172 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00801042L,0x3C4028430003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier5174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_struct_or_union_specifier5216 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_struct_or_union_specifier5218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier5220 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier5222 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00801042L,0x3C4028430003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier5224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_struct_declaration_list5314 = new BitSet(new long[]{0x0002000088000002L,0x0000201F00801042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list5318 = new BitSet(new long[]{0x0002000088000002L,0x0000201F00801042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration5350 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration5352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_struct_declaration5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list5397 = new BitSet(new long[]{0x0002000088000002L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list5401 = new BitSet(new long[]{0x0002000088000002L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5427 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list5430 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5432 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5462 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_struct_declarator5465 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_struct_declarator5480 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5501 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5505 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5544 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5551 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5603 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list5606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5609 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_identifier_in_enumerator5634 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator5637 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_function_specifier5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator5726 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator5754 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator5756 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5782 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier5785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier5822 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier5824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5859 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500502A00000L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier5861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5896 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D50284D0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier5900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5902 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier5906 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5029490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier5910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5952 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000000L,0x0004004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_pointer_in_pointer5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5979 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list6010 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list6035 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list6038 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list6040 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list6045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ELLIPSIS_in_parameter_list6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration6117 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_parameter_declarator_in_parameter_declaration6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_parameter_declarator6168 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_attributes_in_parameter_declarator6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declarator6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list6201 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_identifier_list6204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list6206 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name6232 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator6263 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6317 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator6319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6321 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6323 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator6335 = new BitSet(new long[]{0x0000000000000002L,0x0000420000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator_modifier6351 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500502A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator_modifier6353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator_modifier6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator_modifier6367 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5029490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_direct_abstract_declarator_modifier6369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator_modifier6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer6433 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_list_in_initializer6435 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_initializer6437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_initializer_list6472 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6476 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list6479 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_initializer_list6484 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6488 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_statement_in_statement6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOMIC_in_atomic_statement6624 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_atomic_statement6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_labeled_statement6653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_labeled_statement6655 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement6678 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement6680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_labeled_statement6682 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement6705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_labeled_statement6707 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement6735 = new BitSet(new long[]{0x840E0005BE158080L,0x060A611F88103646L,0x3FF478CB02A3FFFFL,0x000000000000013BL});
    public static final BitSet FOLLOW_declaration_in_compound_statement6748 = new BitSet(new long[]{0x840E0005BE158080L,0x060A611F88103646L,0x3FF478CB02A3FFFFL,0x000000000000013BL});
    public static final BitSet FOLLOW_statement_in_compound_statement6751 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508302A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement6800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_expression_statement6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6865 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6867 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_selection_statement6869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6871 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement6877 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6919 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6921 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_selection_statement6923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6925 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement6961 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6963 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_selection_statement6965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6967 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_selection_statement6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement7015 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement7017 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement7021 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_iteration_statement7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_iteration_statement7044 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_iteration_statement7046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement7048 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement7050 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement7054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_iteration_statement7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement7077 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement7079 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_iteration_statement7086 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_iteration_statement7093 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024510102A00000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement7097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement7100 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_iteration_statement7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_jump_statement7209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_jump_statement7211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement7232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement7249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement7266 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_jump_statement7268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_jump_statement7271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_translation_unit7307 = new BitSet(new long[]{0x0002000488048002L,0x0200201F80801646L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit7311 = new BitSet(new long[]{0x0002000488048002L,0x0200201F80801646L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_in_external_declaration7329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive7356 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive7360 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7362 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition7393 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L});
    public static final BitSet FOLLOW_declarator_in_function_definition7395 = new BitSet(new long[]{0x0000000000020000L,0x0000010000040000L});
    public static final BitSet FOLLOW_attributes_in_function_definition7398 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_gcc_attributes_in_function_definition7402 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7452 = new BitSet(new long[]{0x0000804000000000L,0x0020002000080000L});
    public static final BitSet FOLLOW_large_scale_construct_in_nesC_file7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_definition_in_large_scale_construct7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_in_large_scale_construct7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_definition7531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_interface_definition7533 = new BitSet(new long[]{0x0000000000020000L,0x0000050000000000L});
    public static final BitSet FOLLOW_type_parameters_in_interface_definition7535 = new BitSet(new long[]{0x0000000000020000L,0x0000010000000000L});
    public static final BitSet FOLLOW_attributes_in_interface_definition7538 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interface_definition7549 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_line_directive_in_interface_definition7562 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_in_interface_definition7566 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_RBRACE_in_interface_definition7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_parameters7626 = new BitSet(new long[]{0x0000000088000000L,0x0000201F00001042L,0x3C4028010003FFFFL,0x000000000000000BL});
    public static final BitSet FOLLOW_type_parameter_list_in_type_parameters7628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_GREATER_in_type_parameters7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7649 = new BitSet(new long[]{0x0000000200020002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7651 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_type_parameter_list7655 = new BitSet(new long[]{0x0000000088000000L,0x0000201F00001042L,0x3C4028010003FFFFL,0x000000000000000BL});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7657 = new BitSet(new long[]{0x0000000200020002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7659 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_component_kind_in_component7681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component7683 = new BitSet(new long[]{0x0000000000020000L,0x0000410000000000L});
    public static final BitSet FOLLOW_component_parameters_in_component7685 = new BitSet(new long[]{0x0000000000020000L,0x0000010000000000L});
    public static final BitSet FOLLOW_attributes_in_component7688 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_component_specification_in_component7699 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_implementation_in_component7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_component_kind7807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7838 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7868 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_implementation7899 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LBRACE_in_implementation7901 = new BitSet(new long[]{0x0002008488048020L,0x0200221F80801646L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_body_in_implementation7903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_implementation7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_component_parameters7946 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3F5029490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_parameter_list_in_component_parameters7948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_parameters7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7991 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_component_parameter_list7994 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3F5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7996 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_component_parameter8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_component_parameter8033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component_parameter8035 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_attributes_in_component_parameter8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_body_in_body8063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_body_in_body8074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_element_list_in_configuration_body8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_module_body8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_configuration_element_list8173 = new BitSet(new long[]{0x0000008000000022L,0x0000020000800000L,0x0000000100000000L});
    public static final BitSet FOLLOW_configuration_element_in_configuration_element_list8177 = new BitSet(new long[]{0x0000008000000022L,0x0000020000800000L,0x0000000100000000L});
    public static final BitSet FOLLOW_components_in_configuration_element8198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connection_in_configuration_element8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTS_in_components8254 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_component_line_in_components8256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_components8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_declaration_in_component_line8285 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_component_line8288 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_component_declaration_in_component_line8290 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_component_ref_in_component_declaration8316 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_AS_in_component_declaration8319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component_declaration8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_component_ref8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_component_ref8370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_component_ref8372 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_component_ref8374 = new BitSet(new long[]{0x000600019C100080L,0x040A601F00001042L,0x3C64794102A3FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_argument_list_in_component_ref8376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_ref8379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8426 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_component_argument_list8429 = new BitSet(new long[]{0x000600019C100080L,0x040A601F00001042L,0x3C64784102A3FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8431 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_expression_in_component_argument8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_component_argument8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8503 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_connection8506 = new BitSet(new long[]{0x0000000000002800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_wire_rhs_in_connection8508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_connection8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_wire_rhs8551 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_wire_rhs8566 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_wire_rhs8580 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_endpoint_in_wire_rhs8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_in_certificate_specification8598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8602 = new BitSet(new long[]{0x0000000000005000L,0x0000000000002000L});
    public static final BitSet FOLLOW_AS_in_certificate_specification8605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8609 = new BitSet(new long[]{0x0000000000004000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ASSUMING_in_certificate_specification8614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_FOR_in_certificate_specification8622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8686 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_endpoint8688 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_argument_expression_list_in_endpoint8690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_endpoint8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8711 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACKET_in_identifier_path8750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifier_path8756 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification8812 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B8003FFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_line_directive_in_component_specification8827 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B8003FFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_uses_provides_in_component_specification8831 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80801646L,0x3F50284B8003FFFFL,0x000000000000001FL});
    public static final BitSet FOLLOW_RBRACE_in_component_specification8835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides8863 = new BitSet(new long[]{0x0002000488048000L,0x0200213F80001646L,0x3F5028590003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides8884 = new BitSet(new long[]{0x0002000488048000L,0x0200213F80001646L,0x3F5028590003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_uses_provides8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list8947 = new BitSet(new long[]{0x0002000488048000L,0x0200203F80001646L,0x3F5028590003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8949 = new BitSet(new long[]{0x0002000488048000L,0x0200203F80001646L,0x3F50285B0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_type_in_specification_element8987 = new BitSet(new long[]{0x0000000000021000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_AS_in_specification_element8990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_specification_element8992 = new BitSet(new long[]{0x0000000000020000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_instance_parameters_in_specification_element8996 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_attributes_in_specification_element8999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_specification_element9002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOTE_in_interface_type9049 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_type9052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_interface_type9054 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_type_arguments_in_interface_type9056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_REQUIRES_in_interface_type9060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_interface_type9062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_arguments9112 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_type_arguments9114 = new BitSet(new long[]{0x0000000200000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_type_arguments9117 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_type_arguments9119 = new BitSet(new long[]{0x0000000200000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_GREATER_in_type_arguments9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_instance_parameters9147 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D50284D0003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_parameter_list_in_instance_parameters9149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_instance_parameters9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributes9170 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute9190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_attribute9192 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_attribute9194 = new BitSet(new long[]{0x0004000114100080L,0x040A410000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_initializer_list_in_attribute9196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_attribute9198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GCCATTRIBUTE_in_gcc_attributes9220 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes9222 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes9224 = new BitSet(new long[]{0x0004000314100080L,0x040A400000000000L,0x0024510102A00000L});
    public static final BitSet FOLLOW_gcc_attribute_list_in_gcc_attributes9226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes9228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes9230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list9245 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_gcc_attribute_list9249 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list9251 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_assignment_expression_in_gcc_attribute9268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred1_nesC3466 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred1_nesC3468 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_synpred1_nesC3470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred1_nesC3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred2_nesC3543 = new BitSet(new long[]{0x0002000088000000L,0x0000201F00001042L,0x3C4028410003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_type_name_in_synpred2_nesC3545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred2_nesC3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred3_nesC4058 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred3_nesC4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred4_nesC4134 = new BitSet(new long[]{0x0000000000000000L,0x0000400000040000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_gcc_attributes_in_synpred4_nesC4136 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0004000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred4_nesC4139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_synpred4_nesC4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_synpred5_nesC4330 = new BitSet(new long[]{0x0002000488048000L,0x0200201F80001646L,0x3D5028490003FFFFL,0x000000000000001BL});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred5_nesC4332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_synpred5_nesC4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred6_nesC5849 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500502A00000L});
    public static final BitSet FOLLOW_constant_expression_in_synpred6_nesC5851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred6_nesC5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred7_nesC6160 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_attributes_in_synpred7_nesC6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred8_nesC6255 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred8_nesC6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred9_nesC6297 = new BitSet(new long[]{0x0000000000000000L,0x0000420000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_synpred9_nesC6299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred9_nesC6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred10_nesC6838 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred10_nesC6840 = new BitSet(new long[]{0x0004000114100080L,0x040A400000000000L,0x0024500102A00000L});
    public static final BitSet FOLLOW_expression_in_synpred10_nesC6842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred10_nesC6844 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_synpred10_nesC6846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ELSE_in_synpred10_nesC6848 = new BitSet(new long[]{0x840C000136110080L,0x040A410008102000L,0x00A4508102A00000L,0x0000000000000120L});
    public static final BitSet FOLLOW_statement_in_synpred10_nesC6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_body_in_synpred11_nesC8058 = new BitSet(new long[]{0x0000000000000002L});

}