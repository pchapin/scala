// $ANTLR 3.4 Mininess.g 2013-01-08 14:20:27

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDRESS_OF", "AMP", "AND", "ARGUMENT_LIST", "ARRAYINC", "ARRAY_ELEMENT_SELECTION", "ARROW", "ASSIGN", "BITANDASSIGN", "BITCOMPLEMENT", "BITOR", "BITORASSIGN", "BITXOR", "BITXORASSIGN", "CALL", "CASE", "CAST", "CHAR", "CHARACTER_LITERAL", "COMMA", "COMMAND", "COMMENT1", "COMMENT2", "COMPOUND_STATEMENT", "CONST", "CONSTANT", "DECLARATION", "DECLARATOR", "DECLARATOR_ARRAY_MODIFIER", "DECLARATOR_LIST", "DECLARATOR_PARAMETER_LIST_MODIFIER", "DEC_NUMBER", "DEFAULT", "DEREFERENCE", "DIGIT", "DIVASSIGN", "DIVIDE", "DOT", "ELSE", "ENUM", "ENUMERATOR", "EQUAL", "ERROR_T", "EVENT", "FILE", "FOR", "FOR_CONDITION", "FOR_INITIALIZE", "FOR_ITERATION", "FUNCTION_DEFINITION", "GREATER", "GREATEREQUAL", "HASH", "HEX_DIGIT", "HEX_NUMBER", "IDENTIFIER_PATH", "IF", "IMPLEMENTATION", "INITIALIZER_LIST", "INIT_DECLARATOR", "INT", "INT16_T", "INT32_T", "INT8_T", "INTERFACE", "LBRACE", "LBRACKET", "LESS", "LESSEQUAL", "LINE_DIRECTIVE", "LONG", "LPARENS", "LSHIFT", "LSHIFTASSIGN", "MINUS", "MINUSASSIGN", "MINUSMINUS", "MODASSIGN", "MODULE", "MODULUS", "MULASSIGN", "NOT", "NOTEQUAL", "NULL", "NUMBER", "NUMBER_PREFIX", "NUMBER_SUFFIX", "NX_STRUCT", "NX_UINT16_T", "NX_UINT32_T", "NX_UINT8_T", "OR", "PARAMETER", "PARAMETER_LIST", "PLUS", "PLUSASSIGN", "PLUSPLUS", "POINTER_QUALIFIER", "POST", "POSTFIX_EXPRESSION", "POST_DECREMENT", "POST_INCREMENT", "PRE_DECREMENT", "PRE_INCREMENT", "PROVIDES", "RAW_IDENTIFIER", "RBRACE", "RBRACKET", "RETURN", "RPARENS", "RSHIFT", "RSHIFTASSIGN", "SHORT", "SIGNED", "SIZEOF", "SIZEOF_EXPRESSION", "SIZEOF_TYPE", "SPECIFICATION", "STAR", "STATEMENT", "STRING_LITERAL", "STRUCT", "SWITCH", "TASK", "TYPEDEF", "UINT16_T", "UINT32_T", "UINT8_T", "UNARY_MINUS", "UNARY_PLUS", "UNSIGNED", "USES", "VOID", "WHILE", "WHITESPACE", "'...'", "':'", "';'", "'?'"
    };

    public static final int EOF=-1;
    public static final int T__139=139;
    public static final int T__140=140;
    public static final int T__141=141;
    public static final int T__142=142;
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
    public static final int ERROR_T=46;
    public static final int EVENT=47;
    public static final int FILE=48;
    public static final int FOR=49;
    public static final int FOR_CONDITION=50;
    public static final int FOR_INITIALIZE=51;
    public static final int FOR_ITERATION=52;
    public static final int FUNCTION_DEFINITION=53;
    public static final int GREATER=54;
    public static final int GREATEREQUAL=55;
    public static final int HASH=56;
    public static final int HEX_DIGIT=57;
    public static final int HEX_NUMBER=58;
    public static final int IDENTIFIER_PATH=59;
    public static final int IF=60;
    public static final int IMPLEMENTATION=61;
    public static final int INITIALIZER_LIST=62;
    public static final int INIT_DECLARATOR=63;
    public static final int INT=64;
    public static final int INT16_T=65;
    public static final int INT32_T=66;
    public static final int INT8_T=67;
    public static final int INTERFACE=68;
    public static final int LBRACE=69;
    public static final int LBRACKET=70;
    public static final int LESS=71;
    public static final int LESSEQUAL=72;
    public static final int LINE_DIRECTIVE=73;
    public static final int LONG=74;
    public static final int LPARENS=75;
    public static final int LSHIFT=76;
    public static final int LSHIFTASSIGN=77;
    public static final int MINUS=78;
    public static final int MINUSASSIGN=79;
    public static final int MINUSMINUS=80;
    public static final int MODASSIGN=81;
    public static final int MODULE=82;
    public static final int MODULUS=83;
    public static final int MULASSIGN=84;
    public static final int NOT=85;
    public static final int NOTEQUAL=86;
    public static final int NULL=87;
    public static final int NUMBER=88;
    public static final int NUMBER_PREFIX=89;
    public static final int NUMBER_SUFFIX=90;
    public static final int NX_STRUCT=91;
    public static final int NX_UINT16_T=92;
    public static final int NX_UINT32_T=93;
    public static final int NX_UINT8_T=94;
    public static final int OR=95;
    public static final int PARAMETER=96;
    public static final int PARAMETER_LIST=97;
    public static final int PLUS=98;
    public static final int PLUSASSIGN=99;
    public static final int PLUSPLUS=100;
    public static final int POINTER_QUALIFIER=101;
    public static final int POST=102;
    public static final int POSTFIX_EXPRESSION=103;
    public static final int POST_DECREMENT=104;
    public static final int POST_INCREMENT=105;
    public static final int PRE_DECREMENT=106;
    public static final int PRE_INCREMENT=107;
    public static final int PROVIDES=108;
    public static final int RAW_IDENTIFIER=109;
    public static final int RBRACE=110;
    public static final int RBRACKET=111;
    public static final int RETURN=112;
    public static final int RPARENS=113;
    public static final int RSHIFT=114;
    public static final int RSHIFTASSIGN=115;
    public static final int SHORT=116;
    public static final int SIGNED=117;
    public static final int SIZEOF=118;
    public static final int SIZEOF_EXPRESSION=119;
    public static final int SIZEOF_TYPE=120;
    public static final int SPECIFICATION=121;
    public static final int STAR=122;
    public static final int STATEMENT=123;
    public static final int STRING_LITERAL=124;
    public static final int STRUCT=125;
    public static final int SWITCH=126;
    public static final int TASK=127;
    public static final int TYPEDEF=128;
    public static final int UINT16_T=129;
    public static final int UINT32_T=130;
    public static final int UINT8_T=131;
    public static final int UNARY_MINUS=132;
    public static final int UNARY_PLUS=133;
    public static final int UNSIGNED=134;
    public static final int USES=135;
    public static final int VOID=136;
    public static final int WHILE=137;
    public static final int WHITESPACE=138;

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
        this.state.ruleMemo = new HashMap[240+1];
         

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

        // Provide more detailed error messages for debugging. This is from Definitive ANTLR. This
        // is useful for grammer debugging but should be changed for "production" use.
        //
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
    // Mininess.g:219:1: primary_expression : ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression );
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

            // Mininess.g:220:5: ( identifier | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | '(' expression ')' -> expression )
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
                    // Mininess.g:220:10: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression1982);
                    identifier1=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier1.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:221:10: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT2=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_primary_expression1993); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT2_tree = 
                    (Object)adaptor.create(CONSTANT2)
                    ;
                    adaptor.addChild(root_0, CONSTANT2_tree);
                    }

                    }
                    break;
                case 3 :
                    // Mininess.g:222:10: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primary_expression2004); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL3_tree = 
                    (Object)adaptor.create(STRING_LITERAL3)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL3_tree);
                    }

                    }
                    break;
                case 4 :
                    // Mininess.g:223:10: CHARACTER_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARACTER_LITERAL4=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_primary_expression2015); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARACTER_LITERAL4_tree = 
                    (Object)adaptor.create(CHARACTER_LITERAL4)
                    ;
                    adaptor.addChild(root_0, CHARACTER_LITERAL4_tree);
                    }

                    }
                    break;
                case 5 :
                    // Mininess.g:224:10: '(' expression ')'
                    {
                    char_literal5=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_primary_expression2026); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal5);


                    pushFollow(FOLLOW_expression_in_primary_expression2028);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

                    char_literal7=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_primary_expression2030); if (state.failed) return retval; 
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
                    // 224:29: -> expression
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
    // Mininess.g:232:1: postfix_expression : ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) ;
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

            // Mininess.g:233:5: ( ( call_kind )? primary_expression ( postfix_expression_modifier )* -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* ) )
            // Mininess.g:233:10: ( call_kind )? primary_expression ( postfix_expression_modifier )*
            {
            // Mininess.g:233:10: ( call_kind )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CALL||LA2_0==POST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Mininess.g:233:10: call_kind
                    {
                    pushFollow(FOLLOW_call_kind_in_postfix_expression2055);
                    call_kind8=call_kind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_call_kind.add(call_kind8.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_primary_expression_in_postfix_expression2058);
            primary_expression9=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression9.getTree());

            // Mininess.g:233:40: ( postfix_expression_modifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARROW||LA3_0==DOT||LA3_0==LBRACKET||LA3_0==LPARENS||LA3_0==MINUSMINUS||LA3_0==PLUSPLUS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Mininess.g:233:40: postfix_expression_modifier
            	    {
            	    pushFollow(FOLLOW_postfix_expression_modifier_in_postfix_expression2060);
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
            // 234:13: -> ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
            {
                // Mininess.g:234:16: ^( POSTFIX_EXPRESSION ( call_kind )? primary_expression ( postfix_expression_modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION")
                , root_1);

                // Mininess.g:234:37: ( call_kind )?
                if ( stream_call_kind.hasNext() ) {
                    adaptor.addChild(root_1, stream_call_kind.nextTree());

                }
                stream_call_kind.reset();

                adaptor.addChild(root_1, stream_primary_expression.nextTree());

                // Mininess.g:234:67: ( postfix_expression_modifier )*
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
    // Mininess.g:236:1: postfix_expression_modifier : ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' );
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

            // Mininess.g:237:5: ( '[' expression ']' -> ^( ARRAY_ELEMENT_SELECTION expression ) | '(' ( argument_expression_list )? ')' -> ^( ARGUMENT_LIST ( argument_expression_list )? ) | '.' identifier -> ^( '.' identifier ) | '->' identifier -> ^( '->' identifier ) | '++' | '--' )
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
                    // Mininess.g:237:9: '[' expression ']'
                    {
                    char_literal11=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_postfix_expression_modifier2101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal11);


                    pushFollow(FOLLOW_expression_in_postfix_expression_modifier2103);
                    expression12=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression12.getTree());

                    char_literal13=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_postfix_expression_modifier2105); if (state.failed) return retval; 
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
                    // 237:28: -> ^( ARRAY_ELEMENT_SELECTION expression )
                    {
                        // Mininess.g:237:31: ^( ARRAY_ELEMENT_SELECTION expression )
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
                    // Mininess.g:238:9: '(' ( argument_expression_list )? ')'
                    {
                    char_literal14=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_postfix_expression_modifier2123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal14);


                    // Mininess.g:238:13: ( argument_expression_list )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AMP||LA4_0==BITCOMPLEMENT||LA4_0==CALL||LA4_0==CHARACTER_LITERAL||LA4_0==CONSTANT||LA4_0==LPARENS||LA4_0==MINUS||LA4_0==MINUSMINUS||LA4_0==NOT||LA4_0==PLUS||LA4_0==PLUSPLUS||LA4_0==POST||LA4_0==RAW_IDENTIFIER||LA4_0==SIZEOF||LA4_0==STAR||LA4_0==STRING_LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Mininess.g:238:13: argument_expression_list
                            {
                            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression_modifier2125);
                            argument_expression_list15=argument_expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list15.getTree());

                            }
                            break;

                    }


                    char_literal16=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_postfix_expression_modifier2128); if (state.failed) return retval; 
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
                    // 238:43: -> ^( ARGUMENT_LIST ( argument_expression_list )? )
                    {
                        // Mininess.g:238:46: ^( ARGUMENT_LIST ( argument_expression_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST")
                        , root_1);

                        // Mininess.g:238:62: ( argument_expression_list )?
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
                    // Mininess.g:239:9: '.' identifier
                    {
                    char_literal17=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression_modifier2147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal17);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2149);
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
                    // 239:24: -> ^( '.' identifier )
                    {
                        // Mininess.g:239:27: ^( '.' identifier )
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
                    // Mininess.g:240:9: '->' identifier
                    {
                    string_literal19=(Token)match(input,ARROW,FOLLOW_ARROW_in_postfix_expression_modifier2167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(string_literal19);


                    pushFollow(FOLLOW_identifier_in_postfix_expression_modifier2169);
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
                    // 240:25: -> ^( '->' identifier )
                    {
                        // Mininess.g:240:28: ^( '->' identifier )
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
                    // Mininess.g:241:9: '++'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal21=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfix_expression_modifier2187); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal21_tree = 
                    (Object)adaptor.create(string_literal21)
                    ;
                    adaptor.addChild(root_0, string_literal21_tree);
                    }

                    }
                    break;
                case 6 :
                    // Mininess.g:242:9: '--'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal22=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfix_expression_modifier2197); if (state.failed) return retval;
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
    // Mininess.g:244:1: call_kind : ( CALL | POST );
    public final MininessParser.call_kind_return call_kind() throws RecognitionException {
        MininessParser.call_kind_return retval = new MininessParser.call_kind_return();
        retval.start = input.LT(1);

        int call_kind_StartIndex = input.index();

        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // Mininess.g:245:5: ( CALL | POST )
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
    // Mininess.g:248:1: argument_expression_list : assignment_expression ( ',' ! assignment_expression )* ;
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

            // Mininess.g:249:5: ( assignment_expression ( ',' ! assignment_expression )* )
            // Mininess.g:249:10: assignment_expression ( ',' ! assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list2246);
            assignment_expression24=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression24.getTree());

            // Mininess.g:249:32: ( ',' ! assignment_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Mininess.g:249:33: ',' ! assignment_expression
            	    {
            	    char_literal25=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list2249); if (state.failed) return retval;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list2252);
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
    // Mininess.g:251:1: unary_expression : ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression );
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

            // Mininess.g:252:5: ( '++' unary_expression -> ^( PRE_INCREMENT unary_expression ) | '--' unary_expression -> ^( PRE_DECREMENT unary_expression ) | '&' cast_expression -> ^( ADDRESS_OF cast_expression ) | '*' cast_expression -> ^( DEREFERENCE cast_expression ) | '+' cast_expression -> ^( UNARY_PLUS cast_expression ) | '-' cast_expression -> ^( UNARY_MINUS cast_expression ) | ( '~' ^| '!' ^) cast_expression | SIZEOF '(' type_name ')' -> ^( SIZEOF_TYPE type_name ) | SIZEOF unary_expression -> ^( SIZEOF_EXPRESSION unary_expression ) | postfix_expression )
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
                    // Mininess.g:252:10: '++' unary_expression
                    {
                    string_literal27=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unary_expression2273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(string_literal27);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2275);
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
                    // 252:32: -> ^( PRE_INCREMENT unary_expression )
                    {
                        // Mininess.g:252:35: ^( PRE_INCREMENT unary_expression )
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
                    // Mininess.g:253:10: '--' unary_expression
                    {
                    string_literal29=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unary_expression2294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUSMINUS.add(string_literal29);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2296);
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
                    // 253:32: -> ^( PRE_DECREMENT unary_expression )
                    {
                        // Mininess.g:253:35: ^( PRE_DECREMENT unary_expression )
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
                    // Mininess.g:254:10: '&' cast_expression
                    {
                    char_literal31=(Token)match(input,AMP,FOLLOW_AMP_in_unary_expression2315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMP.add(char_literal31);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2318);
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
                    // 254:32: -> ^( ADDRESS_OF cast_expression )
                    {
                        // Mininess.g:254:35: ^( ADDRESS_OF cast_expression )
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
                    // Mininess.g:255:10: '*' cast_expression
                    {
                    char_literal33=(Token)match(input,STAR,FOLLOW_STAR_in_unary_expression2342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal33);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2345);
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
                    // 255:32: -> ^( DEREFERENCE cast_expression )
                    {
                        // Mininess.g:255:35: ^( DEREFERENCE cast_expression )
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
                    // Mininess.g:256:10: '+' cast_expression
                    {
                    char_literal35=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression2368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal35);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2371);
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
                    // 256:32: -> ^( UNARY_PLUS cast_expression )
                    {
                        // Mininess.g:256:35: ^( UNARY_PLUS cast_expression )
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
                    // Mininess.g:257:10: '-' cast_expression
                    {
                    char_literal37=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression2395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal37);


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2398);
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
                    // 257:32: -> ^( UNARY_MINUS cast_expression )
                    {
                        // Mininess.g:257:35: ^( UNARY_MINUS cast_expression )
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
                    // Mininess.g:258:10: ( '~' ^| '!' ^) cast_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // Mininess.g:258:10: ( '~' ^| '!' ^)
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
                            // Mininess.g:258:11: '~' ^
                            {
                            char_literal39=(Token)match(input,BITCOMPLEMENT,FOLLOW_BITCOMPLEMENT_in_unary_expression2422); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal39_tree = 
                            (Object)adaptor.create(char_literal39)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal39_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Mininess.g:258:18: '!' ^
                            {
                            char_literal40=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression2427); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal40_tree = 
                            (Object)adaptor.create(char_literal40)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal40_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_cast_expression_in_unary_expression2431);
                    cast_expression41=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression41.getTree());

                    }
                    break;
                case 8 :
                    // Mininess.g:259:10: SIZEOF '(' type_name ')'
                    {
                    SIZEOF42=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression2442); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF42);


                    char_literal43=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_unary_expression2444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal43);


                    pushFollow(FOLLOW_type_name_in_unary_expression2446);
                    type_name44=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name44.getTree());

                    char_literal45=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_unary_expression2448); if (state.failed) return retval; 
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
                    // 259:35: -> ^( SIZEOF_TYPE type_name )
                    {
                        // Mininess.g:259:38: ^( SIZEOF_TYPE type_name )
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
                    // Mininess.g:260:10: SIZEOF unary_expression
                    {
                    SIZEOF46=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression2467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF46);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2469);
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
                    // 260:35: -> ^( SIZEOF_EXPRESSION unary_expression )
                    {
                        // Mininess.g:260:38: ^( SIZEOF_EXPRESSION unary_expression )
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
                    // Mininess.g:261:10: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression2489);
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
    // Mininess.g:267:1: cast_expression : ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression );
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

            // Mininess.g:268:5: ( '(' type_name ')' cast_expression -> ^( CAST cast_expression type_name ) | unary_expression )
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
                    // Mininess.g:268:10: '(' type_name ')' cast_expression
                    {
                    char_literal49=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_cast_expression2512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal49);


                    pushFollow(FOLLOW_type_name_in_cast_expression2514);
                    type_name50=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name50.getTree());

                    char_literal51=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_cast_expression2516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal51);


                    pushFollow(FOLLOW_cast_expression_in_cast_expression2518);
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
                    // 268:44: -> ^( CAST cast_expression type_name )
                    {
                        // Mininess.g:268:47: ^( CAST cast_expression type_name )
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
                    // Mininess.g:269:10: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression2539);
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
    // Mininess.g:271:1: arrayinc_expression : cast_expression ( '|>' ^ cast_expression )* ;
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

            // Mininess.g:272:5: ( cast_expression ( '|>' ^ cast_expression )* )
            // Mininess.g:272:10: cast_expression ( '|>' ^ cast_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_arrayinc_expression2554);
            cast_expression54=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression54.getTree());

            // Mininess.g:272:26: ( '|>' ^ cast_expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ARRAYINC) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Mininess.g:272:28: '|>' ^ cast_expression
            	    {
            	    string_literal55=(Token)match(input,ARRAYINC,FOLLOW_ARRAYINC_in_arrayinc_expression2558); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal55_tree = 
            	    (Object)adaptor.create(string_literal55)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal55_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_cast_expression_in_arrayinc_expression2561);
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
    // Mininess.g:274:1: multiplicative_expression : arrayinc_expression ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )* ;
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

            // Mininess.g:275:5: ( arrayinc_expression ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )* )
            // Mininess.g:275:10: arrayinc_expression ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arrayinc_expression_in_multiplicative_expression2582);
            arrayinc_expression57=arrayinc_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayinc_expression57.getTree());

            // Mininess.g:275:30: ( ( '*' ^| '/' ^| '%' ^) arrayinc_expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==DIVIDE||LA12_0==MODULUS||LA12_0==STAR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Mininess.g:275:32: ( '*' ^| '/' ^| '%' ^) arrayinc_expression
            	    {
            	    // Mininess.g:275:32: ( '*' ^| '/' ^| '%' ^)
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
            	            // Mininess.g:275:33: '*' ^
            	            {
            	            char_literal58=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicative_expression2587); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal58_tree = 
            	            (Object)adaptor.create(char_literal58)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal58_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:275:40: '/' ^
            	            {
            	            char_literal59=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expression2592); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal59_tree = 
            	            (Object)adaptor.create(char_literal59)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal59_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Mininess.g:275:47: '%' ^
            	            {
            	            char_literal60=(Token)match(input,MODULUS,FOLLOW_MODULUS_in_multiplicative_expression2597); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal60_tree = 
            	            (Object)adaptor.create(char_literal60)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal60_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_arrayinc_expression_in_multiplicative_expression2601);
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
    // Mininess.g:277:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
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

            // Mininess.g:278:5: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
            // Mininess.g:278:10: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2622);
            multiplicative_expression62=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression62.getTree());

            // Mininess.g:278:36: ( ( '+' ^| '-' ^) multiplicative_expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Mininess.g:278:38: ( '+' ^| '-' ^) multiplicative_expression
            	    {
            	    // Mininess.g:278:38: ( '+' ^| '-' ^)
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
            	            // Mininess.g:278:39: '+' ^
            	            {
            	            char_literal63=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression2627); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal63_tree = 
            	            (Object)adaptor.create(char_literal63)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal63_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:278:46: '-' ^
            	            {
            	            char_literal64=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression2632); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal64_tree = 
            	            (Object)adaptor.create(char_literal64)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal64_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2636);
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
    // Mininess.g:280:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
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

            // Mininess.g:281:5: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // Mininess.g:281:10: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression2657);
            additive_expression66=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression66.getTree());

            // Mininess.g:281:30: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LSHIFT||LA16_0==RSHIFT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Mininess.g:281:32: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // Mininess.g:281:32: ( '<<' ^| '>>' ^)
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
            	            // Mininess.g:281:33: '<<' ^
            	            {
            	            string_literal67=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression2662); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal67_tree = 
            	            (Object)adaptor.create(string_literal67)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal67_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:281:41: '>>' ^
            	            {
            	            string_literal68=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression2667); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal68_tree = 
            	            (Object)adaptor.create(string_literal68)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal68_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression2671);
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
    // Mininess.g:283:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
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

            // Mininess.g:284:5: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // Mininess.g:284:10: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression2692);
            shift_expression70=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression70.getTree());

            // Mininess.g:284:27: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= GREATER && LA18_0 <= GREATEREQUAL)||(LA18_0 >= LESS && LA18_0 <= LESSEQUAL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Mininess.g:284:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // Mininess.g:284:29: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
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
            	            // Mininess.g:284:30: '<' ^
            	            {
            	            char_literal71=(Token)match(input,LESS,FOLLOW_LESS_in_relational_expression2697); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal71_tree = 
            	            (Object)adaptor.create(char_literal71)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal71_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:284:37: '>' ^
            	            {
            	            char_literal72=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_expression2702); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal72_tree = 
            	            (Object)adaptor.create(char_literal72)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal72_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Mininess.g:284:44: '<=' ^
            	            {
            	            string_literal73=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relational_expression2707); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal73_tree = 
            	            (Object)adaptor.create(string_literal73)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal73_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Mininess.g:284:52: '>=' ^
            	            {
            	            string_literal74=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relational_expression2712); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal74_tree = 
            	            (Object)adaptor.create(string_literal74)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression2716);
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
    // Mininess.g:286:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
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

            // Mininess.g:287:5: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // Mininess.g:287:10: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression2737);
            relational_expression76=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression76.getTree());

            // Mininess.g:287:32: ( ( '==' ^| '!=' ^) relational_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EQUAL||LA20_0==NOTEQUAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Mininess.g:287:34: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // Mininess.g:287:34: ( '==' ^| '!=' ^)
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
            	            // Mininess.g:287:35: '==' ^
            	            {
            	            string_literal77=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equality_expression2742); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal77_tree = 
            	            (Object)adaptor.create(string_literal77)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal77_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Mininess.g:287:43: '!=' ^
            	            {
            	            string_literal78=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equality_expression2747); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal78_tree = 
            	            (Object)adaptor.create(string_literal78)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal78_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression2751);
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
    // Mininess.g:289:1: and_expression : equality_expression ( '&' ^ equality_expression )* ;
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

            // Mininess.g:290:5: ( equality_expression ( '&' ^ equality_expression )* )
            // Mininess.g:290:10: equality_expression ( '&' ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_and_expression2772);
            equality_expression80=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression80.getTree());

            // Mininess.g:290:30: ( '&' ^ equality_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AMP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Mininess.g:290:32: '&' ^ equality_expression
            	    {
            	    char_literal81=(Token)match(input,AMP,FOLLOW_AMP_in_and_expression2776); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal81_tree = 
            	    (Object)adaptor.create(char_literal81)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal81_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_and_expression2779);
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
    // Mininess.g:292:1: xor_expression : and_expression ( '^' ^ and_expression )* ;
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

            // Mininess.g:293:5: ( and_expression ( '^' ^ and_expression )* )
            // Mininess.g:293:10: and_expression ( '^' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_xor_expression2800);
            and_expression83=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression83.getTree());

            // Mininess.g:293:25: ( '^' ^ and_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BITXOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Mininess.g:293:27: '^' ^ and_expression
            	    {
            	    char_literal84=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_xor_expression2804); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal84_tree = 
            	    (Object)adaptor.create(char_literal84)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal84_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_xor_expression2807);
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
    // Mininess.g:295:1: or_expression : xor_expression ( '|' ^ xor_expression )* ;
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

            // Mininess.g:296:5: ( xor_expression ( '|' ^ xor_expression )* )
            // Mininess.g:296:10: xor_expression ( '|' ^ xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expression_in_or_expression2828);
            xor_expression86=xor_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, xor_expression86.getTree());

            // Mininess.g:296:25: ( '|' ^ xor_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==BITOR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Mininess.g:296:27: '|' ^ xor_expression
            	    {
            	    char_literal87=(Token)match(input,BITOR,FOLLOW_BITOR_in_or_expression2832); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal87_tree = 
            	    (Object)adaptor.create(char_literal87)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal87_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_xor_expression_in_or_expression2835);
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
    // Mininess.g:298:1: logical_and_expression : or_expression ( '&&' ^ or_expression )* ;
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

            // Mininess.g:299:5: ( or_expression ( '&&' ^ or_expression )* )
            // Mininess.g:299:10: or_expression ( '&&' ^ or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_expression_in_logical_and_expression2856);
            or_expression89=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression89.getTree());

            // Mininess.g:299:24: ( '&&' ^ or_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Mininess.g:299:26: '&&' ^ or_expression
            	    {
            	    string_literal90=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression2860); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal90_tree = 
            	    (Object)adaptor.create(string_literal90)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal90_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression2863);
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
    // Mininess.g:301:1: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
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

            // Mininess.g:302:5: ( logical_and_expression ( '||' ^ logical_and_expression )* )
            // Mininess.g:302:10: logical_and_expression ( '||' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression2884);
            logical_and_expression92=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression92.getTree());

            // Mininess.g:302:33: ( '||' ^ logical_and_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Mininess.g:302:35: '||' ^ logical_and_expression
            	    {
            	    string_literal93=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression2888); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal93_tree = 
            	    (Object)adaptor.create(string_literal93)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal93_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression2891);
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
    // Mininess.g:304:1: conditional_expression : logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? ;
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

            // Mininess.g:305:5: ( logical_or_expression ( '?' ^ expression ':' ! conditional_expression )? )
            // Mininess.g:305:10: logical_or_expression ( '?' ^ expression ':' ! conditional_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression2912);
            logical_or_expression95=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression95.getTree());

            // Mininess.g:305:32: ( '?' ^ expression ':' ! conditional_expression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==142) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Mininess.g:305:33: '?' ^ expression ':' ! conditional_expression
                    {
                    char_literal96=(Token)match(input,142,FOLLOW_142_in_conditional_expression2915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal96_tree = 
                    (Object)adaptor.create(char_literal96)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal96_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_conditional_expression2918);
                    expression97=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression97.getTree());

                    char_literal98=(Token)match(input,140,FOLLOW_140_in_conditional_expression2920); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression2923);
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
    // Mininess.g:307:1: assignment_expression : ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression );
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

            // Mininess.g:308:5: ( unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression | conditional_expression )
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
                    // Mininess.g:308:10: unary_expression ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^) assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_assignment_expression2944);
                    unary_expression100=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression100.getTree());

                    // Mininess.g:308:27: ( '=' ^| '*=' ^| '/=' ^| '%=' ^| '+=' ^| '-=' ^| '<<=' ^| '>>=' ^| '&=' ^| '^=' ^| '|=' ^)
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
                            // Mininess.g:308:28: '=' ^
                            {
                            char_literal101=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expression2947); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal101_tree = 
                            (Object)adaptor.create(char_literal101)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal101_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Mininess.g:308:35: '*=' ^
                            {
                            string_literal102=(Token)match(input,MULASSIGN,FOLLOW_MULASSIGN_in_assignment_expression2952); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal102_tree = 
                            (Object)adaptor.create(string_literal102)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal102_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Mininess.g:308:43: '/=' ^
                            {
                            string_literal103=(Token)match(input,DIVASSIGN,FOLLOW_DIVASSIGN_in_assignment_expression2957); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal103_tree = 
                            (Object)adaptor.create(string_literal103)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Mininess.g:308:51: '%=' ^
                            {
                            string_literal104=(Token)match(input,MODASSIGN,FOLLOW_MODASSIGN_in_assignment_expression2962); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal104_tree = 
                            (Object)adaptor.create(string_literal104)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal104_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Mininess.g:308:59: '+=' ^
                            {
                            string_literal105=(Token)match(input,PLUSASSIGN,FOLLOW_PLUSASSIGN_in_assignment_expression2967); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal105_tree = 
                            (Object)adaptor.create(string_literal105)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal105_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // Mininess.g:308:67: '-=' ^
                            {
                            string_literal106=(Token)match(input,MINUSASSIGN,FOLLOW_MINUSASSIGN_in_assignment_expression2972); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal106_tree = 
                            (Object)adaptor.create(string_literal106)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                            }

                            }
                            break;
                        case 7 :
                            // Mininess.g:308:75: '<<=' ^
                            {
                            string_literal107=(Token)match(input,LSHIFTASSIGN,FOLLOW_LSHIFTASSIGN_in_assignment_expression2977); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal107_tree = 
                            (Object)adaptor.create(string_literal107)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal107_tree, root_0);
                            }

                            }
                            break;
                        case 8 :
                            // Mininess.g:308:84: '>>=' ^
                            {
                            string_literal108=(Token)match(input,RSHIFTASSIGN,FOLLOW_RSHIFTASSIGN_in_assignment_expression2982); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal108_tree = 
                            (Object)adaptor.create(string_literal108)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal108_tree, root_0);
                            }

                            }
                            break;
                        case 9 :
                            // Mininess.g:308:93: '&=' ^
                            {
                            string_literal109=(Token)match(input,BITANDASSIGN,FOLLOW_BITANDASSIGN_in_assignment_expression2987); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal109_tree = 
                            (Object)adaptor.create(string_literal109)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal109_tree, root_0);
                            }

                            }
                            break;
                        case 10 :
                            // Mininess.g:308:101: '^=' ^
                            {
                            string_literal110=(Token)match(input,BITXORASSIGN,FOLLOW_BITXORASSIGN_in_assignment_expression2992); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal110_tree = 
                            (Object)adaptor.create(string_literal110)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);
                            }

                            }
                            break;
                        case 11 :
                            // Mininess.g:308:109: '|=' ^
                            {
                            string_literal111=(Token)match(input,BITORASSIGN,FOLLOW_BITORASSIGN_in_assignment_expression2997); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal111_tree = 
                            (Object)adaptor.create(string_literal111)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal111_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression3001);
                    assignment_expression112=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression112.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:309:10: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression3012);
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
    // Mininess.g:311:1: expression : assignment_expression ( ',' ^ assignment_expression )* ;
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

            // Mininess.g:312:5: ( assignment_expression ( ',' ^ assignment_expression )* )
            // Mininess.g:312:10: assignment_expression ( ',' ^ assignment_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_expression3031);
            assignment_expression114=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression114.getTree());

            // Mininess.g:312:32: ( ',' ^ assignment_expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Mininess.g:312:33: ',' ^ assignment_expression
            	    {
            	    char_literal115=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression3034); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal115_tree = 
            	    (Object)adaptor.create(char_literal115)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal115_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_expression_in_expression3037);
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
    // Mininess.g:314:1: constant_expression : conditional_expression ;
    public final MininessParser.constant_expression_return constant_expression() throws RecognitionException {
        MininessParser.constant_expression_return retval = new MininessParser.constant_expression_return();
        retval.start = input.LT(1);

        int constant_expression_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.conditional_expression_return conditional_expression117 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // Mininess.g:315:5: ( conditional_expression )
            // Mininess.g:315:10: conditional_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expression3058);
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
    // Mininess.g:333:1: declaration : ( declaration_specifiers ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers init_declarator_list ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) );
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
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Mininess.g:336:5: ( declaration_specifiers ( init_declarator_list )? ';' -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? ) | function_definition -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) ) | TYPEDEF declaration_specifiers init_declarator_list ';' -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list ) )
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
            case ERROR_T:
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
            case NX_STRUCT:
            case STRUCT:
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
            case ENUM:
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
            case RAW_IDENTIFIER:
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
            case CONST:
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
            case DEFAULT:
                {
                int LA31_23 = input.LA(2);

                if ( (synpred59_Mininess()) ) {
                    alt31=1;
                }
                else if ( (synpred60_Mininess()) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 23, input);

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
                    // Mininess.g:336:10: declaration_specifiers ( init_declarator_list )? ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3121);
                    declaration_specifiers118=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers118.getTree());

                    // Mininess.g:340:33: ( init_declarator_list )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPARENS||LA30_0==RAW_IDENTIFIER||LA30_0==STAR) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // Mininess.g:340:33: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration3123);
                            init_declarator_list119=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list119.getTree());

                            }
                            break;

                    }


                    char_literal120=(Token)match(input,141,FOLLOW_141_in_declaration3126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_141.add(char_literal120);


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
                    // 347:14: -> ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                    {
                        // Mininess.g:347:17: ^( DECLARATION declaration_specifiers ( init_declarator_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // Mininess.g:347:54: ( init_declarator_list )?
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
                    // Mininess.g:349:10: function_definition
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    pushFollow(FOLLOW_function_definition_in_declaration3188);
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
                    // 352:30: -> ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                    {
                        // Mininess.g:352:33: ^( DECLARATION ^( FUNCTION_DEFINITION function_definition ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        // Mininess.g:352:47: ^( FUNCTION_DEFINITION function_definition )
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
                    // Mininess.g:355:10: TYPEDEF declaration_specifiers init_declarator_list ';'
                    {
                    if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).declaredNames = new LinkedList<String>();
                               ((declaration_scope)declaration_stack.peek()).inStructDeclaration = false;
                             }

                    TYPEDEF122=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_declaration3233); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEDEF.add(TYPEDEF122);


                    pushFollow(FOLLOW_declaration_specifiers_in_declaration3235);
                    declaration_specifiers123=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers123.getTree());

                    pushFollow(FOLLOW_init_declarator_list_in_declaration3237);
                    init_declarator_list124=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list124.getTree());

                    char_literal125=(Token)match(input,141,FOLLOW_141_in_declaration3239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_141.add(char_literal125);


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
                    // 365:14: -> ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
                    {
                        // Mininess.g:365:17: ^( DECLARATION TYPEDEF declaration_specifiers init_declarator_list )
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
    // Mininess.g:367:1: declaration_specifiers : ( storage_class_specifier | type_specifier | type_qualifier | DEFAULT )+ ;
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

            // Mininess.g:368:5: ( ( storage_class_specifier | type_specifier | type_qualifier | DEFAULT )+ )
            // Mininess.g:368:10: ( storage_class_specifier | type_specifier | type_qualifier | DEFAULT )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:368:10: ( storage_class_specifier | type_specifier | type_qualifier | DEFAULT )+
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
                case ERROR_T:
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
            	    // Mininess.g:368:11: storage_class_specifier
            	    {
            	    pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers3299);
            	    storage_class_specifier126=storage_class_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, storage_class_specifier126.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:369:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_declaration_specifiers3313);
            	    type_specifier127=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier127.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Mininess.g:370:11: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers3336);
            	    type_qualifier128=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier128.getTree());

            	    }
            	    break;
            	case 4 :
            	    // Mininess.g:371:11: DEFAULT
            	    {
            	    DEFAULT129=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_declaration_specifiers3359); if (state.failed) return retval;
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
    // Mininess.g:377:1: init_declarator_list : init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) ;
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

            // Mininess.g:378:5: ( init_declarator ( ',' init_declarator )* -> ^( DECLARATOR_LIST ( init_declarator )+ ) )
            // Mininess.g:378:10: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list3382);
            init_declarator130=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator130.getTree());

            // Mininess.g:378:26: ( ',' init_declarator )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Mininess.g:378:27: ',' init_declarator
            	    {
            	    char_literal131=(Token)match(input,COMMA,FOLLOW_COMMA_in_init_declarator_list3385); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal131);


            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list3387);
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
            // 378:49: -> ^( DECLARATOR_LIST ( init_declarator )+ )
            {
                // Mininess.g:378:52: ^( DECLARATOR_LIST ( init_declarator )+ )
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
    // Mininess.g:384:1: init_declarator : declarator ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) ;
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

            // Mininess.g:385:5: ( declarator ( '=' initializer )? -> ^( INIT_DECLARATOR declarator ( initializer )? ) )
            // Mininess.g:385:10: declarator ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator3421);
            declarator133=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator133.getTree());

            // Mininess.g:385:21: ( '=' initializer )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ASSIGN) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Mininess.g:385:22: '=' initializer
                    {
                    char_literal134=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init_declarator3424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal134);


                    pushFollow(FOLLOW_initializer_in_init_declarator3426);
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
            // 385:40: -> ^( INIT_DECLARATOR declarator ( initializer )? )
            {
                // Mininess.g:385:43: ^( INIT_DECLARATOR declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATOR, "INIT_DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // Mininess.g:385:72: ( initializer )?
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
    // Mininess.g:387:1: storage_class_specifier : ( COMMAND | EVENT | TASK );
    public final MininessParser.storage_class_specifier_return storage_class_specifier() throws RecognitionException {
        MininessParser.storage_class_specifier_return retval = new MininessParser.storage_class_specifier_return();
        retval.start = input.LT(1);

        int storage_class_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token set136=null;

        Object set136_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // Mininess.g:388:5: ( COMMAND | EVENT | TASK )
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
    // Mininess.g:392:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | INT8_T | INT16_T | INT32_T | UINT8_T | UINT16_T | UINT32_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | ERROR_T | struct_or_union_specifier | enum_specifier | typedef_name );
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
        Token ERROR_T153=null;
        MininessParser.struct_or_union_specifier_return struct_or_union_specifier154 =null;

        MininessParser.enum_specifier_return enum_specifier155 =null;

        MininessParser.typedef_name_return typedef_name156 =null;


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
        Object ERROR_T153_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Mininess.g:393:5: ( VOID | CHAR | SHORT | INT | LONG | SIGNED | UNSIGNED | INT8_T | INT16_T | INT32_T | UINT8_T | UINT16_T | UINT32_T | NX_UINT8_T | NX_UINT16_T | NX_UINT32_T | ERROR_T | struct_or_union_specifier | enum_specifier | typedef_name )
            int alt35=20;
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
            case ERROR_T:
                {
                alt35=17;
                }
                break;
            case NX_STRUCT:
            case STRUCT:
                {
                alt35=18;
                }
                break;
            case ENUM:
                {
                alt35=19;
                }
                break;
            case RAW_IDENTIFIER:
                {
                alt35=20;
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
                    // Mininess.g:393:9: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID137=(Token)match(input,VOID,FOLLOW_VOID_in_type_specifier3498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID137_tree = 
                    (Object)adaptor.create(VOID137)
                    ;
                    adaptor.addChild(root_0, VOID137_tree);
                    }

                    }
                    break;
                case 2 :
                    // Mininess.g:394:9: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR138=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier3508); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR138_tree = 
                    (Object)adaptor.create(CHAR138)
                    ;
                    adaptor.addChild(root_0, CHAR138_tree);
                    }

                    }
                    break;
                case 3 :
                    // Mininess.g:395:9: SHORT
                    {
                    root_0 = (Object)adaptor.nil();


                    SHORT139=(Token)match(input,SHORT,FOLLOW_SHORT_in_type_specifier3518); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHORT139_tree = 
                    (Object)adaptor.create(SHORT139)
                    ;
                    adaptor.addChild(root_0, SHORT139_tree);
                    }

                    }
                    break;
                case 4 :
                    // Mininess.g:396:9: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT140=(Token)match(input,INT,FOLLOW_INT_in_type_specifier3528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT140_tree = 
                    (Object)adaptor.create(INT140)
                    ;
                    adaptor.addChild(root_0, INT140_tree);
                    }

                    }
                    break;
                case 5 :
                    // Mininess.g:397:9: LONG
                    {
                    root_0 = (Object)adaptor.nil();


                    LONG141=(Token)match(input,LONG,FOLLOW_LONG_in_type_specifier3538); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONG141_tree = 
                    (Object)adaptor.create(LONG141)
                    ;
                    adaptor.addChild(root_0, LONG141_tree);
                    }

                    }
                    break;
                case 6 :
                    // Mininess.g:398:9: SIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    SIGNED142=(Token)match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier3548); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIGNED142_tree = 
                    (Object)adaptor.create(SIGNED142)
                    ;
                    adaptor.addChild(root_0, SIGNED142_tree);
                    }

                    }
                    break;
                case 7 :
                    // Mininess.g:399:9: UNSIGNED
                    {
                    root_0 = (Object)adaptor.nil();


                    UNSIGNED143=(Token)match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier3558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNSIGNED143_tree = 
                    (Object)adaptor.create(UNSIGNED143)
                    ;
                    adaptor.addChild(root_0, UNSIGNED143_tree);
                    }

                    }
                    break;
                case 8 :
                    // Mininess.g:400:9: INT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT8_T144=(Token)match(input,INT8_T,FOLLOW_INT8_T_in_type_specifier3568); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT8_T144_tree = 
                    (Object)adaptor.create(INT8_T144)
                    ;
                    adaptor.addChild(root_0, INT8_T144_tree);
                    }

                    }
                    break;
                case 9 :
                    // Mininess.g:401:9: INT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT16_T145=(Token)match(input,INT16_T,FOLLOW_INT16_T_in_type_specifier3590); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT16_T145_tree = 
                    (Object)adaptor.create(INT16_T145)
                    ;
                    adaptor.addChild(root_0, INT16_T145_tree);
                    }

                    }
                    break;
                case 10 :
                    // Mininess.g:402:9: INT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    INT32_T146=(Token)match(input,INT32_T,FOLLOW_INT32_T_in_type_specifier3611); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT32_T146_tree = 
                    (Object)adaptor.create(INT32_T146)
                    ;
                    adaptor.addChild(root_0, INT32_T146_tree);
                    }

                    }
                    break;
                case 11 :
                    // Mininess.g:403:9: UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT8_T147=(Token)match(input,UINT8_T,FOLLOW_UINT8_T_in_type_specifier3632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT8_T147_tree = 
                    (Object)adaptor.create(UINT8_T147)
                    ;
                    adaptor.addChild(root_0, UINT8_T147_tree);
                    }

                    }
                    break;
                case 12 :
                    // Mininess.g:404:9: UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT16_T148=(Token)match(input,UINT16_T,FOLLOW_UINT16_T_in_type_specifier3653); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT16_T148_tree = 
                    (Object)adaptor.create(UINT16_T148)
                    ;
                    adaptor.addChild(root_0, UINT16_T148_tree);
                    }

                    }
                    break;
                case 13 :
                    // Mininess.g:405:9: UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    UINT32_T149=(Token)match(input,UINT32_T,FOLLOW_UINT32_T_in_type_specifier3673); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT32_T149_tree = 
                    (Object)adaptor.create(UINT32_T149)
                    ;
                    adaptor.addChild(root_0, UINT32_T149_tree);
                    }

                    }
                    break;
                case 14 :
                    // Mininess.g:406:9: NX_UINT8_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT8_T150=(Token)match(input,NX_UINT8_T,FOLLOW_NX_UINT8_T_in_type_specifier3693); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT8_T150_tree = 
                    (Object)adaptor.create(NX_UINT8_T150)
                    ;
                    adaptor.addChild(root_0, NX_UINT8_T150_tree);
                    }

                    }
                    break;
                case 15 :
                    // Mininess.g:407:9: NX_UINT16_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT16_T151=(Token)match(input,NX_UINT16_T,FOLLOW_NX_UINT16_T_in_type_specifier3711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT16_T151_tree = 
                    (Object)adaptor.create(NX_UINT16_T151)
                    ;
                    adaptor.addChild(root_0, NX_UINT16_T151_tree);
                    }

                    }
                    break;
                case 16 :
                    // Mininess.g:408:9: NX_UINT32_T
                    {
                    root_0 = (Object)adaptor.nil();


                    NX_UINT32_T152=(Token)match(input,NX_UINT32_T,FOLLOW_NX_UINT32_T_in_type_specifier3728); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NX_UINT32_T152_tree = 
                    (Object)adaptor.create(NX_UINT32_T152)
                    ;
                    adaptor.addChild(root_0, NX_UINT32_T152_tree);
                    }

                    }
                    break;
                case 17 :
                    // Mininess.g:409:9: ERROR_T
                    {
                    root_0 = (Object)adaptor.nil();


                    ERROR_T153=(Token)match(input,ERROR_T,FOLLOW_ERROR_T_in_type_specifier3745); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ERROR_T153_tree = 
                    (Object)adaptor.create(ERROR_T153)
                    ;
                    adaptor.addChild(root_0, ERROR_T153_tree);
                    }

                    }
                    break;
                case 18 :
                    // Mininess.g:410:9: struct_or_union_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier3766);
                    struct_or_union_specifier154=struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_or_union_specifier154.getTree());

                    }
                    break;
                case 19 :
                    // Mininess.g:411:9: enum_specifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_specifier_in_type_specifier3776);
                    enum_specifier155=enum_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_specifier155.getTree());

                    }
                    break;
                case 20 :
                    // Mininess.g:412:9: typedef_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_name_in_type_specifier3786);
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
    // Mininess.g:414:1: struct_or_union_specifier : ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) );
    public final MininessParser.struct_or_union_specifier_return struct_or_union_specifier() throws RecognitionException {
        MininessParser.struct_or_union_specifier_return retval = new MininessParser.struct_or_union_specifier_return();
        retval.start = input.LT(1);

        int struct_or_union_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal159=null;
        Token char_literal161=null;
        MininessParser.struct_or_union_return struct_or_union157 =null;

        MininessParser.identifier_return identifier158 =null;

        MininessParser.struct_declaration_list_return struct_declaration_list160 =null;

        MininessParser.struct_or_union_return struct_or_union162 =null;

        MininessParser.identifier_return identifier163 =null;


        Object char_literal159_tree=null;
        Object char_literal161_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_struct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declaration_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Mininess.g:415:5: ( struct_or_union ( identifier )? '{' struct_declaration_list '}' -> ^( struct_or_union ( identifier )? struct_declaration_list ) | struct_or_union identifier -> ^( struct_or_union identifier ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==NX_STRUCT||LA37_0==STRUCT) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RAW_IDENTIFIER) ) {
                    int LA37_2 = input.LA(3);

                    if ( (LA37_2==LBRACE) ) {
                        alt37=1;
                    }
                    else if ( (LA37_2==EOF||LA37_2==CHAR||(LA37_2 >= COMMA && LA37_2 <= COMMAND)||LA37_2==CONST||LA37_2==DEFAULT||LA37_2==ENUM||(LA37_2 >= ERROR_T && LA37_2 <= EVENT)||(LA37_2 >= INT && LA37_2 <= INT8_T)||LA37_2==LBRACKET||(LA37_2 >= LONG && LA37_2 <= LPARENS)||(LA37_2 >= NX_STRUCT && LA37_2 <= NX_UINT8_T)||LA37_2==RAW_IDENTIFIER||LA37_2==RBRACKET||LA37_2==RPARENS||(LA37_2 >= SHORT && LA37_2 <= SIGNED)||LA37_2==STAR||LA37_2==STRUCT||LA37_2==TASK||(LA37_2 >= UINT16_T && LA37_2 <= UINT8_T)||LA37_2==UNSIGNED||LA37_2==VOID||(LA37_2 >= 140 && LA37_2 <= 141)) ) {
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
                    // Mininess.g:415:10: struct_or_union ( identifier )? '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier3801);
                    struct_or_union157=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union157.getTree());

                    // Mininess.g:415:26: ( identifier )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RAW_IDENTIFIER) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // Mininess.g:415:26: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_struct_or_union_specifier3803);
                            identifier158=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier158.getTree());

                            }
                            break;

                    }


                    char_literal159=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_struct_or_union_specifier3806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal159);


                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier3808);
                    struct_declaration_list160=struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_declaration_list.add(struct_declaration_list160.getTree());

                    char_literal161=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_struct_or_union_specifier3810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal161);


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
                    // 416:13: -> ^( struct_or_union ( identifier )? struct_declaration_list )
                    {
                        // Mininess.g:416:16: ^( struct_or_union ( identifier )? struct_declaration_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);

                        // Mininess.g:416:34: ( identifier )?
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
                    // Mininess.g:417:10: struct_or_union identifier
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier3844);
                    struct_or_union162=struct_or_union();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union162.getTree());

                    pushFollow(FOLLOW_identifier_in_struct_or_union_specifier3846);
                    identifier163=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier163.getTree());

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
                    // 418:13: -> ^( struct_or_union identifier )
                    {
                        // Mininess.g:418:16: ^( struct_or_union identifier )
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
    // Mininess.g:421:1: struct_or_union : ( STRUCT | NX_STRUCT );
    public final MininessParser.struct_or_union_return struct_or_union() throws RecognitionException {
        MininessParser.struct_or_union_return retval = new MininessParser.struct_or_union_return();
        retval.start = input.LT(1);

        int struct_or_union_StartIndex = input.index();

        Object root_0 = null;

        Token set164=null;

        Object set164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Mininess.g:422:5: ( STRUCT | NX_STRUCT )
            // Mininess.g:
            {
            root_0 = (Object)adaptor.nil();


            set164=(Token)input.LT(1);

            if ( input.LA(1)==NX_STRUCT||input.LA(1)==STRUCT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set164)
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
    // Mininess.g:428:1: struct_declaration_list : ( struct_declaration )+ ;
    public final MininessParser.struct_declaration_list_return struct_declaration_list() throws RecognitionException {
        MininessParser.struct_declaration_list_return retval = new MininessParser.struct_declaration_list_return();
        retval.start = input.LT(1);

        int struct_declaration_list_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.struct_declaration_return struct_declaration165 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Mininess.g:429:5: ( ( struct_declaration )+ )
            // Mininess.g:429:10: ( struct_declaration )+
            {
            root_0 = (Object)adaptor.nil();


            if ( state.backtracking==0 ) { ((declaration_scope)declaration_stack.peek()).inStructDeclaration = true; }

            // Mininess.g:430:10: ( struct_declaration )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==CHAR||LA38_0==CONST||LA38_0==ENUM||LA38_0==ERROR_T||(LA38_0 >= INT && LA38_0 <= INT8_T)||LA38_0==LONG||(LA38_0 >= NX_STRUCT && LA38_0 <= NX_UINT8_T)||LA38_0==RAW_IDENTIFIER||(LA38_0 >= SHORT && LA38_0 <= SIGNED)||LA38_0==STRUCT||(LA38_0 >= UINT16_T && LA38_0 <= UINT8_T)||LA38_0==UNSIGNED||LA38_0==VOID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Mininess.g:430:10: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list3926);
            	    struct_declaration165=struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, struct_declaration165.getTree());

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
    // Mininess.g:433:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) ;
    public final MininessParser.struct_declaration_return struct_declaration() throws RecognitionException {
        MininessParser.struct_declaration_return retval = new MininessParser.struct_declaration_return();
        retval.start = input.LT(1);

        int struct_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal168=null;
        MininessParser.specifier_qualifier_list_return specifier_qualifier_list166 =null;

        MininessParser.struct_declarator_list_return struct_declarator_list167 =null;


        Object char_literal168_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_struct_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator_list");
        RewriteRuleSubtreeStream stream_specifier_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule specifier_qualifier_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Mininess.g:434:5: ( specifier_qualifier_list struct_declarator_list ';' -> ^( DECLARATION specifier_qualifier_list struct_declarator_list ) )
            // Mininess.g:434:10: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration3957);
            specifier_qualifier_list166=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_specifier_qualifier_list.add(specifier_qualifier_list166.getTree());

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration3959);
            struct_declarator_list167=struct_declarator_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator_list.add(struct_declarator_list167.getTree());

            char_literal168=(Token)match(input,141,FOLLOW_141_in_struct_declaration3961); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_141.add(char_literal168);


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
            // 435:13: -> ^( DECLARATION specifier_qualifier_list struct_declarator_list )
            {
                // Mininess.g:435:16: ^( DECLARATION specifier_qualifier_list struct_declarator_list )
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
    // Mininess.g:442:1: specifier_qualifier_list : ( type_specifier | type_qualifier )+ ;
    public final MininessParser.specifier_qualifier_list_return specifier_qualifier_list() throws RecognitionException {
        MininessParser.specifier_qualifier_list_return retval = new MininessParser.specifier_qualifier_list_return();
        retval.start = input.LT(1);

        int specifier_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.type_specifier_return type_specifier169 =null;

        MininessParser.type_qualifier_return type_qualifier170 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Mininess.g:443:5: ( ( type_specifier | type_qualifier )+ )
            // Mininess.g:443:10: ( type_specifier | type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:443:10: ( type_specifier | type_qualifier )+
            int cnt39=0;
            loop39:
            do {
                int alt39=3;
                switch ( input.LA(1) ) {
                case RAW_IDENTIFIER:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (synpred92_Mininess()) ) {
                        alt39=1;
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
            	    // Mininess.g:443:11: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list4008);
            	    type_specifier169=type_specifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier169.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:443:28: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list4012);
            	    type_qualifier170=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier170.getTree());

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
    // Mininess.g:450:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) ;
    public final MininessParser.struct_declarator_list_return struct_declarator_list() throws RecognitionException {
        MininessParser.struct_declarator_list_return retval = new MininessParser.struct_declarator_list_return();
        retval.start = input.LT(1);

        int struct_declarator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal172=null;
        MininessParser.struct_declarator_return struct_declarator171 =null;

        MininessParser.struct_declarator_return struct_declarator173 =null;


        Object char_literal172_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_struct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule struct_declarator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Mininess.g:451:5: ( struct_declarator ( ',' struct_declarator )* -> ^( DECLARATOR_LIST ( struct_declarator )+ ) )
            // Mininess.g:451:10: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list4038);
            struct_declarator171=struct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator171.getTree());

            // Mininess.g:451:28: ( ',' struct_declarator )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // Mininess.g:451:29: ',' struct_declarator
            	    {
            	    char_literal172=(Token)match(input,COMMA,FOLLOW_COMMA_in_struct_declarator_list4041); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal172);


            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list4043);
            	    struct_declarator173=struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_struct_declarator.add(struct_declarator173.getTree());

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
            // 451:53: -> ^( DECLARATOR_LIST ( struct_declarator )+ )
            {
                // Mininess.g:451:56: ^( DECLARATOR_LIST ( struct_declarator )+ )
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
    // Mininess.g:453:1: struct_declarator : ( ( declarator )? ':' constant_expression | declarator );
    public final MininessParser.struct_declarator_return struct_declarator() throws RecognitionException {
        MininessParser.struct_declarator_return retval = new MininessParser.struct_declarator_return();
        retval.start = input.LT(1);

        int struct_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal175=null;
        MininessParser.declarator_return declarator174 =null;

        MininessParser.constant_expression_return constant_expression176 =null;

        MininessParser.declarator_return declarator177 =null;


        Object char_literal175_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Mininess.g:454:5: ( ( declarator )? ':' constant_expression | declarator )
            int alt42=2;
            switch ( input.LA(1) ) {
            case STAR:
                {
                int LA42_1 = input.LA(2);

                if ( (synpred96_Mininess()) ) {
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

                if ( (synpred96_Mininess()) ) {
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

                if ( (synpred96_Mininess()) ) {
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
            case 140:
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
                    // Mininess.g:454:10: ( declarator )? ':' constant_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    // Mininess.g:454:10: ( declarator )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==LPARENS||LA41_0==RAW_IDENTIFIER||LA41_0==STAR) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // Mininess.g:454:10: declarator
                            {
                            pushFollow(FOLLOW_declarator_in_struct_declarator4073);
                            declarator174=declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator174.getTree());

                            }
                            break;

                    }


                    char_literal175=(Token)match(input,140,FOLLOW_140_in_struct_declarator4076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal175_tree = 
                    (Object)adaptor.create(char_literal175)
                    ;
                    adaptor.addChild(root_0, char_literal175_tree);
                    }

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator4078);
                    constant_expression176=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression176.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:455:10: declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_struct_declarator4089);
                    declarator177=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator177.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Mininess.g:457:1: enum_specifier : ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) );
    public final MininessParser.enum_specifier_return enum_specifier() throws RecognitionException {
        MininessParser.enum_specifier_return retval = new MininessParser.enum_specifier_return();
        retval.start = input.LT(1);

        int enum_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM178=null;
        Token char_literal180=null;
        Token char_literal182=null;
        Token char_literal183=null;
        Token ENUM184=null;
        Token char_literal186=null;
        Token char_literal188=null;
        Token char_literal189=null;
        Token ENUM190=null;
        MininessParser.identifier_return identifier179 =null;

        MininessParser.enumerator_list_return enumerator_list181 =null;

        MininessParser.identifier_return identifier185 =null;

        MininessParser.enumerator_list_return enumerator_list187 =null;

        MininessParser.identifier_return identifier191 =null;


        Object ENUM178_tree=null;
        Object char_literal180_tree=null;
        Object char_literal182_tree=null;
        Object char_literal183_tree=null;
        Object ENUM184_tree=null;
        Object char_literal186_tree=null;
        Object char_literal188_tree=null;
        Object char_literal189_tree=null;
        Object ENUM190_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_enumerator_list=new RewriteRuleSubtreeStream(adaptor,"rule enumerator_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Mininess.g:458:5: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' -> ^( ENUM ( identifier )? enumerator_list ) | ENUM identifier '{' enumerator_list ( ',' )? '}' -> ^( ENUM identifier enumerator_list ) | ENUM identifier -> ^( ENUM identifier ) )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ENUM) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred99_Mininess()) ) {
                    alt46=1;
                }
                else if ( (synpred101_Mininess()) ) {
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
                    // Mininess.g:458:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM178=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier4108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM178);


                    // Mininess.g:458:15: ( identifier )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RAW_IDENTIFIER) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // Mininess.g:458:15: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_enum_specifier4110);
                            identifier179=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier179.getTree());

                            }
                            break;

                    }


                    char_literal180=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier4113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal180);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier4115);
                    enumerator_list181=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list181.getTree());

                    // Mininess.g:458:47: ( ',' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==COMMA) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // Mininess.g:458:47: ','
                            {
                            char_literal182=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier4117); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal182);


                            }
                            break;

                    }


                    char_literal183=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier4120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal183);


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
                    // 459:14: -> ^( ENUM ( identifier )? enumerator_list )
                    {
                        // Mininess.g:459:17: ^( ENUM ( identifier )? enumerator_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENUM.nextNode()
                        , root_1);

                        // Mininess.g:459:24: ( identifier )?
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
                    // Mininess.g:460:10: ENUM identifier '{' enumerator_list ( ',' )? '}'
                    {
                    ENUM184=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier4155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM184);


                    pushFollow(FOLLOW_identifier_in_enum_specifier4157);
                    identifier185=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier185.getTree());

                    char_literal186=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enum_specifier4159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal186);


                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier4161);
                    enumerator_list187=enumerator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_enumerator_list.add(enumerator_list187.getTree());

                    // Mininess.g:460:46: ( ',' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==COMMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // Mininess.g:460:46: ','
                            {
                            char_literal188=(Token)match(input,COMMA,FOLLOW_COMMA_in_enum_specifier4163); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal188);


                            }
                            break;

                    }


                    char_literal189=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enum_specifier4166); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal189);


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
                    // 461:14: -> ^( ENUM identifier enumerator_list )
                    {
                        // Mininess.g:461:17: ^( ENUM identifier enumerator_list )
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
                    // Mininess.g:462:10: ENUM identifier
                    {
                    ENUM190=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_specifier4200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM190);


                    pushFollow(FOLLOW_identifier_in_enum_specifier4202);
                    identifier191=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier191.getTree());

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
                    // 463:14: -> ^( ENUM identifier )
                    {
                        // Mininess.g:463:17: ^( ENUM identifier )
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
    // Mininess.g:465:1: enumerator_list : enumerator ( ',' ! enumerator )* ;
    public final MininessParser.enumerator_list_return enumerator_list() throws RecognitionException {
        MininessParser.enumerator_list_return retval = new MininessParser.enumerator_list_return();
        retval.start = input.LT(1);

        int enumerator_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal193=null;
        MininessParser.enumerator_return enumerator192 =null;

        MininessParser.enumerator_return enumerator194 =null;


        Object char_literal193_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Mininess.g:466:5: ( enumerator ( ',' ! enumerator )* )
            // Mininess.g:466:10: enumerator ( ',' ! enumerator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_enumerator_in_enumerator_list4242);
            enumerator192=enumerator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator192.getTree());

            // Mininess.g:466:21: ( ',' ! enumerator )*
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
            	    // Mininess.g:466:22: ',' ! enumerator
            	    {
            	    char_literal193=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumerator_list4245); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list4248);
            	    enumerator194=enumerator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerator194.getTree());

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
    // Mininess.g:472:1: enumerator : identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) ;
    public final MininessParser.enumerator_return enumerator() throws RecognitionException {
        MininessParser.enumerator_return retval = new MininessParser.enumerator_return();
        retval.start = input.LT(1);

        int enumerator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal196=null;
        MininessParser.identifier_return identifier195 =null;

        MininessParser.constant_expression_return constant_expression197 =null;


        Object char_literal196_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Mininess.g:473:5: ( identifier ( '=' constant_expression )? -> ^( ENUMERATOR identifier ( constant_expression )? ) )
            // Mininess.g:473:10: identifier ( '=' constant_expression )?
            {
            pushFollow(FOLLOW_identifier_in_enumerator4273);
            identifier195=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier195.getTree());

            // Mininess.g:473:21: ( '=' constant_expression )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ASSIGN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Mininess.g:473:22: '=' constant_expression
                    {
                    char_literal196=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumerator4276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal196);


                    pushFollow(FOLLOW_constant_expression_in_enumerator4278);
                    constant_expression197=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression197.getTree());

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
            // 473:48: -> ^( ENUMERATOR identifier ( constant_expression )? )
            {
                // Mininess.g:473:51: ^( ENUMERATOR identifier ( constant_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUMERATOR, "ENUMERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // Mininess.g:473:75: ( constant_expression )?
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
    // Mininess.g:475:1: type_qualifier : CONST ;
    public final MininessParser.type_qualifier_return type_qualifier() throws RecognitionException {
        MininessParser.type_qualifier_return retval = new MininessParser.type_qualifier_return();
        retval.start = input.LT(1);

        int type_qualifier_StartIndex = input.index();

        Object root_0 = null;

        Token CONST198=null;

        Object CONST198_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Mininess.g:476:5: ( CONST )
            // Mininess.g:476:10: CONST
            {
            root_0 = (Object)adaptor.nil();


            CONST198=(Token)match(input,CONST,FOLLOW_CONST_in_type_qualifier4310); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONST198_tree = 
            (Object)adaptor.create(CONST198)
            ;
            adaptor.addChild(root_0, CONST198_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Mininess.g:478:1: declarator : ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) ;
    public final MininessParser.declarator_return declarator() throws RecognitionException {
        MininessParser.declarator_return retval = new MininessParser.declarator_return();
        retval.start = input.LT(1);

        int declarator_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.pointer_return pointer199 =null;

        MininessParser.direct_declarator_return direct_declarator200 =null;


        RewriteRuleSubtreeStream stream_direct_declarator=new RewriteRuleSubtreeStream(adaptor,"rule direct_declarator");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Mininess.g:479:5: ( ( pointer )? direct_declarator -> ^( DECLARATOR ( pointer )? direct_declarator ) )
            // Mininess.g:479:10: ( pointer )? direct_declarator
            {
            // Mininess.g:479:10: ( pointer )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==STAR) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Mininess.g:479:10: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator4329);
                    pointer199=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer199.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_direct_declarator_in_declarator4332);
            direct_declarator200=direct_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_direct_declarator.add(direct_declarator200.getTree());

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
            // 479:37: -> ^( DECLARATOR ( pointer )? direct_declarator )
            {
                // Mininess.g:479:40: ^( DECLARATOR ( pointer )? direct_declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                // Mininess.g:479:53: ( pointer )?
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
    // Mininess.g:481:1: direct_declarator : direct_declarator_identifier ( direct_declarator_modifier )* ;
    public final MininessParser.direct_declarator_return direct_declarator() throws RecognitionException {
        MininessParser.direct_declarator_return retval = new MininessParser.direct_declarator_return();
        retval.start = input.LT(1);

        int direct_declarator_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.direct_declarator_identifier_return direct_declarator_identifier201 =null;

        MininessParser.direct_declarator_modifier_return direct_declarator_modifier202 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Mininess.g:482:5: ( direct_declarator_identifier ( direct_declarator_modifier )* )
            // Mininess.g:482:9: direct_declarator_identifier ( direct_declarator_modifier )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_direct_declarator_identifier_in_direct_declarator4357);
            direct_declarator_identifier201=direct_declarator_identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_identifier201.getTree());

            // Mininess.g:482:38: ( direct_declarator_modifier )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==LBRACKET||LA50_0==LPARENS) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Mininess.g:482:38: direct_declarator_modifier
            	    {
            	    pushFollow(FOLLOW_direct_declarator_modifier_in_direct_declarator4359);
            	    direct_declarator_modifier202=direct_declarator_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_declarator_modifier202.getTree());

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
    // Mininess.g:493:1: direct_declarator_identifier : (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator );
    public final MininessParser.direct_declarator_identifier_return direct_declarator_identifier() throws RecognitionException {
        MininessParser.direct_declarator_identifier_return retval = new MininessParser.direct_declarator_identifier_return();
        retval.start = input.LT(1);

        int direct_declarator_identifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal203=null;
        Token char_literal205=null;
        Token char_literal207=null;
        MininessParser.identifier_return myIdName =null;

        MininessParser.identifier_return identifier204 =null;

        MininessParser.declarator_return declarator206 =null;


        Object char_literal203_tree=null;
        Object char_literal205_tree=null;
        Object char_literal207_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Mininess.g:494:5: (myIdName= identifier ( '.' identifier )? -> ^( IDENTIFIER_PATH ( identifier )+ ) | '(' declarator ')' -> declarator )
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
                    // Mininess.g:494:9: myIdName= identifier ( '.' identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_direct_declarator_identifier4385);
                    myIdName=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(myIdName.getTree());

                    // Mininess.g:494:29: ( '.' identifier )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==DOT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // Mininess.g:494:30: '.' identifier
                            {
                            char_literal203=(Token)match(input,DOT,FOLLOW_DOT_in_direct_declarator_identifier4388); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(char_literal203);


                            pushFollow(FOLLOW_identifier_in_direct_declarator_identifier4390);
                            identifier204=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier204.getTree());

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
                    // 498:15: -> ^( IDENTIFIER_PATH ( identifier )+ )
                    {
                        // Mininess.g:498:18: ^( IDENTIFIER_PATH ( identifier )+ )
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
                    // Mininess.g:499:9: '(' declarator ')'
                    {
                    char_literal205=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_identifier4425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal205);


                    pushFollow(FOLLOW_declarator_in_direct_declarator_identifier4427);
                    declarator206=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator206.getTree());

                    char_literal207=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_identifier4429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal207);


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
                    // 499:28: -> declarator
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
    // Mininess.g:505:1: direct_declarator_modifier : ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) );
    public final MininessParser.direct_declarator_modifier_return direct_declarator_modifier() throws RecognitionException {
        MininessParser.direct_declarator_modifier_return retval = new MininessParser.direct_declarator_modifier_return();
        retval.start = input.LT(1);

        int direct_declarator_modifier_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal208=null;
        Token char_literal210=null;
        Token char_literal211=null;
        Token char_literal212=null;
        Token char_literal213=null;
        Token char_literal214=null;
        MininessParser.parameter_type_list_return gen =null;

        MininessParser.parameter_type_list_return normal =null;

        MininessParser.constant_expression_return constant_expression209 =null;


        Object char_literal208_tree=null;
        Object char_literal210_tree=null;
        Object char_literal211_tree=null;
        Object char_literal212_tree=null;
        Object char_literal213_tree=null;
        Object char_literal214_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_parameter_type_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_type_list");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Mininess.g:506:5: ( '[' ( constant_expression )? ']' -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? ) | ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')' -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LBRACKET) ) {
                int LA55_1 = input.LA(2);

                if ( (synpred109_Mininess()) ) {
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
                    // Mininess.g:506:9: '[' ( constant_expression )? ']'
                    {
                    char_literal208=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier4451); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal208);


                    // Mininess.g:506:13: ( constant_expression )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==AMP||LA53_0==BITCOMPLEMENT||LA53_0==CALL||LA53_0==CHARACTER_LITERAL||LA53_0==CONSTANT||LA53_0==LPARENS||LA53_0==MINUS||LA53_0==MINUSMINUS||LA53_0==NOT||LA53_0==PLUS||LA53_0==PLUSPLUS||LA53_0==POST||LA53_0==RAW_IDENTIFIER||LA53_0==SIZEOF||LA53_0==STAR||LA53_0==STRING_LITERAL) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // Mininess.g:506:13: constant_expression
                            {
                            pushFollow(FOLLOW_constant_expression_in_direct_declarator_modifier4453);
                            constant_expression209=constant_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression209.getTree());

                            }
                            break;

                    }


                    char_literal210=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier4456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal210);


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
                    // 507:13: -> ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                    {
                        // Mininess.g:507:16: ^( DECLARATOR_ARRAY_MODIFIER ( constant_expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER")
                        , root_1);

                        // Mininess.g:507:44: ( constant_expression )?
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
                    // Mininess.g:508:9: ( '[' gen= parameter_type_list ']' )? '(' normal= parameter_type_list ')'
                    {
                    // Mininess.g:508:9: ( '[' gen= parameter_type_list ']' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==LBRACKET) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // Mininess.g:508:10: '[' gen= parameter_type_list ']'
                            {
                            char_literal211=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_declarator_modifier4488); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal211);


                            pushFollow(FOLLOW_parameter_type_list_in_direct_declarator_modifier4492);
                            gen=parameter_type_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_type_list.add(gen.getTree());

                            char_literal212=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_declarator_modifier4494); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal212);


                            }
                            break;

                    }


                    char_literal213=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_declarator_modifier4498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal213);


                    pushFollow(FOLLOW_parameter_type_list_in_direct_declarator_modifier4502);
                    normal=parameter_type_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_type_list.add(normal.getTree());

                    char_literal214=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_declarator_modifier4504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal214);


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
                    // 509:13: -> ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
                    {
                        // Mininess.g:509:16: ^( DECLARATOR_PARAMETER_LIST_MODIFIER $normal)
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
    // Mininess.g:515:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );
    public final MininessParser.pointer_return pointer() throws RecognitionException {
        MininessParser.pointer_return retval = new MininessParser.pointer_return();
        retval.start = input.LT(1);

        int pointer_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal215=null;
        Token char_literal218=null;
        MininessParser.type_qualifier_list_return type_qualifier_list216 =null;

        MininessParser.pointer_return pointer217 =null;

        MininessParser.type_qualifier_list_return type_qualifier_list219 =null;


        Object char_literal215_tree=null;
        Object char_literal218_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_type_qualifier_list=new RewriteRuleSubtreeStream(adaptor,"rule type_qualifier_list");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Mininess.g:516:5: ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) )
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // Mininess.g:516:10: '*' ( type_qualifier_list )? pointer
                    {
                    char_literal215=(Token)match(input,STAR,FOLLOW_STAR_in_pointer4544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal215);


                    // Mininess.g:516:14: ( type_qualifier_list )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==CONST) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // Mininess.g:516:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer4546);
                            type_qualifier_list216=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list216.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_pointer_in_pointer4549);
                    pointer217=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pointer.add(pointer217.getTree());

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
                    // 516:43: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                    {
                        // Mininess.g:516:46: ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // Mininess.g:516:66: ( type_qualifier_list )?
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
                    // Mininess.g:517:10: '*' ( type_qualifier_list )?
                    {
                    char_literal218=(Token)match(input,STAR,FOLLOW_STAR_in_pointer4571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal218);


                    // Mininess.g:517:14: ( type_qualifier_list )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==CONST) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // Mininess.g:517:14: type_qualifier_list
                            {
                            pushFollow(FOLLOW_type_qualifier_list_in_pointer4573);
                            type_qualifier_list219=type_qualifier_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type_qualifier_list.add(type_qualifier_list219.getTree());

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
                    // 517:35: -> ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                    {
                        // Mininess.g:517:38: ^( POINTER_QUALIFIER ( type_qualifier_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER_QUALIFIER, "POINTER_QUALIFIER")
                        , root_1);

                        // Mininess.g:517:58: ( type_qualifier_list )?
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
    // Mininess.g:519:1: type_qualifier_list : ( type_qualifier )+ ;
    public final MininessParser.type_qualifier_list_return type_qualifier_list() throws RecognitionException {
        MininessParser.type_qualifier_list_return retval = new MininessParser.type_qualifier_list_return();
        retval.start = input.LT(1);

        int type_qualifier_list_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.type_qualifier_return type_qualifier220 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Mininess.g:520:5: ( ( type_qualifier )+ )
            // Mininess.g:520:10: ( type_qualifier )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:520:10: ( type_qualifier )+
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
            	    // Mininess.g:520:10: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_type_qualifier_list4602);
            	    type_qualifier220=type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_qualifier220.getTree());

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
    // Mininess.g:523:1: parameter_type_list : parameter_list ( ',' '...' )? ;
    public final MininessParser.parameter_type_list_return parameter_type_list() throws RecognitionException {
        MininessParser.parameter_type_list_return retval = new MininessParser.parameter_type_list_return();
        retval.start = input.LT(1);

        int parameter_type_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal222=null;
        Token string_literal223=null;
        MininessParser.parameter_list_return parameter_list221 =null;


        Object char_literal222_tree=null;
        Object string_literal223_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Mininess.g:524:5: ( parameter_list ( ',' '...' )? )
            // Mininess.g:524:10: parameter_list ( ',' '...' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_parameter_list_in_parameter_type_list4623);
            parameter_list221=parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list221.getTree());

            // Mininess.g:524:25: ( ',' '...' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==COMMA) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // Mininess.g:524:26: ',' '...'
                    {
                    char_literal222=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_type_list4626); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal222_tree = 
                    (Object)adaptor.create(char_literal222)
                    ;
                    adaptor.addChild(root_0, char_literal222_tree);
                    }

                    string_literal223=(Token)match(input,139,FOLLOW_139_in_parameter_type_list4628); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal223_tree = 
                    (Object)adaptor.create(string_literal223)
                    ;
                    adaptor.addChild(root_0, string_literal223_tree);
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
    // Mininess.g:530:1: parameter_list : ( parameter_declaration ( ',' parameter_declaration )* -> ^( PARAMETER_LIST ( parameter_declaration )+ ) | -> ^( PARAMETER_LIST ) );
    public final MininessParser.parameter_list_return parameter_list() throws RecognitionException {
        MininessParser.parameter_list_return retval = new MininessParser.parameter_list_return();
        retval.start = input.LT(1);

        int parameter_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal225=null;
        MininessParser.parameter_declaration_return parameter_declaration224 =null;

        MininessParser.parameter_declaration_return parameter_declaration226 =null;


        Object char_literal225_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Mininess.g:531:5: ( parameter_declaration ( ',' parameter_declaration )* -> ^( PARAMETER_LIST ( parameter_declaration )+ ) | -> ^( PARAMETER_LIST ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==CHAR||LA62_0==COMMAND||LA62_0==CONST||LA62_0==DEFAULT||LA62_0==ENUM||(LA62_0 >= ERROR_T && LA62_0 <= EVENT)||(LA62_0 >= INT && LA62_0 <= INT8_T)||LA62_0==LONG||(LA62_0 >= NX_STRUCT && LA62_0 <= NX_UINT8_T)||LA62_0==RAW_IDENTIFIER||(LA62_0 >= SHORT && LA62_0 <= SIGNED)||LA62_0==STRUCT||LA62_0==TASK||(LA62_0 >= UINT16_T && LA62_0 <= UINT8_T)||LA62_0==UNSIGNED||LA62_0==VOID) ) {
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
                    // Mininess.g:531:10: parameter_declaration ( ',' parameter_declaration )*
                    {
                    pushFollow(FOLLOW_parameter_declaration_in_parameter_list4653);
                    parameter_declaration224=parameter_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration224.getTree());

                    // Mininess.g:531:32: ( ',' parameter_declaration )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==COMMA) ) {
                            int LA61_1 = input.LA(2);

                            if ( (LA61_1==CHAR||LA61_1==COMMAND||LA61_1==CONST||LA61_1==DEFAULT||LA61_1==ENUM||(LA61_1 >= ERROR_T && LA61_1 <= EVENT)||(LA61_1 >= INT && LA61_1 <= INT8_T)||LA61_1==LONG||(LA61_1 >= NX_STRUCT && LA61_1 <= NX_UINT8_T)||LA61_1==RAW_IDENTIFIER||(LA61_1 >= SHORT && LA61_1 <= SIGNED)||LA61_1==STRUCT||LA61_1==TASK||(LA61_1 >= UINT16_T && LA61_1 <= UINT8_T)||LA61_1==UNSIGNED||LA61_1==VOID) ) {
                                alt61=1;
                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // Mininess.g:531:33: ',' parameter_declaration
                    	    {
                    	    char_literal225=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list4656); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal225);


                    	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list4658);
                    	    parameter_declaration226=parameter_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration226.getTree());

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
                    // 532:13: -> ^( PARAMETER_LIST ( parameter_declaration )+ )
                    {
                        // Mininess.g:532:16: ^( PARAMETER_LIST ( parameter_declaration )+ )
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
                    // Mininess.g:534:13: 
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
                    // 534:13: -> ^( PARAMETER_LIST )
                    {
                        // Mininess.g:534:16: ^( PARAMETER_LIST )
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
    // Mininess.g:540:1: parameter_declaration : ( declaration_specifiers declarator -> ^( PARAMETER declaration_specifiers declarator ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) );
    public final MininessParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        MininessParser.parameter_declaration_return retval = new MininessParser.parameter_declaration_return();
        retval.start = input.LT(1);

        int parameter_declaration_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.declaration_specifiers_return declaration_specifiers227 =null;

        MininessParser.declarator_return declarator228 =null;

        MininessParser.declaration_specifiers_return declaration_specifiers229 =null;

        MininessParser.abstract_declarator_return abstract_declarator230 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_abstract_declarator=new RewriteRuleSubtreeStream(adaptor,"rule abstract_declarator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Mininess.g:541:5: ( declaration_specifiers declarator -> ^( PARAMETER declaration_specifiers declarator ) | declaration_specifiers ( abstract_declarator )? -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? ) )
            int alt64=2;
            switch ( input.LA(1) ) {
            case COMMAND:
            case EVENT:
            case TASK:
                {
                int LA64_1 = input.LA(2);

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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

                if ( (synpred118_Mininess()) ) {
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
            case ERROR_T:
                {
                int LA64_18 = input.LA(2);

                if ( (synpred118_Mininess()) ) {
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
            case NX_STRUCT:
            case STRUCT:
                {
                int LA64_19 = input.LA(2);

                if ( (synpred118_Mininess()) ) {
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
            case ENUM:
                {
                int LA64_20 = input.LA(2);

                if ( (synpred118_Mininess()) ) {
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
            case RAW_IDENTIFIER:
                {
                int LA64_21 = input.LA(2);

                if ( (synpred118_Mininess()) ) {
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
            case CONST:
                {
                int LA64_22 = input.LA(2);

                if ( (synpred118_Mininess()) ) {
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
            case DEFAULT:
                {
                int LA64_23 = input.LA(2);

                if ( (synpred118_Mininess()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 23, input);

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
                    // Mininess.g:541:10: declaration_specifiers declarator
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration4725);
                    declaration_specifiers227=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers227.getTree());

                    pushFollow(FOLLOW_declarator_in_parameter_declaration4727);
                    declarator228=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarator.add(declarator228.getTree());

                    // AST REWRITE
                    // elements: declarator, declaration_specifiers
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 542:13: -> ^( PARAMETER declaration_specifiers declarator )
                    {
                        // Mininess.g:542:16: ^( PARAMETER declaration_specifiers declarator )
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
                    // Mininess.g:543:10: declaration_specifiers ( abstract_declarator )?
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration4760);
                    declaration_specifiers229=declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers229.getTree());

                    // Mininess.g:543:33: ( abstract_declarator )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==LBRACKET||LA63_0==LPARENS||LA63_0==STAR) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // Mininess.g:543:33: abstract_declarator
                            {
                            pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration4762);
                            abstract_declarator230=abstract_declarator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_abstract_declarator.add(abstract_declarator230.getTree());

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
                    // 544:13: -> ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                    {
                        // Mininess.g:544:16: ^( PARAMETER declaration_specifiers ( abstract_declarator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETER, "PARAMETER")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration_specifiers.nextTree());

                        // Mininess.g:544:51: ( abstract_declarator )?
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
    // Mininess.g:546:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final MininessParser.type_name_return type_name() throws RecognitionException {
        MininessParser.type_name_return retval = new MininessParser.type_name_return();
        retval.start = input.LT(1);

        int type_name_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.specifier_qualifier_list_return specifier_qualifier_list231 =null;

        MininessParser.abstract_declarator_return abstract_declarator232 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Mininess.g:547:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // Mininess.g:547:10: specifier_qualifier_list ( abstract_declarator )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name4809);
            specifier_qualifier_list231=specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, specifier_qualifier_list231.getTree());

            // Mininess.g:547:35: ( abstract_declarator )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LBRACKET||LA65_0==LPARENS||LA65_0==STAR) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // Mininess.g:547:35: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name4811);
                    abstract_declarator232=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator232.getTree());

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
    // Mininess.g:549:1: abstract_declarator : ( ( pointer )? direct_abstract_declarator | pointer );
    public final MininessParser.abstract_declarator_return abstract_declarator() throws RecognitionException {
        MininessParser.abstract_declarator_return retval = new MininessParser.abstract_declarator_return();
        retval.start = input.LT(1);

        int abstract_declarator_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.pointer_return pointer233 =null;

        MininessParser.direct_abstract_declarator_return direct_abstract_declarator234 =null;

        MininessParser.pointer_return pointer235 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Mininess.g:550:5: ( ( pointer )? direct_abstract_declarator | pointer )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==STAR) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred122_Mininess()) ) {
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
                    // Mininess.g:550:10: ( pointer )? direct_abstract_declarator
                    {
                    root_0 = (Object)adaptor.nil();


                    // Mininess.g:550:10: ( pointer )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==STAR) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Mininess.g:550:10: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_abstract_declarator4831);
                            pointer233=pointer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer233.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator4834);
                    direct_abstract_declarator234=direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, direct_abstract_declarator234.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:551:10: pointer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pointer_in_abstract_declarator4845);
                    pointer235=pointer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointer235.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Mininess.g:553:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )* ;
    public final MininessParser.direct_abstract_declarator_return direct_abstract_declarator() throws RecognitionException {
        MininessParser.direct_abstract_declarator_return retval = new MininessParser.direct_abstract_declarator_return();
        retval.start = input.LT(1);

        int direct_abstract_declarator_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal236=null;
        Token char_literal238=null;
        Token char_literal239=null;
        Token char_literal241=null;
        Token char_literal242=null;
        Token char_literal244=null;
        Token char_literal245=null;
        Token char_literal247=null;
        Token char_literal248=null;
        Token char_literal250=null;
        MininessParser.abstract_declarator_return abstract_declarator237 =null;

        MininessParser.assignment_expression_return assignment_expression240 =null;

        MininessParser.parameter_type_list_return parameter_type_list243 =null;

        MininessParser.assignment_expression_return assignment_expression246 =null;

        MininessParser.parameter_type_list_return parameter_type_list249 =null;


        Object char_literal236_tree=null;
        Object char_literal238_tree=null;
        Object char_literal239_tree=null;
        Object char_literal241_tree=null;
        Object char_literal242_tree=null;
        Object char_literal244_tree=null;
        Object char_literal245_tree=null;
        Object char_literal247_tree=null;
        Object char_literal248_tree=null;
        Object char_literal250_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Mininess.g:554:5: ( ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )* )
            // Mininess.g:554:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' ) ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )*
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:554:10: ( '(' abstract_declarator ')' | '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LPARENS) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==LBRACKET||LA70_1==LPARENS||LA70_1==STAR) ) {
                    alt70=1;
                }
                else if ( (LA70_1==CHAR||(LA70_1 >= COMMA && LA70_1 <= COMMAND)||LA70_1==CONST||LA70_1==DEFAULT||LA70_1==ENUM||(LA70_1 >= ERROR_T && LA70_1 <= EVENT)||(LA70_1 >= INT && LA70_1 <= INT8_T)||LA70_1==LONG||(LA70_1 >= NX_STRUCT && LA70_1 <= NX_UINT8_T)||LA70_1==RAW_IDENTIFIER||LA70_1==RPARENS||(LA70_1 >= SHORT && LA70_1 <= SIGNED)||LA70_1==STRUCT||LA70_1==TASK||(LA70_1 >= UINT16_T && LA70_1 <= UINT8_T)||LA70_1==UNSIGNED||LA70_1==VOID) ) {
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
                    // Mininess.g:554:11: '(' abstract_declarator ')'
                    {
                    char_literal236=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator4865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal236_tree = 
                    (Object)adaptor.create(char_literal236)
                    ;
                    adaptor.addChild(root_0, char_literal236_tree);
                    }

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator4867);
                    abstract_declarator237=abstract_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abstract_declarator237.getTree());

                    char_literal238=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator4872); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal238_tree = 
                    (Object)adaptor.create(char_literal238)
                    ;
                    adaptor.addChild(root_0, char_literal238_tree);
                    }

                    }
                    break;
                case 2 :
                    // Mininess.g:555:11: '[' ( assignment_expression )? ']'
                    {
                    char_literal239=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator4886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal239_tree = 
                    (Object)adaptor.create(char_literal239)
                    ;
                    adaptor.addChild(root_0, char_literal239_tree);
                    }

                    // Mininess.g:555:15: ( assignment_expression )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==AMP||LA68_0==BITCOMPLEMENT||LA68_0==CALL||LA68_0==CHARACTER_LITERAL||LA68_0==CONSTANT||LA68_0==LPARENS||LA68_0==MINUS||LA68_0==MINUSMINUS||LA68_0==NOT||LA68_0==PLUS||LA68_0==PLUSPLUS||LA68_0==POST||LA68_0==RAW_IDENTIFIER||LA68_0==SIZEOF||LA68_0==STAR||LA68_0==STRING_LITERAL) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Mininess.g:555:15: assignment_expression
                            {
                            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator4888);
                            assignment_expression240=assignment_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression240.getTree());

                            }
                            break;

                    }


                    char_literal241=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator4891); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal241_tree = 
                    (Object)adaptor.create(char_literal241)
                    ;
                    adaptor.addChild(root_0, char_literal241_tree);
                    }

                    }
                    break;
                case 3 :
                    // Mininess.g:556:11: '(' ( parameter_type_list )? ')'
                    {
                    char_literal242=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator4905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal242_tree = 
                    (Object)adaptor.create(char_literal242)
                    ;
                    adaptor.addChild(root_0, char_literal242_tree);
                    }

                    // Mininess.g:556:15: ( parameter_type_list )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==CHAR||(LA69_0 >= COMMA && LA69_0 <= COMMAND)||LA69_0==CONST||LA69_0==DEFAULT||LA69_0==ENUM||(LA69_0 >= ERROR_T && LA69_0 <= EVENT)||(LA69_0 >= INT && LA69_0 <= INT8_T)||LA69_0==LONG||(LA69_0 >= NX_STRUCT && LA69_0 <= NX_UINT8_T)||LA69_0==RAW_IDENTIFIER||(LA69_0 >= SHORT && LA69_0 <= SIGNED)||LA69_0==STRUCT||LA69_0==TASK||(LA69_0 >= UINT16_T && LA69_0 <= UINT8_T)||LA69_0==UNSIGNED||LA69_0==VOID) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==RPARENS) ) {
                        int LA69_2 = input.LA(2);

                        if ( (synpred126_Mininess()) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // Mininess.g:556:15: parameter_type_list
                            {
                            pushFollow(FOLLOW_parameter_type_list_in_direct_abstract_declarator4907);
                            parameter_type_list243=parameter_type_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list243.getTree());

                            }
                            break;

                    }


                    char_literal244=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator4912); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal244_tree = 
                    (Object)adaptor.create(char_literal244)
                    ;
                    adaptor.addChild(root_0, char_literal244_tree);
                    }

                    }
                    break;

            }


            // Mininess.g:557:14: ( '[' ( assignment_expression )? ']' | '(' ( parameter_type_list )? ')' )*
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
            	    // Mininess.g:557:15: '[' ( assignment_expression )? ']'
            	    {
            	    char_literal245=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_direct_abstract_declarator4929); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal245_tree = 
            	    (Object)adaptor.create(char_literal245)
            	    ;
            	    adaptor.addChild(root_0, char_literal245_tree);
            	    }

            	    // Mininess.g:557:19: ( assignment_expression )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==AMP||LA71_0==BITCOMPLEMENT||LA71_0==CALL||LA71_0==CHARACTER_LITERAL||LA71_0==CONSTANT||LA71_0==LPARENS||LA71_0==MINUS||LA71_0==MINUSMINUS||LA71_0==NOT||LA71_0==PLUS||LA71_0==PLUSPLUS||LA71_0==POST||LA71_0==RAW_IDENTIFIER||LA71_0==SIZEOF||LA71_0==STAR||LA71_0==STRING_LITERAL) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // Mininess.g:557:19: assignment_expression
            	            {
            	            pushFollow(FOLLOW_assignment_expression_in_direct_abstract_declarator4931);
            	            assignment_expression246=assignment_expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression246.getTree());

            	            }
            	            break;

            	    }


            	    char_literal247=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_direct_abstract_declarator4934); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal247_tree = 
            	    (Object)adaptor.create(char_literal247)
            	    ;
            	    adaptor.addChild(root_0, char_literal247_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:557:48: '(' ( parameter_type_list )? ')'
            	    {
            	    char_literal248=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_direct_abstract_declarator4938); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal248_tree = 
            	    (Object)adaptor.create(char_literal248)
            	    ;
            	    adaptor.addChild(root_0, char_literal248_tree);
            	    }

            	    // Mininess.g:557:52: ( parameter_type_list )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==CHAR||(LA72_0 >= COMMA && LA72_0 <= COMMAND)||LA72_0==CONST||LA72_0==DEFAULT||LA72_0==ENUM||(LA72_0 >= ERROR_T && LA72_0 <= EVENT)||(LA72_0 >= INT && LA72_0 <= INT8_T)||LA72_0==LONG||(LA72_0 >= NX_STRUCT && LA72_0 <= NX_UINT8_T)||LA72_0==RAW_IDENTIFIER||(LA72_0 >= SHORT && LA72_0 <= SIGNED)||LA72_0==STRUCT||LA72_0==TASK||(LA72_0 >= UINT16_T && LA72_0 <= UINT8_T)||LA72_0==UNSIGNED||LA72_0==VOID) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==RPARENS) ) {
            	        int LA72_2 = input.LA(2);

            	        if ( (synpred129_Mininess()) ) {
            	            alt72=1;
            	        }
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // Mininess.g:557:52: parameter_type_list
            	            {
            	            pushFollow(FOLLOW_parameter_type_list_in_direct_abstract_declarator4940);
            	            parameter_type_list249=parameter_type_list();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_type_list249.getTree());

            	            }
            	            break;

            	    }


            	    char_literal250=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_direct_abstract_declarator4943); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal250_tree = 
            	    (Object)adaptor.create(char_literal250)
            	    ;
            	    adaptor.addChild(root_0, char_literal250_tree);
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
    // Mininess.g:560:1: typedef_name : id= RAW_IDENTIFIER {...}?;
    public final MininessParser.typedef_name_return typedef_name() throws RecognitionException {
        MininessParser.typedef_name_return retval = new MininessParser.typedef_name_return();
        retval.start = input.LT(1);

        int typedef_name_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Mininess.g:561:5: (id= RAW_IDENTIFIER {...}?)
            // Mininess.g:561:10: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_typedef_name4972); if (state.failed) return retval;
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
    // Mininess.g:569:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) );
    public final MininessParser.initializer_return initializer() throws RecognitionException {
        MininessParser.initializer_return retval = new MininessParser.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Mininess.g:570:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' -> ^( INITIALIZER_LIST initializer_list ) )
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
                    // Mininess.g:570:10: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expression_in_initializer5007);
                    assignment_expression251=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression251.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:571:10: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal252=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_initializer5018); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal252);


                    pushFollow(FOLLOW_initializer_list_in_initializer5020);
                    initializer_list253=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list253.getTree());

                    // Mininess.g:571:31: ( ',' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==COMMA) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // Mininess.g:571:31: ','
                            {
                            char_literal254=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer5022); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(char_literal254);


                            }
                            break;

                    }


                    char_literal255=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_initializer5025); if (state.failed) return retval; 
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
                    // 571:40: -> ^( INITIALIZER_LIST initializer_list )
                    {
                        // Mininess.g:571:43: ^( INITIALIZER_LIST initializer_list )
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
    // Mininess.g:573:1: initializer_list : initializer ( ',' initializer )* -> ( initializer )+ ;
    public final MininessParser.initializer_list_return initializer_list() throws RecognitionException {
        MininessParser.initializer_list_return retval = new MininessParser.initializer_list_return();
        retval.start = input.LT(1);

        int initializer_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal257=null;
        MininessParser.initializer_return initializer256 =null;

        MininessParser.initializer_return initializer258 =null;


        Object char_literal257_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Mininess.g:574:5: ( initializer ( ',' initializer )* -> ( initializer )+ )
            // Mininess.g:574:10: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializer_list5052);
            initializer256=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer256.getTree());

            // Mininess.g:574:22: ( ',' initializer )*
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
            	    // Mininess.g:574:23: ',' initializer
            	    {
            	    char_literal257=(Token)match(input,COMMA,FOLLOW_COMMA_in_initializer_list5055); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal257);


            	    pushFollow(FOLLOW_initializer_in_initializer_list5057);
            	    initializer258=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer258.getTree());

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
            // 574:41: -> ( initializer )+
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
    // Mininess.g:580:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | line_directive );
    public final MininessParser.statement_return statement() throws RecognitionException {
        MininessParser.statement_return retval = new MininessParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.labeled_statement_return labeled_statement259 =null;

        MininessParser.compound_statement_return compound_statement260 =null;

        MininessParser.expression_statement_return expression_statement261 =null;

        MininessParser.selection_statement_return selection_statement262 =null;

        MininessParser.iteration_statement_return iteration_statement263 =null;

        MininessParser.jump_statement_return jump_statement264 =null;

        MininessParser.line_directive_return line_directive265 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Mininess.g:581:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement | line_directive )
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
            case 141:
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
                    // Mininess.g:581:10: labeled_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labeled_statement_in_statement5090);
                    labeled_statement259=labeled_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labeled_statement259.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:582:10: compound_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement5101);
                    compound_statement260=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement260.getTree());

                    }
                    break;
                case 3 :
                    // Mininess.g:583:10: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement5112);
                    expression_statement261=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement261.getTree());

                    }
                    break;
                case 4 :
                    // Mininess.g:584:10: selection_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_statement5123);
                    selection_statement262=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement262.getTree());

                    }
                    break;
                case 5 :
                    // Mininess.g:585:10: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_statement5134);
                    iteration_statement263=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement263.getTree());

                    }
                    break;
                case 6 :
                    // Mininess.g:586:10: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_statement5145);
                    jump_statement264=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement264.getTree());

                    }
                    break;
                case 7 :
                    // Mininess.g:587:10: line_directive
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_line_directive_in_statement5156);
                    line_directive265=line_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive265.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Mininess.g:590:1: labeled_statement : ( CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) );
    public final MininessParser.labeled_statement_return labeled_statement() throws RecognitionException {
        MininessParser.labeled_statement_return retval = new MininessParser.labeled_statement_return();
        retval.start = input.LT(1);

        int labeled_statement_StartIndex = input.index();

        Object root_0 = null;

        Token CASE266=null;
        Token char_literal268=null;
        Token DEFAULT270=null;
        Token char_literal271=null;
        MininessParser.constant_expression_return constant_expression267 =null;

        MininessParser.statement_return statement269 =null;

        MininessParser.statement_return statement272 =null;


        Object CASE266_tree=null;
        Object char_literal268_tree=null;
        Object DEFAULT270_tree=null;
        Object char_literal271_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Mininess.g:591:5: ( CASE constant_expression ':' statement -> ^( CASE constant_expression statement ) | DEFAULT ':' statement -> ^( DEFAULT statement ) )
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
                    // Mininess.g:591:10: CASE constant_expression ':' statement
                    {
                    CASE266=(Token)match(input,CASE,FOLLOW_CASE_in_labeled_statement5184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE266);


                    pushFollow(FOLLOW_constant_expression_in_labeled_statement5186);
                    constant_expression267=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression267.getTree());

                    char_literal268=(Token)match(input,140,FOLLOW_140_in_labeled_statement5188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_140.add(char_literal268);


                    pushFollow(FOLLOW_statement_in_labeled_statement5190);
                    statement269=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement269.getTree());

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
                    // 591:49: -> ^( CASE constant_expression statement )
                    {
                        // Mininess.g:591:52: ^( CASE constant_expression statement )
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
                    // Mininess.g:592:10: DEFAULT ':' statement
                    {
                    DEFAULT270=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement5211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT270);


                    char_literal271=(Token)match(input,140,FOLLOW_140_in_labeled_statement5213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_140.add(char_literal271);


                    pushFollow(FOLLOW_statement_in_labeled_statement5215);
                    statement272=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement272.getTree());

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
                    // 592:32: -> ^( DEFAULT statement )
                    {
                        // Mininess.g:592:35: ^( DEFAULT statement )
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
    // Mininess.g:597:1: compound_statement : '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) ;
    public final MininessParser.compound_statement_return compound_statement() throws RecognitionException {
        MininessParser.compound_statement_return retval = new MininessParser.compound_statement_return();
        retval.start = input.LT(1);

        int compound_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal273=null;
        Token char_literal275=null;
        MininessParser.block_item_return block_item274 =null;


        Object char_literal273_tree=null;
        Object char_literal275_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_block_item=new RewriteRuleSubtreeStream(adaptor,"rule block_item");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Mininess.g:598:5: ( '{' ( block_item )* '}' -> ^( COMPOUND_STATEMENT ( block_item )* ) )
            // Mininess.g:598:10: '{' ( block_item )* '}'
            {
            char_literal273=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_compound_statement5241); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal273);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // Mininess.g:599:10: ( block_item )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==AMP||LA79_0==BITCOMPLEMENT||(LA79_0 >= CALL && LA79_0 <= CASE)||(LA79_0 >= CHAR && LA79_0 <= CHARACTER_LITERAL)||LA79_0==COMMAND||(LA79_0 >= CONST && LA79_0 <= CONSTANT)||LA79_0==DEFAULT||LA79_0==ENUM||(LA79_0 >= ERROR_T && LA79_0 <= EVENT)||LA79_0==FOR||LA79_0==HASH||LA79_0==IF||(LA79_0 >= INT && LA79_0 <= INT8_T)||LA79_0==LBRACE||(LA79_0 >= LONG && LA79_0 <= LPARENS)||LA79_0==MINUS||LA79_0==MINUSMINUS||LA79_0==NOT||(LA79_0 >= NX_STRUCT && LA79_0 <= NX_UINT8_T)||LA79_0==PLUS||LA79_0==PLUSPLUS||LA79_0==POST||LA79_0==RAW_IDENTIFIER||LA79_0==RETURN||(LA79_0 >= SHORT && LA79_0 <= SIZEOF)||LA79_0==STAR||(LA79_0 >= STRING_LITERAL && LA79_0 <= UINT8_T)||LA79_0==UNSIGNED||(LA79_0 >= VOID && LA79_0 <= WHILE)||LA79_0==141) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // Mininess.g:599:10: block_item
            	    {
            	    pushFollow(FOLLOW_block_item_in_compound_statement5254);
            	    block_item274=block_item();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block_item.add(block_item274.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal275=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_compound_statement5272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal275);


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
            // 600:44: -> ^( COMPOUND_STATEMENT ( block_item )* )
            {
                // Mininess.g:600:47: ^( COMPOUND_STATEMENT ( block_item )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // Mininess.g:600:68: ( block_item )*
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
    // Mininess.g:602:1: block_item : ( declaration | statement );
    public final MininessParser.block_item_return block_item() throws RecognitionException {
        MininessParser.block_item_return retval = new MininessParser.block_item_return();
        retval.start = input.LT(1);

        int block_item_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.declaration_return declaration276 =null;

        MininessParser.statement_return statement277 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Mininess.g:603:5: ( declaration | statement )
            int alt80=2;
            switch ( input.LA(1) ) {
            case CHAR:
            case COMMAND:
            case CONST:
            case ENUM:
            case ERROR_T:
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
                int LA80_21 = input.LA(2);

                if ( (synpred142_Mininess()) ) {
                    alt80=1;
                }
                else if ( (true) ) {
                    alt80=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 21, input);

                    throw nvae;

                }
                }
                break;
            case DEFAULT:
                {
                int LA80_23 = input.LA(2);

                if ( (synpred142_Mininess()) ) {
                    alt80=1;
                }
                else if ( (true) ) {
                    alt80=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 23, input);

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
            case 141:
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
                    // Mininess.g:603:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_block_item5296);
                    declaration276=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration276.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:604:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_block_item5307);
                    statement277=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement277.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Mininess.g:610:1: expression_statement : ( expression )? ';' -> ^( STATEMENT ( expression )? ) ;
    public final MininessParser.expression_statement_return expression_statement() throws RecognitionException {
        MininessParser.expression_statement_return retval = new MininessParser.expression_statement_return();
        retval.start = input.LT(1);

        int expression_statement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal279=null;
        MininessParser.expression_return expression278 =null;


        Object char_literal279_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Mininess.g:611:5: ( ( expression )? ';' -> ^( STATEMENT ( expression )? ) )
            // Mininess.g:611:10: ( expression )? ';'
            {
            // Mininess.g:611:10: ( expression )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==AMP||LA81_0==BITCOMPLEMENT||LA81_0==CALL||LA81_0==CHARACTER_LITERAL||LA81_0==CONSTANT||LA81_0==LPARENS||LA81_0==MINUS||LA81_0==MINUSMINUS||LA81_0==NOT||LA81_0==PLUS||LA81_0==PLUSPLUS||LA81_0==POST||LA81_0==RAW_IDENTIFIER||LA81_0==SIZEOF||LA81_0==STAR||LA81_0==STRING_LITERAL) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Mininess.g:611:10: expression
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement5330);
                    expression278=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression278.getTree());

                    }
                    break;

            }


            char_literal279=(Token)match(input,141,FOLLOW_141_in_expression_statement5333); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_141.add(char_literal279);


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
            // 611:26: -> ^( STATEMENT ( expression )? )
            {
                // Mininess.g:611:29: ^( STATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

                // Mininess.g:611:41: ( expression )?
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
    // Mininess.g:613:1: selection_statement : ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) );
    public final MininessParser.selection_statement_return selection_statement() throws RecognitionException {
        MininessParser.selection_statement_return retval = new MininessParser.selection_statement_return();
        retval.start = input.LT(1);

        int selection_statement_StartIndex = input.index();

        Object root_0 = null;

        Token IF280=null;
        Token char_literal281=null;
        Token char_literal283=null;
        Token ELSE285=null;
        Token SWITCH287=null;
        Token char_literal288=null;
        Token char_literal290=null;
        MininessParser.expression_return expression282 =null;

        MininessParser.statement_return statement284 =null;

        MininessParser.statement_return statement286 =null;

        MininessParser.expression_return expression289 =null;

        MininessParser.statement_return statement291 =null;


        Object IF280_tree=null;
        Object char_literal281_tree=null;
        Object char_literal283_tree=null;
        Object ELSE285_tree=null;
        Object SWITCH287_tree=null;
        Object char_literal288_tree=null;
        Object char_literal290_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Mininess.g:614:5: ( IF '(' expression ')' statement ( ELSE statement )? -> ^( IF expression statement ( statement )? ) | SWITCH '(' expression ')' statement -> ^( SWITCH expression statement ) )
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
                    // Mininess.g:614:10: IF '(' expression ')' statement ( ELSE statement )?
                    {
                    IF280=(Token)match(input,IF,FOLLOW_IF_in_selection_statement5361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF280);


                    char_literal281=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement5363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal281);


                    pushFollow(FOLLOW_expression_in_selection_statement5365);
                    expression282=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression282.getTree());

                    char_literal283=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement5367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal283);


                    pushFollow(FOLLOW_statement_in_selection_statement5369);
                    statement284=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement284.getTree());

                    // Mininess.g:614:42: ( ELSE statement )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==ELSE) ) {
                        int LA82_1 = input.LA(2);

                        if ( (synpred144_Mininess()) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // Mininess.g:614:43: ELSE statement
                            {
                            ELSE285=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement5372); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE285);


                            pushFollow(FOLLOW_statement_in_selection_statement5374);
                            statement286=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(statement286.getTree());

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
                    // 615:14: -> ^( IF expression statement ( statement )? )
                    {
                        // Mininess.g:615:17: ^( IF expression statement ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        // Mininess.g:615:43: ( statement )?
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
                    // Mininess.g:616:10: SWITCH '(' expression ')' statement
                    {
                    SWITCH287=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement5413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH287);


                    char_literal288=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_selection_statement5415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal288);


                    pushFollow(FOLLOW_expression_in_selection_statement5417);
                    expression289=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression289.getTree());

                    char_literal290=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_selection_statement5419); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal290);


                    pushFollow(FOLLOW_statement_in_selection_statement5421);
                    statement291=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement291.getTree());

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
                    // 617:14: -> ^( SWITCH expression statement )
                    {
                        // Mininess.g:617:17: ^( SWITCH expression statement )
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
    // Mininess.g:623:1: iteration_statement : ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) );
    public final MininessParser.iteration_statement_return iteration_statement() throws RecognitionException {
        MininessParser.iteration_statement_return retval = new MininessParser.iteration_statement_return();
        retval.start = input.LT(1);

        int iteration_statement_StartIndex = input.index();

        Object root_0 = null;

        Token WHILE292=null;
        Token char_literal293=null;
        Token char_literal295=null;
        Token FOR297=null;
        Token char_literal298=null;
        Token char_literal299=null;
        Token char_literal300=null;
        Token char_literal301=null;
        MininessParser.expression_return init =null;

        MininessParser.expression_return cond =null;

        MininessParser.expression_return iter =null;

        MininessParser.expression_return expression294 =null;

        MininessParser.statement_return statement296 =null;

        MininessParser.statement_return statement302 =null;


        Object WHILE292_tree=null;
        Object char_literal293_tree=null;
        Object char_literal295_tree=null;
        Object FOR297_tree=null;
        Object char_literal298_tree=null;
        Object char_literal299_tree=null;
        Object char_literal300_tree=null;
        Object char_literal301_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Mininess.g:624:5: ( WHILE '(' expression ')' statement -> ^( WHILE expression statement ) | FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement ) )
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
                    // Mininess.g:624:10: WHILE '(' expression ')' statement
                    {
                    WHILE292=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement5467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE292);


                    char_literal293=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement5469); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal293);


                    pushFollow(FOLLOW_expression_in_iteration_statement5471);
                    expression294=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression294.getTree());

                    char_literal295=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement5473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal295);


                    pushFollow(FOLLOW_statement_in_iteration_statement5475);
                    statement296=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement296.getTree());

                    // AST REWRITE
                    // elements: WHILE, statement, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 624:45: -> ^( WHILE expression statement )
                    {
                        // Mininess.g:624:48: ^( WHILE expression statement )
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
                    // Mininess.g:625:10: FOR '(' (init= expression )? ';' (cond= expression )? ';' (iter= expression )? ')' statement
                    {
                    FOR297=(Token)match(input,FOR,FOLLOW_FOR_in_iteration_statement5496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR297);


                    char_literal298=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_iteration_statement5498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPARENS.add(char_literal298);


                    // Mininess.g:625:22: (init= expression )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==AMP||LA84_0==BITCOMPLEMENT||LA84_0==CALL||LA84_0==CHARACTER_LITERAL||LA84_0==CONSTANT||LA84_0==LPARENS||LA84_0==MINUS||LA84_0==MINUSMINUS||LA84_0==NOT||LA84_0==PLUS||LA84_0==PLUSPLUS||LA84_0==POST||LA84_0==RAW_IDENTIFIER||LA84_0==SIZEOF||LA84_0==STAR||LA84_0==STRING_LITERAL) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // Mininess.g:625:22: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement5502);
                            init=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }


                    char_literal299=(Token)match(input,141,FOLLOW_141_in_iteration_statement5505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_141.add(char_literal299);


                    // Mininess.g:625:43: (cond= expression )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==AMP||LA85_0==BITCOMPLEMENT||LA85_0==CALL||LA85_0==CHARACTER_LITERAL||LA85_0==CONSTANT||LA85_0==LPARENS||LA85_0==MINUS||LA85_0==MINUSMINUS||LA85_0==NOT||LA85_0==PLUS||LA85_0==PLUSPLUS||LA85_0==POST||LA85_0==RAW_IDENTIFIER||LA85_0==SIZEOF||LA85_0==STAR||LA85_0==STRING_LITERAL) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // Mininess.g:625:43: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement5509);
                            cond=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }


                    char_literal300=(Token)match(input,141,FOLLOW_141_in_iteration_statement5512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_141.add(char_literal300);


                    // Mininess.g:625:64: (iter= expression )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==AMP||LA86_0==BITCOMPLEMENT||LA86_0==CALL||LA86_0==CHARACTER_LITERAL||LA86_0==CONSTANT||LA86_0==LPARENS||LA86_0==MINUS||LA86_0==MINUSMINUS||LA86_0==NOT||LA86_0==PLUS||LA86_0==PLUSPLUS||LA86_0==POST||LA86_0==RAW_IDENTIFIER||LA86_0==SIZEOF||LA86_0==STAR||LA86_0==STRING_LITERAL) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // Mininess.g:625:64: iter= expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement5516);
                            iter=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(iter.getTree());

                            }
                            break;

                    }


                    char_literal301=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_iteration_statement5519); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPARENS.add(char_literal301);


                    pushFollow(FOLLOW_statement_in_iteration_statement5521);
                    statement302=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement302.getTree());

                    // AST REWRITE
                    // elements: statement, FOR, iter, init, cond
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
                    // 626:13: -> ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                    {
                        // Mininess.g:626:16: ^( FOR ^( FOR_INITIALIZE ( $init)? ) ^( FOR_CONDITION ( $cond)? ) ^( FOR_ITERATION ( $iter)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        // Mininess.g:626:22: ^( FOR_INITIALIZE ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INITIALIZE, "FOR_INITIALIZE")
                        , root_2);

                        // Mininess.g:626:40: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.nextTree());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // Mininess.g:627:22: ^( FOR_CONDITION ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION")
                        , root_2);

                        // Mininess.g:627:40: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.nextTree());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // Mininess.g:628:22: ^( FOR_ITERATION ( $iter)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_ITERATION, "FOR_ITERATION")
                        , root_2);

                        // Mininess.g:628:40: ( $iter)?
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
    // Mininess.g:630:1: jump_statement : RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) ;
    public final MininessParser.jump_statement_return jump_statement() throws RecognitionException {
        MininessParser.jump_statement_return retval = new MininessParser.jump_statement_return();
        retval.start = input.LT(1);

        int jump_statement_StartIndex = input.index();

        Object root_0 = null;

        Token RETURN303=null;
        Token char_literal305=null;
        MininessParser.expression_return expression304 =null;


        Object RETURN303_tree=null;
        Object char_literal305_tree=null;
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Mininess.g:631:5: ( RETURN ( expression )? ';' -> ^( RETURN ( expression )? ) )
            // Mininess.g:631:10: RETURN ( expression )? ';'
            {
            RETURN303=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement5628); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN303);


            // Mininess.g:631:17: ( expression )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==AMP||LA88_0==BITCOMPLEMENT||LA88_0==CALL||LA88_0==CHARACTER_LITERAL||LA88_0==CONSTANT||LA88_0==LPARENS||LA88_0==MINUS||LA88_0==MINUSMINUS||LA88_0==NOT||LA88_0==PLUS||LA88_0==PLUSPLUS||LA88_0==POST||LA88_0==RAW_IDENTIFIER||LA88_0==SIZEOF||LA88_0==STAR||LA88_0==STRING_LITERAL) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // Mininess.g:631:17: expression
                    {
                    pushFollow(FOLLOW_expression_in_jump_statement5630);
                    expression304=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression304.getTree());

                    }
                    break;

            }


            char_literal305=(Token)match(input,141,FOLLOW_141_in_jump_statement5633); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_141.add(char_literal305);


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
            // 631:33: -> ^( RETURN ( expression )? )
            {
                // Mininess.g:631:36: ^( RETURN ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_RETURN.nextNode()
                , root_1);

                // Mininess.g:631:45: ( expression )?
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
    // Mininess.g:637:1: translation_unit : ( external_declaration | line_directive )+ ;
    public final MininessParser.translation_unit_return translation_unit() throws RecognitionException {
        MininessParser.translation_unit_return retval = new MininessParser.translation_unit_return();
        retval.start = input.LT(1);

        int translation_unit_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.external_declaration_return external_declaration306 =null;

        MininessParser.line_directive_return line_directive307 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Mininess.g:638:5: ( ( external_declaration | line_directive )+ )
            // Mininess.g:638:10: ( external_declaration | line_directive )+
            {
            root_0 = (Object)adaptor.nil();


            // Mininess.g:638:10: ( external_declaration | line_directive )+
            int cnt89=0;
            loop89:
            do {
                int alt89=3;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==CHAR||LA89_0==COMMAND||LA89_0==CONST||LA89_0==DEFAULT||LA89_0==ENUM||(LA89_0 >= ERROR_T && LA89_0 <= EVENT)||(LA89_0 >= INT && LA89_0 <= INT8_T)||LA89_0==LONG||(LA89_0 >= NX_STRUCT && LA89_0 <= NX_UINT8_T)||LA89_0==RAW_IDENTIFIER||(LA89_0 >= SHORT && LA89_0 <= SIGNED)||LA89_0==STRUCT||(LA89_0 >= TASK && LA89_0 <= UINT8_T)||LA89_0==UNSIGNED||LA89_0==VOID) ) {
                    alt89=1;
                }
                else if ( (LA89_0==HASH) ) {
                    alt89=2;
                }


                switch (alt89) {
            	case 1 :
            	    // Mininess.g:638:11: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit5669);
            	    external_declaration306=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, external_declaration306.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:638:34: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_translation_unit5673);
            	    line_directive307=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_directive307.getTree());

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
    // Mininess.g:641:1: external_declaration : declaration ;
    public final MininessParser.external_declaration_return external_declaration() throws RecognitionException {
        MininessParser.external_declaration_return retval = new MininessParser.external_declaration_return();
        retval.start = input.LT(1);

        int external_declaration_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.declaration_return declaration308 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Mininess.g:642:5: ( declaration )
            // Mininess.g:642:10: declaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_external_declaration5691);
            declaration308=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration308.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Mininess.g:656:1: line_directive : '#' CONSTANT STRING_LITERAL ( CONSTANT )? -> ^( LINE_DIRECTIVE STRING_LITERAL ) ;
    public final MininessParser.line_directive_return line_directive() throws RecognitionException {
        MininessParser.line_directive_return retval = new MininessParser.line_directive_return();
        retval.start = input.LT(1);

        int line_directive_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal309=null;
        Token CONSTANT310=null;
        Token STRING_LITERAL311=null;
        Token CONSTANT312=null;

        Object char_literal309_tree=null;
        Object CONSTANT310_tree=null;
        Object STRING_LITERAL311_tree=null;
        Object CONSTANT312_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CONSTANT=new RewriteRuleTokenStream(adaptor,"token CONSTANT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Mininess.g:657:5: ( '#' CONSTANT STRING_LITERAL ( CONSTANT )? -> ^( LINE_DIRECTIVE STRING_LITERAL ) )
            // Mininess.g:657:10: '#' CONSTANT STRING_LITERAL ( CONSTANT )?
            {
            char_literal309=(Token)match(input,HASH,FOLLOW_HASH_in_line_directive5718); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HASH.add(char_literal309);


            CONSTANT310=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive5720); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT310);


            STRING_LITERAL311=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_line_directive5722); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL311);


            // Mininess.g:657:38: ( CONSTANT )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==CONSTANT) ) {
                int LA90_1 = input.LA(2);

                if ( (synpred153_Mininess()) ) {
                    alt90=1;
                }
            }
            switch (alt90) {
                case 1 :
                    // Mininess.g:657:38: CONSTANT
                    {
                    CONSTANT312=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_line_directive5724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSTANT.add(CONSTANT312);


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
            // 657:48: -> ^( LINE_DIRECTIVE STRING_LITERAL )
            {
                // Mininess.g:657:51: ^( LINE_DIRECTIVE STRING_LITERAL )
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
    // Mininess.g:659:1: function_definition : declaration_specifiers declarator compound_statement -> declaration_specifiers declarator compound_statement ;
    public final MininessParser.function_definition_return function_definition() throws RecognitionException {
        MininessParser.function_definition_return retval = new MininessParser.function_definition_return();
        retval.start = input.LT(1);

        int function_definition_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.declaration_specifiers_return declaration_specifiers313 =null;

        MininessParser.declarator_return declarator314 =null;

        MininessParser.compound_statement_return compound_statement315 =null;


        RewriteRuleSubtreeStream stream_declaration_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule declaration_specifiers");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Mininess.g:660:5: ( declaration_specifiers declarator compound_statement -> declaration_specifiers declarator compound_statement )
            // Mininess.g:660:10: declaration_specifiers declarator compound_statement
            {
            pushFollow(FOLLOW_declaration_specifiers_in_function_definition5752);
            declaration_specifiers313=declaration_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaration_specifiers.add(declaration_specifiers313.getTree());

            pushFollow(FOLLOW_declarator_in_function_definition5754);
            declarator314=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator314.getTree());

            pushFollow(FOLLOW_compound_statement_in_function_definition5756);
            compound_statement315=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement315.getTree());

            // AST REWRITE
            // elements: declaration_specifiers, compound_statement, declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 661:13: -> declaration_specifiers declarator compound_statement
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
    // Mininess.g:673:1: mininess_file : ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) );
    public final MininessParser.mininess_file_return mininess_file() throws RecognitionException {
        MininessParser.mininess_file_return retval = new MininessParser.mininess_file_return();
        retval.start = input.LT(1);

        int mininess_file_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.translation_unit_return translation_unit316 =null;

        MininessParser.interface_definition_return interface_definition317 =null;

        MininessParser.translation_unit_return translation_unit318 =null;

        MininessParser.component_return component319 =null;


        RewriteRuleSubtreeStream stream_component=new RewriteRuleSubtreeStream(adaptor,"rule component");
        RewriteRuleSubtreeStream stream_interface_definition=new RewriteRuleSubtreeStream(adaptor,"rule interface_definition");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Mininess.g:674:5: ( ( translation_unit )? interface_definition -> ^( FILE ( translation_unit )? interface_definition ) | ( translation_unit )? component -> ^( FILE ( translation_unit )? component ) )
            int alt93=2;
            switch ( input.LA(1) ) {
            case COMMAND:
            case EVENT:
            case TASK:
                {
                int LA93_1 = input.LA(2);

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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

                if ( (synpred155_Mininess()) ) {
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
            case ERROR_T:
                {
                int LA93_18 = input.LA(2);

                if ( (synpred155_Mininess()) ) {
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
            case NX_STRUCT:
            case STRUCT:
                {
                int LA93_19 = input.LA(2);

                if ( (synpred155_Mininess()) ) {
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
            case ENUM:
                {
                int LA93_20 = input.LA(2);

                if ( (synpred155_Mininess()) ) {
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
            case RAW_IDENTIFIER:
                {
                int LA93_21 = input.LA(2);

                if ( (synpred155_Mininess()) ) {
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
            case CONST:
                {
                int LA93_22 = input.LA(2);

                if ( (synpred155_Mininess()) ) {
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
            case DEFAULT:
                {
                int LA93_23 = input.LA(2);

                if ( (synpred155_Mininess()) ) {
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
            case TYPEDEF:
                {
                int LA93_24 = input.LA(2);

                if ( (synpred155_Mininess()) ) {
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
            case HASH:
                {
                int LA93_25 = input.LA(2);

                if ( (synpred155_Mininess()) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 25, input);

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
                    // Mininess.g:674:10: ( translation_unit )? interface_definition
                    {
                    // Mininess.g:674:10: ( translation_unit )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==CHAR||LA91_0==COMMAND||LA91_0==CONST||LA91_0==DEFAULT||LA91_0==ENUM||(LA91_0 >= ERROR_T && LA91_0 <= EVENT)||LA91_0==HASH||(LA91_0 >= INT && LA91_0 <= INT8_T)||LA91_0==LONG||(LA91_0 >= NX_STRUCT && LA91_0 <= NX_UINT8_T)||LA91_0==RAW_IDENTIFIER||(LA91_0 >= SHORT && LA91_0 <= SIGNED)||LA91_0==STRUCT||(LA91_0 >= TASK && LA91_0 <= UINT8_T)||LA91_0==UNSIGNED||LA91_0==VOID) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // Mininess.g:674:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_mininess_file5804);
                            translation_unit316=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit316.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_interface_definition_in_mininess_file5807);
                    interface_definition317=interface_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interface_definition.add(interface_definition317.getTree());

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
                    // 674:49: -> ^( FILE ( translation_unit )? interface_definition )
                    {
                        // Mininess.g:674:52: ^( FILE ( translation_unit )? interface_definition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // Mininess.g:674:59: ( translation_unit )?
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
                    // Mininess.g:675:10: ( translation_unit )? component
                    {
                    // Mininess.g:675:10: ( translation_unit )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==CHAR||LA92_0==COMMAND||LA92_0==CONST||LA92_0==DEFAULT||LA92_0==ENUM||(LA92_0 >= ERROR_T && LA92_0 <= EVENT)||LA92_0==HASH||(LA92_0 >= INT && LA92_0 <= INT8_T)||LA92_0==LONG||(LA92_0 >= NX_STRUCT && LA92_0 <= NX_UINT8_T)||LA92_0==RAW_IDENTIFIER||(LA92_0 >= SHORT && LA92_0 <= SIGNED)||LA92_0==STRUCT||(LA92_0 >= TASK && LA92_0 <= UINT8_T)||LA92_0==UNSIGNED||LA92_0==VOID) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Mininess.g:675:10: translation_unit
                            {
                            pushFollow(FOLLOW_translation_unit_in_mininess_file5829);
                            translation_unit318=translation_unit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit318.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_component_in_mininess_file5832);
                    component319=component();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_component.add(component319.getTree());

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
                    // 675:38: -> ^( FILE ( translation_unit )? component )
                    {
                        // Mininess.g:675:41: ^( FILE ( translation_unit )? component )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILE, "FILE")
                        , root_1);

                        // Mininess.g:675:48: ( translation_unit )?
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
    // Mininess.g:678:1: interface_definition : INTERFACE identifier '{' ( declaration | line_directive )* '}' -> ^( INTERFACE identifier ( declaration )* ) ;
    public final MininessParser.interface_definition_return interface_definition() throws RecognitionException {
        MininessParser.interface_definition_return retval = new MininessParser.interface_definition_return();
        retval.start = input.LT(1);

        int interface_definition_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE320=null;
        Token char_literal322=null;
        Token char_literal325=null;
        MininessParser.identifier_return identifier321 =null;

        MininessParser.declaration_return declaration323 =null;

        MininessParser.line_directive_return line_directive324 =null;


        Object INTERFACE320_tree=null;
        Object char_literal322_tree=null;
        Object char_literal325_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Mininess.g:679:5: ( INTERFACE identifier '{' ( declaration | line_directive )* '}' -> ^( INTERFACE identifier ( declaration )* ) )
            // Mininess.g:679:10: INTERFACE identifier '{' ( declaration | line_directive )* '}'
            {
            INTERFACE320=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_definition5859); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE320);


            pushFollow(FOLLOW_identifier_in_interface_definition5861);
            identifier321=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier321.getTree());

            char_literal322=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interface_definition5871); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal322);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // Mininess.g:681:9: ( declaration | line_directive )*
            loop94:
            do {
                int alt94=3;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==CHAR||LA94_0==COMMAND||LA94_0==CONST||LA94_0==DEFAULT||LA94_0==ENUM||(LA94_0 >= ERROR_T && LA94_0 <= EVENT)||(LA94_0 >= INT && LA94_0 <= INT8_T)||LA94_0==LONG||(LA94_0 >= NX_STRUCT && LA94_0 <= NX_UINT8_T)||LA94_0==RAW_IDENTIFIER||(LA94_0 >= SHORT && LA94_0 <= SIGNED)||LA94_0==STRUCT||(LA94_0 >= TASK && LA94_0 <= UINT8_T)||LA94_0==UNSIGNED||LA94_0==VOID) ) {
                    alt94=1;
                }
                else if ( (LA94_0==HASH) ) {
                    alt94=2;
                }


                switch (alt94) {
            	case 1 :
            	    // Mininess.g:681:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_interface_definition5884);
            	    declaration323=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration323.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:681:24: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_interface_definition5888);
            	    line_directive324=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive324.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            if ( state.backtracking==0 ) { symbols.exitScope();  }

            char_literal325=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interface_definition5906); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal325);


            // AST REWRITE
            // elements: INTERFACE, declaration, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 683:13: -> ^( INTERFACE identifier ( declaration )* )
            {
                // Mininess.g:683:16: ^( INTERFACE identifier ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // Mininess.g:683:39: ( declaration )*
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
    // Mininess.g:685:1: component : MODULE identifier component_specification implementation -> ^( MODULE identifier component_specification implementation ) ;
    public final MininessParser.component_return component() throws RecognitionException {
        MininessParser.component_return retval = new MininessParser.component_return();
        retval.start = input.LT(1);

        int component_StartIndex = input.index();

        Object root_0 = null;

        Token MODULE326=null;
        MininessParser.identifier_return identifier327 =null;

        MininessParser.component_specification_return component_specification328 =null;

        MininessParser.implementation_return implementation329 =null;


        Object MODULE326_tree=null;
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleSubtreeStream stream_component_specification=new RewriteRuleSubtreeStream(adaptor,"rule component_specification");
        RewriteRuleSubtreeStream stream_implementation=new RewriteRuleSubtreeStream(adaptor,"rule implementation");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Mininess.g:686:5: ( MODULE identifier component_specification implementation -> ^( MODULE identifier component_specification implementation ) )
            // Mininess.g:686:9: MODULE identifier component_specification implementation
            {
            MODULE326=(Token)match(input,MODULE,FOLLOW_MODULE_in_component5947); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE326);


            pushFollow(FOLLOW_identifier_in_component5949);
            identifier327=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier327.getTree());

            pushFollow(FOLLOW_component_specification_in_component5951);
            component_specification328=component_specification();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_component_specification.add(component_specification328.getTree());

            pushFollow(FOLLOW_implementation_in_component5953);
            implementation329=implementation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_implementation.add(implementation329.getTree());

            // AST REWRITE
            // elements: identifier, MODULE, implementation, component_specification
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 687:13: -> ^( MODULE identifier component_specification implementation )
            {
                // Mininess.g:687:16: ^( MODULE identifier component_specification implementation )
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
    // Mininess.g:689:1: implementation : module_implementation ;
    public final MininessParser.implementation_return implementation() throws RecognitionException {
        MininessParser.implementation_return retval = new MininessParser.implementation_return();
        retval.start = input.LT(1);

        int implementation_StartIndex = input.index();

        Object root_0 = null;

        MininessParser.module_implementation_return module_implementation330 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Mininess.g:690:5: ( module_implementation )
            // Mininess.g:690:10: module_implementation
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_module_implementation_in_implementation5992);
            module_implementation330=module_implementation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, module_implementation330.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Mininess.g:695:1: module_implementation : IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) ;
    public final MininessParser.module_implementation_return module_implementation() throws RecognitionException {
        MininessParser.module_implementation_return retval = new MininessParser.module_implementation_return();
        retval.start = input.LT(1);

        int module_implementation_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTATION331=null;
        Token char_literal332=null;
        Token char_literal334=null;
        MininessParser.translation_unit_return translation_unit333 =null;


        Object IMPLEMENTATION331_tree=null;
        Object char_literal332_tree=null;
        Object char_literal334_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Mininess.g:696:5: ( IMPLEMENTATION '{' translation_unit '}' -> ^( IMPLEMENTATION translation_unit ) )
            // Mininess.g:696:10: IMPLEMENTATION '{' translation_unit '}'
            {
            IMPLEMENTATION331=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_module_implementation6010); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(IMPLEMENTATION331);


            char_literal332=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_implementation6012); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal332);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            pushFollow(FOLLOW_translation_unit_in_module_implementation6044);
            translation_unit333=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit333.getTree());

            if ( state.backtracking==0 ) { symbols.exitScope(); symbols.exitScope(); }

            char_literal334=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_implementation6100); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal334);


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
            // 700:13: -> ^( IMPLEMENTATION translation_unit )
            {
                // Mininess.g:700:16: ^( IMPLEMENTATION translation_unit )
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
    // Mininess.g:706:1: component_specification : '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) ;
    public final MininessParser.component_specification_return component_specification() throws RecognitionException {
        MininessParser.component_specification_return retval = new MininessParser.component_specification_return();
        retval.start = input.LT(1);

        int component_specification_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal335=null;
        Token char_literal338=null;
        MininessParser.uses_provides_return uses_provides336 =null;

        MininessParser.line_directive_return line_directive337 =null;


        Object char_literal335_tree=null;
        Object char_literal338_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_uses_provides=new RewriteRuleSubtreeStream(adaptor,"rule uses_provides");
        RewriteRuleSubtreeStream stream_line_directive=new RewriteRuleSubtreeStream(adaptor,"rule line_directive");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Mininess.g:707:5: ( '{' ( uses_provides | line_directive )* '}' -> ^( SPECIFICATION ( uses_provides )* ) )
            // Mininess.g:707:10: '{' ( uses_provides | line_directive )* '}'
            {
            char_literal335=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_component_specification6139); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal335);


            if ( state.backtracking==0 ) { symbols.enterScope(); }

            // Mininess.g:708:11: ( uses_provides | line_directive )*
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
            	    // Mininess.g:708:12: uses_provides
            	    {
            	    pushFollow(FOLLOW_uses_provides_in_component_specification6154);
            	    uses_provides336=uses_provides();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_uses_provides.add(uses_provides336.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Mininess.g:708:28: line_directive
            	    {
            	    pushFollow(FOLLOW_line_directive_in_component_specification6158);
            	    line_directive337=line_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_line_directive.add(line_directive337.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            char_literal338=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_component_specification6162); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal338);


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
            // 708:49: -> ^( SPECIFICATION ( uses_provides )* )
            {
                // Mininess.g:708:52: ^( SPECIFICATION ( uses_provides )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPECIFICATION, "SPECIFICATION")
                , root_1);

                // Mininess.g:708:68: ( uses_provides )*
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
    // Mininess.g:710:1: uses_provides : ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) );
    public final MininessParser.uses_provides_return uses_provides() throws RecognitionException {
        MininessParser.uses_provides_return retval = new MininessParser.uses_provides_return();
        retval.start = input.LT(1);

        int uses_provides_StartIndex = input.index();

        Object root_0 = null;

        Token USES339=null;
        Token PROVIDES341=null;
        MininessParser.specification_element_list_return specification_element_list340 =null;

        MininessParser.specification_element_list_return specification_element_list342 =null;


        Object USES339_tree=null;
        Object PROVIDES341_tree=null;
        RewriteRuleTokenStream stream_PROVIDES=new RewriteRuleTokenStream(adaptor,"token PROVIDES");
        RewriteRuleTokenStream stream_USES=new RewriteRuleTokenStream(adaptor,"token USES");
        RewriteRuleSubtreeStream stream_specification_element_list=new RewriteRuleSubtreeStream(adaptor,"rule specification_element_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Mininess.g:711:5: ( USES specification_element_list -> ^( USES specification_element_list ) | PROVIDES specification_element_list -> ^( PROVIDES specification_element_list ) )
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
                    // Mininess.g:711:10: USES specification_element_list
                    {
                    USES339=(Token)match(input,USES,FOLLOW_USES_in_uses_provides6186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USES.add(USES339);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides6188);
                    specification_element_list340=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list340.getTree());

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
                    // 711:42: -> ^( USES specification_element_list )
                    {
                        // Mininess.g:711:45: ^( USES specification_element_list )
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
                    // Mininess.g:712:10: PROVIDES specification_element_list
                    {
                    PROVIDES341=(Token)match(input,PROVIDES,FOLLOW_PROVIDES_in_uses_provides6207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROVIDES.add(PROVIDES341);


                    pushFollow(FOLLOW_specification_element_list_in_uses_provides6209);
                    specification_element_list342=specification_element_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element_list.add(specification_element_list342.getTree());

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
                    // 712:46: -> ^( PROVIDES specification_element_list )
                    {
                        // Mininess.g:712:49: ^( PROVIDES specification_element_list )
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
    // Mininess.g:714:1: specification_element_list : ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ );
    public final MininessParser.specification_element_list_return specification_element_list() throws RecognitionException {
        MininessParser.specification_element_list_return retval = new MininessParser.specification_element_list_return();
        retval.start = input.LT(1);

        int specification_element_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal344=null;
        Token char_literal346=null;
        MininessParser.specification_element_return specification_element343 =null;

        MininessParser.specification_element_return specification_element345 =null;


        Object char_literal344_tree=null;
        Object char_literal346_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_specification_element=new RewriteRuleSubtreeStream(adaptor,"rule specification_element");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Mininess.g:715:5: ( specification_element -> specification_element | '{' ( specification_element )+ '}' -> ( specification_element )+ )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==CHAR||LA98_0==COMMAND||LA98_0==CONST||LA98_0==DEFAULT||LA98_0==ENUM||(LA98_0 >= ERROR_T && LA98_0 <= EVENT)||(LA98_0 >= INT && LA98_0 <= INTERFACE)||LA98_0==LONG||(LA98_0 >= NX_STRUCT && LA98_0 <= NX_UINT8_T)||LA98_0==RAW_IDENTIFIER||(LA98_0 >= SHORT && LA98_0 <= SIGNED)||LA98_0==STRUCT||(LA98_0 >= TASK && LA98_0 <= UINT8_T)||LA98_0==UNSIGNED||LA98_0==VOID) ) {
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
                    // Mininess.g:715:10: specification_element
                    {
                    pushFollow(FOLLOW_specification_element_in_specification_element_list6232);
                    specification_element343=specification_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_specification_element.add(specification_element343.getTree());

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
                    // 715:32: -> specification_element
                    {
                        adaptor.addChild(root_0, stream_specification_element.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Mininess.g:716:10: '{' ( specification_element )+ '}'
                    {
                    char_literal344=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_specification_element_list6247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(char_literal344);


                    // Mininess.g:716:14: ( specification_element )+
                    int cnt97=0;
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==CHAR||LA97_0==COMMAND||LA97_0==CONST||LA97_0==DEFAULT||LA97_0==ENUM||(LA97_0 >= ERROR_T && LA97_0 <= EVENT)||(LA97_0 >= INT && LA97_0 <= INTERFACE)||LA97_0==LONG||(LA97_0 >= NX_STRUCT && LA97_0 <= NX_UINT8_T)||LA97_0==RAW_IDENTIFIER||(LA97_0 >= SHORT && LA97_0 <= SIGNED)||LA97_0==STRUCT||(LA97_0 >= TASK && LA97_0 <= UINT8_T)||LA97_0==UNSIGNED||LA97_0==VOID) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // Mininess.g:716:14: specification_element
                    	    {
                    	    pushFollow(FOLLOW_specification_element_in_specification_element_list6249);
                    	    specification_element345=specification_element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_specification_element.add(specification_element345.getTree());

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


                    char_literal346=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_specification_element_list6252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(char_literal346);


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
                    // 716:41: -> ( specification_element )+
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
    // Mininess.g:718:1: specification_element : ( declaration | INTERFACE identifier ';' -> ^( INTERFACE identifier ) );
    public final MininessParser.specification_element_return specification_element() throws RecognitionException {
        MininessParser.specification_element_return retval = new MininessParser.specification_element_return();
        retval.start = input.LT(1);

        int specification_element_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE348=null;
        Token char_literal350=null;
        MininessParser.declaration_return declaration347 =null;

        MininessParser.identifier_return identifier349 =null;


        Object INTERFACE348_tree=null;
        Object char_literal350_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Mininess.g:719:5: ( declaration | INTERFACE identifier ';' -> ^( INTERFACE identifier ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==CHAR||LA99_0==COMMAND||LA99_0==CONST||LA99_0==DEFAULT||LA99_0==ENUM||(LA99_0 >= ERROR_T && LA99_0 <= EVENT)||(LA99_0 >= INT && LA99_0 <= INT8_T)||LA99_0==LONG||(LA99_0 >= NX_STRUCT && LA99_0 <= NX_UINT8_T)||LA99_0==RAW_IDENTIFIER||(LA99_0 >= SHORT && LA99_0 <= SIGNED)||LA99_0==STRUCT||(LA99_0 >= TASK && LA99_0 <= UINT8_T)||LA99_0==UNSIGNED||LA99_0==VOID) ) {
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
                    // Mininess.g:719:10: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_specification_element6272);
                    declaration347=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration347.getTree());

                    }
                    break;
                case 2 :
                    // Mininess.g:720:10: INTERFACE identifier ';'
                    {
                    INTERFACE348=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_specification_element6283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE348);


                    pushFollow(FOLLOW_identifier_in_specification_element6285);
                    identifier349=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier349.getTree());

                    char_literal350=(Token)match(input,141,FOLLOW_141_in_specification_element6287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_141.add(char_literal350);


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
                    // 720:35: -> ^( INTERFACE identifier )
                    {
                        // Mininess.g:720:38: ^( INTERFACE identifier )
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
    // Mininess.g:722:1: identifier : id= RAW_IDENTIFIER {...}?;
    public final MininessParser.identifier_return identifier() throws RecognitionException {
        MininessParser.identifier_return retval = new MininessParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Mininess.g:723:5: (id= RAW_IDENTIFIER {...}?)
            // Mininess.g:723:9: id= RAW_IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            id=(Token)match(input,RAW_IDENTIFIER,FOLLOW_RAW_IDENTIFIER_in_identifier6311); if (state.failed) return retval;
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
        // Mininess.g:259:10: ( SIZEOF '(' type_name ')' )
        // Mininess.g:259:10: SIZEOF '(' type_name ')'
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred23_Mininess2442); if (state.failed) return ;

        match(input,LPARENS,FOLLOW_LPARENS_in_synpred23_Mininess2444); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred23_Mininess2446);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred23_Mininess2448); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_Mininess

    // $ANTLR start synpred24_Mininess
    public final void synpred24_Mininess_fragment() throws RecognitionException {
        // Mininess.g:260:10: ( SIZEOF unary_expression )
        // Mininess.g:260:10: SIZEOF unary_expression
        {
        match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred24_Mininess2467); if (state.failed) return ;

        pushFollow(FOLLOW_unary_expression_in_synpred24_Mininess2469);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_Mininess

    // $ANTLR start synpred25_Mininess
    public final void synpred25_Mininess_fragment() throws RecognitionException {
        // Mininess.g:268:10: ( '(' type_name ')' cast_expression )
        // Mininess.g:268:10: '(' type_name ')' cast_expression
        {
        match(input,LPARENS,FOLLOW_LPARENS_in_synpred25_Mininess2512); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred25_Mininess2514);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPARENS,FOLLOW_RPARENS_in_synpred25_Mininess2516); if (state.failed) return ;

        pushFollow(FOLLOW_cast_expression_in_synpred25_Mininess2518);
        cast_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_Mininess

    // $ANTLR start synpred56_Mininess
    public final void synpred56_Mininess_fragment() throws RecognitionException {
        // Mininess.g:308:10: ( unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression )
        // Mininess.g:308:10: unary_expression ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ) assignment_expression
        {
        pushFollow(FOLLOW_unary_expression_in_synpred56_Mininess2944);
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


        pushFollow(FOLLOW_assignment_expression_in_synpred56_Mininess3001);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_Mininess

    // $ANTLR start synpred59_Mininess
    public final void synpred59_Mininess_fragment() throws RecognitionException {
        // Mininess.g:336:10: ( declaration_specifiers ( init_declarator_list )? ';' )
        // Mininess.g:336:10: declaration_specifiers ( init_declarator_list )? ';'
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred59_Mininess3121);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        // Mininess.g:340:33: ( init_declarator_list )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==LPARENS||LA101_0==RAW_IDENTIFIER||LA101_0==STAR) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // Mininess.g:340:33: init_declarator_list
                {
                pushFollow(FOLLOW_init_declarator_list_in_synpred59_Mininess3123);
                init_declarator_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,141,FOLLOW_141_in_synpred59_Mininess3126); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Mininess

    // $ANTLR start synpred60_Mininess
    public final void synpred60_Mininess_fragment() throws RecognitionException {
        // Mininess.g:349:10: ( function_definition )
        // Mininess.g:349:10: function_definition
        {
        pushFollow(FOLLOW_function_definition_in_synpred60_Mininess3188);
        function_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_Mininess

    // $ANTLR start synpred62_Mininess
    public final void synpred62_Mininess_fragment() throws RecognitionException {
        // Mininess.g:369:11: ( type_specifier )
        // Mininess.g:369:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred62_Mininess3313);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred62_Mininess

    // $ANTLR start synpred92_Mininess
    public final void synpred92_Mininess_fragment() throws RecognitionException {
        // Mininess.g:443:11: ( type_specifier )
        // Mininess.g:443:11: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred92_Mininess4008);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred92_Mininess

    // $ANTLR start synpred96_Mininess
    public final void synpred96_Mininess_fragment() throws RecognitionException {
        // Mininess.g:454:10: ( ( declarator )? ':' constant_expression )
        // Mininess.g:454:10: ( declarator )? ':' constant_expression
        {
        // Mininess.g:454:10: ( declarator )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==LPARENS||LA103_0==RAW_IDENTIFIER||LA103_0==STAR) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // Mininess.g:454:10: declarator
                {
                pushFollow(FOLLOW_declarator_in_synpred96_Mininess4073);
                declarator();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,140,FOLLOW_140_in_synpred96_Mininess4076); if (state.failed) return ;

        pushFollow(FOLLOW_constant_expression_in_synpred96_Mininess4078);
        constant_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred96_Mininess

    // $ANTLR start synpred99_Mininess
    public final void synpred99_Mininess_fragment() throws RecognitionException {
        // Mininess.g:458:10: ( ENUM ( identifier )? '{' enumerator_list ( ',' )? '}' )
        // Mininess.g:458:10: ENUM ( identifier )? '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred99_Mininess4108); if (state.failed) return ;

        // Mininess.g:458:15: ( identifier )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RAW_IDENTIFIER) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // Mininess.g:458:15: identifier
                {
                pushFollow(FOLLOW_identifier_in_synpred99_Mininess4110);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred99_Mininess4113); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred99_Mininess4115);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // Mininess.g:458:47: ( ',' )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==COMMA) ) {
            alt105=1;
        }
        switch (alt105) {
            case 1 :
                // Mininess.g:458:47: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred99_Mininess4117); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred99_Mininess4120); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred99_Mininess

    // $ANTLR start synpred101_Mininess
    public final void synpred101_Mininess_fragment() throws RecognitionException {
        // Mininess.g:460:10: ( ENUM identifier '{' enumerator_list ( ',' )? '}' )
        // Mininess.g:460:10: ENUM identifier '{' enumerator_list ( ',' )? '}'
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred101_Mininess4155); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_in_synpred101_Mininess4157);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred101_Mininess4159); if (state.failed) return ;

        pushFollow(FOLLOW_enumerator_list_in_synpred101_Mininess4161);
        enumerator_list();

        state._fsp--;
        if (state.failed) return ;

        // Mininess.g:460:46: ( ',' )?
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==COMMA) ) {
            alt106=1;
        }
        switch (alt106) {
            case 1 :
                // Mininess.g:460:46: ','
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred101_Mininess4163); if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred101_Mininess4166); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred101_Mininess

    // $ANTLR start synpred109_Mininess
    public final void synpred109_Mininess_fragment() throws RecognitionException {
        // Mininess.g:506:9: ( '[' ( constant_expression )? ']' )
        // Mininess.g:506:9: '[' ( constant_expression )? ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred109_Mininess4451); if (state.failed) return ;

        // Mininess.g:506:13: ( constant_expression )?
        int alt108=2;
        int LA108_0 = input.LA(1);

        if ( (LA108_0==AMP||LA108_0==BITCOMPLEMENT||LA108_0==CALL||LA108_0==CHARACTER_LITERAL||LA108_0==CONSTANT||LA108_0==LPARENS||LA108_0==MINUS||LA108_0==MINUSMINUS||LA108_0==NOT||LA108_0==PLUS||LA108_0==PLUSPLUS||LA108_0==POST||LA108_0==RAW_IDENTIFIER||LA108_0==SIZEOF||LA108_0==STAR||LA108_0==STRING_LITERAL) ) {
            alt108=1;
        }
        switch (alt108) {
            case 1 :
                // Mininess.g:506:13: constant_expression
                {
                pushFollow(FOLLOW_constant_expression_in_synpred109_Mininess4453);
                constant_expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred109_Mininess4456); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred109_Mininess

    // $ANTLR start synpred118_Mininess
    public final void synpred118_Mininess_fragment() throws RecognitionException {
        // Mininess.g:541:10: ( declaration_specifiers declarator )
        // Mininess.g:541:10: declaration_specifiers declarator
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred118_Mininess4725);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_declarator_in_synpred118_Mininess4727);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_Mininess

    // $ANTLR start synpred122_Mininess
    public final void synpred122_Mininess_fragment() throws RecognitionException {
        // Mininess.g:550:10: ( ( pointer )? direct_abstract_declarator )
        // Mininess.g:550:10: ( pointer )? direct_abstract_declarator
        {
        // Mininess.g:550:10: ( pointer )?
        int alt111=2;
        int LA111_0 = input.LA(1);

        if ( (LA111_0==STAR) ) {
            alt111=1;
        }
        switch (alt111) {
            case 1 :
                // Mininess.g:550:10: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred122_Mininess4831);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred122_Mininess4834);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred122_Mininess

    // $ANTLR start synpred126_Mininess
    public final void synpred126_Mininess_fragment() throws RecognitionException {
        // Mininess.g:556:15: ( parameter_type_list )
        // Mininess.g:556:15: parameter_type_list
        {
        pushFollow(FOLLOW_parameter_type_list_in_synpred126_Mininess4907);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred126_Mininess

    // $ANTLR start synpred129_Mininess
    public final void synpred129_Mininess_fragment() throws RecognitionException {
        // Mininess.g:557:52: ( parameter_type_list )
        // Mininess.g:557:52: parameter_type_list
        {
        pushFollow(FOLLOW_parameter_type_list_in_synpred129_Mininess4940);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred129_Mininess

    // $ANTLR start synpred142_Mininess
    public final void synpred142_Mininess_fragment() throws RecognitionException {
        // Mininess.g:603:10: ( declaration )
        // Mininess.g:603:10: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred142_Mininess5296);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred142_Mininess

    // $ANTLR start synpred144_Mininess
    public final void synpred144_Mininess_fragment() throws RecognitionException {
        // Mininess.g:614:43: ( ELSE statement )
        // Mininess.g:614:43: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred144_Mininess5372); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred144_Mininess5374);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred144_Mininess

    // $ANTLR start synpred153_Mininess
    public final void synpred153_Mininess_fragment() throws RecognitionException {
        // Mininess.g:657:38: ( CONSTANT )
        // Mininess.g:657:38: CONSTANT
        {
        match(input,CONSTANT,FOLLOW_CONSTANT_in_synpred153_Mininess5724); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred153_Mininess

    // $ANTLR start synpred155_Mininess
    public final void synpred155_Mininess_fragment() throws RecognitionException {
        // Mininess.g:674:10: ( ( translation_unit )? interface_definition )
        // Mininess.g:674:10: ( translation_unit )? interface_definition
        {
        // Mininess.g:674:10: ( translation_unit )?
        int alt116=2;
        int LA116_0 = input.LA(1);

        if ( (LA116_0==CHAR||LA116_0==COMMAND||LA116_0==CONST||LA116_0==DEFAULT||LA116_0==ENUM||(LA116_0 >= ERROR_T && LA116_0 <= EVENT)||LA116_0==HASH||(LA116_0 >= INT && LA116_0 <= INT8_T)||LA116_0==LONG||(LA116_0 >= NX_STRUCT && LA116_0 <= NX_UINT8_T)||LA116_0==RAW_IDENTIFIER||(LA116_0 >= SHORT && LA116_0 <= SIGNED)||LA116_0==STRUCT||(LA116_0 >= TASK && LA116_0 <= UINT8_T)||LA116_0==UNSIGNED||LA116_0==VOID) ) {
            alt116=1;
        }
        switch (alt116) {
            case 1 :
                // Mininess.g:674:10: translation_unit
                {
                pushFollow(FOLLOW_translation_unit_in_synpred155_Mininess5804);
                translation_unit();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_interface_definition_in_synpred155_Mininess5807);
        interface_definition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred155_Mininess

    // Delegated rules

    public final boolean synpred118_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_Mininess_fragment(); // can never throw exception
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
    public final boolean synpred99_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_Mininess_fragment(); // can never throw exception
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
    public final boolean synpred129_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_Mininess_fragment(); // can never throw exception
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
    public final boolean synpred144_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred144_Mininess_fragment(); // can never throw exception
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
    public final boolean synpred92_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred122_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_Mininess_fragment(); // can never throw exception
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
    public final boolean synpred153_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred153_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred155_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred155_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_Mininess_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_Mininess() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_Mininess_fragment(); // can never throw exception
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
        "\1\172\2\27\2\uffff";
    static final String DFA58_maxS =
        "\3\172\2\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA58_specialS =
        "\5\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1",
            "\1\4\4\uffff\1\2\51\uffff\1\4\4\uffff\1\4\41\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\10\uffff\1\3",
            "\1\4\4\uffff\1\2\51\uffff\1\4\4\uffff\1\4\41\uffff\1\4\1\uffff"+
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
            return "515:1: pointer : ( '*' ( type_qualifier_list )? pointer -> ^( POINTER_QUALIFIER ( type_qualifier_list )? pointer ) | '*' ( type_qualifier_list )? -> ^( POINTER_QUALIFIER ( type_qualifier_list )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_identifier_in_primary_expression1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_primary_expression1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_primary_expression2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_primary_expression2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_primary_expression2026 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_expression_in_primary_expression2028 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_primary_expression2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_kind_in_postfix_expression2055 = new BitSet(new long[]{0x0000000020400000L,0x1000200000000800L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression2058 = new BitSet(new long[]{0x0000020000000402L,0x0000001000010840L});
    public static final BitSet FOLLOW_postfix_expression_modifier_in_postfix_expression2060 = new BitSet(new long[]{0x0000020000000402L,0x0000001000010840L});
    public static final BitSet FOLLOW_LBRACKET_in_postfix_expression_modifier2101 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_expression_in_postfix_expression_modifier2103 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_postfix_expression_modifier2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_postfix_expression_modifier2123 = new BitSet(new long[]{0x0000000020442020L,0x1442205400214800L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression_modifier2125 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_postfix_expression_modifier2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression_modifier2147 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_postfix_expression_modifier2167 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_identifier_in_postfix_expression_modifier2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_postfix_expression_modifier2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_postfix_expression_modifier2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list2246 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list2249 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list2252 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unary_expression2273 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUSMINUS_in_unary_expression2294 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMP_in_unary_expression2315 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_unary_expression2342 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression2368 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression2395 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITCOMPLEMENT_in_unary_expression2422 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_NOT_in_unary_expression2427 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression2442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPARENS_in_unary_expression2444 = new BitSet(new long[]{0x0000480010200000L,0x203020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_type_name_in_unary_expression2446 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_unary_expression2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_unary_expression2467 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_cast_expression2512 = new BitSet(new long[]{0x0000480010200000L,0x203020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_type_name_in_cast_expression2514 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_cast_expression2516 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_arrayinc_expression2554 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ARRAYINC_in_arrayinc_expression2558 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_cast_expression_in_arrayinc_expression2561 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_arrayinc_expression_in_multiplicative_expression2582 = new BitSet(new long[]{0x0000010000000002L,0x0400000000080000L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression2587 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expression2592 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_MODULUS_in_multiplicative_expression2597 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_arrayinc_expression_in_multiplicative_expression2601 = new BitSet(new long[]{0x0000010000000002L,0x0400000000080000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2622 = new BitSet(new long[]{0x0000000000000002L,0x0000000400004000L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression2627 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression2632 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2636 = new BitSet(new long[]{0x0000000000000002L,0x0000000400004000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression2657 = new BitSet(new long[]{0x0000000000000002L,0x0004000000001000L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression2662 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression2667 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression2671 = new BitSet(new long[]{0x0000000000000002L,0x0004000000001000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression2692 = new BitSet(new long[]{0x00C0000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_LESS_in_relational_expression2697 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_GREATER_in_relational_expression2702 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_LESSEQUAL_in_relational_expression2707 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_relational_expression2712 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression2716 = new BitSet(new long[]{0x00C0000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression2737 = new BitSet(new long[]{0x0000200000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_equality_expression2742 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equality_expression2747 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression2751 = new BitSet(new long[]{0x0000200000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression2772 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AMP_in_and_expression2776 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression2779 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression2800 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_BITXOR_in_xor_expression2804 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_and_expression_in_xor_expression2807 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression2828 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_BITOR_in_or_expression2832 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_xor_expression_in_or_expression2835 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression2856 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression2860 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression2863 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression2884 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression2888 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression2891 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression2912 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_conditional_expression2915 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_expression_in_conditional_expression2918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_conditional_expression2920 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_assignment_expression2944 = new BitSet(new long[]{0x0000008000029800L,0x000800080012A000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_expression2947 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_MULASSIGN_in_assignment_expression2952 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_DIVASSIGN_in_assignment_expression2957 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_MODASSIGN_in_assignment_expression2962 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_PLUSASSIGN_in_assignment_expression2967 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_MINUSASSIGN_in_assignment_expression2972 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_LSHIFTASSIGN_in_assignment_expression2977 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_RSHIFTASSIGN_in_assignment_expression2982 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_BITANDASSIGN_in_assignment_expression2987 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_BITXORASSIGN_in_assignment_expression2992 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_BITORASSIGN_in_assignment_expression2997 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3031 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_expression3034 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_assignment_expression_in_expression3037 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3121 = new BitSet(new long[]{0x0000000000000000L,0x0400200000000800L,0x0000000000002000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_declaration3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_declaration3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_declaration3233 = new BitSet(new long[]{0x0000C81011200000L,0xA03020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration3235 = new BitSet(new long[]{0x0000000000000000L,0x0400200000000800L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_declaration3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers3299 = new BitSet(new long[]{0x0000C81011200002L,0xA03020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers3313 = new BitSet(new long[]{0x0000C81011200002L,0xA03020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers3336 = new BitSet(new long[]{0x0000C81011200002L,0xA03020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_DEFAULT_in_declaration_specifiers3359 = new BitSet(new long[]{0x0000C81011200002L,0xA03020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list3382 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_init_declarator_list3385 = new BitSet(new long[]{0x0000000000000000L,0x0400200000000800L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list3387 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator3421 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ASSIGN_in_init_declarator3424 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214820L});
    public static final BitSet FOLLOW_initializer_in_init_declarator3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_specifier3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_type_specifier3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_type_specifier3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_in_type_specifier3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_in_type_specifier3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT8_T_in_type_specifier3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT16_T_in_type_specifier3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_T_in_type_specifier3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT8_T_in_type_specifier3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT16_T_in_type_specifier3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_T_in_type_specifier3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT8_T_in_type_specifier3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT16_T_in_type_specifier3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NX_UINT32_T_in_type_specifier3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ERROR_T_in_type_specifier3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_name_in_type_specifier3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier3801 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000020L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier3803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_struct_or_union_specifier3806 = new BitSet(new long[]{0x0000480010200000L,0x203020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier3808 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACE_in_struct_or_union_specifier3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier3844 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_identifier_in_struct_or_union_specifier3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list3926 = new BitSet(new long[]{0x0000480010200002L,0x203020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration3957 = new BitSet(new long[]{0x0000000000000000L,0x0400200000000800L,0x0000000000001000L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration3959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_struct_declaration3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list4008 = new BitSet(new long[]{0x0000480010200002L,0x203020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list4012 = new BitSet(new long[]{0x0000480010200002L,0x203020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list4038 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_struct_declarator_list4041 = new BitSet(new long[]{0x0000000000000000L,0x0400200000000800L,0x0000000000001000L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list4043 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator4073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_struct_declarator4076 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier4108 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000020L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier4110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier4113 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier4115 = new BitSet(new long[]{0x0000000000800000L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier4117 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier4155 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier4157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_enum_specifier4159 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier4161 = new BitSet(new long[]{0x0000000000800000L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_enum_specifier4163 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enum_specifier4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_specifier4200 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_identifier_in_enum_specifier4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list4242 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_enumerator_list4245 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list4248 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_identifier_in_enumerator4273 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ASSIGN_in_enumerator4276 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_type_qualifier4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator4329 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000800L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_declarator_identifier_in_direct_declarator4357 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
    public static final BitSet FOLLOW_direct_declarator_modifier_in_direct_declarator4359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier4385 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DOT_in_direct_declarator_identifier4388 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_identifier_in_direct_declarator_identifier4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_identifier4425 = new BitSet(new long[]{0x0000000000000000L,0x0400200000000800L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator_identifier4427 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_identifier4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier4451 = new BitSet(new long[]{0x0000000020442020L,0x1440A05400214800L});
    public static final BitSet FOLLOW_constant_expression_in_direct_declarator_modifier4453 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_declarator_modifier4488 = new BitSet(new long[]{0x0000C81011A00000L,0xA03020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_declarator_modifier4492 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_declarator_modifier4494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPARENS_in_direct_declarator_modifier4498 = new BitSet(new long[]{0x0000C81011A00000L,0xA03020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_declarator_modifier4502 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_declarator_modifier4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer4544 = new BitSet(new long[]{0x0000000010000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer4546 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_pointer_in_pointer4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_pointer4571 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_type_qualifier_list_in_pointer4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_type_qualifier_list4602 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_parameter_list_in_parameter_type_list4623 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_type_list4626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_parameter_type_list4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list4653 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list4656 = new BitSet(new long[]{0x0000C81011200000L,0xA03020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list4658 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration4725 = new BitSet(new long[]{0x0000000000000000L,0x0400200000000800L});
    public static final BitSet FOLLOW_declarator_in_parameter_declaration4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration4760 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000840L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name4809 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000840L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator4831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator4865 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000840L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator4867 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator4872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator4886 = new BitSet(new long[]{0x0000000020442020L,0x1440A05400214800L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator4888 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator4891 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator4905 = new BitSet(new long[]{0x0000C81011A00000L,0xA03220007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_abstract_declarator4907 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator4912 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
    public static final BitSet FOLLOW_LBRACKET_in_direct_abstract_declarator4929 = new BitSet(new long[]{0x0000000020442020L,0x1440A05400214800L});
    public static final BitSet FOLLOW_assignment_expression_in_direct_abstract_declarator4931 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_direct_abstract_declarator4934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
    public static final BitSet FOLLOW_LPARENS_in_direct_abstract_declarator4938 = new BitSet(new long[]{0x0000C81011A00000L,0xA03220007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_parameter_type_list_in_direct_abstract_declarator4940 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_direct_abstract_declarator4943 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_typedef_name4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_initializer5018 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214820L});
    public static final BitSet FOLLOW_initializer_list_in_initializer5020 = new BitSet(new long[]{0x0000000000800000L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_initializer5022 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACE_in_initializer5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5052 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_initializer_list5055 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214820L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5057 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_statement5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_labeled_statement5184 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement5186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_labeled_statement5188 = new BitSet(new long[]{0x11020010204C2020L,0x5441205400214820L,0x0000000000002200L});
    public static final BitSet FOLLOW_statement_in_labeled_statement5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_labeled_statement5211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_labeled_statement5213 = new BitSet(new long[]{0x11020010204C2020L,0x5441205400214820L,0x0000000000002200L});
    public static final BitSet FOLLOW_statement_in_labeled_statement5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_compound_statement5241 = new BitSet(new long[]{0x1102C810316C2020L,0xF471605478214C2FL,0x000000000000234FL});
    public static final BitSet FOLLOW_block_item_in_compound_statement5254 = new BitSet(new long[]{0x1102C810316C2020L,0xF471605478214C2FL,0x000000000000234FL});
    public static final BitSet FOLLOW_RBRACE_in_compound_statement5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_block_item5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block_item5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement5330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_expression_statement5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement5361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement5363 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_expression_in_selection_statement5365 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement5367 = new BitSet(new long[]{0x11020010204C2020L,0x5441205400214820L,0x0000000000002200L});
    public static final BitSet FOLLOW_statement_in_selection_statement5369 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement5372 = new BitSet(new long[]{0x11020010204C2020L,0x5441205400214820L,0x0000000000002200L});
    public static final BitSet FOLLOW_statement_in_selection_statement5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_selection_statement5413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPARENS_in_selection_statement5415 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_expression_in_selection_statement5417 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_selection_statement5419 = new BitSet(new long[]{0x11020010204C2020L,0x5441205400214820L,0x0000000000002200L});
    public static final BitSet FOLLOW_statement_in_selection_statement5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement5467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement5469 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5471 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement5473 = new BitSet(new long[]{0x11020010204C2020L,0x5441205400214820L,0x0000000000002200L});
    public static final BitSet FOLLOW_statement_in_iteration_statement5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement5496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPARENS_in_iteration_statement5498 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L,0x0000000000002000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_iteration_statement5505 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L,0x0000000000002000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_iteration_statement5512 = new BitSet(new long[]{0x0000000020442020L,0x1442205400214800L});
    public static final BitSet FOLLOW_expression_in_iteration_statement5516 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_iteration_statement5519 = new BitSet(new long[]{0x11020010204C2020L,0x5441205400214820L,0x0000000000002200L});
    public static final BitSet FOLLOW_statement_in_iteration_statement5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement5628 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L,0x0000000000002000L});
    public static final BitSet FOLLOW_expression_in_jump_statement5630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_jump_statement5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit5669 = new BitSet(new long[]{0x0100C81011200002L,0xA03020007800040FL,0x000000000000014FL});
    public static final BitSet FOLLOW_line_directive_in_translation_unit5673 = new BitSet(new long[]{0x0100C81011200002L,0xA03020007800040FL,0x000000000000014FL});
    public static final BitSet FOLLOW_declaration_in_external_declaration5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_line_directive5718 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive5720 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_line_directive5722 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_CONSTANT_in_line_directive5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition5752 = new BitSet(new long[]{0x0000000000000000L,0x0400200000000800L});
    public static final BitSet FOLLOW_declarator_in_function_definition5754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_mininess_file5804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_interface_definition_in_mininess_file5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_mininess_file5829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_component_in_mininess_file5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_definition5859 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_identifier_in_interface_definition5861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_interface_definition5871 = new BitSet(new long[]{0x0100C81011200000L,0xA03060007800040FL,0x000000000000014FL});
    public static final BitSet FOLLOW_declaration_in_interface_definition5884 = new BitSet(new long[]{0x0100C81011200000L,0xA03060007800040FL,0x000000000000014FL});
    public static final BitSet FOLLOW_line_directive_in_interface_definition5888 = new BitSet(new long[]{0x0100C81011200000L,0xA03060007800040FL,0x000000000000014FL});
    public static final BitSet FOLLOW_RBRACE_in_interface_definition5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_component5947 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_identifier_in_component5949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_component_specification_in_component5951 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_implementation_in_component5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_implementation_in_implementation5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_module_implementation6010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_module_implementation6012 = new BitSet(new long[]{0x0100C81011200000L,0xA03020007800040FL,0x000000000000014FL});
    public static final BitSet FOLLOW_translation_unit_in_module_implementation6044 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACE_in_module_implementation6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_component_specification6139 = new BitSet(new long[]{0x0100000000000000L,0x0000500000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_uses_provides_in_component_specification6154 = new BitSet(new long[]{0x0100000000000000L,0x0000500000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_line_directive_in_component_specification6158 = new BitSet(new long[]{0x0100000000000000L,0x0000500000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_component_specification6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_uses_provides6186 = new BitSet(new long[]{0x0000C81011200000L,0xA03020007800043FL,0x000000000000014FL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVIDES_in_uses_provides6207 = new BitSet(new long[]{0x0000C81011200000L,0xA03020007800043FL,0x000000000000014FL});
    public static final BitSet FOLLOW_specification_element_list_in_uses_provides6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_specification_element_list6247 = new BitSet(new long[]{0x0000C81011200000L,0xA03020007800041FL,0x000000000000014FL});
    public static final BitSet FOLLOW_specification_element_in_specification_element_list6249 = new BitSet(new long[]{0x0000C81011200000L,0xA03060007800041FL,0x000000000000014FL});
    public static final BitSet FOLLOW_RBRACE_in_specification_element_list6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_specification_element6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_specification_element6283 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_identifier_in_specification_element6285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_specification_element6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAW_IDENTIFIER_in_identifier6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred23_Mininess2442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPARENS_in_synpred23_Mininess2444 = new BitSet(new long[]{0x0000480010200000L,0x203020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_type_name_in_synpred23_Mininess2446 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred23_Mininess2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_synpred24_Mininess2467 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_unary_expression_in_synpred24_Mininess2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_synpred25_Mininess2512 = new BitSet(new long[]{0x0000480010200000L,0x203020007800040FL,0x000000000000014EL});
    public static final BitSet FOLLOW_type_name_in_synpred25_Mininess2514 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPARENS_in_synpred25_Mininess2516 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_cast_expression_in_synpred25_Mininess2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_synpred56_Mininess2944 = new BitSet(new long[]{0x0000008000029800L,0x000800080012A000L});
    public static final BitSet FOLLOW_set_in_synpred56_Mininess2946 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred56_Mininess3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred59_Mininess3121 = new BitSet(new long[]{0x0000000000000000L,0x0400200000000800L,0x0000000000002000L});
    public static final BitSet FOLLOW_init_declarator_list_in_synpred59_Mininess3123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_synpred59_Mininess3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_synpred60_Mininess3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred62_Mininess3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred92_Mininess4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred96_Mininess4073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_synpred96_Mininess4076 = new BitSet(new long[]{0x0000000020442020L,0x1440205400214800L});
    public static final BitSet FOLLOW_constant_expression_in_synpred96_Mininess4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred99_Mininess4108 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000020L});
    public static final BitSet FOLLOW_identifier_in_synpred99_Mininess4110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_synpred99_Mininess4113 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred99_Mininess4115 = new BitSet(new long[]{0x0000000000800000L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred99_Mininess4117 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred99_Mininess4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred101_Mininess4155 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_identifier_in_synpred101_Mininess4157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_synpred101_Mininess4159 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_enumerator_list_in_synpred101_Mininess4161 = new BitSet(new long[]{0x0000000000800000L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred101_Mininess4163 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACE_in_synpred101_Mininess4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred109_Mininess4451 = new BitSet(new long[]{0x0000000020442020L,0x1440A05400214800L});
    public static final BitSet FOLLOW_constant_expression_in_synpred109_Mininess4453 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred109_Mininess4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred118_Mininess4725 = new BitSet(new long[]{0x0000000000000000L,0x0400200000000800L});
    public static final BitSet FOLLOW_declarator_in_synpred118_Mininess4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred122_Mininess4831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred122_Mininess4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred126_Mininess4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred129_Mininess4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred142_Mininess5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred144_Mininess5372 = new BitSet(new long[]{0x11020010204C2020L,0x5441205400214820L,0x0000000000002200L});
    public static final BitSet FOLLOW_statement_in_synpred144_Mininess5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_synpred153_Mininess5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translation_unit_in_synpred155_Mininess5804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_interface_definition_in_synpred155_Mininess5807 = new BitSet(new long[]{0x0000000000000002L});

}