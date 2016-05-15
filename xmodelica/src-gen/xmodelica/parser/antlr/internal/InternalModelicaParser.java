package xmodelica.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xmodelica.services.ModelicaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelicaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING", "RULE_UNSIGNED_NUMBER", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_UNSIGNED_INTEGER", "RULE_S_CHAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_S_ESCAPE", "RULE_Q_CHAR", "RULE_Q_IDENT", "'within'", "';'", "'final'", "'encapsulated'", "'partial'", "'class'", "'model'", "'operator'", "'record'", "'block'", "'expandable'", "'connector'", "'type'", "'package'", "'pure'", "'impure'", "'function'", "'end'", "'='", "'enumeration'", "'('", "':'", "')'", "'der'", "','", "'extends'", "'public'", "'protected'", "'external'", "'redeclare'", "'inner'", "'outer'", "'replaceable'", "'import'", "'*'", "'constrainedby'", "'flow'", "'stream'", "'discrete'", "'parameter'", "'constant'", "'input'", "'output'", "'if'", "':='", "'initial'", "'equation'", "'algorithm'", "'break'", "'return'", "'then'", "'elseif'", "'else'", "'for'", "'loop'", "'in'", "'while'", "'when'", "'elsewhen'", "'or'", "'and'", "'not'", "'<'", "'<='", "'>'", "'>='", "'=='", "'<>'", "'+'", "'-'", "'.+'", "'.-'", "'/'", "'.*'", "'./'", "'^'", "'.^'", "'false'", "'true'", "'.'", "'['", "']'", "'annotation'"
    };
    public static final int T__50=50;
    public static final int RULE_UNSIGNED_NUMBER=6;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_DIGIT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int RULE_S_ESCAPE=15;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_S_CHAR=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int RULE_UNSIGNED_INTEGER=9;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_Q_CHAR=16;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_Q_IDENT=17;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_NONDIGIT=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalModelicaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModelicaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModelicaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalModelica.g"; }



     	private ModelicaGrammarAccess grammarAccess;

        public InternalModelicaParser(TokenStream input, ModelicaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StoredDefinition";
       	}

       	@Override
       	protected ModelicaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStoredDefinition"
    // InternalModelica.g:64:1: entryRuleStoredDefinition returns [EObject current=null] : iv_ruleStoredDefinition= ruleStoredDefinition EOF ;
    public final EObject entryRuleStoredDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoredDefinition = null;


        try {
            // InternalModelica.g:64:57: (iv_ruleStoredDefinition= ruleStoredDefinition EOF )
            // InternalModelica.g:65:2: iv_ruleStoredDefinition= ruleStoredDefinition EOF
            {
             newCompositeNode(grammarAccess.getStoredDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoredDefinition=ruleStoredDefinition();

            state._fsp--;

             current =iv_ruleStoredDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStoredDefinition"


    // $ANTLR start "ruleStoredDefinition"
    // InternalModelica.g:71:1: ruleStoredDefinition returns [EObject current=null] : ( () (otherlv_1= 'within' ( ruleName )? otherlv_3= ';' )? ( (otherlv_4= 'final' )? ( (lv_classes_5_0= ruleClassDefinition ) ) otherlv_6= ';' )* ) ;
    public final EObject ruleStoredDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_classes_5_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:77:2: ( ( () (otherlv_1= 'within' ( ruleName )? otherlv_3= ';' )? ( (otherlv_4= 'final' )? ( (lv_classes_5_0= ruleClassDefinition ) ) otherlv_6= ';' )* ) )
            // InternalModelica.g:78:2: ( () (otherlv_1= 'within' ( ruleName )? otherlv_3= ';' )? ( (otherlv_4= 'final' )? ( (lv_classes_5_0= ruleClassDefinition ) ) otherlv_6= ';' )* )
            {
            // InternalModelica.g:78:2: ( () (otherlv_1= 'within' ( ruleName )? otherlv_3= ';' )? ( (otherlv_4= 'final' )? ( (lv_classes_5_0= ruleClassDefinition ) ) otherlv_6= ';' )* )
            // InternalModelica.g:79:3: () (otherlv_1= 'within' ( ruleName )? otherlv_3= ';' )? ( (otherlv_4= 'final' )? ( (lv_classes_5_0= ruleClassDefinition ) ) otherlv_6= ';' )*
            {
            // InternalModelica.g:79:3: ()
            // InternalModelica.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStoredDefinitionAccess().getStoredDefinitionAction_0(),
            					current);
            			

            }

            // InternalModelica.g:86:3: (otherlv_1= 'within' ( ruleName )? otherlv_3= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalModelica.g:87:4: otherlv_1= 'within' ( ruleName )? otherlv_3= ';'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getStoredDefinitionAccess().getWithinKeyword_1_0());
                    			
                    // InternalModelica.g:91:4: ( ruleName )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_IDENT||LA1_0==97) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalModelica.g:92:5: ruleName
                            {

                            					newCompositeNode(grammarAccess.getStoredDefinitionAccess().getNameParserRuleCall_1_1());
                            				
                            pushFollow(FOLLOW_4);
                            ruleName();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getStoredDefinitionAccess().getSemicolonKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalModelica.g:105:3: ( (otherlv_4= 'final' )? ( (lv_classes_5_0= ruleClassDefinition ) ) otherlv_6= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=34)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalModelica.g:106:4: (otherlv_4= 'final' )? ( (lv_classes_5_0= ruleClassDefinition ) ) otherlv_6= ';'
            	    {
            	    // InternalModelica.g:106:4: (otherlv_4= 'final' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==20) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalModelica.g:107:5: otherlv_4= 'final'
            	            {
            	            otherlv_4=(Token)match(input,20,FOLLOW_6); 

            	            					newLeafNode(otherlv_4, grammarAccess.getStoredDefinitionAccess().getFinalKeyword_2_0());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalModelica.g:112:4: ( (lv_classes_5_0= ruleClassDefinition ) )
            	    // InternalModelica.g:113:5: (lv_classes_5_0= ruleClassDefinition )
            	    {
            	    // InternalModelica.g:113:5: (lv_classes_5_0= ruleClassDefinition )
            	    // InternalModelica.g:114:6: lv_classes_5_0= ruleClassDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getStoredDefinitionAccess().getClassesClassDefinitionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_classes_5_0=ruleClassDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStoredDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classes",
            	    							lv_classes_5_0,
            	    							"xmodelica.Modelica.ClassDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getStoredDefinitionAccess().getSemicolonKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStoredDefinition"


    // $ANTLR start "entryRuleClassDefinition"
    // InternalModelica.g:140:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalModelica.g:140:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalModelica.g:141:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinition=ruleClassDefinition();

            state._fsp--;

             current =iv_ruleClassDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDefinition"


    // $ANTLR start "ruleClassDefinition"
    // InternalModelica.g:147:1: ruleClassDefinition returns [EObject current=null] : ( (otherlv_0= 'encapsulated' )? ruleClassPrefixes this_ClassSpecifier_2= ruleClassSpecifier ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ClassSpecifier_2 = null;



        	enterRule();

        try {
            // InternalModelica.g:153:2: ( ( (otherlv_0= 'encapsulated' )? ruleClassPrefixes this_ClassSpecifier_2= ruleClassSpecifier ) )
            // InternalModelica.g:154:2: ( (otherlv_0= 'encapsulated' )? ruleClassPrefixes this_ClassSpecifier_2= ruleClassSpecifier )
            {
            // InternalModelica.g:154:2: ( (otherlv_0= 'encapsulated' )? ruleClassPrefixes this_ClassSpecifier_2= ruleClassSpecifier )
            // InternalModelica.g:155:3: (otherlv_0= 'encapsulated' )? ruleClassPrefixes this_ClassSpecifier_2= ruleClassSpecifier
            {
            // InternalModelica.g:155:3: (otherlv_0= 'encapsulated' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalModelica.g:156:4: otherlv_0= 'encapsulated'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassDefinitionAccess().getEncapsulatedKeyword_0());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassPrefixesParserRuleCall_1());
            		
            pushFollow(FOLLOW_7);
            ruleClassPrefixes();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassSpecifierParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ClassSpecifier_2=ruleClassSpecifier();

            state._fsp--;


            			current = this_ClassSpecifier_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDefinition"


    // $ANTLR start "entryRuleClassPrefixes"
    // InternalModelica.g:180:1: entryRuleClassPrefixes returns [String current=null] : iv_ruleClassPrefixes= ruleClassPrefixes EOF ;
    public final String entryRuleClassPrefixes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassPrefixes = null;


        try {
            // InternalModelica.g:180:53: (iv_ruleClassPrefixes= ruleClassPrefixes EOF )
            // InternalModelica.g:181:2: iv_ruleClassPrefixes= ruleClassPrefixes EOF
            {
             newCompositeNode(grammarAccess.getClassPrefixesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassPrefixes=ruleClassPrefixes();

            state._fsp--;

             current =iv_ruleClassPrefixes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassPrefixes"


    // $ANTLR start "ruleClassPrefixes"
    // InternalModelica.g:187:1: ruleClassPrefixes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'partial' )? (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' ) ) ;
    public final AntlrDatatypeRuleToken ruleClassPrefixes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:193:2: ( ( (kw= 'partial' )? (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' ) ) )
            // InternalModelica.g:194:2: ( (kw= 'partial' )? (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' ) )
            {
            // InternalModelica.g:194:2: ( (kw= 'partial' )? (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' ) )
            // InternalModelica.g:195:3: (kw= 'partial' )? (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' )
            {
            // InternalModelica.g:195:3: (kw= 'partial' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalModelica.g:196:4: kw= 'partial'
                    {
                    kw=(Token)match(input,22,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getPartialKeyword_0());
                    			

                    }
                    break;

            }

            // InternalModelica.g:202:3: (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' )
            int alt11=9;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalModelica.g:203:4: kw= 'class'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getClassKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:209:4: kw= 'model'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getModelKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalModelica.g:215:4: ( (kw= 'operator' )? kw= 'record' )
                    {
                    // InternalModelica.g:215:4: ( (kw= 'operator' )? kw= 'record' )
                    // InternalModelica.g:216:5: (kw= 'operator' )? kw= 'record'
                    {
                    // InternalModelica.g:216:5: (kw= 'operator' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==25) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalModelica.g:217:6: kw= 'operator'
                            {
                            kw=(Token)match(input,25,FOLLOW_9); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getOperatorKeyword_1_2_0());
                            					

                            }
                            break;

                    }

                    kw=(Token)match(input,26,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getRecordKeyword_1_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalModelica.g:230:4: kw= 'block'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getBlockKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalModelica.g:236:4: ( (kw= 'expandable' )? kw= 'connector' )
                    {
                    // InternalModelica.g:236:4: ( (kw= 'expandable' )? kw= 'connector' )
                    // InternalModelica.g:237:5: (kw= 'expandable' )? kw= 'connector'
                    {
                    // InternalModelica.g:237:5: (kw= 'expandable' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==28) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalModelica.g:238:6: kw= 'expandable'
                            {
                            kw=(Token)match(input,28,FOLLOW_10); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getExpandableKeyword_1_4_0());
                            					

                            }
                            break;

                    }

                    kw=(Token)match(input,29,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getConnectorKeyword_1_4_1());
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalModelica.g:251:4: kw= 'type'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getTypeKeyword_1_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalModelica.g:257:4: kw= 'package'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getPackageKeyword_1_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalModelica.g:263:4: ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' )
                    {
                    // InternalModelica.g:263:4: ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' )
                    // InternalModelica.g:264:5: (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function'
                    {
                    // InternalModelica.g:264:5: (kw= 'pure' | kw= 'impure' )?
                    int alt9=3;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==32) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==33) ) {
                        alt9=2;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalModelica.g:265:6: kw= 'pure'
                            {
                            kw=(Token)match(input,32,FOLLOW_11); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getPureKeyword_1_7_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalModelica.g:271:6: kw= 'impure'
                            {
                            kw=(Token)match(input,33,FOLLOW_11); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getImpureKeyword_1_7_0_1());
                            					

                            }
                            break;

                    }

                    // InternalModelica.g:277:5: (kw= 'operator' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==25) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalModelica.g:278:6: kw= 'operator'
                            {
                            kw=(Token)match(input,25,FOLLOW_12); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getOperatorKeyword_1_7_1());
                            					

                            }
                            break;

                    }

                    kw=(Token)match(input,34,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getFunctionKeyword_1_7_2());
                    				

                    }


                    }
                    break;
                case 9 :
                    // InternalModelica.g:291:4: kw= 'operator'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getOperatorKeyword_1_8());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassPrefixes"


    // $ANTLR start "entryRuleClassSpecifier"
    // InternalModelica.g:301:1: entryRuleClassSpecifier returns [EObject current=null] : iv_ruleClassSpecifier= ruleClassSpecifier EOF ;
    public final EObject entryRuleClassSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSpecifier = null;


        try {
            // InternalModelica.g:301:55: (iv_ruleClassSpecifier= ruleClassSpecifier EOF )
            // InternalModelica.g:302:2: iv_ruleClassSpecifier= ruleClassSpecifier EOF
            {
             newCompositeNode(grammarAccess.getClassSpecifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassSpecifier=ruleClassSpecifier();

            state._fsp--;

             current =iv_ruleClassSpecifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassSpecifier"


    // $ANTLR start "ruleClassSpecifier"
    // InternalModelica.g:308:1: ruleClassSpecifier returns [EObject current=null] : ( (this_IDENT_0= RULE_IDENT ruleStringComment this_Composition_2= ruleComposition otherlv_3= 'end' this_IDENT_4= RULE_IDENT ) | (this_IDENT_5= RULE_IDENT otherlv_6= '=' ruleBasePrefix ruleName (this_ArraySubscripts_9= ruleArraySubscripts )? ( (lv_mod_10_0= ruleClassModification ) )? ) | (this_IDENT_11= RULE_IDENT otherlv_12= '=' otherlv_13= 'enumeration' otherlv_14= '(' ( (this_EnumList_15= ruleEnumList )? | otherlv_16= ':' ) otherlv_17= ')' ) | (this_IDENT_18= RULE_IDENT otherlv_19= '=' otherlv_20= 'der' otherlv_21= '(' ruleName otherlv_23= ',' this_IDENT_24= RULE_IDENT (otherlv_25= ',' this_IDENT_26= RULE_IDENT )* otherlv_27= ')' this_Comment_28= ruleComment ) | (otherlv_29= 'extends' this_IDENT_30= RULE_IDENT (this_ClassModification_31= ruleClassModification )? ruleStringComment this_Composition_33= ruleComposition otherlv_34= 'end' this_IDENT_35= RULE_IDENT ) ) ;
    public final EObject ruleClassSpecifier() throws RecognitionException {
        EObject current = null;

        Token this_IDENT_0=null;
        Token otherlv_3=null;
        Token this_IDENT_4=null;
        Token this_IDENT_5=null;
        Token otherlv_6=null;
        Token this_IDENT_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_IDENT_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token this_IDENT_24=null;
        Token otherlv_25=null;
        Token this_IDENT_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token this_IDENT_30=null;
        Token otherlv_34=null;
        Token this_IDENT_35=null;
        EObject this_Composition_2 = null;

        EObject this_ArraySubscripts_9 = null;

        EObject lv_mod_10_0 = null;

        EObject this_EnumList_15 = null;

        EObject this_Comment_28 = null;

        EObject this_ClassModification_31 = null;

        EObject this_Composition_33 = null;



        	enterRule();

        try {
            // InternalModelica.g:314:2: ( ( (this_IDENT_0= RULE_IDENT ruleStringComment this_Composition_2= ruleComposition otherlv_3= 'end' this_IDENT_4= RULE_IDENT ) | (this_IDENT_5= RULE_IDENT otherlv_6= '=' ruleBasePrefix ruleName (this_ArraySubscripts_9= ruleArraySubscripts )? ( (lv_mod_10_0= ruleClassModification ) )? ) | (this_IDENT_11= RULE_IDENT otherlv_12= '=' otherlv_13= 'enumeration' otherlv_14= '(' ( (this_EnumList_15= ruleEnumList )? | otherlv_16= ':' ) otherlv_17= ')' ) | (this_IDENT_18= RULE_IDENT otherlv_19= '=' otherlv_20= 'der' otherlv_21= '(' ruleName otherlv_23= ',' this_IDENT_24= RULE_IDENT (otherlv_25= ',' this_IDENT_26= RULE_IDENT )* otherlv_27= ')' this_Comment_28= ruleComment ) | (otherlv_29= 'extends' this_IDENT_30= RULE_IDENT (this_ClassModification_31= ruleClassModification )? ruleStringComment this_Composition_33= ruleComposition otherlv_34= 'end' this_IDENT_35= RULE_IDENT ) ) )
            // InternalModelica.g:315:2: ( (this_IDENT_0= RULE_IDENT ruleStringComment this_Composition_2= ruleComposition otherlv_3= 'end' this_IDENT_4= RULE_IDENT ) | (this_IDENT_5= RULE_IDENT otherlv_6= '=' ruleBasePrefix ruleName (this_ArraySubscripts_9= ruleArraySubscripts )? ( (lv_mod_10_0= ruleClassModification ) )? ) | (this_IDENT_11= RULE_IDENT otherlv_12= '=' otherlv_13= 'enumeration' otherlv_14= '(' ( (this_EnumList_15= ruleEnumList )? | otherlv_16= ':' ) otherlv_17= ')' ) | (this_IDENT_18= RULE_IDENT otherlv_19= '=' otherlv_20= 'der' otherlv_21= '(' ruleName otherlv_23= ',' this_IDENT_24= RULE_IDENT (otherlv_25= ',' this_IDENT_26= RULE_IDENT )* otherlv_27= ')' this_Comment_28= ruleComment ) | (otherlv_29= 'extends' this_IDENT_30= RULE_IDENT (this_ClassModification_31= ruleClassModification )? ruleStringComment this_Composition_33= ruleComposition otherlv_34= 'end' this_IDENT_35= RULE_IDENT ) )
            {
            // InternalModelica.g:315:2: ( (this_IDENT_0= RULE_IDENT ruleStringComment this_Composition_2= ruleComposition otherlv_3= 'end' this_IDENT_4= RULE_IDENT ) | (this_IDENT_5= RULE_IDENT otherlv_6= '=' ruleBasePrefix ruleName (this_ArraySubscripts_9= ruleArraySubscripts )? ( (lv_mod_10_0= ruleClassModification ) )? ) | (this_IDENT_11= RULE_IDENT otherlv_12= '=' otherlv_13= 'enumeration' otherlv_14= '(' ( (this_EnumList_15= ruleEnumList )? | otherlv_16= ':' ) otherlv_17= ')' ) | (this_IDENT_18= RULE_IDENT otherlv_19= '=' otherlv_20= 'der' otherlv_21= '(' ruleName otherlv_23= ',' this_IDENT_24= RULE_IDENT (otherlv_25= ',' this_IDENT_26= RULE_IDENT )* otherlv_27= ')' this_Comment_28= ruleComment ) | (otherlv_29= 'extends' this_IDENT_30= RULE_IDENT (this_ClassModification_31= ruleClassModification )? ruleStringComment this_Composition_33= ruleComposition otherlv_34= 'end' this_IDENT_35= RULE_IDENT ) )
            int alt18=5;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_IDENT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==36) ) {
                    switch ( input.LA(3) ) {
                    case 37:
                        {
                        alt18=3;
                        }
                        break;
                    case RULE_IDENT:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 97:
                        {
                        alt18=2;
                        }
                        break;
                    case 41:
                        {
                        alt18=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;
                    }

                }
                else if ( ((LA18_1>=RULE_IDENT && LA18_1<=RULE_STRING)||(LA18_1>=20 && LA18_1<=35)||(LA18_1>=43 && LA18_1<=51)||(LA18_1>=54 && LA18_1<=60)||(LA18_1>=63 && LA18_1<=65)||LA18_1==97||LA18_1==100) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==43) ) {
                alt18=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalModelica.g:316:3: (this_IDENT_0= RULE_IDENT ruleStringComment this_Composition_2= ruleComposition otherlv_3= 'end' this_IDENT_4= RULE_IDENT )
                    {
                    // InternalModelica.g:316:3: (this_IDENT_0= RULE_IDENT ruleStringComment this_Composition_2= ruleComposition otherlv_3= 'end' this_IDENT_4= RULE_IDENT )
                    // InternalModelica.g:317:4: this_IDENT_0= RULE_IDENT ruleStringComment this_Composition_2= ruleComposition otherlv_3= 'end' this_IDENT_4= RULE_IDENT
                    {
                    this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_13); 

                    				newLeafNode(this_IDENT_0, grammarAccess.getClassSpecifierAccess().getIDENTTerminalRuleCall_0_0());
                    			

                    				newCompositeNode(grammarAccess.getClassSpecifierAccess().getStringCommentParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_13);
                    ruleStringComment();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getClassSpecifierAccess().getCompositionParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_14);
                    this_Composition_2=ruleComposition();

                    state._fsp--;


                    				current = this_Composition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,35,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassSpecifierAccess().getEndKeyword_0_3());
                    			
                    this_IDENT_4=(Token)match(input,RULE_IDENT,FOLLOW_2); 

                    				newLeafNode(this_IDENT_4, grammarAccess.getClassSpecifierAccess().getIDENTTerminalRuleCall_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:346:3: (this_IDENT_5= RULE_IDENT otherlv_6= '=' ruleBasePrefix ruleName (this_ArraySubscripts_9= ruleArraySubscripts )? ( (lv_mod_10_0= ruleClassModification ) )? )
                    {
                    // InternalModelica.g:346:3: (this_IDENT_5= RULE_IDENT otherlv_6= '=' ruleBasePrefix ruleName (this_ArraySubscripts_9= ruleArraySubscripts )? ( (lv_mod_10_0= ruleClassModification ) )? )
                    // InternalModelica.g:347:4: this_IDENT_5= RULE_IDENT otherlv_6= '=' ruleBasePrefix ruleName (this_ArraySubscripts_9= ruleArraySubscripts )? ( (lv_mod_10_0= ruleClassModification ) )?
                    {
                    this_IDENT_5=(Token)match(input,RULE_IDENT,FOLLOW_16); 

                    				newLeafNode(this_IDENT_5, grammarAccess.getClassSpecifierAccess().getIDENTTerminalRuleCall_1_0());
                    			
                    otherlv_6=(Token)match(input,36,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassSpecifierAccess().getEqualsSignKeyword_1_1());
                    			

                    				newCompositeNode(grammarAccess.getClassSpecifierAccess().getBasePrefixParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_18);
                    ruleBasePrefix();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getClassSpecifierAccess().getNameParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_19);
                    ruleName();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalModelica.g:369:4: (this_ArraySubscripts_9= ruleArraySubscripts )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==98) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalModelica.g:370:5: this_ArraySubscripts_9= ruleArraySubscripts
                            {

                            					newCompositeNode(grammarAccess.getClassSpecifierAccess().getArraySubscriptsParserRuleCall_1_4());
                            				
                            pushFollow(FOLLOW_20);
                            this_ArraySubscripts_9=ruleArraySubscripts();

                            state._fsp--;


                            					current = this_ArraySubscripts_9;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:379:4: ( (lv_mod_10_0= ruleClassModification ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==38) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalModelica.g:380:5: (lv_mod_10_0= ruleClassModification )
                            {
                            // InternalModelica.g:380:5: (lv_mod_10_0= ruleClassModification )
                            // InternalModelica.g:381:6: lv_mod_10_0= ruleClassModification
                            {

                            						newCompositeNode(grammarAccess.getClassSpecifierAccess().getModClassModificationParserRuleCall_1_5_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_mod_10_0=ruleClassModification();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClassSpecifierRule());
                            						}
                            						set(
                            							current,
                            							"mod",
                            							lv_mod_10_0,
                            							"xmodelica.Modelica.ClassModification");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalModelica.g:400:3: (this_IDENT_11= RULE_IDENT otherlv_12= '=' otherlv_13= 'enumeration' otherlv_14= '(' ( (this_EnumList_15= ruleEnumList )? | otherlv_16= ':' ) otherlv_17= ')' )
                    {
                    // InternalModelica.g:400:3: (this_IDENT_11= RULE_IDENT otherlv_12= '=' otherlv_13= 'enumeration' otherlv_14= '(' ( (this_EnumList_15= ruleEnumList )? | otherlv_16= ':' ) otherlv_17= ')' )
                    // InternalModelica.g:401:4: this_IDENT_11= RULE_IDENT otherlv_12= '=' otherlv_13= 'enumeration' otherlv_14= '(' ( (this_EnumList_15= ruleEnumList )? | otherlv_16= ':' ) otherlv_17= ')'
                    {
                    this_IDENT_11=(Token)match(input,RULE_IDENT,FOLLOW_16); 

                    				newLeafNode(this_IDENT_11, grammarAccess.getClassSpecifierAccess().getIDENTTerminalRuleCall_2_0());
                    			
                    otherlv_12=(Token)match(input,36,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassSpecifierAccess().getEqualsSignKeyword_2_1());
                    			
                    otherlv_13=(Token)match(input,37,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassSpecifierAccess().getEnumerationKeyword_2_2());
                    			
                    otherlv_14=(Token)match(input,38,FOLLOW_23); 

                    				newLeafNode(otherlv_14, grammarAccess.getClassSpecifierAccess().getLeftParenthesisKeyword_2_3());
                    			
                    // InternalModelica.g:417:4: ( (this_EnumList_15= ruleEnumList )? | otherlv_16= ':' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_IDENT||LA15_0==40) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==39) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalModelica.g:418:5: (this_EnumList_15= ruleEnumList )?
                            {
                            // InternalModelica.g:418:5: (this_EnumList_15= ruleEnumList )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==RULE_IDENT) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // InternalModelica.g:419:6: this_EnumList_15= ruleEnumList
                                    {

                                    						newCompositeNode(grammarAccess.getClassSpecifierAccess().getEnumListParserRuleCall_2_4_0());
                                    					
                                    pushFollow(FOLLOW_24);
                                    this_EnumList_15=ruleEnumList();

                                    state._fsp--;


                                    						current = this_EnumList_15;
                                    						afterParserOrEnumRuleCall();
                                    					

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalModelica.g:429:5: otherlv_16= ':'
                            {
                            otherlv_16=(Token)match(input,39,FOLLOW_24); 

                            					newLeafNode(otherlv_16, grammarAccess.getClassSpecifierAccess().getColonKeyword_2_4_1());
                            				

                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getClassSpecifierAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModelica.g:440:3: (this_IDENT_18= RULE_IDENT otherlv_19= '=' otherlv_20= 'der' otherlv_21= '(' ruleName otherlv_23= ',' this_IDENT_24= RULE_IDENT (otherlv_25= ',' this_IDENT_26= RULE_IDENT )* otherlv_27= ')' this_Comment_28= ruleComment )
                    {
                    // InternalModelica.g:440:3: (this_IDENT_18= RULE_IDENT otherlv_19= '=' otherlv_20= 'der' otherlv_21= '(' ruleName otherlv_23= ',' this_IDENT_24= RULE_IDENT (otherlv_25= ',' this_IDENT_26= RULE_IDENT )* otherlv_27= ')' this_Comment_28= ruleComment )
                    // InternalModelica.g:441:4: this_IDENT_18= RULE_IDENT otherlv_19= '=' otherlv_20= 'der' otherlv_21= '(' ruleName otherlv_23= ',' this_IDENT_24= RULE_IDENT (otherlv_25= ',' this_IDENT_26= RULE_IDENT )* otherlv_27= ')' this_Comment_28= ruleComment
                    {
                    this_IDENT_18=(Token)match(input,RULE_IDENT,FOLLOW_16); 

                    				newLeafNode(this_IDENT_18, grammarAccess.getClassSpecifierAccess().getIDENTTerminalRuleCall_3_0());
                    			
                    otherlv_19=(Token)match(input,36,FOLLOW_25); 

                    				newLeafNode(otherlv_19, grammarAccess.getClassSpecifierAccess().getEqualsSignKeyword_3_1());
                    			
                    otherlv_20=(Token)match(input,41,FOLLOW_22); 

                    				newLeafNode(otherlv_20, grammarAccess.getClassSpecifierAccess().getDerKeyword_3_2());
                    			
                    otherlv_21=(Token)match(input,38,FOLLOW_18); 

                    				newLeafNode(otherlv_21, grammarAccess.getClassSpecifierAccess().getLeftParenthesisKeyword_3_3());
                    			

                    				newCompositeNode(grammarAccess.getClassSpecifierAccess().getNameParserRuleCall_3_4());
                    			
                    pushFollow(FOLLOW_26);
                    ruleName();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_23=(Token)match(input,42,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getClassSpecifierAccess().getCommaKeyword_3_5());
                    			
                    this_IDENT_24=(Token)match(input,RULE_IDENT,FOLLOW_27); 

                    				newLeafNode(this_IDENT_24, grammarAccess.getClassSpecifierAccess().getIDENTTerminalRuleCall_3_6());
                    			
                    // InternalModelica.g:472:4: (otherlv_25= ',' this_IDENT_26= RULE_IDENT )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==42) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalModelica.g:473:5: otherlv_25= ',' this_IDENT_26= RULE_IDENT
                    	    {
                    	    otherlv_25=(Token)match(input,42,FOLLOW_15); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getClassSpecifierAccess().getCommaKeyword_3_7_0());
                    	    				
                    	    this_IDENT_26=(Token)match(input,RULE_IDENT,FOLLOW_27); 

                    	    					newLeafNode(this_IDENT_26, grammarAccess.getClassSpecifierAccess().getIDENTTerminalRuleCall_3_7_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,40,FOLLOW_28); 

                    				newLeafNode(otherlv_27, grammarAccess.getClassSpecifierAccess().getRightParenthesisKeyword_3_8());
                    			

                    				newCompositeNode(grammarAccess.getClassSpecifierAccess().getCommentParserRuleCall_3_9());
                    			
                    pushFollow(FOLLOW_2);
                    this_Comment_28=ruleComment();

                    state._fsp--;


                    				current = this_Comment_28;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModelica.g:496:3: (otherlv_29= 'extends' this_IDENT_30= RULE_IDENT (this_ClassModification_31= ruleClassModification )? ruleStringComment this_Composition_33= ruleComposition otherlv_34= 'end' this_IDENT_35= RULE_IDENT )
                    {
                    // InternalModelica.g:496:3: (otherlv_29= 'extends' this_IDENT_30= RULE_IDENT (this_ClassModification_31= ruleClassModification )? ruleStringComment this_Composition_33= ruleComposition otherlv_34= 'end' this_IDENT_35= RULE_IDENT )
                    // InternalModelica.g:497:4: otherlv_29= 'extends' this_IDENT_30= RULE_IDENT (this_ClassModification_31= ruleClassModification )? ruleStringComment this_Composition_33= ruleComposition otherlv_34= 'end' this_IDENT_35= RULE_IDENT
                    {
                    otherlv_29=(Token)match(input,43,FOLLOW_15); 

                    				newLeafNode(otherlv_29, grammarAccess.getClassSpecifierAccess().getExtendsKeyword_4_0());
                    			
                    this_IDENT_30=(Token)match(input,RULE_IDENT,FOLLOW_29); 

                    				newLeafNode(this_IDENT_30, grammarAccess.getClassSpecifierAccess().getIDENTTerminalRuleCall_4_1());
                    			
                    // InternalModelica.g:505:4: (this_ClassModification_31= ruleClassModification )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==38) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalModelica.g:506:5: this_ClassModification_31= ruleClassModification
                            {

                            					newCompositeNode(grammarAccess.getClassSpecifierAccess().getClassModificationParserRuleCall_4_2());
                            				
                            pushFollow(FOLLOW_13);
                            this_ClassModification_31=ruleClassModification();

                            state._fsp--;


                            					current = this_ClassModification_31;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getClassSpecifierAccess().getStringCommentParserRuleCall_4_3());
                    			
                    pushFollow(FOLLOW_13);
                    ruleStringComment();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getClassSpecifierAccess().getCompositionParserRuleCall_4_4());
                    			
                    pushFollow(FOLLOW_14);
                    this_Composition_33=ruleComposition();

                    state._fsp--;


                    				current = this_Composition_33;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_34=(Token)match(input,35,FOLLOW_15); 

                    				newLeafNode(otherlv_34, grammarAccess.getClassSpecifierAccess().getEndKeyword_4_5());
                    			
                    this_IDENT_35=(Token)match(input,RULE_IDENT,FOLLOW_2); 

                    				newLeafNode(this_IDENT_35, grammarAccess.getClassSpecifierAccess().getIDENTTerminalRuleCall_4_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassSpecifier"


    // $ANTLR start "entryRuleBasePrefix"
    // InternalModelica.g:543:1: entryRuleBasePrefix returns [String current=null] : iv_ruleBasePrefix= ruleBasePrefix EOF ;
    public final String entryRuleBasePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasePrefix = null;


        try {
            // InternalModelica.g:543:50: (iv_ruleBasePrefix= ruleBasePrefix EOF )
            // InternalModelica.g:544:2: iv_ruleBasePrefix= ruleBasePrefix EOF
            {
             newCompositeNode(grammarAccess.getBasePrefixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasePrefix=ruleBasePrefix();

            state._fsp--;

             current =iv_ruleBasePrefix.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasePrefix"


    // $ANTLR start "ruleBasePrefix"
    // InternalModelica.g:550:1: ruleBasePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_TypePrefix_0= ruleTypePrefix ;
    public final AntlrDatatypeRuleToken ruleBasePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypePrefix_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:556:2: (this_TypePrefix_0= ruleTypePrefix )
            // InternalModelica.g:557:2: this_TypePrefix_0= ruleTypePrefix
            {

            		newCompositeNode(grammarAccess.getBasePrefixAccess().getTypePrefixParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TypePrefix_0=ruleTypePrefix();

            state._fsp--;


            		current.merge(this_TypePrefix_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasePrefix"


    // $ANTLR start "entryRuleEnumList"
    // InternalModelica.g:570:1: entryRuleEnumList returns [EObject current=null] : iv_ruleEnumList= ruleEnumList EOF ;
    public final EObject entryRuleEnumList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumList = null;


        try {
            // InternalModelica.g:570:49: (iv_ruleEnumList= ruleEnumList EOF )
            // InternalModelica.g:571:2: iv_ruleEnumList= ruleEnumList EOF
            {
             newCompositeNode(grammarAccess.getEnumListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumList=ruleEnumList();

            state._fsp--;

             current =iv_ruleEnumList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumList"


    // $ANTLR start "ruleEnumList"
    // InternalModelica.g:577:1: ruleEnumList returns [EObject current=null] : ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* ) ;
    public final EObject ruleEnumList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_enums_0_0 = null;

        EObject lv_enums_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:583:2: ( ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* ) )
            // InternalModelica.g:584:2: ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* )
            {
            // InternalModelica.g:584:2: ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* )
            // InternalModelica.g:585:3: ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )*
            {
            // InternalModelica.g:585:3: ( (lv_enums_0_0= ruleEnumerationLiteral ) )
            // InternalModelica.g:586:4: (lv_enums_0_0= ruleEnumerationLiteral )
            {
            // InternalModelica.g:586:4: (lv_enums_0_0= ruleEnumerationLiteral )
            // InternalModelica.g:587:5: lv_enums_0_0= ruleEnumerationLiteral
            {

            					newCompositeNode(grammarAccess.getEnumListAccess().getEnumsEnumerationLiteralParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_enums_0_0=ruleEnumerationLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumListRule());
            					}
            					add(
            						current,
            						"enums",
            						lv_enums_0_0,
            						"xmodelica.Modelica.EnumerationLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:604:3: (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==42) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalModelica.g:605:4: otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEnumListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:609:4: ( (lv_enums_2_0= ruleEnumerationLiteral ) )
            	    // InternalModelica.g:610:5: (lv_enums_2_0= ruleEnumerationLiteral )
            	    {
            	    // InternalModelica.g:610:5: (lv_enums_2_0= ruleEnumerationLiteral )
            	    // InternalModelica.g:611:6: lv_enums_2_0= ruleEnumerationLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumListAccess().getEnumsEnumerationLiteralParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_enums_2_0=ruleEnumerationLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"enums",
            	    							lv_enums_2_0,
            	    							"xmodelica.Modelica.EnumerationLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumList"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalModelica.g:633:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalModelica.g:633:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalModelica.g:634:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalModelica.g:640:1: ruleEnumerationLiteral returns [EObject current=null] : (this_IDENT_0= RULE_IDENT this_Comment_1= ruleComment ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token this_IDENT_0=null;
        EObject this_Comment_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:646:2: ( (this_IDENT_0= RULE_IDENT this_Comment_1= ruleComment ) )
            // InternalModelica.g:647:2: (this_IDENT_0= RULE_IDENT this_Comment_1= ruleComment )
            {
            // InternalModelica.g:647:2: (this_IDENT_0= RULE_IDENT this_Comment_1= ruleComment )
            // InternalModelica.g:648:3: this_IDENT_0= RULE_IDENT this_Comment_1= ruleComment
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_28); 

            			newLeafNode(this_IDENT_0, grammarAccess.getEnumerationLiteralAccess().getIDENTTerminalRuleCall_0());
            		

            			newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getCommentParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Comment_1=ruleComment();

            state._fsp--;


            			current = this_Comment_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleComposition"
    // InternalModelica.g:664:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalModelica.g:664:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalModelica.g:665:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalModelica.g:671:1: ruleComposition returns [EObject current=null] : (this_ElementList_0= ruleElementList ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( ruleLanguageSpecification )? (this_ExternalFunctionCall_9= ruleExternalFunctionCall )? ( (lv_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_ElementList_0 = null;

        EObject lv_pub_elist_2_0 = null;

        EObject lv_protected_elist_4_0 = null;

        EObject lv_eq_secs_5_0 = null;

        EObject lv_alg_secs_6_0 = null;

        EObject this_ExternalFunctionCall_9 = null;

        EObject lv_anno_10_0 = null;

        EObject lv_anno_12_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:677:2: ( (this_ElementList_0= ruleElementList ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( ruleLanguageSpecification )? (this_ExternalFunctionCall_9= ruleExternalFunctionCall )? ( (lv_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? ) )
            // InternalModelica.g:678:2: (this_ElementList_0= ruleElementList ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( ruleLanguageSpecification )? (this_ExternalFunctionCall_9= ruleExternalFunctionCall )? ( (lv_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? )
            {
            // InternalModelica.g:678:2: (this_ElementList_0= ruleElementList ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( ruleLanguageSpecification )? (this_ExternalFunctionCall_9= ruleExternalFunctionCall )? ( (lv_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? )
            // InternalModelica.g:679:3: this_ElementList_0= ruleElementList ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( ruleLanguageSpecification )? (this_ExternalFunctionCall_9= ruleExternalFunctionCall )? ( (lv_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )?
            {

            			newCompositeNode(grammarAccess.getCompositionAccess().getElementListParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_ElementList_0=ruleElementList();

            state._fsp--;


            			current = this_ElementList_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:687:3: ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )*
            loop20:
            do {
                int alt20=5;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    alt20=1;
                    }
                    break;
                case 45:
                    {
                    alt20=2;
                    }
                    break;
                case 63:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (LA20_4==65) ) {
                        alt20=4;
                    }
                    else if ( (LA20_4==64) ) {
                        alt20=3;
                    }


                    }
                    break;
                case 64:
                    {
                    alt20=3;
                    }
                    break;
                case 65:
                    {
                    alt20=4;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalModelica.g:688:4: (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) )
            	    {
            	    // InternalModelica.g:688:4: (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) )
            	    // InternalModelica.g:689:5: otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_32); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getPublicKeyword_1_0_0());
            	    				
            	    // InternalModelica.g:693:5: ( (lv_pub_elist_2_0= ruleElementList ) )
            	    // InternalModelica.g:694:6: (lv_pub_elist_2_0= ruleElementList )
            	    {
            	    // InternalModelica.g:694:6: (lv_pub_elist_2_0= ruleElementList )
            	    // InternalModelica.g:695:7: lv_pub_elist_2_0= ruleElementList
            	    {

            	    							newCompositeNode(grammarAccess.getCompositionAccess().getPub_elistElementListParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_31);
            	    lv_pub_elist_2_0=ruleElementList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getCompositionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"pub_elist",
            	    								lv_pub_elist_2_0,
            	    								"xmodelica.Modelica.ElementList");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalModelica.g:714:4: (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) )
            	    {
            	    // InternalModelica.g:714:4: (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) )
            	    // InternalModelica.g:715:5: otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) )
            	    {
            	    otherlv_3=(Token)match(input,45,FOLLOW_32); 

            	    					newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getProtectedKeyword_1_1_0());
            	    				
            	    // InternalModelica.g:719:5: ( (lv_protected_elist_4_0= ruleElementList ) )
            	    // InternalModelica.g:720:6: (lv_protected_elist_4_0= ruleElementList )
            	    {
            	    // InternalModelica.g:720:6: (lv_protected_elist_4_0= ruleElementList )
            	    // InternalModelica.g:721:7: lv_protected_elist_4_0= ruleElementList
            	    {

            	    							newCompositeNode(grammarAccess.getCompositionAccess().getProtected_elistElementListParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_31);
            	    lv_protected_elist_4_0=ruleElementList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getCompositionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"protected_elist",
            	    								lv_protected_elist_4_0,
            	    								"xmodelica.Modelica.ElementList");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalModelica.g:740:4: ( (lv_eq_secs_5_0= ruleEquationSection ) )
            	    {
            	    // InternalModelica.g:740:4: ( (lv_eq_secs_5_0= ruleEquationSection ) )
            	    // InternalModelica.g:741:5: (lv_eq_secs_5_0= ruleEquationSection )
            	    {
            	    // InternalModelica.g:741:5: (lv_eq_secs_5_0= ruleEquationSection )
            	    // InternalModelica.g:742:6: lv_eq_secs_5_0= ruleEquationSection
            	    {

            	    						newCompositeNode(grammarAccess.getCompositionAccess().getEq_secsEquationSectionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_eq_secs_5_0=ruleEquationSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"eq_secs",
            	    							lv_eq_secs_5_0,
            	    							"xmodelica.Modelica.EquationSection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalModelica.g:760:4: ( (lv_alg_secs_6_0= ruleAlgorithmSection ) )
            	    {
            	    // InternalModelica.g:760:4: ( (lv_alg_secs_6_0= ruleAlgorithmSection ) )
            	    // InternalModelica.g:761:5: (lv_alg_secs_6_0= ruleAlgorithmSection )
            	    {
            	    // InternalModelica.g:761:5: (lv_alg_secs_6_0= ruleAlgorithmSection )
            	    // InternalModelica.g:762:6: lv_alg_secs_6_0= ruleAlgorithmSection
            	    {

            	    						newCompositeNode(grammarAccess.getCompositionAccess().getAlg_secsAlgorithmSectionParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_alg_secs_6_0=ruleAlgorithmSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"alg_secs",
            	    							lv_alg_secs_6_0,
            	    							"xmodelica.Modelica.AlgorithmSection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalModelica.g:780:3: (otherlv_7= 'external' ( ruleLanguageSpecification )? (this_ExternalFunctionCall_9= ruleExternalFunctionCall )? ( (lv_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalModelica.g:781:4: otherlv_7= 'external' ( ruleLanguageSpecification )? (this_ExternalFunctionCall_9= ruleExternalFunctionCall )? ( (lv_anno_10_0= ruleAnnotation ) )? otherlv_11= ';'
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getCompositionAccess().getExternalKeyword_2_0());
                    			
                    // InternalModelica.g:785:4: ( ruleLanguageSpecification )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_STRING) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalModelica.g:786:5: ruleLanguageSpecification
                            {

                            					newCompositeNode(grammarAccess.getCompositionAccess().getLanguageSpecificationParserRuleCall_2_1());
                            				
                            pushFollow(FOLLOW_34);
                            ruleLanguageSpecification();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:794:4: (this_ExternalFunctionCall_9= ruleExternalFunctionCall )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_IDENT||LA22_0==97) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalModelica.g:795:5: this_ExternalFunctionCall_9= ruleExternalFunctionCall
                            {

                            					newCompositeNode(grammarAccess.getCompositionAccess().getExternalFunctionCallParserRuleCall_2_2());
                            				
                            pushFollow(FOLLOW_35);
                            this_ExternalFunctionCall_9=ruleExternalFunctionCall();

                            state._fsp--;


                            					current = this_ExternalFunctionCall_9;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:804:4: ( (lv_anno_10_0= ruleAnnotation ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==100) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalModelica.g:805:5: (lv_anno_10_0= ruleAnnotation )
                            {
                            // InternalModelica.g:805:5: (lv_anno_10_0= ruleAnnotation )
                            // InternalModelica.g:806:6: lv_anno_10_0= ruleAnnotation
                            {

                            						newCompositeNode(grammarAccess.getCompositionAccess().getAnnoAnnotationParserRuleCall_2_3_0());
                            					
                            pushFollow(FOLLOW_4);
                            lv_anno_10_0=ruleAnnotation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCompositionRule());
                            						}
                            						add(
                            							current,
                            							"anno",
                            							lv_anno_10_0,
                            							"xmodelica.Modelica.Annotation");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_36); 

                    				newLeafNode(otherlv_11, grammarAccess.getCompositionAccess().getSemicolonKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalModelica.g:828:3: ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==100) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalModelica.g:829:4: ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';'
                    {
                    // InternalModelica.g:829:4: ( (lv_anno_12_0= ruleAnnotation ) )
                    // InternalModelica.g:830:5: (lv_anno_12_0= ruleAnnotation )
                    {
                    // InternalModelica.g:830:5: (lv_anno_12_0= ruleAnnotation )
                    // InternalModelica.g:831:6: lv_anno_12_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getAnnoAnnotationParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_anno_12_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						add(
                    							current,
                    							"anno",
                    							lv_anno_12_0,
                    							"xmodelica.Modelica.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getCompositionAccess().getSemicolonKeyword_3_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleLanguageSpecification"
    // InternalModelica.g:857:1: entryRuleLanguageSpecification returns [String current=null] : iv_ruleLanguageSpecification= ruleLanguageSpecification EOF ;
    public final String entryRuleLanguageSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguageSpecification = null;


        try {
            // InternalModelica.g:857:61: (iv_ruleLanguageSpecification= ruleLanguageSpecification EOF )
            // InternalModelica.g:858:2: iv_ruleLanguageSpecification= ruleLanguageSpecification EOF
            {
             newCompositeNode(grammarAccess.getLanguageSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageSpecification=ruleLanguageSpecification();

            state._fsp--;

             current =iv_ruleLanguageSpecification.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageSpecification"


    // $ANTLR start "ruleLanguageSpecification"
    // InternalModelica.g:864:1: ruleLanguageSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleLanguageSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalModelica.g:870:2: (this_STRING_0= RULE_STRING )
            // InternalModelica.g:871:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getLanguageSpecificationAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageSpecification"


    // $ANTLR start "entryRuleExternalFunctionCall"
    // InternalModelica.g:881:1: entryRuleExternalFunctionCall returns [EObject current=null] : iv_ruleExternalFunctionCall= ruleExternalFunctionCall EOF ;
    public final EObject entryRuleExternalFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalFunctionCall = null;


        try {
            // InternalModelica.g:881:61: (iv_ruleExternalFunctionCall= ruleExternalFunctionCall EOF )
            // InternalModelica.g:882:2: iv_ruleExternalFunctionCall= ruleExternalFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getExternalFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalFunctionCall=ruleExternalFunctionCall();

            state._fsp--;

             current =iv_ruleExternalFunctionCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalFunctionCall"


    // $ANTLR start "ruleExternalFunctionCall"
    // InternalModelica.g:888:1: ruleExternalFunctionCall returns [EObject current=null] : ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' ) ;
    public final EObject ruleExternalFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:894:2: ( ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' ) )
            // InternalModelica.g:895:2: ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' )
            {
            // InternalModelica.g:895:2: ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' )
            // InternalModelica.g:896:3: ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')'
            {
            // InternalModelica.g:896:3: ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==97) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_IDENT) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==RULE_IDENT||LA26_2==36||(LA26_2>=97 && LA26_2<=98)) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalModelica.g:897:4: ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '='
                    {
                    // InternalModelica.g:897:4: ( (lv_lhs_0_0= ruleComponentReference ) )
                    // InternalModelica.g:898:5: (lv_lhs_0_0= ruleComponentReference )
                    {
                    // InternalModelica.g:898:5: (lv_lhs_0_0= ruleComponentReference )
                    // InternalModelica.g:899:6: lv_lhs_0_0= ruleComponentReference
                    {

                    						newCompositeNode(grammarAccess.getExternalFunctionCallAccess().getLhsComponentReferenceParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_lhs_0_0=ruleComponentReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalFunctionCallRule());
                    						}
                    						set(
                    							current,
                    							"lhs",
                    							lv_lhs_0_0,
                    							"xmodelica.Modelica.ComponentReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,36,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getExternalFunctionCallAccess().getEqualsSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalModelica.g:921:3: ( (lv_name_2_0= RULE_IDENT ) )
            // InternalModelica.g:922:4: (lv_name_2_0= RULE_IDENT )
            {
            // InternalModelica.g:922:4: (lv_name_2_0= RULE_IDENT )
            // InternalModelica.g:923:5: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_22); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExternalFunctionCallAccess().getNameIDENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalFunctionCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"xmodelica.Modelica.IDENT");
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalFunctionCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalModelica.g:943:3: ( (lv_args_4_0= ruleExpressionList ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==61||LA27_0==79) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalModelica.g:944:4: (lv_args_4_0= ruleExpressionList )
                    {
                    // InternalModelica.g:944:4: (lv_args_4_0= ruleExpressionList )
                    // InternalModelica.g:945:5: lv_args_4_0= ruleExpressionList
                    {

                    					newCompositeNode(grammarAccess.getExternalFunctionCallAccess().getArgsExpressionListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_args_4_0=ruleExpressionList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalFunctionCallRule());
                    					}
                    					set(
                    						current,
                    						"args",
                    						lv_args_4_0,
                    						"xmodelica.Modelica.ExpressionList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalFunctionCallAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalFunctionCall"


    // $ANTLR start "entryRuleElementList"
    // InternalModelica.g:970:1: entryRuleElementList returns [EObject current=null] : iv_ruleElementList= ruleElementList EOF ;
    public final EObject entryRuleElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementList = null;


        try {
            // InternalModelica.g:970:52: (iv_ruleElementList= ruleElementList EOF )
            // InternalModelica.g:971:2: iv_ruleElementList= ruleElementList EOF
            {
             newCompositeNode(grammarAccess.getElementListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementList=ruleElementList();

            state._fsp--;

             current =iv_ruleElementList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementList"


    // $ANTLR start "ruleElementList"
    // InternalModelica.g:977:1: ruleElementList returns [EObject current=null] : ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* ) ;
    public final EObject ruleElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_elem_1_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:983:2: ( ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* ) )
            // InternalModelica.g:984:2: ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* )
            {
            // InternalModelica.g:984:2: ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* )
            // InternalModelica.g:985:3: () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )*
            {
            // InternalModelica.g:985:3: ()
            // InternalModelica.g:986:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElementListAccess().getElementListAction_0(),
            					current);
            			

            }

            // InternalModelica.g:992:3: ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_IDENT||(LA28_0>=20 && LA28_0<=34)||LA28_0==43||(LA28_0>=47 && LA28_0<=51)||(LA28_0>=54 && LA28_0<=60)||LA28_0==97) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalModelica.g:993:4: ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';'
            	    {
            	    // InternalModelica.g:993:4: ( (lv_elem_1_0= ruleElement ) )
            	    // InternalModelica.g:994:5: (lv_elem_1_0= ruleElement )
            	    {
            	    // InternalModelica.g:994:5: (lv_elem_1_0= ruleElement )
            	    // InternalModelica.g:995:6: lv_elem_1_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getElementListAccess().getElemElementParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_elem_1_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getElementListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elem",
            	    							lv_elem_1_0,
            	    							"xmodelica.Modelica.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getElementListAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementList"


    // $ANTLR start "entryRuleElement"
    // InternalModelica.g:1021:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalModelica.g:1021:48: (iv_ruleElement= ruleElement EOF )
            // InternalModelica.g:1022:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalModelica.g:1028:1: ruleElement returns [EObject current=null] : (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_ImportClause_0 = null;

        EObject this_ExtendsClause_1 = null;

        EObject this_ClassDefinition_6 = null;

        EObject this_ComponentClause_7 = null;

        EObject this_ClassDefinition_9 = null;

        EObject this_ComponentClause_10 = null;



        	enterRule();

        try {
            // InternalModelica.g:1034:2: ( (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) ) )
            // InternalModelica.g:1035:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) )
            {
            // InternalModelica.g:1035:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt36=1;
                }
                break;
            case 43:
                {
                alt36=2;
                }
                break;
            case EOF:
            case RULE_IDENT:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 47:
            case 48:
            case 49:
            case 50:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 97:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalModelica.g:1036:3: this_ImportClause_0= ruleImportClause
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getImportClauseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImportClause_0=ruleImportClause();

                    state._fsp--;


                    			current = this_ImportClause_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:1045:3: this_ExtendsClause_1= ruleExtendsClause
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getExtendsClauseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtendsClause_1=ruleExtendsClause();

                    state._fsp--;


                    			current = this_ExtendsClause_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:1054:3: ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) )
                    {
                    // InternalModelica.g:1054:3: ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) )
                    // InternalModelica.g:1055:4: (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) )
                    {
                    // InternalModelica.g:1055:4: (otherlv_2= 'redeclare' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==47) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalModelica.g:1056:5: otherlv_2= 'redeclare'
                            {
                            otherlv_2=(Token)match(input,47,FOLLOW_39); 

                            					newLeafNode(otherlv_2, grammarAccess.getElementAccess().getRedeclareKeyword_2_0());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1061:4: (otherlv_3= 'final' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==20) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalModelica.g:1062:5: otherlv_3= 'final'
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_39); 

                            					newLeafNode(otherlv_3, grammarAccess.getElementAccess().getFinalKeyword_2_1());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1067:4: (otherlv_4= 'inner' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==48) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalModelica.g:1068:5: otherlv_4= 'inner'
                            {
                            otherlv_4=(Token)match(input,48,FOLLOW_40); 

                            					newLeafNode(otherlv_4, grammarAccess.getElementAccess().getInnerKeyword_2_2());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1073:4: (otherlv_5= 'outer' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==49) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalModelica.g:1074:5: otherlv_5= 'outer'
                            {
                            otherlv_5=(Token)match(input,49,FOLLOW_41); 

                            					newLeafNode(otherlv_5, grammarAccess.getElementAccess().getOuterKeyword_2_3());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1079:4: ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==EOF||LA35_0==RULE_IDENT||(LA35_0>=21 && LA35_0<=34)||(LA35_0>=54 && LA35_0<=60)||LA35_0==97) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==50) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalModelica.g:1080:5: (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause )
                            {
                            // InternalModelica.g:1080:5: (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause )
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( ((LA33_0>=21 && LA33_0<=34)) ) {
                                alt33=1;
                            }
                            else if ( (LA33_0==EOF||LA33_0==RULE_IDENT||(LA33_0>=54 && LA33_0<=60)||LA33_0==97) ) {
                                alt33=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 33, 0, input);

                                throw nvae;
                            }
                            switch (alt33) {
                                case 1 :
                                    // InternalModelica.g:1081:6: this_ClassDefinition_6= ruleClassDefinition
                                    {

                                    						newCompositeNode(grammarAccess.getElementAccess().getClassDefinitionParserRuleCall_2_4_0_0());
                                    					
                                    pushFollow(FOLLOW_2);
                                    this_ClassDefinition_6=ruleClassDefinition();

                                    state._fsp--;


                                    						current = this_ClassDefinition_6;
                                    						afterParserOrEnumRuleCall();
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalModelica.g:1090:6: this_ComponentClause_7= ruleComponentClause
                                    {

                                    						newCompositeNode(grammarAccess.getElementAccess().getComponentClauseParserRuleCall_2_4_0_1());
                                    					
                                    pushFollow(FOLLOW_2);
                                    this_ComponentClause_7=ruleComponentClause();

                                    state._fsp--;


                                    						current = this_ComponentClause_7;
                                    						afterParserOrEnumRuleCall();
                                    					

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalModelica.g:1100:5: (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) )
                            {
                            // InternalModelica.g:1100:5: (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) )
                            // InternalModelica.g:1101:6: otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause )
                            {
                            otherlv_8=(Token)match(input,50,FOLLOW_42); 

                            						newLeafNode(otherlv_8, grammarAccess.getElementAccess().getReplaceableKeyword_2_4_1_0());
                            					
                            // InternalModelica.g:1105:6: (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause )
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( ((LA34_0>=21 && LA34_0<=34)) ) {
                                alt34=1;
                            }
                            else if ( (LA34_0==EOF||LA34_0==RULE_IDENT||(LA34_0>=54 && LA34_0<=60)||LA34_0==97) ) {
                                alt34=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 34, 0, input);

                                throw nvae;
                            }
                            switch (alt34) {
                                case 1 :
                                    // InternalModelica.g:1106:7: this_ClassDefinition_9= ruleClassDefinition
                                    {

                                    							newCompositeNode(grammarAccess.getElementAccess().getClassDefinitionParserRuleCall_2_4_1_1_0());
                                    						
                                    pushFollow(FOLLOW_2);
                                    this_ClassDefinition_9=ruleClassDefinition();

                                    state._fsp--;


                                    							current = this_ClassDefinition_9;
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalModelica.g:1115:7: this_ComponentClause_10= ruleComponentClause
                                    {

                                    							newCompositeNode(grammarAccess.getElementAccess().getComponentClauseParserRuleCall_2_4_1_1_1());
                                    						
                                    pushFollow(FOLLOW_2);
                                    this_ComponentClause_10=ruleComponentClause();

                                    state._fsp--;


                                    							current = this_ComponentClause_10;
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleImportClause"
    // InternalModelica.g:1131:1: entryRuleImportClause returns [EObject current=null] : iv_ruleImportClause= ruleImportClause EOF ;
    public final EObject entryRuleImportClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportClause = null;


        try {
            // InternalModelica.g:1131:53: (iv_ruleImportClause= ruleImportClause EOF )
            // InternalModelica.g:1132:2: iv_ruleImportClause= ruleImportClause EOF
            {
             newCompositeNode(grammarAccess.getImportClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportClause=ruleImportClause();

            state._fsp--;

             current =iv_ruleImportClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportClause"


    // $ANTLR start "ruleImportClause"
    // InternalModelica.g:1138:1: ruleImportClause returns [EObject current=null] : (otherlv_0= 'import' ( (this_IDENT_1= RULE_IDENT otherlv_2= '=' ruleName ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) ) )? ) ) this_Comment_10= ruleComment ) ;
    public final EObject ruleImportClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_IDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_Comment_10 = null;



        	enterRule();

        try {
            // InternalModelica.g:1144:2: ( (otherlv_0= 'import' ( (this_IDENT_1= RULE_IDENT otherlv_2= '=' ruleName ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) ) )? ) ) this_Comment_10= ruleComment ) )
            // InternalModelica.g:1145:2: (otherlv_0= 'import' ( (this_IDENT_1= RULE_IDENT otherlv_2= '=' ruleName ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) ) )? ) ) this_Comment_10= ruleComment )
            {
            // InternalModelica.g:1145:2: (otherlv_0= 'import' ( (this_IDENT_1= RULE_IDENT otherlv_2= '=' ruleName ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) ) )? ) ) this_Comment_10= ruleComment )
            // InternalModelica.g:1146:3: otherlv_0= 'import' ( (this_IDENT_1= RULE_IDENT otherlv_2= '=' ruleName ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) ) )? ) ) this_Comment_10= ruleComment
            {
            otherlv_0=(Token)match(input,51,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getImportClauseAccess().getImportKeyword_0());
            		
            // InternalModelica.g:1150:3: ( (this_IDENT_1= RULE_IDENT otherlv_2= '=' ruleName ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) ) )? ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_IDENT) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==36) ) {
                    alt40=1;
                }
                else if ( (LA40_1==EOF||LA40_1==RULE_STRING||LA40_1==19||LA40_1==38||LA40_1==42||LA40_1==52||LA40_1==97||LA40_1==100) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==97) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalModelica.g:1151:4: (this_IDENT_1= RULE_IDENT otherlv_2= '=' ruleName )
                    {
                    // InternalModelica.g:1151:4: (this_IDENT_1= RULE_IDENT otherlv_2= '=' ruleName )
                    // InternalModelica.g:1152:5: this_IDENT_1= RULE_IDENT otherlv_2= '=' ruleName
                    {
                    this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_16); 

                    					newLeafNode(this_IDENT_1, grammarAccess.getImportClauseAccess().getIDENTTerminalRuleCall_1_0_0());
                    				
                    otherlv_2=(Token)match(input,36,FOLLOW_18); 

                    					newLeafNode(otherlv_2, grammarAccess.getImportClauseAccess().getEqualsSignKeyword_1_0_1());
                    				

                    					newCompositeNode(grammarAccess.getImportClauseAccess().getNameParserRuleCall_1_0_2());
                    				
                    pushFollow(FOLLOW_28);
                    ruleName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:1169:4: ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) ) )? )
                    {
                    // InternalModelica.g:1169:4: ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) ) )? )
                    // InternalModelica.g:1170:5: ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) ) )?
                    {

                    					newCompositeNode(grammarAccess.getImportClauseAccess().getNameParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_43);
                    ruleName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalModelica.g:1177:5: ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==38||LA39_0==42||LA39_0==52) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalModelica.g:1178:6: (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) )
                            {
                            // InternalModelica.g:1178:6: (otherlv_5= ',' )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==42) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // InternalModelica.g:1179:7: otherlv_5= ','
                                    {
                                    otherlv_5=(Token)match(input,42,FOLLOW_44); 

                                    							newLeafNode(otherlv_5, grammarAccess.getImportClauseAccess().getCommaKeyword_1_1_1_0());
                                    						

                                    }
                                    break;

                            }

                            // InternalModelica.g:1184:6: (otherlv_6= '*' | (otherlv_7= '(' ruleImportList otherlv_9= ')' ) )
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==52) ) {
                                alt38=1;
                            }
                            else if ( (LA38_0==38) ) {
                                alt38=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 38, 0, input);

                                throw nvae;
                            }
                            switch (alt38) {
                                case 1 :
                                    // InternalModelica.g:1185:7: otherlv_6= '*'
                                    {
                                    otherlv_6=(Token)match(input,52,FOLLOW_28); 

                                    							newLeafNode(otherlv_6, grammarAccess.getImportClauseAccess().getAsteriskKeyword_1_1_1_1_0());
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalModelica.g:1190:7: (otherlv_7= '(' ruleImportList otherlv_9= ')' )
                                    {
                                    // InternalModelica.g:1190:7: (otherlv_7= '(' ruleImportList otherlv_9= ')' )
                                    // InternalModelica.g:1191:8: otherlv_7= '(' ruleImportList otherlv_9= ')'
                                    {
                                    otherlv_7=(Token)match(input,38,FOLLOW_15); 

                                    								newLeafNode(otherlv_7, grammarAccess.getImportClauseAccess().getLeftParenthesisKeyword_1_1_1_1_1_0());
                                    							

                                    								newCompositeNode(grammarAccess.getImportClauseAccess().getImportListParserRuleCall_1_1_1_1_1_1());
                                    							
                                    pushFollow(FOLLOW_24);
                                    ruleImportList();

                                    state._fsp--;


                                    								afterParserOrEnumRuleCall();
                                    							
                                    otherlv_9=(Token)match(input,40,FOLLOW_28); 

                                    								newLeafNode(otherlv_9, grammarAccess.getImportClauseAccess().getRightParenthesisKeyword_1_1_1_1_1_2());
                                    							

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getImportClauseAccess().getCommentParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_Comment_10=ruleComment();

            state._fsp--;


            			current = this_Comment_10;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportClause"


    // $ANTLR start "entryRuleImportList"
    // InternalModelica.g:1223:1: entryRuleImportList returns [String current=null] : iv_ruleImportList= ruleImportList EOF ;
    public final String entryRuleImportList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportList = null;


        try {
            // InternalModelica.g:1223:50: (iv_ruleImportList= ruleImportList EOF )
            // InternalModelica.g:1224:2: iv_ruleImportList= ruleImportList EOF
            {
             newCompositeNode(grammarAccess.getImportListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportList=ruleImportList();

            state._fsp--;

             current =iv_ruleImportList.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportList"


    // $ANTLR start "ruleImportList"
    // InternalModelica.g:1230:1: ruleImportList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT (kw= ',' this_ImportList_2= ruleImportList )? ) ;
    public final AntlrDatatypeRuleToken ruleImportList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ImportList_2 = null;



        	enterRule();

        try {
            // InternalModelica.g:1236:2: ( (this_IDENT_0= RULE_IDENT (kw= ',' this_ImportList_2= ruleImportList )? ) )
            // InternalModelica.g:1237:2: (this_IDENT_0= RULE_IDENT (kw= ',' this_ImportList_2= ruleImportList )? )
            {
            // InternalModelica.g:1237:2: (this_IDENT_0= RULE_IDENT (kw= ',' this_ImportList_2= ruleImportList )? )
            // InternalModelica.g:1238:3: this_IDENT_0= RULE_IDENT (kw= ',' this_ImportList_2= ruleImportList )?
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_30); 

            			current.merge(this_IDENT_0);
            		

            			newLeafNode(this_IDENT_0, grammarAccess.getImportListAccess().getIDENTTerminalRuleCall_0());
            		
            // InternalModelica.g:1245:3: (kw= ',' this_ImportList_2= ruleImportList )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==42) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalModelica.g:1246:4: kw= ',' this_ImportList_2= ruleImportList
                    {
                    kw=(Token)match(input,42,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImportListAccess().getCommaKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getImportListAccess().getImportListParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ImportList_2=ruleImportList();

                    state._fsp--;


                    				current.merge(this_ImportList_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportList"


    // $ANTLR start "entryRuleExtendsClause"
    // InternalModelica.g:1266:1: entryRuleExtendsClause returns [EObject current=null] : iv_ruleExtendsClause= ruleExtendsClause EOF ;
    public final EObject entryRuleExtendsClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsClause = null;


        try {
            // InternalModelica.g:1266:54: (iv_ruleExtendsClause= ruleExtendsClause EOF )
            // InternalModelica.g:1267:2: iv_ruleExtendsClause= ruleExtendsClause EOF
            {
             newCompositeNode(grammarAccess.getExtendsClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtendsClause=ruleExtendsClause();

            state._fsp--;

             current =iv_ruleExtendsClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendsClause"


    // $ANTLR start "ruleExtendsClause"
    // InternalModelica.g:1273:1: ruleExtendsClause returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? ) ;
    public final EObject ruleExtendsClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mod_2_0 = null;

        EObject lv_anno_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1279:2: ( (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? ) )
            // InternalModelica.g:1280:2: (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? )
            {
            // InternalModelica.g:1280:2: (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? )
            // InternalModelica.g:1281:3: otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendsClauseAccess().getExtendsKeyword_0());
            		
            // InternalModelica.g:1285:3: ( (lv_name_1_0= ruleName ) )
            // InternalModelica.g:1286:4: (lv_name_1_0= ruleName )
            {
            // InternalModelica.g:1286:4: (lv_name_1_0= ruleName )
            // InternalModelica.g:1287:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getExtendsClauseAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xmodelica.Modelica.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:1304:3: ( (lv_mod_2_0= ruleClassModification ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalModelica.g:1305:4: (lv_mod_2_0= ruleClassModification )
                    {
                    // InternalModelica.g:1305:4: (lv_mod_2_0= ruleClassModification )
                    // InternalModelica.g:1306:5: lv_mod_2_0= ruleClassModification
                    {

                    					newCompositeNode(grammarAccess.getExtendsClauseAccess().getModClassModificationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_36);
                    lv_mod_2_0=ruleClassModification();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                    					}
                    					set(
                    						current,
                    						"mod",
                    						lv_mod_2_0,
                    						"xmodelica.Modelica.ClassModification");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalModelica.g:1323:3: ( (lv_anno_3_0= ruleAnnotation ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==100) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalModelica.g:1324:4: (lv_anno_3_0= ruleAnnotation )
                    {
                    // InternalModelica.g:1324:4: (lv_anno_3_0= ruleAnnotation )
                    // InternalModelica.g:1325:5: lv_anno_3_0= ruleAnnotation
                    {

                    					newCompositeNode(grammarAccess.getExtendsClauseAccess().getAnnoAnnotationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_anno_3_0=ruleAnnotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                    					}
                    					set(
                    						current,
                    						"anno",
                    						lv_anno_3_0,
                    						"xmodelica.Modelica.Annotation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtendsClause"


    // $ANTLR start "entryRuleConstrainingClause"
    // InternalModelica.g:1346:1: entryRuleConstrainingClause returns [EObject current=null] : iv_ruleConstrainingClause= ruleConstrainingClause EOF ;
    public final EObject entryRuleConstrainingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrainingClause = null;


        try {
            // InternalModelica.g:1346:59: (iv_ruleConstrainingClause= ruleConstrainingClause EOF )
            // InternalModelica.g:1347:2: iv_ruleConstrainingClause= ruleConstrainingClause EOF
            {
             newCompositeNode(grammarAccess.getConstrainingClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstrainingClause=ruleConstrainingClause();

            state._fsp--;

             current =iv_ruleConstrainingClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstrainingClause"


    // $ANTLR start "ruleConstrainingClause"
    // InternalModelica.g:1353:1: ruleConstrainingClause returns [EObject current=null] : (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ) ;
    public final EObject ruleConstrainingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1359:2: ( (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ) )
            // InternalModelica.g:1360:2: (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? )
            {
            // InternalModelica.g:1360:2: (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? )
            // InternalModelica.g:1361:3: otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getConstrainingClauseAccess().getConstrainedbyKeyword_0());
            		
            // InternalModelica.g:1365:3: ( (lv_name_1_0= ruleName ) )
            // InternalModelica.g:1366:4: (lv_name_1_0= ruleName )
            {
            // InternalModelica.g:1366:4: (lv_name_1_0= ruleName )
            // InternalModelica.g:1367:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getConstrainingClauseAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstrainingClauseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xmodelica.Modelica.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:1384:3: ( (lv_mod_2_0= ruleClassModification ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalModelica.g:1385:4: (lv_mod_2_0= ruleClassModification )
                    {
                    // InternalModelica.g:1385:4: (lv_mod_2_0= ruleClassModification )
                    // InternalModelica.g:1386:5: lv_mod_2_0= ruleClassModification
                    {

                    					newCompositeNode(grammarAccess.getConstrainingClauseAccess().getModClassModificationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_mod_2_0=ruleClassModification();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstrainingClauseRule());
                    					}
                    					set(
                    						current,
                    						"mod",
                    						lv_mod_2_0,
                    						"xmodelica.Modelica.ClassModification");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstrainingClause"


    // $ANTLR start "entryRuleComponentClause"
    // InternalModelica.g:1407:1: entryRuleComponentClause returns [EObject current=null] : iv_ruleComponentClause= ruleComponentClause EOF ;
    public final EObject entryRuleComponentClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClause = null;


        try {
            // InternalModelica.g:1407:56: (iv_ruleComponentClause= ruleComponentClause EOF )
            // InternalModelica.g:1408:2: iv_ruleComponentClause= ruleComponentClause EOF
            {
             newCompositeNode(grammarAccess.getComponentClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentClause=ruleComponentClause();

            state._fsp--;

             current =iv_ruleComponentClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentClause"


    // $ANTLR start "ruleComponentClause"
    // InternalModelica.g:1414:1: ruleComponentClause returns [EObject current=null] : ( ruleTypePrefix ruleTypeSpecifier (this_ArraySubscripts_2= ruleArraySubscripts )? ( (lv_comps_3_0= ruleComponentList ) ) ) ;
    public final EObject ruleComponentClause() throws RecognitionException {
        EObject current = null;

        EObject this_ArraySubscripts_2 = null;

        EObject lv_comps_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1420:2: ( ( ruleTypePrefix ruleTypeSpecifier (this_ArraySubscripts_2= ruleArraySubscripts )? ( (lv_comps_3_0= ruleComponentList ) ) ) )
            // InternalModelica.g:1421:2: ( ruleTypePrefix ruleTypeSpecifier (this_ArraySubscripts_2= ruleArraySubscripts )? ( (lv_comps_3_0= ruleComponentList ) ) )
            {
            // InternalModelica.g:1421:2: ( ruleTypePrefix ruleTypeSpecifier (this_ArraySubscripts_2= ruleArraySubscripts )? ( (lv_comps_3_0= ruleComponentList ) ) )
            // InternalModelica.g:1422:3: ruleTypePrefix ruleTypeSpecifier (this_ArraySubscripts_2= ruleArraySubscripts )? ( (lv_comps_3_0= ruleComponentList ) )
            {

            			newCompositeNode(grammarAccess.getComponentClauseAccess().getTypePrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            ruleTypePrefix();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getComponentClauseAccess().getTypeSpecifierParserRuleCall_1());
            		
            pushFollow(FOLLOW_46);
            ruleTypeSpecifier();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:1436:3: (this_ArraySubscripts_2= ruleArraySubscripts )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==98) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalModelica.g:1437:4: this_ArraySubscripts_2= ruleArraySubscripts
                    {

                    				newCompositeNode(grammarAccess.getComponentClauseAccess().getArraySubscriptsParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_46);
                    this_ArraySubscripts_2=ruleArraySubscripts();

                    state._fsp--;


                    				current = this_ArraySubscripts_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalModelica.g:1446:3: ( (lv_comps_3_0= ruleComponentList ) )
            // InternalModelica.g:1447:4: (lv_comps_3_0= ruleComponentList )
            {
            // InternalModelica.g:1447:4: (lv_comps_3_0= ruleComponentList )
            // InternalModelica.g:1448:5: lv_comps_3_0= ruleComponentList
            {

            					newCompositeNode(grammarAccess.getComponentClauseAccess().getCompsComponentListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_comps_3_0=ruleComponentList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClauseRule());
            					}
            					set(
            						current,
            						"comps",
            						lv_comps_3_0,
            						"xmodelica.Modelica.ComponentList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentClause"


    // $ANTLR start "entryRuleTypePrefix"
    // InternalModelica.g:1469:1: entryRuleTypePrefix returns [String current=null] : iv_ruleTypePrefix= ruleTypePrefix EOF ;
    public final String entryRuleTypePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypePrefix = null;


        try {
            // InternalModelica.g:1469:50: (iv_ruleTypePrefix= ruleTypePrefix EOF )
            // InternalModelica.g:1470:2: iv_ruleTypePrefix= ruleTypePrefix EOF
            {
             newCompositeNode(grammarAccess.getTypePrefixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypePrefix=ruleTypePrefix();

            state._fsp--;

             current =iv_ruleTypePrefix.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypePrefix"


    // $ANTLR start "ruleTypePrefix"
    // InternalModelica.g:1476:1: ruleTypePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? ) ;
    public final AntlrDatatypeRuleToken ruleTypePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:1482:2: ( ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? ) )
            // InternalModelica.g:1483:2: ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? )
            {
            // InternalModelica.g:1483:2: ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? )
            // InternalModelica.g:1484:3: (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )?
            {
            // InternalModelica.g:1484:3: (kw= 'flow' | kw= 'stream' )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==54) ) {
                alt46=1;
            }
            else if ( (LA46_0==55) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // InternalModelica.g:1485:4: kw= 'flow'
                    {
                    kw=(Token)match(input,54,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getFlowKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:1491:4: kw= 'stream'
                    {
                    kw=(Token)match(input,55,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getStreamKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalModelica.g:1497:3: (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )?
            int alt47=4;
            switch ( input.LA(1) ) {
                case 56:
                    {
                    alt47=1;
                    }
                    break;
                case 57:
                    {
                    alt47=2;
                    }
                    break;
                case 58:
                    {
                    alt47=3;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // InternalModelica.g:1498:4: kw= 'discrete'
                    {
                    kw=(Token)match(input,56,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getDiscreteKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:1504:4: kw= 'parameter'
                    {
                    kw=(Token)match(input,57,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getParameterKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalModelica.g:1510:4: kw= 'constant'
                    {
                    kw=(Token)match(input,58,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getConstantKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalModelica.g:1516:3: (kw= 'input' | kw= 'output' )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            else if ( (LA48_0==60) ) {
                alt48=2;
            }
            switch (alt48) {
                case 1 :
                    // InternalModelica.g:1517:4: kw= 'input'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getInputKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:1523:4: kw= 'output'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getOutputKeyword_2_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypePrefix"


    // $ANTLR start "entryRuleTypeSpecifier"
    // InternalModelica.g:1533:1: entryRuleTypeSpecifier returns [String current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final String entryRuleTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSpecifier = null;


        try {
            // InternalModelica.g:1533:53: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // InternalModelica.g:1534:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;

             current =iv_ruleTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSpecifier"


    // $ANTLR start "ruleTypeSpecifier"
    // InternalModelica.g:1540:1: ruleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Name_0= ruleName ;
    public final AntlrDatatypeRuleToken ruleTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1546:2: (this_Name_0= ruleName )
            // InternalModelica.g:1547:2: this_Name_0= ruleName
            {

            		newCompositeNode(grammarAccess.getTypeSpecifierAccess().getNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Name_0=ruleName();

            state._fsp--;


            		current.merge(this_Name_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "entryRuleComponentList"
    // InternalModelica.g:1560:1: entryRuleComponentList returns [EObject current=null] : iv_ruleComponentList= ruleComponentList EOF ;
    public final EObject entryRuleComponentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentList = null;


        try {
            // InternalModelica.g:1560:54: (iv_ruleComponentList= ruleComponentList EOF )
            // InternalModelica.g:1561:2: iv_ruleComponentList= ruleComponentList EOF
            {
             newCompositeNode(grammarAccess.getComponentListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentList=ruleComponentList();

            state._fsp--;

             current =iv_ruleComponentList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentList"


    // $ANTLR start "ruleComponentList"
    // InternalModelica.g:1567:1: ruleComponentList returns [EObject current=null] : ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* ) ;
    public final EObject ruleComponentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_comps_0_0 = null;

        EObject lv_comps_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1573:2: ( ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* ) )
            // InternalModelica.g:1574:2: ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* )
            {
            // InternalModelica.g:1574:2: ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* )
            // InternalModelica.g:1575:3: ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )*
            {
            // InternalModelica.g:1575:3: ( (lv_comps_0_0= ruleComponentDeclaration ) )
            // InternalModelica.g:1576:4: (lv_comps_0_0= ruleComponentDeclaration )
            {
            // InternalModelica.g:1576:4: (lv_comps_0_0= ruleComponentDeclaration )
            // InternalModelica.g:1577:5: lv_comps_0_0= ruleComponentDeclaration
            {

            					newCompositeNode(grammarAccess.getComponentListAccess().getCompsComponentDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_comps_0_0=ruleComponentDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentListRule());
            					}
            					add(
            						current,
            						"comps",
            						lv_comps_0_0,
            						"xmodelica.Modelica.ComponentDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:1594:3: (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==42) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalModelica.g:1595:4: otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_46); 

            	    				newLeafNode(otherlv_1, grammarAccess.getComponentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:1599:4: ( (lv_comps_2_0= ruleComponentDeclaration ) )
            	    // InternalModelica.g:1600:5: (lv_comps_2_0= ruleComponentDeclaration )
            	    {
            	    // InternalModelica.g:1600:5: (lv_comps_2_0= ruleComponentDeclaration )
            	    // InternalModelica.g:1601:6: lv_comps_2_0= ruleComponentDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getComponentListAccess().getCompsComponentDeclarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_comps_2_0=ruleComponentDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"comps",
            	    							lv_comps_2_0,
            	    							"xmodelica.Modelica.ComponentDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentList"


    // $ANTLR start "entryRuleComponentDeclaration"
    // InternalModelica.g:1623:1: entryRuleComponentDeclaration returns [EObject current=null] : iv_ruleComponentDeclaration= ruleComponentDeclaration EOF ;
    public final EObject entryRuleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDeclaration = null;


        try {
            // InternalModelica.g:1623:61: (iv_ruleComponentDeclaration= ruleComponentDeclaration EOF )
            // InternalModelica.g:1624:2: iv_ruleComponentDeclaration= ruleComponentDeclaration EOF
            {
             newCompositeNode(grammarAccess.getComponentDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDeclaration=ruleComponentDeclaration();

            state._fsp--;

             current =iv_ruleComponentDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentDeclaration"


    // $ANTLR start "ruleComponentDeclaration"
    // InternalModelica.g:1630:1: ruleComponentDeclaration returns [EObject current=null] : ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) ) ;
    public final EObject ruleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0_0 = null;

        EObject lv_cond_1_0 = null;

        EObject lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1636:2: ( ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) ) )
            // InternalModelica.g:1637:2: ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) )
            {
            // InternalModelica.g:1637:2: ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) )
            // InternalModelica.g:1638:3: ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) )
            {
            // InternalModelica.g:1638:3: ( (lv_decl_0_0= ruleDeclaration ) )
            // InternalModelica.g:1639:4: (lv_decl_0_0= ruleDeclaration )
            {
            // InternalModelica.g:1639:4: (lv_decl_0_0= ruleDeclaration )
            // InternalModelica.g:1640:5: lv_decl_0_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getDeclDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_49);
            lv_decl_0_0=ruleDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
            					}
            					set(
            						current,
            						"decl",
            						lv_decl_0_0,
            						"xmodelica.Modelica.Declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:1657:3: ( (lv_cond_1_0= ruleConditionAttribute ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalModelica.g:1658:4: (lv_cond_1_0= ruleConditionAttribute )
                    {
                    // InternalModelica.g:1658:4: (lv_cond_1_0= ruleConditionAttribute )
                    // InternalModelica.g:1659:5: lv_cond_1_0= ruleConditionAttribute
                    {

                    					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getCondConditionAttributeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_cond_1_0=ruleConditionAttribute();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"cond",
                    						lv_cond_1_0,
                    						"xmodelica.Modelica.ConditionAttribute");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalModelica.g:1676:3: ( (lv_comment_2_0= ruleComment ) )
            // InternalModelica.g:1677:4: (lv_comment_2_0= ruleComment )
            {
            // InternalModelica.g:1677:4: (lv_comment_2_0= ruleComment )
            // InternalModelica.g:1678:5: lv_comment_2_0= ruleComment
            {

            					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getCommentCommentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_comment_2_0=ruleComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_2_0,
            						"xmodelica.Modelica.Comment");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentDeclaration"


    // $ANTLR start "entryRuleConditionAttribute"
    // InternalModelica.g:1699:1: entryRuleConditionAttribute returns [EObject current=null] : iv_ruleConditionAttribute= ruleConditionAttribute EOF ;
    public final EObject entryRuleConditionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionAttribute = null;


        try {
            // InternalModelica.g:1699:59: (iv_ruleConditionAttribute= ruleConditionAttribute EOF )
            // InternalModelica.g:1700:2: iv_ruleConditionAttribute= ruleConditionAttribute EOF
            {
             newCompositeNode(grammarAccess.getConditionAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionAttribute=ruleConditionAttribute();

            state._fsp--;

             current =iv_ruleConditionAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionAttribute"


    // $ANTLR start "ruleConditionAttribute"
    // InternalModelica.g:1706:1: ruleConditionAttribute returns [EObject current=null] : (otherlv_0= 'if' this_Expression_1= ruleExpression ) ;
    public final EObject ruleConditionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:1712:2: ( (otherlv_0= 'if' this_Expression_1= ruleExpression ) )
            // InternalModelica.g:1713:2: (otherlv_0= 'if' this_Expression_1= ruleExpression )
            {
            // InternalModelica.g:1713:2: (otherlv_0= 'if' this_Expression_1= ruleExpression )
            // InternalModelica.g:1714:3: otherlv_0= 'if' this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,61,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAttributeAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getConditionAttributeAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionAttribute"


    // $ANTLR start "entryRuleDeclaration"
    // InternalModelica.g:1730:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalModelica.g:1730:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalModelica.g:1731:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalModelica.g:1737:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_subscripts_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1743:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? ) )
            // InternalModelica.g:1744:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? )
            {
            // InternalModelica.g:1744:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? )
            // InternalModelica.g:1745:3: ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )?
            {
            // InternalModelica.g:1745:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalModelica.g:1746:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalModelica.g:1746:4: (lv_name_0_0= RULE_IDENT )
            // InternalModelica.g:1747:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_51); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDeclarationAccess().getNameIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"xmodelica.Modelica.IDENT");
            				

            }


            }

            // InternalModelica.g:1763:3: ( (lv_subscripts_1_0= ruleArraySubscripts ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==98) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalModelica.g:1764:4: (lv_subscripts_1_0= ruleArraySubscripts )
                    {
                    // InternalModelica.g:1764:4: (lv_subscripts_1_0= ruleArraySubscripts )
                    // InternalModelica.g:1765:5: lv_subscripts_1_0= ruleArraySubscripts
                    {

                    					newCompositeNode(grammarAccess.getDeclarationAccess().getSubscriptsArraySubscriptsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_52);
                    lv_subscripts_1_0=ruleArraySubscripts();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"subscripts",
                    						lv_subscripts_1_0,
                    						"xmodelica.Modelica.ArraySubscripts");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalModelica.g:1782:3: ( (lv_mod_2_0= ruleModification ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==36||LA52_0==38||LA52_0==62) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalModelica.g:1783:4: (lv_mod_2_0= ruleModification )
                    {
                    // InternalModelica.g:1783:4: (lv_mod_2_0= ruleModification )
                    // InternalModelica.g:1784:5: lv_mod_2_0= ruleModification
                    {

                    					newCompositeNode(grammarAccess.getDeclarationAccess().getModModificationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_mod_2_0=ruleModification();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"mod",
                    						lv_mod_2_0,
                    						"xmodelica.Modelica.Modification");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleModification"
    // InternalModelica.g:1805:1: entryRuleModification returns [EObject current=null] : iv_ruleModification= ruleModification EOF ;
    public final EObject entryRuleModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModification = null;


        try {
            // InternalModelica.g:1805:53: (iv_ruleModification= ruleModification EOF )
            // InternalModelica.g:1806:2: iv_ruleModification= ruleModification EOF
            {
             newCompositeNode(grammarAccess.getModificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModification=ruleModification();

            state._fsp--;

             current =iv_ruleModification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModification"


    // $ANTLR start "ruleModification"
    // InternalModelica.g:1812:1: ruleModification returns [EObject current=null] : ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) ) ;
    public final EObject ruleModification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_mod_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_expr_4_0 = null;

        EObject lv_expr_6_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1818:2: ( ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) ) )
            // InternalModelica.g:1819:2: ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) )
            {
            // InternalModelica.g:1819:2: ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt54=1;
                }
                break;
            case 36:
                {
                alt54=2;
                }
                break;
            case 62:
                {
                alt54=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalModelica.g:1820:3: ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? )
                    {
                    // InternalModelica.g:1820:3: ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? )
                    // InternalModelica.g:1821:4: ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )?
                    {
                    // InternalModelica.g:1821:4: ( (lv_mod_0_0= ruleClassModification ) )
                    // InternalModelica.g:1822:5: (lv_mod_0_0= ruleClassModification )
                    {
                    // InternalModelica.g:1822:5: (lv_mod_0_0= ruleClassModification )
                    // InternalModelica.g:1823:6: lv_mod_0_0= ruleClassModification
                    {

                    						newCompositeNode(grammarAccess.getModificationAccess().getModClassModificationParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_mod_0_0=ruleClassModification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModificationRule());
                    						}
                    						set(
                    							current,
                    							"mod",
                    							lv_mod_0_0,
                    							"xmodelica.Modelica.ClassModification");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:1840:4: (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==36) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalModelica.g:1841:5: otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
                            {
                            otherlv_1=(Token)match(input,36,FOLLOW_50); 

                            					newLeafNode(otherlv_1, grammarAccess.getModificationAccess().getEqualsSignKeyword_0_1_0());
                            				
                            // InternalModelica.g:1845:5: ( (lv_expr_2_0= ruleExpression ) )
                            // InternalModelica.g:1846:6: (lv_expr_2_0= ruleExpression )
                            {
                            // InternalModelica.g:1846:6: (lv_expr_2_0= ruleExpression )
                            // InternalModelica.g:1847:7: lv_expr_2_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getModificationAccess().getExprExpressionParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_expr_2_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModificationRule());
                            							}
                            							set(
                            								current,
                            								"expr",
                            								lv_expr_2_0,
                            								"xmodelica.Modelica.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:1867:3: (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:1867:3: (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) )
                    // InternalModelica.g:1868:4: otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getModificationAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalModelica.g:1872:4: ( (lv_expr_4_0= ruleExpression ) )
                    // InternalModelica.g:1873:5: (lv_expr_4_0= ruleExpression )
                    {
                    // InternalModelica.g:1873:5: (lv_expr_4_0= ruleExpression )
                    // InternalModelica.g:1874:6: lv_expr_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getModificationAccess().getExprExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModificationRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_4_0,
                    							"xmodelica.Modelica.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalModelica.g:1893:3: (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:1893:3: (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) )
                    // InternalModelica.g:1894:4: otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_50); 

                    				newLeafNode(otherlv_5, grammarAccess.getModificationAccess().getColonEqualsSignKeyword_2_0());
                    			
                    // InternalModelica.g:1898:4: ( (lv_expr_6_0= ruleExpression ) )
                    // InternalModelica.g:1899:5: (lv_expr_6_0= ruleExpression )
                    {
                    // InternalModelica.g:1899:5: (lv_expr_6_0= ruleExpression )
                    // InternalModelica.g:1900:6: lv_expr_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getModificationAccess().getExprExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModificationRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_6_0,
                    							"xmodelica.Modelica.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModification"


    // $ANTLR start "entryRuleClassModification"
    // InternalModelica.g:1922:1: entryRuleClassModification returns [EObject current=null] : iv_ruleClassModification= ruleClassModification EOF ;
    public final EObject entryRuleClassModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassModification = null;


        try {
            // InternalModelica.g:1922:58: (iv_ruleClassModification= ruleClassModification EOF )
            // InternalModelica.g:1923:2: iv_ruleClassModification= ruleClassModification EOF
            {
             newCompositeNode(grammarAccess.getClassModificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassModification=ruleClassModification();

            state._fsp--;

             current =iv_ruleClassModification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassModification"


    // $ANTLR start "ruleClassModification"
    // InternalModelica.g:1929:1: ruleClassModification returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' ) ;
    public final EObject ruleClassModification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1935:2: ( ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' ) )
            // InternalModelica.g:1936:2: ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' )
            {
            // InternalModelica.g:1936:2: ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' )
            // InternalModelica.g:1937:3: () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')'
            {
            // InternalModelica.g:1937:3: ()
            // InternalModelica.g:1938:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassModificationAccess().getClassModificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getClassModificationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalModelica.g:1948:3: ( (lv_args_2_0= ruleArgumentList ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_UNSIGNED_NUMBER)||LA55_0==35||(LA55_0>=95 && LA55_0<=96)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalModelica.g:1949:4: (lv_args_2_0= ruleArgumentList )
                    {
                    // InternalModelica.g:1949:4: (lv_args_2_0= ruleArgumentList )
                    // InternalModelica.g:1950:5: lv_args_2_0= ruleArgumentList
                    {

                    					newCompositeNode(grammarAccess.getClassModificationAccess().getArgsArgumentListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_args_2_0=ruleArgumentList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassModificationRule());
                    					}
                    					add(
                    						current,
                    						"args",
                    						lv_args_2_0,
                    						"xmodelica.Modelica.ArgumentList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClassModificationAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassModification"


    // $ANTLR start "entryRuleArgumentList"
    // InternalModelica.g:1975:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // InternalModelica.g:1975:53: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalModelica.g:1976:2: iv_ruleArgumentList= ruleArgumentList EOF
            {
             newCompositeNode(grammarAccess.getArgumentListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentList=ruleArgumentList();

            state._fsp--;

             current =iv_ruleArgumentList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentList"


    // $ANTLR start "ruleArgumentList"
    // InternalModelica.g:1982:1: ruleArgumentList returns [EObject current=null] : ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1988:2: ( ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* ) )
            // InternalModelica.g:1989:2: ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* )
            {
            // InternalModelica.g:1989:2: ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* )
            // InternalModelica.g:1990:3: ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )*
            {
            // InternalModelica.g:1990:3: ( (lv_args_0_0= ruleArgument ) )
            // InternalModelica.g:1991:4: (lv_args_0_0= ruleArgument )
            {
            // InternalModelica.g:1991:4: (lv_args_0_0= ruleArgument )
            // InternalModelica.g:1992:5: lv_args_0_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getArgumentListAccess().getArgsArgumentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_args_0_0=ruleArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentListRule());
            					}
            					add(
            						current,
            						"args",
            						lv_args_0_0,
            						"xmodelica.Modelica.Argument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:2009:3: (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==42) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalModelica.g:2010:4: otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_55); 

            	    				newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:2014:4: ( (lv_args_2_0= ruleArgument ) )
            	    // InternalModelica.g:2015:5: (lv_args_2_0= ruleArgument )
            	    {
            	    // InternalModelica.g:2015:5: (lv_args_2_0= ruleArgument )
            	    // InternalModelica.g:2016:6: lv_args_2_0= ruleArgument
            	    {

            	    						newCompositeNode(grammarAccess.getArgumentListAccess().getArgsArgumentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_args_2_0=ruleArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArgumentListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_2_0,
            	    							"xmodelica.Modelica.Argument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "entryRuleArgument"
    // InternalModelica.g:2038:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalModelica.g:2038:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalModelica.g:2039:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalModelica.g:2045:1: ruleArgument returns [EObject current=null] : this_Primary_0= rulePrimary ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2051:2: (this_Primary_0= rulePrimary )
            // InternalModelica.g:2052:2: this_Primary_0= rulePrimary
            {

            		newCompositeNode(grammarAccess.getArgumentAccess().getPrimaryParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Primary_0=rulePrimary();

            state._fsp--;


            		current = this_Primary_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleElementModification"
    // InternalModelica.g:2063:1: entryRuleElementModification returns [EObject current=null] : iv_ruleElementModification= ruleElementModification EOF ;
    public final EObject entryRuleElementModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementModification = null;


        try {
            // InternalModelica.g:2063:60: (iv_ruleElementModification= ruleElementModification EOF )
            // InternalModelica.g:2064:2: iv_ruleElementModification= ruleElementModification EOF
            {
             newCompositeNode(grammarAccess.getElementModificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementModification=ruleElementModification();

            state._fsp--;

             current =iv_ruleElementModification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementModification"


    // $ANTLR start "ruleElementModification"
    // InternalModelica.g:2070:1: ruleElementModification returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) ) ;
    public final EObject ruleElementModification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_mod_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2076:2: ( ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) ) )
            // InternalModelica.g:2077:2: ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) )
            {
            // InternalModelica.g:2077:2: ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) )
            // InternalModelica.g:2078:3: ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) )
            {
            // InternalModelica.g:2078:3: ( (lv_name_0_0= ruleName ) )
            // InternalModelica.g:2079:4: (lv_name_0_0= ruleName )
            {
            // InternalModelica.g:2079:4: (lv_name_0_0= ruleName )
            // InternalModelica.g:2080:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getElementModificationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_56);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementModificationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"xmodelica.Modelica.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:2097:3: ( (lv_mod_1_0= ruleModification ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==36||LA57_0==38||LA57_0==62) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalModelica.g:2098:4: (lv_mod_1_0= ruleModification )
                    {
                    // InternalModelica.g:2098:4: (lv_mod_1_0= ruleModification )
                    // InternalModelica.g:2099:5: lv_mod_1_0= ruleModification
                    {

                    					newCompositeNode(grammarAccess.getElementModificationAccess().getModModificationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_57);
                    lv_mod_1_0=ruleModification();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementModificationRule());
                    					}
                    					set(
                    						current,
                    						"mod",
                    						lv_mod_1_0,
                    						"xmodelica.Modelica.Modification");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalModelica.g:2116:3: ( (lv_comment_2_0= ruleStringComment ) )
            // InternalModelica.g:2117:4: (lv_comment_2_0= ruleStringComment )
            {
            // InternalModelica.g:2117:4: (lv_comment_2_0= ruleStringComment )
            // InternalModelica.g:2118:5: lv_comment_2_0= ruleStringComment
            {

            					newCompositeNode(grammarAccess.getElementModificationAccess().getCommentStringCommentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_comment_2_0=ruleStringComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementModificationRule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_2_0,
            						"xmodelica.Modelica.StringComment");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementModification"


    // $ANTLR start "entryRuleElementReplaceable"
    // InternalModelica.g:2139:1: entryRuleElementReplaceable returns [EObject current=null] : iv_ruleElementReplaceable= ruleElementReplaceable EOF ;
    public final EObject entryRuleElementReplaceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReplaceable = null;


        try {
            // InternalModelica.g:2139:59: (iv_ruleElementReplaceable= ruleElementReplaceable EOF )
            // InternalModelica.g:2140:2: iv_ruleElementReplaceable= ruleElementReplaceable EOF
            {
             newCompositeNode(grammarAccess.getElementReplaceableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementReplaceable=ruleElementReplaceable();

            state._fsp--;

             current =iv_ruleElementReplaceable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementReplaceable"


    // $ANTLR start "ruleElementReplaceable"
    // InternalModelica.g:2146:1: ruleElementReplaceable returns [EObject current=null] : (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? ) ;
    public final EObject ruleElementReplaceable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ShortClassDefinition_1 = null;

        EObject this_ComponentClause1_2 = null;

        EObject lv_const_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2152:2: ( (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? ) )
            // InternalModelica.g:2153:2: (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? )
            {
            // InternalModelica.g:2153:2: (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? )
            // InternalModelica.g:2154:3: otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getElementReplaceableAccess().getReplaceableKeyword_0());
            		
            // InternalModelica.g:2158:3: (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=22 && LA58_0<=34)) ) {
                alt58=1;
            }
            else if ( (LA58_0==EOF||LA58_0==RULE_IDENT||(LA58_0>=54 && LA58_0<=60)||LA58_0==97) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalModelica.g:2159:4: this_ShortClassDefinition_1= ruleShortClassDefinition
                    {

                    				newCompositeNode(grammarAccess.getElementReplaceableAccess().getShortClassDefinitionParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_58);
                    this_ShortClassDefinition_1=ruleShortClassDefinition();

                    state._fsp--;


                    				current = this_ShortClassDefinition_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:2168:4: this_ComponentClause1_2= ruleComponentClause1
                    {

                    				newCompositeNode(grammarAccess.getElementReplaceableAccess().getComponentClause1ParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_58);
                    this_ComponentClause1_2=ruleComponentClause1();

                    state._fsp--;


                    				current = this_ComponentClause1_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalModelica.g:2177:3: ( (lv_const_3_0= ruleConstrainingClause ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==53) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalModelica.g:2178:4: (lv_const_3_0= ruleConstrainingClause )
                    {
                    // InternalModelica.g:2178:4: (lv_const_3_0= ruleConstrainingClause )
                    // InternalModelica.g:2179:5: lv_const_3_0= ruleConstrainingClause
                    {

                    					newCompositeNode(grammarAccess.getElementReplaceableAccess().getConstConstrainingClauseParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_const_3_0=ruleConstrainingClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementReplaceableRule());
                    					}
                    					set(
                    						current,
                    						"const",
                    						lv_const_3_0,
                    						"xmodelica.Modelica.ConstrainingClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementReplaceable"


    // $ANTLR start "entryRuleComponentClause1"
    // InternalModelica.g:2200:1: entryRuleComponentClause1 returns [EObject current=null] : iv_ruleComponentClause1= ruleComponentClause1 EOF ;
    public final EObject entryRuleComponentClause1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClause1 = null;


        try {
            // InternalModelica.g:2200:57: (iv_ruleComponentClause1= ruleComponentClause1 EOF )
            // InternalModelica.g:2201:2: iv_ruleComponentClause1= ruleComponentClause1 EOF
            {
             newCompositeNode(grammarAccess.getComponentClause1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentClause1=ruleComponentClause1();

            state._fsp--;

             current =iv_ruleComponentClause1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentClause1"


    // $ANTLR start "ruleComponentClause1"
    // InternalModelica.g:2207:1: ruleComponentClause1 returns [EObject current=null] : ( ruleTypePrefix ruleTypeSpecifier this_ComponentDeclaration1_2= ruleComponentDeclaration1 ) ;
    public final EObject ruleComponentClause1() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentDeclaration1_2 = null;



        	enterRule();

        try {
            // InternalModelica.g:2213:2: ( ( ruleTypePrefix ruleTypeSpecifier this_ComponentDeclaration1_2= ruleComponentDeclaration1 ) )
            // InternalModelica.g:2214:2: ( ruleTypePrefix ruleTypeSpecifier this_ComponentDeclaration1_2= ruleComponentDeclaration1 )
            {
            // InternalModelica.g:2214:2: ( ruleTypePrefix ruleTypeSpecifier this_ComponentDeclaration1_2= ruleComponentDeclaration1 )
            // InternalModelica.g:2215:3: ruleTypePrefix ruleTypeSpecifier this_ComponentDeclaration1_2= ruleComponentDeclaration1
            {

            			newCompositeNode(grammarAccess.getComponentClause1Access().getTypePrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            ruleTypePrefix();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getComponentClause1Access().getTypeSpecifierParserRuleCall_1());
            		
            pushFollow(FOLLOW_46);
            ruleTypeSpecifier();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getComponentClause1Access().getComponentDeclaration1ParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ComponentDeclaration1_2=ruleComponentDeclaration1();

            state._fsp--;


            			current = this_ComponentDeclaration1_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentClause1"


    // $ANTLR start "entryRuleComponentDeclaration1"
    // InternalModelica.g:2241:1: entryRuleComponentDeclaration1 returns [EObject current=null] : iv_ruleComponentDeclaration1= ruleComponentDeclaration1 EOF ;
    public final EObject entryRuleComponentDeclaration1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDeclaration1 = null;


        try {
            // InternalModelica.g:2241:62: (iv_ruleComponentDeclaration1= ruleComponentDeclaration1 EOF )
            // InternalModelica.g:2242:2: iv_ruleComponentDeclaration1= ruleComponentDeclaration1 EOF
            {
             newCompositeNode(grammarAccess.getComponentDeclaration1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDeclaration1=ruleComponentDeclaration1();

            state._fsp--;

             current =iv_ruleComponentDeclaration1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentDeclaration1"


    // $ANTLR start "ruleComponentDeclaration1"
    // InternalModelica.g:2248:1: ruleComponentDeclaration1 returns [EObject current=null] : (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) ) ;
    public final EObject ruleComponentDeclaration1() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject lv_comment_1_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2254:2: ( (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) ) )
            // InternalModelica.g:2255:2: (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) )
            {
            // InternalModelica.g:2255:2: (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) )
            // InternalModelica.g:2256:3: this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) )
            {

            			newCompositeNode(grammarAccess.getComponentDeclaration1Access().getDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Declaration_0=ruleDeclaration();

            state._fsp--;


            			current = this_Declaration_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:2264:3: ( (lv_comment_1_0= ruleComment ) )
            // InternalModelica.g:2265:4: (lv_comment_1_0= ruleComment )
            {
            // InternalModelica.g:2265:4: (lv_comment_1_0= ruleComment )
            // InternalModelica.g:2266:5: lv_comment_1_0= ruleComment
            {

            					newCompositeNode(grammarAccess.getComponentDeclaration1Access().getCommentCommentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_comment_1_0=ruleComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDeclaration1Rule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"xmodelica.Modelica.Comment");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentDeclaration1"


    // $ANTLR start "entryRuleShortClassDefinition"
    // InternalModelica.g:2287:1: entryRuleShortClassDefinition returns [EObject current=null] : iv_ruleShortClassDefinition= ruleShortClassDefinition EOF ;
    public final EObject entryRuleShortClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortClassDefinition = null;


        try {
            // InternalModelica.g:2287:61: (iv_ruleShortClassDefinition= ruleShortClassDefinition EOF )
            // InternalModelica.g:2288:2: iv_ruleShortClassDefinition= ruleShortClassDefinition EOF
            {
             newCompositeNode(grammarAccess.getShortClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShortClassDefinition=ruleShortClassDefinition();

            state._fsp--;

             current =iv_ruleShortClassDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShortClassDefinition"


    // $ANTLR start "ruleShortClassDefinition"
    // InternalModelica.g:2294:1: ruleShortClassDefinition returns [EObject current=null] : ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( (this_EnumList_10= ruleEnumList )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) ) ;
    public final EObject ruleShortClassDefinition() throws RecognitionException {
        EObject current = null;

        Token this_IDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject this_ArraySubscripts_5 = null;

        EObject lv_mode_6_0 = null;

        EObject lv_comment_7_0 = null;

        EObject this_EnumList_10 = null;

        EObject lv_comment_13_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2300:2: ( ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( (this_EnumList_10= ruleEnumList )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) ) )
            // InternalModelica.g:2301:2: ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( (this_EnumList_10= ruleEnumList )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) )
            {
            // InternalModelica.g:2301:2: ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( (this_EnumList_10= ruleEnumList )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) )
            // InternalModelica.g:2302:3: ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( (this_EnumList_10= ruleEnumList )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) )
            {

            			newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getClassPrefixesParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            ruleClassPrefixes();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_16); 

            			newLeafNode(this_IDENT_1, grammarAccess.getShortClassDefinitionAccess().getIDENTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getShortClassDefinitionAccess().getEqualsSignKeyword_2());
            		
            // InternalModelica.g:2317:3: ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( (this_EnumList_10= ruleEnumList )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==EOF||LA64_0==RULE_IDENT||(LA64_0>=54 && LA64_0<=60)||LA64_0==97) ) {
                alt64=1;
            }
            else if ( (LA64_0==37) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalModelica.g:2318:4: ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) )
                    {
                    // InternalModelica.g:2318:4: ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) )
                    // InternalModelica.g:2319:5: ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) )
                    {

                    					newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getBasePrefixParserRuleCall_3_0_0());
                    				
                    pushFollow(FOLLOW_18);
                    ruleBasePrefix();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getNameParserRuleCall_3_0_1());
                    				
                    pushFollow(FOLLOW_60);
                    ruleName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalModelica.g:2333:5: (this_ArraySubscripts_5= ruleArraySubscripts )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==98) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalModelica.g:2334:6: this_ArraySubscripts_5= ruleArraySubscripts
                            {

                            						newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getArraySubscriptsParserRuleCall_3_0_2());
                            					
                            pushFollow(FOLLOW_61);
                            this_ArraySubscripts_5=ruleArraySubscripts();

                            state._fsp--;


                            						current = this_ArraySubscripts_5;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }

                    // InternalModelica.g:2343:5: ( (lv_mode_6_0= ruleClassModification ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==38) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalModelica.g:2344:6: (lv_mode_6_0= ruleClassModification )
                            {
                            // InternalModelica.g:2344:6: (lv_mode_6_0= ruleClassModification )
                            // InternalModelica.g:2345:7: lv_mode_6_0= ruleClassModification
                            {

                            							newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getModeClassModificationParserRuleCall_3_0_3_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_mode_6_0=ruleClassModification();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getShortClassDefinitionRule());
                            							}
                            							set(
                            								current,
                            								"mode",
                            								lv_mode_6_0,
                            								"xmodelica.Modelica.ClassModification");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalModelica.g:2362:5: ( (lv_comment_7_0= ruleComment ) )
                    // InternalModelica.g:2363:6: (lv_comment_7_0= ruleComment )
                    {
                    // InternalModelica.g:2363:6: (lv_comment_7_0= ruleComment )
                    // InternalModelica.g:2364:7: lv_comment_7_0= ruleComment
                    {

                    							newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getCommentCommentParserRuleCall_3_0_4_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_comment_7_0=ruleComment();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getShortClassDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"comment",
                    								lv_comment_7_0,
                    								"xmodelica.Modelica.Comment");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:2383:4: (otherlv_8= 'enumeration' otherlv_9= '(' ( (this_EnumList_10= ruleEnumList )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) )
                    {
                    // InternalModelica.g:2383:4: (otherlv_8= 'enumeration' otherlv_9= '(' ( (this_EnumList_10= ruleEnumList )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) )
                    // InternalModelica.g:2384:5: otherlv_8= 'enumeration' otherlv_9= '(' ( (this_EnumList_10= ruleEnumList )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) )
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_22); 

                    					newLeafNode(otherlv_8, grammarAccess.getShortClassDefinitionAccess().getEnumerationKeyword_3_1_0());
                    				
                    otherlv_9=(Token)match(input,38,FOLLOW_23); 

                    					newLeafNode(otherlv_9, grammarAccess.getShortClassDefinitionAccess().getLeftParenthesisKeyword_3_1_1());
                    				
                    // InternalModelica.g:2392:5: ( (this_EnumList_10= ruleEnumList )? | otherlv_11= ':' )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_IDENT||LA63_0==40) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==39) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalModelica.g:2393:6: (this_EnumList_10= ruleEnumList )?
                            {
                            // InternalModelica.g:2393:6: (this_EnumList_10= ruleEnumList )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==RULE_IDENT) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // InternalModelica.g:2394:7: this_EnumList_10= ruleEnumList
                                    {

                                    							newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getEnumListParserRuleCall_3_1_2_0());
                                    						
                                    pushFollow(FOLLOW_24);
                                    this_EnumList_10=ruleEnumList();

                                    state._fsp--;


                                    							current = this_EnumList_10;
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalModelica.g:2404:6: otherlv_11= ':'
                            {
                            otherlv_11=(Token)match(input,39,FOLLOW_24); 

                            						newLeafNode(otherlv_11, grammarAccess.getShortClassDefinitionAccess().getColonKeyword_3_1_2_1());
                            					

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,40,FOLLOW_28); 

                    					newLeafNode(otherlv_12, grammarAccess.getShortClassDefinitionAccess().getRightParenthesisKeyword_3_1_3());
                    				
                    // InternalModelica.g:2413:5: ( (lv_comment_13_0= ruleComment ) )
                    // InternalModelica.g:2414:6: (lv_comment_13_0= ruleComment )
                    {
                    // InternalModelica.g:2414:6: (lv_comment_13_0= ruleComment )
                    // InternalModelica.g:2415:7: lv_comment_13_0= ruleComment
                    {

                    							newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getCommentCommentParserRuleCall_3_1_4_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_comment_13_0=ruleComment();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getShortClassDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"comment",
                    								lv_comment_13_0,
                    								"xmodelica.Modelica.Comment");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShortClassDefinition"


    // $ANTLR start "entryRuleEquationSection"
    // InternalModelica.g:2438:1: entryRuleEquationSection returns [EObject current=null] : iv_ruleEquationSection= ruleEquationSection EOF ;
    public final EObject entryRuleEquationSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquationSection = null;


        try {
            // InternalModelica.g:2438:56: (iv_ruleEquationSection= ruleEquationSection EOF )
            // InternalModelica.g:2439:2: iv_ruleEquationSection= ruleEquationSection EOF
            {
             newCompositeNode(grammarAccess.getEquationSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquationSection=ruleEquationSection();

            state._fsp--;

             current =iv_ruleEquationSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquationSection"


    // $ANTLR start "ruleEquationSection"
    // InternalModelica.g:2445:1: ruleEquationSection returns [EObject current=null] : ( () (otherlv_1= 'initial' )? otherlv_2= 'equation' ( ( (lv_equationss_3_0= ruleEquation ) ) otherlv_4= ';' )* ) ;
    public final EObject ruleEquationSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_equationss_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2451:2: ( ( () (otherlv_1= 'initial' )? otherlv_2= 'equation' ( ( (lv_equationss_3_0= ruleEquation ) ) otherlv_4= ';' )* ) )
            // InternalModelica.g:2452:2: ( () (otherlv_1= 'initial' )? otherlv_2= 'equation' ( ( (lv_equationss_3_0= ruleEquation ) ) otherlv_4= ';' )* )
            {
            // InternalModelica.g:2452:2: ( () (otherlv_1= 'initial' )? otherlv_2= 'equation' ( ( (lv_equationss_3_0= ruleEquation ) ) otherlv_4= ';' )* )
            // InternalModelica.g:2453:3: () (otherlv_1= 'initial' )? otherlv_2= 'equation' ( ( (lv_equationss_3_0= ruleEquation ) ) otherlv_4= ';' )*
            {
            // InternalModelica.g:2453:3: ()
            // InternalModelica.g:2454:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEquationSectionAccess().getEquationSectionAction_0(),
            					current);
            			

            }

            // InternalModelica.g:2460:3: (otherlv_1= 'initial' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==63) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalModelica.g:2461:4: otherlv_1= 'initial'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_62); 

                    				newLeafNode(otherlv_1, grammarAccess.getEquationSectionAccess().getInitialKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,64,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getEquationSectionAccess().getEquationKeyword_2());
            		
            // InternalModelica.g:2470:3: ( ( (lv_equationss_3_0= ruleEquation ) ) otherlv_4= ';' )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==79) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalModelica.g:2471:4: ( (lv_equationss_3_0= ruleEquation ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:2471:4: ( (lv_equationss_3_0= ruleEquation ) )
            	    // InternalModelica.g:2472:5: (lv_equationss_3_0= ruleEquation )
            	    {
            	    // InternalModelica.g:2472:5: (lv_equationss_3_0= ruleEquation )
            	    // InternalModelica.g:2473:6: lv_equationss_3_0= ruleEquation
            	    {

            	    						newCompositeNode(grammarAccess.getEquationSectionAccess().getEquationssEquationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_equationss_3_0=ruleEquation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquationSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"equationss",
            	    							lv_equationss_3_0,
            	    							"xmodelica.Modelica.Equation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FOLLOW_63); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEquationSectionAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquationSection"


    // $ANTLR start "entryRuleAlgorithmSection"
    // InternalModelica.g:2499:1: entryRuleAlgorithmSection returns [EObject current=null] : iv_ruleAlgorithmSection= ruleAlgorithmSection EOF ;
    public final EObject entryRuleAlgorithmSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmSection = null;


        try {
            // InternalModelica.g:2499:57: (iv_ruleAlgorithmSection= ruleAlgorithmSection EOF )
            // InternalModelica.g:2500:2: iv_ruleAlgorithmSection= ruleAlgorithmSection EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithmSection=ruleAlgorithmSection();

            state._fsp--;

             current =iv_ruleAlgorithmSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgorithmSection"


    // $ANTLR start "ruleAlgorithmSection"
    // InternalModelica.g:2506:1: ruleAlgorithmSection returns [EObject current=null] : ( () (otherlv_1= 'initial' )? otherlv_2= 'algorithm' ( ( (lv_statements_3_0= ruleStatement ) ) otherlv_4= ';' )* ) ;
    public final EObject ruleAlgorithmSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2512:2: ( ( () (otherlv_1= 'initial' )? otherlv_2= 'algorithm' ( ( (lv_statements_3_0= ruleStatement ) ) otherlv_4= ';' )* ) )
            // InternalModelica.g:2513:2: ( () (otherlv_1= 'initial' )? otherlv_2= 'algorithm' ( ( (lv_statements_3_0= ruleStatement ) ) otherlv_4= ';' )* )
            {
            // InternalModelica.g:2513:2: ( () (otherlv_1= 'initial' )? otherlv_2= 'algorithm' ( ( (lv_statements_3_0= ruleStatement ) ) otherlv_4= ';' )* )
            // InternalModelica.g:2514:3: () (otherlv_1= 'initial' )? otherlv_2= 'algorithm' ( ( (lv_statements_3_0= ruleStatement ) ) otherlv_4= ';' )*
            {
            // InternalModelica.g:2514:3: ()
            // InternalModelica.g:2515:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlgorithmSectionAccess().getAlgorithmSectionAction_0(),
            					current);
            			

            }

            // InternalModelica.g:2521:3: (otherlv_1= 'initial' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==63) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalModelica.g:2522:4: otherlv_1= 'initial'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_64); 

                    				newLeafNode(otherlv_1, grammarAccess.getAlgorithmSectionAccess().getInitialKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,65,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmSectionAccess().getAlgorithmKeyword_2());
            		
            // InternalModelica.g:2531:3: ( ( (lv_statements_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_IDENT||LA68_0==38||LA68_0==61||(LA68_0>=66 && LA68_0<=67)||LA68_0==71||(LA68_0>=74 && LA68_0<=75)||LA68_0==97) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalModelica.g:2532:4: ( (lv_statements_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:2532:4: ( (lv_statements_3_0= ruleStatement ) )
            	    // InternalModelica.g:2533:5: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:2533:5: (lv_statements_3_0= ruleStatement )
            	    // InternalModelica.g:2534:6: lv_statements_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getAlgorithmSectionAccess().getStatementsStatementParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAlgorithmSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_3_0,
            	    							"xmodelica.Modelica.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FOLLOW_65); 

            	    				newLeafNode(otherlv_4, grammarAccess.getAlgorithmSectionAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithmSection"


    // $ANTLR start "entryRuleEquation"
    // InternalModelica.g:2560:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalModelica.g:2560:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalModelica.g:2561:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalModelica.g:2567:1: ruleEquation returns [EObject current=null] : ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) ( (lv_commment_3_0= ruleComment ) ) ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_commment_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2573:2: ( ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) ( (lv_commment_3_0= ruleComment ) ) ) )
            // InternalModelica.g:2574:2: ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) ( (lv_commment_3_0= ruleComment ) ) )
            {
            // InternalModelica.g:2574:2: ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) ( (lv_commment_3_0= ruleComment ) ) )
            // InternalModelica.g:2575:3: ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) ( (lv_commment_3_0= ruleComment ) )
            {
            // InternalModelica.g:2575:3: ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) )
            // InternalModelica.g:2576:4: ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) )
            {
            // InternalModelica.g:2576:4: ( (lv_left_0_0= ruleSimpleExpression ) )
            // InternalModelica.g:2577:5: (lv_left_0_0= ruleSimpleExpression )
            {
            // InternalModelica.g:2577:5: (lv_left_0_0= ruleSimpleExpression )
            // InternalModelica.g:2578:6: lv_left_0_0= ruleSimpleExpression
            {

            						newCompositeNode(grammarAccess.getEquationAccess().getLeftSimpleExpressionParserRuleCall_0_0_0());
            					
            pushFollow(FOLLOW_16);
            lv_left_0_0=ruleSimpleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEquationRule());
            						}
            						set(
            							current,
            							"left",
            							lv_left_0_0,
            							"xmodelica.Modelica.SimpleExpression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_50); 

            				newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_0_1());
            			
            // InternalModelica.g:2599:4: ( (lv_right_2_0= ruleExpression ) )
            // InternalModelica.g:2600:5: (lv_right_2_0= ruleExpression )
            {
            // InternalModelica.g:2600:5: (lv_right_2_0= ruleExpression )
            // InternalModelica.g:2601:6: lv_right_2_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getEquationAccess().getRightExpressionParserRuleCall_0_2_0());
            					
            pushFollow(FOLLOW_28);
            lv_right_2_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEquationRule());
            						}
            						set(
            							current,
            							"right",
            							lv_right_2_0,
            							"xmodelica.Modelica.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalModelica.g:2619:3: ( (lv_commment_3_0= ruleComment ) )
            // InternalModelica.g:2620:4: (lv_commment_3_0= ruleComment )
            {
            // InternalModelica.g:2620:4: (lv_commment_3_0= ruleComment )
            // InternalModelica.g:2621:5: lv_commment_3_0= ruleComment
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getCommmentCommentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_commment_3_0=ruleComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquationRule());
            					}
            					set(
            						current,
            						"commment",
            						lv_commment_3_0,
            						"xmodelica.Modelica.Comment");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleStatement"
    // InternalModelica.g:2642:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalModelica.g:2642:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalModelica.g:2643:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalModelica.g:2649:1: ruleStatement returns [EObject current=null] : ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_1 = null;

        EObject lv_right_2_2 = null;

        EObject lv_left_4_0 = null;

        EObject lv_ref_7_0 = null;

        EObject lv_ref_call_8_0 = null;

        EObject this_IfStatement_11 = null;

        EObject this_ForStatement_12 = null;

        EObject this_WhileStatement_13 = null;

        EObject this_WhenStatement_14 = null;

        EObject lv_comment_15_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2655:2: ( ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) ) )
            // InternalModelica.g:2656:2: ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) )
            {
            // InternalModelica.g:2656:2: ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) )
            // InternalModelica.g:2657:3: ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) )
            {
            // InternalModelica.g:2657:3: ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement )
            int alt70=8;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case 97:
                {
                alt70=1;
                }
                break;
            case 38:
                {
                alt70=2;
                }
                break;
            case 66:
                {
                alt70=3;
                }
                break;
            case 67:
                {
                alt70=4;
                }
                break;
            case 61:
                {
                alt70=5;
                }
                break;
            case 71:
                {
                alt70=6;
                }
                break;
            case 74:
                {
                alt70=7;
                }
                break;
            case 75:
                {
                alt70=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalModelica.g:2658:4: ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) )
                    {
                    // InternalModelica.g:2658:4: ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) )
                    // InternalModelica.g:2659:5: ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) )
                    {
                    // InternalModelica.g:2659:5: ( (lv_left_0_0= ruleComponentReference ) )
                    // InternalModelica.g:2660:6: (lv_left_0_0= ruleComponentReference )
                    {
                    // InternalModelica.g:2660:6: (lv_left_0_0= ruleComponentReference )
                    // InternalModelica.g:2661:7: lv_left_0_0= ruleComponentReference
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getLeftComponentReferenceParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_66);
                    lv_left_0_0=ruleComponentReference();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStatementRule());
                    							}
                    							set(
                    								current,
                    								"left",
                    								lv_left_0_0,
                    								"xmodelica.Modelica.ComponentReference");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalModelica.g:2678:5: (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) )
                    // InternalModelica.g:2679:6: otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) )
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_67); 

                    						newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_0_1_0());
                    					
                    // InternalModelica.g:2683:6: ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) )
                    // InternalModelica.g:2684:7: ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) )
                    {
                    // InternalModelica.g:2684:7: ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) )
                    // InternalModelica.g:2685:8: (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs )
                    {
                    // InternalModelica.g:2685:8: (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==61||LA69_0==79) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==38) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalModelica.g:2686:9: lv_right_2_1= ruleExpression
                            {

                            									newCompositeNode(grammarAccess.getStatementAccess().getRightExpressionParserRuleCall_0_0_1_1_0_0());
                            								
                            pushFollow(FOLLOW_28);
                            lv_right_2_1=ruleExpression();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getStatementRule());
                            									}
                            									set(
                            										current,
                            										"right",
                            										lv_right_2_1,
                            										"xmodelica.Modelica.Expression");
                            									afterParserOrEnumRuleCall();
                            								

                            }
                            break;
                        case 2 :
                            // InternalModelica.g:2702:9: lv_right_2_2= ruleFunctionCallArgs
                            {

                            									newCompositeNode(grammarAccess.getStatementAccess().getRightFunctionCallArgsParserRuleCall_0_0_1_1_0_1());
                            								
                            pushFollow(FOLLOW_28);
                            lv_right_2_2=ruleFunctionCallArgs();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getStatementRule());
                            									}
                            									set(
                            										current,
                            										"right",
                            										lv_right_2_2,
                            										"xmodelica.Modelica.FunctionCallArgs");
                            									afterParserOrEnumRuleCall();
                            								

                            }
                            break;

                    }


                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:2723:4: (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) )
                    {
                    // InternalModelica.g:2723:4: (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) )
                    // InternalModelica.g:2724:5: otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_68); 

                    					newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_0_1_0());
                    				
                    // InternalModelica.g:2728:5: ( (lv_left_4_0= ruleOutputExpressionList ) )
                    // InternalModelica.g:2729:6: (lv_left_4_0= ruleOutputExpressionList )
                    {
                    // InternalModelica.g:2729:6: (lv_left_4_0= ruleOutputExpressionList )
                    // InternalModelica.g:2730:7: lv_left_4_0= ruleOutputExpressionList
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getLeftOutputExpressionListParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_left_4_0=ruleOutputExpressionList();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStatementRule());
                    							}
                    							set(
                    								current,
                    								"left",
                    								lv_left_4_0,
                    								"xmodelica.Modelica.OutputExpressionList");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,40,FOLLOW_66); 

                    					newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getRightParenthesisKeyword_0_1_2());
                    				
                    otherlv_6=(Token)match(input,62,FOLLOW_18); 

                    					newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_1_3());
                    				
                    // InternalModelica.g:2755:5: ( (lv_ref_7_0= ruleComponentReference ) )
                    // InternalModelica.g:2756:6: (lv_ref_7_0= ruleComponentReference )
                    {
                    // InternalModelica.g:2756:6: (lv_ref_7_0= ruleComponentReference )
                    // InternalModelica.g:2757:7: lv_ref_7_0= ruleComponentReference
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getRefComponentReferenceParserRuleCall_0_1_4_0());
                    						
                    pushFollow(FOLLOW_67);
                    lv_ref_7_0=ruleComponentReference();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStatementRule());
                    							}
                    							set(
                    								current,
                    								"ref",
                    								lv_ref_7_0,
                    								"xmodelica.Modelica.ComponentReference");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalModelica.g:2774:5: ( (lv_ref_call_8_0= ruleFunctionCallArgs ) )
                    // InternalModelica.g:2775:6: (lv_ref_call_8_0= ruleFunctionCallArgs )
                    {
                    // InternalModelica.g:2775:6: (lv_ref_call_8_0= ruleFunctionCallArgs )
                    // InternalModelica.g:2776:7: lv_ref_call_8_0= ruleFunctionCallArgs
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getRef_callFunctionCallArgsParserRuleCall_0_1_5_0());
                    						
                    pushFollow(FOLLOW_28);
                    lv_ref_call_8_0=ruleFunctionCallArgs();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStatementRule());
                    							}
                    							set(
                    								current,
                    								"ref_call",
                    								lv_ref_call_8_0,
                    								"xmodelica.Modelica.FunctionCallArgs");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalModelica.g:2795:4: otherlv_9= 'break'
                    {
                    otherlv_9=(Token)match(input,66,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getBreakKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalModelica.g:2800:4: otherlv_10= 'return'
                    {
                    otherlv_10=(Token)match(input,67,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getReturnKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalModelica.g:2805:4: this_IfStatement_11= ruleIfStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_28);
                    this_IfStatement_11=ruleIfStatement();

                    state._fsp--;


                    				current = this_IfStatement_11;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalModelica.g:2814:4: this_ForStatement_12= ruleForStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_28);
                    this_ForStatement_12=ruleForStatement();

                    state._fsp--;


                    				current = this_ForStatement_12;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalModelica.g:2823:4: this_WhileStatement_13= ruleWhileStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_28);
                    this_WhileStatement_13=ruleWhileStatement();

                    state._fsp--;


                    				current = this_WhileStatement_13;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalModelica.g:2832:4: this_WhenStatement_14= ruleWhenStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getWhenStatementParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_28);
                    this_WhenStatement_14=ruleWhenStatement();

                    state._fsp--;


                    				current = this_WhenStatement_14;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalModelica.g:2841:3: ( (lv_comment_15_0= ruleComment ) )
            // InternalModelica.g:2842:4: (lv_comment_15_0= ruleComment )
            {
            // InternalModelica.g:2842:4: (lv_comment_15_0= ruleComment )
            // InternalModelica.g:2843:5: lv_comment_15_0= ruleComment
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getCommentCommentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_comment_15_0=ruleComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_15_0,
            						"xmodelica.Modelica.Comment");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalModelica.g:2864:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalModelica.g:2864:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalModelica.g:2865:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalModelica.g:2871:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_if_expr_1_0 = null;

        EObject lv_if_stmts_3_0 = null;

        EObject lv_elseif_exprs_6_0 = null;

        EObject lv_elseif_stmts_8_0 = null;

        EObject lv_else_stmts_11_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2877:2: ( (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' ) )
            // InternalModelica.g:2878:2: (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' )
            {
            // InternalModelica.g:2878:2: (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' )
            // InternalModelica.g:2879:3: otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalModelica.g:2883:3: ( (lv_if_expr_1_0= ruleExpression ) )
            // InternalModelica.g:2884:4: (lv_if_expr_1_0= ruleExpression )
            {
            // InternalModelica.g:2884:4: (lv_if_expr_1_0= ruleExpression )
            // InternalModelica.g:2885:5: lv_if_expr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getIf_exprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_69);
            lv_if_expr_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"if_expr",
            						lv_if_expr_1_0,
            						"xmodelica.Modelica.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getThenKeyword_2());
            		
            // InternalModelica.g:2906:3: ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_IDENT||LA71_0==38||LA71_0==61||(LA71_0>=66 && LA71_0<=67)||LA71_0==71||(LA71_0>=74 && LA71_0<=75)||LA71_0==97) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalModelica.g:2907:4: ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:2907:4: ( (lv_if_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:2908:5: (lv_if_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:2908:5: (lv_if_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:2909:6: lv_if_stmts_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getIfStatementAccess().getIf_stmtsStatementParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_if_stmts_3_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"if_stmts",
            	    							lv_if_stmts_3_0,
            	    							"xmodelica.Modelica.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FOLLOW_70); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            // InternalModelica.g:2931:3: (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==69) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalModelica.g:2932:4: otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )*
            	    {
            	    otherlv_5=(Token)match(input,69,FOLLOW_50); 

            	    				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseifKeyword_4_0());
            	    			
            	    // InternalModelica.g:2936:4: ( (lv_elseif_exprs_6_0= ruleExpression ) )
            	    // InternalModelica.g:2937:5: (lv_elseif_exprs_6_0= ruleExpression )
            	    {
            	    // InternalModelica.g:2937:5: (lv_elseif_exprs_6_0= ruleExpression )
            	    // InternalModelica.g:2938:6: lv_elseif_exprs_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getIfStatementAccess().getElseif_exprsExpressionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_69);
            	    lv_elseif_exprs_6_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elseif_exprs",
            	    							lv_elseif_exprs_6_0,
            	    							"xmodelica.Modelica.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,68,FOLLOW_70); 

            	    				newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getThenKeyword_4_2());
            	    			
            	    // InternalModelica.g:2959:4: ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )*
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==RULE_IDENT||LA72_0==38||LA72_0==61||(LA72_0>=66 && LA72_0<=67)||LA72_0==71||(LA72_0>=74 && LA72_0<=75)||LA72_0==97) ) {
            	            alt72=1;
            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // InternalModelica.g:2960:5: ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';'
            	    	    {
            	    	    // InternalModelica.g:2960:5: ( (lv_elseif_stmts_8_0= ruleStatement ) )
            	    	    // InternalModelica.g:2961:6: (lv_elseif_stmts_8_0= ruleStatement )
            	    	    {
            	    	    // InternalModelica.g:2961:6: (lv_elseif_stmts_8_0= ruleStatement )
            	    	    // InternalModelica.g:2962:7: lv_elseif_stmts_8_0= ruleStatement
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getIfStatementAccess().getElseif_stmtsStatementParserRuleCall_4_3_0_0());
            	    	    						
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_elseif_stmts_8_0=ruleStatement();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"elseif_stmts",
            	    	    								lv_elseif_stmts_8_0,
            	    	    								"xmodelica.Modelica.Statement");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }

            	    	    otherlv_9=(Token)match(input,19,FOLLOW_70); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getIfStatementAccess().getSemicolonKeyword_4_3_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop72;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // InternalModelica.g:2985:3: (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==70) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalModelica.g:2986:4: otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )*
                    {
                    otherlv_10=(Token)match(input,70,FOLLOW_71); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                    			
                    // InternalModelica.g:2990:4: ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==RULE_IDENT||LA74_0==38||LA74_0==61||(LA74_0>=66 && LA74_0<=67)||LA74_0==71||(LA74_0>=74 && LA74_0<=75)||LA74_0==97) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalModelica.g:2991:5: ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';'
                    	    {
                    	    // InternalModelica.g:2991:5: ( (lv_else_stmts_11_0= ruleStatement ) )
                    	    // InternalModelica.g:2992:6: (lv_else_stmts_11_0= ruleStatement )
                    	    {
                    	    // InternalModelica.g:2992:6: (lv_else_stmts_11_0= ruleStatement )
                    	    // InternalModelica.g:2993:7: lv_else_stmts_11_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfStatementAccess().getElse_stmtsStatementParserRuleCall_5_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_else_stmts_11_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"else_stmts",
                    	    								lv_else_stmts_11_0,
                    	    								"xmodelica.Modelica.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,19,FOLLOW_71); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getIfStatementAccess().getSemicolonKeyword_5_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,35,FOLLOW_72); 

            			newLeafNode(otherlv_13, grammarAccess.getIfStatementAccess().getEndKeyword_6());
            		
            otherlv_14=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getIfStatementAccess().getIfKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalModelica.g:3028:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalModelica.g:3028:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalModelica.g:3029:2: iv_ruleForStatement= ruleForStatement EOF
            {
             newCompositeNode(grammarAccess.getForStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;

             current =iv_ruleForStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalModelica.g:3035:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_indices_1_0 = null;

        EObject lv_stmts_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3041:2: ( (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' ) )
            // InternalModelica.g:3042:2: (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' )
            {
            // InternalModelica.g:3042:2: (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' )
            // InternalModelica.g:3043:3: otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
            		
            // InternalModelica.g:3047:3: ( (lv_indices_1_0= ruleForIndices ) )
            // InternalModelica.g:3048:4: (lv_indices_1_0= ruleForIndices )
            {
            // InternalModelica.g:3048:4: (lv_indices_1_0= ruleForIndices )
            // InternalModelica.g:3049:5: lv_indices_1_0= ruleForIndices
            {

            					newCompositeNode(grammarAccess.getForStatementAccess().getIndicesForIndicesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_73);
            lv_indices_1_0=ruleForIndices();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStatementRule());
            					}
            					set(
            						current,
            						"indices",
            						lv_indices_1_0,
            						"xmodelica.Modelica.ForIndices");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,72,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getLoopKeyword_2());
            		
            // InternalModelica.g:3070:3: ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_IDENT||LA76_0==38||LA76_0==61||(LA76_0>=66 && LA76_0<=67)||LA76_0==71||(LA76_0>=74 && LA76_0<=75)||LA76_0==97) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalModelica.g:3071:4: ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3071:4: ( (lv_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:3072:5: (lv_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:3072:5: (lv_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:3073:6: lv_stmts_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getForStatementAccess().getStmtsStatementParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_stmts_3_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getForStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stmts",
            	    							lv_stmts_3_0,
            	    							"xmodelica.Modelica.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FOLLOW_71); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_74); 

            			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getEndKeyword_4());
            		
            otherlv_6=(Token)match(input,71,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForStatementAccess().getForKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleForIndices"
    // InternalModelica.g:3107:1: entryRuleForIndices returns [EObject current=null] : iv_ruleForIndices= ruleForIndices EOF ;
    public final EObject entryRuleForIndices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIndices = null;


        try {
            // InternalModelica.g:3107:51: (iv_ruleForIndices= ruleForIndices EOF )
            // InternalModelica.g:3108:2: iv_ruleForIndices= ruleForIndices EOF
            {
             newCompositeNode(grammarAccess.getForIndicesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForIndices=ruleForIndices();

            state._fsp--;

             current =iv_ruleForIndices; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForIndices"


    // $ANTLR start "ruleForIndices"
    // InternalModelica.g:3114:1: ruleForIndices returns [EObject current=null] : ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* ) ;
    public final EObject ruleForIndices() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_indices_0_0 = null;

        EObject lv_indices_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3120:2: ( ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* ) )
            // InternalModelica.g:3121:2: ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* )
            {
            // InternalModelica.g:3121:2: ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* )
            // InternalModelica.g:3122:3: ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )*
            {
            // InternalModelica.g:3122:3: ( (lv_indices_0_0= ruleForIndex ) )
            // InternalModelica.g:3123:4: (lv_indices_0_0= ruleForIndex )
            {
            // InternalModelica.g:3123:4: (lv_indices_0_0= ruleForIndex )
            // InternalModelica.g:3124:5: lv_indices_0_0= ruleForIndex
            {

            					newCompositeNode(grammarAccess.getForIndicesAccess().getIndicesForIndexParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_indices_0_0=ruleForIndex();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForIndicesRule());
            					}
            					add(
            						current,
            						"indices",
            						lv_indices_0_0,
            						"xmodelica.Modelica.ForIndex");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:3141:3: (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==42) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalModelica.g:3142:4: otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getForIndicesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:3146:4: ( (lv_indices_2_0= ruleForIndex ) )
            	    // InternalModelica.g:3147:5: (lv_indices_2_0= ruleForIndex )
            	    {
            	    // InternalModelica.g:3147:5: (lv_indices_2_0= ruleForIndex )
            	    // InternalModelica.g:3148:6: lv_indices_2_0= ruleForIndex
            	    {

            	    						newCompositeNode(grammarAccess.getForIndicesAccess().getIndicesForIndexParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_indices_2_0=ruleForIndex();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getForIndicesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"indices",
            	    							lv_indices_2_0,
            	    							"xmodelica.Modelica.ForIndex");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForIndices"


    // $ANTLR start "entryRuleForIndex"
    // InternalModelica.g:3170:1: entryRuleForIndex returns [EObject current=null] : iv_ruleForIndex= ruleForIndex EOF ;
    public final EObject entryRuleForIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIndex = null;


        try {
            // InternalModelica.g:3170:49: (iv_ruleForIndex= ruleForIndex EOF )
            // InternalModelica.g:3171:2: iv_ruleForIndex= ruleForIndex EOF
            {
             newCompositeNode(grammarAccess.getForIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForIndex=ruleForIndex();

            state._fsp--;

             current =iv_ruleForIndex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForIndex"


    // $ANTLR start "ruleForIndex"
    // InternalModelica.g:3177:1: ruleForIndex returns [EObject current=null] : (this_IDENT_0= RULE_IDENT (otherlv_1= 'in' this_Expression_2= ruleExpression ) ) ;
    public final EObject ruleForIndex() throws RecognitionException {
        EObject current = null;

        Token this_IDENT_0=null;
        Token otherlv_1=null;
        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalModelica.g:3183:2: ( (this_IDENT_0= RULE_IDENT (otherlv_1= 'in' this_Expression_2= ruleExpression ) ) )
            // InternalModelica.g:3184:2: (this_IDENT_0= RULE_IDENT (otherlv_1= 'in' this_Expression_2= ruleExpression ) )
            {
            // InternalModelica.g:3184:2: (this_IDENT_0= RULE_IDENT (otherlv_1= 'in' this_Expression_2= ruleExpression ) )
            // InternalModelica.g:3185:3: this_IDENT_0= RULE_IDENT (otherlv_1= 'in' this_Expression_2= ruleExpression )
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_75); 

            			newLeafNode(this_IDENT_0, grammarAccess.getForIndexAccess().getIDENTTerminalRuleCall_0());
            		
            // InternalModelica.g:3189:3: (otherlv_1= 'in' this_Expression_2= ruleExpression )
            // InternalModelica.g:3190:4: otherlv_1= 'in' this_Expression_2= ruleExpression
            {
            otherlv_1=(Token)match(input,73,FOLLOW_50); 

            				newLeafNode(otherlv_1, grammarAccess.getForIndexAccess().getInKeyword_1_0());
            			

            				newCompositeNode(grammarAccess.getForIndexAccess().getExpressionParserRuleCall_1_1());
            			
            pushFollow(FOLLOW_2);
            this_Expression_2=ruleExpression();

            state._fsp--;


            				current = this_Expression_2;
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForIndex"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalModelica.g:3207:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalModelica.g:3207:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalModelica.g:3208:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalModelica.g:3214:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_cond_1_0 = null;

        EObject lv_stmts_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3220:2: ( (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' ) )
            // InternalModelica.g:3221:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' )
            {
            // InternalModelica.g:3221:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' )
            // InternalModelica.g:3222:3: otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
            		
            // InternalModelica.g:3226:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalModelica.g:3227:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalModelica.g:3227:4: (lv_cond_1_0= ruleExpression )
            // InternalModelica.g:3228:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_73);
            lv_cond_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"xmodelica.Modelica.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,72,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLoopKeyword_2());
            		
            // InternalModelica.g:3249:3: ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_IDENT||LA78_0==38||LA78_0==61||(LA78_0>=66 && LA78_0<=67)||LA78_0==71||(LA78_0>=74 && LA78_0<=75)||LA78_0==97) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalModelica.g:3250:4: ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3250:4: ( (lv_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:3251:5: (lv_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:3251:5: (lv_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:3252:6: lv_stmts_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getWhileStatementAccess().getStmtsStatementParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_stmts_3_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stmts",
            	    							lv_stmts_3_0,
            	    							"xmodelica.Modelica.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FOLLOW_71); 

            	    				newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_76); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileStatementAccess().getEndKeyword_4());
            		
            otherlv_6=(Token)match(input,74,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileStatementAccess().getWhileKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleWhenStatement"
    // InternalModelica.g:3286:1: entryRuleWhenStatement returns [EObject current=null] : iv_ruleWhenStatement= ruleWhenStatement EOF ;
    public final EObject entryRuleWhenStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenStatement = null;


        try {
            // InternalModelica.g:3286:54: (iv_ruleWhenStatement= ruleWhenStatement EOF )
            // InternalModelica.g:3287:2: iv_ruleWhenStatement= ruleWhenStatement EOF
            {
             newCompositeNode(grammarAccess.getWhenStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhenStatement=ruleWhenStatement();

            state._fsp--;

             current =iv_ruleWhenStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenStatement"


    // $ANTLR start "ruleWhenStatement"
    // InternalModelica.g:3293:1: ruleWhenStatement returns [EObject current=null] : (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) ) ) ;
    public final EObject ruleWhenStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_when_1_0 = null;

        EObject lv_when_stmts_3_0 = null;

        EObject lv_elsehwhen_6_0 = null;

        EObject lv_elsewhen_stmts_8_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3299:2: ( (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) ) ) )
            // InternalModelica.g:3300:2: (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) ) )
            {
            // InternalModelica.g:3300:2: (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) ) )
            // InternalModelica.g:3301:3: otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenStatementAccess().getWhenKeyword_0());
            		
            // InternalModelica.g:3305:3: ( (lv_when_1_0= ruleExpression ) )
            // InternalModelica.g:3306:4: (lv_when_1_0= ruleExpression )
            {
            // InternalModelica.g:3306:4: (lv_when_1_0= ruleExpression )
            // InternalModelica.g:3307:5: lv_when_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhenStatementAccess().getWhenExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_69);
            lv_when_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenStatementRule());
            					}
            					set(
            						current,
            						"when",
            						lv_when_1_0,
            						"xmodelica.Modelica.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getWhenStatementAccess().getThenKeyword_2());
            		
            // InternalModelica.g:3328:3: ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_IDENT||LA79_0==38||LA79_0==61||(LA79_0>=66 && LA79_0<=67)||LA79_0==71||(LA79_0>=74 && LA79_0<=75)||LA79_0==97) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalModelica.g:3329:4: ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3329:4: ( (lv_when_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:3330:5: (lv_when_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:3330:5: (lv_when_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:3331:6: lv_when_stmts_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getWhenStatementAccess().getWhen_stmtsStatementParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_when_stmts_3_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhenStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"when_stmts",
            	    							lv_when_stmts_3_0,
            	    							"xmodelica.Modelica.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FOLLOW_77); 

            	    				newLeafNode(otherlv_4, grammarAccess.getWhenStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalModelica.g:3353:3: (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) )
            // InternalModelica.g:3354:4: otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )
            {
            otherlv_5=(Token)match(input,76,FOLLOW_50); 

            				newLeafNode(otherlv_5, grammarAccess.getWhenStatementAccess().getElsewhenKeyword_4_0());
            			
            // InternalModelica.g:3358:4: ( (lv_elsehwhen_6_0= ruleExpression ) )
            // InternalModelica.g:3359:5: (lv_elsehwhen_6_0= ruleExpression )
            {
            // InternalModelica.g:3359:5: (lv_elsehwhen_6_0= ruleExpression )
            // InternalModelica.g:3360:6: lv_elsehwhen_6_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getWhenStatementAccess().getElsehwhenExpressionParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_69);
            lv_elsehwhen_6_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getWhenStatementRule());
            						}
            						set(
            							current,
            							"elsehwhen",
            							lv_elsehwhen_6_0,
            							"xmodelica.Modelica.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_7=(Token)match(input,68,FOLLOW_78); 

            				newLeafNode(otherlv_7, grammarAccess.getWhenStatementAccess().getThenKeyword_4_2());
            			
            // InternalModelica.g:3381:4: ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )
            // InternalModelica.g:3382:5: ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';'
            {
            // InternalModelica.g:3382:5: ( (lv_elsewhen_stmts_8_0= ruleStatement ) )
            // InternalModelica.g:3383:6: (lv_elsewhen_stmts_8_0= ruleStatement )
            {
            // InternalModelica.g:3383:6: (lv_elsewhen_stmts_8_0= ruleStatement )
            // InternalModelica.g:3384:7: lv_elsewhen_stmts_8_0= ruleStatement
            {

            							newCompositeNode(grammarAccess.getWhenStatementAccess().getElsewhen_stmtsStatementParserRuleCall_4_3_0_0());
            						
            pushFollow(FOLLOW_4);
            lv_elsewhen_stmts_8_0=ruleStatement();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getWhenStatementRule());
            							}
            							add(
            								current,
            								"elsewhen_stmts",
            								lv_elsewhen_stmts_8_0,
            								"xmodelica.Modelica.Statement");
            							afterParserOrEnumRuleCall();
            						

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getWhenStatementAccess().getSemicolonKeyword_4_3_1());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalModelica.g:3411:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalModelica.g:3411:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalModelica.g:3412:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalModelica.g:3418:1: ruleExpression returns [EObject current=null] : (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_SimpleExpression_0 = null;

        EObject lv_if_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_elseif_6_0 = null;

        EObject lv_elseifthen_8_0 = null;

        EObject lv_else_10_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3424:2: ( (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) ) )
            // InternalModelica.g:3425:2: (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) )
            {
            // InternalModelica.g:3425:2: (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==79) ) {
                alt81=1;
            }
            else if ( (LA81_0==61) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalModelica.g:3426:3: this_SimpleExpression_0= ruleSimpleExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleExpression_0=ruleSimpleExpression();

                    state._fsp--;


                    			current = this_SimpleExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:3435:3: (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:3435:3: (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) )
                    // InternalModelica.g:3436:4: otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_50); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getIfKeyword_1_0());
                    			
                    // InternalModelica.g:3440:4: ( (lv_if_2_0= ruleExpression ) )
                    // InternalModelica.g:3441:5: (lv_if_2_0= ruleExpression )
                    {
                    // InternalModelica.g:3441:5: (lv_if_2_0= ruleExpression )
                    // InternalModelica.g:3442:6: lv_if_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getIfExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_if_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"if",
                    							lv_if_2_0,
                    							"xmodelica.Modelica.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,68,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getThenKeyword_1_2());
                    			
                    // InternalModelica.g:3463:4: ( (lv_then_4_0= ruleExpression ) )
                    // InternalModelica.g:3464:5: (lv_then_4_0= ruleExpression )
                    {
                    // InternalModelica.g:3464:5: (lv_then_4_0= ruleExpression )
                    // InternalModelica.g:3465:6: lv_then_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_then_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"then",
                    							lv_then_4_0,
                    							"xmodelica.Modelica.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:3482:4: (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==69) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalModelica.g:3483:5: otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,69,FOLLOW_50); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getElseifKeyword_1_4_0());
                    	    				
                    	    // InternalModelica.g:3487:5: ( (lv_elseif_6_0= ruleExpression ) )
                    	    // InternalModelica.g:3488:6: (lv_elseif_6_0= ruleExpression )
                    	    {
                    	    // InternalModelica.g:3488:6: (lv_elseif_6_0= ruleExpression )
                    	    // InternalModelica.g:3489:7: lv_elseif_6_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getElseifExpressionParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_69);
                    	    lv_elseif_6_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elseif",
                    	    								lv_elseif_6_0,
                    	    								"xmodelica.Modelica.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,68,FOLLOW_50); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getThenKeyword_1_4_2());
                    	    				
                    	    // InternalModelica.g:3510:5: ( (lv_elseifthen_8_0= ruleExpression ) )
                    	    // InternalModelica.g:3511:6: (lv_elseifthen_8_0= ruleExpression )
                    	    {
                    	    // InternalModelica.g:3511:6: (lv_elseifthen_8_0= ruleExpression )
                    	    // InternalModelica.g:3512:7: lv_elseifthen_8_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getElseifthenExpressionParserRuleCall_1_4_3_0());
                    	    						
                    	    pushFollow(FOLLOW_79);
                    	    lv_elseifthen_8_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elseifthen",
                    	    								lv_elseifthen_8_0,
                    	    								"xmodelica.Modelica.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,70,FOLLOW_50); 

                    				newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getElseKeyword_1_5());
                    			
                    // InternalModelica.g:3534:4: ( (lv_else_10_0= ruleExpression ) )
                    // InternalModelica.g:3535:5: (lv_else_10_0= ruleExpression )
                    {
                    // InternalModelica.g:3535:5: (lv_else_10_0= ruleExpression )
                    // InternalModelica.g:3536:6: lv_else_10_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getElseExpressionParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_else_10_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						add(
                    							current,
                    							"else",
                    							lv_else_10_0,
                    							"xmodelica.Modelica.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSimpleExpression"
    // InternalModelica.g:3558:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // InternalModelica.g:3558:57: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // InternalModelica.g:3559:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;

             current =iv_ruleSimpleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // InternalModelica.g:3565:1: ruleSimpleExpression returns [EObject current=null] : ( ( (lv_exprs_0_0= ruleLogicalExpression ) ) (otherlv_1= ':' ( (lv_exprs_2_0= ruleLogicalExpression ) ) (otherlv_3= ':' ( (lv_exprs_4_0= ruleLogicalExpression ) ) )? )? ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exprs_0_0 = null;

        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3571:2: ( ( ( (lv_exprs_0_0= ruleLogicalExpression ) ) (otherlv_1= ':' ( (lv_exprs_2_0= ruleLogicalExpression ) ) (otherlv_3= ':' ( (lv_exprs_4_0= ruleLogicalExpression ) ) )? )? ) )
            // InternalModelica.g:3572:2: ( ( (lv_exprs_0_0= ruleLogicalExpression ) ) (otherlv_1= ':' ( (lv_exprs_2_0= ruleLogicalExpression ) ) (otherlv_3= ':' ( (lv_exprs_4_0= ruleLogicalExpression ) ) )? )? )
            {
            // InternalModelica.g:3572:2: ( ( (lv_exprs_0_0= ruleLogicalExpression ) ) (otherlv_1= ':' ( (lv_exprs_2_0= ruleLogicalExpression ) ) (otherlv_3= ':' ( (lv_exprs_4_0= ruleLogicalExpression ) ) )? )? )
            // InternalModelica.g:3573:3: ( (lv_exprs_0_0= ruleLogicalExpression ) ) (otherlv_1= ':' ( (lv_exprs_2_0= ruleLogicalExpression ) ) (otherlv_3= ':' ( (lv_exprs_4_0= ruleLogicalExpression ) ) )? )?
            {
            // InternalModelica.g:3573:3: ( (lv_exprs_0_0= ruleLogicalExpression ) )
            // InternalModelica.g:3574:4: (lv_exprs_0_0= ruleLogicalExpression )
            {
            // InternalModelica.g:3574:4: (lv_exprs_0_0= ruleLogicalExpression )
            // InternalModelica.g:3575:5: lv_exprs_0_0= ruleLogicalExpression
            {

            					newCompositeNode(grammarAccess.getSimpleExpressionAccess().getExprsLogicalExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_80);
            lv_exprs_0_0=ruleLogicalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_0_0,
            						"xmodelica.Modelica.LogicalExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:3592:3: (otherlv_1= ':' ( (lv_exprs_2_0= ruleLogicalExpression ) ) (otherlv_3= ':' ( (lv_exprs_4_0= ruleLogicalExpression ) ) )? )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==39) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalModelica.g:3593:4: otherlv_1= ':' ( (lv_exprs_2_0= ruleLogicalExpression ) ) (otherlv_3= ':' ( (lv_exprs_4_0= ruleLogicalExpression ) ) )?
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_81); 

                    				newLeafNode(otherlv_1, grammarAccess.getSimpleExpressionAccess().getColonKeyword_1_0());
                    			
                    // InternalModelica.g:3597:4: ( (lv_exprs_2_0= ruleLogicalExpression ) )
                    // InternalModelica.g:3598:5: (lv_exprs_2_0= ruleLogicalExpression )
                    {
                    // InternalModelica.g:3598:5: (lv_exprs_2_0= ruleLogicalExpression )
                    // InternalModelica.g:3599:6: lv_exprs_2_0= ruleLogicalExpression
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpressionAccess().getExprsLogicalExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    lv_exprs_2_0=ruleLogicalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    						}
                    						add(
                    							current,
                    							"exprs",
                    							lv_exprs_2_0,
                    							"xmodelica.Modelica.LogicalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:3616:4: (otherlv_3= ':' ( (lv_exprs_4_0= ruleLogicalExpression ) ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==39) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalModelica.g:3617:5: otherlv_3= ':' ( (lv_exprs_4_0= ruleLogicalExpression ) )
                            {
                            otherlv_3=(Token)match(input,39,FOLLOW_81); 

                            					newLeafNode(otherlv_3, grammarAccess.getSimpleExpressionAccess().getColonKeyword_1_2_0());
                            				
                            // InternalModelica.g:3621:5: ( (lv_exprs_4_0= ruleLogicalExpression ) )
                            // InternalModelica.g:3622:6: (lv_exprs_4_0= ruleLogicalExpression )
                            {
                            // InternalModelica.g:3622:6: (lv_exprs_4_0= ruleLogicalExpression )
                            // InternalModelica.g:3623:7: lv_exprs_4_0= ruleLogicalExpression
                            {

                            							newCompositeNode(grammarAccess.getSimpleExpressionAccess().getExprsLogicalExpressionParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_exprs_4_0=ruleLogicalExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                            							}
                            							add(
                            								current,
                            								"exprs",
                            								lv_exprs_4_0,
                            								"xmodelica.Modelica.LogicalExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalModelica.g:3646:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalModelica.g:3646:58: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalModelica.g:3647:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;

             current =iv_ruleLogicalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // InternalModelica.g:3653:1: ruleLogicalExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleLogicalTerm ) ) (otherlv_1= 'or' ( (lv_terms_2_0= ruleLogicalTerm ) ) )* ) ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3659:2: ( ( ( (lv_terms_0_0= ruleLogicalTerm ) ) (otherlv_1= 'or' ( (lv_terms_2_0= ruleLogicalTerm ) ) )* ) )
            // InternalModelica.g:3660:2: ( ( (lv_terms_0_0= ruleLogicalTerm ) ) (otherlv_1= 'or' ( (lv_terms_2_0= ruleLogicalTerm ) ) )* )
            {
            // InternalModelica.g:3660:2: ( ( (lv_terms_0_0= ruleLogicalTerm ) ) (otherlv_1= 'or' ( (lv_terms_2_0= ruleLogicalTerm ) ) )* )
            // InternalModelica.g:3661:3: ( (lv_terms_0_0= ruleLogicalTerm ) ) (otherlv_1= 'or' ( (lv_terms_2_0= ruleLogicalTerm ) ) )*
            {
            // InternalModelica.g:3661:3: ( (lv_terms_0_0= ruleLogicalTerm ) )
            // InternalModelica.g:3662:4: (lv_terms_0_0= ruleLogicalTerm )
            {
            // InternalModelica.g:3662:4: (lv_terms_0_0= ruleLogicalTerm )
            // InternalModelica.g:3663:5: lv_terms_0_0= ruleLogicalTerm
            {

            					newCompositeNode(grammarAccess.getLogicalExpressionAccess().getTermsLogicalTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_82);
            lv_terms_0_0=ruleLogicalTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
            					}
            					add(
            						current,
            						"terms",
            						lv_terms_0_0,
            						"xmodelica.Modelica.LogicalTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:3680:3: (otherlv_1= 'or' ( (lv_terms_2_0= ruleLogicalTerm ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==77) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalModelica.g:3681:4: otherlv_1= 'or' ( (lv_terms_2_0= ruleLogicalTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,77,FOLLOW_81); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLogicalExpressionAccess().getOrKeyword_1_0());
            	    			
            	    // InternalModelica.g:3685:4: ( (lv_terms_2_0= ruleLogicalTerm ) )
            	    // InternalModelica.g:3686:5: (lv_terms_2_0= ruleLogicalTerm )
            	    {
            	    // InternalModelica.g:3686:5: (lv_terms_2_0= ruleLogicalTerm )
            	    // InternalModelica.g:3687:6: lv_terms_2_0= ruleLogicalTerm
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalExpressionAccess().getTermsLogicalTermParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_82);
            	    lv_terms_2_0=ruleLogicalTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terms",
            	    							lv_terms_2_0,
            	    							"xmodelica.Modelica.LogicalTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleLogicalTerm"
    // InternalModelica.g:3709:1: entryRuleLogicalTerm returns [EObject current=null] : iv_ruleLogicalTerm= ruleLogicalTerm EOF ;
    public final EObject entryRuleLogicalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalTerm = null;


        try {
            // InternalModelica.g:3709:52: (iv_ruleLogicalTerm= ruleLogicalTerm EOF )
            // InternalModelica.g:3710:2: iv_ruleLogicalTerm= ruleLogicalTerm EOF
            {
             newCompositeNode(grammarAccess.getLogicalTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalTerm=ruleLogicalTerm();

            state._fsp--;

             current =iv_ruleLogicalTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalTerm"


    // $ANTLR start "ruleLogicalTerm"
    // InternalModelica.g:3716:1: ruleLogicalTerm returns [EObject current=null] : ( ( (lv_factors_0_0= ruleLogicalFactor ) ) (otherlv_1= 'and' ( (lv_factors_2_0= ruleLogicalFactor ) ) )* ) ;
    public final EObject ruleLogicalTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3722:2: ( ( ( (lv_factors_0_0= ruleLogicalFactor ) ) (otherlv_1= 'and' ( (lv_factors_2_0= ruleLogicalFactor ) ) )* ) )
            // InternalModelica.g:3723:2: ( ( (lv_factors_0_0= ruleLogicalFactor ) ) (otherlv_1= 'and' ( (lv_factors_2_0= ruleLogicalFactor ) ) )* )
            {
            // InternalModelica.g:3723:2: ( ( (lv_factors_0_0= ruleLogicalFactor ) ) (otherlv_1= 'and' ( (lv_factors_2_0= ruleLogicalFactor ) ) )* )
            // InternalModelica.g:3724:3: ( (lv_factors_0_0= ruleLogicalFactor ) ) (otherlv_1= 'and' ( (lv_factors_2_0= ruleLogicalFactor ) ) )*
            {
            // InternalModelica.g:3724:3: ( (lv_factors_0_0= ruleLogicalFactor ) )
            // InternalModelica.g:3725:4: (lv_factors_0_0= ruleLogicalFactor )
            {
            // InternalModelica.g:3725:4: (lv_factors_0_0= ruleLogicalFactor )
            // InternalModelica.g:3726:5: lv_factors_0_0= ruleLogicalFactor
            {

            					newCompositeNode(grammarAccess.getLogicalTermAccess().getFactorsLogicalFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_83);
            lv_factors_0_0=ruleLogicalFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalTermRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_0_0,
            						"xmodelica.Modelica.LogicalFactor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:3743:3: (otherlv_1= 'and' ( (lv_factors_2_0= ruleLogicalFactor ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==78) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalModelica.g:3744:4: otherlv_1= 'and' ( (lv_factors_2_0= ruleLogicalFactor ) )
            	    {
            	    otherlv_1=(Token)match(input,78,FOLLOW_81); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLogicalTermAccess().getAndKeyword_1_0());
            	    			
            	    // InternalModelica.g:3748:4: ( (lv_factors_2_0= ruleLogicalFactor ) )
            	    // InternalModelica.g:3749:5: (lv_factors_2_0= ruleLogicalFactor )
            	    {
            	    // InternalModelica.g:3749:5: (lv_factors_2_0= ruleLogicalFactor )
            	    // InternalModelica.g:3750:6: lv_factors_2_0= ruleLogicalFactor
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalTermAccess().getFactorsLogicalFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_83);
            	    lv_factors_2_0=ruleLogicalFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factors",
            	    							lv_factors_2_0,
            	    							"xmodelica.Modelica.LogicalFactor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalTerm"


    // $ANTLR start "entryRuleLogicalFactor"
    // InternalModelica.g:3772:1: entryRuleLogicalFactor returns [EObject current=null] : iv_ruleLogicalFactor= ruleLogicalFactor EOF ;
    public final EObject entryRuleLogicalFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalFactor = null;


        try {
            // InternalModelica.g:3772:54: (iv_ruleLogicalFactor= ruleLogicalFactor EOF )
            // InternalModelica.g:3773:2: iv_ruleLogicalFactor= ruleLogicalFactor EOF
            {
             newCompositeNode(grammarAccess.getLogicalFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalFactor=ruleLogicalFactor();

            state._fsp--;

             current =iv_ruleLogicalFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalFactor"


    // $ANTLR start "ruleLogicalFactor"
    // InternalModelica.g:3779:1: ruleLogicalFactor returns [EObject current=null] : (otherlv_0= 'not' this_Relation_1= ruleRelation ) ;
    public final EObject ruleLogicalFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Relation_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:3785:2: ( (otherlv_0= 'not' this_Relation_1= ruleRelation ) )
            // InternalModelica.g:3786:2: (otherlv_0= 'not' this_Relation_1= ruleRelation )
            {
            // InternalModelica.g:3786:2: (otherlv_0= 'not' this_Relation_1= ruleRelation )
            // InternalModelica.g:3787:3: otherlv_0= 'not' this_Relation_1= ruleRelation
            {
            otherlv_0=(Token)match(input,79,FOLLOW_84); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalFactorAccess().getNotKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLogicalFactorAccess().getRelationParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Relation_1=ruleRelation();

            state._fsp--;


            			current = this_Relation_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalFactor"


    // $ANTLR start "entryRuleRelation"
    // InternalModelica.g:3803:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalModelica.g:3803:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalModelica.g:3804:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalModelica.g:3810:1: ruleRelation returns [EObject current=null] : ( ( (lv_left_0_0= ruleArithmeticExpression ) ) ( ( (lv_op_1_0= ruleRelOp ) ) ( (lv_right_2_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3816:2: ( ( ( (lv_left_0_0= ruleArithmeticExpression ) ) ( ( (lv_op_1_0= ruleRelOp ) ) ( (lv_right_2_0= ruleArithmeticExpression ) ) )? ) )
            // InternalModelica.g:3817:2: ( ( (lv_left_0_0= ruleArithmeticExpression ) ) ( ( (lv_op_1_0= ruleRelOp ) ) ( (lv_right_2_0= ruleArithmeticExpression ) ) )? )
            {
            // InternalModelica.g:3817:2: ( ( (lv_left_0_0= ruleArithmeticExpression ) ) ( ( (lv_op_1_0= ruleRelOp ) ) ( (lv_right_2_0= ruleArithmeticExpression ) ) )? )
            // InternalModelica.g:3818:3: ( (lv_left_0_0= ruleArithmeticExpression ) ) ( ( (lv_op_1_0= ruleRelOp ) ) ( (lv_right_2_0= ruleArithmeticExpression ) ) )?
            {
            // InternalModelica.g:3818:3: ( (lv_left_0_0= ruleArithmeticExpression ) )
            // InternalModelica.g:3819:4: (lv_left_0_0= ruleArithmeticExpression )
            {
            // InternalModelica.g:3819:4: (lv_left_0_0= ruleArithmeticExpression )
            // InternalModelica.g:3820:5: lv_left_0_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getLeftArithmeticExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_85);
            lv_left_0_0=ruleArithmeticExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"xmodelica.Modelica.ArithmeticExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:3837:3: ( ( (lv_op_1_0= ruleRelOp ) ) ( (lv_right_2_0= ruleArithmeticExpression ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=80 && LA86_0<=85)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalModelica.g:3838:4: ( (lv_op_1_0= ruleRelOp ) ) ( (lv_right_2_0= ruleArithmeticExpression ) )
                    {
                    // InternalModelica.g:3838:4: ( (lv_op_1_0= ruleRelOp ) )
                    // InternalModelica.g:3839:5: (lv_op_1_0= ruleRelOp )
                    {
                    // InternalModelica.g:3839:5: (lv_op_1_0= ruleRelOp )
                    // InternalModelica.g:3840:6: lv_op_1_0= ruleRelOp
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getOpRelOpParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_84);
                    lv_op_1_0=ruleRelOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_1_0,
                    							"xmodelica.Modelica.RelOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:3857:4: ( (lv_right_2_0= ruleArithmeticExpression ) )
                    // InternalModelica.g:3858:5: (lv_right_2_0= ruleArithmeticExpression )
                    {
                    // InternalModelica.g:3858:5: (lv_right_2_0= ruleArithmeticExpression )
                    // InternalModelica.g:3859:6: lv_right_2_0= ruleArithmeticExpression
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getRightArithmeticExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleArithmeticExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"xmodelica.Modelica.ArithmeticExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRelOp"
    // InternalModelica.g:3881:1: entryRuleRelOp returns [String current=null] : iv_ruleRelOp= ruleRelOp EOF ;
    public final String entryRuleRelOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelOp = null;


        try {
            // InternalModelica.g:3881:45: (iv_ruleRelOp= ruleRelOp EOF )
            // InternalModelica.g:3882:2: iv_ruleRelOp= ruleRelOp EOF
            {
             newCompositeNode(grammarAccess.getRelOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelOp=ruleRelOp();

            state._fsp--;

             current =iv_ruleRelOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelOp"


    // $ANTLR start "ruleRelOp"
    // InternalModelica.g:3888:1: ruleRelOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleRelOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:3894:2: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) )
            // InternalModelica.g:3895:2: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' )
            {
            // InternalModelica.g:3895:2: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' )
            int alt87=6;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt87=1;
                }
                break;
            case 81:
                {
                alt87=2;
                }
                break;
            case 82:
                {
                alt87=3;
                }
                break;
            case 83:
                {
                alt87=4;
                }
                break;
            case 84:
                {
                alt87=5;
                }
                break;
            case 85:
                {
                alt87=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalModelica.g:3896:3: kw= '<'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:3902:3: kw= '<='
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:3908:3: kw= '>'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:3914:3: kw= '>='
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalModelica.g:3920:3: kw= '=='
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getEqualsSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalModelica.g:3926:3: kw= '<>'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignGreaterThanSignKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelOp"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalModelica.g:3935:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalModelica.g:3935:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalModelica.g:3936:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalModelica.g:3942:1: ruleArithmeticExpression returns [EObject current=null] : ( ( (lv_ops_0_0= ruleAddOp ) )? ( (lv_terms_1_0= ruleTerm ) ) ( ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ops_0_0 = null;

        EObject lv_terms_1_0 = null;

        AntlrDatatypeRuleToken lv_ops_2_0 = null;

        EObject lv_terms_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3948:2: ( ( ( (lv_ops_0_0= ruleAddOp ) )? ( (lv_terms_1_0= ruleTerm ) ) ( ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )* ) )
            // InternalModelica.g:3949:2: ( ( (lv_ops_0_0= ruleAddOp ) )? ( (lv_terms_1_0= ruleTerm ) ) ( ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )* )
            {
            // InternalModelica.g:3949:2: ( ( (lv_ops_0_0= ruleAddOp ) )? ( (lv_terms_1_0= ruleTerm ) ) ( ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )* )
            // InternalModelica.g:3950:3: ( (lv_ops_0_0= ruleAddOp ) )? ( (lv_terms_1_0= ruleTerm ) ) ( ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )*
            {
            // InternalModelica.g:3950:3: ( (lv_ops_0_0= ruleAddOp ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=86 && LA88_0<=89)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalModelica.g:3951:4: (lv_ops_0_0= ruleAddOp )
                    {
                    // InternalModelica.g:3951:4: (lv_ops_0_0= ruleAddOp )
                    // InternalModelica.g:3952:5: lv_ops_0_0= ruleAddOp
                    {

                    					newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getOpsAddOpParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_84);
                    lv_ops_0_0=ruleAddOp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
                    					}
                    					add(
                    						current,
                    						"ops",
                    						lv_ops_0_0,
                    						"xmodelica.Modelica.AddOp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalModelica.g:3969:3: ( (lv_terms_1_0= ruleTerm ) )
            // InternalModelica.g:3970:4: (lv_terms_1_0= ruleTerm )
            {
            // InternalModelica.g:3970:4: (lv_terms_1_0= ruleTerm )
            // InternalModelica.g:3971:5: lv_terms_1_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getTermsTermParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_86);
            lv_terms_1_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            					}
            					add(
            						current,
            						"terms",
            						lv_terms_1_0,
            						"xmodelica.Modelica.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:3988:3: ( ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=86 && LA89_0<=89)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalModelica.g:3989:4: ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) )
            	    {
            	    // InternalModelica.g:3989:4: ( (lv_ops_2_0= ruleAddOp ) )
            	    // InternalModelica.g:3990:5: (lv_ops_2_0= ruleAddOp )
            	    {
            	    // InternalModelica.g:3990:5: (lv_ops_2_0= ruleAddOp )
            	    // InternalModelica.g:3991:6: lv_ops_2_0= ruleAddOp
            	    {

            	    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getOpsAddOpParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_84);
            	    lv_ops_2_0=ruleAddOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ops",
            	    							lv_ops_2_0,
            	    							"xmodelica.Modelica.AddOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalModelica.g:4008:4: ( (lv_terms_3_0= ruleTerm ) )
            	    // InternalModelica.g:4009:5: (lv_terms_3_0= ruleTerm )
            	    {
            	    // InternalModelica.g:4009:5: (lv_terms_3_0= ruleTerm )
            	    // InternalModelica.g:4010:6: lv_terms_3_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getTermsTermParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_86);
            	    lv_terms_3_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terms",
            	    							lv_terms_3_0,
            	    							"xmodelica.Modelica.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAddOp"
    // InternalModelica.g:4032:1: entryRuleAddOp returns [String current=null] : iv_ruleAddOp= ruleAddOp EOF ;
    public final String entryRuleAddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddOp = null;


        try {
            // InternalModelica.g:4032:45: (iv_ruleAddOp= ruleAddOp EOF )
            // InternalModelica.g:4033:2: iv_ruleAddOp= ruleAddOp EOF
            {
             newCompositeNode(grammarAccess.getAddOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddOp=ruleAddOp();

            state._fsp--;

             current =iv_ruleAddOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddOp"


    // $ANTLR start "ruleAddOp"
    // InternalModelica.g:4039:1: ruleAddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) ;
    public final AntlrDatatypeRuleToken ruleAddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:4045:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) )
            // InternalModelica.g:4046:2: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )
            {
            // InternalModelica.g:4046:2: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )
            int alt90=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt90=1;
                }
                break;
            case 87:
                {
                alt90=2;
                }
                break;
            case 88:
                {
                alt90=3;
                }
                break;
            case 89:
                {
                alt90=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalModelica.g:4047:3: kw= '+'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddOpAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:4053:3: kw= '-'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddOpAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:4059:3: kw= '.+'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddOpAccess().getFullStopPlusSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:4065:3: kw= '.-'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddOpAccess().getFullStopHyphenMinusKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddOp"


    // $ANTLR start "entryRuleTerm"
    // InternalModelica.g:4074:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalModelica.g:4074:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalModelica.g:4075:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalModelica.g:4081:1: ruleTerm returns [EObject current=null] : ( ( (lv_factors_0_0= ruleFactor ) ) ( ( (lv_ops_1_0= ruleMulOp ) ) ( (lv_factors_2_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_factors_0_0 = null;

        AntlrDatatypeRuleToken lv_ops_1_0 = null;

        EObject lv_factors_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4087:2: ( ( ( (lv_factors_0_0= ruleFactor ) ) ( ( (lv_ops_1_0= ruleMulOp ) ) ( (lv_factors_2_0= ruleFactor ) ) )* ) )
            // InternalModelica.g:4088:2: ( ( (lv_factors_0_0= ruleFactor ) ) ( ( (lv_ops_1_0= ruleMulOp ) ) ( (lv_factors_2_0= ruleFactor ) ) )* )
            {
            // InternalModelica.g:4088:2: ( ( (lv_factors_0_0= ruleFactor ) ) ( ( (lv_ops_1_0= ruleMulOp ) ) ( (lv_factors_2_0= ruleFactor ) ) )* )
            // InternalModelica.g:4089:3: ( (lv_factors_0_0= ruleFactor ) ) ( ( (lv_ops_1_0= ruleMulOp ) ) ( (lv_factors_2_0= ruleFactor ) ) )*
            {
            // InternalModelica.g:4089:3: ( (lv_factors_0_0= ruleFactor ) )
            // InternalModelica.g:4090:4: (lv_factors_0_0= ruleFactor )
            {
            // InternalModelica.g:4090:4: (lv_factors_0_0= ruleFactor )
            // InternalModelica.g:4091:5: lv_factors_0_0= ruleFactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_87);
            lv_factors_0_0=ruleFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_0_0,
            						"xmodelica.Modelica.Factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:4108:3: ( ( (lv_ops_1_0= ruleMulOp ) ) ( (lv_factors_2_0= ruleFactor ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==52||(LA91_0>=90 && LA91_0<=92)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalModelica.g:4109:4: ( (lv_ops_1_0= ruleMulOp ) ) ( (lv_factors_2_0= ruleFactor ) )
            	    {
            	    // InternalModelica.g:4109:4: ( (lv_ops_1_0= ruleMulOp ) )
            	    // InternalModelica.g:4110:5: (lv_ops_1_0= ruleMulOp )
            	    {
            	    // InternalModelica.g:4110:5: (lv_ops_1_0= ruleMulOp )
            	    // InternalModelica.g:4111:6: lv_ops_1_0= ruleMulOp
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getOpsMulOpParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_84);
            	    lv_ops_1_0=ruleMulOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ops",
            	    							lv_ops_1_0,
            	    							"xmodelica.Modelica.MulOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalModelica.g:4128:4: ( (lv_factors_2_0= ruleFactor ) )
            	    // InternalModelica.g:4129:5: (lv_factors_2_0= ruleFactor )
            	    {
            	    // InternalModelica.g:4129:5: (lv_factors_2_0= ruleFactor )
            	    // InternalModelica.g:4130:6: lv_factors_2_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_87);
            	    lv_factors_2_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factors",
            	    							lv_factors_2_0,
            	    							"xmodelica.Modelica.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleMulOp"
    // InternalModelica.g:4152:1: entryRuleMulOp returns [String current=null] : iv_ruleMulOp= ruleMulOp EOF ;
    public final String entryRuleMulOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMulOp = null;


        try {
            // InternalModelica.g:4152:45: (iv_ruleMulOp= ruleMulOp EOF )
            // InternalModelica.g:4153:2: iv_ruleMulOp= ruleMulOp EOF
            {
             newCompositeNode(grammarAccess.getMulOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOp=ruleMulOp();

            state._fsp--;

             current =iv_ruleMulOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOp"


    // $ANTLR start "ruleMulOp"
    // InternalModelica.g:4159:1: ruleMulOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '.*' | kw= './' ) ;
    public final AntlrDatatypeRuleToken ruleMulOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:4165:2: ( (kw= '*' | kw= '/' | kw= '.*' | kw= './' ) )
            // InternalModelica.g:4166:2: (kw= '*' | kw= '/' | kw= '.*' | kw= './' )
            {
            // InternalModelica.g:4166:2: (kw= '*' | kw= '/' | kw= '.*' | kw= './' )
            int alt92=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt92=1;
                }
                break;
            case 90:
                {
                alt92=2;
                }
                break;
            case 91:
                {
                alt92=3;
                }
                break;
            case 92:
                {
                alt92=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalModelica.g:4167:3: kw= '*'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMulOpAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:4173:3: kw= '/'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMulOpAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:4179:3: kw= '.*'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMulOpAccess().getFullStopAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:4185:3: kw= './'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMulOpAccess().getFullStopSolidusKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOp"


    // $ANTLR start "entryRuleFactor"
    // InternalModelica.g:4194:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalModelica.g:4194:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalModelica.g:4195:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalModelica.g:4201:1: ruleFactor returns [EObject current=null] : ( ( (lv_base_0_0= rulePrimary ) ) ( (otherlv_1= '^' | otherlv_2= '.^' ) ( (lv_exp_3_0= rulePrimary ) ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_base_0_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4207:2: ( ( ( (lv_base_0_0= rulePrimary ) ) ( (otherlv_1= '^' | otherlv_2= '.^' ) ( (lv_exp_3_0= rulePrimary ) ) )? ) )
            // InternalModelica.g:4208:2: ( ( (lv_base_0_0= rulePrimary ) ) ( (otherlv_1= '^' | otherlv_2= '.^' ) ( (lv_exp_3_0= rulePrimary ) ) )? )
            {
            // InternalModelica.g:4208:2: ( ( (lv_base_0_0= rulePrimary ) ) ( (otherlv_1= '^' | otherlv_2= '.^' ) ( (lv_exp_3_0= rulePrimary ) ) )? )
            // InternalModelica.g:4209:3: ( (lv_base_0_0= rulePrimary ) ) ( (otherlv_1= '^' | otherlv_2= '.^' ) ( (lv_exp_3_0= rulePrimary ) ) )?
            {
            // InternalModelica.g:4209:3: ( (lv_base_0_0= rulePrimary ) )
            // InternalModelica.g:4210:4: (lv_base_0_0= rulePrimary )
            {
            // InternalModelica.g:4210:4: (lv_base_0_0= rulePrimary )
            // InternalModelica.g:4211:5: lv_base_0_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getFactorAccess().getBasePrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_88);
            lv_base_0_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFactorRule());
            					}
            					set(
            						current,
            						"base",
            						lv_base_0_0,
            						"xmodelica.Modelica.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:4228:3: ( (otherlv_1= '^' | otherlv_2= '.^' ) ( (lv_exp_3_0= rulePrimary ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=93 && LA94_0<=94)) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalModelica.g:4229:4: (otherlv_1= '^' | otherlv_2= '.^' ) ( (lv_exp_3_0= rulePrimary ) )
                    {
                    // InternalModelica.g:4229:4: (otherlv_1= '^' | otherlv_2= '.^' )
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==93) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==94) ) {
                        alt93=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalModelica.g:4230:5: otherlv_1= '^'
                            {
                            otherlv_1=(Token)match(input,93,FOLLOW_55); 

                            					newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getCircumflexAccentKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalModelica.g:4235:5: otherlv_2= '.^'
                            {
                            otherlv_2=(Token)match(input,94,FOLLOW_55); 

                            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getFullStopCircumflexAccentKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:4240:4: ( (lv_exp_3_0= rulePrimary ) )
                    // InternalModelica.g:4241:5: (lv_exp_3_0= rulePrimary )
                    {
                    // InternalModelica.g:4241:5: (lv_exp_3_0= rulePrimary )
                    // InternalModelica.g:4242:6: lv_exp_3_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpPrimaryParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_3_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_3_0,
                    							"xmodelica.Modelica.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalModelica.g:4264:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalModelica.g:4264:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalModelica.g:4265:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalModelica.g:4271:1: rulePrimary returns [EObject current=null] : ( ( () this_UNSIGNED_NUMBER_1= RULE_UNSIGNED_NUMBER ) | this_STRING_2= RULE_STRING | otherlv_3= 'false' | otherlv_4= 'true' | otherlv_5= 'end' ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token this_UNSIGNED_NUMBER_1=null;
        Token this_STRING_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalModelica.g:4277:2: ( ( ( () this_UNSIGNED_NUMBER_1= RULE_UNSIGNED_NUMBER ) | this_STRING_2= RULE_STRING | otherlv_3= 'false' | otherlv_4= 'true' | otherlv_5= 'end' ) )
            // InternalModelica.g:4278:2: ( ( () this_UNSIGNED_NUMBER_1= RULE_UNSIGNED_NUMBER ) | this_STRING_2= RULE_STRING | otherlv_3= 'false' | otherlv_4= 'true' | otherlv_5= 'end' )
            {
            // InternalModelica.g:4278:2: ( ( () this_UNSIGNED_NUMBER_1= RULE_UNSIGNED_NUMBER ) | this_STRING_2= RULE_STRING | otherlv_3= 'false' | otherlv_4= 'true' | otherlv_5= 'end' )
            int alt95=5;
            switch ( input.LA(1) ) {
            case RULE_UNSIGNED_NUMBER:
                {
                alt95=1;
                }
                break;
            case RULE_STRING:
                {
                alt95=2;
                }
                break;
            case 95:
                {
                alt95=3;
                }
                break;
            case 96:
                {
                alt95=4;
                }
                break;
            case 35:
                {
                alt95=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalModelica.g:4279:3: ( () this_UNSIGNED_NUMBER_1= RULE_UNSIGNED_NUMBER )
                    {
                    // InternalModelica.g:4279:3: ( () this_UNSIGNED_NUMBER_1= RULE_UNSIGNED_NUMBER )
                    // InternalModelica.g:4280:4: () this_UNSIGNED_NUMBER_1= RULE_UNSIGNED_NUMBER
                    {
                    // InternalModelica.g:4280:4: ()
                    // InternalModelica.g:4281:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getPrimaryAction_0_0(),
                    						current);
                    				

                    }

                    this_UNSIGNED_NUMBER_1=(Token)match(input,RULE_UNSIGNED_NUMBER,FOLLOW_2); 

                    				newLeafNode(this_UNSIGNED_NUMBER_1, grammarAccess.getPrimaryAccess().getUNSIGNED_NUMBERTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:4293:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_2, grammarAccess.getPrimaryAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:4298:3: otherlv_3= 'false'
                    {
                    otherlv_3=(Token)match(input,95,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getFalseKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:4303:3: otherlv_4= 'true'
                    {
                    otherlv_4=(Token)match(input,96,FOLLOW_2); 

                    			newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getTrueKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalModelica.g:4308:3: otherlv_5= 'end'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_2); 

                    			newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getEndKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleName"
    // InternalModelica.g:4316:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalModelica.g:4316:44: (iv_ruleName= ruleName EOF )
            // InternalModelica.g:4317:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalModelica.g:4323:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;
        Token this_IDENT_3=null;


        	enterRule();

        try {
            // InternalModelica.g:4329:2: ( ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* ) )
            // InternalModelica.g:4330:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* )
            {
            // InternalModelica.g:4330:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* )
            // InternalModelica.g:4331:3: (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )*
            {
            // InternalModelica.g:4331:3: (kw= '.' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==97) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalModelica.g:4332:4: kw= '.'
                    {
                    kw=(Token)match(input,97,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_0());
                    			

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_89); 

            			current.merge(this_IDENT_1);
            		

            			newLeafNode(this_IDENT_1, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_1());
            		
            // InternalModelica.g:4345:3: (kw= '.' this_IDENT_3= RULE_IDENT )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==97) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalModelica.g:4346:4: kw= '.' this_IDENT_3= RULE_IDENT
            	    {
            	    kw=(Token)match(input,97,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_2_0());
            	    			
            	    this_IDENT_3=(Token)match(input,RULE_IDENT,FOLLOW_89); 

            	    				current.merge(this_IDENT_3);
            	    			

            	    				newLeafNode(this_IDENT_3, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleComponentReference"
    // InternalModelica.g:4363:1: entryRuleComponentReference returns [EObject current=null] : iv_ruleComponentReference= ruleComponentReference EOF ;
    public final EObject entryRuleComponentReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentReference = null;


        try {
            // InternalModelica.g:4363:59: (iv_ruleComponentReference= ruleComponentReference EOF )
            // InternalModelica.g:4364:2: iv_ruleComponentReference= ruleComponentReference EOF
            {
             newCompositeNode(grammarAccess.getComponentReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentReference=ruleComponentReference();

            state._fsp--;

             current =iv_ruleComponentReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentReference"


    // $ANTLR start "ruleComponentReference"
    // InternalModelica.g:4370:1: ruleComponentReference returns [EObject current=null] : ( () ( (otherlv_1= '.' )? ( (lv_idents_2_0= RULE_IDENT ) ) ( (lv_subscripts_3_0= ruleArraySubscripts ) )? )+ ) ;
    public final EObject ruleComponentReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_idents_2_0=null;
        EObject lv_subscripts_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4376:2: ( ( () ( (otherlv_1= '.' )? ( (lv_idents_2_0= RULE_IDENT ) ) ( (lv_subscripts_3_0= ruleArraySubscripts ) )? )+ ) )
            // InternalModelica.g:4377:2: ( () ( (otherlv_1= '.' )? ( (lv_idents_2_0= RULE_IDENT ) ) ( (lv_subscripts_3_0= ruleArraySubscripts ) )? )+ )
            {
            // InternalModelica.g:4377:2: ( () ( (otherlv_1= '.' )? ( (lv_idents_2_0= RULE_IDENT ) ) ( (lv_subscripts_3_0= ruleArraySubscripts ) )? )+ )
            // InternalModelica.g:4378:3: () ( (otherlv_1= '.' )? ( (lv_idents_2_0= RULE_IDENT ) ) ( (lv_subscripts_3_0= ruleArraySubscripts ) )? )+
            {
            // InternalModelica.g:4378:3: ()
            // InternalModelica.g:4379:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentReferenceAccess().getComponentReferenceAction_0(),
            					current);
            			

            }

            // InternalModelica.g:4385:3: ( (otherlv_1= '.' )? ( (lv_idents_2_0= RULE_IDENT ) ) ( (lv_subscripts_3_0= ruleArraySubscripts ) )? )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==RULE_IDENT||LA100_0==97) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalModelica.g:4386:4: (otherlv_1= '.' )? ( (lv_idents_2_0= RULE_IDENT ) ) ( (lv_subscripts_3_0= ruleArraySubscripts ) )?
            	    {
            	    // InternalModelica.g:4386:4: (otherlv_1= '.' )?
            	    int alt98=2;
            	    int LA98_0 = input.LA(1);

            	    if ( (LA98_0==97) ) {
            	        alt98=1;
            	    }
            	    switch (alt98) {
            	        case 1 :
            	            // InternalModelica.g:4387:5: otherlv_1= '.'
            	            {
            	            otherlv_1=(Token)match(input,97,FOLLOW_15); 

            	            					newLeafNode(otherlv_1, grammarAccess.getComponentReferenceAccess().getFullStopKeyword_1_0());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalModelica.g:4392:4: ( (lv_idents_2_0= RULE_IDENT ) )
            	    // InternalModelica.g:4393:5: (lv_idents_2_0= RULE_IDENT )
            	    {
            	    // InternalModelica.g:4393:5: (lv_idents_2_0= RULE_IDENT )
            	    // InternalModelica.g:4394:6: lv_idents_2_0= RULE_IDENT
            	    {
            	    lv_idents_2_0=(Token)match(input,RULE_IDENT,FOLLOW_90); 

            	    						newLeafNode(lv_idents_2_0, grammarAccess.getComponentReferenceAccess().getIdentsIDENTTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComponentReferenceRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"idents",
            	    							lv_idents_2_0,
            	    							"xmodelica.Modelica.IDENT");
            	    					

            	    }


            	    }

            	    // InternalModelica.g:4410:4: ( (lv_subscripts_3_0= ruleArraySubscripts ) )?
            	    int alt99=2;
            	    int LA99_0 = input.LA(1);

            	    if ( (LA99_0==98) ) {
            	        alt99=1;
            	    }
            	    switch (alt99) {
            	        case 1 :
            	            // InternalModelica.g:4411:5: (lv_subscripts_3_0= ruleArraySubscripts )
            	            {
            	            // InternalModelica.g:4411:5: (lv_subscripts_3_0= ruleArraySubscripts )
            	            // InternalModelica.g:4412:6: lv_subscripts_3_0= ruleArraySubscripts
            	            {

            	            						newCompositeNode(grammarAccess.getComponentReferenceAccess().getSubscriptsArraySubscriptsParserRuleCall_1_2_0());
            	            					
            	            pushFollow(FOLLOW_91);
            	            lv_subscripts_3_0=ruleArraySubscripts();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getComponentReferenceRule());
            	            						}
            	            						add(
            	            							current,
            	            							"subscripts",
            	            							lv_subscripts_3_0,
            	            							"xmodelica.Modelica.ArraySubscripts");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentReference"


    // $ANTLR start "entryRuleFunctionCallArgs"
    // InternalModelica.g:4434:1: entryRuleFunctionCallArgs returns [EObject current=null] : iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF ;
    public final EObject entryRuleFunctionCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArgs = null;


        try {
            // InternalModelica.g:4434:57: (iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF )
            // InternalModelica.g:4435:2: iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCallArgs=ruleFunctionCallArgs();

            state._fsp--;

             current =iv_ruleFunctionCallArgs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallArgs"


    // $ANTLR start "ruleFunctionCallArgs"
    // InternalModelica.g:4441:1: ruleFunctionCallArgs returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_args_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ) ;
    public final EObject ruleFunctionCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4447:2: ( ( () otherlv_1= '(' ( (lv_args_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ) )
            // InternalModelica.g:4448:2: ( () otherlv_1= '(' ( (lv_args_2_0= ruleFunctionArguments ) )? otherlv_3= ')' )
            {
            // InternalModelica.g:4448:2: ( () otherlv_1= '(' ( (lv_args_2_0= ruleFunctionArguments ) )? otherlv_3= ')' )
            // InternalModelica.g:4449:3: () otherlv_1= '(' ( (lv_args_2_0= ruleFunctionArguments ) )? otherlv_3= ')'
            {
            // InternalModelica.g:4449:3: ()
            // InternalModelica.g:4450:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionCallArgsAccess().getFunctionCallArgsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_92); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalModelica.g:4460:3: ( (lv_args_2_0= ruleFunctionArguments ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_IDENT||LA101_0==34||LA101_0==61||LA101_0==79) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalModelica.g:4461:4: (lv_args_2_0= ruleFunctionArguments )
                    {
                    // InternalModelica.g:4461:4: (lv_args_2_0= ruleFunctionArguments )
                    // InternalModelica.g:4462:5: lv_args_2_0= ruleFunctionArguments
                    {

                    					newCompositeNode(grammarAccess.getFunctionCallArgsAccess().getArgsFunctionArgumentsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_args_2_0=ruleFunctionArguments();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionCallArgsRule());
                    					}
                    					set(
                    						current,
                    						"args",
                    						lv_args_2_0,
                    						"xmodelica.Modelica.FunctionArguments");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionCallArgsAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallArgs"


    // $ANTLR start "entryRuleFunctionArguments"
    // InternalModelica.g:4487:1: entryRuleFunctionArguments returns [EObject current=null] : iv_ruleFunctionArguments= ruleFunctionArguments EOF ;
    public final EObject entryRuleFunctionArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArguments = null;


        try {
            // InternalModelica.g:4487:58: (iv_ruleFunctionArguments= ruleFunctionArguments EOF )
            // InternalModelica.g:4488:2: iv_ruleFunctionArguments= ruleFunctionArguments EOF
            {
             newCompositeNode(grammarAccess.getFunctionArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionArguments=ruleFunctionArguments();

            state._fsp--;

             current =iv_ruleFunctionArguments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArguments"


    // $ANTLR start "ruleFunctionArguments"
    // InternalModelica.g:4494:1: ruleFunctionArguments returns [EObject current=null] : ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument ) ;
    public final EObject ruleFunctionArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;

        EObject lv_indices_4_0 = null;

        EObject this_NamedArgument_5 = null;



        	enterRule();

        try {
            // InternalModelica.g:4500:2: ( ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument ) )
            // InternalModelica.g:4501:2: ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument )
            {
            // InternalModelica.g:4501:2: ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==34||LA103_0==61||LA103_0==79) ) {
                alt103=1;
            }
            else if ( (LA103_0==RULE_IDENT) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalModelica.g:4502:3: ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? )
                    {
                    // InternalModelica.g:4502:3: ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? )
                    // InternalModelica.g:4503:4: ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )?
                    {
                    // InternalModelica.g:4503:4: ( (lv_args_0_0= ruleFunctionArgument ) )
                    // InternalModelica.g:4504:5: (lv_args_0_0= ruleFunctionArgument )
                    {
                    // InternalModelica.g:4504:5: (lv_args_0_0= ruleFunctionArgument )
                    // InternalModelica.g:4505:6: lv_args_0_0= ruleFunctionArgument
                    {

                    						newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getArgsFunctionArgumentParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_args_0_0=ruleFunctionArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionArgumentsRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_0_0,
                    							"xmodelica.Modelica.FunctionArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:4522:4: ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )?
                    int alt102=3;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==42) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==71) ) {
                        alt102=2;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalModelica.g:4523:5: (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) )
                            {
                            // InternalModelica.g:4523:5: (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) )
                            // InternalModelica.g:4524:6: otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) )
                            {
                            otherlv_1=(Token)match(input,42,FOLLOW_94); 

                            						newLeafNode(otherlv_1, grammarAccess.getFunctionArgumentsAccess().getCommaKeyword_0_1_0_0());
                            					
                            // InternalModelica.g:4528:6: ( (lv_args_2_0= ruleFunctionArguments ) )
                            // InternalModelica.g:4529:7: (lv_args_2_0= ruleFunctionArguments )
                            {
                            // InternalModelica.g:4529:7: (lv_args_2_0= ruleFunctionArguments )
                            // InternalModelica.g:4530:8: lv_args_2_0= ruleFunctionArguments
                            {

                            								newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getArgsFunctionArgumentsParserRuleCall_0_1_0_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_args_2_0=ruleFunctionArguments();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFunctionArgumentsRule());
                            								}
                            								add(
                            									current,
                            									"args",
                            									lv_args_2_0,
                            									"xmodelica.Modelica.FunctionArguments");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalModelica.g:4549:5: (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) )
                            {
                            // InternalModelica.g:4549:5: (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) )
                            // InternalModelica.g:4550:6: otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) )
                            {
                            otherlv_3=(Token)match(input,71,FOLLOW_15); 

                            						newLeafNode(otherlv_3, grammarAccess.getFunctionArgumentsAccess().getForKeyword_0_1_1_0());
                            					
                            // InternalModelica.g:4554:6: ( (lv_indices_4_0= ruleForIndices ) )
                            // InternalModelica.g:4555:7: (lv_indices_4_0= ruleForIndices )
                            {
                            // InternalModelica.g:4555:7: (lv_indices_4_0= ruleForIndices )
                            // InternalModelica.g:4556:8: lv_indices_4_0= ruleForIndices
                            {

                            								newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getIndicesForIndicesParserRuleCall_0_1_1_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_indices_4_0=ruleForIndices();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFunctionArgumentsRule());
                            								}
                            								set(
                            									current,
                            									"indices",
                            									lv_indices_4_0,
                            									"xmodelica.Modelica.ForIndices");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:4577:3: this_NamedArgument_5= ruleNamedArgument
                    {

                    			newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getNamedArgumentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedArgument_5=ruleNamedArgument();

                    state._fsp--;


                    			current = this_NamedArgument_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArguments"


    // $ANTLR start "entryRuleNamedArguments"
    // InternalModelica.g:4589:1: entryRuleNamedArguments returns [EObject current=null] : iv_ruleNamedArguments= ruleNamedArguments EOF ;
    public final EObject entryRuleNamedArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArguments = null;


        try {
            // InternalModelica.g:4589:55: (iv_ruleNamedArguments= ruleNamedArguments EOF )
            // InternalModelica.g:4590:2: iv_ruleNamedArguments= ruleNamedArguments EOF
            {
             newCompositeNode(grammarAccess.getNamedArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedArguments=ruleNamedArguments();

            state._fsp--;

             current =iv_ruleNamedArguments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArguments"


    // $ANTLR start "ruleNamedArguments"
    // InternalModelica.g:4596:1: ruleNamedArguments returns [EObject current=null] : ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) ) ;
    public final EObject ruleNamedArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4602:2: ( ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) ) )
            // InternalModelica.g:4603:2: ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) )
            {
            // InternalModelica.g:4603:2: ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) )
            // InternalModelica.g:4604:3: ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) )
            {
            // InternalModelica.g:4604:3: ( (lv_args_0_0= ruleNamedArgument ) )
            // InternalModelica.g:4605:4: (lv_args_0_0= ruleNamedArgument )
            {
            // InternalModelica.g:4605:4: (lv_args_0_0= ruleNamedArgument )
            // InternalModelica.g:4606:5: lv_args_0_0= ruleNamedArgument
            {

            					newCompositeNode(grammarAccess.getNamedArgumentsAccess().getArgsNamedArgumentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_args_0_0=ruleNamedArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedArgumentsRule());
            					}
            					add(
            						current,
            						"args",
            						lv_args_0_0,
            						"xmodelica.Modelica.NamedArgument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:4623:3: (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) )
            // InternalModelica.g:4624:4: otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) )
            {
            otherlv_1=(Token)match(input,42,FOLLOW_94); 

            				newLeafNode(otherlv_1, grammarAccess.getNamedArgumentsAccess().getCommaKeyword_1_0());
            			
            // InternalModelica.g:4628:4: ( (lv_args_2_0= ruleNamedArguments ) )
            // InternalModelica.g:4629:5: (lv_args_2_0= ruleNamedArguments )
            {
            // InternalModelica.g:4629:5: (lv_args_2_0= ruleNamedArguments )
            // InternalModelica.g:4630:6: lv_args_2_0= ruleNamedArguments
            {

            						newCompositeNode(grammarAccess.getNamedArgumentsAccess().getArgsNamedArgumentsParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_args_2_0=ruleNamedArguments();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getNamedArgumentsRule());
            						}
            						add(
            							current,
            							"args",
            							lv_args_2_0,
            							"xmodelica.Modelica.NamedArguments");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedArguments"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalModelica.g:4652:1: entryRuleNamedArgument returns [EObject current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final EObject entryRuleNamedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgument = null;


        try {
            // InternalModelica.g:4652:54: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalModelica.g:4653:2: iv_ruleNamedArgument= ruleNamedArgument EOF
            {
             newCompositeNode(grammarAccess.getNamedArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedArgument=ruleNamedArgument();

            state._fsp--;

             current =iv_ruleNamedArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalModelica.g:4659:1: ruleNamedArgument returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) ) ;
    public final EObject ruleNamedArgument() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_func_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4665:2: ( ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) ) )
            // InternalModelica.g:4666:2: ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) )
            {
            // InternalModelica.g:4666:2: ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) )
            // InternalModelica.g:4667:3: ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) )
            {
            // InternalModelica.g:4667:3: ( (lv_id_0_0= RULE_IDENT ) )
            // InternalModelica.g:4668:4: (lv_id_0_0= RULE_IDENT )
            {
            // InternalModelica.g:4668:4: (lv_id_0_0= RULE_IDENT )
            // InternalModelica.g:4669:5: lv_id_0_0= RULE_IDENT
            {
            lv_id_0_0=(Token)match(input,RULE_IDENT,FOLLOW_16); 

            					newLeafNode(lv_id_0_0, grammarAccess.getNamedArgumentAccess().getIdIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"xmodelica.Modelica.IDENT");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_95); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedArgumentAccess().getEqualsSignKeyword_1());
            		
            // InternalModelica.g:4689:3: ( (lv_func_2_0= ruleFunctionArgument ) )
            // InternalModelica.g:4690:4: (lv_func_2_0= ruleFunctionArgument )
            {
            // InternalModelica.g:4690:4: (lv_func_2_0= ruleFunctionArgument )
            // InternalModelica.g:4691:5: lv_func_2_0= ruleFunctionArgument
            {

            					newCompositeNode(grammarAccess.getNamedArgumentAccess().getFuncFunctionArgumentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_func_2_0=ruleFunctionArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedArgumentRule());
            					}
            					set(
            						current,
            						"func",
            						lv_func_2_0,
            						"xmodelica.Modelica.FunctionArgument");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleFunctionArgument"
    // InternalModelica.g:4712:1: entryRuleFunctionArgument returns [EObject current=null] : iv_ruleFunctionArgument= ruleFunctionArgument EOF ;
    public final EObject entryRuleFunctionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArgument = null;


        try {
            // InternalModelica.g:4712:57: (iv_ruleFunctionArgument= ruleFunctionArgument EOF )
            // InternalModelica.g:4713:2: iv_ruleFunctionArgument= ruleFunctionArgument EOF
            {
             newCompositeNode(grammarAccess.getFunctionArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionArgument=ruleFunctionArgument();

            state._fsp--;

             current =iv_ruleFunctionArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArgument"


    // $ANTLR start "ruleFunctionArgument"
    // InternalModelica.g:4719:1: ruleFunctionArgument returns [EObject current=null] : ( ( () otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleNamedArguments ) )? otherlv_5= ')' ) | this_Expression_6= ruleExpression ) ;
    public final EObject ruleFunctionArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_args_4_0 = null;

        EObject this_Expression_6 = null;



        	enterRule();

        try {
            // InternalModelica.g:4725:2: ( ( ( () otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleNamedArguments ) )? otherlv_5= ')' ) | this_Expression_6= ruleExpression ) )
            // InternalModelica.g:4726:2: ( ( () otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleNamedArguments ) )? otherlv_5= ')' ) | this_Expression_6= ruleExpression )
            {
            // InternalModelica.g:4726:2: ( ( () otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleNamedArguments ) )? otherlv_5= ')' ) | this_Expression_6= ruleExpression )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==34) ) {
                alt105=1;
            }
            else if ( (LA105_0==61||LA105_0==79) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalModelica.g:4727:3: ( () otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleNamedArguments ) )? otherlv_5= ')' )
                    {
                    // InternalModelica.g:4727:3: ( () otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleNamedArguments ) )? otherlv_5= ')' )
                    // InternalModelica.g:4728:4: () otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleNamedArguments ) )? otherlv_5= ')'
                    {
                    // InternalModelica.g:4728:4: ()
                    // InternalModelica.g:4729:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFunctionArgumentAccess().getFunctionArgumentAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionArgumentAccess().getFunctionKeyword_0_1());
                    			
                    // InternalModelica.g:4739:4: ( (lv_name_2_0= ruleName ) )
                    // InternalModelica.g:4740:5: (lv_name_2_0= ruleName )
                    {
                    // InternalModelica.g:4740:5: (lv_name_2_0= ruleName )
                    // InternalModelica.g:4741:6: lv_name_2_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getFunctionArgumentAccess().getNameNameParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_name_2_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionArgumentRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"xmodelica.Modelica.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,38,FOLLOW_92); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionArgumentAccess().getLeftParenthesisKeyword_0_3());
                    			
                    // InternalModelica.g:4762:4: ( (lv_args_4_0= ruleNamedArguments ) )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==RULE_IDENT) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // InternalModelica.g:4763:5: (lv_args_4_0= ruleNamedArguments )
                            {
                            // InternalModelica.g:4763:5: (lv_args_4_0= ruleNamedArguments )
                            // InternalModelica.g:4764:6: lv_args_4_0= ruleNamedArguments
                            {

                            						newCompositeNode(grammarAccess.getFunctionArgumentAccess().getArgsNamedArgumentsParserRuleCall_0_4_0());
                            					
                            pushFollow(FOLLOW_24);
                            lv_args_4_0=ruleNamedArguments();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFunctionArgumentRule());
                            						}
                            						set(
                            							current,
                            							"args",
                            							lv_args_4_0,
                            							"xmodelica.Modelica.NamedArguments");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionArgumentAccess().getRightParenthesisKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:4787:3: this_Expression_6= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getFunctionArgumentAccess().getExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_6=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArgument"


    // $ANTLR start "entryRuleOutputExpressionList"
    // InternalModelica.g:4799:1: entryRuleOutputExpressionList returns [EObject current=null] : iv_ruleOutputExpressionList= ruleOutputExpressionList EOF ;
    public final EObject entryRuleOutputExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputExpressionList = null;


        try {
            // InternalModelica.g:4799:61: (iv_ruleOutputExpressionList= ruleOutputExpressionList EOF )
            // InternalModelica.g:4800:2: iv_ruleOutputExpressionList= ruleOutputExpressionList EOF
            {
             newCompositeNode(grammarAccess.getOutputExpressionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputExpressionList=ruleOutputExpressionList();

            state._fsp--;

             current =iv_ruleOutputExpressionList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputExpressionList"


    // $ANTLR start "ruleOutputExpressionList"
    // InternalModelica.g:4806:1: ruleOutputExpressionList returns [EObject current=null] : ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* ) ;
    public final EObject ruleOutputExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4812:2: ( ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* ) )
            // InternalModelica.g:4813:2: ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* )
            {
            // InternalModelica.g:4813:2: ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* )
            // InternalModelica.g:4814:3: () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )*
            {
            // InternalModelica.g:4814:3: ()
            // InternalModelica.g:4815:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputExpressionListAccess().getOuputExpressionListAction_0(),
            					current);
            			

            }

            // InternalModelica.g:4821:3: ( (lv_exprs_1_0= ruleExpression ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==61||LA106_0==79) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalModelica.g:4822:4: (lv_exprs_1_0= ruleExpression )
                    {
                    // InternalModelica.g:4822:4: (lv_exprs_1_0= ruleExpression )
                    // InternalModelica.g:4823:5: lv_exprs_1_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getOutputExpressionListAccess().getExprsExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_exprs_1_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOutputExpressionListRule());
                    					}
                    					add(
                    						current,
                    						"exprs",
                    						lv_exprs_1_0,
                    						"xmodelica.Modelica.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalModelica.g:4840:3: (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==42) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalModelica.g:4841:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )?
            	    {
            	    otherlv_2=(Token)match(input,42,FOLLOW_96); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOutputExpressionListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalModelica.g:4845:4: ( (lv_exprs_3_0= ruleExpression ) )?
            	    int alt107=2;
            	    int LA107_0 = input.LA(1);

            	    if ( (LA107_0==61||LA107_0==79) ) {
            	        alt107=1;
            	    }
            	    switch (alt107) {
            	        case 1 :
            	            // InternalModelica.g:4846:5: (lv_exprs_3_0= ruleExpression )
            	            {
            	            // InternalModelica.g:4846:5: (lv_exprs_3_0= ruleExpression )
            	            // InternalModelica.g:4847:6: lv_exprs_3_0= ruleExpression
            	            {

            	            						newCompositeNode(grammarAccess.getOutputExpressionListAccess().getExprsExpressionParserRuleCall_2_1_0());
            	            					
            	            pushFollow(FOLLOW_30);
            	            lv_exprs_3_0=ruleExpression();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getOutputExpressionListRule());
            	            						}
            	            						add(
            	            							current,
            	            							"exprs",
            	            							lv_exprs_3_0,
            	            							"xmodelica.Modelica.Expression");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputExpressionList"


    // $ANTLR start "entryRuleExpressionList"
    // InternalModelica.g:4869:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // InternalModelica.g:4869:55: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalModelica.g:4870:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
             newCompositeNode(grammarAccess.getExpressionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;

             current =iv_ruleExpressionList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // InternalModelica.g:4876:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprs_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4882:2: ( ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* ) )
            // InternalModelica.g:4883:2: ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* )
            {
            // InternalModelica.g:4883:2: ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* )
            // InternalModelica.g:4884:3: ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )*
            {
            // InternalModelica.g:4884:3: ( (lv_exprs_0_0= ruleExpression ) )
            // InternalModelica.g:4885:4: (lv_exprs_0_0= ruleExpression )
            {
            // InternalModelica.g:4885:4: (lv_exprs_0_0= ruleExpression )
            // InternalModelica.g:4886:5: lv_exprs_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionListAccess().getExprsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_exprs_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionListRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_0_0,
            						"xmodelica.Modelica.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:4903:3: (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==42) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalModelica.g:4904:4: otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_50); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:4908:4: ( (lv_exprs_2_0= ruleExpression ) )
            	    // InternalModelica.g:4909:5: (lv_exprs_2_0= ruleExpression )
            	    {
            	    // InternalModelica.g:4909:5: (lv_exprs_2_0= ruleExpression )
            	    // InternalModelica.g:4910:6: lv_exprs_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionListAccess().getExprsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_exprs_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_2_0,
            	    							"xmodelica.Modelica.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleArraySubscripts"
    // InternalModelica.g:4932:1: entryRuleArraySubscripts returns [EObject current=null] : iv_ruleArraySubscripts= ruleArraySubscripts EOF ;
    public final EObject entryRuleArraySubscripts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySubscripts = null;


        try {
            // InternalModelica.g:4932:56: (iv_ruleArraySubscripts= ruleArraySubscripts EOF )
            // InternalModelica.g:4933:2: iv_ruleArraySubscripts= ruleArraySubscripts EOF
            {
             newCompositeNode(grammarAccess.getArraySubscriptsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArraySubscripts=ruleArraySubscripts();

            state._fsp--;

             current =iv_ruleArraySubscripts; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArraySubscripts"


    // $ANTLR start "ruleArraySubscripts"
    // InternalModelica.g:4939:1: ruleArraySubscripts returns [EObject current=null] : (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArraySubscripts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_subscripts_1_0 = null;

        EObject lv_subscripts_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4945:2: ( (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' ) )
            // InternalModelica.g:4946:2: (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' )
            {
            // InternalModelica.g:4946:2: (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' )
            // InternalModelica.g:4947:3: otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,98,FOLLOW_97); 

            			newLeafNode(otherlv_0, grammarAccess.getArraySubscriptsAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalModelica.g:4951:3: ( (lv_subscripts_1_0= ruleSubscript ) )
            // InternalModelica.g:4952:4: (lv_subscripts_1_0= ruleSubscript )
            {
            // InternalModelica.g:4952:4: (lv_subscripts_1_0= ruleSubscript )
            // InternalModelica.g:4953:5: lv_subscripts_1_0= ruleSubscript
            {

            					newCompositeNode(grammarAccess.getArraySubscriptsAccess().getSubscriptsSubscriptParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_98);
            lv_subscripts_1_0=ruleSubscript();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArraySubscriptsRule());
            					}
            					add(
            						current,
            						"subscripts",
            						lv_subscripts_1_0,
            						"xmodelica.Modelica.Subscript");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:4970:3: (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==42) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalModelica.g:4971:4: otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) )
            	    {
            	    otherlv_2=(Token)match(input,42,FOLLOW_97); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArraySubscriptsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalModelica.g:4975:4: ( (lv_subscripts_3_0= ruleSubscript ) )
            	    // InternalModelica.g:4976:5: (lv_subscripts_3_0= ruleSubscript )
            	    {
            	    // InternalModelica.g:4976:5: (lv_subscripts_3_0= ruleSubscript )
            	    // InternalModelica.g:4977:6: lv_subscripts_3_0= ruleSubscript
            	    {

            	    						newCompositeNode(grammarAccess.getArraySubscriptsAccess().getSubscriptsSubscriptParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_98);
            	    lv_subscripts_3_0=ruleSubscript();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArraySubscriptsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subscripts",
            	    							lv_subscripts_3_0,
            	    							"xmodelica.Modelica.Subscript");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            otherlv_4=(Token)match(input,99,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArraySubscriptsAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArraySubscripts"


    // $ANTLR start "entryRuleSubscript"
    // InternalModelica.g:5003:1: entryRuleSubscript returns [EObject current=null] : iv_ruleSubscript= ruleSubscript EOF ;
    public final EObject entryRuleSubscript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscript = null;


        try {
            // InternalModelica.g:5003:50: (iv_ruleSubscript= ruleSubscript EOF )
            // InternalModelica.g:5004:2: iv_ruleSubscript= ruleSubscript EOF
            {
             newCompositeNode(grammarAccess.getSubscriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubscript=ruleSubscript();

            state._fsp--;

             current =iv_ruleSubscript; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubscript"


    // $ANTLR start "ruleSubscript"
    // InternalModelica.g:5010:1: ruleSubscript returns [EObject current=null] : ( ( () otherlv_1= ';' ) | this_Expression_2= ruleExpression ) ;
    public final EObject ruleSubscript() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Expression_2 = null;



        	enterRule();

        try {
            // InternalModelica.g:5016:2: ( ( ( () otherlv_1= ';' ) | this_Expression_2= ruleExpression ) )
            // InternalModelica.g:5017:2: ( ( () otherlv_1= ';' ) | this_Expression_2= ruleExpression )
            {
            // InternalModelica.g:5017:2: ( ( () otherlv_1= ';' ) | this_Expression_2= ruleExpression )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==19) ) {
                alt111=1;
            }
            else if ( (LA111_0==61||LA111_0==79) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalModelica.g:5018:3: ( () otherlv_1= ';' )
                    {
                    // InternalModelica.g:5018:3: ( () otherlv_1= ';' )
                    // InternalModelica.g:5019:4: () otherlv_1= ';'
                    {
                    // InternalModelica.g:5019:4: ()
                    // InternalModelica.g:5020:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSubscriptAccess().getSubscriptAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubscriptAccess().getSemicolonKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:5032:3: this_Expression_2= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getSubscriptAccess().getExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubscript"


    // $ANTLR start "entryRuleComment"
    // InternalModelica.g:5044:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalModelica.g:5044:48: (iv_ruleComment= ruleComment EOF )
            // InternalModelica.g:5045:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalModelica.g:5051:1: ruleComment returns [EObject current=null] : ( () ruleStringComment (this_Annotation_2= ruleAnnotation )? ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        EObject this_Annotation_2 = null;



        	enterRule();

        try {
            // InternalModelica.g:5057:2: ( ( () ruleStringComment (this_Annotation_2= ruleAnnotation )? ) )
            // InternalModelica.g:5058:2: ( () ruleStringComment (this_Annotation_2= ruleAnnotation )? )
            {
            // InternalModelica.g:5058:2: ( () ruleStringComment (this_Annotation_2= ruleAnnotation )? )
            // InternalModelica.g:5059:3: () ruleStringComment (this_Annotation_2= ruleAnnotation )?
            {
            // InternalModelica.g:5059:3: ()
            // InternalModelica.g:5060:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommentAccess().getCommentAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getCommentAccess().getStringCommentParserRuleCall_1());
            		
            pushFollow(FOLLOW_36);
            ruleStringComment();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:5073:3: (this_Annotation_2= ruleAnnotation )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==100) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalModelica.g:5074:4: this_Annotation_2= ruleAnnotation
                    {

                    				newCompositeNode(grammarAccess.getCommentAccess().getAnnotationParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Annotation_2=ruleAnnotation();

                    state._fsp--;


                    				current = this_Annotation_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleStringComment"
    // InternalModelica.g:5087:1: entryRuleStringComment returns [String current=null] : iv_ruleStringComment= ruleStringComment EOF ;
    public final String entryRuleStringComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringComment = null;


        try {
            // InternalModelica.g:5087:53: (iv_ruleStringComment= ruleStringComment EOF )
            // InternalModelica.g:5088:2: iv_ruleStringComment= ruleStringComment EOF
            {
             newCompositeNode(grammarAccess.getStringCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringComment=ruleStringComment();

            state._fsp--;

             current =iv_ruleStringComment.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringComment"


    // $ANTLR start "ruleStringComment"
    // InternalModelica.g:5094:1: ruleStringComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )? ;
    public final AntlrDatatypeRuleToken ruleStringComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalModelica.g:5100:2: ( (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )? )
            // InternalModelica.g:5101:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )?
            {
            // InternalModelica.g:5101:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_STRING) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalModelica.g:5102:3: this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )*
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_99); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getStringCommentAccess().getSTRINGTerminalRuleCall_0());
                    		
                    // InternalModelica.g:5109:3: (kw= '+' this_STRING_2= RULE_STRING )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==86) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalModelica.g:5110:4: kw= '+' this_STRING_2= RULE_STRING
                    	    {
                    	    kw=(Token)match(input,86,FOLLOW_57); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getStringCommentAccess().getPlusSignKeyword_1_0());
                    	    			
                    	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_99); 

                    	    				current.merge(this_STRING_2);
                    	    			

                    	    				newLeafNode(this_STRING_2, grammarAccess.getStringCommentAccess().getSTRINGTerminalRuleCall_1_1());
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringComment"


    // $ANTLR start "entryRuleAnnotation"
    // InternalModelica.g:5127:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalModelica.g:5127:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalModelica.g:5128:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalModelica.g:5134:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ClassModification_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:5140:2: ( (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification ) )
            // InternalModelica.g:5141:2: (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification )
            {
            // InternalModelica.g:5141:2: (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification )
            // InternalModelica.g:5142:3: otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification
            {
            otherlv_0=(Token)match(input,100,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getAnnotationKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAnnotationAccess().getClassModificationParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_ClassModification_1=ruleClassModification();

            state._fsp--;


            			current = this_ClassModification_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\uffff\1\12\7\uffff";
    static final String dfa_3s = "\1\27\2\uffff\1\4\7\uffff";
    static final String dfa_4s = "\1\42\2\uffff\1\53\7\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\2\6\1\7\1\10\3\11",
            "",
            "",
            "\1\12\25\uffff\1\4\7\uffff\1\11\10\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "202:3: (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080010L,0x0000000200000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000007FFF00002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000007FFF00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000007FF800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x9FCFF807FFF00030L,0x0000001200000003L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1FC0000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L,0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000018000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L,0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x9FCFF847FFF00030L,0x0000001200000003L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x8000700000000002L,0x0000001000000003L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x9FCFF807FFF00010L,0x0000001200000003L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080030L,0x0000001200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000080010L,0x0000001200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x2000010000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1FCF8807FFF00012L,0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1FC70007FFF00010L,0x0000000200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1FC60007FFF00010L,0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1FC40007FFF00010L,0x0000000200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1FC00007FFF00010L,0x0000000200000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010044000000020L,0x0000001000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010004000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000010L,0x0000000400000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1F00000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000000000000020L,0x0000001000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000005000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000005000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000010800000060L,0x0000000180000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000800000060L,0x0000000180000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x4000005000000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1FC0002000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000004000000020L,0x0000001400000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000004000000020L,0x0000001000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x2000004000000012L,0x0000000200000C8CL});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2000004000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x2000050000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2000004800000010L,0x0000000200000CECL});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2000004800000010L,0x0000000200000C8CL});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x2000004000000010L,0x0000000200001C8CL});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x2000004000000010L,0x0000000200000C8CL});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000800000060L,0x0000000183C00000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x00000000003F0000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000000003C00000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0010000000000002L,0x000000001C000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000012L,0x0000000600000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000012L,0x0000000200000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x2000010400000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x2000000400000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x2000000400000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x2000040000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x2000000000080000L,0x0000000000008000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000040000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});

}