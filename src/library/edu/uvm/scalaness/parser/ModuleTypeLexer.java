// $ANTLR 3.4 ModuleType.g 2012-10-09 19:20:27

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
    public static final int ERRORT=8;
    public static final int EXISTENTIAL_LIST=9;
    public static final int EXPORT_LIST=10;
    public static final int FUNCTION_DECLARATION=11;
    public static final int IDENTIFIER=12;
    public static final int IMPORT_LIST=13;
    public static final int INT16=14;
    public static final int INT32=15;
    public static final int INT8=16;
    public static final int LANGLE=17;
    public static final int LBRACE=18;
    public static final int LPARENS=19;
    public static final int MODULE_TYPE=20;
    public static final int PARAMETER_LIST=21;
    public static final int RANGLE=22;
    public static final int RBRACE=23;
    public static final int RPARENS=24;
    public static final int SEMI=25;
    public static final int SUBTYPE=26;
    public static final int TYPE_PARAMETER_LIST=27;
    public static final int UINT16=28;
    public static final int UINT32=29;
    public static final int UINT8=30;
    public static final int VALUE_PARAMETER_LIST=31;
    public static final int VOID=32;
    public static final int WHITESPACE=33;

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

    // $ANTLR start "ERRORT"
    public final void mERRORT() throws RecognitionException {
        try {
            int _type = ERRORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ModuleType.g:12:8: ( 'ErrorT' )
            // ModuleType.g:12:10: 'ErrorT'
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
            // ModuleType.g:13:7: ( 'Int16' )
            // ModuleType.g:13:9: 'Int16'
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
            // ModuleType.g:14:7: ( 'Int32' )
            // ModuleType.g:14:9: 'Int32'
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
            // ModuleType.g:15:6: ( 'Int8' )
            // ModuleType.g:15:8: 'Int8'
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
            // ModuleType.g:16:8: ( '<' )
            // ModuleType.g:16:10: '<'
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
            // ModuleType.g:17:8: ( '{' )
            // ModuleType.g:17:10: '{'
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
            // ModuleType.g:18:9: ( '(' )
            // ModuleType.g:18:11: '('
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
            // ModuleType.g:19:8: ( '>' )
            // ModuleType.g:19:10: '>'
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
            // ModuleType.g:20:8: ( '}' )
            // ModuleType.g:20:10: '}'
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
            // ModuleType.g:21:9: ( ')' )
            // ModuleType.g:21:11: ')'
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
            // ModuleType.g:22:6: ( ';' )
            // ModuleType.g:22:8: ';'
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
            // ModuleType.g:23:9: ( '<:' )
            // ModuleType.g:23:11: '<:'
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
            // ModuleType.g:24:8: ( 'UInt16' )
            // ModuleType.g:24:10: 'UInt16'
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
            // ModuleType.g:25:8: ( 'UInt32' )
            // ModuleType.g:25:10: 'UInt32'
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
            // ModuleType.g:26:7: ( 'UInt8' )
            // ModuleType.g:26:9: 'UInt8'
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
            // ModuleType.g:27:6: ( 'Void' )
            // ModuleType.g:27:8: 'Void'
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
            // ModuleType.g:173:5: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ModuleType.g:173:10: ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // ModuleType.g:173:42: ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // ModuleType.g:176:5: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\\\n' | '\\f' | '\"' )+ )
            // ModuleType.g:176:10: ( '\\t' | ' ' | '\\r' | '\\n' | '\\\\n' | '\\f' | '\"' )+
            {
            // ModuleType.g:176:10: ( '\\t' | ' ' | '\\r' | '\\n' | '\\\\n' | '\\f' | '\"' )+
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
            	    // ModuleType.g:176:12: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 2 :
            	    // ModuleType.g:176:19: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 3 :
            	    // ModuleType.g:176:25: '\\r'
            	    {
            	    match('\r'); 

            	    }
            	    break;
            	case 4 :
            	    // ModuleType.g:176:32: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 5 :
            	    // ModuleType.g:176:39: '\\\\n'
            	    {
            	    match("\\n"); 



            	    }
            	    break;
            	case 6 :
            	    // ModuleType.g:176:47: '\\f'
            	    {
            	    match('\f'); 

            	    }
            	    break;
            	case 7 :
            	    // ModuleType.g:176:54: '\"'
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
            // ModuleType.g:179:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ModuleType.g:179:10: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // ModuleType.g:179:15: ( options {greedy=false; } : . )*
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
            	    // ModuleType.g:179:42: .
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
            // ModuleType.g:182:5: ( '//' ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) )
            // ModuleType.g:182:10: '//' ( options {greedy=false; } : . )* ( '\\r' | '\\n' )
            {
            match("//"); 



            // ModuleType.g:182:15: ( options {greedy=false; } : . )*
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
            	    // ModuleType.g:182:42: .
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
        // ModuleType.g:1:8: ( COLON | COMMA | ERRORT | INT16 | INT32 | INT8 | LANGLE | LBRACE | LPARENS | RANGLE | RBRACE | RPARENS | SEMI | SUBTYPE | UINT16 | UINT32 | UINT8 | VOID | IDENTIFIER | WHITESPACE | COMMENT1 | COMMENT2 )
        int alt5=22;
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
        case 'E':
            {
            int LA5_3 = input.LA(2);

            if ( (LA5_3=='r') ) {
                int LA5_17 = input.LA(3);

                if ( (LA5_17=='r') ) {
                    int LA5_25 = input.LA(4);

                    if ( (LA5_25=='o') ) {
                        int LA5_29 = input.LA(5);

                        if ( (LA5_29=='r') ) {
                            int LA5_35 = input.LA(6);

                            if ( (LA5_35=='T') ) {
                                int LA5_43 = input.LA(7);

                                if ( ((LA5_43 >= '0' && LA5_43 <= '9')||(LA5_43 >= 'A' && LA5_43 <= 'Z')||LA5_43=='_'||(LA5_43 >= 'a' && LA5_43 <= 'z')) ) {
                                    alt5=19;
                                }
                                else {
                                    alt5=3;
                                }
                            }
                            else {
                                alt5=19;
                            }
                        }
                        else {
                            alt5=19;
                        }
                    }
                    else {
                        alt5=19;
                    }
                }
                else {
                    alt5=19;
                }
            }
            else {
                alt5=19;
            }
            }
            break;
        case 'I':
            {
            int LA5_4 = input.LA(2);

            if ( (LA5_4=='n') ) {
                int LA5_18 = input.LA(3);

                if ( (LA5_18=='t') ) {
                    switch ( input.LA(4) ) {
                    case '1':
                        {
                        int LA5_30 = input.LA(5);

                        if ( (LA5_30=='6') ) {
                            int LA5_36 = input.LA(6);

                            if ( ((LA5_36 >= '0' && LA5_36 <= '9')||(LA5_36 >= 'A' && LA5_36 <= 'Z')||LA5_36=='_'||(LA5_36 >= 'a' && LA5_36 <= 'z')) ) {
                                alt5=19;
                            }
                            else {
                                alt5=4;
                            }
                        }
                        else {
                            alt5=19;
                        }
                        }
                        break;
                    case '3':
                        {
                        int LA5_31 = input.LA(5);

                        if ( (LA5_31=='2') ) {
                            int LA5_37 = input.LA(6);

                            if ( ((LA5_37 >= '0' && LA5_37 <= '9')||(LA5_37 >= 'A' && LA5_37 <= 'Z')||LA5_37=='_'||(LA5_37 >= 'a' && LA5_37 <= 'z')) ) {
                                alt5=19;
                            }
                            else {
                                alt5=5;
                            }
                        }
                        else {
                            alt5=19;
                        }
                        }
                        break;
                    case '8':
                        {
                        int LA5_32 = input.LA(5);

                        if ( ((LA5_32 >= '0' && LA5_32 <= '9')||(LA5_32 >= 'A' && LA5_32 <= 'Z')||LA5_32=='_'||(LA5_32 >= 'a' && LA5_32 <= 'z')) ) {
                            alt5=19;
                        }
                        else {
                            alt5=6;
                        }
                        }
                        break;
                    default:
                        alt5=19;
                    }

                }
                else {
                    alt5=19;
                }
            }
            else {
                alt5=19;
            }
            }
            break;
        case '<':
            {
            int LA5_5 = input.LA(2);

            if ( (LA5_5==':') ) {
                alt5=14;
            }
            else {
                alt5=7;
            }
            }
            break;
        case '{':
            {
            alt5=8;
            }
            break;
        case '(':
            {
            alt5=9;
            }
            break;
        case '>':
            {
            alt5=10;
            }
            break;
        case '}':
            {
            alt5=11;
            }
            break;
        case ')':
            {
            alt5=12;
            }
            break;
        case ';':
            {
            alt5=13;
            }
            break;
        case 'U':
            {
            int LA5_12 = input.LA(2);

            if ( (LA5_12=='I') ) {
                int LA5_21 = input.LA(3);

                if ( (LA5_21=='n') ) {
                    int LA5_27 = input.LA(4);

                    if ( (LA5_27=='t') ) {
                        switch ( input.LA(5) ) {
                        case '1':
                            {
                            int LA5_39 = input.LA(6);

                            if ( (LA5_39=='6') ) {
                                int LA5_46 = input.LA(7);

                                if ( ((LA5_46 >= '0' && LA5_46 <= '9')||(LA5_46 >= 'A' && LA5_46 <= 'Z')||LA5_46=='_'||(LA5_46 >= 'a' && LA5_46 <= 'z')) ) {
                                    alt5=19;
                                }
                                else {
                                    alt5=15;
                                }
                            }
                            else {
                                alt5=19;
                            }
                            }
                            break;
                        case '3':
                            {
                            int LA5_40 = input.LA(6);

                            if ( (LA5_40=='2') ) {
                                int LA5_47 = input.LA(7);

                                if ( ((LA5_47 >= '0' && LA5_47 <= '9')||(LA5_47 >= 'A' && LA5_47 <= 'Z')||LA5_47=='_'||(LA5_47 >= 'a' && LA5_47 <= 'z')) ) {
                                    alt5=19;
                                }
                                else {
                                    alt5=16;
                                }
                            }
                            else {
                                alt5=19;
                            }
                            }
                            break;
                        case '8':
                            {
                            int LA5_41 = input.LA(6);

                            if ( ((LA5_41 >= '0' && LA5_41 <= '9')||(LA5_41 >= 'A' && LA5_41 <= 'Z')||LA5_41=='_'||(LA5_41 >= 'a' && LA5_41 <= 'z')) ) {
                                alt5=19;
                            }
                            else {
                                alt5=17;
                            }
                            }
                            break;
                        default:
                            alt5=19;
                        }

                    }
                    else {
                        alt5=19;
                    }
                }
                else {
                    alt5=19;
                }
            }
            else {
                alt5=19;
            }
            }
            break;
        case 'V':
            {
            int LA5_13 = input.LA(2);

            if ( (LA5_13=='o') ) {
                int LA5_22 = input.LA(3);

                if ( (LA5_22=='i') ) {
                    int LA5_28 = input.LA(4);

                    if ( (LA5_28=='d') ) {
                        int LA5_34 = input.LA(5);

                        if ( ((LA5_34 >= '0' && LA5_34 <= '9')||(LA5_34 >= 'A' && LA5_34 <= 'Z')||LA5_34=='_'||(LA5_34 >= 'a' && LA5_34 <= 'z')) ) {
                            alt5=19;
                        }
                        else {
                            alt5=18;
                        }
                    }
                    else {
                        alt5=19;
                    }
                }
                else {
                    alt5=19;
                }
            }
            else {
                alt5=19;
            }
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
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
            alt5=19;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
        case '\"':
        case '\\':
            {
            alt5=20;
            }
            break;
        case '/':
            {
            int LA5_16 = input.LA(2);

            if ( (LA5_16=='*') ) {
                alt5=21;
            }
            else if ( (LA5_16=='/') ) {
                alt5=22;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 16, input);

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
                // ModuleType.g:1:22: ERRORT
                {
                mERRORT(); 


                }
                break;
            case 4 :
                // ModuleType.g:1:29: INT16
                {
                mINT16(); 


                }
                break;
            case 5 :
                // ModuleType.g:1:35: INT32
                {
                mINT32(); 


                }
                break;
            case 6 :
                // ModuleType.g:1:41: INT8
                {
                mINT8(); 


                }
                break;
            case 7 :
                // ModuleType.g:1:46: LANGLE
                {
                mLANGLE(); 


                }
                break;
            case 8 :
                // ModuleType.g:1:53: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 9 :
                // ModuleType.g:1:60: LPARENS
                {
                mLPARENS(); 


                }
                break;
            case 10 :
                // ModuleType.g:1:68: RANGLE
                {
                mRANGLE(); 


                }
                break;
            case 11 :
                // ModuleType.g:1:75: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 12 :
                // ModuleType.g:1:82: RPARENS
                {
                mRPARENS(); 


                }
                break;
            case 13 :
                // ModuleType.g:1:90: SEMI
                {
                mSEMI(); 


                }
                break;
            case 14 :
                // ModuleType.g:1:95: SUBTYPE
                {
                mSUBTYPE(); 


                }
                break;
            case 15 :
                // ModuleType.g:1:103: UINT16
                {
                mUINT16(); 


                }
                break;
            case 16 :
                // ModuleType.g:1:110: UINT32
                {
                mUINT32(); 


                }
                break;
            case 17 :
                // ModuleType.g:1:117: UINT8
                {
                mUINT8(); 


                }
                break;
            case 18 :
                // ModuleType.g:1:123: VOID
                {
                mVOID(); 


                }
                break;
            case 19 :
                // ModuleType.g:1:128: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 20 :
                // ModuleType.g:1:139: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 21 :
                // ModuleType.g:1:150: COMMENT1
                {
                mCOMMENT1(); 


                }
                break;
            case 22 :
                // ModuleType.g:1:159: COMMENT2
                {
                mCOMMENT2(); 


                }
                break;

        }

    }


 

}