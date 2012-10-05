// $ANTLR 3.4 ModuleType.g 2012-10-05 19:48:28

    package edu.uvm.scalaness.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ModuleTypeLexer extends Lexer {
    public static final int EOF=-1;
    public static final int COLON=4;
    public static final int COMMA=5;
    public static final int COMMENT1=6;
    public static final int COMMENT2=7;
    public static final int EXISTENTIAL_LIST=8;
    public static final int EXPORT_LIST=9;
    public static final int IDENTIFIER=10;
    public static final int IMPORT_LIST=11;
    public static final int INT16=12;
    public static final int INT32=13;
    public static final int INT8=14;
    public static final int LANGLE=15;
    public static final int LBRACE=16;
    public static final int LPARENS=17;
    public static final int MODULE_TYPE=18;
    public static final int PARAMETER_LIST=19;
    public static final int RANGLE=20;
    public static final int RBRACE=21;
    public static final int RPARENS=22;
    public static final int SEMI=23;
    public static final int SUBTYPE=24;
    public static final int TYPE_PARAMETER_LIST=25;
    public static final int UINT16=26;
    public static final int UINT32=27;
    public static final int UINT8=28;
    public static final int VALUE_PARAMETER_LIST=29;
    public static final int WHITESPACE=30;

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

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:10:7: ( ':' )
            // ModuleType.g:10:9: ':'
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
            // ModuleType.g:11:7: ( ',' )
            // ModuleType.g:11:9: ','
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

    // $ANTLR start "INT16"
    public final void mINT16() throws RecognitionException {
        try {
            int _type = INT16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:12:7: ( 'Int16' )
            // ModuleType.g:12:9: 'Int16'
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
            // ModuleType.g:13:7: ( 'Int32' )
            // ModuleType.g:13:9: 'Int32'
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
            // ModuleType.g:14:6: ( 'Int8' )
            // ModuleType.g:14:8: 'Int8'
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
            // ModuleType.g:15:8: ( '<' )
            // ModuleType.g:15:10: '<'
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
            // ModuleType.g:16:8: ( '{' )
            // ModuleType.g:16:10: '{'
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

    // $ANTLR start "LPARENS"
    public final void mLPARENS() throws RecognitionException {
        try {
            int _type = LPARENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:17:9: ( '(' )
            // ModuleType.g:17:11: '('
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
            // ModuleType.g:18:8: ( '>' )
            // ModuleType.g:18:10: '>'
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
            // ModuleType.g:19:8: ( '}' )
            // ModuleType.g:19:10: '}'
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

    // $ANTLR start "RPARENS"
    public final void mRPARENS() throws RecognitionException {
        try {
            int _type = RPARENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:20:9: ( ')' )
            // ModuleType.g:20:11: ')'
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
            // ModuleType.g:21:6: ( ';' )
            // ModuleType.g:21:8: ';'
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
            // ModuleType.g:22:9: ( '<:' )
            // ModuleType.g:22:11: '<:'
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
            // ModuleType.g:23:8: ( 'UInt16' )
            // ModuleType.g:23:10: 'UInt16'
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
            // ModuleType.g:24:8: ( 'UInt32' )
            // ModuleType.g:24:10: 'UInt32'
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
            // ModuleType.g:25:7: ( 'UInt8' )
            // ModuleType.g:25:9: 'UInt8'
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

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:135:5: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ModuleType.g:135:10: ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // ModuleType.g:135:42: ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // ModuleType.g:138:5: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+ )
            // ModuleType.g:138:10: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
            {
            // ModuleType.g:138:10: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ModuleType.g:
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
            // ModuleType.g:141:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ModuleType.g:141:10: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // ModuleType.g:141:15: ( options {greedy=false; } : . )*
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
            	    // ModuleType.g:141:42: .
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
            // ModuleType.g:144:5: ( '//' ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) )
            // ModuleType.g:144:10: '//' ( options {greedy=false; } : . )* ( '\\r' | '\\n' )
            {
            match("//"); 



            // ModuleType.g:144:15: ( options {greedy=false; } : . )*
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
            	    // ModuleType.g:144:42: .
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
        // ModuleType.g:1:8: ( COLON | COMMA | INT16 | INT32 | INT8 | LANGLE | LBRACE | LPARENS | RANGLE | RBRACE | RPARENS | SEMI | SUBTYPE | UINT16 | UINT32 | UINT8 | IDENTIFIER | WHITESPACE | COMMENT1 | COMMENT2 )
        int alt5=20;
        switch ( input.LA(1) ) {
        case ':':
            {
            alt5=1;
            }
            break;
        case ',':
            {
            alt5=2;
            }
            break;
        case 'I':
            {
            int LA5_3 = input.LA(2);

            if ( (LA5_3=='n') ) {
                int LA5_15 = input.LA(3);

                if ( (LA5_15=='t') ) {
                    switch ( input.LA(4) ) {
                    case '1':
                        {
                        int LA5_23 = input.LA(5);

                        if ( (LA5_23=='6') ) {
                            int LA5_27 = input.LA(6);

                            if ( ((LA5_27 >= '0' && LA5_27 <= '9')||(LA5_27 >= 'A' && LA5_27 <= 'Z')||LA5_27=='_'||(LA5_27 >= 'a' && LA5_27 <= 'z')) ) {
                                alt5=17;
                            }
                            else {
                                alt5=3;
                            }
                        }
                        else {
                            alt5=17;
                        }
                        }
                        break;
                    case '3':
                        {
                        int LA5_24 = input.LA(5);

                        if ( (LA5_24=='2') ) {
                            int LA5_28 = input.LA(6);

                            if ( ((LA5_28 >= '0' && LA5_28 <= '9')||(LA5_28 >= 'A' && LA5_28 <= 'Z')||LA5_28=='_'||(LA5_28 >= 'a' && LA5_28 <= 'z')) ) {
                                alt5=17;
                            }
                            else {
                                alt5=4;
                            }
                        }
                        else {
                            alt5=17;
                        }
                        }
                        break;
                    case '8':
                        {
                        int LA5_25 = input.LA(5);

                        if ( ((LA5_25 >= '0' && LA5_25 <= '9')||(LA5_25 >= 'A' && LA5_25 <= 'Z')||LA5_25=='_'||(LA5_25 >= 'a' && LA5_25 <= 'z')) ) {
                            alt5=17;
                        }
                        else {
                            alt5=5;
                        }
                        }
                        break;
                    default:
                        alt5=17;
                    }

                }
                else {
                    alt5=17;
                }
            }
            else {
                alt5=17;
            }
            }
            break;
        case '<':
            {
            int LA5_4 = input.LA(2);

            if ( (LA5_4==':') ) {
                alt5=13;
            }
            else {
                alt5=6;
            }
            }
            break;
        case '{':
            {
            alt5=7;
            }
            break;
        case '(':
            {
            alt5=8;
            }
            break;
        case '>':
            {
            alt5=9;
            }
            break;
        case '}':
            {
            alt5=10;
            }
            break;
        case ')':
            {
            alt5=11;
            }
            break;
        case ';':
            {
            alt5=12;
            }
            break;
        case 'U':
            {
            int LA5_11 = input.LA(2);

            if ( (LA5_11=='I') ) {
                int LA5_18 = input.LA(3);

                if ( (LA5_18=='n') ) {
                    int LA5_22 = input.LA(4);

                    if ( (LA5_22=='t') ) {
                        switch ( input.LA(5) ) {
                        case '1':
                            {
                            int LA5_30 = input.LA(6);

                            if ( (LA5_30=='6') ) {
                                int LA5_35 = input.LA(7);

                                if ( ((LA5_35 >= '0' && LA5_35 <= '9')||(LA5_35 >= 'A' && LA5_35 <= 'Z')||LA5_35=='_'||(LA5_35 >= 'a' && LA5_35 <= 'z')) ) {
                                    alt5=17;
                                }
                                else {
                                    alt5=14;
                                }
                            }
                            else {
                                alt5=17;
                            }
                            }
                            break;
                        case '3':
                            {
                            int LA5_31 = input.LA(6);

                            if ( (LA5_31=='2') ) {
                                int LA5_36 = input.LA(7);

                                if ( ((LA5_36 >= '0' && LA5_36 <= '9')||(LA5_36 >= 'A' && LA5_36 <= 'Z')||LA5_36=='_'||(LA5_36 >= 'a' && LA5_36 <= 'z')) ) {
                                    alt5=17;
                                }
                                else {
                                    alt5=15;
                                }
                            }
                            else {
                                alt5=17;
                            }
                            }
                            break;
                        case '8':
                            {
                            int LA5_32 = input.LA(6);

                            if ( ((LA5_32 >= '0' && LA5_32 <= '9')||(LA5_32 >= 'A' && LA5_32 <= 'Z')||LA5_32=='_'||(LA5_32 >= 'a' && LA5_32 <= 'z')) ) {
                                alt5=17;
                            }
                            else {
                                alt5=16;
                            }
                            }
                            break;
                        default:
                            alt5=17;
                        }

                    }
                    else {
                        alt5=17;
                    }
                }
                else {
                    alt5=17;
                }
            }
            else {
                alt5=17;
            }
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=17;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt5=18;
            }
            break;
        case '/':
            {
            int LA5_14 = input.LA(2);

            if ( (LA5_14=='*') ) {
                alt5=19;
            }
            else if ( (LA5_14=='/') ) {
                alt5=20;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 14, input);

                throw nvae;

            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // ModuleType.g:1:10: COLON
                {
                mCOLON(); 


                }
                break;
            case 2 :
                // ModuleType.g:1:16: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 3 :
                // ModuleType.g:1:22: INT16
                {
                mINT16(); 


                }
                break;
            case 4 :
                // ModuleType.g:1:28: INT32
                {
                mINT32(); 


                }
                break;
            case 5 :
                // ModuleType.g:1:34: INT8
                {
                mINT8(); 


                }
                break;
            case 6 :
                // ModuleType.g:1:39: LANGLE
                {
                mLANGLE(); 


                }
                break;
            case 7 :
                // ModuleType.g:1:46: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 8 :
                // ModuleType.g:1:53: LPARENS
                {
                mLPARENS(); 


                }
                break;
            case 9 :
                // ModuleType.g:1:61: RANGLE
                {
                mRANGLE(); 


                }
                break;
            case 10 :
                // ModuleType.g:1:68: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 11 :
                // ModuleType.g:1:75: RPARENS
                {
                mRPARENS(); 


                }
                break;
            case 12 :
                // ModuleType.g:1:83: SEMI
                {
                mSEMI(); 


                }
                break;
            case 13 :
                // ModuleType.g:1:88: SUBTYPE
                {
                mSUBTYPE(); 


                }
                break;
            case 14 :
                // ModuleType.g:1:96: UINT16
                {
                mUINT16(); 


                }
                break;
            case 15 :
                // ModuleType.g:1:103: UINT32
                {
                mUINT32(); 


                }
                break;
            case 16 :
                // ModuleType.g:1:110: UINT8
                {
                mUINT8(); 


                }
                break;
            case 17 :
                // ModuleType.g:1:116: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 18 :
                // ModuleType.g:1:127: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 19 :
                // ModuleType.g:1:138: COMMENT1
                {
                mCOMMENT1(); 


                }
                break;
            case 20 :
                // ModuleType.g:1:147: COMMENT2
                {
                mCOMMENT2(); 


                }
                break;

        }

    }


 

}