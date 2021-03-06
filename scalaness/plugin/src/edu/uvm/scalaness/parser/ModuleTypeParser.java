// $ANTLR 3.4 ModuleType.g 2012-10-11 18:48:19

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "COLON", "COMMA", "COMMENT1", "COMMENT2", "ERRORT", "EXISTENTIAL_LIST", "EXPORT_LIST", "FUNCTION_DECLARATION", "IDENTIFIER", "IMPORT_LIST", "INT16", "INT32", "INT8", "LANGLE", "LBRACE", "LBRACKET", "LPARENS", "MODULE_TYPE", "PARAMETER_LIST", "RANGLE", "RBRACE", "RBRACKET", "RPARENS", "SEMI", "SUBTYPE", "TYPE_PARAMETER_LIST", "UINT16", "UINT32", "UINT8", "VALUE_PARAMETER_LIST", "VOID", "WHITESPACE"
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
        this.state.ruleMemo = new HashMap[33+1];
         

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


    public static class module_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_type"
    // ModuleType.g:116:1: module_type : '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' EOF -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list ) ;
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

            // ModuleType.g:117:5: ( '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' EOF -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list ) )
            // ModuleType.g:117:10: '{' existential_list '}' '<' type_parameter_list ';' value_parameter_list '>' '{' import_list ';' export_list '}' EOF
            {
            char_literal1=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_type461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal1);


            pushFollow(FOLLOW_existential_list_in_module_type463);
            existential_list2=existential_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_existential_list.add(existential_list2.getTree());

            char_literal3=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_type465); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal3);


            char_literal4=(Token)match(input,LANGLE,FOLLOW_LANGLE_in_module_type476); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LANGLE.add(char_literal4);


            pushFollow(FOLLOW_type_parameter_list_in_module_type478);
            type_parameter_list5=type_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_parameter_list.add(type_parameter_list5.getTree());

            char_literal6=(Token)match(input,SEMI,FOLLOW_SEMI_in_module_type480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal6);


            pushFollow(FOLLOW_value_parameter_list_in_module_type482);
            value_parameter_list7=value_parameter_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value_parameter_list.add(value_parameter_list7.getTree());

            char_literal8=(Token)match(input,RANGLE,FOLLOW_RANGLE_in_module_type484); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RANGLE.add(char_literal8);


            char_literal9=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_module_type495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(char_literal9);


            pushFollow(FOLLOW_import_list_in_module_type497);
            import_list10=import_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_import_list.add(import_list10.getTree());

            char_literal11=(Token)match(input,SEMI,FOLLOW_SEMI_in_module_type499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal11);


            pushFollow(FOLLOW_export_list_in_module_type501);
            export_list12=export_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_export_list.add(export_list12.getTree());

            char_literal13=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_module_type503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(char_literal13);


            EOF14=(Token)match(input,EOF,FOLLOW_EOF_in_module_type505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF14);


            // AST REWRITE
            // elements: export_list, type_parameter_list, import_list, value_parameter_list, existential_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:5: -> ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list )
            {
                // ModuleType.g:120:8: ^( MODULE_TYPE existential_list type_parameter_list value_parameter_list import_list export_list )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:126:1: existential_list : ( coercion_list )? -> ^( EXISTENTIAL_LIST ( coercion_list )? ) ;
    public final ModuleTypeParser.existential_list_return existential_list() throws RecognitionException {
        ModuleTypeParser.existential_list_return retval = new ModuleTypeParser.existential_list_return();
        retval.start = input.LT(1);

        int existential_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.coercion_list_return coercion_list15 =null;


        RewriteRuleSubtreeStream stream_coercion_list=new RewriteRuleSubtreeStream(adaptor,"rule coercion_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // ModuleType.g:127:5: ( ( coercion_list )? -> ^( EXISTENTIAL_LIST ( coercion_list )? ) )
            // ModuleType.g:127:10: ( coercion_list )?
            {
            // ModuleType.g:127:10: ( coercion_list )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==IDENTIFIER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ModuleType.g:127:10: coercion_list
                    {
                    pushFollow(FOLLOW_coercion_list_in_existential_list624);
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
            // 127:25: -> ^( EXISTENTIAL_LIST ( coercion_list )? )
            {
                // ModuleType.g:127:28: ^( EXISTENTIAL_LIST ( coercion_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXISTENTIAL_LIST, "EXISTENTIAL_LIST")
                , root_1);

                // ModuleType.g:127:47: ( coercion_list )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:129:1: type_parameter_list : ( coercion_list )? -> ^( TYPE_PARAMETER_LIST ( coercion_list )? ) ;
    public final ModuleTypeParser.type_parameter_list_return type_parameter_list() throws RecognitionException {
        ModuleTypeParser.type_parameter_list_return retval = new ModuleTypeParser.type_parameter_list_return();
        retval.start = input.LT(1);

        int type_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.coercion_list_return coercion_list16 =null;


        RewriteRuleSubtreeStream stream_coercion_list=new RewriteRuleSubtreeStream(adaptor,"rule coercion_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // ModuleType.g:130:5: ( ( coercion_list )? -> ^( TYPE_PARAMETER_LIST ( coercion_list )? ) )
            // ModuleType.g:130:10: ( coercion_list )?
            {
            // ModuleType.g:130:10: ( coercion_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ModuleType.g:130:10: coercion_list
                    {
                    pushFollow(FOLLOW_coercion_list_in_type_parameter_list649);
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
            // 130:25: -> ^( TYPE_PARAMETER_LIST ( coercion_list )? )
            {
                // ModuleType.g:130:28: ^( TYPE_PARAMETER_LIST ( coercion_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE_PARAMETER_LIST, "TYPE_PARAMETER_LIST")
                , root_1);

                // ModuleType.g:130:50: ( coercion_list )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:132:1: value_parameter_list : ( simple_declaration_list )? -> ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? ) ;
    public final ModuleTypeParser.value_parameter_list_return value_parameter_list() throws RecognitionException {
        ModuleTypeParser.value_parameter_list_return retval = new ModuleTypeParser.value_parameter_list_return();
        retval.start = input.LT(1);

        int value_parameter_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.simple_declaration_list_return simple_declaration_list17 =null;


        RewriteRuleSubtreeStream stream_simple_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule simple_declaration_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // ModuleType.g:133:5: ( ( simple_declaration_list )? -> ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? ) )
            // ModuleType.g:133:10: ( simple_declaration_list )?
            {
            // ModuleType.g:133:10: ( simple_declaration_list )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENTIFIER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ModuleType.g:133:10: simple_declaration_list
                    {
                    pushFollow(FOLLOW_simple_declaration_list_in_value_parameter_list674);
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
            // 133:35: -> ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? )
            {
                // ModuleType.g:133:38: ^( VALUE_PARAMETER_LIST ( simple_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VALUE_PARAMETER_LIST, "VALUE_PARAMETER_LIST")
                , root_1);

                // ModuleType.g:133:61: ( simple_declaration_list )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:135:1: import_list : ( function_declaration_list )? -> ^( IMPORT_LIST ( function_declaration_list )? ) ;
    public final ModuleTypeParser.import_list_return import_list() throws RecognitionException {
        ModuleTypeParser.import_list_return retval = new ModuleTypeParser.import_list_return();
        retval.start = input.LT(1);

        int import_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.function_declaration_list_return function_declaration_list18 =null;


        RewriteRuleSubtreeStream stream_function_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // ModuleType.g:136:5: ( ( function_declaration_list )? -> ^( IMPORT_LIST ( function_declaration_list )? ) )
            // ModuleType.g:136:10: ( function_declaration_list )?
            {
            // ModuleType.g:136:10: ( function_declaration_list )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENTIFIER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ModuleType.g:136:10: function_declaration_list
                    {
                    pushFollow(FOLLOW_function_declaration_list_in_import_list699);
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
            // 136:37: -> ^( IMPORT_LIST ( function_declaration_list )? )
            {
                // ModuleType.g:136:40: ^( IMPORT_LIST ( function_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IMPORT_LIST, "IMPORT_LIST")
                , root_1);

                // ModuleType.g:136:54: ( function_declaration_list )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:138:1: export_list : ( function_declaration_list )? -> ^( EXPORT_LIST ( function_declaration_list )? ) ;
    public final ModuleTypeParser.export_list_return export_list() throws RecognitionException {
        ModuleTypeParser.export_list_return retval = new ModuleTypeParser.export_list_return();
        retval.start = input.LT(1);

        int export_list_StartIndex = input.index();

        Object root_0 = null;

        ModuleTypeParser.function_declaration_list_return function_declaration_list19 =null;


        RewriteRuleSubtreeStream stream_function_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // ModuleType.g:139:5: ( ( function_declaration_list )? -> ^( EXPORT_LIST ( function_declaration_list )? ) )
            // ModuleType.g:139:10: ( function_declaration_list )?
            {
            // ModuleType.g:139:10: ( function_declaration_list )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENTIFIER) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ModuleType.g:139:10: function_declaration_list
                    {
                    pushFollow(FOLLOW_function_declaration_list_in_export_list724);
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
            // 139:37: -> ^( EXPORT_LIST ( function_declaration_list )? )
            {
                // ModuleType.g:139:40: ^( EXPORT_LIST ( function_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPORT_LIST, "EXPORT_LIST")
                , root_1);

                // ModuleType.g:139:54: ( function_declaration_list )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:141:1: coercion_list : coercion ( ',' ! coercion )* ;
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

            // ModuleType.g:142:5: ( coercion ( ',' ! coercion )* )
            // ModuleType.g:142:9: coercion ( ',' ! coercion )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_coercion_in_coercion_list748);
            coercion20=coercion();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, coercion20.getTree());

            // ModuleType.g:142:18: ( ',' ! coercion )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ModuleType.g:142:19: ',' ! coercion
            	    {
            	    char_literal21=(Token)match(input,COMMA,FOLLOW_COMMA_in_coercion_list751); if (state.failed) return retval;

            	    pushFollow(FOLLOW_coercion_in_coercion_list754);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:144:1: coercion : IDENTIFIER '<:' ^ type_name ;
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

            // ModuleType.g:145:5: ( IDENTIFIER '<:' ^ type_name )
            // ModuleType.g:145:9: IDENTIFIER '<:' ^ type_name
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER23=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_coercion770); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER23_tree = 
            (Object)adaptor.create(IDENTIFIER23)
            ;
            adaptor.addChild(root_0, IDENTIFIER23_tree);
            }

            string_literal24=(Token)match(input,SUBTYPE,FOLLOW_SUBTYPE_in_coercion772); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal24_tree = 
            (Object)adaptor.create(string_literal24)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal24_tree, root_0);
            }

            pushFollow(FOLLOW_type_name_in_coercion775);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:147:1: simple_declaration_list : simple_declaration ( ',' ! simple_declaration )* ;
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

            // ModuleType.g:148:5: ( simple_declaration ( ',' ! simple_declaration )* )
            // ModuleType.g:148:10: simple_declaration ( ',' ! simple_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_simple_declaration_in_simple_declaration_list790);
            simple_declaration26=simple_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_declaration26.getTree());

            // ModuleType.g:148:29: ( ',' ! simple_declaration )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ModuleType.g:148:30: ',' ! simple_declaration
            	    {
            	    char_literal27=(Token)match(input,COMMA,FOLLOW_COMMA_in_simple_declaration_list793); if (state.failed) return retval;

            	    pushFollow(FOLLOW_simple_declaration_in_simple_declaration_list796);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:150:1: simple_declaration : IDENTIFIER ':' ^ type_specifier ;
    public final ModuleTypeParser.simple_declaration_return simple_declaration() throws RecognitionException {
        ModuleTypeParser.simple_declaration_return retval = new ModuleTypeParser.simple_declaration_return();
        retval.start = input.LT(1);

        int simple_declaration_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER29=null;
        Token char_literal30=null;
        ModuleTypeParser.type_specifier_return type_specifier31 =null;


        Object IDENTIFIER29_tree=null;
        Object char_literal30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // ModuleType.g:151:5: ( IDENTIFIER ':' ^ type_specifier )
            // ModuleType.g:151:10: IDENTIFIER ':' ^ type_specifier
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simple_declaration813); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER29_tree = 
            (Object)adaptor.create(IDENTIFIER29)
            ;
            adaptor.addChild(root_0, IDENTIFIER29_tree);
            }

            char_literal30=(Token)match(input,COLON,FOLLOW_COLON_in_simple_declaration815); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal30_tree = 
            (Object)adaptor.create(char_literal30)
            ;
            root_0 = (Object)adaptor.becomeRoot(char_literal30_tree, root_0);
            }

            pushFollow(FOLLOW_type_specifier_in_simple_declaration818);
            type_specifier31=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier31.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:153:1: function_declaration_list : function_declaration ( ',' ! function_declaration )* ;
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

            // ModuleType.g:154:5: ( function_declaration ( ',' ! function_declaration )* )
            // ModuleType.g:154:10: function_declaration ( ',' ! function_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_function_declaration_in_function_declaration_list833);
            function_declaration32=function_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, function_declaration32.getTree());

            // ModuleType.g:154:31: ( ',' ! function_declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ModuleType.g:154:32: ',' ! function_declaration
            	    {
            	    char_literal33=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_declaration_list836); if (state.failed) return retval;

            	    pushFollow(FOLLOW_function_declaration_in_function_declaration_list839);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // ModuleType.g:156:1: function_declaration : name= IDENTIFIER '(' ( simple_declaration_list )? ')' ':' return_type= generalized_type_name -> ^( FUNCTION_DECLARATION $name $return_type ( simple_declaration_list )? ) ;
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

            // ModuleType.g:157:5: (name= IDENTIFIER '(' ( simple_declaration_list )? ')' ':' return_type= generalized_type_name -> ^( FUNCTION_DECLARATION $name $return_type ( simple_declaration_list )? ) )
            // ModuleType.g:157:10: name= IDENTIFIER '(' ( simple_declaration_list )? ')' ':' return_type= generalized_type_name
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration858); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(name);


            char_literal35=(Token)match(input,LPARENS,FOLLOW_LPARENS_in_function_declaration860); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPARENS.add(char_literal35);


            // ModuleType.g:157:30: ( simple_declaration_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ModuleType.g:157:30: simple_declaration_list
                    {
                    pushFollow(FOLLOW_simple_declaration_list_in_function_declaration862);
                    simple_declaration_list36=simple_declaration_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simple_declaration_list.add(simple_declaration_list36.getTree());

                    }
                    break;

            }


            char_literal37=(Token)match(input,RPARENS,FOLLOW_RPARENS_in_function_declaration865); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPARENS.add(char_literal37);


            char_literal38=(Token)match(input,COLON,FOLLOW_COLON_in_function_declaration867); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(char_literal38);


            pushFollow(FOLLOW_generalized_type_name_in_function_declaration871);
            return_type=generalized_type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_generalized_type_name.add(return_type.getTree());

            // AST REWRITE
            // elements: return_type, simple_declaration_list, name
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
            // 158:10: -> ^( FUNCTION_DECLARATION $name $return_type ( simple_declaration_list )? )
            {
                // ModuleType.g:158:13: ^( FUNCTION_DECLARATION $name $return_type ( simple_declaration_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_DECLARATION, "FUNCTION_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextNode());

                adaptor.addChild(root_1, stream_return_type.nextTree());

                // ModuleType.g:158:55: ( simple_declaration_list )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, function_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "function_declaration"


    public static class type_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // ModuleType.g:160:1: type_specifier : ( generalized_type_name | ARRAY '[' generalized_type_name ']' -> ^( ARRAY generalized_type_name ) );
    public final ModuleTypeParser.type_specifier_return type_specifier() throws RecognitionException {
        ModuleTypeParser.type_specifier_return retval = new ModuleTypeParser.type_specifier_return();
        retval.start = input.LT(1);

        int type_specifier_StartIndex = input.index();

        Object root_0 = null;

        Token ARRAY40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        ModuleTypeParser.generalized_type_name_return generalized_type_name39 =null;

        ModuleTypeParser.generalized_type_name_return generalized_type_name42 =null;


        Object ARRAY40_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_generalized_type_name=new RewriteRuleSubtreeStream(adaptor,"rule generalized_type_name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // ModuleType.g:161:5: ( generalized_type_name | ARRAY '[' generalized_type_name ']' -> ^( ARRAY generalized_type_name ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ERRORT||LA10_0==IDENTIFIER||(LA10_0 >= INT16 && LA10_0 <= INT8)||(LA10_0 >= UINT16 && LA10_0 <= UINT8)||LA10_0==VOID) ) {
                alt10=1;
            }
            else if ( (LA10_0==ARRAY) ) {
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
                    // ModuleType.g:161:10: generalized_type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_generalized_type_name_in_type_specifier910);
                    generalized_type_name39=generalized_type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, generalized_type_name39.getTree());

                    }
                    break;
                case 2 :
                    // ModuleType.g:162:10: ARRAY '[' generalized_type_name ']'
                    {
                    ARRAY40=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type_specifier921); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY40);


                    char_literal41=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_type_specifier923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal41);


                    pushFollow(FOLLOW_generalized_type_name_in_type_specifier925);
                    generalized_type_name42=generalized_type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_generalized_type_name.add(generalized_type_name42.getTree());

                    char_literal43=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_type_specifier927); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal43);


                    // AST REWRITE
                    // elements: generalized_type_name, ARRAY
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 162:46: -> ^( ARRAY generalized_type_name )
                    {
                        // ModuleType.g:162:49: ^( ARRAY generalized_type_name )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ARRAY.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_generalized_type_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, type_specifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_specifier"


    public static class generalized_type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generalized_type_name"
    // ModuleType.g:164:1: generalized_type_name : ( type_name | IDENTIFIER );
    public final ModuleTypeParser.generalized_type_name_return generalized_type_name() throws RecognitionException {
        ModuleTypeParser.generalized_type_name_return retval = new ModuleTypeParser.generalized_type_name_return();
        retval.start = input.LT(1);

        int generalized_type_name_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER45=null;
        ModuleTypeParser.type_name_return type_name44 =null;


        Object IDENTIFIER45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // ModuleType.g:165:5: ( type_name | IDENTIFIER )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ERRORT||(LA11_0 >= INT16 && LA11_0 <= INT8)||(LA11_0 >= UINT16 && LA11_0 <= UINT8)||LA11_0==VOID) ) {
                alt11=1;
            }
            else if ( (LA11_0==IDENTIFIER) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // ModuleType.g:165:10: type_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_name_in_generalized_type_name950);
                    type_name44=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name44.getTree());

                    }
                    break;
                case 2 :
                    // ModuleType.g:165:22: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER45=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_generalized_type_name954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER45_tree = 
                    (Object)adaptor.create(IDENTIFIER45)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER45_tree);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, generalized_type_name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "generalized_type_name"


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // ModuleType.g:167:1: type_name : ( VOID | INT8 | INT16 | INT32 | UINT8 | UINT16 | UINT32 | ERRORT );
    public final ModuleTypeParser.type_name_return type_name() throws RecognitionException {
        ModuleTypeParser.type_name_return retval = new ModuleTypeParser.type_name_return();
        retval.start = input.LT(1);

        int type_name_StartIndex = input.index();

        Object root_0 = null;

        Token set46=null;

        Object set46_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // ModuleType.g:168:5: ( VOID | INT8 | INT16 | INT32 | UINT8 | UINT16 | UINT32 | ERRORT )
            // ModuleType.g:
            {
            root_0 = (Object)adaptor.nil();


            set46=(Token)input.LT(1);

            if ( input.LA(1)==ERRORT||(input.LA(1) >= INT16 && input.LA(1) <= INT8)||(input.LA(1) >= UINT16 && input.LA(1) <= UINT8)||input.LA(1)==VOID ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set46)
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, type_name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_name"

    // Delegated rules


 

    public static final BitSet FOLLOW_LBRACE_in_module_type461 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_existential_list_in_module_type463 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACE_in_module_type465 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LANGLE_in_module_type476 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_type_parameter_list_in_module_type478 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_module_type480 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_value_parameter_list_in_module_type482 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RANGLE_in_module_type484 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_module_type495 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_import_list_in_module_type497 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_module_type499 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_export_list_in_module_type501 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACE_in_module_type503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module_type505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_list_in_existential_list624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_list_in_type_parameter_list649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_declaration_list_in_value_parameter_list674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_list_in_import_list699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_list_in_export_list724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coercion_in_coercion_list748 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_coercion_list751 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_coercion_in_coercion_list754 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENTIFIER_in_coercion770 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SUBTYPE_in_coercion772 = new BitSet(new long[]{0x0000000B80038200L});
    public static final BitSet FOLLOW_type_name_in_coercion775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_declaration_in_simple_declaration_list790 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_simple_declaration_list793 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_simple_declaration_in_simple_declaration_list796 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simple_declaration813 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_simple_declaration815 = new BitSet(new long[]{0x0000000B8003A210L});
    public static final BitSet FOLLOW_type_specifier_in_simple_declaration818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_in_function_declaration_list833 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_function_declaration_list836 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_function_declaration_in_function_declaration_list839 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration858 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPARENS_in_function_declaration860 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_simple_declaration_list_in_function_declaration862 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPARENS_in_function_declaration865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_function_declaration867 = new BitSet(new long[]{0x0000000B8003A200L});
    public static final BitSet FOLLOW_generalized_type_name_in_function_declaration871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalized_type_name_in_type_specifier910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_type_specifier921 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_type_specifier923 = new BitSet(new long[]{0x0000000B8003A200L});
    public static final BitSet FOLLOW_generalized_type_name_in_type_specifier925 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RBRACKET_in_type_specifier927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_generalized_type_name950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_generalized_type_name954 = new BitSet(new long[]{0x0000000000000002L});

}