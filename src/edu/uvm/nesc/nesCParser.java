// $ANTLR 3.4 nesC.g 2013-03-27 12:45:31

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADDRESS_OF", "AMP", "AND", "ARGUMENT_LIST", "ARRAY_ELEMENT_SELECTION", "ARROW", "AS", "ASSIGN", "ASSUMING", "ASYNC", "ATOMIC", "ATTRIBUTE", "AUTO", "BITANDASSIGN", "BITCOMPLEMENT", "BITOR", "BITORASSIGN", "BITXOR", "BITXORASSIGN", "BREAK", "CALL", "CASE", "CAST", "CHAR", "CHARACTER_LITERAL", "COMMA", "COMMAND", "COMMENT1", "COMMENT2", "COMPONENT", "COMPONENTS", "COMPONENT_ARGUMENTS", "COMPONENT_DECLARATION", "COMPONENT_DEFINITION", "COMPONENT_INSTANTIATION", "COMPONENT_KIND", "COMPONENT_PARAMETER_LIST", "COMPOUND_STATEMENT", "CONFIGURATION", "CONNECTION", "CONST", "CONSTANT", "CONTINUE", "DECLARATION", "DECLARATOR", "DECLARATOR_ARRAY_MODIFIER", "DECLARATOR_LIST", "DECLARATOR_PARAMETER_LIST_MODIFIER", "DEC_NUMBER", "DEFAULT", "DEREFERENCE", "DIGIT", "DIVASSIGN", "DIVIDE", "DO", "DOT", "DOUBLE", "DUTY", "DYNAMIC_IDENTIFIER_PATH", "ELSE", "ENABLE", "ENUM", "ENUMERATOR", "EQUAL", "EVENT", "EXTERN", "FILE", "FLOAT", "FOR", "FOR_CONDITION", "FOR_INITIALIZE", "FOR_ITERATION", "FUNCTION_DEFINITION", "GCCATTRIBUTE", "GENERIC", "GOTO", "GREATER", "GREATEREQUAL", "HASH", "HEX_DIGIT", "HEX_NUMBER", "IDENTIFIER_PATH", "IF", "IMPLEMENTATION", "INITIALIZER_LIST", "INIT_DECLARATOR", "INLINE", "INT", "INT16_T", "INT32_T", "INT64_T", "INT8_T", "INTERFACE", "INTERFACE_TYPE", "LABELED_STATEMENT", "LBRACE", "LBRACKET", "LESS", "LESSEQUAL", "LINE_DIRECTIVE", "LONG", "LPARENS", "LSHIFT", "LSHIFTASSIGN", "MINUS", "MINUSASSIGN", "MINUSMINUS", "MODASSIGN", "MODULE", "MODULUS", "MULASSIGN", "NEW", "NORACE", "NOT", "NOTEQUAL", "NULL", "NUMBER", "NUMBER_PREFIX", "NUMBER_SUFFIX", "NXLE_UINT16_T", "NXLE_UINT32_T", "NXLE_UINT64_T", "NXLE_UINT8_T", "NX_STRUCT", "NX_UINT16_T", "NX_UINT32_T", "NX_UINT64_T", "NX_UINT8_T", "NX_UNION", "OR", "PARAMETER", "PARAMETER_LIST", "PLUS", "PLUSASSIGN", "PLUSPLUS", "POINTER_QUALIFIER", "POST", "POSTFIX_EXPRESSION", "POST_DECREMENT", "POST_INCREMENT", "PRE_DECREMENT", "PRE_INCREMENT", "PROVIDES", "RAW_IDENTIFIER", "RBRACE", "RBRACKET", "REGISTER", "REMOTE", "REQUIRES", "RESTRICT", "RETURN", "RPARENS", "RSHIFT", "RSHIFTASSIGN", "SHORT", "SIGNAL", "SIGNED", "SIZEOF", "SIZEOF_EXPRESSION", "SIZEOF_TYPE", "SPECIFICATION", "STAR", "STATEMENT", "STATIC", "STRING_LITERAL", "STRUCT", "SWITCH", "TASK", "TYPEDEF", "UINT16_T", "UINT32_T", "UINT64_T", "UINT8_T", "UNARY_MINUS", "UNARY_PLUS", "UNION", "UNSIGNED", "USES", "VOID", "VOLATILE", "WHILE", "WHITESPACE", "'...'", "':'", "';'", "'<-'", "'?'"
    };

    public static final int EOF=-1;
    public static final int T__187=187;
    public static final int T__188=188;
    public static final int T__189=189;
    public static final int T__190=190;
    public static final int T__191=191;
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
    public static final int COMPONENT_DEFINITION=38;
    public static final int COMPONENT_INSTANTIATION=39;
    public static final int COMPONENT_KIND=40;
    public static final int COMPONENT_PARAMETER_LIST=41;
    public static final int COMPOUND_STATEMENT=42;
    public static final int CONFIGURATION=43;
    public static final int CONNECTION=44;
    public static final int CONST=45;
    public static final int CONSTANT=46;
    public static final int CONTINUE=47;
    public static final int DECLARATION=48;
    public static final int DECLARATOR=49;
    public static final int DECLARATOR_ARRAY_MODIFIER=50;
    public static final int DECLARATOR_LIST=51;
    public static final int DECLARATOR_PARAMETER_LIST_MODIFIER=52;
    public static final int DEC_NUMBER=53;
    public static final int DEFAULT=54;
    public static final int DEREFERENCE=55;
    public static final int DIGIT=56;
    public static final int DIVASSIGN=57;
    public static final int DIVIDE=58;
    public static final int DO=59;
    public static final int DOT=60;
    public static final int DOUBLE=61;
    public static final int DUTY=62;
    public static final int DYNAMIC_IDENTIFIER_PATH=63;
    public static final int ELSE=64;
    public static final int ENABLE=65;
    public static final int ENUM=66;
    public static final int ENUMERATOR=67;
    public static final int EQUAL=68;
    public static final int EVENT=69;
    public static final int EXTERN=70;
    public static final int FILE=71;
    public static final int FLOAT=72;
    public static final int FOR=73;
    public static final int FOR_CONDITION=74;
    public static final int FOR_INITIALIZE=75;
    public static final int FOR_ITERATION=76;
    public static final int FUNCTION_DEFINITION=77;
    public static final int GCCATTRIBUTE=78;
    public static final int GENERIC=79;
    public static final int GOTO=80;
    public static final int GREATER=81;
    public static final int GREATEREQUAL=82;
    public static final int HASH=83;
    public static final int HEX_DIGIT=84;
    public static final int HEX_NUMBER=85;
    public static final int IDENTIFIER_PATH=86;
    public static final int IF=87;
    public static final int IMPLEMENTATION=88;
    public static final int INITIALIZER_LIST=89;
    public static final int INIT_DECLARATOR=90;
    public static final int INLINE=91;
    public static final int INT=92;
    public static final int INT16_T=93;
    public static final int INT32_T=94;
    public static final int INT64_T=95;
    public static final int INT8_T=96;
    public static final int INTERFACE=97;
    public static final int INTERFACE_TYPE=98;
    public static final int LABELED_STATEMENT=99;
    public static final int LBRACE=100;
    public static final int LBRACKET=101;
    public static final int LESS=102;
    public static final int LESSEQUAL=103;
    public static final int LINE_DIRECTIVE=104;
    public static final int LONG=105;
    public static final int LPARENS=106;
    public static final int LSHIFT=107;
    public static final int LSHIFTASSIGN=108;
    public static final int MINUS=109;
    public static final int MINUSASSIGN=110;
    public static final int MINUSMINUS=111;
    public static final int MODASSIGN=112;
    public static final int MODULE=113;
    public static final int MODULUS=114;
    public static final int MULASSIGN=115;
    public static final int NEW=116;
    public static final int NORACE=117;
    public static final int NOT=118;
    public static final int NOTEQUAL=119;
    public static final int NULL=120;
    public static final int NUMBER=121;
    public static final int NUMBER_PREFIX=122;
    public static final int NUMBER_SUFFIX=123;
    public static final int NXLE_UINT16_T=124;
    public static final int NXLE_UINT32_T=125;
    public static final int NXLE_UINT64_T=126;
    public static final int NXLE_UINT8_T=127;
    public static final int NX_STRUCT=128;
    public static final int NX_UINT16_T=129;
    public static final int NX_UINT32_T=130;
    public static final int NX_UINT64_T=131;
    public static final int NX_UINT8_T=132;
    public static final int NX_UNION=133;
    public static final int OR=134;
    public static final int PARAMETER=135;
    public static final int PARAMETER_LIST=136;
    public static final int PLUS=137;
    public static final int PLUSASSIGN=138;
    public static final int PLUSPLUS=139;
    public static final int POINTER_QUALIFIER=140;
    public static final int POST=141;
    public static final int POSTFIX_EXPRESSION=142;
    public static final int POST_DECREMENT=143;
    public static final int POST_INCREMENT=144;
    public static final int PRE_DECREMENT=145;
    public static final int PRE_INCREMENT=146;
    public static final int PROVIDES=147;
    public static final int RAW_IDENTIFIER=148;
    public static final int RBRACE=149;
    public static final int RBRACKET=150;
    public static final int REGISTER=151;
    public static final int REMOTE=152;
    public static final int REQUIRES=153;
    public static final int RESTRICT=154;
    public static final int RETURN=155;
    public static final int RPARENS=156;
    public static final int RSHIFT=157;
    public static final int RSHIFTASSIGN=158;
    public static final int SHORT=159;
    public static final int SIGNAL=160;
    public static final int SIGNED=161;
    public static final int SIZEOF=162;
    public static final int SIZEOF_EXPRESSION=163;
    public static final int SIZEOF_TYPE=164;
    public static final int SPECIFICATION=165;
    public static final int STAR=166;
    public static final int STATEMENT=167;
    public static final int STATIC=168;
    public static final int STRING_LITERAL=169;
    public static final int STRUCT=170;
    public static final int SWITCH=171;
    public static final int TASK=172;
    public static final int TYPEDEF=173;
    public static final int UINT16_T=174;
    public static final int UINT32_T=175;
    public static final int UINT64_T=176;
    public static final int UINT8_T=177;
    public static final int UNARY_MINUS=178;
    public static final int UNARY_PLUS=179;
    public static final int UNION=180;
    public static final int UNSIGNED=181;
    public static final int USES=182;
    public static final int VOID=183;
    public static final int VOLATILE=184;
    public static final int WHILE=185;
    public static final int WHITESPACE=186;

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


    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expression"
    // nesC.g:248:1: primary_expression : ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression );
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

            // nesC.g:249:5: ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression )
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
                    // nesC.g:249:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression2770);
                    identifier1=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier1.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:250:10: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT2=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_primary_expression2781); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT2_tree = 
                    (Object)adaptor.create(CONSTANT2)
                    ;
                    adaptor.addChild(root_0, CONSTANT2_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:251:10: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primary_expression2792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL3_tree = 
                    (Object)adaptor.create(STRING_LITERAL3)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL3_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:252:10: CHARACTER_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARACTER_LITERAL4=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_primary_expression2803); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARACTER_LITERAL4_tree = 
                    (Object)adaptor.create(CHARACTER_LITERAL4)
                    ;
                    adaptor.addChild(root_0, CHARACTER_LITERAL4_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:253:10: '(' expression ')'
                    {
                    char_literal5=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_primary_expression2814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_primary_expression2816);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

                    char_literal7=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_primary_expression2818); if (state.failed) return retval; 
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
                    // 253:29: -> expression
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
    // nesC.g:261:1: postfix_expression : ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) ;
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

            // nesC.g:262:5: ( ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) )
            // nesC.g:262:10: ( call_kind )? primary_expression ( postfix_expression_modifier )*
            {
            // nesC.g:262:10: ( call_kind )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CALL||LA2_0==POST||LA2_0==SIGNAL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // nesC.g:262:10: call_kind
                    {
                    pushFollow(FOLLOW_call_kind_in_postfix_expression2843);
                    call_kind8=call_kind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_call_kind.add(call_kind8.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_primary_expression_in_postfix_expression2846);
            primary_expression9=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression9.getTree());

            // nesC.g:262:40: ( postfix_expression_modifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARROW||LA3_0==DOT||LA3_0==LBRACKET||LA3_0==LPARENS||LA3_0==MINUSMINUS||LA3_0==PLUSPLUS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // nesC.g:262:40: postfix_expression_modifier
            	    {
            	    pushFollow(FOLLOW_postfix_expression_modifier_in_postfix_expression2848);
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
            // elements: call_kind, postfix_expression_modifier, primary_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 263:13: -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
            {
                // nesC.g:263:16: ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION")
                , root_1);

                // nesC.g:263:37: ( call_kind )?
                if ( stream_call_kind.hasNext() ) {
                    adaptor.addChild(root_1, stream_call_kind.nextTree());

                }
                stream_call_kind.reset();

                adaptor.addChild(root_1, stream_primary_expression.nextTree());

                // nesC.g:263:67: ( postfix_expression_modifier )*
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
    // nesC.g:265:1: postfix_expression_modifier : ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' );
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

            // nesC.g:266:5: ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' )
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
                    // nesC.g:266:9: '[' expression ']'
                    {
                    char_literal11=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_postfix_expression_modifier2889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal11);


                    pushFollow(FOLLOW_expression_in_postfix_expression_modifier2891);
                    expression12=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression12.getTree());

                    char_literal13=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_postfix_expression_modifier2893); if (state.failed) return retval; 
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
                    // 266:28: -> ^( ARRAY_ELEMENT_SELECTION expression )
                    {
                        // nesC.g:266:31: ^( ARRAY_ELEMENT_SELECTION expression )
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
                    // nesC.g:267:9: '(' ( argument_expression_list )? ')'
                    {
                    char_literal14=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression_modifier2911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal14);


                    // nesC.g:267:13: ( argument_expression_list )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AMP||LA4_0==BITCOMPLEMENT||LA4_0==CALL||LA4_0==CHARACTER_LITERAL||LA4_0==CONSTANT||LA4_0==LPARENS||LA4_0==MINUS||LA4_0==MINUSMINUS||LA4_0==NOT||LA4_0==PLUS||LA4_0==PLUSPLUS||LA4_0==POST||LA4_0==RAW_IDENTIFIER||LA4_0==SIGNAL||LA4_0==SIZEOF||LA4_0==STAR||LA4_0==STRING_LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // nesC.g:267:13: argument_expression_list
                            {
                            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression_modifier2913);
                            argument_expression_list15=argument_expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list15.getTree());

                            }
                            break;

                    }


                    char_literal16=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression_modifier2916); if (state.failed) return retval; 
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
                    // 267:43: -> ^( ARGUMENT_LIST ( argument_expression_list )? )
                    {
                        // nesC.g:267:46: ^( ARGUMENT_LIST ( argument_expression_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST")
                        , root_1);

                        // nesC.g:267:62: ( argument_expression_list )?
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
                    // nesC.g:268:9: '.' identifier
                    {
                    char_literal17=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression_modifier2935); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal17);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2937);
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
                    // 268:24: -> ^( '.' identifier )
                    {
                        // nesC.g:268:27: ^( '.' identifier )
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
                    // nesC.g:269:9: '->' identifier
                    {
                    string_literal19=(Token)match(input,ARROW,FOLLOW_ARROW_in_postfix_expression_modifier2955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal19);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2957);
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
                    // 269:25: -> ^( '->' identifier )
                    {
                        // nesC.g:269:28: ^( '->' identifier )
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
                    // nesC.g:270:9: '++'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal21=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfix_expression_modifier2975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = 
                    (Object)adaptor.create(string_literal21)
                    ;
                    adaptor.addChild(root_0, string_literal21_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:271:9: '--'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal22=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfix_expression_modifier2985); if (state.failed) return retval;
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
    // nesC.g:273:1: call_kind : ( CALL | POST | SIGNAL );
    public final nesCParser.call_kind_return call_kind() throws RecognitionException {
        nesCParser.call_kind_return retval = new nesCParser.call_kind_return();
        retval.start = input.LT(1);

        int call_kind_StartIndex = input.index();

        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // nesC.g:274:5: ( CALL | POST | SIGNAL )
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
    // nesC.g:278:1: argument_expression_list : assignment_expression ( ',' ! assignment_expression )* ;
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

            // nesC.g:279:5: ( assignment_expression ( ',' ! assignment_expression )* )
            // nesC.g:279:10: assignment_expression ( ',' ! assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3045);
            assignment_expression24=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression24.getTree());

            // nesC.g:279:32: ( ',' ! assignment_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // nesC.g:279:33: ',' ! assignment_expression
            	    {
            	    char_literal25=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list3048); if (state.failed) return retval;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list3051);
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
    // nesC.g:281:1: unary_expression : ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression );
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

            // nesC.g:282:5: ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression )
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
                    // nesC.g:282:10: '++' unary_expression
                    {
                    string_literal27=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unary_expression3072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(string_literal27);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3074);
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
                    // 282:32: -> ^( PRE_INCREMENT unary_expression )
                    {
                        // nesC.g:282:35: ^( PRE_INCREMENT unary_expression )
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
                    // nesC.g:283:10: '--' unary_expression
                    {
                    string_literal29=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unary_expression3093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUSMINUS.add(string_literal29);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3095);
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
                    // 283:32: -> ^( PRE_DECREMENT unary_expression )
                    {
                        // nesC.g:283:35: ^( PRE_DECREMENT unary_expression )
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
                    // nesC.g:284:10: '&' cast_expression
                    {
                    char_literal31=(Token)match(input,AMP,FOLLOW_AMP_in_unary_expression3114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMP.add(char_literal31);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3117);
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
                    // 284:32: -> ^( ADDRESS_OF cast_expression )
                    {
                        // nesC.g:284:35: ^( ADDRESS_OF cast_expression )
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
                    // nesC.g:285:10: '*' cast_expression
                    {
                    char_literal33=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression3141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal33);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3144);
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
                    // 285:32: -> ^( DEREFERENCE cast_expression )
                    {
                        // nesC.g:285:35: ^( DEREFERENCE cast_expression )
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
                    // nesC.g:286:10: '+' cast_expression
                    {
                    char_literal35=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression3167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal35);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3170);
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
                    // 286:32: -> ^( UNARY_PLUS cast_expression )
                    {
                        // nesC.g:286:35: ^( UNARY_PLUS cast_expression )
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
                    // nesC.g:287:10: '-' cast_expression
                    {
                    char_literal37=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression3194); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal37);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3197);
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
                    // 287:32: -> ^( UNARY_MINUS cast_expression )
                    {
                        // nesC.g:287:35: ^( UNARY_MINUS cast_expression )
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
                    // nesC.g:288:10: ( '~' ^| '!' ^) cast_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:288:10: ( '~' ^| '!' ^)
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
                            // nesC.g:288:11: '~' ^
                            {
                            char_literal39=(Token)match(input,BITCOMPLEMENT,FOLLOW_BITCOMPLEMENT_in_unary_expression3221); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal39_tree = 
                            (Object)adaptor.create(char_literal39)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal39_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:288:18: '!' ^
                            {
                            char_literal40=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression3226); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal40_tree = 
                            (Object)adaptor.create(char_literal40)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal40_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3230);
                    cast_expression41=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression41.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:289:10: SIZEOF '(' type_name ')'
                    {
                    SIZEOF42=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF42);


                    char_literal43=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_unary_expression3243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal43);


                    pushFollow(FOLLOW_type_name_in_unary_expression3245);
                    type_name44=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name44.getTree());

                    char_literal45=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_unary_expression3247); if (state.failed) return retval; 
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
                    // 289:35: -> ^( SIZEOF_TYPE type_name )
                    {
                        // nesC.g:289:38: ^( SIZEOF_TYPE type_name )
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
                    // nesC.g:290:10: SIZEOF unary_expression
                    {
                    SIZEOF46=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF46);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3268);
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
                    // 290:35: -> ^( SIZEOF_EXPRESSION unary_expression )
                    {
                        // nesC.g:290:38: ^( SIZEOF_EXPRESSION unary_expression )
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
                    // nesC.g:291:10: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression3288);
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
    // nesC.g:297:1: cast_expression : ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression );
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

            // nesC.g:298:5: ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression )
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
                    // nesC.g:298:10: '(' type_name ')' cast_expression
                    {
                    char_literal49=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_cast_expression3311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal49);


                    pushFollow(FOLLOW_type_name_in_cast_expression3313);
                    type_name50=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name50.getTree());

                    char_literal51=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_cast_expression3315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal51);


                    pushFollow(FOLLOW_cast_expression_in_cast_expression3317);
                    cast_expression52=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression52.getTree());

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
                    // 298:44: -> ^( CAST cast_expression type_name )
                    {
                        // nesC.g:298:47: ^( CAST cast_expression type_name )
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
                    // nesC.g:299:10: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression3338);
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
    // nesC.g:301:1: multiplicative_expression : cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* ;
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

            // nesC.g:302:5: ( cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* )
            // nesC.g:302:10: cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3357);
            cast_expression54=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression54.getTree());

            // nesC.g:302:26: ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DIVIDE||LA11_0==MODULUS||LA11_0==STAR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // nesC.g:302:28: ( '*' ^| '/' ^| '%' ^) cast_expression
            	    {
            	    // nesC.g:302:28: ( '*' ^| '/' ^| '%' ^)
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
            	            // nesC.g:302:29: '*' ^
            	            {
            	            char_literal55=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression3362); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal55_tree = 
            	            (Object)adaptor.create(char_literal55)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal55_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:302:36: '/' ^
            	            {
            	            char_literal56=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expression3367); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal56_tree = 
            	            (Object)adaptor.create(char_literal56)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal56_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:302:43: '%' ^
            	            {
            	            char_literal57=(Token)match(input,MODULUS,FOLLOW_MODULUS_in_multiplicative_expression3372); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal57_tree = 
            	            (Object)adaptor.create(char_literal57)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal57_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3376);
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
    // nesC.g:304:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
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

            // nesC.g:305:5: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
            // nesC.g:305:10: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3397);
            multiplicative_expression59=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression59.getTree());

            // nesC.g:305:36: ( ( '+' ^| '-' ^) multiplicative_expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // nesC.g:305:38: ( '+' ^| '-' ^) multiplicative_expression
            	    {
            	    // nesC.g:305:38: ( '+' ^| '-' ^)
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
            	            // nesC.g:305:39: '+' ^
            	            {
            	            char_literal60=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression3402); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal60_tree = 
            	            (Object)adaptor.create(char_literal60)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:305:46: '-' ^
            	            {
            	            char_literal61=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression3407); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal61_tree = 
            	            (Object)adaptor.create(char_literal61)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal61_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3411);
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
    // nesC.g:307:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
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

            // nesC.g:308:5: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // nesC.g:308:10: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression3432);
            additive_expression63=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression63.getTree());

            // nesC.g:308:30: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LSHIFT||LA15_0==RSHIFT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // nesC.g:308:32: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // nesC.g:308:32: ( '<<' ^| '>>' ^)
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
            	            // nesC.g:308:33: '<<' ^
            	            {
            	            string_literal64=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression3437); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal64_tree = 
            	            (Object)adaptor.create(string_literal64)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:308:41: '>>' ^
            	            {
            	            string_literal65=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression3442); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal65_tree = 
            	            (Object)adaptor.create(string_literal65)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal65_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression3446);
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
    // nesC.g:310:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
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

            // nesC.g:311:5: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // nesC.g:311:10: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression3467);
            shift_expression67=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression67.getTree());

            // nesC.g:311:27: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= GREATER && LA17_0 <= GREATEREQUAL)||(LA17_0 >= LESS && LA17_0 <= LESSEQUAL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // nesC.g:311:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // nesC.g:311:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
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
            	            // nesC.g:311:30: '<' ^
            	            {
            	            char_literal68=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression3472); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal68_tree = 
            	            (Object)adaptor.create(char_literal68)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal68_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:311:37: '>' ^
            	            {
            	            char_literal69=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression3477); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal69_tree = 
            	            (Object)adaptor.create(char_literal69)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal69_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:311:44: '<=' ^
            	            {
            	            string_literal70=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relational_expression3482); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal70_tree = 
            	            (Object)adaptor.create(string_literal70)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal70_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // nesC.g:311:52: '>=' ^
            	            {
            	            string_literal71=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relational_expression3487); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal71_tree = 
            	            (Object)adaptor.create(string_literal71)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal71_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression3491);
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
    // nesC.g:313:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
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

            // nesC.g:314:5: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // nesC.g:314:10: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression3512);
            relational_expression73=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression73.getTree());

            // nesC.g:314:32: ( ( '==' ^| '!=' ^) relational_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EQUAL||LA19_0==NOTEQUAL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // nesC.g:314:34: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // nesC.g:314:34: ( '==' ^| '!=' ^)
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
            	            // nesC.g:314:35: '==' ^
            	            {
            	            string_literal74=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equality_expression3517); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal74_tree = 
            	            (Object)adaptor.create(string_literal74)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:314:43: '!=' ^
            	            {
            	            string_literal75=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equality_expression3522); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal75_tree = 
            	            (Object)adaptor.create(string_literal75)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal75_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression3526);
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
    // nesC.g:316:1: and_expression : equality_expression ( '&' ^ equality_expression )* ;
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

            // nesC.g:317:5: ( equality_expression ( '&' ^ equality_expression )* )
            // nesC.g:317:10: equality_expression ( '&' ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_and_expression3547);
            equality_expression77=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression77.getTree());

            // nesC.g:317:30: ( '&' ^ equality_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AMP) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // nesC.g:317:32: '&' ^ equality_expression
            	    {
            	    char_literal78=(Token)match(input,AMP,FOLLOW_AMP_in_and_expression3551); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal78_tree = 
            	    (Object)adaptor.create(char_literal78)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal78_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_and_expression3554);
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
    // nesC.g:319:1: xor_expression : and_expression ( '^' ^ and_expression )* ;
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

            // nesC.g:320:5: ( and_expression ( '^' ^ and_expression )* )
            // nesC.g:320:10: and_expression ( '^' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_xor_expression3575);
            and_expression80=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression80.getTree());

            // nesC.g:320:25: ( '^' ^ and_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==BITXOR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // nesC.g:320:27: '^' ^ and_expression
            	    {
            	    char_literal81=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_xor_expression3579); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal81_tree = 
            	    (Object)adaptor.create(char_literal81)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal81_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_xor_expression3582);
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
    // nesC.g:322:1: or_expression : xor_expression ( '|' ^ xor_expression )* ;
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

            // nesC.g:323:5: ( xor_expression ( '|' ^ xor_expression )* )
            // nesC.g:323:10: xor_expression ( '|' ^ xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expression_in_or_expression3603);
            xor_expression83=xor_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression83.getTree());

            // nesC.g:323:25: ( '|' ^ xor_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BITOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // nesC.g:323:27: '|' ^ xor_expression
            	    {
            	    char_literal84=(Token)match(input,BITOR,FOLLOW_BITOR_in_or_expression3607); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal84_tree = 
            	    (Object)adaptor.create(char_literal84)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal84_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_xor_expression_in_or_expression3610);
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
    // nesC.g:325:1: logical_and_expression : or_expression ( '&&' ^ or_expression )* ;
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

            // nesC.g:326:5: ( or_expression ( '&&' ^ or_expression )* )
            // nesC.g:326:10: or_expression ( '&&' ^ or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_expression_in_logical_and_expression3631);
            or_expression86=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression86.getTree());

            // nesC.g:326:24: ( '&&' ^ or_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // nesC.g:326:26: '&&' ^ or_expression
            	    {
            	    string_literal87=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression3635); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal87_tree = 
            	    (Object)adaptor.create(string_literal87)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal87_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression3638);
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
    // nesC.g:328:1: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
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

            // nesC.g:329:5: ( logical_and_expression ( '||' ^ logical_and_expression )* )
            // nesC.g:329:10: logical_and_expression ( '||' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3659);
            logical_and_expression89=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression89.getTree());

            // nesC.g:329:33: ( '||' ^ logical_and_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // nesC.g:329:35: '||' ^ logical_and_expression
            	    {
            	    string_literal90=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression3663); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal90_tree = 
            	    (Object)adaptor.create(string_literal90)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal90_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3666);
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
    // nesC.g:331:1: conditional_expression : logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? ;
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

            // nesC.g:332:5: ( logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? )
            // nesC.g:332:10: logical_or_expression ( '?' ^ expression ':' ! conditional_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression3687);
            logical_or_expression92=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression92.getTree());

            // nesC.g:332:32: ( '?' ^ expression ':' ! conditional_expression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==191) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // nesC.g:332:33: '?' ^ expression ':' ! conditional_expression
                    {
                    char_literal93=(Token)match(input,191,FOLLOW_191_in_conditional_expression3690); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal93_tree = 
                    (Object)adaptor.create(char_literal93)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal93_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_conditional_expression3693);
                    expression94=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression94.getTree());

                    char_literal95=(Token)match(input,188,FOLLOW_188_in_conditional_expression3695); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression3698);
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
    // nesC.g:334:1: assignment_expression : ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression );
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

            // nesC.g:335:5: ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression )
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
                    // nesC.g:335:10: unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_assignment_expression3719);
                    unary_expression97=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression97.getTree());

                    // nesC.g:335:27: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^)
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
                            // nesC.g:335:28: '=' ^
                            {
                            char_literal98=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expression3722); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal98_tree = 
                            (Object)adaptor.create(char_literal98)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal98_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:335:35: '*=' ^
                            {
                            string_literal99=(Token)match(input,MULASSIGN,FOLLOW_MULASSIGN_in_assignment_expression3727); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal99_tree = 
                            (Object)adaptor.create(string_literal99)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal99_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // nesC.g:335:43: '/=' ^
                            {
                            string_literal100=(Token)match(input,DIVASSIGN,FOLLOW_DIVASSIGN_in_assignment_expression3732); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal100_tree = 
                            (Object)adaptor.create(string_literal100)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal100_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // nesC.g:335:51: '%=' ^
                            {
                            string_literal101=(Token)match(input,MODASSIGN,FOLLOW_MODASSIGN_in_assignment_expression3737); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal101_tree = 
                            (Object)adaptor.create(string_literal101)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // nesC.g:335:59: '+=' ^
                            {
                            string_literal102=(Token)match(input,PLUSASSIGN,FOLLOW_PLUSASSIGN_in_assignment_expression3742); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal102_tree = 
                            (Object)adaptor.create(string_literal102)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal102_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // nesC.g:335:67: '-=' ^
                            {
                            string_literal103=(Token)match(input,MINUSASSIGN,FOLLOW_MINUSASSIGN_in_assignment_expression3747); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal103_tree = 
                            (Object)adaptor.create(string_literal103)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
                            }

                            }
                            break;
                        case 7 :
                            // nesC.g:335:75: '<<=' ^
                            {
                            string_literal104=(Token)match(input,LSHIFTASSIGN,FOLLOW_LSHIFTASSIGN_in_assignment_expression3752); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal104_tree = 
                            (Object)adaptor.create(string_literal104)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal104_tree, root_0);
                            }

                            }
                            break;
                        case 8 :
                            // nesC.g:335:84: '>>=' ^
                            {
                            string_literal105=(Token)match(input,RSHIFTASSIGN,FOLLOW_RSHIFTASSIGN_in_assignment_expression3757); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal105_tree = 
                            (Object)adaptor.create(string_literal105)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal105_tree, root_0);
                            }

                            }
                            break;
                        case 9 :
                            // nesC.g:335:93: '&=' ^
                            {
                            string_literal106=(Token)match(input,BITANDASSIGN,FOLLOW_BITANDASSIGN_in_assignment_expression3762); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal106_tree = 
                            (Object)adaptor.create(string_literal106)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                            }

                            }
                            break;
                        case 10 :
                            // nesC.g:335:101: '^=' ^
                            {
                            string_literal107=(Token)match(input,BITXORASSIGN,FOLLOW_BITXORASSIGN_in_assignment_expression3767); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal107_tree = 
                            (Object)adaptor.create(string_literal107)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal107_tree, root_0);
                            }

                            }
                            break;
                        case 11 :
                            // nesC.g:335:109: '|=' ^
                            {
                            string_literal108=(Token)match(input,BITORASSIGN,FOLLOW_BITORASSIGN_in_assignment_expression3772); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal108_tree = 
                            (Object)adaptor.create(string_literal108)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal108_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression3776);
                    assignment_expression109=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression109.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:336:10: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression3787);
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
    // nesC.g:338:1: expression : assignment_expression ( ',' ^ assignment_expression )* ;
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

            // nesC.g:339:5: ( assignment_expression ( ',' ^ assignment_expression )* )
            // nesC.g:339:10: assignment_expression ( ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression3806);
            assignment_expression111=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression111.getTree());

            // nesC.g:339:32: ( ',' ^ assignment_expression )*
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
            	    // nesC.g:339:33: ',' ^ assignment_expression
            	    {
            	    char_literal112=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression3809); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal112_tree = 
            	    (Object)adaptor.create(char_literal112)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal112_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression3812);
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
    // nesC.g:341:1: constant_expression : conditional_expression ;
    public final nesCParser.constant_expression_return constant_expression() throws RecognitionException {
        nesCParser.constant_expression_return retval = new nesCParser.constant_expression_return();
        retval.start = input.LT(1);

        int constant_expression_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.conditional_expression_return conditional_expression114 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // nesC.g:342:5: ( conditional_expression )
            // nesC.g:342:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression3833);
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
    // nesC.g:361:1: declaration : ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) );
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
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        RewriteRuleSubtreeStream stream_gcc_attributes=new RewriteRuleSubtreeStream(adaptor,"rule gcc_attributes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // nesC.g:364:5: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) )
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
                    // nesC.g:364:10: declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3897);
                    declaration_specifiers115=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers115.getTree());

                    // nesC.g:368:33: ( gcc_attributes )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==GCCATTRIBUTE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // nesC.g:368:33: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration3899);
                            gcc_attributes116=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes116.getTree());

                            }
                            break;

                    }


                    // nesC.g:368:49: ( init_declarator_list )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPARENS||LA30_0==RAW_IDENTIFIER||LA30_0==STAR) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // nesC.g:368:49: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration3902);
                            init_declarator_list117=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list117.getTree());

                            }
                            break;

                    }


                    char_literal118=(Token)match(input,189,FOLLOW_189_in_declaration3905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal118);


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
                    // 375:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // nesC.g:375:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:375:54: ( init_declarator_list )?
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
                    // nesC.g:377:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration3967);
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
                    // 380:30: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // nesC.g:380:33: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // nesC.g:380:47: ^( FUNCTION_DEFINITION function_definition )
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
                    // nesC.g:383:10: TYPEDEF declaration_specifiers ( gcc_attributes )? init_declarator_list ( gcc_attributes )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF120=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration4012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF120);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration4014);
                    declaration_specifiers121=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers121.getTree());

                    // nesC.g:386:41: ( gcc_attributes )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==GCCATTRIBUTE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // nesC.g:386:41: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4016);
                            gcc_attributes122=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes122.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_init_declarator_list_in_declaration4019);
                    init_declarator_list123=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list123.getTree());

                    // nesC.g:386:78: ( gcc_attributes )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==GCCATTRIBUTE) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // nesC.g:386:78: gcc_attributes
                            {
                            pushFollow(FOLLOW_gcc_attributes_in_declaration4021);
                            gcc_attributes124=gcc_attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_gcc_attributes.add(gcc_attributes124.getTree());

                            }
                            break;

                    }


                    char_literal125=(Token)match(input,189,FOLLOW_189_in_declaration4024); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal125);


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
                    // 393:14: -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                    {
                        // nesC.g:393:17: ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
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
    // nesC.g:395:1: declaration_specifiers : ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+ ;
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

            // nesC.g:396:5: ( ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+ )
            // nesC.g:396:10: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:396:10: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+
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
            	    // nesC.g:396:11: storage_class_specifier
            	    {
            	    pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers4084);
            	    storage_class_specifier126=storage_class_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier126.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:397:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_declaration_specifiers4098);
            	    type_specifier127=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier127.getTree());

            	    }
            	    break;
            	case 3 :
            	    // nesC.g:398:11: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers4121);
            	    type_qualifier128=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier128.getTree());

            	    }
            	    break;
            	case 4 :
            	    // nesC.g:399:11: function_specifier
            	    {
            	    pushFollow(FOLLOW_function_specifier_in_declaration_specifiers4144);
            	    function_specifier129=function_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_specifier129.getTree());

            	    }
            	    break;
            	case 5 :
            	    // nesC.g:400:11: DEFAULT
            	    {
            	    DEFAULT130=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_declaration_specifiers4163); if (state.failed) return retval;
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
    // nesC.g:406:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
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

            // nesC.g:407:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // nesC.g:407:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list4186);
            init_declarator131=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator131.getTree());

            // nesC.g:407:26: ( ',' init_declarator )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // nesC.g:407:27: ',' init_declarator
            	    {
            	    char_literal132=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list4189); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal132);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list4191);
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
            // 407:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // nesC.g:407:52: ^( DECLARATOR_LIST ( init_declarator )+ )
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
    // nesC.g:413:1: init_declarator : declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
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

            // nesC.g:414:5: ( declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // nesC.g:414:10: declarator ( attributes )? ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator4225);
            declarator134=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator134.getTree());

            // nesC.g:414:21: ( attributes )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ATTRIBUTE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // nesC.g:414:21: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_init_declarator4227);
                    attributes135=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes135.getTree());

                    }
                    break;

            }


            // nesC.g:414:33: ( '=' initializer )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ASSIGN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // nesC.g:414:34: '=' initializer
                    {
                    char_literal136=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator4231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal136);


                    pushFollow(FOLLOW_initializer_in_init_declarator4233);
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
            // 414:52: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // nesC.g:414:55: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // nesC.g:414:84: ( initializer )?
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
    // nesC.g:416:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK );
    public final nesCParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        nesCParser.storage_class_specifier_return retval = new nesCParser.storage_class_specifier_return();
        retval.start = input.LT(1);

        int storage_class_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token set138=null;

        Object set138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // nesC.g:417:5: ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK )
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
    // nesC.g:428:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | struct_or_union_specifier | enum_specifier | typedef_name );
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

            // nesC.g:429:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | FLOAT | DOUBLE | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | struct_or_union_specifier | enum_specifier | typedef_name )
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
                    // nesC.g:429:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID139=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier4382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID139_tree = 
                    (Object)adaptor.create(VOID139)
                    ;
                    adaptor.addChild(root_0, VOID139_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:430:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR140=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier4392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR140_tree = 
                    (Object)adaptor.create(CHAR140)
                    ;
                    adaptor.addChild(root_0, CHAR140_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:431:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT141=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier4402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT141_tree = 
                    (Object)adaptor.create(SHORT141)
                    ;
                    adaptor.addChild(root_0, SHORT141_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:432:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT142=(Token)match(input,INT,FOLLOW_INT_in_type_specifier4412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT142_tree = 
                    (Object)adaptor.create(INT142)
                    ;
                    adaptor.addChild(root_0, INT142_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:433:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG143=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier4422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG143_tree = 
                    (Object)adaptor.create(LONG143)
                    ;
                    adaptor.addChild(root_0, LONG143_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:434:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED144=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier4432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED144_tree = 
                    (Object)adaptor.create(SIGNED144)
                    ;
                    adaptor.addChild(root_0, SIGNED144_tree);
                    }

                    }
                    break;
                case 7 :
                    // nesC.g:435:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED145=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier4442); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED145_tree = 
                    (Object)adaptor.create(UNSIGNED145)
                    ;
                    adaptor.addChild(root_0, UNSIGNED145_tree);
                    }

                    }
                    break;
                case 8 :
                    // nesC.g:436:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT146=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier4452); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT146_tree = 
                    (Object)adaptor.create(FLOAT146)
                    ;
                    adaptor.addChild(root_0, FLOAT146_tree);
                    }

                    }
                    break;
                case 9 :
                    // nesC.g:437:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLE147=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_type_specifier4462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE147_tree = 
                    (Object)adaptor.create(DOUBLE147)
                    ;
                    adaptor.addChild(root_0, DOUBLE147_tree);
                    }

                    }
                    break;
                case 10 :
                    // nesC.g:438:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T148=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier4472); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T148_tree = 
                    (Object)adaptor.create(INT8_T148)
                    ;
                    adaptor.addChild(root_0, INT8_T148_tree);
                    }

                    }
                    break;
                case 11 :
                    // nesC.g:439:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T149=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier4494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T149_tree = 
                    (Object)adaptor.create(INT16_T149)
                    ;
                    adaptor.addChild(root_0, INT16_T149_tree);
                    }

                    }
                    break;
                case 12 :
                    // nesC.g:440:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T150=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier4515); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T150_tree = 
                    (Object)adaptor.create(INT32_T150)
                    ;
                    adaptor.addChild(root_0, INT32_T150_tree);
                    }

                    }
                    break;
                case 13 :
                    // nesC.g:441:9: INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT64_T151=(Token)match(input,INT64_T,FOLLOW_INT64_T_in_type_specifier4536); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT64_T151_tree = 
                    (Object)adaptor.create(INT64_T151)
                    ;
                    adaptor.addChild(root_0, INT64_T151_tree);
                    }

                    }
                    break;
                case 14 :
                    // nesC.g:442:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T152=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier4557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T152_tree = 
                    (Object)adaptor.create(UINT8_T152)
                    ;
                    adaptor.addChild(root_0, UINT8_T152_tree);
                    }

                    }
                    break;
                case 15 :
                    // nesC.g:443:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T153=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier4578); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T153_tree = 
                    (Object)adaptor.create(UINT16_T153)
                    ;
                    adaptor.addChild(root_0, UINT16_T153_tree);
                    }

                    }
                    break;
                case 16 :
                    // nesC.g:444:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T154=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier4598); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T154_tree = 
                    (Object)adaptor.create(UINT32_T154)
                    ;
                    adaptor.addChild(root_0, UINT32_T154_tree);
                    }

                    }
                    break;
                case 17 :
                    // nesC.g:445:9: UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT64_T155=(Token)match(input,UINT64_T,FOLLOW_UINT64_T_in_type_specifier4618); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT64_T155_tree = 
                    (Object)adaptor.create(UINT64_T155)
                    ;
                    adaptor.addChild(root_0, UINT64_T155_tree);
                    }

                    }
                    break;
                case 18 :
                    // nesC.g:446:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T156=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier4638); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T156_tree = 
                    (Object)adaptor.create(NX_UINT8_T156)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T156_tree);
                    }

                    }
                    break;
                case 19 :
                    // nesC.g:447:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T157=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier4656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T157_tree = 
                    (Object)adaptor.create(NX_UINT16_T157)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T157_tree);
                    }

                    }
                    break;
                case 20 :
                    // nesC.g:448:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T158=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier4673); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T158_tree = 
                    (Object)adaptor.create(NX_UINT32_T158)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T158_tree);
                    }

                    }
                    break;
                case 21 :
                    // nesC.g:449:9: NX_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT64_T159=(Token)match(input,NX_UINT64_T,FOLLOW_NX_UINT64_T_in_type_specifier4690); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT64_T159_tree = 
                    (Object)adaptor.create(NX_UINT64_T159)
                    ;
                    adaptor.addChild(root_0, NX_UINT64_T159_tree);
                    }

                    }
                    break;
                case 22 :
                    // nesC.g:450:9: NXLE_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT8_T160=(Token)match(input,NXLE_UINT8_T,FOLLOW_NXLE_UINT8_T_in_type_specifier4707); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT8_T160_tree = 
                    (Object)adaptor.create(NXLE_UINT8_T160)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT8_T160_tree);
                    }

                    }
                    break;
                case 23 :
                    // nesC.g:451:9: NXLE_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT16_T161=(Token)match(input,NXLE_UINT16_T,FOLLOW_NXLE_UINT16_T_in_type_specifier4723); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT16_T161_tree = 
                    (Object)adaptor.create(NXLE_UINT16_T161)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT16_T161_tree);
                    }

                    }
                    break;
                case 24 :
                    // nesC.g:452:9: NXLE_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT32_T162=(Token)match(input,NXLE_UINT32_T,FOLLOW_NXLE_UINT32_T_in_type_specifier4738); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT32_T162_tree = 
                    (Object)adaptor.create(NXLE_UINT32_T162)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT32_T162_tree);
                    }

                    }
                    break;
                case 25 :
                    // nesC.g:453:9: NXLE_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT64_T163=(Token)match(input,NXLE_UINT64_T,FOLLOW_NXLE_UINT64_T_in_type_specifier4753); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT64_T163_tree = 
                    (Object)adaptor.create(NXLE_UINT64_T163)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT64_T163_tree);
                    }

                    }
                    break;
                case 26 :
                    // nesC.g:454:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier4768);
                    struct_or_union_specifier164=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier164.getTree());

                    }
                    break;
                case 27 :
                    // nesC.g:455:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier4778);
                    enum_specifier165=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier165.getTree());

                    }
                    break;
                case 28 :
                    // nesC.g:456:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier4788);
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
    // nesC.g:458:1: struct_or_union_specifier : ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) | STRUCT '@' identifier '{' struct_declaration_list '}' -> ^( STRUCT identifier struct_declaration_list ) | struct_or_union identifier attributes '{' struct_declaration_list '}' -> ^( struct_or_union identifier struct_declaration_list ) );
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

            // nesC.g:459:5: ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) | STRUCT '@' identifier '{' struct_declaration_list '}' -> ^( STRUCT identifier struct_declaration_list ) | struct_or_union identifier attributes '{' struct_declaration_list '}' -> ^( struct_or_union identifier struct_declaration_list ) )
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
                    // nesC.g:459:10: struct_or_union ( identifier )? '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4803);
                    struct_or_union167=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union167.getTree());

                    // nesC.g:459:26: ( identifier )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RAW_IDENTIFIER) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // nesC.g:459:26: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4805);
                            identifier168=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier168.getTree());

                            }
                            break;

                    }


                    char_literal169=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal169);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4810);
                    struct_declaration_list170=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list170.getTree());

                    char_literal171=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4812); if (state.failed) return retval; 
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
                    // 460:13: -> ^( struct_or_union ( identifier )? struct_declaration_list )
                    {
                        // nesC.g:460:16: ^( struct_or_union ( identifier )? struct_declaration_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        // nesC.g:460:34: ( identifier )?
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
                    // nesC.g:461:10: struct_or_union identifier
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4846);
                    struct_or_union172=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union172.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4848);
                    identifier173=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier173.getTree());

                    // AST REWRITE
                    // elements: struct_or_union, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 462:13: -> ^( struct_or_union identifier )
                    {
                        // nesC.g:462:16: ^( struct_or_union identifier )
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
                    // nesC.g:463:10: STRUCT '@' identifier '{' struct_declaration_list '}'
                    {
                    STRUCT174=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_struct_or_union_specifier4879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRUCT.add(STRUCT174);


                    char_literal175=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_struct_or_union_specifier4881); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATTRIBUTE.add(char_literal175);


                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4883);
                    identifier176=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier176.getTree());

                    char_literal177=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal177);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4887);
                    struct_declaration_list178=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list178.getTree());

                    char_literal179=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal179);


                    // AST REWRITE
                    // elements: identifier, struct_declaration_list, STRUCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 464:13: -> ^( STRUCT identifier struct_declaration_list )
                    {
                        // nesC.g:464:16: ^( STRUCT identifier struct_declaration_list )
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
                    // nesC.g:465:10: struct_or_union identifier attributes '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4922);
                    struct_or_union180=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union180.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4924);
                    identifier181=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier181.getTree());

                    pushFollow(FOLLOW_attributes_in_struct_or_union_specifier4926);
                    attributes182=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes182.getTree());

                    char_literal183=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4928); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal183);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4930);
                    struct_declaration_list184=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list184.getTree());

                    char_literal185=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4932); if (state.failed) return retval; 
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
                    // 466:13: -> ^( struct_or_union identifier struct_declaration_list )
                    {
                        // nesC.g:466:16: ^( struct_or_union identifier struct_declaration_list )
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
    // nesC.g:468:1: struct_or_union : ( STRUCT | UNION | NX_STRUCT | NX_UNION );
    public final nesCParser.struct_or_union_return struct_or_union() throws RecognitionException {
        nesCParser.struct_or_union_return retval = new nesCParser.struct_or_union_return();
        retval.start = input.LT(1);

        int struct_or_union_StartIndex = input.index();

        Object root_0 = null;

        Token set186=null;

        Object set186_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // nesC.g:469:5: ( STRUCT | UNION | NX_STRUCT | NX_UNION )
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
    // nesC.g:474:1: struct_declaration_list : ( struct_declaration )+ ;
    public final nesCParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        nesCParser.struct_declaration_list_return retval = new nesCParser.struct_declaration_list_return();
        retval.start = input.LT(1);

        int struct_declaration_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.struct_declaration_return struct_declaration187 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // nesC.g:475:5: ( ( struct_declaration )+ )
            // nesC.g:475:10: ( struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // nesC.g:476:10: ( struct_declaration )+
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
            	    // nesC.g:476:10: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list5014);
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
    // nesC.g:479:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final nesCParser.struct_declaration_return struct_declaration() throws RecognitionException {
        nesCParser.struct_declaration_return retval = new nesCParser.struct_declaration_return();
        retval.start = input.LT(1);

        int struct_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal190=null;
        nesCParser.specifier_qualifier_list_return specifier_qualifier_list188 =null;

        nesCParser.struct_declarator_list_return struct_declarator_list189 =null;


        Object char_literal190_tree=null;
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // nesC.g:480:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // nesC.g:480:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration5045);
            specifier_qualifier_list188=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list188.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration5047);
            struct_declarator_list189=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list189.getTree());

            char_literal190=(Token)match(input,189,FOLLOW_189_in_struct_declaration5049); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_189.add(char_literal190);


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
            // 481:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // nesC.g:481:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
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
    // nesC.g:488:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final nesCParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        nesCParser.specifier_qualifier_list_return retval = new nesCParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);

        int specifier_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.type_specifier_return type_specifier191 =null;

        nesCParser.type_qualifier_return type_qualifier192 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // nesC.g:489:5: ( ( type_specifier | type_qualifier )+ )
            // nesC.g:489:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:489:10: ( type_specifier | type_qualifier )+
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
            	    // nesC.g:489:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list5092);
            	    type_specifier191=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier191.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:489:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list5096);
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
    // nesC.g:496:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
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

            // nesC.g:497:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // nesC.g:497:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5122);
            struct_declarator193=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator193.getTree());

            // nesC.g:497:28: ( ',' struct_declarator )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // nesC.g:497:29: ',' struct_declarator
            	    {
            	    char_literal194=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list5125); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal194);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5127);
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
            // 497:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // nesC.g:497:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
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
    // nesC.g:499:1: struct_declarator : ( ( declarator )? ':' constant_expression | declarator );
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

            // nesC.g:500:5: ( ( declarator )? ':' constant_expression | declarator )
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
            case 188:
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
                    // nesC.g:500:10: ( declarator )? ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:500:10: ( declarator )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==LPARENS||LA44_0==RAW_IDENTIFIER||LA44_0==STAR) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // nesC.g:500:10: declarator
                            {
                            pushFollow(FOLLOW_declarator_in_struct_declarator5157);
                            declarator196=declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator196.getTree());

                            }
                            break;

                    }


                    char_literal197=(Token)match(input,188,FOLLOW_188_in_struct_declarator5160); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal197_tree = 
                    (Object)adaptor.create(char_literal197)
                    ;
                    adaptor.addChild(root_0, char_literal197_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator5162);
                    constant_expression198=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression198.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:501:10: declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator5173);
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
    // nesC.g:503:1: enum_specifier : ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier attributes '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier attributes enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) );
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

            // nesC.g:504:5: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier attributes '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier attributes enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) )
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
                    // nesC.g:504:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM200=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM200);


                    // nesC.g:504:15: ( identifier )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RAW_IDENTIFIER) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // nesC.g:504:15: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_enum_specifier5194);
                            identifier201=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier201.getTree());

                            }
                            break;

                    }


                    char_literal202=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal202);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5199);
                    enumerator_list203=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list203.getTree());

                    // nesC.g:504:47: ( ',' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==COMMA) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // nesC.g:504:47: ','
                            {
                            char_literal204=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5201); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal204);


                            }
                            break;

                    }


                    char_literal205=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal205);


                    // AST REWRITE
                    // elements: identifier, enumerator_list, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 505:14: -> ^( ENUM ( identifier )? enumerator_list )
                    {
                        // nesC.g:505:17: ^( ENUM ( identifier )? enumerator_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        // nesC.g:505:24: ( identifier )?
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
                    // nesC.g:506:10: ENUM identifier attributes '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM206=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM206);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5241);
                    identifier207=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier207.getTree());

                    pushFollow(FOLLOW_attributes_in_enum_specifier5243);
                    attributes208=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes208.getTree());

                    char_literal209=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal209);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5247);
                    enumerator_list210=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list210.getTree());

                    // nesC.g:506:57: ( ',' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==COMMA) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // nesC.g:506:57: ','
                            {
                            char_literal211=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5249); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal211);


                            }
                            break;

                    }


                    char_literal212=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal212);


                    // AST REWRITE
                    // elements: identifier, enumerator_list, attributes, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 507:14: -> ^( ENUM identifier attributes enumerator_list )
                    {
                        // nesC.g:507:17: ^( ENUM identifier attributes enumerator_list )
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
                    // nesC.g:508:10: ENUM identifier
                    {
                    ENUM213=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM213);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5290);
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
                    // 509:14: -> ^( ENUM identifier )
                    {
                        // nesC.g:509:17: ^( ENUM identifier )
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
    // nesC.g:511:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
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

            // nesC.g:512:5: ( enumerator ( ',' ! enumerator )* )
            // nesC.g:512:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list5330);
            enumerator215=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator215.getTree());

            // nesC.g:512:21: ( ',' ! enumerator )*
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
            	    // nesC.g:512:22: ',' ! enumerator
            	    {
            	    char_literal216=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list5333); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list5336);
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
    // nesC.g:518:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
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

            // nesC.g:519:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // nesC.g:519:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator5361);
            identifier218=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier218.getTree());

            // nesC.g:519:21: ( '=' constant_expression )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ASSIGN) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // nesC.g:519:22: '=' constant_expression
                    {
                    char_literal219=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator5364); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal219);


                    pushFollow(FOLLOW_constant_expression_in_enumerator5366);
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
            // 519:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // nesC.g:519:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:519:75: ( constant_expression )?
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
    // nesC.g:520:1: type_qualifier : ( CONST | RESTRICT | VOLATILE );
    public final nesCParser.type_qualifier_return type_qualifier() throws RecognitionException {
        nesCParser.type_qualifier_return retval = new nesCParser.type_qualifier_return();
        retval.start = input.LT(1);

        int type_qualifier_StartIndex = input.index();

        Object root_0 = null;

        Token set221=null;

        Object set221_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // nesC.g:521:5: ( CONST | RESTRICT | VOLATILE )
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
    // nesC.g:525:1: function_specifier : INLINE ;
    public final nesCParser.function_specifier_return function_specifier() throws RecognitionException {
        nesCParser.function_specifier_return retval = new nesCParser.function_specifier_return();
        retval.start = input.LT(1);

        int function_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token INLINE222=null;

        Object INLINE222_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // nesC.g:526:5: ( INLINE )
            // nesC.g:526:10: INLINE
            {
            root_0 = (Object)adaptor.nil();


            INLINE222=(Token)match(input,INLINE,FOLLOW_INLINE_in_function_specifier5438); if (state.failed) return retval;
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
    // nesC.g:528:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
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

            // nesC.g:529:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // nesC.g:529:10: ( pointer )? direct_declarator
            {
            // nesC.g:529:10: ( pointer )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==STAR) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // nesC.g:529:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator5453);
                    pointer223=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer223.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator5456);
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
            // 529:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // nesC.g:529:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // nesC.g:529:53: ( pointer )?
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
    // nesC.g:531:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final nesCParser.direct_declarator_return direct_declarator() throws RecognitionException {
        nesCParser.direct_declarator_return retval = new nesCParser.direct_declarator_return();
        retval.start = input.LT(1);

        int direct_declarator_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.direct_declarator_identifier_return direct_declarator_identifier225 =null;

        nesCParser.direct_declarator_modifier_return direct_declarator_modifier226 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // nesC.g:532:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // nesC.g:532:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator5481);
            direct_declarator_identifier225=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier225.getTree());

            // nesC.g:532:38: ( direct_declarator_modifier )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==LBRACKET||LA53_0==LPARENS) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // nesC.g:532:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator5483);
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
    // nesC.g:543:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
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

            // nesC.g:544:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
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
                    // nesC.g:544:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5509);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // nesC.g:544:29: ( '.' identifier )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==DOT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // nesC.g:544:30: '.' identifier
                            {
                            char_literal227=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier5512); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal227);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5514);
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
                    // 548:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:548:18: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:549:9: '(' declarator ')'
                    {
                    char_literal229=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier5549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal229);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier5551);
                    declarator230=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator230.getTree());

                    char_literal231=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier5553); if (state.failed) return retval; 
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
                    // 549:28: -> declarator
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
    // nesC.g:555:1: direct_declarator_modifier : ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
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

            // nesC.g:556:5: ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
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
                    // nesC.g:556:9: '[' ( constant_expression )? ']'
                    {
                    char_literal232=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal232);


                    // nesC.g:556:13: ( constant_expression )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==AMP||LA56_0==BITCOMPLEMENT||LA56_0==CALL||LA56_0==CHARACTER_LITERAL||LA56_0==CONSTANT||LA56_0==LPARENS||LA56_0==MINUS||LA56_0==MINUSMINUS||LA56_0==NOT||LA56_0==PLUS||LA56_0==PLUSPLUS||LA56_0==POST||LA56_0==RAW_IDENTIFIER||LA56_0==SIGNAL||LA56_0==SIZEOF||LA56_0==STAR||LA56_0==STRING_LITERAL) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // nesC.g:556:13: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier5577);
                            constant_expression233=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression233.getTree());

                            }
                            break;

                    }


                    char_literal234=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5580); if (state.failed) return retval; 
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
                    // 557:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // nesC.g:557:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // nesC.g:557:44: ( constant_expression )?
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
                    // nesC.g:558:9: ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')'
                    {
                    // nesC.g:558:9: ( '[' gen= parameter_type_list ']' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==LBRACKET) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // nesC.g:558:10: '[' gen= parameter_type_list ']'
                            {
                            char_literal235=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5612); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal235);


                            pushFollow(FOLLOW_parameter_type_list_in_direct_declarator_modifier5616);
                            gen=parameter_type_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_type_list.add(gen.getTree());

                            char_literal236=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5618); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal236);


                            }
                            break;

                    }


                    char_literal237=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier5622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal237);


                    pushFollow(FOLLOW_parameter_type_list_in_direct_declarator_modifier5626);
                    normal=parameter_type_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_type_list.add(normal.getTree());

                    char_literal238=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier5628); if (state.failed) return retval; 
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
                    // 559:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // nesC.g:559:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
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
    // nesC.g:565:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
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

            // nesC.g:566:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // nesC.g:566:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal239=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal239);


                    // nesC.g:566:14: ( type_qualifier_list )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==CONST||LA59_0==RESTRICT||LA59_0==VOLATILE) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // nesC.g:566:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5670);
                            type_qualifier_list240=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list240.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer5673);
                    pointer241=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer241.getTree());

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
                    // 566:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // nesC.g:566:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:566:66: ( type_qualifier_list )?
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
                    // nesC.g:567:10: '*' ( type_qualifier_list )?
                    {
                    char_literal242=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal242);


                    // nesC.g:567:14: ( type_qualifier_list )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==CONST||LA60_0==RESTRICT||LA60_0==VOLATILE) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // nesC.g:567:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5697);
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
                    // 567:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // nesC.g:567:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:567:58: ( type_qualifier_list )?
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
    // nesC.g:569:1: type_qualifier_list : ( type_qualifier )+ ;
    public final nesCParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        nesCParser.type_qualifier_list_return retval = new nesCParser.type_qualifier_list_return();
        retval.start = input.LT(1);

        int type_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.type_qualifier_return type_qualifier244 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // nesC.g:570:5: ( ( type_qualifier )+ )
            // nesC.g:570:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:570:10: ( type_qualifier )+
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
            	    // nesC.g:570:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list5726);
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
    // nesC.g:573:1: parameter_type_list : parameter_list ( ',' '...' )? ;
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

            // nesC.g:574:5: ( parameter_list ( ',' '...' )? )
            // nesC.g:574:10: parameter_list ( ',' '...' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_parameter_list_in_parameter_type_list5747);
            parameter_list245=parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list245.getTree());

            // nesC.g:574:25: ( ',' '...' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==COMMA) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // nesC.g:574:26: ',' '...'
                    {
                    char_literal246=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_type_list5750); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal246_tree = 
                    (Object)adaptor.create(char_literal246)
                    ;
                    adaptor.addChild(root_0, char_literal246_tree);
                    }

                    string_literal247=(Token)match(input,187,FOLLOW_187_in_parameter_type_list5752); if (state.failed) return retval;
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
    // nesC.g:580:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* -> ^( PARAMETER_LIST ( parameter_declaration )+ ) | -> ^( PARAMETER_LIST ) );
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

            // nesC.g:581:5: ( parameter_declaration ( ',' parameter_declaration )* -> ^( PARAMETER_LIST ( parameter_declaration )+ ) | -> ^( PARAMETER_LIST ) )
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
                    // nesC.g:581:10: parameter_declaration ( ',' parameter_declaration )*
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list5777);
                    parameter_declaration248=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration248.getTree());

                    // nesC.g:581:32: ( ',' parameter_declaration )*
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
                    	    // nesC.g:581:33: ',' parameter_declaration
                    	    {
                    	    char_literal249=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list5780); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal249);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list5782);
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
                    // 582:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ )
                    {
                        // nesC.g:582:16: ^( PARAMETER_LIST ( parameter_declaration )+ )
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
                    // nesC.g:584:13: 
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
                    // 584:13: -> ^( PARAMETER_LIST )
                    {
                        // nesC.g:584:16: ^( PARAMETER_LIST )
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
    // nesC.g:590:1: parameter_declaration : ( declaration_specifiers declarator ( attributes )? -> ^( PARAMETER declaration_specifiers declarator ( attributes )? ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) );
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

            // nesC.g:591:5: ( declaration_specifiers declarator ( attributes )? -> ^( PARAMETER declaration_specifiers declarator ( attributes )? ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) )
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
                    // nesC.g:591:10: declaration_specifiers declarator ( attributes )?
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration5849);
                    declaration_specifiers251=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers251.getTree());

                    pushFollow(FOLLOW_declarator_in_parameter_declaration5851);
                    declarator252=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator252.getTree());

                    // nesC.g:591:44: ( attributes )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==ATTRIBUTE) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // nesC.g:591:44: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_parameter_declaration5853);
                            attributes253=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes253.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: declaration_specifiers, attributes, declarator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 592:13: -> ^( PARAMETER declaration_specifiers declarator ( attributes )? )
                    {
                        // nesC.g:592:16: ^( PARAMETER declaration_specifiers declarator ( attributes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        adaptor.addChild(root_1, stream_declarator.nextTree());

                        // nesC.g:592:62: ( attributes )?
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
                    // nesC.g:593:10: declaration_specifiers ( abstract_declarator )?
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration5890);
                    declaration_specifiers254=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers254.getTree());

                    // nesC.g:593:33: ( abstract_declarator )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==LBRACKET||LA67_0==LPARENS||LA67_0==STAR) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // nesC.g:593:33: abstract_declarator
                            {
                            pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration5892);
                            abstract_declarator255=abstract_declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_abstract_declarator.add(abstract_declarator255.getTree());

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
                    // 594:13: -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                    {
                        // nesC.g:594:16: ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:594:51: ( abstract_declarator )?
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
    // nesC.g:596:1: identifier_list : identifier ( ',' identifier )* -> ( identifier )+ ;
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

            // nesC.g:597:5: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // nesC.g:597:10: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifier_list5935);
            identifier256=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier256.getTree());

            // nesC.g:597:21: ( ',' identifier )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==COMMA) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // nesC.g:597:22: ',' identifier
            	    {
            	    char_literal257=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifier_list5938); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal257);


            	    pushFollow(FOLLOW_identifier_in_identifier_list5940);
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
            // 597:39: -> ( identifier )+
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
    // nesC.g:599:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final nesCParser.type_name_return type_name() throws RecognitionException {
        nesCParser.type_name_return retval = new nesCParser.type_name_return();
        retval.start = input.LT(1);

        int type_name_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.specifier_qualifier_list_return specifier_qualifier_list259 =null;

        nesCParser.abstract_declarator_return abstract_declarator260 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // nesC.g:600:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // nesC.g:600:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name5966);
            specifier_qualifier_list259=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list259.getTree());

            // nesC.g:600:35: ( abstract_declarator )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LBRACKET||LA70_0==LPARENS||LA70_0==STAR) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // nesC.g:600:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name5968);
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
    // nesC.g:602:1: abstract_declarator : ( ( pointer )? direct_abstract_declarator | pointer );
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

            // nesC.g:603:5: ( ( pointer )? direct_abstract_declarator | pointer )
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
                    // nesC.g:603:10: ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:603:10: ( pointer )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==STAR) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // nesC.g:603:10: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator5988);
                            pointer261=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer261.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator5991);
                    direct_abstract_declarator262=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator262.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:604:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator6002);
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
    // nesC.g:606:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )* ;
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

            // nesC.g:607:5: ( ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )* )
            // nesC.g:607:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:607:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )
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
                    // nesC.g:607:11: '(' abstract_declarator ')'
                    {
                    char_literal264=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6022); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal264_tree = 
                    (Object)adaptor.create(char_literal264)
                    ;
                    adaptor.addChild(root_0, char_literal264_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator6024);
                    abstract_declarator265=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator265.getTree());

                    char_literal266=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6029); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal266_tree = 
                    (Object)adaptor.create(char_literal266)
                    ;
                    adaptor.addChild(root_0, char_literal266_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:608:11: '[' ( assignment_expression )? ']'
                    {
                    char_literal267=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator6043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal267_tree = 
                    (Object)adaptor.create(char_literal267)
                    ;
                    adaptor.addChild(root_0, char_literal267_tree);
                    }

                    // nesC.g:608:15: ( assignment_expression )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==AMP||LA73_0==BITCOMPLEMENT||LA73_0==CALL||LA73_0==CHARACTER_LITERAL||LA73_0==CONSTANT||LA73_0==LPARENS||LA73_0==MINUS||LA73_0==MINUSMINUS||LA73_0==NOT||LA73_0==PLUS||LA73_0==PLUSPLUS||LA73_0==POST||LA73_0==RAW_IDENTIFIER||LA73_0==SIGNAL||LA73_0==SIZEOF||LA73_0==STAR||LA73_0==STRING_LITERAL) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // nesC.g:608:15: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator6045);
                            assignment_expression268=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression268.getTree());

                            }
                            break;

                    }


                    char_literal269=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator6048); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal269_tree = 
                    (Object)adaptor.create(char_literal269)
                    ;
                    adaptor.addChild(root_0, char_literal269_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:609:11: '(' ( parameter_type_list )? ')'
                    {
                    char_literal270=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6062); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal270_tree = 
                    (Object)adaptor.create(char_literal270)
                    ;
                    adaptor.addChild(root_0, char_literal270_tree);
                    }

                    // nesC.g:609:15: ( parameter_type_list )?
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
                            // nesC.g:609:15: parameter_type_list
                            {
                            pushFollow(FOLLOW_parameter_type_list_in_direct_abstract_declarator6064);
                            parameter_type_list271=parameter_type_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list271.getTree());

                            }
                            break;

                    }


                    char_literal272=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6069); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal272_tree = 
                    (Object)adaptor.create(char_literal272)
                    ;
                    adaptor.addChild(root_0, char_literal272_tree);
                    }

                    }
                    break;

            }


            // nesC.g:610:14: ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )*
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
            	    // nesC.g:610:15: '[' ( assignment_expression )? ']'
            	    {
            	    char_literal273=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator6086); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal273_tree = 
            	    (Object)adaptor.create(char_literal273)
            	    ;
            	    adaptor.addChild(root_0, char_literal273_tree);
            	    }

            	    // nesC.g:610:19: ( assignment_expression )?
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==AMP||LA76_0==BITCOMPLEMENT||LA76_0==CALL||LA76_0==CHARACTER_LITERAL||LA76_0==CONSTANT||LA76_0==LPARENS||LA76_0==MINUS||LA76_0==MINUSMINUS||LA76_0==NOT||LA76_0==PLUS||LA76_0==PLUSPLUS||LA76_0==POST||LA76_0==RAW_IDENTIFIER||LA76_0==SIGNAL||LA76_0==SIZEOF||LA76_0==STAR||LA76_0==STRING_LITERAL) ) {
            	        alt76=1;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // nesC.g:610:19: assignment_expression
            	            {
            	            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator6088);
            	            assignment_expression274=assignment_expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression274.getTree());

            	            }
            	            break;

            	    }


            	    char_literal275=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator6091); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal275_tree = 
            	    (Object)adaptor.create(char_literal275)
            	    ;
            	    adaptor.addChild(root_0, char_literal275_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:610:48: '(' ( parameter_type_list )? ')'
            	    {
            	    char_literal276=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6095); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal276_tree = 
            	    (Object)adaptor.create(char_literal276)
            	    ;
            	    adaptor.addChild(root_0, char_literal276_tree);
            	    }

            	    // nesC.g:610:52: ( parameter_type_list )?
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
            	            // nesC.g:610:52: parameter_type_list
            	            {
            	            pushFollow(FOLLOW_parameter_type_list_in_direct_abstract_declarator6097);
            	            parameter_type_list277=parameter_type_list();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list277.getTree());

            	            }
            	            break;

            	    }


            	    char_literal278=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6100); if (state.failed) return retval;
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
    // nesC.g:613:1: typedef_name : id= RAW_IDENTIFIER {...}?;
    public final nesCParser.typedef_name_return typedef_name() throws RecognitionException {
        nesCParser.typedef_name_return retval = new nesCParser.typedef_name_return();
        retval.start = input.LT(1);

        int typedef_name_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // nesC.g:614:5: (id= RAW_IDENTIFIER {...}?)
            // nesC.g:614:10: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name6129); if (state.failed) return retval;
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
    // nesC.g:623:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
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

            // nesC.g:624:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
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
                    // nesC.g:624:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer6169);
                    assignment_expression279=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression279.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:625:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal280=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer6180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal280);


                    pushFollow(FOLLOW_initializer_list_in_initializer6182);
                    initializer_list281=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list281.getTree());

                    // nesC.g:625:31: ( ',' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==COMMA) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // nesC.g:625:31: ','
                            {
                            char_literal282=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer6184); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal282);


                            }
                            break;

                    }


                    char_literal283=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer6187); if (state.failed) return retval; 
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
                    // 625:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // nesC.g:625:43: ^( INITIALIZER_LIST initializer_list )
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
    // nesC.g:629:1: initializer_list : ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ ;
    public final nesCParser.initializer_list_return initializer_list() throws RecognitionException {
        nesCParser.initializer_list_return retval = new nesCParser.initializer_list_return();
        retval.start = input.LT(1);

        int initializer_list_StartIndex = input.index();

        Object root_0 = null;

        Token RAW_IDENTIFIER284=null;
        Token char_literal285=null;
        Token char_literal287=null;
        Token RAW_IDENTIFIER288=null;
        Token char_literal289=null;
        nesCParser.initializer_return initializer286 =null;

        nesCParser.initializer_return initializer290 =null;


        Object RAW_IDENTIFIER284_tree=null;
        Object char_literal285_tree=null;
        Object char_literal287_tree=null;
        Object RAW_IDENTIFIER288_tree=null;
        Object char_literal289_tree=null;
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // nesC.g:630:5: ( ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ )
            // nesC.g:630:10: ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            {
            // nesC.g:630:10: ( RAW_IDENTIFIER ':' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RAW_IDENTIFIER) ) {
                int LA81_1 = input.LA(2);

                if ( (LA81_1==188) ) {
                    alt81=1;
                }
            }
            switch (alt81) {
                case 1 :
                    // nesC.g:630:11: RAW_IDENTIFIER ':'
                    {
                    RAW_IDENTIFIER284=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER284);


                    char_literal285=(Token)match(input,188,FOLLOW_188_in_initializer_list6219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_188.add(char_literal285);


                    }
                    break;

            }


            pushFollow(FOLLOW_initializer_in_initializer_list6223);
            initializer286=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer286.getTree());

            // nesC.g:630:44: ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
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
            	    // nesC.g:630:45: ',' ( RAW_IDENTIFIER ':' )? initializer
            	    {
            	    char_literal287=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list6226); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal287);


            	    // nesC.g:630:49: ( RAW_IDENTIFIER ':' )?
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==RAW_IDENTIFIER) ) {
            	        int LA82_1 = input.LA(2);

            	        if ( (LA82_1==188) ) {
            	            alt82=1;
            	        }
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // nesC.g:630:50: RAW_IDENTIFIER ':'
            	            {
            	            RAW_IDENTIFIER288=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list6229); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER288);


            	            char_literal289=(Token)match(input,188,FOLLOW_188_in_initializer_list6231); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_188.add(char_literal289);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_initializer_in_initializer_list6235);
            	    initializer290=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer290.getTree());

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
            // 631:13: -> ( initializer )+
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
    // nesC.g:637:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement | line_directive );
    public final nesCParser.statement_return statement() throws RecognitionException {
        nesCParser.statement_return retval = new nesCParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.labeled_statement_return labeled_statement291 =null;

        nesCParser.compound_statement_return compound_statement292 =null;

        nesCParser.expression_statement_return expression_statement293 =null;

        nesCParser.selection_statement_return selection_statement294 =null;

        nesCParser.iteration_statement_return iteration_statement295 =null;

        nesCParser.jump_statement_return jump_statement296 =null;

        nesCParser.atomic_statement_return atomic_statement297 =null;

        nesCParser.line_directive_return line_directive298 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // nesC.g:638:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement | line_directive )
            int alt84=8;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==188) ) {
                    alt84=1;
                }
                else if ( ((LA84_1 >= AMP && LA84_1 <= AND)||LA84_1==ARROW||LA84_1==ASSIGN||LA84_1==BITANDASSIGN||(LA84_1 >= BITOR && LA84_1 <= BITXORASSIGN)||LA84_1==COMMA||(LA84_1 >= DIVASSIGN && LA84_1 <= DIVIDE)||LA84_1==DOT||LA84_1==EQUAL||(LA84_1 >= GREATER && LA84_1 <= GREATEREQUAL)||(LA84_1 >= LBRACKET && LA84_1 <= LESSEQUAL)||(LA84_1 >= LPARENS && LA84_1 <= MODASSIGN)||(LA84_1 >= MODULUS && LA84_1 <= MULASSIGN)||LA84_1==NOTEQUAL||LA84_1==OR||(LA84_1 >= PLUS && LA84_1 <= PLUSPLUS)||(LA84_1 >= RSHIFT && LA84_1 <= RSHIFTASSIGN)||LA84_1==STAR||LA84_1==189||LA84_1==191) ) {
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
            case 189:
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
            case HASH:
                {
                alt84=8;
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
                    // nesC.g:638:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement6280);
                    labeled_statement291=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement291.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:639:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement6291);
                    compound_statement292=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement292.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:640:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement6302);
                    expression_statement293=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement293.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:641:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement6313);
                    selection_statement294=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement294.getTree());

                    }
                    break;
                case 5 :
                    // nesC.g:642:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement6324);
                    iteration_statement295=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement295.getTree());

                    }
                    break;
                case 6 :
                    // nesC.g:643:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement6335);
                    jump_statement296=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement296.getTree());

                    }
                    break;
                case 7 :
                    // nesC.g:644:10: atomic_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atomic_statement_in_statement6346);
                    atomic_statement297=atomic_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomic_statement297.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:645:10: line_directive
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_line_directive_in_statement6357);
                    line_directive298=line_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive298.getTree());

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
    // nesC.g:648:1: atomic_statement : ATOMIC statement -> ^( ATOMIC statement ) ;
    public final nesCParser.atomic_statement_return atomic_statement() throws RecognitionException {
        nesCParser.atomic_statement_return retval = new nesCParser.atomic_statement_return();
        retval.start = input.LT(1);

        int atomic_statement_StartIndex = input.index();

        Object root_0 = null;

        Token ATOMIC299=null;
        nesCParser.statement_return statement300 =null;


        Object ATOMIC299_tree=null;
        RewriteRuleTokenStream stream_ATOMIC=new RewriteRuleTokenStream(adaptor,"token ATOMIC");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // nesC.g:649:5: ( ATOMIC statement -> ^( ATOMIC statement ) )
            // nesC.g:649:10: ATOMIC statement
            {
            ATOMIC299=(Token)match(input,ATOMIC,FOLLOW_ATOMIC_in_atomic_statement6381); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATOMIC.add(ATOMIC299);


            pushFollow(FOLLOW_statement_in_atomic_statement6383);
            statement300=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement300.getTree());

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
            // 649:27: -> ^( ATOMIC statement )
            {
                // nesC.g:649:30: ^( ATOMIC statement )
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
    // nesC.g:651:1: labeled_statement : ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final nesCParser.labeled_statement_return labeled_statement() throws RecognitionException {
        nesCParser.labeled_statement_return retval = new nesCParser.labeled_statement_return();
        retval.start = input.LT(1);

        int labeled_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal302=null;
        Token CASE304=null;
        Token char_literal306=null;
        Token DEFAULT308=null;
        Token char_literal309=null;
        nesCParser.identifier_return identifier301 =null;

        nesCParser.statement_return statement303 =null;

        nesCParser.constant_expression_return constant_expression305 =null;

        nesCParser.statement_return statement307 =null;

        nesCParser.statement_return statement310 =null;


        Object char_literal302_tree=null;
        Object CASE304_tree=null;
        Object char_literal306_tree=null;
        Object DEFAULT308_tree=null;
        Object char_literal309_tree=null;
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // nesC.g:652:5: ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
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
                    // nesC.g:652:10: identifier ':' statement
                    {
                    pushFollow(FOLLOW_identifier_in_labeled_statement6410);
                    identifier301=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier301.getTree());

                    char_literal302=(Token)match(input,188,FOLLOW_188_in_labeled_statement6412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_188.add(char_literal302);


                    pushFollow(FOLLOW_statement_in_labeled_statement6414);
                    statement303=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement303.getTree());

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
                    // 652:35: -> ^( LABELED_STATEMENT identifier statement )
                    {
                        // nesC.g:652:38: ^( LABELED_STATEMENT identifier statement )
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
                    // nesC.g:653:10: CASE constant_expression ':' statement
                    {
                    CASE304=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement6435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE304);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement6437);
                    constant_expression305=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression305.getTree());

                    char_literal306=(Token)match(input,188,FOLLOW_188_in_labeled_statement6439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_188.add(char_literal306);


                    pushFollow(FOLLOW_statement_in_labeled_statement6441);
                    statement307=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement307.getTree());

                    // AST REWRITE
                    // elements: constant_expression, statement, CASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 653:49: -> ^( CASE constant_expression statement )
                    {
                        // nesC.g:653:52: ^( CASE constant_expression statement )
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
                    // nesC.g:654:10: DEFAULT ':' statement
                    {
                    DEFAULT308=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement6462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT308);


                    char_literal309=(Token)match(input,188,FOLLOW_188_in_labeled_statement6464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_188.add(char_literal309);


                    pushFollow(FOLLOW_statement_in_labeled_statement6466);
                    statement310=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement310.getTree());

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
                    // 654:32: -> ^( DEFAULT statement )
                    {
                        // nesC.g:654:35: ^( DEFAULT statement )
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
    // nesC.g:659:1: compound_statement : '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) ;
    public final nesCParser.compound_statement_return compound_statement() throws RecognitionException {
        nesCParser.compound_statement_return retval = new nesCParser.compound_statement_return();
        retval.start = input.LT(1);

        int compound_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal311=null;
        Token char_literal313=null;
        nesCParser.block_item_return block_item312 =null;


        Object char_literal311_tree=null;
        Object char_literal313_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_block_item=new RewriteRuleSubtreeStream(adaptor,"rule block_item");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // nesC.g:660:5: ( '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) )
            // nesC.g:660:10: '{' ( block_item )* '}'
            {
            char_literal311=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement6492); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal311);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:661:10: ( block_item )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==AMP||(LA86_0 >= ASYNC && LA86_0 <= ATOMIC)||LA86_0==AUTO||LA86_0==BITCOMPLEMENT||(LA86_0 >= BREAK && LA86_0 <= CASE)||(LA86_0 >= CHAR && LA86_0 <= CHARACTER_LITERAL)||LA86_0==COMMAND||(LA86_0 >= CONST && LA86_0 <= CONTINUE)||LA86_0==DEFAULT||LA86_0==DO||(LA86_0 >= DOUBLE && LA86_0 <= DUTY)||LA86_0==ENUM||(LA86_0 >= EVENT && LA86_0 <= EXTERN)||(LA86_0 >= FLOAT && LA86_0 <= FOR)||LA86_0==GOTO||LA86_0==HASH||LA86_0==IF||(LA86_0 >= INLINE && LA86_0 <= INT8_T)||LA86_0==LBRACE||(LA86_0 >= LONG && LA86_0 <= LPARENS)||LA86_0==MINUS||LA86_0==MINUSMINUS||(LA86_0 >= NORACE && LA86_0 <= NOT)||(LA86_0 >= NXLE_UINT16_T && LA86_0 <= NX_UNION)||LA86_0==PLUS||LA86_0==PLUSPLUS||LA86_0==POST||LA86_0==RAW_IDENTIFIER||LA86_0==REGISTER||(LA86_0 >= RESTRICT && LA86_0 <= RETURN)||(LA86_0 >= SHORT && LA86_0 <= SIZEOF)||LA86_0==STAR||(LA86_0 >= STATIC && LA86_0 <= UINT8_T)||(LA86_0 >= UNION && LA86_0 <= UNSIGNED)||(LA86_0 >= VOID && LA86_0 <= WHILE)||LA86_0==189) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // nesC.g:661:10: block_item
            	    {
            	    pushFollow(FOLLOW_block_item_in_compound_statement6505);
            	    block_item312=block_item();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block_item.add(block_item312.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal313=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement6523); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal313);


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
            // 662:44: -> ^( COMPOUND_STATEMENT ( block_item )* )
            {
                // nesC.g:662:47: ^( COMPOUND_STATEMENT ( block_item )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // nesC.g:662:68: ( block_item )*
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
    // nesC.g:664:1: block_item : ( declaration | statement );
    public final nesCParser.block_item_return block_item() throws RecognitionException {
        nesCParser.block_item_return retval = new nesCParser.block_item_return();
        retval.start = input.LT(1);

        int block_item_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_return declaration314 =null;

        nesCParser.statement_return statement315 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // nesC.g:665:5: ( declaration | statement )
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // nesC.g:665:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_block_item6547);
                    declaration314=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration314.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:666:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_block_item6558);
                    statement315=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement315.getTree());

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
    // nesC.g:672:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final nesCParser.expression_statement_return expression_statement() throws RecognitionException {
        nesCParser.expression_statement_return retval = new nesCParser.expression_statement_return();
        retval.start = input.LT(1);

        int expression_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal317=null;
        nesCParser.expression_return expression316 =null;


        Object char_literal317_tree=null;
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // nesC.g:673:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // nesC.g:673:10: ( expression )? ';'
            {
            // nesC.g:673:10: ( expression )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==AMP||LA88_0==BITCOMPLEMENT||LA88_0==CALL||LA88_0==CHARACTER_LITERAL||LA88_0==CONSTANT||LA88_0==LPARENS||LA88_0==MINUS||LA88_0==MINUSMINUS||LA88_0==NOT||LA88_0==PLUS||LA88_0==PLUSPLUS||LA88_0==POST||LA88_0==RAW_IDENTIFIER||LA88_0==SIGNAL||LA88_0==SIZEOF||LA88_0==STAR||LA88_0==STRING_LITERAL) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // nesC.g:673:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement6581);
                    expression316=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression316.getTree());

                    }
                    break;

            }


            char_literal317=(Token)match(input,189,FOLLOW_189_in_expression_statement6584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_189.add(char_literal317);


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
            // 673:26: -> ^( STATEMENT ( expression )? )
            {
                // nesC.g:673:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // nesC.g:673:41: ( expression )?
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
    // nesC.g:675:1: selection_statement : ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final nesCParser.selection_statement_return selection_statement() throws RecognitionException {
        nesCParser.selection_statement_return retval = new nesCParser.selection_statement_return();
        retval.start = input.LT(1);

        int selection_statement_StartIndex = input.index();

        Object root_0 = null;

        Token IF318=null;
        Token char_literal319=null;
        Token char_literal321=null;
        Token ELSE323=null;
        Token SWITCH325=null;
        Token char_literal326=null;
        Token char_literal328=null;
        nesCParser.expression_return expression320 =null;

        nesCParser.statement_return statement322 =null;

        nesCParser.statement_return statement324 =null;

        nesCParser.expression_return expression327 =null;

        nesCParser.statement_return statement329 =null;


        Object IF318_tree=null;
        Object char_literal319_tree=null;
        Object char_literal321_tree=null;
        Object ELSE323_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // nesC.g:676:5: ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==IF) ) {
                alt90=1;
            }
            else if ( (LA90_0==SWITCH) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }
            switch (alt90) {
                case 1 :
                    // nesC.g:676:10: IF '(' expression ')' statement ( ELSE statement )?
                    {
                    IF318=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF318);


                    char_literal319=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal319);


                    pushFollow(FOLLOW_expression_in_selection_statement6616);
                    expression320=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression320.getTree());

                    char_literal321=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal321);


                    pushFollow(FOLLOW_statement_in_selection_statement6620);
                    statement322=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement322.getTree());

                    // nesC.g:676:42: ( ELSE statement )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==ELSE) ) {
                        int LA89_1 = input.LA(2);

                        if ( (synpred176_nesC()) ) {
                            alt89=1;
                        }
                    }
                    switch (alt89) {
                        case 1 :
                            // nesC.g:676:43: ELSE statement
                            {
                            ELSE323=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement6623); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE323);


                            pushFollow(FOLLOW_statement_in_selection_statement6625);
                            statement324=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(statement324.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: statement, expression, IF, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 677:14: -> ^( IF expression statement ( statement )? )
                    {
                        // nesC.g:677:17: ^( IF expression statement ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        // nesC.g:677:43: ( statement )?
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
                    // nesC.g:678:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH325=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement6664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH325);


                    char_literal326=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal326);


                    pushFollow(FOLLOW_expression_in_selection_statement6668);
                    expression327=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression327.getTree());

                    char_literal328=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal328);


                    pushFollow(FOLLOW_statement_in_selection_statement6672);
                    statement329=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement329.getTree());

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
                    // 679:14: -> ^( SWITCH expression statement )
                    {
                        // nesC.g:679:17: ^( SWITCH expression statement )
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
    // nesC.g:685:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final nesCParser.iteration_statement_return iteration_statement() throws RecognitionException {
        nesCParser.iteration_statement_return retval = new nesCParser.iteration_statement_return();
        retval.start = input.LT(1);

        int iteration_statement_StartIndex = input.index();

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
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // nesC.g:686:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
            int alt94=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt94=1;
                }
                break;
            case DO:
                {
                alt94=2;
                }
                break;
            case FOR:
                {
                alt94=3;
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
                    // nesC.g:686:10: WHILE '(' expression ')' statement
                    {
                    WHILE330=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE330);


                    char_literal331=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal331);


                    pushFollow(FOLLOW_expression_in_iteration_statement6722);
                    expression332=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression332.getTree());

                    char_literal333=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal333);


                    pushFollow(FOLLOW_statement_in_iteration_statement6726);
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
                    // 686:45: -> ^( WHILE expression statement )
                    {
                        // nesC.g:686:48: ^( WHILE expression statement )
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
                    // nesC.g:687:10: DO statement WHILE '(' expression ')' ';'
                    {
                    DO335=(Token)match(input,DO,FOLLOW_DO_in_iteration_statement6747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO335);


                    pushFollow(FOLLOW_statement_in_iteration_statement6749);
                    statement336=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement336.getTree());

                    WHILE337=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE337);


                    char_literal338=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal338);


                    pushFollow(FOLLOW_expression_in_iteration_statement6755);
                    expression339=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression339.getTree());

                    char_literal340=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal340);


                    char_literal341=(Token)match(input,189,FOLLOW_189_in_iteration_statement6759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal341);


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
                    // 687:52: -> ^( DO statement expression )
                    {
                        // nesC.g:687:55: ^( DO statement expression )
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
                    // nesC.g:688:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR342=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement6780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR342);


                    char_literal343=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6782); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal343);


                    // nesC.g:688:22: (init= expression )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==AMP||LA91_0==BITCOMPLEMENT||LA91_0==CALL||LA91_0==CHARACTER_LITERAL||LA91_0==CONSTANT||LA91_0==LPARENS||LA91_0==MINUS||LA91_0==MINUSMINUS||LA91_0==NOT||LA91_0==PLUS||LA91_0==PLUSPLUS||LA91_0==POST||LA91_0==RAW_IDENTIFIER||LA91_0==SIGNAL||LA91_0==SIZEOF||LA91_0==STAR||LA91_0==STRING_LITERAL) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // nesC.g:688:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6786);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal344=(Token)match(input,189,FOLLOW_189_in_iteration_statement6789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal344);


                    // nesC.g:688:43: (cond= expression )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==AMP||LA92_0==BITCOMPLEMENT||LA92_0==CALL||LA92_0==CHARACTER_LITERAL||LA92_0==CONSTANT||LA92_0==LPARENS||LA92_0==MINUS||LA92_0==MINUSMINUS||LA92_0==NOT||LA92_0==PLUS||LA92_0==PLUSPLUS||LA92_0==POST||LA92_0==RAW_IDENTIFIER||LA92_0==SIGNAL||LA92_0==SIZEOF||LA92_0==STAR||LA92_0==STRING_LITERAL) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // nesC.g:688:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6793);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal345=(Token)match(input,189,FOLLOW_189_in_iteration_statement6796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal345);


                    // nesC.g:688:64: (iter= expression )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==AMP||LA93_0==BITCOMPLEMENT||LA93_0==CALL||LA93_0==CHARACTER_LITERAL||LA93_0==CONSTANT||LA93_0==LPARENS||LA93_0==MINUS||LA93_0==MINUSMINUS||LA93_0==NOT||LA93_0==PLUS||LA93_0==PLUSPLUS||LA93_0==POST||LA93_0==RAW_IDENTIFIER||LA93_0==SIGNAL||LA93_0==SIZEOF||LA93_0==STAR||LA93_0==STRING_LITERAL) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // nesC.g:688:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6800);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal346=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal346);


                    pushFollow(FOLLOW_statement_in_iteration_statement6805);
                    statement347=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement347.getTree());

                    // AST REWRITE
                    // elements: statement, init, iter, FOR, cond
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
                    // 689:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // nesC.g:689:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // nesC.g:689:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // nesC.g:689:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:690:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // nesC.g:690:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:691:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // nesC.g:691:40: ( $iter)?
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
    // nesC.g:693:1: jump_statement : ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) );
    public final nesCParser.jump_statement_return jump_statement() throws RecognitionException {
        nesCParser.jump_statement_return retval = new nesCParser.jump_statement_return();
        retval.start = input.LT(1);

        int jump_statement_StartIndex = input.index();

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
        RewriteRuleTokenStream stream_GOTO=new RewriteRuleTokenStream(adaptor,"token GOTO");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // nesC.g:694:5: ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case GOTO:
                {
                alt96=1;
                }
                break;
            case CONTINUE:
                {
                alt96=2;
                }
                break;
            case BREAK:
                {
                alt96=3;
                }
                break;
            case RETURN:
                {
                alt96=4;
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
                    // nesC.g:694:10: GOTO identifier ';'
                    {
                    GOTO348=(Token)match(input,GOTO,FOLLOW_GOTO_in_jump_statement6912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GOTO.add(GOTO348);


                    pushFollow(FOLLOW_identifier_in_jump_statement6914);
                    identifier349=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier349.getTree());

                    char_literal350=(Token)match(input,189,FOLLOW_189_in_jump_statement6916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal350);


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
                    // 694:30: -> ^( GOTO identifier )
                    {
                        // nesC.g:694:33: ^( GOTO identifier )
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
                    // nesC.g:695:10: CONTINUE ';'
                    {
                    CONTINUE351=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement6935); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE351);


                    char_literal352=(Token)match(input,189,FOLLOW_189_in_jump_statement6937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal352);


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
                    // 695:23: -> CONTINUE
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
                    // nesC.g:696:10: BREAK ';'
                    {
                    BREAK353=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement6952); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK353);


                    char_literal354=(Token)match(input,189,FOLLOW_189_in_jump_statement6954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal354);


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
                    // 696:20: -> BREAK
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
                    // nesC.g:697:10: RETURN ( expression )? ';'
                    {
                    RETURN355=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement6969); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN355);


                    // nesC.g:697:17: ( expression )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==AMP||LA95_0==BITCOMPLEMENT||LA95_0==CALL||LA95_0==CHARACTER_LITERAL||LA95_0==CONSTANT||LA95_0==LPARENS||LA95_0==MINUS||LA95_0==MINUSMINUS||LA95_0==NOT||LA95_0==PLUS||LA95_0==PLUSPLUS||LA95_0==POST||LA95_0==RAW_IDENTIFIER||LA95_0==SIGNAL||LA95_0==SIZEOF||LA95_0==STAR||LA95_0==STRING_LITERAL) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // nesC.g:697:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_jump_statement6971);
                            expression356=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression356.getTree());

                            }
                            break;

                    }


                    char_literal357=(Token)match(input,189,FOLLOW_189_in_jump_statement6974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal357);


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
                    // 697:33: -> ^( RETURN ( expression )? )
                    {
                        // nesC.g:697:36: ^( RETURN ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_RETURN.nextNode()
                        , root_1);

                        // nesC.g:697:45: ( expression )?
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
    // nesC.g:703:1: translation_unit : ( external_declaration | line_directive )+ ;
    public final nesCParser.translation_unit_return translation_unit() throws RecognitionException {
        nesCParser.translation_unit_return retval = new nesCParser.translation_unit_return();
        retval.start = input.LT(1);

        int translation_unit_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.external_declaration_return external_declaration358 =null;

        nesCParser.line_directive_return line_directive359 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // nesC.g:704:5: ( ( external_declaration | line_directive )+ )
            // nesC.g:704:10: ( external_declaration | line_directive )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:704:10: ( external_declaration | line_directive )+
            int cnt97=0;
            loop97:
            do {
                int alt97=3;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==ASYNC||LA97_0==AUTO||LA97_0==CHAR||LA97_0==COMMAND||LA97_0==CONST||LA97_0==DEFAULT||(LA97_0 >= DOUBLE && LA97_0 <= DUTY)||LA97_0==ENUM||(LA97_0 >= EVENT && LA97_0 <= EXTERN)||LA97_0==FLOAT||(LA97_0 >= INLINE && LA97_0 <= INT8_T)||LA97_0==LONG||LA97_0==NORACE||(LA97_0 >= NXLE_UINT16_T && LA97_0 <= NX_UNION)||LA97_0==RAW_IDENTIFIER||LA97_0==REGISTER||LA97_0==RESTRICT||LA97_0==SHORT||LA97_0==SIGNED||LA97_0==STATIC||LA97_0==STRUCT||(LA97_0 >= TASK && LA97_0 <= UINT8_T)||(LA97_0 >= UNION && LA97_0 <= UNSIGNED)||(LA97_0 >= VOID && LA97_0 <= VOLATILE)) ) {
                    alt97=1;
                }
                else if ( (LA97_0==HASH) ) {
                    alt97=2;
                }


                switch (alt97) {
            	case 1 :
            	    // nesC.g:704:11: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit7010);
            	    external_declaration358=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration358.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:704:34: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit7014);
            	    line_directive359=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive359.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
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
    // nesC.g:707:1: external_declaration : declaration ;
    public final nesCParser.external_declaration_return external_declaration() throws RecognitionException {
        nesCParser.external_declaration_return retval = new nesCParser.external_declaration_return();
        retval.start = input.LT(1);

        int external_declaration_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_return declaration360 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // nesC.g:708:5: ( declaration )
            // nesC.g:708:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration7032);
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
    // nesC.g:722:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )? -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final nesCParser.line_directive_return line_directive() throws RecognitionException {
        nesCParser.line_directive_return retval = new nesCParser.line_directive_return();
        retval.start = input.LT(1);

        int line_directive_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // nesC.g:723:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )? -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // nesC.g:723:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )?
            {
            char_literal361=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive7059); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal361);


            CONSTANT362=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7061); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT362);


            STRING_LITERAL363=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive7063); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL363);


            // nesC.g:723:38: ( CONSTANT )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==CONSTANT) ) {
                int LA98_1 = input.LA(2);

                if ( (synpred189_nesC()) ) {
                    alt98=1;
                }
            }
            switch (alt98) {
                case 1 :
                    // nesC.g:723:38: CONSTANT
                    {
                    CONSTANT364=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive7065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT364);


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
            // 723:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // nesC.g:723:51: ^( LINE_DIRECTIVE STRING_LITERAL )
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
    // nesC.g:725:1: function_definition : declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement ;
    public final nesCParser.function_definition_return function_definition() throws RecognitionException {
        nesCParser.function_definition_return retval = new nesCParser.function_definition_return();
        retval.start = input.LT(1);

        int function_definition_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers365 =null;

        nesCParser.declarator_return declarator366 =null;

        nesCParser.attributes_return attributes367 =null;

        nesCParser.compound_statement_return compound_statement368 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // nesC.g:726:5: ( declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement )
            // nesC.g:726:10: declaration_specifiers declarator ( attributes )? compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition7093);
            declaration_specifiers365=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers365.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition7095);
            declarator366=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator366.getTree());

            // nesC.g:726:44: ( attributes )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==ATTRIBUTE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // nesC.g:726:44: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_function_definition7097);
                    attributes367=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes367.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compound_statement_in_function_definition7100);
            compound_statement368=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement368.getTree());

            // AST REWRITE
            // elements: compound_statement, declaration_specifiers, attributes, declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 727:13: -> declaration_specifiers declarator ( attributes )? compound_statement
            {
                adaptor.addChild(root_0, stream_declaration_specifiers.nextTree());

                adaptor.addChild(root_0, stream_declarator.nextTree());

                // nesC.g:727:50: ( attributes )?
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
    // nesC.g:737:1: nesC_file : ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) );
    public final nesCParser.nesC_file_return nesC_file() throws RecognitionException {
        nesCParser.nesC_file_return retval = new nesCParser.nesC_file_return();
        retval.start = input.LT(1);

        int nesC_file_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit369 =null;

        nesCParser.interface_definition_return interface_definition370 =null;

        nesCParser.translation_unit_return translation_unit371 =null;

        nesCParser.component_return component372 =null;


        RewriteRuleSubtreeStream stream_component=new RewriteRuleSubtreeStream(adaptor,"rule component");
        RewriteRuleSubtreeStream stream_interface_definition=new RewriteRuleSubtreeStream(adaptor,"rule interface_definition");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // nesC.g:738:5: ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) )
            int alt102=2;
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
                int LA102_1 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA102_2 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA102_3 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA102_4 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA102_5 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA102_6 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA102_7 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA102_8 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA102_9 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 9, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA102_10 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA102_11 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 11, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA102_12 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 12, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA102_13 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 13, input);

                    throw nvae;

                }
                }
                break;
            case INT64_T:
                {
                int LA102_14 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 14, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA102_15 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 15, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA102_16 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 16, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA102_17 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 17, input);

                    throw nvae;

                }
                }
                break;
            case UINT64_T:
                {
                int LA102_18 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 18, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA102_19 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 19, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA102_20 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 20, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA102_21 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 21, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT64_T:
                {
                int LA102_22 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 22, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT8_T:
                {
                int LA102_23 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 23, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT16_T:
                {
                int LA102_24 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 24, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT32_T:
                {
                int LA102_25 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 25, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA102_26 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 26, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA102_27 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 27, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA102_28 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 28, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA102_29 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 29, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA102_30 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 30, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA102_31 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 31, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA102_32 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 32, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA102_33 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 33, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                int LA102_34 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 34, input);

                    throw nvae;

                }
                }
                break;
            case HASH:
                {
                int LA102_35 = input.LA(2);

                if ( (synpred192_nesC()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 35, input);

                    throw nvae;

                }
                }
                break;
            case INTERFACE:
                {
                alt102=1;
                }
                break;
            case COMPONENT:
            case CONFIGURATION:
            case GENERIC:
            case MODULE:
                {
                alt102=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }

            switch (alt102) {
                case 1 :
                    // nesC.g:738:10: ( translation_unit )? interface_definition
                    {
                    // nesC.g:738:10: ( translation_unit )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==ASYNC||LA100_0==AUTO||LA100_0==CHAR||LA100_0==COMMAND||LA100_0==CONST||LA100_0==DEFAULT||(LA100_0 >= DOUBLE && LA100_0 <= DUTY)||LA100_0==ENUM||(LA100_0 >= EVENT && LA100_0 <= EXTERN)||LA100_0==FLOAT||LA100_0==HASH||(LA100_0 >= INLINE && LA100_0 <= INT8_T)||LA100_0==LONG||LA100_0==NORACE||(LA100_0 >= NXLE_UINT16_T && LA100_0 <= NX_UNION)||LA100_0==RAW_IDENTIFIER||LA100_0==REGISTER||LA100_0==RESTRICT||LA100_0==SHORT||LA100_0==SIGNED||LA100_0==STATIC||LA100_0==STRUCT||(LA100_0 >= TASK && LA100_0 <= UINT8_T)||(LA100_0 >= UNION && LA100_0 <= UNSIGNED)||(LA100_0 >= VOID && LA100_0 <= VOLATILE)) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // nesC.g:738:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_nesC_file7149);
                            translation_unit369=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit369.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_interface_definition_in_nesC_file7152);
                    interface_definition370=interface_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_definition.add(interface_definition370.getTree());

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
                    // 738:49: -> ^( FILE ( translation_unit )? interface_definition )
                    {
                        // nesC.g:738:52: ^( FILE ( translation_unit )? interface_definition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // nesC.g:738:59: ( translation_unit )?
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
                    // nesC.g:739:10: ( translation_unit )? component
                    {
                    // nesC.g:739:10: ( translation_unit )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==ASYNC||LA101_0==AUTO||LA101_0==CHAR||LA101_0==COMMAND||LA101_0==CONST||LA101_0==DEFAULT||(LA101_0 >= DOUBLE && LA101_0 <= DUTY)||LA101_0==ENUM||(LA101_0 >= EVENT && LA101_0 <= EXTERN)||LA101_0==FLOAT||LA101_0==HASH||(LA101_0 >= INLINE && LA101_0 <= INT8_T)||LA101_0==LONG||LA101_0==NORACE||(LA101_0 >= NXLE_UINT16_T && LA101_0 <= NX_UNION)||LA101_0==RAW_IDENTIFIER||LA101_0==REGISTER||LA101_0==RESTRICT||LA101_0==SHORT||LA101_0==SIGNED||LA101_0==STATIC||LA101_0==STRUCT||(LA101_0 >= TASK && LA101_0 <= UINT8_T)||(LA101_0 >= UNION && LA101_0 <= UNSIGNED)||(LA101_0 >= VOID && LA101_0 <= VOLATILE)) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // nesC.g:739:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_nesC_file7174);
                            translation_unit371=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit371.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_component_in_nesC_file7177);
                    component372=component();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component.add(component372.getTree());

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
                    // 739:49: -> ^( FILE ( translation_unit )? component )
                    {
                        // nesC.g:739:52: ^( FILE ( translation_unit )? component )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // nesC.g:739:59: ( translation_unit )?
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
    // nesC.g:748:1: interface_definition : INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( declaration | line_directive )* '}' -> ^( INTERFACE identifier ( declaration )* ) ;
    public final nesCParser.interface_definition_return interface_definition() throws RecognitionException {
        nesCParser.interface_definition_return retval = new nesCParser.interface_definition_return();
        retval.start = input.LT(1);

        int interface_definition_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE373=null;
        Token char_literal377=null;
        Token char_literal380=null;
        nesCParser.identifier_return identifier374 =null;

        nesCParser.type_parameters_return type_parameters375 =null;

        nesCParser.attributes_return attributes376 =null;

        nesCParser.declaration_return declaration378 =null;

        nesCParser.line_directive_return line_directive379 =null;


        Object INTERFACE373_tree=null;
        Object char_literal377_tree=null;
        Object char_literal380_tree=null;
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

            // nesC.g:749:5: ( INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( declaration | line_directive )* '}' -> ^( INTERFACE identifier ( declaration )* ) )
            // nesC.g:749:10: INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( declaration | line_directive )* '}'
            {
            INTERFACE373=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_definition7225); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE373);


            pushFollow(FOLLOW_identifier_in_interface_definition7227);
            identifier374=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier374.getTree());

            // nesC.g:749:31: ( type_parameters )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==LESS) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // nesC.g:749:31: type_parameters
                    {
                    pushFollow(FOLLOW_type_parameters_in_interface_definition7229);
                    type_parameters375=type_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_parameters.add(type_parameters375.getTree());

                    }
                    break;

            }


            // nesC.g:749:48: ( attributes )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==ATTRIBUTE) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // nesC.g:749:48: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_interface_definition7232);
                    attributes376=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes376.getTree());

                    }
                    break;

            }


            char_literal377=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interface_definition7243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal377);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:751:9: ( declaration | line_directive )*
            loop105:
            do {
                int alt105=3;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==ASYNC||LA105_0==AUTO||LA105_0==CHAR||LA105_0==COMMAND||LA105_0==CONST||LA105_0==DEFAULT||(LA105_0 >= DOUBLE && LA105_0 <= DUTY)||LA105_0==ENUM||(LA105_0 >= EVENT && LA105_0 <= EXTERN)||LA105_0==FLOAT||(LA105_0 >= INLINE && LA105_0 <= INT8_T)||LA105_0==LONG||LA105_0==NORACE||(LA105_0 >= NXLE_UINT16_T && LA105_0 <= NX_UNION)||LA105_0==RAW_IDENTIFIER||LA105_0==REGISTER||LA105_0==RESTRICT||LA105_0==SHORT||LA105_0==SIGNED||LA105_0==STATIC||LA105_0==STRUCT||(LA105_0 >= TASK && LA105_0 <= UINT8_T)||(LA105_0 >= UNION && LA105_0 <= UNSIGNED)||(LA105_0 >= VOID && LA105_0 <= VOLATILE)) ) {
                    alt105=1;
                }
                else if ( (LA105_0==HASH) ) {
                    alt105=2;
                }


                switch (alt105) {
            	case 1 :
            	    // nesC.g:751:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_interface_definition7256);
            	    declaration378=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration378.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:751:24: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_interface_definition7260);
            	    line_directive379=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive379.getTree());

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal380=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interface_definition7278); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal380);


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
            // 753:13: -> ^( INTERFACE identifier ( declaration )* )
            {
                // nesC.g:753:16: ^( INTERFACE identifier ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:753:39: ( declaration )*
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
    // nesC.g:755:1: type_parameters : '<' type_parameter_list '>' ;
    public final nesCParser.type_parameters_return type_parameters() throws RecognitionException {
        nesCParser.type_parameters_return retval = new nesCParser.type_parameters_return();
        retval.start = input.LT(1);

        int type_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal381=null;
        Token char_literal383=null;
        nesCParser.type_parameter_list_return type_parameter_list382 =null;


        Object char_literal381_tree=null;
        Object char_literal383_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // nesC.g:756:5: ( '<' type_parameter_list '>' )
            // nesC.g:756:10: '<' type_parameter_list '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal381=(Token)match(input,LESS,FOLLOW_LESS_in_type_parameters7320); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal381_tree = 
            (Object)adaptor.create(char_literal381)
            ;
            adaptor.addChild(root_0, char_literal381_tree);
            }

            pushFollow(FOLLOW_type_parameter_list_in_type_parameters7322);
            type_parameter_list382=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_parameter_list382.getTree());

            char_literal383=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_parameters7324); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal383_tree = 
            (Object)adaptor.create(char_literal383)
            ;
            adaptor.addChild(root_0, char_literal383_tree);
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
    // nesC.g:758:1: type_parameter_list : type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* ;
    public final nesCParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        nesCParser.type_parameter_list_return retval = new nesCParser.type_parameter_list_return();
        retval.start = input.LT(1);

        int type_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal386=null;
        nesCParser.type_specifier_return type_specifier384 =null;

        nesCParser.attributes_return attributes385 =null;

        nesCParser.type_specifier_return type_specifier387 =null;

        nesCParser.attributes_return attributes388 =null;


        Object char_literal386_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // nesC.g:759:5: ( type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* )
            // nesC.g:759:10: type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_specifier_in_type_parameter_list7343);
            type_specifier384=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier384.getTree());

            // nesC.g:759:25: ( attributes )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==ATTRIBUTE) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // nesC.g:759:25: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_type_parameter_list7345);
                    attributes385=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes385.getTree());

                    }
                    break;

            }


            // nesC.g:759:37: ( ',' type_specifier ( attributes )? )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==COMMA) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // nesC.g:759:38: ',' type_specifier ( attributes )?
            	    {
            	    char_literal386=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_parameter_list7349); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal386_tree = 
            	    (Object)adaptor.create(char_literal386)
            	    ;
            	    adaptor.addChild(root_0, char_literal386_tree);
            	    }

            	    pushFollow(FOLLOW_type_specifier_in_type_parameter_list7351);
            	    type_specifier387=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier387.getTree());

            	    // nesC.g:759:57: ( attributes )?
            	    int alt107=2;
            	    int LA107_0 = input.LA(1);

            	    if ( (LA107_0==ATTRIBUTE) ) {
            	        alt107=1;
            	    }
            	    switch (alt107) {
            	        case 1 :
            	            // nesC.g:759:57: attributes
            	            {
            	            pushFollow(FOLLOW_attributes_in_type_parameter_list7353);
            	            attributes388=attributes();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes388.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop108;
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
    // nesC.g:764:1: component : component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) ;
    public final nesCParser.component_return component() throws RecognitionException {
        nesCParser.component_return retval = new nesCParser.component_return();
        retval.start = input.LT(1);

        int component_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.component_kind_return component_kind389 =null;

        nesCParser.identifier_return identifier390 =null;

        nesCParser.component_parameters_return component_parameters391 =null;

        nesCParser.attributes_return attributes392 =null;

        nesCParser.component_specification_return component_specification393 =null;

        nesCParser.implementation_return implementation394 =null;


        RewriteRuleSubtreeStream stream_component_parameters=new RewriteRuleSubtreeStream(adaptor,"rule component_parameters");
        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_component_kind=new RewriteRuleSubtreeStream(adaptor,"rule component_kind");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // nesC.g:765:5: ( component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )? -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? ) )
            // nesC.g:765:9: component_kind identifier ( component_parameters )? ( attributes )? component_specification ( implementation )?
            {
            pushFollow(FOLLOW_component_kind_in_component7375);
            component_kind389=component_kind();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_kind.add(component_kind389.getTree());

            pushFollow(FOLLOW_identifier_in_component7377);
            identifier390=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier390.getTree());

            // nesC.g:765:35: ( component_parameters )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==LPARENS) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // nesC.g:765:35: component_parameters
                    {
                    pushFollow(FOLLOW_component_parameters_in_component7379);
                    component_parameters391=component_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameters.add(component_parameters391.getTree());

                    }
                    break;

            }


            // nesC.g:765:57: ( attributes )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==ATTRIBUTE) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // nesC.g:765:57: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_component7382);
                    attributes392=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes392.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_component_specification_in_component7393);
            component_specification393=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification393.getTree());

            // nesC.g:767:9: ( implementation )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==IMPLEMENTATION) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // nesC.g:767:9: implementation
                    {
                    pushFollow(FOLLOW_implementation_in_component7403);
                    implementation394=implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementation.add(implementation394.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: component_parameters, component_specification, implementation, identifier, component_kind
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 767:25: -> ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
            {
                // nesC.g:767:28: ^( COMPONENT_DEFINITION component_kind identifier component_specification ( implementation )? ( component_parameters )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DEFINITION, "COMPONENT_DEFINITION")
                , root_1);

                adaptor.addChild(root_1, stream_component_kind.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_component_specification.nextTree());

                // nesC.g:767:101: ( implementation )?
                if ( stream_implementation.hasNext() ) {
                    adaptor.addChild(root_1, stream_implementation.nextTree());

                }
                stream_implementation.reset();

                // nesC.g:767:117: ( component_parameters )?
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
            if ( state.backtracking>0 ) { memoize(input, 73, component_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component"


    public static class component_kind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_kind"
    // nesC.g:772:1: component_kind : ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) );
    public final nesCParser.component_kind_return component_kind() throws RecognitionException {
        nesCParser.component_kind_return retval = new nesCParser.component_kind_return();
        retval.start = input.LT(1);

        int component_kind_StartIndex = input.index();

        Object root_0 = null;

        Token MODULE395=null;
        Token CONFIGURATION396=null;
        Token COMPONENT397=null;
        Token GENERIC398=null;
        Token MODULE399=null;
        Token GENERIC400=null;
        Token CONFIGURATION401=null;

        Object MODULE395_tree=null;
        Object CONFIGURATION396_tree=null;
        Object COMPONENT397_tree=null;
        Object GENERIC398_tree=null;
        Object MODULE399_tree=null;
        Object GENERIC400_tree=null;
        Object CONFIGURATION401_tree=null;
        RewriteRuleTokenStream stream_CONFIGURATION=new RewriteRuleTokenStream(adaptor,"token CONFIGURATION");
        RewriteRuleTokenStream stream_GENERIC=new RewriteRuleTokenStream(adaptor,"token GENERIC");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_COMPONENT=new RewriteRuleTokenStream(adaptor,"token COMPONENT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // nesC.g:773:5: ( MODULE -> ^( COMPONENT_KIND MODULE ) | CONFIGURATION -> ^( COMPONENT_KIND CONFIGURATION ) | COMPONENT -> ^( COMPONENT_KIND COMPONENT ) | GENERIC MODULE -> ^( COMPONENT_KIND GENERIC MODULE ) | GENERIC CONFIGURATION -> ^( COMPONENT_KIND GENERIC CONFIGURATION ) )
            int alt112=5;
            switch ( input.LA(1) ) {
            case MODULE:
                {
                alt112=1;
                }
                break;
            case CONFIGURATION:
                {
                alt112=2;
                }
                break;
            case COMPONENT:
                {
                alt112=3;
                }
                break;
            case GENERIC:
                {
                int LA112_4 = input.LA(2);

                if ( (LA112_4==MODULE) ) {
                    alt112=4;
                }
                else if ( (LA112_4==CONFIGURATION) ) {
                    alt112=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 112, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;

            }

            switch (alt112) {
                case 1 :
                    // nesC.g:773:10: MODULE
                    {
                    MODULE395=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE395);


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
                    // 773:32: -> ^( COMPONENT_KIND MODULE )
                    {
                        // nesC.g:773:35: ^( COMPONENT_KIND MODULE )
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
                    // nesC.g:774:10: CONFIGURATION
                    {
                    CONFIGURATION396=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION396);


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
                    // 774:32: -> ^( COMPONENT_KIND CONFIGURATION )
                    {
                        // nesC.g:774:35: ^( COMPONENT_KIND CONFIGURATION )
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
                    // nesC.g:775:10: COMPONENT
                    {
                    COMPONENT397=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_component_kind7501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMPONENT.add(COMPONENT397);


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
                    // 775:32: -> ^( COMPONENT_KIND COMPONENT )
                    {
                        // nesC.g:775:35: ^( COMPONENT_KIND COMPONENT )
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
                    // nesC.g:776:10: GENERIC MODULE
                    {
                    GENERIC398=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC398);


                    MODULE399=(Token)match(input,MODULE,FOLLOW_MODULE_in_component_kind7534); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(MODULE399);


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
                    // 776:32: -> ^( COMPONENT_KIND GENERIC MODULE )
                    {
                        // nesC.g:776:35: ^( COMPONENT_KIND GENERIC MODULE )
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
                    // nesC.g:777:10: GENERIC CONFIGURATION
                    {
                    GENERIC400=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_component_kind7562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GENERIC.add(GENERIC400);


                    CONFIGURATION401=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_component_kind7564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONFIGURATION.add(CONFIGURATION401);


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
                    // 777:32: -> ^( COMPONENT_KIND GENERIC CONFIGURATION )
                    {
                        // nesC.g:777:35: ^( COMPONENT_KIND GENERIC CONFIGURATION )
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
            if ( state.backtracking>0 ) { memoize(input, 74, component_kind_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_kind"


    public static class implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementation"
    // nesC.g:779:1: implementation : ( module_implementation | configuration_implementation );
    public final nesCParser.implementation_return implementation() throws RecognitionException {
        nesCParser.implementation_return retval = new nesCParser.implementation_return();
        retval.start = input.LT(1);

        int implementation_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.module_implementation_return module_implementation402 =null;

        nesCParser.configuration_implementation_return configuration_implementation403 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // nesC.g:780:5: ( module_implementation | configuration_implementation )
            int alt113=2;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // nesC.g:780:10: module_implementation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_module_implementation_in_implementation7593);
                    module_implementation402=module_implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, module_implementation402.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:781:10: configuration_implementation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_configuration_implementation_in_implementation7604);
                    configuration_implementation403=configuration_implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_implementation403.getTree());

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


    public static class component_parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_parameters"
    // nesC.g:787:1: component_parameters : '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) ;
    public final nesCParser.component_parameters_return component_parameters() throws RecognitionException {
        nesCParser.component_parameters_return retval = new nesCParser.component_parameters_return();
        retval.start = input.LT(1);

        int component_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal404=null;
        Token char_literal406=null;
        nesCParser.component_parameter_list_return component_parameter_list405 =null;


        Object char_literal404_tree=null;
        Object char_literal406_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // nesC.g:788:5: ( '(' ( component_parameter_list )? ')' -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? ) )
            // nesC.g:788:10: '(' ( component_parameter_list )? ')'
            {
            char_literal404=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_parameters7623); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPARENS.add(char_literal404);


            // nesC.g:788:14: ( component_parameter_list )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ASYNC||LA114_0==AUTO||LA114_0==CHAR||LA114_0==COMMAND||LA114_0==CONST||LA114_0==DEFAULT||(LA114_0 >= DOUBLE && LA114_0 <= DUTY)||LA114_0==ENUM||(LA114_0 >= EVENT && LA114_0 <= EXTERN)||LA114_0==FLOAT||(LA114_0 >= INLINE && LA114_0 <= INT8_T)||LA114_0==LONG||LA114_0==NORACE||(LA114_0 >= NXLE_UINT16_T && LA114_0 <= NX_UNION)||LA114_0==RAW_IDENTIFIER||LA114_0==REGISTER||LA114_0==RESTRICT||LA114_0==SHORT||LA114_0==SIGNED||LA114_0==STATIC||LA114_0==STRUCT||(LA114_0 >= TASK && LA114_0 <= UINT8_T)||(LA114_0 >= UNION && LA114_0 <= UNSIGNED)||(LA114_0 >= VOID && LA114_0 <= VOLATILE)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // nesC.g:788:14: component_parameter_list
                    {
                    pushFollow(FOLLOW_component_parameter_list_in_component_parameters7625);
                    component_parameter_list405=component_parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component_parameter_list.add(component_parameter_list405.getTree());

                    }
                    break;

            }


            char_literal406=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_parameters7628); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPARENS.add(char_literal406);


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
            // 789:13: -> ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
            {
                // nesC.g:789:16: ^( COMPONENT_PARAMETER_LIST ( component_parameter_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_PARAMETER_LIST, "COMPONENT_PARAMETER_LIST")
                , root_1);

                // nesC.g:789:43: ( component_parameter_list )?
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
            if ( state.backtracking>0 ) { memoize(input, 76, component_parameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_parameters"


    public static class component_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_parameter_list"
    // nesC.g:791:1: component_parameter_list : component_parameter ( ',' component_parameter )* -> ( component_parameter )+ ;
    public final nesCParser.component_parameter_list_return component_parameter_list() throws RecognitionException {
        nesCParser.component_parameter_list_return retval = new nesCParser.component_parameter_list_return();
        retval.start = input.LT(1);

        int component_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal408=null;
        nesCParser.component_parameter_return component_parameter407 =null;

        nesCParser.component_parameter_return component_parameter409 =null;


        Object char_literal408_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_parameter=new RewriteRuleSubtreeStream(adaptor,"rule component_parameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // nesC.g:792:5: ( component_parameter ( ',' component_parameter )* -> ( component_parameter )+ )
            // nesC.g:792:10: component_parameter ( ',' component_parameter )*
            {
            pushFollow(FOLLOW_component_parameter_in_component_parameter_list7668);
            component_parameter407=component_parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter407.getTree());

            // nesC.g:792:30: ( ',' component_parameter )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==COMMA) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // nesC.g:792:31: ',' component_parameter
            	    {
            	    char_literal408=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_parameter_list7671); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal408);


            	    pushFollow(FOLLOW_component_parameter_in_component_parameter_list7673);
            	    component_parameter409=component_parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_parameter.add(component_parameter409.getTree());

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
            // 792:57: -> ( component_parameter )+
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
    // nesC.g:794:1: component_parameter : ( parameter_declaration | TYPEDEF identifier ( attributes )? );
    public final nesCParser.component_parameter_return component_parameter() throws RecognitionException {
        nesCParser.component_parameter_return retval = new nesCParser.component_parameter_return();
        retval.start = input.LT(1);

        int component_parameter_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF411=null;
        nesCParser.parameter_declaration_return parameter_declaration410 =null;

        nesCParser.identifier_return identifier412 =null;

        nesCParser.attributes_return attributes413 =null;


        Object TYPEDEF411_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // nesC.g:795:5: ( parameter_declaration | TYPEDEF identifier ( attributes )? )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==ASYNC||LA117_0==AUTO||LA117_0==CHAR||LA117_0==COMMAND||LA117_0==CONST||LA117_0==DEFAULT||(LA117_0 >= DOUBLE && LA117_0 <= DUTY)||LA117_0==ENUM||(LA117_0 >= EVENT && LA117_0 <= EXTERN)||LA117_0==FLOAT||(LA117_0 >= INLINE && LA117_0 <= INT8_T)||LA117_0==LONG||LA117_0==NORACE||(LA117_0 >= NXLE_UINT16_T && LA117_0 <= NX_UNION)||LA117_0==RAW_IDENTIFIER||LA117_0==REGISTER||LA117_0==RESTRICT||LA117_0==SHORT||LA117_0==SIGNED||LA117_0==STATIC||LA117_0==STRUCT||LA117_0==TASK||(LA117_0 >= UINT16_T && LA117_0 <= UINT8_T)||(LA117_0 >= UNION && LA117_0 <= UNSIGNED)||(LA117_0 >= VOID && LA117_0 <= VOLATILE)) ) {
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
                    // nesC.g:795:10: parameter_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_parameter_declaration_in_component_parameter7699);
                    parameter_declaration410=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_declaration410.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:796:10: TYPEDEF identifier ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TYPEDEF411=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_component_parameter7710); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPEDEF411_tree = 
                    (Object)adaptor.create(TYPEDEF411)
                    ;
                    adaptor.addChild(root_0, TYPEDEF411_tree);
                    }

                    pushFollow(FOLLOW_identifier_in_component_parameter7712);
                    identifier412=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier412.getTree());

                    // nesC.g:796:29: ( attributes )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==ATTRIBUTE) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // nesC.g:796:29: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_component_parameter7714);
                            attributes413=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes413.getTree());

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
    // nesC.g:801:1: module_implementation : IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) ;
    public final nesCParser.module_implementation_return module_implementation() throws RecognitionException {
        nesCParser.module_implementation_return retval = new nesCParser.module_implementation_return();
        retval.start = input.LT(1);

        int module_implementation_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTATION414=null;
        Token char_literal415=null;
        Token char_literal417=null;
        nesCParser.translation_unit_return translation_unit416 =null;


        Object IMPLEMENTATION414_tree=null;
        Object char_literal415_tree=null;
        Object char_literal417_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // nesC.g:802:5: ( IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) )
            // nesC.g:802:10: IMPLEMENTATION '{' translation_unit '}'
            {
            IMPLEMENTATION414=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_module_implementation7737); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION414);


            char_literal415=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_implementation7739); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal415);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_implementation7771);
            translation_unit416=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit416.getTree());

            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal417=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_implementation7827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal417);


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
            // 806:13: -> ^( IMPLEMENTATION translation_unit )
            {
                // nesC.g:806:16: ^( IMPLEMENTATION translation_unit )
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
    // nesC.g:809:1: configuration_implementation : IMPLEMENTATION '{' ( configuration_element_list )? '}' -> ^( IMPLEMENTATION ( configuration_element_list )? ) ;
    public final nesCParser.configuration_implementation_return configuration_implementation() throws RecognitionException {
        nesCParser.configuration_implementation_return retval = new nesCParser.configuration_implementation_return();
        retval.start = input.LT(1);

        int configuration_implementation_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTATION418=null;
        Token char_literal419=null;
        Token char_literal421=null;
        nesCParser.configuration_element_list_return configuration_element_list420 =null;


        Object IMPLEMENTATION418_tree=null;
        Object char_literal419_tree=null;
        Object char_literal421_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_configuration_element_list=new RewriteRuleSubtreeStream(adaptor,"rule configuration_element_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // nesC.g:810:5: ( IMPLEMENTATION '{' ( configuration_element_list )? '}' -> ^( IMPLEMENTATION ( configuration_element_list )? ) )
            // nesC.g:810:10: IMPLEMENTATION '{' ( configuration_element_list )? '}'
            {
            IMPLEMENTATION418=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_configuration_implementation7863); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION418);


            char_literal419=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_configuration_implementation7865); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal419);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:811:29: ( configuration_element_list )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==COMPONENTS||LA118_0==ENABLE||LA118_0==HASH||LA118_0==LBRACKET||LA118_0==RAW_IDENTIFIER) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // nesC.g:811:29: configuration_element_list
                    {
                    pushFollow(FOLLOW_configuration_element_list_in_configuration_implementation7897);
                    configuration_element_list420=configuration_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_configuration_element_list.add(configuration_element_list420.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal421=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_configuration_implementation7954); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal421);


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
            // 814:13: -> ^( IMPLEMENTATION ( configuration_element_list )? )
            {
                // nesC.g:814:16: ^( IMPLEMENTATION ( configuration_element_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLEMENTATION.nextNode()
                , root_1);

                // nesC.g:814:33: ( configuration_element_list )?
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
    // nesC.g:816:1: configuration_element_list : ( configuration_element | line_directive )+ ;
    public final nesCParser.configuration_element_list_return configuration_element_list() throws RecognitionException {
        nesCParser.configuration_element_list_return retval = new nesCParser.configuration_element_list_return();
        retval.start = input.LT(1);

        int configuration_element_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.configuration_element_return configuration_element422 =null;

        nesCParser.line_directive_return line_directive423 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // nesC.g:817:5: ( ( configuration_element | line_directive )+ )
            // nesC.g:817:10: ( configuration_element | line_directive )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:817:10: ( configuration_element | line_directive )+
            int cnt119=0;
            loop119:
            do {
                int alt119=3;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMPONENTS||LA119_0==ENABLE||LA119_0==LBRACKET||LA119_0==RAW_IDENTIFIER) ) {
                    alt119=1;
                }
                else if ( (LA119_0==HASH) ) {
                    alt119=2;
                }


                switch (alt119) {
            	case 1 :
            	    // nesC.g:817:11: configuration_element
            	    {
            	    pushFollow(FOLLOW_configuration_element_in_configuration_element_list7995);
            	    configuration_element422=configuration_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element422.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:817:35: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_configuration_element_list7999);
            	    line_directive423=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive423.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt119 >= 1 ) break loop119;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(119, input);
                        throw eee;
                }
                cnt119++;
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
    // nesC.g:819:1: configuration_element : ( components | connection );
    public final nesCParser.configuration_element_return configuration_element() throws RecognitionException {
        nesCParser.configuration_element_return retval = new nesCParser.configuration_element_return();
        retval.start = input.LT(1);

        int configuration_element_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.components_return components424 =null;

        nesCParser.connection_return connection425 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // nesC.g:820:5: ( components | connection )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==COMPONENTS) ) {
                alt120=1;
            }
            else if ( (LA120_0==ENABLE||LA120_0==LBRACKET||LA120_0==RAW_IDENTIFIER) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;

            }
            switch (alt120) {
                case 1 :
                    // nesC.g:820:10: components
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_components_in_configuration_element8020);
                    components424=components();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, components424.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:821:10: connection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_connection_in_configuration_element8031);
                    connection425=connection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connection425.getTree());

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
    // nesC.g:829:1: components : COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) ;
    public final nesCParser.components_return components() throws RecognitionException {
        nesCParser.components_return retval = new nesCParser.components_return();
        retval.start = input.LT(1);

        int components_StartIndex = input.index();

        Object root_0 = null;

        Token COMPONENTS426=null;
        Token char_literal428=null;
        nesCParser.component_line_return component_line427 =null;


        Object COMPONENTS426_tree=null;
        Object char_literal428_tree=null;
        RewriteRuleTokenStream stream_COMPONENTS=new RewriteRuleTokenStream(adaptor,"token COMPONENTS");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_component_line=new RewriteRuleSubtreeStream(adaptor,"rule component_line");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // nesC.g:830:5: ( COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) )
            // nesC.g:830:10: COMPONENTS component_line ';'
            {
            COMPONENTS426=(Token)match(input,COMPONENTS,FOLLOW_COMPONENTS_in_components8076); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPONENTS.add(COMPONENTS426);


            pushFollow(FOLLOW_component_line_in_components8078);
            component_line427=component_line();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_line.add(component_line427.getTree());

            char_literal428=(Token)match(input,189,FOLLOW_189_in_components8080); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_189.add(char_literal428);


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
            // 830:40: -> ^( COMPONENTS component_line )
            {
                // nesC.g:830:43: ^( COMPONENTS component_line )
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
    // nesC.g:832:1: component_line : component_declaration ( ',' component_declaration )* -> ( component_declaration )+ ;
    public final nesCParser.component_line_return component_line() throws RecognitionException {
        nesCParser.component_line_return retval = new nesCParser.component_line_return();
        retval.start = input.LT(1);

        int component_line_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal430=null;
        nesCParser.component_declaration_return component_declaration429 =null;

        nesCParser.component_declaration_return component_declaration431 =null;


        Object char_literal430_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_declaration=new RewriteRuleSubtreeStream(adaptor,"rule component_declaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // nesC.g:833:5: ( component_declaration ( ',' component_declaration )* -> ( component_declaration )+ )
            // nesC.g:833:10: component_declaration ( ',' component_declaration )*
            {
            pushFollow(FOLLOW_component_declaration_in_component_line8107);
            component_declaration429=component_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration429.getTree());

            // nesC.g:833:32: ( ',' component_declaration )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==COMMA) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // nesC.g:833:33: ',' component_declaration
            	    {
            	    char_literal430=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_line8110); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal430);


            	    pushFollow(FOLLOW_component_declaration_in_component_line8112);
            	    component_declaration431=component_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration431.getTree());

            	    }
            	    break;

            	default :
            	    break loop121;
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
            // 833:61: -> ( component_declaration )+
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
    // nesC.g:835:1: component_declaration : component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) ;
    public final nesCParser.component_declaration_return component_declaration() throws RecognitionException {
        nesCParser.component_declaration_return retval = new nesCParser.component_declaration_return();
        retval.start = input.LT(1);

        int component_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token AS433=null;
        nesCParser.component_ref_return component_ref432 =null;

        nesCParser.identifier_return identifier434 =null;


        Object AS433_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_component_ref=new RewriteRuleSubtreeStream(adaptor,"rule component_ref");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // nesC.g:836:5: ( component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) )
            // nesC.g:836:10: component_ref ( AS identifier )?
            {
            pushFollow(FOLLOW_component_ref_in_component_declaration8138);
            component_ref432=component_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_ref.add(component_ref432.getTree());

            // nesC.g:836:24: ( AS identifier )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==AS) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // nesC.g:836:25: AS identifier
                    {
                    AS433=(Token)match(input,AS,FOLLOW_AS_in_component_declaration8141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS433);


                    pushFollow(FOLLOW_identifier_in_component_declaration8143);
                    identifier434=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier434.getTree());

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
            // 836:41: -> ^( COMPONENT_DECLARATION component_ref ( identifier )? )
            {
                // nesC.g:836:44: ^( COMPONENT_DECLARATION component_ref ( identifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DECLARATION, "COMPONENT_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_component_ref.nextTree());

                // nesC.g:836:82: ( identifier )?
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
    // nesC.g:842:1: component_ref : ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) );
    public final nesCParser.component_ref_return component_ref() throws RecognitionException {
        nesCParser.component_ref_return retval = new nesCParser.component_ref_return();
        retval.start = input.LT(1);

        int component_ref_StartIndex = input.index();

        Object root_0 = null;

        Token NEW436=null;
        Token char_literal438=null;
        Token char_literal440=null;
        nesCParser.identifier_return identifier435 =null;

        nesCParser.identifier_return identifier437 =null;

        nesCParser.component_argument_list_return component_argument_list439 =null;


        Object NEW436_tree=null;
        Object char_literal438_tree=null;
        Object char_literal440_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule component_argument_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // nesC.g:843:5: ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==RAW_IDENTIFIER) ) {
                alt124=1;
            }
            else if ( (LA124_0==NEW) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;

            }
            switch (alt124) {
                case 1 :
                    // nesC.g:843:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_component_ref8181);
                    identifier435=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier435.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:844:10: NEW identifier '(' ( component_argument_list )? ')'
                    {
                    NEW436=(Token)match(input,NEW,FOLLOW_NEW_in_component_ref8192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW436);


                    pushFollow(FOLLOW_identifier_in_component_ref8194);
                    identifier437=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier437.getTree());

                    char_literal438=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_ref8196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal438);


                    // nesC.g:844:29: ( component_argument_list )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==AMP||LA123_0==BITCOMPLEMENT||LA123_0==CALL||(LA123_0 >= CHAR && LA123_0 <= CHARACTER_LITERAL)||(LA123_0 >= CONST && LA123_0 <= CONSTANT)||LA123_0==DOUBLE||LA123_0==ENUM||LA123_0==FLOAT||(LA123_0 >= INT && LA123_0 <= INT8_T)||(LA123_0 >= LONG && LA123_0 <= LPARENS)||LA123_0==MINUS||LA123_0==MINUSMINUS||LA123_0==NOT||(LA123_0 >= NXLE_UINT16_T && LA123_0 <= NX_UNION)||LA123_0==PLUS||LA123_0==PLUSPLUS||LA123_0==POST||LA123_0==RAW_IDENTIFIER||LA123_0==RESTRICT||(LA123_0 >= SHORT && LA123_0 <= SIZEOF)||LA123_0==STAR||(LA123_0 >= STRING_LITERAL && LA123_0 <= STRUCT)||(LA123_0 >= UINT16_T && LA123_0 <= UINT8_T)||(LA123_0 >= UNION && LA123_0 <= UNSIGNED)||(LA123_0 >= VOID && LA123_0 <= VOLATILE)) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // nesC.g:844:29: component_argument_list
                            {
                            pushFollow(FOLLOW_component_argument_list_in_component_ref8198);
                            component_argument_list439=component_argument_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_component_argument_list.add(component_argument_list439.getTree());

                            }
                            break;

                    }


                    char_literal440=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_ref8201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal440);


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
                    // 845:13: -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                    {
                        // nesC.g:845:16: ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_INSTANTIATION, "COMPONENT_INSTANTIATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:845:53: ( component_argument_list )?
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
    // nesC.g:852:1: component_argument_list : component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) ;
    public final nesCParser.component_argument_list_return component_argument_list() throws RecognitionException {
        nesCParser.component_argument_list_return retval = new nesCParser.component_argument_list_return();
        retval.start = input.LT(1);

        int component_argument_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal442=null;
        nesCParser.component_argument_return component_argument441 =null;

        nesCParser.component_argument_return component_argument443 =null;


        Object char_literal442_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_argument=new RewriteRuleSubtreeStream(adaptor,"rule component_argument");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // nesC.g:853:5: ( component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) )
            // nesC.g:853:10: component_argument ( ',' component_argument )*
            {
            pushFollow(FOLLOW_component_argument_in_component_argument_list8248);
            component_argument441=component_argument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_argument.add(component_argument441.getTree());

            // nesC.g:853:29: ( ',' component_argument )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==COMMA) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // nesC.g:853:30: ',' component_argument
            	    {
            	    char_literal442=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_argument_list8251); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal442);


            	    pushFollow(FOLLOW_component_argument_in_component_argument_list8253);
            	    component_argument443=component_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_argument.add(component_argument443.getTree());

            	    }
            	    break;

            	default :
            	    break loop125;
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
            // 854:13: -> ^( COMPONENT_ARGUMENTS ( component_argument )+ )
            {
                // nesC.g:854:16: ^( COMPONENT_ARGUMENTS ( component_argument )+ )
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
    // nesC.g:856:1: component_argument : ( expression | type_name );
    public final nesCParser.component_argument_return component_argument() throws RecognitionException {
        nesCParser.component_argument_return retval = new nesCParser.component_argument_return();
        retval.start = input.LT(1);

        int component_argument_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.expression_return expression444 =null;

        nesCParser.type_name_return type_name445 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

            // nesC.g:857:5: ( expression | type_name )
            int alt126=2;
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
                alt126=1;
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA126_2 = input.LA(2);

                if ( (synpred222_nesC()) ) {
                    alt126=1;
                }
                else if ( (true) ) {
                    alt126=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 2, input);

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
                alt126=2;
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
                    // nesC.g:857:10: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_component_argument8295);
                    expression444=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression444.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:858:10: type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_name_in_component_argument8306);
                    type_name445=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name445.getTree());

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
    // nesC.g:864:1: connection : ( endpoint '=' endpoint ';' -> ^( CONNECTION '=' endpoint endpoint ) | ( certificate_specification )? endpoint '->' endpoint ';' -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? ) | ( certificate_specification )? endpoint '<-' endpoint ';' -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? ) );
    public final nesCParser.connection_return connection() throws RecognitionException {
        nesCParser.connection_return retval = new nesCParser.connection_return();
        retval.start = input.LT(1);

        int connection_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal447=null;
        Token char_literal449=null;
        Token string_literal452=null;
        Token char_literal454=null;
        Token string_literal457=null;
        Token char_literal459=null;
        nesCParser.endpoint_return endpoint446 =null;

        nesCParser.endpoint_return endpoint448 =null;

        nesCParser.certificate_specification_return certificate_specification450 =null;

        nesCParser.endpoint_return endpoint451 =null;

        nesCParser.endpoint_return endpoint453 =null;

        nesCParser.certificate_specification_return certificate_specification455 =null;

        nesCParser.endpoint_return endpoint456 =null;

        nesCParser.endpoint_return endpoint458 =null;


        Object char_literal447_tree=null;
        Object char_literal449_tree=null;
        Object string_literal452_tree=null;
        Object char_literal454_tree=null;
        Object string_literal457_tree=null;
        Object char_literal459_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_certificate_specification=new RewriteRuleSubtreeStream(adaptor,"rule certificate_specification");
        RewriteRuleSubtreeStream stream_endpoint=new RewriteRuleSubtreeStream(adaptor,"rule endpoint");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

            // nesC.g:865:5: ( endpoint '=' endpoint ';' -> ^( CONNECTION '=' endpoint endpoint ) | ( certificate_specification )? endpoint '->' endpoint ';' -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? ) | ( certificate_specification )? endpoint '<-' endpoint ';' -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? ) )
            int alt129=3;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA129_1 = input.LA(2);

                if ( (synpred223_nesC()) ) {
                    alt129=1;
                }
                else if ( (synpred225_nesC()) ) {
                    alt129=2;
                }
                else if ( (true) ) {
                    alt129=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 1, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA129_2 = input.LA(2);

                if ( (synpred223_nesC()) ) {
                    alt129=1;
                }
                else if ( (synpred225_nesC()) ) {
                    alt129=2;
                }
                else if ( (true) ) {
                    alt129=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 2, input);

                    throw nvae;

                }
                }
                break;
            case ENABLE:
                {
                int LA129_3 = input.LA(2);

                if ( (synpred225_nesC()) ) {
                    alt129=2;
                }
                else if ( (true) ) {
                    alt129=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 3, input);

                    throw nvae;

                }
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
                    // nesC.g:865:10: endpoint '=' endpoint ';'
                    {
                    pushFollow(FOLLOW_endpoint_in_connection8325);
                    endpoint446=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint446.getTree());

                    char_literal447=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_connection8327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal447);


                    pushFollow(FOLLOW_endpoint_in_connection8329);
                    endpoint448=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint448.getTree());

                    char_literal449=(Token)match(input,189,FOLLOW_189_in_connection8331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal449);


                    // AST REWRITE
                    // elements: ASSIGN, endpoint, endpoint
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 866:14: -> ^( CONNECTION '=' endpoint endpoint )
                    {
                        // nesC.g:866:17: ^( CONNECTION '=' endpoint endpoint )
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
                    // nesC.g:867:10: ( certificate_specification )? endpoint '->' endpoint ';'
                    {
                    // nesC.g:867:10: ( certificate_specification )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==ENABLE) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // nesC.g:867:10: certificate_specification
                            {
                            pushFollow(FOLLOW_certificate_specification_in_connection8367);
                            certificate_specification450=certificate_specification();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification450.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_endpoint_in_connection8370);
                    endpoint451=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint451.getTree());

                    string_literal452=(Token)match(input,ARROW,FOLLOW_ARROW_in_connection8372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal452);


                    pushFollow(FOLLOW_endpoint_in_connection8374);
                    endpoint453=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint453.getTree());

                    char_literal454=(Token)match(input,189,FOLLOW_189_in_connection8376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal454);


                    // AST REWRITE
                    // elements: endpoint, certificate_specification, endpoint, ARROW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 868:14: -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? )
                    {
                        // nesC.g:868:17: ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? )
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

                        // nesC.g:868:53: ( certificate_specification )?
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
                    // nesC.g:869:10: ( certificate_specification )? endpoint '<-' endpoint ';'
                    {
                    // nesC.g:869:10: ( certificate_specification )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==ENABLE) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // nesC.g:869:10: certificate_specification
                            {
                            pushFollow(FOLLOW_certificate_specification_in_connection8415);
                            certificate_specification455=certificate_specification();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification455.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_endpoint_in_connection8418);
                    endpoint456=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint456.getTree());

                    string_literal457=(Token)match(input,190,FOLLOW_190_in_connection8420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(string_literal457);


                    pushFollow(FOLLOW_endpoint_in_connection8422);
                    endpoint458=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint458.getTree());

                    char_literal459=(Token)match(input,189,FOLLOW_189_in_connection8424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal459);


                    // AST REWRITE
                    // elements: endpoint, 190, endpoint, certificate_specification
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 870:14: -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? )
                    {
                        // nesC.g:870:17: ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONNECTION, "CONNECTION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_190.nextNode()
                        );

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        // nesC.g:870:53: ( certificate_specification )?
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
    // nesC.g:872:1: certificate_specification : ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) ;
    public final nesCParser.certificate_specification_return certificate_specification() throws RecognitionException {
        nesCParser.certificate_specification_return retval = new nesCParser.certificate_specification_return();
        retval.start = input.LT(1);

        int certificate_specification_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

            // nesC.g:873:5: ( ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) )
            // nesC.g:873:10: ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR
            {
            ENABLE460=(Token)match(input,ENABLE,FOLLOW_ENABLE_in_certificate_specification8467); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENABLE.add(ENABLE460);


            certs=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8471); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(certs);


            // nesC.g:873:38: ( AS entity= STRING_LITERAL )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==AS) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // nesC.g:873:39: AS entity= STRING_LITERAL
                    {
                    AS461=(Token)match(input,AS,FOLLOW_AS_in_certificate_specification8474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS461);


                    entity=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(entity);


                    }
                    break;

            }


            // nesC.g:873:66: ( ASSUMING assumptions= STRING_LITERAL )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==ASSUMING) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // nesC.g:873:67: ASSUMING assumptions= STRING_LITERAL
                    {
                    ASSUMING462=(Token)match(input,ASSUMING,FOLLOW_ASSUMING_in_certificate_specification8483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUMING.add(ASSUMING462);


                    assumptions=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8487); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(assumptions);


                    }
                    break;

            }


            FOR463=(Token)match(input,FOR,FOLLOW_FOR_in_certificate_specification8491); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR463);


            // AST REWRITE
            // elements: assumptions, entity, certs, ENABLE, ASSUMING, AS
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
            // 874:14: -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
            {
                // nesC.g:874:17: ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ENABLE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_certs.nextNode());

                // nesC.g:874:33: ( ^( AS $entity) )?
                if ( stream_entity.hasNext()||stream_AS.hasNext() ) {
                    // nesC.g:874:33: ^( AS $entity)
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

                // nesC.g:874:48: ( ^( ASSUMING $assumptions) )?
                if ( stream_assumptions.hasNext()||stream_ASSUMING.hasNext() ) {
                    // nesC.g:874:48: ^( ASSUMING $assumptions)
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
    // nesC.g:876:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );
    public final nesCParser.endpoint_return endpoint() throws RecognitionException {
        nesCParser.endpoint_return retval = new nesCParser.endpoint_return();
        retval.start = input.LT(1);

        int endpoint_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal466=null;
        Token char_literal468=null;
        nesCParser.identifier_path_return identifier_path464 =null;

        nesCParser.identifier_path_return identifier_path465 =null;

        nesCParser.argument_expression_list_return argument_expression_list467 =null;


        Object char_literal466_tree=null;
        Object char_literal468_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

            // nesC.g:877:5: ( identifier_path | identifier_path '[' argument_expression_list ']' )
            int alt132=2;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // nesC.g:877:10: identifier_path
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8544);
                    identifier_path464=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path464.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:878:10: identifier_path '[' argument_expression_list ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8555);
                    identifier_path465=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path465.getTree());

                    char_literal466=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_endpoint8557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal466_tree = 
                    (Object)adaptor.create(char_literal466)
                    ;
                    adaptor.addChild(root_0, char_literal466_tree);
                    }

                    pushFollow(FOLLOW_argument_expression_list_in_endpoint8559);
                    argument_expression_list467=argument_expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list467.getTree());

                    char_literal468=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_endpoint8561); if (state.failed) return retval;
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
    // nesC.g:880:1: identifier_path : ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) );
    public final nesCParser.identifier_path_return identifier_path() throws RecognitionException {
        nesCParser.identifier_path_return retval = new nesCParser.identifier_path_return();
        retval.start = input.LT(1);

        int identifier_path_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

            // nesC.g:881:5: ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) )
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
                    // nesC.g:881:10: identifier ( '.' identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_identifier_path8580);
                    identifier469=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier469.getTree());

                    // nesC.g:881:21: ( '.' identifier )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==DOT) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // nesC.g:881:22: '.' identifier
                    	    {
                    	    char_literal470=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8583); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal470);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8585);
                    	    identifier471=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier471.getTree());

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
                    // 882:13: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:882:16: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:883:10: '[' indirect= identifier ']' ( '.' normal_path+= identifier )*
                    {
                    char_literal472=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_identifier_path8619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal472);


                    pushFollow(FOLLOW_identifier_in_identifier_path8623);
                    indirect=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(indirect.getTree());

                    char_literal473=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_identifier_path8625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal473);


                    // nesC.g:883:38: ( '.' normal_path+= identifier )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==DOT) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // nesC.g:883:39: '.' normal_path+= identifier
                    	    {
                    	    char_literal474=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8628); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal474);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8632);
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
                    // 884:13: -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
                    {
                        // nesC.g:884:16: ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
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
    // nesC.g:890:1: component_specification : '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final nesCParser.component_specification_return component_specification() throws RecognitionException {
        nesCParser.component_specification_return retval = new nesCParser.component_specification_return();
        retval.start = input.LT(1);

        int component_specification_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal475=null;
        Token char_literal478=null;
        nesCParser.uses_provides_return uses_provides476 =null;

        nesCParser.line_directive_return line_directive477 =null;


        Object char_literal475_tree=null;
        Object char_literal478_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

            // nesC.g:891:5: ( '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // nesC.g:891:10: '{' ( uses_provides | line_directive )* '}'
            {
            char_literal475=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification8681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal475);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:892:11: ( uses_provides | line_directive )*
            loop136:
            do {
                int alt136=3;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==ASYNC||LA136_0==AUTO||LA136_0==CHAR||LA136_0==COMMAND||LA136_0==CONST||LA136_0==DEFAULT||(LA136_0 >= DOUBLE && LA136_0 <= DUTY)||LA136_0==ENUM||(LA136_0 >= EVENT && LA136_0 <= EXTERN)||LA136_0==FLOAT||(LA136_0 >= INLINE && LA136_0 <= INT8_T)||LA136_0==LONG||LA136_0==NORACE||(LA136_0 >= NXLE_UINT16_T && LA136_0 <= NX_UNION)||(LA136_0 >= PROVIDES && LA136_0 <= RAW_IDENTIFIER)||LA136_0==REGISTER||LA136_0==RESTRICT||LA136_0==SHORT||LA136_0==SIGNED||LA136_0==STATIC||LA136_0==STRUCT||(LA136_0 >= TASK && LA136_0 <= UINT8_T)||(LA136_0 >= UNION && LA136_0 <= VOLATILE)) ) {
                    alt136=1;
                }
                else if ( (LA136_0==HASH) ) {
                    alt136=2;
                }


                switch (alt136) {
            	case 1 :
            	    // nesC.g:892:12: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification8696);
            	    uses_provides476=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides476.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:892:28: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification8700);
            	    line_directive477=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive477.getTree());

            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);


            char_literal478=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification8704); if (state.failed) return retval; 
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
            // 892:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // nesC.g:892:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // nesC.g:892:68: ( uses_provides )*
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
    // nesC.g:894:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) );
    public final nesCParser.uses_provides_return uses_provides() throws RecognitionException {
        nesCParser.uses_provides_return retval = new nesCParser.uses_provides_return();
        retval.start = input.LT(1);

        int uses_provides_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

            // nesC.g:895:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) )
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
                    // nesC.g:895:10: USES specification_element_list
                    {
                    USES479=(Token)match(input,USES,FOLLOW_USES_in_uses_provides8732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES479);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8734);
                    specification_element_list480=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list480.getTree());

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
                    // 895:42: -> ^( USES specification_element_list )
                    {
                        // nesC.g:895:45: ^( USES specification_element_list )
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
                    // nesC.g:896:10: PROVIDES specification_element_list
                    {
                    PROVIDES481=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides8753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES481);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8755);
                    specification_element_list482=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list482.getTree());

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
                    // 896:46: -> ^( PROVIDES specification_element_list )
                    {
                        // nesC.g:896:49: ^( PROVIDES specification_element_list )
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
                    // nesC.g:897:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_uses_provides8774);
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
                    // 897:22: -> ^( DECLARATION declaration )
                    {
                        // nesC.g:897:25: ^( DECLARATION declaration )
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
    // nesC.g:899:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final nesCParser.specification_element_list_return specification_element_list() throws RecognitionException {
        nesCParser.specification_element_list_return retval = new nesCParser.specification_element_list_return();
        retval.start = input.LT(1);

        int specification_element_list_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

            // nesC.g:900:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==ASYNC||LA139_0==AUTO||LA139_0==CHAR||LA139_0==COMMAND||LA139_0==CONST||LA139_0==DEFAULT||(LA139_0 >= DOUBLE && LA139_0 <= DUTY)||LA139_0==ENUM||(LA139_0 >= EVENT && LA139_0 <= EXTERN)||LA139_0==FLOAT||(LA139_0 >= INLINE && LA139_0 <= INTERFACE)||LA139_0==LONG||LA139_0==NORACE||(LA139_0 >= NXLE_UINT16_T && LA139_0 <= NX_UNION)||LA139_0==RAW_IDENTIFIER||(LA139_0 >= REGISTER && LA139_0 <= REMOTE)||LA139_0==RESTRICT||LA139_0==SHORT||LA139_0==SIGNED||LA139_0==STATIC||LA139_0==STRUCT||(LA139_0 >= TASK && LA139_0 <= UINT8_T)||(LA139_0 >= UNION && LA139_0 <= UNSIGNED)||(LA139_0 >= VOID && LA139_0 <= VOLATILE)) ) {
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
                    // nesC.g:900:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list8801);
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
                    // 900:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:901:10: '{' ( specification_element )+ '}'
                    {
                    char_literal485=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list8816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal485);


                    // nesC.g:901:14: ( specification_element )+
                    int cnt138=0;
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==ASYNC||LA138_0==AUTO||LA138_0==CHAR||LA138_0==COMMAND||LA138_0==CONST||LA138_0==DEFAULT||(LA138_0 >= DOUBLE && LA138_0 <= DUTY)||LA138_0==ENUM||(LA138_0 >= EVENT && LA138_0 <= EXTERN)||LA138_0==FLOAT||(LA138_0 >= INLINE && LA138_0 <= INTERFACE)||LA138_0==LONG||LA138_0==NORACE||(LA138_0 >= NXLE_UINT16_T && LA138_0 <= NX_UNION)||LA138_0==RAW_IDENTIFIER||(LA138_0 >= REGISTER && LA138_0 <= REMOTE)||LA138_0==RESTRICT||LA138_0==SHORT||LA138_0==SIGNED||LA138_0==STATIC||LA138_0==STRUCT||(LA138_0 >= TASK && LA138_0 <= UINT8_T)||(LA138_0 >= UNION && LA138_0 <= UNSIGNED)||(LA138_0 >= VOID && LA138_0 <= VOLATILE)) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // nesC.g:901:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list8818);
                    	    specification_element486=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element486.getTree());

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


                    char_literal487=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list8821); if (state.failed) return retval; 
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
                    // 901:41: -> ( specification_element )+
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
    // nesC.g:903:1: specification_element : ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) );
    public final nesCParser.specification_element_return specification_element() throws RecognitionException {
        nesCParser.specification_element_return retval = new nesCParser.specification_element_return();
        retval.start = input.LT(1);

        int specification_element_StartIndex = input.index();

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
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_instance_parameters=new RewriteRuleSubtreeStream(adaptor,"rule instance_parameters");
        RewriteRuleSubtreeStream stream_interface_type=new RewriteRuleSubtreeStream(adaptor,"rule interface_type");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

            // nesC.g:904:5: ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==ASYNC||LA143_0==AUTO||LA143_0==CHAR||LA143_0==COMMAND||LA143_0==CONST||LA143_0==DEFAULT||(LA143_0 >= DOUBLE && LA143_0 <= DUTY)||LA143_0==ENUM||(LA143_0 >= EVENT && LA143_0 <= EXTERN)||LA143_0==FLOAT||(LA143_0 >= INLINE && LA143_0 <= INT8_T)||LA143_0==LONG||LA143_0==NORACE||(LA143_0 >= NXLE_UINT16_T && LA143_0 <= NX_UNION)||LA143_0==RAW_IDENTIFIER||LA143_0==REGISTER||LA143_0==RESTRICT||LA143_0==SHORT||LA143_0==SIGNED||LA143_0==STATIC||LA143_0==STRUCT||(LA143_0 >= TASK && LA143_0 <= UINT8_T)||(LA143_0 >= UNION && LA143_0 <= UNSIGNED)||(LA143_0 >= VOID && LA143_0 <= VOLATILE)) ) {
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
                    // nesC.g:904:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_specification_element8845);
                    declaration488=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration488.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:905:10: interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';'
                    {
                    pushFollow(FOLLOW_interface_type_in_specification_element8856);
                    interface_type489=interface_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_type.add(interface_type489.getTree());

                    // nesC.g:905:25: ( AS identifier )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==AS) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // nesC.g:905:26: AS identifier
                            {
                            AS490=(Token)match(input,AS,FOLLOW_AS_in_specification_element8859); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AS.add(AS490);


                            pushFollow(FOLLOW_identifier_in_specification_element8861);
                            identifier491=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier491.getTree());

                            }
                            break;

                    }


                    // nesC.g:905:42: ( instance_parameters )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==LBRACKET) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // nesC.g:905:42: instance_parameters
                            {
                            pushFollow(FOLLOW_instance_parameters_in_specification_element8865);
                            instance_parameters492=instance_parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_instance_parameters.add(instance_parameters492.getTree());

                            }
                            break;

                    }


                    // nesC.g:905:63: ( attributes )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==ATTRIBUTE) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // nesC.g:905:63: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_specification_element8868);
                            attributes493=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes493.getTree());

                            }
                            break;

                    }


                    char_literal494=(Token)match(input,189,FOLLOW_189_in_specification_element8871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(char_literal494);


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
                    // 906:13: -> ^( INTERFACE interface_type ( identifier )? )
                    {
                        // nesC.g:906:16: ^( INTERFACE interface_type ( identifier )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTERFACE, "INTERFACE")
                        , root_1);

                        adaptor.addChild(root_1, stream_interface_type.nextTree());

                        // nesC.g:906:43: ( identifier )?
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
    // nesC.g:913:1: interface_type : ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) ;
    public final nesCParser.interface_type_return interface_type() throws RecognitionException {
        nesCParser.interface_type_return retval = new nesCParser.interface_type_return();
        retval.start = input.LT(1);

        int interface_type_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

            // nesC.g:914:5: ( ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) )
            // nesC.g:914:10: ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )?
            {
            // nesC.g:914:10: ( REMOTE )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==REMOTE) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // nesC.g:914:10: REMOTE
                    {
                    REMOTE495=(Token)match(input,REMOTE,FOLLOW_REMOTE_in_interface_type8918); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REMOTE.add(REMOTE495);


                    }
                    break;

            }


            INTERFACE496=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_type8921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE496);


            pushFollow(FOLLOW_identifier_in_interface_type8923);
            identifier497=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier497.getTree());

            // nesC.g:914:39: ( type_arguments )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==LESS) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // nesC.g:914:39: type_arguments
                    {
                    pushFollow(FOLLOW_type_arguments_in_interface_type8925);
                    type_arguments498=type_arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_arguments.add(type_arguments498.getTree());

                    }
                    break;

            }


            // nesC.g:914:55: ( REQUIRES STRING_LITERAL )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==REQUIRES) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // nesC.g:914:56: REQUIRES STRING_LITERAL
                    {
                    REQUIRES499=(Token)match(input,REQUIRES,FOLLOW_REQUIRES_in_interface_type8929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRES.add(REQUIRES499);


                    STRING_LITERAL500=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_interface_type8931); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL500);


                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, STRING_LITERAL, REMOTE, type_arguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 915:13: -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
            {
                // nesC.g:915:16: ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_TYPE, "INTERFACE_TYPE")
                , root_1);

                // nesC.g:915:33: ( REMOTE )?
                if ( stream_REMOTE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_REMOTE.nextNode()
                    );

                }
                stream_REMOTE.reset();

                // nesC.g:915:41: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING_LITERAL.nextNode()
                    );

                }
                stream_STRING_LITERAL.reset();

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:915:68: ( type_arguments )?
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
    // nesC.g:917:1: type_arguments : '<' type_name ( ',' type_name )* '>' -> ( type_name )+ ;
    public final nesCParser.type_arguments_return type_arguments() throws RecognitionException {
        nesCParser.type_arguments_return retval = new nesCParser.type_arguments_return();
        retval.start = input.LT(1);

        int type_arguments_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

            // nesC.g:918:5: ( '<' type_name ( ',' type_name )* '>' -> ( type_name )+ )
            // nesC.g:918:10: '<' type_name ( ',' type_name )* '>'
            {
            char_literal501=(Token)match(input,LESS,FOLLOW_LESS_in_type_arguments8981); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESS.add(char_literal501);


            pushFollow(FOLLOW_type_name_in_type_arguments8983);
            type_name502=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_name.add(type_name502.getTree());

            // nesC.g:918:24: ( ',' type_name )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==COMMA) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // nesC.g:918:25: ',' type_name
            	    {
            	    char_literal503=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_arguments8986); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal503);


            	    pushFollow(FOLLOW_type_name_in_type_arguments8988);
            	    type_name504=type_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type_name.add(type_name504.getTree());

            	    }
            	    break;

            	default :
            	    break loop147;
                }
            } while (true);


            char_literal505=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_arguments8992); if (state.failed) return retval; 
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
            // 918:45: -> ( type_name )+
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
    // nesC.g:920:1: instance_parameters : '[' parameter_type_list ']' ;
    public final nesCParser.instance_parameters_return instance_parameters() throws RecognitionException {
        nesCParser.instance_parameters_return retval = new nesCParser.instance_parameters_return();
        retval.start = input.LT(1);

        int instance_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal506=null;
        Token char_literal508=null;
        nesCParser.parameter_type_list_return parameter_type_list507 =null;


        Object char_literal506_tree=null;
        Object char_literal508_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

            // nesC.g:921:5: ( '[' parameter_type_list ']' )
            // nesC.g:921:10: '[' parameter_type_list ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal506=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_instance_parameters9016); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal506_tree = 
            (Object)adaptor.create(char_literal506)
            ;
            adaptor.addChild(root_0, char_literal506_tree);
            }

            pushFollow(FOLLOW_parameter_type_list_in_instance_parameters9018);
            parameter_type_list507=parameter_type_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list507.getTree());

            char_literal508=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_instance_parameters9020); if (state.failed) return retval;
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
    // nesC.g:923:1: attributes : ( attribute )+ ;
    public final nesCParser.attributes_return attributes() throws RecognitionException {
        nesCParser.attributes_return retval = new nesCParser.attributes_return();
        retval.start = input.LT(1);

        int attributes_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.attribute_return attribute509 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

            // nesC.g:924:5: ( ( attribute )+ )
            // nesC.g:924:10: ( attribute )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:924:10: ( attribute )+
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
            	    // nesC.g:924:10: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributes9039);
            	    attribute509=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute509.getTree());

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
    // nesC.g:926:1: attribute : '@' identifier '(' initializer_list ')' ;
    public final nesCParser.attribute_return attribute() throws RecognitionException {
        nesCParser.attribute_return retval = new nesCParser.attribute_return();
        retval.start = input.LT(1);

        int attribute_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

            // nesC.g:927:5: ( '@' identifier '(' initializer_list ')' )
            // nesC.g:927:10: '@' identifier '(' initializer_list ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal510=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute9059); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal510_tree = 
            (Object)adaptor.create(char_literal510)
            ;
            adaptor.addChild(root_0, char_literal510_tree);
            }

            pushFollow(FOLLOW_identifier_in_attribute9061);
            identifier511=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier511.getTree());

            char_literal512=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_attribute9063); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal512_tree = 
            (Object)adaptor.create(char_literal512)
            ;
            adaptor.addChild(root_0, char_literal512_tree);
            }

            pushFollow(FOLLOW_initializer_list_in_attribute9065);
            initializer_list513=initializer_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer_list513.getTree());

            char_literal514=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_attribute9067); if (state.failed) return retval;
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
    // nesC.g:932:1: gcc_attributes : GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' ;
    public final nesCParser.gcc_attributes_return gcc_attributes() throws RecognitionException {
        nesCParser.gcc_attributes_return retval = new nesCParser.gcc_attributes_return();
        retval.start = input.LT(1);

        int gcc_attributes_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

            // nesC.g:933:5: ( GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')' )
            // nesC.g:933:10: GCCATTRIBUTE '(' '(' gcc_attribute_list ')' ')'
            {
            root_0 = (Object)adaptor.nil();


            GCCATTRIBUTE515=(Token)match(input,GCCATTRIBUTE,FOLLOW_GCCATTRIBUTE_in_gcc_attributes9085); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GCCATTRIBUTE515_tree = 
            (Object)adaptor.create(GCCATTRIBUTE515)
            ;
            adaptor.addChild(root_0, GCCATTRIBUTE515_tree);
            }

            char_literal516=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes9087); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal516_tree = 
            (Object)adaptor.create(char_literal516)
            ;
            adaptor.addChild(root_0, char_literal516_tree);
            }

            char_literal517=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_gcc_attributes9089); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal517_tree = 
            (Object)adaptor.create(char_literal517)
            ;
            adaptor.addChild(root_0, char_literal517_tree);
            }

            pushFollow(FOLLOW_gcc_attribute_list_in_gcc_attributes9091);
            gcc_attribute_list518=gcc_attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute_list518.getTree());

            char_literal519=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes9093); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal519_tree = 
            (Object)adaptor.create(char_literal519)
            ;
            adaptor.addChild(root_0, char_literal519_tree);
            }

            char_literal520=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_gcc_attributes9095); if (state.failed) return retval;
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
    // nesC.g:935:1: gcc_attribute_list : ( gcc_attribute )? ( ',' gcc_attribute )* ;
    public final nesCParser.gcc_attribute_list_return gcc_attribute_list() throws RecognitionException {
        nesCParser.gcc_attribute_list_return retval = new nesCParser.gcc_attribute_list_return();
        retval.start = input.LT(1);

        int gcc_attribute_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal522=null;
        nesCParser.gcc_attribute_return gcc_attribute521 =null;

        nesCParser.gcc_attribute_return gcc_attribute523 =null;


        Object char_literal522_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

            // nesC.g:936:5: ( ( gcc_attribute )? ( ',' gcc_attribute )* )
            // nesC.g:936:10: ( gcc_attribute )? ( ',' gcc_attribute )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:936:10: ( gcc_attribute )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==AMP||LA149_0==BITCOMPLEMENT||LA149_0==CALL||LA149_0==CHARACTER_LITERAL||LA149_0==CONSTANT||LA149_0==LPARENS||LA149_0==MINUS||LA149_0==MINUSMINUS||LA149_0==NOT||LA149_0==PLUS||LA149_0==PLUSPLUS||LA149_0==POST||LA149_0==RAW_IDENTIFIER||LA149_0==SIGNAL||LA149_0==SIZEOF||LA149_0==STAR||LA149_0==STRING_LITERAL) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // nesC.g:936:10: gcc_attribute
                    {
                    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list9110);
                    gcc_attribute521=gcc_attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute521.getTree());

                    }
                    break;

            }


            // nesC.g:936:25: ( ',' gcc_attribute )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==COMMA) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // nesC.g:936:26: ',' gcc_attribute
            	    {
            	    char_literal522=(Token)match(input,COMMA,FOLLOW_COMMA_in_gcc_attribute_list9114); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal522_tree = 
            	    (Object)adaptor.create(char_literal522)
            	    ;
            	    adaptor.addChild(root_0, char_literal522_tree);
            	    }

            	    pushFollow(FOLLOW_gcc_attribute_in_gcc_attribute_list9116);
            	    gcc_attribute523=gcc_attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, gcc_attribute523.getTree());

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
    // nesC.g:938:1: gcc_attribute : assignment_expression ;
    public final nesCParser.gcc_attribute_return gcc_attribute() throws RecognitionException {
        nesCParser.gcc_attribute_return retval = new nesCParser.gcc_attribute_return();
        retval.start = input.LT(1);

        int gcc_attribute_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.assignment_expression_return assignment_expression524 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

            // nesC.g:939:5: ( assignment_expression )
            // nesC.g:939:10: assignment_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_gcc_attribute9133);
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
    // nesC.g:941:1: identifier : id= RAW_IDENTIFIER {...}?;
    public final nesCParser.identifier_return identifier() throws RecognitionException {
        nesCParser.identifier_return retval = new nesCParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

            // nesC.g:942:5: (id= RAW_IDENTIFIER {...}?)
            // nesC.g:942:9: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier9149); if (state.failed) return retval;
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
        // nesC.g:289:10: ( SIZEOF '(' type_name ')' )
        // nesC.g:289:10: SIZEOF '(' type_name ')'
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred24_nesC3241); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred24_nesC3243); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred24_nesC3245);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred24_nesC3247); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_nesC

    // $ANTLR start synpred25_nesC
    public final void synpred25_nesC_fragment() throws RecognitionException {
        // nesC.g:290:10: ( SIZEOF unary_expression )
        // nesC.g:290:10: SIZEOF unary_expression
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred25_nesC3266); if (state.failed) return ;

        pushFollow(FOLLOW_unary_expression_in_synpred25_nesC3268);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_nesC

    // $ANTLR start synpred26_nesC
    public final void synpred26_nesC_fragment() throws RecognitionException {
        // nesC.g:298:10: ( '(' type_name ')' cast_expression )
        // nesC.g:298:10: '(' type_name ')' cast_expression
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred26_nesC3311); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred26_nesC3313);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred26_nesC3315); if (state.failed) return ;

        pushFollow(FOLLOW_cast_expression_in_synpred26_nesC3317);
        cast_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred26_nesC

    // $ANTLR start synpred56_nesC
    public final void synpred56_nesC_fragment() throws RecognitionException {
        // nesC.g:335:10: ( unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression )
        // nesC.g:335:10: unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression
        {
        pushFollow(FOLLOW_unary_expression_in_synpred56_nesC3719);
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


        pushFollow(FOLLOW_assignment_expression_in_synpred56_nesC3776);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_nesC

    // $ANTLR start synpred57_nesC
    public final void synpred57_nesC_fragment() throws RecognitionException {
        // nesC.g:339:33: ( ',' assignment_expression )
        // nesC.g:339:33: ',' assignment_expression
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred57_nesC3809); if (state.failed) return ;

        pushFollow(FOLLOW_assignment_expression_in_synpred57_nesC3812);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_nesC

    // $ANTLR start synpred60_nesC
    public final void synpred60_nesC_fragment() throws RecognitionException {
        // nesC.g:364:10: ( declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';' )
        // nesC.g:364:10: declaration_specifiers ( gcc_attributes )? ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred60_nesC3897);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:368:33: ( gcc_attributes )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( (LA152_0==GCCATTRIBUTE) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // nesC.g:368:33: gcc_attributes
                {
                pushFollow(FOLLOW_gcc_attributes_in_synpred60_nesC3899);
                gcc_attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // nesC.g:368:49: ( init_declarator_list )?
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==LPARENS||LA153_0==RAW_IDENTIFIER||LA153_0==STAR) ) {
            alt153=1;
        }
        switch (alt153) {
            case 1 :
                // nesC.g:368:49: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred60_nesC3902);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,189,FOLLOW_189_in_synpred60_nesC3905); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_nesC

    // $ANTLR start synpred61_nesC
    public final void synpred61_nesC_fragment() throws RecognitionException {
        // nesC.g:377:10: ( function_definition )
        // nesC.g:377:10: function_definition
        {
        pushFollow(FOLLOW_function_definition_in_synpred61_nesC3967);
        function_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred61_nesC

    // $ANTLR start synpred65_nesC
    public final void synpred65_nesC_fragment() throws RecognitionException {
        // nesC.g:397:11: ( type_specifier )
        // nesC.g:397:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred65_nesC4098);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred65_nesC

    // $ANTLR start synpred109_nesC
    public final void synpred109_nesC_fragment() throws RecognitionException {
        // nesC.g:459:10: ( struct_or_union ( identifier )? '{' struct_declaration_list '}' )
        // nesC.g:459:10: struct_or_union ( identifier )? '{' struct_declaration_list '}'
        {
        pushFollow(FOLLOW_struct_or_union_in_synpred109_nesC4803);
        struct_or_union();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:459:26: ( identifier )?
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==RAW_IDENTIFIER) ) {
            alt154=1;
        }
        switch (alt154) {
            case 1 :
                // nesC.g:459:26: identifier
                {
                pushFollow(FOLLOW_identifier_in_synpred109_nesC4805);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred109_nesC4808); if (state.failed) return ;

        pushFollow(FOLLOW_struct_declaration_list_in_synpred109_nesC4810);
        struct_declaration_list();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACE,FOLLOW_RBRACE_in_synpred109_nesC4812); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred109_nesC

    // $ANTLR start synpred110_nesC
    public final void synpred110_nesC_fragment() throws RecognitionException {
        // nesC.g:461:10: ( struct_or_union identifier )
        // nesC.g:461:10: struct_or_union identifier
        {
        pushFollow(FOLLOW_struct_or_union_in_synpred110_nesC4846);
        struct_or_union();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred110_nesC4848);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred110_nesC

    // $ANTLR start synpred111_nesC
    public final void synpred111_nesC_fragment() throws RecognitionException {
        // nesC.g:463:10: ( STRUCT '@' identifier '{' struct_declaration_list '}' )
        // nesC.g:463:10: STRUCT '@' identifier '{' struct_declaration_list '}'
        {
        match(input,STRUCT,FOLLOW_STRUCT_in_synpred111_nesC4879); if (state.failed) return ;

        match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_synpred111_nesC4881); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred111_nesC4883);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred111_nesC4885); if (state.failed) return ;

        pushFollow(FOLLOW_struct_declaration_list_in_synpred111_nesC4887);
        struct_declaration_list();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACE,FOLLOW_RBRACE_in_synpred111_nesC4889); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_nesC

    // $ANTLR start synpred116_nesC
    public final void synpred116_nesC_fragment() throws RecognitionException {
        // nesC.g:489:11: ( type_specifier )
        // nesC.g:489:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred116_nesC5092);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred116_nesC

    // $ANTLR start synpred120_nesC
    public final void synpred120_nesC_fragment() throws RecognitionException {
        // nesC.g:500:10: ( ( declarator )? ':' constant_expression )
        // nesC.g:500:10: ( declarator )? ':' constant_expression
        {
        // nesC.g:500:10: ( declarator )?
        int alt155=2;
        int LA155_0 = input.LA(1);

        if ( (LA155_0==LPARENS||LA155_0==RAW_IDENTIFIER||LA155_0==STAR) ) {
            alt155=1;
        }
        switch (alt155) {
            case 1 :
                // nesC.g:500:10: declarator
                {
                pushFollow(FOLLOW_declarator_in_synpred120_nesC5157);
                declarator();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,188,FOLLOW_188_in_synpred120_nesC5160); if (state.failed) return ;

        pushFollow(FOLLOW_constant_expression_in_synpred120_nesC5162);
        constant_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_nesC

    // $ANTLR start synpred123_nesC
    public final void synpred123_nesC_fragment() throws RecognitionException {
        // nesC.g:504:10: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' )
        // nesC.g:504:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred123_nesC5192); if (state.failed) return ;

        // nesC.g:504:15: ( identifier )?
        int alt156=2;
        int LA156_0 = input.LA(1);

        if ( (LA156_0==RAW_IDENTIFIER) ) {
            alt156=1;
        }
        switch (alt156) {
            case 1 :
                // nesC.g:504:15: identifier
                {
                pushFollow(FOLLOW_identifier_in_synpred123_nesC5194);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred123_nesC5197); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred123_nesC5199);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:504:47: ( ',' )?
        int alt157=2;
        int LA157_0 = input.LA(1);

        if ( (LA157_0==COMMA) ) {
            alt157=1;
        }
        switch (alt157) {
            case 1 :
                // nesC.g:504:47: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred123_nesC5201); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred123_nesC5204); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred123_nesC

    // $ANTLR start synpred125_nesC
    public final void synpred125_nesC_fragment() throws RecognitionException {
        // nesC.g:506:10: ( ENUM identifier attributes '{' enumerator_list ( ',' )? '}' )
        // nesC.g:506:10: ENUM identifier attributes '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred125_nesC5239); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred125_nesC5241);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_attributes_in_synpred125_nesC5243);
        attributes();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred125_nesC5245); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred125_nesC5247);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:506:57: ( ',' )?
        int alt158=2;
        int LA158_0 = input.LA(1);

        if ( (LA158_0==COMMA) ) {
            alt158=1;
        }
        switch (alt158) {
            case 1 :
                // nesC.g:506:57: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred125_nesC5249); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred125_nesC5252); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred125_nesC

    // $ANTLR start synpred135_nesC
    public final void synpred135_nesC_fragment() throws RecognitionException {
        // nesC.g:556:9: ( '[' ( constant_expression )? ']' )
        // nesC.g:556:9: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred135_nesC5575); if (state.failed) return ;

        // nesC.g:556:13: ( constant_expression )?
        int alt160=2;
        int LA160_0 = input.LA(1);

        if ( (LA160_0==AMP||LA160_0==BITCOMPLEMENT||LA160_0==CALL||LA160_0==CHARACTER_LITERAL||LA160_0==CONSTANT||LA160_0==LPARENS||LA160_0==MINUS||LA160_0==MINUSMINUS||LA160_0==NOT||LA160_0==PLUS||LA160_0==PLUSPLUS||LA160_0==POST||LA160_0==RAW_IDENTIFIER||LA160_0==SIGNAL||LA160_0==SIZEOF||LA160_0==STAR||LA160_0==STRING_LITERAL) ) {
            alt160=1;
        }
        switch (alt160) {
            case 1 :
                // nesC.g:556:13: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred135_nesC5577);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred135_nesC5580); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred135_nesC

    // $ANTLR start synpred145_nesC
    public final void synpred145_nesC_fragment() throws RecognitionException {
        // nesC.g:591:10: ( declaration_specifiers declarator ( attributes )? )
        // nesC.g:591:10: declaration_specifiers declarator ( attributes )?
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred145_nesC5849);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_declarator_in_synpred145_nesC5851);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:591:44: ( attributes )?
        int alt163=2;
        int LA163_0 = input.LA(1);

        if ( (LA163_0==ATTRIBUTE) ) {
            alt163=1;
        }
        switch (alt163) {
            case 1 :
                // nesC.g:591:44: attributes
                {
                pushFollow(FOLLOW_attributes_in_synpred145_nesC5853);
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
        // nesC.g:603:10: ( ( pointer )? direct_abstract_declarator )
        // nesC.g:603:10: ( pointer )? direct_abstract_declarator
        {
        // nesC.g:603:10: ( pointer )?
        int alt164=2;
        int LA164_0 = input.LA(1);

        if ( (LA164_0==STAR) ) {
            alt164=1;
        }
        switch (alt164) {
            case 1 :
                // nesC.g:603:10: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred150_nesC5988);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred150_nesC5991);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred150_nesC

    // $ANTLR start synpred154_nesC
    public final void synpred154_nesC_fragment() throws RecognitionException {
        // nesC.g:609:15: ( parameter_type_list )
        // nesC.g:609:15: parameter_type_list
        {
        pushFollow(FOLLOW_parameter_type_list_in_synpred154_nesC6064);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred154_nesC

    // $ANTLR start synpred157_nesC
    public final void synpred157_nesC_fragment() throws RecognitionException {
        // nesC.g:610:52: ( parameter_type_list )
        // nesC.g:610:52: parameter_type_list
        {
        pushFollow(FOLLOW_parameter_type_list_in_synpred157_nesC6097);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred157_nesC

    // $ANTLR start synpred174_nesC
    public final void synpred174_nesC_fragment() throws RecognitionException {
        // nesC.g:665:10: ( declaration )
        // nesC.g:665:10: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred174_nesC6547);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred174_nesC

    // $ANTLR start synpred176_nesC
    public final void synpred176_nesC_fragment() throws RecognitionException {
        // nesC.g:676:43: ( ELSE statement )
        // nesC.g:676:43: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred176_nesC6623); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred176_nesC6625);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred176_nesC

    // $ANTLR start synpred189_nesC
    public final void synpred189_nesC_fragment() throws RecognitionException {
        // nesC.g:723:38: ( CONSTANT )
        // nesC.g:723:38: CONSTANT
        {
        match(input,CONSTANT,FOLLOW_CONSTANT_in_synpred189_nesC7065); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred189_nesC

    // $ANTLR start synpred192_nesC
    public final void synpred192_nesC_fragment() throws RecognitionException {
        // nesC.g:738:10: ( ( translation_unit )? interface_definition )
        // nesC.g:738:10: ( translation_unit )? interface_definition
        {
        // nesC.g:738:10: ( translation_unit )?
        int alt170=2;
        int LA170_0 = input.LA(1);

        if ( (LA170_0==ASYNC||LA170_0==AUTO||LA170_0==CHAR||LA170_0==COMMAND||LA170_0==CONST||LA170_0==DEFAULT||(LA170_0 >= DOUBLE && LA170_0 <= DUTY)||LA170_0==ENUM||(LA170_0 >= EVENT && LA170_0 <= EXTERN)||LA170_0==FLOAT||LA170_0==HASH||(LA170_0 >= INLINE && LA170_0 <= INT8_T)||LA170_0==LONG||LA170_0==NORACE||(LA170_0 >= NXLE_UINT16_T && LA170_0 <= NX_UNION)||LA170_0==RAW_IDENTIFIER||LA170_0==REGISTER||LA170_0==RESTRICT||LA170_0==SHORT||LA170_0==SIGNED||LA170_0==STATIC||LA170_0==STRUCT||(LA170_0 >= TASK && LA170_0 <= UINT8_T)||(LA170_0 >= UNION && LA170_0 <= UNSIGNED)||(LA170_0 >= VOID && LA170_0 <= VOLATILE)) ) {
            alt170=1;
        }
        switch (alt170) {
            case 1 :
                // nesC.g:738:10: translation_unit
                {
                pushFollow(FOLLOW_translation_unit_in_synpred192_nesC7149);
                translation_unit();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_interface_definition_in_synpred192_nesC7152);
        interface_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred192_nesC

    // $ANTLR start synpred208_nesC
    public final void synpred208_nesC_fragment() throws RecognitionException {
        // nesC.g:780:10: ( module_implementation )
        // nesC.g:780:10: module_implementation
        {
        pushFollow(FOLLOW_module_implementation_in_synpred208_nesC7593);
        module_implementation();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred208_nesC

    // $ANTLR start synpred222_nesC
    public final void synpred222_nesC_fragment() throws RecognitionException {
        // nesC.g:857:10: ( expression )
        // nesC.g:857:10: expression
        {
        pushFollow(FOLLOW_expression_in_synpred222_nesC8295);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred222_nesC

    // $ANTLR start synpred223_nesC
    public final void synpred223_nesC_fragment() throws RecognitionException {
        // nesC.g:865:10: ( endpoint '=' endpoint ';' )
        // nesC.g:865:10: endpoint '=' endpoint ';'
        {
        pushFollow(FOLLOW_endpoint_in_synpred223_nesC8325);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred223_nesC8327); if (state.failed) return ;

        pushFollow(FOLLOW_endpoint_in_synpred223_nesC8329);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,189,FOLLOW_189_in_synpred223_nesC8331); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred223_nesC

    // $ANTLR start synpred225_nesC
    public final void synpred225_nesC_fragment() throws RecognitionException {
        // nesC.g:867:10: ( ( certificate_specification )? endpoint '->' endpoint ';' )
        // nesC.g:867:10: ( certificate_specification )? endpoint '->' endpoint ';'
        {
        // nesC.g:867:10: ( certificate_specification )?
        int alt172=2;
        int LA172_0 = input.LA(1);

        if ( (LA172_0==ENABLE) ) {
            alt172=1;
        }
        switch (alt172) {
            case 1 :
                // nesC.g:867:10: certificate_specification
                {
                pushFollow(FOLLOW_certificate_specification_in_synpred225_nesC8367);
                certificate_specification();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_endpoint_in_synpred225_nesC8370);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,ARROW,FOLLOW_ARROW_in_synpred225_nesC8372); if (state.failed) return ;

        pushFollow(FOLLOW_endpoint_in_synpred225_nesC8374);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,189,FOLLOW_189_in_synpred225_nesC8376); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred225_nesC

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
    public final boolean synpred208_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred208_nesC_fragment(); // can never throw exception
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
    public final boolean synpred176_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred176_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred189_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred189_nesC_fragment(); // can never throw exception
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
    public final boolean synpred192_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred192_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred225_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred225_nesC_fragment(); // can never throw exception
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


    protected DFA61 dfa61 = new DFA61(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA113 dfa113 = new DFA113(this);
    protected DFA132 dfa132 = new DFA132(this);
    static final String DFA61_eotS =
        "\5\uffff";
    static final String DFA61_eofS =
        "\1\uffff\2\4\2\uffff";
    static final String DFA61_minS =
        "\1\u00a6\2\36\2\uffff";
    static final String DFA61_maxS =
        "\1\u00a6\2\u00b8\2\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA61_specialS =
        "\5\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1",
            "\1\4\16\uffff\1\2\43\uffff\1\4\23\uffff\1\4\4\uffff\1\4\51"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "\1\4\16\uffff\1\2\43\uffff\1\4\23\uffff\1\4\4\uffff\1\4\51"+
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
            return "565:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
    static final String DFA87_eotS =
        "\77\uffff";
    static final String DFA87_eofS =
        "\77\uffff";
    static final String DFA87_minS =
        "\1\6\35\uffff\1\0\2\uffff\1\0\35\uffff";
    static final String DFA87_maxS =
        "\1\u00bd\35\uffff\1\0\2\uffff\1\0\35\uffff";
    static final String DFA87_acceptS =
        "\1\uffff\1\1\41\uffff\1\2\33\uffff";
    static final String DFA87_specialS =
        "\36\uffff\1\0\2\uffff\1\1\35\uffff}>";
    static final String[] DFA87_transitionS = {
            "\1\43\7\uffff\1\1\1\43\1\uffff\1\1\1\uffff\1\43\4\uffff\3\43"+
            "\1\uffff\1\1\1\43\1\uffff\1\1\15\uffff\1\1\2\43\6\uffff\1\41"+
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

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "664:1: block_item : ( declaration | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_30 = input.LA(1);

                         
                        int index87_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred174_nesC()) ) {s = 1;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index87_30);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA87_33 = input.LA(1);

                         
                        int index87_33 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred174_nesC()) ) {s = 1;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index87_33);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA113_eotS =
        "\14\uffff";
    static final String DFA113_eofS =
        "\14\uffff";
    static final String DFA113_minS =
        "\1\130\1\144\1\16\1\uffff\1\12\1\56\1\uffff\1\u00a9\2\16\2\0";
    static final String DFA113_maxS =
        "\1\130\1\144\1\u00b8\1\uffff\1\u00be\1\56\1\uffff\1\u00a9\2\u00b8"+
        "\2\0";
    static final String DFA113_acceptS =
        "\3\uffff\1\1\2\uffff\1\2\5\uffff";
    static final String DFA113_specialS =
        "\12\uffff\1\0\1\1}>";
    static final String[] DFA113_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff\1\3\3\uffff\1\6\11\uffff"+
            "\1\3\10\uffff\1\3\6\uffff\2\3\2\uffff\1\6\1\3\2\uffff\2\3\1"+
            "\uffff\1\3\12\uffff\1\5\7\uffff\6\3\4\uffff\1\6\3\uffff\1\3"+
            "\13\uffff\1\3\6\uffff\12\3\16\uffff\1\4\1\6\1\uffff\1\3\2\uffff"+
            "\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\6\3\2\uffff\2\3\1\uffff\2\3",
            "",
            "\1\6\1\uffff\1\6\1\uffff\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff"+
            "\1\3\15\uffff\1\3\10\uffff\1\3\5\uffff\1\6\2\3\3\uffff\1\3\2"+
            "\uffff\2\3\1\uffff\1\3\5\uffff\1\3\14\uffff\6\3\4\uffff\1\6"+
            "\3\uffff\2\3\12\uffff\1\3\6\uffff\12\3\16\uffff\1\3\2\uffff"+
            "\1\3\2\uffff\1\3\4\uffff\1\3\1\uffff\1\3\4\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\4\3\2\uffff\2\3\1\uffff"+
            "\2\3\4\uffff\1\3\1\6",
            "\1\7",
            "",
            "\1\10",
            "\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff\1\3\3\uffff\1\6\11\uffff"+
            "\1\3\1\11\7\uffff\1\3\6\uffff\2\3\2\uffff\1\6\1\3\2\uffff\2"+
            "\3\1\uffff\1\3\12\uffff\1\5\7\uffff\6\3\4\uffff\1\6\3\uffff"+
            "\1\3\13\uffff\1\3\6\uffff\12\3\16\uffff\1\4\1\12\1\uffff\1\3"+
            "\2\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3"+
            "\1\uffff\6\3\2\uffff\2\3\1\uffff\2\3",
            "\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff\1\3\3\uffff\1\6\11\uffff"+
            "\1\3\10\uffff\1\3\6\uffff\2\3\2\uffff\1\6\1\3\2\uffff\2\3\1"+
            "\uffff\1\3\12\uffff\1\5\7\uffff\6\3\4\uffff\1\6\3\uffff\1\3"+
            "\13\uffff\1\3\6\uffff\12\3\16\uffff\1\4\1\13\1\uffff\1\3\2\uffff"+
            "\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\6\3\2\uffff\2\3\1\uffff\2\3",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA113_eot = DFA.unpackEncodedString(DFA113_eotS);
    static final short[] DFA113_eof = DFA.unpackEncodedString(DFA113_eofS);
    static final char[] DFA113_min = DFA.unpackEncodedStringToUnsignedChars(DFA113_minS);
    static final char[] DFA113_max = DFA.unpackEncodedStringToUnsignedChars(DFA113_maxS);
    static final short[] DFA113_accept = DFA.unpackEncodedString(DFA113_acceptS);
    static final short[] DFA113_special = DFA.unpackEncodedString(DFA113_specialS);
    static final short[][] DFA113_transition;

    static {
        int numStates = DFA113_transitionS.length;
        DFA113_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA113_transition[i] = DFA.unpackEncodedString(DFA113_transitionS[i]);
        }
    }

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = DFA113_eot;
            this.eof = DFA113_eof;
            this.min = DFA113_min;
            this.max = DFA113_max;
            this.accept = DFA113_accept;
            this.special = DFA113_special;
            this.transition = DFA113_transition;
        }
        public String getDescription() {
            return "779:1: implementation : ( module_implementation | configuration_implementation );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA113_10 = input.LA(1);

                         
                        int index113_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred208_nesC()) ) {s = 3;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index113_10);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA113_11 = input.LA(1);

                         
                        int index113_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred208_nesC()) ) {s = 3;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index113_11);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 113, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA132_eotS =
        "\13\uffff";
    static final String DFA132_eofS =
        "\13\uffff";
    static final String DFA132_minS =
        "\1\145\1\12\2\u0094\2\uffff\1\u0096\2\12\1\u0094\1\12";
    static final String DFA132_maxS =
        "\1\u0094\1\u00be\2\u0094\2\uffff\1\u0096\2\u00be\1\u0094\1\u00be";
    static final String DFA132_acceptS =
        "\4\uffff\1\1\1\2\5\uffff";
    static final String DFA132_specialS =
        "\13\uffff}>";
    static final String[] DFA132_transitionS = {
            "\1\2\56\uffff\1\1",
            "\1\4\1\uffff\1\4\57\uffff\1\3\50\uffff\1\5\127\uffff\2\4",
            "\1\6",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\4\1\uffff\1\4\57\uffff\1\3\50\uffff\1\5\127\uffff\2\4",
            "\1\4\1\uffff\1\4\57\uffff\1\11\50\uffff\1\5\127\uffff\2\4",
            "\1\12",
            "\1\4\1\uffff\1\4\57\uffff\1\11\50\uffff\1\5\127\uffff\2\4"
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
            return "876:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );";
        }
    }
 

    public static final BitSet FOLLOW_identifier_in_primary_expression2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_primary_expression2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_primary_expression2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_primary_expression2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_primary_expression2814 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_expression_in_primary_expression2816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_primary_expression2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_kind_in_postfix_expression2843 = new BitSet(new long[]{0x0000400020000000L,0x0000040000000000L,0x0000020000100000L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression2846 = new BitSet(new long[]{0x1000000000000402L,0x0000842000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_postfix_expression_modifier_in_postfix_expression2848 = new BitSet(new long[]{0x1000000000000402L,0x0000842000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LBRACKET_in_postfix_expression_modifier2889 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_expression_in_postfix_expression_modifier2891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACKET_in_postfix_expression_modifier2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression_modifier2911 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024510102A00L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression_modifier2913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression_modifier2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression_modifier2935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_postfix_expression_modifier2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_postfix_expression_modifier2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_postfix_expression_modifier2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3045 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list3048 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list3051 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unary_expression3072 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_unary_expression3093 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_unary_expression3114 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression3141 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression3167 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression3194 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITCOMPLEMENT_in_unary_expression3221 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_NOT_in_unary_expression3226 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3241 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_unary_expression3243 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_type_name_in_unary_expression3245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_unary_expression3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3266 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_cast_expression3311 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_type_name_in_cast_expression3313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_cast_expression3315 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3357 = new BitSet(new long[]{0x0400000000000002L,0x0004000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression3362 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expression3367 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_MODULUS_in_multiplicative_expression3372 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3376 = new BitSet(new long[]{0x0400000000000002L,0x0004000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3397 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression3402 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression3407 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3411 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3432 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression3437 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression3442 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3446 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3467 = new BitSet(new long[]{0x0000000000000002L,0x000000C000060000L});
    public static final BitSet FOLLOW_LESS_in_relational_expression3472 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression3477 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_LESSEQUAL_in_relational_expression3482 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_relational_expression3487 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3491 = new BitSet(new long[]{0x0000000000000002L,0x000000C000060000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3512 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000010L});
    public static final BitSet FOLLOW_EQUAL_in_equality_expression3517 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equality_expression3522 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3526 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000010L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3547 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMP_in_and_expression3551 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3554 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3575 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_BITXOR_in_xor_expression3579 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3582 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3603 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BITOR_in_or_expression3607 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3610 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3631 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression3635 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3638 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3659 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression3663 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3666 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression3687 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_191_in_conditional_expression3690 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_expression_in_conditional_expression3693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_conditional_expression3695 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_assignment_expression3719 = new BitSet(new long[]{0x0200000000A41000L,0x0009500000000000L,0x0000000040000400L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_expression3722 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_MULASSIGN_in_assignment_expression3727 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_DIVASSIGN_in_assignment_expression3732 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_MODASSIGN_in_assignment_expression3737 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_PLUSASSIGN_in_assignment_expression3742 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_MINUSASSIGN_in_assignment_expression3747 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_LSHIFTASSIGN_in_assignment_expression3752 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_RSHIFTASSIGN_in_assignment_expression3757 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_BITANDASSIGN_in_assignment_expression3762 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_BITXORASSIGN_in_assignment_expression3767 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_BITORASSIGN_in_assignment_expression3772 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3806 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_expression3809 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3812 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3897 = new BitSet(new long[]{0x0000000000000000L,0x0000040000004000L,0x2000004000100000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration3899 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x2000004000100000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_declaration3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration4012 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8000164L,0x01B3D5028490003FL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration4014 = new BitSet(new long[]{0x0000000000000000L,0x0000040000004000L,0x0000004000100000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4016 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000004000100000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration4019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x2000000000000000L});
    public static final BitSet FOLLOW_gcc_attributes_in_declaration4021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_declaration4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers4084 = new BitSet(new long[]{0x6040200090024002L,0xF0200201F8000164L,0x01B3D5028490003FL});
    public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers4098 = new BitSet(new long[]{0x6040200090024002L,0xF0200201F8000164L,0x01B3D5028490003FL});
    public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers4121 = new BitSet(new long[]{0x6040200090024002L,0xF0200201F8000164L,0x01B3D5028490003FL});
    public static final BitSet FOLLOW_function_specifier_in_declaration_specifiers4144 = new BitSet(new long[]{0x6040200090024002L,0xF0200201F8000164L,0x01B3D5028490003FL});
    public static final BitSet FOLLOW_DEFAULT_in_declaration_specifiers4163 = new BitSet(new long[]{0x6040200090024002L,0xF0200201F8000164L,0x01B3D5028490003FL});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4186 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list4189 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000004000100000L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4191 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator4225 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_attributes_in_init_declarator4227 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator4231 = new BitSet(new long[]{0x0000400022080040L,0x0040A41000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_initializer_in_init_declarator4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_type_specifier4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT64_T_in_type_specifier4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT64_T_in_type_specifier4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT64_T_in_type_specifier4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT8_T_in_type_specifier4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT16_T_in_type_specifier4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT32_T_in_type_specifier4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT64_T_in_type_specifier4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4803 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4805 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4808 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_struct_or_union_specifier4879 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_struct_or_union_specifier4881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4883 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4885 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4924 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_struct_or_union_specifier4926 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4928 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list5014 = new BitSet(new long[]{0x2000200010000002L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration5045 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x1000004000100000L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration5047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_struct_declaration5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list5092 = new BitSet(new long[]{0x2000200010000002L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list5096 = new BitSet(new long[]{0x2000200010000002L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5122 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list5125 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x1000004000100000L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5127 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_struct_declarator5160 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5192 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5194 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5199 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5241 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_enum_specifier5243 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5247 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5330 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list5333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5336 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_identifier_in_enumerator5361 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator5364 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_function_specifier5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator5453 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator5481 = new BitSet(new long[]{0x0000000000000002L,0x0000042000000000L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator5483 = new BitSet(new long[]{0x0000000000000002L,0x0000042000000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5509 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier5512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier5549 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000004000100000L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier5551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5575 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500502A00L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier5577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5612 = new BitSet(new long[]{0x60402000D0024000L,0xF0200201F8000164L,0x01B3D5028490003FL});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_declarator_modifier5616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5618 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier5622 = new BitSet(new long[]{0x60402000D0024000L,0xF0200201F8000164L,0x01B3D5028490003FL});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_declarator_modifier5626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5668 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000000L,0x0100004004000000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_pointer_in_pointer5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5695 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000000L,0x0100000004000000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list5726 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000000L,0x0100000004000000L});
    public static final BitSet FOLLOW_parameter_list_in_parameter_type_list5747 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_type_list5750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_187_in_parameter_type_list5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list5777 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list5780 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8000164L,0x01B3D5028490003FL});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list5782 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration5849 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000004000100000L});
    public static final BitSet FOLLOW_declarator_in_parameter_declaration5851 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_parameter_declaration5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration5890 = new BitSet(new long[]{0x0000000000000002L,0x0000042000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5935 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_identifier_list5938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5940 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name5966 = new BitSet(new long[]{0x0000000000000002L,0x0000042000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5988 = new BitSet(new long[]{0x0000000000000000L,0x0000042000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6022 = new BitSet(new long[]{0x0000000000000000L,0x0000042000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator6024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6029 = new BitSet(new long[]{0x0000000000000002L,0x0000042000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator6043 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500502A00L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator6045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator6048 = new BitSet(new long[]{0x0000000000000002L,0x0000042000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6062 = new BitSet(new long[]{0x60402000D0024000L,0xF0200201F8000164L,0x01B3D5029490003FL});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_abstract_declarator6064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6069 = new BitSet(new long[]{0x0000000000000002L,0x0000042000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator6086 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500502A00L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator6088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator6091 = new BitSet(new long[]{0x0000000000000002L,0x0000042000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6095 = new BitSet(new long[]{0x60402000D0024000L,0xF0200201F8000164L,0x01B3D5029490003FL});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_abstract_declarator6097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6100 = new BitSet(new long[]{0x0000000000000002L,0x0000042000000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer6180 = new BitSet(new long[]{0x0000400022080040L,0x0040A41000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_initializer_list_in_initializer6182 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_initializer6184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_initializer_list6219 = new BitSet(new long[]{0x0000400022080040L,0x0040A41000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6223 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list6226 = new BitSet(new long[]{0x0000400022080040L,0x0040A41000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list6229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_initializer_list6231 = new BitSet(new long[]{0x0000400022080040L,0x0040A41000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6235 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement6324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_statement_in_statement6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_statement6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOMIC_in_atomic_statement6381 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_atomic_statement6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_labeled_statement6410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_labeled_statement6412 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement6435 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement6437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_labeled_statement6439 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement6462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_labeled_statement6464 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement6492 = new BitSet(new long[]{0x6840E000B70AC040L,0xF060A611F8890364L,0x23B3FF478CB02A3FL});
    public static final BitSet FOLLOW_block_item_in_compound_statement6505 = new BitSet(new long[]{0x6840E000B70AC040L,0xF060A611F8890364L,0x23B3FF478CB02A3FL});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_block_item6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block_item6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement6581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_expression_statement6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6612 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6614 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_expression_in_selection_statement6616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6618 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_selection_statement6620 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement6623 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_selection_statement6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement6664 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6666 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_expression_in_selection_statement6668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6670 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_selection_statement6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6718 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6720 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6724 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_iteration_statement6747 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6751 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6753 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_iteration_statement6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement6780 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6782 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x2000024500102A00L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_iteration_statement6789 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x2000024500102A00L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_iteration_statement6796 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024510102A00L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6803 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_jump_statement6912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_jump_statement6914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_jump_statement6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement6935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_jump_statement6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement6952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_jump_statement6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement6969 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x2000024500102A00L});
    public static final BitSet FOLLOW_expression_in_jump_statement6971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_jump_statement6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit7010 = new BitSet(new long[]{0x6040200090024002L,0xF0200201F8080164L,0x01B3F5028490003FL});
    public static final BitSet FOLLOW_line_directive_in_translation_unit7014 = new BitSet(new long[]{0x6040200090024002L,0xF0200201F8080164L,0x01B3F5028490003FL});
    public static final BitSet FOLLOW_declaration_in_external_declaration7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive7059 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive7063 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition7093 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000004000100000L});
    public static final BitSet FOLLOW_declarator_in_function_definition7095 = new BitSet(new long[]{0x0000000000010000L,0x0000001000000000L});
    public static final BitSet FOLLOW_attributes_in_function_definition7097 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7149 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_interface_definition_in_nesC_file7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7174 = new BitSet(new long[]{0x0000080400000000L,0x0002000000008000L});
    public static final BitSet FOLLOW_component_in_nesC_file7177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_definition7225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_interface_definition7227 = new BitSet(new long[]{0x0000000000010000L,0x0000005000000000L});
    public static final BitSet FOLLOW_type_parameters_in_interface_definition7229 = new BitSet(new long[]{0x0000000000010000L,0x0000001000000000L});
    public static final BitSet FOLLOW_attributes_in_interface_definition7232 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interface_definition7243 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8080164L,0x01B3F50284B0003FL});
    public static final BitSet FOLLOW_declaration_in_interface_definition7256 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8080164L,0x01B3F50284B0003FL});
    public static final BitSet FOLLOW_line_directive_in_interface_definition7260 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8080164L,0x01B3F50284B0003FL});
    public static final BitSet FOLLOW_RBRACE_in_interface_definition7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_parameters7320 = new BitSet(new long[]{0x2000000010000000L,0xF0000201F0000104L,0x00B3C4028010003FL});
    public static final BitSet FOLLOW_type_parameter_list_in_type_parameters7322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_GREATER_in_type_parameters7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7343 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7345 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_type_parameter_list7349 = new BitSet(new long[]{0x2000000010000000L,0xF0000201F0000104L,0x00B3C4028010003FL});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7351 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7353 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_component_kind_in_component7375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_component7377 = new BitSet(new long[]{0x0000000000010000L,0x0000041000000000L});
    public static final BitSet FOLLOW_component_parameters_in_component7379 = new BitSet(new long[]{0x0000000000010000L,0x0000001000000000L});
    public static final BitSet FOLLOW_attributes_in_component7382 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_component_specification_in_component7393 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_implementation_in_component7403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_component_kind7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7532 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_MODULE_in_component_kind7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_component_kind7562 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_CONFIGURATION_in_component_kind7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_implementation7593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_implementation_in_implementation7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_component_parameters7623 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8000164L,0x01B3F5029490003FL});
    public static final BitSet FOLLOW_component_parameter_list_in_component_parameters7625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_parameters7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7668 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_parameter_list7671 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8000164L,0x01B3F5028490003FL});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7673 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_component_parameter7699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_component_parameter7710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_component_parameter7712 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_component_parameter7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_module_implementation7737 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_module_implementation7739 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8080164L,0x01B3F5028490003FL});
    public static final BitSet FOLLOW_translation_unit_in_module_implementation7771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_module_implementation7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_configuration_implementation7863 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_configuration_implementation7865 = new BitSet(new long[]{0x0000000800000000L,0x0000002000080002L,0x0000000000300000L});
    public static final BitSet FOLLOW_configuration_element_list_in_configuration_implementation7897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_configuration_implementation7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_element_in_configuration_element_list7995 = new BitSet(new long[]{0x0000000800000002L,0x0000002000080002L,0x0000000000100000L});
    public static final BitSet FOLLOW_line_directive_in_configuration_element_list7999 = new BitSet(new long[]{0x0000000800000002L,0x0000002000080002L,0x0000000000100000L});
    public static final BitSet FOLLOW_components_in_configuration_element8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connection_in_configuration_element8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTS_in_components8076 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_component_line_in_components8078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_components8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_declaration_in_component_line8107 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_line8110 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_component_declaration_in_component_line8112 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_component_ref_in_component_declaration8138 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AS_in_component_declaration8141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_component_declaration8143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_component_ref8181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_component_ref8192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_component_ref8194 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_component_ref8196 = new BitSet(new long[]{0x2000600032080040L,0xF040A601F0000104L,0x01B3C64794102A3FL});
    public static final BitSet FOLLOW_component_argument_list_in_component_ref8198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_component_ref8201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8248 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_argument_list8251 = new BitSet(new long[]{0x2000600032080040L,0xF040A601F0000104L,0x01B3C64784102A3FL});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8253 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_expression_in_component_argument8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_component_argument8306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endpoint_in_connection8325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGN_in_connection8327 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_endpoint_in_connection8329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_connection8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8367 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_endpoint_in_connection8370 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARROW_in_connection8372 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_endpoint_in_connection8374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_connection8376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8415 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_endpoint_in_connection8418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_connection8420 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_endpoint_in_connection8422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_connection8424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENABLE_in_certificate_specification8467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8471 = new BitSet(new long[]{0x0000000000002800L,0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_certificate_specification8474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8478 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ASSUMING_in_certificate_specification8483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_FOR_in_certificate_specification8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8555 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_endpoint8557 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_argument_expression_list_in_endpoint8559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACKET_in_endpoint8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8580 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8585 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifier_path8619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifier_path8625 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8632 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification8681 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8080164L,0x01F3F50284B8003FL});
    public static final BitSet FOLLOW_uses_provides_in_component_specification8696 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8080164L,0x01F3F50284B8003FL});
    public static final BitSet FOLLOW_line_directive_in_component_specification8700 = new BitSet(new long[]{0x6040200090024000L,0xF0200201F8080164L,0x01F3F50284B8003FL});
    public static final BitSet FOLLOW_RBRACE_in_component_specification8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides8732 = new BitSet(new long[]{0x6040200090024000L,0xF0200213F8000164L,0x01B3F5028590003FL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides8753 = new BitSet(new long[]{0x6040200090024000L,0xF0200213F8000164L,0x01B3F5028590003FL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_uses_provides8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list8816 = new BitSet(new long[]{0x6040200090024000L,0xF0200203F8000164L,0x01B3F5028590003FL});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8818 = new BitSet(new long[]{0x6040200090024000L,0xF0200203F8000164L,0x01B3F50285B0003FL});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_type_in_specification_element8856 = new BitSet(new long[]{0x0000000000010800L,0x0000002000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_AS_in_specification_element8859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_specification_element8861 = new BitSet(new long[]{0x0000000000010000L,0x0000002000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_instance_parameters_in_specification_element8865 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_attributes_in_specification_element8868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_specification_element8871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOTE_in_interface_type8918 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_type8921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_interface_type8923 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_type_arguments_in_interface_type8925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_REQUIRES_in_interface_type8929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_interface_type8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_arguments8981 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_type_name_in_type_arguments8983 = new BitSet(new long[]{0x0000000040000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_type_arguments8986 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_type_name_in_type_arguments8988 = new BitSet(new long[]{0x0000000040000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_GREATER_in_type_arguments8992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_instance_parameters9016 = new BitSet(new long[]{0x60402000D0024000L,0xF0200201F8000164L,0x01B3D5028490003FL});
    public static final BitSet FOLLOW_parameter_type_list_in_instance_parameters9018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACKET_in_instance_parameters9020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributes9039 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute9059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_attribute9061 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_attribute9063 = new BitSet(new long[]{0x0000400022080040L,0x0040A41000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_initializer_list_in_attribute9065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_attribute9067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GCCATTRIBUTE_in_gcc_attributes9085 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes9087 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_gcc_attributes9089 = new BitSet(new long[]{0x0000400062080040L,0x0040A40000000000L,0x0000024510102A00L});
    public static final BitSet FOLLOW_gcc_attribute_list_in_gcc_attributes9091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes9093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_gcc_attributes9095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list9110 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_gcc_attribute_list9114 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_gcc_attribute_in_gcc_attribute_list9116 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_assignment_expression_in_gcc_attribute9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier9149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred24_nesC3241 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred24_nesC3243 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_type_name_in_synpred24_nesC3245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred24_nesC3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred25_nesC3266 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_unary_expression_in_synpred25_nesC3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred26_nesC3311 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_type_name_in_synpred26_nesC3313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred26_nesC3315 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_cast_expression_in_synpred26_nesC3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_synpred56_nesC3719 = new BitSet(new long[]{0x0200000000A41000L,0x0009500000000000L,0x0000000040000400L});
    public static final BitSet FOLLOW_set_in_synpred56_nesC3721 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred56_nesC3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred57_nesC3809 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred57_nesC3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred60_nesC3897 = new BitSet(new long[]{0x0000000000000000L,0x0000040000004000L,0x2000004000100000L});
    public static final BitSet FOLLOW_gcc_attributes_in_synpred60_nesC3899 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x2000004000100000L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred60_nesC3902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_synpred60_nesC3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_synpred61_nesC3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred65_nesC4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_synpred109_nesC4803 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_synpred109_nesC4805 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred109_nesC4808 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_struct_declaration_list_in_synpred109_nesC4810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred109_nesC4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_synpred110_nesC4846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_synpred110_nesC4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_synpred111_nesC4879 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_synpred111_nesC4881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_synpred111_nesC4883 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred111_nesC4885 = new BitSet(new long[]{0x2000200010000000L,0xF0000201F0000104L,0x01B3C4028410003FL});
    public static final BitSet FOLLOW_struct_declaration_list_in_synpred111_nesC4887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred111_nesC4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred116_nesC5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred120_nesC5157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_synpred120_nesC5160 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500102A00L});
    public static final BitSet FOLLOW_constant_expression_in_synpred120_nesC5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred123_nesC5192 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_synpred123_nesC5194 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred123_nesC5197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred123_nesC5199 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_synpred123_nesC5201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred123_nesC5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred125_nesC5239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_synpred125_nesC5241 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_synpred125_nesC5243 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred125_nesC5245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred125_nesC5247 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_synpred125_nesC5249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred125_nesC5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred135_nesC5575 = new BitSet(new long[]{0x0000400022080040L,0x0040A40000000000L,0x0000024500502A00L});
    public static final BitSet FOLLOW_constant_expression_in_synpred135_nesC5577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred135_nesC5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred145_nesC5849 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000004000100000L});
    public static final BitSet FOLLOW_declarator_in_synpred145_nesC5851 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_synpred145_nesC5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred150_nesC5988 = new BitSet(new long[]{0x0000000000000000L,0x0000042000000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred150_nesC5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred154_nesC6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred157_nesC6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred174_nesC6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred176_nesC6623 = new BitSet(new long[]{0x0840C00027088040L,0x0040A41000890200L,0x22000A4508102A00L});
    public static final BitSet FOLLOW_statement_in_synpred176_nesC6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_synpred189_nesC7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_synpred192_nesC7149 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_interface_definition_in_synpred192_nesC7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_synpred208_nesC7593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred222_nesC8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endpoint_in_synpred223_nesC8325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred223_nesC8327 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_endpoint_in_synpred223_nesC8329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_synpred223_nesC8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_synpred225_nesC8367 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_endpoint_in_synpred225_nesC8370 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARROW_in_synpred225_nesC8372 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_endpoint_in_synpred225_nesC8374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_synpred225_nesC8376 = new BitSet(new long[]{0x0000000000000002L});

}