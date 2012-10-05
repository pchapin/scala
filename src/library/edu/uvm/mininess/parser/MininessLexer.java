// $ANTLR 3.4 Mininess.g 2012-10-02 09:31:30

    package edu.uvm.mininess.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MininessLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__136=136;
    public static final int T__137=137;
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
    public static final int OR=90;
    public static final int PARAMETER=91;
    public static final int PARAMETER_LIST=92;
    public static final int PLUS=93;
    public static final int PLUSASSIGN=94;
    public static final int PLUSPLUS=95;
    public static final int POINTER_QUALIFIER=96;
    public static final int POST=97;
    public static final int POSTFIX_EXPRESSION=98;
    public static final int POST_DECREMENT=99;
    public static final int POST_INCREMENT=100;
    public static final int PRE_DECREMENT=101;
    public static final int PRE_INCREMENT=102;
    public static final int PROVIDES=103;
    public static final int RAW_IDENTIFIER=104;
    public static final int RBRACE=105;
    public static final int RBRACKET=106;
    public static final int RETURN=107;
    public static final int RPARENS=108;
    public static final int RSHIFT=109;
    public static final int RSHIFTASSIGN=110;
    public static final int SHORT=111;
    public static final int SIGNED=112;
    public static final int SIZEOF=113;
    public static final int SIZEOF_EXPRESSION=114;
    public static final int SIZEOF_TYPE=115;
    public static final int SPECIFICATION=116;
    public static final int STAR=117;
    public static final int STATEMENT=118;
    public static final int STRING_LITERAL=119;
    public static final int STRUCT=120;
    public static final int SWITCH=121;
    public static final int TASK=122;
    public static final int TYPEDEF=123;
    public static final int UINT16_T=124;
    public static final int UINT32_T=125;
    public static final int UINT8_T=126;
    public static final int UNARY_MINUS=127;
    public static final int UNARY_PLUS=128;
    public static final int UNSIGNED=129;
    public static final int USES=130;
    public static final int VOID=131;
    public static final int WHILE=132;
    public static final int WHITESPACE=133;

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

    // $ANTLR start "EVENT"
    public final void mEVENT() throws RecognitionException {
        try {
            int _type = EVENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:34:7: ( 'event' )
            // Mininess.g:34:9: 'event'
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
            // Mininess.g:35:5: ( 'for' )
            // Mininess.g:35:7: 'for'
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
            // Mininess.g:36:9: ( '>' )
            // Mininess.g:36:11: '>'
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
            // Mininess.g:37:14: ( '>=' )
            // Mininess.g:37:16: '>='
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
            // Mininess.g:38:6: ( '#' )
            // Mininess.g:38:8: '#'
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
            // Mininess.g:39:4: ( 'if' )
            // Mininess.g:39:6: 'if'
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
            // Mininess.g:40:16: ( 'implementation' )
            // Mininess.g:40:18: 'implementation'
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
            // Mininess.g:41:5: ( 'int' )
            // Mininess.g:41:7: 'int'
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
            // Mininess.g:42:9: ( 'int16_t' )
            // Mininess.g:42:11: 'int16_t'
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
            // Mininess.g:43:9: ( 'int32_t' )
            // Mininess.g:43:11: 'int32_t'
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
            // Mininess.g:44:8: ( 'int8_t' )
            // Mininess.g:44:10: 'int8_t'
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
            // Mininess.g:45:11: ( 'interface' )
            // Mininess.g:45:13: 'interface'
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
            // Mininess.g:46:8: ( '{' )
            // Mininess.g:46:10: '{'
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
            // Mininess.g:47:10: ( '[' )
            // Mininess.g:47:12: '['
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
            // Mininess.g:48:6: ( '<' )
            // Mininess.g:48:8: '<'
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
            // Mininess.g:49:11: ( '<=' )
            // Mininess.g:49:13: '<='
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
            // Mininess.g:50:6: ( 'long' )
            // Mininess.g:50:8: 'long'
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
            // Mininess.g:51:9: ( '(' )
            // Mininess.g:51:11: '('
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
            // Mininess.g:52:8: ( '<<' )
            // Mininess.g:52:10: '<<'
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
            // Mininess.g:53:14: ( '<<=' )
            // Mininess.g:53:16: '<<='
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
            // Mininess.g:54:7: ( '-' )
            // Mininess.g:54:9: '-'
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
            // Mininess.g:55:13: ( '-=' )
            // Mininess.g:55:15: '-='
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
            // Mininess.g:56:12: ( '--' )
            // Mininess.g:56:14: '--'
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
            // Mininess.g:57:11: ( '%=' )
            // Mininess.g:57:13: '%='
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
            // Mininess.g:58:8: ( 'module' )
            // Mininess.g:58:10: 'module'
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
            // Mininess.g:59:9: ( '%' )
            // Mininess.g:59:11: '%'
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
            // Mininess.g:60:11: ( '*=' )
            // Mininess.g:60:13: '*='
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
            // Mininess.g:61:5: ( '!' )
            // Mininess.g:61:7: '!'
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
            // Mininess.g:62:10: ( '!=' )
            // Mininess.g:62:12: '!='
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

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:63:4: ( '||' )
            // Mininess.g:63:6: '||'
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
            // Mininess.g:64:6: ( '+' )
            // Mininess.g:64:8: '+'
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
            // Mininess.g:65:12: ( '+=' )
            // Mininess.g:65:14: '+='
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
            // Mininess.g:66:10: ( '++' )
            // Mininess.g:66:12: '++'
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
            // Mininess.g:67:6: ( 'post' )
            // Mininess.g:67:8: 'post'
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
            // Mininess.g:68:10: ( 'provides' )
            // Mininess.g:68:12: 'provides'
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
            // Mininess.g:69:8: ( '}' )
            // Mininess.g:69:10: '}'
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
            // Mininess.g:70:10: ( ']' )
            // Mininess.g:70:12: ']'
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
            // Mininess.g:71:8: ( 'return' )
            // Mininess.g:71:10: 'return'
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
            // Mininess.g:72:9: ( ')' )
            // Mininess.g:72:11: ')'
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
            // Mininess.g:73:8: ( '>>' )
            // Mininess.g:73:10: '>>'
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
            // Mininess.g:74:14: ( '>>=' )
            // Mininess.g:74:16: '>>='
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
            // Mininess.g:75:7: ( 'short' )
            // Mininess.g:75:9: 'short'
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
            // Mininess.g:76:8: ( 'signed' )
            // Mininess.g:76:10: 'signed'
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
            // Mininess.g:77:8: ( 'sizeof' )
            // Mininess.g:77:10: 'sizeof'
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
            // Mininess.g:78:6: ( '*' )
            // Mininess.g:78:8: '*'
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
            // Mininess.g:79:8: ( 'struct' )
            // Mininess.g:79:10: 'struct'
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
            // Mininess.g:80:8: ( 'switch' )
            // Mininess.g:80:10: 'switch'
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
            // Mininess.g:81:6: ( 'task' )
            // Mininess.g:81:8: 'task'
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
            // Mininess.g:82:9: ( 'typedef' )
            // Mininess.g:82:11: 'typedef'
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
            // Mininess.g:83:10: ( 'uint16_t' )
            // Mininess.g:83:12: 'uint16_t'
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
            // Mininess.g:84:10: ( 'uint32_t' )
            // Mininess.g:84:12: 'uint32_t'
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
            // Mininess.g:85:9: ( 'uint8_t' )
            // Mininess.g:85:11: 'uint8_t'
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
            // Mininess.g:86:10: ( 'unsigned' )
            // Mininess.g:86:12: 'unsigned'
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
            // Mininess.g:87:6: ( 'uses' )
            // Mininess.g:87:8: 'uses'
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
            // Mininess.g:88:6: ( 'void' )
            // Mininess.g:88:8: 'void'
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
            // Mininess.g:89:7: ( 'while' )
            // Mininess.g:89:9: 'while'
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

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:90:8: ( '...' )
            // Mininess.g:90:10: '...'
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
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:91:8: ( ':' )
            // Mininess.g:91:10: ':'
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
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:92:8: ( ';' )
            // Mininess.g:92:10: ';'
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
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:93:8: ( '?' )
            // Mininess.g:93:10: '?'
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
    // $ANTLR end "T__137"

    // $ANTLR start "RAW_IDENTIFIER"
    public final void mRAW_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RAW_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mininess.g:697:5: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // Mininess.g:697:10: ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Mininess.g:697:42: ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // Mininess.g:700:5: ( NUMBER )
            // Mininess.g:700:10: NUMBER
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
            // Mininess.g:703:5: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // Mininess.g:703:10: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 

            // Mininess.g:703:14: ( options {greedy=false; } : . )*
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
            	    // Mininess.g:703:41: .
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
            // Mininess.g:706:5: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
            // Mininess.g:706:10: '\\'' ( options {greedy=false; } : . )* '\\''
            {
            match('\''); 

            // Mininess.g:706:15: ( options {greedy=false; } : . )*
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
            	    // Mininess.g:706:42: .
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
            // Mininess.g:709:5: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+ )
            // Mininess.g:709:10: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
            {
            // Mininess.g:709:10: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
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
            // Mininess.g:712:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // Mininess.g:712:10: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // Mininess.g:712:15: ( options {greedy=false; } : . )*
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
            	    // Mininess.g:712:42: .
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
            // Mininess.g:715:5: ( '//' ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) )
            // Mininess.g:715:10: '//' ( options {greedy=false; } : . )* ( '\\r' | '\\n' )
            {
            match("//"); 



            // Mininess.g:715:15: ( options {greedy=false; } : . )*
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
            	    // Mininess.g:715:42: .
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
            // Mininess.g:726:5: ( DEC_NUMBER | HEX_NUMBER )
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
                    // Mininess.g:726:10: DEC_NUMBER
                    {
                    mDEC_NUMBER(); 


                    }
                    break;
                case 2 :
                    // Mininess.g:727:10: HEX_NUMBER
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
            // Mininess.g:730:5: ( ( DIGIT )+ ( NUMBER_SUFFIX )? )
            // Mininess.g:730:10: ( DIGIT )+ ( NUMBER_SUFFIX )?
            {
            // Mininess.g:730:10: ( DIGIT )+
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


            // Mininess.g:730:21: ( NUMBER_SUFFIX )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='L'||LA9_0=='U'||LA9_0=='l'||LA9_0=='u') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Mininess.g:730:23: NUMBER_SUFFIX
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
            // Mininess.g:733:5: ( NUMBER_PREFIX ( HEX_DIGIT )+ ( NUMBER_SUFFIX )? )
            // Mininess.g:733:10: NUMBER_PREFIX ( HEX_DIGIT )+ ( NUMBER_SUFFIX )?
            {
            mNUMBER_PREFIX(); 


            // Mininess.g:733:24: ( HEX_DIGIT )+
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


            // Mininess.g:733:39: ( NUMBER_SUFFIX )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='L'||LA11_0=='U'||LA11_0=='l'||LA11_0=='u') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Mininess.g:733:41: NUMBER_SUFFIX
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
            // Mininess.g:736:5: ( '0' .. '9' )
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
            // Mininess.g:739:5: ( '0' .. '9' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )
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
            // Mininess.g:742:5: ( '0x' )
            // Mininess.g:742:10: '0x'
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
            // Mininess.g:745:5: ( ( 'l' | 'L' | 'u' | 'U' | 'lu' | 'ul' | 'LU' | 'UL' ) )
            // Mininess.g:745:10: ( 'l' | 'L' | 'u' | 'U' | 'lu' | 'ul' | 'LU' | 'UL' )
            {
            // Mininess.g:745:10: ( 'l' | 'L' | 'u' | 'U' | 'lu' | 'ul' | 'LU' | 'UL' )
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
                    // Mininess.g:745:11: 'l'
                    {
                    match('l'); 

                    }
                    break;
                case 2 :
                    // Mininess.g:745:17: 'L'
                    {
                    match('L'); 

                    }
                    break;
                case 3 :
                    // Mininess.g:745:23: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 4 :
                    // Mininess.g:745:29: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 5 :
                    // Mininess.g:745:35: 'lu'
                    {
                    match("lu"); 



                    }
                    break;
                case 6 :
                    // Mininess.g:745:42: 'ul'
                    {
                    match("ul"); 



                    }
                    break;
                case 7 :
                    // Mininess.g:745:49: 'LU'
                    {
                    match("LU"); 



                    }
                    break;
                case 8 :
                    // Mininess.g:745:56: 'UL'
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
        // Mininess.g:1:8: ( AMP | AND | ARRAYINC | ARROW | ASSIGN | BITANDASSIGN | BITCOMPLEMENT | BITOR | BITORASSIGN | BITXOR | BITXORASSIGN | CALL | CASE | CHAR | COMMA | COMMAND | CONST | DEFAULT | DIVASSIGN | DIVIDE | DOT | ELSE | ENUM | EQUAL | EVENT | FOR | GREATER | GREATEREQUAL | HASH | IF | IMPLEMENTATION | INT | INT16_T | INT32_T | INT8_T | INTERFACE | LBRACE | LBRACKET | LESS | LESSEQUAL | LONG | LPARENS | LSHIFT | LSHIFTASSIGN | MINUS | MINUSASSIGN | MINUSMINUS | MODASSIGN | MODULE | MODULUS | MULASSIGN | NOT | NOTEQUAL | OR | PLUS | PLUSASSIGN | PLUSPLUS | POST | PROVIDES | RBRACE | RBRACKET | RETURN | RPARENS | RSHIFT | RSHIFTASSIGN | SHORT | SIGNED | SIZEOF | STAR | STRUCT | SWITCH | TASK | TYPEDEF | UINT16_T | UINT32_T | UINT8_T | UNSIGNED | USES | VOID | WHILE | T__134 | T__135 | T__136 | T__137 | RAW_IDENTIFIER | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | WHITESPACE | COMMENT1 | COMMENT2 )
        int alt13=91;
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
                // Mininess.g:1:185: EVENT
                {
                mEVENT(); 


                }
                break;
            case 26 :
                // Mininess.g:1:191: FOR
                {
                mFOR(); 


                }
                break;
            case 27 :
                // Mininess.g:1:195: GREATER
                {
                mGREATER(); 


                }
                break;
            case 28 :
                // Mininess.g:1:203: GREATEREQUAL
                {
                mGREATEREQUAL(); 


                }
                break;
            case 29 :
                // Mininess.g:1:216: HASH
                {
                mHASH(); 


                }
                break;
            case 30 :
                // Mininess.g:1:221: IF
                {
                mIF(); 


                }
                break;
            case 31 :
                // Mininess.g:1:224: IMPLEMENTATION
                {
                mIMPLEMENTATION(); 


                }
                break;
            case 32 :
                // Mininess.g:1:239: INT
                {
                mINT(); 


                }
                break;
            case 33 :
                // Mininess.g:1:243: INT16_T
                {
                mINT16_T(); 


                }
                break;
            case 34 :
                // Mininess.g:1:251: INT32_T
                {
                mINT32_T(); 


                }
                break;
            case 35 :
                // Mininess.g:1:259: INT8_T
                {
                mINT8_T(); 


                }
                break;
            case 36 :
                // Mininess.g:1:266: INTERFACE
                {
                mINTERFACE(); 


                }
                break;
            case 37 :
                // Mininess.g:1:276: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 38 :
                // Mininess.g:1:283: LBRACKET
                {
                mLBRACKET(); 


                }
                break;
            case 39 :
                // Mininess.g:1:292: LESS
                {
                mLESS(); 


                }
                break;
            case 40 :
                // Mininess.g:1:297: LESSEQUAL
                {
                mLESSEQUAL(); 


                }
                break;
            case 41 :
                // Mininess.g:1:307: LONG
                {
                mLONG(); 


                }
                break;
            case 42 :
                // Mininess.g:1:312: LPARENS
                {
                mLPARENS(); 


                }
                break;
            case 43 :
                // Mininess.g:1:320: LSHIFT
                {
                mLSHIFT(); 


                }
                break;
            case 44 :
                // Mininess.g:1:327: LSHIFTASSIGN
                {
                mLSHIFTASSIGN(); 


                }
                break;
            case 45 :
                // Mininess.g:1:340: MINUS
                {
                mMINUS(); 


                }
                break;
            case 46 :
                // Mininess.g:1:346: MINUSASSIGN
                {
                mMINUSASSIGN(); 


                }
                break;
            case 47 :
                // Mininess.g:1:358: MINUSMINUS
                {
                mMINUSMINUS(); 


                }
                break;
            case 48 :
                // Mininess.g:1:369: MODASSIGN
                {
                mMODASSIGN(); 


                }
                break;
            case 49 :
                // Mininess.g:1:379: MODULE
                {
                mMODULE(); 


                }
                break;
            case 50 :
                // Mininess.g:1:386: MODULUS
                {
                mMODULUS(); 


                }
                break;
            case 51 :
                // Mininess.g:1:394: MULASSIGN
                {
                mMULASSIGN(); 


                }
                break;
            case 52 :
                // Mininess.g:1:404: NOT
                {
                mNOT(); 


                }
                break;
            case 53 :
                // Mininess.g:1:408: NOTEQUAL
                {
                mNOTEQUAL(); 


                }
                break;
            case 54 :
                // Mininess.g:1:417: OR
                {
                mOR(); 


                }
                break;
            case 55 :
                // Mininess.g:1:420: PLUS
                {
                mPLUS(); 


                }
                break;
            case 56 :
                // Mininess.g:1:425: PLUSASSIGN
                {
                mPLUSASSIGN(); 


                }
                break;
            case 57 :
                // Mininess.g:1:436: PLUSPLUS
                {
                mPLUSPLUS(); 


                }
                break;
            case 58 :
                // Mininess.g:1:445: POST
                {
                mPOST(); 


                }
                break;
            case 59 :
                // Mininess.g:1:450: PROVIDES
                {
                mPROVIDES(); 


                }
                break;
            case 60 :
                // Mininess.g:1:459: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 61 :
                // Mininess.g:1:466: RBRACKET
                {
                mRBRACKET(); 


                }
                break;
            case 62 :
                // Mininess.g:1:475: RETURN
                {
                mRETURN(); 


                }
                break;
            case 63 :
                // Mininess.g:1:482: RPARENS
                {
                mRPARENS(); 


                }
                break;
            case 64 :
                // Mininess.g:1:490: RSHIFT
                {
                mRSHIFT(); 


                }
                break;
            case 65 :
                // Mininess.g:1:497: RSHIFTASSIGN
                {
                mRSHIFTASSIGN(); 


                }
                break;
            case 66 :
                // Mininess.g:1:510: SHORT
                {
                mSHORT(); 


                }
                break;
            case 67 :
                // Mininess.g:1:516: SIGNED
                {
                mSIGNED(); 


                }
                break;
            case 68 :
                // Mininess.g:1:523: SIZEOF
                {
                mSIZEOF(); 


                }
                break;
            case 69 :
                // Mininess.g:1:530: STAR
                {
                mSTAR(); 


                }
                break;
            case 70 :
                // Mininess.g:1:535: STRUCT
                {
                mSTRUCT(); 


                }
                break;
            case 71 :
                // Mininess.g:1:542: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 72 :
                // Mininess.g:1:549: TASK
                {
                mTASK(); 


                }
                break;
            case 73 :
                // Mininess.g:1:554: TYPEDEF
                {
                mTYPEDEF(); 


                }
                break;
            case 74 :
                // Mininess.g:1:562: UINT16_T
                {
                mUINT16_T(); 


                }
                break;
            case 75 :
                // Mininess.g:1:571: UINT32_T
                {
                mUINT32_T(); 


                }
                break;
            case 76 :
                // Mininess.g:1:580: UINT8_T
                {
                mUINT8_T(); 


                }
                break;
            case 77 :
                // Mininess.g:1:588: UNSIGNED
                {
                mUNSIGNED(); 


                }
                break;
            case 78 :
                // Mininess.g:1:597: USES
                {
                mUSES(); 


                }
                break;
            case 79 :
                // Mininess.g:1:602: VOID
                {
                mVOID(); 


                }
                break;
            case 80 :
                // Mininess.g:1:607: WHILE
                {
                mWHILE(); 


                }
                break;
            case 81 :
                // Mininess.g:1:613: T__134
                {
                mT__134(); 


                }
                break;
            case 82 :
                // Mininess.g:1:620: T__135
                {
                mT__135(); 


                }
                break;
            case 83 :
                // Mininess.g:1:627: T__136
                {
                mT__136(); 


                }
                break;
            case 84 :
                // Mininess.g:1:634: T__137
                {
                mT__137(); 


                }
                break;
            case 85 :
                // Mininess.g:1:641: RAW_IDENTIFIER
                {
                mRAW_IDENTIFIER(); 


                }
                break;
            case 86 :
                // Mininess.g:1:656: CONSTANT
                {
                mCONSTANT(); 


                }
                break;
            case 87 :
                // Mininess.g:1:665: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 88 :
                // Mininess.g:1:680: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 


                }
                break;
            case 89 :
                // Mininess.g:1:698: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 90 :
                // Mininess.g:1:709: COMMENT1
                {
                mCOMMENT1(); 


                }
                break;
            case 91 :
                // Mininess.g:1:718: COMMENT2
                {
                mCOMMENT2(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\57\1\63\1\67\1\71\1\uffff\1\73\1\50\1\uffff\1\50\1\103"+
        "\1\105\2\50\1\114\1\uffff\1\50\2\uffff\1\122\1\50\1\uffff\1\125"+
        "\1\50\1\130\1\132\1\135\1\50\2\uffff\1\50\1\uffff\5\50\27\uffff"+
        "\4\50\6\uffff\4\50\1\uffff\1\167\1\uffff\1\170\2\50\1\uffff\1\174"+
        "\1\uffff\1\50\2\uffff\1\50\7\uffff\27\50\1\u0097\3\uffff\1\50\1"+
        "\u009d\2\uffff\21\50\1\u00af\1\u00b0\1\u00b1\3\50\1\u00b5\1\u00b6"+
        "\1\50\1\uffff\5\50\1\uffff\1\u00bd\1\50\1\u00bf\7\50\1\u00c7\3\50"+
        "\1\u00cd\1\u00ce\1\50\3\uffff\1\50\1\u00d1\1\50\2\uffff\1\u00d3"+
        "\5\50\1\uffff\1\50\1\uffff\2\50\1\u00dc\4\50\1\uffff\5\50\2\uffff"+
        "\1\u00e6\1\50\1\uffff\1\50\1\uffff\3\50\1\u00ec\1\50\1\u00ee\1\50"+
        "\1\u00f0\1\uffff\1\u00f1\1\u00f2\1\u00f3\1\u00f4\5\50\1\uffff\1"+
        "\u00fa\1\u00fb\1\50\1\u00fd\1\u00fe\1\uffff\1\50\1\uffff\1\50\5"+
        "\uffff\1\u0101\2\50\1\u0104\1\50\2\uffff\1\50\2\uffff\1\50\1\u0108"+
        "\1\uffff\1\u0109\1\u010a\1\uffff\1\u010b\1\50\1\u010d\4\uffff\1"+
        "\50\1\uffff\3\50\1\u0112\1\uffff";
    static final String DFA13_eofS =
        "\u0113\uffff";
    static final String DFA13_minS =
        "\1\11\1\46\1\75\1\55\1\75\1\uffff\1\75\1\141\1\uffff\1\145\1\52"+
        "\1\56\1\154\1\157\1\75\1\uffff\1\146\2\uffff\1\74\1\157\1\uffff"+
        "\1\75\1\157\2\75\1\53\1\157\2\uffff\1\145\1\uffff\1\150\1\141\1"+
        "\151\1\157\1\150\27\uffff\1\154\1\141\1\155\1\146\6\uffff\1\163"+
        "\1\165\1\145\1\162\1\uffff\1\75\1\uffff\1\60\1\160\1\164\1\uffff"+
        "\1\75\1\uffff\1\156\2\uffff\1\144\7\uffff\1\163\1\157\1\164\1\157"+
        "\1\147\1\162\1\151\1\163\1\160\1\156\1\163\1\145\2\151\1\154\1\145"+
        "\1\162\1\155\1\163\1\141\1\145\1\155\1\156\1\60\3\uffff\1\154\1"+
        "\60\2\uffff\1\147\1\165\1\164\1\166\1\165\1\162\1\156\1\145\1\165"+
        "\1\164\1\153\1\145\1\164\1\151\1\163\1\144\1\154\3\60\1\141\1\164"+
        "\1\165\2\60\1\164\1\uffff\1\145\1\66\1\62\1\137\1\162\1\uffff\1"+
        "\60\1\154\1\60\1\151\1\162\1\164\1\145\1\157\2\143\1\60\1\144\1"+
        "\61\1\147\2\60\1\145\3\uffff\1\156\1\60\1\154\2\uffff\1\60\1\155"+
        "\2\137\1\164\1\146\1\uffff\1\145\1\uffff\1\144\1\156\1\60\1\144"+
        "\1\146\1\164\1\150\1\uffff\1\145\1\66\1\62\1\137\1\156\2\uffff\1"+
        "\60\1\144\1\uffff\1\164\1\uffff\1\145\2\164\1\60\1\141\1\60\1\145"+
        "\1\60\1\uffff\4\60\1\146\2\137\1\164\1\145\1\uffff\2\60\1\156\2"+
        "\60\1\uffff\1\143\1\uffff\1\163\5\uffff\1\60\2\164\1\60\1\144\2"+
        "\uffff\1\164\2\uffff\1\145\1\60\1\uffff\2\60\1\uffff\1\60\1\141"+
        "\1\60\4\uffff\1\164\1\uffff\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\176\1\75\1\174\1\76\1\75\1\uffff\1\75\1\157\1\uffff\1\145\1\75"+
        "\1\56\1\166\1\157\1\76\1\uffff\1\156\2\uffff\1\75\1\157\1\uffff"+
        "\1\75\1\157\3\75\1\162\2\uffff\1\145\1\uffff\1\167\1\171\1\163\1"+
        "\157\1\150\27\uffff\1\163\1\141\1\156\1\146\6\uffff\1\163\1\165"+
        "\1\145\1\162\1\uffff\1\75\1\uffff\1\172\1\160\1\164\1\uffff\1\75"+
        "\1\uffff\1\156\2\uffff\1\144\7\uffff\1\163\1\157\1\164\1\157\1\172"+
        "\1\162\1\151\1\163\1\160\1\156\1\163\1\145\2\151\1\154\1\145\1\162"+
        "\1\155\1\163\1\141\1\145\1\155\1\156\1\172\3\uffff\1\154\1\172\2"+
        "\uffff\1\147\1\165\1\164\1\166\1\165\1\162\1\156\1\145\1\165\1\164"+
        "\1\153\1\145\1\164\1\151\1\163\1\144\1\154\3\172\1\141\1\164\1\165"+
        "\2\172\1\164\1\uffff\1\145\1\66\1\62\1\137\1\162\1\uffff\1\172\1"+
        "\154\1\172\1\151\1\162\1\164\1\145\1\157\2\143\1\172\1\144\1\70"+
        "\1\147\2\172\1\145\3\uffff\1\156\1\172\1\154\2\uffff\1\172\1\155"+
        "\2\137\1\164\1\146\1\uffff\1\145\1\uffff\1\144\1\156\1\172\1\144"+
        "\1\146\1\164\1\150\1\uffff\1\145\1\66\1\62\1\137\1\156\2\uffff\1"+
        "\172\1\144\1\uffff\1\164\1\uffff\1\145\2\164\1\172\1\141\1\172\1"+
        "\145\1\172\1\uffff\4\172\1\146\2\137\1\164\1\145\1\uffff\2\172\1"+
        "\156\2\172\1\uffff\1\143\1\uffff\1\163\5\uffff\1\172\2\164\1\172"+
        "\1\144\2\uffff\1\164\2\uffff\1\145\1\172\1\uffff\2\172\1\uffff\1"+
        "\172\1\141\1\172\4\uffff\1\164\1\uffff\1\151\1\157\1\156\1\172\1"+
        "\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\7\2\uffff\1\17\6\uffff\1\35\1\uffff\1\45\1\46\2\uffff"+
        "\1\52\6\uffff\1\74\1\75\1\uffff\1\77\5\uffff\1\122\1\123\1\124\1"+
        "\125\1\126\1\127\1\130\1\131\1\2\1\6\1\1\1\3\1\11\1\66\1\10\1\4"+
        "\1\56\1\57\1\55\1\30\1\5\1\13\1\12\4\uffff\1\23\1\132\1\133\1\24"+
        "\1\121\1\25\4\uffff\1\34\1\uffff\1\33\3\uffff\1\50\1\uffff\1\47"+
        "\1\uffff\1\60\1\62\1\uffff\1\63\1\105\1\65\1\64\1\70\1\71\1\67\30"+
        "\uffff\1\101\1\100\1\36\2\uffff\1\54\1\53\32\uffff\1\32\5\uffff"+
        "\1\40\21\uffff\1\14\1\15\1\16\3\uffff\1\26\1\27\6\uffff\1\51\1\uffff"+
        "\1\72\7\uffff\1\110\5\uffff\1\116\1\117\2\uffff\1\21\1\uffff\1\31"+
        "\10\uffff\1\102\11\uffff\1\120\5\uffff\1\43\1\uffff\1\61\1\uffff"+
        "\1\76\1\103\1\104\1\106\1\107\5\uffff\1\20\1\22\1\uffff\1\41\1\42"+
        "\2\uffff\1\111\2\uffff\1\114\3\uffff\1\73\1\112\1\113\1\115\1\uffff"+
        "\1\44\4\uffff\1\37";
    static final String DFA13_specialS =
        "\u0113\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\54\1\uffff\2\54\22\uffff\1\54\1\31\1\52\1\17\1\uffff\1\26"+
            "\1\1\1\53\1\25\1\37\1\30\1\32\1\10\1\3\1\13\1\12\12\51\1\45"+
            "\1\46\1\23\1\4\1\16\1\47\1\uffff\32\50\1\22\1\uffff\1\35\1\6"+
            "\1\50\1\uffff\2\50\1\7\1\11\1\14\1\15\2\50\1\20\2\50\1\24\1"+
            "\27\2\50\1\33\1\50\1\36\1\40\1\41\1\42\1\43\1\44\3\50\1\21\1"+
            "\2\1\34\1\5",
            "\1\55\26\uffff\1\56",
            "\1\61\1\60\75\uffff\1\62",
            "\1\66\17\uffff\1\65\1\64",
            "\1\70",
            "",
            "\1\72",
            "\1\74\6\uffff\1\75\6\uffff\1\76",
            "",
            "\1\77",
            "\1\101\4\uffff\1\102\15\uffff\1\100",
            "\1\104",
            "\1\106\1\uffff\1\107\7\uffff\1\110",
            "\1\111",
            "\1\112\1\113",
            "",
            "\1\115\6\uffff\1\116\1\117",
            "",
            "",
            "\1\121\1\120",
            "\1\123",
            "",
            "\1\124",
            "\1\126",
            "\1\127",
            "\1\131",
            "\1\134\21\uffff\1\133",
            "\1\136\2\uffff\1\137",
            "",
            "",
            "\1\140",
            "",
            "\1\141\1\142\12\uffff\1\143\2\uffff\1\144",
            "\1\145\27\uffff\1\146",
            "\1\147\4\uffff\1\150\4\uffff\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\154\6\uffff\1\155",
            "\1\156",
            "\1\157\1\160",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "",
            "\1\175",
            "",
            "",
            "\1\176",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083\22\uffff\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u0098",
            "\1\50\1\u0099\1\50\1\u009a\4\50\1\u009b\1\50\7\uffff\32\50"+
            "\4\uffff\1\50\1\uffff\4\50\1\u009c\25\50",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00be",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c8",
            "\1\u00c9\1\uffff\1\u00ca\4\uffff\1\u00cb",
            "\1\u00cc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cf",
            "",
            "",
            "",
            "\1\u00d0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d2",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ed",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ef",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00fc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00ff",
            "",
            "\1\u0100",
            "",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0102",
            "\1\u0103",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0105",
            "",
            "",
            "\1\u0106",
            "",
            "",
            "\1\u0107",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u010c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            return "1:1: Tokens : ( AMP | AND | ARRAYINC | ARROW | ASSIGN | BITANDASSIGN | BITCOMPLEMENT | BITOR | BITORASSIGN | BITXOR | BITXORASSIGN | CALL | CASE | CHAR | COMMA | COMMAND | CONST | DEFAULT | DIVASSIGN | DIVIDE | DOT | ELSE | ENUM | EQUAL | EVENT | FOR | GREATER | GREATEREQUAL | HASH | IF | IMPLEMENTATION | INT | INT16_T | INT32_T | INT8_T | INTERFACE | LBRACE | LBRACKET | LESS | LESSEQUAL | LONG | LPARENS | LSHIFT | LSHIFTASSIGN | MINUS | MINUSASSIGN | MINUSMINUS | MODASSIGN | MODULE | MODULUS | MULASSIGN | NOT | NOTEQUAL | OR | PLUS | PLUSASSIGN | PLUSPLUS | POST | PROVIDES | RBRACE | RBRACKET | RETURN | RPARENS | RSHIFT | RSHIFTASSIGN | SHORT | SIGNED | SIZEOF | STAR | STRUCT | SWITCH | TASK | TYPEDEF | UINT16_T | UINT32_T | UINT8_T | UNSIGNED | USES | VOID | WHILE | T__134 | T__135 | T__136 | T__137 | RAW_IDENTIFIER | CONSTANT | STRING_LITERAL | CHARACTER_LITERAL | WHITESPACE | COMMENT1 | COMMENT2 );";
        }
    }
 

}