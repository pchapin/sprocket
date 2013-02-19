// $ANTLR 3.4 nesC.g 2012-10-01 05:57:53

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADDRESS_OF", "AMP", "AND", "ARGUMENT_LIST", "ARRAY_ELEMENT_SELECTION", "ARROW", "AS", "ASSIGN", "ASSUMING", "ASYNC", "ATOMIC", "ATTRIBUTE", "AUTO", "BITANDASSIGN", "BITCOMPLEMENT", "BITOR", "BITORASSIGN", "BITXOR", "BITXORASSIGN", "BREAK", "CALL", "CASE", "CAST", "CHAR", "CHARACTER_LITERAL", "COMMA", "COMMAND", "COMMENT1", "COMMENT2", "COMPONENT", "COMPONENTS", "COMPONENT_ARGUMENTS", "COMPONENT_DECLARATION", "COMPONENT_INSTANTIATION", "COMPOUND_STATEMENT", "CONFIGURATION", "CONNECTION", "CONST", "CONSTANT", "CONTINUE", "DECLARATION", "DECLARATOR", "DECLARATOR_ARRAY_MODIFIER", "DECLARATOR_LIST", "DECLARATOR_PARAMETER_LIST_MODIFIER", "DEC_NUMBER", "DEFAULT", "DEREFERENCE", "DIGIT", "DIVASSIGN", "DIVIDE", "DO", "DOT", "DUTY", "DYNAMIC_IDENTIFIER_PATH", "ELSE", "ENABLE", "ENUM", "ENUMERATOR", "EQUAL", "EVENT", "EXTERN", "FILE", "FOR", "FOR_CONDITION", "FOR_INITIALIZE", "FOR_ITERATION", "FUNCTION_DEFINITION", "GENERIC", "GOTO", "GREATER", "GREATEREQUAL", "HASH", "HEX_DIGIT", "HEX_NUMBER", "IDENTIFIER_PATH", "IF", "IMPLEMENTATION", "INITIALIZER_LIST", "INIT_DECLARATOR", "INLINE", "INT", "INT16_T", "INT32_T", "INT64_T", "INT8_T", "INTERFACE", "INTERFACE_TYPE", "LABELED_STATEMENT", "LBRACE", "LBRACKET", "LESS", "LESSEQUAL", "LINE_DIRECTIVE", "LONG", "LPARENS", "LSHIFT", "LSHIFTASSIGN", "MINUS", "MINUSASSIGN", "MINUSMINUS", "MODASSIGN", "MODULE", "MODULUS", "MULASSIGN", "NEW", "NORACE", "NOT", "NOTEQUAL", "NULL", "NUMBER", "NUMBER_PREFIX", "NUMBER_SUFFIX", "NXLE_UINT16_T", "NXLE_UINT32_T", "NXLE_UINT64_T", "NXLE_UINT8_T", "NX_STRUCT", "NX_UINT16_T", "NX_UINT32_T", "NX_UINT64_T", "NX_UINT8_T", "NX_UNION", "OR", "PARAMETER", "PARAMETER_LIST", "PLUS", "PLUSASSIGN", "PLUSPLUS", "POINTER_QUALIFIER", "POST", "POSTFIX_EXPRESSION", "POST_DECREMENT", "POST_INCREMENT", "PRE_DECREMENT", "PRE_INCREMENT", "PROVIDES", "RAW_IDENTIFIER", "RBRACE", "RBRACKET", "REGISTER", "REMOTE", "REQUIRES", "RESTRICT", "RETURN", "RPARENS", "RSHIFT", "RSHIFTASSIGN", "SHORT", "SIGNAL", "SIGNED", "SIZEOF", "SIZEOF_EXPRESSION", "SIZEOF_TYPE", "SPECIFICATION", "STAR", "STATEMENT", "STATIC", "STRING_LITERAL", "STRUCT", "SWITCH", "TASK", "TYPEDEF", "UINT16_T", "UINT32_T", "UINT64_T", "UINT8_T", "UNARY_MINUS", "UNARY_PLUS", "UNION", "UNSIGNED", "USES", "VOID", "VOLATILE", "WHILE", "WHITESPACE", "'...'", "':'", "';'", "'<-'", "'?'"
    };

    public static final int EOF=-1;
    public static final int T__181=181;
    public static final int T__182=182;
    public static final int T__183=183;
    public static final int T__184=184;
    public static final int T__185=185;
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
    public static final int DUTY=58;
    public static final int DYNAMIC_IDENTIFIER_PATH=59;
    public static final int ELSE=60;
    public static final int ENABLE=61;
    public static final int ENUM=62;
    public static final int ENUMERATOR=63;
    public static final int EQUAL=64;
    public static final int EVENT=65;
    public static final int EXTERN=66;
    public static final int FILE=67;
    public static final int FOR=68;
    public static final int FOR_CONDITION=69;
    public static final int FOR_INITIALIZE=70;
    public static final int FOR_ITERATION=71;
    public static final int FUNCTION_DEFINITION=72;
    public static final int GENERIC=73;
    public static final int GOTO=74;
    public static final int GREATER=75;
    public static final int GREATEREQUAL=76;
    public static final int HASH=77;
    public static final int HEX_DIGIT=78;
    public static final int HEX_NUMBER=79;
    public static final int IDENTIFIER_PATH=80;
    public static final int IF=81;
    public static final int IMPLEMENTATION=82;
    public static final int INITIALIZER_LIST=83;
    public static final int INIT_DECLARATOR=84;
    public static final int INLINE=85;
    public static final int INT=86;
    public static final int INT16_T=87;
    public static final int INT32_T=88;
    public static final int INT64_T=89;
    public static final int INT8_T=90;
    public static final int INTERFACE=91;
    public static final int INTERFACE_TYPE=92;
    public static final int LABELED_STATEMENT=93;
    public static final int LBRACE=94;
    public static final int LBRACKET=95;
    public static final int LESS=96;
    public static final int LESSEQUAL=97;
    public static final int LINE_DIRECTIVE=98;
    public static final int LONG=99;
    public static final int LPARENS=100;
    public static final int LSHIFT=101;
    public static final int LSHIFTASSIGN=102;
    public static final int MINUS=103;
    public static final int MINUSASSIGN=104;
    public static final int MINUSMINUS=105;
    public static final int MODASSIGN=106;
    public static final int MODULE=107;
    public static final int MODULUS=108;
    public static final int MULASSIGN=109;
    public static final int NEW=110;
    public static final int NORACE=111;
    public static final int NOT=112;
    public static final int NOTEQUAL=113;
    public static final int NULL=114;
    public static final int NUMBER=115;
    public static final int NUMBER_PREFIX=116;
    public static final int NUMBER_SUFFIX=117;
    public static final int NXLE_UINT16_T=118;
    public static final int NXLE_UINT32_T=119;
    public static final int NXLE_UINT64_T=120;
    public static final int NXLE_UINT8_T=121;
    public static final int NX_STRUCT=122;
    public static final int NX_UINT16_T=123;
    public static final int NX_UINT32_T=124;
    public static final int NX_UINT64_T=125;
    public static final int NX_UINT8_T=126;
    public static final int NX_UNION=127;
    public static final int OR=128;
    public static final int PARAMETER=129;
    public static final int PARAMETER_LIST=130;
    public static final int PLUS=131;
    public static final int PLUSASSIGN=132;
    public static final int PLUSPLUS=133;
    public static final int POINTER_QUALIFIER=134;
    public static final int POST=135;
    public static final int POSTFIX_EXPRESSION=136;
    public static final int POST_DECREMENT=137;
    public static final int POST_INCREMENT=138;
    public static final int PRE_DECREMENT=139;
    public static final int PRE_INCREMENT=140;
    public static final int PROVIDES=141;
    public static final int RAW_IDENTIFIER=142;
    public static final int RBRACE=143;
    public static final int RBRACKET=144;
    public static final int REGISTER=145;
    public static final int REMOTE=146;
    public static final int REQUIRES=147;
    public static final int RESTRICT=148;
    public static final int RETURN=149;
    public static final int RPARENS=150;
    public static final int RSHIFT=151;
    public static final int RSHIFTASSIGN=152;
    public static final int SHORT=153;
    public static final int SIGNAL=154;
    public static final int SIGNED=155;
    public static final int SIZEOF=156;
    public static final int SIZEOF_EXPRESSION=157;
    public static final int SIZEOF_TYPE=158;
    public static final int SPECIFICATION=159;
    public static final int STAR=160;
    public static final int STATEMENT=161;
    public static final int STATIC=162;
    public static final int STRING_LITERAL=163;
    public static final int STRUCT=164;
    public static final int SWITCH=165;
    public static final int TASK=166;
    public static final int TYPEDEF=167;
    public static final int UINT16_T=168;
    public static final int UINT32_T=169;
    public static final int UINT64_T=170;
    public static final int UINT8_T=171;
    public static final int UNARY_MINUS=172;
    public static final int UNARY_PLUS=173;
    public static final int UNION=174;
    public static final int UNSIGNED=175;
    public static final int USES=176;
    public static final int VOID=177;
    public static final int VOLATILE=178;
    public static final int WHILE=179;
    public static final int WHITESPACE=180;

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
        this.state.ruleMemo = new HashMap[341+1];
         

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

        // The following two magic methods, together with the @rulecatch section below cause the
        // parser to exit immediately with an exception when an error is encountered. This is useful
        // for testing but is probably not desired in a production system. I'm not sure right now
        // how to provide both behaviors in the same executable. I'll figure that out later!
        //
        protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
            throws RecognitionException
        {
            throw new MismatchedTokenException(ttype, input);
        }
        
        public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
            throws RecognitionException
        {
            throw e;
        }


    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expression"
    // nesC.g:240:1: primary_expression : ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression );
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

            // nesC.g:241:5: ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression )
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
                    // nesC.g:241:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression2710);
                    identifier1=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier1.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:242:10: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT2=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_primary_expression2721); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT2_tree = 
                    (Object)adaptor.create(CONSTANT2)
                    ;
                    adaptor.addChild(root_0, CONSTANT2_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:243:10: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primary_expression2732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL3_tree = 
                    (Object)adaptor.create(STRING_LITERAL3)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL3_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:244:10: CHARACTER_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARACTER_LITERAL4=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_primary_expression2743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARACTER_LITERAL4_tree = 
                    (Object)adaptor.create(CHARACTER_LITERAL4)
                    ;
                    adaptor.addChild(root_0, CHARACTER_LITERAL4_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:245:10: '(' expression ')'
                    {
                    char_literal5=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_primary_expression2754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_primary_expression2756);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

                    char_literal7=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_primary_expression2758); if (state.failed) return retval; 
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
                    // 245:29: -> expression
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:253:1: postfix_expression : ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) ;
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

            // nesC.g:254:5: ( ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) )
            // nesC.g:254:10: ( call_kind )? primary_expression ( postfix_expression_modifier )*
            {
            // nesC.g:254:10: ( call_kind )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CALL||LA2_0==POST||LA2_0==SIGNAL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // nesC.g:254:10: call_kind
                    {
                    pushFollow(FOLLOW_call_kind_in_postfix_expression2783);
                    call_kind8=call_kind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_call_kind.add(call_kind8.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_primary_expression_in_postfix_expression2786);
            primary_expression9=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression9.getTree());

            // nesC.g:254:40: ( postfix_expression_modifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARROW||LA3_0==DOT||LA3_0==LBRACKET||LA3_0==LPARENS||LA3_0==MINUSMINUS||LA3_0==PLUSPLUS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // nesC.g:254:40: postfix_expression_modifier
            	    {
            	    pushFollow(FOLLOW_postfix_expression_modifier_in_postfix_expression2788);
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
            // elements: call_kind, primary_expression, postfix_expression_modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 255:13: -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
            {
                // nesC.g:255:16: ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION")
                , root_1);

                // nesC.g:255:37: ( call_kind )?
                if ( stream_call_kind.hasNext() ) {
                    adaptor.addChild(root_1, stream_call_kind.nextTree());

                }
                stream_call_kind.reset();

                adaptor.addChild(root_1, stream_primary_expression.nextTree());

                // nesC.g:255:67: ( postfix_expression_modifier )*
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:257:1: postfix_expression_modifier : ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' );
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

            // nesC.g:258:5: ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' )
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
                    // nesC.g:258:9: '[' expression ']'
                    {
                    char_literal11=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_postfix_expression_modifier2829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal11);


                    pushFollow(FOLLOW_expression_in_postfix_expression_modifier2831);
                    expression12=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression12.getTree());

                    char_literal13=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_postfix_expression_modifier2833); if (state.failed) return retval; 
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
                    // 258:28: -> ^( ARRAY_ELEMENT_SELECTION expression )
                    {
                        // nesC.g:258:31: ^( ARRAY_ELEMENT_SELECTION expression )
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
                    // nesC.g:259:9: '(' ( argument_expression_list )? ')'
                    {
                    char_literal14=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression_modifier2851); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal14);


                    // nesC.g:259:13: ( argument_expression_list )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AMP||LA4_0==BITCOMPLEMENT||LA4_0==CALL||LA4_0==CHARACTER_LITERAL||LA4_0==CONSTANT||LA4_0==LPARENS||LA4_0==MINUS||LA4_0==MINUSMINUS||LA4_0==NOT||LA4_0==PLUS||LA4_0==PLUSPLUS||LA4_0==POST||LA4_0==RAW_IDENTIFIER||LA4_0==SIGNAL||LA4_0==SIZEOF||LA4_0==STAR||LA4_0==STRING_LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // nesC.g:259:13: argument_expression_list
                            {
                            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression_modifier2853);
                            argument_expression_list15=argument_expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list15.getTree());

                            }
                            break;

                    }


                    char_literal16=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression_modifier2856); if (state.failed) return retval; 
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
                    // 259:43: -> ^( ARGUMENT_LIST ( argument_expression_list )? )
                    {
                        // nesC.g:259:46: ^( ARGUMENT_LIST ( argument_expression_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST")
                        , root_1);

                        // nesC.g:259:62: ( argument_expression_list )?
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
                    // nesC.g:260:9: '.' identifier
                    {
                    char_literal17=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression_modifier2875); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal17);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2877);
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
                    // 260:24: -> ^( '.' identifier )
                    {
                        // nesC.g:260:27: ^( '.' identifier )
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
                    // nesC.g:261:9: '->' identifier
                    {
                    string_literal19=(Token)match(input,ARROW,FOLLOW_ARROW_in_postfix_expression_modifier2895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal19);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2897);
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
                    // 261:25: -> ^( '->' identifier )
                    {
                        // nesC.g:261:28: ^( '->' identifier )
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
                    // nesC.g:262:9: '++'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal21=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfix_expression_modifier2915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = 
                    (Object)adaptor.create(string_literal21)
                    ;
                    adaptor.addChild(root_0, string_literal21_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:263:9: '--'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal22=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfix_expression_modifier2925); if (state.failed) return retval;
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:265:1: call_kind : ( CALL | POST | SIGNAL );
    public final nesCParser.call_kind_return call_kind() throws RecognitionException {
        nesCParser.call_kind_return retval = new nesCParser.call_kind_return();
        retval.start = input.LT(1);

        int call_kind_StartIndex = input.index();

        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // nesC.g:266:5: ( CALL | POST | SIGNAL )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:270:1: argument_expression_list : assignment_expression ( ',' ! assignment_expression )* ;
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

            // nesC.g:271:5: ( assignment_expression ( ',' ! assignment_expression )* )
            // nesC.g:271:10: assignment_expression ( ',' ! assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list2985);
            assignment_expression24=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression24.getTree());

            // nesC.g:271:32: ( ',' ! assignment_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // nesC.g:271:33: ',' ! assignment_expression
            	    {
            	    char_literal25=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list2988); if (state.failed) return retval;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list2991);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:273:1: unary_expression : ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression );
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

            // nesC.g:274:5: ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression )
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
                    // nesC.g:274:10: '++' unary_expression
                    {
                    string_literal27=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unary_expression3012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(string_literal27);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3014);
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
                    // 274:32: -> ^( PRE_INCREMENT unary_expression )
                    {
                        // nesC.g:274:35: ^( PRE_INCREMENT unary_expression )
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
                    // nesC.g:275:10: '--' unary_expression
                    {
                    string_literal29=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unary_expression3033); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUSMINUS.add(string_literal29);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3035);
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
                    // 275:32: -> ^( PRE_DECREMENT unary_expression )
                    {
                        // nesC.g:275:35: ^( PRE_DECREMENT unary_expression )
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
                    // nesC.g:276:10: '&' cast_expression
                    {
                    char_literal31=(Token)match(input,AMP,FOLLOW_AMP_in_unary_expression3054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMP.add(char_literal31);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3057);
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
                    // 276:32: -> ^( ADDRESS_OF cast_expression )
                    {
                        // nesC.g:276:35: ^( ADDRESS_OF cast_expression )
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
                    // nesC.g:277:10: '*' cast_expression
                    {
                    char_literal33=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression3081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal33);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3084);
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
                    // 277:32: -> ^( DEREFERENCE cast_expression )
                    {
                        // nesC.g:277:35: ^( DEREFERENCE cast_expression )
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
                    // nesC.g:278:10: '+' cast_expression
                    {
                    char_literal35=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression3107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal35);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3110);
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
                    // 278:32: -> ^( UNARY_PLUS cast_expression )
                    {
                        // nesC.g:278:35: ^( UNARY_PLUS cast_expression )
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
                    // nesC.g:279:10: '-' cast_expression
                    {
                    char_literal37=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression3134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal37);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3137);
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
                    // 279:32: -> ^( UNARY_MINUS cast_expression )
                    {
                        // nesC.g:279:35: ^( UNARY_MINUS cast_expression )
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
                    // nesC.g:280:10: ( '~' ^| '!' ^) cast_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:280:10: ( '~' ^| '!' ^)
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
                            // nesC.g:280:11: '~' ^
                            {
                            char_literal39=(Token)match(input,BITCOMPLEMENT,FOLLOW_BITCOMPLEMENT_in_unary_expression3161); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal39_tree = 
                            (Object)adaptor.create(char_literal39)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal39_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:280:18: '!' ^
                            {
                            char_literal40=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression3166); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal40_tree = 
                            (Object)adaptor.create(char_literal40)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal40_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cast_expression_in_unary_expression3170);
                    cast_expression41=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression41.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:281:10: SIZEOF '(' type_name ')'
                    {
                    SIZEOF42=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF42);


                    char_literal43=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_unary_expression3183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal43);


                    pushFollow(FOLLOW_type_name_in_unary_expression3185);
                    type_name44=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name44.getTree());

                    char_literal45=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_unary_expression3187); if (state.failed) return retval; 
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
                    // 281:35: -> ^( SIZEOF_TYPE type_name )
                    {
                        // nesC.g:281:38: ^( SIZEOF_TYPE type_name )
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
                    // nesC.g:282:10: SIZEOF unary_expression
                    {
                    SIZEOF46=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression3206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF46);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression3208);
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
                    // 282:35: -> ^( SIZEOF_EXPRESSION unary_expression )
                    {
                        // nesC.g:282:38: ^( SIZEOF_EXPRESSION unary_expression )
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
                    // nesC.g:283:10: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression3228);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:289:1: cast_expression : ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression );
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

            // nesC.g:290:5: ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression )
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
                    // nesC.g:290:10: '(' type_name ')' cast_expression
                    {
                    char_literal49=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_cast_expression3251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal49);


                    pushFollow(FOLLOW_type_name_in_cast_expression3253);
                    type_name50=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name50.getTree());

                    char_literal51=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_cast_expression3255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal51);


                    pushFollow(FOLLOW_cast_expression_in_cast_expression3257);
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
                    // 290:44: -> ^( CAST cast_expression type_name )
                    {
                        // nesC.g:290:47: ^( CAST cast_expression type_name )
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
                    // nesC.g:291:10: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression3278);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:293:1: multiplicative_expression : cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* ;
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

            // nesC.g:294:5: ( cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )* )
            // nesC.g:294:10: cast_expression ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3297);
            cast_expression54=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression54.getTree());

            // nesC.g:294:26: ( ( '*' ^| '/' ^| '%' ^) cast_expression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DIVIDE||LA11_0==MODULUS||LA11_0==STAR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // nesC.g:294:28: ( '*' ^| '/' ^| '%' ^) cast_expression
            	    {
            	    // nesC.g:294:28: ( '*' ^| '/' ^| '%' ^)
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
            	            // nesC.g:294:29: '*' ^
            	            {
            	            char_literal55=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression3302); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal55_tree = 
            	            (Object)adaptor.create(char_literal55)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal55_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:294:36: '/' ^
            	            {
            	            char_literal56=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expression3307); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal56_tree = 
            	            (Object)adaptor.create(char_literal56)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal56_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:294:43: '%' ^
            	            {
            	            char_literal57=(Token)match(input,MODULUS,FOLLOW_MODULUS_in_multiplicative_expression3312); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal57_tree = 
            	            (Object)adaptor.create(char_literal57)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal57_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3316);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:296:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
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

            // nesC.g:297:5: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
            // nesC.g:297:10: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3337);
            multiplicative_expression59=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression59.getTree());

            // nesC.g:297:36: ( ( '+' ^| '-' ^) multiplicative_expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // nesC.g:297:38: ( '+' ^| '-' ^) multiplicative_expression
            	    {
            	    // nesC.g:297:38: ( '+' ^| '-' ^)
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
            	            // nesC.g:297:39: '+' ^
            	            {
            	            char_literal60=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression3342); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal60_tree = 
            	            (Object)adaptor.create(char_literal60)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:297:46: '-' ^
            	            {
            	            char_literal61=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression3347); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal61_tree = 
            	            (Object)adaptor.create(char_literal61)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal61_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3351);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:299:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
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

            // nesC.g:300:5: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // nesC.g:300:10: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression3372);
            additive_expression63=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression63.getTree());

            // nesC.g:300:30: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LSHIFT||LA15_0==RSHIFT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // nesC.g:300:32: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // nesC.g:300:32: ( '<<' ^| '>>' ^)
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
            	            // nesC.g:300:33: '<<' ^
            	            {
            	            string_literal64=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression3377); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal64_tree = 
            	            (Object)adaptor.create(string_literal64)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:300:41: '>>' ^
            	            {
            	            string_literal65=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression3382); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal65_tree = 
            	            (Object)adaptor.create(string_literal65)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal65_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression3386);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:302:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
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

            // nesC.g:303:5: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // nesC.g:303:10: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression3407);
            shift_expression67=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression67.getTree());

            // nesC.g:303:27: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= GREATER && LA17_0 <= GREATEREQUAL)||(LA17_0 >= LESS && LA17_0 <= LESSEQUAL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // nesC.g:303:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // nesC.g:303:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
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
            	            // nesC.g:303:30: '<' ^
            	            {
            	            char_literal68=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression3412); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal68_tree = 
            	            (Object)adaptor.create(char_literal68)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal68_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:303:37: '>' ^
            	            {
            	            char_literal69=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression3417); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal69_tree = 
            	            (Object)adaptor.create(char_literal69)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal69_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // nesC.g:303:44: '<=' ^
            	            {
            	            string_literal70=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relational_expression3422); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal70_tree = 
            	            (Object)adaptor.create(string_literal70)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal70_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // nesC.g:303:52: '>=' ^
            	            {
            	            string_literal71=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relational_expression3427); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal71_tree = 
            	            (Object)adaptor.create(string_literal71)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal71_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression3431);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:305:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
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

            // nesC.g:306:5: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // nesC.g:306:10: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression3452);
            relational_expression73=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression73.getTree());

            // nesC.g:306:32: ( ( '==' ^| '!=' ^) relational_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EQUAL||LA19_0==NOTEQUAL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // nesC.g:306:34: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // nesC.g:306:34: ( '==' ^| '!=' ^)
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
            	            // nesC.g:306:35: '==' ^
            	            {
            	            string_literal74=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equality_expression3457); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal74_tree = 
            	            (Object)adaptor.create(string_literal74)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // nesC.g:306:43: '!=' ^
            	            {
            	            string_literal75=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equality_expression3462); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal75_tree = 
            	            (Object)adaptor.create(string_literal75)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal75_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression3466);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:308:1: and_expression : equality_expression ( '&' ^ equality_expression )* ;
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

            // nesC.g:309:5: ( equality_expression ( '&' ^ equality_expression )* )
            // nesC.g:309:10: equality_expression ( '&' ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_and_expression3487);
            equality_expression77=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression77.getTree());

            // nesC.g:309:30: ( '&' ^ equality_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AMP) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // nesC.g:309:32: '&' ^ equality_expression
            	    {
            	    char_literal78=(Token)match(input,AMP,FOLLOW_AMP_in_and_expression3491); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal78_tree = 
            	    (Object)adaptor.create(char_literal78)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal78_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_and_expression3494);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:311:1: xor_expression : and_expression ( '^' ^ and_expression )* ;
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

            // nesC.g:312:5: ( and_expression ( '^' ^ and_expression )* )
            // nesC.g:312:10: and_expression ( '^' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_xor_expression3515);
            and_expression80=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression80.getTree());

            // nesC.g:312:25: ( '^' ^ and_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==BITXOR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // nesC.g:312:27: '^' ^ and_expression
            	    {
            	    char_literal81=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_xor_expression3519); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal81_tree = 
            	    (Object)adaptor.create(char_literal81)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal81_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_xor_expression3522);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:314:1: or_expression : xor_expression ( '|' ^ xor_expression )* ;
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

            // nesC.g:315:5: ( xor_expression ( '|' ^ xor_expression )* )
            // nesC.g:315:10: xor_expression ( '|' ^ xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expression_in_or_expression3543);
            xor_expression83=xor_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression83.getTree());

            // nesC.g:315:25: ( '|' ^ xor_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BITOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // nesC.g:315:27: '|' ^ xor_expression
            	    {
            	    char_literal84=(Token)match(input,BITOR,FOLLOW_BITOR_in_or_expression3547); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal84_tree = 
            	    (Object)adaptor.create(char_literal84)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal84_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_xor_expression_in_or_expression3550);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:317:1: logical_and_expression : or_expression ( '&&' ^ or_expression )* ;
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

            // nesC.g:318:5: ( or_expression ( '&&' ^ or_expression )* )
            // nesC.g:318:10: or_expression ( '&&' ^ or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_expression_in_logical_and_expression3571);
            or_expression86=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression86.getTree());

            // nesC.g:318:24: ( '&&' ^ or_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // nesC.g:318:26: '&&' ^ or_expression
            	    {
            	    string_literal87=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression3575); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal87_tree = 
            	    (Object)adaptor.create(string_literal87)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal87_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression3578);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:320:1: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
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

            // nesC.g:321:5: ( logical_and_expression ( '||' ^ logical_and_expression )* )
            // nesC.g:321:10: logical_and_expression ( '||' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3599);
            logical_and_expression89=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression89.getTree());

            // nesC.g:321:33: ( '||' ^ logical_and_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // nesC.g:321:35: '||' ^ logical_and_expression
            	    {
            	    string_literal90=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression3603); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal90_tree = 
            	    (Object)adaptor.create(string_literal90)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal90_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3606);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:323:1: conditional_expression : logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? ;
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

            // nesC.g:324:5: ( logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? )
            // nesC.g:324:10: logical_or_expression ( '?' ^ expression ':' ! conditional_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression3627);
            logical_or_expression92=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression92.getTree());

            // nesC.g:324:32: ( '?' ^ expression ':' ! conditional_expression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==185) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // nesC.g:324:33: '?' ^ expression ':' ! conditional_expression
                    {
                    char_literal93=(Token)match(input,185,FOLLOW_185_in_conditional_expression3630); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal93_tree = 
                    (Object)adaptor.create(char_literal93)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal93_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_conditional_expression3633);
                    expression94=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression94.getTree());

                    char_literal95=(Token)match(input,182,FOLLOW_182_in_conditional_expression3635); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression3638);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:326:1: assignment_expression : ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression );
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

            // nesC.g:327:5: ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression )
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
                    // nesC.g:327:10: unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_assignment_expression3659);
                    unary_expression97=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression97.getTree());

                    // nesC.g:327:27: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^)
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
                            // nesC.g:327:28: '=' ^
                            {
                            char_literal98=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expression3662); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal98_tree = 
                            (Object)adaptor.create(char_literal98)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal98_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // nesC.g:327:35: '*=' ^
                            {
                            string_literal99=(Token)match(input,MULASSIGN,FOLLOW_MULASSIGN_in_assignment_expression3667); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal99_tree = 
                            (Object)adaptor.create(string_literal99)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal99_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // nesC.g:327:43: '/=' ^
                            {
                            string_literal100=(Token)match(input,DIVASSIGN,FOLLOW_DIVASSIGN_in_assignment_expression3672); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal100_tree = 
                            (Object)adaptor.create(string_literal100)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal100_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // nesC.g:327:51: '%=' ^
                            {
                            string_literal101=(Token)match(input,MODASSIGN,FOLLOW_MODASSIGN_in_assignment_expression3677); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal101_tree = 
                            (Object)adaptor.create(string_literal101)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // nesC.g:327:59: '+=' ^
                            {
                            string_literal102=(Token)match(input,PLUSASSIGN,FOLLOW_PLUSASSIGN_in_assignment_expression3682); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal102_tree = 
                            (Object)adaptor.create(string_literal102)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal102_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // nesC.g:327:67: '-=' ^
                            {
                            string_literal103=(Token)match(input,MINUSASSIGN,FOLLOW_MINUSASSIGN_in_assignment_expression3687); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal103_tree = 
                            (Object)adaptor.create(string_literal103)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
                            }

                            }
                            break;
                        case 7 :
                            // nesC.g:327:75: '<<=' ^
                            {
                            string_literal104=(Token)match(input,LSHIFTASSIGN,FOLLOW_LSHIFTASSIGN_in_assignment_expression3692); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal104_tree = 
                            (Object)adaptor.create(string_literal104)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal104_tree, root_0);
                            }

                            }
                            break;
                        case 8 :
                            // nesC.g:327:84: '>>=' ^
                            {
                            string_literal105=(Token)match(input,RSHIFTASSIGN,FOLLOW_RSHIFTASSIGN_in_assignment_expression3697); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal105_tree = 
                            (Object)adaptor.create(string_literal105)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal105_tree, root_0);
                            }

                            }
                            break;
                        case 9 :
                            // nesC.g:327:93: '&=' ^
                            {
                            string_literal106=(Token)match(input,BITANDASSIGN,FOLLOW_BITANDASSIGN_in_assignment_expression3702); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal106_tree = 
                            (Object)adaptor.create(string_literal106)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                            }

                            }
                            break;
                        case 10 :
                            // nesC.g:327:101: '^=' ^
                            {
                            string_literal107=(Token)match(input,BITXORASSIGN,FOLLOW_BITXORASSIGN_in_assignment_expression3707); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal107_tree = 
                            (Object)adaptor.create(string_literal107)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal107_tree, root_0);
                            }

                            }
                            break;
                        case 11 :
                            // nesC.g:327:109: '|=' ^
                            {
                            string_literal108=(Token)match(input,BITORASSIGN,FOLLOW_BITORASSIGN_in_assignment_expression3712); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal108_tree = 
                            (Object)adaptor.create(string_literal108)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal108_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression3716);
                    assignment_expression109=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression109.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:328:10: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression3727);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:330:1: expression : assignment_expression ( ',' ^ assignment_expression )* ;
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

            // nesC.g:331:5: ( assignment_expression ( ',' ^ assignment_expression )* )
            // nesC.g:331:10: assignment_expression ( ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression3746);
            assignment_expression111=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression111.getTree());

            // nesC.g:331:32: ( ',' ^ assignment_expression )*
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
            	    // nesC.g:331:33: ',' ^ assignment_expression
            	    {
            	    char_literal112=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression3749); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal112_tree = 
            	    (Object)adaptor.create(char_literal112)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal112_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression3752);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:333:1: constant_expression : conditional_expression ;
    public final nesCParser.constant_expression_return constant_expression() throws RecognitionException {
        nesCParser.constant_expression_return retval = new nesCParser.constant_expression_return();
        retval.start = input.LT(1);

        int constant_expression_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.conditional_expression_return conditional_expression114 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // nesC.g:334:5: ( conditional_expression )
            // nesC.g:334:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression3773);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:352:1: declaration : ( declaration_specifiers ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers init_declarator_list ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) );
    public final nesCParser.declaration_return declaration() throws RecognitionException {
        declaration_stack.push(new declaration_scope());
        nesCParser.declaration_return retval = new nesCParser.declaration_return();
        retval.start = input.LT(1);

        int declaration_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal117=null;
        Token TYPEDEF119=null;
        Token char_literal122=null;
        nesCParser.declaration_specifiers_return declaration_specifiers115 =null;

        nesCParser.init_declarator_list_return init_declarator_list116 =null;

        nesCParser.function_definition_return function_definition118 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers120 =null;

        nesCParser.init_declarator_list_return init_declarator_list121 =null;


        Object char_literal117_tree=null;
        Object TYPEDEF119_tree=null;
        Object char_literal122_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // nesC.g:355:5: ( declaration_specifiers ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers init_declarator_list ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) )
            int alt30=3;
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
                int LA30_1 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA30_2 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA30_3 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA30_4 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA30_5 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA30_6 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA30_7 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA30_8 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 8, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA30_9 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 9, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA30_10 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA30_11 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 11, input);

                    throw nvae;

                }
                }
                break;
            case INT64_T:
                {
                int LA30_12 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 12, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA30_13 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 13, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA30_14 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 14, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA30_15 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 15, input);

                    throw nvae;

                }
                }
                break;
            case UINT64_T:
                {
                int LA30_16 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 16, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA30_17 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 17, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA30_18 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 18, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA30_19 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 19, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT64_T:
                {
                int LA30_20 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 20, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT8_T:
                {
                int LA30_21 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 21, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT16_T:
                {
                int LA30_22 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 22, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT32_T:
                {
                int LA30_23 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 23, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA30_24 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 24, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA30_25 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 25, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA30_26 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 26, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA30_27 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 27, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA30_28 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 28, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA30_29 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 29, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA30_30 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 30, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA30_31 = input.LA(2);

                if ( (synpred59_nesC()) ) {
                    alt30=1;
                }
                else if ( (synpred60_nesC()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 31, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // nesC.g:355:10: declaration_specifiers ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3836);
                    declaration_specifiers115=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers115.getTree());

                    // nesC.g:359:33: ( init_declarator_list )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==LPARENS||LA29_0==RAW_IDENTIFIER||LA29_0==STAR) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // nesC.g:359:33: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration3838);
                            init_declarator_list116=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list116.getTree());

                            }
                            break;

                    }


                    char_literal117=(Token)match(input,183,FOLLOW_183_in_declaration3841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal117);


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
                    // 366:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // nesC.g:366:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:366:54: ( init_declarator_list )?
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
                    // nesC.g:368:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration3903);
                    function_definition118=function_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_definition.add(function_definition118.getTree());

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
                    // 371:30: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // nesC.g:371:33: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // nesC.g:371:47: ^( FUNCTION_DEFINITION function_definition )
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
                    // nesC.g:374:10: TYPEDEF declaration_specifiers init_declarator_list ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF119=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration3948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF119);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3950);
                    declaration_specifiers120=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers120.getTree());

                    pushFollow(FOLLOW_init_declarator_list_in_declaration3952);
                    init_declarator_list121=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list121.getTree());

                    char_literal122=(Token)match(input,183,FOLLOW_183_in_declaration3954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal122);


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
                    // 384:14: -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                    {
                        // nesC.g:384:17: ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:386:1: declaration_specifiers : ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+ ;
    public final nesCParser.declaration_specifiers_return declaration_specifiers() throws RecognitionException {
        nesCParser.declaration_specifiers_return retval = new nesCParser.declaration_specifiers_return();
        retval.start = input.LT(1);

        int declaration_specifiers_StartIndex = input.index();

        Object root_0 = null;

        Token DEFAULT127=null;
        nesCParser.storage_class_specifier_return storage_class_specifier123 =null;

        nesCParser.type_specifier_return type_specifier124 =null;

        nesCParser.type_qualifier_return type_qualifier125 =null;

        nesCParser.function_specifier_return function_specifier126 =null;


        Object DEFAULT127_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // nesC.g:387:5: ( ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+ )
            // nesC.g:387:10: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:387:10: ( storage_class_specifier | type_specifier | type_qualifier | function_specifier | DEFAULT )+
            int cnt31=0;
            loop31:
            do {
                int alt31=6;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred62_nesC()) ) {
                        alt31=2;
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
                    alt31=1;
                    }
                    break;
                case CHAR:
                case ENUM:
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
                    alt31=2;
                    }
                    break;
                case CONST:
                case RESTRICT:
                case VOLATILE:
                    {
                    alt31=3;
                    }
                    break;
                case INLINE:
                    {
                    alt31=4;
                    }
                    break;
                case DEFAULT:
                    {
                    alt31=5;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // nesC.g:387:11: storage_class_specifier
            	    {
            	    pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers4014);
            	    storage_class_specifier123=storage_class_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier123.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:388:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_declaration_specifiers4028);
            	    type_specifier124=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier124.getTree());

            	    }
            	    break;
            	case 3 :
            	    // nesC.g:389:11: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers4051);
            	    type_qualifier125=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier125.getTree());

            	    }
            	    break;
            	case 4 :
            	    // nesC.g:390:11: function_specifier
            	    {
            	    pushFollow(FOLLOW_function_specifier_in_declaration_specifiers4074);
            	    function_specifier126=function_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_specifier126.getTree());

            	    }
            	    break;
            	case 5 :
            	    // nesC.g:391:11: DEFAULT
            	    {
            	    DEFAULT127=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_declaration_specifiers4093); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DEFAULT127_tree = 
            	    (Object)adaptor.create(DEFAULT127)
            	    ;
            	    adaptor.addChild(root_0, DEFAULT127_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:397:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
    public final nesCParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
        nesCParser.init_declarator_list_return retval = new nesCParser.init_declarator_list_return();
        retval.start = input.LT(1);

        int init_declarator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal129=null;
        nesCParser.init_declarator_return init_declarator128 =null;

        nesCParser.init_declarator_return init_declarator130 =null;


        Object char_literal129_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // nesC.g:398:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // nesC.g:398:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list4116);
            init_declarator128=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator128.getTree());

            // nesC.g:398:26: ( ',' init_declarator )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // nesC.g:398:27: ',' init_declarator
            	    {
            	    char_literal129=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list4119); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal129);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list4121);
            	    init_declarator130=init_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator130.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
            // 398:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // nesC.g:398:52: ^( DECLARATOR_LIST ( init_declarator )+ )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:404:1: init_declarator : declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
    public final nesCParser.init_declarator_return init_declarator() throws RecognitionException {
        nesCParser.init_declarator_return retval = new nesCParser.init_declarator_return();
        retval.start = input.LT(1);

        int init_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal133=null;
        nesCParser.declarator_return declarator131 =null;

        nesCParser.attributes_return attributes132 =null;

        nesCParser.initializer_return initializer134 =null;


        Object char_literal133_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // nesC.g:405:5: ( declarator ( attributes )? ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // nesC.g:405:10: declarator ( attributes )? ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator4155);
            declarator131=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator131.getTree());

            // nesC.g:405:21: ( attributes )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ATTRIBUTE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // nesC.g:405:21: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_init_declarator4157);
                    attributes132=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes132.getTree());

                    }
                    break;

            }


            // nesC.g:405:33: ( '=' initializer )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ASSIGN) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // nesC.g:405:34: '=' initializer
                    {
                    char_literal133=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator4161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal133);


                    pushFollow(FOLLOW_initializer_in_init_declarator4163);
                    initializer134=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer134.getTree());

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
            // 405:52: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // nesC.g:405:55: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // nesC.g:405:84: ( initializer )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:407:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK );
    public final nesCParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        nesCParser.storage_class_specifier_return retval = new nesCParser.storage_class_specifier_return();
        retval.start = input.LT(1);

        int storage_class_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token set135=null;

        Object set135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // nesC.g:408:5: ( EXTERN | STATIC | AUTO | REGISTER | ASYNC | COMMAND | DUTY | EVENT | NORACE | TASK )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set135=(Token)input.LT(1);

            if ( input.LA(1)==ASYNC||input.LA(1)==AUTO||input.LA(1)==COMMAND||input.LA(1)==DUTY||(input.LA(1) >= EVENT && input.LA(1) <= EXTERN)||input.LA(1)==NORACE||input.LA(1)==REGISTER||input.LA(1)==STATIC||input.LA(1)==TASK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set135)
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:419:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | struct_or_union_specifier | enum_specifier | typedef_name );
    public final nesCParser.type_specifier_return type_specifier() throws RecognitionException {
        nesCParser.type_specifier_return retval = new nesCParser.type_specifier_return();
        retval.start = input.LT(1);

        int type_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token VOID136=null;
        Token CHAR137=null;
        Token SHORT138=null;
        Token INT139=null;
        Token LONG140=null;
        Token SIGNED141=null;
        Token UNSIGNED142=null;
        Token INT8_T143=null;
        Token INT16_T144=null;
        Token INT32_T145=null;
        Token INT64_T146=null;
        Token UINT8_T147=null;
        Token UINT16_T148=null;
        Token UINT32_T149=null;
        Token UINT64_T150=null;
        Token NX_UINT8_T151=null;
        Token NX_UINT16_T152=null;
        Token NX_UINT32_T153=null;
        Token NX_UINT64_T154=null;
        Token NXLE_UINT8_T155=null;
        Token NXLE_UINT16_T156=null;
        Token NXLE_UINT32_T157=null;
        Token NXLE_UINT64_T158=null;
        nesCParser.struct_or_union_specifier_return struct_or_union_specifier159 =null;

        nesCParser.enum_specifier_return enum_specifier160 =null;

        nesCParser.typedef_name_return typedef_name161 =null;


        Object VOID136_tree=null;
        Object CHAR137_tree=null;
        Object SHORT138_tree=null;
        Object INT139_tree=null;
        Object LONG140_tree=null;
        Object SIGNED141_tree=null;
        Object UNSIGNED142_tree=null;
        Object INT8_T143_tree=null;
        Object INT16_T144_tree=null;
        Object INT32_T145_tree=null;
        Object INT64_T146_tree=null;
        Object UINT8_T147_tree=null;
        Object UINT16_T148_tree=null;
        Object UINT32_T149_tree=null;
        Object UINT64_T150_tree=null;
        Object NX_UINT8_T151_tree=null;
        Object NX_UINT16_T152_tree=null;
        Object NX_UINT32_T153_tree=null;
        Object NX_UINT64_T154_tree=null;
        Object NXLE_UINT8_T155_tree=null;
        Object NXLE_UINT16_T156_tree=null;
        Object NXLE_UINT32_T157_tree=null;
        Object NXLE_UINT64_T158_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // nesC.g:420:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | INT8_T | INT16_T | INT32_T | INT64_T | UINT8_T | UINT16_T | UINT32_T | UINT64_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NX_UINT64_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | NXLE_UINT64_T | struct_or_union_specifier | enum_specifier | typedef_name )
            int alt35=26;
            switch ( input.LA(1) ) {
            case VOID:
                {
                alt35=1;
                }
                break;
            case CHAR:
                {
                alt35=2;
                }
                break;
            case SHORT:
                {
                alt35=3;
                }
                break;
            case INT:
                {
                alt35=4;
                }
                break;
            case LONG:
                {
                alt35=5;
                }
                break;
            case SIGNED:
                {
                alt35=6;
                }
                break;
            case UNSIGNED:
                {
                alt35=7;
                }
                break;
            case INT8_T:
                {
                alt35=8;
                }
                break;
            case INT16_T:
                {
                alt35=9;
                }
                break;
            case INT32_T:
                {
                alt35=10;
                }
                break;
            case INT64_T:
                {
                alt35=11;
                }
                break;
            case UINT8_T:
                {
                alt35=12;
                }
                break;
            case UINT16_T:
                {
                alt35=13;
                }
                break;
            case UINT32_T:
                {
                alt35=14;
                }
                break;
            case UINT64_T:
                {
                alt35=15;
                }
                break;
            case NX_UINT8_T:
                {
                alt35=16;
                }
                break;
            case NX_UINT16_T:
                {
                alt35=17;
                }
                break;
            case NX_UINT32_T:
                {
                alt35=18;
                }
                break;
            case NX_UINT64_T:
                {
                alt35=19;
                }
                break;
            case NXLE_UINT8_T:
                {
                alt35=20;
                }
                break;
            case NXLE_UINT16_T:
                {
                alt35=21;
                }
                break;
            case NXLE_UINT32_T:
                {
                alt35=22;
                }
                break;
            case NXLE_UINT64_T:
                {
                alt35=23;
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case STRUCT:
            case UNION:
                {
                alt35=24;
                }
                break;
            case ENUM:
                {
                alt35=25;
                }
                break;
            case RAW_IDENTIFIER:
                {
                alt35=26;
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
                    // nesC.g:420:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID136=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier4312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID136_tree = 
                    (Object)adaptor.create(VOID136)
                    ;
                    adaptor.addChild(root_0, VOID136_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:421:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR137=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier4322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR137_tree = 
                    (Object)adaptor.create(CHAR137)
                    ;
                    adaptor.addChild(root_0, CHAR137_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:422:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT138=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier4332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT138_tree = 
                    (Object)adaptor.create(SHORT138)
                    ;
                    adaptor.addChild(root_0, SHORT138_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:423:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT139=(Token)match(input,INT,FOLLOW_INT_in_type_specifier4342); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT139_tree = 
                    (Object)adaptor.create(INT139)
                    ;
                    adaptor.addChild(root_0, INT139_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:424:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG140=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier4352); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG140_tree = 
                    (Object)adaptor.create(LONG140)
                    ;
                    adaptor.addChild(root_0, LONG140_tree);
                    }

                    }
                    break;
                case 6 :
                    // nesC.g:425:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED141=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier4362); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED141_tree = 
                    (Object)adaptor.create(SIGNED141)
                    ;
                    adaptor.addChild(root_0, SIGNED141_tree);
                    }

                    }
                    break;
                case 7 :
                    // nesC.g:426:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED142=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier4372); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED142_tree = 
                    (Object)adaptor.create(UNSIGNED142)
                    ;
                    adaptor.addChild(root_0, UNSIGNED142_tree);
                    }

                    }
                    break;
                case 8 :
                    // nesC.g:427:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T143=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier4382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T143_tree = 
                    (Object)adaptor.create(INT8_T143)
                    ;
                    adaptor.addChild(root_0, INT8_T143_tree);
                    }

                    }
                    break;
                case 9 :
                    // nesC.g:428:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T144=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier4404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T144_tree = 
                    (Object)adaptor.create(INT16_T144)
                    ;
                    adaptor.addChild(root_0, INT16_T144_tree);
                    }

                    }
                    break;
                case 10 :
                    // nesC.g:429:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T145=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier4425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T145_tree = 
                    (Object)adaptor.create(INT32_T145)
                    ;
                    adaptor.addChild(root_0, INT32_T145_tree);
                    }

                    }
                    break;
                case 11 :
                    // nesC.g:430:9: INT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT64_T146=(Token)match(input,INT64_T,FOLLOW_INT64_T_in_type_specifier4446); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT64_T146_tree = 
                    (Object)adaptor.create(INT64_T146)
                    ;
                    adaptor.addChild(root_0, INT64_T146_tree);
                    }

                    }
                    break;
                case 12 :
                    // nesC.g:431:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T147=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier4467); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T147_tree = 
                    (Object)adaptor.create(UINT8_T147)
                    ;
                    adaptor.addChild(root_0, UINT8_T147_tree);
                    }

                    }
                    break;
                case 13 :
                    // nesC.g:432:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T148=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier4488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T148_tree = 
                    (Object)adaptor.create(UINT16_T148)
                    ;
                    adaptor.addChild(root_0, UINT16_T148_tree);
                    }

                    }
                    break;
                case 14 :
                    // nesC.g:433:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T149=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier4508); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T149_tree = 
                    (Object)adaptor.create(UINT32_T149)
                    ;
                    adaptor.addChild(root_0, UINT32_T149_tree);
                    }

                    }
                    break;
                case 15 :
                    // nesC.g:434:9: UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT64_T150=(Token)match(input,UINT64_T,FOLLOW_UINT64_T_in_type_specifier4528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT64_T150_tree = 
                    (Object)adaptor.create(UINT64_T150)
                    ;
                    adaptor.addChild(root_0, UINT64_T150_tree);
                    }

                    }
                    break;
                case 16 :
                    // nesC.g:435:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T151=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier4548); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T151_tree = 
                    (Object)adaptor.create(NX_UINT8_T151)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T151_tree);
                    }

                    }
                    break;
                case 17 :
                    // nesC.g:436:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T152=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier4566); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T152_tree = 
                    (Object)adaptor.create(NX_UINT16_T152)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T152_tree);
                    }

                    }
                    break;
                case 18 :
                    // nesC.g:437:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T153=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier4583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T153_tree = 
                    (Object)adaptor.create(NX_UINT32_T153)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T153_tree);
                    }

                    }
                    break;
                case 19 :
                    // nesC.g:438:9: NX_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT64_T154=(Token)match(input,NX_UINT64_T,FOLLOW_NX_UINT64_T_in_type_specifier4600); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT64_T154_tree = 
                    (Object)adaptor.create(NX_UINT64_T154)
                    ;
                    adaptor.addChild(root_0, NX_UINT64_T154_tree);
                    }

                    }
                    break;
                case 20 :
                    // nesC.g:439:9: NXLE_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT8_T155=(Token)match(input,NXLE_UINT8_T,FOLLOW_NXLE_UINT8_T_in_type_specifier4617); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT8_T155_tree = 
                    (Object)adaptor.create(NXLE_UINT8_T155)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT8_T155_tree);
                    }

                    }
                    break;
                case 21 :
                    // nesC.g:440:9: NXLE_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT16_T156=(Token)match(input,NXLE_UINT16_T,FOLLOW_NXLE_UINT16_T_in_type_specifier4633); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT16_T156_tree = 
                    (Object)adaptor.create(NXLE_UINT16_T156)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT16_T156_tree);
                    }

                    }
                    break;
                case 22 :
                    // nesC.g:441:9: NXLE_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT32_T157=(Token)match(input,NXLE_UINT32_T,FOLLOW_NXLE_UINT32_T_in_type_specifier4648); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT32_T157_tree = 
                    (Object)adaptor.create(NXLE_UINT32_T157)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT32_T157_tree);
                    }

                    }
                    break;
                case 23 :
                    // nesC.g:442:9: NXLE_UINT64_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT64_T158=(Token)match(input,NXLE_UINT64_T,FOLLOW_NXLE_UINT64_T_in_type_specifier4663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT64_T158_tree = 
                    (Object)adaptor.create(NXLE_UINT64_T158)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT64_T158_tree);
                    }

                    }
                    break;
                case 24 :
                    // nesC.g:443:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier4678);
                    struct_or_union_specifier159=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier159.getTree());

                    }
                    break;
                case 25 :
                    // nesC.g:444:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier4688);
                    enum_specifier160=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier160.getTree());

                    }
                    break;
                case 26 :
                    // nesC.g:445:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier4698);
                    typedef_name161=typedef_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedef_name161.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:447:1: struct_or_union_specifier : ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) | STRUCT '@' identifier '{' struct_declaration_list '}' -> ^( STRUCT identifier struct_declaration_list ) | struct_or_union identifier attributes '{' struct_declaration_list '}' -> ^( struct_or_union identifier struct_declaration_list ) );
    public final nesCParser.struct_or_union_specifier_return struct_or_union_specifier() throws RecognitionException {
        nesCParser.struct_or_union_specifier_return retval = new nesCParser.struct_or_union_specifier_return();
        retval.start = input.LT(1);

        int struct_or_union_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal164=null;
        Token char_literal166=null;
        Token STRUCT169=null;
        Token char_literal170=null;
        Token char_literal172=null;
        Token char_literal174=null;
        Token char_literal178=null;
        Token char_literal180=null;
        nesCParser.struct_or_union_return struct_or_union162 =null;

        nesCParser.identifier_return identifier163 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list165 =null;

        nesCParser.struct_or_union_return struct_or_union167 =null;

        nesCParser.identifier_return identifier168 =null;

        nesCParser.identifier_return identifier171 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list173 =null;

        nesCParser.struct_or_union_return struct_or_union175 =null;

        nesCParser.identifier_return identifier176 =null;

        nesCParser.attributes_return attributes177 =null;

        nesCParser.struct_declaration_list_return struct_declaration_list179 =null;


        Object char_literal164_tree=null;
        Object char_literal166_tree=null;
        Object STRUCT169_tree=null;
        Object char_literal170_tree=null;
        Object char_literal172_tree=null;
        Object char_literal174_tree=null;
        Object char_literal178_tree=null;
        Object char_literal180_tree=null;
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

            // nesC.g:448:5: ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) | STRUCT '@' identifier '{' struct_declaration_list '}' -> ^( STRUCT identifier struct_declaration_list ) | struct_or_union identifier attributes '{' struct_declaration_list '}' -> ^( struct_or_union identifier struct_declaration_list ) )
            int alt37=4;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==STRUCT) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred104_nesC()) ) {
                    alt37=1;
                }
                else if ( (synpred105_nesC()) ) {
                    alt37=2;
                }
                else if ( (synpred106_nesC()) ) {
                    alt37=3;
                }
                else if ( (true) ) {
                    alt37=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==NX_STRUCT||LA37_0==NX_UNION||LA37_0==UNION) ) {
                int LA37_2 = input.LA(2);

                if ( (synpred104_nesC()) ) {
                    alt37=1;
                }
                else if ( (synpred105_nesC()) ) {
                    alt37=2;
                }
                else if ( (true) ) {
                    alt37=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // nesC.g:448:10: struct_or_union ( identifier )? '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4713);
                    struct_or_union162=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union162.getTree());

                    // nesC.g:448:26: ( identifier )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RAW_IDENTIFIER) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // nesC.g:448:26: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4715);
                            identifier163=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier163.getTree());

                            }
                            break;

                    }


                    char_literal164=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal164);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4720);
                    struct_declaration_list165=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list165.getTree());

                    char_literal166=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal166);


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
                    // 449:13: -> ^( struct_or_union ( identifier )? struct_declaration_list )
                    {
                        // nesC.g:449:16: ^( struct_or_union ( identifier )? struct_declaration_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        // nesC.g:449:34: ( identifier )?
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
                    // nesC.g:450:10: struct_or_union identifier
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4756);
                    struct_or_union167=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union167.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4758);
                    identifier168=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier168.getTree());

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
                    // 451:13: -> ^( struct_or_union identifier )
                    {
                        // nesC.g:451:16: ^( struct_or_union identifier )
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
                    // nesC.g:452:10: STRUCT '@' identifier '{' struct_declaration_list '}'
                    {
                    STRUCT169=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_struct_or_union_specifier4789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRUCT.add(STRUCT169);


                    char_literal170=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_struct_or_union_specifier4791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATTRIBUTE.add(char_literal170);


                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4793);
                    identifier171=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier171.getTree());

                    char_literal172=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal172);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4797);
                    struct_declaration_list173=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list173.getTree());

                    char_literal174=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal174);


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
                    // 453:13: -> ^( STRUCT identifier struct_declaration_list )
                    {
                        // nesC.g:453:16: ^( STRUCT identifier struct_declaration_list )
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
                    // nesC.g:454:10: struct_or_union identifier attributes '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4832);
                    struct_or_union175=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union175.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier4834);
                    identifier176=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier176.getTree());

                    pushFollow(FOLLOW_attributes_in_struct_or_union_specifier4836);
                    attributes177=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes177.getTree());

                    char_literal178=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal178);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4840);
                    struct_declaration_list179=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list179.getTree());

                    char_literal180=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal180);


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
                    // 455:13: -> ^( struct_or_union identifier struct_declaration_list )
                    {
                        // nesC.g:455:16: ^( struct_or_union identifier struct_declaration_list )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:457:1: struct_or_union : ( STRUCT | UNION | NX_STRUCT | NX_UNION );
    public final nesCParser.struct_or_union_return struct_or_union() throws RecognitionException {
        nesCParser.struct_or_union_return retval = new nesCParser.struct_or_union_return();
        retval.start = input.LT(1);

        int struct_or_union_StartIndex = input.index();

        Object root_0 = null;

        Token set181=null;

        Object set181_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // nesC.g:458:5: ( STRUCT | UNION | NX_STRUCT | NX_UNION )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set181=(Token)input.LT(1);

            if ( input.LA(1)==NX_STRUCT||input.LA(1)==NX_UNION||input.LA(1)==STRUCT||input.LA(1)==UNION ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set181)
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:463:1: struct_declaration_list : ( struct_declaration )+ ;
    public final nesCParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        nesCParser.struct_declaration_list_return retval = new nesCParser.struct_declaration_list_return();
        retval.start = input.LT(1);

        int struct_declaration_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.struct_declaration_return struct_declaration182 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // nesC.g:464:5: ( ( struct_declaration )+ )
            // nesC.g:464:10: ( struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // nesC.g:465:10: ( struct_declaration )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==CHAR||LA38_0==CONST||LA38_0==ENUM||(LA38_0 >= INT && LA38_0 <= INT8_T)||LA38_0==LONG||(LA38_0 >= NXLE_UINT16_T && LA38_0 <= NX_UNION)||LA38_0==RAW_IDENTIFIER||LA38_0==RESTRICT||LA38_0==SHORT||LA38_0==SIGNED||LA38_0==STRUCT||(LA38_0 >= UINT16_T && LA38_0 <= UINT8_T)||(LA38_0 >= UNION && LA38_0 <= UNSIGNED)||(LA38_0 >= VOID && LA38_0 <= VOLATILE)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // nesC.g:465:10: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list4924);
            	    struct_declaration182=struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_declaration182.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false; }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:468:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final nesCParser.struct_declaration_return struct_declaration() throws RecognitionException {
        nesCParser.struct_declaration_return retval = new nesCParser.struct_declaration_return();
        retval.start = input.LT(1);

        int struct_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal185=null;
        nesCParser.specifier_qualifier_list_return specifier_qualifier_list183 =null;

        nesCParser.struct_declarator_list_return struct_declarator_list184 =null;


        Object char_literal185_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // nesC.g:469:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // nesC.g:469:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration4955);
            specifier_qualifier_list183=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list183.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration4957);
            struct_declarator_list184=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list184.getTree());

            char_literal185=(Token)match(input,183,FOLLOW_183_in_struct_declaration4959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_183.add(char_literal185);


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
            // 470:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // nesC.g:470:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:477:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final nesCParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        nesCParser.specifier_qualifier_list_return retval = new nesCParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);

        int specifier_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.type_specifier_return type_specifier186 =null;

        nesCParser.type_qualifier_return type_qualifier187 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // nesC.g:478:5: ( ( type_specifier | type_qualifier )+ )
            // nesC.g:478:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:478:10: ( type_specifier | type_qualifier )+
            int cnt39=0;
            loop39:
            do {
                int alt39=3;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (synpred111_nesC()) ) {
                        alt39=1;
                    }


                    }
                    break;
                case CHAR:
                case ENUM:
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
                    alt39=1;
                    }
                    break;
                case CONST:
                case RESTRICT:
                case VOLATILE:
                    {
                    alt39=2;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // nesC.g:478:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list5006);
            	    type_specifier186=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier186.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:478:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list5010);
            	    type_qualifier187=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier187.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:485:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
    public final nesCParser.struct_declarator_list_return struct_declarator_list() throws RecognitionException {
        nesCParser.struct_declarator_list_return retval = new nesCParser.struct_declarator_list_return();
        retval.start = input.LT(1);

        int struct_declarator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal189=null;
        nesCParser.struct_declarator_return struct_declarator188 =null;

        nesCParser.struct_declarator_return struct_declarator190 =null;


        Object char_literal189_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_struct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // nesC.g:486:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // nesC.g:486:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5036);
            struct_declarator188=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator188.getTree());

            // nesC.g:486:28: ( ',' struct_declarator )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // nesC.g:486:29: ',' struct_declarator
            	    {
            	    char_literal189=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list5039); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal189);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list5041);
            	    struct_declarator190=struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator190.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
            // 486:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // nesC.g:486:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:488:1: struct_declarator : ( ( declarator )? ':' constant_expression | declarator );
    public final nesCParser.struct_declarator_return struct_declarator() throws RecognitionException {
        nesCParser.struct_declarator_return retval = new nesCParser.struct_declarator_return();
        retval.start = input.LT(1);

        int struct_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal192=null;
        nesCParser.declarator_return declarator191 =null;

        nesCParser.constant_expression_return constant_expression193 =null;

        nesCParser.declarator_return declarator194 =null;


        Object char_literal192_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // nesC.g:489:5: ( ( declarator )? ':' constant_expression | declarator )
            int alt42=2;
            switch ( input.LA(1) ) {
            case STAR:
                {
                int LA42_1 = input.LA(2);

                if ( (synpred115_nesC()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA42_2 = input.LA(2);

                if ( (synpred115_nesC()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;

                }
                }
                break;
            case LPARENS:
                {
                int LA42_3 = input.LA(2);

                if ( (synpred115_nesC()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 3, input);

                    throw nvae;

                }
                }
                break;
            case 182:
                {
                alt42=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // nesC.g:489:10: ( declarator )? ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:489:10: ( declarator )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==LPARENS||LA41_0==RAW_IDENTIFIER||LA41_0==STAR) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // nesC.g:489:10: declarator
                            {
                            pushFollow(FOLLOW_declarator_in_struct_declarator5071);
                            declarator191=declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator191.getTree());

                            }
                            break;

                    }


                    char_literal192=(Token)match(input,182,FOLLOW_182_in_struct_declarator5074); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal192_tree = 
                    (Object)adaptor.create(char_literal192)
                    ;
                    adaptor.addChild(root_0, char_literal192_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator5076);
                    constant_expression193=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression193.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:490:10: declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator5087);
                    declarator194=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator194.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:492:1: enum_specifier : ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier attributes '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier attributes enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) );
    public final nesCParser.enum_specifier_return enum_specifier() throws RecognitionException {
        nesCParser.enum_specifier_return retval = new nesCParser.enum_specifier_return();
        retval.start = input.LT(1);

        int enum_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM195=null;
        Token char_literal197=null;
        Token char_literal199=null;
        Token char_literal200=null;
        Token ENUM201=null;
        Token char_literal204=null;
        Token char_literal206=null;
        Token char_literal207=null;
        Token ENUM208=null;
        nesCParser.identifier_return identifier196 =null;

        nesCParser.enumerator_list_return enumerator_list198 =null;

        nesCParser.identifier_return identifier202 =null;

        nesCParser.attributes_return attributes203 =null;

        nesCParser.enumerator_list_return enumerator_list205 =null;

        nesCParser.identifier_return identifier209 =null;


        Object ENUM195_tree=null;
        Object char_literal197_tree=null;
        Object char_literal199_tree=null;
        Object char_literal200_tree=null;
        Object ENUM201_tree=null;
        Object char_literal204_tree=null;
        Object char_literal206_tree=null;
        Object char_literal207_tree=null;
        Object ENUM208_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_enumerator_list=new RewriteRuleSubtreeStream(adaptor,"rule enumerator_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // nesC.g:493:5: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier attributes '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier attributes enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ENUM) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred118_nesC()) ) {
                    alt46=1;
                }
                else if ( (synpred120_nesC()) ) {
                    alt46=2;
                }
                else if ( (true) ) {
                    alt46=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // nesC.g:493:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM195=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5106); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM195);


                    // nesC.g:493:15: ( identifier )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RAW_IDENTIFIER) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // nesC.g:493:15: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_enum_specifier5108);
                            identifier196=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier196.getTree());

                            }
                            break;

                    }


                    char_literal197=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5111); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal197);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5113);
                    enumerator_list198=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list198.getTree());

                    // nesC.g:493:47: ( ',' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==COMMA) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // nesC.g:493:47: ','
                            {
                            char_literal199=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5115); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal199);


                            }
                            break;

                    }


                    char_literal200=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal200);


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
                    // 494:14: -> ^( ENUM ( identifier )? enumerator_list )
                    {
                        // nesC.g:494:17: ^( ENUM ( identifier )? enumerator_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        // nesC.g:494:24: ( identifier )?
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
                    // nesC.g:495:10: ENUM identifier attributes '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM201=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5153); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM201);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5155);
                    identifier202=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier202.getTree());

                    pushFollow(FOLLOW_attributes_in_enum_specifier5157);
                    attributes203=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes203.getTree());

                    char_literal204=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier5159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal204);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier5161);
                    enumerator_list205=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list205.getTree());

                    // nesC.g:495:57: ( ',' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==COMMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // nesC.g:495:57: ','
                            {
                            char_literal206=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier5163); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal206);


                            }
                            break;

                    }


                    char_literal207=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier5166); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal207);


                    // AST REWRITE
                    // elements: identifier, ENUM, enumerator_list, attributes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 496:14: -> ^( ENUM identifier attributes enumerator_list )
                    {
                        // nesC.g:496:17: ^( ENUM identifier attributes enumerator_list )
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
                    // nesC.g:497:10: ENUM identifier
                    {
                    ENUM208=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier5202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM208);


                    pushFollow(FOLLOW_identifier_in_enum_specifier5204);
                    identifier209=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier209.getTree());

                    // AST REWRITE
                    // elements: ENUM, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 498:14: -> ^( ENUM identifier )
                    {
                        // nesC.g:498:17: ^( ENUM identifier )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:500:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
    public final nesCParser.enumerator_list_return enumerator_list() throws RecognitionException {
        nesCParser.enumerator_list_return retval = new nesCParser.enumerator_list_return();
        retval.start = input.LT(1);

        int enumerator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal211=null;
        nesCParser.enumerator_return enumerator210 =null;

        nesCParser.enumerator_return enumerator212 =null;


        Object char_literal211_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // nesC.g:501:5: ( enumerator ( ',' ! enumerator )* )
            // nesC.g:501:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list5244);
            enumerator210=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator210.getTree());

            // nesC.g:501:21: ( ',' ! enumerator )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMA) ) {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==RAW_IDENTIFIER) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // nesC.g:501:22: ',' ! enumerator
            	    {
            	    char_literal211=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list5247); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list5250);
            	    enumerator212=enumerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator212.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:507:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
    public final nesCParser.enumerator_return enumerator() throws RecognitionException {
        nesCParser.enumerator_return retval = new nesCParser.enumerator_return();
        retval.start = input.LT(1);

        int enumerator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal214=null;
        nesCParser.identifier_return identifier213 =null;

        nesCParser.constant_expression_return constant_expression215 =null;


        Object char_literal214_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // nesC.g:508:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // nesC.g:508:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator5275);
            identifier213=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier213.getTree());

            // nesC.g:508:21: ( '=' constant_expression )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ASSIGN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // nesC.g:508:22: '=' constant_expression
                    {
                    char_literal214=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator5278); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal214);


                    pushFollow(FOLLOW_constant_expression_in_enumerator5280);
                    constant_expression215=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression215.getTree());

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
            // 508:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // nesC.g:508:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:508:75: ( constant_expression )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:509:1: type_qualifier : ( CONST | RESTRICT | VOLATILE );
    public final nesCParser.type_qualifier_return type_qualifier() throws RecognitionException {
        nesCParser.type_qualifier_return retval = new nesCParser.type_qualifier_return();
        retval.start = input.LT(1);

        int type_qualifier_StartIndex = input.index();

        Object root_0 = null;

        Token set216=null;

        Object set216_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // nesC.g:510:5: ( CONST | RESTRICT | VOLATILE )
            // nesC.g:
            {
            root_0 = (Object)adaptor.nil();


            set216=(Token)input.LT(1);

            if ( input.LA(1)==CONST||input.LA(1)==RESTRICT||input.LA(1)==VOLATILE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set216)
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:514:1: function_specifier : INLINE ;
    public final nesCParser.function_specifier_return function_specifier() throws RecognitionException {
        nesCParser.function_specifier_return retval = new nesCParser.function_specifier_return();
        retval.start = input.LT(1);

        int function_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token INLINE217=null;

        Object INLINE217_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // nesC.g:515:5: ( INLINE )
            // nesC.g:515:10: INLINE
            {
            root_0 = (Object)adaptor.nil();


            INLINE217=(Token)match(input,INLINE,FOLLOW_INLINE_in_function_specifier5352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INLINE217_tree = 
            (Object)adaptor.create(INLINE217)
            ;
            adaptor.addChild(root_0, INLINE217_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:517:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
    public final nesCParser.declarator_return declarator() throws RecognitionException {
        nesCParser.declarator_return retval = new nesCParser.declarator_return();
        retval.start = input.LT(1);

        int declarator_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.pointer_return pointer218 =null;

        nesCParser.direct_declarator_return direct_declarator219 =null;


        RewriteRuleSubtreeStream stream_direct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule direct_declarator");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // nesC.g:518:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // nesC.g:518:10: ( pointer )? direct_declarator
            {
            // nesC.g:518:10: ( pointer )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==STAR) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // nesC.g:518:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator5367);
                    pointer218=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer218.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator5370);
            direct_declarator219=direct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_direct_declarator.add(direct_declarator219.getTree());

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
            // 518:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // nesC.g:518:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // nesC.g:518:53: ( pointer )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:520:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final nesCParser.direct_declarator_return direct_declarator() throws RecognitionException {
        nesCParser.direct_declarator_return retval = new nesCParser.direct_declarator_return();
        retval.start = input.LT(1);

        int direct_declarator_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.direct_declarator_identifier_return direct_declarator_identifier220 =null;

        nesCParser.direct_declarator_modifier_return direct_declarator_modifier221 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // nesC.g:521:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // nesC.g:521:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator5395);
            direct_declarator_identifier220=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier220.getTree());

            // nesC.g:521:38: ( direct_declarator_modifier )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==LBRACKET||LA50_0==LPARENS) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // nesC.g:521:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator5397);
            	    direct_declarator_modifier221=direct_declarator_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_modifier221.getTree());

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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:532:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
    public final nesCParser.direct_declarator_identifier_return direct_declarator_identifier() throws RecognitionException {
        nesCParser.direct_declarator_identifier_return retval = new nesCParser.direct_declarator_identifier_return();
        retval.start = input.LT(1);

        int direct_declarator_identifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal222=null;
        Token char_literal224=null;
        Token char_literal226=null;
        nesCParser.identifier_return myIdName =null;

        nesCParser.identifier_return identifier223 =null;

        nesCParser.declarator_return declarator225 =null;


        Object char_literal222_tree=null;
        Object char_literal224_tree=null;
        Object char_literal226_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // nesC.g:533:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RAW_IDENTIFIER) ) {
                alt52=1;
            }
            else if ( (LA52_0==LPARENS) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }
            switch (alt52) {
                case 1 :
                    // nesC.g:533:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5423);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // nesC.g:533:29: ( '.' identifier )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==DOT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // nesC.g:533:30: '.' identifier
                            {
                            char_literal222=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier5426); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal222);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier5428);
                            identifier223=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier223.getTree());

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
                    // 537:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:537:18: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:538:9: '(' declarator ')'
                    {
                    char_literal224=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier5463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal224);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier5465);
                    declarator225=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator225.getTree());

                    char_literal226=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier5467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal226);


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
                    // 538:28: -> declarator
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:544:1: direct_declarator_modifier : ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
    public final nesCParser.direct_declarator_modifier_return direct_declarator_modifier() throws RecognitionException {
        nesCParser.direct_declarator_modifier_return retval = new nesCParser.direct_declarator_modifier_return();
        retval.start = input.LT(1);

        int direct_declarator_modifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal227=null;
        Token char_literal229=null;
        Token char_literal230=null;
        Token char_literal231=null;
        Token char_literal232=null;
        Token char_literal233=null;
        nesCParser.parameter_type_list_return gen =null;

        nesCParser.parameter_type_list_return normal =null;

        nesCParser.constant_expression_return constant_expression228 =null;


        Object char_literal227_tree=null;
        Object char_literal229_tree=null;
        Object char_literal230_tree=null;
        Object char_literal231_tree=null;
        Object char_literal232_tree=null;
        Object char_literal233_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_parameter_type_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_type_list");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // nesC.g:545:5: ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LBRACKET) ) {
                int LA55_1 = input.LA(2);

                if ( (synpred130_nesC()) ) {
                    alt55=1;
                }
                else if ( (true) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;

                }
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
                    // nesC.g:545:9: '[' ( constant_expression )? ']'
                    {
                    char_literal227=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal227);


                    // nesC.g:545:13: ( constant_expression )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==AMP||LA53_0==BITCOMPLEMENT||LA53_0==CALL||LA53_0==CHARACTER_LITERAL||LA53_0==CONSTANT||LA53_0==LPARENS||LA53_0==MINUS||LA53_0==MINUSMINUS||LA53_0==NOT||LA53_0==PLUS||LA53_0==PLUSPLUS||LA53_0==POST||LA53_0==RAW_IDENTIFIER||LA53_0==SIGNAL||LA53_0==SIZEOF||LA53_0==STAR||LA53_0==STRING_LITERAL) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // nesC.g:545:13: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier5491);
                            constant_expression228=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression228.getTree());

                            }
                            break;

                    }


                    char_literal229=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal229);


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
                    // 546:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // nesC.g:546:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // nesC.g:546:44: ( constant_expression )?
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
                    // nesC.g:547:9: ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')'
                    {
                    // nesC.g:547:9: ( '[' gen= parameter_type_list ']' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==LBRACKET) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // nesC.g:547:10: '[' gen= parameter_type_list ']'
                            {
                            char_literal230=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier5526); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal230);


                            pushFollow(FOLLOW_parameter_type_list_in_direct_declarator_modifier5530);
                            gen=parameter_type_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_type_list.add(gen.getTree());

                            char_literal231=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier5532); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal231);


                            }
                            break;

                    }


                    char_literal232=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier5536); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal232);


                    pushFollow(FOLLOW_parameter_type_list_in_direct_declarator_modifier5540);
                    normal=parameter_type_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_type_list.add(normal.getTree());

                    char_literal233=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier5542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal233);


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
                    // 548:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // nesC.g:548:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:554:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
    public final nesCParser.pointer_return pointer() throws RecognitionException {
        nesCParser.pointer_return retval = new nesCParser.pointer_return();
        retval.start = input.LT(1);

        int pointer_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal234=null;
        Token char_literal237=null;
        nesCParser.type_qualifier_list_return type_qualifier_list235 =null;

        nesCParser.pointer_return pointer236 =null;

        nesCParser.type_qualifier_list_return type_qualifier_list238 =null;


        Object char_literal234_tree=null;
        Object char_literal237_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_type_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule type_qualifier_list");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // nesC.g:555:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // nesC.g:555:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal234=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal234);


                    // nesC.g:555:14: ( type_qualifier_list )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==CONST||LA56_0==RESTRICT||LA56_0==VOLATILE) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // nesC.g:555:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5584);
                            type_qualifier_list235=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list235.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer5587);
                    pointer236=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer236.getTree());

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
                    // 555:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // nesC.g:555:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:555:66: ( type_qualifier_list )?
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
                    // nesC.g:556:10: '*' ( type_qualifier_list )?
                    {
                    char_literal237=(Token)match(input,STAR,FOLLOW_STAR_in_pointer5609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal237);


                    // nesC.g:556:14: ( type_qualifier_list )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==CONST||LA57_0==RESTRICT||LA57_0==VOLATILE) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // nesC.g:556:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer5611);
                            type_qualifier_list238=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list238.getTree());

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
                    // 556:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // nesC.g:556:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // nesC.g:556:58: ( type_qualifier_list )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:558:1: type_qualifier_list : ( type_qualifier )+ ;
    public final nesCParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        nesCParser.type_qualifier_list_return retval = new nesCParser.type_qualifier_list_return();
        retval.start = input.LT(1);

        int type_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.type_qualifier_return type_qualifier239 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // nesC.g:559:5: ( ( type_qualifier )+ )
            // nesC.g:559:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:559:10: ( type_qualifier )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==CONST||LA59_0==RESTRICT||LA59_0==VOLATILE) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // nesC.g:559:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list5640);
            	    type_qualifier239=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier239.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:562:1: parameter_type_list : parameter_list ( ',' '...' )? ;
    public final nesCParser.parameter_type_list_return parameter_type_list() throws RecognitionException {
        nesCParser.parameter_type_list_return retval = new nesCParser.parameter_type_list_return();
        retval.start = input.LT(1);

        int parameter_type_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal241=null;
        Token string_literal242=null;
        nesCParser.parameter_list_return parameter_list240 =null;


        Object char_literal241_tree=null;
        Object string_literal242_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // nesC.g:563:5: ( parameter_list ( ',' '...' )? )
            // nesC.g:563:10: parameter_list ( ',' '...' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_parameter_list_in_parameter_type_list5661);
            parameter_list240=parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list240.getTree());

            // nesC.g:563:25: ( ',' '...' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==COMMA) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // nesC.g:563:26: ',' '...'
                    {
                    char_literal241=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_type_list5664); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal241_tree = 
                    (Object)adaptor.create(char_literal241)
                    ;
                    adaptor.addChild(root_0, char_literal241_tree);
                    }

                    string_literal242=(Token)match(input,181,FOLLOW_181_in_parameter_type_list5666); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal242_tree = 
                    (Object)adaptor.create(string_literal242)
                    ;
                    adaptor.addChild(root_0, string_literal242_tree);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:569:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* -> ^( PARAMETER_LIST ( parameter_declaration )+ ) | -> ^( PARAMETER_LIST ) );
    public final nesCParser.parameter_list_return parameter_list() throws RecognitionException {
        nesCParser.parameter_list_return retval = new nesCParser.parameter_list_return();
        retval.start = input.LT(1);

        int parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal244=null;
        nesCParser.parameter_declaration_return parameter_declaration243 =null;

        nesCParser.parameter_declaration_return parameter_declaration245 =null;


        Object char_literal244_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // nesC.g:570:5: ( parameter_declaration ( ',' parameter_declaration )* -> ^( PARAMETER_LIST ( parameter_declaration )+ ) | -> ^( PARAMETER_LIST ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==ASYNC||LA62_0==AUTO||LA62_0==CHAR||LA62_0==COMMAND||LA62_0==CONST||LA62_0==DEFAULT||LA62_0==DUTY||LA62_0==ENUM||(LA62_0 >= EVENT && LA62_0 <= EXTERN)||(LA62_0 >= INLINE && LA62_0 <= INT8_T)||LA62_0==LONG||LA62_0==NORACE||(LA62_0 >= NXLE_UINT16_T && LA62_0 <= NX_UNION)||LA62_0==RAW_IDENTIFIER||LA62_0==REGISTER||LA62_0==RESTRICT||LA62_0==SHORT||LA62_0==SIGNED||LA62_0==STATIC||LA62_0==STRUCT||LA62_0==TASK||(LA62_0 >= UINT16_T && LA62_0 <= UINT8_T)||(LA62_0 >= UNION && LA62_0 <= UNSIGNED)||(LA62_0 >= VOID && LA62_0 <= VOLATILE)) ) {
                alt62=1;
            }
            else if ( (LA62_0==EOF||LA62_0==COMMA||LA62_0==RBRACKET||LA62_0==RPARENS) ) {
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
                    // nesC.g:570:10: parameter_declaration ( ',' parameter_declaration )*
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list5691);
                    parameter_declaration243=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration243.getTree());

                    // nesC.g:570:32: ( ',' parameter_declaration )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==COMMA) ) {
                            int LA61_1 = input.LA(2);

                            if ( (LA61_1==ASYNC||LA61_1==AUTO||LA61_1==CHAR||LA61_1==COMMAND||LA61_1==CONST||LA61_1==DEFAULT||LA61_1==DUTY||LA61_1==ENUM||(LA61_1 >= EVENT && LA61_1 <= EXTERN)||(LA61_1 >= INLINE && LA61_1 <= INT8_T)||LA61_1==LONG||LA61_1==NORACE||(LA61_1 >= NXLE_UINT16_T && LA61_1 <= NX_UNION)||LA61_1==RAW_IDENTIFIER||LA61_1==REGISTER||LA61_1==RESTRICT||LA61_1==SHORT||LA61_1==SIGNED||LA61_1==STATIC||LA61_1==STRUCT||LA61_1==TASK||(LA61_1 >= UINT16_T && LA61_1 <= UINT8_T)||(LA61_1 >= UNION && LA61_1 <= UNSIGNED)||(LA61_1 >= VOID && LA61_1 <= VOLATILE)) ) {
                                alt61=1;
                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // nesC.g:570:33: ',' parameter_declaration
                    	    {
                    	    char_literal244=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list5694); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal244);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list5696);
                    	    parameter_declaration245=parameter_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration245.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
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
                    // 571:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ )
                    {
                        // nesC.g:571:16: ^( PARAMETER_LIST ( parameter_declaration )+ )
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
                    // nesC.g:573:13: 
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
                    // 573:13: -> ^( PARAMETER_LIST )
                    {
                        // nesC.g:573:16: ^( PARAMETER_LIST )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:579:1: parameter_declaration : ( declaration_specifiers declarator ( attributes )? -> ^( PARAMETER declaration_specifiers declarator ( attributes )? ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) );
    public final nesCParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        nesCParser.parameter_declaration_return retval = new nesCParser.parameter_declaration_return();
        retval.start = input.LT(1);

        int parameter_declaration_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers246 =null;

        nesCParser.declarator_return declarator247 =null;

        nesCParser.attributes_return attributes248 =null;

        nesCParser.declaration_specifiers_return declaration_specifiers249 =null;

        nesCParser.abstract_declarator_return abstract_declarator250 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_abstract_declarator=new RewriteRuleSubtreeStream(adaptor,"rule abstract_declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // nesC.g:580:5: ( declaration_specifiers declarator ( attributes )? -> ^( PARAMETER declaration_specifiers declarator ( attributes )? ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) )
            int alt65=2;
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
                int LA65_1 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA65_2 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA65_3 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA65_4 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA65_5 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA65_6 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA65_7 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA65_8 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 8, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA65_9 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 9, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA65_10 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA65_11 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 11, input);

                    throw nvae;

                }
                }
                break;
            case INT64_T:
                {
                int LA65_12 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 12, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA65_13 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 13, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA65_14 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 14, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA65_15 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 15, input);

                    throw nvae;

                }
                }
                break;
            case UINT64_T:
                {
                int LA65_16 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 16, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA65_17 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 17, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA65_18 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 18, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA65_19 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 19, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT64_T:
                {
                int LA65_20 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 20, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT8_T:
                {
                int LA65_21 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 21, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT16_T:
                {
                int LA65_22 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 22, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT32_T:
                {
                int LA65_23 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 23, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA65_24 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 24, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA65_25 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 25, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA65_26 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 26, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA65_27 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 27, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA65_28 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 28, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA65_29 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 29, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA65_30 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 30, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA65_31 = input.LA(2);

                if ( (synpred140_nesC()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 31, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }

            switch (alt65) {
                case 1 :
                    // nesC.g:580:10: declaration_specifiers declarator ( attributes )?
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration5763);
                    declaration_specifiers246=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers246.getTree());

                    pushFollow(FOLLOW_declarator_in_parameter_declaration5765);
                    declarator247=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator247.getTree());

                    // nesC.g:580:44: ( attributes )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==ATTRIBUTE) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // nesC.g:580:44: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_parameter_declaration5767);
                            attributes248=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes248.getTree());

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
                    // 581:13: -> ^( PARAMETER declaration_specifiers declarator ( attributes )? )
                    {
                        // nesC.g:581:16: ^( PARAMETER declaration_specifiers declarator ( attributes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        adaptor.addChild(root_1, stream_declarator.nextTree());

                        // nesC.g:581:62: ( attributes )?
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
                    // nesC.g:582:10: declaration_specifiers ( abstract_declarator )?
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration5804);
                    declaration_specifiers249=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers249.getTree());

                    // nesC.g:582:33: ( abstract_declarator )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==LBRACKET||LA64_0==LPARENS||LA64_0==STAR) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // nesC.g:582:33: abstract_declarator
                            {
                            pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration5806);
                            abstract_declarator250=abstract_declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_abstract_declarator.add(abstract_declarator250.getTree());

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
                    // 583:13: -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                    {
                        // nesC.g:583:16: ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // nesC.g:583:51: ( abstract_declarator )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:585:1: identifier_list : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final nesCParser.identifier_list_return identifier_list() throws RecognitionException {
        nesCParser.identifier_list_return retval = new nesCParser.identifier_list_return();
        retval.start = input.LT(1);

        int identifier_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal252=null;
        nesCParser.identifier_return identifier251 =null;

        nesCParser.identifier_return identifier253 =null;


        Object char_literal252_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // nesC.g:586:5: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // nesC.g:586:10: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifier_list5849);
            identifier251=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier251.getTree());

            // nesC.g:586:21: ( ',' identifier )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==COMMA) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // nesC.g:586:22: ',' identifier
            	    {
            	    char_literal252=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifier_list5852); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal252);


            	    pushFollow(FOLLOW_identifier_in_identifier_list5854);
            	    identifier253=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier253.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
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
            // 586:39: -> ( identifier )+
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:588:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final nesCParser.type_name_return type_name() throws RecognitionException {
        nesCParser.type_name_return retval = new nesCParser.type_name_return();
        retval.start = input.LT(1);

        int type_name_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.specifier_qualifier_list_return specifier_qualifier_list254 =null;

        nesCParser.abstract_declarator_return abstract_declarator255 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // nesC.g:589:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // nesC.g:589:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name5880);
            specifier_qualifier_list254=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list254.getTree());

            // nesC.g:589:35: ( abstract_declarator )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LBRACKET||LA67_0==LPARENS||LA67_0==STAR) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // nesC.g:589:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name5882);
                    abstract_declarator255=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator255.getTree());

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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:591:1: abstract_declarator : ( ( pointer )? direct_abstract_declarator | pointer );
    public final nesCParser.abstract_declarator_return abstract_declarator() throws RecognitionException {
        nesCParser.abstract_declarator_return retval = new nesCParser.abstract_declarator_return();
        retval.start = input.LT(1);

        int abstract_declarator_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.pointer_return pointer256 =null;

        nesCParser.direct_abstract_declarator_return direct_abstract_declarator257 =null;

        nesCParser.pointer_return pointer258 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // nesC.g:592:5: ( ( pointer )? direct_abstract_declarator | pointer )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==STAR) ) {
                int LA69_1 = input.LA(2);

                if ( (synpred145_nesC()) ) {
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
            else if ( (LA69_0==LBRACKET||LA69_0==LPARENS) ) {
                alt69=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // nesC.g:592:10: ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // nesC.g:592:10: ( pointer )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==STAR) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // nesC.g:592:10: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator5902);
                            pointer256=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer256.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator5905);
                    direct_abstract_declarator257=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator257.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:593:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator5916);
                    pointer258=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer258.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:595:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )* ;
    public final nesCParser.direct_abstract_declarator_return direct_abstract_declarator() throws RecognitionException {
        nesCParser.direct_abstract_declarator_return retval = new nesCParser.direct_abstract_declarator_return();
        retval.start = input.LT(1);

        int direct_abstract_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal259=null;
        Token char_literal261=null;
        Token char_literal262=null;
        Token char_literal264=null;
        Token char_literal265=null;
        Token char_literal267=null;
        Token char_literal268=null;
        Token char_literal270=null;
        Token char_literal271=null;
        Token char_literal273=null;
        nesCParser.abstract_declarator_return abstract_declarator260 =null;

        nesCParser.assignment_expression_return assignment_expression263 =null;

        nesCParser.parameter_type_list_return parameter_type_list266 =null;

        nesCParser.assignment_expression_return assignment_expression269 =null;

        nesCParser.parameter_type_list_return parameter_type_list272 =null;


        Object char_literal259_tree=null;
        Object char_literal261_tree=null;
        Object char_literal262_tree=null;
        Object char_literal264_tree=null;
        Object char_literal265_tree=null;
        Object char_literal267_tree=null;
        Object char_literal268_tree=null;
        Object char_literal270_tree=null;
        Object char_literal271_tree=null;
        Object char_literal273_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // nesC.g:596:5: ( ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )* )
            // nesC.g:596:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )*
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:596:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==LPARENS) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==LBRACKET||LA72_1==LPARENS||LA72_1==STAR) ) {
                    alt72=1;
                }
                else if ( (LA72_1==ASYNC||LA72_1==AUTO||LA72_1==CHAR||(LA72_1 >= COMMA && LA72_1 <= COMMAND)||LA72_1==CONST||LA72_1==DEFAULT||LA72_1==DUTY||LA72_1==ENUM||(LA72_1 >= EVENT && LA72_1 <= EXTERN)||(LA72_1 >= INLINE && LA72_1 <= INT8_T)||LA72_1==LONG||LA72_1==NORACE||(LA72_1 >= NXLE_UINT16_T && LA72_1 <= NX_UNION)||LA72_1==RAW_IDENTIFIER||LA72_1==REGISTER||LA72_1==RESTRICT||LA72_1==RPARENS||LA72_1==SHORT||LA72_1==SIGNED||LA72_1==STATIC||LA72_1==STRUCT||LA72_1==TASK||(LA72_1 >= UINT16_T && LA72_1 <= UINT8_T)||(LA72_1 >= UNION && LA72_1 <= UNSIGNED)||(LA72_1 >= VOID && LA72_1 <= VOLATILE)) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

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
                    // nesC.g:596:11: '(' abstract_declarator ')'
                    {
                    char_literal259=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator5936); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal259_tree = 
                    (Object)adaptor.create(char_literal259)
                    ;
                    adaptor.addChild(root_0, char_literal259_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator5938);
                    abstract_declarator260=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator260.getTree());

                    char_literal261=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator5943); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal261_tree = 
                    (Object)adaptor.create(char_literal261)
                    ;
                    adaptor.addChild(root_0, char_literal261_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:597:11: '[' ( assignment_expression )? ']'
                    {
                    char_literal262=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator5957); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal262_tree = 
                    (Object)adaptor.create(char_literal262)
                    ;
                    adaptor.addChild(root_0, char_literal262_tree);
                    }

                    // nesC.g:597:15: ( assignment_expression )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==AMP||LA70_0==BITCOMPLEMENT||LA70_0==CALL||LA70_0==CHARACTER_LITERAL||LA70_0==CONSTANT||LA70_0==LPARENS||LA70_0==MINUS||LA70_0==MINUSMINUS||LA70_0==NOT||LA70_0==PLUS||LA70_0==PLUSPLUS||LA70_0==POST||LA70_0==RAW_IDENTIFIER||LA70_0==SIGNAL||LA70_0==SIZEOF||LA70_0==STAR||LA70_0==STRING_LITERAL) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // nesC.g:597:15: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator5959);
                            assignment_expression263=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression263.getTree());

                            }
                            break;

                    }


                    char_literal264=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator5962); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal264_tree = 
                    (Object)adaptor.create(char_literal264)
                    ;
                    adaptor.addChild(root_0, char_literal264_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:598:11: '(' ( parameter_type_list )? ')'
                    {
                    char_literal265=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator5976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal265_tree = 
                    (Object)adaptor.create(char_literal265)
                    ;
                    adaptor.addChild(root_0, char_literal265_tree);
                    }

                    // nesC.g:598:15: ( parameter_type_list )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==ASYNC||LA71_0==AUTO||LA71_0==CHAR||(LA71_0 >= COMMA && LA71_0 <= COMMAND)||LA71_0==CONST||LA71_0==DEFAULT||LA71_0==DUTY||LA71_0==ENUM||(LA71_0 >= EVENT && LA71_0 <= EXTERN)||(LA71_0 >= INLINE && LA71_0 <= INT8_T)||LA71_0==LONG||LA71_0==NORACE||(LA71_0 >= NXLE_UINT16_T && LA71_0 <= NX_UNION)||LA71_0==RAW_IDENTIFIER||LA71_0==REGISTER||LA71_0==RESTRICT||LA71_0==SHORT||LA71_0==SIGNED||LA71_0==STATIC||LA71_0==STRUCT||LA71_0==TASK||(LA71_0 >= UINT16_T && LA71_0 <= UINT8_T)||(LA71_0 >= UNION && LA71_0 <= UNSIGNED)||(LA71_0 >= VOID && LA71_0 <= VOLATILE)) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==RPARENS) ) {
                        int LA71_2 = input.LA(2);

                        if ( (synpred149_nesC()) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // nesC.g:598:15: parameter_type_list
                            {
                            pushFollow(FOLLOW_parameter_type_list_in_direct_abstract_declarator5978);
                            parameter_type_list266=parameter_type_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list266.getTree());

                            }
                            break;

                    }


                    char_literal267=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator5983); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal267_tree = 
                    (Object)adaptor.create(char_literal267)
                    ;
                    adaptor.addChild(root_0, char_literal267_tree);
                    }

                    }
                    break;

            }


            // nesC.g:599:14: ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )*
            loop75:
            do {
                int alt75=3;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==LBRACKET) ) {
                    alt75=1;
                }
                else if ( (LA75_0==LPARENS) ) {
                    alt75=2;
                }


                switch (alt75) {
            	case 1 :
            	    // nesC.g:599:15: '[' ( assignment_expression )? ']'
            	    {
            	    char_literal268=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator6000); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal268_tree = 
            	    (Object)adaptor.create(char_literal268)
            	    ;
            	    adaptor.addChild(root_0, char_literal268_tree);
            	    }

            	    // nesC.g:599:19: ( assignment_expression )?
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==AMP||LA73_0==BITCOMPLEMENT||LA73_0==CALL||LA73_0==CHARACTER_LITERAL||LA73_0==CONSTANT||LA73_0==LPARENS||LA73_0==MINUS||LA73_0==MINUSMINUS||LA73_0==NOT||LA73_0==PLUS||LA73_0==PLUSPLUS||LA73_0==POST||LA73_0==RAW_IDENTIFIER||LA73_0==SIGNAL||LA73_0==SIZEOF||LA73_0==STAR||LA73_0==STRING_LITERAL) ) {
            	        alt73=1;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // nesC.g:599:19: assignment_expression
            	            {
            	            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator6002);
            	            assignment_expression269=assignment_expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression269.getTree());

            	            }
            	            break;

            	    }


            	    char_literal270=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator6005); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal270_tree = 
            	    (Object)adaptor.create(char_literal270)
            	    ;
            	    adaptor.addChild(root_0, char_literal270_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:599:48: '(' ( parameter_type_list )? ')'
            	    {
            	    char_literal271=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator6009); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal271_tree = 
            	    (Object)adaptor.create(char_literal271)
            	    ;
            	    adaptor.addChild(root_0, char_literal271_tree);
            	    }

            	    // nesC.g:599:52: ( parameter_type_list )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==ASYNC||LA74_0==AUTO||LA74_0==CHAR||(LA74_0 >= COMMA && LA74_0 <= COMMAND)||LA74_0==CONST||LA74_0==DEFAULT||LA74_0==DUTY||LA74_0==ENUM||(LA74_0 >= EVENT && LA74_0 <= EXTERN)||(LA74_0 >= INLINE && LA74_0 <= INT8_T)||LA74_0==LONG||LA74_0==NORACE||(LA74_0 >= NXLE_UINT16_T && LA74_0 <= NX_UNION)||LA74_0==RAW_IDENTIFIER||LA74_0==REGISTER||LA74_0==RESTRICT||LA74_0==SHORT||LA74_0==SIGNED||LA74_0==STATIC||LA74_0==STRUCT||LA74_0==TASK||(LA74_0 >= UINT16_T && LA74_0 <= UINT8_T)||(LA74_0 >= UNION && LA74_0 <= UNSIGNED)||(LA74_0 >= VOID && LA74_0 <= VOLATILE)) ) {
            	        alt74=1;
            	    }
            	    else if ( (LA74_0==RPARENS) ) {
            	        int LA74_2 = input.LA(2);

            	        if ( (synpred152_nesC()) ) {
            	            alt74=1;
            	        }
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // nesC.g:599:52: parameter_type_list
            	            {
            	            pushFollow(FOLLOW_parameter_type_list_in_direct_abstract_declarator6011);
            	            parameter_type_list272=parameter_type_list();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list272.getTree());

            	            }
            	            break;

            	    }


            	    char_literal273=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator6014); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal273_tree = 
            	    (Object)adaptor.create(char_literal273)
            	    ;
            	    adaptor.addChild(root_0, char_literal273_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:602:1: typedef_name : id= RAW_IDENTIFIER {...}?;
    public final nesCParser.typedef_name_return typedef_name() throws RecognitionException {
        nesCParser.typedef_name_return retval = new nesCParser.typedef_name_return();
        retval.start = input.LT(1);

        int typedef_name_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // nesC.g:603:5: (id= RAW_IDENTIFIER {...}?)
            // nesC.g:603:10: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name6043); if (state.failed) return retval;
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:612:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
    public final nesCParser.initializer_return initializer() throws RecognitionException {
        nesCParser.initializer_return retval = new nesCParser.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal275=null;
        Token char_literal277=null;
        Token char_literal278=null;
        nesCParser.assignment_expression_return assignment_expression274 =null;

        nesCParser.initializer_list_return initializer_list276 =null;


        Object char_literal275_tree=null;
        Object char_literal277_tree=null;
        Object char_literal278_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // nesC.g:613:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==AMP||LA77_0==BITCOMPLEMENT||LA77_0==CALL||LA77_0==CHARACTER_LITERAL||LA77_0==CONSTANT||LA77_0==LPARENS||LA77_0==MINUS||LA77_0==MINUSMINUS||LA77_0==NOT||LA77_0==PLUS||LA77_0==PLUSPLUS||LA77_0==POST||LA77_0==RAW_IDENTIFIER||LA77_0==SIGNAL||LA77_0==SIZEOF||LA77_0==STAR||LA77_0==STRING_LITERAL) ) {
                alt77=1;
            }
            else if ( (LA77_0==LBRACE) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }
            switch (alt77) {
                case 1 :
                    // nesC.g:613:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer6083);
                    assignment_expression274=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression274.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:614:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal275=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer6094); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal275);


                    pushFollow(FOLLOW_initializer_list_in_initializer6096);
                    initializer_list276=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list276.getTree());

                    // nesC.g:614:31: ( ',' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==COMMA) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // nesC.g:614:31: ','
                            {
                            char_literal277=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer6098); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal277);


                            }
                            break;

                    }


                    char_literal278=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer6101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal278);


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
                    // 614:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // nesC.g:614:43: ^( INITIALIZER_LIST initializer_list )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:616:1: initializer_list : initializer ( ',' initializer )* -> ( initializer )+ ;
    public final nesCParser.initializer_list_return initializer_list() throws RecognitionException {
        nesCParser.initializer_list_return retval = new nesCParser.initializer_list_return();
        retval.start = input.LT(1);

        int initializer_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal280=null;
        nesCParser.initializer_return initializer279 =null;

        nesCParser.initializer_return initializer281 =null;


        Object char_literal280_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // nesC.g:617:5: ( initializer ( ',' initializer )* -> ( initializer )+ )
            // nesC.g:617:10: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializer_list6128);
            initializer279=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer279.getTree());

            // nesC.g:617:22: ( ',' initializer )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==COMMA) ) {
                    int LA78_1 = input.LA(2);

                    if ( (LA78_1==AMP||LA78_1==BITCOMPLEMENT||LA78_1==CALL||LA78_1==CHARACTER_LITERAL||LA78_1==CONSTANT||LA78_1==LBRACE||LA78_1==LPARENS||LA78_1==MINUS||LA78_1==MINUSMINUS||LA78_1==NOT||LA78_1==PLUS||LA78_1==PLUSPLUS||LA78_1==POST||LA78_1==RAW_IDENTIFIER||LA78_1==SIGNAL||LA78_1==SIZEOF||LA78_1==STAR||LA78_1==STRING_LITERAL) ) {
                        alt78=1;
                    }


                }


                switch (alt78) {
            	case 1 :
            	    // nesC.g:617:23: ',' initializer
            	    {
            	    char_literal280=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list6131); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal280);


            	    pushFollow(FOLLOW_initializer_in_initializer_list6133);
            	    initializer281=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer281.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
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
            // 617:41: -> ( initializer )+
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:623:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement | line_directive );
    public final nesCParser.statement_return statement() throws RecognitionException {
        nesCParser.statement_return retval = new nesCParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.labeled_statement_return labeled_statement282 =null;

        nesCParser.compound_statement_return compound_statement283 =null;

        nesCParser.expression_statement_return expression_statement284 =null;

        nesCParser.selection_statement_return selection_statement285 =null;

        nesCParser.iteration_statement_return iteration_statement286 =null;

        nesCParser.jump_statement_return jump_statement287 =null;

        nesCParser.atomic_statement_return atomic_statement288 =null;

        nesCParser.line_directive_return line_directive289 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // nesC.g:624:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | atomic_statement | line_directive )
            int alt79=8;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==182) ) {
                    alt79=1;
                }
                else if ( ((LA79_1 >= AMP && LA79_1 <= AND)||LA79_1==ARROW||LA79_1==ASSIGN||LA79_1==BITANDASSIGN||(LA79_1 >= BITOR && LA79_1 <= BITXORASSIGN)||LA79_1==COMMA||(LA79_1 >= DIVASSIGN && LA79_1 <= DIVIDE)||LA79_1==DOT||LA79_1==EQUAL||(LA79_1 >= GREATER && LA79_1 <= GREATEREQUAL)||(LA79_1 >= LBRACKET && LA79_1 <= LESSEQUAL)||(LA79_1 >= LPARENS && LA79_1 <= MODASSIGN)||(LA79_1 >= MODULUS && LA79_1 <= MULASSIGN)||LA79_1==NOTEQUAL||LA79_1==OR||(LA79_1 >= PLUS && LA79_1 <= PLUSPLUS)||(LA79_1 >= RSHIFT && LA79_1 <= RSHIFTASSIGN)||LA79_1==STAR||LA79_1==183||LA79_1==185) ) {
                    alt79=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;

                }
                }
                break;
            case CASE:
            case DEFAULT:
                {
                alt79=1;
                }
                break;
            case LBRACE:
                {
                alt79=2;
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
            case 183:
                {
                alt79=3;
                }
                break;
            case IF:
            case SWITCH:
                {
                alt79=4;
                }
                break;
            case DO:
            case FOR:
            case WHILE:
                {
                alt79=5;
                }
                break;
            case BREAK:
            case CONTINUE:
            case GOTO:
            case RETURN:
                {
                alt79=6;
                }
                break;
            case ATOMIC:
                {
                alt79=7;
                }
                break;
            case HASH:
                {
                alt79=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }

            switch (alt79) {
                case 1 :
                    // nesC.g:624:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement6166);
                    labeled_statement282=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement282.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:625:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement6177);
                    compound_statement283=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement283.getTree());

                    }
                    break;
                case 3 :
                    // nesC.g:626:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement6188);
                    expression_statement284=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement284.getTree());

                    }
                    break;
                case 4 :
                    // nesC.g:627:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement6199);
                    selection_statement285=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement285.getTree());

                    }
                    break;
                case 5 :
                    // nesC.g:628:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement6210);
                    iteration_statement286=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement286.getTree());

                    }
                    break;
                case 6 :
                    // nesC.g:629:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement6221);
                    jump_statement287=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement287.getTree());

                    }
                    break;
                case 7 :
                    // nesC.g:630:10: atomic_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atomic_statement_in_statement6232);
                    atomic_statement288=atomic_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomic_statement288.getTree());

                    }
                    break;
                case 8 :
                    // nesC.g:631:10: line_directive
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_line_directive_in_statement6243);
                    line_directive289=line_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive289.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:634:1: atomic_statement : ATOMIC statement -> ^( ATOMIC statement ) ;
    public final nesCParser.atomic_statement_return atomic_statement() throws RecognitionException {
        nesCParser.atomic_statement_return retval = new nesCParser.atomic_statement_return();
        retval.start = input.LT(1);

        int atomic_statement_StartIndex = input.index();

        Object root_0 = null;

        Token ATOMIC290=null;
        nesCParser.statement_return statement291 =null;


        Object ATOMIC290_tree=null;
        RewriteRuleTokenStream stream_ATOMIC=new RewriteRuleTokenStream(adaptor,"token ATOMIC");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // nesC.g:635:5: ( ATOMIC statement -> ^( ATOMIC statement ) )
            // nesC.g:635:10: ATOMIC statement
            {
            ATOMIC290=(Token)match(input,ATOMIC,FOLLOW_ATOMIC_in_atomic_statement6267); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATOMIC.add(ATOMIC290);


            pushFollow(FOLLOW_statement_in_atomic_statement6269);
            statement291=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement291.getTree());

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
            // 635:27: -> ^( ATOMIC statement )
            {
                // nesC.g:635:30: ^( ATOMIC statement )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:637:1: labeled_statement : ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final nesCParser.labeled_statement_return labeled_statement() throws RecognitionException {
        nesCParser.labeled_statement_return retval = new nesCParser.labeled_statement_return();
        retval.start = input.LT(1);

        int labeled_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal293=null;
        Token CASE295=null;
        Token char_literal297=null;
        Token DEFAULT299=null;
        Token char_literal300=null;
        nesCParser.identifier_return identifier292 =null;

        nesCParser.statement_return statement294 =null;

        nesCParser.constant_expression_return constant_expression296 =null;

        nesCParser.statement_return statement298 =null;

        nesCParser.statement_return statement301 =null;


        Object char_literal293_tree=null;
        Object CASE295_tree=null;
        Object char_literal297_tree=null;
        Object DEFAULT299_tree=null;
        Object char_literal300_tree=null;
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // nesC.g:638:5: ( identifier ':' statement -> ^( LABELED_STATEMENT identifier statement ) | CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
            int alt80=3;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                alt80=1;
                }
                break;
            case CASE:
                {
                alt80=2;
                }
                break;
            case DEFAULT:
                {
                alt80=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }

            switch (alt80) {
                case 1 :
                    // nesC.g:638:10: identifier ':' statement
                    {
                    pushFollow(FOLLOW_identifier_in_labeled_statement6296);
                    identifier292=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier292.getTree());

                    char_literal293=(Token)match(input,182,FOLLOW_182_in_labeled_statement6298); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_182.add(char_literal293);


                    pushFollow(FOLLOW_statement_in_labeled_statement6300);
                    statement294=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement294.getTree());

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
                    // 638:35: -> ^( LABELED_STATEMENT identifier statement )
                    {
                        // nesC.g:638:38: ^( LABELED_STATEMENT identifier statement )
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
                    // nesC.g:639:10: CASE constant_expression ':' statement
                    {
                    CASE295=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement6321); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE295);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement6323);
                    constant_expression296=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression296.getTree());

                    char_literal297=(Token)match(input,182,FOLLOW_182_in_labeled_statement6325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_182.add(char_literal297);


                    pushFollow(FOLLOW_statement_in_labeled_statement6327);
                    statement298=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement298.getTree());

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
                    // 639:49: -> ^( CASE constant_expression statement )
                    {
                        // nesC.g:639:52: ^( CASE constant_expression statement )
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
                    // nesC.g:640:10: DEFAULT ':' statement
                    {
                    DEFAULT299=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement6348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT299);


                    char_literal300=(Token)match(input,182,FOLLOW_182_in_labeled_statement6350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_182.add(char_literal300);


                    pushFollow(FOLLOW_statement_in_labeled_statement6352);
                    statement301=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement301.getTree());

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
                    // 640:32: -> ^( DEFAULT statement )
                    {
                        // nesC.g:640:35: ^( DEFAULT statement )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:645:1: compound_statement : '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) ;
    public final nesCParser.compound_statement_return compound_statement() throws RecognitionException {
        nesCParser.compound_statement_return retval = new nesCParser.compound_statement_return();
        retval.start = input.LT(1);

        int compound_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal302=null;
        Token char_literal304=null;
        nesCParser.block_item_return block_item303 =null;


        Object char_literal302_tree=null;
        Object char_literal304_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_block_item=new RewriteRuleSubtreeStream(adaptor,"rule block_item");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // nesC.g:646:5: ( '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) )
            // nesC.g:646:10: '{' ( block_item )* '}'
            {
            char_literal302=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement6378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal302);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:647:10: ( block_item )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==AMP||(LA81_0 >= ASYNC && LA81_0 <= ATOMIC)||LA81_0==AUTO||LA81_0==BITCOMPLEMENT||(LA81_0 >= BREAK && LA81_0 <= CASE)||(LA81_0 >= CHAR && LA81_0 <= CHARACTER_LITERAL)||LA81_0==COMMAND||(LA81_0 >= CONST && LA81_0 <= CONTINUE)||LA81_0==DEFAULT||LA81_0==DO||LA81_0==DUTY||LA81_0==ENUM||(LA81_0 >= EVENT && LA81_0 <= EXTERN)||LA81_0==FOR||LA81_0==GOTO||LA81_0==HASH||LA81_0==IF||(LA81_0 >= INLINE && LA81_0 <= INT8_T)||LA81_0==LBRACE||(LA81_0 >= LONG && LA81_0 <= LPARENS)||LA81_0==MINUS||LA81_0==MINUSMINUS||(LA81_0 >= NORACE && LA81_0 <= NOT)||(LA81_0 >= NXLE_UINT16_T && LA81_0 <= NX_UNION)||LA81_0==PLUS||LA81_0==PLUSPLUS||LA81_0==POST||LA81_0==RAW_IDENTIFIER||LA81_0==REGISTER||(LA81_0 >= RESTRICT && LA81_0 <= RETURN)||(LA81_0 >= SHORT && LA81_0 <= SIZEOF)||LA81_0==STAR||(LA81_0 >= STATIC && LA81_0 <= UINT8_T)||(LA81_0 >= UNION && LA81_0 <= UNSIGNED)||(LA81_0 >= VOID && LA81_0 <= WHILE)||LA81_0==183) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // nesC.g:647:10: block_item
            	    {
            	    pushFollow(FOLLOW_block_item_in_compound_statement6391);
            	    block_item303=block_item();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block_item.add(block_item303.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal304=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement6409); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal304);


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
            // 648:44: -> ^( COMPOUND_STATEMENT ( block_item )* )
            {
                // nesC.g:648:47: ^( COMPOUND_STATEMENT ( block_item )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // nesC.g:648:68: ( block_item )*
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:650:1: block_item : ( declaration | statement );
    public final nesCParser.block_item_return block_item() throws RecognitionException {
        nesCParser.block_item_return retval = new nesCParser.block_item_return();
        retval.start = input.LT(1);

        int block_item_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_return declaration305 =null;

        nesCParser.statement_return statement306 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // nesC.g:651:5: ( declaration | statement )
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // nesC.g:651:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_block_item6433);
                    declaration305=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration305.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:652:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_block_item6444);
                    statement306=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement306.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:658:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final nesCParser.expression_statement_return expression_statement() throws RecognitionException {
        nesCParser.expression_statement_return retval = new nesCParser.expression_statement_return();
        retval.start = input.LT(1);

        int expression_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal308=null;
        nesCParser.expression_return expression307 =null;


        Object char_literal308_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // nesC.g:659:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // nesC.g:659:10: ( expression )? ';'
            {
            // nesC.g:659:10: ( expression )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==AMP||LA83_0==BITCOMPLEMENT||LA83_0==CALL||LA83_0==CHARACTER_LITERAL||LA83_0==CONSTANT||LA83_0==LPARENS||LA83_0==MINUS||LA83_0==MINUSMINUS||LA83_0==NOT||LA83_0==PLUS||LA83_0==PLUSPLUS||LA83_0==POST||LA83_0==RAW_IDENTIFIER||LA83_0==SIGNAL||LA83_0==SIZEOF||LA83_0==STAR||LA83_0==STRING_LITERAL) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // nesC.g:659:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement6467);
                    expression307=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression307.getTree());

                    }
                    break;

            }


            char_literal308=(Token)match(input,183,FOLLOW_183_in_expression_statement6470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_183.add(char_literal308);


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
            // 659:26: -> ^( STATEMENT ( expression )? )
            {
                // nesC.g:659:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // nesC.g:659:41: ( expression )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:661:1: selection_statement : ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final nesCParser.selection_statement_return selection_statement() throws RecognitionException {
        nesCParser.selection_statement_return retval = new nesCParser.selection_statement_return();
        retval.start = input.LT(1);

        int selection_statement_StartIndex = input.index();

        Object root_0 = null;

        Token IF309=null;
        Token char_literal310=null;
        Token char_literal312=null;
        Token ELSE314=null;
        Token SWITCH316=null;
        Token char_literal317=null;
        Token char_literal319=null;
        nesCParser.expression_return expression311 =null;

        nesCParser.statement_return statement313 =null;

        nesCParser.statement_return statement315 =null;

        nesCParser.expression_return expression318 =null;

        nesCParser.statement_return statement320 =null;


        Object IF309_tree=null;
        Object char_literal310_tree=null;
        Object char_literal312_tree=null;
        Object ELSE314_tree=null;
        Object SWITCH316_tree=null;
        Object char_literal317_tree=null;
        Object char_literal319_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // nesC.g:662:5: ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==IF) ) {
                alt85=1;
            }
            else if ( (LA85_0==SWITCH) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }
            switch (alt85) {
                case 1 :
                    // nesC.g:662:10: IF '(' expression ')' statement ( ELSE statement )?
                    {
                    IF309=(Token)match(input,IF,FOLLOW_IF_in_selection_statement6498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF309);


                    char_literal310=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal310);


                    pushFollow(FOLLOW_expression_in_selection_statement6502);
                    expression311=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression311.getTree());

                    char_literal312=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal312);


                    pushFollow(FOLLOW_statement_in_selection_statement6506);
                    statement313=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement313.getTree());

                    // nesC.g:662:42: ( ELSE statement )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==ELSE) ) {
                        int LA84_1 = input.LA(2);

                        if ( (synpred169_nesC()) ) {
                            alt84=1;
                        }
                    }
                    switch (alt84) {
                        case 1 :
                            // nesC.g:662:43: ELSE statement
                            {
                            ELSE314=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement6509); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE314);


                            pushFollow(FOLLOW_statement_in_selection_statement6511);
                            statement315=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(statement315.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: statement, statement, IF, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 663:14: -> ^( IF expression statement ( statement )? )
                    {
                        // nesC.g:663:17: ^( IF expression statement ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        // nesC.g:663:43: ( statement )?
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
                    // nesC.g:664:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH316=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement6550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH316);


                    char_literal317=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement6552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal317);


                    pushFollow(FOLLOW_expression_in_selection_statement6554);
                    expression318=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression318.getTree());

                    char_literal319=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement6556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal319);


                    pushFollow(FOLLOW_statement_in_selection_statement6558);
                    statement320=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement320.getTree());

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
                    // 665:14: -> ^( SWITCH expression statement )
                    {
                        // nesC.g:665:17: ^( SWITCH expression statement )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:671:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final nesCParser.iteration_statement_return iteration_statement() throws RecognitionException {
        nesCParser.iteration_statement_return retval = new nesCParser.iteration_statement_return();
        retval.start = input.LT(1);

        int iteration_statement_StartIndex = input.index();

        Object root_0 = null;

        Token WHILE321=null;
        Token char_literal322=null;
        Token char_literal324=null;
        Token DO326=null;
        Token WHILE328=null;
        Token char_literal329=null;
        Token char_literal331=null;
        Token char_literal332=null;
        Token FOR333=null;
        Token char_literal334=null;
        Token char_literal335=null;
        Token char_literal336=null;
        Token char_literal337=null;
        nesCParser.expression_return init =null;

        nesCParser.expression_return cond =null;

        nesCParser.expression_return iter =null;

        nesCParser.expression_return expression323 =null;

        nesCParser.statement_return statement325 =null;

        nesCParser.statement_return statement327 =null;

        nesCParser.expression_return expression330 =null;

        nesCParser.statement_return statement338 =null;


        Object WHILE321_tree=null;
        Object char_literal322_tree=null;
        Object char_literal324_tree=null;
        Object DO326_tree=null;
        Object WHILE328_tree=null;
        Object char_literal329_tree=null;
        Object char_literal331_tree=null;
        Object char_literal332_tree=null;
        Object FOR333_tree=null;
        Object char_literal334_tree=null;
        Object char_literal335_tree=null;
        Object char_literal336_tree=null;
        Object char_literal337_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // nesC.g:672:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | DO statement WHILE '(' expression ')' ';' -> ^( DO statement expression ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
            int alt89=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt89=1;
                }
                break;
            case DO:
                {
                alt89=2;
                }
                break;
            case FOR:
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
                    // nesC.g:672:10: WHILE '(' expression ')' statement
                    {
                    WHILE321=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE321);


                    char_literal322=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal322);


                    pushFollow(FOLLOW_expression_in_iteration_statement6608);
                    expression323=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression323.getTree());

                    char_literal324=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal324);


                    pushFollow(FOLLOW_statement_in_iteration_statement6612);
                    statement325=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement325.getTree());

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
                    // 672:45: -> ^( WHILE expression statement )
                    {
                        // nesC.g:672:48: ^( WHILE expression statement )
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
                    // nesC.g:673:10: DO statement WHILE '(' expression ')' ';'
                    {
                    DO326=(Token)match(input,DO,FOLLOW_DO_in_iteration_statement6633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO326);


                    pushFollow(FOLLOW_statement_in_iteration_statement6635);
                    statement327=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement327.getTree());

                    WHILE328=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement6637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE328);


                    char_literal329=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal329);


                    pushFollow(FOLLOW_expression_in_iteration_statement6641);
                    expression330=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression330.getTree());

                    char_literal331=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal331);


                    char_literal332=(Token)match(input,183,FOLLOW_183_in_iteration_statement6645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal332);


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
                    // 673:52: -> ^( DO statement expression )
                    {
                        // nesC.g:673:55: ^( DO statement expression )
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
                    // nesC.g:674:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR333=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement6666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR333);


                    char_literal334=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement6668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal334);


                    // nesC.g:674:22: (init= expression )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==AMP||LA86_0==BITCOMPLEMENT||LA86_0==CALL||LA86_0==CHARACTER_LITERAL||LA86_0==CONSTANT||LA86_0==LPARENS||LA86_0==MINUS||LA86_0==MINUSMINUS||LA86_0==NOT||LA86_0==PLUS||LA86_0==PLUSPLUS||LA86_0==POST||LA86_0==RAW_IDENTIFIER||LA86_0==SIGNAL||LA86_0==SIZEOF||LA86_0==STAR||LA86_0==STRING_LITERAL) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // nesC.g:674:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6672);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal335=(Token)match(input,183,FOLLOW_183_in_iteration_statement6675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal335);


                    // nesC.g:674:43: (cond= expression )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==AMP||LA87_0==BITCOMPLEMENT||LA87_0==CALL||LA87_0==CHARACTER_LITERAL||LA87_0==CONSTANT||LA87_0==LPARENS||LA87_0==MINUS||LA87_0==MINUSMINUS||LA87_0==NOT||LA87_0==PLUS||LA87_0==PLUSPLUS||LA87_0==POST||LA87_0==RAW_IDENTIFIER||LA87_0==SIGNAL||LA87_0==SIZEOF||LA87_0==STAR||LA87_0==STRING_LITERAL) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // nesC.g:674:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6679);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal336=(Token)match(input,183,FOLLOW_183_in_iteration_statement6682); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal336);


                    // nesC.g:674:64: (iter= expression )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==AMP||LA88_0==BITCOMPLEMENT||LA88_0==CALL||LA88_0==CHARACTER_LITERAL||LA88_0==CONSTANT||LA88_0==LPARENS||LA88_0==MINUS||LA88_0==MINUSMINUS||LA88_0==NOT||LA88_0==PLUS||LA88_0==PLUSPLUS||LA88_0==POST||LA88_0==RAW_IDENTIFIER||LA88_0==SIGNAL||LA88_0==SIZEOF||LA88_0==STAR||LA88_0==STRING_LITERAL) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // nesC.g:674:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement6686);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal337=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement6689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal337);


                    pushFollow(FOLLOW_statement_in_iteration_statement6691);
                    statement338=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement338.getTree());

                    // AST REWRITE
                    // elements: statement, iter, cond, FOR, init
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
                    // 675:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // nesC.g:675:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // nesC.g:675:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // nesC.g:675:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:676:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // nesC.g:676:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // nesC.g:677:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // nesC.g:677:40: ( $iter)?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:679:1: jump_statement : ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) );
    public final nesCParser.jump_statement_return jump_statement() throws RecognitionException {
        nesCParser.jump_statement_return retval = new nesCParser.jump_statement_return();
        retval.start = input.LT(1);

        int jump_statement_StartIndex = input.index();

        Object root_0 = null;

        Token GOTO339=null;
        Token char_literal341=null;
        Token CONTINUE342=null;
        Token char_literal343=null;
        Token BREAK344=null;
        Token char_literal345=null;
        Token RETURN346=null;
        Token char_literal348=null;
        nesCParser.identifier_return identifier340 =null;

        nesCParser.expression_return expression347 =null;


        Object GOTO339_tree=null;
        Object char_literal341_tree=null;
        Object CONTINUE342_tree=null;
        Object char_literal343_tree=null;
        Object BREAK344_tree=null;
        Object char_literal345_tree=null;
        Object RETURN346_tree=null;
        Object char_literal348_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_GOTO=new RewriteRuleTokenStream(adaptor,"token GOTO");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // nesC.g:680:5: ( GOTO identifier ';' -> ^( GOTO identifier ) | CONTINUE ';' -> CONTINUE | BREAK ';' -> BREAK | RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
            int alt91=4;
            switch ( input.LA(1) ) {
            case GOTO:
                {
                alt91=1;
                }
                break;
            case CONTINUE:
                {
                alt91=2;
                }
                break;
            case BREAK:
                {
                alt91=3;
                }
                break;
            case RETURN:
                {
                alt91=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;

            }

            switch (alt91) {
                case 1 :
                    // nesC.g:680:10: GOTO identifier ';'
                    {
                    GOTO339=(Token)match(input,GOTO,FOLLOW_GOTO_in_jump_statement6798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GOTO.add(GOTO339);


                    pushFollow(FOLLOW_identifier_in_jump_statement6800);
                    identifier340=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier340.getTree());

                    char_literal341=(Token)match(input,183,FOLLOW_183_in_jump_statement6802); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal341);


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
                    // 680:30: -> ^( GOTO identifier )
                    {
                        // nesC.g:680:33: ^( GOTO identifier )
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
                    // nesC.g:681:10: CONTINUE ';'
                    {
                    CONTINUE342=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement6821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE342);


                    char_literal343=(Token)match(input,183,FOLLOW_183_in_jump_statement6823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal343);


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
                    // 681:23: -> CONTINUE
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
                    // nesC.g:682:10: BREAK ';'
                    {
                    BREAK344=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement6838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK344);


                    char_literal345=(Token)match(input,183,FOLLOW_183_in_jump_statement6840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal345);


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
                    // 682:20: -> BREAK
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
                    // nesC.g:683:10: RETURN ( expression )? ';'
                    {
                    RETURN346=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement6855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN346);


                    // nesC.g:683:17: ( expression )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==AMP||LA90_0==BITCOMPLEMENT||LA90_0==CALL||LA90_0==CHARACTER_LITERAL||LA90_0==CONSTANT||LA90_0==LPARENS||LA90_0==MINUS||LA90_0==MINUSMINUS||LA90_0==NOT||LA90_0==PLUS||LA90_0==PLUSPLUS||LA90_0==POST||LA90_0==RAW_IDENTIFIER||LA90_0==SIGNAL||LA90_0==SIZEOF||LA90_0==STAR||LA90_0==STRING_LITERAL) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // nesC.g:683:17: expression
                            {
                            pushFollow(FOLLOW_expression_in_jump_statement6857);
                            expression347=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression347.getTree());

                            }
                            break;

                    }


                    char_literal348=(Token)match(input,183,FOLLOW_183_in_jump_statement6860); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal348);


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
                    // 683:33: -> ^( RETURN ( expression )? )
                    {
                        // nesC.g:683:36: ^( RETURN ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_RETURN.nextNode()
                        , root_1);

                        // nesC.g:683:45: ( expression )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:689:1: translation_unit : ( external_declaration | line_directive )+ ;
    public final nesCParser.translation_unit_return translation_unit() throws RecognitionException {
        nesCParser.translation_unit_return retval = new nesCParser.translation_unit_return();
        retval.start = input.LT(1);

        int translation_unit_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.external_declaration_return external_declaration349 =null;

        nesCParser.line_directive_return line_directive350 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // nesC.g:690:5: ( ( external_declaration | line_directive )+ )
            // nesC.g:690:10: ( external_declaration | line_directive )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:690:10: ( external_declaration | line_directive )+
            int cnt92=0;
            loop92:
            do {
                int alt92=3;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==ASYNC||LA92_0==AUTO||LA92_0==CHAR||LA92_0==COMMAND||LA92_0==CONST||LA92_0==DEFAULT||LA92_0==DUTY||LA92_0==ENUM||(LA92_0 >= EVENT && LA92_0 <= EXTERN)||(LA92_0 >= INLINE && LA92_0 <= INT8_T)||LA92_0==LONG||LA92_0==NORACE||(LA92_0 >= NXLE_UINT16_T && LA92_0 <= NX_UNION)||LA92_0==RAW_IDENTIFIER||LA92_0==REGISTER||LA92_0==RESTRICT||LA92_0==SHORT||LA92_0==SIGNED||LA92_0==STATIC||LA92_0==STRUCT||(LA92_0 >= TASK && LA92_0 <= UINT8_T)||(LA92_0 >= UNION && LA92_0 <= UNSIGNED)||(LA92_0 >= VOID && LA92_0 <= VOLATILE)) ) {
                    alt92=1;
                }
                else if ( (LA92_0==HASH) ) {
                    alt92=2;
                }


                switch (alt92) {
            	case 1 :
            	    // nesC.g:690:11: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit6896);
            	    external_declaration349=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration349.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:690:34: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit6900);
            	    line_directive350=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive350.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt92 >= 1 ) break loop92;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(92, input);
                        throw eee;
                }
                cnt92++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:693:1: external_declaration : declaration ;
    public final nesCParser.external_declaration_return external_declaration() throws RecognitionException {
        nesCParser.external_declaration_return retval = new nesCParser.external_declaration_return();
        retval.start = input.LT(1);

        int external_declaration_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_return declaration351 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // nesC.g:694:5: ( declaration )
            // nesC.g:694:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration6918);
            declaration351=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration351.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:708:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )? -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final nesCParser.line_directive_return line_directive() throws RecognitionException {
        nesCParser.line_directive_return retval = new nesCParser.line_directive_return();
        retval.start = input.LT(1);

        int line_directive_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal352=null;
        Token CONSTANT353=null;
        Token STRING_LITERAL354=null;
        Token CONSTANT355=null;

        Object char_literal352_tree=null;
        Object CONSTANT353_tree=null;
        Object STRING_LITERAL354_tree=null;
        Object CONSTANT355_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // nesC.g:709:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )? -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // nesC.g:709:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )?
            {
            char_literal352=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive6945); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal352);


            CONSTANT353=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive6947); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT353);


            STRING_LITERAL354=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive6949); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL354);


            // nesC.g:709:38: ( CONSTANT )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==CONSTANT) ) {
                int LA93_1 = input.LA(2);

                if ( (synpred182_nesC()) ) {
                    alt93=1;
                }
            }
            switch (alt93) {
                case 1 :
                    // nesC.g:709:38: CONSTANT
                    {
                    CONSTANT355=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive6951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT355);


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
            // 709:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // nesC.g:709:51: ^( LINE_DIRECTIVE STRING_LITERAL )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:711:1: function_definition : declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement ;
    public final nesCParser.function_definition_return function_definition() throws RecognitionException {
        nesCParser.function_definition_return retval = new nesCParser.function_definition_return();
        retval.start = input.LT(1);

        int function_definition_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.declaration_specifiers_return declaration_specifiers356 =null;

        nesCParser.declarator_return declarator357 =null;

        nesCParser.attributes_return attributes358 =null;

        nesCParser.compound_statement_return compound_statement359 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // nesC.g:712:5: ( declaration_specifiers declarator ( attributes )? compound_statement -> declaration_specifiers declarator ( attributes )? compound_statement )
            // nesC.g:712:10: declaration_specifiers declarator ( attributes )? compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition6979);
            declaration_specifiers356=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers356.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition6981);
            declarator357=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator357.getTree());

            // nesC.g:712:44: ( attributes )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ATTRIBUTE) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // nesC.g:712:44: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_function_definition6983);
                    attributes358=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes358.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compound_statement_in_function_definition6986);
            compound_statement359=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement359.getTree());

            // AST REWRITE
            // elements: declaration_specifiers, attributes, declarator, compound_statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 713:13: -> declaration_specifiers declarator ( attributes )? compound_statement
            {
                adaptor.addChild(root_0, stream_declaration_specifiers.nextTree());

                adaptor.addChild(root_0, stream_declarator.nextTree());

                // nesC.g:713:50: ( attributes )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:723:1: nesC_file : ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) );
    public final nesCParser.nesC_file_return nesC_file() throws RecognitionException {
        nesCParser.nesC_file_return retval = new nesCParser.nesC_file_return();
        retval.start = input.LT(1);

        int nesC_file_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.translation_unit_return translation_unit360 =null;

        nesCParser.interface_definition_return interface_definition361 =null;

        nesCParser.translation_unit_return translation_unit362 =null;

        nesCParser.component_return component363 =null;


        RewriteRuleSubtreeStream stream_component=new RewriteRuleSubtreeStream(adaptor,"rule component");
        RewriteRuleSubtreeStream stream_interface_definition=new RewriteRuleSubtreeStream(adaptor,"rule interface_definition");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // nesC.g:724:5: ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) )
            int alt97=2;
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
                int LA97_1 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 1, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA97_2 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA97_3 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA97_4 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA97_5 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA97_6 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA97_7 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA97_8 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 8, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA97_9 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 9, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA97_10 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA97_11 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 11, input);

                    throw nvae;

                }
                }
                break;
            case INT64_T:
                {
                int LA97_12 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 12, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA97_13 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 13, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA97_14 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 14, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA97_15 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 15, input);

                    throw nvae;

                }
                }
                break;
            case UINT64_T:
                {
                int LA97_16 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 16, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA97_17 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 17, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA97_18 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 18, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA97_19 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 19, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT64_T:
                {
                int LA97_20 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 20, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT8_T:
                {
                int LA97_21 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 21, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT16_T:
                {
                int LA97_22 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 22, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT32_T:
                {
                int LA97_23 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 23, input);

                    throw nvae;

                }
                }
                break;
            case NXLE_UINT64_T:
                {
                int LA97_24 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 24, input);

                    throw nvae;

                }
                }
                break;
            case STRUCT:
                {
                int LA97_25 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 25, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case NX_UNION:
            case UNION:
                {
                int LA97_26 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 26, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA97_27 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 27, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA97_28 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 28, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
            case RESTRICT:
            case VOLATILE:
                {
                int LA97_29 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 29, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA97_30 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 30, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA97_31 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 31, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                int LA97_32 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 32, input);

                    throw nvae;

                }
                }
                break;
            case HASH:
                {
                int LA97_33 = input.LA(2);

                if ( (synpred185_nesC()) ) {
                    alt97=1;
                }
                else if ( (true) ) {
                    alt97=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 33, input);

                    throw nvae;

                }
                }
                break;
            case INTERFACE:
                {
                alt97=1;
                }
                break;
            case COMPONENT:
            case CONFIGURATION:
            case GENERIC:
            case MODULE:
                {
                alt97=2;
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
                    // nesC.g:724:10: ( translation_unit )? interface_definition
                    {
                    // nesC.g:724:10: ( translation_unit )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==ASYNC||LA95_0==AUTO||LA95_0==CHAR||LA95_0==COMMAND||LA95_0==CONST||LA95_0==DEFAULT||LA95_0==DUTY||LA95_0==ENUM||(LA95_0 >= EVENT && LA95_0 <= EXTERN)||LA95_0==HASH||(LA95_0 >= INLINE && LA95_0 <= INT8_T)||LA95_0==LONG||LA95_0==NORACE||(LA95_0 >= NXLE_UINT16_T && LA95_0 <= NX_UNION)||LA95_0==RAW_IDENTIFIER||LA95_0==REGISTER||LA95_0==RESTRICT||LA95_0==SHORT||LA95_0==SIGNED||LA95_0==STATIC||LA95_0==STRUCT||(LA95_0 >= TASK && LA95_0 <= UINT8_T)||(LA95_0 >= UNION && LA95_0 <= UNSIGNED)||(LA95_0 >= VOID && LA95_0 <= VOLATILE)) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // nesC.g:724:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_nesC_file7035);
                            translation_unit360=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit360.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_interface_definition_in_nesC_file7038);
                    interface_definition361=interface_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_definition.add(interface_definition361.getTree());

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
                    // 724:49: -> ^( FILE ( translation_unit )? interface_definition )
                    {
                        // nesC.g:724:52: ^( FILE ( translation_unit )? interface_definition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // nesC.g:724:59: ( translation_unit )?
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
                    // nesC.g:725:10: ( translation_unit )? component
                    {
                    // nesC.g:725:10: ( translation_unit )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==ASYNC||LA96_0==AUTO||LA96_0==CHAR||LA96_0==COMMAND||LA96_0==CONST||LA96_0==DEFAULT||LA96_0==DUTY||LA96_0==ENUM||(LA96_0 >= EVENT && LA96_0 <= EXTERN)||LA96_0==HASH||(LA96_0 >= INLINE && LA96_0 <= INT8_T)||LA96_0==LONG||LA96_0==NORACE||(LA96_0 >= NXLE_UINT16_T && LA96_0 <= NX_UNION)||LA96_0==RAW_IDENTIFIER||LA96_0==REGISTER||LA96_0==RESTRICT||LA96_0==SHORT||LA96_0==SIGNED||LA96_0==STATIC||LA96_0==STRUCT||(LA96_0 >= TASK && LA96_0 <= UINT8_T)||(LA96_0 >= UNION && LA96_0 <= UNSIGNED)||(LA96_0 >= VOID && LA96_0 <= VOLATILE)) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // nesC.g:725:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_nesC_file7060);
                            translation_unit362=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit362.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_component_in_nesC_file7063);
                    component363=component();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component.add(component363.getTree());

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
                    // 725:49: -> ^( FILE ( translation_unit )? component )
                    {
                        // nesC.g:725:52: ^( FILE ( translation_unit )? component )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // nesC.g:725:59: ( translation_unit )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:734:1: interface_definition : INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( declaration | line_directive )* '}' -> ^( INTERFACE identifier ( declaration )* ) ;
    public final nesCParser.interface_definition_return interface_definition() throws RecognitionException {
        nesCParser.interface_definition_return retval = new nesCParser.interface_definition_return();
        retval.start = input.LT(1);

        int interface_definition_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE364=null;
        Token char_literal368=null;
        Token char_literal371=null;
        nesCParser.identifier_return identifier365 =null;

        nesCParser.type_parameters_return type_parameters366 =null;

        nesCParser.attributes_return attributes367 =null;

        nesCParser.declaration_return declaration369 =null;

        nesCParser.line_directive_return line_directive370 =null;


        Object INTERFACE364_tree=null;
        Object char_literal368_tree=null;
        Object char_literal371_tree=null;
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

            // nesC.g:735:5: ( INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( declaration | line_directive )* '}' -> ^( INTERFACE identifier ( declaration )* ) )
            // nesC.g:735:10: INTERFACE identifier ( type_parameters )? ( attributes )? '{' ( declaration | line_directive )* '}'
            {
            INTERFACE364=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_definition7111); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE364);


            pushFollow(FOLLOW_identifier_in_interface_definition7113);
            identifier365=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier365.getTree());

            // nesC.g:735:31: ( type_parameters )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==LESS) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // nesC.g:735:31: type_parameters
                    {
                    pushFollow(FOLLOW_type_parameters_in_interface_definition7115);
                    type_parameters366=type_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_parameters.add(type_parameters366.getTree());

                    }
                    break;

            }


            // nesC.g:735:48: ( attributes )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==ATTRIBUTE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // nesC.g:735:48: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_interface_definition7118);
                    attributes367=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes367.getTree());

                    }
                    break;

            }


            char_literal368=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interface_definition7129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal368);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:737:9: ( declaration | line_directive )*
            loop100:
            do {
                int alt100=3;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==ASYNC||LA100_0==AUTO||LA100_0==CHAR||LA100_0==COMMAND||LA100_0==CONST||LA100_0==DEFAULT||LA100_0==DUTY||LA100_0==ENUM||(LA100_0 >= EVENT && LA100_0 <= EXTERN)||(LA100_0 >= INLINE && LA100_0 <= INT8_T)||LA100_0==LONG||LA100_0==NORACE||(LA100_0 >= NXLE_UINT16_T && LA100_0 <= NX_UNION)||LA100_0==RAW_IDENTIFIER||LA100_0==REGISTER||LA100_0==RESTRICT||LA100_0==SHORT||LA100_0==SIGNED||LA100_0==STATIC||LA100_0==STRUCT||(LA100_0 >= TASK && LA100_0 <= UINT8_T)||(LA100_0 >= UNION && LA100_0 <= UNSIGNED)||(LA100_0 >= VOID && LA100_0 <= VOLATILE)) ) {
                    alt100=1;
                }
                else if ( (LA100_0==HASH) ) {
                    alt100=2;
                }


                switch (alt100) {
            	case 1 :
            	    // nesC.g:737:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_interface_definition7142);
            	    declaration369=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration369.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:737:24: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_interface_definition7146);
            	    line_directive370=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive370.getTree());

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal371=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interface_definition7164); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal371);


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
            // 739:13: -> ^( INTERFACE identifier ( declaration )* )
            {
                // nesC.g:739:16: ^( INTERFACE identifier ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:739:39: ( declaration )*
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:741:1: type_parameters : '<' type_parameter_list '>' ;
    public final nesCParser.type_parameters_return type_parameters() throws RecognitionException {
        nesCParser.type_parameters_return retval = new nesCParser.type_parameters_return();
        retval.start = input.LT(1);

        int type_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal372=null;
        Token char_literal374=null;
        nesCParser.type_parameter_list_return type_parameter_list373 =null;


        Object char_literal372_tree=null;
        Object char_literal374_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // nesC.g:742:5: ( '<' type_parameter_list '>' )
            // nesC.g:742:10: '<' type_parameter_list '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal372=(Token)match(input,LESS,FOLLOW_LESS_in_type_parameters7206); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal372_tree = 
            (Object)adaptor.create(char_literal372)
            ;
            adaptor.addChild(root_0, char_literal372_tree);
            }

            pushFollow(FOLLOW_type_parameter_list_in_type_parameters7208);
            type_parameter_list373=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_parameter_list373.getTree());

            char_literal374=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_parameters7210); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal374_tree = 
            (Object)adaptor.create(char_literal374)
            ;
            adaptor.addChild(root_0, char_literal374_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:744:1: type_parameter_list : type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* ;
    public final nesCParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        nesCParser.type_parameter_list_return retval = new nesCParser.type_parameter_list_return();
        retval.start = input.LT(1);

        int type_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal377=null;
        nesCParser.type_specifier_return type_specifier375 =null;

        nesCParser.attributes_return attributes376 =null;

        nesCParser.type_specifier_return type_specifier378 =null;

        nesCParser.attributes_return attributes379 =null;


        Object char_literal377_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // nesC.g:745:5: ( type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )* )
            // nesC.g:745:10: type_specifier ( attributes )? ( ',' type_specifier ( attributes )? )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_specifier_in_type_parameter_list7229);
            type_specifier375=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier375.getTree());

            // nesC.g:745:25: ( attributes )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==ATTRIBUTE) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // nesC.g:745:25: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_type_parameter_list7231);
                    attributes376=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes376.getTree());

                    }
                    break;

            }


            // nesC.g:745:37: ( ',' type_specifier ( attributes )? )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==COMMA) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // nesC.g:745:38: ',' type_specifier ( attributes )?
            	    {
            	    char_literal377=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_parameter_list7235); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal377_tree = 
            	    (Object)adaptor.create(char_literal377)
            	    ;
            	    adaptor.addChild(root_0, char_literal377_tree);
            	    }

            	    pushFollow(FOLLOW_type_specifier_in_type_parameter_list7237);
            	    type_specifier378=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier378.getTree());

            	    // nesC.g:745:57: ( attributes )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==ATTRIBUTE) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // nesC.g:745:57: attributes
            	            {
            	            pushFollow(FOLLOW_attributes_in_type_parameter_list7239);
            	            attributes379=attributes();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes379.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:747:1: component : comp_kind identifier ( comp_parameters )? ( attributes )? component_specification ( implementation )? -> ^( comp_kind identifier component_specification ( implementation )? ) ;
    public final nesCParser.component_return component() throws RecognitionException {
        nesCParser.component_return retval = new nesCParser.component_return();
        retval.start = input.LT(1);

        int component_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.comp_kind_return comp_kind380 =null;

        nesCParser.identifier_return identifier381 =null;

        nesCParser.comp_parameters_return comp_parameters382 =null;

        nesCParser.attributes_return attributes383 =null;

        nesCParser.component_specification_return component_specification384 =null;

        nesCParser.implementation_return implementation385 =null;


        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_comp_parameters=new RewriteRuleSubtreeStream(adaptor,"rule comp_parameters");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_comp_kind=new RewriteRuleSubtreeStream(adaptor,"rule comp_kind");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // nesC.g:748:5: ( comp_kind identifier ( comp_parameters )? ( attributes )? component_specification ( implementation )? -> ^( comp_kind identifier component_specification ( implementation )? ) )
            // nesC.g:748:9: comp_kind identifier ( comp_parameters )? ( attributes )? component_specification ( implementation )?
            {
            pushFollow(FOLLOW_comp_kind_in_component7260);
            comp_kind380=comp_kind();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_comp_kind.add(comp_kind380.getTree());

            pushFollow(FOLLOW_identifier_in_component7262);
            identifier381=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier381.getTree());

            // nesC.g:748:30: ( comp_parameters )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==LPARENS) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // nesC.g:748:30: comp_parameters
                    {
                    pushFollow(FOLLOW_comp_parameters_in_component7264);
                    comp_parameters382=comp_parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_comp_parameters.add(comp_parameters382.getTree());

                    }
                    break;

            }


            // nesC.g:748:47: ( attributes )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==ATTRIBUTE) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // nesC.g:748:47: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_component7267);
                    attributes383=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attributes.add(attributes383.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_component_specification_in_component7278);
            component_specification384=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification384.getTree());

            // nesC.g:750:9: ( implementation )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==IMPLEMENTATION) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // nesC.g:750:9: implementation
                    {
                    pushFollow(FOLLOW_implementation_in_component7288);
                    implementation385=implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementation.add(implementation385.getTree());

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
            // 750:25: -> ^( comp_kind identifier component_specification ( implementation )? )
            {
                // nesC.g:750:28: ^( comp_kind identifier component_specification ( implementation )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_comp_kind.nextNode(), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_component_specification.nextTree());

                // nesC.g:750:75: ( implementation )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:752:1: comp_kind : ( MODULE | CONFIGURATION | COMPONENT | GENERIC MODULE | GENERIC CONFIGURATION );
    public final nesCParser.comp_kind_return comp_kind() throws RecognitionException {
        nesCParser.comp_kind_return retval = new nesCParser.comp_kind_return();
        retval.start = input.LT(1);

        int comp_kind_StartIndex = input.index();

        Object root_0 = null;

        Token MODULE386=null;
        Token CONFIGURATION387=null;
        Token COMPONENT388=null;
        Token GENERIC389=null;
        Token MODULE390=null;
        Token GENERIC391=null;
        Token CONFIGURATION392=null;

        Object MODULE386_tree=null;
        Object CONFIGURATION387_tree=null;
        Object COMPONENT388_tree=null;
        Object GENERIC389_tree=null;
        Object MODULE390_tree=null;
        Object GENERIC391_tree=null;
        Object CONFIGURATION392_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // nesC.g:753:5: ( MODULE | CONFIGURATION | COMPONENT | GENERIC MODULE | GENERIC CONFIGURATION )
            int alt107=5;
            switch ( input.LA(1) ) {
            case MODULE:
                {
                alt107=1;
                }
                break;
            case CONFIGURATION:
                {
                alt107=2;
                }
                break;
            case COMPONENT:
                {
                alt107=3;
                }
                break;
            case GENERIC:
                {
                int LA107_4 = input.LA(2);

                if ( (LA107_4==MODULE) ) {
                    alt107=4;
                }
                else if ( (LA107_4==CONFIGURATION) ) {
                    alt107=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 107, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;

            }

            switch (alt107) {
                case 1 :
                    // nesC.g:753:10: MODULE
                    {
                    root_0 = (Object)adaptor.nil();


                    MODULE386=(Token)match(input,MODULE,FOLLOW_MODULE_in_comp_kind7317); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MODULE386_tree = 
                    (Object)adaptor.create(MODULE386)
                    ;
                    adaptor.addChild(root_0, MODULE386_tree);
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:754:10: CONFIGURATION
                    {
                    root_0 = (Object)adaptor.nil();


                    CONFIGURATION387=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_comp_kind7328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONFIGURATION387_tree = 
                    (Object)adaptor.create(CONFIGURATION387)
                    ;
                    adaptor.addChild(root_0, CONFIGURATION387_tree);
                    }

                    }
                    break;
                case 3 :
                    // nesC.g:755:10: COMPONENT
                    {
                    root_0 = (Object)adaptor.nil();


                    COMPONENT388=(Token)match(input,COMPONENT,FOLLOW_COMPONENT_in_comp_kind7339); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMPONENT388_tree = 
                    (Object)adaptor.create(COMPONENT388)
                    ;
                    adaptor.addChild(root_0, COMPONENT388_tree);
                    }

                    }
                    break;
                case 4 :
                    // nesC.g:756:10: GENERIC MODULE
                    {
                    root_0 = (Object)adaptor.nil();


                    GENERIC389=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_comp_kind7350); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GENERIC389_tree = 
                    (Object)adaptor.create(GENERIC389)
                    ;
                    adaptor.addChild(root_0, GENERIC389_tree);
                    }

                    MODULE390=(Token)match(input,MODULE,FOLLOW_MODULE_in_comp_kind7352); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MODULE390_tree = 
                    (Object)adaptor.create(MODULE390)
                    ;
                    adaptor.addChild(root_0, MODULE390_tree);
                    }

                    }
                    break;
                case 5 :
                    // nesC.g:757:10: GENERIC CONFIGURATION
                    {
                    root_0 = (Object)adaptor.nil();


                    GENERIC391=(Token)match(input,GENERIC,FOLLOW_GENERIC_in_comp_kind7363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GENERIC391_tree = 
                    (Object)adaptor.create(GENERIC391)
                    ;
                    adaptor.addChild(root_0, GENERIC391_tree);
                    }

                    CONFIGURATION392=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_comp_kind7365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONFIGURATION392_tree = 
                    (Object)adaptor.create(CONFIGURATION392)
                    ;
                    adaptor.addChild(root_0, CONFIGURATION392_tree);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:759:1: implementation : ( module_implementation | configuration_implementation );
    public final nesCParser.implementation_return implementation() throws RecognitionException {
        nesCParser.implementation_return retval = new nesCParser.implementation_return();
        retval.start = input.LT(1);

        int implementation_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.module_implementation_return module_implementation393 =null;

        nesCParser.configuration_implementation_return configuration_implementation394 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // nesC.g:760:5: ( module_implementation | configuration_implementation )
            int alt108=2;
            alt108 = dfa108.predict(input);
            switch (alt108) {
                case 1 :
                    // nesC.g:760:10: module_implementation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_module_implementation_in_implementation7384);
                    module_implementation393=module_implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, module_implementation393.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:761:10: configuration_implementation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_configuration_implementation_in_implementation7395);
                    configuration_implementation394=configuration_implementation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_implementation394.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:763:1: comp_parameters : '(' component_parameter_list ')' ;
    public final nesCParser.comp_parameters_return comp_parameters() throws RecognitionException {
        nesCParser.comp_parameters_return retval = new nesCParser.comp_parameters_return();
        retval.start = input.LT(1);

        int comp_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal395=null;
        Token char_literal397=null;
        nesCParser.component_parameter_list_return component_parameter_list396 =null;


        Object char_literal395_tree=null;
        Object char_literal397_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // nesC.g:764:5: ( '(' component_parameter_list ')' )
            // nesC.g:764:10: '(' component_parameter_list ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal395=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_comp_parameters7414); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal395_tree = 
            (Object)adaptor.create(char_literal395)
            ;
            adaptor.addChild(root_0, char_literal395_tree);
            }

            pushFollow(FOLLOW_component_parameter_list_in_comp_parameters7416);
            component_parameter_list396=component_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, component_parameter_list396.getTree());

            char_literal397=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_comp_parameters7418); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal397_tree = 
            (Object)adaptor.create(char_literal397)
            ;
            adaptor.addChild(root_0, char_literal397_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:766:1: component_parameter_list : component_parameter ( ',' component_parameter )* ;
    public final nesCParser.component_parameter_list_return component_parameter_list() throws RecognitionException {
        nesCParser.component_parameter_list_return retval = new nesCParser.component_parameter_list_return();
        retval.start = input.LT(1);

        int component_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal399=null;
        nesCParser.component_parameter_return component_parameter398 =null;

        nesCParser.component_parameter_return component_parameter400 =null;


        Object char_literal399_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // nesC.g:767:5: ( component_parameter ( ',' component_parameter )* )
            // nesC.g:767:10: component_parameter ( ',' component_parameter )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_component_parameter_in_component_parameter_list7437);
            component_parameter398=component_parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, component_parameter398.getTree());

            // nesC.g:767:30: ( ',' component_parameter )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==COMMA) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // nesC.g:767:31: ',' component_parameter
            	    {
            	    char_literal399=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_parameter_list7440); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal399_tree = 
            	    (Object)adaptor.create(char_literal399)
            	    ;
            	    adaptor.addChild(root_0, char_literal399_tree);
            	    }

            	    pushFollow(FOLLOW_component_parameter_in_component_parameter_list7442);
            	    component_parameter400=component_parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, component_parameter400.getTree());

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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:769:1: component_parameter : ( parameter_declaration | TYPEDEF identifier ( attributes )? );
    public final nesCParser.component_parameter_return component_parameter() throws RecognitionException {
        nesCParser.component_parameter_return retval = new nesCParser.component_parameter_return();
        retval.start = input.LT(1);

        int component_parameter_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF402=null;
        nesCParser.parameter_declaration_return parameter_declaration401 =null;

        nesCParser.identifier_return identifier403 =null;

        nesCParser.attributes_return attributes404 =null;


        Object TYPEDEF402_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // nesC.g:770:5: ( parameter_declaration | TYPEDEF identifier ( attributes )? )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ASYNC||LA111_0==AUTO||LA111_0==CHAR||LA111_0==COMMAND||LA111_0==CONST||LA111_0==DEFAULT||LA111_0==DUTY||LA111_0==ENUM||(LA111_0 >= EVENT && LA111_0 <= EXTERN)||(LA111_0 >= INLINE && LA111_0 <= INT8_T)||LA111_0==LONG||LA111_0==NORACE||(LA111_0 >= NXLE_UINT16_T && LA111_0 <= NX_UNION)||LA111_0==RAW_IDENTIFIER||LA111_0==REGISTER||LA111_0==RESTRICT||LA111_0==SHORT||LA111_0==SIGNED||LA111_0==STATIC||LA111_0==STRUCT||LA111_0==TASK||(LA111_0 >= UINT16_T && LA111_0 <= UINT8_T)||(LA111_0 >= UNION && LA111_0 <= UNSIGNED)||(LA111_0 >= VOID && LA111_0 <= VOLATILE)) ) {
                alt111=1;
            }
            else if ( (LA111_0==TYPEDEF) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;

            }
            switch (alt111) {
                case 1 :
                    // nesC.g:770:10: parameter_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_parameter_declaration_in_component_parameter7463);
                    parameter_declaration401=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_declaration401.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:771:10: TYPEDEF identifier ( attributes )?
                    {
                    root_0 = (Object)adaptor.nil();


                    TYPEDEF402=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_component_parameter7474); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPEDEF402_tree = 
                    (Object)adaptor.create(TYPEDEF402)
                    ;
                    adaptor.addChild(root_0, TYPEDEF402_tree);
                    }

                    pushFollow(FOLLOW_identifier_in_component_parameter7476);
                    identifier403=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier403.getTree());

                    // nesC.g:771:29: ( attributes )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==ATTRIBUTE) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // nesC.g:771:29: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_component_parameter7478);
                            attributes404=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes404.getTree());

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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:776:1: module_implementation : IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) ;
    public final nesCParser.module_implementation_return module_implementation() throws RecognitionException {
        nesCParser.module_implementation_return retval = new nesCParser.module_implementation_return();
        retval.start = input.LT(1);

        int module_implementation_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTATION405=null;
        Token char_literal406=null;
        Token char_literal408=null;
        nesCParser.translation_unit_return translation_unit407 =null;


        Object IMPLEMENTATION405_tree=null;
        Object char_literal406_tree=null;
        Object char_literal408_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // nesC.g:777:5: ( IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) )
            // nesC.g:777:10: IMPLEMENTATION '{' translation_unit '}'
            {
            IMPLEMENTATION405=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_module_implementation7501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION405);


            char_literal406=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_implementation7503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal406);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_implementation7535);
            translation_unit407=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit407.getTree());

            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal408=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_implementation7591); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal408);


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
            // 781:13: -> ^( IMPLEMENTATION translation_unit )
            {
                // nesC.g:781:16: ^( IMPLEMENTATION translation_unit )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:784:1: configuration_implementation : IMPLEMENTATION '{' ( configuration_element_list )? '}' -> ^( IMPLEMENTATION ( configuration_element_list )? ) ;
    public final nesCParser.configuration_implementation_return configuration_implementation() throws RecognitionException {
        nesCParser.configuration_implementation_return retval = new nesCParser.configuration_implementation_return();
        retval.start = input.LT(1);

        int configuration_implementation_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTATION409=null;
        Token char_literal410=null;
        Token char_literal412=null;
        nesCParser.configuration_element_list_return configuration_element_list411 =null;


        Object IMPLEMENTATION409_tree=null;
        Object char_literal410_tree=null;
        Object char_literal412_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_configuration_element_list=new RewriteRuleSubtreeStream(adaptor,"rule configuration_element_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // nesC.g:785:5: ( IMPLEMENTATION '{' ( configuration_element_list )? '}' -> ^( IMPLEMENTATION ( configuration_element_list )? ) )
            // nesC.g:785:10: IMPLEMENTATION '{' ( configuration_element_list )? '}'
            {
            IMPLEMENTATION409=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_configuration_implementation7627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION409);


            char_literal410=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_configuration_implementation7629); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal410);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:786:29: ( configuration_element_list )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==COMPONENTS||LA112_0==ENABLE||LA112_0==HASH||LA112_0==LBRACKET||LA112_0==RAW_IDENTIFIER) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // nesC.g:786:29: configuration_element_list
                    {
                    pushFollow(FOLLOW_configuration_element_list_in_configuration_implementation7661);
                    configuration_element_list411=configuration_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_configuration_element_list.add(configuration_element_list411.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal412=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_configuration_implementation7718); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal412);


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
            // 789:13: -> ^( IMPLEMENTATION ( configuration_element_list )? )
            {
                // nesC.g:789:16: ^( IMPLEMENTATION ( configuration_element_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLEMENTATION.nextNode()
                , root_1);

                // nesC.g:789:33: ( configuration_element_list )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:791:1: configuration_element_list : ( configuration_element | line_directive )+ ;
    public final nesCParser.configuration_element_list_return configuration_element_list() throws RecognitionException {
        nesCParser.configuration_element_list_return retval = new nesCParser.configuration_element_list_return();
        retval.start = input.LT(1);

        int configuration_element_list_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.configuration_element_return configuration_element413 =null;

        nesCParser.line_directive_return line_directive414 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // nesC.g:792:5: ( ( configuration_element | line_directive )+ )
            // nesC.g:792:10: ( configuration_element | line_directive )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:792:10: ( configuration_element | line_directive )+
            int cnt113=0;
            loop113:
            do {
                int alt113=3;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==COMPONENTS||LA113_0==ENABLE||LA113_0==LBRACKET||LA113_0==RAW_IDENTIFIER) ) {
                    alt113=1;
                }
                else if ( (LA113_0==HASH) ) {
                    alt113=2;
                }


                switch (alt113) {
            	case 1 :
            	    // nesC.g:792:11: configuration_element
            	    {
            	    pushFollow(FOLLOW_configuration_element_in_configuration_element_list7759);
            	    configuration_element413=configuration_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, configuration_element413.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:792:35: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_configuration_element_list7763);
            	    line_directive414=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive414.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt113 >= 1 ) break loop113;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:794:1: configuration_element : ( components | connection );
    public final nesCParser.configuration_element_return configuration_element() throws RecognitionException {
        nesCParser.configuration_element_return retval = new nesCParser.configuration_element_return();
        retval.start = input.LT(1);

        int configuration_element_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.components_return components415 =null;

        nesCParser.connection_return connection416 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // nesC.g:795:5: ( components | connection )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==COMPONENTS) ) {
                alt114=1;
            }
            else if ( (LA114_0==ENABLE||LA114_0==LBRACKET||LA114_0==RAW_IDENTIFIER) ) {
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
                    // nesC.g:795:10: components
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_components_in_configuration_element7784);
                    components415=components();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, components415.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:796:10: connection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_connection_in_configuration_element7795);
                    connection416=connection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connection416.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:804:1: components : COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) ;
    public final nesCParser.components_return components() throws RecognitionException {
        nesCParser.components_return retval = new nesCParser.components_return();
        retval.start = input.LT(1);

        int components_StartIndex = input.index();

        Object root_0 = null;

        Token COMPONENTS417=null;
        Token char_literal419=null;
        nesCParser.component_line_return component_line418 =null;


        Object COMPONENTS417_tree=null;
        Object char_literal419_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_COMPONENTS=new RewriteRuleTokenStream(adaptor,"token COMPONENTS");
        RewriteRuleSubtreeStream stream_component_line=new RewriteRuleSubtreeStream(adaptor,"rule component_line");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // nesC.g:805:5: ( COMPONENTS component_line ';' -> ^( COMPONENTS component_line ) )
            // nesC.g:805:10: COMPONENTS component_line ';'
            {
            COMPONENTS417=(Token)match(input,COMPONENTS,FOLLOW_COMPONENTS_in_components7840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPONENTS.add(COMPONENTS417);


            pushFollow(FOLLOW_component_line_in_components7842);
            component_line418=component_line();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_line.add(component_line418.getTree());

            char_literal419=(Token)match(input,183,FOLLOW_183_in_components7844); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_183.add(char_literal419);


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
            // 805:40: -> ^( COMPONENTS component_line )
            {
                // nesC.g:805:43: ^( COMPONENTS component_line )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:807:1: component_line : component_declaration ( ',' component_declaration )* -> ( component_declaration )+ ;
    public final nesCParser.component_line_return component_line() throws RecognitionException {
        nesCParser.component_line_return retval = new nesCParser.component_line_return();
        retval.start = input.LT(1);

        int component_line_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal421=null;
        nesCParser.component_declaration_return component_declaration420 =null;

        nesCParser.component_declaration_return component_declaration422 =null;


        Object char_literal421_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_declaration=new RewriteRuleSubtreeStream(adaptor,"rule component_declaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // nesC.g:808:5: ( component_declaration ( ',' component_declaration )* -> ( component_declaration )+ )
            // nesC.g:808:10: component_declaration ( ',' component_declaration )*
            {
            pushFollow(FOLLOW_component_declaration_in_component_line7871);
            component_declaration420=component_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration420.getTree());

            // nesC.g:808:32: ( ',' component_declaration )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==COMMA) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // nesC.g:808:33: ',' component_declaration
            	    {
            	    char_literal421=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_line7874); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal421);


            	    pushFollow(FOLLOW_component_declaration_in_component_line7876);
            	    component_declaration422=component_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_declaration.add(component_declaration422.getTree());

            	    }
            	    break;

            	default :
            	    break loop115;
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
            // 808:61: -> ( component_declaration )+
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:810:1: component_declaration : component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) ;
    public final nesCParser.component_declaration_return component_declaration() throws RecognitionException {
        nesCParser.component_declaration_return retval = new nesCParser.component_declaration_return();
        retval.start = input.LT(1);

        int component_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token AS424=null;
        nesCParser.component_ref_return component_ref423 =null;

        nesCParser.identifier_return identifier425 =null;


        Object AS424_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_component_ref=new RewriteRuleSubtreeStream(adaptor,"rule component_ref");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // nesC.g:811:5: ( component_ref ( AS identifier )? -> ^( COMPONENT_DECLARATION component_ref ( identifier )? ) )
            // nesC.g:811:10: component_ref ( AS identifier )?
            {
            pushFollow(FOLLOW_component_ref_in_component_declaration7902);
            component_ref423=component_ref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_ref.add(component_ref423.getTree());

            // nesC.g:811:24: ( AS identifier )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==AS) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // nesC.g:811:25: AS identifier
                    {
                    AS424=(Token)match(input,AS,FOLLOW_AS_in_component_declaration7905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS424);


                    pushFollow(FOLLOW_identifier_in_component_declaration7907);
                    identifier425=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier425.getTree());

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
            // 811:41: -> ^( COMPONENT_DECLARATION component_ref ( identifier )? )
            {
                // nesC.g:811:44: ^( COMPONENT_DECLARATION component_ref ( identifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPONENT_DECLARATION, "COMPONENT_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_component_ref.nextTree());

                // nesC.g:811:82: ( identifier )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:817:1: component_ref : ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) );
    public final nesCParser.component_ref_return component_ref() throws RecognitionException {
        nesCParser.component_ref_return retval = new nesCParser.component_ref_return();
        retval.start = input.LT(1);

        int component_ref_StartIndex = input.index();

        Object root_0 = null;

        Token NEW427=null;
        Token char_literal429=null;
        Token char_literal431=null;
        nesCParser.identifier_return identifier426 =null;

        nesCParser.identifier_return identifier428 =null;

        nesCParser.component_argument_list_return component_argument_list430 =null;


        Object NEW427_tree=null;
        Object char_literal429_tree=null;
        Object char_literal431_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_component_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule component_argument_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // nesC.g:818:5: ( identifier | NEW identifier '(' ( component_argument_list )? ')' -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==RAW_IDENTIFIER) ) {
                alt118=1;
            }
            else if ( (LA118_0==NEW) ) {
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
                    // nesC.g:818:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_component_ref7945);
                    identifier426=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier426.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:819:10: NEW identifier '(' ( component_argument_list )? ')'
                    {
                    NEW427=(Token)match(input,NEW,FOLLOW_NEW_in_component_ref7956); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW427);


                    pushFollow(FOLLOW_identifier_in_component_ref7958);
                    identifier428=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier428.getTree());

                    char_literal429=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_component_ref7960); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal429);


                    // nesC.g:819:29: ( component_argument_list )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==AMP||LA117_0==BITCOMPLEMENT||LA117_0==CALL||(LA117_0 >= CHAR && LA117_0 <= CHARACTER_LITERAL)||(LA117_0 >= CONST && LA117_0 <= CONSTANT)||LA117_0==ENUM||(LA117_0 >= INT && LA117_0 <= INT8_T)||(LA117_0 >= LONG && LA117_0 <= LPARENS)||LA117_0==MINUS||LA117_0==MINUSMINUS||LA117_0==NOT||(LA117_0 >= NXLE_UINT16_T && LA117_0 <= NX_UNION)||LA117_0==PLUS||LA117_0==PLUSPLUS||LA117_0==POST||LA117_0==RAW_IDENTIFIER||LA117_0==RESTRICT||(LA117_0 >= SHORT && LA117_0 <= SIZEOF)||LA117_0==STAR||(LA117_0 >= STRING_LITERAL && LA117_0 <= STRUCT)||(LA117_0 >= UINT16_T && LA117_0 <= UINT8_T)||(LA117_0 >= UNION && LA117_0 <= UNSIGNED)||(LA117_0 >= VOID && LA117_0 <= VOLATILE)) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // nesC.g:819:29: component_argument_list
                            {
                            pushFollow(FOLLOW_component_argument_list_in_component_ref7962);
                            component_argument_list430=component_argument_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_component_argument_list.add(component_argument_list430.getTree());

                            }
                            break;

                    }


                    char_literal431=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_component_ref7965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal431);


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
                    // 820:13: -> ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                    {
                        // nesC.g:820:16: ^( COMPONENT_INSTANTIATION identifier ( component_argument_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMPONENT_INSTANTIATION, "COMPONENT_INSTANTIATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // nesC.g:820:53: ( component_argument_list )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:827:1: component_argument_list : component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) ;
    public final nesCParser.component_argument_list_return component_argument_list() throws RecognitionException {
        nesCParser.component_argument_list_return retval = new nesCParser.component_argument_list_return();
        retval.start = input.LT(1);

        int component_argument_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal433=null;
        nesCParser.component_argument_return component_argument432 =null;

        nesCParser.component_argument_return component_argument434 =null;


        Object char_literal433_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_component_argument=new RewriteRuleSubtreeStream(adaptor,"rule component_argument");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // nesC.g:828:5: ( component_argument ( ',' component_argument )* -> ^( COMPONENT_ARGUMENTS ( component_argument )+ ) )
            // nesC.g:828:10: component_argument ( ',' component_argument )*
            {
            pushFollow(FOLLOW_component_argument_in_component_argument_list8012);
            component_argument432=component_argument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_argument.add(component_argument432.getTree());

            // nesC.g:828:29: ( ',' component_argument )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMMA) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // nesC.g:828:30: ',' component_argument
            	    {
            	    char_literal433=(Token)match(input,COMMA,FOLLOW_COMMA_in_component_argument_list8015); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal433);


            	    pushFollow(FOLLOW_component_argument_in_component_argument_list8017);
            	    component_argument434=component_argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_component_argument.add(component_argument434.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
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
            // 829:13: -> ^( COMPONENT_ARGUMENTS ( component_argument )+ )
            {
                // nesC.g:829:16: ^( COMPONENT_ARGUMENTS ( component_argument )+ )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:831:1: component_argument : ( expression | type_name );
    public final nesCParser.component_argument_return component_argument() throws RecognitionException {
        nesCParser.component_argument_return retval = new nesCParser.component_argument_return();
        retval.start = input.LT(1);

        int component_argument_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.expression_return expression435 =null;

        nesCParser.type_name_return type_name436 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

            // nesC.g:832:5: ( expression | type_name )
            int alt120=2;
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
                alt120=1;
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA120_2 = input.LA(2);

                if ( (synpred214_nesC()) ) {
                    alt120=1;
                }
                else if ( (true) ) {
                    alt120=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
            case CONST:
            case ENUM:
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
                alt120=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;

            }

            switch (alt120) {
                case 1 :
                    // nesC.g:832:10: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_component_argument8059);
                    expression435=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression435.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:833:10: type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_name_in_component_argument8070);
                    type_name436=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name436.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:839:1: connection : ( endpoint '=' endpoint ';' -> ^( CONNECTION '=' endpoint endpoint ) | ( certificate_specification )? endpoint '->' endpoint ';' -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? ) | ( certificate_specification )? endpoint '<-' endpoint ';' -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? ) );
    public final nesCParser.connection_return connection() throws RecognitionException {
        nesCParser.connection_return retval = new nesCParser.connection_return();
        retval.start = input.LT(1);

        int connection_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal438=null;
        Token char_literal440=null;
        Token string_literal443=null;
        Token char_literal445=null;
        Token string_literal448=null;
        Token char_literal450=null;
        nesCParser.endpoint_return endpoint437 =null;

        nesCParser.endpoint_return endpoint439 =null;

        nesCParser.certificate_specification_return certificate_specification441 =null;

        nesCParser.endpoint_return endpoint442 =null;

        nesCParser.endpoint_return endpoint444 =null;

        nesCParser.certificate_specification_return certificate_specification446 =null;

        nesCParser.endpoint_return endpoint447 =null;

        nesCParser.endpoint_return endpoint449 =null;


        Object char_literal438_tree=null;
        Object char_literal440_tree=null;
        Object string_literal443_tree=null;
        Object char_literal445_tree=null;
        Object string_literal448_tree=null;
        Object char_literal450_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_certificate_specification=new RewriteRuleSubtreeStream(adaptor,"rule certificate_specification");
        RewriteRuleSubtreeStream stream_endpoint=new RewriteRuleSubtreeStream(adaptor,"rule endpoint");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

            // nesC.g:840:5: ( endpoint '=' endpoint ';' -> ^( CONNECTION '=' endpoint endpoint ) | ( certificate_specification )? endpoint '->' endpoint ';' -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? ) | ( certificate_specification )? endpoint '<-' endpoint ';' -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? ) )
            int alt123=3;
            switch ( input.LA(1) ) {
            case RAW_IDENTIFIER:
                {
                int LA123_1 = input.LA(2);

                if ( (synpred215_nesC()) ) {
                    alt123=1;
                }
                else if ( (synpred217_nesC()) ) {
                    alt123=2;
                }
                else if ( (true) ) {
                    alt123=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 1, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA123_2 = input.LA(2);

                if ( (synpred215_nesC()) ) {
                    alt123=1;
                }
                else if ( (synpred217_nesC()) ) {
                    alt123=2;
                }
                else if ( (true) ) {
                    alt123=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 2, input);

                    throw nvae;

                }
                }
                break;
            case ENABLE:
                {
                int LA123_3 = input.LA(2);

                if ( (synpred217_nesC()) ) {
                    alt123=2;
                }
                else if ( (true) ) {
                    alt123=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 3, input);

                    throw nvae;

                }
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
                    // nesC.g:840:10: endpoint '=' endpoint ';'
                    {
                    pushFollow(FOLLOW_endpoint_in_connection8089);
                    endpoint437=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint437.getTree());

                    char_literal438=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_connection8091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal438);


                    pushFollow(FOLLOW_endpoint_in_connection8093);
                    endpoint439=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint439.getTree());

                    char_literal440=(Token)match(input,183,FOLLOW_183_in_connection8095); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal440);


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
                    // 841:14: -> ^( CONNECTION '=' endpoint endpoint )
                    {
                        // nesC.g:841:17: ^( CONNECTION '=' endpoint endpoint )
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
                    // nesC.g:842:10: ( certificate_specification )? endpoint '->' endpoint ';'
                    {
                    // nesC.g:842:10: ( certificate_specification )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==ENABLE) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // nesC.g:842:10: certificate_specification
                            {
                            pushFollow(FOLLOW_certificate_specification_in_connection8131);
                            certificate_specification441=certificate_specification();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification441.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_endpoint_in_connection8134);
                    endpoint442=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint442.getTree());

                    string_literal443=(Token)match(input,ARROW,FOLLOW_ARROW_in_connection8136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal443);


                    pushFollow(FOLLOW_endpoint_in_connection8138);
                    endpoint444=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint444.getTree());

                    char_literal445=(Token)match(input,183,FOLLOW_183_in_connection8140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal445);


                    // AST REWRITE
                    // elements: ARROW, endpoint, certificate_specification, endpoint
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 843:14: -> ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? )
                    {
                        // nesC.g:843:17: ^( CONNECTION '->' endpoint endpoint ( certificate_specification )? )
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

                        // nesC.g:843:53: ( certificate_specification )?
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
                    // nesC.g:844:10: ( certificate_specification )? endpoint '<-' endpoint ';'
                    {
                    // nesC.g:844:10: ( certificate_specification )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==ENABLE) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // nesC.g:844:10: certificate_specification
                            {
                            pushFollow(FOLLOW_certificate_specification_in_connection8179);
                            certificate_specification446=certificate_specification();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_certificate_specification.add(certificate_specification446.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_endpoint_in_connection8182);
                    endpoint447=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint447.getTree());

                    string_literal448=(Token)match(input,184,FOLLOW_184_in_connection8184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_184.add(string_literal448);


                    pushFollow(FOLLOW_endpoint_in_connection8186);
                    endpoint449=endpoint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endpoint.add(endpoint449.getTree());

                    char_literal450=(Token)match(input,183,FOLLOW_183_in_connection8188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal450);


                    // AST REWRITE
                    // elements: endpoint, endpoint, 184, certificate_specification
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 845:14: -> ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? )
                    {
                        // nesC.g:845:17: ^( CONNECTION '<-' endpoint endpoint ( certificate_specification )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONNECTION, "CONNECTION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_184.nextNode()
                        );

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        adaptor.addChild(root_1, stream_endpoint.nextTree());

                        // nesC.g:845:53: ( certificate_specification )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:847:1: certificate_specification : ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) ;
    public final nesCParser.certificate_specification_return certificate_specification() throws RecognitionException {
        nesCParser.certificate_specification_return retval = new nesCParser.certificate_specification_return();
        retval.start = input.LT(1);

        int certificate_specification_StartIndex = input.index();

        Object root_0 = null;

        Token certs=null;
        Token entity=null;
        Token assumptions=null;
        Token ENABLE451=null;
        Token AS452=null;
        Token ASSUMING453=null;
        Token FOR454=null;

        Object certs_tree=null;
        Object entity_tree=null;
        Object assumptions_tree=null;
        Object ENABLE451_tree=null;
        Object AS452_tree=null;
        Object ASSUMING453_tree=null;
        Object FOR454_tree=null;
        RewriteRuleTokenStream stream_ASSUMING=new RewriteRuleTokenStream(adaptor,"token ASSUMING");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_ENABLE=new RewriteRuleTokenStream(adaptor,"token ENABLE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

            // nesC.g:848:5: ( ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? ) )
            // nesC.g:848:10: ENABLE certs= STRING_LITERAL ( AS entity= STRING_LITERAL )? ( ASSUMING assumptions= STRING_LITERAL )? FOR
            {
            ENABLE451=(Token)match(input,ENABLE,FOLLOW_ENABLE_in_certificate_specification8231); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENABLE.add(ENABLE451);


            certs=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8235); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(certs);


            // nesC.g:848:38: ( AS entity= STRING_LITERAL )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==AS) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // nesC.g:848:39: AS entity= STRING_LITERAL
                    {
                    AS452=(Token)match(input,AS,FOLLOW_AS_in_certificate_specification8238); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS452);


                    entity=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8242); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(entity);


                    }
                    break;

            }


            // nesC.g:848:66: ( ASSUMING assumptions= STRING_LITERAL )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ASSUMING) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // nesC.g:848:67: ASSUMING assumptions= STRING_LITERAL
                    {
                    ASSUMING453=(Token)match(input,ASSUMING,FOLLOW_ASSUMING_in_certificate_specification8247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUMING.add(ASSUMING453);


                    assumptions=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_certificate_specification8251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(assumptions);


                    }
                    break;

            }


            FOR454=(Token)match(input,FOR,FOLLOW_FOR_in_certificate_specification8255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR454);


            // AST REWRITE
            // elements: assumptions, ASSUMING, ENABLE, AS, certs, entity
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
            // 849:14: -> ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
            {
                // nesC.g:849:17: ^( ENABLE $certs ( ^( AS $entity) )? ( ^( ASSUMING $assumptions) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ENABLE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_certs.nextNode());

                // nesC.g:849:33: ( ^( AS $entity) )?
                if ( stream_AS.hasNext()||stream_entity.hasNext() ) {
                    // nesC.g:849:33: ^( AS $entity)
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

                // nesC.g:849:48: ( ^( ASSUMING $assumptions) )?
                if ( stream_assumptions.hasNext()||stream_ASSUMING.hasNext() ) {
                    // nesC.g:849:48: ^( ASSUMING $assumptions)
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:851:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );
    public final nesCParser.endpoint_return endpoint() throws RecognitionException {
        nesCParser.endpoint_return retval = new nesCParser.endpoint_return();
        retval.start = input.LT(1);

        int endpoint_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal457=null;
        Token char_literal459=null;
        nesCParser.identifier_path_return identifier_path455 =null;

        nesCParser.identifier_path_return identifier_path456 =null;

        nesCParser.argument_expression_list_return argument_expression_list458 =null;


        Object char_literal457_tree=null;
        Object char_literal459_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

            // nesC.g:852:5: ( identifier_path | identifier_path '[' argument_expression_list ']' )
            int alt126=2;
            alt126 = dfa126.predict(input);
            switch (alt126) {
                case 1 :
                    // nesC.g:852:10: identifier_path
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8308);
                    identifier_path455=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path455.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:853:10: identifier_path '[' argument_expression_list ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_path_in_endpoint8319);
                    identifier_path456=identifier_path();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_path456.getTree());

                    char_literal457=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_endpoint8321); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal457_tree = 
                    (Object)adaptor.create(char_literal457)
                    ;
                    adaptor.addChild(root_0, char_literal457_tree);
                    }

                    pushFollow(FOLLOW_argument_expression_list_in_endpoint8323);
                    argument_expression_list458=argument_expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list458.getTree());

                    char_literal459=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_endpoint8325); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal459_tree = 
                    (Object)adaptor.create(char_literal459)
                    ;
                    adaptor.addChild(root_0, char_literal459_tree);
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:855:1: identifier_path : ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) );
    public final nesCParser.identifier_path_return identifier_path() throws RecognitionException {
        nesCParser.identifier_path_return retval = new nesCParser.identifier_path_return();
        retval.start = input.LT(1);

        int identifier_path_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal461=null;
        Token char_literal463=null;
        Token char_literal464=null;
        Token char_literal465=null;
        List list_normal_path=null;
        nesCParser.identifier_return indirect =null;

        nesCParser.identifier_return identifier460 =null;

        nesCParser.identifier_return identifier462 =null;

        RuleReturnScope normal_path = null;
        Object char_literal461_tree=null;
        Object char_literal463_tree=null;
        Object char_literal464_tree=null;
        Object char_literal465_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

            // nesC.g:856:5: ( identifier ( '.' identifier )* -> ^( IDENTIFIER_PATH ( identifier )+ ) | '[' indirect= identifier ']' ( '.' normal_path+= identifier )* -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path) )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RAW_IDENTIFIER) ) {
                alt129=1;
            }
            else if ( (LA129_0==LBRACKET) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;

            }
            switch (alt129) {
                case 1 :
                    // nesC.g:856:10: identifier ( '.' identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_identifier_path8344);
                    identifier460=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier460.getTree());

                    // nesC.g:856:21: ( '.' identifier )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==DOT) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // nesC.g:856:22: '.' identifier
                    	    {
                    	    char_literal461=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8347); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal461);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8349);
                    	    identifier462=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier462.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop127;
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
                    // 857:13: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // nesC.g:857:16: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // nesC.g:858:10: '[' indirect= identifier ']' ( '.' normal_path+= identifier )*
                    {
                    char_literal463=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_identifier_path8383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal463);


                    pushFollow(FOLLOW_identifier_in_identifier_path8387);
                    indirect=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(indirect.getTree());

                    char_literal464=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_identifier_path8389); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal464);


                    // nesC.g:858:38: ( '.' normal_path+= identifier )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==DOT) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // nesC.g:858:39: '.' normal_path+= identifier
                    	    {
                    	    char_literal465=(Token)match(input,DOT,FOLLOW_DOT_in_identifier_path8392); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal465);


                    	    pushFollow(FOLLOW_identifier_in_identifier_path8396);
                    	    normal_path=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(normal_path.getTree());
                    	    if (list_normal_path==null) list_normal_path=new ArrayList();
                    	    list_normal_path.add(normal_path.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
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
                    // 859:13: -> ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
                    {
                        // nesC.g:859:16: ^( DYNAMIC_IDENTIFIER_PATH $indirect $normal_path)
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:865:1: component_specification : '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final nesCParser.component_specification_return component_specification() throws RecognitionException {
        nesCParser.component_specification_return retval = new nesCParser.component_specification_return();
        retval.start = input.LT(1);

        int component_specification_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal466=null;
        Token char_literal469=null;
        nesCParser.uses_provides_return uses_provides467 =null;

        nesCParser.line_directive_return line_directive468 =null;


        Object char_literal466_tree=null;
        Object char_literal469_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

            // nesC.g:866:5: ( '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // nesC.g:866:10: '{' ( uses_provides | line_directive )* '}'
            {
            char_literal466=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification8445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal466);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // nesC.g:867:11: ( uses_provides | line_directive )*
            loop130:
            do {
                int alt130=3;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==ASYNC||LA130_0==AUTO||LA130_0==CHAR||LA130_0==COMMAND||LA130_0==CONST||LA130_0==DEFAULT||LA130_0==DUTY||LA130_0==ENUM||(LA130_0 >= EVENT && LA130_0 <= EXTERN)||(LA130_0 >= INLINE && LA130_0 <= INT8_T)||LA130_0==LONG||LA130_0==NORACE||(LA130_0 >= NXLE_UINT16_T && LA130_0 <= NX_UNION)||(LA130_0 >= PROVIDES && LA130_0 <= RAW_IDENTIFIER)||LA130_0==REGISTER||LA130_0==RESTRICT||LA130_0==SHORT||LA130_0==SIGNED||LA130_0==STATIC||LA130_0==STRUCT||(LA130_0 >= TASK && LA130_0 <= UINT8_T)||(LA130_0 >= UNION && LA130_0 <= VOLATILE)) ) {
                    alt130=1;
                }
                else if ( (LA130_0==HASH) ) {
                    alt130=2;
                }


                switch (alt130) {
            	case 1 :
            	    // nesC.g:867:12: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification8460);
            	    uses_provides467=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides467.getTree());

            	    }
            	    break;
            	case 2 :
            	    // nesC.g:867:28: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification8464);
            	    line_directive468=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive468.getTree());

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);


            char_literal469=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification8468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal469);


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
            // 867:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // nesC.g:867:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // nesC.g:867:68: ( uses_provides )*
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:869:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) );
    public final nesCParser.uses_provides_return uses_provides() throws RecognitionException {
        nesCParser.uses_provides_return retval = new nesCParser.uses_provides_return();
        retval.start = input.LT(1);

        int uses_provides_StartIndex = input.index();

        Object root_0 = null;

        Token USES470=null;
        Token PROVIDES472=null;
        nesCParser.specification_element_list_return specification_element_list471 =null;

        nesCParser.specification_element_list_return specification_element_list473 =null;

        nesCParser.declaration_return declaration474 =null;


        Object USES470_tree=null;
        Object PROVIDES472_tree=null;
        RewriteRuleTokenStream stream_PROVIDES=new RewriteRuleTokenStream(adaptor,"token PROVIDES");
        RewriteRuleTokenStream stream_USES=new RewriteRuleTokenStream(adaptor,"token USES");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_specification_element_list=new RewriteRuleSubtreeStream(adaptor,"rule specification_element_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

            // nesC.g:870:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) | declaration -> ^( DECLARATION declaration ) )
            int alt131=3;
            switch ( input.LA(1) ) {
            case USES:
                {
                alt131=1;
                }
                break;
            case PROVIDES:
                {
                alt131=2;
                }
                break;
            case ASYNC:
            case AUTO:
            case CHAR:
            case COMMAND:
            case CONST:
            case DEFAULT:
            case DUTY:
            case ENUM:
            case EVENT:
            case EXTERN:
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
                alt131=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;

            }

            switch (alt131) {
                case 1 :
                    // nesC.g:870:10: USES specification_element_list
                    {
                    USES470=(Token)match(input,USES,FOLLOW_USES_in_uses_provides8496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES470);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8498);
                    specification_element_list471=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list471.getTree());

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
                    // 870:42: -> ^( USES specification_element_list )
                    {
                        // nesC.g:870:45: ^( USES specification_element_list )
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
                    // nesC.g:871:10: PROVIDES specification_element_list
                    {
                    PROVIDES472=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides8517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES472);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides8519);
                    specification_element_list473=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list473.getTree());

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
                    // 871:46: -> ^( PROVIDES specification_element_list )
                    {
                        // nesC.g:871:49: ^( PROVIDES specification_element_list )
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
                    // nesC.g:872:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_uses_provides8538);
                    declaration474=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration474.getTree());

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
                    // 872:22: -> ^( DECLARATION declaration )
                    {
                        // nesC.g:872:25: ^( DECLARATION declaration )
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:874:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final nesCParser.specification_element_list_return specification_element_list() throws RecognitionException {
        nesCParser.specification_element_list_return retval = new nesCParser.specification_element_list_return();
        retval.start = input.LT(1);

        int specification_element_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal476=null;
        Token char_literal478=null;
        nesCParser.specification_element_return specification_element475 =null;

        nesCParser.specification_element_return specification_element477 =null;


        Object char_literal476_tree=null;
        Object char_literal478_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_specification_element=new RewriteRuleSubtreeStream(adaptor,"rule specification_element");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

            // nesC.g:875:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==ASYNC||LA133_0==AUTO||LA133_0==CHAR||LA133_0==COMMAND||LA133_0==CONST||LA133_0==DEFAULT||LA133_0==DUTY||LA133_0==ENUM||(LA133_0 >= EVENT && LA133_0 <= EXTERN)||(LA133_0 >= INLINE && LA133_0 <= INTERFACE)||LA133_0==LONG||LA133_0==NORACE||(LA133_0 >= NXLE_UINT16_T && LA133_0 <= NX_UNION)||LA133_0==RAW_IDENTIFIER||(LA133_0 >= REGISTER && LA133_0 <= REMOTE)||LA133_0==RESTRICT||LA133_0==SHORT||LA133_0==SIGNED||LA133_0==STATIC||LA133_0==STRUCT||(LA133_0 >= TASK && LA133_0 <= UINT8_T)||(LA133_0 >= UNION && LA133_0 <= UNSIGNED)||(LA133_0 >= VOID && LA133_0 <= VOLATILE)) ) {
                alt133=1;
            }
            else if ( (LA133_0==LBRACE) ) {
                alt133=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;

            }
            switch (alt133) {
                case 1 :
                    // nesC.g:875:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list8565);
                    specification_element475=specification_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element.add(specification_element475.getTree());

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
                    // 875:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // nesC.g:876:10: '{' ( specification_element )+ '}'
                    {
                    char_literal476=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list8580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal476);


                    // nesC.g:876:14: ( specification_element )+
                    int cnt132=0;
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==ASYNC||LA132_0==AUTO||LA132_0==CHAR||LA132_0==COMMAND||LA132_0==CONST||LA132_0==DEFAULT||LA132_0==DUTY||LA132_0==ENUM||(LA132_0 >= EVENT && LA132_0 <= EXTERN)||(LA132_0 >= INLINE && LA132_0 <= INTERFACE)||LA132_0==LONG||LA132_0==NORACE||(LA132_0 >= NXLE_UINT16_T && LA132_0 <= NX_UNION)||LA132_0==RAW_IDENTIFIER||(LA132_0 >= REGISTER && LA132_0 <= REMOTE)||LA132_0==RESTRICT||LA132_0==SHORT||LA132_0==SIGNED||LA132_0==STATIC||LA132_0==STRUCT||(LA132_0 >= TASK && LA132_0 <= UINT8_T)||(LA132_0 >= UNION && LA132_0 <= UNSIGNED)||(LA132_0 >= VOID && LA132_0 <= VOLATILE)) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // nesC.g:876:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list8582);
                    	    specification_element477=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element477.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt132 >= 1 ) break loop132;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(132, input);
                                throw eee;
                        }
                        cnt132++;
                    } while (true);


                    char_literal478=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list8585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal478);


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
                    // 876:41: -> ( specification_element )+
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:878:1: specification_element : ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) );
    public final nesCParser.specification_element_return specification_element() throws RecognitionException {
        nesCParser.specification_element_return retval = new nesCParser.specification_element_return();
        retval.start = input.LT(1);

        int specification_element_StartIndex = input.index();

        Object root_0 = null;

        Token AS481=null;
        Token char_literal485=null;
        nesCParser.declaration_return declaration479 =null;

        nesCParser.interface_type_return interface_type480 =null;

        nesCParser.identifier_return identifier482 =null;

        nesCParser.instance_parameters_return instance_parameters483 =null;

        nesCParser.attributes_return attributes484 =null;


        Object AS481_tree=null;
        Object char_literal485_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleSubtreeStream stream_instance_parameters=new RewriteRuleSubtreeStream(adaptor,"rule instance_parameters");
        RewriteRuleSubtreeStream stream_interface_type=new RewriteRuleSubtreeStream(adaptor,"rule interface_type");
        RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"rule attributes");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

            // nesC.g:879:5: ( declaration | interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';' -> ^( INTERFACE interface_type ( identifier )? ) )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==ASYNC||LA137_0==AUTO||LA137_0==CHAR||LA137_0==COMMAND||LA137_0==CONST||LA137_0==DEFAULT||LA137_0==DUTY||LA137_0==ENUM||(LA137_0 >= EVENT && LA137_0 <= EXTERN)||(LA137_0 >= INLINE && LA137_0 <= INT8_T)||LA137_0==LONG||LA137_0==NORACE||(LA137_0 >= NXLE_UINT16_T && LA137_0 <= NX_UNION)||LA137_0==RAW_IDENTIFIER||LA137_0==REGISTER||LA137_0==RESTRICT||LA137_0==SHORT||LA137_0==SIGNED||LA137_0==STATIC||LA137_0==STRUCT||(LA137_0 >= TASK && LA137_0 <= UINT8_T)||(LA137_0 >= UNION && LA137_0 <= UNSIGNED)||(LA137_0 >= VOID && LA137_0 <= VOLATILE)) ) {
                alt137=1;
            }
            else if ( (LA137_0==INTERFACE||LA137_0==REMOTE) ) {
                alt137=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }
            switch (alt137) {
                case 1 :
                    // nesC.g:879:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_specification_element8609);
                    declaration479=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration479.getTree());

                    }
                    break;
                case 2 :
                    // nesC.g:880:10: interface_type ( AS identifier )? ( instance_parameters )? ( attributes )? ';'
                    {
                    pushFollow(FOLLOW_interface_type_in_specification_element8620);
                    interface_type480=interface_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_type.add(interface_type480.getTree());

                    // nesC.g:880:25: ( AS identifier )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==AS) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // nesC.g:880:26: AS identifier
                            {
                            AS481=(Token)match(input,AS,FOLLOW_AS_in_specification_element8623); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AS.add(AS481);


                            pushFollow(FOLLOW_identifier_in_specification_element8625);
                            identifier482=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier482.getTree());

                            }
                            break;

                    }


                    // nesC.g:880:42: ( instance_parameters )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==LBRACKET) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // nesC.g:880:42: instance_parameters
                            {
                            pushFollow(FOLLOW_instance_parameters_in_specification_element8629);
                            instance_parameters483=instance_parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_instance_parameters.add(instance_parameters483.getTree());

                            }
                            break;

                    }


                    // nesC.g:880:63: ( attributes )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==ATTRIBUTE) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // nesC.g:880:63: attributes
                            {
                            pushFollow(FOLLOW_attributes_in_specification_element8632);
                            attributes484=attributes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attributes.add(attributes484.getTree());

                            }
                            break;

                    }


                    char_literal485=(Token)match(input,183,FOLLOW_183_in_specification_element8635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(char_literal485);


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
                    // 881:13: -> ^( INTERFACE interface_type ( identifier )? )
                    {
                        // nesC.g:881:16: ^( INTERFACE interface_type ( identifier )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTERFACE, "INTERFACE")
                        , root_1);

                        adaptor.addChild(root_1, stream_interface_type.nextTree());

                        // nesC.g:881:43: ( identifier )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:888:1: interface_type : ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) ;
    public final nesCParser.interface_type_return interface_type() throws RecognitionException {
        nesCParser.interface_type_return retval = new nesCParser.interface_type_return();
        retval.start = input.LT(1);

        int interface_type_StartIndex = input.index();

        Object root_0 = null;

        Token REMOTE486=null;
        Token INTERFACE487=null;
        Token REQUIRES490=null;
        Token STRING_LITERAL491=null;
        nesCParser.identifier_return identifier488 =null;

        nesCParser.type_arguments_return type_arguments489 =null;


        Object REMOTE486_tree=null;
        Object INTERFACE487_tree=null;
        Object REQUIRES490_tree=null;
        Object STRING_LITERAL491_tree=null;
        RewriteRuleTokenStream stream_REMOTE=new RewriteRuleTokenStream(adaptor,"token REMOTE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_REQUIRES=new RewriteRuleTokenStream(adaptor,"token REQUIRES");
        RewriteRuleSubtreeStream stream_type_arguments=new RewriteRuleSubtreeStream(adaptor,"rule type_arguments");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

            // nesC.g:889:5: ( ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )? -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? ) )
            // nesC.g:889:10: ( REMOTE )? INTERFACE identifier ( type_arguments )? ( REQUIRES STRING_LITERAL )?
            {
            // nesC.g:889:10: ( REMOTE )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==REMOTE) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // nesC.g:889:10: REMOTE
                    {
                    REMOTE486=(Token)match(input,REMOTE,FOLLOW_REMOTE_in_interface_type8682); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REMOTE.add(REMOTE486);


                    }
                    break;

            }


            INTERFACE487=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_type8685); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE487);


            pushFollow(FOLLOW_identifier_in_interface_type8687);
            identifier488=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier488.getTree());

            // nesC.g:889:39: ( type_arguments )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==LESS) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // nesC.g:889:39: type_arguments
                    {
                    pushFollow(FOLLOW_type_arguments_in_interface_type8689);
                    type_arguments489=type_arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_arguments.add(type_arguments489.getTree());

                    }
                    break;

            }


            // nesC.g:889:55: ( REQUIRES STRING_LITERAL )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==REQUIRES) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // nesC.g:889:56: REQUIRES STRING_LITERAL
                    {
                    REQUIRES490=(Token)match(input,REQUIRES,FOLLOW_REQUIRES_in_interface_type8693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRES.add(REQUIRES490);


                    STRING_LITERAL491=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_interface_type8695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL491);


                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, REMOTE, STRING_LITERAL, type_arguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 890:13: -> ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
            {
                // nesC.g:890:16: ^( INTERFACE_TYPE ( REMOTE )? ( STRING_LITERAL )? identifier ( type_arguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_TYPE, "INTERFACE_TYPE")
                , root_1);

                // nesC.g:890:33: ( REMOTE )?
                if ( stream_REMOTE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_REMOTE.nextNode()
                    );

                }
                stream_REMOTE.reset();

                // nesC.g:890:41: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING_LITERAL.nextNode()
                    );

                }
                stream_STRING_LITERAL.reset();

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // nesC.g:890:68: ( type_arguments )?
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:892:1: type_arguments : '<' type_name ( ',' type_name )* '>' -> ( type_name )+ ;
    public final nesCParser.type_arguments_return type_arguments() throws RecognitionException {
        nesCParser.type_arguments_return retval = new nesCParser.type_arguments_return();
        retval.start = input.LT(1);

        int type_arguments_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal492=null;
        Token char_literal494=null;
        Token char_literal496=null;
        nesCParser.type_name_return type_name493 =null;

        nesCParser.type_name_return type_name495 =null;


        Object char_literal492_tree=null;
        Object char_literal494_tree=null;
        Object char_literal496_tree=null;
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

            // nesC.g:893:5: ( '<' type_name ( ',' type_name )* '>' -> ( type_name )+ )
            // nesC.g:893:10: '<' type_name ( ',' type_name )* '>'
            {
            char_literal492=(Token)match(input,LESS,FOLLOW_LESS_in_type_arguments8745); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESS.add(char_literal492);


            pushFollow(FOLLOW_type_name_in_type_arguments8747);
            type_name493=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_name.add(type_name493.getTree());

            // nesC.g:893:24: ( ',' type_name )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==COMMA) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // nesC.g:893:25: ',' type_name
            	    {
            	    char_literal494=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_arguments8750); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal494);


            	    pushFollow(FOLLOW_type_name_in_type_arguments8752);
            	    type_name495=type_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type_name.add(type_name495.getTree());

            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);


            char_literal496=(Token)match(input,GREATER,FOLLOW_GREATER_in_type_arguments8756); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GREATER.add(char_literal496);


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
            // 893:45: -> ( type_name )+
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

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:895:1: instance_parameters : '[' parameter_type_list ']' ;
    public final nesCParser.instance_parameters_return instance_parameters() throws RecognitionException {
        nesCParser.instance_parameters_return retval = new nesCParser.instance_parameters_return();
        retval.start = input.LT(1);

        int instance_parameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal497=null;
        Token char_literal499=null;
        nesCParser.parameter_type_list_return parameter_type_list498 =null;


        Object char_literal497_tree=null;
        Object char_literal499_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

            // nesC.g:896:5: ( '[' parameter_type_list ']' )
            // nesC.g:896:10: '[' parameter_type_list ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal497=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_instance_parameters8780); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal497_tree = 
            (Object)adaptor.create(char_literal497)
            ;
            adaptor.addChild(root_0, char_literal497_tree);
            }

            pushFollow(FOLLOW_parameter_type_list_in_instance_parameters8782);
            parameter_type_list498=parameter_type_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list498.getTree());

            char_literal499=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_instance_parameters8784); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal499_tree = 
            (Object)adaptor.create(char_literal499)
            ;
            adaptor.addChild(root_0, char_literal499_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:898:1: attributes : ( attribute )+ ;
    public final nesCParser.attributes_return attributes() throws RecognitionException {
        nesCParser.attributes_return retval = new nesCParser.attributes_return();
        retval.start = input.LT(1);

        int attributes_StartIndex = input.index();

        Object root_0 = null;

        nesCParser.attribute_return attribute500 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

            // nesC.g:899:5: ( ( attribute )+ )
            // nesC.g:899:10: ( attribute )+
            {
            root_0 = (Object)adaptor.nil();


            // nesC.g:899:10: ( attribute )+
            int cnt142=0;
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==ATTRIBUTE) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // nesC.g:899:10: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributes8803);
            	    attribute500=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute500.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt142 >= 1 ) break loop142;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(142, input);
                        throw eee;
                }
                cnt142++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
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
    // nesC.g:901:1: attribute : '@' identifier '(' initializer_list ')' ;
    public final nesCParser.attribute_return attribute() throws RecognitionException {
        nesCParser.attribute_return retval = new nesCParser.attribute_return();
        retval.start = input.LT(1);

        int attribute_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal501=null;
        Token char_literal503=null;
        Token char_literal505=null;
        nesCParser.identifier_return identifier502 =null;

        nesCParser.initializer_list_return initializer_list504 =null;


        Object char_literal501_tree=null;
        Object char_literal503_tree=null;
        Object char_literal505_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

            // nesC.g:902:5: ( '@' identifier '(' initializer_list ')' )
            // nesC.g:902:10: '@' identifier '(' initializer_list ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal501=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute8823); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal501_tree = 
            (Object)adaptor.create(char_literal501)
            ;
            adaptor.addChild(root_0, char_literal501_tree);
            }

            pushFollow(FOLLOW_identifier_in_attribute8825);
            identifier502=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier502.getTree());

            char_literal503=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_attribute8827); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal503_tree = 
            (Object)adaptor.create(char_literal503)
            ;
            adaptor.addChild(root_0, char_literal503_tree);
            }

            pushFollow(FOLLOW_initializer_list_in_attribute8829);
            initializer_list504=initializer_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer_list504.getTree());

            char_literal505=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_attribute8831); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal505_tree = 
            (Object)adaptor.create(char_literal505)
            ;
            adaptor.addChild(root_0, char_literal505_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 101, attribute_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // nesC.g:904:1: identifier : id= RAW_IDENTIFIER {...}?;
    public final nesCParser.identifier_return identifier() throws RecognitionException {
        nesCParser.identifier_return retval = new nesCParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

            // nesC.g:905:5: (id= RAW_IDENTIFIER {...}?)
            // nesC.g:905:9: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier8847); if (state.failed) return retval;
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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 102, identifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifier"

    // $ANTLR start synpred24_nesC
    public final void synpred24_nesC_fragment() throws RecognitionException {
        // nesC.g:281:10: ( SIZEOF '(' type_name ')' )
        // nesC.g:281:10: SIZEOF '(' type_name ')'
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred24_nesC3181); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred24_nesC3183); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred24_nesC3185);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred24_nesC3187); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_nesC

    // $ANTLR start synpred25_nesC
    public final void synpred25_nesC_fragment() throws RecognitionException {
        // nesC.g:282:10: ( SIZEOF unary_expression )
        // nesC.g:282:10: SIZEOF unary_expression
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred25_nesC3206); if (state.failed) return ;

        pushFollow(FOLLOW_unary_expression_in_synpred25_nesC3208);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_nesC

    // $ANTLR start synpred26_nesC
    public final void synpred26_nesC_fragment() throws RecognitionException {
        // nesC.g:290:10: ( '(' type_name ')' cast_expression )
        // nesC.g:290:10: '(' type_name ')' cast_expression
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred26_nesC3251); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred26_nesC3253);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred26_nesC3255); if (state.failed) return ;

        pushFollow(FOLLOW_cast_expression_in_synpred26_nesC3257);
        cast_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred26_nesC

    // $ANTLR start synpred56_nesC
    public final void synpred56_nesC_fragment() throws RecognitionException {
        // nesC.g:327:10: ( unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression )
        // nesC.g:327:10: unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression
        {
        pushFollow(FOLLOW_unary_expression_in_synpred56_nesC3659);
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


        pushFollow(FOLLOW_assignment_expression_in_synpred56_nesC3716);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_nesC

    // $ANTLR start synpred57_nesC
    public final void synpred57_nesC_fragment() throws RecognitionException {
        // nesC.g:331:33: ( ',' assignment_expression )
        // nesC.g:331:33: ',' assignment_expression
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred57_nesC3749); if (state.failed) return ;

        pushFollow(FOLLOW_assignment_expression_in_synpred57_nesC3752);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_nesC

    // $ANTLR start synpred59_nesC
    public final void synpred59_nesC_fragment() throws RecognitionException {
        // nesC.g:355:10: ( declaration_specifiers ( init_declarator_list )? ';' )
        // nesC.g:355:10: declaration_specifiers ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred59_nesC3836);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:359:33: ( init_declarator_list )?
        int alt144=2;
        int LA144_0 = input.LA(1);

        if ( (LA144_0==LPARENS||LA144_0==RAW_IDENTIFIER||LA144_0==STAR) ) {
            alt144=1;
        }
        switch (alt144) {
            case 1 :
                // nesC.g:359:33: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred59_nesC3838);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,183,FOLLOW_183_in_synpred59_nesC3841); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_nesC

    // $ANTLR start synpred60_nesC
    public final void synpred60_nesC_fragment() throws RecognitionException {
        // nesC.g:368:10: ( function_definition )
        // nesC.g:368:10: function_definition
        {
        pushFollow(FOLLOW_function_definition_in_synpred60_nesC3903);
        function_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_nesC

    // $ANTLR start synpred62_nesC
    public final void synpred62_nesC_fragment() throws RecognitionException {
        // nesC.g:388:11: ( type_specifier )
        // nesC.g:388:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred62_nesC4028);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred62_nesC

    // $ANTLR start synpred104_nesC
    public final void synpred104_nesC_fragment() throws RecognitionException {
        // nesC.g:448:10: ( struct_or_union ( identifier )? '{' struct_declaration_list '}' )
        // nesC.g:448:10: struct_or_union ( identifier )? '{' struct_declaration_list '}'
        {
        pushFollow(FOLLOW_struct_or_union_in_synpred104_nesC4713);
        struct_or_union();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:448:26: ( identifier )?
        int alt145=2;
        int LA145_0 = input.LA(1);

        if ( (LA145_0==RAW_IDENTIFIER) ) {
            alt145=1;
        }
        switch (alt145) {
            case 1 :
                // nesC.g:448:26: identifier
                {
                pushFollow(FOLLOW_identifier_in_synpred104_nesC4715);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred104_nesC4718); if (state.failed) return ;

        pushFollow(FOLLOW_struct_declaration_list_in_synpred104_nesC4720);
        struct_declaration_list();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACE,FOLLOW_RBRACE_in_synpred104_nesC4722); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred104_nesC

    // $ANTLR start synpred105_nesC
    public final void synpred105_nesC_fragment() throws RecognitionException {
        // nesC.g:450:10: ( struct_or_union identifier )
        // nesC.g:450:10: struct_or_union identifier
        {
        pushFollow(FOLLOW_struct_or_union_in_synpred105_nesC4756);
        struct_or_union();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred105_nesC4758);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred105_nesC

    // $ANTLR start synpred106_nesC
    public final void synpred106_nesC_fragment() throws RecognitionException {
        // nesC.g:452:10: ( STRUCT '@' identifier '{' struct_declaration_list '}' )
        // nesC.g:452:10: STRUCT '@' identifier '{' struct_declaration_list '}'
        {
        match(input,STRUCT,FOLLOW_STRUCT_in_synpred106_nesC4789); if (state.failed) return ;

        match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_synpred106_nesC4791); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred106_nesC4793);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred106_nesC4795); if (state.failed) return ;

        pushFollow(FOLLOW_struct_declaration_list_in_synpred106_nesC4797);
        struct_declaration_list();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACE,FOLLOW_RBRACE_in_synpred106_nesC4799); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred106_nesC

    // $ANTLR start synpred111_nesC
    public final void synpred111_nesC_fragment() throws RecognitionException {
        // nesC.g:478:11: ( type_specifier )
        // nesC.g:478:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred111_nesC5006);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_nesC

    // $ANTLR start synpred115_nesC
    public final void synpred115_nesC_fragment() throws RecognitionException {
        // nesC.g:489:10: ( ( declarator )? ':' constant_expression )
        // nesC.g:489:10: ( declarator )? ':' constant_expression
        {
        // nesC.g:489:10: ( declarator )?
        int alt146=2;
        int LA146_0 = input.LA(1);

        if ( (LA146_0==LPARENS||LA146_0==RAW_IDENTIFIER||LA146_0==STAR) ) {
            alt146=1;
        }
        switch (alt146) {
            case 1 :
                // nesC.g:489:10: declarator
                {
                pushFollow(FOLLOW_declarator_in_synpred115_nesC5071);
                declarator();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,182,FOLLOW_182_in_synpred115_nesC5074); if (state.failed) return ;

        pushFollow(FOLLOW_constant_expression_in_synpred115_nesC5076);
        constant_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred115_nesC

    // $ANTLR start synpred118_nesC
    public final void synpred118_nesC_fragment() throws RecognitionException {
        // nesC.g:493:10: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' )
        // nesC.g:493:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred118_nesC5106); if (state.failed) return ;

        // nesC.g:493:15: ( identifier )?
        int alt147=2;
        int LA147_0 = input.LA(1);

        if ( (LA147_0==RAW_IDENTIFIER) ) {
            alt147=1;
        }
        switch (alt147) {
            case 1 :
                // nesC.g:493:15: identifier
                {
                pushFollow(FOLLOW_identifier_in_synpred118_nesC5108);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred118_nesC5111); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred118_nesC5113);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:493:47: ( ',' )?
        int alt148=2;
        int LA148_0 = input.LA(1);

        if ( (LA148_0==COMMA) ) {
            alt148=1;
        }
        switch (alt148) {
            case 1 :
                // nesC.g:493:47: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred118_nesC5115); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred118_nesC5118); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_nesC

    // $ANTLR start synpred120_nesC
    public final void synpred120_nesC_fragment() throws RecognitionException {
        // nesC.g:495:10: ( ENUM identifier attributes '{' enumerator_list ( ',' )? '}' )
        // nesC.g:495:10: ENUM identifier attributes '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred120_nesC5153); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred120_nesC5155);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_attributes_in_synpred120_nesC5157);
        attributes();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred120_nesC5159); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred120_nesC5161);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:495:57: ( ',' )?
        int alt149=2;
        int LA149_0 = input.LA(1);

        if ( (LA149_0==COMMA) ) {
            alt149=1;
        }
        switch (alt149) {
            case 1 :
                // nesC.g:495:57: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred120_nesC5163); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred120_nesC5166); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_nesC

    // $ANTLR start synpred130_nesC
    public final void synpred130_nesC_fragment() throws RecognitionException {
        // nesC.g:545:9: ( '[' ( constant_expression )? ']' )
        // nesC.g:545:9: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred130_nesC5489); if (state.failed) return ;

        // nesC.g:545:13: ( constant_expression )?
        int alt151=2;
        int LA151_0 = input.LA(1);

        if ( (LA151_0==AMP||LA151_0==BITCOMPLEMENT||LA151_0==CALL||LA151_0==CHARACTER_LITERAL||LA151_0==CONSTANT||LA151_0==LPARENS||LA151_0==MINUS||LA151_0==MINUSMINUS||LA151_0==NOT||LA151_0==PLUS||LA151_0==PLUSPLUS||LA151_0==POST||LA151_0==RAW_IDENTIFIER||LA151_0==SIGNAL||LA151_0==SIZEOF||LA151_0==STAR||LA151_0==STRING_LITERAL) ) {
            alt151=1;
        }
        switch (alt151) {
            case 1 :
                // nesC.g:545:13: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred130_nesC5491);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred130_nesC5494); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred130_nesC

    // $ANTLR start synpred140_nesC
    public final void synpred140_nesC_fragment() throws RecognitionException {
        // nesC.g:580:10: ( declaration_specifiers declarator ( attributes )? )
        // nesC.g:580:10: declaration_specifiers declarator ( attributes )?
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred140_nesC5763);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_declarator_in_synpred140_nesC5765);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        // nesC.g:580:44: ( attributes )?
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==ATTRIBUTE) ) {
            alt154=1;
        }
        switch (alt154) {
            case 1 :
                // nesC.g:580:44: attributes
                {
                pushFollow(FOLLOW_attributes_in_synpred140_nesC5767);
                attributes();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred140_nesC

    // $ANTLR start synpred145_nesC
    public final void synpred145_nesC_fragment() throws RecognitionException {
        // nesC.g:592:10: ( ( pointer )? direct_abstract_declarator )
        // nesC.g:592:10: ( pointer )? direct_abstract_declarator
        {
        // nesC.g:592:10: ( pointer )?
        int alt155=2;
        int LA155_0 = input.LA(1);

        if ( (LA155_0==STAR) ) {
            alt155=1;
        }
        switch (alt155) {
            case 1 :
                // nesC.g:592:10: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred145_nesC5902);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred145_nesC5905);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred145_nesC

    // $ANTLR start synpred149_nesC
    public final void synpred149_nesC_fragment() throws RecognitionException {
        // nesC.g:598:15: ( parameter_type_list )
        // nesC.g:598:15: parameter_type_list
        {
        pushFollow(FOLLOW_parameter_type_list_in_synpred149_nesC5978);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred149_nesC

    // $ANTLR start synpred152_nesC
    public final void synpred152_nesC_fragment() throws RecognitionException {
        // nesC.g:599:52: ( parameter_type_list )
        // nesC.g:599:52: parameter_type_list
        {
        pushFollow(FOLLOW_parameter_type_list_in_synpred152_nesC6011);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred152_nesC

    // $ANTLR start synpred167_nesC
    public final void synpred167_nesC_fragment() throws RecognitionException {
        // nesC.g:651:10: ( declaration )
        // nesC.g:651:10: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred167_nesC6433);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred167_nesC

    // $ANTLR start synpred169_nesC
    public final void synpred169_nesC_fragment() throws RecognitionException {
        // nesC.g:662:43: ( ELSE statement )
        // nesC.g:662:43: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred169_nesC6509); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred169_nesC6511);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred169_nesC

    // $ANTLR start synpred182_nesC
    public final void synpred182_nesC_fragment() throws RecognitionException {
        // nesC.g:709:38: ( CONSTANT )
        // nesC.g:709:38: CONSTANT
        {
        match(input,CONSTANT,FOLLOW_CONSTANT_in_synpred182_nesC6951); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred182_nesC

    // $ANTLR start synpred185_nesC
    public final void synpred185_nesC_fragment() throws RecognitionException {
        // nesC.g:724:10: ( ( translation_unit )? interface_definition )
        // nesC.g:724:10: ( translation_unit )? interface_definition
        {
        // nesC.g:724:10: ( translation_unit )?
        int alt160=2;
        int LA160_0 = input.LA(1);

        if ( (LA160_0==ASYNC||LA160_0==AUTO||LA160_0==CHAR||LA160_0==COMMAND||LA160_0==CONST||LA160_0==DEFAULT||LA160_0==DUTY||LA160_0==ENUM||(LA160_0 >= EVENT && LA160_0 <= EXTERN)||LA160_0==HASH||(LA160_0 >= INLINE && LA160_0 <= INT8_T)||LA160_0==LONG||LA160_0==NORACE||(LA160_0 >= NXLE_UINT16_T && LA160_0 <= NX_UNION)||LA160_0==RAW_IDENTIFIER||LA160_0==REGISTER||LA160_0==RESTRICT||LA160_0==SHORT||LA160_0==SIGNED||LA160_0==STATIC||LA160_0==STRUCT||(LA160_0 >= TASK && LA160_0 <= UINT8_T)||(LA160_0 >= UNION && LA160_0 <= UNSIGNED)||(LA160_0 >= VOID && LA160_0 <= VOLATILE)) ) {
            alt160=1;
        }
        switch (alt160) {
            case 1 :
                // nesC.g:724:10: translation_unit
                {
                pushFollow(FOLLOW_translation_unit_in_synpred185_nesC7035);
                translation_unit();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_interface_definition_in_synpred185_nesC7038);
        interface_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred185_nesC

    // $ANTLR start synpred201_nesC
    public final void synpred201_nesC_fragment() throws RecognitionException {
        // nesC.g:760:10: ( module_implementation )
        // nesC.g:760:10: module_implementation
        {
        pushFollow(FOLLOW_module_implementation_in_synpred201_nesC7384);
        module_implementation();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred201_nesC

    // $ANTLR start synpred214_nesC
    public final void synpred214_nesC_fragment() throws RecognitionException {
        // nesC.g:832:10: ( expression )
        // nesC.g:832:10: expression
        {
        pushFollow(FOLLOW_expression_in_synpred214_nesC8059);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred214_nesC

    // $ANTLR start synpred215_nesC
    public final void synpred215_nesC_fragment() throws RecognitionException {
        // nesC.g:840:10: ( endpoint '=' endpoint ';' )
        // nesC.g:840:10: endpoint '=' endpoint ';'
        {
        pushFollow(FOLLOW_endpoint_in_synpred215_nesC8089);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred215_nesC8091); if (state.failed) return ;

        pushFollow(FOLLOW_endpoint_in_synpred215_nesC8093);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,183,FOLLOW_183_in_synpred215_nesC8095); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred215_nesC

    // $ANTLR start synpred217_nesC
    public final void synpred217_nesC_fragment() throws RecognitionException {
        // nesC.g:842:10: ( ( certificate_specification )? endpoint '->' endpoint ';' )
        // nesC.g:842:10: ( certificate_specification )? endpoint '->' endpoint ';'
        {
        // nesC.g:842:10: ( certificate_specification )?
        int alt162=2;
        int LA162_0 = input.LA(1);

        if ( (LA162_0==ENABLE) ) {
            alt162=1;
        }
        switch (alt162) {
            case 1 :
                // nesC.g:842:10: certificate_specification
                {
                pushFollow(FOLLOW_certificate_specification_in_synpred217_nesC8131);
                certificate_specification();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_endpoint_in_synpred217_nesC8134);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,ARROW,FOLLOW_ARROW_in_synpred217_nesC8136); if (state.failed) return ;

        pushFollow(FOLLOW_endpoint_in_synpred217_nesC8138);
        endpoint();

        state._fsp--;
        if (state.failed) return ;

        match(input,183,FOLLOW_183_in_synpred217_nesC8140); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred217_nesC

    // Delegated rules

    public final boolean synpred130_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred149_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred149_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred201_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred201_nesC_fragment(); // can never throw exception
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
    public final boolean synpred152_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_nesC_fragment(); // can never throw exception
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
    public final boolean synpred217_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred217_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_nesC_fragment(); // can never throw exception
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
    public final boolean synpred167_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred167_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred214_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred214_nesC_fragment(); // can never throw exception
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
    public final boolean synpred118_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred185_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred185_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred169_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred169_nesC_fragment(); // can never throw exception
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
    public final boolean synpred104_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_nesC_fragment(); // can never throw exception
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
    public final boolean synpred182_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred182_nesC_fragment(); // can never throw exception
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
    public final boolean synpred215_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred215_nesC_fragment(); // can never throw exception
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
    public final boolean synpred106_nesC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_nesC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA58 dfa58 = new DFA58(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA108 dfa108 = new DFA108(this);
    protected DFA126 dfa126 = new DFA126(this);
    static final String DFA58_eotS =
        "\5\uffff";
    static final String DFA58_eofS =
        "\1\uffff\2\4\2\uffff";
    static final String DFA58_minS =
        "\1\u00a0\2\36\2\uffff";
    static final String DFA58_maxS =
        "\1\u00a0\2\u00b2\2\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA58_specialS =
        "\5\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1",
            "\1\4\13\uffff\1\2\40\uffff\1\4\23\uffff\1\4\4\uffff\1\4\51"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "\1\4\13\uffff\1\2\40\uffff\1\4\23\uffff\1\4\4\uffff\1\4\51"+
            "\uffff\1\4\1\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\1\3"+
            "\21\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "554:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
    static final String DFA82_eotS =
        "\75\uffff";
    static final String DFA82_eofS =
        "\75\uffff";
    static final String DFA82_minS =
        "\1\6\33\uffff\1\0\2\uffff\1\0\35\uffff";
    static final String DFA82_maxS =
        "\1\u00b7\33\uffff\1\0\2\uffff\1\0\35\uffff";
    static final String DFA82_acceptS =
        "\1\uffff\1\1\37\uffff\1\2\33\uffff";
    static final String DFA82_specialS =
        "\34\uffff\1\0\2\uffff\1\1\35\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\41\7\uffff\1\1\1\41\1\uffff\1\1\1\uffff\1\41\4\uffff\3\41"+
            "\1\uffff\1\1\1\41\1\uffff\1\1\12\uffff\1\1\2\41\6\uffff\1\37"+
            "\4\uffff\1\41\1\uffff\1\1\3\uffff\1\1\2\uffff\2\1\1\uffff\1"+
            "\41\5\uffff\1\41\2\uffff\1\41\3\uffff\1\41\3\uffff\6\1\3\uffff"+
            "\1\41\4\uffff\1\1\1\41\2\uffff\1\41\1\uffff\1\41\5\uffff\1\1"+
            "\1\41\5\uffff\12\1\3\uffff\1\41\1\uffff\1\41\1\uffff\1\41\6"+
            "\uffff\1\34\2\uffff\1\1\2\uffff\1\1\1\41\3\uffff\1\1\1\41\1"+
            "\1\1\41\3\uffff\1\41\1\uffff\1\1\1\41\1\1\1\41\6\1\2\uffff\2"+
            "\1\1\uffff\2\1\1\41\3\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "650:1: block_item : ( declaration | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_28 = input.LA(1);

                         
                        int index82_28 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred167_nesC()) ) {s = 1;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index82_28);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA82_31 = input.LA(1);

                         
                        int index82_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred167_nesC()) ) {s = 1;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index82_31);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA108_eotS =
        "\14\uffff";
    static final String DFA108_eofS =
        "\14\uffff";
    static final String DFA108_minS =
        "\1\122\1\136\1\16\1\uffff\1\12\1\53\1\uffff\1\u00a3\2\16\2\0";
    static final String DFA108_maxS =
        "\1\122\1\136\1\u00b2\1\uffff\1\u00b8\1\53\1\uffff\1\u00a3\2\u00b2"+
        "\2\0";
    static final String DFA108_acceptS =
        "\3\uffff\1\1\2\uffff\1\2\5\uffff";
    static final String DFA108_specialS =
        "\12\uffff\1\0\1\1}>";
    static final String[] DFA108_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff\1\3\3\uffff\1\6\6\uffff"+
            "\1\3\10\uffff\1\3\6\uffff\1\3\2\uffff\1\6\1\3\2\uffff\2\3\12"+
            "\uffff\1\5\7\uffff\6\3\4\uffff\1\6\3\uffff\1\3\13\uffff\1\3"+
            "\6\uffff\12\3\16\uffff\1\4\1\6\1\uffff\1\3\2\uffff\1\3\4\uffff"+
            "\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\6\3\2\uffff"+
            "\2\3\1\uffff\2\3",
            "",
            "\1\6\1\uffff\1\6\1\uffff\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff"+
            "\1\3\12\uffff\1\3\10\uffff\1\3\5\uffff\1\6\1\3\3\uffff\1\3\2"+
            "\uffff\2\3\22\uffff\6\3\4\uffff\1\6\3\uffff\2\3\12\uffff\1\3"+
            "\6\uffff\12\3\16\uffff\1\3\2\uffff\1\3\2\uffff\1\3\4\uffff\1"+
            "\3\1\uffff\1\3\4\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1"+
            "\3\1\uffff\4\3\2\uffff\2\3\1\uffff\2\3\4\uffff\1\3\1\6",
            "\1\7",
            "",
            "\1\10",
            "\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff\1\3\3\uffff\1\6\6\uffff"+
            "\1\3\1\11\7\uffff\1\3\6\uffff\1\3\2\uffff\1\6\1\3\2\uffff\2"+
            "\3\12\uffff\1\5\7\uffff\6\3\4\uffff\1\6\3\uffff\1\3\13\uffff"+
            "\1\3\6\uffff\12\3\16\uffff\1\4\1\12\1\uffff\1\3\2\uffff\1\3"+
            "\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\6\3"+
            "\2\uffff\2\3\1\uffff\2\3",
            "\1\3\2\uffff\1\3\12\uffff\1\3\2\uffff\1\3\3\uffff\1\6\6\uffff"+
            "\1\3\10\uffff\1\3\6\uffff\1\3\2\uffff\1\6\1\3\2\uffff\2\3\12"+
            "\uffff\1\5\7\uffff\6\3\4\uffff\1\6\3\uffff\1\3\13\uffff\1\3"+
            "\6\uffff\12\3\16\uffff\1\4\1\13\1\uffff\1\3\2\uffff\1\3\4\uffff"+
            "\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\6\3\2\uffff"+
            "\2\3\1\uffff\2\3",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA108_eot = DFA.unpackEncodedString(DFA108_eotS);
    static final short[] DFA108_eof = DFA.unpackEncodedString(DFA108_eofS);
    static final char[] DFA108_min = DFA.unpackEncodedStringToUnsignedChars(DFA108_minS);
    static final char[] DFA108_max = DFA.unpackEncodedStringToUnsignedChars(DFA108_maxS);
    static final short[] DFA108_accept = DFA.unpackEncodedString(DFA108_acceptS);
    static final short[] DFA108_special = DFA.unpackEncodedString(DFA108_specialS);
    static final short[][] DFA108_transition;

    static {
        int numStates = DFA108_transitionS.length;
        DFA108_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA108_transition[i] = DFA.unpackEncodedString(DFA108_transitionS[i]);
        }
    }

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = DFA108_eot;
            this.eof = DFA108_eof;
            this.min = DFA108_min;
            this.max = DFA108_max;
            this.accept = DFA108_accept;
            this.special = DFA108_special;
            this.transition = DFA108_transition;
        }
        public String getDescription() {
            return "759:1: implementation : ( module_implementation | configuration_implementation );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA108_10 = input.LA(1);

                         
                        int index108_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred201_nesC()) ) {s = 3;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index108_10);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA108_11 = input.LA(1);

                         
                        int index108_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred201_nesC()) ) {s = 3;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index108_11);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 108, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA126_eotS =
        "\13\uffff";
    static final String DFA126_eofS =
        "\13\uffff";
    static final String DFA126_minS =
        "\1\137\1\12\2\u008e\2\uffff\1\u0090\2\12\1\u008e\1\12";
    static final String DFA126_maxS =
        "\1\u008e\1\u00b8\2\u008e\2\uffff\1\u0090\2\u00b8\1\u008e\1\u00b8";
    static final String DFA126_acceptS =
        "\4\uffff\1\1\1\2\5\uffff";
    static final String DFA126_specialS =
        "\13\uffff}>";
    static final String[] DFA126_transitionS = {
            "\1\2\56\uffff\1\1",
            "\1\4\1\uffff\1\4\54\uffff\1\3\45\uffff\1\5\127\uffff\2\4",
            "\1\6",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\4\1\uffff\1\4\54\uffff\1\3\45\uffff\1\5\127\uffff\2\4",
            "\1\4\1\uffff\1\4\54\uffff\1\11\45\uffff\1\5\127\uffff\2\4",
            "\1\12",
            "\1\4\1\uffff\1\4\54\uffff\1\11\45\uffff\1\5\127\uffff\2\4"
    };

    static final short[] DFA126_eot = DFA.unpackEncodedString(DFA126_eotS);
    static final short[] DFA126_eof = DFA.unpackEncodedString(DFA126_eofS);
    static final char[] DFA126_min = DFA.unpackEncodedStringToUnsignedChars(DFA126_minS);
    static final char[] DFA126_max = DFA.unpackEncodedStringToUnsignedChars(DFA126_maxS);
    static final short[] DFA126_accept = DFA.unpackEncodedString(DFA126_acceptS);
    static final short[] DFA126_special = DFA.unpackEncodedString(DFA126_specialS);
    static final short[][] DFA126_transition;

    static {
        int numStates = DFA126_transitionS.length;
        DFA126_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA126_transition[i] = DFA.unpackEncodedString(DFA126_transitionS[i]);
        }
    }

    class DFA126 extends DFA {

        public DFA126(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 126;
            this.eot = DFA126_eot;
            this.eof = DFA126_eof;
            this.min = DFA126_min;
            this.max = DFA126_max;
            this.accept = DFA126_accept;
            this.special = DFA126_special;
            this.transition = DFA126_transition;
        }
        public String getDescription() {
            return "851:1: endpoint : ( identifier_path | identifier_path '[' argument_expression_list ']' );";
        }
    }
 

    public static final BitSet FOLLOW_identifier_in_primary_expression2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_primary_expression2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_primary_expression2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_primary_expression2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_primary_expression2754 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_expression_in_primary_expression2756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_primary_expression2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_kind_in_postfix_expression2783 = new BitSet(new long[]{0x0000080020000000L,0x0000001000000000L,0x0000000800004000L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression2786 = new BitSet(new long[]{0x0200000000000402L,0x0000021080000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_postfix_expression_modifier_in_postfix_expression2788 = new BitSet(new long[]{0x0200000000000402L,0x0000021080000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACKET_in_postfix_expression_modifier2829 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_expression_in_postfix_expression_modifier2831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_postfix_expression_modifier2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression_modifier2851 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009144040A8L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression_modifier2853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression_modifier2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression_modifier2875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_postfix_expression_modifier2895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_postfix_expression_modifier2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_postfix_expression_modifier2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list2985 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list2988 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list2991 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unary_expression3012 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_unary_expression3033 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_unary_expression3054 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression3081 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression3107 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression3134 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITCOMPLEMENT_in_unary_expression3161 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_NOT_in_unary_expression3166 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3181 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LPARENS_in_unary_expression3183 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_type_name_in_unary_expression3185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_unary_expression3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression3206 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_cast_expression3251 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_type_name_in_cast_expression3253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_cast_expression3255 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3297 = new BitSet(new long[]{0x0080000000000002L,0x0000100000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression3302 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expression3307 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_MODULUS_in_multiplicative_expression3312 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3316 = new BitSet(new long[]{0x0080000000000002L,0x0000100000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3337 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression3342 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression3347 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3351 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3372 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression3377 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression3382 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3386 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3407 = new BitSet(new long[]{0x0000000000000002L,0x0000000300001800L});
    public static final BitSet FOLLOW_LESS_in_relational_expression3412 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression3417 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_LESSEQUAL_in_relational_expression3422 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_relational_expression3427 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3431 = new BitSet(new long[]{0x0000000000000002L,0x0000000300001800L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3452 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000001L});
    public static final BitSet FOLLOW_EQUAL_in_equality_expression3457 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equality_expression3462 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3466 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000001L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3487 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMP_in_and_expression3491 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3494 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3515 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_BITXOR_in_xor_expression3519 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3522 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3543 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_BITOR_in_or_expression3547 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3550 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3571 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression3575 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3578 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3599 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression3603 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3606 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression3627 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_185_in_conditional_expression3630 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_expression_in_conditional_expression3633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_conditional_expression3635 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_assignment_expression3659 = new BitSet(new long[]{0x0040000000A41000L,0x0000254000000000L,0x0000000001000010L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_expression3662 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_MULASSIGN_in_assignment_expression3667 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_DIVASSIGN_in_assignment_expression3672 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_MODASSIGN_in_assignment_expression3677 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_PLUSASSIGN_in_assignment_expression3682 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_MINUSASSIGN_in_assignment_expression3687 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_LSHIFTASSIGN_in_assignment_expression3692 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_RSHIFTASSIGN_in_assignment_expression3697 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_BITANDASSIGN_in_assignment_expression3702 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_BITXORASSIGN_in_assignment_expression3707 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_BITORASSIGN_in_assignment_expression3712 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3746 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_expression3749 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3752 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3836 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0080000100004000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_declaration3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration3948 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E00006L,0x0006CF540A124000L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3950 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000100004000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_declaration3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers4014 = new BitSet(new long[]{0x4408040090024002L,0xFFC0800807E00006L,0x0006CF540A124000L});
    public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers4028 = new BitSet(new long[]{0x4408040090024002L,0xFFC0800807E00006L,0x0006CF540A124000L});
    public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers4051 = new BitSet(new long[]{0x4408040090024002L,0xFFC0800807E00006L,0x0006CF540A124000L});
    public static final BitSet FOLLOW_function_specifier_in_declaration_specifiers4074 = new BitSet(new long[]{0x4408040090024002L,0xFFC0800807E00006L,0x0006CF540A124000L});
    public static final BitSet FOLLOW_DEFAULT_in_declaration_specifiers4093 = new BitSet(new long[]{0x4408040090024002L,0xFFC0800807E00006L,0x0006CF540A124000L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4116 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list4119 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000100004000L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list4121 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator4155 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_attributes_in_init_declarator4157 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator4161 = new BitSet(new long[]{0x0000080022080040L,0x0001029040000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_initializer_in_init_declarator4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT64_T_in_type_specifier4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT64_T_in_type_specifier4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT64_T_in_type_specifier4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT8_T_in_type_specifier4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT16_T_in_type_specifier4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT32_T_in_type_specifier4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT64_T_in_type_specifier4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4713 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4715 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4718 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_struct_or_union_specifier4789 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_struct_or_union_specifier4791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4793 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4795 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier4834 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_struct_or_union_specifier4836 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4838 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list4924 = new BitSet(new long[]{0x4000040010000002L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration4955 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0040000100004000L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration4957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_struct_declaration4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list5006 = new BitSet(new long[]{0x4000040010000002L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list5010 = new BitSet(new long[]{0x4000040010000002L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5036 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list5039 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0040000100004000L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list5041 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_struct_declarator5074 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5106 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5108 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5113 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5155 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_enum_specifier5157 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier5159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier5161 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier5163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier5202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5244 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list5247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list5250 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_identifier_in_enumerator5275 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator5278 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_function_specifier5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator5367 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator5395 = new BitSet(new long[]{0x0000000000000002L,0x0000001080000000L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator5397 = new BitSet(new long[]{0x0000000000000002L,0x0000001080000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5423 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier5426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier5463 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000100004000L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier5465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5489 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140140A8L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier5491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier5526 = new BitSet(new long[]{0x44080400D0024000L,0xFFC0800807E00006L,0x0006CF540A124000L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_declarator_modifier5530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier5532 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier5536 = new BitSet(new long[]{0x44080400D0024000L,0xFFC0800807E00006L,0x0006CF540A124000L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_declarator_modifier5540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5582 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0004000100100000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_pointer_in_pointer5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer5609 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0004000000100000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list5640 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0004000000100000L});
    public static final BitSet FOLLOW_parameter_list_in_parameter_type_list5661 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_type_list5664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_parameter_type_list5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list5691 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list5694 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E00006L,0x0006CF540A124000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list5696 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration5763 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000100004000L});
    public static final BitSet FOLLOW_declarator_in_parameter_declaration5765 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_parameter_declaration5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration5804 = new BitSet(new long[]{0x0000000000000002L,0x0000001080000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5849 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_identifier_list5852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5854 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name5880 = new BitSet(new long[]{0x0000000000000002L,0x0000001080000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5902 = new BitSet(new long[]{0x0000000000000000L,0x0000001080000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator5936 = new BitSet(new long[]{0x0000000000000000L,0x0000001080000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator5938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator5943 = new BitSet(new long[]{0x0000000000000002L,0x0000001080000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator5957 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140140A8L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator5959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator5962 = new BitSet(new long[]{0x0000000000000002L,0x0000001080000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator5976 = new BitSet(new long[]{0x44080400D0024000L,0xFFC0800807E00006L,0x0006CF540A524000L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_abstract_declarator5978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator5983 = new BitSet(new long[]{0x0000000000000002L,0x0000001080000000L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator6000 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140140A8L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator6002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator6005 = new BitSet(new long[]{0x0000000000000002L,0x0000001080000000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator6009 = new BitSet(new long[]{0x44080400D0024000L,0xFFC0800807E00006L,0x0006CF540A524000L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_abstract_declarator6011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator6014 = new BitSet(new long[]{0x0000000000000002L,0x0000001080000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer6094 = new BitSet(new long[]{0x0000080022080040L,0x0001029040000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_initializer_list_in_initializer6096 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_initializer6098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6128 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list6131 = new BitSet(new long[]{0x0000080022080040L,0x0001029040000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_initializer_in_initializer_list6133 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement6221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_statement_in_statement6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_statement6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOMIC_in_atomic_statement6267 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_atomic_statement6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_labeled_statement6296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_labeled_statement6298 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement6321 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement6323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_labeled_statement6325 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement6348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_labeled_statement6350 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_labeled_statement6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement6378 = new BitSet(new long[]{0x45081C00B70AC040L,0xFFC1829847E22416L,0x008ECFFD1E32C0A8L});
    public static final BitSet FOLLOW_block_item_in_compound_statement6391 = new BitSet(new long[]{0x45081C00B70AC040L,0xFFC1829847E22416L,0x008ECFFD1E32C0A8L});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_block_item6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block_item6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement6467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_expression_statement6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement6498 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6500 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_expression_in_selection_statement6502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6504 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_selection_statement6506 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement6509 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_selection_statement6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement6550 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement6552 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_expression_in_selection_statement6554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement6556 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_selection_statement6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6604 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6606 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6610 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_iteration_statement6633 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement6637 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6639 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_iteration_statement6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement6666 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement6668 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00800009140040A8L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_iteration_statement6675 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00800009140040A8L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_iteration_statement6682 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009144040A8L});
    public static final BitSet FOLLOW_expression_in_iteration_statement6686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement6689 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_iteration_statement6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_jump_statement6798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_jump_statement6800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_jump_statement6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement6821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_jump_statement6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement6838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_jump_statement6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement6855 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00800009140040A8L});
    public static final BitSet FOLLOW_expression_in_jump_statement6857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_jump_statement6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit6896 = new BitSet(new long[]{0x4408040090024002L,0xFFC0800807E02006L,0x0006CFD40A124000L});
    public static final BitSet FOLLOW_line_directive_in_translation_unit6900 = new BitSet(new long[]{0x4408040090024002L,0xFFC0800807E02006L,0x0006CFD40A124000L});
    public static final BitSet FOLLOW_declaration_in_external_declaration6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive6945 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive6947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive6949 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition6979 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000100004000L});
    public static final BitSet FOLLOW_declarator_in_function_definition6981 = new BitSet(new long[]{0x0000000000010000L,0x0000000040000000L});
    public static final BitSet FOLLOW_attributes_in_function_definition6983 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7035 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_interface_definition_in_nesC_file7038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_nesC_file7060 = new BitSet(new long[]{0x0000010400000000L,0x0000080000000200L});
    public static final BitSet FOLLOW_component_in_nesC_file7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_definition7111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_interface_definition7113 = new BitSet(new long[]{0x0000000000010000L,0x0000000140000000L});
    public static final BitSet FOLLOW_type_parameters_in_interface_definition7115 = new BitSet(new long[]{0x0000000000010000L,0x0000000040000000L});
    public static final BitSet FOLLOW_attributes_in_interface_definition7118 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_interface_definition7129 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E02006L,0x0006CFD40A12C000L});
    public static final BitSet FOLLOW_declaration_in_interface_definition7142 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E02006L,0x0006CFD40A12C000L});
    public static final BitSet FOLLOW_line_directive_in_interface_definition7146 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E02006L,0x0006CFD40A12C000L});
    public static final BitSet FOLLOW_RBRACE_in_interface_definition7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_parameters7206 = new BitSet(new long[]{0x4000000010000000L,0xFFC0000807C00000L,0x0002CF100A004000L});
    public static final BitSet FOLLOW_type_parameter_list_in_type_parameters7208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_GREATER_in_type_parameters7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7229 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7231 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_type_parameter_list7235 = new BitSet(new long[]{0x4000000010000000L,0xFFC0000807C00000L,0x0002CF100A004000L});
    public static final BitSet FOLLOW_type_specifier_in_type_parameter_list7237 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_attributes_in_type_parameter_list7239 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_comp_kind_in_component7260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_component7262 = new BitSet(new long[]{0x0000000000010000L,0x0000001040000000L});
    public static final BitSet FOLLOW_comp_parameters_in_component7264 = new BitSet(new long[]{0x0000000000010000L,0x0000000040000000L});
    public static final BitSet FOLLOW_attributes_in_component7267 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_component_specification_in_component7278 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_implementation_in_component7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_comp_kind7317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONFIGURATION_in_comp_kind7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENT_in_comp_kind7339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_comp_kind7350 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_MODULE_in_comp_kind7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_in_comp_kind7363 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CONFIGURATION_in_comp_kind7365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_implementation7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_implementation_in_implementation7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_comp_parameters7414 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E00006L,0x0006CFD40A124000L});
    public static final BitSet FOLLOW_component_parameter_list_in_comp_parameters7416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_comp_parameters7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7437 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_parameter_list7440 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E00006L,0x0006CFD40A124000L});
    public static final BitSet FOLLOW_component_parameter_in_component_parameter_list7442 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_component_parameter7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_component_parameter7474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_component_parameter7476 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_component_parameter7478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_module_implementation7501 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_module_implementation7503 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E02006L,0x0006CFD40A124000L});
    public static final BitSet FOLLOW_translation_unit_in_module_implementation7535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_module_implementation7591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_configuration_implementation7627 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_configuration_implementation7629 = new BitSet(new long[]{0x2000000800000000L,0x0000000080002000L,0x000000000000C000L});
    public static final BitSet FOLLOW_configuration_element_list_in_configuration_implementation7661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_configuration_implementation7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configuration_element_in_configuration_element_list7759 = new BitSet(new long[]{0x2000000800000002L,0x0000000080002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_line_directive_in_configuration_element_list7763 = new BitSet(new long[]{0x2000000800000002L,0x0000000080002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_components_in_configuration_element7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connection_in_configuration_element7795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPONENTS_in_components7840 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_component_line_in_components7842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_components7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_declaration_in_component_line7871 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_line7874 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_component_declaration_in_component_line7876 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_component_ref_in_component_declaration7902 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AS_in_component_declaration7905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_component_declaration7907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_component_ref7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_component_ref7956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_component_ref7958 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LPARENS_in_component_ref7960 = new BitSet(new long[]{0x40000C0032080040L,0xFFC1029807C00000L,0x0006CF191E5040A8L});
    public static final BitSet FOLLOW_component_argument_list_in_component_ref7962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_component_ref7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8012 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_component_argument_list8015 = new BitSet(new long[]{0x40000C0032080040L,0xFFC1029807C00000L,0x0006CF191E1040A8L});
    public static final BitSet FOLLOW_component_argument_in_component_argument_list8017 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_expression_in_component_argument8059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_component_argument8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endpoint_in_connection8089 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGN_in_connection8091 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_endpoint_in_connection8093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_connection8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8131 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_endpoint_in_connection8134 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARROW_in_connection8136 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_endpoint_in_connection8138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_connection8140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_connection8179 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_endpoint_in_connection8182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_184_in_connection8184 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_endpoint_in_connection8186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_connection8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENABLE_in_certificate_specification8231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8235 = new BitSet(new long[]{0x0000000000002800L,0x0000000000000010L});
    public static final BitSet FOLLOW_AS_in_certificate_specification8238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8242 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASSUMING_in_certificate_specification8247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_certificate_specification8251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_FOR_in_certificate_specification8255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_path_in_endpoint8319 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACKET_in_endpoint8321 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_argument_expression_list_in_endpoint8323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_endpoint8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8344 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8349 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifier_path8383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifier_path8389 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifier_path8392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_identifier_path8396 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification8445 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E02006L,0x0007CFD40A12E000L});
    public static final BitSet FOLLOW_uses_provides_in_component_specification8460 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E02006L,0x0007CFD40A12E000L});
    public static final BitSet FOLLOW_line_directive_in_component_specification8464 = new BitSet(new long[]{0x4408040090024000L,0xFFC0800807E02006L,0x0007CFD40A12E000L});
    public static final BitSet FOLLOW_RBRACE_in_component_specification8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides8496 = new BitSet(new long[]{0x4408040090024000L,0xFFC080084FE00006L,0x0006CFD40A164000L});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides8517 = new BitSet(new long[]{0x4408040090024000L,0xFFC080084FE00006L,0x0006CFD40A164000L});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_uses_provides8538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list8580 = new BitSet(new long[]{0x4408040090024000L,0xFFC080080FE00006L,0x0006CFD40A164000L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list8582 = new BitSet(new long[]{0x4408040090024000L,0xFFC080080FE00006L,0x0006CFD40A16C000L});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_type_in_specification_element8620 = new BitSet(new long[]{0x0000000000010800L,0x0000000080000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_AS_in_specification_element8623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_specification_element8625 = new BitSet(new long[]{0x0000000000010000L,0x0000000080000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_instance_parameters_in_specification_element8629 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_attributes_in_specification_element8632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_specification_element8635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOTE_in_interface_type8682 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_type8685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_interface_type8687 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_type_arguments_in_interface_type8689 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_REQUIRES_in_interface_type8693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_interface_type8695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_type_arguments8745 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_type_name_in_type_arguments8747 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_type_arguments8750 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_type_name_in_type_arguments8752 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_GREATER_in_type_arguments8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_instance_parameters8780 = new BitSet(new long[]{0x44080400D0024000L,0xFFC0800807E00006L,0x0006CF540A124000L});
    public static final BitSet FOLLOW_parameter_type_list_in_instance_parameters8782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_instance_parameters8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributes8803 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute8823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_attribute8825 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LPARENS_in_attribute8827 = new BitSet(new long[]{0x0000080022080040L,0x0001029040000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_initializer_list_in_attribute8829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_attribute8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier8847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred24_nesC3181 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred24_nesC3183 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_type_name_in_synpred24_nesC3185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred24_nesC3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred25_nesC3206 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_unary_expression_in_synpred25_nesC3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred26_nesC3251 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_type_name_in_synpred26_nesC3253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred26_nesC3255 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_cast_expression_in_synpred26_nesC3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_synpred56_nesC3659 = new BitSet(new long[]{0x0040000000A41000L,0x0000254000000000L,0x0000000001000010L});
    public static final BitSet FOLLOW_set_in_synpred56_nesC3661 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred56_nesC3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred57_nesC3749 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred57_nesC3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred59_nesC3836 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0080000100004000L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred59_nesC3838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_synpred59_nesC3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_synpred60_nesC3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred62_nesC4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_synpred104_nesC4713 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_synpred104_nesC4715 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred104_nesC4718 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_struct_declaration_list_in_synpred104_nesC4720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred104_nesC4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_synpred105_nesC4756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_synpred105_nesC4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_synpred106_nesC4789 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_synpred106_nesC4791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_synpred106_nesC4793 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred106_nesC4795 = new BitSet(new long[]{0x4000040010000000L,0xFFC0000807C00000L,0x0006CF100A104000L});
    public static final BitSet FOLLOW_struct_declaration_list_in_synpred106_nesC4797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred106_nesC4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred111_nesC5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred115_nesC5071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_synpred115_nesC5074 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140040A8L});
    public static final BitSet FOLLOW_constant_expression_in_synpred115_nesC5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred118_nesC5106 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_synpred118_nesC5108 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred118_nesC5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred118_nesC5113 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_synpred118_nesC5115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred118_nesC5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred120_nesC5153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_in_synpred120_nesC5155 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_attributes_in_synpred120_nesC5157 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred120_nesC5159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred120_nesC5161 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_synpred120_nesC5163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred120_nesC5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred130_nesC5489 = new BitSet(new long[]{0x0000080022080040L,0x0001029000000000L,0x00000009140140A8L});
    public static final BitSet FOLLOW_constant_expression_in_synpred130_nesC5491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred130_nesC5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred140_nesC5763 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000100004000L});
    public static final BitSet FOLLOW_declarator_in_synpred140_nesC5765 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_attributes_in_synpred140_nesC5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred145_nesC5902 = new BitSet(new long[]{0x0000000000000000L,0x0000001080000000L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred145_nesC5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred149_nesC5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred152_nesC6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred167_nesC6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred169_nesC6509 = new BitSet(new long[]{0x0108180027088040L,0x0001029040022410L,0x00880029142040A8L});
    public static final BitSet FOLLOW_statement_in_synpred169_nesC6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_synpred182_nesC6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_synpred185_nesC7035 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_interface_definition_in_synpred185_nesC7038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_synpred201_nesC7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred214_nesC8059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endpoint_in_synpred215_nesC8089 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred215_nesC8091 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_endpoint_in_synpred215_nesC8093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_synpred215_nesC8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_certificate_specification_in_synpred217_nesC8131 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_endpoint_in_synpred217_nesC8134 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARROW_in_synpred217_nesC8136 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_endpoint_in_synpred217_nesC8138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_synpred217_nesC8140 = new BitSet(new long[]{0x0000000000000002L});

}