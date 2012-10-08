// $ANTLR 3.4 ModuleType.g 2012-10-08 18:43:57

    package edu.uvm.scalaness.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ModuleTypeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COLON", "COMMA", "COMMENT1", "COMMENT2", "EXISTENTIAL_LIST", "EXPORT_LIST", "FUNCTION_DECLARATION", "IDENTIFIER", "IMPORT_LIST", "INT16", "INT32", "INT8", "LANGLE", "LBRACE", "LPARENS", "MODULE_TYPE", "PARAMETER_LIST", "RANGLE", "RBRACE", "RPARENS", "SEMI", "SUBTYPE", "TYPE_PARAMETER_LIST", "UINT16", "UINT32", "UINT8", "VALUE_PARAMETER_LIST", "VOID", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int COLON=4;
    public static final int COMMA=5;
    public static final int COMMENT1=6;
    public static final int COMMENT2=7;
    public static final int EXISTENTIAL_LIST=8;
    public static final int EXPORT_LIST=9;
    public static final int FUNCTION_DECLARATION=10;
    public static final int IDENTIFIER=11;
    public static final int IMPORT_LIST=12;
    public static final int INT16=13;
    public static final int INT32=14;
    public static final int INT8=15;
    public static final int LANGLE=16;
    public static final int LBRACE=17;
    public static final int LPARENS=18;
    public static final int MODULE_TYPE=19;
    public static final int PARAMETER_LIST=20;
    public static final int RANGLE=21;
    public static final int RBRACE=22;
    public static final int RPARENS=23;
    public static final int SEMI=24;
    public static final int SUBTYPE=25;
    public static final int TYPE_PARAMETER_LIST=26;
    public static final int UINT16=27;
    public static final int UINT32=28;
    public static final int UINT8=29;
    public static final int VALUE_PARAMETER_LIST=30;
    public static final int VOID=31;
    public static final int WHITESPACE=32;

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
        this.state.ruleMemo = new HashMap[30+1];
         

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


    public static class module_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_type"
    // ModuleType.g:87:1: module_type : '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' EOF -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list ) ;
    public final ModuleTypeParser.module_type_return module_type() throws RecognitionException {
        ModuleTypeParser.module_type_return retval = new ModuleTypeParser.module_type_return();
        retval.start = input.LT(1);

        int module_type_StartIndex = input.index();

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
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // ModuleType.g:88:5: ( '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' EOF -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list ) )
            // ModuleType.g:88:10: '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' EOF
            {
            char_literal1=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_type403); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal1);


            pushFollow(FOLLOW_existential_list_in_module_type405);
            existential_list2=existential_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_existential_list.add(existential_list2.getTree());

            char_literal3=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_type407); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal3);


            char_literal4=(Token)match(input,LANGLE,FOLLOW_LANGLE_in_module_type418); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LANGLE.add(char_literal4);


            pushFollow(FOLLOW_type_parameter_list_in_module_type420);
            type_parameter_list5=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_parameter_list.add(type_parameter_list5.getTree());

            char_literal6=(Token)match(input,SEMI,FOLLOW_SEMI_in_module_type422); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal6);


            pushFollow(FOLLOW_value_parameter_list_in_module_type424);
            value_parameter_list7=value_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value_parameter_list.add(value_parameter_list7.getTree());

            char_literal8=(Token)match(input,RANGLE,FOLLOW_RANGLE_in_module_type426); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RANGLE.add(char_literal8);


            char_literal9=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_type437); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal9);


            pushFollow(FOLLOW_import_list_in_module_type439);
            import_list10=import_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_import_list.add(import_list10.getTree());

            char_literal11=(Token)match(input,SEMI,FOLLOW_SEMI_in_module_type441); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal11);


            pushFollow(FOLLOW_export_list_in_module_type443);
            export_list12=export_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_export_list.add(export_list12.getTree());

            char_literal13=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_type445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal13);


            EOF14=(Token)match(input,EOF,FOLLOW_EOF_in_module_type447); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF14);


            // AST REWRITE
            // elements: type_parameter_list, export_list, existential_list, value_parameter_list, import_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:5: -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list )
            {
                // ModuleType.g:91:8: ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list )
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

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, module_type_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "module_type"


    public static class existential_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "existential_list"
    // ModuleType.g:97:1: existential_list : ( coercion_list )? -> ^( EXISTENTIAL_LIST ( coercion_list )? ) ;
    public final ModuleTypeParser.existential_list_return existential_list() throws RecognitionException {
        ModuleTypeParser.existential_list_return retval = new ModuleTypeParser.existential_list_return();
        retval.start = input.LT(1);

        int existential_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.coercion_list_return coercion_list15 =null;


        RewriteRuleSubtreeStream stream_coercion_list=new RewriteRuleSubtreeStream(adaptor,"rule coercion_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // ModuleType.g:98:5: ( ( coercion_list )? -> ^( EXISTENTIAL_LIST ( coercion_list )? ) )
            // ModuleType.g:98:10: ( coercion_list )?
            {
            // ModuleType.g:98:10: ( coercion_list )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==IDENTIFIER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ModuleType.g:98:10: coercion_list
                    {
                    pushFollow(FOLLOW_coercion_list_in_existential_list566);
                    coercion_list15=coercion_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_coercion_list.add(coercion_list15.getTree());

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
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:25: -> ^( EXISTENTIAL_LIST ( coercion_list )? )
            {
                // ModuleType.g:98:28: ^( EXISTENTIAL_LIST ( coercion_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXISTENTIAL_LIST, "EXISTENTIAL_LIST")
                , root_1);

                // ModuleType.g:98:47: ( coercion_list )?
                if ( stream_coercion_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_coercion_list.nextTree());

                }
                stream_coercion_list.reset();

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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, existential_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "existential_list"


    public static class type_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_parameter_list"
    // ModuleType.g:100:1: type_parameter_list : ( coercion_list )? -> ^( TYPE_PARAMETER_LIST ( coercion_list )? ) ;
    public final ModuleTypeParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        ModuleTypeParser.type_parameter_list_return retval = new ModuleTypeParser.type_parameter_list_return();
        retval.start = input.LT(1);

        int type_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.coercion_list_return coercion_list16 =null;


        RewriteRuleSubtreeStream stream_coercion_list=new RewriteRuleSubtreeStream(adaptor,"rule coercion_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // ModuleType.g:101:5: ( ( coercion_list )? -> ^( TYPE_PARAMETER_LIST ( coercion_list )? ) )
            // ModuleType.g:101:10: ( coercion_list )?
            {
            // ModuleType.g:101:10: ( coercion_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ModuleType.g:101:10: coercion_list
                    {
                    pushFollow(FOLLOW_coercion_list_in_type_parameter_list591);
                    coercion_list16=coercion_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_coercion_list.add(coercion_list16.getTree());

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
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 101:25: -> ^( TYPE_PARAMETER_LIST ( coercion_list )? )
            {
                // ModuleType.g:101:28: ^( TYPE_PARAMETER_LIST ( coercion_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE_PARAMETER_LIST, "TYPE_PARAMETER_LIST")
                , root_1);

                // ModuleType.g:101:50: ( coercion_list )?
                if ( stream_coercion_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_coercion_list.nextTree());

                }
                stream_coercion_list.reset();

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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, type_parameter_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_parameter_list"


    public static class value_parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value_parameter_list"
    // ModuleType.g:103:1: value_parameter_list : ( simple_declaration_list )? -> ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? ) ;
    public final ModuleTypeParser.value_parameter_list_return value_parameter_list() throws RecognitionException {
        ModuleTypeParser.value_parameter_list_return retval = new ModuleTypeParser.value_parameter_list_return();
        retval.start = input.LT(1);

        int value_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.simple_declaration_list_return simple_declaration_list17 =null;


        RewriteRuleSubtreeStream stream_simple_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule simple_declaration_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // ModuleType.g:104:5: ( ( simple_declaration_list )? -> ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? ) )
            // ModuleType.g:104:10: ( simple_declaration_list )?
            {
            // ModuleType.g:104:10: ( simple_declaration_list )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENTIFIER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ModuleType.g:104:10: simple_declaration_list
                    {
                    pushFollow(FOLLOW_simple_declaration_list_in_value_parameter_list616);
                    simple_declaration_list17=simple_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simple_declaration_list.add(simple_declaration_list17.getTree());

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
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 104:35: -> ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? )
            {
                // ModuleType.g:104:38: ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VALUE_PARAMETER_LIST, "VALUE_PARAMETER_LIST")
                , root_1);

                // ModuleType.g:104:61: ( simple_declaration_list )?
                if ( stream_simple_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_simple_declaration_list.nextTree());

                }
                stream_simple_declaration_list.reset();

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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, value_parameter_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "value_parameter_list"


    public static class import_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_list"
    // ModuleType.g:106:1: import_list : ( function_declaration_list )? -> ^( IMPORT_LIST ( function_declaration_list )? ) ;
    public final ModuleTypeParser.import_list_return import_list() throws RecognitionException {
        ModuleTypeParser.import_list_return retval = new ModuleTypeParser.import_list_return();
        retval.start = input.LT(1);

        int import_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.function_declaration_list_return function_declaration_list18 =null;


        RewriteRuleSubtreeStream stream_function_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // ModuleType.g:107:5: ( ( function_declaration_list )? -> ^( IMPORT_LIST ( function_declaration_list )? ) )
            // ModuleType.g:107:10: ( function_declaration_list )?
            {
            // ModuleType.g:107:10: ( function_declaration_list )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENTIFIER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ModuleType.g:107:10: function_declaration_list
                    {
                    pushFollow(FOLLOW_function_declaration_list_in_import_list641);
                    function_declaration_list18=function_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_declaration_list.add(function_declaration_list18.getTree());

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
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 107:37: -> ^( IMPORT_LIST ( function_declaration_list )? )
            {
                // ModuleType.g:107:40: ^( IMPORT_LIST ( function_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IMPORT_LIST, "IMPORT_LIST")
                , root_1);

                // ModuleType.g:107:54: ( function_declaration_list )?
                if ( stream_function_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_declaration_list.nextTree());

                }
                stream_function_declaration_list.reset();

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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, import_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "import_list"


    public static class export_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "export_list"
    // ModuleType.g:109:1: export_list : ( function_declaration_list )? -> ^( EXPORT_LIST ( function_declaration_list )? ) ;
    public final ModuleTypeParser.export_list_return export_list() throws RecognitionException {
        ModuleTypeParser.export_list_return retval = new ModuleTypeParser.export_list_return();
        retval.start = input.LT(1);

        int export_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.function_declaration_list_return function_declaration_list19 =null;


        RewriteRuleSubtreeStream stream_function_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // ModuleType.g:110:5: ( ( function_declaration_list )? -> ^( EXPORT_LIST ( function_declaration_list )? ) )
            // ModuleType.g:110:10: ( function_declaration_list )?
            {
            // ModuleType.g:110:10: ( function_declaration_list )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENTIFIER) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ModuleType.g:110:10: function_declaration_list
                    {
                    pushFollow(FOLLOW_function_declaration_list_in_export_list666);
                    function_declaration_list19=function_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_declaration_list.add(function_declaration_list19.getTree());

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
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 110:37: -> ^( EXPORT_LIST ( function_declaration_list )? )
            {
                // ModuleType.g:110:40: ^( EXPORT_LIST ( function_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPORT_LIST, "EXPORT_LIST")
                , root_1);

                // ModuleType.g:110:54: ( function_declaration_list )?
                if ( stream_function_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_declaration_list.nextTree());

                }
                stream_function_declaration_list.reset();

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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, export_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "export_list"


    public static class coercion_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coercion_list"
    // ModuleType.g:112:1: coercion_list : coercion ( ',' ! coercion )* ;
    public final ModuleTypeParser.coercion_list_return coercion_list() throws RecognitionException {
        ModuleTypeParser.coercion_list_return retval = new ModuleTypeParser.coercion_list_return();
        retval.start = input.LT(1);

        int coercion_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal21=null;
        ModuleTypeParser.coercion_return coercion20 =null;

        ModuleTypeParser.coercion_return coercion22 =null;


        Object char_literal21_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // ModuleType.g:113:5: ( coercion ( ',' ! coercion )* )
            // ModuleType.g:113:9: coercion ( ',' ! coercion )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_coercion_in_coercion_list690);
            coercion20=coercion();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, coercion20.getTree());

            // ModuleType.g:113:18: ( ',' ! coercion )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ModuleType.g:113:19: ',' ! coercion
            	    {
            	    char_literal21=(Token)match(input,COMMA,FOLLOW_COMMA_in_coercion_list693); if (state.failed) return retval;

            	    pushFollow(FOLLOW_coercion_in_coercion_list696);
            	    coercion22=coercion();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, coercion22.getTree());

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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, coercion_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "coercion_list"


    public static class coercion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coercion"
    // ModuleType.g:115:1: coercion : IDENTIFIER '<:' ^ type_name ;
    public final ModuleTypeParser.coercion_return coercion() throws RecognitionException {
        ModuleTypeParser.coercion_return retval = new ModuleTypeParser.coercion_return();
        retval.start = input.LT(1);

        int coercion_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER23=null;
        Token string_literal24=null;
        ModuleTypeParser.type_name_return type_name25 =null;


        Object IDENTIFIER23_tree=null;
        Object string_literal24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // ModuleType.g:116:5: ( IDENTIFIER '<:' ^ type_name )
            // ModuleType.g:116:9: IDENTIFIER '<:' ^ type_name
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER23=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_coercion712); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER23_tree = 
            (Object)adaptor.create(IDENTIFIER23)
            ;
            adaptor.addChild(root_0, IDENTIFIER23_tree);
            }

            string_literal24=(Token)match(input,SUBTYPE,FOLLOW_SUBTYPE_in_coercion714); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal24_tree = 
            (Object)adaptor.create(string_literal24)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal24_tree, root_0);
            }

            pushFollow(FOLLOW_type_name_in_coercion717);
            type_name25=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name25.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, coercion_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "coercion"


    public static class simple_declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_declaration_list"
    // ModuleType.g:118:1: simple_declaration_list : simple_declaration ( ',' ! simple_declaration )* ;
    public final ModuleTypeParser.simple_declaration_list_return simple_declaration_list() throws RecognitionException {
        ModuleTypeParser.simple_declaration_list_return retval = new ModuleTypeParser.simple_declaration_list_return();
        retval.start = input.LT(1);

        int simple_declaration_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal27=null;
        ModuleTypeParser.simple_declaration_return simple_declaration26 =null;

        ModuleTypeParser.simple_declaration_return simple_declaration28 =null;


        Object char_literal27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // ModuleType.g:119:5: ( simple_declaration ( ',' ! simple_declaration )* )
            // ModuleType.g:119:10: simple_declaration ( ',' ! simple_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_simple_declaration_in_simple_declaration_list732);
            simple_declaration26=simple_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_declaration26.getTree());

            // ModuleType.g:119:29: ( ',' ! simple_declaration )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ModuleType.g:119:30: ',' ! simple_declaration
            	    {
            	    char_literal27=(Token)match(input,COMMA,FOLLOW_COMMA_in_simple_declaration_list735); if (state.failed) return retval;

            	    pushFollow(FOLLOW_simple_declaration_in_simple_declaration_list738);
            	    simple_declaration28=simple_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_declaration28.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, simple_declaration_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "simple_declaration_list"


    public static class simple_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_declaration"
    // ModuleType.g:121:1: simple_declaration : IDENTIFIER ':' ^ generalized_type_name ;
    public final ModuleTypeParser.simple_declaration_return simple_declaration() throws RecognitionException {
        ModuleTypeParser.simple_declaration_return retval = new ModuleTypeParser.simple_declaration_return();
        retval.start = input.LT(1);

        int simple_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER29=null;
        Token char_literal30=null;
        ModuleTypeParser.generalized_type_name_return generalized_type_name31 =null;


        Object IDENTIFIER29_tree=null;
        Object char_literal30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // ModuleType.g:122:5: ( IDENTIFIER ':' ^ generalized_type_name )
            // ModuleType.g:122:10: IDENTIFIER ':' ^ generalized_type_name
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simple_declaration755); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER29_tree = 
            (Object)adaptor.create(IDENTIFIER29)
            ;
            adaptor.addChild(root_0, IDENTIFIER29_tree);
            }

            char_literal30=(Token)match(input,COLON,FOLLOW_COLON_in_simple_declaration757); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal30_tree = 
            (Object)adaptor.create(char_literal30)
            ;
            root_0 = (Object)adaptor.becomeRoot(char_literal30_tree, root_0);
            }

            pushFollow(FOLLOW_generalized_type_name_in_simple_declaration760);
            generalized_type_name31=generalized_type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, generalized_type_name31.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, simple_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "simple_declaration"


    public static class function_declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_declaration_list"
    // ModuleType.g:124:1: function_declaration_list : function_declaration ( ',' ! function_declaration )* ;
    public final ModuleTypeParser.function_declaration_list_return function_declaration_list() throws RecognitionException {
        ModuleTypeParser.function_declaration_list_return retval = new ModuleTypeParser.function_declaration_list_return();
        retval.start = input.LT(1);

        int function_declaration_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal33=null;
        ModuleTypeParser.function_declaration_return function_declaration32 =null;

        ModuleTypeParser.function_declaration_return function_declaration34 =null;


        Object char_literal33_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // ModuleType.g:125:5: ( function_declaration ( ',' ! function_declaration )* )
            // ModuleType.g:125:10: function_declaration ( ',' ! function_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_function_declaration_in_function_declaration_list775);
            function_declaration32=function_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, function_declaration32.getTree());

            // ModuleType.g:125:31: ( ',' ! function_declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ModuleType.g:125:32: ',' ! function_declaration
            	    {
            	    char_literal33=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_declaration_list778); if (state.failed) return retval;

            	    pushFollow(FOLLOW_function_declaration_in_function_declaration_list781);
            	    function_declaration34=function_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_declaration34.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, function_declaration_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "function_declaration_list"


    public static class function_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_declaration"
    // ModuleType.g:127:1: function_declaration : name= IDENTIFIER '(' ( simple_declaration_list )? ')' ':' return_type= generalized_type_name -> ^( FUNCTION_DECLARATION $name $return_type ( simple_declaration_list )? ) ;
    public final ModuleTypeParser.function_declaration_return function_declaration() throws RecognitionException {
        ModuleTypeParser.function_declaration_return retval = new ModuleTypeParser.function_declaration_return();
        retval.start = input.LT(1);

        int function_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token name=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token char_literal38=null;
        ModuleTypeParser.generalized_type_name_return return_type =null;

        ModuleTypeParser.simple_declaration_list_return simple_declaration_list36 =null;


        Object name_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_generalized_type_name=new RewriteRuleSubtreeStream(adaptor,"rule generalized_type_name");
        RewriteRuleSubtreeStream stream_simple_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule simple_declaration_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // ModuleType.g:128:5: (name= IDENTIFIER '(' ( simple_declaration_list )? ')' ':' return_type= generalized_type_name -> ^( FUNCTION_DECLARATION $name $return_type ( simple_declaration_list )? ) )
            // ModuleType.g:128:10: name= IDENTIFIER '(' ( simple_declaration_list )? ')' ':' return_type= generalized_type_name
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration800); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);


            char_literal35=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_function_declaration802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPARENS.add(char_literal35);


            // ModuleType.g:128:30: ( simple_declaration_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ModuleType.g:128:30: simple_declaration_list
                    {
                    pushFollow(FOLLOW_simple_declaration_list_in_function_declaration804);
                    simple_declaration_list36=simple_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simple_declaration_list.add(simple_declaration_list36.getTree());

                    }
                    break;

            }


            char_literal37=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_function_declaration807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPARENS.add(char_literal37);


            char_literal38=(Token)match(input,COLON,FOLLOW_COLON_in_function_declaration809); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(char_literal38);


            pushFollow(FOLLOW_generalized_type_name_in_function_declaration813);
            return_type=generalized_type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_generalized_type_name.add(return_type.getTree());

            // AST REWRITE
            // elements: name, simple_declaration_list, return_type
            // token labels: name
            // rule labels: retval, return_type
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type",return_type!=null?return_type.tree:null);

            root_0 = (Object)adaptor.nil();
            // 129:10: -> ^( FUNCTION_DECLARATION $name $return_type ( simple_declaration_list )? )
            {
                // ModuleType.g:129:13: ^( FUNCTION_DECLARATION $name $return_type ( simple_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_DECLARATION, "FUNCTION_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextNode());

                adaptor.addChild(root_1, stream_return_type.nextTree());

                // ModuleType.g:129:55: ( simple_declaration_list )?
                if ( stream_simple_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_simple_declaration_list.nextTree());

                }
                stream_simple_declaration_list.reset();

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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, function_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "function_declaration"


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // ModuleType.g:131:1: type_name : ( VOID | INT8 | INT16 | INT32 | UINT8 | UINT16 | UINT32 );
    public final ModuleTypeParser.type_name_return type_name() throws RecognitionException {
        ModuleTypeParser.type_name_return retval = new ModuleTypeParser.type_name_return();
        retval.start = input.LT(1);

        int type_name_StartIndex = input.index();

        Object root_0 = null;

        Token set39=null;

        Object set39_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // ModuleType.g:132:5: ( VOID | INT8 | INT16 | INT32 | UINT8 | UINT16 | UINT32 )
            // ModuleType.g:
            {
            root_0 = (Object)adaptor.nil();


            set39=(Token)input.LT(1);

            if ( (input.LA(1) >= INT16 && input.LA(1) <= INT8)||(input.LA(1) >= UINT16 && input.LA(1) <= UINT8)||input.LA(1)==VOID ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set39)
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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, type_name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_name"


    public static class generalized_type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generalized_type_name"
    // ModuleType.g:140:1: generalized_type_name : ( type_name | IDENTIFIER );
    public final ModuleTypeParser.generalized_type_name_return generalized_type_name() throws RecognitionException {
        ModuleTypeParser.generalized_type_name_return retval = new ModuleTypeParser.generalized_type_name_return();
        retval.start = input.LT(1);

        int generalized_type_name_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER41=null;
        ModuleTypeParser.type_name_return type_name40 =null;


        Object IDENTIFIER41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // ModuleType.g:141:5: ( type_name | IDENTIFIER )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0 >= INT16 && LA10_0 <= INT8)||(LA10_0 >= UINT16 && LA10_0 <= UINT8)||LA10_0==VOID) ) {
                alt10=1;
            }
            else if ( (LA10_0==IDENTIFIER) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // ModuleType.g:141:10: type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_name_in_generalized_type_name933);
                    type_name40=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name40.getTree());

                    }
                    break;
                case 2 :
                    // ModuleType.g:141:22: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER41=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_generalized_type_name937); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER41_tree = 
                    (Object)adaptor.create(IDENTIFIER41)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER41_tree);
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

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, generalized_type_name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "generalized_type_name"

    // Delegated rules


 

    public static final BitSet FOLLOW_LBRACE_in_module_type403 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_existential_list_in_module_type405 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACE_in_module_type407 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LANGLE_in_module_type418 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_type_parameter_list_in_module_type420 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_SEMI_in_module_type422 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_value_parameter_list_in_module_type424 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RANGLE_in_module_type426 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LBRACE_in_module_type437 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_import_list_in_module_type439 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_SEMI_in_module_type441 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_export_list_in_module_type443 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACE_in_module_type445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module_type447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_list_in_existential_list566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_list_in_type_parameter_list591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_declaration_list_in_value_parameter_list616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_list_in_import_list641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_list_in_export_list666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_in_coercion_list690 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_coercion_list693 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_coercion_in_coercion_list696 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENTIFIER_in_coercion712 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SUBTYPE_in_coercion714 = new BitSet(new long[]{0x00000000B800E000L});
    public static final BitSet FOLLOW_type_name_in_coercion717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_declaration_in_simple_declaration_list732 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_simple_declaration_list735 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_simple_declaration_in_simple_declaration_list738 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simple_declaration755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_simple_declaration757 = new BitSet(new long[]{0x00000000B800E800L});
    public static final BitSet FOLLOW_generalized_type_name_in_simple_declaration760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_in_function_declaration_list775 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_function_declaration_list778 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_function_declaration_in_function_declaration_list781 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration800 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPARENS_in_function_declaration802 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_simple_declaration_list_in_function_declaration804 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RPARENS_in_function_declaration807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_function_declaration809 = new BitSet(new long[]{0x00000000B800E800L});
    public static final BitSet FOLLOW_generalized_type_name_in_function_declaration813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_generalized_type_name933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_generalized_type_name937 = new BitSet(new long[]{0x0000000000000002L});

}