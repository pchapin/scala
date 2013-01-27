// $ANTLR 3.4 Mininess.g 2013-01-27 14:53:57

    package edu.uvm.mininess.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MininessLexer extends Lexer {
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

        // This is mostly just a placeholder.
        private final int VERSION = 1;


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MininessLexer() {} 
    public MininessLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MininessLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Mininess.g"; }

    // $ANTLR start "AMP"
    public final void mAMP() throws RecognitionException {
        try {
            int _type = AMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:10:5: ( '&' )
            // Mininess.g:10:7: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMP"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:11:5: ( '&&' )
            // Mininess.g:11:7: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "ARRAYINC"
    public final void mARRAYINC() throws RecognitionException {
        try {
            int _type = ARRAYINC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:12:10: ( '|>' )
            // Mininess.g:12:12: '|>'
            {
            match("|>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARRAYINC"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:13:7: ( '->' )
            // Mininess.g:13:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:14:8: ( '=' )
            // Mininess.g:14:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "BITANDASSIGN"
    public final void mBITANDASSIGN() throws RecognitionException {
        try {
            int _type = BITANDASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:15:14: ( '&=' )
            // Mininess.g:15:16: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITANDASSIGN"

    // $ANTLR start "BITCOMPLEMENT"
    public final void mBITCOMPLEMENT() throws RecognitionException {
        try {
            int _type = BITCOMPLEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:16:15: ( '~' )
            // Mininess.g:16:17: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITCOMPLEMENT"

    // $ANTLR start "BITOR"
    public final void mBITOR() throws RecognitionException {
        try {
            int _type = BITOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:17:7: ( '|' )
            // Mininess.g:17:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITOR"

    // $ANTLR start "BITORASSIGN"
    public final void mBITORASSIGN() throws RecognitionException {
        try {
            int _type = BITORASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:18:13: ( '|=' )
            // Mininess.g:18:15: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITORASSIGN"

    // $ANTLR start "BITXOR"
    public final void mBITXOR() throws RecognitionException {
        try {
            int _type = BITXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:19:8: ( '^' )
            // Mininess.g:19:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITXOR"

    // $ANTLR start "BITXORASSIGN"
    public final void mBITXORASSIGN() throws RecognitionException {
        try {
            int _type = BITXORASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:20:14: ( '^=' )
            // Mininess.g:20:16: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITXORASSIGN"

    // $ANTLR start "CALL"
    public final void mCALL() throws RecognitionException {
        try {
            int _type = CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:21:6: ( 'call' )
            // Mininess.g:21:8: 'call'
            {
            match("call"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CALL"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:22:6: ( 'case' )
            // Mininess.g:22:8: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:23:6: ( 'char' )
            // Mininess.g:23:8: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:24:7: ( ',' )
            // Mininess.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "COMMAND"
    public final void mCOMMAND() throws RecognitionException {
        try {
            int _type = COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:25:9: ( 'command' )
            // Mininess.g:25:11: 'command'
            {
            match("command"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMAND"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:26:7: ( 'const' )
            // Mininess.g:26:9: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:27:9: ( 'default' )
            // Mininess.g:27:11: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DIVASSIGN"
    public final void mDIVASSIGN() throws RecognitionException {
        try {
            int _type = DIVASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:28:11: ( '/=' )
            // Mininess.g:28:13: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVASSIGN"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:29:8: ( '/' )
            // Mininess.g:29:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:30:5: ( '.' )
            // Mininess.g:30:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:31:6: ( 'else' )
            // Mininess.g:31:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:32:6: ( 'enum' )
            // Mininess.g:32:8: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:33:7: ( '==' )
            // Mininess.g:33:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "ERROR_T"
    public final void mERROR_T() throws RecognitionException {
        try {
            int _type = ERROR_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:34:9: ( 'error_t' )
            // Mininess.g:34:11: 'error_t'
            {
            match("error_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ERROR_T"

    // $ANTLR start "EVENT"
    public final void mEVENT() throws RecognitionException {
        try {
            int _type = EVENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:35:7: ( 'event' )
            // Mininess.g:35:9: 'event'
            {
            match("event"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EVENT"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:36:5: ( 'for' )
            // Mininess.g:36:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:37:9: ( '>' )
            // Mininess.g:37:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:38:14: ( '>=' )
            // Mininess.g:38:16: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:39:6: ( '#' )
            // Mininess.g:39:8: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:40:4: ( 'if' )
            // Mininess.g:40:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPLEMENTATION"
    public final void mIMPLEMENTATION() throws RecognitionException {
        try {
            int _type = IMPLEMENTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:41:16: ( 'implementation' )
            // Mininess.g:41:18: 'implementation'
            {
            match("implementation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPLEMENTATION"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:42:5: ( 'int' )
            // Mininess.g:42:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "INT16_T"
    public final void mINT16_T() throws RecognitionException {
        try {
            int _type = INT16_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:43:9: ( 'int16_t' )
            // Mininess.g:43:11: 'int16_t'
            {
            match("int16_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT16_T"

    // $ANTLR start "INT32_T"
    public final void mINT32_T() throws RecognitionException {
        try {
            int _type = INT32_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:44:9: ( 'int32_t' )
            // Mininess.g:44:11: 'int32_t'
            {
            match("int32_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT32_T"

    // $ANTLR start "INT8_T"
    public final void mINT8_T() throws RecognitionException {
        try {
            int _type = INT8_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:45:8: ( 'int8_t' )
            // Mininess.g:45:10: 'int8_t'
            {
            match("int8_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT8_T"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:46:11: ( 'interface' )
            // Mininess.g:46:13: 'interface'
            {
            match("interface"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:47:8: ( '{' )
            // Mininess.g:47:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:48:10: ( '[' )
            // Mininess.g:48:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:49:6: ( '<' )
            // Mininess.g:49:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "LESSEQUAL"
    public final void mLESSEQUAL() throws RecognitionException {
        try {
            int _type = LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:50:11: ( '<=' )
            // Mininess.g:50:13: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSEQUAL"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:51:6: ( 'long' )
            // Mininess.g:51:8: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "LPARENS"
    public final void mLPARENS() throws RecognitionException {
        try {
            int _type = LPARENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:52:9: ( '(' )
            // Mininess.g:52:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPARENS"

    // $ANTLR start "LSHIFT"
    public final void mLSHIFT() throws RecognitionException {
        try {
            int _type = LSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:53:8: ( '<<' )
            // Mininess.g:53:10: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSHIFT"

    // $ANTLR start "LSHIFTASSIGN"
    public final void mLSHIFTASSIGN() throws RecognitionException {
        try {
            int _type = LSHIFTASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:54:14: ( '<<=' )
            // Mininess.g:54:16: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSHIFTASSIGN"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:55:7: ( '-' )
            // Mininess.g:55:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MINUSASSIGN"
    public final void mMINUSASSIGN() throws RecognitionException {
        try {
            int _type = MINUSASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:56:13: ( '-=' )
            // Mininess.g:56:15: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUSASSIGN"

    // $ANTLR start "MINUSMINUS"
    public final void mMINUSMINUS() throws RecognitionException {
        try {
            int _type = MINUSMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:57:12: ( '--' )
            // Mininess.g:57:14: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUSMINUS"

    // $ANTLR start "MODASSIGN"
    public final void mMODASSIGN() throws RecognitionException {
        try {
            int _type = MODASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:58:11: ( '%=' )
            // Mininess.g:58:13: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODASSIGN"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:59:8: ( 'module' )
            // Mininess.g:59:10: 'module'
            {
            match("module"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "MODULUS"
    public final void mMODULUS() throws RecognitionException {
        try {
            int _type = MODULUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:60:9: ( '%' )
            // Mininess.g:60:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODULUS"

    // $ANTLR start "MULASSIGN"
    public final void mMULASSIGN() throws RecognitionException {
        try {
            int _type = MULASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:61:11: ( '*=' )
            // Mininess.g:61:13: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULASSIGN"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:62:5: ( '!' )
            // Mininess.g:62:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:63:10: ( '!=' )
            // Mininess.g:63:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "NX_STRUCT"
    public final void mNX_STRUCT() throws RecognitionException {
        try {
            int _type = NX_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:64:11: ( 'nx_struct' )
            // Mininess.g:64:13: 'nx_struct'
            {
            match("nx_struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NX_STRUCT"

    // $ANTLR start "NX_UINT16_T"
    public final void mNX_UINT16_T() throws RecognitionException {
        try {
            int _type = NX_UINT16_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:65:13: ( 'nx_uint16_t' )
            // Mininess.g:65:15: 'nx_uint16_t'
            {
            match("nx_uint16_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NX_UINT16_T"

    // $ANTLR start "NX_UINT32_T"
    public final void mNX_UINT32_T() throws RecognitionException {
        try {
            int _type = NX_UINT32_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:66:13: ( 'nx_uint32_t' )
            // Mininess.g:66:15: 'nx_uint32_t'
            {
            match("nx_uint32_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NX_UINT32_T"

    // $ANTLR start "NX_UINT8_T"
    public final void mNX_UINT8_T() throws RecognitionException {
        try {
            int _type = NX_UINT8_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:67:12: ( 'nx_uint8_t' )
            // Mininess.g:67:14: 'nx_uint8_t'
            {
            match("nx_uint8_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NX_UINT8_T"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:68:4: ( '||' )
            // Mininess.g:68:6: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:69:6: ( '+' )
            // Mininess.g:69:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "PLUSASSIGN"
    public final void mPLUSASSIGN() throws RecognitionException {
        try {
            int _type = PLUSASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:70:12: ( '+=' )
            // Mininess.g:70:14: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUSASSIGN"

    // $ANTLR start "PLUSPLUS"
    public final void mPLUSPLUS() throws RecognitionException {
        try {
            int _type = PLUSPLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:71:10: ( '++' )
            // Mininess.g:71:12: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUSPLUS"

    // $ANTLR start "POST"
    public final void mPOST() throws RecognitionException {
        try {
            int _type = POST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:72:6: ( 'post' )
            // Mininess.g:72:8: 'post'
            {
            match("post"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POST"

    // $ANTLR start "PROVIDES"
    public final void mPROVIDES() throws RecognitionException {
        try {
            int _type = PROVIDES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:73:10: ( 'provides' )
            // Mininess.g:73:12: 'provides'
            {
            match("provides"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROVIDES"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:74:8: ( '}' )
            // Mininess.g:74:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:75:10: ( ']' )
            // Mininess.g:75:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:76:8: ( 'return' )
            // Mininess.g:76:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "RPARENS"
    public final void mRPARENS() throws RecognitionException {
        try {
            int _type = RPARENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:77:9: ( ')' )
            // Mininess.g:77:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPARENS"

    // $ANTLR start "RSHIFT"
    public final void mRSHIFT() throws RecognitionException {
        try {
            int _type = RSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:78:8: ( '>>' )
            // Mininess.g:78:10: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSHIFT"

    // $ANTLR start "RSHIFTASSIGN"
    public final void mRSHIFTASSIGN() throws RecognitionException {
        try {
            int _type = RSHIFTASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:79:14: ( '>>=' )
            // Mininess.g:79:16: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSHIFTASSIGN"

    // $ANTLR start "SHORT"
    public final void mSHORT() throws RecognitionException {
        try {
            int _type = SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:80:7: ( 'short' )
            // Mininess.g:80:9: 'short'
            {
            match("short"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHORT"

    // $ANTLR start "SIGNED"
    public final void mSIGNED() throws RecognitionException {
        try {
            int _type = SIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:81:8: ( 'signed' )
            // Mininess.g:81:10: 'signed'
            {
            match("signed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIGNED"

    // $ANTLR start "SIZEOF"
    public final void mSIZEOF() throws RecognitionException {
        try {
            int _type = SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:82:8: ( 'sizeof' )
            // Mininess.g:82:10: 'sizeof'
            {
            match("sizeof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIZEOF"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:83:6: ( '*' )
            // Mininess.g:83:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:84:8: ( 'struct' )
            // Mininess.g:84:10: 'struct'
            {
            match("struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRUCT"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:85:8: ( 'switch' )
            // Mininess.g:85:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "TASK"
    public final void mTASK() throws RecognitionException {
        try {
            int _type = TASK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:86:6: ( 'task' )
            // Mininess.g:86:8: 'task'
            {
            match("task"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TASK"

    // $ANTLR start "TYPEDEF"
    public final void mTYPEDEF() throws RecognitionException {
        try {
            int _type = TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:87:9: ( 'typedef' )
            // Mininess.g:87:11: 'typedef'
            {
            match("typedef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPEDEF"

    // $ANTLR start "UINT16_T"
    public final void mUINT16_T() throws RecognitionException {
        try {
            int _type = UINT16_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:88:10: ( 'uint16_t' )
            // Mininess.g:88:12: 'uint16_t'
            {
            match("uint16_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UINT16_T"

    // $ANTLR start "UINT32_T"
    public final void mUINT32_T() throws RecognitionException {
        try {
            int _type = UINT32_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:89:10: ( 'uint32_t' )
            // Mininess.g:89:12: 'uint32_t'
            {
            match("uint32_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UINT32_T"

    // $ANTLR start "UINT8_T"
    public final void mUINT8_T() throws RecognitionException {
        try {
            int _type = UINT8_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:90:9: ( 'uint8_t' )
            // Mininess.g:90:11: 'uint8_t'
            {
            match("uint8_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UINT8_T"

    // $ANTLR start "UNSIGNED"
    public final void mUNSIGNED() throws RecognitionException {
        try {
            int _type = UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:91:10: ( 'unsigned' )
            // Mininess.g:91:12: 'unsigned'
            {
            match("unsigned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNSIGNED"

    // $ANTLR start "USES"
    public final void mUSES() throws RecognitionException {
        try {
            int _type = USES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:92:6: ( 'uses' )
            // Mininess.g:92:8: 'uses'
            {
            match("uses"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USES"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:93:6: ( 'void' )
            // Mininess.g:93:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:94:7: ( 'while' )
            // Mininess.g:94:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:95:8: ( '...' )
            // Mininess.g:95:10: '...'
            {
            match("..."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:96:8: ( ':' )
            // Mininess.g:96:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:97:8: ( ';' )
            // Mininess.g:97:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:98:8: ( '?' )
            // Mininess.g:98:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "RAW_IDENTIFIER"
    public final void mRAW_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RAW_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:730:5: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // Mininess.g:730:10: ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Mininess.g:730:42: ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Mininess.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RAW_IDENTIFIER"

    // $ANTLR start "CONSTANT"
    public final void mCONSTANT() throws RecognitionException {
        try {
            int _type = CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:733:5: ( NUMBER )
            // Mininess.g:733:10: NUMBER
            {
            mNUMBER(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONSTANT"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:736:5: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // Mininess.g:736:10: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 

            // Mininess.g:736:14: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    alt2=2;
                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Mininess.g:736:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "CHARACTER_LITERAL"
    public final void mCHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:739:5: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
            // Mininess.g:739:10: '\\'' ( options {greedy=false; } : . )* '\\''
            {
            match('\''); 

            // Mininess.g:739:15: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    alt3=2;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Mininess.g:739:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARACTER_LITERAL"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:742:5: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+ )
            // Mininess.g:742:10: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
            {
            // Mininess.g:742:10: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Mininess.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "COMMENT1"
    public final void mCOMMENT1() throws RecognitionException {
        try {
            int _type = COMMENT1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:745:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // Mininess.g:745:10: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // Mininess.g:745:15: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Mininess.g:745:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match("*/"); 



            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT1"

    // $ANTLR start "COMMENT2"
    public final void mCOMMENT2() throws RecognitionException {
        try {
            int _type = COMMENT2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:748:5: ( '//' ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) )
            // Mininess.g:748:10: '//' ( options {greedy=false; } : . )* ( '\\r' | '\\n' )
            {
            match("//"); 



            // Mininess.g:748:15: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                    alt6=2;
                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Mininess.g:748:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT2"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            // Mininess.g:759:5: ( DEC_NUMBER | HEX_NUMBER )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='x') ) {
                    alt7=2;
                }
                else {
                    alt7=1;
                }
            }
            else if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
                alt7=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // Mininess.g:759:10: DEC_NUMBER
                    {
                    mDEC_NUMBER(); 


                    }
                    break;
                case 2 :
                    // Mininess.g:760:10: HEX_NUMBER
                    {
                    mHEX_NUMBER(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "DEC_NUMBER"
    public final void mDEC_NUMBER() throws RecognitionException {
        try {
            // Mininess.g:763:5: ( ( DIGIT )+ ( NUMBER_SUFFIX )? )
            // Mininess.g:763:10: ( DIGIT )+ ( NUMBER_SUFFIX )?
            {
            // Mininess.g:763:10: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Mininess.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            // Mininess.g:763:21: ( NUMBER_SUFFIX )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='L'||LA9_0=='U'||LA9_0=='l'||LA9_0=='u') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Mininess.g:763:23: NUMBER_SUFFIX
                    {
                    mNUMBER_SUFFIX(); 


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEC_NUMBER"

    // $ANTLR start "HEX_NUMBER"
    public final void mHEX_NUMBER() throws RecognitionException {
        try {
            // Mininess.g:766:5: ( NUMBER_PREFIX ( HEX_DIGIT )+ ( NUMBER_SUFFIX )? )
            // Mininess.g:766:10: NUMBER_PREFIX ( HEX_DIGIT )+ ( NUMBER_SUFFIX )?
            {
            mNUMBER_PREFIX(); 


            // Mininess.g:766:24: ( HEX_DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'F')||(LA10_0 >= 'a' && LA10_0 <= 'f')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Mininess.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            // Mininess.g:766:39: ( NUMBER_SUFFIX )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='L'||LA11_0=='U'||LA11_0=='l'||LA11_0=='u') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Mininess.g:766:41: NUMBER_SUFFIX
                    {
                    mNUMBER_SUFFIX(); 


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Mininess.g:769:5: ( '0' .. '9' )
            // Mininess.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // Mininess.g:772:5: ( '0' .. '9' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )
            // Mininess.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "NUMBER_PREFIX"
    public final void mNUMBER_PREFIX() throws RecognitionException {
        try {
            // Mininess.g:775:5: ( '0x' )
            // Mininess.g:775:10: '0x'
            {
            match("0x"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER_PREFIX"

    // $ANTLR start "NUMBER_SUFFIX"
    public final void mNUMBER_SUFFIX() throws RecognitionException {
        try {
            // Mininess.g:778:5: ( ( 'l' | 'L' | 'u' | 'U' | 'lu' | 'ul' | 'LU' | 'UL' ) )
            // Mininess.g:778:10: ( 'l' | 'L' | 'u' | 'U' | 'lu' | 'ul' | 'LU' | 'UL' )
            {
            // Mininess.g:778:10: ( 'l' | 'L' | 'u' | 'U' | 'lu' | 'ul' | 'LU' | 'UL' )
            int alt12=8;
            switch ( input.LA(1) ) {
            case 'l':
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='u') ) {
                    alt12=5;
                }
                else {
                    alt12=1;
                }
                }
                break;
            case 'L':
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2=='U') ) {
                    alt12=7;
                }
                else {
                    alt12=2;
                }
                }
                break;
            case 'u':
                {
                int LA12_3 = input.LA(2);

                if ( (LA12_3=='l') ) {
                    alt12=6;
                }
                else {
                    alt12=3;
                }
                }
                break;
            case 'U':
                {
                int LA12_4 = input.LA(2);

                if ( (LA12_4=='L') ) {
                    alt12=8;
                }
                else {
                    alt12=4;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // Mininess.g:778:11: 'l'
                    {
                    match('l'); 

                    }
                    break;
                case 2 :
                    // Mininess.g:778:17: 'L'
                    {
                    match('L'); 

                    }
                    break;
                case 3 :
                    // Mininess.g:778:23: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 4 :
                    // Mininess.g:778:29: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 5 :
                    // Mininess.g:778:35: 'lu'
                    {
                    match("lu"); 



                    }
                    break;
                case 6 :
                    // Mininess.g:778:42: 'ul'
                    {
                    match("ul"); 



                    }
                    break;
                case 7 :
                    // Mininess.g:778:49: 'LU'
                    {
                    match("LU"); 



                    }
                    break;
                case 8 :
                    // Mininess.g:778:56: 'UL'
                    {
                    match("UL"); 



                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER_SUFFIX"

    public void mTokens() throws RecognitionException {
        // Mininess.g:1:8: ( AMP | AND | ARRAYINC | ARROW | ASSIGN | BITANDASSIGN | BITCOMPLEMENT | BITOR | BITORASSIGN | BITXOR | BITXORASSIGN | CALL | CASE | CHAR | COMMA | COMMAND | CONST | DEFAULT | DIVASSIGN | DIVIDE | DOT | ELSE | ENUM | EQUAL | ERROR_T | EVENT | FOR | GREATER | GREATEREQUAL | HASH | IF | IMPLEMENTATION | INT | INT16_T | INT32_T | INT8_T | INTERFACE | LBRACE | LBRACKET | LESS | LESSEQUAL | LONG | LPARENS | LSHIFT | LSHIFTASSIGN | MINUS | MINUSASSIGN | MINUSMINUS | MODASSIGN | MODULE | MODULUS | MULASSIGN | NOT | NOTEQUAL | NX_STRUCT | NX_UINT16_T | NX_UINT32_T | NX_UINT8_T | OR | PLUS | PLUSASSIGN | PLUSPLUS | POST | PROVIDES | RBRACE | RBRACKET | RETURN | RPARENS | RSHIFT | RSHIFTASSIGN | SHORT | SIGNED | SIZEOF | STAR | STRUCT | SWITCH | TASK | TYPEDEF | UINT16_T | UINT32_T | UINT8_T | UNSIGNED | USES | VOID | WHILE | T__139 | T__140 | T__141 | T__142 | RAW_IDENTIFIER | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | WHITESPACE | COMMENT1 | COMMENT2 )
        int alt13=96;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // Mininess.g:1:10: AMP
                {
                mAMP(); 


                }
                break;
            case 2 :
                // Mininess.g:1:14: AND
                {
                mAND(); 


                }
                break;
            case 3 :
                // Mininess.g:1:18: ARRAYINC
                {
                mARRAYINC(); 


                }
                break;
            case 4 :
                // Mininess.g:1:27: ARROW
                {
                mARROW(); 


                }
                break;
            case 5 :
                // Mininess.g:1:33: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 6 :
                // Mininess.g:1:40: BITANDASSIGN
                {
                mBITANDASSIGN(); 


                }
                break;
            case 7 :
                // Mininess.g:1:53: BITCOMPLEMENT
                {
                mBITCOMPLEMENT(); 


                }
                break;
            case 8 :
                // Mininess.g:1:67: BITOR
                {
                mBITOR(); 


                }
                break;
            case 9 :
                // Mininess.g:1:73: BITORASSIGN
                {
                mBITORASSIGN(); 


                }
                break;
            case 10 :
                // Mininess.g:1:85: BITXOR
                {
                mBITXOR(); 


                }
                break;
            case 11 :
                // Mininess.g:1:92: BITXORASSIGN
                {
                mBITXORASSIGN(); 


                }
                break;
            case 12 :
                // Mininess.g:1:105: CALL
                {
                mCALL(); 


                }
                break;
            case 13 :
                // Mininess.g:1:110: CASE
                {
                mCASE(); 


                }
                break;
            case 14 :
                // Mininess.g:1:115: CHAR
                {
                mCHAR(); 


                }
                break;
            case 15 :
                // Mininess.g:1:120: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 16 :
                // Mininess.g:1:126: COMMAND
                {
                mCOMMAND(); 


                }
                break;
            case 17 :
                // Mininess.g:1:134: CONST
                {
                mCONST(); 


                }
                break;
            case 18 :
                // Mininess.g:1:140: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 19 :
                // Mininess.g:1:148: DIVASSIGN
                {
                mDIVASSIGN(); 


                }
                break;
            case 20 :
                // Mininess.g:1:158: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 21 :
                // Mininess.g:1:165: DOT
                {
                mDOT(); 


                }
                break;
            case 22 :
                // Mininess.g:1:169: ELSE
                {
                mELSE(); 


                }
                break;
            case 23 :
                // Mininess.g:1:174: ENUM
                {
                mENUM(); 


                }
                break;
            case 24 :
                // Mininess.g:1:179: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 25 :
                // Mininess.g:1:185: ERROR_T
                {
                mERROR_T(); 


                }
                break;
            case 26 :
                // Mininess.g:1:193: EVENT
                {
                mEVENT(); 


                }
                break;
            case 27 :
                // Mininess.g:1:199: FOR
                {
                mFOR(); 


                }
                break;
            case 28 :
                // Mininess.g:1:203: GREATER
                {
                mGREATER(); 


                }
                break;
            case 29 :
                // Mininess.g:1:211: GREATEREQUAL
                {
                mGREATEREQUAL(); 


                }
                break;
            case 30 :
                // Mininess.g:1:224: HASH
                {
                mHASH(); 


                }
                break;
            case 31 :
                // Mininess.g:1:229: IF
                {
                mIF(); 


                }
                break;
            case 32 :
                // Mininess.g:1:232: IMPLEMENTATION
                {
                mIMPLEMENTATION(); 


                }
                break;
            case 33 :
                // Mininess.g:1:247: INT
                {
                mINT(); 


                }
                break;
            case 34 :
                // Mininess.g:1:251: INT16_T
                {
                mINT16_T(); 


                }
                break;
            case 35 :
                // Mininess.g:1:259: INT32_T
                {
                mINT32_T(); 


                }
                break;
            case 36 :
                // Mininess.g:1:267: INT8_T
                {
                mINT8_T(); 


                }
                break;
            case 37 :
                // Mininess.g:1:274: INTERFACE
                {
                mINTERFACE(); 


                }
                break;
            case 38 :
                // Mininess.g:1:284: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 39 :
                // Mininess.g:1:291: LBRACKET
                {
                mLBRACKET(); 


                }
                break;
            case 40 :
                // Mininess.g:1:300: LESS
                {
                mLESS(); 


                }
                break;
            case 41 :
                // Mininess.g:1:305: LESSEQUAL
                {
                mLESSEQUAL(); 


                }
                break;
            case 42 :
                // Mininess.g:1:315: LONG
                {
                mLONG(); 


                }
                break;
            case 43 :
                // Mininess.g:1:320: LPARENS
                {
                mLPARENS(); 


                }
                break;
            case 44 :
                // Mininess.g:1:328: LSHIFT
                {
                mLSHIFT(); 


                }
                break;
            case 45 :
                // Mininess.g:1:335: LSHIFTASSIGN
                {
                mLSHIFTASSIGN(); 


                }
                break;
            case 46 :
                // Mininess.g:1:348: MINUS
                {
                mMINUS(); 


                }
                break;
            case 47 :
                // Mininess.g:1:354: MINUSASSIGN
                {
                mMINUSASSIGN(); 


                }
                break;
            case 48 :
                // Mininess.g:1:366: MINUSMINUS
                {
                mMINUSMINUS(); 


                }
                break;
            case 49 :
                // Mininess.g:1:377: MODASSIGN
                {
                mMODASSIGN(); 


                }
                break;
            case 50 :
                // Mininess.g:1:387: MODULE
                {
                mMODULE(); 


                }
                break;
            case 51 :
                // Mininess.g:1:394: MODULUS
                {
                mMODULUS(); 


                }
                break;
            case 52 :
                // Mininess.g:1:402: MULASSIGN
                {
                mMULASSIGN(); 


                }
                break;
            case 53 :
                // Mininess.g:1:412: NOT
                {
                mNOT(); 


                }
                break;
            case 54 :
                // Mininess.g:1:416: NOTEQUAL
                {
                mNOTEQUAL(); 


                }
                break;
            case 55 :
                // Mininess.g:1:425: NX_STRUCT
                {
                mNX_STRUCT(); 


                }
                break;
            case 56 :
                // Mininess.g:1:435: NX_UINT16_T
                {
                mNX_UINT16_T(); 


                }
                break;
            case 57 :
                // Mininess.g:1:447: NX_UINT32_T
                {
                mNX_UINT32_T(); 


                }
                break;
            case 58 :
                // Mininess.g:1:459: NX_UINT8_T
                {
                mNX_UINT8_T(); 


                }
                break;
            case 59 :
                // Mininess.g:1:470: OR
                {
                mOR(); 


                }
                break;
            case 60 :
                // Mininess.g:1:473: PLUS
                {
                mPLUS(); 


                }
                break;
            case 61 :
                // Mininess.g:1:478: PLUSASSIGN
                {
                mPLUSASSIGN(); 


                }
                break;
            case 62 :
                // Mininess.g:1:489: PLUSPLUS
                {
                mPLUSPLUS(); 


                }
                break;
            case 63 :
                // Mininess.g:1:498: POST
                {
                mPOST(); 


                }
                break;
            case 64 :
                // Mininess.g:1:503: PROVIDES
                {
                mPROVIDES(); 


                }
                break;
            case 65 :
                // Mininess.g:1:512: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 66 :
                // Mininess.g:1:519: RBRACKET
                {
                mRBRACKET(); 


                }
                break;
            case 67 :
                // Mininess.g:1:528: RETURN
                {
                mRETURN(); 


                }
                break;
            case 68 :
                // Mininess.g:1:535: RPARENS
                {
                mRPARENS(); 


                }
                break;
            case 69 :
                // Mininess.g:1:543: RSHIFT
                {
                mRSHIFT(); 


                }
                break;
            case 70 :
                // Mininess.g:1:550: RSHIFTASSIGN
                {
                mRSHIFTASSIGN(); 


                }
                break;
            case 71 :
                // Mininess.g:1:563: SHORT
                {
                mSHORT(); 


                }
                break;
            case 72 :
                // Mininess.g:1:569: SIGNED
                {
                mSIGNED(); 


                }
                break;
            case 73 :
                // Mininess.g:1:576: SIZEOF
                {
                mSIZEOF(); 


                }
                break;
            case 74 :
                // Mininess.g:1:583: STAR
                {
                mSTAR(); 


                }
                break;
            case 75 :
                // Mininess.g:1:588: STRUCT
                {
                mSTRUCT(); 


                }
                break;
            case 76 :
                // Mininess.g:1:595: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 77 :
                // Mininess.g:1:602: TASK
                {
                mTASK(); 


                }
                break;
            case 78 :
                // Mininess.g:1:607: TYPEDEF
                {
                mTYPEDEF(); 


                }
                break;
            case 79 :
                // Mininess.g:1:615: UINT16_T
                {
                mUINT16_T(); 


                }
                break;
            case 80 :
                // Mininess.g:1:624: UINT32_T
                {
                mUINT32_T(); 


                }
                break;
            case 81 :
                // Mininess.g:1:633: UINT8_T
                {
                mUINT8_T(); 


                }
                break;
            case 82 :
                // Mininess.g:1:641: UNSIGNED
                {
                mUNSIGNED(); 


                }
                break;
            case 83 :
                // Mininess.g:1:650: USES
                {
                mUSES(); 


                }
                break;
            case 84 :
                // Mininess.g:1:655: VOID
                {
                mVOID(); 


                }
                break;
            case 85 :
                // Mininess.g:1:660: WHILE
                {
                mWHILE(); 


                }
                break;
            case 86 :
                // Mininess.g:1:666: T__139
                {
                mT__139(); 


                }
                break;
            case 87 :
                // Mininess.g:1:673: T__140
                {
                mT__140(); 


                }
                break;
            case 88 :
                // Mininess.g:1:680: T__141
                {
                mT__141(); 


                }
                break;
            case 89 :
                // Mininess.g:1:687: T__142
                {
                mT__142(); 


                }
                break;
            case 90 :
                // Mininess.g:1:694: RAW_IDENTIFIER
                {
                mRAW_IDENTIFIER(); 


                }
                break;
            case 91 :
                // Mininess.g:1:709: CONSTANT
                {
                mCONSTANT(); 


                }
                break;
            case 92 :
                // Mininess.g:1:718: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 93 :
                // Mininess.g:1:733: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 


                }
                break;
            case 94 :
                // Mininess.g:1:751: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 95 :
                // Mininess.g:1:762: COMMENT1
                {
                mCOMMENT1(); 


                }
                break;
            case 96 :
                // Mininess.g:1:771: COMMENT2
                {
                mCOMMENT2(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\60\1\64\1\70\1\72\1\uffff\1\74\1\51\1\uffff\1\51\1\104"+
        "\1\106\2\51\1\116\1\uffff\1\51\2\uffff\1\124\1\51\1\uffff\1\127"+
        "\1\51\1\132\1\134\1\51\1\140\1\51\2\uffff\1\51\1\uffff\5\51\27\uffff"+
        "\4\51\6\uffff\5\51\1\uffff\1\173\1\uffff\1\174\2\51\1\uffff\1\u0080"+
        "\1\uffff\1\51\2\uffff\1\51\4\uffff\1\51\3\uffff\30\51\1\u009d\3"+
        "\uffff\1\51\1\u00a3\2\uffff\22\51\1\u00b7\1\u00b8\1\u00b9\3\51\1"+
        "\u00bd\1\u00be\2\51\1\uffff\5\51\1\uffff\1\u00c6\3\51\1\u00ca\7"+
        "\51\1\u00d2\3\51\1\u00d8\1\u00d9\1\51\3\uffff\1\51\1\u00dc\1\51"+
        "\2\uffff\1\51\1\u00df\5\51\1\uffff\3\51\1\uffff\2\51\1\u00ea\4\51"+
        "\1\uffff\5\51\2\uffff\1\u00f4\1\51\1\uffff\2\51\1\uffff\3\51\1\u00fb"+
        "\1\51\1\u00fd\3\51\1\u0101\1\uffff\1\u0102\1\u0103\1\u0104\1\u0105"+
        "\5\51\1\uffff\1\u010b\1\u010c\1\u010d\1\51\1\u010f\1\u0110\1\uffff"+
        "\1\51\1\uffff\3\51\5\uffff\1\u0117\2\51\1\u011a\1\51\3\uffff\1\51"+
        "\2\uffff\5\51\1\u0122\1\uffff\1\u0123\1\u0124\1\uffff\1\u0125\1"+
        "\51\1\u0127\1\u0128\3\51\4\uffff\1\51\2\uffff\2\51\1\u012f\1\51"+
        "\1\u0131\1\u0132\1\uffff\1\51\2\uffff\1\51\1\u0135\1\uffff";
    static final String DFA13_eofS =
        "\u0136\uffff";
    static final String DFA13_minS =
        "\1\11\1\46\1\75\1\55\1\75\1\uffff\1\75\1\141\1\uffff\1\145\1\52"+
        "\1\56\1\154\1\157\1\75\1\uffff\1\146\2\uffff\1\74\1\157\1\uffff"+
        "\1\75\1\157\2\75\1\170\1\53\1\157\2\uffff\1\145\1\uffff\1\150\1"+
        "\141\1\151\1\157\1\150\27\uffff\1\154\1\141\1\155\1\146\6\uffff"+
        "\1\163\1\165\1\162\1\145\1\162\1\uffff\1\75\1\uffff\1\60\1\160\1"+
        "\164\1\uffff\1\75\1\uffff\1\156\2\uffff\1\144\4\uffff\1\137\3\uffff"+
        "\1\163\1\157\1\164\1\157\1\147\1\162\1\151\1\163\1\160\1\156\1\163"+
        "\1\145\2\151\1\154\1\145\1\162\1\155\1\163\1\141\1\145\1\155\1\157"+
        "\1\156\1\60\3\uffff\1\154\1\60\2\uffff\1\147\1\165\1\163\1\164\1"+
        "\166\1\165\1\162\1\156\1\145\1\165\1\164\1\153\1\145\1\164\1\151"+
        "\1\163\1\144\1\154\3\60\1\141\1\164\1\165\2\60\1\162\1\164\1\uffff"+
        "\1\145\1\66\1\62\1\137\1\162\1\uffff\1\60\1\154\1\164\1\151\1\60"+
        "\1\151\1\162\1\164\1\145\1\157\2\143\1\60\1\144\1\61\1\147\2\60"+
        "\1\145\3\uffff\1\156\1\60\1\154\2\uffff\1\137\1\60\1\155\2\137\1"+
        "\164\1\146\1\uffff\1\145\1\162\1\156\1\uffff\1\144\1\156\1\60\1"+
        "\144\1\146\1\164\1\150\1\uffff\1\145\1\66\1\62\1\137\1\156\2\uffff"+
        "\1\60\1\144\1\uffff\2\164\1\uffff\1\145\2\164\1\60\1\141\1\60\1"+
        "\165\1\164\1\145\1\60\1\uffff\4\60\1\146\2\137\1\164\1\145\1\uffff"+
        "\3\60\1\156\2\60\1\uffff\1\143\1\uffff\1\143\1\61\1\163\5\uffff"+
        "\1\60\2\164\1\60\1\144\3\uffff\1\164\2\uffff\1\145\1\164\1\66\1"+
        "\62\1\137\1\60\1\uffff\2\60\1\uffff\1\60\1\141\2\60\2\137\1\164"+
        "\4\uffff\1\164\2\uffff\2\164\1\60\1\151\2\60\1\uffff\1\157\2\uffff"+
        "\1\156\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\176\1\75\1\174\1\76\1\75\1\uffff\1\75\1\157\1\uffff\1\145\1\75"+
        "\1\56\1\166\1\157\1\76\1\uffff\1\156\2\uffff\1\75\1\157\1\uffff"+
        "\1\75\1\157\2\75\1\170\1\75\1\162\2\uffff\1\145\1\uffff\1\167\1"+
        "\171\1\163\1\157\1\150\27\uffff\1\163\1\141\1\156\1\146\6\uffff"+
        "\1\163\1\165\1\162\1\145\1\162\1\uffff\1\75\1\uffff\1\172\1\160"+
        "\1\164\1\uffff\1\75\1\uffff\1\156\2\uffff\1\144\4\uffff\1\137\3"+
        "\uffff\1\163\1\157\1\164\1\157\1\172\1\162\1\151\1\163\1\160\1\156"+
        "\1\163\1\145\2\151\1\154\1\145\1\162\1\155\1\163\1\141\1\145\1\155"+
        "\1\157\1\156\1\172\3\uffff\1\154\1\172\2\uffff\1\147\2\165\1\164"+
        "\1\166\1\165\1\162\1\156\1\145\1\165\1\164\1\153\1\145\1\164\1\151"+
        "\1\163\1\144\1\154\3\172\1\141\1\164\1\165\2\172\1\162\1\164\1\uffff"+
        "\1\145\1\66\1\62\1\137\1\162\1\uffff\1\172\1\154\1\164\1\151\1\172"+
        "\1\151\1\162\1\164\1\145\1\157\2\143\1\172\1\144\1\70\1\147\2\172"+
        "\1\145\3\uffff\1\156\1\172\1\154\2\uffff\1\137\1\172\1\155\2\137"+
        "\1\164\1\146\1\uffff\1\145\1\162\1\156\1\uffff\1\144\1\156\1\172"+
        "\1\144\1\146\1\164\1\150\1\uffff\1\145\1\66\1\62\1\137\1\156\2\uffff"+
        "\1\172\1\144\1\uffff\2\164\1\uffff\1\145\2\164\1\172\1\141\1\172"+
        "\1\165\1\164\1\145\1\172\1\uffff\4\172\1\146\2\137\1\164\1\145\1"+
        "\uffff\3\172\1\156\2\172\1\uffff\1\143\1\uffff\1\143\1\70\1\163"+
        "\5\uffff\1\172\2\164\1\172\1\144\3\uffff\1\164\2\uffff\1\145\1\164"+
        "\1\66\1\62\1\137\1\172\1\uffff\2\172\1\uffff\1\172\1\141\2\172\2"+
        "\137\1\164\4\uffff\1\164\2\uffff\2\164\1\172\1\151\2\172\1\uffff"+
        "\1\157\2\uffff\1\156\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\7\2\uffff\1\17\6\uffff\1\36\1\uffff\1\46\1\47\2\uffff"+
        "\1\53\7\uffff\1\101\1\102\1\uffff\1\104\5\uffff\1\127\1\130\1\131"+
        "\1\132\1\133\1\134\1\135\1\136\1\2\1\6\1\1\1\3\1\11\1\73\1\10\1"+
        "\4\1\57\1\60\1\56\1\30\1\5\1\13\1\12\4\uffff\1\23\1\137\1\140\1"+
        "\24\1\126\1\25\5\uffff\1\35\1\uffff\1\34\3\uffff\1\51\1\uffff\1"+
        "\50\1\uffff\1\61\1\63\1\uffff\1\64\1\112\1\66\1\65\1\uffff\1\75"+
        "\1\76\1\74\31\uffff\1\106\1\105\1\37\2\uffff\1\55\1\54\34\uffff"+
        "\1\33\5\uffff\1\41\23\uffff\1\14\1\15\1\16\3\uffff\1\26\1\27\7\uffff"+
        "\1\52\3\uffff\1\77\7\uffff\1\115\5\uffff\1\123\1\124\2\uffff\1\21"+
        "\2\uffff\1\32\12\uffff\1\107\11\uffff\1\125\6\uffff\1\44\1\uffff"+
        "\1\62\3\uffff\1\103\1\110\1\111\1\113\1\114\5\uffff\1\20\1\22\1"+
        "\31\1\uffff\1\42\1\43\6\uffff\1\116\2\uffff\1\121\7\uffff\1\100"+
        "\1\117\1\120\1\122\1\uffff\1\45\1\67\6\uffff\1\72\1\uffff\1\70\1"+
        "\71\2\uffff\1\40";
    static final String DFA13_specialS =
        "\u0136\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\55\1\uffff\2\55\22\uffff\1\55\1\31\1\53\1\17\1\uffff\1\26"+
            "\1\1\1\54\1\25\1\40\1\30\1\33\1\10\1\3\1\13\1\12\12\52\1\46"+
            "\1\47\1\23\1\4\1\16\1\50\1\uffff\32\51\1\22\1\uffff\1\36\1\6"+
            "\1\51\1\uffff\2\51\1\7\1\11\1\14\1\15\2\51\1\20\2\51\1\24\1"+
            "\27\1\32\1\51\1\34\1\51\1\37\1\41\1\42\1\43\1\44\1\45\3\51\1"+
            "\21\1\2\1\35\1\5",
            "\1\56\26\uffff\1\57",
            "\1\62\1\61\75\uffff\1\63",
            "\1\67\17\uffff\1\66\1\65",
            "\1\71",
            "",
            "\1\73",
            "\1\75\6\uffff\1\76\6\uffff\1\77",
            "",
            "\1\100",
            "\1\102\4\uffff\1\103\15\uffff\1\101",
            "\1\105",
            "\1\107\1\uffff\1\110\3\uffff\1\111\3\uffff\1\112",
            "\1\113",
            "\1\114\1\115",
            "",
            "\1\117\6\uffff\1\120\1\121",
            "",
            "",
            "\1\123\1\122",
            "\1\125",
            "",
            "\1\126",
            "\1\130",
            "\1\131",
            "\1\133",
            "\1\135",
            "\1\137\21\uffff\1\136",
            "\1\141\2\uffff\1\142",
            "",
            "",
            "\1\143",
            "",
            "\1\144\1\145\12\uffff\1\146\2\uffff\1\147",
            "\1\150\27\uffff\1\151",
            "\1\152\4\uffff\1\153\4\uffff\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157\6\uffff\1\160",
            "\1\161",
            "\1\162\1\163",
            "\1\164",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "",
            "",
            "",
            "",
            "\1\u0083",
            "",
            "",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\22\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u009e",
            "\1\51\1\u009f\1\51\1\u00a0\4\51\1\u00a1\1\51\7\uffff\32\51"+
            "\4\uffff\1\51\1\uffff\4\51\1\u00a2\25\51",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\1\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d3",
            "\1\u00d4\1\uffff\1\u00d5\4\uffff\1\u00d6",
            "\1\u00d7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00da",
            "",
            "",
            "",
            "\1\u00db",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00dd",
            "",
            "",
            "\1\u00de",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00fc",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u010e",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113\1\uffff\1\u0114\4\uffff\1\u0115",
            "\1\u0116",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0118",
            "\1\u0119",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u011b",
            "",
            "",
            "",
            "\1\u011c",
            "",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0126",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "",
            "",
            "",
            "\1\u012c",
            "",
            "",
            "\1\u012d",
            "\1\u012e",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0130",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0133",
            "",
            "",
            "\1\u0134",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AMP | AND | ARRAYINC | ARROW | ASSIGN | BITANDASSIGN | BITCOMPLEMENT | BITOR | BITORASSIGN | BITXOR | BITXORASSIGN | CALL | CASE | CHAR | COMMA | COMMAND | CONST | DEFAULT | DIVASSIGN | DIVIDE | DOT | ELSE | ENUM | EQUAL | ERROR_T | EVENT | FOR | GREATER | GREATEREQUAL | HASH | IF | IMPLEMENTATION | INT | INT16_T | INT32_T | INT8_T | INTERFACE | LBRACE | LBRACKET | LESS | LESSEQUAL | LONG | LPARENS | LSHIFT | LSHIFTASSIGN | MINUS | MINUSASSIGN | MINUSMINUS | MODASSIGN | MODULE | MODULUS | MULASSIGN | NOT | NOTEQUAL | NX_STRUCT | NX_UINT16_T | NX_UINT32_T | NX_UINT8_T | OR | PLUS | PLUSASSIGN | PLUSPLUS | POST | PROVIDES | RBRACE | RBRACKET | RETURN | RPARENS | RSHIFT | RSHIFTASSIGN | SHORT | SIGNED | SIZEOF | STAR | STRUCT | SWITCH | TASK | TYPEDEF | UINT16_T | UINT32_T | UINT8_T | UNSIGNED | USES | VOID | WHILE | T__139 | T__140 | T__141 | T__142 | RAW_IDENTIFIER | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | WHITESPACE | COMMENT1 | COMMENT2 );";
        }
    }
 

}