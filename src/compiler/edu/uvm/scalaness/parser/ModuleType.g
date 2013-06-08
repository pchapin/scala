grammar ModuleType;

options {
    // backtrack  = true;
    // memoize    = true;
    output     = AST;
}

tokens {
    // Types
    VOID       = 'Void';
    INT8       = 'Int8';
    INT16      = 'Int16';
    INT32      = 'Int32';
    UINT8      = 'UInt8';
    UINT16     = 'UInt16';
    UINT32     = 'UInt32';
    ERRORT     = 'ErrorT';

    // Keywords
    ARRAY      = 'Array';
    POINTER_TO = 'PointerTo';
    
    // Punctuators
    COLON      = ':';
    COMMA      = ',';
    LANGLE     = '<';
    LBRACE     = '{';
    LBRACKET   = '[';
    LPARENS    = '(';
    RANGLE     = '>';
    RBRACE     = '}';
    RBRACKET   = ']';
    RPARENS    = ')';
    SEMI       = ';';
    SUBTYPE    = '<:';
    
    // Pseudo-tokens used during AST construction.
    EXISTENTIAL_LIST;
    EXPORT_LIST;
    FUNCTION_DECLARATION;
    IMPORT_LIST;
    MODULE_TYPE;
    PARAMETER_LIST;
    STRUCTURE;
    TYPE_PARAMETER_LIST;
    VALUE_PARAMETER_LIST;
}

@parser::header {
    package edu.uvm.scalaness.parser;
}

@lexer::header {
    package edu.uvm.scalaness.parser;
}

@parser::members {
    // This is mostly just a placeholder.
    private final int VERSION = 1;

    // Provide more detailed error messages for debugging. This is from Definitive ANTLR. This
    // is useful for grammer debugging but should be changed for "production" use.
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
}

@parser::rulecatch {
    catch (RecognitionException e) {
        throw e;
    }
}

@lexer::members {
    // This is mostly just a placeholder.
    private final int VERSION = 1;
}

/* ============ */
/* Main Grammar */
/* ============ */

module_type
    :    '{' existential_list '}'
         '<' type_parameter_list ';' value_parameter_list '>'
         '{' import_list ';' export_list '}' EOF
    -> ^(MODULE_TYPE existential_list
                     type_parameter_list
                     value_parameter_list
                     import_list
                     export_list);

existential_list
    :    coercion_list? -> ^(EXISTENTIAL_LIST coercion_list?);

type_parameter_list
    :    coercion_list? -> ^(TYPE_PARAMETER_LIST coercion_list?);

value_parameter_list
    :    simple_declaration_list? -> ^(VALUE_PARAMETER_LIST simple_declaration_list?);

import_list
    :    function_declaration_list? -> ^(IMPORT_LIST function_declaration_list?);

export_list
    :    function_declaration_list? -> ^(EXPORT_LIST function_declaration_list?);

coercion_list
    :   coercion (','! coercion)*;

coercion
    :   IDENTIFIER '<:'^ primitive_type_name;

simple_declaration_list
    :    simple_declaration (','! simple_declaration)*;

simple_declaration
    :    IDENTIFIER ':'^ type_specifier;

function_declaration_list
    :    function_declaration (','! function_declaration)*;

function_declaration
    :    name=IDENTIFIER '(' simple_declaration_list? ')' ':' return_type
         -> ^(FUNCTION_DECLARATION $name return_type simple_declaration_list?);

// We forbid returning arrays in the syntax.
return_type
    :    generalized_type_name
    |    POINTER_TO '[' return_type ']' -> ^(POINTER_TO return_type)
    |    structure_type;

// TODO: Arrays of arrays are allowed but there is currently no place to specify array size.
type_specifier
    :    generalized_type_name
    |    ARRAY '[' type_specifier (',' NUMBER)? ']' -> ^(ARRAY type_specifier NUMBER?)
    |    POINTER_TO '[' type_specifier ']' -> ^(POINTER_TO type_specifier)
    |    structure_type;

structure_type
    :    IDENTIFIER '{' simple_declaration_list? '}'
         -> ^(STRUCTURE IDENTIFIER simple_declaration_list?);

generalized_type_name
    :    primitive_type_name | IDENTIFIER;

primitive_type_name
    :    VOID
    |    INT8
    |    INT16
    |    INT32
    |    UINT8
    |    UINT16
    |    UINT32
    |    ERRORT;

/* =========== */
/* Lexer rules */
/* =========== */

IDENTIFIER
    :    ('_' | 'a' .. 'z' | 'A' .. 'Z') ('_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9')*;

NUMBER
    :    ('0' .. '9')+;
    
WHITESPACE
    :    ( '\t' | ' ' | '\r' | '\n' | '\\n' | '\f' | '"')+  {$channel = HIDDEN;};
    
COMMENT1
    :    '/*' (options {greedy=false;} : .)* '*/' {$channel = HIDDEN;};
    
COMMENT2
    :    '//' (options {greedy=false;} : .)* ('\r' | '\n') {$channel = HIDDEN;};
