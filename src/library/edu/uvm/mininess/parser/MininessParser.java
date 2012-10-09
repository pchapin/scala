// $ANTLR 3.4 Mininess.g 2012-10-09 14:50:56

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDRESS_OF", "AMP", "AND", "ARGUMENT_LIST", "ARRAYINC", "ARRAY_ELEMENT_SELECTION", "ARROW", "ASSIGN", "BITANDASSIGN", "BITCOMPLEMENT", "BITOR", "BITORASSIGN", "BITXOR", "BITXORASSIGN", "CALL", "CASE", "CAST", "CHAR", "CHARACTER_LITERAL", "COMMA", "COMMAND", "COMMENT1", "COMMENT2", "COMPOUND_STATEMENT", "CONST", "CONSTANT", "DECLARATION", "DECLARATOR", "DECLARATOR_ARRAY_MODIFIER", "DECLARATOR_LIST", "DECLARATOR_PARAMETER_LIST_MODIFIER", "DEC_NUMBER", "DEFAULT", "DEREFERENCE", "DIGIT", "DIVASSIGN", "DIVIDE", "DOT", "ELSE", "ENUM", "ENUMERATOR", "EQUAL", "EVENT", "FILE", "FOR", "FOR_CONDITION", "FOR_INITIALIZE", "FOR_ITERATION", "FUNCTION_DEFINITION", "GREATER", "GREATEREQUAL", "HASH", "HEX_DIGIT", "HEX_NUMBER", "IDENTIFIER_PATH", "IF", "IMPLEMENTATION", "INITIALIZER_LIST", "INIT_DECLARATOR", "INT", "INT16_T", "INT32_T", "INT8_T", "INTERFACE", "LBRACE", "LBRACKET", "LESS", "LESSEQUAL", "LINE_DIRECTIVE", "LONG", "LPARENS", "LSHIFT", "LSHIFTASSIGN", "MINUS", "MINUSASSIGN", "MINUSMINUS", "MODASSIGN", "MODULE", "MODULUS", "MULASSIGN", "NOT", "NOTEQUAL", "NULL", "NUMBER", "NUMBER_PREFIX", "NUMBER_SUFFIX", "NX_STRUCT", "NX_UINT16_T", "NX_UINT32_T", "NX_UINT8_T", "OR", "PARAMETER", "PARAMETER_LIST", "PLUS", "PLUSASSIGN", "PLUSPLUS", "POINTER_QUALIFIER", "POST", "POSTFIX_EXPRESSION", "POST_DECREMENT", "POST_INCREMENT", "PRE_DECREMENT", "PRE_INCREMENT", "PROVIDES", "RAW_IDENTIFIER", "RBRACE", "RBRACKET", "RETURN", "RPARENS", "RSHIFT", "RSHIFTASSIGN", "SHORT", "SIGNED", "SIZEOF", "SIZEOF_EXPRESSION", "SIZEOF_TYPE", "SPECIFICATION", "STAR", "STATEMENT", "STRING_LITERAL", "STRUCT", "SWITCH", "TASK", "TYPEDEF", "UINT16_T", "UINT32_T", "UINT8_T", "UNARY_MINUS", "UNARY_PLUS", "UNSIGNED", "USES", "VOID", "WHILE", "WHITESPACE", "'...'", "':'", "';'", "'?'"
    };

    public static final int EOF=-1;
    public static final int T__138=138;
    public static final int T__139=139;
    public static final int T__140=140;
    public static final int T__141=141;
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
    public static final int ELSE=42;
    public static final int ENUM=43;
    public static final int ENUMERATOR=44;
    public static final int EQUAL=45;
    public static final int EVENT=46;
    public static final int FILE=47;
    public static final int FOR=48;
    public static final int FOR_CONDITION=49;
    public static final int FOR_INITIALIZE=50;
    public static final int FOR_ITERATION=51;
    public static final int FUNCTION_DEFINITION=52;
    public static final int GREATER=53;
    public static final int GREATEREQUAL=54;
    public static final int HASH=55;
    public static final int HEX_DIGIT=56;
    public static final int HEX_NUMBER=57;
    public static final int IDENTIFIER_PATH=58;
    public static final int IF=59;
    public static final int IMPLEMENTATION=60;
    public static final int INITIALIZER_LIST=61;
    public static final int INIT_DECLARATOR=62;
    public static final int INT=63;
    public static final int INT16_T=64;
    public static final int INT32_T=65;
    public static final int INT8_T=66;
    public static final int INTERFACE=67;
    public static final int LBRACE=68;
    public static final int LBRACKET=69;
    public static final int LESS=70;
    public static final int LESSEQUAL=71;
    public static final int LINE_DIRECTIVE=72;
    public static final int LONG=73;
    public static final int LPARENS=74;
    public static final int LSHIFT=75;
    public static final int LSHIFTASSIGN=76;
    public static final int MINUS=77;
    public static final int MINUSASSIGN=78;
    public static final int MINUSMINUS=79;
    public static final int MODASSIGN=80;
    public static final int MODULE=81;
    public static final int MODULUS=82;
    public static final int MULASSIGN=83;
    public static final int NOT=84;
    public static final int NOTEQUAL=85;
    public static final int NULL=86;
    public static final int NUMBER=87;
    public static final int NUMBER_PREFIX=88;
    public static final int NUMBER_SUFFIX=89;
    public static final int NX_STRUCT=90;
    public static final int NX_UINT16_T=91;
    public static final int NX_UINT32_T=92;
    public static final int NX_UINT8_T=93;
    public static final int OR=94;
    public static final int PARAMETER=95;
    public static final int PARAMETER_LIST=96;
    public static final int PLUS=97;
    public static final int PLUSASSIGN=98;
    public static final int PLUSPLUS=99;
    public static final int POINTER_QUALIFIER=100;
    public static final int POST=101;
    public static final int POSTFIX_EXPRESSION=102;
    public static final int POST_DECREMENT=103;
    public static final int POST_INCREMENT=104;
    public static final int PRE_DECREMENT=105;
    public static final int PRE_INCREMENT=106;
    public static final int PROVIDES=107;
    public static final int RAW_IDENTIFIER=108;
    public static final int RBRACE=109;
    public static final int RBRACKET=110;
    public static final int RETURN=111;
    public static final int RPARENS=112;
    public static final int RSHIFT=113;
    public static final int RSHIFTASSIGN=114;
    public static final int SHORT=115;
    public static final int SIGNED=116;
    public static final int SIZEOF=117;
    public static final int SIZEOF_EXPRESSION=118;
    public static final int SIZEOF_TYPE=119;
    public static final int SPECIFICATION=120;
    public static final int STAR=121;
    public static final int STATEMENT=122;
    public static final int STRING_LITERAL=123;
    public static final int STRUCT=124;
    public static final int SWITCH=125;
    public static final int TASK=126;
    public static final int TYPEDEF=127;
    public static final int UINT16_T=128;
    public static final int UINT32_T=129;
    public static final int UINT8_T=130;
    public static final int UNARY_MINUS=131;
    public static final int UNARY_PLUS=132;
    public static final int UNSIGNED=133;
    public static final int USES=134;
    public static final int VOID=135;
    public static final int WHILE=136;
    public static final int WHITESPACE=137;

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
        this.state.ruleMemo = new HashMap[239+1];
         

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

        // Provide more detailed error messages for debugging. This is from Definitive ANTLR.
        public String getErrorMessage(RecognitionException e, String[] tokenNames)
        {
            List stack = getRuleInvocationStack(e, this.getClass().getName());
            String msg = null;
            if ( e instanceof NoViableAltException ) {
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

        public String getTokenErrorDisplay(Token t)
        {
            return t.toString();
        }

    //     // The following two magic methods, together with the @rulecatch section below cause the
    //     // parser to exit immediately with an exception when an error is encountered.
    //     //
    //     protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
    //         throws RecognitionException
    //     {
    //         throw new MismatchedTokenException(ttype, input);
    //     }
    //    
    //     public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
    //         throws RecognitionException
    //     {
    //         throw e;
    //     }


    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expression"
    // Mininess.g:216:1: primary_expression : ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression );
    public final MininessParser.primary_expression_return primary_expression() throws RecognitionException {
        MininessParser.primary_expression_return retval = new MininessParser.primary_expression_return();
        retval.start = input.LT(1);

        int primary_expression_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // Mininess.g:217:5: ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression )
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
                    // Mininess.g:217:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression1964);
                    identifier1=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier1.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:218:10: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT2=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_primary_expression1975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT2_tree = 
                    (Object)adaptor.create(CONSTANT2)
                    ;
                    adaptor.addChild(root_0, CONSTANT2_tree);
                    }

                    }
                    break;
                case 3 :
                    // Mininess.g:219:10: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primary_expression1986); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL3_tree = 
                    (Object)adaptor.create(STRING_LITERAL3)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL3_tree);
                    }

                    }
                    break;
                case 4 :
                    // Mininess.g:220:10: CHARACTER_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARACTER_LITERAL4=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_primary_expression1997); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARACTER_LITERAL4_tree = 
                    (Object)adaptor.create(CHARACTER_LITERAL4)
                    ;
                    adaptor.addChild(root_0, CHARACTER_LITERAL4_tree);
                    }

                    }
                    break;
                case 5 :
                    // Mininess.g:221:10: '(' expression ')'
                    {
                    char_literal5=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_primary_expression2008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_primary_expression2010);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

                    char_literal7=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_primary_expression2012); if (state.failed) return retval; 
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
                    // 221:29: -> expression
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
    // Mininess.g:229:1: postfix_expression : ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) ;
    public final MininessParser.postfix_expression_return postfix_expression() throws RecognitionException {
        MininessParser.postfix_expression_return retval = new MininessParser.postfix_expression_return();
        retval.start = input.LT(1);

        int postfix_expression_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.call_kind_return call_kind8 =null;

        MininessParser.primary_expression_return primary_expression9 =null;

        MininessParser.postfix_expression_modifier_return postfix_expression_modifier10 =null;


        RewriteRuleSubtreeStream stream_call_kind=new RewriteRuleSubtreeStream(adaptor,"rule call_kind");
        RewriteRuleSubtreeStream stream_postfix_expression_modifier=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression_modifier");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // Mininess.g:230:5: ( ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) )
            // Mininess.g:230:10: ( call_kind )? primary_expression ( postfix_expression_modifier )*
            {
            // Mininess.g:230:10: ( call_kind )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CALL||LA2_0==POST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Mininess.g:230:10: call_kind
                    {
                    pushFollow(FOLLOW_call_kind_in_postfix_expression2037);
                    call_kind8=call_kind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_call_kind.add(call_kind8.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_primary_expression_in_postfix_expression2040);
            primary_expression9=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression9.getTree());

            // Mininess.g:230:40: ( postfix_expression_modifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARROW||LA3_0==DOT||LA3_0==LBRACKET||LA3_0==LPARENS||LA3_0==MINUSMINUS||LA3_0==PLUSPLUS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Mininess.g:230:40: postfix_expression_modifier
            	    {
            	    pushFollow(FOLLOW_postfix_expression_modifier_in_postfix_expression2042);
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
            // elements: primary_expression, call_kind, postfix_expression_modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 231:13: -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
            {
                // Mininess.g:231:16: ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION")
                , root_1);

                // Mininess.g:231:37: ( call_kind )?
                if ( stream_call_kind.hasNext() ) {
                    adaptor.addChild(root_1, stream_call_kind.nextTree());

                }
                stream_call_kind.reset();

                adaptor.addChild(root_1, stream_primary_expression.nextTree());

                // Mininess.g:231:67: ( postfix_expression_modifier )*
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
    // Mininess.g:233:1: postfix_expression_modifier : ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' );
    public final MininessParser.postfix_expression_modifier_return postfix_expression_modifier() throws RecognitionException {
        MininessParser.postfix_expression_modifier_return retval = new MininessParser.postfix_expression_modifier_return();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // Mininess.g:234:5: ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' )
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
                    // Mininess.g:234:9: '[' expression ']'
                    {
                    char_literal11=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_postfix_expression_modifier2083); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal11);


                    pushFollow(FOLLOW_expression_in_postfix_expression_modifier2085);
                    expression12=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression12.getTree());

                    char_literal13=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_postfix_expression_modifier2087); if (state.failed) return retval; 
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
                    // 234:28: -> ^( ARRAY_ELEMENT_SELECTION expression )
                    {
                        // Mininess.g:234:31: ^( ARRAY_ELEMENT_SELECTION expression )
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
                    // Mininess.g:235:9: '(' ( argument_expression_list )? ')'
                    {
                    char_literal14=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression_modifier2105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal14);


                    // Mininess.g:235:13: ( argument_expression_list )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AMP||LA4_0==BITCOMPLEMENT||LA4_0==CALL||LA4_0==CHARACTER_LITERAL||LA4_0==CONSTANT||LA4_0==LPARENS||LA4_0==MINUS||LA4_0==MINUSMINUS||LA4_0==NOT||LA4_0==PLUS||LA4_0==PLUSPLUS||LA4_0==POST||LA4_0==RAW_IDENTIFIER||LA4_0==SIZEOF||LA4_0==STAR||LA4_0==STRING_LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Mininess.g:235:13: argument_expression_list
                            {
                            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression_modifier2107);
                            argument_expression_list15=argument_expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list15.getTree());

                            }
                            break;

                    }


                    char_literal16=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression_modifier2110); if (state.failed) return retval; 
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
                    // 235:43: -> ^( ARGUMENT_LIST ( argument_expression_list )? )
                    {
                        // Mininess.g:235:46: ^( ARGUMENT_LIST ( argument_expression_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST")
                        , root_1);

                        // Mininess.g:235:62: ( argument_expression_list )?
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
                    // Mininess.g:236:9: '.' identifier
                    {
                    char_literal17=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression_modifier2129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal17);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2131);
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
                    // 236:24: -> ^( '.' identifier )
                    {
                        // Mininess.g:236:27: ^( '.' identifier )
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
                    // Mininess.g:237:9: '->' identifier
                    {
                    string_literal19=(Token)match(input,ARROW,FOLLOW_ARROW_in_postfix_expression_modifier2149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal19);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2151);
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
                    // 237:25: -> ^( '->' identifier )
                    {
                        // Mininess.g:237:28: ^( '->' identifier )
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
                    // Mininess.g:238:9: '++'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal21=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfix_expression_modifier2169); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = 
                    (Object)adaptor.create(string_literal21)
                    ;
                    adaptor.addChild(root_0, string_literal21_tree);
                    }

                    }
                    break;
                case 6 :
                    // Mininess.g:239:9: '--'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal22=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfix_expression_modifier2179); if (state.failed) return retval;
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
    // Mininess.g:241:1: call_kind : ( CALL | POST );
    public final MininessParser.call_kind_return call_kind() throws RecognitionException {
        MininessParser.call_kind_return retval = new MininessParser.call_kind_return();
        retval.start = input.LT(1);

        int call_kind_StartIndex = input.index();

        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // Mininess.g:242:5: ( CALL | POST )
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
    // Mininess.g:245:1: argument_expression_list : assignment_expression ( ',' ! assignment_expression )* ;
    public final MininessParser.argument_expression_list_return argument_expression_list() throws RecognitionException {
        MininessParser.argument_expression_list_return retval = new MininessParser.argument_expression_list_return();
        retval.start = input.LT(1);

        int argument_expression_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal25=null;
        MininessParser.assignment_expression_return assignment_expression24 =null;

        MininessParser.assignment_expression_return assignment_expression26 =null;


        Object char_literal25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // Mininess.g:246:5: ( assignment_expression ( ',' ! assignment_expression )* )
            // Mininess.g:246:10: assignment_expression ( ',' ! assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list2228);
            assignment_expression24=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression24.getTree());

            // Mininess.g:246:32: ( ',' ! assignment_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Mininess.g:246:33: ',' ! assignment_expression
            	    {
            	    char_literal25=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list2231); if (state.failed) return retval;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list2234);
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
    // Mininess.g:248:1: unary_expression : ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression );
    public final MininessParser.unary_expression_return unary_expression() throws RecognitionException {
        MininessParser.unary_expression_return retval = new MininessParser.unary_expression_return();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // Mininess.g:249:5: ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression )
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

                if ( (synpred23_Mininess()) ) {
                    alt8=8;
                }
                else if ( (synpred24_Mininess()) ) {
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
                    // Mininess.g:249:10: '++' unary_expression
                    {
                    string_literal27=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unary_expression2255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(string_literal27);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2257);
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
                    // 249:32: -> ^( PRE_INCREMENT unary_expression )
                    {
                        // Mininess.g:249:35: ^( PRE_INCREMENT unary_expression )
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
                    // Mininess.g:250:10: '--' unary_expression
                    {
                    string_literal29=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unary_expression2276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUSMINUS.add(string_literal29);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2278);
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
                    // 250:32: -> ^( PRE_DECREMENT unary_expression )
                    {
                        // Mininess.g:250:35: ^( PRE_DECREMENT unary_expression )
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
                    // Mininess.g:251:10: '&' cast_expression
                    {
                    char_literal31=(Token)match(input,AMP,FOLLOW_AMP_in_unary_expression2297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMP.add(char_literal31);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2300);
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
                    // 251:32: -> ^( ADDRESS_OF cast_expression )
                    {
                        // Mininess.g:251:35: ^( ADDRESS_OF cast_expression )
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
                    // Mininess.g:252:10: '*' cast_expression
                    {
                    char_literal33=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression2324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal33);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2327);
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
                    // 252:32: -> ^( DEREFERENCE cast_expression )
                    {
                        // Mininess.g:252:35: ^( DEREFERENCE cast_expression )
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
                    // Mininess.g:253:10: '+' cast_expression
                    {
                    char_literal35=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression2350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal35);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2353);
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
                    // 253:32: -> ^( UNARY_PLUS cast_expression )
                    {
                        // Mininess.g:253:35: ^( UNARY_PLUS cast_expression )
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
                    // Mininess.g:254:10: '-' cast_expression
                    {
                    char_literal37=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression2377); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal37);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2380);
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
                    // 254:32: -> ^( UNARY_MINUS cast_expression )
                    {
                        // Mininess.g:254:35: ^( UNARY_MINUS cast_expression )
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
                    // Mininess.g:255:10: ( '~' ^| '!' ^) cast_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // Mininess.g:255:10: ( '~' ^| '!' ^)
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
                            // Mininess.g:255:11: '~' ^
                            {
                            char_literal39=(Token)match(input,BITCOMPLEMENT,FOLLOW_BITCOMPLEMENT_in_unary_expression2404); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal39_tree = 
                            (Object)adaptor.create(char_literal39)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal39_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Mininess.g:255:18: '!' ^
                            {
                            char_literal40=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression2409); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal40_tree = 
                            (Object)adaptor.create(char_literal40)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal40_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2413);
                    cast_expression41=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression41.getTree());

                    }
                    break;
                case 8 :
                    // Mininess.g:256:10: SIZEOF '(' type_name ')'
                    {
                    SIZEOF42=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression2424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF42);


                    char_literal43=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_unary_expression2426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal43);


                    pushFollow(FOLLOW_type_name_in_unary_expression2428);
                    type_name44=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name44.getTree());

                    char_literal45=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_unary_expression2430); if (state.failed) return retval; 
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
                    // 256:35: -> ^( SIZEOF_TYPE type_name )
                    {
                        // Mininess.g:256:38: ^( SIZEOF_TYPE type_name )
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
                    // Mininess.g:257:10: SIZEOF unary_expression
                    {
                    SIZEOF46=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression2449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF46);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2451);
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
                    // 257:35: -> ^( SIZEOF_EXPRESSION unary_expression )
                    {
                        // Mininess.g:257:38: ^( SIZEOF_EXPRESSION unary_expression )
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
                    // Mininess.g:258:10: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression2471);
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
    // Mininess.g:264:1: cast_expression : ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression );
    public final MininessParser.cast_expression_return cast_expression() throws RecognitionException {
        MininessParser.cast_expression_return retval = new MininessParser.cast_expression_return();
        retval.start = input.LT(1);

        int cast_expression_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // Mininess.g:265:5: ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LPARENS) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred25_Mininess()) ) {
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
                    // Mininess.g:265:10: '(' type_name ')' cast_expression
                    {
                    char_literal49=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_cast_expression2494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal49);


                    pushFollow(FOLLOW_type_name_in_cast_expression2496);
                    type_name50=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name50.getTree());

                    char_literal51=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_cast_expression2498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal51);


                    pushFollow(FOLLOW_cast_expression_in_cast_expression2500);
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
                    // 265:44: -> ^( CAST cast_expression type_name )
                    {
                        // Mininess.g:265:47: ^( CAST cast_expression type_name )
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
                    // Mininess.g:266:10: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression2521);
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


    public static class arrayinc_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayinc_expression"
    // Mininess.g:268:1: arrayinc_expression : cast_expression ( '|>' ^ cast_expression )* ;
    public final MininessParser.arrayinc_expression_return arrayinc_expression() throws RecognitionException {
        MininessParser.arrayinc_expression_return retval = new MininessParser.arrayinc_expression_return();
        retval.start = input.LT(1);

        int arrayinc_expression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal55=null;
        MininessParser.cast_expression_return cast_expression54 =null;

        MininessParser.cast_expression_return cast_expression56 =null;


        Object string_literal55_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Mininess.g:269:5: ( cast_expression ( '|>' ^ cast_expression )* )
            // Mininess.g:269:10: cast_expression ( '|>' ^ cast_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_arrayinc_expression2536);
            cast_expression54=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression54.getTree());

            // Mininess.g:269:26: ( '|>' ^ cast_expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ARRAYINC) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Mininess.g:269:28: '|>' ^ cast_expression
            	    {
            	    string_literal55=(Token)match(input,ARRAYINC,FOLLOW_ARRAYINC_in_arrayinc_expression2540); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal55_tree = 
            	    (Object)adaptor.create(string_literal55)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal55_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_cast_expression_in_arrayinc_expression2543);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, arrayinc_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayinc_expression"


    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicative_expression"
    // Mininess.g:271:1: multiplicative_expression : arrayinc_expression ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )* ;
    public final MininessParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        MininessParser.multiplicative_expression_return retval = new MininessParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        int multiplicative_expression_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // Mininess.g:272:5: ( arrayinc_expression ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )* )
            // Mininess.g:272:10: arrayinc_expression ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arrayinc_expression_in_multiplicative_expression2564);
            arrayinc_expression57=arrayinc_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayinc_expression57.getTree());

            // Mininess.g:272:30: ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==DIVIDE||LA12_0==MODULUS||LA12_0==STAR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Mininess.g:272:32: ( '*' ^| '/' ^| '%' ^) arrayinc_expression
            	    {
            	    // Mininess.g:272:32: ( '*' ^| '/' ^| '%' ^)
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
            	            // Mininess.g:272:33: '*' ^
            	            {
            	            char_literal58=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression2569); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal58_tree = 
            	            (Object)adaptor.create(char_literal58)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal58_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:272:40: '/' ^
            	            {
            	            char_literal59=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expression2574); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal59_tree = 
            	            (Object)adaptor.create(char_literal59)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal59_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Mininess.g:272:47: '%' ^
            	            {
            	            char_literal60=(Token)match(input,MODULUS,FOLLOW_MODULUS_in_multiplicative_expression2579); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal60_tree = 
            	            (Object)adaptor.create(char_literal60)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal60_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_arrayinc_expression_in_multiplicative_expression2583);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, multiplicative_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"


    public static class additive_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additive_expression"
    // Mininess.g:274:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
    public final MininessParser.additive_expression_return additive_expression() throws RecognitionException {
        MininessParser.additive_expression_return retval = new MininessParser.additive_expression_return();
        retval.start = input.LT(1);

        int additive_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal63=null;
        Token char_literal64=null;
        MininessParser.multiplicative_expression_return multiplicative_expression62 =null;

        MininessParser.multiplicative_expression_return multiplicative_expression65 =null;


        Object char_literal63_tree=null;
        Object char_literal64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // Mininess.g:275:5: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
            // Mininess.g:275:10: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2604);
            multiplicative_expression62=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression62.getTree());

            // Mininess.g:275:36: ( ( '+' ^| '-' ^) multiplicative_expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Mininess.g:275:38: ( '+' ^| '-' ^) multiplicative_expression
            	    {
            	    // Mininess.g:275:38: ( '+' ^| '-' ^)
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
            	            // Mininess.g:275:39: '+' ^
            	            {
            	            char_literal63=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression2609); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal63_tree = 
            	            (Object)adaptor.create(char_literal63)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal63_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:275:46: '-' ^
            	            {
            	            char_literal64=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression2614); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal64_tree = 
            	            (Object)adaptor.create(char_literal64)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal64_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2618);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, additive_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "additive_expression"


    public static class shift_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shift_expression"
    // Mininess.g:277:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
    public final MininessParser.shift_expression_return shift_expression() throws RecognitionException {
        MininessParser.shift_expression_return retval = new MininessParser.shift_expression_return();
        retval.start = input.LT(1);

        int shift_expression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal67=null;
        Token string_literal68=null;
        MininessParser.additive_expression_return additive_expression66 =null;

        MininessParser.additive_expression_return additive_expression69 =null;


        Object string_literal67_tree=null;
        Object string_literal68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // Mininess.g:278:5: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // Mininess.g:278:10: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression2639);
            additive_expression66=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression66.getTree());

            // Mininess.g:278:30: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LSHIFT||LA16_0==RSHIFT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Mininess.g:278:32: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // Mininess.g:278:32: ( '<<' ^| '>>' ^)
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
            	            // Mininess.g:278:33: '<<' ^
            	            {
            	            string_literal67=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression2644); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal67_tree = 
            	            (Object)adaptor.create(string_literal67)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal67_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:278:41: '>>' ^
            	            {
            	            string_literal68=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression2649); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal68_tree = 
            	            (Object)adaptor.create(string_literal68)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal68_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression2653);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, shift_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "shift_expression"


    public static class relational_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // Mininess.g:280:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
    public final MininessParser.relational_expression_return relational_expression() throws RecognitionException {
        MininessParser.relational_expression_return retval = new MininessParser.relational_expression_return();
        retval.start = input.LT(1);

        int relational_expression_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // Mininess.g:281:5: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // Mininess.g:281:10: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression2674);
            shift_expression70=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression70.getTree());

            // Mininess.g:281:27: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= GREATER && LA18_0 <= GREATEREQUAL)||(LA18_0 >= LESS && LA18_0 <= LESSEQUAL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Mininess.g:281:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // Mininess.g:281:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
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
            	            // Mininess.g:281:30: '<' ^
            	            {
            	            char_literal71=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression2679); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal71_tree = 
            	            (Object)adaptor.create(char_literal71)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal71_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:281:37: '>' ^
            	            {
            	            char_literal72=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression2684); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal72_tree = 
            	            (Object)adaptor.create(char_literal72)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal72_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Mininess.g:281:44: '<=' ^
            	            {
            	            string_literal73=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relational_expression2689); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal73_tree = 
            	            (Object)adaptor.create(string_literal73)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal73_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Mininess.g:281:52: '>=' ^
            	            {
            	            string_literal74=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relational_expression2694); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal74_tree = 
            	            (Object)adaptor.create(string_literal74)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression2698);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, relational_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relational_expression"


    public static class equality_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_expression"
    // Mininess.g:283:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
    public final MininessParser.equality_expression_return equality_expression() throws RecognitionException {
        MininessParser.equality_expression_return retval = new MininessParser.equality_expression_return();
        retval.start = input.LT(1);

        int equality_expression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal77=null;
        Token string_literal78=null;
        MininessParser.relational_expression_return relational_expression76 =null;

        MininessParser.relational_expression_return relational_expression79 =null;


        Object string_literal77_tree=null;
        Object string_literal78_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // Mininess.g:284:5: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // Mininess.g:284:10: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression2719);
            relational_expression76=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression76.getTree());

            // Mininess.g:284:32: ( ( '==' ^| '!=' ^) relational_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EQUAL||LA20_0==NOTEQUAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Mininess.g:284:34: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // Mininess.g:284:34: ( '==' ^| '!=' ^)
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
            	            // Mininess.g:284:35: '==' ^
            	            {
            	            string_literal77=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equality_expression2724); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal77_tree = 
            	            (Object)adaptor.create(string_literal77)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal77_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:284:43: '!=' ^
            	            {
            	            string_literal78=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equality_expression2729); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal78_tree = 
            	            (Object)adaptor.create(string_literal78)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal78_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression2733);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, equality_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equality_expression"


    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expression"
    // Mininess.g:286:1: and_expression : equality_expression ( '&' ^ equality_expression )* ;
    public final MininessParser.and_expression_return and_expression() throws RecognitionException {
        MininessParser.and_expression_return retval = new MininessParser.and_expression_return();
        retval.start = input.LT(1);

        int and_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal81=null;
        MininessParser.equality_expression_return equality_expression80 =null;

        MininessParser.equality_expression_return equality_expression82 =null;


        Object char_literal81_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // Mininess.g:287:5: ( equality_expression ( '&' ^ equality_expression )* )
            // Mininess.g:287:10: equality_expression ( '&' ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_and_expression2754);
            equality_expression80=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression80.getTree());

            // Mininess.g:287:30: ( '&' ^ equality_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AMP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Mininess.g:287:32: '&' ^ equality_expression
            	    {
            	    char_literal81=(Token)match(input,AMP,FOLLOW_AMP_in_and_expression2758); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal81_tree = 
            	    (Object)adaptor.create(char_literal81)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal81_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_and_expression2761);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, and_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "and_expression"


    public static class xor_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xor_expression"
    // Mininess.g:289:1: xor_expression : and_expression ( '^' ^ and_expression )* ;
    public final MininessParser.xor_expression_return xor_expression() throws RecognitionException {
        MininessParser.xor_expression_return retval = new MininessParser.xor_expression_return();
        retval.start = input.LT(1);

        int xor_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal84=null;
        MininessParser.and_expression_return and_expression83 =null;

        MininessParser.and_expression_return and_expression85 =null;


        Object char_literal84_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // Mininess.g:290:5: ( and_expression ( '^' ^ and_expression )* )
            // Mininess.g:290:10: and_expression ( '^' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_xor_expression2782);
            and_expression83=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression83.getTree());

            // Mininess.g:290:25: ( '^' ^ and_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BITXOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Mininess.g:290:27: '^' ^ and_expression
            	    {
            	    char_literal84=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_xor_expression2786); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal84_tree = 
            	    (Object)adaptor.create(char_literal84)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal84_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_xor_expression2789);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, xor_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "xor_expression"


    public static class or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_expression"
    // Mininess.g:292:1: or_expression : xor_expression ( '|' ^ xor_expression )* ;
    public final MininessParser.or_expression_return or_expression() throws RecognitionException {
        MininessParser.or_expression_return retval = new MininessParser.or_expression_return();
        retval.start = input.LT(1);

        int or_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal87=null;
        MininessParser.xor_expression_return xor_expression86 =null;

        MininessParser.xor_expression_return xor_expression88 =null;


        Object char_literal87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // Mininess.g:293:5: ( xor_expression ( '|' ^ xor_expression )* )
            // Mininess.g:293:10: xor_expression ( '|' ^ xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expression_in_or_expression2810);
            xor_expression86=xor_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression86.getTree());

            // Mininess.g:293:25: ( '|' ^ xor_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==BITOR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Mininess.g:293:27: '|' ^ xor_expression
            	    {
            	    char_literal87=(Token)match(input,BITOR,FOLLOW_BITOR_in_or_expression2814); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal87_tree = 
            	    (Object)adaptor.create(char_literal87)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal87_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_xor_expression_in_or_expression2817);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, or_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "or_expression"


    public static class logical_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_and_expression"
    // Mininess.g:295:1: logical_and_expression : or_expression ( '&&' ^ or_expression )* ;
    public final MininessParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        MininessParser.logical_and_expression_return retval = new MininessParser.logical_and_expression_return();
        retval.start = input.LT(1);

        int logical_and_expression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal90=null;
        MininessParser.or_expression_return or_expression89 =null;

        MininessParser.or_expression_return or_expression91 =null;


        Object string_literal90_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // Mininess.g:296:5: ( or_expression ( '&&' ^ or_expression )* )
            // Mininess.g:296:10: or_expression ( '&&' ^ or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_expression_in_logical_and_expression2838);
            or_expression89=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression89.getTree());

            // Mininess.g:296:24: ( '&&' ^ or_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Mininess.g:296:26: '&&' ^ or_expression
            	    {
            	    string_literal90=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression2842); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal90_tree = 
            	    (Object)adaptor.create(string_literal90)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal90_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression2845);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, logical_and_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"


    public static class logical_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_or_expression"
    // Mininess.g:298:1: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
    public final MininessParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        MininessParser.logical_or_expression_return retval = new MininessParser.logical_or_expression_return();
        retval.start = input.LT(1);

        int logical_or_expression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal93=null;
        MininessParser.logical_and_expression_return logical_and_expression92 =null;

        MininessParser.logical_and_expression_return logical_and_expression94 =null;


        Object string_literal93_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // Mininess.g:299:5: ( logical_and_expression ( '||' ^ logical_and_expression )* )
            // Mininess.g:299:10: logical_and_expression ( '||' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression2866);
            logical_and_expression92=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression92.getTree());

            // Mininess.g:299:33: ( '||' ^ logical_and_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Mininess.g:299:35: '||' ^ logical_and_expression
            	    {
            	    string_literal93=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression2870); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal93_tree = 
            	    (Object)adaptor.create(string_literal93)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal93_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression2873);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, logical_or_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logical_or_expression"


    public static class conditional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional_expression"
    // Mininess.g:301:1: conditional_expression : logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? ;
    public final MininessParser.conditional_expression_return conditional_expression() throws RecognitionException {
        MininessParser.conditional_expression_return retval = new MininessParser.conditional_expression_return();
        retval.start = input.LT(1);

        int conditional_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal96=null;
        Token char_literal98=null;
        MininessParser.logical_or_expression_return logical_or_expression95 =null;

        MininessParser.expression_return expression97 =null;

        MininessParser.conditional_expression_return conditional_expression99 =null;


        Object char_literal96_tree=null;
        Object char_literal98_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // Mininess.g:302:5: ( logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? )
            // Mininess.g:302:10: logical_or_expression ( '?' ^ expression ':' ! conditional_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression2894);
            logical_or_expression95=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression95.getTree());

            // Mininess.g:302:32: ( '?' ^ expression ':' ! conditional_expression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==141) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Mininess.g:302:33: '?' ^ expression ':' ! conditional_expression
                    {
                    char_literal96=(Token)match(input,141,FOLLOW_141_in_conditional_expression2897); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal96_tree = 
                    (Object)adaptor.create(char_literal96)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal96_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_conditional_expression2900);
                    expression97=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression97.getTree());

                    char_literal98=(Token)match(input,139,FOLLOW_139_in_conditional_expression2902); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression2905);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, conditional_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditional_expression"


    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_expression"
    // Mininess.g:304:1: assignment_expression : ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression );
    public final MininessParser.assignment_expression_return assignment_expression() throws RecognitionException {
        MininessParser.assignment_expression_return retval = new MininessParser.assignment_expression_return();
        retval.start = input.LT(1);

        int assignment_expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal101=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token string_literal105=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token string_literal108=null;
        Token string_literal109=null;
        Token string_literal110=null;
        Token string_literal111=null;
        MininessParser.unary_expression_return unary_expression100 =null;

        MininessParser.assignment_expression_return assignment_expression112 =null;

        MininessParser.conditional_expression_return conditional_expression113 =null;


        Object char_literal101_tree=null;
        Object string_literal102_tree=null;
        Object string_literal103_tree=null;
        Object string_literal104_tree=null;
        Object string_literal105_tree=null;
        Object string_literal106_tree=null;
        Object string_literal107_tree=null;
        Object string_literal108_tree=null;
        Object string_literal109_tree=null;
        Object string_literal110_tree=null;
        Object string_literal111_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // Mininess.g:305:5: ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression )
            int alt28=2;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA28_1 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
                }
                break;
            case MINUSMINUS:
                {
                int LA28_2 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;

                }
                }
                break;
            case AMP:
                {
                int LA28_3 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;

                }
                }
                break;
            case STAR:
                {
                int LA28_4 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 4, input);

                    throw nvae;

                }
                }
                break;
            case PLUS:
                {
                int LA28_5 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 5, input);

                    throw nvae;

                }
                }
                break;
            case MINUS:
                {
                int LA28_6 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 6, input);

                    throw nvae;

                }
                }
                break;
            case BITCOMPLEMENT:
                {
                int LA28_7 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 7, input);

                    throw nvae;

                }
                }
                break;
            case NOT:
                {
                int LA28_8 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 8, input);

                    throw nvae;

                }
                }
                break;
            case SIZEOF:
                {
                int LA28_9 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 9, input);

                    throw nvae;

                }
                }
                break;
            case CALL:
            case POST:
                {
                int LA28_10 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 10, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA28_11 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 11, input);

                    throw nvae;

                }
                }
                break;
            case CONSTANT:
                {
                int LA28_12 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 12, input);

                    throw nvae;

                }
                }
                break;
            case STRING_LITERAL:
                {
                int LA28_13 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 13, input);

                    throw nvae;

                }
                }
                break;
            case CHARACTER_LITERAL:
                {
                int LA28_14 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 14, input);

                    throw nvae;

                }
                }
                break;
            case LPARENS:
                {
                int LA28_15 = input.LA(2);

                if ( (synpred56_Mininess()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 15, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // Mininess.g:305:10: unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_assignment_expression2926);
                    unary_expression100=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression100.getTree());

                    // Mininess.g:305:27: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^)
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
                            // Mininess.g:305:28: '=' ^
                            {
                            char_literal101=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expression2929); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal101_tree = 
                            (Object)adaptor.create(char_literal101)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal101_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Mininess.g:305:35: '*=' ^
                            {
                            string_literal102=(Token)match(input,MULASSIGN,FOLLOW_MULASSIGN_in_assignment_expression2934); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal102_tree = 
                            (Object)adaptor.create(string_literal102)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal102_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Mininess.g:305:43: '/=' ^
                            {
                            string_literal103=(Token)match(input,DIVASSIGN,FOLLOW_DIVASSIGN_in_assignment_expression2939); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal103_tree = 
                            (Object)adaptor.create(string_literal103)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Mininess.g:305:51: '%=' ^
                            {
                            string_literal104=(Token)match(input,MODASSIGN,FOLLOW_MODASSIGN_in_assignment_expression2944); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal104_tree = 
                            (Object)adaptor.create(string_literal104)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal104_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Mininess.g:305:59: '+=' ^
                            {
                            string_literal105=(Token)match(input,PLUSASSIGN,FOLLOW_PLUSASSIGN_in_assignment_expression2949); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal105_tree = 
                            (Object)adaptor.create(string_literal105)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal105_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // Mininess.g:305:67: '-=' ^
                            {
                            string_literal106=(Token)match(input,MINUSASSIGN,FOLLOW_MINUSASSIGN_in_assignment_expression2954); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal106_tree = 
                            (Object)adaptor.create(string_literal106)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                            }

                            }
                            break;
                        case 7 :
                            // Mininess.g:305:75: '<<=' ^
                            {
                            string_literal107=(Token)match(input,LSHIFTASSIGN,FOLLOW_LSHIFTASSIGN_in_assignment_expression2959); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal107_tree = 
                            (Object)adaptor.create(string_literal107)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal107_tree, root_0);
                            }

                            }
                            break;
                        case 8 :
                            // Mininess.g:305:84: '>>=' ^
                            {
                            string_literal108=(Token)match(input,RSHIFTASSIGN,FOLLOW_RSHIFTASSIGN_in_assignment_expression2964); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal108_tree = 
                            (Object)adaptor.create(string_literal108)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal108_tree, root_0);
                            }

                            }
                            break;
                        case 9 :
                            // Mininess.g:305:93: '&=' ^
                            {
                            string_literal109=(Token)match(input,BITANDASSIGN,FOLLOW_BITANDASSIGN_in_assignment_expression2969); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal109_tree = 
                            (Object)adaptor.create(string_literal109)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal109_tree, root_0);
                            }

                            }
                            break;
                        case 10 :
                            // Mininess.g:305:101: '^=' ^
                            {
                            string_literal110=(Token)match(input,BITXORASSIGN,FOLLOW_BITXORASSIGN_in_assignment_expression2974); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal110_tree = 
                            (Object)adaptor.create(string_literal110)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);
                            }

                            }
                            break;
                        case 11 :
                            // Mininess.g:305:109: '|=' ^
                            {
                            string_literal111=(Token)match(input,BITORASSIGN,FOLLOW_BITORASSIGN_in_assignment_expression2979); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal111_tree = 
                            (Object)adaptor.create(string_literal111)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal111_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression2983);
                    assignment_expression112=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression112.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:306:10: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression2994);
                    conditional_expression113=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression113.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, assignment_expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignment_expression"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // Mininess.g:308:1: expression : assignment_expression ( ',' ^ assignment_expression )* ;
    public final MininessParser.expression_return expression() throws RecognitionException {
        MininessParser.expression_return retval = new MininessParser.expression_return();
        retval.start = input.LT(1);

        int expression_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal115=null;
        MininessParser.assignment_expression_return assignment_expression114 =null;

        MininessParser.assignment_expression_return assignment_expression116 =null;


        Object char_literal115_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // Mininess.g:309:5: ( assignment_expression ( ',' ^ assignment_expression )* )
            // Mininess.g:309:10: assignment_expression ( ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression3013);
            assignment_expression114=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression114.getTree());

            // Mininess.g:309:32: ( ',' ^ assignment_expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Mininess.g:309:33: ',' ^ assignment_expression
            	    {
            	    char_literal115=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression3016); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal115_tree = 
            	    (Object)adaptor.create(char_literal115)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal115_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression3019);
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
            if ( state.backtracking>0 ) { memoize(input, 21, expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class constant_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_expression"
    // Mininess.g:311:1: constant_expression : conditional_expression ;
    public final MininessParser.constant_expression_return constant_expression() throws RecognitionException {
        MininessParser.constant_expression_return retval = new MininessParser.constant_expression_return();
        retval.start = input.LT(1);

        int constant_expression_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.conditional_expression_return conditional_expression117 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // Mininess.g:312:5: ( conditional_expression )
            // Mininess.g:312:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression3040);
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
            if ( state.backtracking>0 ) { memoize(input, 22, constant_expression_StartIndex); }

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
    // Mininess.g:330:1: declaration : ( declaration_specifiers ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers init_declarator_list ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) );
    public final MininessParser.declaration_return declaration() throws RecognitionException {
        declaration_stack.push(new declaration_scope());
        MininessParser.declaration_return retval = new MininessParser.declaration_return();
        retval.start = input.LT(1);

        int declaration_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal120=null;
        Token TYPEDEF122=null;
        Token char_literal125=null;
        MininessParser.declaration_specifiers_return declaration_specifiers118 =null;

        MininessParser.init_declarator_list_return init_declarator_list119 =null;

        MininessParser.function_definition_return function_definition121 =null;

        MininessParser.declaration_specifiers_return declaration_specifiers123 =null;

        MininessParser.init_declarator_list_return init_declarator_list124 =null;


        Object char_literal120_tree=null;
        Object TYPEDEF122_tree=null;
        Object char_literal125_tree=null;
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Mininess.g:333:5: ( declaration_specifiers ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers init_declarator_list ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case COMMAND:
            case EVENT:
            case TASK:
                {
                int LA31_1 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA31_2 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA31_3 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA31_4 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA31_5 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA31_6 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA31_7 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA31_8 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 8, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA31_9 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 9, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA31_10 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA31_11 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 11, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA31_12 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 12, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA31_13 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 13, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA31_14 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 14, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA31_15 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 15, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA31_16 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 16, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA31_17 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 17, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case STRUCT:
                {
                int LA31_18 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 18, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA31_19 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 19, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA31_20 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 20, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
                {
                int LA31_21 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 21, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA31_22 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 22, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // Mininess.g:333:10: declaration_specifiers ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3103);
                    declaration_specifiers118=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers118.getTree());

                    // Mininess.g:337:33: ( init_declarator_list )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPARENS||LA30_0==RAW_IDENTIFIER||LA30_0==STAR) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // Mininess.g:337:33: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration3105);
                            init_declarator_list119=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list119.getTree());

                            }
                            break;

                    }


                    char_literal120=(Token)match(input,140,FOLLOW_140_in_declaration3108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_140.add(char_literal120);


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
                    // 344:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // Mininess.g:344:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // Mininess.g:344:54: ( init_declarator_list )?
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
                    // Mininess.g:346:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration3170);
                    function_definition121=function_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_definition.add(function_definition121.getTree());

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
                    // 349:30: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // Mininess.g:349:33: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // Mininess.g:349:47: ^( FUNCTION_DEFINITION function_definition )
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
                    // Mininess.g:352:10: TYPEDEF declaration_specifiers init_declarator_list ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF122=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration3215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF122);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3217);
                    declaration_specifiers123=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers123.getTree());

                    pushFollow(FOLLOW_init_declarator_list_in_declaration3219);
                    init_declarator_list124=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list124.getTree());

                    char_literal125=(Token)match(input,140,FOLLOW_140_in_declaration3221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_140.add(char_literal125);


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
                    // 362:14: -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                    {
                        // Mininess.g:362:17: ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
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
            if ( state.backtracking>0 ) { memoize(input, 23, declaration_StartIndex); }

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
    // Mininess.g:364:1: declaration_specifiers : ( storage_class_specifier | type_specifier | type_qualifier | DEFAULT )+ ;
    public final MininessParser.declaration_specifiers_return declaration_specifiers() throws RecognitionException {
        MininessParser.declaration_specifiers_return retval = new MininessParser.declaration_specifiers_return();
        retval.start = input.LT(1);

        int declaration_specifiers_StartIndex = input.index();

        Object root_0 = null;

        Token DEFAULT129=null;
        MininessParser.storage_class_specifier_return storage_class_specifier126 =null;

        MininessParser.type_specifier_return type_specifier127 =null;

        MininessParser.type_qualifier_return type_qualifier128 =null;


        Object DEFAULT129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Mininess.g:365:5: ( ( storage_class_specifier | type_specifier | type_qualifier | DEFAULT )+ )
            // Mininess.g:365:10: ( storage_class_specifier | type_specifier | type_qualifier | DEFAULT )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:365:10: ( storage_class_specifier | type_specifier | type_qualifier | DEFAULT )+
            int cnt32=0;
            loop32:
            do {
                int alt32=5;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred62_Mininess()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case COMMAND:
                case EVENT:
                case TASK:
                    {
                    alt32=1;
                    }
                    break;
                case CHAR:
                case ENUM:
                case INT:
                case INT16_T:
                case INT32_T:
                case INT8_T:
                case LONG:
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
                    alt32=2;
                    }
                    break;
                case CONST:
                    {
                    alt32=3;
                    }
                    break;
                case DEFAULT:
                    {
                    alt32=4;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // Mininess.g:365:11: storage_class_specifier
            	    {
            	    pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers3281);
            	    storage_class_specifier126=storage_class_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier126.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:366:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_declaration_specifiers3295);
            	    type_specifier127=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier127.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Mininess.g:367:11: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers3318);
            	    type_qualifier128=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier128.getTree());

            	    }
            	    break;
            	case 4 :
            	    // Mininess.g:368:11: DEFAULT
            	    {
            	    DEFAULT129=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_declaration_specifiers3341); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DEFAULT129_tree = 
            	    (Object)adaptor.create(DEFAULT129)
            	    ;
            	    adaptor.addChild(root_0, DEFAULT129_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
            if ( state.backtracking>0 ) { memoize(input, 24, declaration_specifiers_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "declaration_specifiers"


    public static class init_declarator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator_list"
    // Mininess.g:374:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
    public final MininessParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
        MininessParser.init_declarator_list_return retval = new MininessParser.init_declarator_list_return();
        retval.start = input.LT(1);

        int init_declarator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal131=null;
        MininessParser.init_declarator_return init_declarator130 =null;

        MininessParser.init_declarator_return init_declarator132 =null;


        Object char_literal131_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Mininess.g:375:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // Mininess.g:375:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list3364);
            init_declarator130=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator130.getTree());

            // Mininess.g:375:26: ( ',' init_declarator )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Mininess.g:375:27: ',' init_declarator
            	    {
            	    char_literal131=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list3367); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal131);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list3369);
            	    init_declarator132=init_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator132.getTree());

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
            // 375:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // Mininess.g:375:52: ^( DECLARATOR_LIST ( init_declarator )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 25, init_declarator_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "init_declarator_list"


    public static class init_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator"
    // Mininess.g:381:1: init_declarator : declarator ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
    public final MininessParser.init_declarator_return init_declarator() throws RecognitionException {
        MininessParser.init_declarator_return retval = new MininessParser.init_declarator_return();
        retval.start = input.LT(1);

        int init_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal134=null;
        MininessParser.declarator_return declarator133 =null;

        MininessParser.initializer_return initializer135 =null;


        Object char_literal134_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // Mininess.g:382:5: ( declarator ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // Mininess.g:382:10: declarator ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator3403);
            declarator133=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator133.getTree());

            // Mininess.g:382:21: ( '=' initializer )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ASSIGN) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Mininess.g:382:22: '=' initializer
                    {
                    char_literal134=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator3406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal134);


                    pushFollow(FOLLOW_initializer_in_init_declarator3408);
                    initializer135=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer135.getTree());

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
            // 382:40: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // Mininess.g:382:43: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // Mininess.g:382:72: ( initializer )?
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
            if ( state.backtracking>0 ) { memoize(input, 26, init_declarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "init_declarator"


    public static class storage_class_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "storage_class_specifier"
    // Mininess.g:384:1: storage_class_specifier : ( COMMAND | EVENT | TASK );
    public final MininessParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        MininessParser.storage_class_specifier_return retval = new MininessParser.storage_class_specifier_return();
        retval.start = input.LT(1);

        int storage_class_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token set136=null;

        Object set136_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // Mininess.g:385:5: ( COMMAND | EVENT | TASK )
            // Mininess.g:
            {
            root_0 = (Object)adaptor.nil();


            set136=(Token)input.LT(1);

            if ( input.LA(1)==COMMAND||input.LA(1)==EVENT||input.LA(1)==TASK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set136)
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
            if ( state.backtracking>0 ) { memoize(input, 27, storage_class_specifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "storage_class_specifier"


    public static class type_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // Mininess.g:389:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | INT8_T | INT16_T | INT32_T | UINT8_T | UINT16_T | UINT32_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | struct_or_union_specifier | enum_specifier | typedef_name );
    public final MininessParser.type_specifier_return type_specifier() throws RecognitionException {
        MininessParser.type_specifier_return retval = new MininessParser.type_specifier_return();
        retval.start = input.LT(1);

        int type_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token VOID137=null;
        Token CHAR138=null;
        Token SHORT139=null;
        Token INT140=null;
        Token LONG141=null;
        Token SIGNED142=null;
        Token UNSIGNED143=null;
        Token INT8_T144=null;
        Token INT16_T145=null;
        Token INT32_T146=null;
        Token UINT8_T147=null;
        Token UINT16_T148=null;
        Token UINT32_T149=null;
        Token NX_UINT8_T150=null;
        Token NX_UINT16_T151=null;
        Token NX_UINT32_T152=null;
        MininessParser.struct_or_union_specifier_return struct_or_union_specifier153 =null;

        MininessParser.enum_specifier_return enum_specifier154 =null;

        MininessParser.typedef_name_return typedef_name155 =null;


        Object VOID137_tree=null;
        Object CHAR138_tree=null;
        Object SHORT139_tree=null;
        Object INT140_tree=null;
        Object LONG141_tree=null;
        Object SIGNED142_tree=null;
        Object UNSIGNED143_tree=null;
        Object INT8_T144_tree=null;
        Object INT16_T145_tree=null;
        Object INT32_T146_tree=null;
        Object UINT8_T147_tree=null;
        Object UINT16_T148_tree=null;
        Object UINT32_T149_tree=null;
        Object NX_UINT8_T150_tree=null;
        Object NX_UINT16_T151_tree=null;
        Object NX_UINT32_T152_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Mininess.g:390:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | INT8_T | INT16_T | INT32_T | UINT8_T | UINT16_T | UINT32_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | struct_or_union_specifier | enum_specifier | typedef_name )
            int alt35=19;
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
            case NX_UINT8_T:
                {
                alt35=14;
                }
                break;
            case NX_UINT16_T:
                {
                alt35=15;
                }
                break;
            case NX_UINT32_T:
                {
                alt35=16;
                }
                break;
            case NX_STRUCT:
            case STRUCT:
                {
                alt35=17;
                }
                break;
            case ENUM:
                {
                alt35=18;
                }
                break;
            case RAW_IDENTIFIER:
                {
                alt35=19;
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
                    // Mininess.g:390:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID137=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier3480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID137_tree = 
                    (Object)adaptor.create(VOID137)
                    ;
                    adaptor.addChild(root_0, VOID137_tree);
                    }

                    }
                    break;
                case 2 :
                    // Mininess.g:391:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR138=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier3490); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR138_tree = 
                    (Object)adaptor.create(CHAR138)
                    ;
                    adaptor.addChild(root_0, CHAR138_tree);
                    }

                    }
                    break;
                case 3 :
                    // Mininess.g:392:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT139=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier3500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT139_tree = 
                    (Object)adaptor.create(SHORT139)
                    ;
                    adaptor.addChild(root_0, SHORT139_tree);
                    }

                    }
                    break;
                case 4 :
                    // Mininess.g:393:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT140=(Token)match(input,INT,FOLLOW_INT_in_type_specifier3510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT140_tree = 
                    (Object)adaptor.create(INT140)
                    ;
                    adaptor.addChild(root_0, INT140_tree);
                    }

                    }
                    break;
                case 5 :
                    // Mininess.g:394:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG141=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier3520); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG141_tree = 
                    (Object)adaptor.create(LONG141)
                    ;
                    adaptor.addChild(root_0, LONG141_tree);
                    }

                    }
                    break;
                case 6 :
                    // Mininess.g:395:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED142=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier3530); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED142_tree = 
                    (Object)adaptor.create(SIGNED142)
                    ;
                    adaptor.addChild(root_0, SIGNED142_tree);
                    }

                    }
                    break;
                case 7 :
                    // Mininess.g:396:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED143=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier3540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED143_tree = 
                    (Object)adaptor.create(UNSIGNED143)
                    ;
                    adaptor.addChild(root_0, UNSIGNED143_tree);
                    }

                    }
                    break;
                case 8 :
                    // Mininess.g:397:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T144=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier3550); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T144_tree = 
                    (Object)adaptor.create(INT8_T144)
                    ;
                    adaptor.addChild(root_0, INT8_T144_tree);
                    }

                    }
                    break;
                case 9 :
                    // Mininess.g:398:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T145=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier3572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T145_tree = 
                    (Object)adaptor.create(INT16_T145)
                    ;
                    adaptor.addChild(root_0, INT16_T145_tree);
                    }

                    }
                    break;
                case 10 :
                    // Mininess.g:399:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T146=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier3593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T146_tree = 
                    (Object)adaptor.create(INT32_T146)
                    ;
                    adaptor.addChild(root_0, INT32_T146_tree);
                    }

                    }
                    break;
                case 11 :
                    // Mininess.g:400:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T147=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier3614); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T147_tree = 
                    (Object)adaptor.create(UINT8_T147)
                    ;
                    adaptor.addChild(root_0, UINT8_T147_tree);
                    }

                    }
                    break;
                case 12 :
                    // Mininess.g:401:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T148=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier3635); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T148_tree = 
                    (Object)adaptor.create(UINT16_T148)
                    ;
                    adaptor.addChild(root_0, UINT16_T148_tree);
                    }

                    }
                    break;
                case 13 :
                    // Mininess.g:402:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T149=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier3655); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T149_tree = 
                    (Object)adaptor.create(UINT32_T149)
                    ;
                    adaptor.addChild(root_0, UINT32_T149_tree);
                    }

                    }
                    break;
                case 14 :
                    // Mininess.g:403:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T150=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier3675); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T150_tree = 
                    (Object)adaptor.create(NX_UINT8_T150)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T150_tree);
                    }

                    }
                    break;
                case 15 :
                    // Mininess.g:404:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T151=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier3693); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T151_tree = 
                    (Object)adaptor.create(NX_UINT16_T151)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T151_tree);
                    }

                    }
                    break;
                case 16 :
                    // Mininess.g:405:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T152=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier3710); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T152_tree = 
                    (Object)adaptor.create(NX_UINT32_T152)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T152_tree);
                    }

                    }
                    break;
                case 17 :
                    // Mininess.g:406:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier3727);
                    struct_or_union_specifier153=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier153.getTree());

                    }
                    break;
                case 18 :
                    // Mininess.g:407:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier3737);
                    enum_specifier154=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier154.getTree());

                    }
                    break;
                case 19 :
                    // Mininess.g:408:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier3747);
                    typedef_name155=typedef_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedef_name155.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, type_specifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_specifier"


    public static class struct_or_union_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_or_union_specifier"
    // Mininess.g:410:1: struct_or_union_specifier : ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) );
    public final MininessParser.struct_or_union_specifier_return struct_or_union_specifier() throws RecognitionException {
        MininessParser.struct_or_union_specifier_return retval = new MininessParser.struct_or_union_specifier_return();
        retval.start = input.LT(1);

        int struct_or_union_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal158=null;
        Token char_literal160=null;
        MininessParser.struct_or_union_return struct_or_union156 =null;

        MininessParser.identifier_return identifier157 =null;

        MininessParser.struct_declaration_list_return struct_declaration_list159 =null;

        MininessParser.struct_or_union_return struct_or_union161 =null;

        MininessParser.identifier_return identifier162 =null;


        Object char_literal158_tree=null;
        Object char_literal160_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_struct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declaration_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Mininess.g:411:5: ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==NX_STRUCT||LA37_0==STRUCT) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RAW_IDENTIFIER) ) {
                    int LA37_2 = input.LA(3);

                    if ( (LA37_2==LBRACE) ) {
                        alt37=1;
                    }
                    else if ( (LA37_2==EOF||LA37_2==CHAR||(LA37_2 >= COMMA && LA37_2 <= COMMAND)||LA37_2==CONST||LA37_2==DEFAULT||LA37_2==ENUM||LA37_2==EVENT||(LA37_2 >= INT && LA37_2 <= INT8_T)||LA37_2==LBRACKET||(LA37_2 >= LONG && LA37_2 <= LPARENS)||(LA37_2 >= NX_STRUCT && LA37_2 <= NX_UINT8_T)||LA37_2==RAW_IDENTIFIER||LA37_2==RBRACKET||LA37_2==RPARENS||(LA37_2 >= SHORT && LA37_2 <= SIGNED)||LA37_2==STAR||LA37_2==STRUCT||LA37_2==TASK||(LA37_2 >= UINT16_T && LA37_2 <= UINT8_T)||LA37_2==UNSIGNED||LA37_2==VOID||(LA37_2 >= 139 && LA37_2 <= 140)) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA37_1==LBRACE) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

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
                    // Mininess.g:411:10: struct_or_union ( identifier )? '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier3762);
                    struct_or_union156=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union156.getTree());

                    // Mininess.g:411:26: ( identifier )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RAW_IDENTIFIER) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // Mininess.g:411:26: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_struct_or_union_specifier3764);
                            identifier157=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier157.getTree());

                            }
                            break;

                    }


                    char_literal158=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier3767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal158);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier3769);
                    struct_declaration_list159=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list159.getTree());

                    char_literal160=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier3771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal160);


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
                    // 412:13: -> ^( struct_or_union ( identifier )? struct_declaration_list )
                    {
                        // Mininess.g:412:16: ^( struct_or_union ( identifier )? struct_declaration_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        // Mininess.g:412:34: ( identifier )?
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
                    // Mininess.g:413:10: struct_or_union identifier
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier3805);
                    struct_or_union161=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union161.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier3807);
                    identifier162=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier162.getTree());

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
                    // 414:13: -> ^( struct_or_union identifier )
                    {
                        // Mininess.g:414:16: ^( struct_or_union identifier )
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

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, struct_or_union_specifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_or_union_specifier"


    public static class struct_or_union_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_or_union"
    // Mininess.g:417:1: struct_or_union : ( STRUCT | NX_STRUCT );
    public final MininessParser.struct_or_union_return struct_or_union() throws RecognitionException {
        MininessParser.struct_or_union_return retval = new MininessParser.struct_or_union_return();
        retval.start = input.LT(1);

        int struct_or_union_StartIndex = input.index();

        Object root_0 = null;

        Token set163=null;

        Object set163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Mininess.g:418:5: ( STRUCT | NX_STRUCT )
            // Mininess.g:
            {
            root_0 = (Object)adaptor.nil();


            set163=(Token)input.LT(1);

            if ( input.LA(1)==NX_STRUCT||input.LA(1)==STRUCT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set163)
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
            if ( state.backtracking>0 ) { memoize(input, 30, struct_or_union_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_or_union"


    public static class struct_declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declaration_list"
    // Mininess.g:424:1: struct_declaration_list : ( struct_declaration )+ ;
    public final MininessParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        MininessParser.struct_declaration_list_return retval = new MininessParser.struct_declaration_list_return();
        retval.start = input.LT(1);

        int struct_declaration_list_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.struct_declaration_return struct_declaration164 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Mininess.g:425:5: ( ( struct_declaration )+ )
            // Mininess.g:425:10: ( struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // Mininess.g:426:10: ( struct_declaration )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==CHAR||LA38_0==CONST||LA38_0==ENUM||(LA38_0 >= INT && LA38_0 <= INT8_T)||LA38_0==LONG||(LA38_0 >= NX_STRUCT && LA38_0 <= NX_UINT8_T)||LA38_0==RAW_IDENTIFIER||(LA38_0 >= SHORT && LA38_0 <= SIGNED)||LA38_0==STRUCT||(LA38_0 >= UINT16_T && LA38_0 <= UINT8_T)||LA38_0==UNSIGNED||LA38_0==VOID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Mininess.g:426:10: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list3887);
            	    struct_declaration164=struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_declaration164.getTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, struct_declaration_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_declaration_list"


    public static class struct_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declaration"
    // Mininess.g:429:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final MininessParser.struct_declaration_return struct_declaration() throws RecognitionException {
        MininessParser.struct_declaration_return retval = new MininessParser.struct_declaration_return();
        retval.start = input.LT(1);

        int struct_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal167=null;
        MininessParser.specifier_qualifier_list_return specifier_qualifier_list165 =null;

        MininessParser.struct_declarator_list_return struct_declarator_list166 =null;


        Object char_literal167_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Mininess.g:430:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // Mininess.g:430:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration3918);
            specifier_qualifier_list165=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list165.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration3920);
            struct_declarator_list166=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list166.getTree());

            char_literal167=(Token)match(input,140,FOLLOW_140_in_struct_declaration3922); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_140.add(char_literal167);


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
            // 431:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // Mininess.g:431:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
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
            if ( state.backtracking>0 ) { memoize(input, 32, struct_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_declaration"


    public static class specifier_qualifier_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specifier_qualifier_list"
    // Mininess.g:438:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final MininessParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        MininessParser.specifier_qualifier_list_return retval = new MininessParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);

        int specifier_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.type_specifier_return type_specifier168 =null;

        MininessParser.type_qualifier_return type_qualifier169 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Mininess.g:439:5: ( ( type_specifier | type_qualifier )+ )
            // Mininess.g:439:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:439:10: ( type_specifier | type_qualifier )+
            int cnt39=0;
            loop39:
            do {
                int alt39=3;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (synpred91_Mininess()) ) {
                        alt39=1;
                    }


                    }
                    break;
                case CHAR:
                case ENUM:
                case INT:
                case INT16_T:
                case INT32_T:
                case INT8_T:
                case LONG:
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
                    alt39=1;
                    }
                    break;
                case CONST:
                    {
                    alt39=2;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // Mininess.g:439:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list3969);
            	    type_specifier168=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier168.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:439:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list3973);
            	    type_qualifier169=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier169.getTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, specifier_qualifier_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "specifier_qualifier_list"


    public static class struct_declarator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declarator_list"
    // Mininess.g:446:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
    public final MininessParser.struct_declarator_list_return struct_declarator_list() throws RecognitionException {
        MininessParser.struct_declarator_list_return retval = new MininessParser.struct_declarator_list_return();
        retval.start = input.LT(1);

        int struct_declarator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal171=null;
        MininessParser.struct_declarator_return struct_declarator170 =null;

        MininessParser.struct_declarator_return struct_declarator172 =null;


        Object char_literal171_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_struct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Mininess.g:447:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // Mininess.g:447:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list3999);
            struct_declarator170=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator170.getTree());

            // Mininess.g:447:28: ( ',' struct_declarator )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // Mininess.g:447:29: ',' struct_declarator
            	    {
            	    char_literal171=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list4002); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal171);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list4004);
            	    struct_declarator172=struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator172.getTree());

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
            // 447:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // Mininess.g:447:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 34, struct_declarator_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_declarator_list"


    public static class struct_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_declarator"
    // Mininess.g:449:1: struct_declarator : ( ( declarator )? ':' constant_expression | declarator );
    public final MininessParser.struct_declarator_return struct_declarator() throws RecognitionException {
        MininessParser.struct_declarator_return retval = new MininessParser.struct_declarator_return();
        retval.start = input.LT(1);

        int struct_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal174=null;
        MininessParser.declarator_return declarator173 =null;

        MininessParser.constant_expression_return constant_expression175 =null;

        MininessParser.declarator_return declarator176 =null;


        Object char_literal174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Mininess.g:450:5: ( ( declarator )? ':' constant_expression | declarator )
            int alt42=2;
            switch ( input.LA(1) ) {
            case STAR:
                {
                int LA42_1 = input.LA(2);

                if ( (synpred95_Mininess()) ) {
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

                if ( (synpred95_Mininess()) ) {
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

                if ( (synpred95_Mininess()) ) {
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
            case 139:
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
                    // Mininess.g:450:10: ( declarator )? ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // Mininess.g:450:10: ( declarator )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==LPARENS||LA41_0==RAW_IDENTIFIER||LA41_0==STAR) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // Mininess.g:450:10: declarator
                            {
                            pushFollow(FOLLOW_declarator_in_struct_declarator4034);
                            declarator173=declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator173.getTree());

                            }
                            break;

                    }


                    char_literal174=(Token)match(input,139,FOLLOW_139_in_struct_declarator4037); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal174_tree = 
                    (Object)adaptor.create(char_literal174)
                    ;
                    adaptor.addChild(root_0, char_literal174_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator4039);
                    constant_expression175=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression175.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:451:10: declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator4050);
                    declarator176=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator176.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, struct_declarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "struct_declarator"


    public static class enum_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enum_specifier"
    // Mininess.g:453:1: enum_specifier : ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) );
    public final MininessParser.enum_specifier_return enum_specifier() throws RecognitionException {
        MininessParser.enum_specifier_return retval = new MininessParser.enum_specifier_return();
        retval.start = input.LT(1);

        int enum_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM177=null;
        Token char_literal179=null;
        Token char_literal181=null;
        Token char_literal182=null;
        Token ENUM183=null;
        Token char_literal185=null;
        Token char_literal187=null;
        Token char_literal188=null;
        Token ENUM189=null;
        MininessParser.identifier_return identifier178 =null;

        MininessParser.enumerator_list_return enumerator_list180 =null;

        MininessParser.identifier_return identifier184 =null;

        MininessParser.enumerator_list_return enumerator_list186 =null;

        MininessParser.identifier_return identifier190 =null;


        Object ENUM177_tree=null;
        Object char_literal179_tree=null;
        Object char_literal181_tree=null;
        Object char_literal182_tree=null;
        Object ENUM183_tree=null;
        Object char_literal185_tree=null;
        Object char_literal187_tree=null;
        Object char_literal188_tree=null;
        Object ENUM189_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_enumerator_list=new RewriteRuleSubtreeStream(adaptor,"rule enumerator_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Mininess.g:454:5: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ENUM) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred98_Mininess()) ) {
                    alt46=1;
                }
                else if ( (synpred100_Mininess()) ) {
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
                    // Mininess.g:454:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM177=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier4069); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM177);


                    // Mininess.g:454:15: ( identifier )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RAW_IDENTIFIER) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // Mininess.g:454:15: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_enum_specifier4071);
                            identifier178=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier178.getTree());

                            }
                            break;

                    }


                    char_literal179=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier4074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal179);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier4076);
                    enumerator_list180=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list180.getTree());

                    // Mininess.g:454:47: ( ',' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==COMMA) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // Mininess.g:454:47: ','
                            {
                            char_literal181=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier4078); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal181);


                            }
                            break;

                    }


                    char_literal182=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier4081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal182);


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
                    // 455:14: -> ^( ENUM ( identifier )? enumerator_list )
                    {
                        // Mininess.g:455:17: ^( ENUM ( identifier )? enumerator_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        // Mininess.g:455:24: ( identifier )?
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
                    // Mininess.g:456:10: ENUM identifier '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM183=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier4116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM183);


                    pushFollow(FOLLOW_identifier_in_enum_specifier4118);
                    identifier184=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier184.getTree());

                    char_literal185=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier4120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal185);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier4122);
                    enumerator_list186=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list186.getTree());

                    // Mininess.g:456:46: ( ',' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==COMMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // Mininess.g:456:46: ','
                            {
                            char_literal187=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier4124); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal187);


                            }
                            break;

                    }


                    char_literal188=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier4127); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal188);


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
                    // 457:14: -> ^( ENUM identifier enumerator_list )
                    {
                        // Mininess.g:457:17: ^( ENUM identifier enumerator_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_1, stream_enumerator_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Mininess.g:458:10: ENUM identifier
                    {
                    ENUM189=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier4161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM189);


                    pushFollow(FOLLOW_identifier_in_enum_specifier4163);
                    identifier190=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier190.getTree());

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
                    // 459:14: -> ^( ENUM identifier )
                    {
                        // Mininess.g:459:17: ^( ENUM identifier )
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
            if ( state.backtracking>0 ) { memoize(input, 36, enum_specifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enum_specifier"


    public static class enumerator_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumerator_list"
    // Mininess.g:461:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
    public final MininessParser.enumerator_list_return enumerator_list() throws RecognitionException {
        MininessParser.enumerator_list_return retval = new MininessParser.enumerator_list_return();
        retval.start = input.LT(1);

        int enumerator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal192=null;
        MininessParser.enumerator_return enumerator191 =null;

        MininessParser.enumerator_return enumerator193 =null;


        Object char_literal192_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Mininess.g:462:5: ( enumerator ( ',' ! enumerator )* )
            // Mininess.g:462:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list4203);
            enumerator191=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator191.getTree());

            // Mininess.g:462:21: ( ',' ! enumerator )*
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
            	    // Mininess.g:462:22: ',' ! enumerator
            	    {
            	    char_literal192=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list4206); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list4209);
            	    enumerator193=enumerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator193.getTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, enumerator_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumerator_list"


    public static class enumerator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumerator"
    // Mininess.g:468:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
    public final MininessParser.enumerator_return enumerator() throws RecognitionException {
        MininessParser.enumerator_return retval = new MininessParser.enumerator_return();
        retval.start = input.LT(1);

        int enumerator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal195=null;
        MininessParser.identifier_return identifier194 =null;

        MininessParser.constant_expression_return constant_expression196 =null;


        Object char_literal195_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Mininess.g:469:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // Mininess.g:469:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator4234);
            identifier194=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier194.getTree());

            // Mininess.g:469:21: ( '=' constant_expression )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ASSIGN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Mininess.g:469:22: '=' constant_expression
                    {
                    char_literal195=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator4237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal195);


                    pushFollow(FOLLOW_constant_expression_in_enumerator4239);
                    constant_expression196=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression196.getTree());

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
            // 469:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // Mininess.g:469:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // Mininess.g:469:75: ( constant_expression )?
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
            if ( state.backtracking>0 ) { memoize(input, 38, enumerator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumerator"


    public static class type_qualifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_qualifier"
    // Mininess.g:471:1: type_qualifier : CONST ;
    public final MininessParser.type_qualifier_return type_qualifier() throws RecognitionException {
        MininessParser.type_qualifier_return retval = new MininessParser.type_qualifier_return();
        retval.start = input.LT(1);

        int type_qualifier_StartIndex = input.index();

        Object root_0 = null;

        Token CONST197=null;

        Object CONST197_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Mininess.g:472:5: ( CONST )
            // Mininess.g:472:10: CONST
            {
            root_0 = (Object)adaptor.nil();


            CONST197=(Token)match(input,CONST,FOLLOW_CONST_in_type_qualifier4271); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONST197_tree = 
            (Object)adaptor.create(CONST197)
            ;
            adaptor.addChild(root_0, CONST197_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, type_qualifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_qualifier"


    public static class declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarator"
    // Mininess.g:474:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
    public final MininessParser.declarator_return declarator() throws RecognitionException {
        MininessParser.declarator_return retval = new MininessParser.declarator_return();
        retval.start = input.LT(1);

        int declarator_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.pointer_return pointer198 =null;

        MininessParser.direct_declarator_return direct_declarator199 =null;


        RewriteRuleSubtreeStream stream_direct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule direct_declarator");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Mininess.g:475:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // Mininess.g:475:10: ( pointer )? direct_declarator
            {
            // Mininess.g:475:10: ( pointer )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==STAR) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Mininess.g:475:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator4290);
                    pointer198=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer198.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator4293);
            direct_declarator199=direct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_direct_declarator.add(direct_declarator199.getTree());

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
            // 475:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // Mininess.g:475:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // Mininess.g:475:53: ( pointer )?
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
    // Mininess.g:477:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final MininessParser.direct_declarator_return direct_declarator() throws RecognitionException {
        MininessParser.direct_declarator_return retval = new MininessParser.direct_declarator_return();
        retval.start = input.LT(1);

        int direct_declarator_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.direct_declarator_identifier_return direct_declarator_identifier200 =null;

        MininessParser.direct_declarator_modifier_return direct_declarator_modifier201 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Mininess.g:478:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // Mininess.g:478:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator4318);
            direct_declarator_identifier200=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier200.getTree());

            // Mininess.g:478:38: ( direct_declarator_modifier )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==LBRACKET||LA50_0==LPARENS) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Mininess.g:478:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator4320);
            	    direct_declarator_modifier201=direct_declarator_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_modifier201.getTree());

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
    // Mininess.g:489:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
    public final MininessParser.direct_declarator_identifier_return direct_declarator_identifier() throws RecognitionException {
        MininessParser.direct_declarator_identifier_return retval = new MininessParser.direct_declarator_identifier_return();
        retval.start = input.LT(1);

        int direct_declarator_identifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal202=null;
        Token char_literal204=null;
        Token char_literal206=null;
        MininessParser.identifier_return myIdName =null;

        MininessParser.identifier_return identifier203 =null;

        MininessParser.declarator_return declarator205 =null;


        Object char_literal202_tree=null;
        Object char_literal204_tree=null;
        Object char_literal206_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Mininess.g:490:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
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
                    // Mininess.g:490:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier4346);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // Mininess.g:490:29: ( '.' identifier )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==DOT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // Mininess.g:490:30: '.' identifier
                            {
                            char_literal202=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier4349); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal202);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier4351);
                            identifier203=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier203.getTree());

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
                    // 494:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // Mininess.g:494:18: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // Mininess.g:495:9: '(' declarator ')'
                    {
                    char_literal204=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier4386); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal204);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier4388);
                    declarator205=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator205.getTree());

                    char_literal206=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier4390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal206);


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
                    // 495:28: -> declarator
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
    // Mininess.g:501:1: direct_declarator_modifier : ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
    public final MininessParser.direct_declarator_modifier_return direct_declarator_modifier() throws RecognitionException {
        MininessParser.direct_declarator_modifier_return retval = new MininessParser.direct_declarator_modifier_return();
        retval.start = input.LT(1);

        int direct_declarator_modifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal207=null;
        Token char_literal209=null;
        Token char_literal210=null;
        Token char_literal211=null;
        Token char_literal212=null;
        Token char_literal213=null;
        MininessParser.parameter_type_list_return gen =null;

        MininessParser.parameter_type_list_return normal =null;

        MininessParser.constant_expression_return constant_expression208 =null;


        Object char_literal207_tree=null;
        Object char_literal209_tree=null;
        Object char_literal210_tree=null;
        Object char_literal211_tree=null;
        Object char_literal212_tree=null;
        Object char_literal213_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_parameter_type_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_type_list");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Mininess.g:502:5: ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LBRACKET) ) {
                int LA55_1 = input.LA(2);

                if ( (synpred108_Mininess()) ) {
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
                    // Mininess.g:502:9: '[' ( constant_expression )? ']'
                    {
                    char_literal207=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier4412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal207);


                    // Mininess.g:502:13: ( constant_expression )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==AMP||LA53_0==BITCOMPLEMENT||LA53_0==CALL||LA53_0==CHARACTER_LITERAL||LA53_0==CONSTANT||LA53_0==LPARENS||LA53_0==MINUS||LA53_0==MINUSMINUS||LA53_0==NOT||LA53_0==PLUS||LA53_0==PLUSPLUS||LA53_0==POST||LA53_0==RAW_IDENTIFIER||LA53_0==SIZEOF||LA53_0==STAR||LA53_0==STRING_LITERAL) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // Mininess.g:502:13: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier4414);
                            constant_expression208=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression208.getTree());

                            }
                            break;

                    }


                    char_literal209=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier4417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal209);


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
                    // 503:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // Mininess.g:503:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // Mininess.g:503:44: ( constant_expression )?
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
                    // Mininess.g:504:9: ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')'
                    {
                    // Mininess.g:504:9: ( '[' gen= parameter_type_list ']' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==LBRACKET) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // Mininess.g:504:10: '[' gen= parameter_type_list ']'
                            {
                            char_literal210=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier4449); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal210);


                            pushFollow(FOLLOW_parameter_type_list_in_direct_declarator_modifier4453);
                            gen=parameter_type_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_type_list.add(gen.getTree());

                            char_literal211=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier4455); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal211);


                            }
                            break;

                    }


                    char_literal212=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier4459); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal212);


                    pushFollow(FOLLOW_parameter_type_list_in_direct_declarator_modifier4463);
                    normal=parameter_type_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_type_list.add(normal.getTree());

                    char_literal213=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier4465); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal213);


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
                    // 505:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // Mininess.g:505:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
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
    // Mininess.g:511:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
    public final MininessParser.pointer_return pointer() throws RecognitionException {
        MininessParser.pointer_return retval = new MininessParser.pointer_return();
        retval.start = input.LT(1);

        int pointer_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal214=null;
        Token char_literal217=null;
        MininessParser.type_qualifier_list_return type_qualifier_list215 =null;

        MininessParser.pointer_return pointer216 =null;

        MininessParser.type_qualifier_list_return type_qualifier_list218 =null;


        Object char_literal214_tree=null;
        Object char_literal217_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_type_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule type_qualifier_list");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Mininess.g:512:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // Mininess.g:512:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal214=(Token)match(input,STAR,FOLLOW_STAR_in_pointer4505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal214);


                    // Mininess.g:512:14: ( type_qualifier_list )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==CONST) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // Mininess.g:512:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer4507);
                            type_qualifier_list215=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list215.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer4510);
                    pointer216=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer216.getTree());

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
                    // 512:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // Mininess.g:512:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // Mininess.g:512:66: ( type_qualifier_list )?
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
                    // Mininess.g:513:10: '*' ( type_qualifier_list )?
                    {
                    char_literal217=(Token)match(input,STAR,FOLLOW_STAR_in_pointer4532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal217);


                    // Mininess.g:513:14: ( type_qualifier_list )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==CONST) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // Mininess.g:513:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer4534);
                            type_qualifier_list218=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list218.getTree());

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
                    // 513:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // Mininess.g:513:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // Mininess.g:513:58: ( type_qualifier_list )?
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
    // Mininess.g:515:1: type_qualifier_list : ( type_qualifier )+ ;
    public final MininessParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        MininessParser.type_qualifier_list_return retval = new MininessParser.type_qualifier_list_return();
        retval.start = input.LT(1);

        int type_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.type_qualifier_return type_qualifier219 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Mininess.g:516:5: ( ( type_qualifier )+ )
            // Mininess.g:516:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:516:10: ( type_qualifier )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==CONST) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // Mininess.g:516:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list4563);
            	    type_qualifier219=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier219.getTree());

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
    // Mininess.g:519:1: parameter_type_list : parameter_list ( ',' '...' )? ;
    public final MininessParser.parameter_type_list_return parameter_type_list() throws RecognitionException {
        MininessParser.parameter_type_list_return retval = new MininessParser.parameter_type_list_return();
        retval.start = input.LT(1);

        int parameter_type_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal221=null;
        Token string_literal222=null;
        MininessParser.parameter_list_return parameter_list220 =null;


        Object char_literal221_tree=null;
        Object string_literal222_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Mininess.g:520:5: ( parameter_list ( ',' '...' )? )
            // Mininess.g:520:10: parameter_list ( ',' '...' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_parameter_list_in_parameter_type_list4584);
            parameter_list220=parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list220.getTree());

            // Mininess.g:520:25: ( ',' '...' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==COMMA) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // Mininess.g:520:26: ',' '...'
                    {
                    char_literal221=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_type_list4587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal221_tree = 
                    (Object)adaptor.create(char_literal221)
                    ;
                    adaptor.addChild(root_0, char_literal221_tree);
                    }

                    string_literal222=(Token)match(input,138,FOLLOW_138_in_parameter_type_list4589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal222_tree = 
                    (Object)adaptor.create(string_literal222)
                    ;
                    adaptor.addChild(root_0, string_literal222_tree);
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
    // Mininess.g:526:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* -> ^( PARAMETER_LIST ( parameter_declaration )+ ) | -> ^( PARAMETER_LIST ) );
    public final MininessParser.parameter_list_return parameter_list() throws RecognitionException {
        MininessParser.parameter_list_return retval = new MininessParser.parameter_list_return();
        retval.start = input.LT(1);

        int parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal224=null;
        MininessParser.parameter_declaration_return parameter_declaration223 =null;

        MininessParser.parameter_declaration_return parameter_declaration225 =null;


        Object char_literal224_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Mininess.g:527:5: ( parameter_declaration ( ',' parameter_declaration )* -> ^( PARAMETER_LIST ( parameter_declaration )+ ) | -> ^( PARAMETER_LIST ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==CHAR||LA62_0==COMMAND||LA62_0==CONST||LA62_0==DEFAULT||LA62_0==ENUM||LA62_0==EVENT||(LA62_0 >= INT && LA62_0 <= INT8_T)||LA62_0==LONG||(LA62_0 >= NX_STRUCT && LA62_0 <= NX_UINT8_T)||LA62_0==RAW_IDENTIFIER||(LA62_0 >= SHORT && LA62_0 <= SIGNED)||LA62_0==STRUCT||LA62_0==TASK||(LA62_0 >= UINT16_T && LA62_0 <= UINT8_T)||LA62_0==UNSIGNED||LA62_0==VOID) ) {
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
                    // Mininess.g:527:10: parameter_declaration ( ',' parameter_declaration )*
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list4614);
                    parameter_declaration223=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration223.getTree());

                    // Mininess.g:527:32: ( ',' parameter_declaration )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==COMMA) ) {
                            int LA61_1 = input.LA(2);

                            if ( (LA61_1==CHAR||LA61_1==COMMAND||LA61_1==CONST||LA61_1==DEFAULT||LA61_1==ENUM||LA61_1==EVENT||(LA61_1 >= INT && LA61_1 <= INT8_T)||LA61_1==LONG||(LA61_1 >= NX_STRUCT && LA61_1 <= NX_UINT8_T)||LA61_1==RAW_IDENTIFIER||(LA61_1 >= SHORT && LA61_1 <= SIGNED)||LA61_1==STRUCT||LA61_1==TASK||(LA61_1 >= UINT16_T && LA61_1 <= UINT8_T)||LA61_1==UNSIGNED||LA61_1==VOID) ) {
                                alt61=1;
                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // Mininess.g:527:33: ',' parameter_declaration
                    	    {
                    	    char_literal224=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list4617); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal224);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list4619);
                    	    parameter_declaration225=parameter_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration225.getTree());

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
                    // 528:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ )
                    {
                        // Mininess.g:528:16: ^( PARAMETER_LIST ( parameter_declaration )+ )
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
                    // Mininess.g:530:13: 
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
                    // 530:13: -> ^( PARAMETER_LIST )
                    {
                        // Mininess.g:530:16: ^( PARAMETER_LIST )
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
    // Mininess.g:536:1: parameter_declaration : ( declaration_specifiers declarator -> ^( PARAMETER declaration_specifiers declarator ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) );
    public final MininessParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        MininessParser.parameter_declaration_return retval = new MininessParser.parameter_declaration_return();
        retval.start = input.LT(1);

        int parameter_declaration_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.declaration_specifiers_return declaration_specifiers226 =null;

        MininessParser.declarator_return declarator227 =null;

        MininessParser.declaration_specifiers_return declaration_specifiers228 =null;

        MininessParser.abstract_declarator_return abstract_declarator229 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_abstract_declarator=new RewriteRuleSubtreeStream(adaptor,"rule abstract_declarator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Mininess.g:537:5: ( declaration_specifiers declarator -> ^( PARAMETER declaration_specifiers declarator ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) )
            int alt64=2;
            switch ( input.LA(1) ) {
            case COMMAND:
            case EVENT:
            case TASK:
                {
                int LA64_1 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                int LA64_2 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA64_3 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA64_4 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA64_5 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA64_6 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA64_7 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA64_8 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 8, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA64_9 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 9, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA64_10 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA64_11 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 11, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA64_12 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 12, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA64_13 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 13, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA64_14 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 14, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA64_15 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 15, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA64_16 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 16, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA64_17 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 17, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case STRUCT:
                {
                int LA64_18 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 18, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA64_19 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 19, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA64_20 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 20, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
                {
                int LA64_21 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 21, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA64_22 = input.LA(2);

                if ( (synpred117_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 22, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // Mininess.g:537:10: declaration_specifiers declarator
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration4686);
                    declaration_specifiers226=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers226.getTree());

                    pushFollow(FOLLOW_declarator_in_parameter_declaration4688);
                    declarator227=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator227.getTree());

                    // AST REWRITE
                    // elements: declaration_specifiers, declarator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 538:13: -> ^( PARAMETER declaration_specifiers declarator )
                    {
                        // Mininess.g:538:16: ^( PARAMETER declaration_specifiers declarator )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        adaptor.addChild(root_1, stream_declarator.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Mininess.g:539:10: declaration_specifiers ( abstract_declarator )?
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration4721);
                    declaration_specifiers228=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers228.getTree());

                    // Mininess.g:539:33: ( abstract_declarator )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==LBRACKET||LA63_0==LPARENS||LA63_0==STAR) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // Mininess.g:539:33: abstract_declarator
                            {
                            pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration4723);
                            abstract_declarator229=abstract_declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_abstract_declarator.add(abstract_declarator229.getTree());

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
                    // 540:13: -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                    {
                        // Mininess.g:540:16: ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // Mininess.g:540:51: ( abstract_declarator )?
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


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // Mininess.g:542:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final MininessParser.type_name_return type_name() throws RecognitionException {
        MininessParser.type_name_return retval = new MininessParser.type_name_return();
        retval.start = input.LT(1);

        int type_name_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.specifier_qualifier_list_return specifier_qualifier_list230 =null;

        MininessParser.abstract_declarator_return abstract_declarator231 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Mininess.g:543:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // Mininess.g:543:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name4770);
            specifier_qualifier_list230=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list230.getTree());

            // Mininess.g:543:35: ( abstract_declarator )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LBRACKET||LA65_0==LPARENS||LA65_0==STAR) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // Mininess.g:543:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name4772);
                    abstract_declarator231=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator231.getTree());

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
    // Mininess.g:545:1: abstract_declarator : ( ( pointer )? direct_abstract_declarator | pointer );
    public final MininessParser.abstract_declarator_return abstract_declarator() throws RecognitionException {
        MininessParser.abstract_declarator_return retval = new MininessParser.abstract_declarator_return();
        retval.start = input.LT(1);

        int abstract_declarator_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.pointer_return pointer232 =null;

        MininessParser.direct_abstract_declarator_return direct_abstract_declarator233 =null;

        MininessParser.pointer_return pointer234 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Mininess.g:546:5: ( ( pointer )? direct_abstract_declarator | pointer )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==STAR) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred121_Mininess()) ) {
                    alt67=1;
                }
                else if ( (true) ) {
                    alt67=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA67_0==LBRACKET||LA67_0==LPARENS) ) {
                alt67=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }
            switch (alt67) {
                case 1 :
                    // Mininess.g:546:10: ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // Mininess.g:546:10: ( pointer )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==STAR) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Mininess.g:546:10: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator4792);
                            pointer232=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer232.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator4795);
                    direct_abstract_declarator233=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator233.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:547:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator4806);
                    pointer234=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer234.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Mininess.g:549:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )* ;
    public final MininessParser.direct_abstract_declarator_return direct_abstract_declarator() throws RecognitionException {
        MininessParser.direct_abstract_declarator_return retval = new MininessParser.direct_abstract_declarator_return();
        retval.start = input.LT(1);

        int direct_abstract_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal235=null;
        Token char_literal237=null;
        Token char_literal238=null;
        Token char_literal240=null;
        Token char_literal241=null;
        Token char_literal243=null;
        Token char_literal244=null;
        Token char_literal246=null;
        Token char_literal247=null;
        Token char_literal249=null;
        MininessParser.abstract_declarator_return abstract_declarator236 =null;

        MininessParser.assignment_expression_return assignment_expression239 =null;

        MininessParser.parameter_type_list_return parameter_type_list242 =null;

        MininessParser.assignment_expression_return assignment_expression245 =null;

        MininessParser.parameter_type_list_return parameter_type_list248 =null;


        Object char_literal235_tree=null;
        Object char_literal237_tree=null;
        Object char_literal238_tree=null;
        Object char_literal240_tree=null;
        Object char_literal241_tree=null;
        Object char_literal243_tree=null;
        Object char_literal244_tree=null;
        Object char_literal246_tree=null;
        Object char_literal247_tree=null;
        Object char_literal249_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Mininess.g:550:5: ( ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )* )
            // Mininess.g:550:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )*
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:550:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LPARENS) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==LBRACKET||LA70_1==LPARENS||LA70_1==STAR) ) {
                    alt70=1;
                }
                else if ( (LA70_1==CHAR||(LA70_1 >= COMMA && LA70_1 <= COMMAND)||LA70_1==CONST||LA70_1==DEFAULT||LA70_1==ENUM||LA70_1==EVENT||(LA70_1 >= INT && LA70_1 <= INT8_T)||LA70_1==LONG||(LA70_1 >= NX_STRUCT && LA70_1 <= NX_UINT8_T)||LA70_1==RAW_IDENTIFIER||LA70_1==RPARENS||(LA70_1 >= SHORT && LA70_1 <= SIGNED)||LA70_1==STRUCT||LA70_1==TASK||(LA70_1 >= UINT16_T && LA70_1 <= UINT8_T)||LA70_1==UNSIGNED||LA70_1==VOID) ) {
                    alt70=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA70_0==LBRACKET) ) {
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
                    // Mininess.g:550:11: '(' abstract_declarator ')'
                    {
                    char_literal235=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator4826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal235_tree = 
                    (Object)adaptor.create(char_literal235)
                    ;
                    adaptor.addChild(root_0, char_literal235_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator4828);
                    abstract_declarator236=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator236.getTree());

                    char_literal237=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator4833); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal237_tree = 
                    (Object)adaptor.create(char_literal237)
                    ;
                    adaptor.addChild(root_0, char_literal237_tree);
                    }

                    }
                    break;
                case 2 :
                    // Mininess.g:551:11: '[' ( assignment_expression )? ']'
                    {
                    char_literal238=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator4847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal238_tree = 
                    (Object)adaptor.create(char_literal238)
                    ;
                    adaptor.addChild(root_0, char_literal238_tree);
                    }

                    // Mininess.g:551:15: ( assignment_expression )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==AMP||LA68_0==BITCOMPLEMENT||LA68_0==CALL||LA68_0==CHARACTER_LITERAL||LA68_0==CONSTANT||LA68_0==LPARENS||LA68_0==MINUS||LA68_0==MINUSMINUS||LA68_0==NOT||LA68_0==PLUS||LA68_0==PLUSPLUS||LA68_0==POST||LA68_0==RAW_IDENTIFIER||LA68_0==SIZEOF||LA68_0==STAR||LA68_0==STRING_LITERAL) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Mininess.g:551:15: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator4849);
                            assignment_expression239=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression239.getTree());

                            }
                            break;

                    }


                    char_literal240=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator4852); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal240_tree = 
                    (Object)adaptor.create(char_literal240)
                    ;
                    adaptor.addChild(root_0, char_literal240_tree);
                    }

                    }
                    break;
                case 3 :
                    // Mininess.g:552:11: '(' ( parameter_type_list )? ')'
                    {
                    char_literal241=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator4866); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal241_tree = 
                    (Object)adaptor.create(char_literal241)
                    ;
                    adaptor.addChild(root_0, char_literal241_tree);
                    }

                    // Mininess.g:552:15: ( parameter_type_list )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==CHAR||(LA69_0 >= COMMA && LA69_0 <= COMMAND)||LA69_0==CONST||LA69_0==DEFAULT||LA69_0==ENUM||LA69_0==EVENT||(LA69_0 >= INT && LA69_0 <= INT8_T)||LA69_0==LONG||(LA69_0 >= NX_STRUCT && LA69_0 <= NX_UINT8_T)||LA69_0==RAW_IDENTIFIER||(LA69_0 >= SHORT && LA69_0 <= SIGNED)||LA69_0==STRUCT||LA69_0==TASK||(LA69_0 >= UINT16_T && LA69_0 <= UINT8_T)||LA69_0==UNSIGNED||LA69_0==VOID) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==RPARENS) ) {
                        int LA69_2 = input.LA(2);

                        if ( (synpred125_Mininess()) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // Mininess.g:552:15: parameter_type_list
                            {
                            pushFollow(FOLLOW_parameter_type_list_in_direct_abstract_declarator4868);
                            parameter_type_list242=parameter_type_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list242.getTree());

                            }
                            break;

                    }


                    char_literal243=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator4873); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal243_tree = 
                    (Object)adaptor.create(char_literal243)
                    ;
                    adaptor.addChild(root_0, char_literal243_tree);
                    }

                    }
                    break;

            }


            // Mininess.g:553:14: ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )*
            loop73:
            do {
                int alt73=3;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==LBRACKET) ) {
                    alt73=1;
                }
                else if ( (LA73_0==LPARENS) ) {
                    alt73=2;
                }


                switch (alt73) {
            	case 1 :
            	    // Mininess.g:553:15: '[' ( assignment_expression )? ']'
            	    {
            	    char_literal244=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator4890); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal244_tree = 
            	    (Object)adaptor.create(char_literal244)
            	    ;
            	    adaptor.addChild(root_0, char_literal244_tree);
            	    }

            	    // Mininess.g:553:19: ( assignment_expression )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==AMP||LA71_0==BITCOMPLEMENT||LA71_0==CALL||LA71_0==CHARACTER_LITERAL||LA71_0==CONSTANT||LA71_0==LPARENS||LA71_0==MINUS||LA71_0==MINUSMINUS||LA71_0==NOT||LA71_0==PLUS||LA71_0==PLUSPLUS||LA71_0==POST||LA71_0==RAW_IDENTIFIER||LA71_0==SIZEOF||LA71_0==STAR||LA71_0==STRING_LITERAL) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // Mininess.g:553:19: assignment_expression
            	            {
            	            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator4892);
            	            assignment_expression245=assignment_expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression245.getTree());

            	            }
            	            break;

            	    }


            	    char_literal246=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator4895); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal246_tree = 
            	    (Object)adaptor.create(char_literal246)
            	    ;
            	    adaptor.addChild(root_0, char_literal246_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:553:48: '(' ( parameter_type_list )? ')'
            	    {
            	    char_literal247=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator4899); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal247_tree = 
            	    (Object)adaptor.create(char_literal247)
            	    ;
            	    adaptor.addChild(root_0, char_literal247_tree);
            	    }

            	    // Mininess.g:553:52: ( parameter_type_list )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==CHAR||(LA72_0 >= COMMA && LA72_0 <= COMMAND)||LA72_0==CONST||LA72_0==DEFAULT||LA72_0==ENUM||LA72_0==EVENT||(LA72_0 >= INT && LA72_0 <= INT8_T)||LA72_0==LONG||(LA72_0 >= NX_STRUCT && LA72_0 <= NX_UINT8_T)||LA72_0==RAW_IDENTIFIER||(LA72_0 >= SHORT && LA72_0 <= SIGNED)||LA72_0==STRUCT||LA72_0==TASK||(LA72_0 >= UINT16_T && LA72_0 <= UINT8_T)||LA72_0==UNSIGNED||LA72_0==VOID) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==RPARENS) ) {
            	        int LA72_2 = input.LA(2);

            	        if ( (synpred128_Mininess()) ) {
            	            alt72=1;
            	        }
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // Mininess.g:553:52: parameter_type_list
            	            {
            	            pushFollow(FOLLOW_parameter_type_list_in_direct_abstract_declarator4901);
            	            parameter_type_list248=parameter_type_list();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list248.getTree());

            	            }
            	            break;

            	    }


            	    char_literal249=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator4904); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal249_tree = 
            	    (Object)adaptor.create(char_literal249)
            	    ;
            	    adaptor.addChild(root_0, char_literal249_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // Mininess.g:556:1: typedef_name : id= RAW_IDENTIFIER {...}?;
    public final MininessParser.typedef_name_return typedef_name() throws RecognitionException {
        MininessParser.typedef_name_return retval = new MininessParser.typedef_name_return();
        retval.start = input.LT(1);

        int typedef_name_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Mininess.g:557:5: (id= RAW_IDENTIFIER {...}?)
            // Mininess.g:557:10: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name4933); if (state.failed) return retval;
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
    // Mininess.g:565:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
    public final MininessParser.initializer_return initializer() throws RecognitionException {
        MininessParser.initializer_return retval = new MininessParser.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal251=null;
        Token char_literal253=null;
        Token char_literal254=null;
        MininessParser.assignment_expression_return assignment_expression250 =null;

        MininessParser.initializer_list_return initializer_list252 =null;


        Object char_literal251_tree=null;
        Object char_literal253_tree=null;
        Object char_literal254_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Mininess.g:566:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==AMP||LA75_0==BITCOMPLEMENT||LA75_0==CALL||LA75_0==CHARACTER_LITERAL||LA75_0==CONSTANT||LA75_0==LPARENS||LA75_0==MINUS||LA75_0==MINUSMINUS||LA75_0==NOT||LA75_0==PLUS||LA75_0==PLUSPLUS||LA75_0==POST||LA75_0==RAW_IDENTIFIER||LA75_0==SIZEOF||LA75_0==STAR||LA75_0==STRING_LITERAL) ) {
                alt75=1;
            }
            else if ( (LA75_0==LBRACE) ) {
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
                    // Mininess.g:566:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer4968);
                    assignment_expression250=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression250.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:567:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal251=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer4979); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal251);


                    pushFollow(FOLLOW_initializer_list_in_initializer4981);
                    initializer_list252=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list252.getTree());

                    // Mininess.g:567:31: ( ',' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==COMMA) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // Mininess.g:567:31: ','
                            {
                            char_literal253=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer4983); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal253);


                            }
                            break;

                    }


                    char_literal254=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer4986); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal254);


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
                    // 567:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // Mininess.g:567:43: ^( INITIALIZER_LIST initializer_list )
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
    // Mininess.g:569:1: initializer_list : initializer ( ',' initializer )* -> ( initializer )+ ;
    public final MininessParser.initializer_list_return initializer_list() throws RecognitionException {
        MininessParser.initializer_list_return retval = new MininessParser.initializer_list_return();
        retval.start = input.LT(1);

        int initializer_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal256=null;
        MininessParser.initializer_return initializer255 =null;

        MininessParser.initializer_return initializer257 =null;


        Object char_literal256_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Mininess.g:570:5: ( initializer ( ',' initializer )* -> ( initializer )+ )
            // Mininess.g:570:10: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializer_list5013);
            initializer255=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer255.getTree());

            // Mininess.g:570:22: ( ',' initializer )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==COMMA) ) {
                    int LA76_1 = input.LA(2);

                    if ( (LA76_1==AMP||LA76_1==BITCOMPLEMENT||LA76_1==CALL||LA76_1==CHARACTER_LITERAL||LA76_1==CONSTANT||LA76_1==LBRACE||LA76_1==LPARENS||LA76_1==MINUS||LA76_1==MINUSMINUS||LA76_1==NOT||LA76_1==PLUS||LA76_1==PLUSPLUS||LA76_1==POST||LA76_1==RAW_IDENTIFIER||LA76_1==SIZEOF||LA76_1==STAR||LA76_1==STRING_LITERAL) ) {
                        alt76=1;
                    }


                }


                switch (alt76) {
            	case 1 :
            	    // Mininess.g:570:23: ',' initializer
            	    {
            	    char_literal256=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list5016); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal256);


            	    pushFollow(FOLLOW_initializer_in_initializer_list5018);
            	    initializer257=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer257.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
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
            // 570:41: -> ( initializer )+
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
    // Mininess.g:576:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | line_directive );
    public final MininessParser.statement_return statement() throws RecognitionException {
        MininessParser.statement_return retval = new MininessParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.labeled_statement_return labeled_statement258 =null;

        MininessParser.compound_statement_return compound_statement259 =null;

        MininessParser.expression_statement_return expression_statement260 =null;

        MininessParser.selection_statement_return selection_statement261 =null;

        MininessParser.iteration_statement_return iteration_statement262 =null;

        MininessParser.jump_statement_return jump_statement263 =null;

        MininessParser.line_directive_return line_directive264 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Mininess.g:577:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | line_directive )
            int alt77=7;
            switch ( input.LA(1) ) {
            case CASE:
            case DEFAULT:
                {
                alt77=1;
                }
                break;
            case LBRACE:
                {
                alt77=2;
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
            case 140:
                {
                alt77=3;
                }
                break;
            case IF:
            case SWITCH:
                {
                alt77=4;
                }
                break;
            case FOR:
            case WHILE:
                {
                alt77=5;
                }
                break;
            case RETURN:
                {
                alt77=6;
                }
                break;
            case HASH:
                {
                alt77=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }

            switch (alt77) {
                case 1 :
                    // Mininess.g:577:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement5051);
                    labeled_statement258=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement258.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:578:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement5062);
                    compound_statement259=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement259.getTree());

                    }
                    break;
                case 3 :
                    // Mininess.g:579:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement5073);
                    expression_statement260=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement260.getTree());

                    }
                    break;
                case 4 :
                    // Mininess.g:580:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement5084);
                    selection_statement261=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement261.getTree());

                    }
                    break;
                case 5 :
                    // Mininess.g:581:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement5095);
                    iteration_statement262=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement262.getTree());

                    }
                    break;
                case 6 :
                    // Mininess.g:582:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement5106);
                    jump_statement263=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement263.getTree());

                    }
                    break;
                case 7 :
                    // Mininess.g:583:10: line_directive
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_line_directive_in_statement5117);
                    line_directive264=line_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive264.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class labeled_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "labeled_statement"
    // Mininess.g:586:1: labeled_statement : ( CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final MininessParser.labeled_statement_return labeled_statement() throws RecognitionException {
        MininessParser.labeled_statement_return retval = new MininessParser.labeled_statement_return();
        retval.start = input.LT(1);

        int labeled_statement_StartIndex = input.index();

        Object root_0 = null;

        Token CASE265=null;
        Token char_literal267=null;
        Token DEFAULT269=null;
        Token char_literal270=null;
        MininessParser.constant_expression_return constant_expression266 =null;

        MininessParser.statement_return statement268 =null;

        MininessParser.statement_return statement271 =null;


        Object CASE265_tree=null;
        Object char_literal267_tree=null;
        Object DEFAULT269_tree=null;
        Object char_literal270_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Mininess.g:587:5: ( CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==CASE) ) {
                alt78=1;
            }
            else if ( (LA78_0==DEFAULT) ) {
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
                    // Mininess.g:587:10: CASE constant_expression ':' statement
                    {
                    CASE265=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement5145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE265);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement5147);
                    constant_expression266=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression266.getTree());

                    char_literal267=(Token)match(input,139,FOLLOW_139_in_labeled_statement5149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_139.add(char_literal267);


                    pushFollow(FOLLOW_statement_in_labeled_statement5151);
                    statement268=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement268.getTree());

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
                    // 587:49: -> ^( CASE constant_expression statement )
                    {
                        // Mininess.g:587:52: ^( CASE constant_expression statement )
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
                    // Mininess.g:588:10: DEFAULT ':' statement
                    {
                    DEFAULT269=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement5172); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT269);


                    char_literal270=(Token)match(input,139,FOLLOW_139_in_labeled_statement5174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_139.add(char_literal270);


                    pushFollow(FOLLOW_statement_in_labeled_statement5176);
                    statement271=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement271.getTree());

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
                    // 588:32: -> ^( DEFAULT statement )
                    {
                        // Mininess.g:588:35: ^( DEFAULT statement )
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
            if ( state.backtracking>0 ) { memoize(input, 56, labeled_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "labeled_statement"


    public static class compound_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compound_statement"
    // Mininess.g:593:1: compound_statement : '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) ;
    public final MininessParser.compound_statement_return compound_statement() throws RecognitionException {
        MininessParser.compound_statement_return retval = new MininessParser.compound_statement_return();
        retval.start = input.LT(1);

        int compound_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal272=null;
        Token char_literal274=null;
        MininessParser.block_item_return block_item273 =null;


        Object char_literal272_tree=null;
        Object char_literal274_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_block_item=new RewriteRuleSubtreeStream(adaptor,"rule block_item");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Mininess.g:594:5: ( '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) )
            // Mininess.g:594:10: '{' ( block_item )* '}'
            {
            char_literal272=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement5202); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal272);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // Mininess.g:595:10: ( block_item )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==AMP||LA79_0==BITCOMPLEMENT||(LA79_0 >= CALL && LA79_0 <= CASE)||(LA79_0 >= CHAR && LA79_0 <= CHARACTER_LITERAL)||LA79_0==COMMAND||(LA79_0 >= CONST && LA79_0 <= CONSTANT)||LA79_0==DEFAULT||LA79_0==ENUM||LA79_0==EVENT||LA79_0==FOR||LA79_0==HASH||LA79_0==IF||(LA79_0 >= INT && LA79_0 <= INT8_T)||LA79_0==LBRACE||(LA79_0 >= LONG && LA79_0 <= LPARENS)||LA79_0==MINUS||LA79_0==MINUSMINUS||LA79_0==NOT||(LA79_0 >= NX_STRUCT && LA79_0 <= NX_UINT8_T)||LA79_0==PLUS||LA79_0==PLUSPLUS||LA79_0==POST||LA79_0==RAW_IDENTIFIER||LA79_0==RETURN||(LA79_0 >= SHORT && LA79_0 <= SIZEOF)||LA79_0==STAR||(LA79_0 >= STRING_LITERAL && LA79_0 <= UINT8_T)||LA79_0==UNSIGNED||(LA79_0 >= VOID && LA79_0 <= WHILE)||LA79_0==140) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // Mininess.g:595:10: block_item
            	    {
            	    pushFollow(FOLLOW_block_item_in_compound_statement5215);
            	    block_item273=block_item();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block_item.add(block_item273.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal274=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement5233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal274);


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
            // 596:44: -> ^( COMPOUND_STATEMENT ( block_item )* )
            {
                // Mininess.g:596:47: ^( COMPOUND_STATEMENT ( block_item )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // Mininess.g:596:68: ( block_item )*
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
            if ( state.backtracking>0 ) { memoize(input, 57, compound_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "compound_statement"


    public static class block_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_item"
    // Mininess.g:598:1: block_item : ( declaration | statement );
    public final MininessParser.block_item_return block_item() throws RecognitionException {
        MininessParser.block_item_return retval = new MininessParser.block_item_return();
        retval.start = input.LT(1);

        int block_item_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.declaration_return declaration275 =null;

        MininessParser.statement_return statement276 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Mininess.g:599:5: ( declaration | statement )
            int alt80=2;
            switch ( input.LA(1) ) {
            case CHAR:
            case COMMAND:
            case CONST:
            case ENUM:
            case EVENT:
            case INT:
            case INT16_T:
            case INT32_T:
            case INT8_T:
            case LONG:
            case NX_STRUCT:
            case NX_UINT16_T:
            case NX_UINT32_T:
            case NX_UINT8_T:
            case SHORT:
            case SIGNED:
            case STRUCT:
            case TASK:
            case TYPEDEF:
            case UINT16_T:
            case UINT32_T:
            case UINT8_T:
            case UNSIGNED:
            case VOID:
                {
                alt80=1;
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA80_20 = input.LA(2);

                if ( (synpred141_Mininess()) ) {
                    alt80=1;
                }
                else if ( (true) ) {
                    alt80=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 20, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA80_22 = input.LA(2);

                if ( (synpred141_Mininess()) ) {
                    alt80=1;
                }
                else if ( (true) ) {
                    alt80=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 22, input);

                    throw nvae;

                }
                }
                break;
            case AMP:
            case BITCOMPLEMENT:
            case CALL:
            case CASE:
            case CHARACTER_LITERAL:
            case CONSTANT:
            case FOR:
            case HASH:
            case IF:
            case LBRACE:
            case LPARENS:
            case MINUS:
            case MINUSMINUS:
            case NOT:
            case PLUS:
            case PLUSPLUS:
            case POST:
            case RETURN:
            case SIZEOF:
            case STAR:
            case STRING_LITERAL:
            case SWITCH:
            case WHILE:
            case 140:
                {
                alt80=2;
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
                    // Mininess.g:599:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_block_item5257);
                    declaration275=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration275.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:600:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_block_item5268);
                    statement276=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement276.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, block_item_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "block_item"


    public static class expression_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_statement"
    // Mininess.g:606:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final MininessParser.expression_statement_return expression_statement() throws RecognitionException {
        MininessParser.expression_statement_return retval = new MininessParser.expression_statement_return();
        retval.start = input.LT(1);

        int expression_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal278=null;
        MininessParser.expression_return expression277 =null;


        Object char_literal278_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Mininess.g:607:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // Mininess.g:607:10: ( expression )? ';'
            {
            // Mininess.g:607:10: ( expression )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==AMP||LA81_0==BITCOMPLEMENT||LA81_0==CALL||LA81_0==CHARACTER_LITERAL||LA81_0==CONSTANT||LA81_0==LPARENS||LA81_0==MINUS||LA81_0==MINUSMINUS||LA81_0==NOT||LA81_0==PLUS||LA81_0==PLUSPLUS||LA81_0==POST||LA81_0==RAW_IDENTIFIER||LA81_0==SIZEOF||LA81_0==STAR||LA81_0==STRING_LITERAL) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Mininess.g:607:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement5291);
                    expression277=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression277.getTree());

                    }
                    break;

            }


            char_literal278=(Token)match(input,140,FOLLOW_140_in_expression_statement5294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_140.add(char_literal278);


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
            // 607:26: -> ^( STATEMENT ( expression )? )
            {
                // Mininess.g:607:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // Mininess.g:607:41: ( expression )?
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
            if ( state.backtracking>0 ) { memoize(input, 59, expression_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression_statement"


    public static class selection_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_statement"
    // Mininess.g:609:1: selection_statement : ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final MininessParser.selection_statement_return selection_statement() throws RecognitionException {
        MininessParser.selection_statement_return retval = new MininessParser.selection_statement_return();
        retval.start = input.LT(1);

        int selection_statement_StartIndex = input.index();

        Object root_0 = null;

        Token IF279=null;
        Token char_literal280=null;
        Token char_literal282=null;
        Token ELSE284=null;
        Token SWITCH286=null;
        Token char_literal287=null;
        Token char_literal289=null;
        MininessParser.expression_return expression281 =null;

        MininessParser.statement_return statement283 =null;

        MininessParser.statement_return statement285 =null;

        MininessParser.expression_return expression288 =null;

        MininessParser.statement_return statement290 =null;


        Object IF279_tree=null;
        Object char_literal280_tree=null;
        Object char_literal282_tree=null;
        Object ELSE284_tree=null;
        Object SWITCH286_tree=null;
        Object char_literal287_tree=null;
        Object char_literal289_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Mininess.g:610:5: ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==IF) ) {
                alt83=1;
            }
            else if ( (LA83_0==SWITCH) ) {
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
                    // Mininess.g:610:10: IF '(' expression ')' statement ( ELSE statement )?
                    {
                    IF279=(Token)match(input,IF,FOLLOW_IF_in_selection_statement5322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF279);


                    char_literal280=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement5324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal280);


                    pushFollow(FOLLOW_expression_in_selection_statement5326);
                    expression281=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression281.getTree());

                    char_literal282=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement5328); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal282);


                    pushFollow(FOLLOW_statement_in_selection_statement5330);
                    statement283=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement283.getTree());

                    // Mininess.g:610:42: ( ELSE statement )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==ELSE) ) {
                        int LA82_1 = input.LA(2);

                        if ( (synpred143_Mininess()) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // Mininess.g:610:43: ELSE statement
                            {
                            ELSE284=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement5333); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE284);


                            pushFollow(FOLLOW_statement_in_selection_statement5335);
                            statement285=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(statement285.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: statement, statement, expression, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 611:14: -> ^( IF expression statement ( statement )? )
                    {
                        // Mininess.g:611:17: ^( IF expression statement ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        // Mininess.g:611:43: ( statement )?
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
                    // Mininess.g:612:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH286=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement5374); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH286);


                    char_literal287=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement5376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal287);


                    pushFollow(FOLLOW_expression_in_selection_statement5378);
                    expression288=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression288.getTree());

                    char_literal289=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement5380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal289);


                    pushFollow(FOLLOW_statement_in_selection_statement5382);
                    statement290=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement290.getTree());

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
                    // 613:14: -> ^( SWITCH expression statement )
                    {
                        // Mininess.g:613:17: ^( SWITCH expression statement )
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
            if ( state.backtracking>0 ) { memoize(input, 60, selection_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "selection_statement"


    public static class iteration_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_statement"
    // Mininess.g:619:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final MininessParser.iteration_statement_return iteration_statement() throws RecognitionException {
        MininessParser.iteration_statement_return retval = new MininessParser.iteration_statement_return();
        retval.start = input.LT(1);

        int iteration_statement_StartIndex = input.index();

        Object root_0 = null;

        Token WHILE291=null;
        Token char_literal292=null;
        Token char_literal294=null;
        Token FOR296=null;
        Token char_literal297=null;
        Token char_literal298=null;
        Token char_literal299=null;
        Token char_literal300=null;
        MininessParser.expression_return init =null;

        MininessParser.expression_return cond =null;

        MininessParser.expression_return iter =null;

        MininessParser.expression_return expression293 =null;

        MininessParser.statement_return statement295 =null;

        MininessParser.statement_return statement301 =null;


        Object WHILE291_tree=null;
        Object char_literal292_tree=null;
        Object char_literal294_tree=null;
        Object FOR296_tree=null;
        Object char_literal297_tree=null;
        Object char_literal298_tree=null;
        Object char_literal299_tree=null;
        Object char_literal300_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Mininess.g:620:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==WHILE) ) {
                alt87=1;
            }
            else if ( (LA87_0==FOR) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }
            switch (alt87) {
                case 1 :
                    // Mininess.g:620:10: WHILE '(' expression ')' statement
                    {
                    WHILE291=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement5428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE291);


                    char_literal292=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement5430); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal292);


                    pushFollow(FOLLOW_expression_in_iteration_statement5432);
                    expression293=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression293.getTree());

                    char_literal294=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement5434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal294);


                    pushFollow(FOLLOW_statement_in_iteration_statement5436);
                    statement295=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement295.getTree());

                    // AST REWRITE
                    // elements: WHILE, expression, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 620:45: -> ^( WHILE expression statement )
                    {
                        // Mininess.g:620:48: ^( WHILE expression statement )
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
                    // Mininess.g:621:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR296=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement5457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR296);


                    char_literal297=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement5459); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal297);


                    // Mininess.g:621:22: (init= expression )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==AMP||LA84_0==BITCOMPLEMENT||LA84_0==CALL||LA84_0==CHARACTER_LITERAL||LA84_0==CONSTANT||LA84_0==LPARENS||LA84_0==MINUS||LA84_0==MINUSMINUS||LA84_0==NOT||LA84_0==PLUS||LA84_0==PLUSPLUS||LA84_0==POST||LA84_0==RAW_IDENTIFIER||LA84_0==SIZEOF||LA84_0==STAR||LA84_0==STRING_LITERAL) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // Mininess.g:621:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement5463);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal298=(Token)match(input,140,FOLLOW_140_in_iteration_statement5466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_140.add(char_literal298);


                    // Mininess.g:621:43: (cond= expression )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==AMP||LA85_0==BITCOMPLEMENT||LA85_0==CALL||LA85_0==CHARACTER_LITERAL||LA85_0==CONSTANT||LA85_0==LPARENS||LA85_0==MINUS||LA85_0==MINUSMINUS||LA85_0==NOT||LA85_0==PLUS||LA85_0==PLUSPLUS||LA85_0==POST||LA85_0==RAW_IDENTIFIER||LA85_0==SIZEOF||LA85_0==STAR||LA85_0==STRING_LITERAL) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // Mininess.g:621:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement5470);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal299=(Token)match(input,140,FOLLOW_140_in_iteration_statement5473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_140.add(char_literal299);


                    // Mininess.g:621:64: (iter= expression )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==AMP||LA86_0==BITCOMPLEMENT||LA86_0==CALL||LA86_0==CHARACTER_LITERAL||LA86_0==CONSTANT||LA86_0==LPARENS||LA86_0==MINUS||LA86_0==MINUSMINUS||LA86_0==NOT||LA86_0==PLUS||LA86_0==PLUSPLUS||LA86_0==POST||LA86_0==RAW_IDENTIFIER||LA86_0==SIZEOF||LA86_0==STAR||LA86_0==STRING_LITERAL) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // Mininess.g:621:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement5477);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal300=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement5480); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal300);


                    pushFollow(FOLLOW_statement_in_iteration_statement5482);
                    statement301=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement301.getTree());

                    // AST REWRITE
                    // elements: statement, init, iter, cond, FOR
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
                    // 622:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // Mininess.g:622:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // Mininess.g:622:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // Mininess.g:622:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // Mininess.g:623:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // Mininess.g:623:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // Mininess.g:624:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // Mininess.g:624:40: ( $iter)?
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
            if ( state.backtracking>0 ) { memoize(input, 61, iteration_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "iteration_statement"


    public static class jump_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_statement"
    // Mininess.g:626:1: jump_statement : RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) ;
    public final MininessParser.jump_statement_return jump_statement() throws RecognitionException {
        MininessParser.jump_statement_return retval = new MininessParser.jump_statement_return();
        retval.start = input.LT(1);

        int jump_statement_StartIndex = input.index();

        Object root_0 = null;

        Token RETURN302=null;
        Token char_literal304=null;
        MininessParser.expression_return expression303 =null;


        Object RETURN302_tree=null;
        Object char_literal304_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Mininess.g:627:5: ( RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
            // Mininess.g:627:10: RETURN ( expression )? ';'
            {
            RETURN302=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement5589); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN302);


            // Mininess.g:627:17: ( expression )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==AMP||LA88_0==BITCOMPLEMENT||LA88_0==CALL||LA88_0==CHARACTER_LITERAL||LA88_0==CONSTANT||LA88_0==LPARENS||LA88_0==MINUS||LA88_0==MINUSMINUS||LA88_0==NOT||LA88_0==PLUS||LA88_0==PLUSPLUS||LA88_0==POST||LA88_0==RAW_IDENTIFIER||LA88_0==SIZEOF||LA88_0==STAR||LA88_0==STRING_LITERAL) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // Mininess.g:627:17: expression
                    {
                    pushFollow(FOLLOW_expression_in_jump_statement5591);
                    expression303=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression303.getTree());

                    }
                    break;

            }


            char_literal304=(Token)match(input,140,FOLLOW_140_in_jump_statement5594); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_140.add(char_literal304);


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
            // 627:33: -> ^( RETURN ( expression )? )
            {
                // Mininess.g:627:36: ^( RETURN ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_RETURN.nextNode()
                , root_1);

                // Mininess.g:627:45: ( expression )?
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
            if ( state.backtracking>0 ) { memoize(input, 62, jump_statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "jump_statement"


    public static class translation_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "translation_unit"
    // Mininess.g:633:1: translation_unit : ( external_declaration | line_directive )+ ;
    public final MininessParser.translation_unit_return translation_unit() throws RecognitionException {
        MininessParser.translation_unit_return retval = new MininessParser.translation_unit_return();
        retval.start = input.LT(1);

        int translation_unit_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.external_declaration_return external_declaration305 =null;

        MininessParser.line_directive_return line_directive306 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Mininess.g:634:5: ( ( external_declaration | line_directive )+ )
            // Mininess.g:634:10: ( external_declaration | line_directive )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:634:10: ( external_declaration | line_directive )+
            int cnt89=0;
            loop89:
            do {
                int alt89=3;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==CHAR||LA89_0==COMMAND||LA89_0==CONST||LA89_0==DEFAULT||LA89_0==ENUM||LA89_0==EVENT||(LA89_0 >= INT && LA89_0 <= INT8_T)||LA89_0==LONG||(LA89_0 >= NX_STRUCT && LA89_0 <= NX_UINT8_T)||LA89_0==RAW_IDENTIFIER||(LA89_0 >= SHORT && LA89_0 <= SIGNED)||LA89_0==STRUCT||(LA89_0 >= TASK && LA89_0 <= UINT8_T)||LA89_0==UNSIGNED||LA89_0==VOID) ) {
                    alt89=1;
                }
                else if ( (LA89_0==HASH) ) {
                    alt89=2;
                }


                switch (alt89) {
            	case 1 :
            	    // Mininess.g:634:11: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit5630);
            	    external_declaration305=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration305.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:634:34: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit5634);
            	    line_directive306=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive306.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
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
            if ( state.backtracking>0 ) { memoize(input, 63, translation_unit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "translation_unit"


    public static class external_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "external_declaration"
    // Mininess.g:637:1: external_declaration : declaration ;
    public final MininessParser.external_declaration_return external_declaration() throws RecognitionException {
        MininessParser.external_declaration_return retval = new MininessParser.external_declaration_return();
        retval.start = input.LT(1);

        int external_declaration_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.declaration_return declaration307 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Mininess.g:638:5: ( declaration )
            // Mininess.g:638:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration5652);
            declaration307=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration307.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 64, external_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "external_declaration"


    public static class line_directive_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line_directive"
    // Mininess.g:652:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )? -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final MininessParser.line_directive_return line_directive() throws RecognitionException {
        MininessParser.line_directive_return retval = new MininessParser.line_directive_return();
        retval.start = input.LT(1);

        int line_directive_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal308=null;
        Token CONSTANT309=null;
        Token STRING_LITERAL310=null;
        Token CONSTANT311=null;

        Object char_literal308_tree=null;
        Object CONSTANT309_tree=null;
        Object STRING_LITERAL310_tree=null;
        Object CONSTANT311_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Mininess.g:653:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )? -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // Mininess.g:653:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )?
            {
            char_literal308=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive5679); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal308);


            CONSTANT309=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive5681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT309);


            STRING_LITERAL310=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive5683); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL310);


            // Mininess.g:653:38: ( CONSTANT )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==CONSTANT) ) {
                int LA90_1 = input.LA(2);

                if ( (synpred152_Mininess()) ) {
                    alt90=1;
                }
            }
            switch (alt90) {
                case 1 :
                    // Mininess.g:653:38: CONSTANT
                    {
                    CONSTANT311=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive5685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT311);


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
            // 653:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // Mininess.g:653:51: ^( LINE_DIRECTIVE STRING_LITERAL )
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
            if ( state.backtracking>0 ) { memoize(input, 65, line_directive_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "line_directive"


    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_definition"
    // Mininess.g:655:1: function_definition : declaration_specifiers declarator compound_statement -> declaration_specifiers declarator compound_statement ;
    public final MininessParser.function_definition_return function_definition() throws RecognitionException {
        MininessParser.function_definition_return retval = new MininessParser.function_definition_return();
        retval.start = input.LT(1);

        int function_definition_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.declaration_specifiers_return declaration_specifiers312 =null;

        MininessParser.declarator_return declarator313 =null;

        MininessParser.compound_statement_return compound_statement314 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Mininess.g:656:5: ( declaration_specifiers declarator compound_statement -> declaration_specifiers declarator compound_statement )
            // Mininess.g:656:10: declaration_specifiers declarator compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition5713);
            declaration_specifiers312=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers312.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition5715);
            declarator313=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator313.getTree());

            pushFollow(FOLLOW_compound_statement_in_function_definition5717);
            compound_statement314=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement314.getTree());

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
            // 657:13: -> declaration_specifiers declarator compound_statement
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
            if ( state.backtracking>0 ) { memoize(input, 66, function_definition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "function_definition"


    public static class mininess_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mininess_file"
    // Mininess.g:669:1: mininess_file : ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) );
    public final MininessParser.mininess_file_return mininess_file() throws RecognitionException {
        MininessParser.mininess_file_return retval = new MininessParser.mininess_file_return();
        retval.start = input.LT(1);

        int mininess_file_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.translation_unit_return translation_unit315 =null;

        MininessParser.interface_definition_return interface_definition316 =null;

        MininessParser.translation_unit_return translation_unit317 =null;

        MininessParser.component_return component318 =null;


        RewriteRuleSubtreeStream stream_component=new RewriteRuleSubtreeStream(adaptor,"rule component");
        RewriteRuleSubtreeStream stream_interface_definition=new RewriteRuleSubtreeStream(adaptor,"rule interface_definition");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Mininess.g:670:5: ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) )
            int alt93=2;
            switch ( input.LA(1) ) {
            case COMMAND:
            case EVENT:
            case TASK:
                {
                int LA93_1 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
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
                break;
            case VOID:
                {
                int LA93_2 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHAR:
                {
                int LA93_3 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 3, input);

                    throw nvae;

                }
                }
                break;
            case SHORT:
                {
                int LA93_4 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 4, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA93_5 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONG:
                {
                int LA93_6 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 6, input);

                    throw nvae;

                }
                }
                break;
            case SIGNED:
                {
                int LA93_7 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 7, input);

                    throw nvae;

                }
                }
                break;
            case UNSIGNED:
                {
                int LA93_8 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 8, input);

                    throw nvae;

                }
                }
                break;
            case INT8_T:
                {
                int LA93_9 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 9, input);

                    throw nvae;

                }
                }
                break;
            case INT16_T:
                {
                int LA93_10 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 10, input);

                    throw nvae;

                }
                }
                break;
            case INT32_T:
                {
                int LA93_11 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 11, input);

                    throw nvae;

                }
                }
                break;
            case UINT8_T:
                {
                int LA93_12 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 12, input);

                    throw nvae;

                }
                }
                break;
            case UINT16_T:
                {
                int LA93_13 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 13, input);

                    throw nvae;

                }
                }
                break;
            case UINT32_T:
                {
                int LA93_14 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 14, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT8_T:
                {
                int LA93_15 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 15, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT16_T:
                {
                int LA93_16 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 16, input);

                    throw nvae;

                }
                }
                break;
            case NX_UINT32_T:
                {
                int LA93_17 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 17, input);

                    throw nvae;

                }
                }
                break;
            case NX_STRUCT:
            case STRUCT:
                {
                int LA93_18 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 18, input);

                    throw nvae;

                }
                }
                break;
            case ENUM:
                {
                int LA93_19 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 19, input);

                    throw nvae;

                }
                }
                break;
            case RAW_IDENTIFIER:
                {
                int LA93_20 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 20, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
                {
                int LA93_21 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 21, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA93_22 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 22, input);

                    throw nvae;

                }
                }
                break;
            case TYPEDEF:
                {
                int LA93_23 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 23, input);

                    throw nvae;

                }
                }
                break;
            case HASH:
                {
                int LA93_24 = input.LA(2);

                if ( (synpred154_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 24, input);

                    throw nvae;

                }
                }
                break;
            case INTERFACE:
                {
                alt93=1;
                }
                break;
            case MODULE:
                {
                alt93=2;
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
                    // Mininess.g:670:10: ( translation_unit )? interface_definition
                    {
                    // Mininess.g:670:10: ( translation_unit )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==CHAR||LA91_0==COMMAND||LA91_0==CONST||LA91_0==DEFAULT||LA91_0==ENUM||LA91_0==EVENT||LA91_0==HASH||(LA91_0 >= INT && LA91_0 <= INT8_T)||LA91_0==LONG||(LA91_0 >= NX_STRUCT && LA91_0 <= NX_UINT8_T)||LA91_0==RAW_IDENTIFIER||(LA91_0 >= SHORT && LA91_0 <= SIGNED)||LA91_0==STRUCT||(LA91_0 >= TASK && LA91_0 <= UINT8_T)||LA91_0==UNSIGNED||LA91_0==VOID) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // Mininess.g:670:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_mininess_file5765);
                            translation_unit315=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit315.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_interface_definition_in_mininess_file5768);
                    interface_definition316=interface_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_definition.add(interface_definition316.getTree());

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
                    // 670:49: -> ^( FILE ( translation_unit )? interface_definition )
                    {
                        // Mininess.g:670:52: ^( FILE ( translation_unit )? interface_definition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // Mininess.g:670:59: ( translation_unit )?
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
                    // Mininess.g:671:10: ( translation_unit )? component
                    {
                    // Mininess.g:671:10: ( translation_unit )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==CHAR||LA92_0==COMMAND||LA92_0==CONST||LA92_0==DEFAULT||LA92_0==ENUM||LA92_0==EVENT||LA92_0==HASH||(LA92_0 >= INT && LA92_0 <= INT8_T)||LA92_0==LONG||(LA92_0 >= NX_STRUCT && LA92_0 <= NX_UINT8_T)||LA92_0==RAW_IDENTIFIER||(LA92_0 >= SHORT && LA92_0 <= SIGNED)||LA92_0==STRUCT||(LA92_0 >= TASK && LA92_0 <= UINT8_T)||LA92_0==UNSIGNED||LA92_0==VOID) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Mininess.g:671:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_mininess_file5790);
                            translation_unit317=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit317.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_component_in_mininess_file5793);
                    component318=component();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component.add(component318.getTree());

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
                    // 671:38: -> ^( FILE ( translation_unit )? component )
                    {
                        // Mininess.g:671:41: ^( FILE ( translation_unit )? component )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // Mininess.g:671:48: ( translation_unit )?
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
            if ( state.backtracking>0 ) { memoize(input, 67, mininess_file_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "mininess_file"


    public static class interface_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_definition"
    // Mininess.g:674:1: interface_definition : INTERFACE identifier '{' ( declaration | line_directive )* '}' -> ^( INTERFACE identifier ( declaration )* ) ;
    public final MininessParser.interface_definition_return interface_definition() throws RecognitionException {
        MininessParser.interface_definition_return retval = new MininessParser.interface_definition_return();
        retval.start = input.LT(1);

        int interface_definition_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE319=null;
        Token char_literal321=null;
        Token char_literal324=null;
        MininessParser.identifier_return identifier320 =null;

        MininessParser.declaration_return declaration322 =null;

        MininessParser.line_directive_return line_directive323 =null;


        Object INTERFACE319_tree=null;
        Object char_literal321_tree=null;
        Object char_literal324_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Mininess.g:675:5: ( INTERFACE identifier '{' ( declaration | line_directive )* '}' -> ^( INTERFACE identifier ( declaration )* ) )
            // Mininess.g:675:10: INTERFACE identifier '{' ( declaration | line_directive )* '}'
            {
            INTERFACE319=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_definition5820); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE319);


            pushFollow(FOLLOW_identifier_in_interface_definition5822);
            identifier320=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier320.getTree());

            char_literal321=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interface_definition5832); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal321);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // Mininess.g:677:9: ( declaration | line_directive )*
            loop94:
            do {
                int alt94=3;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==CHAR||LA94_0==COMMAND||LA94_0==CONST||LA94_0==DEFAULT||LA94_0==ENUM||LA94_0==EVENT||(LA94_0 >= INT && LA94_0 <= INT8_T)||LA94_0==LONG||(LA94_0 >= NX_STRUCT && LA94_0 <= NX_UINT8_T)||LA94_0==RAW_IDENTIFIER||(LA94_0 >= SHORT && LA94_0 <= SIGNED)||LA94_0==STRUCT||(LA94_0 >= TASK && LA94_0 <= UINT8_T)||LA94_0==UNSIGNED||LA94_0==VOID) ) {
                    alt94=1;
                }
                else if ( (LA94_0==HASH) ) {
                    alt94=2;
                }


                switch (alt94) {
            	case 1 :
            	    // Mininess.g:677:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_interface_definition5845);
            	    declaration322=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration322.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:677:24: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_interface_definition5849);
            	    line_directive323=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive323.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal324=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interface_definition5867); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal324);


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
            // 679:13: -> ^( INTERFACE identifier ( declaration )* )
            {
                // Mininess.g:679:16: ^( INTERFACE identifier ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // Mininess.g:679:39: ( declaration )*
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
            if ( state.backtracking>0 ) { memoize(input, 68, interface_definition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interface_definition"


    public static class component_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component"
    // Mininess.g:681:1: component : MODULE identifier component_specification implementation -> ^( MODULE identifier component_specification implementation ) ;
    public final MininessParser.component_return component() throws RecognitionException {
        MininessParser.component_return retval = new MininessParser.component_return();
        retval.start = input.LT(1);

        int component_StartIndex = input.index();

        Object root_0 = null;

        Token MODULE325=null;
        MininessParser.identifier_return identifier326 =null;

        MininessParser.component_specification_return component_specification327 =null;

        MininessParser.implementation_return implementation328 =null;


        Object MODULE325_tree=null;
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Mininess.g:682:5: ( MODULE identifier component_specification implementation -> ^( MODULE identifier component_specification implementation ) )
            // Mininess.g:682:9: MODULE identifier component_specification implementation
            {
            MODULE325=(Token)match(input,MODULE,FOLLOW_MODULE_in_component5908); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE325);


            pushFollow(FOLLOW_identifier_in_component5910);
            identifier326=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier326.getTree());

            pushFollow(FOLLOW_component_specification_in_component5912);
            component_specification327=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification327.getTree());

            pushFollow(FOLLOW_implementation_in_component5914);
            implementation328=implementation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_implementation.add(implementation328.getTree());

            // AST REWRITE
            // elements: identifier, component_specification, MODULE, implementation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 683:13: -> ^( MODULE identifier component_specification implementation )
            {
                // Mininess.g:683:16: ^( MODULE identifier component_specification implementation )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, component_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component"


    public static class implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementation"
    // Mininess.g:685:1: implementation : module_implementation ;
    public final MininessParser.implementation_return implementation() throws RecognitionException {
        MininessParser.implementation_return retval = new MininessParser.implementation_return();
        retval.start = input.LT(1);

        int implementation_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.module_implementation_return module_implementation329 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Mininess.g:686:5: ( module_implementation )
            // Mininess.g:686:10: module_implementation
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_module_implementation_in_implementation5953);
            module_implementation329=module_implementation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, module_implementation329.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, implementation_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "implementation"


    public static class module_implementation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_implementation"
    // Mininess.g:691:1: module_implementation : IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) ;
    public final MininessParser.module_implementation_return module_implementation() throws RecognitionException {
        MininessParser.module_implementation_return retval = new MininessParser.module_implementation_return();
        retval.start = input.LT(1);

        int module_implementation_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTATION330=null;
        Token char_literal331=null;
        Token char_literal333=null;
        MininessParser.translation_unit_return translation_unit332 =null;


        Object IMPLEMENTATION330_tree=null;
        Object char_literal331_tree=null;
        Object char_literal333_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Mininess.g:692:5: ( IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) )
            // Mininess.g:692:10: IMPLEMENTATION '{' translation_unit '}'
            {
            IMPLEMENTATION330=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_module_implementation5971); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION330);


            char_literal331=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_implementation5973); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal331);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_implementation6005);
            translation_unit332=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit332.getTree());

            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal333=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_implementation6061); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal333);


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
            // 696:13: -> ^( IMPLEMENTATION translation_unit )
            {
                // Mininess.g:696:16: ^( IMPLEMENTATION translation_unit )
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
            if ( state.backtracking>0 ) { memoize(input, 71, module_implementation_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "module_implementation"


    public static class component_specification_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component_specification"
    // Mininess.g:702:1: component_specification : '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final MininessParser.component_specification_return component_specification() throws RecognitionException {
        MininessParser.component_specification_return retval = new MininessParser.component_specification_return();
        retval.start = input.LT(1);

        int component_specification_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal334=null;
        Token char_literal337=null;
        MininessParser.uses_provides_return uses_provides335 =null;

        MininessParser.line_directive_return line_directive336 =null;


        Object char_literal334_tree=null;
        Object char_literal337_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Mininess.g:703:5: ( '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // Mininess.g:703:10: '{' ( uses_provides | line_directive )* '}'
            {
            char_literal334=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification6100); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal334);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // Mininess.g:704:11: ( uses_provides | line_directive )*
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
            	    // Mininess.g:704:12: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification6115);
            	    uses_provides335=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides335.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:704:28: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification6119);
            	    line_directive336=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive336.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            char_literal337=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification6123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal337);


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
            // 704:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // Mininess.g:704:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // Mininess.g:704:68: ( uses_provides )*
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
            if ( state.backtracking>0 ) { memoize(input, 72, component_specification_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "component_specification"


    public static class uses_provides_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uses_provides"
    // Mininess.g:706:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) );
    public final MininessParser.uses_provides_return uses_provides() throws RecognitionException {
        MininessParser.uses_provides_return retval = new MininessParser.uses_provides_return();
        retval.start = input.LT(1);

        int uses_provides_StartIndex = input.index();

        Object root_0 = null;

        Token USES338=null;
        Token PROVIDES340=null;
        MininessParser.specification_element_list_return specification_element_list339 =null;

        MininessParser.specification_element_list_return specification_element_list341 =null;


        Object USES338_tree=null;
        Object PROVIDES340_tree=null;
        RewriteRuleTokenStream stream_PROVIDES=new RewriteRuleTokenStream(adaptor,"token PROVIDES");
        RewriteRuleTokenStream stream_USES=new RewriteRuleTokenStream(adaptor,"token USES");
        RewriteRuleSubtreeStream stream_specification_element_list=new RewriteRuleSubtreeStream(adaptor,"rule specification_element_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Mininess.g:707:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) )
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
                    // Mininess.g:707:10: USES specification_element_list
                    {
                    USES338=(Token)match(input,USES,FOLLOW_USES_in_uses_provides6147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES338);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides6149);
                    specification_element_list339=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list339.getTree());

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
                    // 707:42: -> ^( USES specification_element_list )
                    {
                        // Mininess.g:707:45: ^( USES specification_element_list )
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
                    // Mininess.g:708:10: PROVIDES specification_element_list
                    {
                    PROVIDES340=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides6168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES340);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides6170);
                    specification_element_list341=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list341.getTree());

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
                    // 708:46: -> ^( PROVIDES specification_element_list )
                    {
                        // Mininess.g:708:49: ^( PROVIDES specification_element_list )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, uses_provides_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "uses_provides"


    public static class specification_element_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specification_element_list"
    // Mininess.g:710:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final MininessParser.specification_element_list_return specification_element_list() throws RecognitionException {
        MininessParser.specification_element_list_return retval = new MininessParser.specification_element_list_return();
        retval.start = input.LT(1);

        int specification_element_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal343=null;
        Token char_literal345=null;
        MininessParser.specification_element_return specification_element342 =null;

        MininessParser.specification_element_return specification_element344 =null;


        Object char_literal343_tree=null;
        Object char_literal345_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_specification_element=new RewriteRuleSubtreeStream(adaptor,"rule specification_element");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Mininess.g:711:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==CHAR||LA98_0==COMMAND||LA98_0==CONST||LA98_0==DEFAULT||LA98_0==ENUM||LA98_0==EVENT||(LA98_0 >= INT && LA98_0 <= INTERFACE)||LA98_0==LONG||(LA98_0 >= NX_STRUCT && LA98_0 <= NX_UINT8_T)||LA98_0==RAW_IDENTIFIER||(LA98_0 >= SHORT && LA98_0 <= SIGNED)||LA98_0==STRUCT||(LA98_0 >= TASK && LA98_0 <= UINT8_T)||LA98_0==UNSIGNED||LA98_0==VOID) ) {
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
                    // Mininess.g:711:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list6193);
                    specification_element342=specification_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element.add(specification_element342.getTree());

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
                    // 711:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Mininess.g:712:10: '{' ( specification_element )+ '}'
                    {
                    char_literal343=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list6208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal343);


                    // Mininess.g:712:14: ( specification_element )+
                    int cnt97=0;
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==CHAR||LA97_0==COMMAND||LA97_0==CONST||LA97_0==DEFAULT||LA97_0==ENUM||LA97_0==EVENT||(LA97_0 >= INT && LA97_0 <= INTERFACE)||LA97_0==LONG||(LA97_0 >= NX_STRUCT && LA97_0 <= NX_UINT8_T)||LA97_0==RAW_IDENTIFIER||(LA97_0 >= SHORT && LA97_0 <= SIGNED)||LA97_0==STRUCT||(LA97_0 >= TASK && LA97_0 <= UINT8_T)||LA97_0==UNSIGNED||LA97_0==VOID) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // Mininess.g:712:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list6210);
                    	    specification_element344=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element344.getTree());

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


                    char_literal345=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list6213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal345);


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
                    // 712:41: -> ( specification_element )+
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
            if ( state.backtracking>0 ) { memoize(input, 74, specification_element_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "specification_element_list"


    public static class specification_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specification_element"
    // Mininess.g:714:1: specification_element : ( declaration | INTERFACE identifier ';' -> ^( INTERFACE identifier ) );
    public final MininessParser.specification_element_return specification_element() throws RecognitionException {
        MininessParser.specification_element_return retval = new MininessParser.specification_element_return();
        retval.start = input.LT(1);

        int specification_element_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE347=null;
        Token char_literal349=null;
        MininessParser.declaration_return declaration346 =null;

        MininessParser.identifier_return identifier348 =null;


        Object INTERFACE347_tree=null;
        Object char_literal349_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Mininess.g:715:5: ( declaration | INTERFACE identifier ';' -> ^( INTERFACE identifier ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==CHAR||LA99_0==COMMAND||LA99_0==CONST||LA99_0==DEFAULT||LA99_0==ENUM||LA99_0==EVENT||(LA99_0 >= INT && LA99_0 <= INT8_T)||LA99_0==LONG||(LA99_0 >= NX_STRUCT && LA99_0 <= NX_UINT8_T)||LA99_0==RAW_IDENTIFIER||(LA99_0 >= SHORT && LA99_0 <= SIGNED)||LA99_0==STRUCT||(LA99_0 >= TASK && LA99_0 <= UINT8_T)||LA99_0==UNSIGNED||LA99_0==VOID) ) {
                alt99=1;
            }
            else if ( (LA99_0==INTERFACE) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }
            switch (alt99) {
                case 1 :
                    // Mininess.g:715:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_specification_element6233);
                    declaration346=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration346.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:716:10: INTERFACE identifier ';'
                    {
                    INTERFACE347=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_specification_element6244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE347);


                    pushFollow(FOLLOW_identifier_in_specification_element6246);
                    identifier348=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier348.getTree());

                    char_literal349=(Token)match(input,140,FOLLOW_140_in_specification_element6248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_140.add(char_literal349);


                    // AST REWRITE
                    // elements: INTERFACE, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 716:35: -> ^( INTERFACE identifier )
                    {
                        // Mininess.g:716:38: ^( INTERFACE identifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_INTERFACE.nextNode()
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
            if ( state.backtracking>0 ) { memoize(input, 75, specification_element_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "specification_element"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // Mininess.g:718:1: identifier : id= RAW_IDENTIFIER {...}?;
    public final MininessParser.identifier_return identifier() throws RecognitionException {
        MininessParser.identifier_return retval = new MininessParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Mininess.g:719:5: (id= RAW_IDENTIFIER {...}?)
            // Mininess.g:719:9: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier6272); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 76, identifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifier"

    // $ANTLR start synpred23_Mininess
    public final void synpred23_Mininess_fragment() throws RecognitionException {
        // Mininess.g:256:10: ( SIZEOF '(' type_name ')' )
        // Mininess.g:256:10: SIZEOF '(' type_name ')'
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred23_Mininess2424); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred23_Mininess2426); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred23_Mininess2428);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred23_Mininess2430); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_Mininess

    // $ANTLR start synpred24_Mininess
    public final void synpred24_Mininess_fragment() throws RecognitionException {
        // Mininess.g:257:10: ( SIZEOF unary_expression )
        // Mininess.g:257:10: SIZEOF unary_expression
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred24_Mininess2449); if (state.failed) return ;

        pushFollow(FOLLOW_unary_expression_in_synpred24_Mininess2451);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_Mininess

    // $ANTLR start synpred25_Mininess
    public final void synpred25_Mininess_fragment() throws RecognitionException {
        // Mininess.g:265:10: ( '(' type_name ')' cast_expression )
        // Mininess.g:265:10: '(' type_name ')' cast_expression
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred25_Mininess2494); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred25_Mininess2496);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred25_Mininess2498); if (state.failed) return ;

        pushFollow(FOLLOW_cast_expression_in_synpred25_Mininess2500);
        cast_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_Mininess

    // $ANTLR start synpred56_Mininess
    public final void synpred56_Mininess_fragment() throws RecognitionException {
        // Mininess.g:305:10: ( unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression )
        // Mininess.g:305:10: unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression
        {
        pushFollow(FOLLOW_unary_expression_in_synpred56_Mininess2926);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        if ( (input.LA(1) >= ASSIGN && input.LA(1) <= BITANDASSIGN)||input.LA(1)==BITORASSIGN||input.LA(1)==BITXORASSIGN||input.LA(1)==DIVASSIGN||input.LA(1)==LSHIFTASSIGN||input.LA(1)==MINUSASSIGN||input.LA(1)==MODASSIGN||input.LA(1)==MULASSIGN||input.LA(1)==PLUSASSIGN||input.LA(1)==RSHIFTASSIGN ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_assignment_expression_in_synpred56_Mininess2983);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_Mininess

    // $ANTLR start synpred59_Mininess
    public final void synpred59_Mininess_fragment() throws RecognitionException {
        // Mininess.g:333:10: ( declaration_specifiers ( init_declarator_list )? ';' )
        // Mininess.g:333:10: declaration_specifiers ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred59_Mininess3103);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // Mininess.g:337:33: ( init_declarator_list )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==LPARENS||LA101_0==RAW_IDENTIFIER||LA101_0==STAR) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // Mininess.g:337:33: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred59_Mininess3105);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,140,FOLLOW_140_in_synpred59_Mininess3108); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Mininess

    // $ANTLR start synpred60_Mininess
    public final void synpred60_Mininess_fragment() throws RecognitionException {
        // Mininess.g:346:10: ( function_definition )
        // Mininess.g:346:10: function_definition
        {
        pushFollow(FOLLOW_function_definition_in_synpred60_Mininess3170);
        function_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_Mininess

    // $ANTLR start synpred62_Mininess
    public final void synpred62_Mininess_fragment() throws RecognitionException {
        // Mininess.g:366:11: ( type_specifier )
        // Mininess.g:366:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred62_Mininess3295);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred62_Mininess

    // $ANTLR start synpred91_Mininess
    public final void synpred91_Mininess_fragment() throws RecognitionException {
        // Mininess.g:439:11: ( type_specifier )
        // Mininess.g:439:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred91_Mininess3969);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred91_Mininess

    // $ANTLR start synpred95_Mininess
    public final void synpred95_Mininess_fragment() throws RecognitionException {
        // Mininess.g:450:10: ( ( declarator )? ':' constant_expression )
        // Mininess.g:450:10: ( declarator )? ':' constant_expression
        {
        // Mininess.g:450:10: ( declarator )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==LPARENS||LA103_0==RAW_IDENTIFIER||LA103_0==STAR) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // Mininess.g:450:10: declarator
                {
                pushFollow(FOLLOW_declarator_in_synpred95_Mininess4034);
                declarator();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,139,FOLLOW_139_in_synpred95_Mininess4037); if (state.failed) return ;

        pushFollow(FOLLOW_constant_expression_in_synpred95_Mininess4039);
        constant_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred95_Mininess

    // $ANTLR start synpred98_Mininess
    public final void synpred98_Mininess_fragment() throws RecognitionException {
        // Mininess.g:454:10: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' )
        // Mininess.g:454:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred98_Mininess4069); if (state.failed) return ;

        // Mininess.g:454:15: ( identifier )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RAW_IDENTIFIER) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // Mininess.g:454:15: identifier
                {
                pushFollow(FOLLOW_identifier_in_synpred98_Mininess4071);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred98_Mininess4074); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred98_Mininess4076);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // Mininess.g:454:47: ( ',' )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==COMMA) ) {
            alt105=1;
        }
        switch (alt105) {
            case 1 :
                // Mininess.g:454:47: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred98_Mininess4078); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred98_Mininess4081); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred98_Mininess

    // $ANTLR start synpred100_Mininess
    public final void synpred100_Mininess_fragment() throws RecognitionException {
        // Mininess.g:456:10: ( ENUM identifier '{' enumerator_list ( ',' )? '}' )
        // Mininess.g:456:10: ENUM identifier '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred100_Mininess4116); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred100_Mininess4118);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred100_Mininess4120); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred100_Mininess4122);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // Mininess.g:456:46: ( ',' )?
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==COMMA) ) {
            alt106=1;
        }
        switch (alt106) {
            case 1 :
                // Mininess.g:456:46: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred100_Mininess4124); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred100_Mininess4127); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred100_Mininess

    // $ANTLR start synpred108_Mininess
    public final void synpred108_Mininess_fragment() throws RecognitionException {
        // Mininess.g:502:9: ( '[' ( constant_expression )? ']' )
        // Mininess.g:502:9: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred108_Mininess4412); if (state.failed) return ;

        // Mininess.g:502:13: ( constant_expression )?
        int alt108=2;
        int LA108_0 = input.LA(1);

        if ( (LA108_0==AMP||LA108_0==BITCOMPLEMENT||LA108_0==CALL||LA108_0==CHARACTER_LITERAL||LA108_0==CONSTANT||LA108_0==LPARENS||LA108_0==MINUS||LA108_0==MINUSMINUS||LA108_0==NOT||LA108_0==PLUS||LA108_0==PLUSPLUS||LA108_0==POST||LA108_0==RAW_IDENTIFIER||LA108_0==SIZEOF||LA108_0==STAR||LA108_0==STRING_LITERAL) ) {
            alt108=1;
        }
        switch (alt108) {
            case 1 :
                // Mininess.g:502:13: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred108_Mininess4414);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred108_Mininess4417); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred108_Mininess

    // $ANTLR start synpred117_Mininess
    public final void synpred117_Mininess_fragment() throws RecognitionException {
        // Mininess.g:537:10: ( declaration_specifiers declarator )
        // Mininess.g:537:10: declaration_specifiers declarator
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred117_Mininess4686);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_declarator_in_synpred117_Mininess4688);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred117_Mininess

    // $ANTLR start synpred121_Mininess
    public final void synpred121_Mininess_fragment() throws RecognitionException {
        // Mininess.g:546:10: ( ( pointer )? direct_abstract_declarator )
        // Mininess.g:546:10: ( pointer )? direct_abstract_declarator
        {
        // Mininess.g:546:10: ( pointer )?
        int alt111=2;
        int LA111_0 = input.LA(1);

        if ( (LA111_0==STAR) ) {
            alt111=1;
        }
        switch (alt111) {
            case 1 :
                // Mininess.g:546:10: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred121_Mininess4792);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred121_Mininess4795);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred121_Mininess

    // $ANTLR start synpred125_Mininess
    public final void synpred125_Mininess_fragment() throws RecognitionException {
        // Mininess.g:552:15: ( parameter_type_list )
        // Mininess.g:552:15: parameter_type_list
        {
        pushFollow(FOLLOW_parameter_type_list_in_synpred125_Mininess4868);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred125_Mininess

    // $ANTLR start synpred128_Mininess
    public final void synpred128_Mininess_fragment() throws RecognitionException {
        // Mininess.g:553:52: ( parameter_type_list )
        // Mininess.g:553:52: parameter_type_list
        {
        pushFollow(FOLLOW_parameter_type_list_in_synpred128_Mininess4901);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred128_Mininess

    // $ANTLR start synpred141_Mininess
    public final void synpred141_Mininess_fragment() throws RecognitionException {
        // Mininess.g:599:10: ( declaration )
        // Mininess.g:599:10: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred141_Mininess5257);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred141_Mininess

    // $ANTLR start synpred143_Mininess
    public final void synpred143_Mininess_fragment() throws RecognitionException {
        // Mininess.g:610:43: ( ELSE statement )
        // Mininess.g:610:43: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred143_Mininess5333); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred143_Mininess5335);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred143_Mininess

    // $ANTLR start synpred152_Mininess
    public final void synpred152_Mininess_fragment() throws RecognitionException {
        // Mininess.g:653:38: ( CONSTANT )
        // Mininess.g:653:38: CONSTANT
        {
        match(input,CONSTANT,FOLLOW_CONSTANT_in_synpred152_Mininess5685); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred152_Mininess

    // $ANTLR start synpred154_Mininess
    public final void synpred154_Mininess_fragment() throws RecognitionException {
        // Mininess.g:670:10: ( ( translation_unit )? interface_definition )
        // Mininess.g:670:10: ( translation_unit )? interface_definition
        {
        // Mininess.g:670:10: ( translation_unit )?
        int alt116=2;
        int LA116_0 = input.LA(1);

        if ( (LA116_0==CHAR||LA116_0==COMMAND||LA116_0==CONST||LA116_0==DEFAULT||LA116_0==ENUM||LA116_0==EVENT||LA116_0==HASH||(LA116_0 >= INT && LA116_0 <= INT8_T)||LA116_0==LONG||(LA116_0 >= NX_STRUCT && LA116_0 <= NX_UINT8_T)||LA116_0==RAW_IDENTIFIER||(LA116_0 >= SHORT && LA116_0 <= SIGNED)||LA116_0==STRUCT||(LA116_0 >= TASK && LA116_0 <= UINT8_T)||LA116_0==UNSIGNED||LA116_0==VOID) ) {
            alt116=1;
        }
        switch (alt116) {
            case 1 :
                // Mininess.g:670:10: translation_unit
                {
                pushFollow(FOLLOW_translation_unit_in_synpred154_Mininess5765);
                translation_unit();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_interface_definition_in_synpred154_Mininess5768);
        interface_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred154_Mininess

    // Delegated rules

    public final boolean synpred154_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred95_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred152_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred128_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_Mininess_fragment(); // can never throw exception
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
    static final String DFA58_eotS =
        "\5\uffff";
    static final String DFA58_eofS =
        "\1\uffff\2\4\2\uffff";
    static final String DFA58_minS =
        "\1\171\2\27\2\uffff";
    static final String DFA58_maxS =
        "\3\171\2\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA58_specialS =
        "\5\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1",
            "\1\4\4\uffff\1\2\50\uffff\1\4\4\uffff\1\4\41\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\10\uffff\1\3",
            "\1\4\4\uffff\1\2\50\uffff\1\4\4\uffff\1\4\41\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\10\uffff\1\3",
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
            return "511:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_identifier_in_primary_expression1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_primary_expression1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_primary_expression1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_primary_expression1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_primary_expression2008 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_expression_in_primary_expression2010 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_primary_expression2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_kind_in_postfix_expression2037 = new BitSet(new long[]{0x0000000020400000L,0x0800100000000400L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression2040 = new BitSet(new long[]{0x0000020000000402L,0x0000000800008420L});
    public static final BitSet FOLLOW_postfix_expression_modifier_in_postfix_expression2042 = new BitSet(new long[]{0x0000020000000402L,0x0000000800008420L});
    public static final BitSet FOLLOW_LBRACKET_in_postfix_expression_modifier2083 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_expression_in_postfix_expression_modifier2085 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_postfix_expression_modifier2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression_modifier2105 = new BitSet(new long[]{0x0000000020442020L,0x0A21102A0010A400L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression_modifier2107 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression_modifier2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression_modifier2129 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_postfix_expression_modifier2149 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_postfix_expression_modifier2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_postfix_expression_modifier2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list2228 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list2231 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list2234 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unary_expression2255 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_unary_expression2276 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_unary_expression2297 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression2324 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression2350 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression2377 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITCOMPLEMENT_in_unary_expression2404 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_NOT_in_unary_expression2409 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_unary_expression2426 = new BitSet(new long[]{0x8000080010200000L,0x101810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_type_name_in_unary_expression2428 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_unary_expression2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression2449 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_cast_expression2494 = new BitSet(new long[]{0x8000080010200000L,0x101810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_type_name_in_cast_expression2496 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_cast_expression2498 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_arrayinc_expression2536 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ARRAYINC_in_arrayinc_expression2540 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_cast_expression_in_arrayinc_expression2543 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_arrayinc_expression_in_multiplicative_expression2564 = new BitSet(new long[]{0x0000010000000002L,0x0200000000040000L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression2569 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expression2574 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_MODULUS_in_multiplicative_expression2579 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_arrayinc_expression_in_multiplicative_expression2583 = new BitSet(new long[]{0x0000010000000002L,0x0200000000040000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2604 = new BitSet(new long[]{0x0000000000000002L,0x0000000200002000L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression2609 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression2614 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2618 = new BitSet(new long[]{0x0000000000000002L,0x0000000200002000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression2639 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000800L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression2644 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression2649 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression2653 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000800L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression2674 = new BitSet(new long[]{0x0060000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LESS_in_relational_expression2679 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression2684 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_LESSEQUAL_in_relational_expression2689 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_relational_expression2694 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression2698 = new BitSet(new long[]{0x0060000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression2719 = new BitSet(new long[]{0x0000200000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_EQUAL_in_equality_expression2724 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equality_expression2729 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression2733 = new BitSet(new long[]{0x0000200000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression2754 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AMP_in_and_expression2758 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression2761 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression2782 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_BITXOR_in_xor_expression2786 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression2789 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression2810 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_BITOR_in_or_expression2814 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression2817 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression2838 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression2842 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression2845 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression2866 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression2870 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression2873 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression2894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_conditional_expression2897 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_expression_in_conditional_expression2900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_conditional_expression2902 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_assignment_expression2926 = new BitSet(new long[]{0x0000008000029800L,0x0004000400095000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_expression2929 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_MULASSIGN_in_assignment_expression2934 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_DIVASSIGN_in_assignment_expression2939 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_MODASSIGN_in_assignment_expression2944 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_PLUSASSIGN_in_assignment_expression2949 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_MINUSASSIGN_in_assignment_expression2954 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_LSHIFTASSIGN_in_assignment_expression2959 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_RSHIFTASSIGN_in_assignment_expression2964 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_BITANDASSIGN_in_assignment_expression2969 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_BITXORASSIGN_in_assignment_expression2974 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_BITORASSIGN_in_assignment_expression2979 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3013 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_expression3016 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3019 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3103 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000400L,0x0000000000001000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_declaration3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration3215 = new BitSet(new long[]{0x8000481011200000L,0x501810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3217 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000400L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_declaration3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers3281 = new BitSet(new long[]{0x8000481011200002L,0x501810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers3295 = new BitSet(new long[]{0x8000481011200002L,0x501810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers3318 = new BitSet(new long[]{0x8000481011200002L,0x501810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_DEFAULT_in_declaration_specifiers3341 = new BitSet(new long[]{0x8000481011200002L,0x501810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list3364 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list3367 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000400L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list3369 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator3403 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator3406 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A410L});
    public static final BitSet FOLLOW_initializer_in_init_declarator3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier3762 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000010L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier3764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier3767 = new BitSet(new long[]{0x8000080010200000L,0x101810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier3769 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier3805 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list3887 = new BitSet(new long[]{0x8000080010200002L,0x101810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration3918 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000400L,0x0000000000000800L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration3920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_struct_declaration3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list3969 = new BitSet(new long[]{0x8000080010200002L,0x101810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list3973 = new BitSet(new long[]{0x8000080010200002L,0x101810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list3999 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list4002 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000400L,0x0000000000000800L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list4004 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator4034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_struct_declarator4037 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier4069 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000010L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier4071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier4074 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier4076 = new BitSet(new long[]{0x0000000000800000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier4078 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier4116 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier4118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier4120 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier4122 = new BitSet(new long[]{0x0000000000800000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier4124 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier4161 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list4203 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list4206 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list4209 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_identifier_in_enumerator4234 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator4237 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_type_qualifier4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator4290 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000400L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator4318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000420L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator4320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000420L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier4346 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier4349 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier4386 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000400L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier4388 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier4412 = new BitSet(new long[]{0x0000000020442020L,0x0A20502A0010A400L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier4414 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier4449 = new BitSet(new long[]{0x8000481011A00000L,0x501810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_declarator_modifier4453 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier4455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier4459 = new BitSet(new long[]{0x8000481011A00000L,0x501810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_declarator_modifier4463 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer4505 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer4507 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_pointer_in_pointer4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer4532 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list4563 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_parameter_list_in_parameter_type_list4584 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_type_list4587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_parameter_type_list4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list4614 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list4617 = new BitSet(new long[]{0x8000481011200000L,0x501810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list4619 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration4686 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000400L});
    public static final BitSet FOLLOW_declarator_in_parameter_declaration4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration4721 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000420L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name4770 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000420L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator4792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator4826 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000420L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator4828 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator4833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000420L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator4847 = new BitSet(new long[]{0x0000000020442020L,0x0A20502A0010A400L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator4849 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator4852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000420L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator4866 = new BitSet(new long[]{0x8000481011A00000L,0x501910003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_abstract_declarator4868 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator4873 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000420L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator4890 = new BitSet(new long[]{0x0000000020442020L,0x0A20502A0010A400L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator4892 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator4895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000420L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator4899 = new BitSet(new long[]{0x8000481011A00000L,0x501910003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_abstract_declarator4901 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator4904 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000420L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer4979 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A410L});
    public static final BitSet FOLLOW_initializer_list_in_initializer4981 = new BitSet(new long[]{0x0000000000800000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_initializer4983 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5013 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list5016 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A410L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5018 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_statement5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement5145 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement5147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_labeled_statement5149 = new BitSet(new long[]{0x08810010204C2020L,0x2A20902A0010A410L,0x0000000000001100L});
    public static final BitSet FOLLOW_statement_in_labeled_statement5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement5172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_labeled_statement5174 = new BitSet(new long[]{0x08810010204C2020L,0x2A20902A0010A410L,0x0000000000001100L});
    public static final BitSet FOLLOW_statement_in_labeled_statement5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement5202 = new BitSet(new long[]{0x88814810316C2020L,0xFA38B02A3C10A617L,0x00000000000011A7L});
    public static final BitSet FOLLOW_block_item_in_compound_statement5215 = new BitSet(new long[]{0x88814810316C2020L,0xFA38B02A3C10A617L,0x00000000000011A7L});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_block_item5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block_item5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement5291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_expression_statement5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement5322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement5324 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_expression_in_selection_statement5326 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement5328 = new BitSet(new long[]{0x08810010204C2020L,0x2A20902A0010A410L,0x0000000000001100L});
    public static final BitSet FOLLOW_statement_in_selection_statement5330 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement5333 = new BitSet(new long[]{0x08810010204C2020L,0x2A20902A0010A410L,0x0000000000001100L});
    public static final BitSet FOLLOW_statement_in_selection_statement5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement5374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement5376 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_expression_in_selection_statement5378 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement5380 = new BitSet(new long[]{0x08810010204C2020L,0x2A20902A0010A410L,0x0000000000001100L});
    public static final BitSet FOLLOW_statement_in_selection_statement5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement5428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement5430 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5432 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement5434 = new BitSet(new long[]{0x08810010204C2020L,0x2A20902A0010A410L,0x0000000000001100L});
    public static final BitSet FOLLOW_statement_in_iteration_statement5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement5457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement5459 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L,0x0000000000001000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_iteration_statement5466 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L,0x0000000000001000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_iteration_statement5473 = new BitSet(new long[]{0x0000000020442020L,0x0A21102A0010A400L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5477 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement5480 = new BitSet(new long[]{0x08810010204C2020L,0x2A20902A0010A410L,0x0000000000001100L});
    public static final BitSet FOLLOW_statement_in_iteration_statement5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement5589 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L,0x0000000000001000L});
    public static final BitSet FOLLOW_expression_in_jump_statement5591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_jump_statement5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit5630 = new BitSet(new long[]{0x8080481011200002L,0xD01810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_line_directive_in_translation_unit5634 = new BitSet(new long[]{0x8080481011200002L,0xD01810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_declaration_in_external_declaration5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive5679 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive5681 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive5683 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition5713 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000400L});
    public static final BitSet FOLLOW_declarator_in_function_definition5715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_mininess_file5765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_interface_definition_in_mininess_file5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_mininess_file5790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_component_in_mininess_file5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_definition5820 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_identifier_in_interface_definition5822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACE_in_interface_definition5832 = new BitSet(new long[]{0x8080481011200000L,0xD01830003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_declaration_in_interface_definition5845 = new BitSet(new long[]{0x8080481011200000L,0xD01830003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_line_directive_in_interface_definition5849 = new BitSet(new long[]{0x8080481011200000L,0xD01830003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_RBRACE_in_interface_definition5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_component5908 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_identifier_in_component5910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_component_specification_in_component5912 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_implementation_in_component5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_implementation5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_module_implementation5971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACE_in_module_implementation5973 = new BitSet(new long[]{0x8080481011200000L,0xD01810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_translation_unit_in_module_implementation6005 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_module_implementation6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification6100 = new BitSet(new long[]{0x0080000000000000L,0x0000280000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_uses_provides_in_component_specification6115 = new BitSet(new long[]{0x0080000000000000L,0x0000280000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_line_directive_in_component_specification6119 = new BitSet(new long[]{0x0080000000000000L,0x0000280000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_component_specification6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides6147 = new BitSet(new long[]{0x8000481011200000L,0xD01810003C00021FL,0x00000000000000A7L});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides6168 = new BitSet(new long[]{0x8000481011200000L,0xD01810003C00021FL,0x00000000000000A7L});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list6208 = new BitSet(new long[]{0x8000481011200000L,0xD01810003C00020FL,0x00000000000000A7L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list6210 = new BitSet(new long[]{0x8000481011200000L,0xD01830003C00020FL,0x00000000000000A7L});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_specification_element6244 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_identifier_in_specification_element6246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_specification_element6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred23_Mininess2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_synpred23_Mininess2426 = new BitSet(new long[]{0x8000080010200000L,0x101810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_type_name_in_synpred23_Mininess2428 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred23_Mininess2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred24_Mininess2449 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_unary_expression_in_synpred24_Mininess2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred25_Mininess2494 = new BitSet(new long[]{0x8000080010200000L,0x101810003C000207L,0x00000000000000A7L});
    public static final BitSet FOLLOW_type_name_in_synpred25_Mininess2496 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred25_Mininess2498 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_cast_expression_in_synpred25_Mininess2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_synpred56_Mininess2926 = new BitSet(new long[]{0x0000008000029800L,0x0004000400095000L});
    public static final BitSet FOLLOW_set_in_synpred56_Mininess2928 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred56_Mininess2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred59_Mininess3103 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000400L,0x0000000000001000L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred59_Mininess3105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_synpred59_Mininess3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_synpred60_Mininess3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred62_Mininess3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred91_Mininess3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred95_Mininess4034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_synpred95_Mininess4037 = new BitSet(new long[]{0x0000000020442020L,0x0A20102A0010A400L});
    public static final BitSet FOLLOW_constant_expression_in_synpred95_Mininess4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred98_Mininess4069 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000010L});
    public static final BitSet FOLLOW_identifier_in_synpred98_Mininess4071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACE_in_synpred98_Mininess4074 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred98_Mininess4076 = new BitSet(new long[]{0x0000000000800000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred98_Mininess4078 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred98_Mininess4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred100_Mininess4116 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_identifier_in_synpred100_Mininess4118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACE_in_synpred100_Mininess4120 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred100_Mininess4122 = new BitSet(new long[]{0x0000000000800000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred100_Mininess4124 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred100_Mininess4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred108_Mininess4412 = new BitSet(new long[]{0x0000000020442020L,0x0A20502A0010A400L});
    public static final BitSet FOLLOW_constant_expression_in_synpred108_Mininess4414 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred108_Mininess4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred117_Mininess4686 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000400L});
    public static final BitSet FOLLOW_declarator_in_synpred117_Mininess4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred121_Mininess4792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred121_Mininess4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred125_Mininess4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred128_Mininess4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred141_Mininess5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred143_Mininess5333 = new BitSet(new long[]{0x08810010204C2020L,0x2A20902A0010A410L,0x0000000000001100L});
    public static final BitSet FOLLOW_statement_in_synpred143_Mininess5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_synpred152_Mininess5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_synpred154_Mininess5765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_interface_definition_in_synpred154_Mininess5768 = new BitSet(new long[]{0x0000000000000002L});

}