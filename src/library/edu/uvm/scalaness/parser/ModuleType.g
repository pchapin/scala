grammar ModuleType;

options {
    backtrack = true;
    memoize   = true;
    output    = AST;
}

tokens {
    // Types
    VOID   = 'Void';
    INT8   = 'Int8';
    INT16  = 'Int16';
    INT32  = 'Int32';
    UINT8  = 'UInt8';
    UINT16 = 'UInt16';
    UINT32 = 'UInt32';
    
    // Punctuators
    COLON   = ':';
    COMMA   = ',';
    LANGLE  = '<';
    LBRACE  = '{';
    LPARENS = '(';
    RANGLE  = '>';
    RBRACE  = '}';
    RPARENS = ')';
    SEMI    = ';';
    SUBTYPE = '<:';
    
    // Pseudo-tokens used during AST construction.
    EXISTENTIAL_LIST;
    EXPORT_LIST;
    FUNCTION_DECLARATION;
    IMPORT_LIST;
    MODULE_TYPE;
    PARAMETER_LIST;
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
    :   IDENTIFIER '<:'^ type_name;

simple_declaration_list
    :    simple_declaration (','! simple_declaration)*;

simple_declaration
    :    IDENTIFIER ':'^ generalized_type_name;

function_declaration_list
    :    function_declaration (','! function_declaration)*;

function_declaration
    :    name=IDENTIFIER '(' simple_declaration_list? ')' ':' return_type=generalized_type_name
         -> ^(FUNCTION_DECLARATION $name $return_type simple_declaration_list?);

type_name
    :    VOID
    |    INT8
    |    INT16
    |    INT32
    |    UINT8
    |    UINT16
    |    UINT32;

generalized_type_name
    :    type_name | IDENTIFIER;

/* =========== */
/* Lexer rules */
/* =========== */

IDENTIFIER
    :    ('_' | 'a' .. 'z' | 'A' .. 'Z') ('_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9')*;
    
WHITESPACE
    :    ( '\t' | ' ' | '\r' | '\n' | '\\n' | '\f' | '"')+  {$channel = HIDDEN;};
    
COMMENT1
    :    '/*' (options {greedy=false;} : .)* '*/' {$channel = HIDDEN;};
    
COMMENT2
    :    '//' (options {greedy=false;} : .)* ('\r' | '\n') {$channel = HIDDEN;};
