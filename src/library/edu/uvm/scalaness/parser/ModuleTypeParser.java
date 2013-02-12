// $ANTLR 3.4 ModuleType.g 2013-02-12 09:28:04

    package edu.uvm.scalaness.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ModuleTypeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "COLON", "COMMA", "COMMENT1", "COMMENT2", "ERRORT", "EXISTENTIAL_LIST", "EXPORT_LIST", "FUNCTION_DECLARATION", "IDENTIFIER", "IMPORT_LIST", "INT16", "INT32", "INT8", "LANGLE", "LBRACE", "LBRACKET", "LPARENS", "MODULE_TYPE", "PARAMETER_LIST", "POINTER_TO", "RANGLE", "RBRACE", "RBRACKET", "RPARENS", "SEMI", "STRUCTURE", "SUBTYPE", "TYPE_PARAMETER_LIST", "UINT16", "UINT32", "UINT8", "VALUE_PARAMETER_LIST", "VOID", "WHITESPACE"
    };

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
    public static final int POINTER_TO=24;
    public static final int RANGLE=25;
    public static final int RBRACE=26;
    public static final int RBRACKET=27;
    public static final int RPARENS=28;
    public static final int SEMI=29;
    public static final int STRUCTURE=30;
    public static final int SUBTYPE=31;
    public static final int TYPE_PARAMETER_LIST=32;
    public static final int UINT16=33;
    public static final int UINT32=34;
    public static final int UINT8=35;
    public static final int VALUE_PARAMETER_LIST=36;
    public static final int VOID=37;
    public static final int WHITESPACE=38;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ModuleTypeParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ModuleTypeParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ModuleTypeParser.tokenNames; }
    public String getGrammarFileName() { return "ModuleType.g"; }


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


    public static class module_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_type"
    // ModuleType.g:118:1: module_type : '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' EOF -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list ) ;
    public final ModuleTypeParser.module_type_return module_type() throws RecognitionException {
        ModuleTypeParser.module_type_return retval = new ModuleTypeParser.module_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal1=null;
        Token char_literal3=null;
        Token char_literal4=null;
        Token char_literal6=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token char_literal11=null;
        Token char_literal13=null;
        Token EOF14=null;
        ModuleTypeParser.existential_list_return existential_list2 =null;

        ModuleTypeParser.type_parameter_list_return type_parameter_list5 =null;

        ModuleTypeParser.value_parameter_list_return value_parameter_list7 =null;

        ModuleTypeParser.import_list_return import_list10 =null;

        ModuleTypeParser.export_list_return export_list12 =null;


        Object char_literal1_tree=null;
        Object char_literal3_tree=null;
        Object char_literal4_tree=null;
        Object char_literal6_tree=null;
        Object char_literal8_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        Object char_literal13_tree=null;
        Object EOF14_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_RANGLE=new RewriteRuleTokenStream(adaptor,"token RANGLE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_LANGLE=new RewriteRuleTokenStream(adaptor,"token LANGLE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_value_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule value_parameter_list");
        RewriteRuleSubtreeStream stream_import_list=new RewriteRuleSubtreeStream(adaptor,"rule import_list");
        RewriteRuleSubtreeStream stream_existential_list=new RewriteRuleSubtreeStream(adaptor,"rule existential_list");
        RewriteRuleSubtreeStream stream_type_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule type_parameter_list");
        RewriteRuleSubtreeStream stream_export_list=new RewriteRuleSubtreeStream(adaptor,"rule export_list");
        try {
            // ModuleType.g:119:5: ( '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' EOF -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list ) )
            // ModuleType.g:119:10: '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' EOF
            {
            char_literal1=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_type529);  
            stream_LBRACE.add(char_literal1);


            pushFollow(FOLLOW_existential_list_in_module_type531);
            existential_list2=existential_list();

            state._fsp--;

            stream_existential_list.add(existential_list2.getTree());

            char_literal3=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_type533);  
            stream_RBRACE.add(char_literal3);


            char_literal4=(Token)match(input,LANGLE,FOLLOW_LANGLE_in_module_type544);  
            stream_LANGLE.add(char_literal4);


            pushFollow(FOLLOW_type_parameter_list_in_module_type546);
            type_parameter_list5=type_parameter_list();

            state._fsp--;

            stream_type_parameter_list.add(type_parameter_list5.getTree());

            char_literal6=(Token)match(input,SEMI,FOLLOW_SEMI_in_module_type548);  
            stream_SEMI.add(char_literal6);


            pushFollow(FOLLOW_value_parameter_list_in_module_type550);
            value_parameter_list7=value_parameter_list();

            state._fsp--;

            stream_value_parameter_list.add(value_parameter_list7.getTree());

            char_literal8=(Token)match(input,RANGLE,FOLLOW_RANGLE_in_module_type552);  
            stream_RANGLE.add(char_literal8);


            char_literal9=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_type563);  
            stream_LBRACE.add(char_literal9);


            pushFollow(FOLLOW_import_list_in_module_type565);
            import_list10=import_list();

            state._fsp--;

            stream_import_list.add(import_list10.getTree());

            char_literal11=(Token)match(input,SEMI,FOLLOW_SEMI_in_module_type567);  
            stream_SEMI.add(char_literal11);


            pushFollow(FOLLOW_export_list_in_module_type569);
            export_list12=export_list();

            state._fsp--;

            stream_export_list.add(export_list12.getTree());

            char_literal13=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_type571);  
            stream_RBRACE.add(char_literal13);


            EOF14=(Token)match(input,EOF,FOLLOW_EOF_in_module_type573);  
            stream_EOF.add(EOF14);


            // AST REWRITE
            // elements: import_list, export_list, value_parameter_list, existential_list, type_parameter_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:5: -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list )
            {
                // ModuleType.g:122:8: ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODULE_TYPE, "MODULE_TYPE")
                , root_1);

                adaptor.addChild(root_1, stream_existential_list.nextTree());

                adaptor.addChild(root_1, stream_type_parameter_list.nextTree());

                adaptor.addChild(root_1, stream_value_parameter_list.nextTree());

                adaptor.addChild(root_1, stream_import_list.nextTree());

                adaptor.addChild(root_1, stream_export_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "module_type"


    public static class existential_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "existential_list"
    // ModuleType.g:128:1: existential_list : ( coercion_list )? -> ^( EXISTENTIAL_LIST ( coercion_list )? ) ;
    public final ModuleTypeParser.existential_list_return existential_list() throws RecognitionException {
        ModuleTypeParser.existential_list_return retval = new ModuleTypeParser.existential_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ModuleTypeParser.coercion_list_return coercion_list15 =null;


        RewriteRuleSubtreeStream stream_coercion_list=new RewriteRuleSubtreeStream(adaptor,"rule coercion_list");
        try {
            // ModuleType.g:129:5: ( ( coercion_list )? -> ^( EXISTENTIAL_LIST ( coercion_list )? ) )
            // ModuleType.g:129:10: ( coercion_list )?
            {
            // ModuleType.g:129:10: ( coercion_list )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==IDENTIFIER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ModuleType.g:129:10: coercion_list
                    {
                    pushFollow(FOLLOW_coercion_list_in_existential_list692);
                    coercion_list15=coercion_list();

                    state._fsp--;

                    stream_coercion_list.add(coercion_list15.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: coercion_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 129:25: -> ^( EXISTENTIAL_LIST ( coercion_list )? )
            {
                // ModuleType.g:129:28: ^( EXISTENTIAL_LIST ( coercion_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXISTENTIAL_LIST, "EXISTENTIAL_LIST")
                , root_1);

                // ModuleType.g:129:47: ( coercion_list )?
                if ( stream_coercion_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_coercion_list.nextTree());

                }
                stream_coercion_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "existential_list"


    public static class type_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_parameter_list"
    // ModuleType.g:131:1: type_parameter_list : ( coercion_list )? -> ^( TYPE_PARAMETER_LIST ( coercion_list )? ) ;
    public final ModuleTypeParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        ModuleTypeParser.type_parameter_list_return retval = new ModuleTypeParser.type_parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ModuleTypeParser.coercion_list_return coercion_list16 =null;


        RewriteRuleSubtreeStream stream_coercion_list=new RewriteRuleSubtreeStream(adaptor,"rule coercion_list");
        try {
            // ModuleType.g:132:5: ( ( coercion_list )? -> ^( TYPE_PARAMETER_LIST ( coercion_list )? ) )
            // ModuleType.g:132:10: ( coercion_list )?
            {
            // ModuleType.g:132:10: ( coercion_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ModuleType.g:132:10: coercion_list
                    {
                    pushFollow(FOLLOW_coercion_list_in_type_parameter_list717);
                    coercion_list16=coercion_list();

                    state._fsp--;

                    stream_coercion_list.add(coercion_list16.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: coercion_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 132:25: -> ^( TYPE_PARAMETER_LIST ( coercion_list )? )
            {
                // ModuleType.g:132:28: ^( TYPE_PARAMETER_LIST ( coercion_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE_PARAMETER_LIST, "TYPE_PARAMETER_LIST")
                , root_1);

                // ModuleType.g:132:50: ( coercion_list )?
                if ( stream_coercion_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_coercion_list.nextTree());

                }
                stream_coercion_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_parameter_list"


    public static class value_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value_parameter_list"
    // ModuleType.g:134:1: value_parameter_list : ( simple_declaration_list )? -> ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? ) ;
    public final ModuleTypeParser.value_parameter_list_return value_parameter_list() throws RecognitionException {
        ModuleTypeParser.value_parameter_list_return retval = new ModuleTypeParser.value_parameter_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ModuleTypeParser.simple_declaration_list_return simple_declaration_list17 =null;


        RewriteRuleSubtreeStream stream_simple_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule simple_declaration_list");
        try {
            // ModuleType.g:135:5: ( ( simple_declaration_list )? -> ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? ) )
            // ModuleType.g:135:10: ( simple_declaration_list )?
            {
            // ModuleType.g:135:10: ( simple_declaration_list )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENTIFIER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ModuleType.g:135:10: simple_declaration_list
                    {
                    pushFollow(FOLLOW_simple_declaration_list_in_value_parameter_list742);
                    simple_declaration_list17=simple_declaration_list();

                    state._fsp--;

                    stream_simple_declaration_list.add(simple_declaration_list17.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: simple_declaration_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:35: -> ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? )
            {
                // ModuleType.g:135:38: ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VALUE_PARAMETER_LIST, "VALUE_PARAMETER_LIST")
                , root_1);

                // ModuleType.g:135:61: ( simple_declaration_list )?
                if ( stream_simple_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_simple_declaration_list.nextTree());

                }
                stream_simple_declaration_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value_parameter_list"


    public static class import_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_list"
    // ModuleType.g:137:1: import_list : ( function_declaration_list )? -> ^( IMPORT_LIST ( function_declaration_list )? ) ;
    public final ModuleTypeParser.import_list_return import_list() throws RecognitionException {
        ModuleTypeParser.import_list_return retval = new ModuleTypeParser.import_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ModuleTypeParser.function_declaration_list_return function_declaration_list18 =null;


        RewriteRuleSubtreeStream stream_function_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_list");
        try {
            // ModuleType.g:138:5: ( ( function_declaration_list )? -> ^( IMPORT_LIST ( function_declaration_list )? ) )
            // ModuleType.g:138:10: ( function_declaration_list )?
            {
            // ModuleType.g:138:10: ( function_declaration_list )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENTIFIER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ModuleType.g:138:10: function_declaration_list
                    {
                    pushFollow(FOLLOW_function_declaration_list_in_import_list767);
                    function_declaration_list18=function_declaration_list();

                    state._fsp--;

                    stream_function_declaration_list.add(function_declaration_list18.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: function_declaration_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 138:37: -> ^( IMPORT_LIST ( function_declaration_list )? )
            {
                // ModuleType.g:138:40: ^( IMPORT_LIST ( function_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IMPORT_LIST, "IMPORT_LIST")
                , root_1);

                // ModuleType.g:138:54: ( function_declaration_list )?
                if ( stream_function_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_declaration_list.nextTree());

                }
                stream_function_declaration_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_list"


    public static class export_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "export_list"
    // ModuleType.g:140:1: export_list : ( function_declaration_list )? -> ^( EXPORT_LIST ( function_declaration_list )? ) ;
    public final ModuleTypeParser.export_list_return export_list() throws RecognitionException {
        ModuleTypeParser.export_list_return retval = new ModuleTypeParser.export_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ModuleTypeParser.function_declaration_list_return function_declaration_list19 =null;


        RewriteRuleSubtreeStream stream_function_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_list");
        try {
            // ModuleType.g:141:5: ( ( function_declaration_list )? -> ^( EXPORT_LIST ( function_declaration_list )? ) )
            // ModuleType.g:141:10: ( function_declaration_list )?
            {
            // ModuleType.g:141:10: ( function_declaration_list )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENTIFIER) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ModuleType.g:141:10: function_declaration_list
                    {
                    pushFollow(FOLLOW_function_declaration_list_in_export_list792);
                    function_declaration_list19=function_declaration_list();

                    state._fsp--;

                    stream_function_declaration_list.add(function_declaration_list19.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: function_declaration_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 141:37: -> ^( EXPORT_LIST ( function_declaration_list )? )
            {
                // ModuleType.g:141:40: ^( EXPORT_LIST ( function_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPORT_LIST, "EXPORT_LIST")
                , root_1);

                // ModuleType.g:141:54: ( function_declaration_list )?
                if ( stream_function_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_declaration_list.nextTree());

                }
                stream_function_declaration_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "export_list"


    public static class coercion_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coercion_list"
    // ModuleType.g:143:1: coercion_list : coercion ( ',' ! coercion )* ;
    public final ModuleTypeParser.coercion_list_return coercion_list() throws RecognitionException {
        ModuleTypeParser.coercion_list_return retval = new ModuleTypeParser.coercion_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal21=null;
        ModuleTypeParser.coercion_return coercion20 =null;

        ModuleTypeParser.coercion_return coercion22 =null;


        Object char_literal21_tree=null;

        try {
            // ModuleType.g:144:5: ( coercion ( ',' ! coercion )* )
            // ModuleType.g:144:9: coercion ( ',' ! coercion )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_coercion_in_coercion_list816);
            coercion20=coercion();

            state._fsp--;

            adaptor.addChild(root_0, coercion20.getTree());

            // ModuleType.g:144:18: ( ',' ! coercion )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ModuleType.g:144:19: ',' ! coercion
            	    {
            	    char_literal21=(Token)match(input,COMMA,FOLLOW_COMMA_in_coercion_list819); 

            	    pushFollow(FOLLOW_coercion_in_coercion_list822);
            	    coercion22=coercion();

            	    state._fsp--;

            	    adaptor.addChild(root_0, coercion22.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "coercion_list"


    public static class coercion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coercion"
    // ModuleType.g:146:1: coercion : IDENTIFIER '<:' ^ primitive_type_name ;
    public final ModuleTypeParser.coercion_return coercion() throws RecognitionException {
        ModuleTypeParser.coercion_return retval = new ModuleTypeParser.coercion_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER23=null;
        Token string_literal24=null;
        ModuleTypeParser.primitive_type_name_return primitive_type_name25 =null;


        Object IDENTIFIER23_tree=null;
        Object string_literal24_tree=null;

        try {
            // ModuleType.g:147:5: ( IDENTIFIER '<:' ^ primitive_type_name )
            // ModuleType.g:147:9: IDENTIFIER '<:' ^ primitive_type_name
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER23=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_coercion838); 
            IDENTIFIER23_tree = 
            (Object)adaptor.create(IDENTIFIER23)
            ;
            adaptor.addChild(root_0, IDENTIFIER23_tree);


            string_literal24=(Token)match(input,SUBTYPE,FOLLOW_SUBTYPE_in_coercion840); 
            string_literal24_tree = 
            (Object)adaptor.create(string_literal24)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal24_tree, root_0);


            pushFollow(FOLLOW_primitive_type_name_in_coercion843);
            primitive_type_name25=primitive_type_name();

            state._fsp--;

            adaptor.addChild(root_0, primitive_type_name25.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "coercion"


    public static class simple_declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_declaration_list"
    // ModuleType.g:149:1: simple_declaration_list : simple_declaration ( ',' ! simple_declaration )* ;
    public final ModuleTypeParser.simple_declaration_list_return simple_declaration_list() throws RecognitionException {
        ModuleTypeParser.simple_declaration_list_return retval = new ModuleTypeParser.simple_declaration_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal27=null;
        ModuleTypeParser.simple_declaration_return simple_declaration26 =null;

        ModuleTypeParser.simple_declaration_return simple_declaration28 =null;


        Object char_literal27_tree=null;

        try {
            // ModuleType.g:150:5: ( simple_declaration ( ',' ! simple_declaration )* )
            // ModuleType.g:150:10: simple_declaration ( ',' ! simple_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_simple_declaration_in_simple_declaration_list858);
            simple_declaration26=simple_declaration();

            state._fsp--;

            adaptor.addChild(root_0, simple_declaration26.getTree());

            // ModuleType.g:150:29: ( ',' ! simple_declaration )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ModuleType.g:150:30: ',' ! simple_declaration
            	    {
            	    char_literal27=(Token)match(input,COMMA,FOLLOW_COMMA_in_simple_declaration_list861); 

            	    pushFollow(FOLLOW_simple_declaration_in_simple_declaration_list864);
            	    simple_declaration28=simple_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simple_declaration28.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_declaration_list"


    public static class simple_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_declaration"
    // ModuleType.g:152:1: simple_declaration : IDENTIFIER ':' ^ type_specifier ;
    public final ModuleTypeParser.simple_declaration_return simple_declaration() throws RecognitionException {
        ModuleTypeParser.simple_declaration_return retval = new ModuleTypeParser.simple_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER29=null;
        Token char_literal30=null;
        ModuleTypeParser.type_specifier_return type_specifier31 =null;


        Object IDENTIFIER29_tree=null;
        Object char_literal30_tree=null;

        try {
            // ModuleType.g:153:5: ( IDENTIFIER ':' ^ type_specifier )
            // ModuleType.g:153:10: IDENTIFIER ':' ^ type_specifier
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simple_declaration881); 
            IDENTIFIER29_tree = 
            (Object)adaptor.create(IDENTIFIER29)
            ;
            adaptor.addChild(root_0, IDENTIFIER29_tree);


            char_literal30=(Token)match(input,COLON,FOLLOW_COLON_in_simple_declaration883); 
            char_literal30_tree = 
            (Object)adaptor.create(char_literal30)
            ;
            root_0 = (Object)adaptor.becomeRoot(char_literal30_tree, root_0);


            pushFollow(FOLLOW_type_specifier_in_simple_declaration886);
            type_specifier31=type_specifier();

            state._fsp--;

            adaptor.addChild(root_0, type_specifier31.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_declaration"


    public static class function_declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_declaration_list"
    // ModuleType.g:155:1: function_declaration_list : function_declaration ( ',' ! function_declaration )* ;
    public final ModuleTypeParser.function_declaration_list_return function_declaration_list() throws RecognitionException {
        ModuleTypeParser.function_declaration_list_return retval = new ModuleTypeParser.function_declaration_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal33=null;
        ModuleTypeParser.function_declaration_return function_declaration32 =null;

        ModuleTypeParser.function_declaration_return function_declaration34 =null;


        Object char_literal33_tree=null;

        try {
            // ModuleType.g:156:5: ( function_declaration ( ',' ! function_declaration )* )
            // ModuleType.g:156:10: function_declaration ( ',' ! function_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_function_declaration_in_function_declaration_list901);
            function_declaration32=function_declaration();

            state._fsp--;

            adaptor.addChild(root_0, function_declaration32.getTree());

            // ModuleType.g:156:31: ( ',' ! function_declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ModuleType.g:156:32: ',' ! function_declaration
            	    {
            	    char_literal33=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_declaration_list904); 

            	    pushFollow(FOLLOW_function_declaration_in_function_declaration_list907);
            	    function_declaration34=function_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_declaration34.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_declaration_list"


    public static class function_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_declaration"
    // ModuleType.g:158:1: function_declaration : name= IDENTIFIER '(' ( simple_declaration_list )? ')' ':' return_type -> ^( FUNCTION_DECLARATION $name return_type ( simple_declaration_list )? ) ;
    public final ModuleTypeParser.function_declaration_return function_declaration() throws RecognitionException {
        ModuleTypeParser.function_declaration_return retval = new ModuleTypeParser.function_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token name=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token char_literal38=null;
        ModuleTypeParser.simple_declaration_list_return simple_declaration_list36 =null;

        ModuleTypeParser.return_type_return return_type39 =null;


        Object name_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_simple_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule simple_declaration_list");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        try {
            // ModuleType.g:159:5: (name= IDENTIFIER '(' ( simple_declaration_list )? ')' ':' return_type -> ^( FUNCTION_DECLARATION $name return_type ( simple_declaration_list )? ) )
            // ModuleType.g:159:10: name= IDENTIFIER '(' ( simple_declaration_list )? ')' ':' return_type
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration926);  
            stream_IDENTIFIER.add(name);


            char_literal35=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_function_declaration928);  
            stream_LPARENS.add(char_literal35);


            // ModuleType.g:159:30: ( simple_declaration_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ModuleType.g:159:30: simple_declaration_list
                    {
                    pushFollow(FOLLOW_simple_declaration_list_in_function_declaration930);
                    simple_declaration_list36=simple_declaration_list();

                    state._fsp--;

                    stream_simple_declaration_list.add(simple_declaration_list36.getTree());

                    }
                    break;

            }


            char_literal37=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_function_declaration933);  
            stream_RPARENS.add(char_literal37);


            char_literal38=(Token)match(input,COLON,FOLLOW_COLON_in_function_declaration935);  
            stream_COLON.add(char_literal38);


            pushFollow(FOLLOW_return_type_in_function_declaration937);
            return_type39=return_type();

            state._fsp--;

            stream_return_type.add(return_type39.getTree());

            // AST REWRITE
            // elements: simple_declaration_list, name, return_type
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 160:10: -> ^( FUNCTION_DECLARATION $name return_type ( simple_declaration_list )? )
            {
                // ModuleType.g:160:13: ^( FUNCTION_DECLARATION $name return_type ( simple_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_DECLARATION, "FUNCTION_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextNode());

                adaptor.addChild(root_1, stream_return_type.nextTree());

                // ModuleType.g:160:54: ( simple_declaration_list )?
                if ( stream_simple_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_simple_declaration_list.nextTree());

                }
                stream_simple_declaration_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_declaration"


    public static class return_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_type"
    // ModuleType.g:163:1: return_type : ( generalized_type_name | POINTER_TO '[' return_type ']' -> ^( POINTER_TO return_type ) );
    public final ModuleTypeParser.return_type_return return_type() throws RecognitionException {
        ModuleTypeParser.return_type_return retval = new ModuleTypeParser.return_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token POINTER_TO41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        ModuleTypeParser.generalized_type_name_return generalized_type_name40 =null;

        ModuleTypeParser.return_type_return return_type43 =null;


        Object POINTER_TO41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_POINTER_TO=new RewriteRuleTokenStream(adaptor,"token POINTER_TO");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        try {
            // ModuleType.g:164:5: ( generalized_type_name | POINTER_TO '[' return_type ']' -> ^( POINTER_TO return_type ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ERRORT||LA10_0==IDENTIFIER||(LA10_0 >= INT16 && LA10_0 <= INT8)||(LA10_0 >= UINT16 && LA10_0 <= UINT8)||LA10_0==VOID) ) {
                alt10=1;
            }
            else if ( (LA10_0==POINTER_TO) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // ModuleType.g:164:10: generalized_type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_generalized_type_name_in_return_type976);
                    generalized_type_name40=generalized_type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, generalized_type_name40.getTree());

                    }
                    break;
                case 2 :
                    // ModuleType.g:165:10: POINTER_TO '[' return_type ']'
                    {
                    POINTER_TO41=(Token)match(input,POINTER_TO,FOLLOW_POINTER_TO_in_return_type987);  
                    stream_POINTER_TO.add(POINTER_TO41);


                    char_literal42=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_return_type989);  
                    stream_LBRACKET.add(char_literal42);


                    pushFollow(FOLLOW_return_type_in_return_type991);
                    return_type43=return_type();

                    state._fsp--;

                    stream_return_type.add(return_type43.getTree());

                    char_literal44=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_return_type993);  
                    stream_RBRACKET.add(char_literal44);


                    // AST REWRITE
                    // elements: return_type, POINTER_TO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:41: -> ^( POINTER_TO return_type )
                    {
                        // ModuleType.g:165:44: ^( POINTER_TO return_type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_POINTER_TO.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_return_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_type"


    public static class type_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // ModuleType.g:168:1: type_specifier : ( generalized_type_name | ARRAY '[' type_specifier ']' -> ^( ARRAY type_specifier ) | POINTER_TO '[' type_specifier ']' -> ^( POINTER_TO type_specifier ) | structure_type );
    public final ModuleTypeParser.type_specifier_return type_specifier() throws RecognitionException {
        ModuleTypeParser.type_specifier_return retval = new ModuleTypeParser.type_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ARRAY46=null;
        Token char_literal47=null;
        Token char_literal49=null;
        Token POINTER_TO50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        ModuleTypeParser.generalized_type_name_return generalized_type_name45 =null;

        ModuleTypeParser.type_specifier_return type_specifier48 =null;

        ModuleTypeParser.type_specifier_return type_specifier52 =null;

        ModuleTypeParser.structure_type_return structure_type54 =null;


        Object ARRAY46_tree=null;
        Object char_literal47_tree=null;
        Object char_literal49_tree=null;
        Object POINTER_TO50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal53_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_POINTER_TO=new RewriteRuleTokenStream(adaptor,"token POINTER_TO");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        try {
            // ModuleType.g:169:5: ( generalized_type_name | ARRAY '[' type_specifier ']' -> ^( ARRAY type_specifier ) | POINTER_TO '[' type_specifier ']' -> ^( POINTER_TO type_specifier ) | structure_type )
            int alt11=4;
            switch ( input.LA(1) ) {
            case ERRORT:
            case INT16:
            case INT32:
            case INT8:
            case UINT16:
            case UINT32:
            case UINT8:
            case VOID:
                {
                alt11=1;
                }
                break;
            case IDENTIFIER:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==LBRACE) ) {
                    alt11=4;
                }
                else if ( (LA11_2==COMMA||(LA11_2 >= RANGLE && LA11_2 <= RPARENS)) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }
                }
                break;
            case ARRAY:
                {
                alt11=2;
                }
                break;
            case POINTER_TO:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // ModuleType.g:169:10: generalized_type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_generalized_type_name_in_type_specifier1017);
                    generalized_type_name45=generalized_type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, generalized_type_name45.getTree());

                    }
                    break;
                case 2 :
                    // ModuleType.g:170:10: ARRAY '[' type_specifier ']'
                    {
                    ARRAY46=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type_specifier1028);  
                    stream_ARRAY.add(ARRAY46);


                    char_literal47=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_type_specifier1030);  
                    stream_LBRACKET.add(char_literal47);


                    pushFollow(FOLLOW_type_specifier_in_type_specifier1032);
                    type_specifier48=type_specifier();

                    state._fsp--;

                    stream_type_specifier.add(type_specifier48.getTree());

                    char_literal49=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_type_specifier1034);  
                    stream_RBRACKET.add(char_literal49);


                    // AST REWRITE
                    // elements: type_specifier, ARRAY
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:39: -> ^( ARRAY type_specifier )
                    {
                        // ModuleType.g:170:42: ^( ARRAY type_specifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ARRAY.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_type_specifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // ModuleType.g:171:10: POINTER_TO '[' type_specifier ']'
                    {
                    POINTER_TO50=(Token)match(input,POINTER_TO,FOLLOW_POINTER_TO_in_type_specifier1053);  
                    stream_POINTER_TO.add(POINTER_TO50);


                    char_literal51=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_type_specifier1055);  
                    stream_LBRACKET.add(char_literal51);


                    pushFollow(FOLLOW_type_specifier_in_type_specifier1057);
                    type_specifier52=type_specifier();

                    state._fsp--;

                    stream_type_specifier.add(type_specifier52.getTree());

                    char_literal53=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_type_specifier1059);  
                    stream_RBRACKET.add(char_literal53);


                    // AST REWRITE
                    // elements: type_specifier, POINTER_TO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:44: -> ^( POINTER_TO type_specifier )
                    {
                        // ModuleType.g:171:47: ^( POINTER_TO type_specifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_POINTER_TO.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_type_specifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // ModuleType.g:172:10: structure_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_structure_type_in_type_specifier1078);
                    structure_type54=structure_type();

                    state._fsp--;

                    adaptor.addChild(root_0, structure_type54.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_specifier"


    public static class structure_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structure_type"
    // ModuleType.g:174:1: structure_type : IDENTIFIER '{' ( simple_declaration_list )? '}' -> ^( STRUCTURE IDENTIFIER ( simple_declaration_list )? ) ;
    public final ModuleTypeParser.structure_type_return structure_type() throws RecognitionException {
        ModuleTypeParser.structure_type_return retval = new ModuleTypeParser.structure_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER55=null;
        Token char_literal56=null;
        Token char_literal58=null;
        ModuleTypeParser.simple_declaration_list_return simple_declaration_list57 =null;


        Object IDENTIFIER55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal58_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_simple_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule simple_declaration_list");
        try {
            // ModuleType.g:175:5: ( IDENTIFIER '{' ( simple_declaration_list )? '}' -> ^( STRUCTURE IDENTIFIER ( simple_declaration_list )? ) )
            // ModuleType.g:175:10: IDENTIFIER '{' ( simple_declaration_list )? '}'
            {
            IDENTIFIER55=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_structure_type1093);  
            stream_IDENTIFIER.add(IDENTIFIER55);


            char_literal56=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_structure_type1095);  
            stream_LBRACE.add(char_literal56);


            // ModuleType.g:175:25: ( simple_declaration_list )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENTIFIER) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ModuleType.g:175:25: simple_declaration_list
                    {
                    pushFollow(FOLLOW_simple_declaration_list_in_structure_type1097);
                    simple_declaration_list57=simple_declaration_list();

                    state._fsp--;

                    stream_simple_declaration_list.add(simple_declaration_list57.getTree());

                    }
                    break;

            }


            char_literal58=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_structure_type1100);  
            stream_RBRACE.add(char_literal58);


            // AST REWRITE
            // elements: IDENTIFIER, simple_declaration_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 176:10: -> ^( STRUCTURE IDENTIFIER ( simple_declaration_list )? )
            {
                // ModuleType.g:176:13: ^( STRUCTURE IDENTIFIER ( simple_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STRUCTURE, "STRUCTURE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                // ModuleType.g:176:36: ( simple_declaration_list )?
                if ( stream_simple_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_simple_declaration_list.nextTree());

                }
                stream_simple_declaration_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structure_type"


    public static class generalized_type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generalized_type_name"
    // ModuleType.g:178:1: generalized_type_name : ( primitive_type_name | IDENTIFIER );
    public final ModuleTypeParser.generalized_type_name_return generalized_type_name() throws RecognitionException {
        ModuleTypeParser.generalized_type_name_return retval = new ModuleTypeParser.generalized_type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER60=null;
        ModuleTypeParser.primitive_type_name_return primitive_type_name59 =null;


        Object IDENTIFIER60_tree=null;

        try {
            // ModuleType.g:179:5: ( primitive_type_name | IDENTIFIER )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ERRORT||(LA13_0 >= INT16 && LA13_0 <= INT8)||(LA13_0 >= UINT16 && LA13_0 <= UINT8)||LA13_0==VOID) ) {
                alt13=1;
            }
            else if ( (LA13_0==IDENTIFIER) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // ModuleType.g:179:10: primitive_type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitive_type_name_in_generalized_type_name1135);
                    primitive_type_name59=primitive_type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, primitive_type_name59.getTree());

                    }
                    break;
                case 2 :
                    // ModuleType.g:179:32: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_generalized_type_name1139); 
                    IDENTIFIER60_tree = 
                    (Object)adaptor.create(IDENTIFIER60)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER60_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "generalized_type_name"


    public static class primitive_type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitive_type_name"
    // ModuleType.g:181:1: primitive_type_name : ( VOID | INT8 | INT16 | INT32 | UINT8 | UINT16 | UINT32 | ERRORT );
    public final ModuleTypeParser.primitive_type_name_return primitive_type_name() throws RecognitionException {
        ModuleTypeParser.primitive_type_name_return retval = new ModuleTypeParser.primitive_type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set61=null;

        Object set61_tree=null;

        try {
            // ModuleType.g:182:5: ( VOID | INT8 | INT16 | INT32 | UINT8 | UINT16 | UINT32 | ERRORT )
            // ModuleType.g:
            {
            root_0 = (Object)adaptor.nil();


            set61=(Token)input.LT(1);

            if ( input.LA(1)==ERRORT||(input.LA(1) >= INT16 && input.LA(1) <= INT8)||(input.LA(1) >= UINT16 && input.LA(1) <= UINT8)||input.LA(1)==VOID ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set61)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primitive_type_name"

    // Delegated rules


 

    public static final BitSet FOLLOW_LBRACE_in_module_type529 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_existential_list_in_module_type531 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RBRACE_in_module_type533 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LANGLE_in_module_type544 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_type_parameter_list_in_module_type546 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMI_in_module_type548 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_value_parameter_list_in_module_type550 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RANGLE_in_module_type552 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_module_type563 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_import_list_in_module_type565 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMI_in_module_type567 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_export_list_in_module_type569 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RBRACE_in_module_type571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module_type573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_list_in_existential_list692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_list_in_type_parameter_list717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_declaration_list_in_value_parameter_list742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_list_in_import_list767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_list_in_export_list792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_in_coercion_list816 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_coercion_list819 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_coercion_in_coercion_list822 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENTIFIER_in_coercion838 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SUBTYPE_in_coercion840 = new BitSet(new long[]{0x0000002E00038200L});
    public static final BitSet FOLLOW_primitive_type_name_in_coercion843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_declaration_in_simple_declaration_list858 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_simple_declaration_list861 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_simple_declaration_in_simple_declaration_list864 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simple_declaration881 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_simple_declaration883 = new BitSet(new long[]{0x0000002E0103A210L});
    public static final BitSet FOLLOW_type_specifier_in_simple_declaration886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_in_function_declaration_list901 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_function_declaration_list904 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_function_declaration_in_function_declaration_list907 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration926 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPARENS_in_function_declaration928 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_simple_declaration_list_in_function_declaration930 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RPARENS_in_function_declaration933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_function_declaration935 = new BitSet(new long[]{0x0000002E0103A200L});
    public static final BitSet FOLLOW_return_type_in_function_declaration937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalized_type_name_in_return_type976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTER_TO_in_return_type987 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_return_type989 = new BitSet(new long[]{0x0000002E0103A200L});
    public static final BitSet FOLLOW_return_type_in_return_type991 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACKET_in_return_type993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalized_type_name_in_type_specifier1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_type_specifier1028 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_type_specifier1030 = new BitSet(new long[]{0x0000002E0103A210L});
    public static final BitSet FOLLOW_type_specifier_in_type_specifier1032 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACKET_in_type_specifier1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTER_TO_in_type_specifier1053 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_type_specifier1055 = new BitSet(new long[]{0x0000002E0103A210L});
    public static final BitSet FOLLOW_type_specifier_in_type_specifier1057 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACKET_in_type_specifier1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_type_in_type_specifier1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_structure_type1093 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_structure_type1095 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_simple_declaration_list_in_structure_type1097 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RBRACE_in_structure_type1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_type_name_in_generalized_type_name1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_generalized_type_name1139 = new BitSet(new long[]{0x0000000000000002L});

}