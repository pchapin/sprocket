// $ANTLR 3.4 nesC.g 2013-03-26 14:30:57

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADDRESS_OF", "AMP", "AND", "ARGUMENT_LIST", "ARRAY_ELEMENT_SELECTION", "ARROW", "AS", "ASSIGN", "ASSUMING", "ASYNC", "ATOMIC", "ATTRIBUTE", "AUTO", "BITANDASSIGN", "BITCOMPLEMENT", "BITOR", "BITORASSIGN", "BITXOR", "BITXORASSIGN", "BREAK", "CALL", "CASE", "CAST", "CHAR", "CHARACTER_LITERAL", "COMMA", "COMMAND", "COMMENT1", "COMMENT2", "COMPONENT", "COMPONENTS", "COMPONENT_ARGUMENTS", "COMPONENT_DECLARATION", "COMPONENT_INSTANTIATION", "COMPOUND_STATEMENT", "CONFIGURATION", "CONNECTION", "CONST", "CONSTANT", "CONTINUE", "DECLARATION", "DECLARATOR", "DECLARATOR_ARRAY_MODIFIER", "DECLARATOR_LIST", "DECLARATOR_PARAMETER_LIST_MODIFIER", "DEC_NUMBER", "DEFAULT", "DEREFERENCE", "DIGIT", "DIVASSIGN", "DIVIDE", "DO", "DOT", "DOUBLE", "DUTY", "DYNAMIC_IDENTIFIER_PATH", "ELSE", "ENABLE", "ENUM", "ENUMERATOR", "EQUAL", "EVENT", "EXTERN", "FILE", "FLOAT", "FOR", "FOR_CONDITION", "FOR_INITIALIZE", "FOR_ITERATION", "FUNCTION_DEFINITION", "GCCATTRIBUTE", "GENERIC", "GOTO", "GREATER", "GREATEREQUAL", "HASH", "HEX_DIGIT", "HEX_NUMBER", "IDENTIFIER_PATH", "IF", "IMPLEMENTATION", "INITIALIZER_LIST", "INIT_DECLARATOR", "INLINE", "INT", "INT16_T", "INT32_T", "INT64_T", "INT8_T", "INTERFACE", "INTERFACE_TYPE", "LABELED_STATEMENT", "LBRACE", "LBRACKET", "LESS", "LESSEQUAL", "LINE_DIRECTIVE", "LONG", "LPARENS", "LSHIFT", "LSHIFTASSIGN", "MINUS", "MINUSASSIGN", "MINUSMINUS", "MODASSIGN", "MODULE", "MODULUS", "MULASSIGN", "NEW", "NORACE", "NOT", "NOTEQUAL", "NULL", "NUMBER", "NUMBER_PREFIX", "NUMBER_SUFFIX", "NXLE_UINT16_T", "NXLE_UINT32_T", "NXLE_UINT64_T", "NXLE_UINT8_T", "NX_STRUCT", "NX_UINT16_T", "NX_UINT32_T", "NX_UINT64_T", "NX_UINT8_T", "NX_UNION", "OR", "PARAMETER", "PARAMETER_LIST", "PLUS", "PLUSASSIGN", "PLUSPLUS", "POINTER_QUALIFIER", "POST", "POSTFIX_EXPRESSION", "POST_DECREMENT", "POST_INCREMENT", "PRE_DECREMENT", "PRE_INCREMENT", "PROVIDES", "RAW_IDENTIFIER", "RBRACE", "RBRACKET", "REGISTER", "REMOTE", "REQUIRES", "RESTRICT", "RETURN", "RPARENS", "RSHIFT", "RSHIFTASSIGN", "SHORT", "SIGNAL", "SIGNED", "SIZEOF", "SIZEOF_EXPRESSION", "SIZEOF_TYPE", "SPECIFICATION", "STAR", "STATEMENT", "STATIC", "STRING_LITERAL", "STRUCT", "SWITCH", "TASK", "TYPEDEF", "UINT16_T", "UINT32_T", "UINT64_T", "UINT8_T", "UNARY_MINUS", "UNARY_PLUS", "UNION", "UNSIGNED", "USES", "VOID", "VOLATILE", "WHILE", "WHITESPACE", "'...'", "':'", "';'", "'<-'", "'?'"
    };

    public static final int EOF=-1;
    public static final int T__184=184;
    public static final int T__185=185;
    public static final int T__186=186;
    public static final int T__187=187;
    public static final int T__188=188;
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
    public static final int COMPONENT=34;
    public static final int COMPONENTS=35;
    public static final int COMPONENT_ARGUMENTS=36;
    public static final int COMPONENT_DECLARATION=37;
    public static final int COMPONENT_INSTANTIATION=38;
    public static final int COMPOUND_STATEMENT=39;
    public static final int CONFIGURATION=40;
    public static final int CONNECTION=41;
    public static final int CONST=42;
    public static final int CONSTANT=43;
    public static final int CONTINUE=44;
    public static final int DECLARATION=45;
    public static final int DECLARATOR=46;
    public static final int DECLARATOR_ARRAY_MODIFIER=47;
    public static final int DECLARATOR_LIST=48;
    public static final int DECLARATOR_PARAMETER_LIST_MODIFIER=49;
    public static final int DEC_NUMBER=50;
    public static final int DEFAULT=51;
    public static final int DEREFERENCE=52;
    public static final int DIGIT=53;
    public static final int DIVASSIGN=54;
    public static final int DIVIDE=55;
    public static final int DO=56;
    public static final int DOT=57;
    public static final int DOUBLE=58;
    public static final int DUTY=59;
    public static final int DYNAMIC_IDENTIFIER_PATH=60;
    public static final int ELSE=61;
    public static final int ENABLE=62;
    public static final int ENUM=63;
    public static final int ENUMERATOR=64;
    public static final int EQUAL=65;
    public static final int EVENT=66;
    public static final int EXTERN=67;
    public static final int FILE=68;
    public static final int FLOAT=69;
    public static final int FOR=70;
    public static final int FOR_CONDITION=71;
    public static final int FOR_INITIALIZE=72;
    public static final int FOR_ITERATION=73;
    public static final int FUNCTION_DEFINITION=74;
    public static final int GCCATTRIBUTE=75;
    public static final int GENERIC=76;
    public static final int GOTO=77;
    public static final int GREATER=78;
    public static final int GREATEREQUAL=79;
    public static final int HASH=80;
    public static final int HEX_DIGIT=81;
    public static final int HEX_NUMBER=82;
    public static final int IDENTIFIER_PATH=83;
    public static final int IF=84;
    public static final int IMPLEMENTATION=85;
    public static final int INITIALIZER_LIST=86;
    public static final int INIT_DECLARATOR=87;
    public static final int INLINE=88;
    public static final int INT=89;
    public static final int INT16_T=90;
    public static final int INT32_T=91;
    public static final int INT64_T=92;
    public static final int INT8_T=93;
    public static final int INTERFACE=94;
    public static final int INTERFACE_TYPE=95;
    public static final int LABELED_STATEMENT=96;
    public static final int LBRACE=97;
    public static final int LBRACKET=98;
    public static final int LESS=99;
    public static final int LESSEQUAL=100;
    public static final int LINE_DIRECTIVE=101;
    public static final int LONG=102;
    public static final int LPARENS=103;
    public static final int LSHIFT=104;
    public static final int LSHIFTASSIGN=105;
    public static final int MINUS=106;
    public static final int MINUSASSIGN=107;
    public static final int MINUSMINUS=108;
    public static final int MODASSIGN=109;
    public static final int MODULE=110;
    public static final int MODULUS=111;
    public static final int MULASSIGN=112;
    public static final int NEW=113;
    public static final int NORACE=114;
    public static final int NOT=115;
    public static final int NOTEQUAL=116;
    public static final int NULL=117;
    public static final int NUMBER=118;
    public static final int NUMBER_PREFIX=119;
    public static final int NUMBER_SUFFIX=120;
    public static final int NXLE_UINT16_T=121;
    public static final int NXLE_UINT32_T=122;
    public static final int NXLE_UINT64_T=123;
    public static final int NXLE_UINT8_T=124;
    public static final int NX_STRUCT=125;
    public static final int NX_UINT16_T=126;
    public static final int NX_UINT32_T=127;
    public static final int NX_UINT64_T=128;
    public static final int NX_UINT8_T=129;
    public static final int NX_UNION=130;
    public static final int OR=131;
    public static final int PARAMETER=132;
    public static final int PARAMETER_LIST=133;
    public static final int PLUS=134;
    public static final int PLUSASSIGN=135;
    public static final int PLUSPLUS=136;
    public static final int POINTER_QUALIFIER=137;
    public static final int POST=138;
    public static final int POSTFIX_EXPRESSION=139;
    public static final int POST_DECREMENT=140;
    public static final int POST_INCREMENT=141;
    public static final int PRE_DECREMENT=142;
    public static final int PRE_INCREMENT=143;
    public static final int PROVIDES=144;
    public static final int RAW_IDENTIFIER=145;
    public static final int RBRACE=146;
    public static final int RBRACKET=147;
    public static final int REGISTER=148;
    public static final int REMOTE=149;
    public static final int REQUIRES=150;
    public static final int RESTRICT=151;
    public static final int RETURN=152;
    public static final int RPARENS=153;
    public static final int RSHIFT=154;
    public static final int RSHIFTASSIGN=155;
    public static final int SHORT=156;
    public static final int SIGNAL=157;
    public static final int SIGNED=158;
    public static final int SIZEOF=159;
    public static final int SIZEOF_EXPRESSION=160;
    public static final int SIZEOF_TYPE=161;
    public static final int SPECIFICATION=162;
    public static final int STAR=163;
    public static final int STATEMENT=164;
    public static final int STATIC=165;
    public static final int STRING_LITERAL=166;
    public static final int STRUCT=167;
    public static final int SWITCH=168;
    public static final int TASK=169;
    public static final int TYPEDEF=170;
    public static final int UINT16_T=171;
    public static final int UINT32_T=172;
    public static final int UINT64_T=173;
    public static final int UINT8_T=174;
    public static final int UNARY_MINUS=175;
    public static final int UNARY_PLUS=176;
    public static final int UNION=177;
    public static final int UNSIGNED=178;
    public static final int USES=179;
    public static final int VOID=180;
    public static final int VOLATILE=181;
    public static final int WHILE=182;
    public static final int WHITESPACE=183;

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
        this.state.ruleMemo = new HashMap[351+1];
         

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


    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expression"
    // nesC.g:245:1: primary_expression : ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression );
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

            // nesC.g:246:5: ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression )
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
                    // nesC.g:246:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression2749);
                    identifier1=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier1.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:247:10: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT2=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_primary_expression2760); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT2_tree = 
                    (Object)adaptor.create(CONSTANT2)
                    ;
                    adaptor.addChild(root_0, CONSTANT2_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:248:10: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primary_expression2771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL3_tree = 
                    (Object)adaptor.create(STRING_LITERAL3)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL3_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:249:10: CHARACTER_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARACTER_LITERAL4=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_primary_expression2782); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARACTER_LITERAL4_tree = 
                    (Object)adaptor.create(CHARACTER_LITERAL4)
                    ;
                    adaptor.addChild(root_0, CHARACTER_LITERAL4_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:250:10: '(' expression ')'
                    {
                    char_literal5=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_primary_expression2793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_primary_expression2795);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

                    char_literal7=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_primary_expression2797); if (state.failed) return retval; 
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
                    // 250:29: -> expression
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
    // nesC.g:258:1: postfix_expression : ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) ;
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

            // nesC.g:259:5: ( ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) )
            // nesC.g:259:10: ( call_kind )? primary_expression ( postfix_expression_modifier )*
            {
            // nesC.g:259:10: ( call_kind )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CALL||LA2_0==POST||LA2_0==SIGNAL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // nesC.g:259:10: call_kind
                    {
                    pushFollow(FOLLOW_call_kind_in_postfix_expression2822);
                    call_kind8=call_kind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_call_kind.add(call_kind8.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_primary_expression_in_postfix_expression2825);
            primary_expression9=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression9.getTree());

            // nesC.g:259:40: ( postfix_expression_modifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARROW||LA3_0==DOT||LA3_0==LBRACKET||LA3_0==LPARENS||LA3_0==MINUSMINUS||LA3_0==PLUSPLUS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // nesC.g:259:40: postfix_expression_modifier
            	    {
            	    pushFollow(FOLLOW_postfix_expression_modifier_in_postfix_expression2827);
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
            // 260:13: -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
            {
                // nesC.g:260:16: ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION")
                , root_1);

                // nesC.g:260:37: ( call_kind )?
                if ( stream_call_kind.hasNext() ) {
                    adaptor.addChild(root_1, stream_call_kind.nextTree());

                }
                stream_call_kind.reset();

                adaptor.addChild(root_1, stream_primary_expression.nextTree());

                // nesC.g:260:67: ( postfix_expression_modifier )*
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
    // nesC.g:262:1: postfix_expression_modifier : ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' );
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

            // nesC.g:263:5: ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' )
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
                    // nesC.g:263:9: '[' expression ']'
                    {
                    char_literal11=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_postfix_expression_modifier2868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal11);


                    pushFollow(FOLLOW_expression_in_postfix_expression_modifier2870);
                    expression12=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression12.getTree());

                    char_literal13=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_postfix_expression_modifier2872); if (state.failed) return retval; 
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
                    // 263:28: -> ^( ARRAY_ELEMENT_SELECTION expression )
                    {
                        // nesC.g:263:31: ^( ARRAY_ELEMENT_SELECTION expression )
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
                    // nesC.g:264:9: '(' ( argument_expression_list )? ')'
                    {
                    char_literal14=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression_modifier2890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal14);


                    // nesC.g:264:13: ( argument_expression_list )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AMP||LA4_0==BITCOMPLEMENT||LA4_0==CALL||LA4_0==CHARACTER_LITERAL||LA4_0==CONSTANT||LA4_0==LPARENS||LA4_0==MINUS||LA4_0==MINUSMINUS||LA4_0==NOT||LA4_0==PLUS||LA4_0==PLUSPLUS||LA4_0==POST||LA4_0==RAW_IDENTIFIER||LA4_0==SIGNAL||LA4_0==SIZEOF||LA4_0==STAR||LA4_0==STRING_LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // nesC.g:264:13: argument_expression_list
                            {
                            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression_modifier2892);
                            argument_expression_list15=argument_expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list15.getTree());

                            }
                            break;

                    }


                    char_literal16=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression_modifier2895); if (state.failed) return retval; 
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
                    // 264:43: -> ^( ARGUMENT_LIST ( argument_expression_list )? )
                    {
                        // nesC.g:264:46: ^( ARGUMENT_LIST ( argument_expression_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST")
                        , root_1);

                        // nesC.g:264:62: ( argument_expression_list )?
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
                    // nesC.g:265:9: '.' identifier
                    {
                    char_literal17=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression_modifier2914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal17);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2916);
                    identifier18=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier18.getTree());

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
                    // 265:24: -> ^( '.' identifier )
                    {
                        // nesC.g:265:27: ^( '.' identifier )
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
                    // nesC.g:266:9: '->' identifier
                    {
                    string_literal19=(Token)match(input,ARROW,FOLLOW_ARROW_in_postfix_expression_modifier2934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal19);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2936);
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
                    // 266:25: -> ^( '->' identifier )
                    {
                        // nesC.g:266:28: ^( '->' identifier )
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
                    // nesC.g:267:9: '++'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal21=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfix_expression_modifier2954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = 
                    (Object)adaptor.create(string_literal21)
                    ;
                    adaptor.addChild(root_0, string_literal21_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:268:9: '--'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal22=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfix_expression_modifier2964); if (state.failed) return retval;
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
    // nesC.g:270:1: call_kind : ( CALL | POST | SIGNAL );
    public final nesCParser.call_kind_return call_kind() throws RecognitionException {
        nesCParser.call_kind_return retval = new nesCParser.call_kind_return();
        retval.start = input.LT(1);

        int call_kind_StartIndex = input.index();

        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // nesC.g:271:5: ( CALL | POST | SIGNAL )
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
    // nesC.g:275:1: argument_expression_list : assignment_expression ( ',' ! assignment_expression )* ;
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

            // nesC.g:276:5: ( assignment_expression ( ',' ! assignment_expression )* )
            // nesC.g:276:10: assignment_expression ( ',' ! assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3024);
            assignment_expression24=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression24.getTree());

            // nesC.g:276:32: ( ',' ! assignment_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // nesC.g:276:33: ',' ! assignment_expression
            	    {
            	    char_literal25=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list3027); if (state.failed) return retval;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3030);
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
    // nesC.g:278:1: unary_expression : ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression );
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

            // nesC.g:279:5: ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression )
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
                    // nesC.g:279:10: '++' unary_expression
                    {
                    string_literal27=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unary_expression3051); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(string_literal27);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3053);
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
                    // 279:32: -> ^( PRE_INCREMENT unary_expression )
                    {
                        // nesC.g:279:35: ^( PRE_INCREMENT unary_expression )
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
                    // nesC.g:280:10: '--' unary_expression
                    {
                    string_literal29=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unary_expression3072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUSMINUS.add(string_literal29);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3074);
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
                    // 280:32: -> ^( PRE_DECREMENT unary_expression )
                    {
                        // nesC.g:280:35: ^( PRE_DECREMENT unary_expression )
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
                    // nesC.g:281:10: '&' cast_expression
                    {
                    char_literal31=(Token)match(input,AMP,FOLLOW_AMP_in_unary_expression3093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMP.add(char_literal31);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3096);
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
                    // 281:32: -> ^( ADDRESS_OF cast_expression )
                    {
                        // nesC.g:281:35: ^( ADDRESS_OF cast_expression )
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
                    // nesC.g:282:10: '*' cast_expression
                    {
                    char_literal33=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression3120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal33);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3123);
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
                    // 282:32: -> ^( DEREFERENCE cast_expression )
                    {
                        // nesC.g:282:35: ^( DEREFERENCE cast_expression )
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
                    // nesC.g:283:10: '+' cast_expression
                    {
                    char_literal35=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression3146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal35);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3149);
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
                    // 283:32: -> ^( UNARY_PLUS cast_expression )
                    {
                        // nesC.g:283:35: ^( UNARY_PLUS cast_expression )
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
                    // nesC.g:284:10: '-' cast_expression
                    {
                    char_literal37=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression3173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal37);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3176);
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
                    // 284:32: -> ^( UNARY_MINUS cast_expression )
                    {
                        // nesC.g:284:35: ^( UNARY_MINUS cast_expression )
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
                    // nesC.g:285:10: ( '~' ^| '!' ^) cast_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:285:10: ( '~' ^| '!' ^)
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
                            // nesC.g:285:11: '~' ^
                            {
                            char_literal39=(Token)match(input,BITCOMPLEMENT,FOLLOW_BITCOMPLEMENT_in_unary_expression3200); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal39_tree = 
                            (Object)adaptor.create(char_literal39)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal39_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:285:18: '!' ^
                            {
                            char_literal40=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression3205); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal40_tree = 
                            (Object)adaptor.create(char_literal40)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal40_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3209);
                    cast_expression41=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression41.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:286:10: SIZEOF '(' type_name ')'
                    {
                    SIZEOF42=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF42);


                    char_literal43=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_unary_expression3222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal43);


                    pushFollow(FOLLOW_type_name_in_unary_expression3224);
                    type_name44=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name44.getTree());

                    char_literal45=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_unary_expression3226); if (state.failed) return retval; 
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
                    // 286:35: -> ^( SIZEOF_TYPE type_name )
                    {
                        // nesC.g:286:38: ^( SIZEOF_TYPE type_name )
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
                    // nesC.g:287:10: SIZEOF unary_expression
                    {
                    SIZEOF46=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF46);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3247);
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
                    // 287:35: -> ^( SIZEOF_EXPRESSION unary_expression )
                    {
                        // nesC.g:287:38: ^( SIZEOF_EXPRESSION unary_expression )
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
                    // nesC.g:288:10: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression3267);
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
    // nesC.g:294:1: cast_expression : ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression );
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

            // nesC.g:295:5: ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression )
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
                    // nesC.g:295:10: '(' type_name ')' cast_expression
                    {
                    char_literal49=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_cast_expression3290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal49);


                    pushFollow(FOLLOW_type_name_in_cast_expression3292);
                    type_name50=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name50.getTree());

                    char_literal51=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_cast_expression3294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal51);


                    pushFollow(FOLLOW_cast_expression_in_cast_expression3296);
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
                    // 295:44: -> ^( CAST cast_expression type_name )
                    {
                        // nesC.g:295:47: ^( CAST cast_expression type_name )
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
                    // nesC.g:296:10: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression3317);
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
    // nesC.g:298:1: multiplicative_expression : cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* ;
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

            // nesC.g:299:5: ( cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* )
            // nesC.g:299:10: cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3336);
            cast_expression54=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression54.getTree());

            // nesC.g:299:26: ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DIVIDE||LA11_0==MODULUS||LA11_0==STAR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // nesC.g:299:28: ( '*' ^| '/' ^| '%' ^) cast_expression
            	    {
            	    // nesC.g:299:28: ( '*' ^| '/' ^| '%' ^)
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
            	            // nesC.g:299:29: '*' ^
            	            {
            	            char_literal55=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression3341); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal55_tree = 
            	            (Object)adaptor.create(char_literal55)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal55_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:299:36: '/' ^
            	            {
            	            char_literal56=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expression3346); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal56_tree = 
            	            (Object)adaptor.create(char_literal56)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal56_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:299:43: '%' ^
            	            {
            	            char_literal57=(Token)match(input,MODULUS,FOLLOW_MODULUS_in_multiplicative_expression3351); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal57_tree = 
            	            (Object)adaptor.create(char_literal57)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal57_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3355);
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
    // nesC.g:301:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
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

            // nesC.g:302:5: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
            // nesC.g:302:10: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3376);
            multiplicative_expression59=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression59.getTree());

            // nesC.g:302:36: ( ( '+' ^| '-' ^) multiplicative_expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // nesC.g:302:38: ( '+' ^| '-' ^) multiplicative_expression
            	    {
            	    // nesC.g:302:38: ( '+' ^| '-' ^)
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
            	            // nesC.g:302:39: '+' ^
            	            {
            	            char_literal60=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression3381); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal60_tree = 
            	            (Object)adaptor.create(char_literal60)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:302:46: '-' ^
            	            {
            	            char_literal61=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression3386); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal61_tree = 
            	            (Object)adaptor.create(char_literal61)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal61_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3390);
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
    // nesC.g:304:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
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

            // nesC.g:305:5: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // nesC.g:305:10: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression3411);
            additive_expression63=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression63.getTree());

            // nesC.g:305:30: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LSHIFT||LA15_0==RSHIFT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // nesC.g:305:32: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // nesC.g:305:32: ( '<<' ^| '>>' ^)
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
            	            // nesC.g:305:33: '<<' ^
            	            {
            	            string_literal64=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression3416); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal64_tree = 
            	            (Object)adaptor.create(string_literal64)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:305:41: '>>' ^
            	            {
            	            string_literal65=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression3421); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal65_tree = 
            	            (Object)adaptor.create(string_literal65)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal65_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression3425);
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
    // nesC.g:307:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
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

            // nesC.g:308:5: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // nesC.g:308:10: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression3446);
            shift_expression67=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression67.getTree());

            // nesC.g:308:27: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= GREATER && LA17_0 <= GREATEREQUAL)||(LA17_0 >= LESS && LA17_0 <= LESSEQUAL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // nesC.g:308:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // nesC.g:308:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
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
            	            // nesC.g:308:30: '<' ^
            	            {
            	            char_literal68=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression3451); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal68_tree = 
            	            (Object)adaptor.create(char_literal68)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal68_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:308:37: '>' ^
            	            {
            	            char_literal69=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression3456); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal69_tree = 
            	            (Object)adaptor.create(char_literal69)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal69_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:308:44: '<=' ^
            	            {
            	            string_literal70=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relational_expression3461); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal70_tree = 
            	            (Object)adaptor.create(string_literal70)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal70_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // nesC.g:308:52: '>=' ^
            	            {
            	            string_literal71=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relational_expression3466); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal71_tree = 
            	            (Object)adaptor.create(string_literal71)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal71_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression3470);
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
    // nesC.g:310:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
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

            // nesC.g:311:5: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // nesC.g:311:10: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression3491);
            relational_expression73=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression73.getTree());

            // nesC.g:311:32: ( ( '==' ^| '!=' ^) relational_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EQUAL||LA19_0==NOTEQUAL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // nesC.g:311:34: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // nesC.g:311:34: ( '==' ^| '!=' ^)
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
            	            // nesC.g:311:35: '==' ^
            	            {
            	            string_literal74=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equality_expression3496); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal74_tree = 
            	            (Object)adaptor.create(string_literal74)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:311:43: '!=' ^
            	            {
            	            string_literal75=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equality_expression3501); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal75_tree = 
            	            (Object)adaptor.create(string_literal75)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal75_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression3505);
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
    // nesC.g:313:1: and_expression : equality_expression ( '&' ^ equality_expression )* ;
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

            // nesC.g:314:5: ( equality_expression ( '&' ^ equality_expression )* )
            // nesC.g:314:10: equality_expression ( '&' ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_and_expression3526);
            equality_expression77=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression77.getTree());

            // nesC.g:314:30: ( '&' ^ equality_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AMP) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // nesC.g:314:32: '&' ^ equality_expression
            	    {
            	    char_literal78=(Token)match(input,AMP,FOLLOW_AMP_in_and_expression3530); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal78_tree = 
            	    (Object)adaptor.create(char_literal78)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal78_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_and_expression3533);
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
    // nesC.g:316:1: xor_expression : and_expression ( '^' ^ and_expression )* ;
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

            // nesC.g:317:5: ( and_expression ( '^' ^ and_expression )* )
            // nesC.g:317:10: and_expression ( '^' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_xor_expression3554);
            and_expression80=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression80.getTree());

            // nesC.g:317:25: ( '^' ^ and_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==BITXOR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // nesC.g:317:27: '^' ^ and_expression
            	    {
            	    char_literal81=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_xor_expression3558); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal81_tree = 
            	    (Object)adaptor.create(char_literal81)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal81_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_xor_expression3561);
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
    // nesC.g:319:1: or_expression : xor_expression ( '|' ^ xor_expression )* ;
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

            // nesC.g:320:5: ( xor_expression ( '|' ^ xor_expression )* )
            // nesC.g:320:10: xor_expression ( '|' ^ xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expression_in_or_expression3582);
            xor_expression83=xor_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression83.getTree());

            // nesC.g:320:25: ( '|' ^ xor_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BITOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // nesC.g:320:27: '|' ^ xor_expression
            	    {
            	    char_literal84=(Token)match(input,BITOR,FOLLOW_BITOR_in_or_expression3586); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal84_tree = 
            	    (Object)adaptor.create(char_literal84)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal84_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_xor_expression_in_or_expression3589);
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
    // nesC.g:322:1: logical_and_expression : or_expression ( '&&' ^ or_expression )* ;
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

            // nesC.g:323:5: ( or_expression ( '&&' ^ or_expression )* )
            // nesC.g:323:10: or_expression ( '&&' ^ or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_expression_in_logical_and_expression3610);
            or_expression86=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression86.getTree());

            // nesC.g:323:24: ( '&&' ^ or_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // nesC.g:323:26: '&&' ^ or_expression
            	    {
            	    string_literal87=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression3614); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal87_tree = 
            	    (Object)adaptor.create(string_literal87)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal87_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression3617);
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
    // nesC.g:325:1: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
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

            // nesC.g:326:5: ( logical_and_expression ( '||' ^ logical_and_expression )* )
            // nesC.g:326:10: logical_and_expression ( '||' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3638);
            logical_and_expression89=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression89.getTree());

            // nesC.g:326:33: ( '||' ^ logical_and_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // nesC.g:326:35: '||' ^ logical_and_expression
            	    {
            	    string_literal90=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression3642); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal90_tree = 
            	    (Object)adaptor.create(string_literal90)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal90_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3645);
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
    // nesC.g:328:1: conditional_expression : logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? ;
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

            // nesC.g:329:5: ( logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? )
            // nesC.g:329:10: logical_or_expression ( '?' ^ expression ':' ! conditional_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression3666);
            logical_or_expression92=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression92.getTree());

            // nesC.g:329:32: ( '?' ^ expression ':' ! conditional_expression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==188) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // nesC.g:329:33: '?' ^ expression ':' ! conditional_expression
                    {
                    char_literal93=(Token)match(input,188,FOLLOW_188_in_conditional_expression3669); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal93_tree = 
                    (Object)adaptor.create(char_literal93)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal93_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_conditional_expression3672);
                    expression94=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression94.getTree());

                    char_literal95=(Token)match(input,185,FOLLOW_185_in_conditional_expression3674); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression3677);
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
    // nesC.g:331:1: assignment_expression : ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression );
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

            // nesC.g:332:5: ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression )
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
                    // nesC.g:332:10: unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_assignment_expression3698);
                    unary_expression97=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression97.getTree());

                    // nesC.g:332:27: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^)
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
                            // nesC.g:332:28: '=' ^
                            {
                            char_literal98=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expression3701); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal98_tree = 
                            (Object)adaptor.create(char_literal98)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal98_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:332:35: '*=' ^
                            {
                            string_literal99=(Token)match(input,MULASSIGN,FOLLOW_MULASSIGN_in_assignment_expression3706); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal99_tree = 
                            (Object)adaptor.create(string_literal99)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal99_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // nesC.g:332:43: '/=' ^
                            {
                            string_literal100=(Token)match(input,DIVASSIGN,FOLLOW_DIVASSIGN_in_assignment_expression3711); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal100_tree = 
                            (Object)adaptor.create(string_literal100)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal100_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // nesC.g:332:51: '%=' ^
                            {
                            string_literal101=(Token)match(input,MODASSIGN,FOLLOW_MODASSIGN_in_assignment_expression3716); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal101_tree = 
                            (Object)adaptor.create(string_literal101)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // nesC.g:332:59: '+=' ^
                            {
                            string_literal102=(Token)match(input,PLUSASSIGN,FOLLOW_PLUSASSIGN_in_assignment_expression3721); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal102_tree = 
                            (Object)adaptor.create(string_literal102)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal102_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // nesC.g:332:67: '-=' ^
                            {
                            string_literal103=(Token)match(input,MINUSASSIGN,FOLLOW_MINUSASSIGN_in_assignment_expression3726); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal103_tree = 
                            (Object)adaptor.create(string_literal103)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
                            }

                            }
                            break;
                        case 7 :
                            // nesC.g:332:75: '<<=' ^
                            {
                            string_literal104=(Token)match(input,LSHIFTASSIGN,FOLLOW_LSHIFTASSIGN_in_assignment_expression3731); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal104_tree = 
                            (Object)adaptor.create(string_literal104)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal104_tree, root_0);
                            }

                            }
                            break;
                        case 8 :
                            // nesC.g:332:84: '>>=' ^
                            {
                            string_literal105=(Token)match(input,RSHIFTASSIGN,FOLLOW_RSHIFTASSIGN_in_assignment_expression3736); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal105_tree = 
                            (Object)adaptor.create(string_literal105)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal105_tree, root_0);
                            }

                            }
                            break;
                        case 9 :
                            // nesC.g:332:93: '&=' ^
                            {
                            string_literal106=(Token)match(input,BITANDASSIGN,FOLLOW_BITANDASSIGN_in_assignment_expression3741); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal106_tree = 
                            (Object)adaptor.create(string_literal106)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                            }

                            }
                            break;
                        case 10 :
                            // nesC.g:332:101: '^=' ^
                            {
                            string_literal107=(Token)match(input,BITXORASSIGN,FOLLOW_BITXORASSIGN_in_assignment_expression3746); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal107_tree = 
                            (Object)adaptor.create(string_literal107)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal107_tree, root_0);
                            }

                            }
                            break;
                        case 11 :
                            // nesC.g:332:109: '|=' ^
                            {
                            string_literal108=(Token)match(input,BITORASSIGN,FOLLOW_BITORASSIGN_in_assignment_expression3751); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal108_tree = 
                            (Object)adaptor.create(string_literal108)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal108_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression3755);
                    assignment_expression109=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression109.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:333:10: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression3766);
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
    // nesC.g:335:1: expression : assignment_expression ( ',' ^ assignment_expression )* ;
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

            // nesC.g:336:5: ( assignment_expression ( ',' ^ assignment_expression )* )
            // nesC.g:336:10: assignment_expression ( ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression3785);
            assignment_expression111=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression111.getTree());

            // nesC.g:336:32: ( ',' ^ assignment_expression )*
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
            	    // nesC.g:336:33: ',' ^ assignment_expression
            	    {
            	    char_literal112=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression3788); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal112_tree = 
            	    (Object)adaptor.create(char_literal112)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal112_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression3791);
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
    // nesC.g:338:1: constant_expression : conditional_expression ;
    public final nesCParser.constant_expression_return constant_expression() throws RecognitionException {
        nesCParser.constant_expression_return retval = new nesCParser.constant_expression_return();
        retval.start = input.LT(1);

        int constant_expression_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.conditional_expression_return conditional_expression114 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // nesC.g:339:5: ( conditional_expression )
            // nesC.g:339:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression3812);
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
    // nesC.g:358:1: declaration : ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) );
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
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        RewriteRuleSubtreeStream stream_gcc_attributes=new RewriteRuleSubtreeStream(adaptor,"rule gcc_attributes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // nesC.g:361:5: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) )
            int alt33=3;
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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
            case DEFAULT:
                {
                int LA33_33 = input.LA(2);

                if ( (synpred60_nesC()) ) {
                    alt33=1;
                }
                else if ( (synpred61_nesC()) ) {
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
            case TYPEDEF:
                {
                alt33=3;
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
                    // nesC.g:361:10: declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3876);
                    declaration_specifiers115=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers115.getTree());

                    // nesC.g:365:33: ( gcc_attributes )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==GCCATTRIBUTE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // nesC.g:365:33: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration3878);
                            gcc_attributes116=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes116.getTree());

                            }
                            break;

                    }


                    // nesC.g:365:49: ( init_declarator_list )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPARENS||LA30_0==RAW_IDENTIFIER||LA30_0==STAR) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // nesC.g:365:49: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration3881);
                            init_declarator_list117=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list117.getTree());

                            }
                            break;

                    }


                    char_literal118=(Token)match(input,186,FOLLOW_186_in_declaration3884); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal118);


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
                    // 372:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // nesC.g:372:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:372:54: ( init_declarator_list )?
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
                    // nesC.g:374:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration3946);
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
                    // 377:30: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // nesC.g:377:33: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // nesC.g:377:47: ^( FUNCTION_DEFINITION function_definition )
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
                    // nesC.g:380:10: TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF120=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration3991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF120);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3993);
                    declaration_specifiers121=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers121.getTree());

                    // nesC.g:383:41: ( gcc_attributes )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==GCCATTRIBUTE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // nesC.g:383:41: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration3995);
                            gcc_attributes122=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes122.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_init_declarator_list_in_declaration3998);
                    init_declarator_list123=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list123.getTree());

                    // nesC.g:383:78: ( gcc_attributes )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==GCCATTRIBUTE) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // nesC.g:383:78: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4000);
                            gcc_attributes124=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes124.getTree());

                            }
                            break;

                    }


                    char_literal125=(Token)match(input,186,FOLLOW_186_in_declaration4003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal125);


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
                    // 390:14: -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                    {
                        // nesC.g:390:17: ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
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
    // nesC.g:392:1: declaration_specifiers : ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+ ;
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

            // nesC.g:393:5: ( ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+ )
            // nesC.g:393:10: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:393:10: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+
            int cnt34=0;
            loop34:
            do {
                int alt34=6;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA34_2 = input.LA(2);

                    if ( (synpred65_nesC()) ) {
                        alt34=2;
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
                    alt34=1;
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
                    alt34=2;
                    }
                    break;
                case CONST:
                case RESTRICT:
                case VOLATILE:
                    {
                    alt34=3;
                    }
                    break;
                case INLINE:
                    {
                    alt34=4;
                    }
                    break;
                case DEFAULT:
                    {
                    alt34=5;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // nesC.g:393:11: storage_class_specifier
            	    {
            	    pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers4063);
            	    storage_class_specifier126=storage_class_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier126.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:394:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_declaration_specifiers4077);
            	    type_specifier127=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier127.getTree());

            	    }
            	    break;
            	case 3 :
            	    // nesC.g:395:11: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers4100);
            	    type_qualifier128=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier128.getTree());

            	    }
            	    break;
            	case 4 :
            	    // nesC.g:396:11: function_specifier
            	    {
            	    pushFollow(FOLLOW_function_specifier_in_declaration_specifiers4123);
            	    function_specifier129=function_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_specifier129.getTree());

            	    }
            	    break;
            	case 5 :
            	    // nesC.g:397:11: DEFAULT
            	    {
            	    DEFAULT130=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_declaration_specifiers4142); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DEFAULT130_tree = 
            	    (Object)adaptor.create(DEFAULT130)
            	    ;
            	    adaptor.addChild(root_0, DEFAULT130_tree);
            	    }

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
    // nesC.g:403:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
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

            // nesC.g:404:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // nesC.g:404:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list4165);
            init_declarator131=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator131.getTree());

            // nesC.g:404:26: ( ',' init_declarator )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // nesC.g:404:27: ',' init_declarator
            	    {
            	    char_literal132=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list4168); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal132);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list4170);
            	    init_declarator133=init_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator133.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
            // 404:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // nesC.g:404:52: ^( DECLARATOR_LIST ( init_declarator )+ )
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
    // nesC.g:410:1: init_declarator : declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
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

            // nesC.g:411:5: ( declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // nesC.g:411:10: declarator ( attributes )? ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator4204);
            declarator134=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator134.getTree());

            // nesC.g:411:21: ( attributes )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ATTRIBUTE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // nesC.g:411:21: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_init_declarator4206);
                    attributes135=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes135.getTree());

                    }
                    break;

            }


            // nesC.g:411:33: ( '=' initializer )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ASSIGN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // nesC.g:411:34: '=' initializer
                    {
                    char_literal136=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator4210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal136);


                    pushFollow(FOLLOW_initializer_in_init_declarator4212);
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
            // 411:52: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // nesC.g:411:55: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // nesC.g:411:84: ( initializer )?
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
    // nesC.g:413:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK );
    public final nesCParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        nesCParser.storage_class_specifier_return retval = new nesCParser.storage_class_specifier_return();
        retval.start = input.LT(1);

        int storage_class_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token set138=null;

        Object set138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // nesC.g:414:5: ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK )
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
    // nesC.g:425:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | struct_or_union_specifier | enum_specifier | typedef_name );
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

            // nesC.g:426:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | struct_or_union_specifier | enum_specifier | typedef_name )
            int alt38=28;
            switch ( input.LA(1) ) {
            case VOID:
                {
                alt38=1;
                }
                break;
            case CHAR:
                {
                alt38=2;
                }
                break;
            case SHORT:
                {
                alt38=3;
                }
                break;
            case INT:
                {
                alt38=4;
                }
                break;
            case LONG:
                {
                alt38=5;
                }
                break;
            case SIGNED:
                {
                alt38=6;
                }
                break;
            case UNSIGNED:
                {
                alt38=7;
                }
                break;
            case FLOAT:
                {
                alt38=8;
                }
                break;
            case DOUBLE:
                {
                alt38=9;
                }
                break;
            case INT8_T:
                {
                alt38=10;
                }
                break;
            case INT16_T:
                {
                alt38=11;
                }
                break;
            case INT32_T:
                {
                alt38=12;
                }
                break;
            case INT64_T:
                {
                alt38=13;
                }
                break;
            case UINT8_T:
                {
                alt38=14;
                }
                break;
            case UINT16_T:
                {
                alt38=15;
                }
                break;
            case UINT32_T:
                {
                alt38=16;
                }
                break;
            case UINT64_T:
                {
                alt38=17;
                }
                break;
            case NX_UINT8_T:
                {
                alt38=18;
                }
                break;
            case NX_UINT16_T:
                {
                alt38=19;
                }
                break;
            case NX_UINT32_T:
                {
                alt38=20;
                }
                break;
            case NX_UINT64_T:
                {
                alt38=21;
                }
                break;
            case NXLE_UINT8_T:
                {
                alt38=22;
                }
                break;
            case NXLE_UINT16_T:
                {
                alt38=23;
                }
                break;
            case NXLE_UINT32_T:
                {
                alt38=24;
                }
                break;
            case NXLE_UINT64_T:
                {
                alt38=25;
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case STRUCT:
            case UNION:
                {
                alt38=26;
                }
                break;
            case ENUM:
                {
                alt38=27;
                }
                break;
            case RAW_IDENTIFIER:
                {
                alt38=28;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // nesC.g:426:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID139=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier4361); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID139_tree = 
                    (Object)adaptor.create(VOID139)
                    ;
                    adaptor.addChild(root_0, VOID139_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:427:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR140=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier4371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR140_tree = 
                    (Object)adaptor.create(CHAR140)
                    ;
                    adaptor.addChild(root_0, CHAR140_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:428:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT141=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier4381); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT141_tree = 
                    (Object)adaptor.create(SHORT141)
                    ;
                    adaptor.addChild(root_0, SHORT141_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:429:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT142=(Token)match(input,INT,FOLLOW_INT_in_type_specifier4391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT142_tree = 
                    (Object)adaptor.create(INT142)
                    ;
                    adaptor.addChild(root_0, INT142_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:430:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG143=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier4401); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG143_tree = 
                    (Object)adaptor.create(LONG143)
                    ;
                    adaptor.addChild(root_0, LONG143_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:431:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED144=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier4411); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED144_tree = 
                    (Object)adaptor.create(SIGNED144)
                    ;
                    adaptor.addChild(root_0, SIGNED144_tree);
                    }

                    }
                    break;
                case 7 :
                    // nesC.g:432:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED145=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier4421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED145_tree = 
                    (Object)adaptor.create(UNSIGNED145)
                    ;
                    adaptor.addChild(root_0, UNSIGNED145_tree);
                    }

                    }
                    break;
                case 8 :
                    // nesC.g:433:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT146=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier4431); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT146_tree = 
                    (Object)adaptor.create(FLOAT146)
                    ;
                    adaptor.addChild(root_0, FLOAT146_tree);
                    }

                    }
                    break;
                case 9 :
                    // nesC.g:434:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLE147=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_type_specifier4441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE147_tree = 
                    (Object)adaptor.create(DOUBLE147)
                    ;
                    adaptor.addChild(root_0, DOUBLE147_tree);
                    }

                    }
                    break;
                case 10 :
                    // nesC.g:435:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T148=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier4451); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T148_tree = 
                    (Object)adaptor.create(INT8_T148)
                    ;
                    adaptor.addChild(root_0, INT8_T148_tree);
                    }

                    }
                    break;
                case 11 :
                    // nesC.g:436:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T149=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier4473); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T149_tree = 
                    (Object)adaptor.create(INT16_T149)
                    ;
                    adaptor.addChild(root_0, INT16_T149_tree);
                    }

                    }
                    break;
                case 12 :
                    // nesC.g:437:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T150=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier4494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T150_tree = 
                    (Object)adaptor.create(INT32_T150)
                    ;
                    adaptor.addChild(root_0, INT32_T150_tree);
                    }

                    }
                    break;
                case 13 :
                    // nesC.g:438:9: INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT64_T151=(Token)match(input,INT64_T,FOLLOW_INT64_T_in_type_specifier4515); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT64_T151_tree = 
                    (Object)adaptor.create(INT64_T151)
                    ;
                    adaptor.addChild(root_0, INT64_T151_tree);
                    }

                    }
                    break;
                case 14 :
                    // nesC.g:439:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T152=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier4536); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T152_tree = 
                    (Object)adaptor.create(UINT8_T152)
                    ;
                    adaptor.addChild(root_0, UINT8_T152_tree);
                    }

                    }
                    break;
                case 15 :
                    // nesC.g:440:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T153=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier4557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T153_tree = 
                    (Object)adaptor.create(UINT16_T153)
                    ;
                    adaptor.addChild(root_0, UINT16_T153_tree);
                    }

                    }
                    break;
                case 16 :
                    // nesC.g:441:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T154=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier4577); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T154_tree = 
                    (Object)adaptor.create(UINT32_T154)
                    ;
                    adaptor.addChild(root_0, UINT32_T154_tree);
                    }

                    }
                    break;
                case 17 :
                    // nesC.g:442:9: UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT64_T155=(Token)match(input,UINT64_T,FOLLOW_UINT64_T_in_type_specifier4597); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT64_T155_tree = 
                    (Object)adaptor.create(UINT64_T155)
                    ;
                    adaptor.addChild(root_0, UINT64_T155_tree);
                    }

                    }
                    break;
                case 18 :
                    // nesC.g:443:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T156=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier4617); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T156_tree = 
                    (Object)adaptor.create(NX_UINT8_T156)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T156_tree);
                    }

                    }
                    break;
                case 19 :
                    // nesC.g:444:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T157=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier4635); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T157_tree = 
                    (Object)adaptor.create(NX_UINT16_T157)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T157_tree);
                    }

                    }
                    break;
                case 20 :
                    // nesC.g:445:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T158=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier4652); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T158_tree = 
                    (Object)adaptor.create(NX_UINT32_T158)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T158_tree);
                    }

                    }
                    break;
                case 21 :
                    // nesC.g:446:9: NX_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT64_T159=(Token)match(input,NX_UINT64_T,FOLLOW_NX_UINT64_T_in_type_specifier4669); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT64_T159_tree = 
                    (Object)adaptor.create(NX_UINT64_T159)
                    ;
                    adaptor.addChild(root_0, NX_UINT64_T159_tree);
                    }

                    }
                    break;
                case 22 :
                    // nesC.g:447:9: NXLE_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT8_T160=(Token)match(input,NXLE_UINT8_T,FOLLOW_NXLE_UINT8_T_in_type_specifier4686); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT8_T160_tree = 
                    (Object)adaptor.create(NXLE_UINT8_T160)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT8_T160_tree);
                    }

                    }
                    break;
                case 23 :
                    // nesC.g:448:9: NXLE_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT16_T161=(Token)match(input,NXLE_UINT16_T,FOLLOW_NXLE_UINT16_T_in_type_specifier4702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT16_T161_tree = 
                    (Object)adaptor.create(NXLE_UINT16_T161)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT16_T161_tree);
                    }

                    }
                    break;
                case 24 :
                    // nesC.g:449:9: NXLE_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT32_T162=(Token)match(input,NXLE_UINT32_T,FOLLOW_NXLE_UINT32_T_in_type_specifier4717); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT32_T162_tree = 
                    (Object)adaptor.create(NXLE_UINT32_T162)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT32_T162_tree);
                    }

                    }
                    break;
                case 25 :
                    // nesC.g:450:9: NXLE_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT64_T163=(Token)match(input,NXLE_UINT64_T,FOLLOW_NXLE_UINT64_T_in_type_specifier4732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT64_T163_tree = 
                    (Object)adaptor.create(NXLE_UINT64_T163)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT64_T163_tree);
                    }

                    }
                    break;
                case 26 :
                    // nesC.g:451:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier4747);
                    struct_or_union_specifier164=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier164.getTree());

                    }
                    break;
                case 27 :
                    // nesC.g:452:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier4757);
                    enum_specifier165=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier165.getTree());

                    }
                    break;
                case 28 :
                    // nesC.g:453:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier4767);
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
    // nesC.g:455:1: struct_or_union_specifier : ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) | STRUCT '@' identifier '{' struct_declaration_list '}' -> ^( STRUCT identifier struct_declaration_list ) | struct_or_union identifier attributes '{' struct_declaration_list '}' -> ^( struct_or_union identifier struct_declaration_list ) );
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

            // nesC.g:456:5: ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) | STRUCT '@' identifier '{' struct_declaration_list '}' -> ^( STRUCT identifier struct_declaration_list ) | struct_or_union identifier attributes '{' struct_declaration_list '}' -> ^( struct_or_union identifier struct_declaration_list ) )
            int alt40=4;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==STRUCT) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred109_nesC()) ) {
                    alt40=1;
                }
                else if ( (synpred110_nesC()) ) {
                    alt40=2;
                }
                else if ( (synpred111_nesC()) ) {
                    alt40=3;
                }
                else if ( (true) ) {
                    alt40=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA40_0==NX_STRUCT||LA40_0==NX_UNION||LA40_0==UNION) ) {
                int LA40_2 = input.LA(2);

                if ( (synpred109_nesC()) ) {
                    alt40=1;
                }
                else if ( (synpred110_nesC()) ) {
                    alt40=2;
                }
                else if ( (true) ) {
                    alt40=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // nesC.g:456:10: struct_or_union ( identifier )? '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4782);
                    struct_or_union167=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union167.getTree());

                    // nesC.g:456:26: ( identifier )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RAW_IDENTIFIER) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // nesC.g:456:26: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4784);
                            identifier168=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier168.getTree());

                            }
                            break;

                    }


                    char_literal169=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal169);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4789);
                    struct_declaration_list170=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list170.getTree());

                    char_literal171=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal171);


                    // AST REWRITE
                    // elements: struct_or_union, identifier, struct_declaration_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 457:13: -> ^( struct_or_union ( identifier )? struct_declaration_list )
                    {
                        // nesC.g:457:16: ^( struct_or_union ( identifier )? struct_declaration_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        // nesC.g:457:34: ( identifier )?
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
                    // nesC.g:458:10: struct_or_union identifier
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4825);
                    struct_or_union172=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union172.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4827);
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
                    // 459:13: -> ^( struct_or_union identifier )
                    {
                        // nesC.g:459:16: ^( struct_or_union identifier )
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
                    // nesC.g:460:10: STRUCT '@' identifier '{' struct_declaration_list '}'
                    {
                    STRUCT174=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_struct_or_union_specifier4858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRUCT.add(STRUCT174);


                    char_literal175=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_struct_or_union_specifier4860); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATTRIBUTE.add(char_literal175);


                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4862);
                    identifier176=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier176.getTree());

                    char_literal177=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal177);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4866);
                    struct_declaration_list178=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list178.getTree());

                    char_literal179=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal179);


                    // AST REWRITE
                    // elements: STRUCT, identifier, struct_declaration_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 461:13: -> ^( STRUCT identifier struct_declaration_list )
                    {
                        // nesC.g:461:16: ^( STRUCT identifier struct_declaration_list )
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
                    // nesC.g:462:10: struct_or_union identifier attributes '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4901);
                    struct_or_union180=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union180.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4903);
                    identifier181=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier181.getTree());

                    pushFollow(FOLLOW_attributes_in_struct_or_union_specifier4905);
                    attributes182=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes182.getTree());

                    char_literal183=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal183);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4909);
                    struct_declaration_list184=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list184.getTree());

                    char_literal185=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal185);


                    // AST REWRITE
                    // elements: identifier, struct_declaration_list, struct_or_union
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 463:13: -> ^( struct_or_union identifier struct_declaration_list )
                    {
                        // nesC.g:463:16: ^( struct_or_union identifier struct_declaration_list )
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
    // nesC.g:465:1: struct_or_union : ( STRUCT | UNION | NX_STRUCT | NX_UNION );
    public final nesCParser.struct_or_union_return struct_or_union() throws RecognitionException {
        nesCParser.struct_or_union_return retval = new nesCParser.struct_or_union_return();
        retval.start = input.LT(1);

        int struct_or_union_StartIndex = input.index();

        Object root_0 = null;

        Token set186=null;

        Object set186_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // nesC.g:466:5: ( STRUCT | UNION | NX_STRUCT | NX_UNION )
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
    // nesC.g:471:1: struct_declaration_list : ( struct_declaration )+ ;
    public final nesCParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        nesCParser.struct_declaration_list_return retval = new nesCParser.struct_declaration_list_return();
        retval.start = input.LT(1);

        int struct_declaration_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.struct_declaration_return struct_declaration187 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // nesC.g:472:5: ( ( struct_declaration )+ )
            // nesC.g:472:10: ( struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // nesC.g:473:10: ( struct_declaration )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==CHAR||LA41_0==CONST||LA41_0==DOUBLE||LA41_0==ENUM||LA41_0==FLOAT||(LA41_0 >= INT && LA41_0 <= INT8_T)||LA41_0==LONG||(LA41_0 >= NXLE_UINT16_T && LA41_0 <= NX_UNION)||LA41_0==RAW_IDENTIFIER||LA41_0==RESTRICT||LA41_0==SHORT||LA41_0==SIGNED||LA41_0==STRUCT||(LA41_0 >= UINT16_T && LA41_0 <= UINT8_T)||(LA41_0 >= UNION && LA41_0 <= UNSIGNED)||(LA41_0 >= VOID && LA41_0 <= VOLATILE)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // nesC.g:473:10: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list4993);
            	    struct_declaration187=struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_declaration187.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
    // nesC.g:476:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final nesCParser.struct_declaration_return struct_declaration() throws RecognitionException {
        nesCParser.struct_declaration_return retval = new nesCParser.struct_declaration_return();
        retval.start = input.LT(1);

        int struct_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal190=null;
        nesCParser.specifier_qualifier_list_return specifier_qualifier_list188 =null;

        nesCParser.struct_declarator_list_return struct_declarator_list189 =null;


        Object char_literal190_tree=null;
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // nesC.g:477:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // nesC.g:477:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration5024);
            specifier_qualifier_list188=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list188.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration5026);
            struct_declarator_list189=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list189.getTree());

            char_literal190=(Token)match(input,186,FOLLOW_186_in_struct_declaration5028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_186.add(char_literal190);


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
            // 478:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // nesC.g:478:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
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
    // nesC.g:485:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final nesCParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        nesCParser.specifier_qualifier_list_return retval = new nesCParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);

        int specifier_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.type_specifier_return type_specifier191 =null;

        nesCParser.type_qualifier_return type_qualifier192 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // nesC.g:486:5: ( ( type_specifier | type_qualifier )+ )
            // nesC.g:486:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:486:10: ( type_specifier | type_qualifier )+
            int cnt42=0;
            loop42:
            do {
                int alt42=3;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA42_2 = input.LA(2);

                    if ( (synpred116_nesC()) ) {
                        alt42=1;
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
                    alt42=1;
                    }
                    break;
                case CONST:
                case RESTRICT:
                case VOLATILE:
                    {
                    alt42=2;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // nesC.g:486:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list5075);
            	    type_specifier191=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier191.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:486:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list5079);
            	    type_qualifier192=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier192.getTree());

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


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // nesC.g:493:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
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

            // nesC.g:494:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // nesC.g:494:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5105);
            struct_declarator193=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator193.getTree());

            // nesC.g:494:28: ( ',' struct_declarator )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // nesC.g:494:29: ',' struct_declarator
            	    {
            	    char_literal194=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list5108); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal194);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5110);
            	    struct_declarator195=struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator195.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
            // 494:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // nesC.g:494:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
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
    // nesC.g:496:1: struct_declarator : ( ( declarator )? ':' constant_expression | declarator );
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

            // nesC.g:497:5: ( ( declarator )? ':' constant_expression | declarator )
            int alt45=2;
            switch ( input.LA(1) ) {
            case STAR:
                {
                int LA45_1 = input.LA(2);

                if ( (synpred120_nesC()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA45_2 = input.LA(2);

                if ( (synpred120_nesC()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;

                }
                }
                break;
            case LPARENS:
                {
                int LA45_3 = input.LA(2);

                if ( (synpred120_nesC()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;

                }
                }
                break;
            case 185:
                {
                alt45=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // nesC.g:497:10: ( declarator )? ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:497:10: ( declarator )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==LPARENS||LA44_0==RAW_IDENTIFIER||LA44_0==STAR) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // nesC.g:497:10: declarator
                            {
                            pushFollow(FOLLOW_declarator_in_struct_declarator5140);
                            declarator196=declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator196.getTree());

                            }
                            break;

                    }


                    char_literal197=(Token)match(input,185,FOLLOW_185_in_struct_declarator5143); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal197_tree = 
                    (Object)adaptor.create(char_literal197)
                    ;
                    adaptor.addChild(root_0, char_literal197_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator5145);
                    constant_expression198=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression198.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:498:10: declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator5156);
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
    // nesC.g:500:1: enum_specifier : ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier attributes '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier attributes enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) );
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

            // nesC.g:501:5: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier attributes '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier attributes enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ENUM) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred123_nesC()) ) {
                    alt49=1;
                }
                else if ( (synpred125_nesC()) ) {
                    alt49=2;
                }
                else if ( (true) ) {
                    alt49=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // nesC.g:501:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM200=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM200);


                    // nesC.g:501:15: ( identifier )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RAW_IDENTIFIER) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // nesC.g:501:15: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_enum_specifier5177);
                            identifier201=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier201.getTree());

                            }
                            break;

                    }


                    char_literal202=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal202);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5182);
                    enumerator_list203=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list203.getTree());

                    // nesC.g:501:47: ( ',' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==COMMA) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // nesC.g:501:47: ','
                            {
                            char_literal204=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5184); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal204);


                            }
                            break;

                    }


                    char_literal205=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal205);


                    // AST REWRITE
                    // elements: enumerator_list, ENUM, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 502:14: -> ^( ENUM ( identifier )? enumerator_list )
                    {
                        // nesC.g:502:17: ^( ENUM ( identifier )? enumerator_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        // nesC.g:502:24: ( identifier )?
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
                    // nesC.g:503:10: ENUM identifier attributes '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM206=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM206);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5224);
                    identifier207=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier207.getTree());

                    pushFollow(FOLLOW_attributes_in_enum_specifier5226);
                    attributes208=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes208.getTree());

                    char_literal209=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal209);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5230);
                    enumerator_list210=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list210.getTree());

                    // nesC.g:503:57: ( ',' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==COMMA) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // nesC.g:503:57: ','
                            {
                            char_literal211=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5232); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal211);


                            }
                            break;

                    }


                    char_literal212=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal212);


                    // AST REWRITE
                    // elements: attributes, identifier, enumerator_list, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 504:14: -> ^( ENUM identifier attributes enumerator_list )
                    {
                        // nesC.g:504:17: ^( ENUM identifier attributes enumerator_list )
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
                    // nesC.g:505:10: ENUM identifier
                    {
                    ENUM213=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5271); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM213);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5273);
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
                    // 506:14: -> ^( ENUM identifier )
                    {
                        // nesC.g:506:17: ^( ENUM identifier )
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
    // nesC.g:508:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
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

            // nesC.g:509:5: ( enumerator ( ',' ! enumerator )* )
            // nesC.g:509:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list5313);
            enumerator215=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator215.getTree());

            // nesC.g:509:21: ( ',' ! enumerator )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    int LA50_1 = input.LA(2);

                    if ( (LA50_1==RAW_IDENTIFIER) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // nesC.g:509:22: ',' ! enumerator
            	    {
            	    char_literal216=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list5316); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list5319);
            	    enumerator217=enumerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator217.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // nesC.g:515:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
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

            // nesC.g:516:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // nesC.g:516:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator5344);
            identifier218=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier218.getTree());

            // nesC.g:516:21: ( '=' constant_expression )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ASSIGN) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // nesC.g:516:22: '=' constant_expression
                    {
                    char_literal219=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator5347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal219);


                    pushFollow(FOLLOW_constant_expression_in_enumerator5349);
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
            // 516:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // nesC.g:516:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:516:75: ( constant_expression )?
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
    // nesC.g:517:1: type_qualifier : ( CONST | RESTRICT | VOLATILE );
    public final nesCParser.type_qualifier_return type_qualifier() throws RecognitionException {
        nesCParser.type_qualifier_return retval = new nesCParser.type_qualifier_return();
        retval.start = input.LT(1);

        int type_qualifier_StartIndex = input.index();

        Object root_0 = null;

        Token set221=null;

        Object set221_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // nesC.g:518:5: ( CONST | RESTRICT | VOLATILE )
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
    // nesC.g:522:1: function_specifier : INLINE ;
    public final nesCParser.function_specifier_return function_specifier() throws RecognitionException {
        nesCParser.function_specifier_return retval = new nesCParser.function_specifier_return();
        retval.start = input.LT(1);

        int function_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token INLINE222=null;

        Object INLINE222_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // nesC.g:523:5: ( INLINE )
            // nesC.g:523:10: INLINE
            {
            root_0 = (Object)adaptor.nil();


            INLINE222=(Token)match(input,INLINE,FOLLOW_INLINE_in_function_specifier5421); if (state.failed) return retval;
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
    // nesC.g:525:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
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

            // nesC.g:526:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // nesC.g:526:10: ( pointer )? direct_declarator
            {
            // nesC.g:526:10: ( pointer )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==STAR) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // nesC.g:526:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator5436);
                    pointer223=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer223.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator5439);
            direct_declarator224=direct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_direct_declarator.add(direct_declarator224.getTree());

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
            // 526:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // nesC.g:526:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // nesC.g:526:53: ( pointer )?
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
    // nesC.g:528:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final nesCParser.direct_declarator_return direct_declarator() throws RecognitionException {
        nesCParser.direct_declarator_return retval = new nesCParser.direct_declarator_return();
        retval.start = input.LT(1);

        int direct_declarator_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.direct_declarator_identifier_return direct_declarator_identifier225 =null;

        nesCParser.direct_declarator_modifier_return direct_declarator_modifier226 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // nesC.g:529:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // nesC.g:529:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator5464);
            direct_declarator_identifier225=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier225.getTree());

            // nesC.g:529:38: ( direct_declarator_modifier )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==LBRACKET||LA53_0==LPARENS) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // nesC.g:529:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator5466);
            	    direct_declarator_modifier226=direct_declarator_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_modifier226.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // nesC.g:540:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
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

            // nesC.g:541:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RAW_IDENTIFIER) ) {
                alt55=1;
            }
            else if ( (LA55_0==LPARENS) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // nesC.g:541:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5492);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // nesC.g:541:29: ( '.' identifier )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==DOT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // nesC.g:541:30: '.' identifier
                            {
                            char_literal227=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier5495); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal227);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5497);
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
                    // 545:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:545:18: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:546:9: '(' declarator ')'
                    {
                    char_literal229=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier5532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal229);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier5534);
                    declarator230=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator230.getTree());

                    char_literal231=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier5536); if (state.failed) return retval; 
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
                    // 546:28: -> declarator
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
    // nesC.g:552:1: direct_declarator_modifier : ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
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
        nesCParser.parameter_type_list_return gen =null;

        nesCParser.parameter_type_list_return normal =null;

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
        RewriteRuleSubtreeStream stream_parameter_type_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_type_list");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // nesC.g:553:5: ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LBRACKET) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred135_nesC()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA58_0==LPARENS) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }
            switch (alt58) {
                case 1 :
                    // nesC.g:553:9: '[' ( constant_expression )? ']'
                    {
                    char_literal232=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal232);


                    // nesC.g:553:13: ( constant_expression )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==AMP||LA56_0==BITCOMPLEMENT||LA56_0==CALL||LA56_0==CHARACTER_LITERAL||LA56_0==CONSTANT||LA56_0==LPARENS||LA56_0==MINUS||LA56_0==MINUSMINUS||LA56_0==NOT||LA56_0==PLUS||LA56_0==PLUSPLUS||LA56_0==POST||LA56_0==RAW_IDENTIFIER||LA56_0==SIGNAL||LA56_0==SIZEOF||LA56_0==STAR||LA56_0==STRING_LITERAL) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // nesC.g:553:13: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier5560);
                            constant_expression233=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression233.getTree());

                            }
                            break;

                    }


                    char_literal234=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5563); if (state.failed) return retval; 
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
                    // 554:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // nesC.g:554:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // nesC.g:554:44: ( constant_expression )?
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
                    // nesC.g:555:9: ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')'
                    {
                    // nesC.g:555:9: ( '[' gen= parameter_type_list ']' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==LBRACKET) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // nesC.g:555:10: '[' gen= parameter_type_list ']'
                            {
                            char_literal235=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5595); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal235);


                            pushFollow(FOLLOW_parameter_type_list_in_direct_declarator_modifier5599);
                            gen=parameter_type_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_type_list.add(gen.getTree());

                            char_literal236=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5601); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal236);


                            }
                            break;

                    }


                    char_literal237=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier5605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal237);


                    pushFollow(FOLLOW_parameter_type_list_in_direct_declarator_modifier5609);
                    normal=parameter_type_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_type_list.add(normal.getTree());

                    char_literal238=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier5611); if (state.failed) return retval; 
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
                    // 556:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // nesC.g:556:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
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
    // nesC.g:562:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
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

            // nesC.g:563:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // nesC.g:563:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal239=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal239);


                    // nesC.g:563:14: ( type_qualifier_list )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==CONST||LA59_0==RESTRICT||LA59_0==VOLATILE) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // nesC.g:563:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5653);
                            type_qualifier_list240=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list240.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer5656);
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
                    // 563:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // nesC.g:563:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:563:66: ( type_qualifier_list )?
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
                    // nesC.g:564:10: '*' ( type_qualifier_list )?
                    {
                    char_literal242=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5678); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal242);


                    // nesC.g:564:14: ( type_qualifier_list )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==CONST||LA60_0==RESTRICT||LA60_0==VOLATILE) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // nesC.g:564:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5680);
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
                    // 564:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // nesC.g:564:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:564:58: ( type_qualifier_list )?
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
    // nesC.g:566:1: type_qualifier_list : ( type_qualifier )+ ;
    public final nesCParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        nesCParser.type_qualifier_list_return retval = new nesCParser.type_qualifier_list_return();
        retval.start = input.LT(1);

        int type_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.type_qualifier_return type_qualifier244 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // nesC.g:567:5: ( ( type_qualifier )+ )
            // nesC.g:567:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:567:10: ( type_qualifier )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==CONST||LA62_0==RESTRICT||LA62_0==VOLATILE) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // nesC.g:567:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list5709);
            	    type_qualifier244=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier244.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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


    public static class parameter_type_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_type_list"
    // nesC.g:570:1: parameter_type_list : parameter_list ( ',' '...' )? ;
    public final nesCParser.parameter_type_list_return parameter_type_list() throws RecognitionException {
        nesCParser.parameter_type_list_return retval = new nesCParser.parameter_type_list_return();
        retval.start = input.LT(1);

        int parameter_type_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal246=null;
        Token string_literal247=null;
        nesCParser.parameter_list_return parameter_list245 =null;


        Object char_literal246_tree=null;
        Object string_literal247_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // nesC.g:571:5: ( parameter_list ( ',' '...' )? )
            // nesC.g:571:10: parameter_list ( ',' '...' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_parameter_list_in_parameter_type_list5730);
            parameter_list245=parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list245.getTree());

            // nesC.g:571:25: ( ',' '...' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==COMMA) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // nesC.g:571:26: ',' '...'
                    {
                    char_literal246=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_type_list5733); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal246_tree = 
                    (Object)adaptor.create(char_literal246)
                    ;
                    adaptor.addChild(root_0, char_literal246_tree);
                    }

                    string_literal247=(Token)match(input,184,FOLLOW_184_in_parameter_type_list5735); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal247_tree = 
                    (Object)adaptor.create(string_literal247)
                    ;
                    adaptor.addChild(root_0, string_literal247_tree);
                    }

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
            if ( state.backtracking>0 ) { memoize(input, 46, parameter_type_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parameter_type_list"


    public static class parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_list"
    // nesC.g:577:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* -> ^( PARAMETER_LIST ( parameter_declaration )+ ) | -> ^( PARAMETER_LIST ) );
    public final nesCParser.parameter_list_return parameter_list() throws RecognitionException {
        nesCParser.parameter_list_return retval = new nesCParser.parameter_list_return();
        retval.start = input.LT(1);

        int parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal249=null;
        nesCParser.parameter_declaration_return parameter_declaration248 =null;

        nesCParser.parameter_declaration_return parameter_declaration250 =null;


        Object char_literal249_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // nesC.g:578:5: ( parameter_declaration ( ',' parameter_declaration )* -> ^( PARAMETER_LIST ( parameter_declaration )+ ) | -> ^( PARAMETER_LIST ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ASYNC||LA65_0==AUTO||LA65_0==CHAR||LA65_0==COMMAND||LA65_0==CONST||LA65_0==DEFAULT||(LA65_0 >= DOUBLE && LA65_0 <= DUTY)||LA65_0==ENUM||(LA65_0 >= EVENT && LA65_0 <= EXTERN)||LA65_0==FLOAT||(LA65_0 >= INLINE && LA65_0 <= INT8_T)||LA65_0==LONG||LA65_0==NORACE||(LA65_0 >= NXLE_UINT16_T && LA65_0 <= NX_UNION)||LA65_0==RAW_IDENTIFIER||LA65_0==REGISTER||LA65_0==RESTRICT||LA65_0==SHORT||LA65_0==SIGNED||LA65_0==STATIC||LA65_0==STRUCT||LA65_0==TASK||(LA65_0 >= UINT16_T && LA65_0 <= UINT8_T)||(LA65_0 >= UNION && LA65_0 <= UNSIGNED)||(LA65_0 >= VOID && LA65_0 <= VOLATILE)) ) {
                alt65=1;
            }
            else if ( (LA65_0==EOF||LA65_0==COMMA||LA65_0==RBRACKET||LA65_0==RPARENS) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // nesC.g:578:10: parameter_declaration ( ',' parameter_declaration )*
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list5760);
                    parameter_declaration248=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration248.getTree());

                    // nesC.g:578:32: ( ',' parameter_declaration )*
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
                    	    // nesC.g:578:33: ',' parameter_declaration
                    	    {
                    	    char_literal249=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list5763); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal249);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list5765);
                    	    parameter_declaration250=parameter_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration250.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: parameter_declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 579:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ )
                    {
                        // nesC.g:579:16: ^( PARAMETER_LIST ( parameter_declaration )+ )
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

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:581:13: 
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
                    // 581:13: -> ^( PARAMETER_LIST )
                    {
                        // nesC.g:581:16: ^( PARAMETER_LIST )
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
            if ( state.backtracking>0 ) { memoize(input, 47, parameter_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parameter_list"


    public static class parameter_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_declaration"
    // nesC.g:587:1: parameter_declaration : ( declaration_specifiers declarator ( attributes )? -> ^( PARAMETER declaration_specifiers declarator ( attributes )? ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) );
    public final nesCParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        nesCParser.parameter_declaration_return retval = new nesCParser.parameter_declaration_return();
        retval.start = input.LT(1);

        int parameter_declaration_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers251 =null;

        nesCParser.declarator_return declarator252 =null;

        nesCParser.attributes_return attributes253 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers254 =null;

        nesCParser.abstract_declarator_return abstract_declarator255 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_abstract_declarator=new RewriteRuleSubtreeStream(adaptor,"rule abstract_declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // nesC.g:588:5: ( declaration_specifiers declarator ( attributes )? -> ^( PARAMETER declaration_specifiers declarator ( attributes )? ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) )
            int alt68=2;
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
                int LA68_1 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA68_2 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA68_3 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA68_4 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA68_5 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA68_6 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA68_7 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA68_8 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA68_9 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 9, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA68_10 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA68_11 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 11, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA68_12 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 12, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA68_13 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 13, input);

                    throw nvae;

                }
                }
                break;
            case INT64_T:
                {
                int LA68_14 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 14, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA68_15 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 15, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA68_16 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 16, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA68_17 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 17, input);

                    throw nvae;

                }
                }
                break;
            case UINT64_T:
                {
                int LA68_18 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 18, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA68_19 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 19, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA68_20 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 20, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA68_21 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 21, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT64_T:
                {
                int LA68_22 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 22, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT8_T:
                {
                int LA68_23 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 23, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT16_T:
                {
                int LA68_24 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 24, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT32_T:
                {
                int LA68_25 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 25, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA68_26 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 26, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA68_27 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 27, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA68_28 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 28, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA68_29 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 29, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA68_30 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 30, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA68_31 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 31, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA68_32 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 32, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA68_33 = input.LA(2);

                if ( (synpred145_nesC()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 33, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }

            switch (alt68) {
                case 1 :
                    // nesC.g:588:10: declaration_specifiers declarator ( attributes )?
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration5832);
                    declaration_specifiers251=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers251.getTree());

                    pushFollow(FOLLOW_declarator_in_parameter_declaration5834);
                    declarator252=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator252.getTree());

                    // nesC.g:588:44: ( attributes )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==ATTRIBUTE) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // nesC.g:588:44: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_parameter_declaration5836);
                            attributes253=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes253.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: attributes, declarator, declaration_specifiers
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 589:13: -> ^( PARAMETER declaration_specifiers declarator ( attributes )? )
                    {
                        // nesC.g:589:16: ^( PARAMETER declaration_specifiers declarator ( attributes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        adaptor.addChild(root_1, stream_declarator.nextTree());

                        // nesC.g:589:62: ( attributes )?
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
                    // nesC.g:590:10: declaration_specifiers ( abstract_declarator )?
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration5873);
                    declaration_specifiers254=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers254.getTree());

                    // nesC.g:590:33: ( abstract_declarator )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==LBRACKET||LA67_0==LPARENS||LA67_0==STAR) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // nesC.g:590:33: abstract_declarator
                            {
                            pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration5875);
                            abstract_declarator255=abstract_declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_abstract_declarator.add(abstract_declarator255.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: abstract_declarator, declaration_specifiers
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 591:13: -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                    {
                        // nesC.g:591:16: ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:591:51: ( abstract_declarator )?
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
            if ( state.backtracking>0 ) { memoize(input, 48, parameter_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parameter_declaration"


    public static class identifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_list"
    // nesC.g:593:1: identifier_list : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final nesCParser.identifier_list_return identifier_list() throws RecognitionException {
        nesCParser.identifier_list_return retval = new nesCParser.identifier_list_return();
        retval.start = input.LT(1);

        int identifier_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal257=null;
        nesCParser.identifier_return identifier256 =null;

        nesCParser.identifier_return identifier258 =null;


        Object char_literal257_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // nesC.g:594:5: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // nesC.g:594:10: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifier_list5918);
            identifier256=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier256.getTree());

            // nesC.g:594:21: ( ',' identifier )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==COMMA) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // nesC.g:594:22: ',' identifier
            	    {
            	    char_literal257=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifier_list5921); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal257);


            	    pushFollow(FOLLOW_identifier_in_identifier_list5923);
            	    identifier258=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier258.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
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
            // 594:39: -> ( identifier )+
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
            if ( state.backtracking>0 ) { memoize(input, 49, identifier_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifier_list"


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // nesC.g:596:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final nesCParser.type_name_return type_name() throws RecognitionException {
        nesCParser.type_name_return retval = new nesCParser.type_name_return();
        retval.start = input.LT(1);

        int type_name_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.specifier_qualifier_list_return specifier_qualifier_list259 =null;

        nesCParser.abstract_declarator_return abstract_declarator260 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // nesC.g:597:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // nesC.g:597:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name5949);
            specifier_qualifier_list259=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list259.getTree());

            // nesC.g:597:35: ( abstract_declarator )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LBRACKET||LA70_0==LPARENS||LA70_0==STAR) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // nesC.g:597:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name5951);
                    abstract_declarator260=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator260.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, type_name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_name"


    public static class abstract_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "abstract_declarator"
    // nesC.g:599:1: abstract_declarator : ( ( pointer )? direct_abstract_declarator | pointer );
    public final nesCParser.abstract_declarator_return abstract_declarator() throws RecognitionException {
        nesCParser.abstract_declarator_return retval = new nesCParser.abstract_declarator_return();
        retval.start = input.LT(1);

        int abstract_declarator_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.pointer_return pointer261 =null;

        nesCParser.direct_abstract_declarator_return direct_abstract_declarator262 =null;

        nesCParser.pointer_return pointer263 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // nesC.g:600:5: ( ( pointer )? direct_abstract_declarator | pointer )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==STAR) ) {
                int LA72_1 = input.LA(2);

                if ( (synpred150_nesC()) ) {
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
            else if ( (LA72_0==LBRACKET||LA72_0==LPARENS) ) {
                alt72=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }
            switch (alt72) {
                case 1 :
                    // nesC.g:600:10: ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:600:10: ( pointer )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==STAR) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // nesC.g:600:10: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator5971);
                            pointer261=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer261.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator5974);
                    direct_abstract_declarator262=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator262.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:601:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator5985);
                    pointer263=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer263.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, abstract_declarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "abstract_declarator"


    public static class direct_abstract_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_abstract_declarator"
    // nesC.g:603:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )* ;
    public final nesCParser.direct_abstract_declarator_return direct_abstract_declarator() throws RecognitionException {
        nesCParser.direct_abstract_declarator_return retval = new nesCParser.direct_abstract_declarator_return();
        retval.start = input.LT(1);

        int direct_abstract_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal264=null;
        Token char_literal266=null;
        Token char_literal267=null;
        Token char_literal269=null;
        Token char_literal270=null;
        Token char_literal272=null;
        Token char_literal273=null;
        Token char_literal275=null;
        Token char_literal276=null;
        Token char_literal278=null;
        nesCParser.abstract_declarator_return abstract_declarator265 =null;

        nesCParser.assignment_expression_return assignment_expression268 =null;

        nesCParser.parameter_type_list_return parameter_type_list271 =null;

        nesCParser.assignment_expression_return assignment_expression274 =null;

        nesCParser.parameter_type_list_return parameter_type_list277 =null;


        Object char_literal264_tree=null;
        Object char_literal266_tree=null;
        Object char_literal267_tree=null;
        Object char_literal269_tree=null;
        Object char_literal270_tree=null;
        Object char_literal272_tree=null;
        Object char_literal273_tree=null;
        Object char_literal275_tree=null;
        Object char_literal276_tree=null;
        Object char_literal278_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // nesC.g:604:5: ( ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )* )
            // nesC.g:604:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:604:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==LPARENS) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==LBRACKET||LA75_1==LPARENS||LA75_1==STAR) ) {
                    alt75=1;
                }
                else if ( (LA75_1==ASYNC||LA75_1==AUTO||LA75_1==CHAR||(LA75_1 >= COMMA && LA75_1 <= COMMAND)||LA75_1==CONST||LA75_1==DEFAULT||(LA75_1 >= DOUBLE && LA75_1 <= DUTY)||LA75_1==ENUM||(LA75_1 >= EVENT && LA75_1 <= EXTERN)||LA75_1==FLOAT||(LA75_1 >= INLINE && LA75_1 <= INT8_T)||LA75_1==LONG||LA75_1==NORACE||(LA75_1 >= NXLE_UINT16_T && LA75_1 <= NX_UNION)||LA75_1==RAW_IDENTIFIER||LA75_1==REGISTER||LA75_1==RESTRICT||LA75_1==RPARENS||LA75_1==SHORT||LA75_1==SIGNED||LA75_1==STATIC||LA75_1==STRUCT||LA75_1==TASK||(LA75_1 >= UINT16_T && LA75_1 <= UINT8_T)||(LA75_1 >= UNION && LA75_1 <= UNSIGNED)||(LA75_1 >= VOID && LA75_1 <= VOLATILE)) ) {
                    alt75=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA75_0==LBRACKET) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // nesC.g:604:11: '(' abstract_declarator ')'
                    {
                    char_literal264=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal264_tree = 
                    (Object)adaptor.create(char_literal264)
                    ;
                    adaptor.addChild(root_0, char_literal264_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator6007);
                    abstract_declarator265=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator265.getTree());

                    char_literal266=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6012); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal266_tree = 
                    (Object)adaptor.create(char_literal266)
                    ;
                    adaptor.addChild(root_0, char_literal266_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:605:11: '[' ( assignment_expression )? ']'
                    {
                    char_literal267=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator6026); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal267_tree = 
                    (Object)adaptor.create(char_literal267)
                    ;
                    adaptor.addChild(root_0, char_literal267_tree);
                    }

                    // nesC.g:605:15: ( assignment_expression )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==AMP||LA73_0==BITCOMPLEMENT||LA73_0==CALL||LA73_0==CHARACTER_LITERAL||LA73_0==CONSTANT||LA73_0==LPARENS||LA73_0==MINUS||LA73_0==MINUSMINUS||LA73_0==NOT||LA73_0==PLUS||LA73_0==PLUSPLUS||LA73_0==POST||LA73_0==RAW_IDENTIFIER||LA73_0==SIGNAL||LA73_0==SIZEOF||LA73_0==STAR||LA73_0==STRING_LITERAL) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // nesC.g:605:15: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator6028);
                            assignment_expression268=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression268.getTree());

                            }
                            break;

                    }


                    char_literal269=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator6031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal269_tree = 
                    (Object)adaptor.create(char_literal269)
                    ;
                    adaptor.addChild(root_0, char_literal269_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:606:11: '(' ( parameter_type_list )? ')'
                    {
                    char_literal270=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal270_tree = 
                    (Object)adaptor.create(char_literal270)
                    ;
                    adaptor.addChild(root_0, char_literal270_tree);
                    }

                    // nesC.g:606:15: ( parameter_type_list )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==ASYNC||LA74_0==AUTO||LA74_0==CHAR||(LA74_0 >= COMMA && LA74_0 <= COMMAND)||LA74_0==CONST||LA74_0==DEFAULT||(LA74_0 >= DOUBLE && LA74_0 <= DUTY)||LA74_0==ENUM||(LA74_0 >= EVENT && LA74_0 <= EXTERN)||LA74_0==FLOAT||(LA74_0 >= INLINE && LA74_0 <= INT8_T)||LA74_0==LONG||LA74_0==NORACE||(LA74_0 >= NXLE_UINT16_T && LA74_0 <= NX_UNION)||LA74_0==RAW_IDENTIFIER||LA74_0==REGISTER||LA74_0==RESTRICT||LA74_0==SHORT||LA74_0==SIGNED||LA74_0==STATIC||LA74_0==STRUCT||LA74_0==TASK||(LA74_0 >= UINT16_T && LA74_0 <= UINT8_T)||(LA74_0 >= UNION && LA74_0 <= UNSIGNED)||(LA74_0 >= VOID && LA74_0 <= VOLATILE)) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==RPARENS) ) {
                        int LA74_2 = input.LA(2);

                        if ( (synpred154_nesC()) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // nesC.g:606:15: parameter_type_list
                            {
                            pushFollow(FOLLOW_parameter_type_list_in_direct_abstract_declarator6047);
                            parameter_type_list271=parameter_type_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list271.getTree());

                            }
                            break;

                    }


                    char_literal272=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6052); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal272_tree = 
                    (Object)adaptor.create(char_literal272)
                    ;
                    adaptor.addChild(root_0, char_literal272_tree);
                    }

                    }
                    break;

            }


            // nesC.g:607:14: ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )*
            loop78:
            do {
                int alt78=3;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==LBRACKET) ) {
                    alt78=1;
                }
                else if ( (LA78_0==LPARENS) ) {
                    alt78=2;
                }


                switch (alt78) {
            	case 1 :
            	    // nesC.g:607:15: '[' ( assignment_expression )? ']'
            	    {
            	    char_literal273=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator6069); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal273_tree = 
            	    (Object)adaptor.create(char_literal273)
            	    ;
            	    adaptor.addChild(root_0, char_literal273_tree);
            	    }

            	    // nesC.g:607:19: ( assignment_expression )?
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==AMP||LA76_0==BITCOMPLEMENT||LA76_0==CALL||LA76_0==CHARACTER_LITERAL||LA76_0==CONSTANT||LA76_0==LPARENS||LA76_0==MINUS||LA76_0==MINUSMINUS||LA76_0==NOT||LA76_0==PLUS||LA76_0==PLUSPLUS||LA76_0==POST||LA76_0==RAW_IDENTIFIER||LA76_0==SIGNAL||LA76_0==SIZEOF||LA76_0==STAR||LA76_0==STRING_LITERAL) ) {
            	        alt76=1;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // nesC.g:607:19: assignment_expression
            	            {
            	            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator6071);
            	            assignment_expression274=assignment_expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression274.getTree());

            	            }
            	            break;

            	    }


            	    char_literal275=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator6074); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal275_tree = 
            	    (Object)adaptor.create(char_literal275)
            	    ;
            	    adaptor.addChild(root_0, char_literal275_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:607:48: '(' ( parameter_type_list )? ')'
            	    {
            	    char_literal276=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6078); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal276_tree = 
            	    (Object)adaptor.create(char_literal276)
            	    ;
            	    adaptor.addChild(root_0, char_literal276_tree);
            	    }

            	    // nesC.g:607:52: ( parameter_type_list )?
            	    int alt77=2;
            	    int LA77_0 = input.LA(1);

            	    if ( (LA77_0==ASYNC||LA77_0==AUTO||LA77_0==CHAR||(LA77_0 >= COMMA && LA77_0 <= COMMAND)||LA77_0==CONST||LA77_0==DEFAULT||(LA77_0 >= DOUBLE && LA77_0 <= DUTY)||LA77_0==ENUM||(LA77_0 >= EVENT && LA77_0 <= EXTERN)||LA77_0==FLOAT||(LA77_0 >= INLINE && LA77_0 <= INT8_T)||LA77_0==LONG||LA77_0==NORACE||(LA77_0 >= NXLE_UINT16_T && LA77_0 <= NX_UNION)||LA77_0==RAW_IDENTIFIER||LA77_0==REGISTER||LA77_0==RESTRICT||LA77_0==SHORT||LA77_0==SIGNED||LA77_0==STATIC||LA77_0==STRUCT||LA77_0==TASK||(LA77_0 >= UINT16_T && LA77_0 <= UINT8_T)||(LA77_0 >= UNION && LA77_0 <= UNSIGNED)||(LA77_0 >= VOID && LA77_0 <= VOLATILE)) ) {
            	        alt77=1;
            	    }
            	    else if ( (LA77_0==RPARENS) ) {
            	        int LA77_2 = input.LA(2);

            	        if ( (synpred157_nesC()) ) {
            	            alt77=1;
            	        }
            	    }
            	    switch (alt77) {
            	        case 1 :
            	            // nesC.g:607:52: parameter_type_list
            	            {
            	            pushFollow(FOLLOW_parameter_type_list_in_direct_abstract_declarator6080);
            	            parameter_type_list277=parameter_type_list();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list277.getTree());

            	            }
            	            break;

            	    }


            	    char_literal278=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6083); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal278_tree = 
            	    (Object)adaptor.create(char_literal278)
            	    ;
            	    adaptor.addChild(root_0, char_literal278_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop78;
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
            if ( state.backtracking>0 ) { memoize(input, 52, direct_abstract_declarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "direct_abstract_declarator"


    public static class typedef_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_name"
    // nesC.g:610:1: typedef_name : id= RAW_IDENTIFIER {...}?;
    public final nesCParser.typedef_name_return typedef_name() throws RecognitionException {
        nesCParser.typedef_name_return retval = new nesCParser.typedef_name_return();
        retval.start = input.LT(1);

        int typedef_name_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // nesC.g:611:5: (id= RAW_IDENTIFIER {...}?)
            // nesC.g:611:10: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name6112); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 53, typedef_name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typedef_name"


    public static class initializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer"
    // nesC.g:620:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
    public final nesCParser.initializer_return initializer() throws RecognitionException {
        nesCParser.initializer_return retval = new nesCParser.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal280=null;
        Token char_literal282=null;
        Token char_literal283=null;
        nesCParser.assignment_expression_return assignment_expression279 =null;

        nesCParser.initializer_list_return initializer_list281 =null;


        Object char_literal280_tree=null;
        Object char_literal282_tree=null;
        Object char_literal283_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // nesC.g:621:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
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
                    // nesC.g:621:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer6152);
                    assignment_expression279=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression279.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:622:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal280=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer6163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal280);


                    pushFollow(FOLLOW_initializer_list_in_initializer6165);
                    initializer_list281=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list281.getTree());

                    // nesC.g:622:31: ( ',' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==COMMA) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // nesC.g:622:31: ','
                            {
                            char_literal282=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer6167); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal282);


                            }
                            break;

                    }


                    char_literal283=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer6170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal283);


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
                    // 622:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // nesC.g:622:43: ^( INITIALIZER_LIST initializer_list )
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
            if ( state.backtracking>0 ) { memoize(input, 54, initializer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initializer"


    public static class initializer_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer_list"
    // nesC.g:624:1: initializer_list : initializer ( ',' initializer )* -> ( initializer )+ ;
    public final nesCParser.initializer_list_return initializer_list() throws RecognitionException {
        nesCParser.initializer_list_return retval = new nesCParser.initializer_list_return();
        retval.start = input.LT(1);

        int initializer_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal285=null;
        nesCParser.initializer_return initializer284 =null;

        nesCParser.initializer_return initializer286 =null;


        Object char_literal285_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // nesC.g:625:5: ( initializer ( ',' initializer )* -> ( initializer )+ )
            // nesC.g:625:10: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializer_list6197);
            initializer284=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer284.getTree());

            // nesC.g:625:22: ( ',' initializer )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    int LA81_1 = input.LA(2);

                    if ( (LA81_1==AMP||LA81_1==BITCOMPLEMENT||LA81_1==CALL||LA81_1==CHARACTER_LITERAL||LA81_1==CONSTANT||LA81_1==LBRACE||LA81_1==LPARENS||LA81_1==MINUS||LA81_1==MINUSMINUS||LA81_1==NOT||LA81_1==PLUS||LA81_1==PLUSPLUS||LA81_1==POST||LA81_1==RAW_IDENTIFIER||LA81_1==SIGNAL||LA81_1==SIZEOF||LA81_1==STAR||LA81_1==STRING_LITERAL) ) {
                        alt81=1;
                    }


                }


                switch (alt81) {
            	case 1 :
            	    // nesC.g:625:23: ',' initializer
            	    {
            	    char_literal285=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list6200); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal285);


            	    pushFollow(FOLLOW_initializer_in_initializer_list6202);
            	    initializer286=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer286.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
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
            // 625:41: -> ( initializer )+
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
            if ( state.backtracking>0 ) { memoize(input, 55, initializer_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initializer_list"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // nesC.g:631:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement | line_directive );
    public final nesCParser.statement_return statement() throws RecognitionException {
        nesCParser.statement_return retval = new nesCParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.labeled_statement_return labeled_statement287 =null;

        nesCParser.compound_statement_return compound_statement288 =null;

        nesCParser.expression_statement_return expression_statement289 =null;

        nesCParser.selection_statement_return selection_statement290 =null;

        nesCParser.iteration_statement_return iteration_statement291 =null;

        nesCParser.jump_statement_return jump_statement292 =null;

        nesCParser.atomic_statement_return atomic_statement293 =null;

        nesCParser.line_directive_return line_directive294 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // nesC.g:632:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement | line_directive )
            int alt82=8;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==185) ) {
                    alt82=1;
                }
                else if ( ((LA82_1 >= AMP && LA82_1 <= AND)||LA82_1==ARROW||LA82_1==ASSIGN||LA82_1==BITANDASSIGN||(LA82_1 >= BITOR && LA82_1 <= BITXORASSIGN)||LA82_1==COMMA||(LA82_1 >= DIVASSIGN && LA82_1 <= DIVIDE)||LA82_1==DOT||LA82_1==EQUAL||(LA82_1 >= GREATER && LA82_1 <= GREATEREQUAL)||(LA82_1 >= LBRACKET && LA82_1 <= LESSEQUAL)||(LA82_1 >= LPARENS && LA82_1 <= MODASSIGN)||(LA82_1 >= MODULUS && LA82_1 <= MULASSIGN)||LA82_1==NOTEQUAL||LA82_1==OR||(LA82_1 >= PLUS && LA82_1 <= PLUSPLUS)||(LA82_1 >= RSHIFT && LA82_1 <= RSHIFTASSIGN)||LA82_1==STAR||LA82_1==186||LA82_1==188) ) {
                    alt82=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;

                }
                }
                break;
            case CASE:
            case DEFAULT:
                {
                alt82=1;
                }
                break;
            case LBRACE:
                {
                alt82=2;
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
            case 186:
                {
                alt82=3;
                }
                break;
            case IF:
            case SWITCH:
                {
                alt82=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt82=5;
                }
                break;
            case BREAK:
            case CONTINUE:
            case GOTO:
            case RETURN:
                {
                alt82=6;
                }
                break;
            case ATOMIC:
                {
                alt82=7;
                }
                break;
            case HASH:
                {
                alt82=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }

            switch (alt82) {
                case 1 :
                    // nesC.g:632:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement6235);
                    labeled_statement287=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement287.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:633:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement6246);
                    compound_statement288=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement288.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:634:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement6257);
                    expression_statement289=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement289.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:635:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement6268);
                    selection_statement290=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement290.getTree());

                    }
                    break;
                case 5 :
                    // nesC.g:636:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement6279);
                    iteration_statement291=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement291.getTree());

                    }
                    break;
                case 6 :
                    // nesC.g:637:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement6290);
                    jump_statement292=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement292.getTree());

                    }
                    break;
                case 7 :
                    // nesC.g:638:10: atomic_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atomic_statement_in_statement6301);
                    atomic_statement293=atomic_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomic_statement293.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:639:10: line_directive
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_line_directive_in_statement6312);
                    line_directive294=line_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive294.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 56, statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class atomic_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomic_statement"
    // nesC.g:642:1: atomic_statement : ATOMIC statement -> ^( ATOMIC statement ) ;
    public final nesCParser.atomic_statement_return atomic_statement() throws RecognitionException {
        nesCParser.atomic_statement_return retval = new nesCParser.atomic_statement_return();
        retval.start = input.LT(1);

        int atomic_statement_StartIndex = input.index();

        Object root_0 = null;

        Token ATOMIC295=null;
        nesCParser.statement_return statement296 =null;


        Object ATOMIC295_tree=null;
        RewriteRuleTokenStream stream_ATOMIC=new RewriteRuleTokenStream(adaptor,"token ATOMIC");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // nesC.g:643:5: ( ATOMIC statement -> ^( ATOMIC statement ) )
            // nesC.g:643:10: ATOMIC statement
            {
            ATOMIC295=(Token)match(input,ATOMIC,FOLLOW_ATOMIC_in_atomic_statement6336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATOMIC.add(ATOMIC295);


            pushFollow(FOLLOW_statement_in_atomic_statement6338);
            statement296=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement296.getTree());

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
            // 643:27: -> ^( ATOMIC statement )
            {
                // nesC.g:643:30: ^( ATOMIC statement )
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
            if ( state.backtracking>0 ) { memoize(input, 57, atomic_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "atomic_statement"


    public static class labeled_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "labeled_statement"
    // nesC.g:645:1: labeled_statement : ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final nesCParser.labeled_statement_return labeled_statement() throws RecognitionException {
        nesCParser.labeled_statement_return retval = new nesCParser.labeled_statement_return();
        retval.start = input.LT(1);

        int labeled_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal298=null;
        Token CASE300=null;
        Token char_literal302=null;
        Token DEFAULT304=null;
        Token char_literal305=null;
        nesCParser.identifier_return identifier297 =null;

        nesCParser.statement_return statement299 =null;

        nesCParser.constant_expression_return constant_expression301 =null;

        nesCParser.statement_return statement303 =null;

        nesCParser.statement_return statement306 =null;


        Object char_literal298_tree=null;
        Object CASE300_tree=null;
        Object char_literal302_tree=null;
        Object DEFAULT304_tree=null;
        Object char_literal305_tree=null;
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // nesC.g:646:5: ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                alt83=1;
                }
                break;
            case CASE:
                {
                alt83=2;
                }
                break;
            case DEFAULT:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }

            switch (alt83) {
                case 1 :
                    // nesC.g:646:10: identifier ':' statement
                    {
                    pushFollow(FOLLOW_identifier_in_labeled_statement6365);
                    identifier297=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier297.getTree());

                    char_literal298=(Token)match(input,185,FOLLOW_185_in_labeled_statement6367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_185.add(char_literal298);


                    pushFollow(FOLLOW_statement_in_labeled_statement6369);
                    statement299=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement299.getTree());

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
                    // 646:35: -> ^( LABELED_STATEMENT identifier statement )
                    {
                        // nesC.g:646:38: ^( LABELED_STATEMENT identifier statement )
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
                    // nesC.g:647:10: CASE constant_expression ':' statement
                    {
                    CASE300=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement6390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE300);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement6392);
                    constant_expression301=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression301.getTree());

                    char_literal302=(Token)match(input,185,FOLLOW_185_in_labeled_statement6394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_185.add(char_literal302);


                    pushFollow(FOLLOW_statement_in_labeled_statement6396);
                    statement303=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement303.getTree());

                    // AST REWRITE
                    // elements: constant_expression, CASE, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 647:49: -> ^( CASE constant_expression statement )
                    {
                        // nesC.g:647:52: ^( CASE constant_expression statement )
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
                    // nesC.g:648:10: DEFAULT ':' statement
                    {
                    DEFAULT304=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement6417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT304);


                    char_literal305=(Token)match(input,185,FOLLOW_185_in_labeled_statement6419); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_185.add(char_literal305);


                    pushFollow(FOLLOW_statement_in_labeled_statement6421);
                    statement306=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement306.getTree());

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
                    // 648:32: -> ^( DEFAULT statement )
                    {
                        // nesC.g:648:35: ^( DEFAULT statement )
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
            if ( state.backtracking>0 ) { memoize(input, 58, labeled_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "labeled_statement"


    public static class compound_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compound_statement"
    // nesC.g:653:1: compound_statement : '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) ;
    public final nesCParser.compound_statement_return compound_statement() throws RecognitionException {
        nesCParser.compound_statement_return retval = new nesCParser.compound_statement_return();
        retval.start = input.LT(1);

        int compound_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal307=null;
        Token char_literal309=null;
        nesCParser.block_item_return block_item308 =null;


        Object char_literal307_tree=null;
        Object char_literal309_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_block_item=new RewriteRuleSubtreeStream(adaptor,"rule block_item");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // nesC.g:654:5: ( '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) )
            // nesC.g:654:10: '{' ( block_item )* '}'
            {
            char_literal307=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement6447); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal307);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:655:10: ( block_item )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==AMP||(LA84_0 >= ASYNC && LA84_0 <= ATOMIC)||LA84_0==AUTO||LA84_0==BITCOMPLEMENT||(LA84_0 >= BREAK && LA84_0 <= CASE)||(LA84_0 >= CHAR && LA84_0 <= CHARACTER_LITERAL)||LA84_0==COMMAND||(LA84_0 >= CONST && LA84_0 <= CONTINUE)||LA84_0==DEFAULT||LA84_0==DO||(LA84_0 >= DOUBLE && LA84_0 <= DUTY)||LA84_0==ENUM||(LA84_0 >= EVENT && LA84_0 <= EXTERN)||(LA84_0 >= FLOAT && LA84_0 <= FOR)||LA84_0==GOTO||LA84_0==HASH||LA84_0==IF||(LA84_0 >= INLINE && LA84_0 <= INT8_T)||LA84_0==LBRACE||(LA84_0 >= LONG && LA84_0 <= LPARENS)||LA84_0==MINUS||LA84_0==MINUSMINUS||(LA84_0 >= NORACE && LA84_0 <= NOT)||(LA84_0 >= NXLE_UINT16_T && LA84_0 <= NX_UNION)||LA84_0==PLUS||LA84_0==PLUSPLUS||LA84_0==POST||LA84_0==RAW_IDENTIFIER||LA84_0==REGISTER||(LA84_0 >= RESTRICT && LA84_0 <= RETURN)||(LA84_0 >= SHORT && LA84_0 <= SIZEOF)||LA84_0==STAR||(LA84_0 >= STATIC && LA84_0 <= UINT8_T)||(LA84_0 >= UNION && LA84_0 <= UNSIGNED)||(LA84_0 >= VOID && LA84_0 <= WHILE)||LA84_0==186) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // nesC.g:655:10: block_item
            	    {
            	    pushFollow(FOLLOW_block_item_in_compound_statement6460);
            	    block_item308=block_item();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block_item.add(block_item308.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal309=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement6478); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal309);


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
            // 656:44: -> ^( COMPOUND_STATEMENT ( block_item )* )
            {
                // nesC.g:656:47: ^( COMPOUND_STATEMENT ( block_item )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // nesC.g:656:68: ( block_item )*
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
            if ( state.backtracking>0 ) { memoize(input, 59, compound_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "compound_statement"


    public static class block_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_item"
    // nesC.g:658:1: block_item : ( declaration | statement );
    public final nesCParser.block_item_return block_item() throws RecognitionException {
        nesCParser.block_item_return retval = new nesCParser.block_item_return();
        retval.start = input.LT(1);

        int block_item_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_return declaration310 =null;

        nesCParser.statement_return statement311 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // nesC.g:659:5: ( declaration | statement )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // nesC.g:659:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_block_item6502);
                    declaration310=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration310.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:660:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_block_item6513);
                    statement311=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement311.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 60, block_item_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "block_item"


    public static class expression_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_statement"
    // nesC.g:666:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final nesCParser.expression_statement_return expression_statement() throws RecognitionException {
        nesCParser.expression_statement_return retval = new nesCParser.expression_statement_return();
        retval.start = input.LT(1);

        int expression_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal313=null;
        nesCParser.expression_return expression312 =null;


        Object char_literal313_tree=null;
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // nesC.g:667:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // nesC.g:667:10: ( expression )? ';'
            {
            // nesC.g:667:10: ( expression )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==AMP||LA86_0==BITCOMPLEMENT||LA86_0==CALL||LA86_0==CHARACTER_LITERAL||LA86_0==CONSTANT||LA86_0==LPARENS||LA86_0==MINUS||LA86_0==MINUSMINUS||LA86_0==NOT||LA86_0==PLUS||LA86_0==PLUSPLUS||LA86_0==POST||LA86_0==RAW_IDENTIFIER||LA86_0==SIGNAL||LA86_0==SIZEOF||LA86_0==STAR||LA86_0==STRING_LITERAL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // nesC.g:667:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement6536);
                    expression312=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression312.getTree());

                    }
                    break;

            }


            char_literal313=(Token)match(input,186,FOLLOW_186_in_expression_statement6539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_186.add(char_literal313);


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
            // 667:26: -> ^( STATEMENT ( expression )? )
            {
                // nesC.g:667:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // nesC.g:667:41: ( expression )?
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
            if ( state.backtracking>0 ) { memoize(input, 61, expression_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression_statement"


    public static class selection_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_statement"
    // nesC.g:669:1: selection_statement : ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final nesCParser.selection_statement_return selection_statement() throws RecognitionException {
        nesCParser.selection_statement_return retval = new nesCParser.selection_statement_return();
        retval.start = input.LT(1);

        int selection_statement_StartIndex = input.index();

        Object root_0 = null;

        Token IF314=null;
        Token char_literal315=null;
        Token char_literal317=null;
        Token ELSE319=null;
        Token SWITCH321=null;
        Token char_literal322=null;
        Token char_literal324=null;
        nesCParser.expression_return expression316 =null;

        nesCParser.statement_return statement318 =null;

        nesCParser.statement_return statement320 =null;

        nesCParser.expression_return expression323 =null;

        nesCParser.statement_return statement325 =null;


        Object IF314_tree=null;
        Object char_literal315_tree=null;
        Object char_literal317_tree=null;
        Object ELSE319_tree=null;
        Object SWITCH321_tree=null;
        Object char_literal322_tree=null;
        Object char_literal324_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // nesC.g:670:5: ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==IF) ) {
                alt88=1;
            }
            else if ( (LA88_0==SWITCH) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;

            }
            switch (alt88) {
                case 1 :
                    // nesC.g:670:10: IF '(' expression ')' statement ( ELSE statement )?
                    {
                    IF314=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF314);


                    char_literal315=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal315);


                    pushFollow(FOLLOW_expression_in_selection_statement6571);
                    expression316=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression316.getTree());

                    char_literal317=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal317);


                    pushFollow(FOLLOW_statement_in_selection_statement6575);
                    statement318=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement318.getTree());

                    // nesC.g:670:42: ( ELSE statement )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==ELSE) ) {
                        int LA87_1 = input.LA(2);

                        if ( (synpred174_nesC()) ) {
                            alt87=1;
                        }
                    }
                    switch (alt87) {
                        case 1 :
                            // nesC.g:670:43: ELSE statement
                            {
                            ELSE319=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement6578); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE319);


                            pushFollow(FOLLOW_statement_in_selection_statement6580);
                            statement320=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(statement320.getTree());

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
                    // 671:14: -> ^( IF expression statement ( statement )? )
                    {
                        // nesC.g:671:17: ^( IF expression statement ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        // nesC.g:671:43: ( statement )?
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
                    // nesC.g:672:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH321=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement6619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH321);


                    char_literal322=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal322);


                    pushFollow(FOLLOW_expression_in_selection_statement6623);
                    expression323=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression323.getTree());

                    char_literal324=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal324);


                    pushFollow(FOLLOW_statement_in_selection_statement6627);
                    statement325=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement325.getTree());

                    // AST REWRITE
                    // elements: expression, statement, SWITCH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 673:14: -> ^( SWITCH expression statement )
                    {
                        // nesC.g:673:17: ^( SWITCH expression statement )
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
            if ( state.backtracking>0 ) { memoize(input, 62, selection_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "selection_statement"


    public static class iteration_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_statement"
    // nesC.g:679:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final nesCParser.iteration_statement_return iteration_statement() throws RecognitionException {
        nesCParser.iteration_statement_return retval = new nesCParser.iteration_statement_return();
        retval.start = input.LT(1);

        int iteration_statement_StartIndex = input.index();

        Object root_0 = null;

        Token WHILE326=null;
        Token char_literal327=null;
        Token char_literal329=null;
        Token DO331=null;
        Token WHILE333=null;
        Token char_literal334=null;
        Token char_literal336=null;
        Token char_literal337=null;
        Token FOR338=null;
        Token char_literal339=null;
        Token char_literal340=null;
        Token char_literal341=null;
        Token char_literal342=null;
        nesCParser.expression_return init =null;

        nesCParser.expression_return cond =null;

        nesCParser.expression_return iter =null;

        nesCParser.expression_return expression328 =null;

        nesCParser.statement_return statement330 =null;

        nesCParser.statement_return statement332 =null;

        nesCParser.expression_return expression335 =null;

        nesCParser.statement_return statement343 =null;


        Object WHILE326_tree=null;
        Object char_literal327_tree=null;
        Object char_literal329_tree=null;
        Object DO331_tree=null;
        Object WHILE333_tree=null;
        Object char_literal334_tree=null;
        Object char_literal336_tree=null;
        Object char_literal337_tree=null;
        Object FOR338_tree=null;
        Object char_literal339_tree=null;
        Object char_literal340_tree=null;
        Object char_literal341_tree=null;
        Object char_literal342_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // nesC.g:680:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
            int alt92=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt92=1;
                }
                break;
            case DO:
                {
                alt92=2;
                }
                break;
            case FOR:
                {
                alt92=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }

            switch (alt92) {
                case 1 :
                    // nesC.g:680:10: WHILE '(' expression ')' statement
                    {
                    WHILE326=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE326);


                    char_literal327=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal327);


                    pushFollow(FOLLOW_expression_in_iteration_statement6677);
                    expression328=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression328.getTree());

                    char_literal329=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6679); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal329);


                    pushFollow(FOLLOW_statement_in_iteration_statement6681);
                    statement330=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement330.getTree());

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
                    // 680:45: -> ^( WHILE expression statement )
                    {
                        // nesC.g:680:48: ^( WHILE expression statement )
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
                    // nesC.g:681:10: DO statement WHILE '(' expression ')' ';'
                    {
                    DO331=(Token)match(input,DO,FOLLOW_DO_in_iteration_statement6702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO331);


                    pushFollow(FOLLOW_statement_in_iteration_statement6704);
                    statement332=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement332.getTree());

                    WHILE333=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE333);


                    char_literal334=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6708); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal334);


                    pushFollow(FOLLOW_expression_in_iteration_statement6710);
                    expression335=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression335.getTree());

                    char_literal336=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal336);


                    char_literal337=(Token)match(input,186,FOLLOW_186_in_iteration_statement6714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal337);


                    // AST REWRITE
                    // elements: expression, statement, DO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 681:52: -> ^( DO statement expression )
                    {
                        // nesC.g:681:55: ^( DO statement expression )
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
                    // nesC.g:682:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR338=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement6735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR338);


                    char_literal339=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal339);


                    // nesC.g:682:22: (init= expression )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==AMP||LA89_0==BITCOMPLEMENT||LA89_0==CALL||LA89_0==CHARACTER_LITERAL||LA89_0==CONSTANT||LA89_0==LPARENS||LA89_0==MINUS||LA89_0==MINUSMINUS||LA89_0==NOT||LA89_0==PLUS||LA89_0==PLUSPLUS||LA89_0==POST||LA89_0==RAW_IDENTIFIER||LA89_0==SIGNAL||LA89_0==SIZEOF||LA89_0==STAR||LA89_0==STRING_LITERAL) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // nesC.g:682:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6741);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal340=(Token)match(input,186,FOLLOW_186_in_iteration_statement6744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal340);


                    // nesC.g:682:43: (cond= expression )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==AMP||LA90_0==BITCOMPLEMENT||LA90_0==CALL||LA90_0==CHARACTER_LITERAL||LA90_0==CONSTANT||LA90_0==LPARENS||LA90_0==MINUS||LA90_0==MINUSMINUS||LA90_0==NOT||LA90_0==PLUS||LA90_0==PLUSPLUS||LA90_0==POST||LA90_0==RAW_IDENTIFIER||LA90_0==SIGNAL||LA90_0==SIZEOF||LA90_0==STAR||LA90_0==STRING_LITERAL) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // nesC.g:682:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6748);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal341=(Token)match(input,186,FOLLOW_186_in_iteration_statement6751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal341);


                    // nesC.g:682:64: (iter= expression )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==AMP||LA91_0==BITCOMPLEMENT||LA91_0==CALL||LA91_0==CHARACTER_LITERAL||LA91_0==CONSTANT||LA91_0==LPARENS||LA91_0==MINUS||LA91_0==MINUSMINUS||LA91_0==NOT||LA91_0==PLUS||LA91_0==PLUSPLUS||LA91_0==POST||LA91_0==RAW_IDENTIFIER||LA91_0==SIGNAL||LA91_0==SIZEOF||LA91_0==STAR||LA91_0==STRING_LITERAL) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // nesC.g:682:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6755);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal342=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal342);


                    pushFollow(FOLLOW_statement_in_iteration_statement6760);
                    statement343=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement343.getTree());

                    // AST REWRITE
                    // elements: statement, iter, cond, init, FOR
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
                    // 683:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // nesC.g:683:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // nesC.g:683:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // nesC.g:683:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:684:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // nesC.g:684:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:685:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // nesC.g:685:40: ( $iter)?
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
            if ( state.backtracking>0 ) { memoize(input, 63, iteration_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "iteration_statement"


    public static class jump_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_statement"
    // nesC.g:687:1: jump_statement : ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) );
    public final nesCParser.jump_statement_return jump_statement() throws RecognitionException {
        nesCParser.jump_statement_return retval = new nesCParser.jump_statement_return();
        retval.start = input.LT(1);

        int jump_statement_StartIndex = input.index();

        Object root_0 = null;

        Token GOTO344=null;
        Token char_literal346=null;
        Token CONTINUE347=null;
        Token char_literal348=null;
        Token BREAK349=null;
        Token char_literal350=null;
        Token RETURN351=null;
        Token char_literal353=null;
        nesCParser.identifier_return identifier345 =null;

        nesCParser.expression_return expression352 =null;


        Object GOTO344_tree=null;
        Object char_literal346_tree=null;
        Object CONTINUE347_tree=null;
        Object char_literal348_tree=null;
        Object BREAK349_tree=null;
        Object char_literal350_tree=null;
        Object RETURN351_tree=null;
        Object char_literal353_tree=null;
        RewriteRuleTokenStream stream_GOTO=new RewriteRuleTokenStream(adaptor,"token GOTO");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // nesC.g:688:5: ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case GOTO:
                {
                alt94=1;
                }
                break;
            case CONTINUE:
                {
                alt94=2;
                }
                break;
            case BREAK:
                {
                alt94=3;
                }
                break;
            case RETURN:
                {
                alt94=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }

            switch (alt94) {
                case 1 :
                    // nesC.g:688:10: GOTO identifier ';'
                    {
                    GOTO344=(Token)match(input,GOTO,FOLLOW_GOTO_in_jump_statement6867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GOTO.add(GOTO344);


                    pushFollow(FOLLOW_identifier_in_jump_statement6869);
                    identifier345=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier345.getTree());

                    char_literal346=(Token)match(input,186,FOLLOW_186_in_jump_statement6871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal346);


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
                    // 688:30: -> ^( GOTO identifier )
                    {
                        // nesC.g:688:33: ^( GOTO identifier )
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
                    // nesC.g:689:10: CONTINUE ';'
                    {
                    CONTINUE347=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement6890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE347);


                    char_literal348=(Token)match(input,186,FOLLOW_186_in_jump_statement6892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal348);


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
                    // 689:23: -> CONTINUE
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
                    // nesC.g:690:10: BREAK ';'
                    {
                    BREAK349=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement6907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK349);


                    char_literal350=(Token)match(input,186,FOLLOW_186_in_jump_statement6909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal350);


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
                    // 690:20: -> BREAK
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
                    // nesC.g:691:10: RETURN ( expression )? ';'
                    {
                    RETURN351=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement6924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN351);


                    // nesC.g:691:17: ( expression )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==AMP||LA93_0==BITCOMPLEMENT||LA93_0==CALL||LA93_0==CHARACTER_LITERAL||LA93_0==CONSTANT||LA93_0==LPARENS||LA93_0==MINUS||LA93_0==MINUSMINUS||LA93_0==NOT||LA93_0==PLUS||LA93_0==PLUSPLUS||LA93_0==POST||LA93_0==RAW_IDENTIFIER||LA93_0==SIGNAL||LA93_0==SIZEOF||LA93_0==STAR||LA93_0==STRING_LITERAL) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // nesC.g:691:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_jump_statement6926);
                            expression352=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression352.getTree());

                            }
                            break;

                    }


                    char_literal353=(Token)match(input,186,FOLLOW_186_in_jump_statement6929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal353);


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
                    // 691:33: -> ^( RETURN ( expression )? )
                    {
                        // nesC.g:691:36: ^( RETURN ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_RETURN.nextNode()
                        , root_1);

                        // nesC.g:691:45: ( expression )?
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
            if ( state.backtracking>0 ) { memoize(input, 64, jump_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "jump_statement"


    public static class translation_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "translation_unit"
    // nesC.g:697:1: translation_unit : ( external_declaration | line_directive )+ ;
    public final nesCParser.translation_unit_return translation_unit() throws RecognitionException {
        nesCParser.translation_unit_return retval = new nesCParser.translation_unit_return();
        retval.start = input.LT(1);

        int translation_unit_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.external_declaration_return external_declaration354 =null;

        nesCParser.line_directive_return line_directive355 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // nesC.g:698:5: ( ( external_declaration | line_directive )+ )
            // nesC.g:698:10: ( external_declaration | line_directive )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:698:10: ( external_declaration | line_directive )+
            int cnt95=0;
            loop95:
            do {
                int alt95=3;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==ASYNC||LA95_0==AUTO||LA95_0==CHAR||LA95_0==COMMAND||LA95_0==CONST||LA95_0==DEFAULT||(LA95_0 >= DOUBLE && LA95_0 <= DUTY)||LA95_0==ENUM||(LA95_0 >= EVENT && LA95_0 <= EXTERN)||LA95_0==FLOAT||(LA95_0 >= INLINE && LA95_0 <= INT8_T)||LA95_0==LONG||LA95_0==NORACE||(LA95_0 >= NXLE_UINT16_T && LA95_0 <= NX_UNION)||LA95_0==RAW_IDENTIFIER||LA95_0==REGISTER||LA95_0==RESTRICT||LA95_0==SHORT||LA95_0==SIGNED||LA95_0==STATIC||LA95_0==STRUCT||(LA95_0 >= TASK && LA95_0 <= UINT8_T)||(LA95_0 >= UNION && LA95_0 <= UNSIGNED)||(LA95_0 >= VOID && LA95_0 <= VOLATILE)) ) {
                    alt95=1;
                }
                else if ( (LA95_0==HASH) ) {
                    alt95=2;
                }


                switch (alt95) {
            	case 1 :
            	    // nesC.g:698:11: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit6965);
            	    external_declaration354=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration354.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:698:34: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit6969);
            	    line_directive355=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive355.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt95 >= 1 ) break loop95;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
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
            if ( state.backtracking>0 ) { memoize(input, 65, translation_unit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "translation_unit"


    public static class external_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "external_declaration"
    // nesC.g:701:1: external_declaration : declaration ;
    public final nesCParser.external_declaration_return external_declaration() throws RecognitionException {
        nesCParser.external_declaration_return retval = new nesCParser.external_declaration_return();
        retval.start = input.LT(1);

        int external_declaration_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_return declaration356 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // nesC.g:702:5: ( declaration )
            // nesC.g:702:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration6987);
            declaration356=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration356.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, external_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "external_declaration"


    public static class line_directive_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line_directive"
    // nesC.g:716:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )? -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final nesCParser.line_directive_return line_directive() throws RecognitionException {
        nesCParser.line_directive_return retval = new nesCParser.line_directive_return();
        retval.start = input.LT(1);

        int line_directive_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal357=null;
        Token CONSTANT358=null;
        Token STRING_LITERAL359=null;
        Token CONSTANT360=null;

        Object char_literal357_tree=null;
        Object CONSTANT358_tree=null;
        Object STRING_LITERAL359_tree=null;
        Object CONSTANT360_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // nesC.g:717:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )? -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // nesC.g:717:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )?
            {
            char_literal357=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive7014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal357);


            CONSTANT358=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7016); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT358);


            STRING_LITERAL359=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive7018); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL359);


            // nesC.g:717:38: ( CONSTANT )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==CONSTANT) ) {
                int LA96_1 = input.LA(2);

                if ( (synpred187_nesC()) ) {
                    alt96=1;
                }
            }
            switch (alt96) {
                case 1 :
                    // nesC.g:717:38: CONSTANT
                    {
                    CONSTANT360=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7020); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT360);


                    }
                    break;

            }


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
            // 717:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // nesC.g:717:51: ^( LINE_DIRECTIVE STRING_LITERAL )
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
            if ( state.backtracking>0 ) { memoize(input, 67, line_directive_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "line_directive"


    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_definition"
    // nesC.g:719:1: function_definition : declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement ;
    public final nesCParser.function_definition_return function_definition() throws RecognitionException {
        nesCParser.function_definition_return retval = new nesCParser.function_definition_return();
        retval.start = input.LT(1);

        int function_definition_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers361 =null;

        nesCParser.declarator_return declarator362 =null;

        nesCParser.attributes_return attributes363 =null;

        nesCParser.compound_statement_return compound_statement364 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // nesC.g:720:5: ( declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement )
            // nesC.g:720:10: declaration_specifiers declarator ( attributes )? compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition7048);
            declaration_specifiers361=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers361.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition7050);
            declarator362=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator362.getTree());

            // nesC.g:720:44: ( attributes )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==ATTRIBUTE) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // nesC.g:720:44: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_function_definition7052);
                    attributes363=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes363.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compound_statement_in_function_definition7055);
            compound_statement364=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement364.getTree());

            // AST REWRITE
            // elements: declarator, compound_statement, declaration_specifiers, attributes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 721:13: -> declaration_specifiers declarator ( attributes )? compound_statement
            {
                adaptor.addChild(root_0, stream_declaration_specifiers.nextTree());

                adaptor.addChild(root_0, stream_declarator.nextTree());

                // nesC.g:721:50: ( attributes )?
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
            if ( state.backtracking>0 ) { memoize(input, 68, function_definition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "function_definition"


    public static class nesC_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nesC_file"
    // nesC.g:731:1: nesC_file : ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) );
    public final nesCParser.nesC_file_return nesC_file() throws RecognitionException {
        nesCParser.nesC_file_return retval = new nesCParser.nesC_file_return();
        retval.start = input.LT(1);

        int nesC_file_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit365 =null;

        nesCParser.interface_definition_return interface_definition366 =null;

        nesCParser.translation_unit_return translation_unit367 =null;

        nesCParser.component_return component368 =null;


        RewriteRuleSubtreeStream stream_component=new RewriteRuleSubtreeStream(adaptor,"rule component");
        RewriteRuleSubtreeStream stream_interface_definition=new RewriteRuleSubtreeStream(adaptor,"rule interface_definition");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // nesC.g:732:5: ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) )
            int alt100=2;
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
                int LA100_1 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 1, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA100_2 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA100_3 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA100_4 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA100_5 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA100_6 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA100_7 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA100_8 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA100_9 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 9, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA100_10 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA100_11 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 11, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA100_12 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 12, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA100_13 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 13, input);

                    throw nvae;

                }
                }
                break;
            case INT64_T:
                {
                int LA100_14 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 14, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA100_15 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 15, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA100_16 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 16, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA100_17 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 17, input);

                    throw nvae;

                }
                }
                break;
            case UINT64_T:
                {
                int LA100_18 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 18, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA100_19 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 19, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA100_20 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 20, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA100_21 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 21, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT64_T:
                {
                int LA100_22 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 22, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT8_T:
                {
                int LA100_23 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 23, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT16_T:
                {
                int LA100_24 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 24, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT32_T:
                {
                int LA100_25 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 25, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA100_26 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 26, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA100_27 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 27, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA100_28 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 28, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA100_29 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 29, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA100_30 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 30, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA100_31 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 31, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA100_32 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 32, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA100_33 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 33, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                int LA100_34 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 34, input);

                    throw nvae;

                }
                }
                break;
            case HASH:
                {
                int LA100_35 = input.LA(2);

                if ( (synpred190_nesC()) ) {
                    alt100=1;
                }
                else if ( (true) ) {
                    alt100=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 35, input);

                    throw nvae;

                }
                }
                break;
            case INTERFACE:
                {
                alt100=1;
                }
                break;
            case COMPONENT:
            case CONFIGURATION:
            case GENERIC:
            case MODULE:
                {
                alt100=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }

            switch (alt100) {
                case 1 :
                    // nesC.g:732:10: ( translation_unit )? interface_definition
                    {
                    // nesC.g:732:10: ( translation_unit )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==ASYNC||LA98_0==AUTO||LA98_0==CHAR||LA98_0==COMMAND||LA98_0==CONST||LA98_0==DEFAULT||(LA98_0 >= DOUBLE && LA98_0 <= DUTY)||LA98_0==ENUM||(LA98_0 >= EVENT && LA98_0 <= EXTERN)||LA98_0==FLOAT||LA98_0==HASH||(LA98_0 >= INLINE && LA98_0 <= INT8_T)||LA98_0==LONG||LA98_0==NORACE||(LA98_0 >= NXLE_UINT16_T && LA98_0 <= NX_UNION)||LA98_0==RAW_IDENTIFIER||LA98_0==REGISTER||LA98_0==RESTRICT||LA98_0==SHORT||LA98_0==SIGNED||LA98_0==STATIC||LA98_0==STRUCT||(LA98_0 >= TASK && LA98_0 <= UINT8_T)||(LA98_0 >= UNION && LA98_0 <= UNSIGNED)||(LA98_0 >= VOID && LA98_0 <= VOLATILE)) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // nesC.g:732:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_nesC_file7104);
                            translation_unit365=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit365.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_interface_definition_in_nesC_file7107);
                    interface_definition366=interface_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_definition.add(interface_definition366.getTree());

                    // AST REWRITE
                    // elements: interface_definition, translation_unit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 732:49: -> ^( FILE ( translation_unit )? interface_definition )
                    {
                        // nesC.g:732:52: ^( FILE ( translation_unit )? interface_definition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // nesC.g:732:59: ( translation_unit )?
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
                    // nesC.g:733:10: ( translation_unit )? component
                    {
                    // nesC.g:733:10: ( translation_unit )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==ASYNC||LA99_0==AUTO||LA99_0==CHAR||LA99_0==COMMAND||LA99_0==CONST||LA99_0==DEFAULT||(LA99_0 >= DOUBLE && LA99_0 <= DUTY)||LA99_0==ENUM||(LA99_0 >= EVENT && LA99_0 <= EXTERN)||LA99_0==FLOAT||LA99_0==HASH||(LA99_0 >= INLINE && LA99_0 <= INT8_T)||LA99_0==LONG||LA99_0==NORACE||(LA99_0 >= NXLE_UINT16_T && LA99_0 <= NX_UNION)||LA99_0==RAW_IDENTIFIER||LA99_0==REGISTER||LA99_0==RESTRICT||LA99_0==SHORT||LA99_0==SIGNED||LA99_0==STATIC||LA99_0==STRUCT||(LA99_0 >= TASK && LA99_0 <= UINT8_T)||(LA99_0 >= UNION && LA99_0 <= UNSIGNED)||(LA99_0 >= VOID && LA99_0 <= VOLATILE)) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // nesC.g:733:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_nesC_file7129);
                            translation_unit367=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit367.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_component_in_nesC_file7132);
                    component368=component();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component.add(component368.getTree());

                    // AST REWRITE
                    // elements: component, translation_unit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 733:49: -> ^( FILE ( translation_unit )? component )
                    {
                        // nesC.g:733:52: ^( FILE ( translation_unit )? component )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // nesC.g:733:59: ( translation_unit )?
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
            if ( state.backtracking>0 ) { memoize(input, 69, nesC_file_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "nesC_file"


    public static class interface_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_definition"
    // nesC.g:742:1: interface_definition : INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( declaration | line_directive )* '}' -> ^( INTERFACE identifier ( declaration )* ) ;
    public final nesCParser.interface_definition_return interface_definition() throws RecognitionException {
        nesCParser.interface_definition_return retval = new nesCParser.interface_definition_return();
        retval.start = input.LT(1);

        int interface_definition_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE369=null;
        Token char_literal373=null;
        Token char_literal376=null;
        nesCParser.identifier_return identifier370 =null;

        nesCParser.type_parameters_return type_parameters371 =null;

        nesCParser.attributes_return attributes372 =null;

        nesCParser.declaration_return declaration374 =null;

        nesCParser.line_directive_return line_directive375 =null;


        Object INTERFACE369_tree=null;
        Object char_literal373_tree=null;
        Object char_literal376_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_type_parameters=new RewriteRuleSubtreeStream(adaptor,"rule type_parameters");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // nesC.g:743:5: ( INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( declaration | line_directive )* '}' -> ^( INTERFACE identifier ( declaration )* ) )
            // nesC.g:743:10: INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( declaration | line_directive )* '}'
            {
            INTERFACE369=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_definition7180); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE369);


            pushFollow(FOLLOW_identifier_in_interface_definition7182);
            identifier370=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier370.getTree());

            // nesC.g:743:31: ( type_parameters )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LESS) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // nesC.g:743:31: type_parameters
                    {
                    pushFollow(FOLLOW_type_parameters_in_interface_definition7184);
                    type_parameters371=type_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_parameters.add(type_parameters371.getTree());

                    }
                    break;

            }


            // nesC.g:743:48: ( attributes )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==ATTRIBUTE) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // nesC.g:743:48: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_interface_definition7187);
                    attributes372=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes372.getTree());

                    }
                    break;

            }


            char_literal373=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interface_definition7198); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal373);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:745:9: ( declaration | line_directive )*
            loop103:
            do {
                int alt103=3;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==ASYNC||LA103_0==AUTO||LA103_0==CHAR||LA103_0==COMMAND||LA103_0==CONST||LA103_0==DEFAULT||(LA103_0 >= DOUBLE && LA103_0 <= DUTY)||LA103_0==ENUM||(LA103_0 >= EVENT && LA103_0 <= EXTERN)||LA103_0==FLOAT||(LA103_0 >= INLINE && LA103_0 <= INT8_T)||LA103_0==LONG||LA103_0==NORACE||(LA103_0 >= NXLE_UINT16_T && LA103_0 <= NX_UNION)||LA103_0==RAW_IDENTIFIER||LA103_0==REGISTER||LA103_0==RESTRICT||LA103_0==SHORT||LA103_0==SIGNED||LA103_0==STATIC||LA103_0==STRUCT||(LA103_0 >= TASK && LA103_0 <= UINT8_T)||(LA103_0 >= UNION && LA103_0 <= UNSIGNED)||(LA103_0 >= VOID && LA103_0 <= VOLATILE)) ) {
                    alt103=1;
                }
                else if ( (LA103_0==HASH) ) {
                    alt103=2;
                }


                switch (alt103) {
            	case 1 :
            	    // nesC.g:745:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_interface_definition7211);
            	    declaration374=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration374.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:745:24: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_interface_definition7215);
            	    line_directive375=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive375.getTree());

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal376=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interface_definition7233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal376);


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
            // 747:13: -> ^( INTERFACE identifier ( declaration )* )
            {
                // nesC.g:747:16: ^( INTERFACE identifier ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:747:39: ( declaration )*
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
            if ( state.backtracking>0 ) { memoize(input, 70, interface_definition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interface_definition"


    public static class type_parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_parameters"
    // nesC.g:749:1: type_parameters : '<' type_parameter_list '>' ;
    public final nesCParser.type_parameters_return type_parameters() throws RecognitionException {
        nesCParser.type_parameters_return retval = new nesCParser.type_parameters_return();
        retval.start = input.LT(1);

        int type_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal377=null;
        Token char_literal379=null;
        nesCParser.type_parameter_list_return type_parameter_list378 =null;


        Object char_literal377_tree=null;
        Object char_literal379_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // nesC.g:750:5: ( '<' type_parameter_list '>' )
            // nesC.g:750:10: '<' type_parameter_list '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal377=(Token)match(input,LESS,FOLLOW_LESS_in_type_parameters7275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal377_tree = 
            (Object)adaptor.create(char_literal377)
            ;
            adaptor.addChild(root_0, char_literal377_tree);
            }

            pushFollow(FOLLOW_type_parameter_list_in_type_parameters7277);
            type_parameter_list378=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_parameter_list378.getTree());

            char_literal379=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_parameters7279); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal379_tree = 
            (Object)adaptor.create(char_literal379)
            ;
            adaptor.addChild(root_0, char_literal379_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 71, type_parameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_parameters"


    public static class type_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_parameter_list"
    // nesC.g:752:1: type_parameter_list : type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* ;
    public final nesCParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        nesCParser.type_parameter_list_return retval = new nesCParser.type_parameter_list_return();
        retval.start = input.LT(1);

        int type_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal382=null;
        nesCParser.type_specifier_return type_specifier380 =null;

        nesCParser.attributes_return attributes381 =null;

        nesCParser.type_specifier_return type_specifier383 =null;

        nesCParser.attributes_return attributes384 =null;


        Object char_literal382_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // nesC.g:753:5: ( type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* )
            // nesC.g:753:10: type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_specifier_in_type_parameter_list7298);
            type_specifier380=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier380.getTree());

            // nesC.g:753:25: ( attributes )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==ATTRIBUTE) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // nesC.g:753:25: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_type_parameter_list7300);
                    attributes381=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes381.getTree());

                    }
                    break;

            }


            // nesC.g:753:37: ( ',' type_specifier ( attributes )? )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==COMMA) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // nesC.g:753:38: ',' type_specifier ( attributes )?
            	    {
            	    char_literal382=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_parameter_list7304); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal382_tree = 
            	    (Object)adaptor.create(char_literal382)
            	    ;
            	    adaptor.addChild(root_0, char_literal382_tree);
            	    }

            	    pushFollow(FOLLOW_type_specifier_in_type_parameter_list7306);
            	    type_specifier383=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier383.getTree());

            	    // nesC.g:753:57: ( attributes )?
            	    int alt105=2;
            	    int LA105_0 = input.LA(1);

            	    if ( (LA105_0==ATTRIBUTE) ) {
            	        alt105=1;
            	    }
            	    switch (alt105) {
            	        case 1 :
            	            // nesC.g:753:57: attributes
            	            {
            	            pushFollow(FOLLOW_attributes_in_type_parameter_list7308);
            	            attributes384=attributes();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes384.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 72, type_parameter_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_parameter_list"


    public static class component_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component"
    // nesC.g:755:1: component : comp_kind identifier ( comp_parameters )? ( attributes )? component_specification ( implementation )? -> ^( comp_kind identifier component_specification ( implementation )? ) ;
    public final nesCParser.component_return component() throws RecognitionException {
        nesCParser.component_return retval = new nesCParser.component_return();
        retval.start = input.LT(1);

        int component_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.comp_kind_return comp_kind385 =null;

        nesCParser.identifier_return identifier386 =null;

        nesCParser.comp_parameters_return comp_parameters387 =null;

        nesCParser.attributes_return attributes388 =null;

        nesCParser.component_specification_return component_specification389 =null;

        nesCParser.implementation_return implementation390 =null;


        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_comp_parameters=new RewriteRuleSubtreeStream(adaptor,"rule comp_parameters");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_comp_kind=new RewriteRuleSubtreeStream(adaptor,"rule comp_kind");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // nesC.g:756:5: ( comp_kind identifier ( comp_parameters )? ( attributes )? component_specification ( implementation )? -> ^( comp_kind identifier component_specification ( implementation )? ) )
            // nesC.g:756:9: comp_kind identifier ( comp_parameters )? ( attributes )? component_specification ( implementation )?
            {
            pushFollow(FOLLOW_comp_kind_in_component7329);
            comp_kind385=comp_kind();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_comp_kind.add(comp_kind385.getTree());

            pushFollow(FOLLOW_identifier_in_component7331);
            identifier386=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier386.getTree());

            // nesC.g:756:30: ( comp_parameters )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==LPARENS) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // nesC.g:756:30: comp_parameters
                    {
                    pushFollow(FOLLOW_comp_parameters_in_component7333);
                    comp_parameters387=comp_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_comp_parameters.add(comp_parameters387.getTree());

                    }
                    break;

            }


            // nesC.g:756:47: ( attributes )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==ATTRIBUTE) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // nesC.g:756:47: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_component7336);
                    attributes388=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes388.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_component_specification_in_component7347);
            component_specification389=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification389.getTree());

            // nesC.g:758:9: ( implementation )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==IMPLEMENTATION) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // nesC.g:758:9: implementation
                    {
                    pushFollow(FOLLOW_implementation_in_component7357);
                    implementation390=implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementation.add(implementation390.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: implementation, comp_kind, component_specification, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 758:25: -> ^( comp_kind identifier component_specification ( implementation )? )
            {
                // nesC.g:758:28: ^( comp_kind identifier component_specification ( implementation )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_comp_kind.nextNode(), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_component_specification.nextTree());

                // nesC.g:758:75: ( implementation )?
                if ( stream_implementation.hasNext() ) {
                    adaptor.addChild(root_1, stream_implementation.nextTree());

                }
                stream_implementation.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 73, component_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component"


    public static class comp_kind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comp_kind"
    // nesC.g:760:1: comp_kind : ( MODULE | CONFIGURATION | COMPONENT | GENERIC MODULE | GENERIC CONFIGURATION );
    public final nesCParser.comp_kind_return comp_kind() throws RecognitionException {
        nesCParser.comp_kind_return retval = new nesCParser.comp_kind_return();
        retval.start = input.LT(1);

        int comp_kind_StartIndex = input.index();

        Object root_0 = null;

        Token MODULE391=null;
        Token CONFIGURATION392=null;
        Token COMPONENT393=null;
        Token GENERIC394=null;
        Token MODULE395=null;
        Token GENERIC396=null;
        Token CONFIGURATION397=null;

        Object MODULE391_tree=null;
        Object CONFIGURATION392_tree=null;
        Object COMPONENT393_tree=null;
        Object GENERIC394_tree=null;
        Object MODULE395_tree=null;
        Object GENERIC396_tree=null;
        Object CONFIGURATION397_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // nesC.g:761:5: ( MODULE | CONFIGURATION | COMPONENT | GENERIC MODULE | GENERIC CONFIGURATION )
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
                    // nesC.g:761:10: MODULE
                    {
                    root_0 = (Object)adaptor.nil();


                    MODULE391=(Token)match(input,MODULE,FOLLOW_MODULE_in_comp_kind7386); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MODULE391_tree = 
                    (Object)adaptor.create(MODULE391)
                    ;
                    adaptor.addChild(root_0, MODULE391_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:762:10: CONFIGURATION
                    {
                    root_0 = (Object)adaptor.nil();


                    CONFIGURATION392=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_comp_kind7397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONFIGURATION392_tree = 
                    (Object)adaptor.create(CONFIGURATION392)
                    ;
                    adaptor.addChild(root_0, CONFIGURATION392_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:763:10: COMPONENT
                    {
                    root_0 = (Object)adaptor.nil();


                    COMPONENT393=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_comp_kind7408); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMPONENT393_tree = 
                    (Object)adaptor.create(COMPONENT393)
                    ;
                    adaptor.addChild(root_0, COMPONENT393_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:764:10: GENERIC MODULE
                    {
                    root_0 = (Object)adaptor.nil();


                    GENERIC394=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_comp_kind7419); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GENERIC394_tree = 
                    (Object)adaptor.create(GENERIC394)
                    ;
                    adaptor.addChild(root_0, GENERIC394_tree);
                    }

                    MODULE395=(Token)match(input,MODULE,FOLLOW_MODULE_in_comp_kind7421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MODULE395_tree = 
                    (Object)adaptor.create(MODULE395)
                    ;
                    adaptor.addChild(root_0, MODULE395_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:765:10: GENERIC CONFIGURATION
                    {
                    root_0 = (Object)adaptor.nil();


                    GENERIC396=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_comp_kind7432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GENERIC396_tree = 
                    (Object)adaptor.create(GENERIC396)
                    ;
                    adaptor.addChild(root_0, GENERIC396_tree);
                    }

                    CONFIGURATION397=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_comp_kind7434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONFIGURATION397_tree = 
                    (Object)adaptor.create(CONFIGURATION397)
                    ;
                    adaptor.addChild(root_0, CONFIGURATION397_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 74, comp_kind_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "comp_kind"


    public static class implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementation"
    // nesC.g:767:1: implementation : ( module_implementation | configuration_implementation );
    public final nesCParser.implementation_return implementation() throws RecognitionException {
        nesCParser.implementation_return retval = new nesCParser.implementation_return();
        retval.start = input.LT(1);

        int implementation_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.module_implementation_return module_implementation398 =null;

        nesCParser.configuration_implementation_return configuration_implementation399 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // nesC.g:768:5: ( module_implementation | configuration_implementation )
            int alt111=2;
            alt111 = dfa111.predict(input);
            switch (alt111) {
                case 1 :
                    // nesC.g:768:10: module_implementation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_module_implementation_in_implementation7453);
                    module_implementation398=module_implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, module_implementation398.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:769:10: configuration_implementation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_configuration_implementation_in_implementation7464);
                    configuration_implementation399=configuration_implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_implementation399.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 75, implementation_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "implementation"


    public static class comp_parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comp_parameters"
    // nesC.g:771:1: comp_parameters : '(' component_parameter_list ')' ;
    public final nesCParser.comp_parameters_return comp_parameters() throws RecognitionException {
        nesCParser.comp_parameters_return retval = new nesCParser.comp_parameters_return();
        retval.start = input.LT(1);

        int comp_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal400=null;
        Token char_literal402=null;
        nesCParser.component_parameter_list_return component_parameter_list401 =null;


        Object char_literal400_tree=null;
        Object char_literal402_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // nesC.g:772:5: ( '(' component_parameter_list ')' )
            // nesC.g:772:10: '(' component_parameter_list ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal400=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_comp_parameters7483); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal400_tree = 
            (Object)adaptor.create(char_literal400)
            ;
            adaptor.addChild(root_0, char_literal400_tree);
            }

            pushFollow(FOLLOW_component_parameter_list_in_comp_parameters7485);
            component_parameter_list401=component_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, component_parameter_list401.getTree());

            char_literal402=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_comp_parameters7487); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal402_tree = 
            (Object)adaptor.create(char_literal402)
            ;
            adaptor.addChild(root_0, char_literal402_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 76, comp_parameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "comp_parameters"


    public static class component_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_parameter_list"
    // nesC.g:774:1: component_parameter_list : component_parameter ( ',' component_parameter )* ;
    public final nesCParser.component_parameter_list_return component_parameter_list() throws RecognitionException {
        nesCParser.component_parameter_list_return retval = new nesCParser.component_parameter_list_return();
        retval.start = input.LT(1);

        int component_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal404=null;
        nesCParser.component_parameter_return component_parameter403 =null;

        nesCParser.component_parameter_return component_parameter405 =null;


        Object char_literal404_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // nesC.g:775:5: ( component_parameter ( ',' component_parameter )* )
            // nesC.g:775:10: component_parameter ( ',' component_parameter )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_component_parameter_in_component_parameter_list7506);
            component_parameter403=component_parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, component_parameter403.getTree());

            // nesC.g:775:30: ( ',' component_parameter )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==COMMA) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // nesC.g:775:31: ',' component_parameter
            	    {
            	    char_literal404=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_parameter_list7509); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal404_tree = 
            	    (Object)adaptor.create(char_literal404)
            	    ;
            	    adaptor.addChild(root_0, char_literal404_tree);
            	    }

            	    pushFollow(FOLLOW_component_parameter_in_component_parameter_list7511);
            	    component_parameter405=component_parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, component_parameter405.getTree());

            	    }
            	    break;

            	default :
            	    break loop112;
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
            if ( state.backtracking>0 ) { memoize(input, 77, component_parameter_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_parameter_list"


    public static class component_parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_parameter"
    // nesC.g:777:1: component_parameter : ( parameter_declaration | TYPEDEF identifier ( attributes )? );
    public final nesCParser.component_parameter_return component_parameter() throws RecognitionException {
        nesCParser.component_parameter_return retval = new nesCParser.component_parameter_return();
        retval.start = input.LT(1);

        int component_parameter_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF407=null;
        nesCParser.parameter_declaration_return parameter_declaration406 =null;

        nesCParser.identifier_return identifier408 =null;

        nesCParser.attributes_return attributes409 =null;


        Object TYPEDEF407_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // nesC.g:778:5: ( parameter_declaration | TYPEDEF identifier ( attributes )? )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ASYNC||LA114_0==AUTO||LA114_0==CHAR||LA114_0==COMMAND||LA114_0==CONST||LA114_0==DEFAULT||(LA114_0 >= DOUBLE && LA114_0 <= DUTY)||LA114_0==ENUM||(LA114_0 >= EVENT && LA114_0 <= EXTERN)||LA114_0==FLOAT||(LA114_0 >= INLINE && LA114_0 <= INT8_T)||LA114_0==LONG||LA114_0==NORACE||(LA114_0 >= NXLE_UINT16_T && LA114_0 <= NX_UNION)||LA114_0==RAW_IDENTIFIER||LA114_0==REGISTER||LA114_0==RESTRICT||LA114_0==SHORT||LA114_0==SIGNED||LA114_0==STATIC||LA114_0==STRUCT||LA114_0==TASK||(LA114_0 >= UINT16_T && LA114_0 <= UINT8_T)||(LA114_0 >= UNION && LA114_0 <= UNSIGNED)||(LA114_0 >= VOID && LA114_0 <= VOLATILE)) ) {
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
                    // nesC.g:778:10: parameter_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_parameter_declaration_in_component_parameter7532);
                    parameter_declaration406=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_declaration406.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:779:10: TYPEDEF identifier ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TYPEDEF407=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_component_parameter7543); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPEDEF407_tree = 
                    (Object)adaptor.create(TYPEDEF407)
                    ;
                    adaptor.addChild(root_0, TYPEDEF407_tree);
                    }

                    pushFollow(FOLLOW_identifier_in_component_parameter7545);
                    identifier408=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier408.getTree());

                    // nesC.g:779:29: ( attributes )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==ATTRIBUTE) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // nesC.g:779:29: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_component_parameter7547);
                            attributes409=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes409.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 78, component_parameter_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_parameter"


    public static class module_implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_implementation"
    // nesC.g:784:1: module_implementation : IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) ;
    public final nesCParser.module_implementation_return module_implementation() throws RecognitionException {
        nesCParser.module_implementation_return retval = new nesCParser.module_implementation_return();
        retval.start = input.LT(1);

        int module_implementation_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTATION410=null;
        Token char_literal411=null;
        Token char_literal413=null;
        nesCParser.translation_unit_return translation_unit412 =null;


        Object IMPLEMENTATION410_tree=null;
        Object char_literal411_tree=null;
        Object char_literal413_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // nesC.g:785:5: ( IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) )
            // nesC.g:785:10: IMPLEMENTATION '{' translation_unit '}'
            {
            IMPLEMENTATION410=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_module_implementation7570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION410);


            char_literal411=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_implementation7572); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal411);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_implementation7604);
            translation_unit412=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit412.getTree());

            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal413=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_implementation7660); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal413);


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
            // 789:13: -> ^( IMPLEMENTATION translation_unit )
            {
                // nesC.g:789:16: ^( IMPLEMENTATION translation_unit )
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
            if ( state.backtracking>0 ) { memoize(input, 79, module_implementation_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "module_implementation"


    public static class configuration_implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configuration_implementation"
    // nesC.g:792:1: configuration_implementation : IMPLEMENTATION '{' ( configuration_element_list )? '}' -> ^( IMPLEMENTATION ( configuration_element_list )? ) ;
    public final nesCParser.configuration_implementation_return configuration_implementation() throws RecognitionException {
        nesCParser.configuration_implementation_return retval = new nesCParser.configuration_implementation_return();
        retval.start = input.LT(1);

        int configuration_implementation_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTATION414=null;
        Token char_literal415=null;
        Token char_literal417=null;
        nesCParser.configuration_element_list_return configuration_element_list416 =null;


        Object IMPLEMENTATION414_tree=null;
        Object char_literal415_tree=null;
        Object char_literal417_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_configuration_element_list=new RewriteRuleSubtreeStream(adaptor,"rule configuration_element_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // nesC.g:793:5: ( IMPLEMENTATION '{' ( configuration_element_list )? '}' -> ^( IMPLEMENTATION ( configuration_element_list )? ) )
            // nesC.g:793:10: IMPLEMENTATION '{' ( configuration_element_list )? '}'
            {
            IMPLEMENTATION414=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_configuration_implementation7696); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION414);


            char_literal415=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_configuration_implementation7698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal415);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:794:29: ( configuration_element_list )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==COMPONENTS||LA115_0==ENABLE||LA115_0==HASH||LA115_0==LBRACKET||LA115_0==RAW_IDENTIFIER) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // nesC.g:794:29: configuration_element_list
                    {
                    pushFollow(FOLLOW_configuration_element_list_in_configuration_implementation7730);
                    configuration_element_list416=configuration_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_configuration_element_list.add(configuration_element_list416.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal417=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_configuration_implementation7787); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal417);


            // AST REWRITE
            // elements: configuration_element_list, IMPLEMENTATION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 797:13: -> ^( IMPLEMENTATION ( configuration_element_list )? )
            {
                // nesC.g:797:16: ^( IMPLEMENTATION ( configuration_element_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLEMENTATION.nextNode()
                , root_1);

                // nesC.g:797:33: ( configuration_element_list )?
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
            if ( state.backtracking>0 ) { memoize(input, 80, configuration_implementation_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "configuration_implementation"


    public static class configuration_element_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configuration_element_list"
    // nesC.g:799:1: configuration_element_list : ( configuration_element | line_directive )+ ;
    public final nesCParser.configuration_element_list_return configuration_element_list() throws RecognitionException {
        nesCParser.configuration_element_list_return retval = new nesCParser.configuration_element_list_return();
        retval.start = input.LT(1);

        int configuration_element_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.configuration_element_return configuration_element418 =null;

        nesCParser.line_directive_return line_directive419 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // nesC.g:800:5: ( ( configuration_element | line_directive )+ )
            // nesC.g:800:10: ( configuration_element | line_directive )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:800:10: ( configuration_element | line_directive )+
            int cnt116=0;
            loop116:
            do {
                int alt116=3;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==COMPONENTS||LA116_0==ENABLE||LA116_0==LBRACKET||LA116_0==RAW_IDENTIFIER) ) {
                    alt116=1;
                }
                else if ( (LA116_0==HASH) ) {
                    alt116=2;
                }


                switch (alt116) {
            	case 1 :
            	    // nesC.g:800:11: configuration_element
            	    {
            	    pushFollow(FOLLOW_configuration_element_in_configuration_element_list7828);
            	    configuration_element418=configuration_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element418.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:800:35: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_configuration_element_list7832);
            	    line_directive419=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive419.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt116 >= 1 ) break loop116;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(116, input);
                        throw eee;
                }
                cnt116++;
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
            if ( state.backtracking>0 ) { memoize(input, 81, configuration_element_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "configuration_element_list"


    public static class configuration_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configuration_element"
    // nesC.g:802:1: configuration_element : ( components | connection );
    public final nesCParser.configuration_element_return configuration_element() throws RecognitionException {
        nesCParser.configuration_element_return retval = new nesCParser.configuration_element_return();
        retval.start = input.LT(1);

        int configuration_element_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.components_return components420 =null;

        nesCParser.connection_return connection421 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // nesC.g:803:5: ( components | connection )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==COMPONENTS) ) {
                alt117=1;
            }
            else if ( (LA117_0==ENABLE||LA117_0==LBRACKET||LA117_0==RAW_IDENTIFIER) ) {
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
                    // nesC.g:803:10: components
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_components_in_configuration_element7853);
                    components420=components();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, components420.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:804:10: connection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_connection_in_configuration_element7864);
                    connection421=connection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connection421.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 82, configuration_element_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "configuration_element"


    public static class components_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "components"
    // nesC.g:812:1: components : COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) ;
    public final nesCParser.components_return components() throws RecognitionException {
        nesCParser.components_return retval = new nesCParser.components_return();
        retval.start = input.LT(1);

        int components_StartIndex = input.index();

        Object root_0 = null;

        Token COMPONENTS422=null;
        Token char_literal424=null;
        nesCParser.component_line_return component_line423 =null;


        Object COMPONENTS422_tree=null;
        Object char_literal424_tree=null;
        RewriteRuleTokenStream stream_COMPONENTS=new RewriteRuleTokenStream(adaptor,"token COMPONENTS");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_component_line=new RewriteRuleSubtreeStream(adaptor,"rule component_line");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // nesC.g:813:5: ( COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) )
            // nesC.g:813:10: COMPONENTS component_line ';'
            {
            COMPONENTS422=(Token)match(input,COMPONENTS,FOLLOW_COMPONENTS_in_components7909); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPONENTS.add(COMPONENTS422);


            pushFollow(FOLLOW_component_line_in_components7911);
            component_line423=component_line();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_line.add(component_line423.getTree());

            char_literal424=(Token)match(input,186,FOLLOW_186_in_components7913); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_186.add(char_literal424);


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
            // 813:40: -> ^( COMPONENTS component_line )
            {
                // nesC.g:813:43: ^( COMPONENTS component_line )
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
            if ( state.backtracking>0 ) { memoize(input, 83, components_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "components"


    public static class component_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_line"
    // nesC.g:815:1: component_line : component_declaration ( ',' component_declaration )* -> ( component_declaration )+ ;
    public final nesCParser.component_line_return component_line() throws RecognitionException {
        nesCParser.component_line_return retval = new nesCParser.component_line_return();
        retval.start = input.LT(1);

        int component_line_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal426=null;
        nesCParser.component_declaration_return component_declaration425 =null;

        nesCParser.component_declaration_return component_declaration427 =null;


        Object char_literal426_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_declaration=new RewriteRuleSubtreeStream(adaptor,"rule component_declaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // nesC.g:816:5: ( component_declaration ( ',' component_declaration )* -> ( component_declaration )+ )
            // nesC.g:816:10: component_declaration ( ',' component_declaration )*
            {
            pushFollow(FOLLOW_component_declaration_in_component_line7940);
            component_declaration425=component_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration425.getTree());

            // nesC.g:816:32: ( ',' component_declaration )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==COMMA) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // nesC.g:816:33: ',' component_declaration
            	    {
            	    char_literal426=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_line7943); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal426);


            	    pushFollow(FOLLOW_component_declaration_in_component_line7945);
            	    component_declaration427=component_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration427.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
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
            // 816:61: -> ( component_declaration )+
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
            if ( state.backtracking>0 ) { memoize(input, 84, component_line_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_line"


    public static class component_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_declaration"
    // nesC.g:818:1: component_declaration : component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) ;
    public final nesCParser.component_declaration_return component_declaration() throws RecognitionException {
        nesCParser.component_declaration_return retval = new nesCParser.component_declaration_return();
        retval.start = input.LT(1);

        int component_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token AS429=null;
        nesCParser.component_ref_return component_ref428 =null;

        nesCParser.identifier_return identifier430 =null;


        Object AS429_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_component_ref=new RewriteRuleSubtreeStream(adaptor,"rule component_ref");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // nesC.g:819:5: ( component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) )
            // nesC.g:819:10: component_ref ( AS identifier )?
            {
            pushFollow(FOLLOW_component_ref_in_component_declaration7971);
            component_ref428=component_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_ref.add(component_ref428.getTree());

            // nesC.g:819:24: ( AS identifier )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==AS) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // nesC.g:819:25: AS identifier
                    {
                    AS429=(Token)match(input,AS,FOLLOW_AS_in_component_declaration7974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS429);


                    pushFollow(FOLLOW_identifier_in_component_declaration7976);
                    identifier430=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier430.getTree());

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
            // 819:41: -> ^( COMPONENT_DECLARATION component_ref ( identifier )? )
            {
                // nesC.g:819:44: ^( COMPONENT_DECLARATION component_ref ( identifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DECLARATION, "COMPONENT_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_component_ref.nextTree());

                // nesC.g:819:82: ( identifier )?
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
            if ( state.backtracking>0 ) { memoize(input, 85, component_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_declaration"


    public static class component_ref_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_ref"
    // nesC.g:825:1: component_ref : ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) );
    public final nesCParser.component_ref_return component_ref() throws RecognitionException {
        nesCParser.component_ref_return retval = new nesCParser.component_ref_return();
        retval.start = input.LT(1);

        int component_ref_StartIndex = input.index();

        Object root_0 = null;

        Token NEW432=null;
        Token char_literal434=null;
        Token char_literal436=null;
        nesCParser.identifier_return identifier431 =null;

        nesCParser.identifier_return identifier433 =null;

        nesCParser.component_argument_list_return component_argument_list435 =null;


        Object NEW432_tree=null;
        Object char_literal434_tree=null;
        Object char_literal436_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule component_argument_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // nesC.g:826:5: ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RAW_IDENTIFIER) ) {
                alt121=1;
            }
            else if ( (LA121_0==NEW) ) {
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
                    // nesC.g:826:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_component_ref8014);
                    identifier431=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier431.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:827:10: NEW identifier '(' ( component_argument_list )? ')'
                    {
                    NEW432=(Token)match(input,NEW,FOLLOW_NEW_in_component_ref8025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW432);


                    pushFollow(FOLLOW_identifier_in_component_ref8027);
                    identifier433=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier433.getTree());

                    char_literal434=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_ref8029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal434);


                    // nesC.g:827:29: ( component_argument_list )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==AMP||LA120_0==BITCOMPLEMENT||LA120_0==CALL||(LA120_0 >= CHAR && LA120_0 <= CHARACTER_LITERAL)||(LA120_0 >= CONST && LA120_0 <= CONSTANT)||LA120_0==DOUBLE||LA120_0==ENUM||LA120_0==FLOAT||(LA120_0 >= INT && LA120_0 <= INT8_T)||(LA120_0 >= LONG && LA120_0 <= LPARENS)||LA120_0==MINUS||LA120_0==MINUSMINUS||LA120_0==NOT||(LA120_0 >= NXLE_UINT16_T && LA120_0 <= NX_UNION)||LA120_0==PLUS||LA120_0==PLUSPLUS||LA120_0==POST||LA120_0==RAW_IDENTIFIER||LA120_0==RESTRICT||(LA120_0 >= SHORT && LA120_0 <= SIZEOF)||LA120_0==STAR||(LA120_0 >= STRING_LITERAL && LA120_0 <= STRUCT)||(LA120_0 >= UINT16_T && LA120_0 <= UINT8_T)||(LA120_0 >= UNION && LA120_0 <= UNSIGNED)||(LA120_0 >= VOID && LA120_0 <= VOLATILE)) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // nesC.g:827:29: component_argument_list
                            {
                            pushFollow(FOLLOW_component_argument_list_in_component_ref8031);
                            component_argument_list435=component_argument_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_component_argument_list.add(component_argument_list435.getTree());

                            }
                            break;

                    }


                    char_literal436=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_ref8034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal436);


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
                    // 828:13: -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                    {
                        // nesC.g:828:16: ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_INSTANTIATION, "COMPONENT_INSTANTIATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:828:53: ( component_argument_list )?
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
            if ( state.backtracking>0 ) { memoize(input, 86, component_ref_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_ref"


    public static class component_argument_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_argument_list"
    // nesC.g:835:1: component_argument_list : component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) ;
    public final nesCParser.component_argument_list_return component_argument_list() throws RecognitionException {
        nesCParser.component_argument_list_return retval = new nesCParser.component_argument_list_return();
        retval.start = input.LT(1);

        int component_argument_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal438=null;
        nesCParser.component_argument_return component_argument437 =null;

        nesCParser.component_argument_return component_argument439 =null;


        Object char_literal438_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_argument=new RewriteRuleSubtreeStream(adaptor,"rule component_argument");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // nesC.g:836:5: ( component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) )
            // nesC.g:836:10: component_argument ( ',' component_argument )*
            {
            pushFollow(FOLLOW_component_argument_in_component_argument_list8081);
            component_argument437=component_argument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_argument.add(component_argument437.getTree());

            // nesC.g:836:29: ( ',' component_argument )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==COMMA) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // nesC.g:836:30: ',' component_argument
            	    {
            	    char_literal438=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_argument_list8084); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal438);


            	    pushFollow(FOLLOW_component_argument_in_component_argument_list8086);
            	    component_argument439=component_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_argument.add(component_argument439.getTree());

            	    }
            	    break;

            	default :
            	    break loop122;
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
            // 837:13: -> ^( COMPONENT_ARGUMENTS ( component_argument )+ )
            {
                // nesC.g:837:16: ^( COMPONENT_ARGUMENTS ( component_argument )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 87, component_argument_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_argument_list"


    public static class component_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_argument"
    // nesC.g:839:1: component_argument : ( expression | type_name );
    public final nesCParser.component_argument_return component_argument() throws RecognitionException {
        nesCParser.component_argument_return retval = new nesCParser.component_argument_return();
        retval.start = input.LT(1);

        int component_argument_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.expression_return expression440 =null;

        nesCParser.type_name_return type_name441 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

            // nesC.g:840:5: ( expression | type_name )
            int alt123=2;
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
                alt123=1;
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA123_2 = input.LA(2);

                if ( (synpred219_nesC()) ) {
                    alt123=1;
                }
                else if ( (true) ) {
                    alt123=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 2, input);

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
                alt123=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;

            }

            switch (alt123) {
                case 1 :
                    // nesC.g:840:10: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_component_argument8128);
                    expression440=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression440.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:841:10: type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_name_in_component_argument8139);
                    type_name441=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name441.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 88, component_argument_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_argument"


    public static class connection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "connection"
    // nesC.g:847:1: connection : ( endpoint '=' endpoint ';' -> ^( CONNECTION '=' endpoint endpoint ) | ( certificate_specification )? endpoint '->' endpoint ';' -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? ) | ( certificate_specification )? endpoint '<-' endpoint ';' -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? ) );
    public final nesCParser.connection_return connection() throws RecognitionException {
        nesCParser.connection_return retval = new nesCParser.connection_return();
        retval.start = input.LT(1);

        int connection_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal443=null;
        Token char_literal445=null;
        Token string_literal448=null;
        Token char_literal450=null;
        Token string_literal453=null;
        Token char_literal455=null;
        nesCParser.endpoint_return endpoint442 =null;

        nesCParser.endpoint_return endpoint444 =null;

        nesCParser.certificate_specification_return certificate_specification446 =null;

        nesCParser.endpoint_return endpoint447 =null;

        nesCParser.endpoint_return endpoint449 =null;

        nesCParser.certificate_specification_return certificate_specification451 =null;

        nesCParser.endpoint_return endpoint452 =null;

        nesCParser.endpoint_return endpoint454 =null;


        Object char_literal443_tree=null;
        Object char_literal445_tree=null;
        Object string_literal448_tree=null;
        Object char_literal450_tree=null;
        Object string_literal453_tree=null;
        Object char_literal455_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_certificate_specification=new RewriteRuleSubtreeStream(adaptor,"rule certificate_specification");
        RewriteRuleSubtreeStream stream_endpoint=new RewriteRuleSubtreeStream(adaptor,"rule endpoint");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

            // nesC.g:848:5: ( endpoint '=' endpoint ';' -> ^( CONNECTION '=' endpoint endpoint ) | ( certificate_specification )? endpoint '->' endpoint ';' -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? ) | ( certificate_specification )? endpoint '<-' endpoint ';' -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? ) )
            int alt126=3;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA126_1 = input.LA(2);

                if ( (synpred220_nesC()) ) {
                    alt126=1;
                }
                else if ( (synpred222_nesC()) ) {
                    alt126=2;
                }
                else if ( (true) ) {
                    alt126=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 1, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA126_2 = input.LA(2);

                if ( (synpred220_nesC()) ) {
                    alt126=1;
                }
                else if ( (synpred222_nesC()) ) {
                    alt126=2;
                }
                else if ( (true) ) {
                    alt126=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 2, input);

                    throw nvae;

                }
                }
                break;
            case ENABLE:
                {
                int LA126_3 = input.LA(2);

                if ( (synpred222_nesC()) ) {
                    alt126=2;
                }
                else if ( (true) ) {
                    alt126=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 3, input);

                    throw nvae;

                }
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
                    // nesC.g:848:10: endpoint '=' endpoint ';'
                    {
                    pushFollow(FOLLOW_endpoint_in_connection8158);
                    endpoint442=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint442.getTree());

                    char_literal443=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_connection8160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal443);


                    pushFollow(FOLLOW_endpoint_in_connection8162);
                    endpoint444=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint444.getTree());

                    char_literal445=(Token)match(input,186,FOLLOW_186_in_connection8164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal445);


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
                    // 849:14: -> ^( CONNECTION '=' endpoint endpoint )
                    {
                        // nesC.g:849:17: ^( CONNECTION '=' endpoint endpoint )
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
                    // nesC.g:850:10: ( certificate_specification )? endpoint '->' endpoint ';'
                    {
                    // nesC.g:850:10: ( certificate_specification )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==ENABLE) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // nesC.g:850:10: certificate_specification
                            {
                            pushFollow(FOLLOW_certificate_specification_in_connection8200);
                            certificate_specification446=certificate_specification();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification446.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_endpoint_in_connection8203);
                    endpoint447=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint447.getTree());

                    string_literal448=(Token)match(input,ARROW,FOLLOW_ARROW_in_connection8205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal448);


                    pushFollow(FOLLOW_endpoint_in_connection8207);
                    endpoint449=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint449.getTree());

                    char_literal450=(Token)match(input,186,FOLLOW_186_in_connection8209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal450);


                    // AST REWRITE
                    // elements: certificate_specification, endpoint, ARROW, endpoint
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 851:14: -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? )
                    {
                        // nesC.g:851:17: ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? )
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

                        // nesC.g:851:53: ( certificate_specification )?
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
                    // nesC.g:852:10: ( certificate_specification )? endpoint '<-' endpoint ';'
                    {
                    // nesC.g:852:10: ( certificate_specification )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==ENABLE) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // nesC.g:852:10: certificate_specification
                            {
                            pushFollow(FOLLOW_certificate_specification_in_connection8248);
                            certificate_specification451=certificate_specification();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification451.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_endpoint_in_connection8251);
                    endpoint452=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint452.getTree());

                    string_literal453=(Token)match(input,187,FOLLOW_187_in_connection8253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_187.add(string_literal453);


                    pushFollow(FOLLOW_endpoint_in_connection8255);
                    endpoint454=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint454.getTree());

                    char_literal455=(Token)match(input,186,FOLLOW_186_in_connection8257); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal455);


                    // AST REWRITE
                    // elements: endpoint, 187, certificate_specification, endpoint
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 853:14: -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? )
                    {
                        // nesC.g:853:17: ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONNECTION, "CONNECTION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_187.nextNode()
                        );

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        // nesC.g:853:53: ( certificate_specification )?
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
            if ( state.backtracking>0 ) { memoize(input, 89, connection_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "connection"


    public static class certificate_specification_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "certificate_specification"
    // nesC.g:855:1: certificate_specification : ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) ;
    public final nesCParser.certificate_specification_return certificate_specification() throws RecognitionException {
        nesCParser.certificate_specification_return retval = new nesCParser.certificate_specification_return();
        retval.start = input.LT(1);

        int certificate_specification_StartIndex = input.index();

        Object root_0 = null;

        Token certs=null;
        Token entity=null;
        Token assumptions=null;
        Token ENABLE456=null;
        Token AS457=null;
        Token ASSUMING458=null;
        Token FOR459=null;

        Object certs_tree=null;
        Object entity_tree=null;
        Object assumptions_tree=null;
        Object ENABLE456_tree=null;
        Object AS457_tree=null;
        Object ASSUMING458_tree=null;
        Object FOR459_tree=null;
        RewriteRuleTokenStream stream_ASSUMING=new RewriteRuleTokenStream(adaptor,"token ASSUMING");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_ENABLE=new RewriteRuleTokenStream(adaptor,"token ENABLE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

            // nesC.g:856:5: ( ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) )
            // nesC.g:856:10: ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR
            {
            ENABLE456=(Token)match(input,ENABLE,FOLLOW_ENABLE_in_certificate_specification8300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENABLE.add(ENABLE456);


            certs=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(certs);


            // nesC.g:856:38: ( AS entity= STRING_LITERAL )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==AS) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // nesC.g:856:39: AS entity= STRING_LITERAL
                    {
                    AS457=(Token)match(input,AS,FOLLOW_AS_in_certificate_specification8307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS457);


                    entity=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(entity);


                    }
                    break;

            }


            // nesC.g:856:66: ( ASSUMING assumptions= STRING_LITERAL )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==ASSUMING) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // nesC.g:856:67: ASSUMING assumptions= STRING_LITERAL
                    {
                    ASSUMING458=(Token)match(input,ASSUMING,FOLLOW_ASSUMING_in_certificate_specification8316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUMING.add(ASSUMING458);


                    assumptions=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(assumptions);


                    }
                    break;

            }


            FOR459=(Token)match(input,FOR,FOLLOW_FOR_in_certificate_specification8324); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR459);


            // AST REWRITE
            // elements: AS, entity, ENABLE, ASSUMING, assumptions, certs
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
            // 857:14: -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
            {
                // nesC.g:857:17: ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ENABLE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_certs.nextNode());

                // nesC.g:857:33: ( ^( AS $entity) )?
                if ( stream_AS.hasNext()||stream_entity.hasNext() ) {
                    // nesC.g:857:33: ^( AS $entity)
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

                // nesC.g:857:48: ( ^( ASSUMING $assumptions) )?
                if ( stream_ASSUMING.hasNext()||stream_assumptions.hasNext() ) {
                    // nesC.g:857:48: ^( ASSUMING $assumptions)
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
            if ( state.backtracking>0 ) { memoize(input, 90, certificate_specification_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "certificate_specification"


    public static class endpoint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "endpoint"
    // nesC.g:859:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );
    public final nesCParser.endpoint_return endpoint() throws RecognitionException {
        nesCParser.endpoint_return retval = new nesCParser.endpoint_return();
        retval.start = input.LT(1);

        int endpoint_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal462=null;
        Token char_literal464=null;
        nesCParser.identifier_path_return identifier_path460 =null;

        nesCParser.identifier_path_return identifier_path461 =null;

        nesCParser.argument_expression_list_return argument_expression_list463 =null;


        Object char_literal462_tree=null;
        Object char_literal464_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

            // nesC.g:860:5: ( identifier_path | identifier_path '[' argument_expression_list ']' )
            int alt129=2;
            alt129 = dfa129.predict(input);
            switch (alt129) {
                case 1 :
                    // nesC.g:860:10: identifier_path
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8377);
                    identifier_path460=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path460.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:861:10: identifier_path '[' argument_expression_list ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8388);
                    identifier_path461=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path461.getTree());

                    char_literal462=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_endpoint8390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal462_tree = 
                    (Object)adaptor.create(char_literal462)
                    ;
                    adaptor.addChild(root_0, char_literal462_tree);
                    }

                    pushFollow(FOLLOW_argument_expression_list_in_endpoint8392);
                    argument_expression_list463=argument_expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list463.getTree());

                    char_literal464=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_endpoint8394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal464_tree = 
                    (Object)adaptor.create(char_literal464)
                    ;
                    adaptor.addChild(root_0, char_literal464_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 91, endpoint_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "endpoint"


    public static class identifier_path_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_path"
    // nesC.g:863:1: identifier_path : ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) );
    public final nesCParser.identifier_path_return identifier_path() throws RecognitionException {
        nesCParser.identifier_path_return retval = new nesCParser.identifier_path_return();
        retval.start = input.LT(1);

        int identifier_path_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal466=null;
        Token char_literal468=null;
        Token char_literal469=null;
        Token char_literal470=null;
        List list_normal_path=null;
        nesCParser.identifier_return indirect =null;

        nesCParser.identifier_return identifier465 =null;

        nesCParser.identifier_return identifier467 =null;

        RuleReturnScope normal_path = null;
        Object char_literal466_tree=null;
        Object char_literal468_tree=null;
        Object char_literal469_tree=null;
        Object char_literal470_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

            // nesC.g:864:5: ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) )
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
                    // nesC.g:864:10: identifier ( '.' identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_identifier_path8413);
                    identifier465=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier465.getTree());

                    // nesC.g:864:21: ( '.' identifier )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==DOT) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // nesC.g:864:22: '.' identifier
                    	    {
                    	    char_literal466=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8416); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal466);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8418);
                    	    identifier467=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier467.getTree());

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
                    // 865:13: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:865:16: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:866:10: '[' indirect= identifier ']' ( '.' normal_path+= identifier )*
                    {
                    char_literal468=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_identifier_path8452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal468);


                    pushFollow(FOLLOW_identifier_in_identifier_path8456);
                    indirect=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(indirect.getTree());

                    char_literal469=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_identifier_path8458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal469);


                    // nesC.g:866:38: ( '.' normal_path+= identifier )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==DOT) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // nesC.g:866:39: '.' normal_path+= identifier
                    	    {
                    	    char_literal470=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8461); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal470);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8465);
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
                    // 867:13: -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
                    {
                        // nesC.g:867:16: ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
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
            if ( state.backtracking>0 ) { memoize(input, 92, identifier_path_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifier_path"


    public static class component_specification_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_specification"
    // nesC.g:873:1: component_specification : '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final nesCParser.component_specification_return component_specification() throws RecognitionException {
        nesCParser.component_specification_return retval = new nesCParser.component_specification_return();
        retval.start = input.LT(1);

        int component_specification_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal471=null;
        Token char_literal474=null;
        nesCParser.uses_provides_return uses_provides472 =null;

        nesCParser.line_directive_return line_directive473 =null;


        Object char_literal471_tree=null;
        Object char_literal474_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

            // nesC.g:874:5: ( '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // nesC.g:874:10: '{' ( uses_provides | line_directive )* '}'
            {
            char_literal471=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification8514); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal471);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:875:11: ( uses_provides | line_directive )*
            loop133:
            do {
                int alt133=3;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==ASYNC||LA133_0==AUTO||LA133_0==CHAR||LA133_0==COMMAND||LA133_0==CONST||LA133_0==DEFAULT||(LA133_0 >= DOUBLE && LA133_0 <= DUTY)||LA133_0==ENUM||(LA133_0 >= EVENT && LA133_0 <= EXTERN)||LA133_0==FLOAT||(LA133_0 >= INLINE && LA133_0 <= INT8_T)||LA133_0==LONG||LA133_0==NORACE||(LA133_0 >= NXLE_UINT16_T && LA133_0 <= NX_UNION)||(LA133_0 >= PROVIDES && LA133_0 <= RAW_IDENTIFIER)||LA133_0==REGISTER||LA133_0==RESTRICT||LA133_0==SHORT||LA133_0==SIGNED||LA133_0==STATIC||LA133_0==STRUCT||(LA133_0 >= TASK && LA133_0 <= UINT8_T)||(LA133_0 >= UNION && LA133_0 <= VOLATILE)) ) {
                    alt133=1;
                }
                else if ( (LA133_0==HASH) ) {
                    alt133=2;
                }


                switch (alt133) {
            	case 1 :
            	    // nesC.g:875:12: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification8529);
            	    uses_provides472=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides472.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:875:28: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification8533);
            	    line_directive473=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive473.getTree());

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);


            char_literal474=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification8537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal474);


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
            // 875:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // nesC.g:875:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // nesC.g:875:68: ( uses_provides )*
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
            if ( state.backtracking>0 ) { memoize(input, 93, component_specification_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_specification"


    public static class uses_provides_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uses_provides"
    // nesC.g:877:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) );
    public final nesCParser.uses_provides_return uses_provides() throws RecognitionException {
        nesCParser.uses_provides_return retval = new nesCParser.uses_provides_return();
        retval.start = input.LT(1);

        int uses_provides_StartIndex = input.index();

        Object root_0 = null;

        Token USES475=null;
        Token PROVIDES477=null;
        nesCParser.specification_element_list_return specification_element_list476 =null;

        nesCParser.specification_element_list_return specification_element_list478 =null;

        nesCParser.declaration_return declaration479 =null;


        Object USES475_tree=null;
        Object PROVIDES477_tree=null;
        RewriteRuleTokenStream stream_PROVIDES=new RewriteRuleTokenStream(adaptor,"token PROVIDES");
        RewriteRuleTokenStream stream_USES=new RewriteRuleTokenStream(adaptor,"token USES");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_specification_element_list=new RewriteRuleSubtreeStream(adaptor,"rule specification_element_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

            // nesC.g:878:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) )
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
                    // nesC.g:878:10: USES specification_element_list
                    {
                    USES475=(Token)match(input,USES,FOLLOW_USES_in_uses_provides8565); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES475);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8567);
                    specification_element_list476=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list476.getTree());

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
                    // 878:42: -> ^( USES specification_element_list )
                    {
                        // nesC.g:878:45: ^( USES specification_element_list )
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
                    // nesC.g:879:10: PROVIDES specification_element_list
                    {
                    PROVIDES477=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides8586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES477);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8588);
                    specification_element_list478=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list478.getTree());

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
                    // 879:46: -> ^( PROVIDES specification_element_list )
                    {
                        // nesC.g:879:49: ^( PROVIDES specification_element_list )
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
                    // nesC.g:880:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_uses_provides8607);
                    declaration479=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration479.getTree());

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
                    // 880:22: -> ^( DECLARATION declaration )
                    {
                        // nesC.g:880:25: ^( DECLARATION declaration )
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
            if ( state.backtracking>0 ) { memoize(input, 94, uses_provides_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "uses_provides"


    public static class specification_element_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specification_element_list"
    // nesC.g:882:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final nesCParser.specification_element_list_return specification_element_list() throws RecognitionException {
        nesCParser.specification_element_list_return retval = new nesCParser.specification_element_list_return();
        retval.start = input.LT(1);

        int specification_element_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal481=null;
        Token char_literal483=null;
        nesCParser.specification_element_return specification_element480 =null;

        nesCParser.specification_element_return specification_element482 =null;


        Object char_literal481_tree=null;
        Object char_literal483_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_specification_element=new RewriteRuleSubtreeStream(adaptor,"rule specification_element");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

            // nesC.g:883:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==ASYNC||LA136_0==AUTO||LA136_0==CHAR||LA136_0==COMMAND||LA136_0==CONST||LA136_0==DEFAULT||(LA136_0 >= DOUBLE && LA136_0 <= DUTY)||LA136_0==ENUM||(LA136_0 >= EVENT && LA136_0 <= EXTERN)||LA136_0==FLOAT||(LA136_0 >= INLINE && LA136_0 <= INTERFACE)||LA136_0==LONG||LA136_0==NORACE||(LA136_0 >= NXLE_UINT16_T && LA136_0 <= NX_UNION)||LA136_0==RAW_IDENTIFIER||(LA136_0 >= REGISTER && LA136_0 <= REMOTE)||LA136_0==RESTRICT||LA136_0==SHORT||LA136_0==SIGNED||LA136_0==STATIC||LA136_0==STRUCT||(LA136_0 >= TASK && LA136_0 <= UINT8_T)||(LA136_0 >= UNION && LA136_0 <= UNSIGNED)||(LA136_0 >= VOID && LA136_0 <= VOLATILE)) ) {
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
                    // nesC.g:883:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list8634);
                    specification_element480=specification_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element.add(specification_element480.getTree());

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
                    // 883:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:884:10: '{' ( specification_element )+ '}'
                    {
                    char_literal481=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list8649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal481);


                    // nesC.g:884:14: ( specification_element )+
                    int cnt135=0;
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==ASYNC||LA135_0==AUTO||LA135_0==CHAR||LA135_0==COMMAND||LA135_0==CONST||LA135_0==DEFAULT||(LA135_0 >= DOUBLE && LA135_0 <= DUTY)||LA135_0==ENUM||(LA135_0 >= EVENT && LA135_0 <= EXTERN)||LA135_0==FLOAT||(LA135_0 >= INLINE && LA135_0 <= INTERFACE)||LA135_0==LONG||LA135_0==NORACE||(LA135_0 >= NXLE_UINT16_T && LA135_0 <= NX_UNION)||LA135_0==RAW_IDENTIFIER||(LA135_0 >= REGISTER && LA135_0 <= REMOTE)||LA135_0==RESTRICT||LA135_0==SHORT||LA135_0==SIGNED||LA135_0==STATIC||LA135_0==STRUCT||(LA135_0 >= TASK && LA135_0 <= UINT8_T)||(LA135_0 >= UNION && LA135_0 <= UNSIGNED)||(LA135_0 >= VOID && LA135_0 <= VOLATILE)) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // nesC.g:884:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list8651);
                    	    specification_element482=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element482.getTree());

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


                    char_literal483=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list8654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal483);


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
                    // 884:41: -> ( specification_element )+
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
            if ( state.backtracking>0 ) { memoize(input, 95, specification_element_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "specification_element_list"


    public static class specification_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specification_element"
    // nesC.g:886:1: specification_element : ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) );
    public final nesCParser.specification_element_return specification_element() throws RecognitionException {
        nesCParser.specification_element_return retval = new nesCParser.specification_element_return();
        retval.start = input.LT(1);

        int specification_element_StartIndex = input.index();

        Object root_0 = null;

        Token AS486=null;
        Token char_literal490=null;
        nesCParser.declaration_return declaration484 =null;

        nesCParser.interface_type_return interface_type485 =null;

        nesCParser.identifier_return identifier487 =null;

        nesCParser.instance_parameters_return instance_parameters488 =null;

        nesCParser.attributes_return attributes489 =null;


        Object AS486_tree=null;
        Object char_literal490_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_instance_parameters=new RewriteRuleSubtreeStream(adaptor,"rule instance_parameters");
        RewriteRuleSubtreeStream stream_interface_type=new RewriteRuleSubtreeStream(adaptor,"rule interface_type");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

            // nesC.g:887:5: ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==ASYNC||LA140_0==AUTO||LA140_0==CHAR||LA140_0==COMMAND||LA140_0==CONST||LA140_0==DEFAULT||(LA140_0 >= DOUBLE && LA140_0 <= DUTY)||LA140_0==ENUM||(LA140_0 >= EVENT && LA140_0 <= EXTERN)||LA140_0==FLOAT||(LA140_0 >= INLINE && LA140_0 <= INT8_T)||LA140_0==LONG||LA140_0==NORACE||(LA140_0 >= NXLE_UINT16_T && LA140_0 <= NX_UNION)||LA140_0==RAW_IDENTIFIER||LA140_0==REGISTER||LA140_0==RESTRICT||LA140_0==SHORT||LA140_0==SIGNED||LA140_0==STATIC||LA140_0==STRUCT||(LA140_0 >= TASK && LA140_0 <= UINT8_T)||(LA140_0 >= UNION && LA140_0 <= UNSIGNED)||(LA140_0 >= VOID && LA140_0 <= VOLATILE)) ) {
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
                    // nesC.g:887:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_specification_element8678);
                    declaration484=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration484.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:888:10: interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';'
                    {
                    pushFollow(FOLLOW_interface_type_in_specification_element8689);
                    interface_type485=interface_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_type.add(interface_type485.getTree());

                    // nesC.g:888:25: ( AS identifier )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==AS) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // nesC.g:888:26: AS identifier
                            {
                            AS486=(Token)match(input,AS,FOLLOW_AS_in_specification_element8692); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AS.add(AS486);


                            pushFollow(FOLLOW_identifier_in_specification_element8694);
                            identifier487=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier487.getTree());

                            }
                            break;

                    }


                    // nesC.g:888:42: ( instance_parameters )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==LBRACKET) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // nesC.g:888:42: instance_parameters
                            {
                            pushFollow(FOLLOW_instance_parameters_in_specification_element8698);
                            instance_parameters488=instance_parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_instance_parameters.add(instance_parameters488.getTree());

                            }
                            break;

                    }


                    // nesC.g:888:63: ( attributes )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==ATTRIBUTE) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // nesC.g:888:63: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_specification_element8701);
                            attributes489=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes489.getTree());

                            }
                            break;

                    }


                    char_literal490=(Token)match(input,186,FOLLOW_186_in_specification_element8704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_186.add(char_literal490);


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
                    // 889:13: -> ^( INTERFACE interface_type ( identifier )? )
                    {
                        // nesC.g:889:16: ^( INTERFACE interface_type ( identifier )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTERFACE, "INTERFACE")
                        , root_1);

                        adaptor.addChild(root_1, stream_interface_type.nextTree());

                        // nesC.g:889:43: ( identifier )?
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
            if ( state.backtracking>0 ) { memoize(input, 96, specification_element_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "specification_element"


    public static class interface_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_type"
    // nesC.g:896:1: interface_type : ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) ;
    public final nesCParser.interface_type_return interface_type() throws RecognitionException {
        nesCParser.interface_type_return retval = new nesCParser.interface_type_return();
        retval.start = input.LT(1);

        int interface_type_StartIndex = input.index();

        Object root_0 = null;

        Token REMOTE491=null;
        Token INTERFACE492=null;
        Token REQUIRES495=null;
        Token STRING_LITERAL496=null;
        nesCParser.identifier_return identifier493 =null;

        nesCParser.type_arguments_return type_arguments494 =null;


        Object REMOTE491_tree=null;
        Object INTERFACE492_tree=null;
        Object REQUIRES495_tree=null;
        Object STRING_LITERAL496_tree=null;
        RewriteRuleTokenStream stream_REMOTE=new RewriteRuleTokenStream(adaptor,"token REMOTE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_REQUIRES=new RewriteRuleTokenStream(adaptor,"token REQUIRES");
        RewriteRuleSubtreeStream stream_type_arguments=new RewriteRuleSubtreeStream(adaptor,"rule type_arguments");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

            // nesC.g:897:5: ( ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) )
            // nesC.g:897:10: ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )?
            {
            // nesC.g:897:10: ( REMOTE )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==REMOTE) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // nesC.g:897:10: REMOTE
                    {
                    REMOTE491=(Token)match(input,REMOTE,FOLLOW_REMOTE_in_interface_type8751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REMOTE.add(REMOTE491);


                    }
                    break;

            }


            INTERFACE492=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_type8754); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE492);


            pushFollow(FOLLOW_identifier_in_interface_type8756);
            identifier493=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier493.getTree());

            // nesC.g:897:39: ( type_arguments )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==LESS) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // nesC.g:897:39: type_arguments
                    {
                    pushFollow(FOLLOW_type_arguments_in_interface_type8758);
                    type_arguments494=type_arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_arguments.add(type_arguments494.getTree());

                    }
                    break;

            }


            // nesC.g:897:55: ( REQUIRES STRING_LITERAL )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==REQUIRES) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // nesC.g:897:56: REQUIRES STRING_LITERAL
                    {
                    REQUIRES495=(Token)match(input,REQUIRES,FOLLOW_REQUIRES_in_interface_type8762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRES.add(REQUIRES495);


                    STRING_LITERAL496=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_interface_type8764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL496);


                    }
                    break;

            }


            // AST REWRITE
            // elements: REMOTE, identifier, type_arguments, STRING_LITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 898:13: -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
            {
                // nesC.g:898:16: ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_TYPE, "INTERFACE_TYPE")
                , root_1);

                // nesC.g:898:33: ( REMOTE )?
                if ( stream_REMOTE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_REMOTE.nextNode()
                    );

                }
                stream_REMOTE.reset();

                // nesC.g:898:41: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING_LITERAL.nextNode()
                    );

                }
                stream_STRING_LITERAL.reset();

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:898:68: ( type_arguments )?
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
            if ( state.backtracking>0 ) { memoize(input, 97, interface_type_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interface_type"


    public static class type_arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_arguments"
    // nesC.g:900:1: type_arguments : '<' type_name ( ',' type_name )* '>' -> ( type_name )+ ;
    public final nesCParser.type_arguments_return type_arguments() throws RecognitionException {
        nesCParser.type_arguments_return retval = new nesCParser.type_arguments_return();
        retval.start = input.LT(1);

        int type_arguments_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal497=null;
        Token char_literal499=null;
        Token char_literal501=null;
        nesCParser.type_name_return type_name498 =null;

        nesCParser.type_name_return type_name500 =null;


        Object char_literal497_tree=null;
        Object char_literal499_tree=null;
        Object char_literal501_tree=null;
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

            // nesC.g:901:5: ( '<' type_name ( ',' type_name )* '>' -> ( type_name )+ )
            // nesC.g:901:10: '<' type_name ( ',' type_name )* '>'
            {
            char_literal497=(Token)match(input,LESS,FOLLOW_LESS_in_type_arguments8814); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESS.add(char_literal497);


            pushFollow(FOLLOW_type_name_in_type_arguments8816);
            type_name498=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_name.add(type_name498.getTree());

            // nesC.g:901:24: ( ',' type_name )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==COMMA) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // nesC.g:901:25: ',' type_name
            	    {
            	    char_literal499=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_arguments8819); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal499);


            	    pushFollow(FOLLOW_type_name_in_type_arguments8821);
            	    type_name500=type_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type_name.add(type_name500.getTree());

            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);


            char_literal501=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_arguments8825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GREATER.add(char_literal501);


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
            // 901:45: -> ( type_name )+
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
            if ( state.backtracking>0 ) { memoize(input, 98, type_arguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_arguments"


    public static class instance_parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instance_parameters"
    // nesC.g:903:1: instance_parameters : '[' parameter_type_list ']' ;
    public final nesCParser.instance_parameters_return instance_parameters() throws RecognitionException {
        nesCParser.instance_parameters_return retval = new nesCParser.instance_parameters_return();
        retval.start = input.LT(1);

        int instance_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal502=null;
        Token char_literal504=null;
        nesCParser.parameter_type_list_return parameter_type_list503 =null;


        Object char_literal502_tree=null;
        Object char_literal504_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

            // nesC.g:904:5: ( '[' parameter_type_list ']' )
            // nesC.g:904:10: '[' parameter_type_list ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal502=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_instance_parameters8849); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal502_tree = 
            (Object)adaptor.create(char_literal502)
            ;
            adaptor.addChild(root_0, char_literal502_tree);
            }

            pushFollow(FOLLOW_parameter_type_list_in_instance_parameters8851);
            parameter_type_list503=parameter_type_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list503.getTree());

            char_literal504=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_instance_parameters8853); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal504_tree = 
            (Object)adaptor.create(char_literal504)
            ;
            adaptor.addChild(root_0, char_literal504_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 99, instance_parameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "instance_parameters"


    public static class attributes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributes"
    // nesC.g:906:1: attributes : ( attribute )+ ;
    public final nesCParser.attributes_return attributes() throws RecognitionException {
        nesCParser.attributes_return retval = new nesCParser.attributes_return();
        retval.start = input.LT(1);

        int attributes_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.attribute_return attribute505 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

            // nesC.g:907:5: ( ( attribute )+ )
            // nesC.g:907:10: ( attribute )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:907:10: ( attribute )+
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
            	    // nesC.g:907:10: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributes8872);
            	    attribute505=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute505.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 100, attributes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "attributes"


    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // nesC.g:909:1: attribute : '@' identifier '(' initializer_list ')' ;
    public final nesCParser.attribute_return attribute() throws RecognitionException {
        nesCParser.attribute_return retval = new nesCParser.attribute_return();
        retval.start = input.LT(1);

        int attribute_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal506=null;
        Token char_literal508=null;
        Token char_literal510=null;
        nesCParser.identifier_return identifier507 =null;

        nesCParser.initializer_list_return initializer_list509 =null;


        Object char_literal506_tree=null;
        Object char_literal508_tree=null;
        Object char_literal510_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

            // nesC.g:910:5: ( '@' identifier '(' initializer_list ')' )
            // nesC.g:910:10: '@' identifier '(' initializer_list ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal506=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute8892); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal506_tree = 
            (Object)adaptor.create(char_literal506)
            ;
            adaptor.addChild(root_0, char_literal506_tree);
            }

            pushFollow(FOLLOW_identifier_in_attribute8894);
            identifier507=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier507.getTree());

            char_literal508=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_attribute8896); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal508_tree = 
            (Object)adaptor.create(char_literal508)
            ;
            adaptor.addChild(root_0, char_literal508_tree);
            }

            pushFollow(FOLLOW_initializer_list_in_attribute8898);
            initializer_list509=initializer_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer_list509.getTree());

            char_literal510=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_attribute8900); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal510_tree = 
            (Object)adaptor.create(char_literal510)
            ;
            adaptor.addChild(root_0, char_literal510_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 101, attribute_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class gcc_attributes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gcc_attributes"
    // nesC.g:915:1: gcc_attributes : GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' ;
    public final nesCParser.gcc_attributes_return gcc_attributes() throws RecognitionException {
        nesCParser.gcc_attributes_return retval = new nesCParser.gcc_attributes_return();
        retval.start = input.LT(1);

        int gcc_attributes_StartIndex = input.index();

        Object root_0 = null;

        Token GCCATTRIBUTE511=null;
        Token char_literal512=null;
        Token char_literal513=null;
        Token char_literal515=null;
        Token char_literal516=null;
        nesCParser.gcc_attribute_list_return gcc_attribute_list514 =null;


        Object GCCATTRIBUTE511_tree=null;
        Object char_literal512_tree=null;
        Object char_literal513_tree=null;
        Object char_literal515_tree=null;
        Object char_literal516_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

            // nesC.g:916:5: ( GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' )
            // nesC.g:916:10: GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')'
            {
            root_0 = (Object)adaptor.nil();


            GCCATTRIBUTE511=(Token)match(input,GCCATTRIBUTE,FOLLOW_GCCATTRIBUTE_in_gcc_attributes8918); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GCCATTRIBUTE511_tree = 
            (Object)adaptor.create(GCCATTRIBUTE511)
            ;
            adaptor.addChild(root_0, GCCATTRIBUTE511_tree);
            }

            char_literal512=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes8920); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal512_tree = 
            (Object)adaptor.create(char_literal512)
            ;
            adaptor.addChild(root_0, char_literal512_tree);
            }

            char_literal513=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes8922); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal513_tree = 
            (Object)adaptor.create(char_literal513)
            ;
            adaptor.addChild(root_0, char_literal513_tree);
            }

            pushFollow(FOLLOW_gcc_attribute_list_in_gcc_attributes8924);
            gcc_attribute_list514=gcc_attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute_list514.getTree());

            char_literal515=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes8926); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal515_tree = 
            (Object)adaptor.create(char_literal515)
            ;
            adaptor.addChild(root_0, char_literal515_tree);
            }

            char_literal516=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes8928); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal516_tree = 
            (Object)adaptor.create(char_literal516)
            ;
            adaptor.addChild(root_0, char_literal516_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 102, gcc_attributes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "gcc_attributes"


    public static class gcc_attribute_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gcc_attribute_list"
    // nesC.g:918:1: gcc_attribute_list : ( gcc_attribute )? ( ',' gcc_attribute )* ;
    public final nesCParser.gcc_attribute_list_return gcc_attribute_list() throws RecognitionException {
        nesCParser.gcc_attribute_list_return retval = new nesCParser.gcc_attribute_list_return();
        retval.start = input.LT(1);

        int gcc_attribute_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal518=null;
        nesCParser.gcc_attribute_return gcc_attribute517 =null;

        nesCParser.gcc_attribute_return gcc_attribute519 =null;


        Object char_literal518_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

            // nesC.g:919:5: ( ( gcc_attribute )? ( ',' gcc_attribute )* )
            // nesC.g:919:10: ( gcc_attribute )? ( ',' gcc_attribute )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:919:10: ( gcc_attribute )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==AMP||LA146_0==BITCOMPLEMENT||LA146_0==CALL||LA146_0==CHARACTER_LITERAL||LA146_0==CONSTANT||LA146_0==LPARENS||LA146_0==MINUS||LA146_0==MINUSMINUS||LA146_0==NOT||LA146_0==PLUS||LA146_0==PLUSPLUS||LA146_0==POST||LA146_0==RAW_IDENTIFIER||LA146_0==SIGNAL||LA146_0==SIZEOF||LA146_0==STAR||LA146_0==STRING_LITERAL) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // nesC.g:919:10: gcc_attribute
                    {
                    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list8943);
                    gcc_attribute517=gcc_attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute517.getTree());

                    }
                    break;

            }


            // nesC.g:919:25: ( ',' gcc_attribute )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==COMMA) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // nesC.g:919:26: ',' gcc_attribute
            	    {
            	    char_literal518=(Token)match(input,COMMA,FOLLOW_COMMA_in_gcc_attribute_list8947); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal518_tree = 
            	    (Object)adaptor.create(char_literal518)
            	    ;
            	    adaptor.addChild(root_0, char_literal518_tree);
            	    }

            	    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list8949);
            	    gcc_attribute519=gcc_attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute519.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 103, gcc_attribute_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "gcc_attribute_list"


    public static class gcc_attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gcc_attribute"
    // nesC.g:921:1: gcc_attribute : assignment_expression ;
    public final nesCParser.gcc_attribute_return gcc_attribute() throws RecognitionException {
        nesCParser.gcc_attribute_return retval = new nesCParser.gcc_attribute_return();
        retval.start = input.LT(1);

        int gcc_attribute_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.assignment_expression_return assignment_expression520 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

            // nesC.g:922:5: ( assignment_expression )
            // nesC.g:922:10: assignment_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_gcc_attribute8966);
            assignment_expression520=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression520.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 104, gcc_attribute_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "gcc_attribute"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // nesC.g:924:1: identifier : id= RAW_IDENTIFIER {...}?;
    public final nesCParser.identifier_return identifier() throws RecognitionException {
        nesCParser.identifier_return retval = new nesCParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

            // nesC.g:925:5: (id= RAW_IDENTIFIER {...}?)
            // nesC.g:925:9: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier8982); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 105, identifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifier"

    // $ANTLR start synpred24_nesC
    public final void synpred24_nesC_fragment() throws RecognitionException {
        // nesC.g:286:10: ( SIZEOF '(' type_name ')' )
        // nesC.g:286:10: SIZEOF '(' type_name ')'
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred24_nesC3220); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred24_nesC3222); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred24_nesC3224);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred24_nesC3226); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_nesC

    // $ANTLR start synpred25_nesC
    public final void synpred25_nesC_fragment() throws RecognitionException {
        // nesC.g:287:10: ( SIZEOF unary_expression )
        // nesC.g:287:10: SIZEOF unary_expression
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred25_nesC3245); if (state.failed) return ;

        pushFollow(FOLLOW_unary_expression_in_synpred25_nesC3247);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_nesC

    // $ANTLR start synpred26_nesC
    public final void synpred26_nesC_fragment() throws RecognitionException {
        // nesC.g:295:10: ( '(' type_name ')' cast_expression )
        // nesC.g:295:10: '(' type_name ')' cast_expression
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred26_nesC3290); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred26_nesC3292);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred26_nesC3294); if (state.failed) return ;

        pushFollow(FOLLOW_cast_expression_in_synpred26_nesC3296);
        cast_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred26_nesC

    // $ANTLR start synpred56_nesC
    public final void synpred56_nesC_fragment() throws RecognitionException {
        // nesC.g:332:10: ( unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression )
        // nesC.g:332:10: unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression
        {
        pushFollow(FOLLOW_unary_expression_in_synpred56_nesC3698);
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


        pushFollow(FOLLOW_assignment_expression_in_synpred56_nesC3755);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_nesC

    // $ANTLR start synpred57_nesC
    public final void synpred57_nesC_fragment() throws RecognitionException {
        // nesC.g:336:33: ( ',' assignment_expression )
        // nesC.g:336:33: ',' assignment_expression
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred57_nesC3788); if (state.failed) return ;

        pushFollow(FOLLOW_assignment_expression_in_synpred57_nesC3791);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_nesC

    // $ANTLR start synpred60_nesC
    public final void synpred60_nesC_fragment() throws RecognitionException {
        // nesC.g:361:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )
        // nesC.g:361:10: declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred60_nesC3876);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:365:33: ( gcc_attributes )?
        int alt149=2;
        int LA149_0 = input.LA(1);

        if ( (LA149_0==GCCATTRIBUTE) ) {
            alt149=1;
        }
        switch (alt149) {
            case 1 :
                // nesC.g:365:33: gcc_attributes
                {
                pushFollow(FOLLOW_gcc_attributes_in_synpred60_nesC3878);
                gcc_attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // nesC.g:365:49: ( init_declarator_list )?
        int alt150=2;
        int LA150_0 = input.LA(1);

        if ( (LA150_0==LPARENS||LA150_0==RAW_IDENTIFIER||LA150_0==STAR) ) {
            alt150=1;
        }
        switch (alt150) {
            case 1 :
                // nesC.g:365:49: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred60_nesC3881);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,186,FOLLOW_186_in_synpred60_nesC3884); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_nesC

    // $ANTLR start synpred61_nesC
    public final void synpred61_nesC_fragment() throws RecognitionException {
        // nesC.g:374:10: ( function_definition )
        // nesC.g:374:10: function_definition
        {
        pushFollow(FOLLOW_function_definition_in_synpred61_nesC3946);
        function_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred61_nesC

    // $ANTLR start synpred65_nesC
    public final void synpred65_nesC_fragment() throws RecognitionException {
        // nesC.g:394:11: ( type_specifier )
        // nesC.g:394:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred65_nesC4077);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred65_nesC

    // $ANTLR start synpred109_nesC
    public final void synpred109_nesC_fragment() throws RecognitionException {
        // nesC.g:456:10: ( struct_or_union ( identifier )? '{' struct_declaration_list '}' )
        // nesC.g:456:10: struct_or_union ( identifier )? '{' struct_declaration_list '}'
        {
        pushFollow(FOLLOW_struct_or_union_in_synpred109_nesC4782);
        struct_or_union();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:456:26: ( identifier )?
        int alt151=2;
        int LA151_0 = input.LA(1);

        if ( (LA151_0==RAW_IDENTIFIER) ) {
            alt151=1;
        }
        switch (alt151) {
            case 1 :
                // nesC.g:456:26: identifier
                {
                pushFollow(FOLLOW_identifier_in_synpred109_nesC4784);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred109_nesC4787); if (state.failed) return ;

        pushFollow(FOLLOW_struct_declaration_list_in_synpred109_nesC4789);
        struct_declaration_list();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACE,FOLLOW_RBRACE_in_synpred109_nesC4791); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred109_nesC

    // $ANTLR start synpred110_nesC
    public final void synpred110_nesC_fragment() throws RecognitionException {
        // nesC.g:458:10: ( struct_or_union identifier )
        // nesC.g:458:10: struct_or_union identifier
        {
        pushFollow(FOLLOW_struct_or_union_in_synpred110_nesC4825);
        struct_or_union();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred110_nesC4827);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred110_nesC

    // $ANTLR start synpred111_nesC
    public final void synpred111_nesC_fragment() throws RecognitionException {
        // nesC.g:460:10: ( STRUCT '@' identifier '{' struct_declaration_list '}' )
        // nesC.g:460:10: STRUCT '@' identifier '{' struct_declaration_list '}'
        {
        match(input,STRUCT,FOLLOW_STRUCT_in_synpred111_nesC4858); if (state.failed) return ;

        match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_synpred111_nesC4860); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred111_nesC4862);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred111_nesC4864); if (state.failed) return ;

        pushFollow(FOLLOW_struct_declaration_list_in_synpred111_nesC4866);
        struct_declaration_list();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACE,FOLLOW_RBRACE_in_synpred111_nesC4868); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_nesC

    // $ANTLR start synpred116_nesC
    public final void synpred116_nesC_fragment() throws RecognitionException {
        // nesC.g:486:11: ( type_specifier )
        // nesC.g:486:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred116_nesC5075);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred116_nesC

    // $ANTLR start synpred120_nesC
    public final void synpred120_nesC_fragment() throws RecognitionException {
        // nesC.g:497:10: ( ( declarator )? ':' constant_expression )
        // nesC.g:497:10: ( declarator )? ':' constant_expression
        {
        // nesC.g:497:10: ( declarator )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( (LA152_0==LPARENS||LA152_0==RAW_IDENTIFIER||LA152_0==STAR) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // nesC.g:497:10: declarator
                {
                pushFollow(FOLLOW_declarator_in_synpred120_nesC5140);
                declarator();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,185,FOLLOW_185_in_synpred120_nesC5143); if (state.failed) return ;

        pushFollow(FOLLOW_constant_expression_in_synpred120_nesC5145);
        constant_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_nesC

    // $ANTLR start synpred123_nesC
    public final void synpred123_nesC_fragment() throws RecognitionException {
        // nesC.g:501:10: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' )
        // nesC.g:501:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred123_nesC5175); if (state.failed) return ;

        // nesC.g:501:15: ( identifier )?
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==RAW_IDENTIFIER) ) {
            alt153=1;
        }
        switch (alt153) {
            case 1 :
                // nesC.g:501:15: identifier
                {
                pushFollow(FOLLOW_identifier_in_synpred123_nesC5177);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred123_nesC5180); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred123_nesC5182);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:501:47: ( ',' )?
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==COMMA) ) {
            alt154=1;
        }
        switch (alt154) {
            case 1 :
                // nesC.g:501:47: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred123_nesC5184); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred123_nesC5187); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred123_nesC

    // $ANTLR start synpred125_nesC
    public final void synpred125_nesC_fragment() throws RecognitionException {
        // nesC.g:503:10: ( ENUM identifier attributes '{' enumerator_list ( ',' )? '}' )
        // nesC.g:503:10: ENUM identifier attributes '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred125_nesC5222); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred125_nesC5224);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_attributes_in_synpred125_nesC5226);
        attributes();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred125_nesC5228); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred125_nesC5230);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:503:57: ( ',' )?
        int alt155=2;
        int LA155_0 = input.LA(1);

        if ( (LA155_0==COMMA) ) {
            alt155=1;
        }
        switch (alt155) {
            case 1 :
                // nesC.g:503:57: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred125_nesC5232); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred125_nesC5235); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred125_nesC

    // $ANTLR start synpred135_nesC
    public final void synpred135_nesC_fragment() throws RecognitionException {
        // nesC.g:553:9: ( '[' ( constant_expression )? ']' )
        // nesC.g:553:9: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred135_nesC5558); if (state.failed) return ;

        // nesC.g:553:13: ( constant_expression )?
        int alt157=2;
        int LA157_0 = input.LA(1);

        if ( (LA157_0==AMP||LA157_0==BITCOMPLEMENT||LA157_0==CALL||LA157_0==CHARACTER_LITERAL||LA157_0==CONSTANT||LA157_0==LPARENS||LA157_0==MINUS||LA157_0==MINUSMINUS||LA157_0==NOT||LA157_0==PLUS||LA157_0==PLUSPLUS||LA157_0==POST||LA157_0==RAW_IDENTIFIER||LA157_0==SIGNAL||LA157_0==SIZEOF||LA157_0==STAR||LA157_0==STRING_LITERAL) ) {
            alt157=1;
        }
        switch (alt157) {
            case 1 :
                // nesC.g:553:13: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred135_nesC5560);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred135_nesC5563); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred135_nesC

    // $ANTLR start synpred145_nesC
    public final void synpred145_nesC_fragment() throws RecognitionException {
        // nesC.g:588:10: ( declaration_specifiers declarator ( attributes )? )
        // nesC.g:588:10: declaration_specifiers declarator ( attributes )?
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred145_nesC5832);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_declarator_in_synpred145_nesC5834);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:588:44: ( attributes )?
        int alt160=2;
        int LA160_0 = input.LA(1);

        if ( (LA160_0==ATTRIBUTE) ) {
            alt160=1;
        }
        switch (alt160) {
            case 1 :
                // nesC.g:588:44: attributes
                {
                pushFollow(FOLLOW_attributes_in_synpred145_nesC5836);
                attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred145_nesC

    // $ANTLR start synpred150_nesC
    public final void synpred150_nesC_fragment() throws RecognitionException {
        // nesC.g:600:10: ( ( pointer )? direct_abstract_declarator )
        // nesC.g:600:10: ( pointer )? direct_abstract_declarator
        {
        // nesC.g:600:10: ( pointer )?
        int alt161=2;
        int LA161_0 = input.LA(1);

        if ( (LA161_0==STAR) ) {
            alt161=1;
        }
        switch (alt161) {
            case 1 :
                // nesC.g:600:10: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred150_nesC5971);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred150_nesC5974);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred150_nesC

    // $ANTLR start synpred154_nesC
    public final void synpred154_nesC_fragment() throws RecognitionException {
        // nesC.g:606:15: ( parameter_type_list )
        // nesC.g:606:15: parameter_type_list
        {
        pushFollow(FOLLOW_parameter_type_list_in_synpred154_nesC6047);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred154_nesC

    // $ANTLR start synpred157_nesC
    public final void synpred157_nesC_fragment() throws RecognitionException {
        // nesC.g:607:52: ( parameter_type_list )
        // nesC.g:607:52: parameter_type_list
        {
        pushFollow(FOLLOW_parameter_type_list_in_synpred157_nesC6080);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred157_nesC

    // $ANTLR start synpred172_nesC
    public final void synpred172_nesC_fragment() throws RecognitionException {
        // nesC.g:659:10: ( declaration )
        // nesC.g:659:10: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred172_nesC6502);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred172_nesC

    // $ANTLR start synpred174_nesC
    public final void synpred174_nesC_fragment() throws RecognitionException {
        // nesC.g:670:43: ( ELSE statement )
        // nesC.g:670:43: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred174_nesC6578); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred174_nesC6580);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred174_nesC

    // $ANTLR start synpred187_nesC
    public final void synpred187_nesC_fragment() throws RecognitionException {
        // nesC.g:717:38: ( CONSTANT )
        // nesC.g:717:38: CONSTANT
        {
        match(input,CONSTANT,FOLLOW_CONSTANT_in_synpred187_nesC7020); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred187_nesC

    // $ANTLR start synpred190_nesC
    public final void synpred190_nesC_fragment() throws RecognitionException {
        // nesC.g:732:10: ( ( translation_unit )? interface_definition )
        // nesC.g:732:10: ( translation_unit )? interface_definition
        {
        // nesC.g:732:10: ( translation_unit )?
        int alt166=2;
        int LA166_0 = input.LA(1);

        if ( (LA166_0==ASYNC||LA166_0==AUTO||LA166_0==CHAR||LA166_0==COMMAND||LA166_0==CONST||LA166_0==DEFAULT||(LA166_0 >= DOUBLE && LA166_0 <= DUTY)||LA166_0==ENUM||(LA166_0 >= EVENT && LA166_0 <= EXTERN)||LA166_0==FLOAT||LA166_0==HASH||(LA166_0 >= INLINE && LA166_0 <= INT8_T)||LA166_0==LONG||LA166_0==NORACE||(LA166_0 >= NXLE_UINT16_T && LA166_0 <= NX_UNION)||LA166_0==RAW_IDENTIFIER||LA166_0==REGISTER||LA166_0==RESTRICT||LA166_0==SHORT||LA166_0==SIGNED||LA166_0==STATIC||LA166_0==STRUCT||(LA166_0 >= TASK && LA166_0 <= UINT8_T)||(LA166_0 >= UNION && LA166_0 <= UNSIGNED)||(LA166_0 >= VOID && LA166_0 <= VOLATILE)) ) {
            alt166=1;
        }
        switch (alt166) {
            case 1 :
                // nesC.g:732:10: translation_unit
                {
                pushFollow(FOLLOW_translation_unit_in_synpred190_nesC7104);
                translation_unit();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_interface_definition_in_synpred190_nesC7107);
        interface_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred190_nesC

    // $ANTLR start synpred206_nesC
    public final void synpred206_nesC_fragment() throws RecognitionException {
        // nesC.g:768:10: ( module_implementation )
        // nesC.g:768:10: module_implementation
        {
        pushFollow(FOLLOW_module_implementation_in_synpred206_nesC7453);
        module_implementation();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred206_nesC

    // $ANTLR start synpred219_nesC
    public final void synpred219_nesC_fragment() throws RecognitionException {
        // nesC.g:840:10: ( expression )
        // nesC.g:840:10: expression
        {
        pushFollow(FOLLOW_expression_in_synpred219_nesC8128);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred219_nesC

    // $ANTLR start synpred220_nesC
    public final void synpred220_nesC_fragment() throws RecognitionException {
        // nesC.g:848:10: ( endpoint '=' endpoint ';' )
        // nesC.g:848:10: endpoint '=' endpoint ';'
        {
        pushFollow(FOLLOW_endpoint_in_synpred220_nesC8158);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred220_nesC8160); if (state.failed) return ;

        pushFollow(FOLLOW_endpoint_in_synpred220_nesC8162);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,186,FOLLOW_186_in_synpred220_nesC8164); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred220_nesC

    // $ANTLR start synpred222_nesC
    public final void synpred222_nesC_fragment() throws RecognitionException {
        // nesC.g:850:10: ( ( certificate_specification )? endpoint '->' endpoint ';' )
        // nesC.g:850:10: ( certificate_specification )? endpoint '->' endpoint ';'
        {
        // nesC.g:850:10: ( certificate_specification )?
        int alt168=2;
        int LA168_0 = input.LA(1);

        if ( (LA168_0==ENABLE) ) {
            alt168=1;
        }
        switch (alt168) {
            case 1 :
                // nesC.g:850:10: certificate_specification
                {
                pushFollow(FOLLOW_certificate_specification_in_synpred222_nesC8200);
                certificate_specification();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_endpoint_in_synpred222_nesC8203);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,ARROW,FOLLOW_ARROW_in_synpred222_nesC8205); if (state.failed) return ;

        pushFollow(FOLLOW_endpoint_in_synpred222_nesC8207);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,186,FOLLOW_186_in_synpred222_nesC8209); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred222_nesC

    // Delegated rules

    public final boolean synpred116_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred157_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred157_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred220_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred220_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred123_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred123_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred174_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred174_nesC_fragment(); // can never throw exception
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
    public final boolean synpred109_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred187_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred187_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred222_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred222_nesC_fragment(); // can never throw exception
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
    public final boolean synpred125_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_nesC_fragment(); // can never throw exception
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
    public final boolean synpred65_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_nesC_fragment(); // can never throw exception
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
    public final boolean synpred145_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred145_nesC_fragment(); // can never throw exception
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
    public final boolean synpred120_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred219_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred219_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_nesC_fragment(); // can never throw exception
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
    public final boolean synpred206_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred206_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred150_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred150_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred172_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred172_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA61 dfa61 = new DFA61(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA111 dfa111 = new DFA111(this);
    protected DFA129 dfa129 = new DFA129(this);
    static final String DFA61_eotS =
        "\5\uffff";
    static final String DFA61_eofS =
        "\1\uffff\2\4\2\uffff";
    static final String DFA61_minS =
        "\1\u00a3\2\36\2\uffff";
    static final String DFA61_maxS =
        "\1\u00a3\2\u00b5\2\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA61_specialS =
        "\5\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1",
            "\1\4\13\uffff\1\2\43\uffff\1\4\23\uffff\1\4\4\uffff\1\4\51"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "\1\4\13\uffff\1\2\43\uffff\1\4\23\uffff\1\4\4\uffff\1\4\51"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "562:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
    static final String DFA85_eotS =
        "\77\uffff";
    static final String DFA85_eofS =
        "\77\uffff";
    static final String DFA85_minS =
        "\1\6\35\uffff\1\0\2\uffff\1\0\35\uffff";
    static final String DFA85_maxS =
        "\1\u00ba\35\uffff\1\0\2\uffff\1\0\35\uffff";
    static final String DFA85_acceptS =
        "\1\uffff\1\1\41\uffff\1\2\33\uffff";
    static final String DFA85_specialS =
        "\36\uffff\1\0\2\uffff\1\1\35\uffff}>";
    static final String[] DFA85_transitionS = {
            "\1\43\7\uffff\1\1\1\43\1\uffff\1\1\1\uffff\1\43\4\uffff\3\43"+
            "\1\uffff\1\1\1\43\1\uffff\1\1\12\uffff\1\1\2\43\6\uffff\1\41"+
            "\4\uffff\1\43\1\uffff\2\1\3\uffff\1\1\2\uffff\2\1\1\uffff\1"+
            "\1\1\43\6\uffff\1\43\2\uffff\1\43\3\uffff\1\43\3\uffff\6\1\3"+
            "\uffff\1\43\4\uffff\1\1\1\43\2\uffff\1\43\1\uffff\1\43\5\uffff"+
            "\1\1\1\43\5\uffff\12\1\3\uffff\1\43\1\uffff\1\43\1\uffff\1\43"+
            "\6\uffff\1\36\2\uffff\1\1\2\uffff\1\1\1\43\3\uffff\1\1\1\43"+
            "\1\1\1\43\3\uffff\1\43\1\uffff\1\1\1\43\1\1\1\43\6\1\2\uffff"+
            "\2\1\1\uffff\2\1\1\43\3\uffff\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "658:1: block_item : ( declaration | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_30 = input.LA(1);

                         
                        int index85_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred172_nesC()) ) {s = 1;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index85_30);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA85_33 = input.LA(1);

                         
                        int index85_33 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred172_nesC()) ) {s = 1;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index85_33);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA111_eotS =
        "\14\uffff";
    static final String DFA111_eofS =
        "\14\uffff";
    static final String DFA111_minS =
        "\1\125\1\141\1\16\1\uffff\1\12\1\53\1\uffff\1\u00a6\2\16\2\0";
    static final String DFA111_maxS =
        "\1\125\1\141\1\u00b5\1\uffff\1\u00bb\1\53\1\uffff\1\u00a6\2\u00b5"+
        "\2\0";
    static final String DFA111_acceptS =
        "\3\uffff\1\1\2\uffff\1\2\5\uffff";
    static final String DFA111_specialS =
        "\12\uffff\1\0\1\1}>";
    static final String[] DFA111_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff\1\3\3\uffff\1\6\6\uffff"+
            "\1\3\10\uffff\1\3\6\uffff\2\3\2\uffff\1\6\1\3\2\uffff\2\3\1"+
            "\uffff\1\3\12\uffff\1\5\7\uffff\6\3\4\uffff\1\6\3\uffff\1\3"+
            "\13\uffff\1\3\6\uffff\12\3\16\uffff\1\4\1\6\1\uffff\1\3\2\uffff"+
            "\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\6\3\2\uffff\2\3\1\uffff\2\3",
            "",
            "\1\6\1\uffff\1\6\1\uffff\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff"+
            "\1\3\12\uffff\1\3\10\uffff\1\3\5\uffff\1\6\2\3\3\uffff\1\3\2"+
            "\uffff\2\3\1\uffff\1\3\5\uffff\1\3\14\uffff\6\3\4\uffff\1\6"+
            "\3\uffff\2\3\12\uffff\1\3\6\uffff\12\3\16\uffff\1\3\2\uffff"+
            "\1\3\2\uffff\1\3\4\uffff\1\3\1\uffff\1\3\4\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\4\3\2\uffff\2\3\1\uffff"+
            "\2\3\4\uffff\1\3\1\6",
            "\1\7",
            "",
            "\1\10",
            "\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff\1\3\3\uffff\1\6\6\uffff"+
            "\1\3\1\11\7\uffff\1\3\6\uffff\2\3\2\uffff\1\6\1\3\2\uffff\2"+
            "\3\1\uffff\1\3\12\uffff\1\5\7\uffff\6\3\4\uffff\1\6\3\uffff"+
            "\1\3\13\uffff\1\3\6\uffff\12\3\16\uffff\1\4\1\12\1\uffff\1\3"+
            "\2\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3"+
            "\1\uffff\6\3\2\uffff\2\3\1\uffff\2\3",
            "\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff\1\3\3\uffff\1\6\6\uffff"+
            "\1\3\10\uffff\1\3\6\uffff\2\3\2\uffff\1\6\1\3\2\uffff\2\3\1"+
            "\uffff\1\3\12\uffff\1\5\7\uffff\6\3\4\uffff\1\6\3\uffff\1\3"+
            "\13\uffff\1\3\6\uffff\12\3\16\uffff\1\4\1\13\1\uffff\1\3\2\uffff"+
            "\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\6\3\2\uffff\2\3\1\uffff\2\3",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA111_eot = DFA.unpackEncodedString(DFA111_eotS);
    static final short[] DFA111_eof = DFA.unpackEncodedString(DFA111_eofS);
    static final char[] DFA111_min = DFA.unpackEncodedStringToUnsignedChars(DFA111_minS);
    static final char[] DFA111_max = DFA.unpackEncodedStringToUnsignedChars(DFA111_maxS);
    static final short[] DFA111_accept = DFA.unpackEncodedString(DFA111_acceptS);
    static final short[] DFA111_special = DFA.unpackEncodedString(DFA111_specialS);
    static final short[][] DFA111_transition;

    static {
        int numStates = DFA111_transitionS.length;
        DFA111_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA111_transition[i] = DFA.unpackEncodedString(DFA111_transitionS[i]);
        }
    }

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = DFA111_eot;
            this.eof = DFA111_eof;
            this.min = DFA111_min;
            this.max = DFA111_max;
            this.accept = DFA111_accept;
            this.special = DFA111_special;
            this.transition = DFA111_transition;
        }
        public String getDescription() {
            return "767:1: implementation : ( module_implementation | configuration_implementation );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA111_10 = input.LA(1);

                         
                        int index111_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred206_nesC()) ) {s = 3;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index111_10);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA111_11 = input.LA(1);

                         
                        int index111_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred206_nesC()) ) {s = 3;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index111_11);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 111, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA129_eotS =
        "\13\uffff";
    static final String DFA129_eofS =
        "\13\uffff";
    static final String DFA129_minS =
        "\1\142\1\12\2\u0091\2\uffff\1\u0093\2\12\1\u0091\1\12";
    static final String DFA129_maxS =
        "\1\u0091\1\u00bb\2\u0091\2\uffff\1\u0093\2\u00bb\1\u0091\1\u00bb";
    static final String DFA129_acceptS =
        "\4\uffff\1\1\1\2\5\uffff";
    static final String DFA129_specialS =
        "\13\uffff}>";
    static final String[] DFA129_transitionS = {
            "\1\2\56\uffff\1\1",
            "\1\4\1\uffff\1\4\54\uffff\1\3\50\uffff\1\5\127\uffff\2\4",
            "\1\6",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\4\1\uffff\1\4\54\uffff\1\3\50\uffff\1\5\127\uffff\2\4",
            "\1\4\1\uffff\1\4\54\uffff\1\11\50\uffff\1\5\127\uffff\2\4",
            "\1\12",
            "\1\4\1\uffff\1\4\54\uffff\1\11\50\uffff\1\5\127\uffff\2\4"
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
            return "859:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );";
        }
    }
 

    public static final BitSet FOLLOW_identifier_in_primary_expression2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_primary_expression2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_primary_expression2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_primary_expression2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_primary_expression2793 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_expression_in_primary_expression2795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_primary_expression2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_kind_in_postfix_expression2822 = new BitSet(new long[]{0x0000080020000000L,0x0000008000000000L,0x0000004000020000L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression2825 = new BitSet(new long[]{0x0200000000000402L,0x0000108400000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_postfix_expression_modifier_in_postfix_expression2827 = new BitSet(new long[]{0x0200000000000402L,0x0000108400000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LBRACKET_in_postfix_expression_modifier2868 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_expression_in_postfix_expression_modifier2870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RBRACKET_in_postfix_expression_modifier2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression_modifier2890 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A2020540L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression_modifier2892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression_modifier2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression_modifier2914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_postfix_expression_modifier2934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_postfix_expression_modifier2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_postfix_expression_modifier2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3024 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list3027 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3030 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unary_expression3051 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_unary_expression3072 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_unary_expression3093 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression3120 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression3146 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression3173 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITCOMPLEMENT_in_unary_expression3200 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_NOT_in_unary_expression3205 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3220 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_unary_expression3222 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_type_name_in_unary_expression3224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_unary_expression3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3245 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_cast_expression3290 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_type_name_in_cast_expression3292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_cast_expression3294 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3336 = new BitSet(new long[]{0x0080000000000002L,0x0000800000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression3341 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expression3346 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_MODULUS_in_multiplicative_expression3351 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3355 = new BitSet(new long[]{0x0080000000000002L,0x0000800000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3376 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression3381 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression3386 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3390 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3411 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression3416 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression3421 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3425 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3446 = new BitSet(new long[]{0x0000000000000002L,0x000000180000C000L});
    public static final BitSet FOLLOW_LESS_in_relational_expression3451 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression3456 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_LESSEQUAL_in_relational_expression3461 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_relational_expression3466 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3470 = new BitSet(new long[]{0x0000000000000002L,0x000000180000C000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3491 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_equality_expression3496 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equality_expression3501 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3505 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3526 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMP_in_and_expression3530 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3533 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3554 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_BITXOR_in_xor_expression3558 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3561 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3582 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BITOR_in_or_expression3586 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3589 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3610 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression3614 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3617 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3638 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression3642 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression3666 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_conditional_expression3669 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_expression_in_conditional_expression3672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_185_in_conditional_expression3674 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_assignment_expression3698 = new BitSet(new long[]{0x0040000000A41000L,0x00012A0000000000L,0x0000000008000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_expression3701 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_MULASSIGN_in_assignment_expression3706 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_DIVASSIGN_in_assignment_expression3711 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_MODASSIGN_in_assignment_expression3716 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_PLUSASSIGN_in_assignment_expression3721 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_MINUSASSIGN_in_assignment_expression3726 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_LSHIFTASSIGN_in_assignment_expression3731 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_RSHIFTASSIGN_in_assignment_expression3736 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_BITANDASSIGN_in_assignment_expression3741 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_BITXORASSIGN_in_assignment_expression3746 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_BITORASSIGN_in_assignment_expression3751 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3785 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_expression3788 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3791 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3876 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000800L,0x0400000800020000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration3878 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0400000800020000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_declaration3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration3991 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F00002CL,0x00367AA050920007L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3993 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000800L,0x0000000800020000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration3995 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000800020000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L,0x0400000000000000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_declaration4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers4063 = new BitSet(new long[]{0x8C08040090024002L,0xFE0400403F00002CL,0x00367AA050920007L});
    public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers4077 = new BitSet(new long[]{0x8C08040090024002L,0xFE0400403F00002CL,0x00367AA050920007L});
    public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers4100 = new BitSet(new long[]{0x8C08040090024002L,0xFE0400403F00002CL,0x00367AA050920007L});
    public static final BitSet FOLLOW_function_specifier_in_declaration_specifiers4123 = new BitSet(new long[]{0x8C08040090024002L,0xFE0400403F00002CL,0x00367AA050920007L});
    public static final BitSet FOLLOW_DEFAULT_in_declaration_specifiers4142 = new BitSet(new long[]{0x8C08040090024002L,0xFE0400403F00002CL,0x00367AA050920007L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4165 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list4168 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000800020000L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4170 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator4204 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_attributes_in_init_declarator4206 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator4210 = new BitSet(new long[]{0x0000080022080040L,0x0008148200000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_initializer_in_init_declarator4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_type_specifier4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT64_T_in_type_specifier4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT64_T_in_type_specifier4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT64_T_in_type_specifier4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT8_T_in_type_specifier4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT16_T_in_type_specifier4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT32_T_in_type_specifier4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT64_T_in_type_specifier4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4782 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4784 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4787 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_struct_or_union_specifier4858 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_struct_or_union_specifier4860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4862 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4864 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4903 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_struct_or_union_specifier4905 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4907 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list4993 = new BitSet(new long[]{0x8400040010000002L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration5024 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0200000800020000L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration5026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_struct_declaration5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list5075 = new BitSet(new long[]{0x8400040010000002L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list5079 = new BitSet(new long[]{0x8400040010000002L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5105 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list5108 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0200000800020000L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5110 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_185_in_struct_declarator5143 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5175 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5177 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5182 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5224 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_enum_specifier5226 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5230 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5313 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list5316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5319 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_identifier_in_enumerator5344 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator5347 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_function_specifier5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator5436 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator5464 = new BitSet(new long[]{0x0000000000000002L,0x0000008400000000L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator5466 = new BitSet(new long[]{0x0000000000000002L,0x0000008400000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5492 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier5495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier5532 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000800020000L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier5534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5558 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A00A0540L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier5560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5595 = new BitSet(new long[]{0x8C080400D0024000L,0xFE0400403F00002CL,0x00367AA050920007L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_declarator_modifier5599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5601 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier5605 = new BitSet(new long[]{0x8C080400D0024000L,0xFE0400403F00002CL,0x00367AA050920007L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_declarator_modifier5609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5651 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0020000800800000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_pointer_in_pointer5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5678 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0020000000800000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list5709 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0020000000800000L});
    public static final BitSet FOLLOW_parameter_list_in_parameter_type_list5730 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_type_list5733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_184_in_parameter_type_list5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list5760 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list5763 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F00002CL,0x00367AA050920007L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list5765 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration5832 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000800020000L});
    public static final BitSet FOLLOW_declarator_in_parameter_declaration5834 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_parameter_declaration5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration5873 = new BitSet(new long[]{0x0000000000000002L,0x0000008400000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5918 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_identifier_list5921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5923 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name5949 = new BitSet(new long[]{0x0000000000000002L,0x0000008400000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5971 = new BitSet(new long[]{0x0000000000000000L,0x0000008400000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6005 = new BitSet(new long[]{0x0000000000000000L,0x0000008400000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator6007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6012 = new BitSet(new long[]{0x0000000000000002L,0x0000008400000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator6026 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A00A0540L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator6028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator6031 = new BitSet(new long[]{0x0000000000000002L,0x0000008400000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6045 = new BitSet(new long[]{0x8C080400D0024000L,0xFE0400403F00002CL,0x00367AA052920007L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_abstract_declarator6047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6052 = new BitSet(new long[]{0x0000000000000002L,0x0000008400000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator6069 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A00A0540L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator6071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator6074 = new BitSet(new long[]{0x0000000000000002L,0x0000008400000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6078 = new BitSet(new long[]{0x8C080400D0024000L,0xFE0400403F00002CL,0x00367AA052920007L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_abstract_declarator6080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6083 = new BitSet(new long[]{0x0000000000000002L,0x0000008400000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer6163 = new BitSet(new long[]{0x0000080022080040L,0x0008148200000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_initializer_list_in_initializer6165 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COMMA_in_initializer6167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6197 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list6200 = new BitSet(new long[]{0x0000080022080040L,0x0008148200000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6202 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement6257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_statement_in_statement6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_statement6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOMIC_in_atomic_statement6336 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_atomic_statement6338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_labeled_statement6365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_185_in_labeled_statement6367 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement6390 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement6392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_185_in_labeled_statement6394 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement6417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_185_in_labeled_statement6419 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement6447 = new BitSet(new long[]{0x8D081C00B70AC040L,0xFE0C14C23F11206CL,0x04767FE8F1960547L});
    public static final BitSet FOLLOW_block_item_in_compound_statement6460 = new BitSet(new long[]{0x8D081C00B70AC040L,0xFE0C14C23F11206CL,0x04767FE8F1960547L});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_block_item6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block_item6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement6536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_expression_statement6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6567 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6569 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_expression_in_selection_statement6571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6573 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_selection_statement6575 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement6578 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_selection_statement6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement6619 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6621 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_expression_in_selection_statement6623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6625 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_selection_statement6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6673 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6675 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6679 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_iteration_statement6702 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6706 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6708 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_iteration_statement6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement6735 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6737 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x04000048A0020540L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_iteration_statement6744 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x04000048A0020540L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_iteration_statement6751 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A2020540L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6758 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_jump_statement6867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_jump_statement6869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_jump_statement6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement6890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_jump_statement6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement6907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_jump_statement6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement6924 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x04000048A0020540L});
    public static final BitSet FOLLOW_expression_in_jump_statement6926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_jump_statement6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit6965 = new BitSet(new long[]{0x8C08040090024002L,0xFE0400403F01002CL,0x00367EA050920007L});
    public static final BitSet FOLLOW_line_directive_in_translation_unit6969 = new BitSet(new long[]{0x8C08040090024002L,0xFE0400403F01002CL,0x00367EA050920007L});
    public static final BitSet FOLLOW_declaration_in_external_declaration6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive7014 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive7018 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition7048 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000800020000L});
    public static final BitSet FOLLOW_declarator_in_function_definition7050 = new BitSet(new long[]{0x0000000000010000L,0x0000000200000000L});
    public static final BitSet FOLLOW_attributes_in_function_definition7052 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7104 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_interface_definition_in_nesC_file7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7129 = new BitSet(new long[]{0x0000010400000000L,0x0000400000001000L});
    public static final BitSet FOLLOW_component_in_nesC_file7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_definition7180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_interface_definition7182 = new BitSet(new long[]{0x0000000000010000L,0x0000000A00000000L});
    public static final BitSet FOLLOW_type_parameters_in_interface_definition7184 = new BitSet(new long[]{0x0000000000010000L,0x0000000200000000L});
    public static final BitSet FOLLOW_attributes_in_interface_definition7187 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_interface_definition7198 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F01002CL,0x00367EA050960007L});
    public static final BitSet FOLLOW_declaration_in_interface_definition7211 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F01002CL,0x00367EA050960007L});
    public static final BitSet FOLLOW_line_directive_in_interface_definition7215 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F01002CL,0x00367EA050960007L});
    public static final BitSet FOLLOW_RBRACE_in_interface_definition7233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_parameters7275 = new BitSet(new long[]{0x8400000010000000L,0xFE0000403E000020L,0x0016788050020007L});
    public static final BitSet FOLLOW_type_parameter_list_in_type_parameters7277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_GREATER_in_type_parameters7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7298 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7300 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_type_parameter_list7304 = new BitSet(new long[]{0x8400000010000000L,0xFE0000403E000020L,0x0016788050020007L});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7306 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7308 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_comp_kind_in_component7329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_component7331 = new BitSet(new long[]{0x0000000000010000L,0x0000008200000000L});
    public static final BitSet FOLLOW_comp_parameters_in_component7333 = new BitSet(new long[]{0x0000000000010000L,0x0000000200000000L});
    public static final BitSet FOLLOW_attributes_in_component7336 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_component_specification_in_component7347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_implementation_in_component7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_comp_kind7386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONFIGURATION_in_comp_kind7397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_comp_kind7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_comp_kind7419 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_MODULE_in_comp_kind7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_comp_kind7432 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CONFIGURATION_in_comp_kind7434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_implementation7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_implementation_in_implementation7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_comp_parameters7483 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F00002CL,0x00367EA050920007L});
    public static final BitSet FOLLOW_component_parameter_list_in_comp_parameters7485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_comp_parameters7487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7506 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_parameter_list7509 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F00002CL,0x00367EA050920007L});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7511 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_component_parameter7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_component_parameter7543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_component_parameter7545 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_component_parameter7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_module_implementation7570 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_module_implementation7572 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F01002CL,0x00367EA050920007L});
    public static final BitSet FOLLOW_translation_unit_in_module_implementation7604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_module_implementation7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_configuration_implementation7696 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_configuration_implementation7698 = new BitSet(new long[]{0x4000000800000000L,0x0000000400010000L,0x0000000000060000L});
    public static final BitSet FOLLOW_configuration_element_list_in_configuration_implementation7730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_configuration_implementation7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_element_in_configuration_element_list7828 = new BitSet(new long[]{0x4000000800000002L,0x0000000400010000L,0x0000000000020000L});
    public static final BitSet FOLLOW_line_directive_in_configuration_element_list7832 = new BitSet(new long[]{0x4000000800000002L,0x0000000400010000L,0x0000000000020000L});
    public static final BitSet FOLLOW_components_in_configuration_element7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connection_in_configuration_element7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTS_in_components7909 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_component_line_in_components7911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_components7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_declaration_in_component_line7940 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_line7943 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_component_declaration_in_component_line7945 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_component_ref_in_component_declaration7971 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AS_in_component_declaration7974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_component_declaration7976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_component_ref8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_component_ref8025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_component_ref8027 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_component_ref8029 = new BitSet(new long[]{0x84000C0032080040L,0xFE0814C03E000020L,0x003678C8F2820547L});
    public static final BitSet FOLLOW_component_argument_list_in_component_ref8031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_ref8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8081 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_argument_list8084 = new BitSet(new long[]{0x84000C0032080040L,0xFE0814C03E000020L,0x003678C8F0820547L});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8086 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_expression_in_component_argument8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_component_argument8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endpoint_in_connection8158 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGN_in_connection8160 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_endpoint_in_connection8162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_connection8164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8200 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_endpoint_in_connection8203 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARROW_in_connection8205 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_endpoint_in_connection8207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_connection8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8248 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_endpoint_in_connection8251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_187_in_connection8253 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_endpoint_in_connection8255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_connection8257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENABLE_in_certificate_specification8300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8304 = new BitSet(new long[]{0x0000000000002800L,0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_certificate_specification8307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8311 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ASSUMING_in_certificate_specification8316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FOR_in_certificate_specification8324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8388 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_LBRACKET_in_endpoint8390 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_argument_expression_list_in_endpoint8392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RBRACKET_in_endpoint8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8413 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8418 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifier_path8452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifier_path8458 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8465 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification8514 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F01002CL,0x003E7EA050970007L});
    public static final BitSet FOLLOW_uses_provides_in_component_specification8529 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F01002CL,0x003E7EA050970007L});
    public static final BitSet FOLLOW_line_directive_in_component_specification8533 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400403F01002CL,0x003E7EA050970007L});
    public static final BitSet FOLLOW_RBRACE_in_component_specification8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides8565 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400427F00002CL,0x00367EA050B20007L});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides8586 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400427F00002CL,0x00367EA050B20007L});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_uses_provides8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list8649 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400407F00002CL,0x00367EA050B20007L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8651 = new BitSet(new long[]{0x8C08040090024000L,0xFE0400407F00002CL,0x00367EA050B60007L});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element8678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_type_in_specification_element8689 = new BitSet(new long[]{0x0000000000010800L,0x0000000400000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_AS_in_specification_element8692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_specification_element8694 = new BitSet(new long[]{0x0000000000010000L,0x0000000400000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_instance_parameters_in_specification_element8698 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_attributes_in_specification_element8701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_specification_element8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOTE_in_interface_type8751 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_type8754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_interface_type8756 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_type_arguments_in_interface_type8758 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_REQUIRES_in_interface_type8762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_interface_type8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_arguments8814 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_type_name_in_type_arguments8816 = new BitSet(new long[]{0x0000000040000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_type_arguments8819 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_type_name_in_type_arguments8821 = new BitSet(new long[]{0x0000000040000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_GREATER_in_type_arguments8825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_instance_parameters8849 = new BitSet(new long[]{0x8C080400D0024000L,0xFE0400403F00002CL,0x00367AA050920007L});
    public static final BitSet FOLLOW_parameter_type_list_in_instance_parameters8851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RBRACKET_in_instance_parameters8853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributes8872 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute8892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_attribute8894 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_attribute8896 = new BitSet(new long[]{0x0000080022080040L,0x0008148200000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_initializer_list_in_attribute8898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_attribute8900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GCCATTRIBUTE_in_gcc_attributes8918 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes8920 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes8922 = new BitSet(new long[]{0x0000080062080040L,0x0008148000000000L,0x00000048A2020540L});
    public static final BitSet FOLLOW_gcc_attribute_list_in_gcc_attributes8924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes8926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes8928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list8943 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_gcc_attribute_list8947 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list8949 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_assignment_expression_in_gcc_attribute8966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred24_nesC3220 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred24_nesC3222 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_type_name_in_synpred24_nesC3224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred24_nesC3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred25_nesC3245 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_unary_expression_in_synpred25_nesC3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred26_nesC3290 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_type_name_in_synpred26_nesC3292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred26_nesC3294 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_cast_expression_in_synpred26_nesC3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_synpred56_nesC3698 = new BitSet(new long[]{0x0040000000A41000L,0x00012A0000000000L,0x0000000008000080L});
    public static final BitSet FOLLOW_set_in_synpred56_nesC3700 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred56_nesC3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred57_nesC3788 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred57_nesC3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred60_nesC3876 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000800L,0x0400000800020000L});
    public static final BitSet FOLLOW_gcc_attributes_in_synpred60_nesC3878 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0400000800020000L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred60_nesC3881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_synpred60_nesC3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_synpred61_nesC3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred65_nesC4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_synpred109_nesC4782 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_synpred109_nesC4784 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred109_nesC4787 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_struct_declaration_list_in_synpred109_nesC4789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred109_nesC4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_synpred110_nesC4825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_synpred110_nesC4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_synpred111_nesC4858 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_synpred111_nesC4860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_synpred111_nesC4862 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred111_nesC4864 = new BitSet(new long[]{0x8400040010000000L,0xFE0000403E000020L,0x0036788050820007L});
    public static final BitSet FOLLOW_struct_declaration_list_in_synpred111_nesC4866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred111_nesC4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred116_nesC5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred120_nesC5140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_185_in_synpred120_nesC5143 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A0020540L});
    public static final BitSet FOLLOW_constant_expression_in_synpred120_nesC5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred123_nesC5175 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_synpred123_nesC5177 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred123_nesC5180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred123_nesC5182 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COMMA_in_synpred123_nesC5184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred123_nesC5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred125_nesC5222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_identifier_in_synpred125_nesC5224 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_synpred125_nesC5226 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred125_nesC5228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred125_nesC5230 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COMMA_in_synpred125_nesC5232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred125_nesC5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred135_nesC5558 = new BitSet(new long[]{0x0000080022080040L,0x0008148000000000L,0x00000048A00A0540L});
    public static final BitSet FOLLOW_constant_expression_in_synpred135_nesC5560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred135_nesC5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred145_nesC5832 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000800020000L});
    public static final BitSet FOLLOW_declarator_in_synpred145_nesC5834 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_synpred145_nesC5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred150_nesC5971 = new BitSet(new long[]{0x0000000000000000L,0x0000008400000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred150_nesC5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred154_nesC6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred157_nesC6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred172_nesC6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred174_nesC6578 = new BitSet(new long[]{0x0108180027088040L,0x0008148200112040L,0x04400148A1020540L});
    public static final BitSet FOLLOW_statement_in_synpred174_nesC6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_synpred187_nesC7020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_synpred190_nesC7104 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_interface_definition_in_synpred190_nesC7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_synpred206_nesC7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred219_nesC8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endpoint_in_synpred220_nesC8158 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred220_nesC8160 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_endpoint_in_synpred220_nesC8162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_synpred220_nesC8164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_synpred222_nesC8200 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_endpoint_in_synpred222_nesC8203 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARROW_in_synpred222_nesC8205 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_endpoint_in_synpred222_nesC8207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_synpred222_nesC8209 = new BitSet(new long[]{0x0000000000000002L});

}