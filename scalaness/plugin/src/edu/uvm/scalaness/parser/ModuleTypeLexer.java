// $ANTLR 3.4 ModuleType.g 2012-10-11 18:48:19

    package edu.uvm.scalaness.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ModuleTypeLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ARRAY=4;
    public static final int COLON=5;
    public static final int COMMA=6;
    public static final int COMMENT1=7;
    public static final int COMMENT2=8;
    public static final int ERRORT=9;
    public static final int EXISTENTIAL_LIST=10;
    public static final int EXPORT_LIST=11;
    public static final int FUNCTION_DECLARATION=12;
    public static final int IDENTIFIER=13;
    public static final int IMPORT_LIST=14;
    public static final int INT16=15;
    public static final int INT32=16;
    public static final int INT8=17;
    public static final int LANGLE=18;
    public static final int LBRACE=19;
    public static final int LBRACKET=20;
    public static final int LPARENS=21;
    public static final int MODULE_TYPE=22;
    public static final int PARAMETER_LIST=23;
    public static final int RANGLE=24;
    public static final int RBRACE=25;
    public static final int RBRACKET=26;
    public static final int RPARENS=27;
    public static final int SEMI=28;
    public static final int SUBTYPE=29;
    public static final int TYPE_PARAMETER_LIST=30;
    public static final int UINT16=31;
    public static final int UINT32=32;
    public static final int UINT8=33;
    public static final int VALUE_PARAMETER_LIST=34;
    public static final int VOID=35;
    public static final int WHITESPACE=36;

        // This is mostly just a placeholder.
        private final int VERSION = 1;


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ModuleTypeLexer() {} 
    public ModuleTypeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ModuleTypeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ModuleType.g"; }

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:10:7: ( 'Array' )
            // ModuleType.g:10:9: 'Array'
            {
            match("Array"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:11:7: ( ':' )
            // ModuleType.g:11:9: ':'
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
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:12:7: ( ',' )
            // ModuleType.g:12:9: ','
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

    // $ANTLR start "ERRORT"
    public final void mERRORT() throws RecognitionException {
        try {
            int _type = ERRORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:13:8: ( 'ErrorT' )
            // ModuleType.g:13:10: 'ErrorT'
            {
            match("ErrorT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ERRORT"

    // $ANTLR start "INT16"
    public final void mINT16() throws RecognitionException {
        try {
            int _type = INT16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:14:7: ( 'Int16' )
            // ModuleType.g:14:9: 'Int16'
            {
            match("Int16"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT16"

    // $ANTLR start "INT32"
    public final void mINT32() throws RecognitionException {
        try {
            int _type = INT32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:15:7: ( 'Int32' )
            // ModuleType.g:15:9: 'Int32'
            {
            match("Int32"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT32"

    // $ANTLR start "INT8"
    public final void mINT8() throws RecognitionException {
        try {
            int _type = INT8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:16:6: ( 'Int8' )
            // ModuleType.g:16:8: 'Int8'
            {
            match("Int8"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT8"

    // $ANTLR start "LANGLE"
    public final void mLANGLE() throws RecognitionException {
        try {
            int _type = LANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:17:8: ( '<' )
            // ModuleType.g:17:10: '<'
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
    // $ANTLR end "LANGLE"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:18:8: ( '{' )
            // ModuleType.g:18:10: '{'
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
            // ModuleType.g:19:10: ( '[' )
            // ModuleType.g:19:12: '['
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

    // $ANTLR start "LPARENS"
    public final void mLPARENS() throws RecognitionException {
        try {
            int _type = LPARENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:20:9: ( '(' )
            // ModuleType.g:20:11: '('
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

    // $ANTLR start "RANGLE"
    public final void mRANGLE() throws RecognitionException {
        try {
            int _type = RANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:21:8: ( '>' )
            // ModuleType.g:21:10: '>'
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
    // $ANTLR end "RANGLE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:22:8: ( '}' )
            // ModuleType.g:22:10: '}'
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
            // ModuleType.g:23:10: ( ']' )
            // ModuleType.g:23:12: ']'
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

    // $ANTLR start "RPARENS"
    public final void mRPARENS() throws RecognitionException {
        try {
            int _type = RPARENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:24:9: ( ')' )
            // ModuleType.g:24:11: ')'
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

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:25:6: ( ';' )
            // ModuleType.g:25:8: ';'
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
    // $ANTLR end "SEMI"

    // $ANTLR start "SUBTYPE"
    public final void mSUBTYPE() throws RecognitionException {
        try {
            int _type = SUBTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:26:9: ( '<:' )
            // ModuleType.g:26:11: '<:'
            {
            match("<:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBTYPE"

    // $ANTLR start "UINT16"
    public final void mUINT16() throws RecognitionException {
        try {
            int _type = UINT16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:27:8: ( 'UInt16' )
            // ModuleType.g:27:10: 'UInt16'
            {
            match("UInt16"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UINT16"

    // $ANTLR start "UINT32"
    public final void mUINT32() throws RecognitionException {
        try {
            int _type = UINT32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:28:8: ( 'UInt32' )
            // ModuleType.g:28:10: 'UInt32'
            {
            match("UInt32"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UINT32"

    // $ANTLR start "UINT8"
    public final void mUINT8() throws RecognitionException {
        try {
            int _type = UINT8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:29:7: ( 'UInt8' )
            // ModuleType.g:29:9: 'UInt8'
            {
            match("UInt8"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UINT8"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:30:6: ( 'Void' )
            // ModuleType.g:30:8: 'Void'
            {
            match("Void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:182:5: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ModuleType.g:182:10: ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // ModuleType.g:182:42: ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ModuleType.g:
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
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:185:5: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\\\n' | '\\f' | '\"' )+ )
            // ModuleType.g:185:10: ( '\\t' | ' ' | '\\r' | '\\n' | '\\\\n' | '\\f' | '\"' )+
            {
            // ModuleType.g:185:10: ( '\\t' | ' ' | '\\r' | '\\n' | '\\\\n' | '\\f' | '\"' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=8;
                switch ( input.LA(1) ) {
                case '\t':
                    {
                    alt2=1;
                    }
                    break;
                case ' ':
                    {
                    alt2=2;
                    }
                    break;
                case '\r':
                    {
                    alt2=3;
                    }
                    break;
                case '\n':
                    {
                    alt2=4;
                    }
                    break;
                case '\\':
                    {
                    alt2=5;
                    }
                    break;
                case '\f':
                    {
                    alt2=6;
                    }
                    break;
                case '\"':
                    {
                    alt2=7;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ModuleType.g:185:12: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 2 :
            	    // ModuleType.g:185:19: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 3 :
            	    // ModuleType.g:185:25: '\\r'
            	    {
            	    match('\r'); 

            	    }
            	    break;
            	case 4 :
            	    // ModuleType.g:185:32: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 5 :
            	    // ModuleType.g:185:39: '\\\\n'
            	    {
            	    match("\\n"); 



            	    }
            	    break;
            	case 6 :
            	    // ModuleType.g:185:47: '\\f'
            	    {
            	    match('\f'); 

            	    }
            	    break;
            	case 7 :
            	    // ModuleType.g:185:54: '\"'
            	    {
            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // ModuleType.g:188:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ModuleType.g:188:10: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // ModuleType.g:188:15: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '.')||(LA3_1 >= '0' && LA3_1 <= '\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ModuleType.g:188:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // ModuleType.g:191:5: ( '//' ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) )
            // ModuleType.g:191:10: '//' ( options {greedy=false; } : . )* ( '\\r' | '\\n' )
            {
            match("//"); 



            // ModuleType.g:191:15: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                    alt4=2;
                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ModuleType.g:191:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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

    public void mTokens() throws RecognitionException {
        // ModuleType.g:1:8: ( ARRAY | COLON | COMMA | ERRORT | INT16 | INT32 | INT8 | LANGLE | LBRACE | LBRACKET | LPARENS | RANGLE | RBRACE | RBRACKET | RPARENS | SEMI | SUBTYPE | UINT16 | UINT32 | UINT8 | VOID | IDENTIFIER | WHITESPACE | COMMENT1 | COMMENT2 )
        int alt5=25;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // ModuleType.g:1:10: ARRAY
                {
                mARRAY(); 


                }
                break;
            case 2 :
                // ModuleType.g:1:16: COLON
                {
                mCOLON(); 


                }
                break;
            case 3 :
                // ModuleType.g:1:22: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 4 :
                // ModuleType.g:1:28: ERRORT
                {
                mERRORT(); 


                }
                break;
            case 5 :
                // ModuleType.g:1:35: INT16
                {
                mINT16(); 


                }
                break;
            case 6 :
                // ModuleType.g:1:41: INT32
                {
                mINT32(); 


                }
                break;
            case 7 :
                // ModuleType.g:1:47: INT8
                {
                mINT8(); 


                }
                break;
            case 8 :
                // ModuleType.g:1:52: LANGLE
                {
                mLANGLE(); 


                }
                break;
            case 9 :
                // ModuleType.g:1:59: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 10 :
                // ModuleType.g:1:66: LBRACKET
                {
                mLBRACKET(); 


                }
                break;
            case 11 :
                // ModuleType.g:1:75: LPARENS
                {
                mLPARENS(); 


                }
                break;
            case 12 :
                // ModuleType.g:1:83: RANGLE
                {
                mRANGLE(); 


                }
                break;
            case 13 :
                // ModuleType.g:1:90: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 14 :
                // ModuleType.g:1:97: RBRACKET
                {
                mRBRACKET(); 


                }
                break;
            case 15 :
                // ModuleType.g:1:106: RPARENS
                {
                mRPARENS(); 


                }
                break;
            case 16 :
                // ModuleType.g:1:114: SEMI
                {
                mSEMI(); 


                }
                break;
            case 17 :
                // ModuleType.g:1:119: SUBTYPE
                {
                mSUBTYPE(); 


                }
                break;
            case 18 :
                // ModuleType.g:1:127: UINT16
                {
                mUINT16(); 


                }
                break;
            case 19 :
                // ModuleType.g:1:134: UINT32
                {
                mUINT32(); 


                }
                break;
            case 20 :
                // ModuleType.g:1:141: UINT8
                {
                mUINT8(); 


                }
                break;
            case 21 :
                // ModuleType.g:1:147: VOID
                {
                mVOID(); 


                }
                break;
            case 22 :
                // ModuleType.g:1:152: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 23 :
                // ModuleType.g:1:163: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 24 :
                // ModuleType.g:1:174: COMMENT1
                {
                mCOMMENT1(); 


                }
                break;
            case 25 :
                // ModuleType.g:1:183: COMMENT2
                {
                mCOMMENT2(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\21\2\uffff\2\21\1\30\10\uffff\2\21\3\uffff\3\21\2\uffff"+
        "\2\21\2\uffff\11\21\1\55\1\21\1\61\1\62\1\21\1\64\1\65\1\uffff\2"+
        "\21\1\70\2\uffff\1\71\2\uffff\1\72\1\73\4\uffff";
    static final String DFA5_eofS =
        "\74\uffff";
    static final String DFA5_minS =
        "\1\11\1\162\2\uffff\1\162\1\156\1\72\10\uffff\1\111\1\157\2\uffff"+
        "\1\52\2\162\1\164\2\uffff\1\156\1\151\2\uffff\1\141\1\157\1\61\1"+
        "\164\1\144\1\171\1\162\1\66\1\62\1\60\1\61\2\60\1\124\2\60\1\uffff"+
        "\1\66\1\62\1\60\2\uffff\1\60\2\uffff\2\60\4\uffff";
    static final String DFA5_maxS =
        "\1\175\1\162\2\uffff\1\162\1\156\1\72\10\uffff\1\111\1\157\2\uffff"+
        "\1\57\2\162\1\164\2\uffff\1\156\1\151\2\uffff\1\141\1\157\1\70\1"+
        "\164\1\144\1\171\1\162\1\66\1\62\1\172\1\70\2\172\1\124\2\172\1"+
        "\uffff\1\66\1\62\1\172\2\uffff\1\172\2\uffff\2\172\4\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
        "\2\uffff\1\26\1\27\4\uffff\1\21\1\10\2\uffff\1\30\1\31\20\uffff"+
        "\1\7\3\uffff\1\25\1\1\1\uffff\1\5\1\6\2\uffff\1\24\1\4\1\22\1\23";
    static final String DFA5_specialS =
        "\74\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\22\1\uffff\2\22\22\uffff\1\22\1\uffff\1\22\5\uffff\1\11\1"+
            "\15\2\uffff\1\3\2\uffff\1\23\12\uffff\1\2\1\16\1\6\1\uffff\1"+
            "\12\2\uffff\1\1\3\21\1\4\3\21\1\5\13\21\1\17\1\20\4\21\1\10"+
            "\1\22\1\14\1\uffff\1\21\1\uffff\32\21\1\7\1\uffff\1\13",
            "\1\24",
            "",
            "",
            "\1\25",
            "\1\26",
            "\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31",
            "\1\32",
            "",
            "",
            "\1\33\4\uffff\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "\1\40",
            "\1\41",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44\1\uffff\1\45\4\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\56\1\uffff\1\57\4\uffff\1\60",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\63",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\1\66",
            "\1\67",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ARRAY | COLON | COMMA | ERRORT | INT16 | INT32 | INT8 | LANGLE | LBRACE | LBRACKET | LPARENS | RANGLE | RBRACE | RBRACKET | RPARENS | SEMI | SUBTYPE | UINT16 | UINT32 | UINT8 | VOID | IDENTIFIER | WHITESPACE | COMMENT1 | COMMENT2 );";
        }
    }
 

}