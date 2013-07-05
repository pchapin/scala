// $ANTLR 3.4 Mininess.g 2013-07-05 14:45:28

    package edu.uvm.mininess.parser;
    import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MininessParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDRESS_OF", "AMP", "AND", "ARGUMENT_LIST", "ARRAYINC", "ARRAY_ELEMENT_SELECTION", "ARROW", "ASSIGN", "BITANDASSIGN", "BITCOMPLEMENT", "BITOR", "BITORASSIGN", "BITXOR", "BITXORASSIGN", "CALL", "CASE", "CAST", "CHAR", "CHARACTER_LITERAL", "COMMA", "COMMAND", "COMMENT1", "COMMENT2", "COMPOUND_STATEMENT", "CONST", "CONSTANT", "DECLARATION", "DECLARATOR", "DECLARATOR_ARRAY_MODIFIER", "DECLARATOR_LIST", "DECLARATOR_PARAMETER_LIST_MODIFIER", "DEC_NUMBER", "DEFAULT", "DEREFERENCE", "DIGIT", "DIVASSIGN", "DIVIDE", "DOT", "ELLIPSIS", "ELSE", "ENUM", "ENUMERATOR", "EQUAL", "ERROR_T", "EVENT", "FILE", "FOR", "FOR_CONDITION", "FOR_INITIALIZE", "FOR_ITERATION", "FUNCTION_DEFINITION", "GREATER", "GREATEREQUAL", "HASH", "HEX_DIGIT", "HEX_NUMBER", "IDENTIFIER_PATH", "IF", "IMPLEMENTATION", "INITIALIZER_LIST", "INIT_DECLARATOR", "INT", "INT16_T", "INT32_T", "INT8_T", "INTERFACE", "LBRACE", "LBRACKET", "LESS", "LESSEQUAL", "LINE_DIRECTIVE", "LONG", "LPARENS", "LSHIFT", "LSHIFTASSIGN", "MINUS", "MINUSASSIGN", "MINUSMINUS", "MODASSIGN", "MODULE", "MODULUS", "MULASSIGN", "NOT", "NOTEQUAL", "NULL", "NUMBER", "NUMBER_PREFIX", "NUMBER_SUFFIX", "NXLE_INT16_T", "NXLE_INT32_T", "NXLE_INT8_T", "NXLE_UINT16_T", "NXLE_UINT32_T", "NXLE_UINT8_T", "NX_INT16_T", "NX_INT32_T", "NX_INT8_T", "NX_STRUCT", "NX_UINT16_T", "NX_UINT32_T", "NX_UINT8_T", "OR", "PARAMETER", "PARAMETER_LIST", "PLUS", "PLUSASSIGN", "PLUSPLUS", "POINTER_QUALIFIER", "POST", "POSTFIX_EXPRESSION", "POST_DECREMENT", "POST_INCREMENT", "PRE_DECREMENT", "PRE_INCREMENT", "PROVIDES", "RAW_IDENTIFIER", "RBRACE", "RBRACKET", "RETURN", "RPARENS", "RSHIFT", "RSHIFTASSIGN", "SHORT", "SIGNED", "SIZEOF", "SIZEOF_EXPRESSION", "SIZEOF_TYPE", "SPECIFICATION", "STAR", "STATEMENT", "STRING_LITERAL", "STRUCT", "SWITCH", "TASK", "TYPEDEF", "UINT16_T", "UINT32_T", "UINT8_T", "UNARY_MINUS", "UNARY_PLUS", "UNSIGNED", "USES", "VOID", "WHILE", "WHITESPACE", "':'", "';'", "'?'"
    };

    public static final int EOF=-1;
    public static final int T__149=149;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int ADDRESS_OF=4;
    public static final int AMP=5;
    public static final int AND=6;
    public static final int ARGUMENT_LIST=7;
    public static final int ARRAYINC=8;
    public static final int ARRAY_ELEMENT_SELECTION=9;
    public static final int ARROW=10;
    public static final int ASSIGN=11;
    public static final int BITANDASSIGN=12;
    public static final int BITCOMPLEMENT=13;
    public static final int BITOR=14;
    public static final int BITORASSIGN=15;
    public static final int BITXOR=16;
    public static final int BITXORASSIGN=17;
    public static final int CALL=18;
    public static final int CASE=19;
    public static final int CAST=20;
    public static final int CHAR=21;
    public static final int CHARACTER_LITERAL=22;
    public static final int COMMA=23;
    public static final int COMMAND=24;
    public static final int COMMENT1=25;
    public static final int COMMENT2=26;
    public static final int COMPOUND_STATEMENT=27;
    public static final int CONST=28;
    public static final int CONSTANT=29;
    public static final int DECLARATION=30;
    public static final int DECLARATOR=31;
    public static final int DECLARATOR_ARRAY_MODIFIER=32;
    public static final int DECLARATOR_LIST=33;
    public static final int DECLARATOR_PARAMETER_LIST_MODIFIER=34;
    public static final int DEC_NUMBER=35;
    public static final int DEFAULT=36;
    public static final int DEREFERENCE=37;
    public static final int DIGIT=38;
    public static final int DIVASSIGN=39;
    public static final int DIVIDE=40;
    public static final int DOT=41;
    public static final int ELLIPSIS=42;
    public static final int ELSE=43;
    public static final int ENUM=44;
    public static final int ENUMERATOR=45;
    public static final int EQUAL=46;
    public static final int ERROR_T=47;
    public static final int EVENT=48;
    public static final int FILE=49;
    public static final int FOR=50;
    public static final int FOR_CONDITION=51;
    public static final int FOR_INITIALIZE=52;
    public static final int FOR_ITERATION=53;
    public static final int FUNCTION_DEFINITION=54;
    public static final int GREATER=55;
    public static final int GREATEREQUAL=56;
    public static final int HASH=57;
    public static final int HEX_DIGIT=58;
    public static final int HEX_NUMBER=59;
    public static final int IDENTIFIER_PATH=60;
    public static final int IF=61;
    public static final int IMPLEMENTATION=62;
    public static final int INITIALIZER_LIST=63;
    public static final int INIT_DECLARATOR=64;
    public static final int INT=65;
    public static final int INT16_T=66;
    public static final int INT32_T=67;
    public static final int INT8_T=68;
    public static final int INTERFACE=69;
    public static final int LBRACE=70;
    public static final int LBRACKET=71;
    public static final int LESS=72;
    public static final int LESSEQUAL=73;
    public static final int LINE_DIRECTIVE=74;
    public static final int LONG=75;
    public static final int LPARENS=76;
    public static final int LSHIFT=77;
    public static final int LSHIFTASSIGN=78;
    public static final int MINUS=79;
    public static final int MINUSASSIGN=80;
    public static final int MINUSMINUS=81;
    public static final int MODASSIGN=82;
    public static final int MODULE=83;
    public static final int MODULUS=84;
    public static final int MULASSIGN=85;
    public static final int NOT=86;
    public static final int NOTEQUAL=87;
    public static final int NULL=88;
    public static final int NUMBER=89;
    public static final int NUMBER_PREFIX=90;
    public static final int NUMBER_SUFFIX=91;
    public static final int NXLE_INT16_T=92;
    public static final int NXLE_INT32_T=93;
    public static final int NXLE_INT8_T=94;
    public static final int NXLE_UINT16_T=95;
    public static final int NXLE_UINT32_T=96;
    public static final int NXLE_UINT8_T=97;
    public static final int NX_INT16_T=98;
    public static final int NX_INT32_T=99;
    public static final int NX_INT8_T=100;
    public static final int NX_STRUCT=101;
    public static final int NX_UINT16_T=102;
    public static final int NX_UINT32_T=103;
    public static final int NX_UINT8_T=104;
    public static final int OR=105;
    public static final int PARAMETER=106;
    public static final int PARAMETER_LIST=107;
    public static final int PLUS=108;
    public static final int PLUSASSIGN=109;
    public static final int PLUSPLUS=110;
    public static final int POINTER_QUALIFIER=111;
    public static final int POST=112;
    public static final int POSTFIX_EXPRESSION=113;
    public static final int POST_DECREMENT=114;
    public static final int POST_INCREMENT=115;
    public static final int PRE_DECREMENT=116;
    public static final int PRE_INCREMENT=117;
    public static final int PROVIDES=118;
    public static final int RAW_IDENTIFIER=119;
    public static final int RBRACE=120;
    public static final int RBRACKET=121;
    public static final int RETURN=122;
    public static final int RPARENS=123;
    public static final int RSHIFT=124;
    public static final int RSHIFTASSIGN=125;
    public static final int SHORT=126;
    public static final int SIGNED=127;
    public static final int SIZEOF=128;
    public static final int SIZEOF_EXPRESSION=129;
    public static final int SIZEOF_TYPE=130;
    public static final int SPECIFICATION=131;
    public static final int STAR=132;
    public static final int STATEMENT=133;
    public static final int STRING_LITERAL=134;
    public static final int STRUCT=135;
    public static final int SWITCH=136;
    public static final int TASK=137;
    public static final int TYPEDEF=138;
    public static final int UINT16_T=139;
    public static final int UINT32_T=140;
    public static final int UINT8_T=141;
    public static final int UNARY_MINUS=142;
    public static final int UNARY_PLUS=143;
    public static final int UNSIGNED=144;
    public static final int USES=145;
    public static final int VOID=146;
    public static final int WHILE=147;
    public static final int WHITESPACE=148;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MininessParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MininessParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MininessParser.tokenNames; }
    public String getGrammarFileName() { return "Mininess.g"; }


        // This is mostly just a placeholder.
        private final int VERSION = 1;

        private ParserSymbolsManager symbols;

        // The global symbol table contains information about global symbols defined in other files.
        public void setSymbols(ParserSymbolsManager globalSymbols)
        {
            symbols = globalSymbols;
        }

        // The following two magic methods, together with the @rulecatch section below cause the
        // parser to exit immediately with an exception when an error is encountered.
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

        // The following two overrides provide enhanced error messages that are useful for debugging
        // grammar problems. The messages produced are not very suitable for end users so these
        // methods should probably be removed before a "production" version of Scalaness is released.
        //
        // If you run ANTLR with the -dfa option, it will generate DOT files showing decision state
        // diagrams. You can use these files to look up a particular decision number to get more
        // information about what the parser was attempting to do when it encountered the error.
        // See Section 10.2 on page 245 of the Definitive ANTLR book (for ANTLR v3).
        //
        // public String getErrorMessage(RecognitionException e, String[] tokenNames)
        // {
        //     List stack = getRuleInvocationStack(e, this.getClass().getName());
        //     String msg = null;
        //     if ( e instanceof NoViableAltException ) {
        //         NoViableAltException nvae = (NoViableAltException)e;
        //         msg = " no viable alt; token=" + e.token +
        //               " (decision=" + nvae.decisionNumber +
        //               " state " + nvae.stateNumber + ")" +
        //               " decision=<<" + nvae.grammarDecisionDescription + ">>";
        //     }
        //     else {
        //         msg = super.getErrorMessage(e, tokenNames);
        //     }
        //     return stack + " " + msg;
        // }
        //
        // public String getTokenErrorDisplay(Token t)
        // {
        //     return t.toString();
        // }


    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expression"
    // Mininess.g:246:1: primary_expression : ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression );
    public final MininessParser.primary_expression_return primary_expression() throws RecognitionException {
        MininessParser.primary_expression_return retval = new MininessParser.primary_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTANT2=null;
        Token STRING_LITERAL3=null;
        Token CHARACTER_LITERAL4=null;
        Token char_literal5=null;
        Token char_literal7=null;
        MininessParser.identifier_return identifier1 =null;

        MininessParser.expression_return expression6 =null;


        Object CONSTANT2_tree=null;
        Object STRING_LITERAL3_tree=null;
        Object CHARACTER_LITERAL4_tree=null;
        Object char_literal5_tree=null;
        Object char_literal7_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Mininess.g:247:5: ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression )
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
                    // Mininess.g:247:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression2170);
                    identifier1=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier1.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:248:10: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT2=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_primary_expression2181); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT2_tree = 
                    (Object)adaptor.create(CONSTANT2)
                    ;
                    adaptor.addChild(root_0, CONSTANT2_tree);
                    }

                    }
                    break;
                case 3 :
                    // Mininess.g:249:10: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primary_expression2192); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL3_tree = 
                    (Object)adaptor.create(STRING_LITERAL3)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL3_tree);
                    }

                    }
                    break;
                case 4 :
                    // Mininess.g:250:10: CHARACTER_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARACTER_LITERAL4=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_primary_expression2203); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARACTER_LITERAL4_tree = 
                    (Object)adaptor.create(CHARACTER_LITERAL4)
                    ;
                    adaptor.addChild(root_0, CHARACTER_LITERAL4_tree);
                    }

                    }
                    break;
                case 5 :
                    // Mininess.g:251:10: '(' expression ')'
                    {
                    char_literal5=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_primary_expression2214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_primary_expression2216);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

                    char_literal7=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_primary_expression2218); if (state.failed) return retval; 
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
                    // 251:29: -> expression
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
        }
        return retval;
    }
    // $ANTLR end "primary_expression"


    public static class postfix_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expression"
    // Mininess.g:259:1: postfix_expression : ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) ;
    public final MininessParser.postfix_expression_return postfix_expression() throws RecognitionException {
        MininessParser.postfix_expression_return retval = new MininessParser.postfix_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.call_kind_return call_kind8 =null;

        MininessParser.primary_expression_return primary_expression9 =null;

        MininessParser.postfix_expression_modifier_return postfix_expression_modifier10 =null;


        RewriteRuleSubtreeStream stream_call_kind=new RewriteRuleSubtreeStream(adaptor,"rule call_kind");
        RewriteRuleSubtreeStream stream_postfix_expression_modifier=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression_modifier");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            // Mininess.g:260:5: ( ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) )
            // Mininess.g:260:10: ( call_kind )? primary_expression ( postfix_expression_modifier )*
            {
            // Mininess.g:260:10: ( call_kind )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CALL||LA2_0==POST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Mininess.g:260:10: call_kind
                    {
                    pushFollow(FOLLOW_call_kind_in_postfix_expression2243);
                    call_kind8=call_kind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_call_kind.add(call_kind8.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_primary_expression_in_postfix_expression2246);
            primary_expression9=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression9.getTree());

            // Mininess.g:260:40: ( postfix_expression_modifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARROW||LA3_0==DOT||LA3_0==LBRACKET||LA3_0==LPARENS||LA3_0==MINUSMINUS||LA3_0==PLUSPLUS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Mininess.g:260:40: postfix_expression_modifier
            	    {
            	    pushFollow(FOLLOW_postfix_expression_modifier_in_postfix_expression2248);
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
            // 261:13: -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
            {
                // Mininess.g:261:16: ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION")
                , root_1);

                // Mininess.g:261:37: ( call_kind )?
                if ( stream_call_kind.hasNext() ) {
                    adaptor.addChild(root_1, stream_call_kind.nextTree());

                }
                stream_call_kind.reset();

                adaptor.addChild(root_1, stream_primary_expression.nextTree());

                // Mininess.g:261:67: ( postfix_expression_modifier )*
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
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"


    public static class postfix_expression_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expression_modifier"
    // Mininess.g:263:1: postfix_expression_modifier : ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' );
    public final MininessParser.postfix_expression_modifier_return postfix_expression_modifier() throws RecognitionException {
        MininessParser.postfix_expression_modifier_return retval = new MininessParser.postfix_expression_modifier_return();
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
        MininessParser.expression_return expression12 =null;

        MininessParser.argument_expression_list_return argument_expression_list15 =null;

        MininessParser.identifier_return identifier18 =null;

        MininessParser.identifier_return identifier20 =null;


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
            // Mininess.g:264:5: ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' )
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
                    // Mininess.g:264:9: '[' expression ']'
                    {
                    char_literal11=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_postfix_expression_modifier2289); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal11);


                    pushFollow(FOLLOW_expression_in_postfix_expression_modifier2291);
                    expression12=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression12.getTree());

                    char_literal13=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_postfix_expression_modifier2293); if (state.failed) return retval; 
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
                    // 264:28: -> ^( ARRAY_ELEMENT_SELECTION expression )
                    {
                        // Mininess.g:264:31: ^( ARRAY_ELEMENT_SELECTION expression )
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
                    // Mininess.g:265:9: '(' ( argument_expression_list )? ')'
                    {
                    char_literal14=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression_modifier2311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal14);


                    // Mininess.g:265:13: ( argument_expression_list )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AMP||LA4_0==BITCOMPLEMENT||LA4_0==CALL||LA4_0==CHARACTER_LITERAL||LA4_0==CONSTANT||LA4_0==LPARENS||LA4_0==MINUS||LA4_0==MINUSMINUS||LA4_0==NOT||LA4_0==PLUS||LA4_0==PLUSPLUS||LA4_0==POST||LA4_0==RAW_IDENTIFIER||LA4_0==SIZEOF||LA4_0==STAR||LA4_0==STRING_LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Mininess.g:265:13: argument_expression_list
                            {
                            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression_modifier2313);
                            argument_expression_list15=argument_expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list15.getTree());

                            }
                            break;

                    }


                    char_literal16=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression_modifier2316); if (state.failed) return retval; 
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
                    // 265:43: -> ^( ARGUMENT_LIST ( argument_expression_list )? )
                    {
                        // Mininess.g:265:46: ^( ARGUMENT_LIST ( argument_expression_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST")
                        , root_1);

                        // Mininess.g:265:62: ( argument_expression_list )?
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
                    // Mininess.g:266:9: '.' identifier
                    {
                    char_literal17=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression_modifier2335); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal17);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2337);
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
                    // 266:24: -> ^( '.' identifier )
                    {
                        // Mininess.g:266:27: ^( '.' identifier )
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
                    // Mininess.g:267:9: '->' identifier
                    {
                    string_literal19=(Token)match(input,ARROW,FOLLOW_ARROW_in_postfix_expression_modifier2355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal19);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2357);
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
                    // 267:25: -> ^( '->' identifier )
                    {
                        // Mininess.g:267:28: ^( '->' identifier )
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
                    // Mininess.g:268:9: '++'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal21=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfix_expression_modifier2375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = 
                    (Object)adaptor.create(string_literal21)
                    ;
                    adaptor.addChild(root_0, string_literal21_tree);
                    }

                    }
                    break;
                case 6 :
                    // Mininess.g:269:9: '--'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal22=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfix_expression_modifier2385); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "postfix_expression_modifier"


    public static class call_kind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call_kind"
    // Mininess.g:271:1: call_kind : ( CALL | POST );
    public final MininessParser.call_kind_return call_kind() throws RecognitionException {
        MininessParser.call_kind_return retval = new MininessParser.call_kind_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            // Mininess.g:272:5: ( CALL | POST )
            // Mininess.g:
            {
            root_0 = (Object)adaptor.nil();


            set23=(Token)input.LT(1);

            if ( input.LA(1)==CALL||input.LA(1)==POST ) {
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
        }
        return retval;
    }
    // $ANTLR end "call_kind"


    public static class argument_expression_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument_expression_list"
    // Mininess.g:275:1: argument_expression_list : assignment_expression ( ',' ! assignment_expression )* ;
    public final MininessParser.argument_expression_list_return argument_expression_list() throws RecognitionException {
        MininessParser.argument_expression_list_return retval = new MininessParser.argument_expression_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal25=null;
        MininessParser.assignment_expression_return assignment_expression24 =null;

        MininessParser.assignment_expression_return assignment_expression26 =null;


        Object char_literal25_tree=null;

        try {
            // Mininess.g:276:5: ( assignment_expression ( ',' ! assignment_expression )* )
            // Mininess.g:276:10: assignment_expression ( ',' ! assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list2437);
            assignment_expression24=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression24.getTree());

            // Mininess.g:276:32: ( ',' ! assignment_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Mininess.g:276:33: ',' ! assignment_expression
            	    {
            	    char_literal25=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list2440); if (state.failed) return retval;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list2443);
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
        }
        return retval;
    }
    // $ANTLR end "argument_expression_list"


    public static class unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expression"
    // Mininess.g:278:1: unary_expression : ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | ( SIZEOF '(' type_name ')' )=> SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression );
    public final MininessParser.unary_expression_return unary_expression() throws RecognitionException {
        MininessParser.unary_expression_return retval = new MininessParser.unary_expression_return();
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
        Token SIZEOF46=null;
        MininessParser.unary_expression_return unary_expression28 =null;

        MininessParser.unary_expression_return unary_expression30 =null;

        MininessParser.cast_expression_return cast_expression32 =null;

        MininessParser.cast_expression_return cast_expression34 =null;

        MininessParser.cast_expression_return cast_expression36 =null;

        MininessParser.cast_expression_return cast_expression38 =null;

        MininessParser.cast_expression_return cast_expression41 =null;

        MininessParser.type_name_return type_name44 =null;

        MininessParser.unary_expression_return unary_expression47 =null;

        MininessParser.postfix_expression_return postfix_expression48 =null;


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
            // Mininess.g:279:5: ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | ( SIZEOF '(' type_name ')' )=> SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression )
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

                if ( (synpred1_Mininess()) ) {
                    alt8=8;
                }
                else if ( (true) ) {
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
                    // Mininess.g:279:10: '++' unary_expression
                    {
                    string_literal27=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unary_expression2464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(string_literal27);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2466);
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
                        // Mininess.g:279:35: ^( PRE_INCREMENT unary_expression )
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
                    // Mininess.g:280:10: '--' unary_expression
                    {
                    string_literal29=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unary_expression2485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUSMINUS.add(string_literal29);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2487);
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
                        // Mininess.g:280:35: ^( PRE_DECREMENT unary_expression )
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
                    // Mininess.g:281:10: '&' cast_expression
                    {
                    char_literal31=(Token)match(input,AMP,FOLLOW_AMP_in_unary_expression2506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMP.add(char_literal31);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2509);
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
                        // Mininess.g:281:35: ^( ADDRESS_OF cast_expression )
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
                    // Mininess.g:282:10: '*' cast_expression
                    {
                    char_literal33=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression2533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal33);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2536);
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
                        // Mininess.g:282:35: ^( DEREFERENCE cast_expression )
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
                    // Mininess.g:283:10: '+' cast_expression
                    {
                    char_literal35=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression2559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal35);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2562);
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
                        // Mininess.g:283:35: ^( UNARY_PLUS cast_expression )
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
                    // Mininess.g:284:10: '-' cast_expression
                    {
                    char_literal37=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression2586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal37);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2589);
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
                        // Mininess.g:284:35: ^( UNARY_MINUS cast_expression )
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
                    // Mininess.g:285:10: ( '~' ^| '!' ^) cast_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // Mininess.g:285:10: ( '~' ^| '!' ^)
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
                            // Mininess.g:285:11: '~' ^
                            {
                            char_literal39=(Token)match(input,BITCOMPLEMENT,FOLLOW_BITCOMPLEMENT_in_unary_expression2613); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal39_tree = 
                            (Object)adaptor.create(char_literal39)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal39_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Mininess.g:285:18: '!' ^
                            {
                            char_literal40=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression2618); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal40_tree = 
                            (Object)adaptor.create(char_literal40)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal40_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2622);
                    cast_expression41=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression41.getTree());

                    }
                    break;
                case 8 :
                    // Mininess.g:286:10: ( SIZEOF '(' type_name ')' )=> SIZEOF '(' type_name ')'
                    {
                    SIZEOF42=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression2645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF42);


                    char_literal43=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_unary_expression2647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal43);


                    pushFollow(FOLLOW_type_name_in_unary_expression2649);
                    type_name44=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name44.getTree());

                    char_literal45=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_unary_expression2651); if (state.failed) return retval; 
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
                    // 286:65: -> ^( SIZEOF_TYPE type_name )
                    {
                        // Mininess.g:286:68: ^( SIZEOF_TYPE type_name )
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
                    // Mininess.g:287:10: SIZEOF unary_expression
                    {
                    SIZEOF46=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression2670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF46);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2672);
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
                        // Mininess.g:287:38: ^( SIZEOF_EXPRESSION unary_expression )
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
                    // Mininess.g:288:10: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression2692);
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
        }
        return retval;
    }
    // $ANTLR end "unary_expression"


    public static class cast_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cast_expression"
    // Mininess.g:294:1: cast_expression : ( ( '(' type_name ')' )=> '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression );
    public final MininessParser.cast_expression_return cast_expression() throws RecognitionException {
        MininessParser.cast_expression_return retval = new MininessParser.cast_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal49=null;
        Token char_literal51=null;
        MininessParser.type_name_return type_name50 =null;

        MininessParser.cast_expression_return cast_expression52 =null;

        MininessParser.unary_expression_return unary_expression53 =null;


        Object char_literal49_tree=null;
        Object char_literal51_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // Mininess.g:295:5: ( ( '(' type_name ')' )=> '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LPARENS) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred2_Mininess()) ) {
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
            else if ( (LA9_0==AMP||LA9_0==BITCOMPLEMENT||LA9_0==CALL||LA9_0==CHARACTER_LITERAL||LA9_0==CONSTANT||LA9_0==MINUS||LA9_0==MINUSMINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==PLUSPLUS||LA9_0==POST||LA9_0==RAW_IDENTIFIER||LA9_0==SIZEOF||LA9_0==STAR||LA9_0==STRING_LITERAL) ) {
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
                    // Mininess.g:295:10: ( '(' type_name ')' )=> '(' type_name ')' cast_expression
                    {
                    char_literal49=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_cast_expression2735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal49);


                    pushFollow(FOLLOW_type_name_in_cast_expression2737);
                    type_name50=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name50.getTree());

                    char_literal51=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_cast_expression2739); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal51);


                    pushFollow(FOLLOW_cast_expression_in_cast_expression2741);
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
                    // 296:45: -> ^( CAST cast_expression type_name )
                    {
                        // Mininess.g:296:48: ^( CAST cast_expression type_name )
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
                    // Mininess.g:297:10: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression2762);
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
        }
        return retval;
    }
    // $ANTLR end "cast_expression"


    public static class arrayinc_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayinc_expression"
    // Mininess.g:299:1: arrayinc_expression : cast_expression ( '|>' ^ cast_expression )* ;
    public final MininessParser.arrayinc_expression_return arrayinc_expression() throws RecognitionException {
        MininessParser.arrayinc_expression_return retval = new MininessParser.arrayinc_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal55=null;
        MininessParser.cast_expression_return cast_expression54 =null;

        MininessParser.cast_expression_return cast_expression56 =null;


        Object string_literal55_tree=null;

        try {
            // Mininess.g:300:5: ( cast_expression ( '|>' ^ cast_expression )* )
            // Mininess.g:300:10: cast_expression ( '|>' ^ cast_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_arrayinc_expression2777);
            cast_expression54=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression54.getTree());

            // Mininess.g:300:26: ( '|>' ^ cast_expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ARRAYINC) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Mininess.g:300:28: '|>' ^ cast_expression
            	    {
            	    string_literal55=(Token)match(input,ARRAYINC,FOLLOW_ARRAYINC_in_arrayinc_expression2781); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal55_tree = 
            	    (Object)adaptor.create(string_literal55)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal55_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_cast_expression_in_arrayinc_expression2784);
            	    cast_expression56=cast_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression56.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
        }
        return retval;
    }
    // $ANTLR end "arrayinc_expression"


    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicative_expression"
    // Mininess.g:302:1: multiplicative_expression : arrayinc_expression ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )* ;
    public final MininessParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        MininessParser.multiplicative_expression_return retval = new MininessParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        MininessParser.arrayinc_expression_return arrayinc_expression57 =null;

        MininessParser.arrayinc_expression_return arrayinc_expression61 =null;


        Object char_literal58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal60_tree=null;

        try {
            // Mininess.g:303:5: ( arrayinc_expression ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )* )
            // Mininess.g:303:10: arrayinc_expression ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arrayinc_expression_in_multiplicative_expression2805);
            arrayinc_expression57=arrayinc_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayinc_expression57.getTree());

            // Mininess.g:303:30: ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==DIVIDE||LA12_0==MODULUS||LA12_0==STAR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Mininess.g:303:32: ( '*' ^| '/' ^| '%' ^) arrayinc_expression
            	    {
            	    // Mininess.g:303:32: ( '*' ^| '/' ^| '%' ^)
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
            	            // Mininess.g:303:33: '*' ^
            	            {
            	            char_literal58=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression2810); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal58_tree = 
            	            (Object)adaptor.create(char_literal58)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal58_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:303:40: '/' ^
            	            {
            	            char_literal59=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expression2815); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal59_tree = 
            	            (Object)adaptor.create(char_literal59)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal59_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Mininess.g:303:47: '%' ^
            	            {
            	            char_literal60=(Token)match(input,MODULUS,FOLLOW_MODULUS_in_multiplicative_expression2820); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal60_tree = 
            	            (Object)adaptor.create(char_literal60)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal60_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_arrayinc_expression_in_multiplicative_expression2824);
            	    arrayinc_expression61=arrayinc_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayinc_expression61.getTree());

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

            catch (RecognitionException e) {
                throw e;
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
    // Mininess.g:305:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
    public final MininessParser.additive_expression_return additive_expression() throws RecognitionException {
        MininessParser.additive_expression_return retval = new MininessParser.additive_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal63=null;
        Token char_literal64=null;
        MininessParser.multiplicative_expression_return multiplicative_expression62 =null;

        MininessParser.multiplicative_expression_return multiplicative_expression65 =null;


        Object char_literal63_tree=null;
        Object char_literal64_tree=null;

        try {
            // Mininess.g:306:5: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
            // Mininess.g:306:10: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2845);
            multiplicative_expression62=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression62.getTree());

            // Mininess.g:306:36: ( ( '+' ^| '-' ^) multiplicative_expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Mininess.g:306:38: ( '+' ^| '-' ^) multiplicative_expression
            	    {
            	    // Mininess.g:306:38: ( '+' ^| '-' ^)
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
            	            // Mininess.g:306:39: '+' ^
            	            {
            	            char_literal63=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression2850); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal63_tree = 
            	            (Object)adaptor.create(char_literal63)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal63_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:306:46: '-' ^
            	            {
            	            char_literal64=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression2855); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal64_tree = 
            	            (Object)adaptor.create(char_literal64)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal64_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2859);
            	    multiplicative_expression65=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression65.getTree());

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

            catch (RecognitionException e) {
                throw e;
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
    // Mininess.g:308:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
    public final MininessParser.shift_expression_return shift_expression() throws RecognitionException {
        MininessParser.shift_expression_return retval = new MininessParser.shift_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal67=null;
        Token string_literal68=null;
        MininessParser.additive_expression_return additive_expression66 =null;

        MininessParser.additive_expression_return additive_expression69 =null;


        Object string_literal67_tree=null;
        Object string_literal68_tree=null;

        try {
            // Mininess.g:309:5: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // Mininess.g:309:10: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression2880);
            additive_expression66=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression66.getTree());

            // Mininess.g:309:30: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LSHIFT||LA16_0==RSHIFT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Mininess.g:309:32: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // Mininess.g:309:32: ( '<<' ^| '>>' ^)
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
            	            // Mininess.g:309:33: '<<' ^
            	            {
            	            string_literal67=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression2885); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal67_tree = 
            	            (Object)adaptor.create(string_literal67)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal67_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:309:41: '>>' ^
            	            {
            	            string_literal68=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression2890); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal68_tree = 
            	            (Object)adaptor.create(string_literal68)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal68_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression2894);
            	    additive_expression69=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression69.getTree());

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

            catch (RecognitionException e) {
                throw e;
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
    // Mininess.g:311:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
    public final MininessParser.relational_expression_return relational_expression() throws RecognitionException {
        MininessParser.relational_expression_return retval = new MininessParser.relational_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal71=null;
        Token char_literal72=null;
        Token string_literal73=null;
        Token string_literal74=null;
        MininessParser.shift_expression_return shift_expression70 =null;

        MininessParser.shift_expression_return shift_expression75 =null;


        Object char_literal71_tree=null;
        Object char_literal72_tree=null;
        Object string_literal73_tree=null;
        Object string_literal74_tree=null;

        try {
            // Mininess.g:312:5: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // Mininess.g:312:10: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression2915);
            shift_expression70=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression70.getTree());

            // Mininess.g:312:27: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= GREATER && LA18_0 <= GREATEREQUAL)||(LA18_0 >= LESS && LA18_0 <= LESSEQUAL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Mininess.g:312:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // Mininess.g:312:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
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
            	            // Mininess.g:312:30: '<' ^
            	            {
            	            char_literal71=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression2920); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal71_tree = 
            	            (Object)adaptor.create(char_literal71)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal71_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:312:37: '>' ^
            	            {
            	            char_literal72=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression2925); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal72_tree = 
            	            (Object)adaptor.create(char_literal72)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal72_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Mininess.g:312:44: '<=' ^
            	            {
            	            string_literal73=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relational_expression2930); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal73_tree = 
            	            (Object)adaptor.create(string_literal73)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal73_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Mininess.g:312:52: '>=' ^
            	            {
            	            string_literal74=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relational_expression2935); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal74_tree = 
            	            (Object)adaptor.create(string_literal74)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression2939);
            	    shift_expression75=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression75.getTree());

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

            catch (RecognitionException e) {
                throw e;
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
    // Mininess.g:314:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
    public final MininessParser.equality_expression_return equality_expression() throws RecognitionException {
        MininessParser.equality_expression_return retval = new MininessParser.equality_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal77=null;
        Token string_literal78=null;
        MininessParser.relational_expression_return relational_expression76 =null;

        MininessParser.relational_expression_return relational_expression79 =null;


        Object string_literal77_tree=null;
        Object string_literal78_tree=null;

        try {
            // Mininess.g:315:5: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // Mininess.g:315:10: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression2960);
            relational_expression76=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression76.getTree());

            // Mininess.g:315:32: ( ( '==' ^| '!=' ^) relational_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EQUAL||LA20_0==NOTEQUAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Mininess.g:315:34: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // Mininess.g:315:34: ( '==' ^| '!=' ^)
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
            	            // Mininess.g:315:35: '==' ^
            	            {
            	            string_literal77=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equality_expression2965); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal77_tree = 
            	            (Object)adaptor.create(string_literal77)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal77_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:315:43: '!=' ^
            	            {
            	            string_literal78=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equality_expression2970); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal78_tree = 
            	            (Object)adaptor.create(string_literal78)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal78_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression2974);
            	    relational_expression79=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression79.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "equality_expression"


    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expression"
    // Mininess.g:317:1: and_expression : equality_expression ( '&' ^ equality_expression )* ;
    public final MininessParser.and_expression_return and_expression() throws RecognitionException {
        MininessParser.and_expression_return retval = new MininessParser.and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal81=null;
        MininessParser.equality_expression_return equality_expression80 =null;

        MininessParser.equality_expression_return equality_expression82 =null;


        Object char_literal81_tree=null;

        try {
            // Mininess.g:318:5: ( equality_expression ( '&' ^ equality_expression )* )
            // Mininess.g:318:10: equality_expression ( '&' ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_and_expression2995);
            equality_expression80=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression80.getTree());

            // Mininess.g:318:30: ( '&' ^ equality_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AMP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Mininess.g:318:32: '&' ^ equality_expression
            	    {
            	    char_literal81=(Token)match(input,AMP,FOLLOW_AMP_in_and_expression2999); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal81_tree = 
            	    (Object)adaptor.create(char_literal81)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal81_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_and_expression3002);
            	    equality_expression82=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression82.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "and_expression"


    public static class xor_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xor_expression"
    // Mininess.g:320:1: xor_expression : and_expression ( '^' ^ and_expression )* ;
    public final MininessParser.xor_expression_return xor_expression() throws RecognitionException {
        MininessParser.xor_expression_return retval = new MininessParser.xor_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal84=null;
        MininessParser.and_expression_return and_expression83 =null;

        MininessParser.and_expression_return and_expression85 =null;


        Object char_literal84_tree=null;

        try {
            // Mininess.g:321:5: ( and_expression ( '^' ^ and_expression )* )
            // Mininess.g:321:10: and_expression ( '^' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_xor_expression3023);
            and_expression83=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression83.getTree());

            // Mininess.g:321:25: ( '^' ^ and_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BITXOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Mininess.g:321:27: '^' ^ and_expression
            	    {
            	    char_literal84=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_xor_expression3027); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal84_tree = 
            	    (Object)adaptor.create(char_literal84)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal84_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_xor_expression3030);
            	    and_expression85=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression85.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "xor_expression"


    public static class or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_expression"
    // Mininess.g:323:1: or_expression : xor_expression ( '|' ^ xor_expression )* ;
    public final MininessParser.or_expression_return or_expression() throws RecognitionException {
        MininessParser.or_expression_return retval = new MininessParser.or_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal87=null;
        MininessParser.xor_expression_return xor_expression86 =null;

        MininessParser.xor_expression_return xor_expression88 =null;


        Object char_literal87_tree=null;

        try {
            // Mininess.g:324:5: ( xor_expression ( '|' ^ xor_expression )* )
            // Mininess.g:324:10: xor_expression ( '|' ^ xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expression_in_or_expression3051);
            xor_expression86=xor_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression86.getTree());

            // Mininess.g:324:25: ( '|' ^ xor_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==BITOR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Mininess.g:324:27: '|' ^ xor_expression
            	    {
            	    char_literal87=(Token)match(input,BITOR,FOLLOW_BITOR_in_or_expression3055); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal87_tree = 
            	    (Object)adaptor.create(char_literal87)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal87_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_xor_expression_in_or_expression3058);
            	    xor_expression88=xor_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression88.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "or_expression"


    public static class logical_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_and_expression"
    // Mininess.g:326:1: logical_and_expression : or_expression ( '&&' ^ or_expression )* ;
    public final MininessParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        MininessParser.logical_and_expression_return retval = new MininessParser.logical_and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal90=null;
        MininessParser.or_expression_return or_expression89 =null;

        MininessParser.or_expression_return or_expression91 =null;


        Object string_literal90_tree=null;

        try {
            // Mininess.g:327:5: ( or_expression ( '&&' ^ or_expression )* )
            // Mininess.g:327:10: or_expression ( '&&' ^ or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_expression_in_logical_and_expression3079);
            or_expression89=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression89.getTree());

            // Mininess.g:327:24: ( '&&' ^ or_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Mininess.g:327:26: '&&' ^ or_expression
            	    {
            	    string_literal90=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression3083); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal90_tree = 
            	    (Object)adaptor.create(string_literal90)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal90_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression3086);
            	    or_expression91=or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression91.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"


    public static class logical_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_or_expression"
    // Mininess.g:329:1: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
    public final MininessParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        MininessParser.logical_or_expression_return retval = new MininessParser.logical_or_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal93=null;
        MininessParser.logical_and_expression_return logical_and_expression92 =null;

        MininessParser.logical_and_expression_return logical_and_expression94 =null;


        Object string_literal93_tree=null;

        try {
            // Mininess.g:330:5: ( logical_and_expression ( '||' ^ logical_and_expression )* )
            // Mininess.g:330:10: logical_and_expression ( '||' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3107);
            logical_and_expression92=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression92.getTree());

            // Mininess.g:330:33: ( '||' ^ logical_and_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Mininess.g:330:35: '||' ^ logical_and_expression
            	    {
            	    string_literal93=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression3111); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal93_tree = 
            	    (Object)adaptor.create(string_literal93)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal93_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression3114);
            	    logical_and_expression94=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression94.getTree());

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

            catch (RecognitionException e) {
                throw e;
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
    // Mininess.g:332:1: conditional_expression : logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? ;
    public final MininessParser.conditional_expression_return conditional_expression() throws RecognitionException {
        MininessParser.conditional_expression_return retval = new MininessParser.conditional_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal96=null;
        Token char_literal98=null;
        MininessParser.logical_or_expression_return logical_or_expression95 =null;

        MininessParser.expression_return expression97 =null;

        MininessParser.conditional_expression_return conditional_expression99 =null;


        Object char_literal96_tree=null;
        Object char_literal98_tree=null;

        try {
            // Mininess.g:333:5: ( logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? )
            // Mininess.g:333:10: logical_or_expression ( '?' ^ expression ':' ! conditional_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression3135);
            logical_or_expression95=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression95.getTree());

            // Mininess.g:333:32: ( '?' ^ expression ':' ! conditional_expression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==151) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Mininess.g:333:33: '?' ^ expression ':' ! conditional_expression
                    {
                    char_literal96=(Token)match(input,151,FOLLOW_151_in_conditional_expression3138); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal96_tree = 
                    (Object)adaptor.create(char_literal96)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal96_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_conditional_expression3141);
                    expression97=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression97.getTree());

                    char_literal98=(Token)match(input,149,FOLLOW_149_in_conditional_expression3143); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression3146);
                    conditional_expression99=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression99.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "conditional_expression"


    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_expression"
    // Mininess.g:335:1: assignment_expression : ( ( unary_expression assignment_operator )=> unary_expression assignment_operator assignment_expression -> ^( assignment_operator unary_expression assignment_expression ) | conditional_expression );
    public final MininessParser.assignment_expression_return assignment_expression() throws RecognitionException {
        MininessParser.assignment_expression_return retval = new MininessParser.assignment_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.unary_expression_return unary_expression100 =null;

        MininessParser.assignment_operator_return assignment_operator101 =null;

        MininessParser.assignment_expression_return assignment_expression102 =null;

        MininessParser.conditional_expression_return conditional_expression103 =null;


        RewriteRuleSubtreeStream stream_assignment_operator=new RewriteRuleSubtreeStream(adaptor,"rule assignment_operator");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");
        try {
            // Mininess.g:336:5: ( ( unary_expression assignment_operator )=> unary_expression assignment_operator assignment_expression -> ^( assignment_operator unary_expression assignment_expression ) | conditional_expression )
            int alt27=2;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA27_1 = input.LA(2);

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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
                {
                int LA27_10 = input.LA(2);

                if ( (synpred3_Mininess()) ) {
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

                if ( (((( !symbols.isType(input.LT(1).getText()) )&&( !symbols.isType(input.LT(1).getText()) ))&&synpred3_Mininess())) ) {
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

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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

                if ( (synpred3_Mininess()) ) {
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
                    // Mininess.g:336:10: ( unary_expression assignment_operator )=> unary_expression assignment_operator assignment_expression
                    {
                    pushFollow(FOLLOW_unary_expression_in_assignment_expression3185);
                    unary_expression100=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression100.getTree());

                    pushFollow(FOLLOW_assignment_operator_in_assignment_expression3187);
                    assignment_operator101=assignment_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_operator.add(assignment_operator101.getTree());

                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression3189);
                    assignment_expression102=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression102.getTree());

                    // AST REWRITE
                    // elements: assignment_expression, unary_expression, assignment_operator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 338:14: -> ^( assignment_operator unary_expression assignment_expression )
                    {
                        // Mininess.g:338:17: ^( assignment_operator unary_expression assignment_expression )
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
                    // Mininess.g:339:10: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression3223);
                    conditional_expression103=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression103.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "assignment_expression"


    public static class assignment_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_operator"
    // Mininess.g:341:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final MininessParser.assignment_operator_return assignment_operator() throws RecognitionException {
        MininessParser.assignment_operator_return retval = new MininessParser.assignment_operator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set104=null;

        Object set104_tree=null;

        try {
            // Mininess.g:342:5: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            // Mininess.g:
            {
            root_0 = (Object)adaptor.nil();


            set104=(Token)input.LT(1);

            if ( (input.LA(1) >= ASSIGN && input.LA(1) <= BITANDASSIGN)||input.LA(1)==BITORASSIGN||input.LA(1)==BITXORASSIGN||input.LA(1)==DIVASSIGN||input.LA(1)==LSHIFTASSIGN||input.LA(1)==MINUSASSIGN||input.LA(1)==MODASSIGN||input.LA(1)==MULASSIGN||input.LA(1)==PLUSASSIGN||input.LA(1)==RSHIFTASSIGN ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set104)
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
        }
        return retval;
    }
    // $ANTLR end "assignment_operator"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // Mininess.g:344:1: expression : assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )* ;
    public final MininessParser.expression_return expression() throws RecognitionException {
        MininessParser.expression_return retval = new MininessParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal106=null;
        MininessParser.assignment_expression_return assignment_expression105 =null;

        MininessParser.assignment_expression_return assignment_expression107 =null;


        Object char_literal106_tree=null;

        try {
            // Mininess.g:345:5: ( assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )* )
            // Mininess.g:345:10: assignment_expression ( ( ',' assignment_expression )=> ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression3293);
            assignment_expression105=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression105.getTree());

            // Mininess.g:345:32: ( ( ',' assignment_expression )=> ',' ^ assignment_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==COMMA) && (synpred4_Mininess())) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Mininess.g:345:33: ( ',' assignment_expression )=> ',' ^ assignment_expression
            	    {
            	    char_literal106=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression3304); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal106_tree = 
            	    (Object)adaptor.create(char_literal106)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal106_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression3307);
            	    assignment_expression107=assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression107.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class constant_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_expression"
    // Mininess.g:347:1: constant_expression : conditional_expression ;
    public final MininessParser.constant_expression_return constant_expression() throws RecognitionException {
        MininessParser.constant_expression_return retval = new MininessParser.constant_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.conditional_expression_return conditional_expression108 =null;



        try {
            // Mininess.g:348:5: ( conditional_expression )
            // Mininess.g:348:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression3328);
            conditional_expression108=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression108.getTree());

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
    // Mininess.g:366:1: declaration : ( ( declaration_specifiers ( init_declarator_list )? ';' )=> declaration_specifiers ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers init_declarator_list ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) );
    public final MininessParser.declaration_return declaration() throws RecognitionException {
        declaration_stack.push(new declaration_scope());
        MininessParser.declaration_return retval = new MininessParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal111=null;
        Token TYPEDEF113=null;
        Token char_literal116=null;
        MininessParser.declaration_specifiers_return declaration_specifiers109 =null;

        MininessParser.init_declarator_list_return init_declarator_list110 =null;

        MininessParser.function_definition_return function_definition112 =null;

        MininessParser.declaration_specifiers_return declaration_specifiers114 =null;

        MininessParser.init_declarator_list_return init_declarator_list115 =null;


        Object char_literal111_tree=null;
        Object TYPEDEF113_tree=null;
        Object char_literal116_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        try {
            // Mininess.g:369:5: ( ( declaration_specifiers ( init_declarator_list )? ';' )=> declaration_specifiers ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers init_declarator_list ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case COMMAND:
            case EVENT:
            case TASK:
                {
                int LA30_1 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case UINT8_T:
                {
                int LA30_12 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case UINT16_T:
                {
                int LA30_13 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case UINT32_T:
                {
                int LA30_14 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NX_INT8_T:
                {
                int LA30_15 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NX_INT16_T:
                {
                int LA30_16 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NX_INT32_T:
                {
                int LA30_17 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NX_UINT8_T:
                {
                int LA30_18 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NX_UINT16_T:
                {
                int LA30_19 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NX_UINT32_T:
                {
                int LA30_20 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NXLE_INT8_T:
                {
                int LA30_21 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NXLE_INT16_T:
                {
                int LA30_22 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NXLE_INT32_T:
                {
                int LA30_23 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NXLE_UINT8_T:
                {
                int LA30_24 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NXLE_UINT16_T:
                {
                int LA30_25 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NXLE_UINT32_T:
                {
                int LA30_26 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case ERROR_T:
                {
                int LA30_27 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case NX_STRUCT:
            case STRUCT:
                {
                int LA30_28 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case ENUM:
                {
                int LA30_29 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case RAW_IDENTIFIER:
                {
                int LA30_30 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
            case CONST:
                {
                int LA30_31 = input.LA(2);

                if ( (synpred5_Mininess()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
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
                    // Mininess.g:369:10: ( declaration_specifiers ( init_declarator_list )? ';' )=> declaration_specifiers ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3411);
                    declaration_specifiers109=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers109.getTree());

                    // Mininess.g:374:33: ( init_declarator_list )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==LPARENS||LA29_0==RAW_IDENTIFIER||LA29_0==STAR) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // Mininess.g:374:33: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration3413);
                            init_declarator_list110=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list110.getTree());

                            }
                            break;

                    }


                    char_literal111=(Token)match(input,150,FOLLOW_150_in_declaration3416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_150.add(char_literal111);


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
                    // 381:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // Mininess.g:381:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // Mininess.g:381:54: ( init_declarator_list )?
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
                    // Mininess.g:383:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration3478);
                    function_definition112=function_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_definition.add(function_definition112.getTree());

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
                    // 393:14: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // Mininess.g:393:17: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // Mininess.g:393:31: ^( FUNCTION_DEFINITION function_definition )
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
                    // Mininess.g:395:10: TYPEDEF declaration_specifiers init_declarator_list ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF113=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration3541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF113);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3543);
                    declaration_specifiers114=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers114.getTree());

                    pushFollow(FOLLOW_init_declarator_list_in_declaration3545);
                    init_declarator_list115=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list115.getTree());

                    char_literal116=(Token)match(input,150,FOLLOW_150_in_declaration3547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_150.add(char_literal116);


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
                    // 405:14: -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                    {
                        // Mininess.g:405:17: ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
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
    // Mininess.g:411:1: declaration_specifiers : ( c_style_declaration_specifier )+ ;
    public final MininessParser.declaration_specifiers_return declaration_specifiers() throws RecognitionException {
        MininessParser.declaration_specifiers_return retval = new MininessParser.declaration_specifiers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.c_style_declaration_specifier_return c_style_declaration_specifier117 =null;



        try {
            // Mininess.g:412:5: ( ( c_style_declaration_specifier )+ )
            // Mininess.g:412:25: ( c_style_declaration_specifier )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:412:25: ( c_style_declaration_specifier )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RAW_IDENTIFIER) ) {
                    int LA31_2 = input.LA(2);

                    if ( (( symbols.isType(input.LT(1).getText()) )) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==CHAR||LA31_0==COMMAND||LA31_0==CONST||LA31_0==ENUM||(LA31_0 >= ERROR_T && LA31_0 <= EVENT)||(LA31_0 >= INT && LA31_0 <= INT8_T)||LA31_0==LONG||(LA31_0 >= NXLE_INT16_T && LA31_0 <= NX_UINT8_T)||(LA31_0 >= SHORT && LA31_0 <= SIGNED)||LA31_0==STRUCT||LA31_0==TASK||(LA31_0 >= UINT16_T && LA31_0 <= UINT8_T)||LA31_0==UNSIGNED||LA31_0==VOID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Mininess.g:412:25: c_style_declaration_specifier
            	    {
            	    pushFollow(FOLLOW_c_style_declaration_specifier_in_declaration_specifiers3612);
            	    c_style_declaration_specifier117=c_style_declaration_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, c_style_declaration_specifier117.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "declaration_specifiers"


    public static class c_style_declaration_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "c_style_declaration_specifier"
    // Mininess.g:414:1: c_style_declaration_specifier : ( storage_class_specifier | type_specifier | type_qualifier );
    public final MininessParser.c_style_declaration_specifier_return c_style_declaration_specifier() throws RecognitionException {
        MininessParser.c_style_declaration_specifier_return retval = new MininessParser.c_style_declaration_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.storage_class_specifier_return storage_class_specifier118 =null;

        MininessParser.type_specifier_return type_specifier119 =null;

        MininessParser.type_qualifier_return type_qualifier120 =null;



        try {
            // Mininess.g:415:5: ( storage_class_specifier | type_specifier | type_qualifier )
            int alt32=3;
            switch ( input.LA(1) ) {
            case COMMAND:
            case EVENT:
            case TASK:
                {
                alt32=1;
                }
                break;
            case CHAR:
            case ENUM:
            case ERROR_T:
            case INT:
            case INT16_T:
            case INT32_T:
            case INT8_T:
            case LONG:
            case NXLE_INT16_T:
            case NXLE_INT32_T:
            case NXLE_INT8_T:
            case NXLE_UINT16_T:
            case NXLE_UINT32_T:
            case NXLE_UINT8_T:
            case NX_INT16_T:
            case NX_INT32_T:
            case NX_INT8_T:
            case NX_STRUCT:
            case NX_UINT16_T:
            case NX_UINT32_T:
            case NX_UINT8_T:
            case RAW_IDENTIFIER:
            case SHORT:
            case SIGNED:
            case STRUCT:
            case UINT16_T:
            case UINT32_T:
            case UINT8_T:
            case UNSIGNED:
            case VOID:
                {
                alt32=2;
                }
                break;
            case CONST:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // Mininess.g:415:10: storage_class_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_storage_class_specifier_in_c_style_declaration_specifier3628);
                    storage_class_specifier118=storage_class_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier118.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:416:10: type_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_specifier_in_c_style_declaration_specifier3639);
                    type_specifier119=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier119.getTree());

                    }
                    break;
                case 3 :
                    // Mininess.g:417:10: type_qualifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_qualifier_in_c_style_declaration_specifier3650);
                    type_qualifier120=type_qualifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier120.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "c_style_declaration_specifier"


    public static class init_declarator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator_list"
    // Mininess.g:423:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
    public final MininessParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
        MininessParser.init_declarator_list_return retval = new MininessParser.init_declarator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal122=null;
        MininessParser.init_declarator_return init_declarator121 =null;

        MininessParser.init_declarator_return init_declarator123 =null;


        Object char_literal122_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");
        try {
            // Mininess.g:424:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // Mininess.g:424:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list3671);
            init_declarator121=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator121.getTree());

            // Mininess.g:424:26: ( ',' init_declarator )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Mininess.g:424:27: ',' init_declarator
            	    {
            	    char_literal122=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list3674); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal122);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list3676);
            	    init_declarator123=init_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator123.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
            // 424:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // Mininess.g:424:52: ^( DECLARATOR_LIST ( init_declarator )+ )
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
        }
        return retval;
    }
    // $ANTLR end "init_declarator_list"


    public static class init_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator"
    // Mininess.g:430:1: init_declarator : declarator ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
    public final MininessParser.init_declarator_return init_declarator() throws RecognitionException {
        MininessParser.init_declarator_return retval = new MininessParser.init_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal125=null;
        MininessParser.declarator_return declarator124 =null;

        MininessParser.initializer_return initializer126 =null;


        Object char_literal125_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // Mininess.g:431:5: ( declarator ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // Mininess.g:431:10: declarator ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator3710);
            declarator124=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator124.getTree());

            // Mininess.g:431:21: ( '=' initializer )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ASSIGN) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Mininess.g:431:22: '=' initializer
                    {
                    char_literal125=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator3713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal125);


                    pushFollow(FOLLOW_initializer_in_init_declarator3715);
                    initializer126=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer126.getTree());

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
            // 431:40: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // Mininess.g:431:43: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // Mininess.g:431:72: ( initializer )?
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
        }
        return retval;
    }
    // $ANTLR end "init_declarator"


    public static class storage_class_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "storage_class_specifier"
    // Mininess.g:433:1: storage_class_specifier : ( COMMAND | EVENT | TASK );
    public final MininessParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        MininessParser.storage_class_specifier_return retval = new MininessParser.storage_class_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set127=null;

        Object set127_tree=null;

        try {
            // Mininess.g:434:5: ( COMMAND | EVENT | TASK )
            // Mininess.g:
            {
            root_0 = (Object)adaptor.nil();


            set127=(Token)input.LT(1);

            if ( input.LA(1)==COMMAND||input.LA(1)==EVENT||input.LA(1)==TASK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set127)
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
        }
        return retval;
    }
    // $ANTLR end "storage_class_specifier"


    public static class type_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // Mininess.g:438:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | INT8_T | INT16_T | INT32_T | UINT8_T | UINT16_T | UINT32_T | NX_INT8_T | NX_INT16_T | NX_INT32_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NXLE_INT8_T | NXLE_INT16_T | NXLE_INT32_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | ERROR_T | struct_or_union_specifier | enum_specifier | typedef_name );
    public final MininessParser.type_specifier_return type_specifier() throws RecognitionException {
        MininessParser.type_specifier_return retval = new MininessParser.type_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID128=null;
        Token CHAR129=null;
        Token SHORT130=null;
        Token INT131=null;
        Token LONG132=null;
        Token SIGNED133=null;
        Token UNSIGNED134=null;
        Token INT8_T135=null;
        Token INT16_T136=null;
        Token INT32_T137=null;
        Token UINT8_T138=null;
        Token UINT16_T139=null;
        Token UINT32_T140=null;
        Token NX_INT8_T141=null;
        Token NX_INT16_T142=null;
        Token NX_INT32_T143=null;
        Token NX_UINT8_T144=null;
        Token NX_UINT16_T145=null;
        Token NX_UINT32_T146=null;
        Token NXLE_INT8_T147=null;
        Token NXLE_INT16_T148=null;
        Token NXLE_INT32_T149=null;
        Token NXLE_UINT8_T150=null;
        Token NXLE_UINT16_T151=null;
        Token NXLE_UINT32_T152=null;
        Token ERROR_T153=null;
        MininessParser.struct_or_union_specifier_return struct_or_union_specifier154 =null;

        MininessParser.enum_specifier_return enum_specifier155 =null;

        MininessParser.typedef_name_return typedef_name156 =null;


        Object VOID128_tree=null;
        Object CHAR129_tree=null;
        Object SHORT130_tree=null;
        Object INT131_tree=null;
        Object LONG132_tree=null;
        Object SIGNED133_tree=null;
        Object UNSIGNED134_tree=null;
        Object INT8_T135_tree=null;
        Object INT16_T136_tree=null;
        Object INT32_T137_tree=null;
        Object UINT8_T138_tree=null;
        Object UINT16_T139_tree=null;
        Object UINT32_T140_tree=null;
        Object NX_INT8_T141_tree=null;
        Object NX_INT16_T142_tree=null;
        Object NX_INT32_T143_tree=null;
        Object NX_UINT8_T144_tree=null;
        Object NX_UINT16_T145_tree=null;
        Object NX_UINT32_T146_tree=null;
        Object NXLE_INT8_T147_tree=null;
        Object NXLE_INT16_T148_tree=null;
        Object NXLE_INT32_T149_tree=null;
        Object NXLE_UINT8_T150_tree=null;
        Object NXLE_UINT16_T151_tree=null;
        Object NXLE_UINT32_T152_tree=null;
        Object ERROR_T153_tree=null;

        try {
            // Mininess.g:439:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | INT8_T | INT16_T | INT32_T | UINT8_T | UINT16_T | UINT32_T | NX_INT8_T | NX_INT16_T | NX_INT32_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | NXLE_INT8_T | NXLE_INT16_T | NXLE_INT32_T | NXLE_UINT8_T | NXLE_UINT16_T | NXLE_UINT32_T | ERROR_T | struct_or_union_specifier | enum_specifier | typedef_name )
            int alt35=29;
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
            case UINT8_T:
                {
                alt35=11;
                }
                break;
            case UINT16_T:
                {
                alt35=12;
                }
                break;
            case UINT32_T:
                {
                alt35=13;
                }
                break;
            case NX_INT8_T:
                {
                alt35=14;
                }
                break;
            case NX_INT16_T:
                {
                alt35=15;
                }
                break;
            case NX_INT32_T:
                {
                alt35=16;
                }
                break;
            case NX_UINT8_T:
                {
                alt35=17;
                }
                break;
            case NX_UINT16_T:
                {
                alt35=18;
                }
                break;
            case NX_UINT32_T:
                {
                alt35=19;
                }
                break;
            case NXLE_INT8_T:
                {
                alt35=20;
                }
                break;
            case NXLE_INT16_T:
                {
                alt35=21;
                }
                break;
            case NXLE_INT32_T:
                {
                alt35=22;
                }
                break;
            case NXLE_UINT8_T:
                {
                alt35=23;
                }
                break;
            case NXLE_UINT16_T:
                {
                alt35=24;
                }
                break;
            case NXLE_UINT32_T:
                {
                alt35=25;
                }
                break;
            case ERROR_T:
                {
                alt35=26;
                }
                break;
            case NX_STRUCT:
            case STRUCT:
                {
                alt35=27;
                }
                break;
            case ENUM:
                {
                alt35=28;
                }
                break;
            case RAW_IDENTIFIER:
                {
                alt35=29;
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
                    // Mininess.g:439:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID128=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier3787); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID128_tree = 
                    (Object)adaptor.create(VOID128)
                    ;
                    adaptor.addChild(root_0, VOID128_tree);
                    }

                    }
                    break;
                case 2 :
                    // Mininess.g:440:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR129=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier3797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR129_tree = 
                    (Object)adaptor.create(CHAR129)
                    ;
                    adaptor.addChild(root_0, CHAR129_tree);
                    }

                    }
                    break;
                case 3 :
                    // Mininess.g:441:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT130=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier3807); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT130_tree = 
                    (Object)adaptor.create(SHORT130)
                    ;
                    adaptor.addChild(root_0, SHORT130_tree);
                    }

                    }
                    break;
                case 4 :
                    // Mininess.g:442:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT131=(Token)match(input,INT,FOLLOW_INT_in_type_specifier3817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT131_tree = 
                    (Object)adaptor.create(INT131)
                    ;
                    adaptor.addChild(root_0, INT131_tree);
                    }

                    }
                    break;
                case 5 :
                    // Mininess.g:443:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG132=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier3827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG132_tree = 
                    (Object)adaptor.create(LONG132)
                    ;
                    adaptor.addChild(root_0, LONG132_tree);
                    }

                    }
                    break;
                case 6 :
                    // Mininess.g:444:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED133=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier3837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED133_tree = 
                    (Object)adaptor.create(SIGNED133)
                    ;
                    adaptor.addChild(root_0, SIGNED133_tree);
                    }

                    }
                    break;
                case 7 :
                    // Mininess.g:445:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED134=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier3847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED134_tree = 
                    (Object)adaptor.create(UNSIGNED134)
                    ;
                    adaptor.addChild(root_0, UNSIGNED134_tree);
                    }

                    }
                    break;
                case 8 :
                    // Mininess.g:447:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T135=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier3858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T135_tree = 
                    (Object)adaptor.create(INT8_T135)
                    ;
                    adaptor.addChild(root_0, INT8_T135_tree);
                    }

                    }
                    break;
                case 9 :
                    // Mininess.g:448:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T136=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier3868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T136_tree = 
                    (Object)adaptor.create(INT16_T136)
                    ;
                    adaptor.addChild(root_0, INT16_T136_tree);
                    }

                    }
                    break;
                case 10 :
                    // Mininess.g:449:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T137=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier3878); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T137_tree = 
                    (Object)adaptor.create(INT32_T137)
                    ;
                    adaptor.addChild(root_0, INT32_T137_tree);
                    }

                    }
                    break;
                case 11 :
                    // Mininess.g:451:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T138=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier3889); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T138_tree = 
                    (Object)adaptor.create(UINT8_T138)
                    ;
                    adaptor.addChild(root_0, UINT8_T138_tree);
                    }

                    }
                    break;
                case 12 :
                    // Mininess.g:452:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T139=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier3899); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T139_tree = 
                    (Object)adaptor.create(UINT16_T139)
                    ;
                    adaptor.addChild(root_0, UINT16_T139_tree);
                    }

                    }
                    break;
                case 13 :
                    // Mininess.g:453:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T140=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier3909); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T140_tree = 
                    (Object)adaptor.create(UINT32_T140)
                    ;
                    adaptor.addChild(root_0, UINT32_T140_tree);
                    }

                    }
                    break;
                case 14 :
                    // Mininess.g:455:9: NX_INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT8_T141=(Token)match(input,NX_INT8_T,FOLLOW_NX_INT8_T_in_type_specifier3920); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT8_T141_tree = 
                    (Object)adaptor.create(NX_INT8_T141)
                    ;
                    adaptor.addChild(root_0, NX_INT8_T141_tree);
                    }

                    }
                    break;
                case 15 :
                    // Mininess.g:456:9: NX_INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT16_T142=(Token)match(input,NX_INT16_T,FOLLOW_NX_INT16_T_in_type_specifier3930); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT16_T142_tree = 
                    (Object)adaptor.create(NX_INT16_T142)
                    ;
                    adaptor.addChild(root_0, NX_INT16_T142_tree);
                    }

                    }
                    break;
                case 16 :
                    // Mininess.g:457:9: NX_INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_INT32_T143=(Token)match(input,NX_INT32_T,FOLLOW_NX_INT32_T_in_type_specifier3940); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_INT32_T143_tree = 
                    (Object)adaptor.create(NX_INT32_T143)
                    ;
                    adaptor.addChild(root_0, NX_INT32_T143_tree);
                    }

                    }
                    break;
                case 17 :
                    // Mininess.g:459:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T144=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier3951); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T144_tree = 
                    (Object)adaptor.create(NX_UINT8_T144)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T144_tree);
                    }

                    }
                    break;
                case 18 :
                    // Mininess.g:460:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T145=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier3961); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T145_tree = 
                    (Object)adaptor.create(NX_UINT16_T145)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T145_tree);
                    }

                    }
                    break;
                case 19 :
                    // Mininess.g:461:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T146=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier3971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T146_tree = 
                    (Object)adaptor.create(NX_UINT32_T146)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T146_tree);
                    }

                    }
                    break;
                case 20 :
                    // Mininess.g:463:9: NXLE_INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT8_T147=(Token)match(input,NXLE_INT8_T,FOLLOW_NXLE_INT8_T_in_type_specifier3982); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT8_T147_tree = 
                    (Object)adaptor.create(NXLE_INT8_T147)
                    ;
                    adaptor.addChild(root_0, NXLE_INT8_T147_tree);
                    }

                    }
                    break;
                case 21 :
                    // Mininess.g:464:9: NXLE_INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT16_T148=(Token)match(input,NXLE_INT16_T,FOLLOW_NXLE_INT16_T_in_type_specifier3992); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT16_T148_tree = 
                    (Object)adaptor.create(NXLE_INT16_T148)
                    ;
                    adaptor.addChild(root_0, NXLE_INT16_T148_tree);
                    }

                    }
                    break;
                case 22 :
                    // Mininess.g:465:9: NXLE_INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_INT32_T149=(Token)match(input,NXLE_INT32_T,FOLLOW_NXLE_INT32_T_in_type_specifier4002); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_INT32_T149_tree = 
                    (Object)adaptor.create(NXLE_INT32_T149)
                    ;
                    adaptor.addChild(root_0, NXLE_INT32_T149_tree);
                    }

                    }
                    break;
                case 23 :
                    // Mininess.g:467:9: NXLE_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT8_T150=(Token)match(input,NXLE_UINT8_T,FOLLOW_NXLE_UINT8_T_in_type_specifier4013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT8_T150_tree = 
                    (Object)adaptor.create(NXLE_UINT8_T150)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT8_T150_tree);
                    }

                    }
                    break;
                case 24 :
                    // Mininess.g:468:9: NXLE_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT16_T151=(Token)match(input,NXLE_UINT16_T,FOLLOW_NXLE_UINT16_T_in_type_specifier4023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT16_T151_tree = 
                    (Object)adaptor.create(NXLE_UINT16_T151)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT16_T151_tree);
                    }

                    }
                    break;
                case 25 :
                    // Mininess.g:469:9: NXLE_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NXLE_UINT32_T152=(Token)match(input,NXLE_UINT32_T,FOLLOW_NXLE_UINT32_T_in_type_specifier4033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NXLE_UINT32_T152_tree = 
                    (Object)adaptor.create(NXLE_UINT32_T152)
                    ;
                    adaptor.addChild(root_0, NXLE_UINT32_T152_tree);
                    }

                    }
                    break;
                case 26 :
                    // Mininess.g:471:9: ERROR_T
                    {
                    root_0 = (Object)adaptor.nil();


                    ERROR_T153=(Token)match(input,ERROR_T,FOLLOW_ERROR_T_in_type_specifier4044); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ERROR_T153_tree = 
                    (Object)adaptor.create(ERROR_T153)
                    ;
                    adaptor.addChild(root_0, ERROR_T153_tree);
                    }

                    }
                    break;
                case 27 :
                    // Mininess.g:473:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier4055);
                    struct_or_union_specifier154=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier154.getTree());

                    }
                    break;
                case 28 :
                    // Mininess.g:474:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier4065);
                    enum_specifier155=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier155.getTree());

                    }
                    break;
                case 29 :
                    // Mininess.g:475:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier4075);
                    typedef_name156=typedef_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedef_name156.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "type_specifier"


    public static class struct_or_union_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_or_union_specifier"
    // Mininess.g:481:1: struct_or_union_specifier : ( struct_or_union '{' ( struct_declaration_list )? '}' -> ^( struct_or_union ( struct_declaration_list )? ) | struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )? -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? ) );
    public final MininessParser.struct_or_union_specifier_return struct_or_union_specifier() throws RecognitionException {
        MininessParser.struct_or_union_specifier_return retval = new MininessParser.struct_or_union_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal158=null;
        Token char_literal160=null;
        Token RAW_IDENTIFIER162=null;
        Token char_literal163=null;
        Token char_literal165=null;
        MininessParser.struct_or_union_return struct_or_union157 =null;

        MininessParser.struct_declaration_list_return struct_declaration_list159 =null;

        MininessParser.struct_or_union_return struct_or_union161 =null;

        MininessParser.struct_declaration_list_return struct_declaration_list164 =null;


        Object char_literal158_tree=null;
        Object char_literal160_tree=null;
        Object RAW_IDENTIFIER162_tree=null;
        Object char_literal163_tree=null;
        Object char_literal165_tree=null;
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_struct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declaration_list");
        RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");
        try {
            // Mininess.g:482:5: ( struct_or_union '{' ( struct_declaration_list )? '}' -> ^( struct_or_union ( struct_declaration_list )? ) | struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )? -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==NX_STRUCT||LA39_0==STRUCT) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==LBRACE) ) {
                    alt39=1;
                }
                else if ( (LA39_1==RAW_IDENTIFIER) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // Mininess.g:482:10: struct_or_union '{' ( struct_declaration_list )? '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4094);
                    struct_or_union157=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union157.getTree());

                    char_literal158=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4096); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal158);


                    // Mininess.g:482:30: ( struct_declaration_list )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==CHAR||LA36_0==CONST||LA36_0==ENUM||LA36_0==ERROR_T||LA36_0==HASH||(LA36_0 >= INT && LA36_0 <= INT8_T)||LA36_0==LONG||(LA36_0 >= NXLE_INT16_T && LA36_0 <= NX_UINT8_T)||LA36_0==RAW_IDENTIFIER||(LA36_0 >= SHORT && LA36_0 <= SIGNED)||LA36_0==STRUCT||(LA36_0 >= UINT16_T && LA36_0 <= UINT8_T)||LA36_0==UNSIGNED||LA36_0==VOID) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // Mininess.g:482:30: struct_declaration_list
                            {
                            pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4098);
                            struct_declaration_list159=struct_declaration_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list159.getTree());

                            }
                            break;

                    }


                    char_literal160=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal160);


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
                    // 483:14: -> ^( struct_or_union ( struct_declaration_list )? )
                    {
                        // Mininess.g:483:17: ^( struct_or_union ( struct_declaration_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        // Mininess.g:483:35: ( struct_declaration_list )?
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
                    // Mininess.g:484:10: struct_or_union RAW_IDENTIFIER ( '{' ( struct_declaration_list )? '}' )?
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier4134);
                    struct_or_union161=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union161.getTree());

                    RAW_IDENTIFIER162=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier4136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER162);


                    // Mininess.g:484:41: ( '{' ( struct_declaration_list )? '}' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==LBRACE) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // Mininess.g:484:42: '{' ( struct_declaration_list )? '}'
                            {
                            char_literal163=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier4139); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal163);


                            // Mininess.g:484:46: ( struct_declaration_list )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==CHAR||LA37_0==CONST||LA37_0==ENUM||LA37_0==ERROR_T||LA37_0==HASH||(LA37_0 >= INT && LA37_0 <= INT8_T)||LA37_0==LONG||(LA37_0 >= NXLE_INT16_T && LA37_0 <= NX_UINT8_T)||LA37_0==RAW_IDENTIFIER||(LA37_0 >= SHORT && LA37_0 <= SIGNED)||LA37_0==STRUCT||(LA37_0 >= UINT16_T && LA37_0 <= UINT8_T)||LA37_0==UNSIGNED||LA37_0==VOID) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // Mininess.g:484:46: struct_declaration_list
                                    {
                                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier4141);
                                    struct_declaration_list164=struct_declaration_list();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list164.getTree());

                                    }
                                    break;

                            }


                            char_literal165=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier4144); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal165);


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
                    // 485:14: -> ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? )
                    {
                        // Mininess.g:485:17: ^( struct_or_union RAW_IDENTIFIER ( struct_declaration_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        stream_RAW_IDENTIFIER.nextNode()
                        );

                        // Mininess.g:485:50: ( struct_declaration_list )?
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

            catch (RecognitionException e) {
                throw e;
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
    // Mininess.g:488:1: struct_or_union : ( STRUCT | NX_STRUCT );
    public final MininessParser.struct_or_union_return struct_or_union() throws RecognitionException {
        MininessParser.struct_or_union_return retval = new MininessParser.struct_or_union_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set166=null;

        Object set166_tree=null;

        try {
            // Mininess.g:489:5: ( STRUCT | NX_STRUCT )
            // Mininess.g:
            {
            root_0 = (Object)adaptor.nil();


            set166=(Token)input.LT(1);

            if ( input.LA(1)==NX_STRUCT||input.LA(1)==STRUCT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set166)
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
        }
        return retval;
    }
    // $ANTLR end "struct_or_union"


    public static class struct_declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declaration_list"
    // Mininess.g:494:1: struct_declaration_list : ( line_directive_mini | struct_declaration )+ ;
    public final MininessParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        MininessParser.struct_declaration_list_return retval = new MininessParser.struct_declaration_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.line_directive_mini_return line_directive_mini167 =null;

        MininessParser.struct_declaration_return struct_declaration168 =null;



        try {
            // Mininess.g:495:5: ( ( line_directive_mini | struct_declaration )+ )
            // Mininess.g:495:10: ( line_directive_mini | struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // Mininess.g:496:10: ( line_directive_mini | struct_declaration )+
            int cnt40=0;
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==HASH) ) {
                    alt40=1;
                }
                else if ( (LA40_0==CHAR||LA40_0==CONST||LA40_0==ENUM||LA40_0==ERROR_T||(LA40_0 >= INT && LA40_0 <= INT8_T)||LA40_0==LONG||(LA40_0 >= NXLE_INT16_T && LA40_0 <= NX_UINT8_T)||LA40_0==RAW_IDENTIFIER||(LA40_0 >= SHORT && LA40_0 <= SIGNED)||LA40_0==STRUCT||(LA40_0 >= UINT16_T && LA40_0 <= UINT8_T)||LA40_0==UNSIGNED||LA40_0==VOID) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // Mininess.g:496:12: line_directive_mini
            	    {
            	    pushFollow(FOLLOW_line_directive_mini_in_struct_declaration_list4221);
            	    line_directive_mini167=line_directive_mini();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive_mini167.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:496:34: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list4225);
            	    struct_declaration168=struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_declaration168.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
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
        }
        return retval;
    }
    // $ANTLR end "struct_declaration_list"


    public static class struct_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declaration"
    // Mininess.g:499:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final MininessParser.struct_declaration_return struct_declaration() throws RecognitionException {
        MininessParser.struct_declaration_return retval = new MininessParser.struct_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal171=null;
        MininessParser.specifier_qualifier_list_return specifier_qualifier_list169 =null;

        MininessParser.struct_declarator_list_return struct_declarator_list170 =null;


        Object char_literal171_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            // Mininess.g:500:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // Mininess.g:500:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration4257);
            specifier_qualifier_list169=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list169.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration4259);
            struct_declarator_list170=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list170.getTree());

            char_literal171=(Token)match(input,150,FOLLOW_150_in_struct_declaration4261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_150.add(char_literal171);


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
            // 501:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // Mininess.g:501:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
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
        }
        return retval;
    }
    // $ANTLR end "struct_declaration"


    public static class specifier_qualifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specifier_qualifier_list"
    // Mininess.g:508:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final MininessParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        MininessParser.specifier_qualifier_list_return retval = new MininessParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.type_specifier_return type_specifier172 =null;

        MininessParser.type_qualifier_return type_qualifier173 =null;



        try {
            // Mininess.g:509:5: ( ( type_specifier | type_qualifier )+ )
            // Mininess.g:509:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:509:10: ( type_specifier | type_qualifier )+
            int cnt41=0;
            loop41:
            do {
                int alt41=3;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA41_2 = input.LA(2);

                    if ( (( symbols.isType(input.LT(1).getText()) )) ) {
                        alt41=1;
                    }


                    }
                    break;
                case CHAR:
                case ENUM:
                case ERROR_T:
                case INT:
                case INT16_T:
                case INT32_T:
                case INT8_T:
                case LONG:
                case NXLE_INT16_T:
                case NXLE_INT32_T:
                case NXLE_INT8_T:
                case NXLE_UINT16_T:
                case NXLE_UINT32_T:
                case NXLE_UINT8_T:
                case NX_INT16_T:
                case NX_INT32_T:
                case NX_INT8_T:
                case NX_STRUCT:
                case NX_UINT16_T:
                case NX_UINT32_T:
                case NX_UINT8_T:
                case SHORT:
                case SIGNED:
                case STRUCT:
                case UINT16_T:
                case UINT32_T:
                case UINT8_T:
                case UNSIGNED:
                case VOID:
                    {
                    alt41=1;
                    }
                    break;
                case CONST:
                    {
                    alt41=2;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // Mininess.g:509:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list4308);
            	    type_specifier172=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier172.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:509:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list4312);
            	    type_qualifier173=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier173.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "specifier_qualifier_list"


    public static class struct_declarator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declarator_list"
    // Mininess.g:516:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
    public final MininessParser.struct_declarator_list_return struct_declarator_list() throws RecognitionException {
        MininessParser.struct_declarator_list_return retval = new MininessParser.struct_declarator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal175=null;
        MininessParser.struct_declarator_return struct_declarator174 =null;

        MininessParser.struct_declarator_return struct_declarator176 =null;


        Object char_literal175_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_struct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator");
        try {
            // Mininess.g:517:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // Mininess.g:517:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list4338);
            struct_declarator174=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator174.getTree());

            // Mininess.g:517:28: ( ',' struct_declarator )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Mininess.g:517:29: ',' struct_declarator
            	    {
            	    char_literal175=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list4341); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal175);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list4343);
            	    struct_declarator176=struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator176.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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
            // 517:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // Mininess.g:517:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
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
        }
        return retval;
    }
    // $ANTLR end "struct_declarator_list"


    public static class struct_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declarator"
    // Mininess.g:519:1: struct_declarator : ( declarator ( ':' constant_expression )? | ':' constant_expression );
    public final MininessParser.struct_declarator_return struct_declarator() throws RecognitionException {
        MininessParser.struct_declarator_return retval = new MininessParser.struct_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal178=null;
        Token char_literal180=null;
        MininessParser.declarator_return declarator177 =null;

        MininessParser.constant_expression_return constant_expression179 =null;

        MininessParser.constant_expression_return constant_expression181 =null;


        Object char_literal178_tree=null;
        Object char_literal180_tree=null;

        try {
            // Mininess.g:520:5: ( declarator ( ':' constant_expression )? | ':' constant_expression )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==LPARENS||LA44_0==RAW_IDENTIFIER||LA44_0==STAR) ) {
                alt44=1;
            }
            else if ( (LA44_0==149) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // Mininess.g:520:10: declarator ( ':' constant_expression )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator4373);
                    declarator177=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator177.getTree());

                    // Mininess.g:520:21: ( ':' constant_expression )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==149) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // Mininess.g:520:22: ':' constant_expression
                            {
                            char_literal178=(Token)match(input,149,FOLLOW_149_in_struct_declarator4376); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal178_tree = 
                            (Object)adaptor.create(char_literal178)
                            ;
                            adaptor.addChild(root_0, char_literal178_tree);
                            }

                            pushFollow(FOLLOW_constant_expression_in_struct_declarator4378);
                            constant_expression179=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression179.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Mininess.g:521:10: ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal180=(Token)match(input,149,FOLLOW_149_in_struct_declarator4391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal180_tree = 
                    (Object)adaptor.create(char_literal180)
                    ;
                    adaptor.addChild(root_0, char_literal180_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator4393);
                    constant_expression181=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression181.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "struct_declarator"


    public static class enum_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enum_specifier"
    // Mininess.g:523:1: enum_specifier : ( ENUM '{' enumerator_list ( ',' )? '}' -> ^( ENUM enumerator_list ) | ENUM identifier ( '{' enumerator_list ( ',' )? '}' )? -> ^( ENUM identifier ( enumerator_list )? ) );
    public final MininessParser.enum_specifier_return enum_specifier() throws RecognitionException {
        MininessParser.enum_specifier_return retval = new MininessParser.enum_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENUM182=null;
        Token char_literal183=null;
        Token char_literal185=null;
        Token char_literal186=null;
        Token ENUM187=null;
        Token char_literal189=null;
        Token char_literal191=null;
        Token char_literal192=null;
        MininessParser.enumerator_list_return enumerator_list184 =null;

        MininessParser.identifier_return identifier188 =null;

        MininessParser.enumerator_list_return enumerator_list190 =null;


        Object ENUM182_tree=null;
        Object char_literal183_tree=null;
        Object char_literal185_tree=null;
        Object char_literal186_tree=null;
        Object ENUM187_tree=null;
        Object char_literal189_tree=null;
        Object char_literal191_tree=null;
        Object char_literal192_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_enumerator_list=new RewriteRuleSubtreeStream(adaptor,"rule enumerator_list");
        try {
            // Mininess.g:524:5: ( ENUM '{' enumerator_list ( ',' )? '}' -> ^( ENUM enumerator_list ) | ENUM identifier ( '{' enumerator_list ( ',' )? '}' )? -> ^( ENUM identifier ( enumerator_list )? ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ENUM) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==LBRACE) ) {
                    alt48=1;
                }
                else if ( (LA48_1==RAW_IDENTIFIER) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // Mininess.g:524:10: ENUM '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM182=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier4412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM182);


                    char_literal183=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier4414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal183);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier4416);
                    enumerator_list184=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list184.getTree());

                    // Mininess.g:524:35: ( ',' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==COMMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // Mininess.g:524:35: ','
                            {
                            char_literal185=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier4418); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal185);


                            }
                            break;

                    }


                    char_literal186=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier4421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal186);


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
                    // 525:14: -> ^( ENUM enumerator_list )
                    {
                        // Mininess.g:525:17: ^( ENUM enumerator_list )
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
                    // Mininess.g:526:10: ENUM identifier ( '{' enumerator_list ( ',' )? '}' )?
                    {
                    ENUM187=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier4453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM187);


                    pushFollow(FOLLOW_identifier_in_enum_specifier4455);
                    identifier188=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier188.getTree());

                    // Mininess.g:526:26: ( '{' enumerator_list ( ',' )? '}' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==LBRACE) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // Mininess.g:526:27: '{' enumerator_list ( ',' )? '}'
                            {
                            char_literal189=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier4458); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal189);


                            pushFollow(FOLLOW_enumerator_list_in_enum_specifier4460);
                            enumerator_list190=enumerator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list190.getTree());

                            // Mininess.g:526:47: ( ',' )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==COMMA) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // Mininess.g:526:47: ','
                                    {
                                    char_literal191=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier4462); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(char_literal191);


                                    }
                                    break;

                            }


                            char_literal192=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier4465); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal192);


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
                    // 527:14: -> ^( ENUM identifier ( enumerator_list )? )
                    {
                        // Mininess.g:527:17: ^( ENUM identifier ( enumerator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // Mininess.g:527:35: ( enumerator_list )?
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

            catch (RecognitionException e) {
                throw e;
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
    // Mininess.g:529:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
    public final MininessParser.enumerator_list_return enumerator_list() throws RecognitionException {
        MininessParser.enumerator_list_return retval = new MininessParser.enumerator_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal194=null;
        MininessParser.enumerator_return enumerator193 =null;

        MininessParser.enumerator_return enumerator195 =null;


        Object char_literal194_tree=null;

        try {
            // Mininess.g:530:5: ( enumerator ( ',' ! enumerator )* )
            // Mininess.g:530:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list4506);
            enumerator193=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator193.getTree());

            // Mininess.g:530:21: ( ',' ! enumerator )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    int LA49_1 = input.LA(2);

                    if ( (LA49_1==RAW_IDENTIFIER) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // Mininess.g:530:22: ',' ! enumerator
            	    {
            	    char_literal194=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list4509); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list4512);
            	    enumerator195=enumerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator195.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
        }
        return retval;
    }
    // $ANTLR end "enumerator_list"


    public static class enumerator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumerator"
    // Mininess.g:536:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
    public final MininessParser.enumerator_return enumerator() throws RecognitionException {
        MininessParser.enumerator_return retval = new MininessParser.enumerator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal197=null;
        MininessParser.identifier_return identifier196 =null;

        MininessParser.constant_expression_return constant_expression198 =null;


        Object char_literal197_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // Mininess.g:537:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // Mininess.g:537:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator4537);
            identifier196=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier196.getTree());

            // Mininess.g:537:21: ( '=' constant_expression )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ASSIGN) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Mininess.g:537:22: '=' constant_expression
                    {
                    char_literal197=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator4540); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal197);


                    pushFollow(FOLLOW_constant_expression_in_enumerator4542);
                    constant_expression198=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression198.getTree());

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
            // 537:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // Mininess.g:537:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // Mininess.g:537:75: ( constant_expression )?
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
        }
        return retval;
    }
    // $ANTLR end "enumerator"


    public static class type_qualifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_qualifier"
    // Mininess.g:539:1: type_qualifier : CONST ;
    public final MininessParser.type_qualifier_return type_qualifier() throws RecognitionException {
        MininessParser.type_qualifier_return retval = new MininessParser.type_qualifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONST199=null;

        Object CONST199_tree=null;

        try {
            // Mininess.g:540:5: ( CONST )
            // Mininess.g:540:10: CONST
            {
            root_0 = (Object)adaptor.nil();


            CONST199=(Token)match(input,CONST,FOLLOW_CONST_in_type_qualifier4574); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONST199_tree = 
            (Object)adaptor.create(CONST199)
            ;
            adaptor.addChild(root_0, CONST199_tree);
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
        }
        return retval;
    }
    // $ANTLR end "type_qualifier"


    public static class declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarator"
    // Mininess.g:542:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
    public final MininessParser.declarator_return declarator() throws RecognitionException {
        MininessParser.declarator_return retval = new MininessParser.declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.pointer_return pointer200 =null;

        MininessParser.direct_declarator_return direct_declarator201 =null;


        RewriteRuleSubtreeStream stream_direct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule direct_declarator");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            // Mininess.g:543:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // Mininess.g:543:10: ( pointer )? direct_declarator
            {
            // Mininess.g:543:10: ( pointer )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==STAR) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // Mininess.g:543:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator4593);
                    pointer200=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer200.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator4596);
            direct_declarator201=direct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_direct_declarator.add(direct_declarator201.getTree());

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
            // 543:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // Mininess.g:543:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // Mininess.g:543:53: ( pointer )?
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
        }
        return retval;
    }
    // $ANTLR end "declarator"


    public static class direct_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_declarator"
    // Mininess.g:545:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final MininessParser.direct_declarator_return direct_declarator() throws RecognitionException {
        MininessParser.direct_declarator_return retval = new MininessParser.direct_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.direct_declarator_identifier_return direct_declarator_identifier202 =null;

        MininessParser.direct_declarator_modifier_return direct_declarator_modifier203 =null;



        try {
            // Mininess.g:546:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // Mininess.g:546:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator4621);
            direct_declarator_identifier202=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier202.getTree());

            // Mininess.g:546:38: ( direct_declarator_modifier )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==LBRACKET||LA52_0==LPARENS) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // Mininess.g:546:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator4623);
            	    direct_declarator_modifier203=direct_declarator_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_modifier203.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
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
        }
        return retval;
    }
    // $ANTLR end "direct_declarator"


    public static class direct_declarator_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_declarator_identifier"
    // Mininess.g:557:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
    public final MininessParser.direct_declarator_identifier_return direct_declarator_identifier() throws RecognitionException {
        MininessParser.direct_declarator_identifier_return retval = new MininessParser.direct_declarator_identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal204=null;
        Token char_literal206=null;
        Token char_literal208=null;
        MininessParser.identifier_return myIdName =null;

        MininessParser.identifier_return identifier205 =null;

        MininessParser.declarator_return declarator207 =null;


        Object char_literal204_tree=null;
        Object char_literal206_tree=null;
        Object char_literal208_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // Mininess.g:558:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RAW_IDENTIFIER) ) {
                alt54=1;
            }
            else if ( (LA54_0==LPARENS) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // Mininess.g:558:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier4649);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // Mininess.g:558:29: ( '.' identifier )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==DOT) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // Mininess.g:558:30: '.' identifier
                            {
                            char_literal204=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier4652); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal204);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier4654);
                            identifier205=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier205.getTree());

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
                    // 562:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // Mininess.g:562:18: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // Mininess.g:563:9: '(' declarator ')'
                    {
                    char_literal206=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier4689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal206);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier4691);
                    declarator207=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator207.getTree());

                    char_literal208=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier4693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal208);


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
                    // 563:28: -> declarator
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
        }
        return retval;
    }
    // $ANTLR end "direct_declarator_identifier"


    public static class direct_declarator_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_declarator_modifier"
    // Mininess.g:569:1: direct_declarator_modifier : ( ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
    public final MininessParser.direct_declarator_modifier_return direct_declarator_modifier() throws RecognitionException {
        MininessParser.direct_declarator_modifier_return retval = new MininessParser.direct_declarator_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal209=null;
        Token char_literal211=null;
        Token char_literal212=null;
        Token char_literal213=null;
        Token char_literal214=null;
        Token char_literal215=null;
        MininessParser.parameter_list_return generic =null;

        MininessParser.parameter_list_return normal =null;

        MininessParser.constant_expression_return constant_expression210 =null;


        Object char_literal209_tree=null;
        Object char_literal211_tree=null;
        Object char_literal212_tree=null;
        Object char_literal213_tree=null;
        Object char_literal214_tree=null;
        Object char_literal215_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // Mininess.g:570:5: ( ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==LBRACKET) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred6_Mininess()) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA57_0==LPARENS) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // Mininess.g:570:9: ( '[' ( constant_expression )? ']' )=> '[' ( constant_expression )? ']'
                    {
                    char_literal209=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier4726); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal209);


                    // Mininess.g:570:47: ( constant_expression )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==AMP||LA55_0==BITCOMPLEMENT||LA55_0==CALL||LA55_0==CHARACTER_LITERAL||LA55_0==CONSTANT||LA55_0==LPARENS||LA55_0==MINUS||LA55_0==MINUSMINUS||LA55_0==NOT||LA55_0==PLUS||LA55_0==PLUSPLUS||LA55_0==POST||LA55_0==RAW_IDENTIFIER||LA55_0==SIZEOF||LA55_0==STAR||LA55_0==STRING_LITERAL) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // Mininess.g:570:47: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier4728);
                            constant_expression210=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression210.getTree());

                            }
                            break;

                    }


                    char_literal211=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier4731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal211);


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
                    // 571:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // Mininess.g:571:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // Mininess.g:571:44: ( constant_expression )?
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
                    // Mininess.g:572:9: ( '[' generic= parameter_list ']' )? '(' normal= parameter_list ')'
                    {
                    // Mininess.g:572:9: ( '[' generic= parameter_list ']' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==LBRACKET) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // Mininess.g:572:10: '[' generic= parameter_list ']'
                            {
                            char_literal212=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier4763); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal212);


                            pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier4767);
                            generic=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_list.add(generic.getTree());

                            char_literal213=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier4769); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal213);


                            }
                            break;

                    }


                    char_literal214=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier4773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal214);


                    pushFollow(FOLLOW_parameter_list_in_direct_declarator_modifier4777);
                    normal=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(normal.getTree());

                    char_literal215=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier4779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal215);


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
                    // 573:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // Mininess.g:573:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
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
        }
        return retval;
    }
    // $ANTLR end "direct_declarator_modifier"


    public static class pointer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointer"
    // Mininess.g:579:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
    public final MininessParser.pointer_return pointer() throws RecognitionException {
        MininessParser.pointer_return retval = new MininessParser.pointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal216=null;
        Token char_literal219=null;
        MininessParser.type_qualifier_list_return type_qualifier_list217 =null;

        MininessParser.pointer_return pointer218 =null;

        MininessParser.type_qualifier_list_return type_qualifier_list220 =null;


        Object char_literal216_tree=null;
        Object char_literal219_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_type_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule type_qualifier_list");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            // Mininess.g:580:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // Mininess.g:580:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal216=(Token)match(input,STAR,FOLLOW_STAR_in_pointer4819); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal216);


                    // Mininess.g:580:14: ( type_qualifier_list )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==CONST) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // Mininess.g:580:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer4821);
                            type_qualifier_list217=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list217.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer4824);
                    pointer218=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer218.getTree());

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
                    // 580:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // Mininess.g:580:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // Mininess.g:580:66: ( type_qualifier_list )?
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
                    // Mininess.g:581:10: '*' ( type_qualifier_list )?
                    {
                    char_literal219=(Token)match(input,STAR,FOLLOW_STAR_in_pointer4846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal219);


                    // Mininess.g:581:14: ( type_qualifier_list )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==CONST) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // Mininess.g:581:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer4848);
                            type_qualifier_list220=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list220.getTree());

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
                    // 581:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // Mininess.g:581:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // Mininess.g:581:58: ( type_qualifier_list )?
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
        }
        return retval;
    }
    // $ANTLR end "pointer"


    public static class type_qualifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_qualifier_list"
    // Mininess.g:583:1: type_qualifier_list : ( type_qualifier )+ ;
    public final MininessParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        MininessParser.type_qualifier_list_return retval = new MininessParser.type_qualifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.type_qualifier_return type_qualifier221 =null;



        try {
            // Mininess.g:584:5: ( ( type_qualifier )+ )
            // Mininess.g:584:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:584:10: ( type_qualifier )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==CONST) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // Mininess.g:584:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list4877);
            	    type_qualifier221=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier221.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
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
        }
        return retval;
    }
    // $ANTLR end "type_qualifier_list"


    public static class parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_list"
    // Mininess.g:591:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) );
    public final MininessParser.parameter_list_return parameter_list() throws RecognitionException {
        MininessParser.parameter_list_return retval = new MininessParser.parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal223=null;
        Token char_literal225=null;
        Token ELLIPSIS226=null;
        MininessParser.parameter_declaration_return parameter_declaration222 =null;

        MininessParser.parameter_declaration_return parameter_declaration224 =null;


        Object char_literal223_tree=null;
        Object char_literal225_tree=null;
        Object ELLIPSIS226_tree=null;
        RewriteRuleTokenStream stream_ELLIPSIS=new RewriteRuleTokenStream(adaptor,"token ELLIPSIS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            // Mininess.g:592:5: ( parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )? -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? ) | -> ^( PARAMETER_LIST ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==CHAR||LA64_0==COMMAND||LA64_0==CONST||LA64_0==ENUM||(LA64_0 >= ERROR_T && LA64_0 <= EVENT)||(LA64_0 >= INT && LA64_0 <= INT8_T)||LA64_0==LONG||(LA64_0 >= NXLE_INT16_T && LA64_0 <= NX_UINT8_T)||LA64_0==RAW_IDENTIFIER||(LA64_0 >= SHORT && LA64_0 <= SIGNED)||LA64_0==STRUCT||LA64_0==TASK||(LA64_0 >= UINT16_T && LA64_0 <= UINT8_T)||LA64_0==UNSIGNED||LA64_0==VOID) ) {
                alt64=1;
            }
            else if ( (LA64_0==RBRACKET||LA64_0==RPARENS) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // Mininess.g:592:10: parameter_declaration ( ',' parameter_declaration )* ( ',' ELLIPSIS )?
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list4902);
                    parameter_declaration222=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration222.getTree());

                    // Mininess.g:592:32: ( ',' parameter_declaration )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==COMMA) ) {
                            int LA62_1 = input.LA(2);

                            if ( (LA62_1==CHAR||LA62_1==COMMAND||LA62_1==CONST||LA62_1==ENUM||(LA62_1 >= ERROR_T && LA62_1 <= EVENT)||(LA62_1 >= INT && LA62_1 <= INT8_T)||LA62_1==LONG||(LA62_1 >= NXLE_INT16_T && LA62_1 <= NX_UINT8_T)||LA62_1==RAW_IDENTIFIER||(LA62_1 >= SHORT && LA62_1 <= SIGNED)||LA62_1==STRUCT||LA62_1==TASK||(LA62_1 >= UINT16_T && LA62_1 <= UINT8_T)||LA62_1==UNSIGNED||LA62_1==VOID) ) {
                                alt62=1;
                            }


                        }


                        switch (alt62) {
                    	case 1 :
                    	    // Mininess.g:592:33: ',' parameter_declaration
                    	    {
                    	    char_literal223=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list4905); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal223);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list4907);
                    	    parameter_declaration224=parameter_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration224.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    // Mininess.g:592:61: ( ',' ELLIPSIS )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==COMMA) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // Mininess.g:592:62: ',' ELLIPSIS
                            {
                            char_literal225=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list4912); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal225);


                            ELLIPSIS226=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_parameter_list4914); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELLIPSIS.add(ELLIPSIS226);


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
                    // 593:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
                    {
                        // Mininess.g:593:16: ^( PARAMETER_LIST ( parameter_declaration )+ ( ELLIPSIS )? )
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

                        // Mininess.g:593:56: ( ELLIPSIS )?
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
                    // Mininess.g:595:13: 
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
                    // 595:13: -> ^( PARAMETER_LIST )
                    {
                        // Mininess.g:595:16: ^( PARAMETER_LIST )
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
        }
        return retval;
    }
    // $ANTLR end "parameter_list"


    public static class parameter_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_declaration"
    // Mininess.g:601:1: parameter_declaration : declaration_specifiers ( parameter_declarator )? -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? ) ;
    public final MininessParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        MininessParser.parameter_declaration_return retval = new MininessParser.parameter_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.declaration_specifiers_return declaration_specifiers227 =null;

        MininessParser.parameter_declarator_return parameter_declarator228 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_parameter_declarator=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarator");
        try {
            // Mininess.g:602:5: ( declaration_specifiers ( parameter_declarator )? -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? ) )
            // Mininess.g:602:10: declaration_specifiers ( parameter_declarator )?
            {
            pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration4984);
            declaration_specifiers227=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers227.getTree());

            // Mininess.g:602:33: ( parameter_declarator )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LBRACKET||LA65_0==LPARENS||LA65_0==RAW_IDENTIFIER||LA65_0==STAR) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // Mininess.g:602:33: parameter_declarator
                    {
                    pushFollow(FOLLOW_parameter_declarator_in_parameter_declaration4986);
                    parameter_declarator228=parameter_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declarator.add(parameter_declarator228.getTree());

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
            // 603:13: -> ^( PARAMETER declaration_specifiers ( parameter_declarator )? )
            {
                // Mininess.g:603:16: ^( PARAMETER declaration_specifiers ( parameter_declarator )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETER, "PARAMETER")
                , root_1);

                adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                // Mininess.g:603:51: ( parameter_declarator )?
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

            catch (RecognitionException e) {
                throw e;
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
    // Mininess.g:606:1: parameter_declarator : ( ( declarator )=> declarator | abstract_declarator );
    public final MininessParser.parameter_declarator_return parameter_declarator() throws RecognitionException {
        MininessParser.parameter_declarator_return retval = new MininessParser.parameter_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.declarator_return declarator229 =null;

        MininessParser.abstract_declarator_return abstract_declarator230 =null;



        try {
            // Mininess.g:607:5: ( ( declarator )=> declarator | abstract_declarator )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==STAR) ) {
                int LA66_1 = input.LA(2);

                if ( (synpred7_Mininess()) ) {
                    alt66=1;
                }
                else if ( (true) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA66_0==RAW_IDENTIFIER) && (synpred7_Mininess())) {
                alt66=1;
            }
            else if ( (LA66_0==LPARENS) ) {
                int LA66_3 = input.LA(2);

                if ( (synpred7_Mininess()) ) {
                    alt66=1;
                }
                else if ( (true) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA66_0==LBRACKET) ) {
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
                    // Mininess.g:607:10: ( declarator )=> declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_parameter_declarator5032);
                    declarator229=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator229.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:608:10: abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_abstract_declarator_in_parameter_declarator5043);
                    abstract_declarator230=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator230.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "parameter_declarator"


    public static class identifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_list"
    // Mininess.g:610:1: identifier_list : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final MininessParser.identifier_list_return identifier_list() throws RecognitionException {
        MininessParser.identifier_list_return retval = new MininessParser.identifier_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal232=null;
        MininessParser.identifier_return identifier231 =null;

        MininessParser.identifier_return identifier233 =null;


        Object char_literal232_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // Mininess.g:611:5: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // Mininess.g:611:10: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifier_list5062);
            identifier231=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier231.getTree());

            // Mininess.g:611:21: ( ',' identifier )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // Mininess.g:611:22: ',' identifier
            	    {
            	    char_literal232=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifier_list5065); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal232);


            	    pushFollow(FOLLOW_identifier_in_identifier_list5067);
            	    identifier233=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier233.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
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
            // 611:39: -> ( identifier )+
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
        }
        return retval;
    }
    // $ANTLR end "identifier_list"


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // Mininess.g:613:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final MininessParser.type_name_return type_name() throws RecognitionException {
        MininessParser.type_name_return retval = new MininessParser.type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.specifier_qualifier_list_return specifier_qualifier_list234 =null;

        MininessParser.abstract_declarator_return abstract_declarator235 =null;



        try {
            // Mininess.g:614:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // Mininess.g:614:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name5093);
            specifier_qualifier_list234=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list234.getTree());

            // Mininess.g:614:35: ( abstract_declarator )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==LBRACKET||LA68_0==LPARENS||LA68_0==STAR) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // Mininess.g:614:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name5095);
                    abstract_declarator235=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator235.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "type_name"


    public static class abstract_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "abstract_declarator"
    // Mininess.g:616:1: abstract_declarator : ( ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator | pointer );
    public final MininessParser.abstract_declarator_return abstract_declarator() throws RecognitionException {
        MininessParser.abstract_declarator_return retval = new MininessParser.abstract_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.pointer_return pointer236 =null;

        MininessParser.direct_abstract_declarator_return direct_abstract_declarator237 =null;

        MininessParser.pointer_return pointer238 =null;



        try {
            // Mininess.g:617:5: ( ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator | pointer )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==STAR) ) {
                int LA70_1 = input.LA(2);

                if ( (synpred8_Mininess()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA70_0==LPARENS) && (synpred8_Mininess())) {
                alt70=1;
            }
            else if ( (LA70_0==LBRACKET) && (synpred8_Mininess())) {
                alt70=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // Mininess.g:617:10: ( ( pointer )? direct_abstract_declarator )=> ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // Mininess.g:617:51: ( pointer )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==STAR) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // Mininess.g:617:51: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator5124);
                            pointer236=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer236.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator5127);
                    direct_abstract_declarator237=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator237.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:618:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator5138);
                    pointer238=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer238.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "abstract_declarator"


    public static class direct_abstract_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direct_abstract_declarator"
    // Mininess.g:620:1: direct_abstract_declarator : ( ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )* | ( direct_abstract_declarator_modifier )+ );
    public final MininessParser.direct_abstract_declarator_return direct_abstract_declarator() throws RecognitionException {
        MininessParser.direct_abstract_declarator_return retval = new MininessParser.direct_abstract_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal239=null;
        Token char_literal241=null;
        MininessParser.abstract_declarator_return abstract_declarator240 =null;

        MininessParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier242 =null;

        MininessParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier243 =null;


        Object char_literal239_tree=null;
        Object char_literal241_tree=null;

        try {
            // Mininess.g:621:5: ( ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )* | ( direct_abstract_declarator_modifier )+ )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==LPARENS) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==STAR) && (synpred9_Mininess())) {
                    alt73=1;
                }
                else if ( (LA73_1==LPARENS) && (synpred9_Mininess())) {
                    alt73=1;
                }
                else if ( (LA73_1==LBRACKET) && (synpred9_Mininess())) {
                    alt73=1;
                }
                else if ( (LA73_1==CHAR||LA73_1==COMMAND||LA73_1==CONST||LA73_1==ENUM||(LA73_1 >= ERROR_T && LA73_1 <= EVENT)||(LA73_1 >= INT && LA73_1 <= INT8_T)||LA73_1==LONG||(LA73_1 >= NXLE_INT16_T && LA73_1 <= NX_UINT8_T)||LA73_1==RAW_IDENTIFIER||LA73_1==RPARENS||(LA73_1 >= SHORT && LA73_1 <= SIGNED)||LA73_1==STRUCT||LA73_1==TASK||(LA73_1 >= UINT16_T && LA73_1 <= UINT8_T)||LA73_1==UNSIGNED||LA73_1==VOID) ) {
                    alt73=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

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
                    // Mininess.g:621:10: ( '(' abstract_declarator ')' )=> '(' abstract_declarator ')' ( direct_abstract_declarator_modifier )*
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal239=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator5178); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal239_tree = 
                    (Object)adaptor.create(char_literal239)
                    ;
                    adaptor.addChild(root_0, char_literal239_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator5180);
                    abstract_declarator240=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator240.getTree());

                    char_literal241=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator5182); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal241_tree = 
                    (Object)adaptor.create(char_literal241)
                    ;
                    adaptor.addChild(root_0, char_literal241_tree);
                    }

                    // Mininess.g:622:39: ( direct_abstract_declarator_modifier )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==LBRACKET||LA71_0==LPARENS) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // Mininess.g:622:39: direct_abstract_declarator_modifier
                    	    {
                    	    pushFollow(FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator5184);
                    	    direct_abstract_declarator_modifier242=direct_abstract_declarator_modifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator_modifier242.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Mininess.g:623:10: ( direct_abstract_declarator_modifier )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // Mininess.g:623:10: ( direct_abstract_declarator_modifier )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==LBRACKET||LA72_0==LPARENS) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // Mininess.g:623:10: direct_abstract_declarator_modifier
                    	    {
                    	    pushFollow(FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator5196);
                    	    direct_abstract_declarator_modifier243=direct_abstract_declarator_modifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator_modifier243.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
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

            catch (RecognitionException e) {
                throw e;
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
    // Mininess.g:625:1: direct_abstract_declarator_modifier : ( '[' ( assignment_expression )? ']' | '(' parameter_list ')' );
    public final MininessParser.direct_abstract_declarator_modifier_return direct_abstract_declarator_modifier() throws RecognitionException {
        MininessParser.direct_abstract_declarator_modifier_return retval = new MininessParser.direct_abstract_declarator_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal244=null;
        Token char_literal246=null;
        Token char_literal247=null;
        Token char_literal249=null;
        MininessParser.assignment_expression_return assignment_expression245 =null;

        MininessParser.parameter_list_return parameter_list248 =null;


        Object char_literal244_tree=null;
        Object char_literal246_tree=null;
        Object char_literal247_tree=null;
        Object char_literal249_tree=null;

        try {
            // Mininess.g:626:5: ( '[' ( assignment_expression )? ']' | '(' parameter_list ')' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==LBRACKET) ) {
                alt75=1;
            }
            else if ( (LA75_0==LPARENS) ) {
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
                    // Mininess.g:626:10: '[' ( assignment_expression )? ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal244=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator_modifier5212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal244_tree = 
                    (Object)adaptor.create(char_literal244)
                    ;
                    adaptor.addChild(root_0, char_literal244_tree);
                    }

                    // Mininess.g:626:14: ( assignment_expression )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==AMP||LA74_0==BITCOMPLEMENT||LA74_0==CALL||LA74_0==CHARACTER_LITERAL||LA74_0==CONSTANT||LA74_0==LPARENS||LA74_0==MINUS||LA74_0==MINUSMINUS||LA74_0==NOT||LA74_0==PLUS||LA74_0==PLUSPLUS||LA74_0==POST||LA74_0==RAW_IDENTIFIER||LA74_0==SIZEOF||LA74_0==STAR||LA74_0==STRING_LITERAL) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // Mininess.g:626:14: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator_modifier5214);
                            assignment_expression245=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression245.getTree());

                            }
                            break;

                    }


                    char_literal246=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator_modifier5217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal246_tree = 
                    (Object)adaptor.create(char_literal246)
                    ;
                    adaptor.addChild(root_0, char_literal246_tree);
                    }

                    }
                    break;
                case 2 :
                    // Mininess.g:627:10: '(' parameter_list ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal247=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator_modifier5228); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal247_tree = 
                    (Object)adaptor.create(char_literal247)
                    ;
                    adaptor.addChild(root_0, char_literal247_tree);
                    }

                    pushFollow(FOLLOW_parameter_list_in_direct_abstract_declarator_modifier5230);
                    parameter_list248=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list248.getTree());

                    char_literal249=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator_modifier5232); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal249_tree = 
                    (Object)adaptor.create(char_literal249)
                    ;
                    adaptor.addChild(root_0, char_literal249_tree);
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
        }
        return retval;
    }
    // $ANTLR end "direct_abstract_declarator_modifier"


    public static class typedef_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_name"
    // Mininess.g:630:1: typedef_name :{...}? RAW_IDENTIFIER ;
    public final MininessParser.typedef_name_return typedef_name() throws RecognitionException {
        MininessParser.typedef_name_return retval = new MininessParser.typedef_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER250=null;

        Object RAW_IDENTIFIER250_tree=null;

        try {
            // Mininess.g:631:5: ({...}? RAW_IDENTIFIER )
            // Mininess.g:631:10: {...}? RAW_IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            if ( !(( symbols.isType(input.LT(1).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typedef_name", " symbols.isType(input.LT(1).getText()) ");
            }

            RAW_IDENTIFIER250=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name5258); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAW_IDENTIFIER250_tree = 
            (Object)adaptor.create(RAW_IDENTIFIER250)
            ;
            adaptor.addChild(root_0, RAW_IDENTIFIER250_tree);
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
        }
        return retval;
    }
    // $ANTLR end "typedef_name"


    public static class initializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer"
    // Mininess.g:639:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
    public final MininessParser.initializer_return initializer() throws RecognitionException {
        MininessParser.initializer_return retval = new MininessParser.initializer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal252=null;
        Token char_literal254=null;
        Token char_literal255=null;
        MininessParser.assignment_expression_return assignment_expression251 =null;

        MininessParser.initializer_list_return initializer_list253 =null;


        Object char_literal252_tree=null;
        Object char_literal254_tree=null;
        Object char_literal255_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            // Mininess.g:640:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==AMP||LA77_0==BITCOMPLEMENT||LA77_0==CALL||LA77_0==CHARACTER_LITERAL||LA77_0==CONSTANT||LA77_0==LPARENS||LA77_0==MINUS||LA77_0==MINUSMINUS||LA77_0==NOT||LA77_0==PLUS||LA77_0==PLUSPLUS||LA77_0==POST||LA77_0==RAW_IDENTIFIER||LA77_0==SIZEOF||LA77_0==STAR||LA77_0==STRING_LITERAL) ) {
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
                    // Mininess.g:640:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer5283);
                    assignment_expression251=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression251.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:641:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal252=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer5294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal252);


                    pushFollow(FOLLOW_initializer_list_in_initializer5296);
                    initializer_list253=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list253.getTree());

                    // Mininess.g:641:31: ( ',' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==COMMA) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // Mininess.g:641:31: ','
                            {
                            char_literal254=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer5298); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal254);


                            }
                            break;

                    }


                    char_literal255=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer5301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal255);


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
                    // 641:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // Mininess.g:641:43: ^( INITIALIZER_LIST initializer_list )
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
        }
        return retval;
    }
    // $ANTLR end "initializer"


    public static class initializer_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer_list"
    // Mininess.g:645:1: initializer_list : ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ ;
    public final MininessParser.initializer_list_return initializer_list() throws RecognitionException {
        MininessParser.initializer_list_return retval = new MininessParser.initializer_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER256=null;
        Token char_literal257=null;
        Token char_literal259=null;
        Token RAW_IDENTIFIER260=null;
        Token char_literal261=null;
        MininessParser.initializer_return initializer258 =null;

        MininessParser.initializer_return initializer262 =null;


        Object RAW_IDENTIFIER256_tree=null;
        Object char_literal257_tree=null;
        Object char_literal259_tree=null;
        Object RAW_IDENTIFIER260_tree=null;
        Object char_literal261_tree=null;
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_RAW_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token RAW_IDENTIFIER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // Mininess.g:646:5: ( ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )* -> ( initializer )+ )
            // Mininess.g:646:10: ( RAW_IDENTIFIER ':' )? initializer ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            {
            // Mininess.g:646:10: ( RAW_IDENTIFIER ':' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RAW_IDENTIFIER) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==149) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // Mininess.g:646:11: RAW_IDENTIFIER ':'
                    {
                    RAW_IDENTIFIER256=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list5331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER256);


                    char_literal257=(Token)match(input,149,FOLLOW_149_in_initializer_list5333); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_149.add(char_literal257);


                    }
                    break;

            }


            pushFollow(FOLLOW_initializer_in_initializer_list5337);
            initializer258=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer258.getTree());

            // Mininess.g:646:44: ( ',' ( RAW_IDENTIFIER ':' )? initializer )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA) ) {
                    int LA80_1 = input.LA(2);

                    if ( (LA80_1==AMP||LA80_1==BITCOMPLEMENT||LA80_1==CALL||LA80_1==CHARACTER_LITERAL||LA80_1==CONSTANT||LA80_1==LBRACE||LA80_1==LPARENS||LA80_1==MINUS||LA80_1==MINUSMINUS||LA80_1==NOT||LA80_1==PLUS||LA80_1==PLUSPLUS||LA80_1==POST||LA80_1==RAW_IDENTIFIER||LA80_1==SIZEOF||LA80_1==STAR||LA80_1==STRING_LITERAL) ) {
                        alt80=1;
                    }


                }


                switch (alt80) {
            	case 1 :
            	    // Mininess.g:646:45: ',' ( RAW_IDENTIFIER ':' )? initializer
            	    {
            	    char_literal259=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list5340); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal259);


            	    // Mininess.g:646:49: ( RAW_IDENTIFIER ':' )?
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==RAW_IDENTIFIER) ) {
            	        int LA79_1 = input.LA(2);

            	        if ( (LA79_1==149) ) {
            	            alt79=1;
            	        }
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // Mininess.g:646:50: RAW_IDENTIFIER ':'
            	            {
            	            RAW_IDENTIFIER260=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_initializer_list5343); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_RAW_IDENTIFIER.add(RAW_IDENTIFIER260);


            	            char_literal261=(Token)match(input,149,FOLLOW_149_in_initializer_list5345); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_149.add(char_literal261);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_initializer_in_initializer_list5349);
            	    initializer262=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer262.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
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
            // 647:13: -> ( initializer )+
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
        }
        return retval;
    }
    // $ANTLR end "initializer_list"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // Mininess.g:666:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | line_directive_mini );
    public final MininessParser.statement_return statement() throws RecognitionException {
        MininessParser.statement_return retval = new MininessParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.labeled_statement_return labeled_statement263 =null;

        MininessParser.compound_statement_return compound_statement264 =null;

        MininessParser.expression_statement_return expression_statement265 =null;

        MininessParser.selection_statement_return selection_statement266 =null;

        MininessParser.iteration_statement_return iteration_statement267 =null;

        MininessParser.jump_statement_return jump_statement268 =null;

        MininessParser.line_directive_mini_return line_directive_mini269 =null;



        try {
            // Mininess.g:667:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | line_directive_mini )
            int alt81=7;
            switch ( input.LA(1) ) {
            case CASE:
            case DEFAULT:
                {
                alt81=1;
                }
                break;
            case LBRACE:
                {
                alt81=2;
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
            case RAW_IDENTIFIER:
            case SIZEOF:
            case STAR:
            case STRING_LITERAL:
            case 150:
                {
                alt81=3;
                }
                break;
            case IF:
            case SWITCH:
                {
                alt81=4;
                }
                break;
            case FOR:
            case WHILE:
                {
                alt81=5;
                }
                break;
            case RETURN:
                {
                alt81=6;
                }
                break;
            case HASH:
                {
                alt81=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }

            switch (alt81) {
                case 1 :
                    // Mininess.g:667:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement5403);
                    labeled_statement263=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement263.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:668:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement5414);
                    compound_statement264=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement264.getTree());

                    }
                    break;
                case 3 :
                    // Mininess.g:669:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement5425);
                    expression_statement265=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement265.getTree());

                    }
                    break;
                case 4 :
                    // Mininess.g:670:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement5436);
                    selection_statement266=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement266.getTree());

                    }
                    break;
                case 5 :
                    // Mininess.g:671:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement5447);
                    iteration_statement267=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement267.getTree());

                    }
                    break;
                case 6 :
                    // Mininess.g:672:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement5458);
                    jump_statement268=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement268.getTree());

                    }
                    break;
                case 7 :
                    // Mininess.g:673:10: line_directive_mini
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_line_directive_mini_in_statement5469);
                    line_directive_mini269=line_directive_mini();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive_mini269.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class labeled_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "labeled_statement"
    // Mininess.g:675:1: labeled_statement : ( CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final MininessParser.labeled_statement_return labeled_statement() throws RecognitionException {
        MininessParser.labeled_statement_return retval = new MininessParser.labeled_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CASE270=null;
        Token char_literal272=null;
        Token DEFAULT274=null;
        Token char_literal275=null;
        MininessParser.constant_expression_return constant_expression271 =null;

        MininessParser.statement_return statement273 =null;

        MininessParser.statement_return statement276 =null;


        Object CASE270_tree=null;
        Object char_literal272_tree=null;
        Object DEFAULT274_tree=null;
        Object char_literal275_tree=null;
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        try {
            // Mininess.g:676:5: ( CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==CASE) ) {
                alt82=1;
            }
            else if ( (LA82_0==DEFAULT) ) {
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
                    // Mininess.g:676:10: CASE constant_expression ':' statement
                    {
                    CASE270=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement5492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE270);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement5494);
                    constant_expression271=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression271.getTree());

                    char_literal272=(Token)match(input,149,FOLLOW_149_in_labeled_statement5496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_149.add(char_literal272);


                    pushFollow(FOLLOW_statement_in_labeled_statement5498);
                    statement273=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement273.getTree());

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
                    // 676:49: -> ^( CASE constant_expression statement )
                    {
                        // Mininess.g:676:52: ^( CASE constant_expression statement )
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
                case 2 :
                    // Mininess.g:677:10: DEFAULT ':' statement
                    {
                    DEFAULT274=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement5519); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT274);


                    char_literal275=(Token)match(input,149,FOLLOW_149_in_labeled_statement5521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_149.add(char_literal275);


                    pushFollow(FOLLOW_statement_in_labeled_statement5523);
                    statement276=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement276.getTree());

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
                    // 677:32: -> ^( DEFAULT statement )
                    {
                        // Mininess.g:677:35: ^( DEFAULT statement )
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
        }
        return retval;
    }
    // $ANTLR end "labeled_statement"


    public static class compound_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compound_statement"
    // Mininess.g:682:1: compound_statement : '{' ( declaration )* ( statement )* '}' -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* ) ;
    public final MininessParser.compound_statement_return compound_statement() throws RecognitionException {
        MininessParser.compound_statement_return retval = new MininessParser.compound_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal277=null;
        Token char_literal280=null;
        MininessParser.declaration_return declaration278 =null;

        MininessParser.statement_return statement279 =null;


        Object char_literal277_tree=null;
        Object char_literal280_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // Mininess.g:683:5: ( '{' ( declaration )* ( statement )* '}' -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* ) )
            // Mininess.g:683:10: '{' ( declaration )* ( statement )* '}'
            {
            char_literal277=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement5549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal277);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // Mininess.g:684:10: ( declaration )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RAW_IDENTIFIER) ) {
                    int LA83_14 = input.LA(2);

                    if ( (!((( !symbols.isType(input.LT(1).getText()) )))) ) {
                        alt83=1;
                    }


                }
                else if ( (LA83_0==CHAR||LA83_0==COMMAND||LA83_0==CONST||LA83_0==ENUM||(LA83_0 >= ERROR_T && LA83_0 <= EVENT)||(LA83_0 >= INT && LA83_0 <= INT8_T)||LA83_0==LONG||(LA83_0 >= NXLE_INT16_T && LA83_0 <= NX_UINT8_T)||(LA83_0 >= SHORT && LA83_0 <= SIGNED)||LA83_0==STRUCT||(LA83_0 >= TASK && LA83_0 <= UINT8_T)||LA83_0==UNSIGNED||LA83_0==VOID) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // Mininess.g:684:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_compound_statement5562);
            	    declaration278=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration278.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            // Mininess.g:684:23: ( statement )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==AMP||LA84_0==BITCOMPLEMENT||(LA84_0 >= CALL && LA84_0 <= CASE)||LA84_0==CHARACTER_LITERAL||LA84_0==CONSTANT||LA84_0==DEFAULT||LA84_0==FOR||LA84_0==HASH||LA84_0==IF||LA84_0==LBRACE||LA84_0==LPARENS||LA84_0==MINUS||LA84_0==MINUSMINUS||LA84_0==NOT||LA84_0==PLUS||LA84_0==PLUSPLUS||LA84_0==POST||LA84_0==RAW_IDENTIFIER||LA84_0==RETURN||LA84_0==SIZEOF||LA84_0==STAR||LA84_0==STRING_LITERAL||LA84_0==SWITCH||LA84_0==WHILE||LA84_0==150) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // Mininess.g:684:23: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compound_statement5565);
            	    statement279=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement279.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal280=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement5583); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal280);


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
            // 685:44: -> ^( COMPOUND_STATEMENT ( declaration )* ( statement )* )
            {
                // Mininess.g:685:47: ^( COMPOUND_STATEMENT ( declaration )* ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // Mininess.g:685:68: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                // Mininess.g:685:81: ( statement )*
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

            catch (RecognitionException e) {
                throw e;
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
    // Mininess.g:691:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final MininessParser.expression_statement_return expression_statement() throws RecognitionException {
        MininessParser.expression_statement_return retval = new MininessParser.expression_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal282=null;
        MininessParser.expression_return expression281 =null;


        Object char_literal282_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Mininess.g:692:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // Mininess.g:692:10: ( expression )? ';'
            {
            // Mininess.g:692:10: ( expression )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==AMP||LA85_0==BITCOMPLEMENT||LA85_0==CALL||LA85_0==CHARACTER_LITERAL||LA85_0==CONSTANT||LA85_0==LPARENS||LA85_0==MINUS||LA85_0==MINUSMINUS||LA85_0==NOT||LA85_0==PLUS||LA85_0==PLUSPLUS||LA85_0==POST||LA85_0==RAW_IDENTIFIER||LA85_0==SIZEOF||LA85_0==STAR||LA85_0==STRING_LITERAL) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Mininess.g:692:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement5618);
                    expression281=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression281.getTree());

                    }
                    break;

            }


            char_literal282=(Token)match(input,150,FOLLOW_150_in_expression_statement5621); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_150.add(char_literal282);


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
            // 692:26: -> ^( STATEMENT ( expression )? )
            {
                // Mininess.g:692:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // Mininess.g:692:41: ( expression )?
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
        }
        return retval;
    }
    // $ANTLR end "expression_statement"


    public static class selection_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_statement"
    // Mininess.g:700:1: selection_statement : ( ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement -> ^( IF expression $s1 $s2) | IF '(' expression ')' statement -> ^( IF expression statement ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final MininessParser.selection_statement_return selection_statement() throws RecognitionException {
        MininessParser.selection_statement_return retval = new MininessParser.selection_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF283=null;
        Token char_literal284=null;
        Token char_literal286=null;
        Token ELSE287=null;
        Token IF288=null;
        Token char_literal289=null;
        Token char_literal291=null;
        Token SWITCH293=null;
        Token char_literal294=null;
        Token char_literal296=null;
        MininessParser.statement_return s1 =null;

        MininessParser.statement_return s2 =null;

        MininessParser.expression_return expression285 =null;

        MininessParser.expression_return expression290 =null;

        MininessParser.statement_return statement292 =null;

        MininessParser.expression_return expression295 =null;

        MininessParser.statement_return statement297 =null;


        Object IF283_tree=null;
        Object char_literal284_tree=null;
        Object char_literal286_tree=null;
        Object ELSE287_tree=null;
        Object IF288_tree=null;
        Object char_literal289_tree=null;
        Object char_literal291_tree=null;
        Object SWITCH293_tree=null;
        Object char_literal294_tree=null;
        Object char_literal296_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // Mininess.g:701:5: ( ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement -> ^( IF expression $s1 $s2) | IF '(' expression ')' statement -> ^( IF expression statement ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==IF) ) {
                int LA86_1 = input.LA(2);

                if ( (synpred10_Mininess()) ) {
                    alt86=1;
                }
                else if ( (true) ) {
                    alt86=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA86_0==SWITCH) ) {
                alt86=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }
            switch (alt86) {
                case 1 :
                    // Mininess.g:701:10: ( IF '(' expression ')' statement ELSE statement )=> IF '(' expression ')' s1= statement ELSE s2= statement
                    {
                    IF283=(Token)match(input,IF,FOLLOW_IF_in_selection_statement5683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF283);


                    char_literal284=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement5685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal284);


                    pushFollow(FOLLOW_expression_in_selection_statement5687);
                    expression285=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression285.getTree());

                    char_literal286=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement5689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal286);


                    pushFollow(FOLLOW_statement_in_selection_statement5693);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s1.getTree());

                    ELSE287=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement5695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE287);


                    pushFollow(FOLLOW_statement_in_selection_statement5699);
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
                    // 703:14: -> ^( IF expression $s1 $s2)
                    {
                        // Mininess.g:703:17: ^( IF expression $s1 $s2)
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
                    // Mininess.g:704:10: IF '(' expression ')' statement
                    {
                    IF288=(Token)match(input,IF,FOLLOW_IF_in_selection_statement5737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF288);


                    char_literal289=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement5739); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal289);


                    pushFollow(FOLLOW_expression_in_selection_statement5741);
                    expression290=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression290.getTree());

                    char_literal291=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement5743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal291);


                    pushFollow(FOLLOW_statement_in_selection_statement5745);
                    statement292=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement292.getTree());

                    // AST REWRITE
                    // elements: statement, IF, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 705:14: -> ^( IF expression statement )
                    {
                        // Mininess.g:705:17: ^( IF expression statement )
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
                    // Mininess.g:706:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH293=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement5779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH293);


                    char_literal294=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement5781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal294);


                    pushFollow(FOLLOW_expression_in_selection_statement5783);
                    expression295=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression295.getTree());

                    char_literal296=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement5785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal296);


                    pushFollow(FOLLOW_statement_in_selection_statement5787);
                    statement297=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement297.getTree());

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
                    // 707:14: -> ^( SWITCH expression statement )
                    {
                        // Mininess.g:707:17: ^( SWITCH expression statement )
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
        }
        return retval;
    }
    // $ANTLR end "selection_statement"


    public static class iteration_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_statement"
    // Mininess.g:713:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final MininessParser.iteration_statement_return iteration_statement() throws RecognitionException {
        MininessParser.iteration_statement_return retval = new MininessParser.iteration_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE298=null;
        Token char_literal299=null;
        Token char_literal301=null;
        Token FOR303=null;
        Token char_literal304=null;
        Token char_literal305=null;
        Token char_literal306=null;
        Token char_literal307=null;
        MininessParser.expression_return init =null;

        MininessParser.expression_return cond =null;

        MininessParser.expression_return iter =null;

        MininessParser.expression_return expression300 =null;

        MininessParser.statement_return statement302 =null;

        MininessParser.statement_return statement308 =null;


        Object WHILE298_tree=null;
        Object char_literal299_tree=null;
        Object char_literal301_tree=null;
        Object FOR303_tree=null;
        Object char_literal304_tree=null;
        Object char_literal305_tree=null;
        Object char_literal306_tree=null;
        Object char_literal307_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // Mininess.g:714:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==WHILE) ) {
                alt90=1;
            }
            else if ( (LA90_0==FOR) ) {
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
                    // Mininess.g:714:10: WHILE '(' expression ')' statement
                    {
                    WHILE298=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement5833); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE298);


                    char_literal299=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement5835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal299);


                    pushFollow(FOLLOW_expression_in_iteration_statement5837);
                    expression300=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression300.getTree());

                    char_literal301=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement5839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal301);


                    pushFollow(FOLLOW_statement_in_iteration_statement5841);
                    statement302=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement302.getTree());

                    // AST REWRITE
                    // elements: statement, WHILE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 714:45: -> ^( WHILE expression statement )
                    {
                        // Mininess.g:714:48: ^( WHILE expression statement )
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
                    // Mininess.g:715:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR303=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement5862); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR303);


                    char_literal304=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement5864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal304);


                    // Mininess.g:715:22: (init= expression )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==AMP||LA87_0==BITCOMPLEMENT||LA87_0==CALL||LA87_0==CHARACTER_LITERAL||LA87_0==CONSTANT||LA87_0==LPARENS||LA87_0==MINUS||LA87_0==MINUSMINUS||LA87_0==NOT||LA87_0==PLUS||LA87_0==PLUSPLUS||LA87_0==POST||LA87_0==RAW_IDENTIFIER||LA87_0==SIZEOF||LA87_0==STAR||LA87_0==STRING_LITERAL) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // Mininess.g:715:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement5868);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal305=(Token)match(input,150,FOLLOW_150_in_iteration_statement5871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_150.add(char_literal305);


                    // Mininess.g:715:43: (cond= expression )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==AMP||LA88_0==BITCOMPLEMENT||LA88_0==CALL||LA88_0==CHARACTER_LITERAL||LA88_0==CONSTANT||LA88_0==LPARENS||LA88_0==MINUS||LA88_0==MINUSMINUS||LA88_0==NOT||LA88_0==PLUS||LA88_0==PLUSPLUS||LA88_0==POST||LA88_0==RAW_IDENTIFIER||LA88_0==SIZEOF||LA88_0==STAR||LA88_0==STRING_LITERAL) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // Mininess.g:715:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement5875);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal306=(Token)match(input,150,FOLLOW_150_in_iteration_statement5878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_150.add(char_literal306);


                    // Mininess.g:715:64: (iter= expression )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==AMP||LA89_0==BITCOMPLEMENT||LA89_0==CALL||LA89_0==CHARACTER_LITERAL||LA89_0==CONSTANT||LA89_0==LPARENS||LA89_0==MINUS||LA89_0==MINUSMINUS||LA89_0==NOT||LA89_0==PLUS||LA89_0==PLUSPLUS||LA89_0==POST||LA89_0==RAW_IDENTIFIER||LA89_0==SIZEOF||LA89_0==STAR||LA89_0==STRING_LITERAL) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // Mininess.g:715:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement5882);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal307=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement5885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal307);


                    pushFollow(FOLLOW_statement_in_iteration_statement5887);
                    statement308=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement308.getTree());

                    // AST REWRITE
                    // elements: init, FOR, iter, statement, cond
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
                    // 716:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // Mininess.g:716:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // Mininess.g:716:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // Mininess.g:716:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // Mininess.g:717:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // Mininess.g:717:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // Mininess.g:718:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // Mininess.g:718:40: ( $iter)?
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
        }
        return retval;
    }
    // $ANTLR end "iteration_statement"


    public static class jump_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_statement"
    // Mininess.g:720:1: jump_statement : RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) ;
    public final MininessParser.jump_statement_return jump_statement() throws RecognitionException {
        MininessParser.jump_statement_return retval = new MininessParser.jump_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RETURN309=null;
        Token char_literal311=null;
        MininessParser.expression_return expression310 =null;


        Object RETURN309_tree=null;
        Object char_literal311_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Mininess.g:721:5: ( RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
            // Mininess.g:721:10: RETURN ( expression )? ';'
            {
            RETURN309=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement5994); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN309);


            // Mininess.g:721:17: ( expression )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==AMP||LA91_0==BITCOMPLEMENT||LA91_0==CALL||LA91_0==CHARACTER_LITERAL||LA91_0==CONSTANT||LA91_0==LPARENS||LA91_0==MINUS||LA91_0==MINUSMINUS||LA91_0==NOT||LA91_0==PLUS||LA91_0==PLUSPLUS||LA91_0==POST||LA91_0==RAW_IDENTIFIER||LA91_0==SIZEOF||LA91_0==STAR||LA91_0==STRING_LITERAL) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Mininess.g:721:17: expression
                    {
                    pushFollow(FOLLOW_expression_in_jump_statement5996);
                    expression310=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression310.getTree());

                    }
                    break;

            }


            char_literal311=(Token)match(input,150,FOLLOW_150_in_jump_statement5999); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_150.add(char_literal311);


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
            // 721:33: -> ^( RETURN ( expression )? )
            {
                // Mininess.g:721:36: ^( RETURN ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_RETURN.nextNode()
                , root_1);

                // Mininess.g:721:45: ( expression )?
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
        }
        return retval;
    }
    // $ANTLR end "jump_statement"


    public static class translation_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "translation_unit"
    // Mininess.g:727:1: translation_unit : ( line_directive | external_declaration )+ ;
    public final MininessParser.translation_unit_return translation_unit() throws RecognitionException {
        MininessParser.translation_unit_return retval = new MininessParser.translation_unit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.line_directive_return line_directive312 =null;

        MininessParser.external_declaration_return external_declaration313 =null;



        try {
            // Mininess.g:728:5: ( ( line_directive | external_declaration )+ )
            // Mininess.g:728:10: ( line_directive | external_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:728:10: ( line_directive | external_declaration )+
            int cnt92=0;
            loop92:
            do {
                int alt92=3;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==HASH) ) {
                    alt92=1;
                }
                else if ( (LA92_0==CHAR||LA92_0==COMMAND||LA92_0==CONST||LA92_0==ENUM||(LA92_0 >= ERROR_T && LA92_0 <= EVENT)||(LA92_0 >= INT && LA92_0 <= INT8_T)||LA92_0==LONG||(LA92_0 >= NXLE_INT16_T && LA92_0 <= NX_UINT8_T)||LA92_0==RAW_IDENTIFIER||(LA92_0 >= SHORT && LA92_0 <= SIGNED)||LA92_0==STRUCT||(LA92_0 >= TASK && LA92_0 <= UINT8_T)||LA92_0==UNSIGNED||LA92_0==VOID) ) {
                    alt92=2;
                }


                switch (alt92) {
            	case 1 :
            	    // Mininess.g:728:11: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit6035);
            	    line_directive312=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive312.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:728:28: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit6039);
            	    external_declaration313=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration313.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "translation_unit"


    public static class external_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "external_declaration"
    // Mininess.g:731:1: external_declaration : declaration ;
    public final MininessParser.external_declaration_return external_declaration() throws RecognitionException {
        MininessParser.external_declaration_return retval = new MininessParser.external_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.declaration_return declaration314 =null;



        try {
            // Mininess.g:732:5: ( declaration )
            // Mininess.g:732:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration6057);
            declaration314=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration314.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "external_declaration"


    public static class line_directive_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line_directive"
    // Mininess.g:751:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final MininessParser.line_directive_return line_directive() throws RecognitionException {
        MininessParser.line_directive_return retval = new MininessParser.line_directive_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal315=null;
        Token CONSTANT316=null;
        Token STRING_LITERAL317=null;
        Token CONSTANT318=null;

        Object char_literal315_tree=null;
        Object CONSTANT316_tree=null;
        Object STRING_LITERAL317_tree=null;
        Object CONSTANT318_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            // Mininess.g:752:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )* -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // Mininess.g:752:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )*
            {
            char_literal315=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive6089); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal315);


            CONSTANT316=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive6091); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT316);


            STRING_LITERAL317=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive6093); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL317);


            // Mininess.g:752:38: ( CONSTANT )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==CONSTANT) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // Mininess.g:752:38: CONSTANT
            	    {
            	    CONSTANT318=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive6095); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT318);


            	    }
            	    break;

            	default :
            	    break loop93;
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
            // 752:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // Mininess.g:752:51: ^( LINE_DIRECTIVE STRING_LITERAL )
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
        }
        return retval;
    }
    // $ANTLR end "line_directive"


    public static class line_directive_mini_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line_directive_mini"
    // Mininess.g:754:1: line_directive_mini : '#' CONSTANT STRING_LITERAL -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final MininessParser.line_directive_mini_return line_directive_mini() throws RecognitionException {
        MininessParser.line_directive_mini_return retval = new MininessParser.line_directive_mini_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal319=null;
        Token CONSTANT320=null;
        Token STRING_LITERAL321=null;

        Object char_literal319_tree=null;
        Object CONSTANT320_tree=null;
        Object STRING_LITERAL321_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            // Mininess.g:755:5: ( '#' CONSTANT STRING_LITERAL -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // Mininess.g:755:10: '#' CONSTANT STRING_LITERAL
            {
            char_literal319=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive_mini6119); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal319);


            CONSTANT320=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive_mini6121); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT320);


            STRING_LITERAL321=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive_mini6123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL321);


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
            // 755:38: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // Mininess.g:755:41: ^( LINE_DIRECTIVE STRING_LITERAL )
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
        }
        return retval;
    }
    // $ANTLR end "line_directive_mini"


    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_definition"
    // Mininess.g:760:1: function_definition : declaration_specifiers declarator compound_statement -> declaration_specifiers declarator compound_statement ;
    public final MininessParser.function_definition_return function_definition() throws RecognitionException {
        MininessParser.function_definition_return retval = new MininessParser.function_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.declaration_specifiers_return declaration_specifiers322 =null;

        MininessParser.declarator_return declarator323 =null;

        MininessParser.compound_statement_return compound_statement324 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        try {
            // Mininess.g:761:5: ( declaration_specifiers declarator compound_statement -> declaration_specifiers declarator compound_statement )
            // Mininess.g:761:10: declaration_specifiers declarator compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition6153);
            declaration_specifiers322=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers322.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition6155);
            declarator323=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator323.getTree());

            pushFollow(FOLLOW_compound_statement_in_function_definition6157);
            compound_statement324=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement324.getTree());

            // AST REWRITE
            // elements: compound_statement, declaration_specifiers, declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 762:13: -> declaration_specifiers declarator compound_statement
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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_definition"


    public static class mininess_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mininess_file"
    // Mininess.g:772:1: mininess_file : ( translation_unit )? large_scale_construct -> ^( FILE ( translation_unit )? large_scale_construct ) ;
    public final MininessParser.mininess_file_return mininess_file() throws RecognitionException {
        MininessParser.mininess_file_return retval = new MininessParser.mininess_file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.translation_unit_return translation_unit325 =null;

        MininessParser.large_scale_construct_return large_scale_construct326 =null;


        RewriteRuleSubtreeStream stream_large_scale_construct=new RewriteRuleSubtreeStream(adaptor,"rule large_scale_construct");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            // Mininess.g:773:5: ( ( translation_unit )? large_scale_construct -> ^( FILE ( translation_unit )? large_scale_construct ) )
            // Mininess.g:773:10: ( translation_unit )? large_scale_construct
            {
            // Mininess.g:773:10: ( translation_unit )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==CHAR||LA94_0==COMMAND||LA94_0==CONST||LA94_0==ENUM||(LA94_0 >= ERROR_T && LA94_0 <= EVENT)||LA94_0==HASH||(LA94_0 >= INT && LA94_0 <= INT8_T)||LA94_0==LONG||(LA94_0 >= NXLE_INT16_T && LA94_0 <= NX_UINT8_T)||LA94_0==RAW_IDENTIFIER||(LA94_0 >= SHORT && LA94_0 <= SIGNED)||LA94_0==STRUCT||(LA94_0 >= TASK && LA94_0 <= UINT8_T)||LA94_0==UNSIGNED||LA94_0==VOID) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // Mininess.g:773:10: translation_unit
                    {
                    pushFollow(FOLLOW_translation_unit_in_mininess_file6203);
                    translation_unit325=translation_unit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit325.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_large_scale_construct_in_mininess_file6206);
            large_scale_construct326=large_scale_construct();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_large_scale_construct.add(large_scale_construct326.getTree());

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
            // 774:14: -> ^( FILE ( translation_unit )? large_scale_construct )
            {
                // Mininess.g:774:17: ^( FILE ( translation_unit )? large_scale_construct )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FILE, "FILE")
                , root_1);

                // Mininess.g:774:24: ( translation_unit )?
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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mininess_file"


    public static class large_scale_construct_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "large_scale_construct"
    // Mininess.g:776:1: large_scale_construct : component ;
    public final MininessParser.large_scale_construct_return large_scale_construct() throws RecognitionException {
        MininessParser.large_scale_construct_return retval = new MininessParser.large_scale_construct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.component_return component327 =null;



        try {
            // Mininess.g:777:5: ( component )
            // Mininess.g:777:10: component
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_component_in_large_scale_construct6245);
            component327=component();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, component327.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "large_scale_construct"


    public static class component_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component"
    // Mininess.g:779:1: component : MODULE identifier component_specification implementation -> ^( MODULE identifier component_specification implementation ) ;
    public final MininessParser.component_return component() throws RecognitionException {
        MininessParser.component_return retval = new MininessParser.component_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MODULE328=null;
        MininessParser.identifier_return identifier329 =null;

        MininessParser.component_specification_return component_specification330 =null;

        MininessParser.implementation_return implementation331 =null;


        Object MODULE328_tree=null;
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // Mininess.g:780:5: ( MODULE identifier component_specification implementation -> ^( MODULE identifier component_specification implementation ) )
            // Mininess.g:780:9: MODULE identifier component_specification implementation
            {
            MODULE328=(Token)match(input,MODULE,FOLLOW_MODULE_in_component6259); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE328);


            pushFollow(FOLLOW_identifier_in_component6261);
            identifier329=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier329.getTree());

            pushFollow(FOLLOW_component_specification_in_component6263);
            component_specification330=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification330.getTree());

            pushFollow(FOLLOW_implementation_in_component6265);
            implementation331=implementation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_implementation.add(implementation331.getTree());

            // AST REWRITE
            // elements: identifier, component_specification, implementation, MODULE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 781:13: -> ^( MODULE identifier component_specification implementation )
            {
                // Mininess.g:781:16: ^( MODULE identifier component_specification implementation )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_MODULE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_component_specification.nextTree());

                adaptor.addChild(root_1, stream_implementation.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "component"


    public static class implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementation"
    // Mininess.g:783:1: implementation : module_implementation ;
    public final MininessParser.implementation_return implementation() throws RecognitionException {
        MininessParser.implementation_return retval = new MininessParser.implementation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.module_implementation_return module_implementation332 =null;



        try {
            // Mininess.g:784:5: ( module_implementation )
            // Mininess.g:784:10: module_implementation
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_module_implementation_in_implementation6304);
            module_implementation332=module_implementation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, module_implementation332.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "implementation"


    public static class module_implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_implementation"
    // Mininess.g:789:1: module_implementation : IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) ;
    public final MininessParser.module_implementation_return module_implementation() throws RecognitionException {
        MininessParser.module_implementation_return retval = new MininessParser.module_implementation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLEMENTATION333=null;
        Token char_literal334=null;
        Token char_literal336=null;
        MininessParser.translation_unit_return translation_unit335 =null;


        Object IMPLEMENTATION333_tree=null;
        Object char_literal334_tree=null;
        Object char_literal336_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            // Mininess.g:790:5: ( IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) )
            // Mininess.g:790:10: IMPLEMENTATION '{' translation_unit '}'
            {
            IMPLEMENTATION333=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_module_implementation6322); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION333);


            char_literal334=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_implementation6324); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal334);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_implementation6356);
            translation_unit335=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit335.getTree());

            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal336=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_implementation6412); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal336);


            // AST REWRITE
            // elements: IMPLEMENTATION, translation_unit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 794:13: -> ^( IMPLEMENTATION translation_unit )
            {
                // Mininess.g:794:16: ^( IMPLEMENTATION translation_unit )
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
        }
        return retval;
    }
    // $ANTLR end "module_implementation"


    public static class component_specification_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_specification"
    // Mininess.g:800:1: component_specification : '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final MininessParser.component_specification_return component_specification() throws RecognitionException {
        MininessParser.component_specification_return retval = new MininessParser.component_specification_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal337=null;
        Token char_literal340=null;
        MininessParser.uses_provides_return uses_provides338 =null;

        MininessParser.line_directive_return line_directive339 =null;


        Object char_literal337_tree=null;
        Object char_literal340_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        try {
            // Mininess.g:801:5: ( '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // Mininess.g:801:10: '{' ( uses_provides | line_directive )* '}'
            {
            char_literal337=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification6451); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal337);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // Mininess.g:802:11: ( uses_provides | line_directive )*
            loop95:
            do {
                int alt95=3;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==PROVIDES||LA95_0==USES) ) {
                    alt95=1;
                }
                else if ( (LA95_0==HASH) ) {
                    alt95=2;
                }


                switch (alt95) {
            	case 1 :
            	    // Mininess.g:802:12: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification6466);
            	    uses_provides338=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides338.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:802:28: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification6470);
            	    line_directive339=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive339.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            char_literal340=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification6474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal340);


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
            // 802:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // Mininess.g:802:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // Mininess.g:802:68: ( uses_provides )*
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
        }
        return retval;
    }
    // $ANTLR end "component_specification"


    public static class uses_provides_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uses_provides"
    // Mininess.g:804:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) );
    public final MininessParser.uses_provides_return uses_provides() throws RecognitionException {
        MininessParser.uses_provides_return retval = new MininessParser.uses_provides_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token USES341=null;
        Token PROVIDES343=null;
        MininessParser.specification_element_list_return specification_element_list342 =null;

        MininessParser.specification_element_list_return specification_element_list344 =null;


        Object USES341_tree=null;
        Object PROVIDES343_tree=null;
        RewriteRuleTokenStream stream_PROVIDES=new RewriteRuleTokenStream(adaptor,"token PROVIDES");
        RewriteRuleTokenStream stream_USES=new RewriteRuleTokenStream(adaptor,"token USES");
        RewriteRuleSubtreeStream stream_specification_element_list=new RewriteRuleSubtreeStream(adaptor,"rule specification_element_list");
        try {
            // Mininess.g:805:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==USES) ) {
                alt96=1;
            }
            else if ( (LA96_0==PROVIDES) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;

            }
            switch (alt96) {
                case 1 :
                    // Mininess.g:805:10: USES specification_element_list
                    {
                    USES341=(Token)match(input,USES,FOLLOW_USES_in_uses_provides6498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES341);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides6500);
                    specification_element_list342=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list342.getTree());

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
                    // 805:42: -> ^( USES specification_element_list )
                    {
                        // Mininess.g:805:45: ^( USES specification_element_list )
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
                    // Mininess.g:806:10: PROVIDES specification_element_list
                    {
                    PROVIDES343=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides6519); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES343);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides6521);
                    specification_element_list344=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list344.getTree());

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
                    // 806:46: -> ^( PROVIDES specification_element_list )
                    {
                        // Mininess.g:806:49: ^( PROVIDES specification_element_list )
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
        }
        return retval;
    }
    // $ANTLR end "uses_provides"


    public static class specification_element_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specification_element_list"
    // Mininess.g:808:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final MininessParser.specification_element_list_return specification_element_list() throws RecognitionException {
        MininessParser.specification_element_list_return retval = new MininessParser.specification_element_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal346=null;
        Token char_literal348=null;
        MininessParser.specification_element_return specification_element345 =null;

        MininessParser.specification_element_return specification_element347 =null;


        Object char_literal346_tree=null;
        Object char_literal348_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_specification_element=new RewriteRuleSubtreeStream(adaptor,"rule specification_element");
        try {
            // Mininess.g:809:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==CHAR||LA98_0==COMMAND||LA98_0==CONST||LA98_0==ENUM||(LA98_0 >= ERROR_T && LA98_0 <= EVENT)||(LA98_0 >= INT && LA98_0 <= INT8_T)||LA98_0==LONG||(LA98_0 >= NXLE_INT16_T && LA98_0 <= NX_UINT8_T)||LA98_0==RAW_IDENTIFIER||(LA98_0 >= SHORT && LA98_0 <= SIGNED)||LA98_0==STRUCT||(LA98_0 >= TASK && LA98_0 <= UINT8_T)||LA98_0==UNSIGNED||LA98_0==VOID) ) {
                alt98=1;
            }
            else if ( (LA98_0==LBRACE) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }
            switch (alt98) {
                case 1 :
                    // Mininess.g:809:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list6544);
                    specification_element345=specification_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element.add(specification_element345.getTree());

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
                    // 809:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Mininess.g:810:10: '{' ( specification_element )+ '}'
                    {
                    char_literal346=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list6559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal346);


                    // Mininess.g:810:14: ( specification_element )+
                    int cnt97=0;
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==CHAR||LA97_0==COMMAND||LA97_0==CONST||LA97_0==ENUM||(LA97_0 >= ERROR_T && LA97_0 <= EVENT)||(LA97_0 >= INT && LA97_0 <= INT8_T)||LA97_0==LONG||(LA97_0 >= NXLE_INT16_T && LA97_0 <= NX_UINT8_T)||LA97_0==RAW_IDENTIFIER||(LA97_0 >= SHORT && LA97_0 <= SIGNED)||LA97_0==STRUCT||(LA97_0 >= TASK && LA97_0 <= UINT8_T)||LA97_0==UNSIGNED||LA97_0==VOID) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // Mininess.g:810:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list6561);
                    	    specification_element347=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element347.getTree());

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


                    char_literal348=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list6564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal348);


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
                    // 810:41: -> ( specification_element )+
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
        }
        return retval;
    }
    // $ANTLR end "specification_element_list"


    public static class specification_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specification_element"
    // Mininess.g:812:1: specification_element : declaration ;
    public final MininessParser.specification_element_return specification_element() throws RecognitionException {
        MininessParser.specification_element_return retval = new MininessParser.specification_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MininessParser.declaration_return declaration349 =null;



        try {
            // Mininess.g:813:5: ( declaration )
            // Mininess.g:813:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_specification_element6584);
            declaration349=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration349.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "specification_element"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // Mininess.g:816:1: identifier :{...}? RAW_IDENTIFIER ;
    public final MininessParser.identifier_return identifier() throws RecognitionException {
        MininessParser.identifier_return retval = new MininessParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RAW_IDENTIFIER350=null;

        Object RAW_IDENTIFIER350_tree=null;

        try {
            // Mininess.g:817:5: ({...}? RAW_IDENTIFIER )
            // Mininess.g:817:10: {...}? RAW_IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            if ( !(( !symbols.isType(input.LT(1).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "identifier", " !symbols.isType(input.LT(1).getText()) ");
            }

            RAW_IDENTIFIER350=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier6602); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAW_IDENTIFIER350_tree = 
            (Object)adaptor.create(RAW_IDENTIFIER350)
            ;
            adaptor.addChild(root_0, RAW_IDENTIFIER350_tree);
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
        }
        return retval;
    }
    // $ANTLR end "identifier"

    // $ANTLR start synpred1_Mininess
    public final void synpred1_Mininess_fragment() throws RecognitionException {
        // Mininess.g:286:10: ( SIZEOF '(' type_name ')' )
        // Mininess.g:286:11: SIZEOF '(' type_name ')'
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred1_Mininess2634); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred1_Mininess2636); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred1_Mininess2638);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred1_Mininess2640); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Mininess

    // $ANTLR start synpred2_Mininess
    public final void synpred2_Mininess_fragment() throws RecognitionException {
        // Mininess.g:295:10: ( '(' type_name ')' )
        // Mininess.g:295:11: '(' type_name ')'
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred2_Mininess2716); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred2_Mininess2718);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred2_Mininess2720); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Mininess

    // $ANTLR start synpred3_Mininess
    public final void synpred3_Mininess_fragment() throws RecognitionException {
        // Mininess.g:336:10: ( unary_expression assignment_operator )
        // Mininess.g:336:11: unary_expression assignment_operator
        {
        pushFollow(FOLLOW_unary_expression_in_synpred3_Mininess3168);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_assignment_operator_in_synpred3_Mininess3170);
        assignment_operator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Mininess

    // $ANTLR start synpred4_Mininess
    public final void synpred4_Mininess_fragment() throws RecognitionException {
        // Mininess.g:345:33: ( ',' assignment_expression )
        // Mininess.g:345:34: ',' assignment_expression
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred4_Mininess3297); if (state.failed) return ;

        pushFollow(FOLLOW_assignment_expression_in_synpred4_Mininess3299);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Mininess

    // $ANTLR start synpred5_Mininess
    public final void synpred5_Mininess_fragment() throws RecognitionException {
        // Mininess.g:369:10: ( declaration_specifiers ( init_declarator_list )? ';' )
        // Mininess.g:369:11: declaration_specifiers ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred5_Mininess3371);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // Mininess.g:369:34: ( init_declarator_list )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==LPARENS||LA99_0==RAW_IDENTIFIER||LA99_0==STAR) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // Mininess.g:369:34: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred5_Mininess3373);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,150,FOLLOW_150_in_synpred5_Mininess3376); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Mininess

    // $ANTLR start synpred6_Mininess
    public final void synpred6_Mininess_fragment() throws RecognitionException {
        // Mininess.g:570:9: ( '[' ( constant_expression )? ']' )
        // Mininess.g:570:10: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred6_Mininess4716); if (state.failed) return ;

        // Mininess.g:570:14: ( constant_expression )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==AMP||LA100_0==BITCOMPLEMENT||LA100_0==CALL||LA100_0==CHARACTER_LITERAL||LA100_0==CONSTANT||LA100_0==LPARENS||LA100_0==MINUS||LA100_0==MINUSMINUS||LA100_0==NOT||LA100_0==PLUS||LA100_0==PLUSPLUS||LA100_0==POST||LA100_0==RAW_IDENTIFIER||LA100_0==SIZEOF||LA100_0==STAR||LA100_0==STRING_LITERAL) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // Mininess.g:570:14: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred6_Mininess4718);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred6_Mininess4721); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Mininess

    // $ANTLR start synpred7_Mininess
    public final void synpred7_Mininess_fragment() throws RecognitionException {
        // Mininess.g:607:10: ( declarator )
        // Mininess.g:607:11: declarator
        {
        pushFollow(FOLLOW_declarator_in_synpred7_Mininess5027);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Mininess

    // $ANTLR start synpred8_Mininess
    public final void synpred8_Mininess_fragment() throws RecognitionException {
        // Mininess.g:617:10: ( ( pointer )? direct_abstract_declarator )
        // Mininess.g:617:11: ( pointer )? direct_abstract_declarator
        {
        // Mininess.g:617:11: ( pointer )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==STAR) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // Mininess.g:617:11: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred8_Mininess5116);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred8_Mininess5119);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Mininess

    // $ANTLR start synpred9_Mininess
    public final void synpred9_Mininess_fragment() throws RecognitionException {
        // Mininess.g:621:10: ( '(' abstract_declarator ')' )
        // Mininess.g:621:11: '(' abstract_declarator ')'
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred9_Mininess5158); if (state.failed) return ;

        pushFollow(FOLLOW_abstract_declarator_in_synpred9_Mininess5160);
        abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred9_Mininess5162); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Mininess

    // $ANTLR start synpred10_Mininess
    public final void synpred10_Mininess_fragment() throws RecognitionException {
        // Mininess.g:701:10: ( IF '(' expression ')' statement ELSE statement )
        // Mininess.g:701:11: IF '(' expression ')' statement ELSE statement
        {
        match(input,IF,FOLLOW_IF_in_synpred10_Mininess5656); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred10_Mininess5658); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred10_Mininess5660);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred10_Mininess5662); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred10_Mininess5664);
        statement();

        state._fsp--;
        if (state.failed) return ;

        match(input,ELSE,FOLLOW_ELSE_in_synpred10_Mininess5666); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred10_Mininess5668);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Mininess

    // Delegated rules

    public final boolean synpred4_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA60_eotS =
        "\5\uffff";
    static final String DFA60_eofS =
        "\5\uffff";
    static final String DFA60_minS =
        "\1\u0084\2\27\2\uffff";
    static final String DFA60_maxS =
        "\3\u0084\2\uffff";
    static final String DFA60_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA60_specialS =
        "\5\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1",
            "\1\4\4\uffff\1\2\52\uffff\1\4\4\uffff\1\4\52\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\10\uffff\1\3",
            "\1\4\4\uffff\1\2\52\uffff\1\4\4\uffff\1\4\52\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\10\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "579:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_identifier_in_primary_expression2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_primary_expression2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_primary_expression2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_primary_expression2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_primary_expression2214 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_expression_in_primary_expression2216 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_primary_expression2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_kind_in_postfix_expression2243 = new BitSet(new long[]{0x0000000020400000L,0x0080000000001000L,0x0000000000000040L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression2246 = new BitSet(new long[]{0x0000020000000402L,0x0000400000021080L});
    public static final BitSet FOLLOW_postfix_expression_modifier_in_postfix_expression2248 = new BitSet(new long[]{0x0000020000000402L,0x0000400000021080L});
    public static final BitSet FOLLOW_LBRACKET_in_postfix_expression_modifier2289 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_expression_in_postfix_expression_modifier2291 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_postfix_expression_modifier2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression_modifier2311 = new BitSet(new long[]{0x0000000020442020L,0x0881500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression_modifier2313 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression_modifier2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression_modifier2335 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_postfix_expression_modifier2355 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_postfix_expression_modifier2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_postfix_expression_modifier2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list2437 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list2440 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list2443 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unary_expression2464 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_unary_expression2485 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_unary_expression2506 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression2533 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression2559 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression2586 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITCOMPLEMENT_in_unary_expression2613 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_NOT_in_unary_expression2618 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression2645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPARENS_in_unary_expression2647 = new BitSet(new long[]{0x0000900010200000L,0xC08001FFF000081EL,0x0000000000053880L});
    public static final BitSet FOLLOW_type_name_in_unary_expression2649 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_unary_expression2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression2670 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_cast_expression2735 = new BitSet(new long[]{0x0000900010200000L,0xC08001FFF000081EL,0x0000000000053880L});
    public static final BitSet FOLLOW_type_name_in_cast_expression2737 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_cast_expression2739 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_arrayinc_expression2777 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ARRAYINC_in_arrayinc_expression2781 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_cast_expression_in_arrayinc_expression2784 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_arrayinc_expression_in_multiplicative_expression2805 = new BitSet(new long[]{0x0000010000000002L,0x0000000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression2810 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expression2815 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_MODULUS_in_multiplicative_expression2820 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_arrayinc_expression_in_multiplicative_expression2824 = new BitSet(new long[]{0x0000010000000002L,0x0000000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2845 = new BitSet(new long[]{0x0000000000000002L,0x0000100000008000L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression2850 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression2855 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2859 = new BitSet(new long[]{0x0000000000000002L,0x0000100000008000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression2880 = new BitSet(new long[]{0x0000000000000002L,0x1000000000002000L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression2885 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression2890 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression2894 = new BitSet(new long[]{0x0000000000000002L,0x1000000000002000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression2915 = new BitSet(new long[]{0x0180000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_LESS_in_relational_expression2920 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression2925 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_LESSEQUAL_in_relational_expression2930 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_relational_expression2935 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression2939 = new BitSet(new long[]{0x0180000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression2960 = new BitSet(new long[]{0x0000400000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_EQUAL_in_equality_expression2965 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equality_expression2970 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression2974 = new BitSet(new long[]{0x0000400000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression2995 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AMP_in_and_expression2999 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression3002 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3023 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_BITXOR_in_xor_expression3027 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression3030 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3051 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_BITOR_in_or_expression3055 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression3058 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3079 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression3083 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression3086 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3107 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression3111 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression3114 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression3135 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_conditional_expression3138 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_expression_in_conditional_expression3141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_conditional_expression3143 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_assignment_expression3185 = new BitSet(new long[]{0x0000008000029800L,0x2000200000254000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression3187 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3293 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_expression3304 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3307 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3411 = new BitSet(new long[]{0x0000000000000000L,0x0080000000001000L,0x0000000000400010L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_declaration3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration3541 = new BitSet(new long[]{0x0001900011200000L,0xC08001FFF000081EL,0x0000000000053A80L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3543 = new BitSet(new long[]{0x0000000000000000L,0x0080000000001000L,0x0000000000000010L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_declaration3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_c_style_declaration_specifier_in_declaration_specifiers3612 = new BitSet(new long[]{0x0001900011200002L,0xC08001FFF000081EL,0x0000000000053A80L});
    public static final BitSet FOLLOW_storage_class_specifier_in_c_style_declaration_specifier3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_c_style_declaration_specifier3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_c_style_declaration_specifier3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list3671 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list3674 = new BitSet(new long[]{0x0000000000000000L,0x0080000000001000L,0x0000000000000010L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list3676 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator3710 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator3713 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429040L,0x0000000000000051L});
    public static final BitSet FOLLOW_initializer_in_init_declarator3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT8_T_in_type_specifier3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT16_T_in_type_specifier3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_INT32_T_in_type_specifier3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT8_T_in_type_specifier3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT16_T_in_type_specifier3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_INT32_T_in_type_specifier4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT8_T_in_type_specifier4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT16_T_in_type_specifier4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NXLE_UINT32_T_in_type_specifier4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ERROR_T_in_type_specifier4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4096 = new BitSet(new long[]{0x0200900010200000L,0xC18001FFF000081EL,0x0000000000053880L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4098 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier4134 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_struct_or_union_specifier4136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier4139 = new BitSet(new long[]{0x0200900010200000L,0xC18001FFF000081EL,0x0000000000053880L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier4141 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_mini_in_struct_declaration_list4221 = new BitSet(new long[]{0x0200900010200002L,0xC08001FFF000081EL,0x0000000000053880L});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list4225 = new BitSet(new long[]{0x0200900010200002L,0xC08001FFF000081EL,0x0000000000053880L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration4257 = new BitSet(new long[]{0x0000000000000000L,0x0080000000001000L,0x0000000000200010L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration4259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_struct_declaration4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list4308 = new BitSet(new long[]{0x0000900010200002L,0xC08001FFF000081EL,0x0000000000053880L});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list4312 = new BitSet(new long[]{0x0000900010200002L,0xC08001FFF000081EL,0x0000000000053880L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list4338 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list4341 = new BitSet(new long[]{0x0000000000000000L,0x0080000000001000L,0x0000000000200010L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list4343 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator4373 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_struct_declarator4376 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_struct_declarator4391 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier4412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier4414 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier4416 = new BitSet(new long[]{0x0000000000800000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier4418 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier4453 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier4455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier4458 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier4460 = new BitSet(new long[]{0x0000000000800000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier4462 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list4506 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list4509 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list4512 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_identifier_in_enumerator4537 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator4540 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_type_qualifier4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator4593 = new BitSet(new long[]{0x0000000000000000L,0x0080000000001000L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator4621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator4623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier4649 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier4652 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier4689 = new BitSet(new long[]{0x0000000000000000L,0x0080000000001000L,0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier4691 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier4726 = new BitSet(new long[]{0x0000000020442020L,0x0281500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier4728 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier4763 = new BitSet(new long[]{0x0001900011200000L,0xC28001FFF000081EL,0x0000000000053A80L});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier4767 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier4769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier4773 = new BitSet(new long[]{0x0001900011200000L,0xC88001FFF000081EL,0x0000000000053A80L});
    public static final BitSet FOLLOW_parameter_list_in_direct_declarator_modifier4777 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer4819 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer4821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_pointer_in_pointer4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer4846 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list4877 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list4902 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list4905 = new BitSet(new long[]{0x0001900011200000L,0xC08001FFF000081EL,0x0000000000053A80L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list4907 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list4912 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ELLIPSIS_in_parameter_list4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration4984 = new BitSet(new long[]{0x0000000000000002L,0x0080000000001080L,0x0000000000000010L});
    public static final BitSet FOLLOW_parameter_declarator_in_parameter_declaration4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_parameter_declarator5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declarator5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5062 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_identifier_list5065 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list5067 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name5093 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L,0x0000000000000010L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001080L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator5178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001080L,0x0000000000000010L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator5180 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator5182 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
    public static final BitSet FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator5184 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
    public static final BitSet FOLLOW_direct_abstract_declarator_modifier_in_direct_abstract_declarator5196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator_modifier5212 = new BitSet(new long[]{0x0000000020442020L,0x0281500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator_modifier5214 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator_modifier5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator_modifier5228 = new BitSet(new long[]{0x0001900011200000L,0xC88001FFF000081EL,0x0000000000053A80L});
    public static final BitSet FOLLOW_parameter_list_in_direct_abstract_declarator_modifier5230 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator_modifier5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer5294 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429040L,0x0000000000000051L});
    public static final BitSet FOLLOW_initializer_list_in_initializer5296 = new BitSet(new long[]{0x0000000000800000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COMMA_in_initializer5298 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list5331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_initializer_list5333 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429040L,0x0000000000000051L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5337 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list5340 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429040L,0x0000000000000051L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_initializer_list5343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_initializer_list5345 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429040L,0x0000000000000051L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5349 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_mini_in_statement5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement5492 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement5494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_labeled_statement5496 = new BitSet(new long[]{0x22040010204C2020L,0x0481500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_statement_in_labeled_statement5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement5519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_labeled_statement5521 = new BitSet(new long[]{0x22040010204C2020L,0x0481500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_statement_in_labeled_statement5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement5549 = new BitSet(new long[]{0x22059010316C2020L,0xC58151FFF042985EL,0x00000000004D3FD1L});
    public static final BitSet FOLLOW_declaration_in_compound_statement5562 = new BitSet(new long[]{0x22059010316C2020L,0xC58151FFF042985EL,0x00000000004D3FD1L});
    public static final BitSet FOLLOW_statement_in_compound_statement5565 = new BitSet(new long[]{0x22040010204C2020L,0x0581500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement5618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_expression_statement5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement5683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement5685 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_expression_in_selection_statement5687 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement5689 = new BitSet(new long[]{0x22040010204C2020L,0x0481500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_statement_in_selection_statement5693 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement5695 = new BitSet(new long[]{0x22040010204C2020L,0x0481500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_statement_in_selection_statement5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement5737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement5739 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_expression_in_selection_statement5741 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement5743 = new BitSet(new long[]{0x22040010204C2020L,0x0481500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_statement_in_selection_statement5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement5779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement5781 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_expression_in_selection_statement5783 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement5785 = new BitSet(new long[]{0x22040010204C2020L,0x0481500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_statement_in_selection_statement5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement5833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement5835 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5837 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement5839 = new BitSet(new long[]{0x22040010204C2020L,0x0481500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_statement_in_iteration_statement5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement5862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement5864 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000400051L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_iteration_statement5871 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000400051L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_iteration_statement5878 = new BitSet(new long[]{0x0000000020442020L,0x0881500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5882 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement5885 = new BitSet(new long[]{0x22040010204C2020L,0x0481500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_statement_in_iteration_statement5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement5994 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000400051L});
    public static final BitSet FOLLOW_expression_in_jump_statement5996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_jump_statement5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_translation_unit6035 = new BitSet(new long[]{0x0201900011200002L,0xC08001FFF000081EL,0x0000000000053E80L});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit6039 = new BitSet(new long[]{0x0201900011200002L,0xC08001FFF000081EL,0x0000000000053E80L});
    public static final BitSet FOLLOW_declaration_in_external_declaration6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive6089 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive6091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive6093 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive6095 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive_mini6119 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive_mini6121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive_mini6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition6153 = new BitSet(new long[]{0x0000000000000000L,0x0080000000001000L,0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_function_definition6155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_mininess_file6203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_large_scale_construct_in_mininess_file6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_component_in_large_scale_construct6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_component6259 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_component6261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_component_specification_in_component6263 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_implementation_in_component6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_implementation6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_module_implementation6322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_module_implementation6324 = new BitSet(new long[]{0x0201900011200000L,0xC08001FFF000081EL,0x0000000000053E80L});
    public static final BitSet FOLLOW_translation_unit_in_module_implementation6356 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_module_implementation6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification6451 = new BitSet(new long[]{0x0200000000000000L,0x0140000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_uses_provides_in_component_specification6466 = new BitSet(new long[]{0x0200000000000000L,0x0140000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_line_directive_in_component_specification6470 = new BitSet(new long[]{0x0200000000000000L,0x0140000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACE_in_component_specification6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides6498 = new BitSet(new long[]{0x0001900011200000L,0xC08001FFF000085EL,0x0000000000053E80L});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides6519 = new BitSet(new long[]{0x0001900011200000L,0xC08001FFF000085EL,0x0000000000053E80L});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list6559 = new BitSet(new long[]{0x0001900011200000L,0xC08001FFF000081EL,0x0000000000053E80L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list6561 = new BitSet(new long[]{0x0001900011200000L,0xC18001FFF000081EL,0x0000000000053E80L});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier6602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred1_Mininess2634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred1_Mininess2636 = new BitSet(new long[]{0x0000900010200000L,0xC08001FFF000081EL,0x0000000000053880L});
    public static final BitSet FOLLOW_type_name_in_synpred1_Mininess2638 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred1_Mininess2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred2_Mininess2716 = new BitSet(new long[]{0x0000900010200000L,0xC08001FFF000081EL,0x0000000000053880L});
    public static final BitSet FOLLOW_type_name_in_synpred2_Mininess2718 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred2_Mininess2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_synpred3_Mininess3168 = new BitSet(new long[]{0x0000008000029800L,0x2000200000254000L});
    public static final BitSet FOLLOW_assignment_operator_in_synpred3_Mininess3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred4_Mininess3297 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred4_Mininess3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred5_Mininess3371 = new BitSet(new long[]{0x0000000000000000L,0x0080000000001000L,0x0000000000400010L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred5_Mininess3373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_synpred5_Mininess3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred6_Mininess4716 = new BitSet(new long[]{0x0000000020442020L,0x0281500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_constant_expression_in_synpred6_Mininess4718 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred6_Mininess4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred7_Mininess5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred8_Mininess5116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001080L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred8_Mininess5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred9_Mininess5158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001080L,0x0000000000000010L});
    public static final BitSet FOLLOW_abstract_declarator_in_synpred9_Mininess5160 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred9_Mininess5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred10_Mininess5656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LPARENS_in_synpred10_Mininess5658 = new BitSet(new long[]{0x0000000020442020L,0x0081500000429000L,0x0000000000000051L});
    public static final BitSet FOLLOW_expression_in_synpred10_Mininess5660 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred10_Mininess5662 = new BitSet(new long[]{0x22040010204C2020L,0x0481500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_statement_in_synpred10_Mininess5664 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred10_Mininess5666 = new BitSet(new long[]{0x22040010204C2020L,0x0481500000429040L,0x0000000000480151L});
    public static final BitSet FOLLOW_statement_in_synpred10_Mininess5668 = new BitSet(new long[]{0x0000000000000002L});

}