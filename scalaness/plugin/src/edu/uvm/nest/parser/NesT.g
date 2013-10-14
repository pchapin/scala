grammar NesT;

options {
    backtrack = true;
    memoize   = true;
    output    = AST;
}

tokens {
    // Tokens needed from standard C.
    CASE           = 'case';
    CHAR           = 'char';
    CONST          = 'const';
    DEFAULT        = 'default';
    ELSE           = 'else';
    ENUM           = 'enum';
    FOR            = 'for';
    IF             = 'if';
    INT            = 'int';
    LONG           = 'long';
    NX_STRUCT      = 'nx_struct';
    RETURN         = 'return';
    SHORT          = 'short';
    SIGNED         = 'signed';
    SIZEOF         = 'sizeof';
    STRUCT         = 'struct';
    SWITCH         = 'switch';
    TYPEDEF        = 'typedef';
    UNSIGNED       = 'unsigned';
    VOID           = 'void';
    WHILE          = 'while';
    
    // These type names are treated as if built-in.
    INT8_T         = 'int8_t';
    INT16_T        = 'int16_t';
    INT32_T        = 'int32_t';
    UINT8_T        = 'uint8_t';
    UINT16_T       = 'uint16_t';
    UINT32_T       = 'uint32_t';
    NX_UINT8_T     = 'nx_uint8_t';
    NX_UINT16_T    = 'nx_uint16_t';
    NX_UINT32_T    = 'nx_uint32_t';
    ERROR_T        = 'error_t';
    
    // nesC extensions to Standard C
    CALL           = 'call';
    COMMAND        = 'command';
    EVENT          = 'event';
    IMPLEMENTATION = 'implementation';
    INTERFACE      = 'interface';
    MODULE         = 'module';
    POST           = 'post';
    PROVIDES       = 'provides';
    TASK           = 'task';
    USES           = 'uses';
    
    // Punctuators
    AMP            = '&';
    AND            = '&&';
    ARRAYINC       = '|>';
    ARROW          = '->';
    ASSIGN         = '=';
    BITANDASSIGN   = '&=';
    BITCOMPLEMENT  = '~';
    BITOR          = '|';
    BITORASSIGN    = '|=';
    BITXOR         = '^';
    BITXORASSIGN   = '^=';
    COMMA          = ',';
    DIVASSIGN      = '/=';
    DIVIDE         = '/';
    DOT            = '.';
    EQUAL          = '==';
    GREATER        = '>';
    GREATEREQUAL   = '>=';
    HASH           = '#';
    LBRACE         = '{';
    LBRACKET       = '[';
    LESS           = '<';
    LESSEQUAL      = '<=';
    LPARENS        = '(';
    LSHIFT         = '<<';
    LSHIFTASSIGN   = '<<=';
    MINUS          = '-';
    MINUSASSIGN    = '-=';
    MINUSMINUS     = '--';
    MODASSIGN      = '%=';
    MODULUS        = '%';
    MULASSIGN      = '*=';
    NOT            = '!';
    NOTEQUAL       = '!=';
    OR             = '||';
    PLUS           = '+';
    PLUSASSIGN     = '+=';
    PLUSPLUS       = '++';
    RBRACE         = '}';
    RBRACKET       = ']';
    RPARENS        = ')';
    RSHIFT         = '>>';
    RSHIFTASSIGN   = '>>=';
    STAR           = '*';    // This token has multiple semantic purposes.
    
    // Pseudo-tokens used during AST construction.
    ADDRESS_OF;
    ARGUMENT_LIST;
    ARRAY_ELEMENT_SELECTION;
    CAST;
    COMPOUND_STATEMENT;
    DECLARATION;
    DECLARATOR;
    DECLARATOR_ARRAY_MODIFIER;
    DECLARATOR_LIST;
    DECLARATOR_PARAMETER_LIST_MODIFIER;
    DEREFERENCE;
    ENUMERATOR;
    FILE;
    FOR_INITIALIZE;
    FOR_CONDITION;
    FOR_ITERATION;
    FUNCTION_DEFINITION;
    IDENTIFIER_PATH;
    INIT_DECLARATOR;
    INITIALIZER_LIST;
    LINE_DIRECTIVE;
    NULL;             // Used as a placeholder during tree manipulations by others.
    PARAMETER;
    PARAMETER_LIST;
    POINTER_QUALIFIER;
    POST_DECREMENT;
    POST_INCREMENT;
    POSTFIX_EXPRESSION;
    PRE_DECREMENT;
    PRE_INCREMENT;
    SIZEOF_TYPE;
    SIZEOF_EXPRESSION;
    SPECIFICATION;
    STATEMENT;
    UNARY_PLUS;
    UNARY_MINUS;
}

@parser::header {
    package edu.uvm.nest.parser;
    import java.util.LinkedList;
}

@lexer::header {
    package edu.uvm.nest.parser;
}

@parser::members {
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
}

// @parser::rulecatch {
//     catch (RecognitionException e) {
//         throw e;
//     }
// }

@lexer::members {
    // This is mostly just a placeholder.
    private final int VERSION = 1;
}

/* ================= */
/* Exression grammar */
/* ================= */

primary_expression
    :    identifier
    |    CONSTANT
    |    STRING_LITERAL
    |    CHARACTER_LITERAL
    |    '(' expression ')' -> expression;

// NOTE: This grammar is rather permissive about where call_kind can occur.
//
// The POSTFIX_EXPRESSION pseudo-token is needed to group all the postfix_expression_modifiers
// together with their primary_expression. This is required so that one postfix_expression can
// be distinguished from another in the ASTs for the various binary operators.
//
postfix_expression
    :    call_kind? primary_expression postfix_expression_modifier*
            -> ^(POSTFIX_EXPRESSION call_kind? primary_expression postfix_expression_modifier*);

postfix_expression_modifier
    :   '[' expression ']' -> ^(ARRAY_ELEMENT_SELECTION expression)
    |   '(' argument_expression_list? ')' -> ^(ARGUMENT_LIST argument_expression_list?)
    |   '.' identifier -> ^('.' identifier)
    |   '->' identifier -> ^('->' identifier)
    |   '++'
    |   '--';

call_kind
    :    CALL
    |    POST;
        
argument_expression_list
    :    assignment_expression (','! assignment_expression)*;
    
unary_expression
    :    '++' unary_expression -> ^(PRE_INCREMENT unary_expression)
    |    '--' unary_expression -> ^(PRE_DECREMENT unary_expression)
    |    '&'  cast_expression  -> ^(ADDRESS_OF    cast_expression )
    |    '*'  cast_expression  -> ^(DEREFERENCE   cast_expression )
    |    '+'  cast_expression  -> ^(UNARY_PLUS    cast_expression )
    |    '-'  cast_expression  -> ^(UNARY_MINUS   cast_expression )
    |    ('~'^ | '!'^) cast_expression
    |    SIZEOF '(' type_name ')' -> ^(SIZEOF_TYPE type_name)
    |    SIZEOF unary_expression  -> ^(SIZEOF_EXPRESSION unary_expression)
    |    postfix_expression;
    
// It is convenient to put the cast_expression first in the AST because that way the various
// tokens composing the type_name do not have to be wrapped in a pseudo-token. Note that the
// expression should be entirely contained inside its own tree.
//
cast_expression
    :    '(' type_name ')' cast_expression -> ^(CAST cast_expression type_name)
    |    unary_expression;

arrayinc_expression
    :    cast_expression ( '|>'^ cast_expression)*;
    
multiplicative_expression
    :    arrayinc_expression ( ('*'^ | '/'^ | '%'^) arrayinc_expression)*;
    
additive_expression
    :    multiplicative_expression ( ('+'^ | '-'^) multiplicative_expression)*;
    
shift_expression
    :    additive_expression ( ('<<'^ | '>>'^) additive_expression)*;
    
relational_expression
    :    shift_expression ( ('<'^ | '>'^ | '<='^ | '>='^) shift_expression)*;
    
equality_expression
    :    relational_expression ( ('=='^ | '!='^) relational_expression)*;
    
and_expression
    :    equality_expression ( '&'^ equality_expression)*;
    
xor_expression
    :    and_expression ( '^'^ and_expression)*;
    
or_expression
    :    xor_expression ( '|'^ xor_expression)*;
    
logical_and_expression
    :    or_expression ( '&&'^ or_expression)*;
    
logical_or_expression
    :    logical_and_expression ( '||'^ logical_and_expression)*;
    
conditional_expression
    :    logical_or_expression ('?'^ expression ':'! conditional_expression)?;
    
assignment_expression
    :    unary_expression ('='^ | '*='^ | '/='^ | '%='^ | '+='^ | '-='^ | '<<='^ | '>>='^ | '&='^ | '^='^ | '|='^) assignment_expression
    |    conditional_expression;
    
expression
    :    assignment_expression (','^ assignment_expression)*;
    
constant_expression
    :    conditional_expression;
    
/* =================== */
/* Declaration grammar */
/* =================== */

// This grammar allows nested function definitions. They need to be semantically excluded.
// This was done so that all declarations are produced by a single rule where the declaredNames
// variable is defined. Thus all declarators encountered will be able to use declaredNames
// without issue.
//
// The DECLARATION pseudo-token is needed to clearly distinguish declarations from expression
// statements (which are marked with the STATEMENT pseudo-token).
//    
// The FUNCTION_DEFINITION pseudo-token is needed to distinguish function definitions from other
// kinds of declarations. This is necessary because, during rewriting, function definitions are
// not terminated with a ';' while other kinds of declarations are so terminated.
//
declaration
scope { LinkedList<String> declaredNames;
        boolean inStructDeclaration; }
    :    { $declaration::declaredNames = new LinkedList<String>();
           $declaration::inStructDeclaration = false;
         }
         // The init_declarator_list is optional because of, for example, structure definitions.
         declaration_specifiers init_declarator_list? ';'
             {
               // Inefficient, but how many declarators will be in a declaration, honestly?
               for (int i = 0; i < $declaration::declaredNames.size(); ++i) {
                   symbols.addIdentifier($declaration::declaredNames.get(i));
               }
             }
             -> ^(DECLARATION declaration_specifiers init_declarator_list?)

    |    { $declaration::declaredNames = new LinkedList<String>();
           $declaration::inStructDeclaration = false;
         }
         function_definition -> ^(DECLARATION ^(FUNCTION_DEFINITION function_definition))
         // TODO: Add function names to the list of ordinary (non-type) names in the symbol table.

    |    { $declaration::declaredNames = new LinkedList<String>();
           $declaration::inStructDeclaration = false;
         }
         TYPEDEF declaration_specifiers init_declarator_list ';'
             {
               // Inefficient, but how many declarators will be in a declaration, honestly?
               for (int i = 0; i < $declaration::declaredNames.size(); ++i) {
                   symbols.addType($declaration::declaredNames.get(i));
               }
             }
             -> ^(DECLARATION TYPEDEF declaration_specifiers init_declarator_list);
    
declaration_specifiers
    :    (storage_class_specifier |
          type_specifier          |
          type_qualifier          |
          DEFAULT)+;
  
// The DECLARATOR_LIST pseudo-token is needed as a container for a list of declarators. This
// is needed to distinguish the declarators in a declaration from the various declaration
// specifiers that preceed them.
//  
init_declarator_list
    :    init_declarator (',' init_declarator)* -> ^(DECLARATOR_LIST init_declarator+);
    
// The INIT_DECLARATOR pseudo-token is needed to package (declarator, initializer) pairs so
// that commas can be inserted into rewritten declarations properly. They also help to
// distinguish initializers from declarators.
//
init_declarator
    :    declarator ('=' initializer)? -> ^(INIT_DECLARATOR declarator initializer?);
    
storage_class_specifier
    :    COMMAND
    |    EVENT
    |    TASK;
    
type_specifier
    :   VOID
    |   CHAR
    |   SHORT
    |   INT
    |   LONG
    |   SIGNED
    |   UNSIGNED
    |   INT8_T            // Temporary hack?  These types are currently treated as built-in.
    |   INT16_T           // Temporary hack?
    |   INT32_T           // Temporary hack?
    |   UINT8_T           // Temporary hack?
    |   UINT16_T          // Temporary hack?
    |   UINT32_T          // Temporary hack?
    |   NX_UINT8_T        // Temporary hack?
    |   NX_UINT16_T       // Temporary hack?
    |   NX_UINT32_T       // Temporary hack?
    |   ERROR_T           // Temporary hack?
    |   struct_or_union_specifier
    |   enum_specifier
    |   typedef_name;

struct_or_union_specifier
    :    struct_or_union identifier? '{' struct_declaration_list '}'
            -> ^(struct_or_union identifier? struct_declaration_list)
    |    struct_or_union identifier
            -> ^(struct_or_union identifier);
    
// Unions are not actually supported. The 'or_union' is retained for future reference.
struct_or_union
    :    STRUCT
    |    NX_STRUCT;

// BUG: If structure declarations are nested the value of inStructDeclaration is mishandled when
// the inner declaration is left.
//
struct_declaration_list
    :    { $declaration::inStructDeclaration = true; }
         struct_declaration+
         { $declaration::inStructDeclaration = false; };
    
struct_declaration
    :    specifier_qualifier_list struct_declarator_list ';'
            -> ^(DECLARATION specifier_qualifier_list struct_declarator_list);
// I'm not sure what language features these productions are intended to support.
//    |    declarator ';'
//            -> ^(DECLARATION declarator)
//    |    declarator ':' constant_expression ';'
//            -> ^(DECLARATION declarator constant_expression);
    
specifier_qualifier_list
    :    (type_specifier | type_qualifier)+;
    
// Reuse the DECLARATOR_LIST pseudo-token here to wrap declarator lists in structure
// definitions. In this case the declarators are directly beneath the DECLARATOR_LIST token
// rather than being wrapped inside INIT_DECLARATOR tokens as is done with ordinary
// declarations.
//
struct_declarator_list
    :    struct_declarator (',' struct_declarator)* -> ^(DECLARATOR_LIST struct_declarator+);
    
struct_declarator
    :    declarator? ':' constant_expression
    |    declarator;
    
enum_specifier
    :    ENUM identifier? '{' enumerator_list ','? '}'
             -> ^(ENUM identifier? enumerator_list)
    |    ENUM identifier '{' enumerator_list ','? '}'
             -> ^(ENUM identifier enumerator_list)
    |    ENUM identifier
             -> ^(ENUM identifier);
    
enumerator_list
    :    enumerator (','! enumerator)*;
    
// The ENUMERATOR pseudo-token is needed to wrap up an enumerator name with its value (if one
// is provided. Otherwise the names and values are not easy to distinguish when they appear in
// an enumerator_list.
//
enumerator
    :    identifier ('=' constant_expression)? -> ^(ENUMERATOR identifier constant_expression?);    

type_qualifier
    :    CONST;
    
declarator
    :    pointer? direct_declarator -> ^(DECLARATOR pointer? direct_declarator);

direct_declarator
    :   direct_declarator_identifier direct_declarator_modifier*;

// The IDENTIFIER_PATH pseudo-token is needed to group the identifiers that comprise a qualified
// name. This keeps them nicely separated from the other entities in the declarations where they
// are used. Strictly speaking this pseudo-token is probably not necessary, but it makes things
// a little easier.
//
// BUG? The code here avoids adding direct_declarator_identifiers for structure members to the
// declaredNames list. This is fine, but shouldn't direct_declarator_identifiers inside function
// parameter lists also be skipped?
//
direct_declarator_identifier
    :   myIdName=identifier ('.' identifier)?
            { if (!$declaration::inStructDeclaration) {
                  $declaration::declaredNames.add($myIdName.text);
              }
            } -> ^(IDENTIFIER_PATH identifier+)
    |   '(' declarator ')' -> declarator;

// Pseudo-tokens are needed to distinguish between declarator modifies that otherwise have
// subtle syntactic differences. There is no other regular token that can be naturally used
// to distinguish these differences.
//
direct_declarator_modifier
    :   '[' constant_expression? ']'
            -> ^(DECLARATOR_ARRAY_MODIFIER constant_expression?)
    |   ('[' gen=parameter_type_list ']')? '(' normal=parameter_type_list ')'
            -> ^(DECLARATOR_PARAMETER_LIST_MODIFIER $normal);

// The POINTER_QUALIFIER pseudo-token is needed to distinguish the use of '*' in declarations
// from its use in expressions. The rewriting associated with pointer declarations is quite
// different than what is done in expressions (particularly multiplication!).
//    
pointer
    :    '*' type_qualifier_list? pointer -> ^(POINTER_QUALIFIER type_qualifier_list? pointer)
    |    '*' type_qualifier_list? -> ^(POINTER_QUALIFIER type_qualifier_list?);
    
type_qualifier_list
    :    type_qualifier+;
    
// BUG: Need to deal with the possibility of '...' in the AST more cleanly than this.
parameter_type_list
    :    parameter_list (',' '...')?;
    
// The PARAMETER_LIST pseudo-token is needed to properly deal with empty parameter lists (it
// serves as a placeholder in that case). Also, direct_declarator_modifier entails two
// parameter lists (one for generic parameters, etc) and they need to be distinguished.
//
parameter_list
    :    parameter_declaration (',' parameter_declaration)*
            -> ^(PARAMETER_LIST parameter_declaration+)
    |
            -> ^(PARAMETER_LIST) ;

// The PARAMETER pseudo-token is needed to clearly distinguish one parameter from another in a
// parameter list. Parameter declarations are potentially complicated and the tokens of each
// should be packaged in order to distinguish them clearly.
//
parameter_declaration
    :    declaration_specifiers declarator
            -> ^(PARAMETER declaration_specifiers declarator)
    |    declaration_specifiers abstract_declarator?
            -> ^(PARAMETER declaration_specifiers abstract_declarator?);
        
type_name
    :    specifier_qualifier_list abstract_declarator?;
    
abstract_declarator
    :    pointer? direct_abstract_declarator
    |    pointer;
    
direct_abstract_declarator
    :    ('(' abstract_declarator    ')' |
          '[' assignment_expression? ']' |
          '(' parameter_type_list?   ')')
             ('[' assignment_expression? ']' | '(' parameter_type_list? ')')*;
        
// Type names have to be handled in a special way. They are not just raw identifiers.
typedef_name 
    :    id=RAW_IDENTIFIER
         { symbols.isType($id.text) }?;
    
// The INITIALIZER_LIST pseudo-token is needed to distinguish brace enclosed initializers from
// simple assignment expressions. Since the first initializer in an initializer list might also
// be an assignment expression, some sort of indication is needed to mark the list. Note: C99
// designators are not currently supported.
//
initializer
    :    assignment_expression
    |    '{' initializer_list ','? '}' -> ^(INITIALIZER_LIST initializer_list);
    
initializer_list
    :    initializer (',' initializer)* -> initializer+;
    
/* ================= */
/* Statement grammar */
/* ================= */

statement
    :    labeled_statement
    |    compound_statement
    |    expression_statement
    |    selection_statement
    |    iteration_statement
    |    jump_statement
    |    line_directive;    // This is a hack.
    
    
labeled_statement
    :    CASE constant_expression ':' statement -> ^(CASE constant_expression statement)
    |    DEFAULT ':' statement -> ^(DEFAULT statement);

// The COMPOUND_STATEMENT pseudo-token is needed to clarify how many block items are contained
// in a particular compound statement (or scope).
//    
compound_statement
    :    '{' { symbols.enterScope(); }
         block_item*
             { symbols.exitScope();  } '}' -> ^(COMPOUND_STATEMENT block_item*);

block_item
    :    declaration
    |    statement;
    
// The STATEMENT pseudo-token is needed so that expression statements are clearly distinguished
// from declarations, other kinds of statements (if, while, etc), and also to clarify places
// where null statements are used.
//
expression_statement
    :    expression? ';' -> ^(STATEMENT expression?);
    
selection_statement
    :    IF '(' expression ')' statement (ELSE statement)?
             -> ^(IF expression statement statement?)
    |    SWITCH '(' expression ')' statement
             -> ^(SWITCH expression statement);
    
// We need pseudo-tokens for the various expressions in a for loop header to deal with the case
// when one or more are left out. Otherwise we can't easily distinguish the meaning of one
// expression from the other.
//
iteration_statement
    :    WHILE '(' expression ')' statement -> ^(WHILE expression statement)
    |    FOR '(' init=expression? ';' cond=expression? ';' iter=expression? ')' statement
            -> ^(FOR ^(FOR_INITIALIZE $init?)
                     ^(FOR_CONDITION  $cond?)
                     ^(FOR_ITERATION  $iter?) statement);
    
jump_statement
    :    RETURN expression? ';' -> ^(RETURN expression?);
    
/* ===================================== */
/* Large scale program structure grammar */
/* ===================================== */

translation_unit
    :    (external_declaration | line_directive)+;

// It would be more accurate to move function_definition here. See the comment at 'declaration'
external_declaration
    :    declaration;

// This hack allows the parser to recognize the line directives left over from preprocessing.
// This information is then used to reconstruct the #include directives in the rewritten
// output. This is needed because of the unusual way in which nesC handles preprocessing.
// In particular, if the #includes are left expanded, the nesC compiler complains about
// multiple definitions of constructs (types) defined in separate files.
//
// Note that because line directives can occur pretty much anywhere this grammar is sprinkled
// with places where the 'line_directive' nonterminal is allowed. This is a bit of a hack. A
// better approach might be to only recognize line directives at the top of the file and to
// just shunt them to the hidden channel (lexically) when processing the body of a component or
// interface. This requires context sensitive lexical analysis. I haven't implemented that yet.
//
line_directive
    :    '#' CONSTANT STRING_LITERAL CONSTANT? -> ^(LINE_DIRECTIVE STRING_LITERAL);
    
function_definition
    :    declaration_specifiers declarator compound_statement
            -> declaration_specifiers declarator compound_statement;

/* ============================ */
/* nesC and Sprocket extensions */
/* ============================ */

// The FILE pseudo-token is needed to provide a wrapper for the entire file. Otherwise if the
// optional translation unit is present, a null token is used as the parent of that unit's
// declarations and the interface|component. This null token is awkward. NOTE: The optional
// translation unit is part of the full nesC grammar. It may never become part of nesT's
// grammar. However, just in case, I'm retaining the structure for now.
//
nest_file
    :    translation_unit? interface_definition -> ^(FILE translation_unit? interface_definition)
    |    translation_unit? component -> ^(FILE translation_unit? component);

// Interface scope is nested inside the global scope.
interface_definition
    :    INTERFACE identifier
        '{' { symbols.enterScope(); }
        (declaration | line_directive)*
            { symbols.exitScope();  } '}'
            -> ^(INTERFACE identifier declaration*);
    
component
    :   MODULE identifier component_specification implementation
            -> ^(MODULE identifier component_specification implementation);

implementation
    :    module_implementation;

// Implementation scope is nested inside specification scope. Both scopes end when the
// implementation closes.
//
module_implementation
    :    IMPLEMENTATION '{' { symbols.enterScope(); }
                            translation_unit
                            { symbols.exitScope(); symbols.exitScope(); }
                        '}'
            -> ^(IMPLEMENTATION translation_unit);

// Specification scope is nested inside the global scope. However, specification scope does not
// end until the associated implementation scope ends (items declared in the specification are
// visible in the implementation).
//
component_specification
    :    '{' { symbols.enterScope(); }
          (uses_provides | line_directive)* '}' -> ^(SPECIFICATION uses_provides*);

uses_provides
    :    USES specification_element_list -> ^(USES specification_element_list)
    |    PROVIDES specification_element_list -> ^(PROVIDES specification_element_list);

specification_element_list
    :    specification_element -> specification_element
    |    '{' specification_element+ '}' -> specification_element+;

specification_element
    :    declaration
    |    INTERFACE identifier ';' -> ^(INTERFACE identifier);

identifier
    :   id=RAW_IDENTIFIER { !symbols.isType($id.text) }?;

/* =========== */
/* Lexer rules */
/* =========== */

RAW_IDENTIFIER
    :    ('_' | 'a' .. 'z' | 'A' .. 'Z') ('_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9')*;
    
CONSTANT
    :    NUMBER;
    
STRING_LITERAL
    :    '"' (options {greedy=false;} : .)* '"';

CHARACTER_LITERAL
    :    '\'' (options {greedy=false;} : .)* '\'';
    
WHITESPACE
    :    ( '\t' | ' ' | '\r' | '\n' | '\f' )+  {$channel = HIDDEN;};
    
COMMENT1
    :    '/*' (options {greedy=false;} : .)* '*/' {$channel = HIDDEN;};
    
COMMENT2
    :    '//' (options {greedy=false;} : .)* ('\r' | '\n') {$channel = HIDDEN;};

// Expose line directives to the parser for analysis. This is needed to reconstruct the
// #include directives in the rewritten output. It will eventually also be needed to
// produce better quality error messages (but there is a lot of other work to be done
// before that can happen).
//
//LINE_DIRECTIVE
//    :    '#' (options {greedy=false;} : .)* ('\r' | '\n') {$channel = HIDDEN;};

fragment NUMBER
    :    DEC_NUMBER
    |    HEX_NUMBER;
    
fragment DEC_NUMBER
    :    ( DIGIT )+ ( NUMBER_SUFFIX )?;
    
fragment HEX_NUMBER
    :    NUMBER_PREFIX ( HEX_DIGIT )+ ( NUMBER_SUFFIX )?;
    
fragment DIGIT
    :    '0' .. '9';
    
fragment HEX_DIGIT
    :    '0' .. '9' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

fragment NUMBER_PREFIX
    :    '0x';

fragment NUMBER_SUFFIX
    :    ('l' | 'L' | 'u' | 'U' | 'lu' | 'ul' | 'LU' | 'UL');
