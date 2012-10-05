// $ANTLR 3.4 ModuleType.g 2012-10-05 19:48:27

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COLON", "COMMA", "COMMENT1", "COMMENT2", "EXISTENTIAL_LIST", "EXPORT_LIST", "IDENTIFIER", "IMPORT_LIST", "INT16", "INT32", "INT8", "LANGLE", "LBRACE", "LPARENS", "MODULE_TYPE", "PARAMETER_LIST", "RANGLE", "RBRACE", "RPARENS", "SEMI", "SUBTYPE", "TYPE_PARAMETER_LIST", "UINT16", "UINT32", "UINT8", "VALUE_PARAMETER_LIST", "WHITESPACE"
    };

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
        this.state.ruleMemo = new HashMap[23+1];
         

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
    // ModuleType.g:85:1: module_type : '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list ) ;
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
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_RANGLE=new RewriteRuleTokenStream(adaptor,"token RANGLE");
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

            // ModuleType.g:86:5: ( '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list ) )
            // ModuleType.g:86:10: '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}'
            {
            char_literal1=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_type383); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal1);


            pushFollow(FOLLOW_existential_list_in_module_type385);
            existential_list2=existential_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_existential_list.add(existential_list2.getTree());

            char_literal3=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_type387); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal3);


            char_literal4=(Token)match(input,LANGLE,FOLLOW_LANGLE_in_module_type398); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LANGLE.add(char_literal4);


            pushFollow(FOLLOW_type_parameter_list_in_module_type400);
            type_parameter_list5=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_parameter_list.add(type_parameter_list5.getTree());

            char_literal6=(Token)match(input,SEMI,FOLLOW_SEMI_in_module_type402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal6);


            pushFollow(FOLLOW_value_parameter_list_in_module_type404);
            value_parameter_list7=value_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value_parameter_list.add(value_parameter_list7.getTree());

            char_literal8=(Token)match(input,RANGLE,FOLLOW_RANGLE_in_module_type406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RANGLE.add(char_literal8);


            char_literal9=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_type417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal9);


            pushFollow(FOLLOW_import_list_in_module_type419);
            import_list10=import_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_import_list.add(import_list10.getTree());

            char_literal11=(Token)match(input,SEMI,FOLLOW_SEMI_in_module_type421); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal11);


            pushFollow(FOLLOW_export_list_in_module_type423);
            export_list12=export_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_export_list.add(export_list12.getTree());

            char_literal13=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_type425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal13);


            // AST REWRITE
            // elements: type_parameter_list, existential_list, import_list, value_parameter_list, export_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:5: -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list )
            {
                // ModuleType.g:89:8: ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list )
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
    // ModuleType.g:95:1: existential_list : ( coercion_list )? -> ^( EXISTENTIAL_LIST ( coercion_list )? ) ;
    public final ModuleTypeParser.existential_list_return existential_list() throws RecognitionException {
        ModuleTypeParser.existential_list_return retval = new ModuleTypeParser.existential_list_return();
        retval.start = input.LT(1);

        int existential_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.coercion_list_return coercion_list14 =null;


        RewriteRuleSubtreeStream stream_coercion_list=new RewriteRuleSubtreeStream(adaptor,"rule coercion_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // ModuleType.g:96:5: ( ( coercion_list )? -> ^( EXISTENTIAL_LIST ( coercion_list )? ) )
            // ModuleType.g:96:10: ( coercion_list )?
            {
            // ModuleType.g:96:10: ( coercion_list )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==IDENTIFIER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ModuleType.g:96:10: coercion_list
                    {
                    pushFollow(FOLLOW_coercion_list_in_existential_list544);
                    coercion_list14=coercion_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_coercion_list.add(coercion_list14.getTree());

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
            // 96:25: -> ^( EXISTENTIAL_LIST ( coercion_list )? )
            {
                // ModuleType.g:96:28: ^( EXISTENTIAL_LIST ( coercion_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXISTENTIAL_LIST, "EXISTENTIAL_LIST")
                , root_1);

                // ModuleType.g:96:47: ( coercion_list )?
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
    // ModuleType.g:98:1: type_parameter_list : ( coercion_list )? -> ^( TYPE_PARAMETER_LIST ( coercion_list )? ) ;
    public final ModuleTypeParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        ModuleTypeParser.type_parameter_list_return retval = new ModuleTypeParser.type_parameter_list_return();
        retval.start = input.LT(1);

        int type_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.coercion_list_return coercion_list15 =null;


        RewriteRuleSubtreeStream stream_coercion_list=new RewriteRuleSubtreeStream(adaptor,"rule coercion_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // ModuleType.g:99:5: ( ( coercion_list )? -> ^( TYPE_PARAMETER_LIST ( coercion_list )? ) )
            // ModuleType.g:99:10: ( coercion_list )?
            {
            // ModuleType.g:99:10: ( coercion_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ModuleType.g:99:10: coercion_list
                    {
                    pushFollow(FOLLOW_coercion_list_in_type_parameter_list569);
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
            // 99:25: -> ^( TYPE_PARAMETER_LIST ( coercion_list )? )
            {
                // ModuleType.g:99:28: ^( TYPE_PARAMETER_LIST ( coercion_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE_PARAMETER_LIST, "TYPE_PARAMETER_LIST")
                , root_1);

                // ModuleType.g:99:50: ( coercion_list )?
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
    // ModuleType.g:101:1: value_parameter_list : ( declaration_list )? -> ^( VALUE_PARAMETER_LIST ( declaration_list )? ) ;
    public final ModuleTypeParser.value_parameter_list_return value_parameter_list() throws RecognitionException {
        ModuleTypeParser.value_parameter_list_return retval = new ModuleTypeParser.value_parameter_list_return();
        retval.start = input.LT(1);

        int value_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.declaration_list_return declaration_list16 =null;


        RewriteRuleSubtreeStream stream_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule declaration_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // ModuleType.g:102:5: ( ( declaration_list )? -> ^( VALUE_PARAMETER_LIST ( declaration_list )? ) )
            // ModuleType.g:102:10: ( declaration_list )?
            {
            // ModuleType.g:102:10: ( declaration_list )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENTIFIER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ModuleType.g:102:10: declaration_list
                    {
                    pushFollow(FOLLOW_declaration_list_in_value_parameter_list594);
                    declaration_list16=declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_list.add(declaration_list16.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: declaration_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:28: -> ^( VALUE_PARAMETER_LIST ( declaration_list )? )
            {
                // ModuleType.g:102:31: ^( VALUE_PARAMETER_LIST ( declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VALUE_PARAMETER_LIST, "VALUE_PARAMETER_LIST")
                , root_1);

                // ModuleType.g:102:54: ( declaration_list )?
                if ( stream_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration_list.nextTree());

                }
                stream_declaration_list.reset();

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
    // ModuleType.g:104:1: import_list : ( declaration_list )? -> ^( IMPORT_LIST ( declaration_list )? ) ;
    public final ModuleTypeParser.import_list_return import_list() throws RecognitionException {
        ModuleTypeParser.import_list_return retval = new ModuleTypeParser.import_list_return();
        retval.start = input.LT(1);

        int import_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.declaration_list_return declaration_list17 =null;


        RewriteRuleSubtreeStream stream_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule declaration_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // ModuleType.g:105:5: ( ( declaration_list )? -> ^( IMPORT_LIST ( declaration_list )? ) )
            // ModuleType.g:105:10: ( declaration_list )?
            {
            // ModuleType.g:105:10: ( declaration_list )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENTIFIER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ModuleType.g:105:10: declaration_list
                    {
                    pushFollow(FOLLOW_declaration_list_in_import_list619);
                    declaration_list17=declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_list.add(declaration_list17.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: declaration_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 105:28: -> ^( IMPORT_LIST ( declaration_list )? )
            {
                // ModuleType.g:105:31: ^( IMPORT_LIST ( declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IMPORT_LIST, "IMPORT_LIST")
                , root_1);

                // ModuleType.g:105:45: ( declaration_list )?
                if ( stream_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration_list.nextTree());

                }
                stream_declaration_list.reset();

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
    // ModuleType.g:107:1: export_list : ( declaration_list )? -> ^( EXPORT_LIST ( declaration_list )? ) ;
    public final ModuleTypeParser.export_list_return export_list() throws RecognitionException {
        ModuleTypeParser.export_list_return retval = new ModuleTypeParser.export_list_return();
        retval.start = input.LT(1);

        int export_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.declaration_list_return declaration_list18 =null;


        RewriteRuleSubtreeStream stream_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule declaration_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // ModuleType.g:108:5: ( ( declaration_list )? -> ^( EXPORT_LIST ( declaration_list )? ) )
            // ModuleType.g:108:10: ( declaration_list )?
            {
            // ModuleType.g:108:10: ( declaration_list )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENTIFIER) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ModuleType.g:108:10: declaration_list
                    {
                    pushFollow(FOLLOW_declaration_list_in_export_list644);
                    declaration_list18=declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration_list.add(declaration_list18.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: declaration_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 108:28: -> ^( EXPORT_LIST ( declaration_list )? )
            {
                // ModuleType.g:108:31: ^( EXPORT_LIST ( declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPORT_LIST, "EXPORT_LIST")
                , root_1);

                // ModuleType.g:108:45: ( declaration_list )?
                if ( stream_declaration_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration_list.nextTree());

                }
                stream_declaration_list.reset();

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
    // ModuleType.g:110:1: coercion_list : coercion ( ',' ! coercion )* ;
    public final ModuleTypeParser.coercion_list_return coercion_list() throws RecognitionException {
        ModuleTypeParser.coercion_list_return retval = new ModuleTypeParser.coercion_list_return();
        retval.start = input.LT(1);

        int coercion_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal20=null;
        ModuleTypeParser.coercion_return coercion19 =null;

        ModuleTypeParser.coercion_return coercion21 =null;


        Object char_literal20_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // ModuleType.g:111:5: ( coercion ( ',' ! coercion )* )
            // ModuleType.g:111:9: coercion ( ',' ! coercion )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_coercion_in_coercion_list668);
            coercion19=coercion();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, coercion19.getTree());

            // ModuleType.g:111:18: ( ',' ! coercion )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ModuleType.g:111:19: ',' ! coercion
            	    {
            	    char_literal20=(Token)match(input,COMMA,FOLLOW_COMMA_in_coercion_list671); if (state.failed) return retval;

            	    pushFollow(FOLLOW_coercion_in_coercion_list674);
            	    coercion21=coercion();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, coercion21.getTree());

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
    // ModuleType.g:113:1: coercion : IDENTIFIER '<:' ^ type_name ;
    public final ModuleTypeParser.coercion_return coercion() throws RecognitionException {
        ModuleTypeParser.coercion_return retval = new ModuleTypeParser.coercion_return();
        retval.start = input.LT(1);

        int coercion_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER22=null;
        Token string_literal23=null;
        ModuleTypeParser.type_name_return type_name24 =null;


        Object IDENTIFIER22_tree=null;
        Object string_literal23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // ModuleType.g:114:5: ( IDENTIFIER '<:' ^ type_name )
            // ModuleType.g:114:9: IDENTIFIER '<:' ^ type_name
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER22=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_coercion690); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER22_tree = 
            (Object)adaptor.create(IDENTIFIER22)
            ;
            adaptor.addChild(root_0, IDENTIFIER22_tree);
            }

            string_literal23=(Token)match(input,SUBTYPE,FOLLOW_SUBTYPE_in_coercion692); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal23_tree = 
            (Object)adaptor.create(string_literal23)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal23_tree, root_0);
            }

            pushFollow(FOLLOW_type_name_in_coercion695);
            type_name24=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name24.getTree());

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


    public static class declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration_list"
    // ModuleType.g:116:1: declaration_list : declaration ( ',' ! declaration )* ;
    public final ModuleTypeParser.declaration_list_return declaration_list() throws RecognitionException {
        ModuleTypeParser.declaration_list_return retval = new ModuleTypeParser.declaration_list_return();
        retval.start = input.LT(1);

        int declaration_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal26=null;
        ModuleTypeParser.declaration_return declaration25 =null;

        ModuleTypeParser.declaration_return declaration27 =null;


        Object char_literal26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // ModuleType.g:117:5: ( declaration ( ',' ! declaration )* )
            // ModuleType.g:117:10: declaration ( ',' ! declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaration_in_declaration_list710);
            declaration25=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration25.getTree());

            // ModuleType.g:117:22: ( ',' ! declaration )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ModuleType.g:117:23: ',' ! declaration
            	    {
            	    char_literal26=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration_list713); if (state.failed) return retval;

            	    pushFollow(FOLLOW_declaration_in_declaration_list716);
            	    declaration27=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration27.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, declaration_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "declaration_list"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // ModuleType.g:119:1: declaration : IDENTIFIER ':' ^ type_name ;
    public final ModuleTypeParser.declaration_return declaration() throws RecognitionException {
        ModuleTypeParser.declaration_return retval = new ModuleTypeParser.declaration_return();
        retval.start = input.LT(1);

        int declaration_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER28=null;
        Token char_literal29=null;
        ModuleTypeParser.type_name_return type_name30 =null;


        Object IDENTIFIER28_tree=null;
        Object char_literal29_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // ModuleType.g:120:5: ( IDENTIFIER ':' ^ type_name )
            // ModuleType.g:120:10: IDENTIFIER ':' ^ type_name
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration733); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER28_tree = 
            (Object)adaptor.create(IDENTIFIER28)
            ;
            adaptor.addChild(root_0, IDENTIFIER28_tree);
            }

            char_literal29=(Token)match(input,COLON,FOLLOW_COLON_in_declaration735); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal29_tree = 
            (Object)adaptor.create(char_literal29)
            ;
            root_0 = (Object)adaptor.becomeRoot(char_literal29_tree, root_0);
            }

            pushFollow(FOLLOW_type_name_in_declaration738);
            type_name30=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name30.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // ModuleType.g:122:1: type_name : ( INT8 | INT16 | INT32 | UINT8 | UINT16 | UINT32 );
    public final ModuleTypeParser.type_name_return type_name() throws RecognitionException {
        ModuleTypeParser.type_name_return retval = new ModuleTypeParser.type_name_return();
        retval.start = input.LT(1);

        int type_name_StartIndex = input.index();

        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // ModuleType.g:123:5: ( INT8 | INT16 | INT32 | UINT8 | UINT16 | UINT32 )
            // ModuleType.g:
            {
            root_0 = (Object)adaptor.nil();


            set31=(Token)input.LT(1);

            if ( (input.LA(1) >= INT16 && input.LA(1) <= INT8)||(input.LA(1) >= UINT16 && input.LA(1) <= UINT8) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set31)
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
            if ( state.backtracking>0 ) { memoize(input, 11, type_name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_name"

    // Delegated rules


 

    public static final BitSet FOLLOW_LBRACE_in_module_type383 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_existential_list_in_module_type385 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_module_type387 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LANGLE_in_module_type398 = new BitSet(new long[]{0x0000000000800400L});
    public static final BitSet FOLLOW_type_parameter_list_in_module_type400 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_module_type402 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_value_parameter_list_in_module_type404 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RANGLE_in_module_type406 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACE_in_module_type417 = new BitSet(new long[]{0x0000000000800400L});
    public static final BitSet FOLLOW_import_list_in_module_type419 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_module_type421 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_export_list_in_module_type423 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_module_type425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_list_in_existential_list544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_list_in_type_parameter_list569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_list_in_value_parameter_list594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_list_in_import_list619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_list_in_export_list644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_in_coercion_list668 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_coercion_list671 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_coercion_in_coercion_list674 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENTIFIER_in_coercion690 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_SUBTYPE_in_coercion692 = new BitSet(new long[]{0x000000001C007000L});
    public static final BitSet FOLLOW_type_name_in_coercion695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declaration_list710 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_declaration_list713 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_declaration_in_declaration_list716 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENTIFIER_in_declaration733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_declaration735 = new BitSet(new long[]{0x000000001C007000L});
    public static final BitSet FOLLOW_type_name_in_declaration738 = new BitSet(new long[]{0x0000000000000002L});

}